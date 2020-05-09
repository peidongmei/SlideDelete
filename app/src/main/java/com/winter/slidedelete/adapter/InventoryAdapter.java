package com.winter.slidedelete.adapter;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import com.winter.slidedelete.R;
import com.winter.slidedelete.bean.Inventory;

import java.util.List;

public class InventoryAdapter extends BaseRecyclerViewAdapter<Inventory>
{
    private OnDeleteClickLister mDeleteClickListener;

    public InventoryAdapter(Context mContext, List<Inventory> mData)
    {
        super(mContext, mData, R.layout.item_inventory);
    }

    @Override
    protected void onBindData(RecyclerViewHolder holder, Inventory bean, int position)
    {
        View view = holder.getView(R.id.tv_delete);
        view.setTag(position);
        if (!view.hasOnClickListeners())
        {
            view.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    if (null != mDeleteClickListener)
                    {
                        mDeleteClickListener.onDeleteClick(view, (Integer) view.getTag());
                    }
                }
            });
        }

        ((TextView) holder.getView(R.id.tv_item_desc)).setText(bean.getItemDesc());
        String quantity = bean.getQuantity() + "箱";
        ((TextView) holder.getView(R.id.tv_quantity)).setText(quantity);
        String detail = bean.getItemCode() + "/" + bean.getDate();
        ((TextView) holder.getView(R.id.tv_detail)).setText(detail);
        String volume = bean.getVolume() + "方";
        ((TextView) holder.getView(R.id.tv_volume)).setText(volume);

    }

    public void setOnDeleteClickListener(OnDeleteClickLister listener)
    {
        this.mDeleteClickListener = listener;
    }

    public interface OnDeleteClickLister
    {
        void onDeleteClick(View view, int position);
    }
}// public class InventoryAdapter
