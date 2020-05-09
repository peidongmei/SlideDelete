package com.winter.slidedelete.adapter;

import android.util.SparseArray;
import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

/*
* 稀疏数组
* */
public class RecyclerViewHolder extends RecyclerView.ViewHolder
{
    private SparseArray<View> mViews;

    public RecyclerViewHolder(View itemView)
    {
        super(itemView);
        this.mViews = new SparseArray<>();
    }// public RecyclerViewHolder(

    /**
     * 获取需要的View;如果已经存在引用则直接获取，如果不存在则重新加载并保存
     * @param viewId
     * @return 需要的view
     */
    View getView(int viewId)
    {
        View view = mViews.get(viewId);
        if (null == view)
        {
            view = itemView.findViewById(viewId);
            mViews.put(viewId,view);
        }

        return view;

    }// View getView(

}// public class RecyclerViewHolder
