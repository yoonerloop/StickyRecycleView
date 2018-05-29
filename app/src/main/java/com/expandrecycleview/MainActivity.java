package com.expandrecycleview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<DataBean> mDataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recycleview = (RecyclerView) findViewById(R.id.recycleview);
        recycleview.setLayoutManager(new LinearLayoutManager(this));

        initData();

        recycleview.setAdapter(new MyAdapter(this, mDataList));
        //分割线
        recycleview.addItemDecoration(new DividerDecoration(this));
        //分组
//        recycleview.addItemDecoration(new SectionDecoration(this, new SectionDecoration.DecorationCallback() {
//            @Override
//            public String getData(int position) {
//                return mDataList.get(position).data;
//            }
//        }));
        //粘性布局
        recycleview.addItemDecoration(new StickyDecoration(this, new StickyDecoration.DecorationCallback() {
            @Override
            public String getData(int position) {
                return mDataList.get(position).data;
            }
        }));
    }

    /**
     * 假的测试数据
     */
    private void initData() {
        mDataList = new ArrayList<>();
        for (int i = 0; i < 40; i++) {
            DataBean dataBean = new DataBean();
            if (i < 3) {
                dataBean.data = "5月4日";
            } else if (i < 8) {
                dataBean.data = "5月5日";
            } else if (i < 15) {
                dataBean.data = "5月6日";
            } else if (i < 20) {
                dataBean.data = "5月7日";
            } else if (i < 30) {
                dataBean.data = "5月8日";
            } else {
                dataBean.data = "5月9日";
            }
            dataBean.des = "我是内容" + i;
            mDataList.add(dataBean);
        }
    }
}
