package com.example.arariko.arariko_1202152180_modul2;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        ImageView lsplash = findViewById(R.id.raisa);

        //untuk menjadwalkan pesan atau runnable untuk diksekusi
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            //merupakan method yang otomatis muncul ketika menggunakan Runnable()
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();
                //Runnable menjadi bagian yang akan di eksekusi dan "splash time" merupakan lama penundaan sampai Runnable akan dieksekusi
            }
        }, 3000L);
    }
}
