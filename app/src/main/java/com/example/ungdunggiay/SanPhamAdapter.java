package com.example.ungdunggiay;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class SanPhamAdapter extends BaseAdapter {
    Context ctx;
    int layout;
    ArrayList<SanPham> list;

    private IClickLisner clickLisner;

    public interface IClickLisner{
        void newDisplay();


    }



    public SanPhamAdapter(Context ctx, int layout, ArrayList<SanPham> list) {
        this.ctx = ctx;
        this.layout = layout;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(ctx).inflate(layout,viewGroup,false);

        TextView txtTenSP = view.findViewById(R.id.txtTenSP);
        TextView txtdonGia = view.findViewById(R.id.txtdonGia);

        ImageView img = view.findViewById(R.id.imgShoes);
        ConstraintLayout con1 = view.findViewById(R.id.cons1);
        ConstraintLayout con2 = view.findViewById(R.id.cons2);
//        Button btn39 = view.findViewById(R.id.btn39);
//        Button btn40 = view.findViewById(R.id.btn40);
//        Button btn41 = view.findViewById(R.id.btn41);
//        Button btn42 = view.findViewById(R.id.btn42);
//        Button btn43 = view.findViewById(R.id.btn43);





        txtdonGia.setText(""+list.get(i).getGiaTien());
        txtTenSP.setText(list.get(i).getTenSanPham());
//        txtDanhGia.setText(list.get(i).getDanhGia());
//        img.setImageResource(list.get(i).getHinh1());
        Picasso.with(ctx).load(list.get(i).getHinh1()).into(img);




        return view;
    }
}
