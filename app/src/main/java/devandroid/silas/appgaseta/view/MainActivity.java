package devandroid.silas.appgaseta.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import devandroid.silas.appgaseta.R;
import devandroid.silas.appgaseta.apoio.UltilGasEta;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this, UltilGasEta.messagem(), Toast.LENGTH_SHORT).show();

    }
}