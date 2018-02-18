package com.example.arariko.arariko_1202152180_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private RadioGroup mRadioGroup;
    private RadioButton mRadio1, mRadio2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRadioGroup = findViewById(R.id.rg);
        Toast.makeText(this, "Arariko Rezeki Pasa 1202152180", Toast.LENGTH_LONG).show();
    }

    public void pesanSekarang(View view) {
        //mendefinisikan radion button group jika di cek makan valuenya akan disimpan dalam sebuah variabel
        int selectedId = mRadioGroup.getCheckedRadioButtonId();
        mRadio1 = findViewById(R.id.dineIn);
        mRadio2 = findViewById(R.id.takeAway);

        //mengecek apakah value yang terpilih sesuai dengan nilai radio groupnya kalau benar maka akan pindah tampilan
        if (selectedId == mRadio1.getId()){
            Intent intent = new Intent(MainActivity.this, DineIn.class);
            startActivity(intent);
        }else {
            Intent intent = new Intent(MainActivity.this, TakeAway.class);
            startActivity(intent);
        }
    }
}
