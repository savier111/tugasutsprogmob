package com.example.tugasutsprogmob.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.tugasutsprogmob.R;
import com.example.tugasutsprogmob.Model.admin;


import java.util.ArrayList;

public class adminadapter extends RecyclerView.Adapter<adminadapter.ViewHolder> {
        private ArrayList<admin> dataList;

        public adminadapter(ArrayList<admin> datalist){ this.dataList = datalist;
        }

        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater. from (parent.getContext());
            View view = layoutInflater.inflate(R.layout.card_view_dosen_admin , parent, false );
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            holder.txtNama.setText(dataList.get(position).getNama());
            holder.txtNidn.setText(dataList.get(position).getNidn());
            holder.txtGelar.setText(dataList.get(position).getGelar());
            holder.txtEmail.setText(dataList.get(position).getEmail());
            holder.txtAlamat.setText(dataList.get(position).getAlamat());
        }

        @Override
        public int getItemCount() {
            return (dataList != null ? dataList.size(): 0);
        }

        public class ViewHolder extends RecyclerView.ViewHolder{
            private TextView txtNidn, txtNama, txtGelar, txtEmail, txtAlamat;
            public ViewHolder(@NonNull View itemview){
                super(itemview);
                txtNidn = itemview.findViewById(R.id.txtnama);
                txtNama  = itemview.findViewById(R.id.txtnidn);
                txtGelar = itemview.findViewById(R.id.txtgelar);
                txtEmail  = itemview.findViewById(R.id.txtemail);
                txtAlamat = itemview.findViewById(R.id.txtalamat);


            }
        }
    }
