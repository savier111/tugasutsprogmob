package com.example.tugasutsprogmob;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;
import com.example.tugasutsprogmob.Adapter.mhsAdapter;
import com.example.tugasutsprogmob.Model.mahasiswa;

import java.util.ArrayList;

public class RecycleViewActivityMHS extends AppCompatActivity {

    private RecyclerView recyclerView;
    private mhsAdapter adapter;
    private ArrayList<mahasiswa> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_recycle_view_mhs);
        addData();

        recyclerView = findViewById(R.id.rvmhs);
        adapter = new mhsAdapter(mahasiswaArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(RecycleViewActivityMHS.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
    @Override
    public  boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.item1:
                Toast.makeText(this,"item 1 selected",Toast.LENGTH_SHORT).show();
            case R.id.item2:
                Toast.makeText(this,"item 2 selected",Toast.LENGTH_SHORT).show();
            case R.id.item3:
                Toast.makeText(this,"item 3 selected",Toast.LENGTH_SHORT).show();
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void addData() {
        mahasiswaArrayList = new ArrayList<mahasiswa>();
        mahasiswaArrayList.add(new mahasiswa("72180010","Alex","Seturan","Alz@gmail.com"));
        mahasiswaArrayList.add(new mahasiswa("72180011","Mira","babarsari", "M1r4@gmail.com"));
        mahasiswaArrayList.add(new mahasiswa("72180012","Puput","Klitren", "puput@gmail.com"));
        mahasiswaArrayList.add(new mahasiswa("72180013","Michael","Tugu", "Mich43l@gmail.com"));
        mahasiswaArrayList.add(new mahasiswa("72180014","Kael","Malioboro", "Kael@gmail.com"));


    }
}
