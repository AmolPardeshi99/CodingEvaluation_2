package com.example.codingevaluation_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.List;

public class HomeScreen extends AppCompatActivity {
    private Button mBtnFetch;
    private RecyclerView recyclerView;
    private List<ResponseBody> DataList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        initView();
        setRecyclerview();
    }

    private void setRecyclerview() {

        DataAdapter dataAdapter = new DataAdapter(DataList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setAdapter(dataAdapter);
        recyclerView.setLayoutManager(linearLayoutManager);

    }

    private void initView() {
        mBtnFetch = findViewById(R.id.btnFetch);
        recyclerView = findViewById(R.id.recyclerview);
        mBtnFetch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}