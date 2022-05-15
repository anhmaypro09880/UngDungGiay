package com.example.ungdunggiay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailProduct extends AppCompatActivity {
    TextView tenSanPham,giaTien,moTaa;
    ImageView img1,img2,img3,img4;
    Context ctx;
    Button btn39,btn40,btn41,btn42,btn43,btnMuaNgay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_product);
        Intent intent = this.getIntent();

        String name = intent.getStringExtra("tenSanPham");
        String giaThanh = intent.getStringExtra("giaThanh");
        String moTa = intent.getStringExtra("moTa");
        String hinh1 = intent.getStringExtra("hinh1");
        String hinh2 = intent.getStringExtra("hinh2");
        String hinh3 = intent.getStringExtra("hinh3");
        String hinh4 = intent.getStringExtra("hinh4");


        khaiBao();
        tenSanPham.setText(name);

        moTaa.setText(moTa);
        giaTien.setText(giaThanh);

        Picasso.with(ctx).load(hinh1).into(img1);
        Picasso.with(ctx).load(hinh2).into(img2);
        Picasso.with(ctx).load(hinh3).into(img3);
        Picasso.with(ctx).load(hinh4).into(img4);

       onClickBtn40();
       onClickBtn41();
       onClickBtn42();
       onClickBtn43();
       onClickBtn39();
       btnMuaNgay();



    }

    private void btnMuaNgay() {
        btnMuaNgay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    private void onClickBtn39() {
        btn39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn39.setBackground(getDrawable(R.drawable.list_size39));
                btn40.setBackground(getDrawable(R.drawable.list_size));
                btn43.setBackground(getDrawable(R.drawable.list_size));
                btn42.setBackground(getDrawable(R.drawable.list_size));
                btn41.setBackground(getDrawable(R.drawable.list_size));

            }
        });
    }

    private void onClickBtn43() {
        btn43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn43.setBackground(getDrawable(R.drawable.list_size39));
                btn39.setBackground(getDrawable(R.drawable.list_size));
                btn40.setBackground(getDrawable(R.drawable.list_size));
                btn42.setBackground(getDrawable(R.drawable.list_size));
                btn41.setBackground(getDrawable(R.drawable.list_size));

            }
        });
    }

    private void onClickBtn42() {
        btn42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn42.setBackground(getDrawable(R.drawable.list_size39));
                btn39.setBackground(getDrawable(R.drawable.list_size));
                btn41.setBackground(getDrawable(R.drawable.list_size));
                btn40.setBackground(getDrawable(R.drawable.list_size));
                btn43.setBackground(getDrawable(R.drawable.list_size));

            }
        });
    }

    private void onClickBtn41() {
        btn41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn41.setBackground(getDrawable(R.drawable.list_size39));
                btn39.setBackground(getDrawable(R.drawable.list_size));
                btn40.setBackground(getDrawable(R.drawable.list_size));
                btn42.setBackground(getDrawable(R.drawable.list_size));
                btn43.setBackground(getDrawable(R.drawable.list_size));

            }
        });
    }

    private void onClickBtn40() {
        btn40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn40.setBackground(getDrawable(R.drawable.list_size39));
                btn39.setBackground(getDrawable(R.drawable.list_size));
                btn41.setBackground(getDrawable(R.drawable.list_size));
                btn42.setBackground(getDrawable(R.drawable.list_size));
                btn43.setBackground(getDrawable(R.drawable.list_size));

            }
        });
    }

    private void khaiBao() {
        tenSanPham = findViewById(R.id.txtTenSanPhamDetail);
        moTaa = findViewById(R.id.txtMoTa);
        giaTien = findViewById(R.id.txtGiaThanhDetail);
        img1 = findViewById(R.id.imgShoesDetail);
        img2 = findViewById(R.id.imgHinh2);
        img3 = findViewById(R.id.imgHinh3);
        img4 = findViewById(R.id.imgHinh4);

         btn39 = findViewById(R.id.btn39);
         btn40 = findViewById(R.id.btn40);
         btn41 = findViewById(R.id.btn41);
         btn42 = findViewById(R.id.btn42);
         btn43 = findViewById(R.id.btn43);
         btnMuaNgay = findViewById(R.id.btnMuaNgay);
    }

}