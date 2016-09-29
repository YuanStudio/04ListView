package com.example.cathleen.listview;


import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends Activity {
    //定义键
    private final static String NAME = "name";
    private final static String NATION = "nation";
    private final static String NUM = "num";
    private final static String TEL = "tel";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //定义值
        String[] names = {"赵依依", "钱两两", "孙三三", "李思思", "周武武"};
        String[] nations = {"赵家班", "钱家班", "孙家班", "李家班", "周家班"};
        String[] nums = {"s1", "s2", "c1", "s3", "w1"};
        String[] tels = {"s1028", "s7695", "c331", "s2014", "w011"};

        List<Map<String,Object>> items=new ArrayList<Map<String,Object>>();

        for(int i=0;i<names.length;i++) {
            Map<String,Object> item=new HashMap<String,Object>();
            item.put(NAME, names[i]);
            item.put(NATION, nations[i]);
            item.put(NUM, nums[i]);
            item.put(TEL,tels[i]);
            items.add(item);
        }
        //在mainActivity.xml中定义listview
        //在item中定义单项
        //组合
        SimpleAdapter adapter=new SimpleAdapter
                (this,items,R.layout.item,new String[]{NAME,NATION,NUM,TEL},new int[]{R.id.name,R.id.nation,R.id.num,R.id.tel});
        ListView list=(ListView)findViewById(R.id.listView);
        list.setAdapter(adapter);


    }
}
