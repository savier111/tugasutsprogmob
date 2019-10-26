package com.example.tugasutsprogmob.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tugasutsprogmob.R;
import com.example.tugasutsprogmob.Model.mahasiswa;

import java.util.ArrayList;

public class mhsAdapter  extends RecyclerView.Adapter<mhsAdapter.ViewHolder> {
    private ArrayList<mahasiswa> dataList;

    public mhsAdapter(ArrayList<mahasiswa> datalist) {
        this.dataList = datalist;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.card_view_mhs, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txtNama.setText(dataList.get(position).getNama());
        holder.txtNim.setText(dataList.get(position).getNim());
        holder.txtEmail.setText(dataList.get(position).getEmail());
        holder.txtAlamat.setText(dataList.get(position).getAlamat());
    }

    @Override
    public int getItemCount() {
        return (dataList != null ? dataList.size() : 0);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView txtNama, txtNim, txtEmail, txtAlamat;

        public ViewHolder(@NonNull View itemview) {
            super(itemview);
            txtNama = itemview.findViewById(R.id.txtnamamhs);
            txtNim = itemview.findViewById(R.id.txtnim);
            txtEmail = itemview.findViewById(R.id.txtEmail);
            txtAlamat = itemview.findViewById(R.id.txtAlamat);
        }
    }
}

