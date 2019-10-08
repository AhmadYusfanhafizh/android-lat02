package id.ac.poliban.mi.yusfan.latihan02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //hubungkan masing masing view yang ingin dimanipulasi
        //dengan object yang kita buat
        Button btKrisna = findViewById(R.id.btKrisna);
        Button btBisma = findViewById(R.id.btBismaDewaBrata);
        Button btBasuweda = findViewById(R.id.btBasuweda);

        //pasang event listener & event Handler
        //menggunakan kelas anonim yang mengimplementasikan interface
        //view.onClickListener
        btKrisna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "I'm Krisna, Advisor of Arjuna", Toast.LENGTH_SHORT).show();
            }
        });
        btBisma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "I'm Bisma Dewa, the godfather of Hasnita", Toast.LENGTH_SHORT).show();
            }
        });
        btBasuweda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "The Brother of Krisna", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
