package android.example.com.mfariznaufal_1202154149_studycase4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //method saat button ditekan
    public void namaMahasiswa (View view) {
        //untuk berpindah ke aktivitas mahasiswa
        Intent intent;
        intent = new Intent(getApplicationContext(), NAMAMAHASISWA.class);
        startActivity(intent);
    }
    //method saat button ditekan
    public void cariGambar(View view){
        //untuk berpindah ke aktivitas gambar
        Intent intent1;
        intent1 = new Intent(getApplicationContext(), SEARCHINGGAMBAR.class);
        startActivity(intent1);

    }
}