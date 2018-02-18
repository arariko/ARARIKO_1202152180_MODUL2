package com.example.arariko.arariko_1202152180_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menu);
        //mengatur btn back agar tampil di view
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //menerima value yang dikirimkan dari activity sebelumnya berupa sebuah key value
        String menu = getIntent().getStringExtra("menu");
        String price = getIntent().getStringExtra("price");
        String komposisi = getIntent().getStringExtra("komposisi");
        Integer image = getIntent().getIntExtra("image", 0);

        //mendifinisikan TextView dan ImageView dengan id
        TextView txtMenu = findViewById(R.id.namaMenu);
        TextView txtPrice = findViewById(R.id.price);
        TextView txtkomposisi = findViewById(R.id.listkomposisi);
        ImageView images = findViewById(R.id.imageMenu);

        //mengatur valuenya
        txtMenu.setText(menu);
        txtPrice.setText(price);
        txtkomposisi.setText(komposisi);
        images.setImageResource(image);
    }

    @Override
    //method jika button back di klik maka akan kembali ke view sebelumnya
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
