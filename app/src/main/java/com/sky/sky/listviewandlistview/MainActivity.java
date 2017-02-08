package com.sky.sky.listviewandlistview;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.sky.sky.listviewandlistview.adapter.LeftAdapter;
import com.sky.sky.listviewandlistview.adapter.RightAdapter;
import com.sky.sky.listviewandlistview.bean.Product;

import java.util.List;

/**
 * getSectionForPosition()通过该项的位置，获得所在分类组的索引号
 * getPositionForSection()根据分类列的索引号获得该序列的首个位置
 * 例如：
 *
 position         data            getSectionForPosition(Position)
 0               Abhfdf              0

 1               Achahtkh            0

 2               Ahtjlarej           0

 3               Bchatkd             1

 4               Bjklhdsfoi          1

 5               Bzhafdlsfk          1

 6               Cj fadsfkj          2

 getPositionForSection(0):返回的是0
 getPositionForSection(1):返回的是3
 getPositionForSection(2):返回的是6
 */
public class MainActivity extends AppCompatActivity {


    ListView left_listview;
    ListView right_listview;
    /**
     * 上次选中的左侧菜单
     */
    private View lastView;
    /**
     * 上次第一个可见元素，用于滚动时记录标识。
     */
    private int lastFirstVisibleItem = -1;
    private  TextView title_layout_catalog;
    private  List<Product> productList;
    private RightAdapter rightAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        title_layout_catalog = (TextView) findViewById(R.id.title_layout_catalog);
        left_listview = (ListView) findViewById(R.id.left_listview);
        right_listview = (ListView) findViewById(R.id.right_listview);

        productList= Parser.getCateProductList(this);
        rightAdapter = new RightAdapter(productList, this);
        right_listview.setAdapter(rightAdapter);
        left_listview.setAdapter(new LeftAdapter(this, productList));
        right_listview.setOnScrollListener(new AbsListView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(AbsListView view, int scrollState) {

            }

            @Override
            public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {

                //获取屏幕第一个item的所在的分类组section
                int section = rightAdapter.getSectionForPosition(firstVisibleItem);
                if (firstVisibleItem != lastFirstVisibleItem) {
                    title_layout_catalog.setText(productList.get(rightAdapter.getPositionForSection(section)).getTitle());
                    if (lastView != null) {
                        lastView.setBackgroundColor(Color.WHITE);
                    }

                    if (left_listview.getChildCount()>0) {
                        lastView = left_listview.getChildAt(section);
                        lastView.setBackgroundColor(Color.GREEN);
                    }
                }else{
                    //一进入程序默认选中第一个
                    lastView = left_listview.getChildAt(section);
                    lastView.setBackgroundColor(Color.GREEN);
                }
                lastFirstVisibleItem = firstVisibleItem;
            }
        });

        left_listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (lastView != null) {
                    //上次选中的view变回灰色
                    lastView.setBackgroundColor(Color.WHITE);
                }
                //设置选中颜色为白色
                view.setBackgroundColor(Color.GREEN);
                //点击左侧，右侧滚动到对应的位置
                //view  代表item 视图，根据id找到具体控件
                TextView section_tv = (TextView) view.findViewById(R.id.section_tv);
                int location = rightAdapter.getPositionForSection(
                        (Integer.parseInt(section_tv.getText().toString())));
                if (location != -1) {
                    right_listview.setSelection(location);
                }
                title_layout_catalog.setText(productList.get(location).getTitle());
                lastView = view;
            }
        });

    }
}
