package com.example.tutorial4recylerviewbindingadapter;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.tutorial4recylerviewbindingadapter.adapter.MyAdapter;
import com.example.tutorial4recylerviewbindingadapter.model.TemperatureData;

import java.util.Arrays;
import java.util.List;

public class SecondActivity extends Activity  {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true);

        // use a linear layout manager
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        List<TemperatureData> items =
                Arrays.asList(
                        new TemperatureData("Hamburg", "5", "data:image/png;base64,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"),
                        new TemperatureData("Berlin", "6","data:image/png;base64,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"));
        // define an adapter
        mAdapter = new MyAdapter(items);
        recyclerView.setAdapter(mAdapter);
    }
}