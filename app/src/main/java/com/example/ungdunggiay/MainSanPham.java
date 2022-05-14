package com.example.ungdunggiay;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.MailTo;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class MainSanPham extends AppCompatActivity {
    FirebaseDatabase test = FirebaseDatabase.getInstance();
    DatabaseReference data = test.getReference("SanPham");
    ListView lvShoes;
    SanPhamAdapter adt;
    ArrayList<SanPham> list = new ArrayList<>();
    TextView txt;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_san_pham);

        khaiBao();
        img = findViewById(R.id.imgCart);



        adt = new SanPhamAdapter(this, R.layout.list_viewsanpham, list, new SanPhamAdapter.IClickLisner() {
            @Override
            public void newDisplay() {
                Intent i = new Intent(MainSanPham.this,Register.class);
                startActivity(i);
            }
        });
        lvShoes.setAdapter(adt);
        getallListSanPham();

    }

    private void khaiBao() {
        lvShoes = findViewById(R.id.lvShoes);
        txt = findViewById(R.id.txtSanPham);
    }
    private void getallListSanPham(){
        data.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                list.clear();
                for(DataSnapshot s : snapshot.getChildren()){
                    SanPham acc = s.getValue(SanPham.class);
                    list.add(acc);
                }
                adt.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(MainSanPham.this,"get fail",Toast.LENGTH_LONG).show();
            }
        });
    }
}