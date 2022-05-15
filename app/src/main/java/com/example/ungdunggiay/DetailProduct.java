package com.example.ungdunggiay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailProduct extends AppCompatActivity {
    TextView tenSanPham,giaTien,moTaa;
    ImageView img1,img2,img3,img4;
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

//        tenSanPham.setText(name);

    }

    private void khaiBao() {
        tenSanPham = findViewById(R.id.txtTenSP);
        moTaa = findViewById(R.id.txtMoTa);
        giaTien = findViewById(R.id.txtdonGia);
        img1 = findViewById(R.id.imgShoes);
        img2 = findViewById(R.id.imgHinh2);
        img3 = findViewById(R.id.imgHinh3);
        img4 = findViewById(R.id.imgHinh4);
    }
}