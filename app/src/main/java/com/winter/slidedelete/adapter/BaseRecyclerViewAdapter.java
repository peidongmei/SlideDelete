package com.winter.slidedelete.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

/**
 * RecyclerView adapter基类
 * 封装了数据集合以及ItemView的点击事件回调
 * @param <T>
 */
public abstract class BaseRecyclerViewAdapter<T> extends RecyclerView.Adapter<RecyclerViewHolder> implements View.OnClickListener
{
    private Context mContext;
    private List<T> mData;
    private int mLayoutId;

    private OnItemClickListener mListener;

    public BaseRecyclerViewAdapter(Context mContext, List<T> mData, int mLayoutId)
    {
        this.mContext = mContext;
        this.mData = mData;
        this.mLayoutId = mLayoutId;
    }

    @Override
    public void onClick(View view)
    {
        if (null != mListener)
        {
            mListener.onItemClick(this,view, (Integer) view.getTag());
        }
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener)
    {
        this.mListener = onItemClickListener;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(mContext).inflate(mLayoutId,parent,false);
        view.setOnClickListener(this);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position)
    {
        holder.itemView.setTag(position);
        T bean = mData.get(position);
        onBindData(holder,bean,position);

    }

    @Override
    public int getItemCount()
    {
        return mData.size();
    }

    /**
     * 数据绑定，由实现类实现
     * @param holder
     * @param bean
     * @param position
     */
    protected abstract void onBindData(RecyclerViewHolder holder,T bean,int position);

    /**
     * item点击监听器
     */
    public interface OnItemClickListener
    {
        /**
         * item点击回调
         * @param adapter
         * @param view
         * @param position
         */
        void onItemClick(RecyclerView.Adapter adapter,View view,int position);
    }

}// public abstract class BaseRecyclerViewAdapter<T>
