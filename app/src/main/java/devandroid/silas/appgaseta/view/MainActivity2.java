package devandroid.silas.appgaseta.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import devandroid.silas.appgaseta.DAO.GasEtaDB;
import devandroid.silas.appgaseta.R;

public class MainActivity2 extends AppCompatActivity {

    public static final int TIME_APLASH = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ComutarTela2();

    }

    public void ComutarTela2() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent TotelaPrincipal = new Intent(MainActivity2.this,MainActivity.class);
                GasEtaDB db = new GasEtaDB(MainActivity2.this);
                startActivity(TotelaPrincipal);
                finish();
            }
        },TIME_APLASH);
    }

}