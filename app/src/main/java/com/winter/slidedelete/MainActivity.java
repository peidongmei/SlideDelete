package com.winter.slidedelete;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.winter.slidedelete.adapter.InventoryAdapter;
import com.winter.slidedelete.bean.Inventory;
import com.winter.slidedelete.view.SlideRecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import butterknife.BindView;
import butterknife.ButterKnife;

/*
 * 涉及ButterKnife(黄油刀)、GsonFormat
 * 工具：GsonFormat、Postman、https://1024tools.com/
 * 完成侧滑功能
 * */
public class MainActivity extends AppCompatActivity
{

    @BindView(R.id.srv_main)
    SlideRecyclerView srvMain;
    private List<Inventory> mInventories;
    private InventoryAdapter mInventoryAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        srvMain.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false));
        DividerItemDecoration itemDecoration = new DividerItemDecoration(this,DividerItemDecoration.VERTICAL);
        itemDecoration.setDrawable(ContextCompat.getDrawable(this,R.drawable.divider_inset));
        srvMain.addItemDecoration(itemDecoration);
        mInventories = new ArrayList<>();
        Inventory inventory;
        Random random = new Random();
        for (int i = 0; i < 50; i++)
        {
            inventory = new Inventory();
            inventory.setItemDesc("测试数据"+i);
            inventory.setQuantity(random.nextInt(100000));
            inventory.setItemCode("0120816");
            inventory.setDate("20180219");
            inventory.setVolume(random.nextFloat());
            mInventories.add(inventory);
        }
        mInventoryAdapter = new InventoryAdapter(this,mInventories);
        srvMain.setAdapter(mInventoryAdapter);
        mInventoryAdapter.setOnDeleteClickListener(new InventoryAdapter.OnDeleteClickLister() {
            @Override
            public void onDeleteClick(View view, int position) {
                mInventories.remove(position);
                mInventoryAdapter.notifyDataSetChanged();
                srvMain.closeMenu();
            }
        });

    }// protected void onCreate(

}// public class MainActivity
