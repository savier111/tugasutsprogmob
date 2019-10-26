package com.example.tugasutsprogmob;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.tugasutsprogmob.Adapter.adminadapter;
import com.example.tugasutsprogmob.Model.admin;

import java.util.ArrayList;

public class RecycleViewActivityadmin extends AppCompatActivity {

    private RecyclerView recyclerView;
    private adminadapter adapter;
    private ArrayList<admin> adminArrayList;

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_recycle_view_activityadmin);
        addData();

        recyclerView = findViewById(R.id.rvdosen);
        adapter = new adminadapter(adminArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(RecycleViewActivityadmin.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void addData() {
        adminArrayList = new ArrayList<admin>();
        adminArrayList.add(new admin("Babay Yaga","11111","S.Kom","babay@gmail.com","Babarsari "));
        adminArrayList.add(new admin("Lucy","11112","S.Kom. M.T.", "lucy@gmail.com","Seturan"));
        adminArrayList.add(new admin("Nine","11113","S.Kombis", "Nin3@gmail.com","Kledokan"));
        adminArrayList.add(new admin("Octris","11114","S.E", "octr15@gmail.com","Klitren"));

    }
}
