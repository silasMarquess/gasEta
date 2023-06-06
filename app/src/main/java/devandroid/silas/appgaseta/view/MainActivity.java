package devandroid.silas.appgaseta.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.widget.TextView;
import android.widget.Toast;

import devandroid.silas.appgaseta.R;
import devandroid.silas.appgaseta.apoio.UltilGasEta;

public class MainActivity extends AppCompatActivity {

    EditText txt_ValGasolina;
    public static final String ShareName = "ListUserPreferences";
    SharedPreferences UserPref;
    EditText txt_ValEtanol;
    Button btn_Calcular;
    Button btn_Limpar;
    Button btn_finalizar;

    Button btn_salvar;

    TextView lb_Resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        UserPref = getSharedPreferences(ShareName, 0);
        SharedPreferences.Editor editUserPref = UserPref.edit();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_ValGasolina = findViewById(R.id.txt_ValGas);
        txt_ValEtanol = findViewById(R.id.txt_ValEtanol);
        btn_Calcular = findViewById(R.id.btn_Calcular);
        btn_Limpar = findViewById(R.id.btn_limpar);
        btn_finalizar = findViewById(R.id.btn_finalizar);
        btn_salvar = findViewById(R.id.btn_salvar);
        lb_Resultado = findViewById(R.id.lb_resultado);

        txt_ValGasolina.setText(UserPref.getString("ValGasolina", ""));
        txt_ValEtanol.setText(UserPref.getString("ValEtanol", ""));


        btn_Calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(txt_ValGasolina.getText())) {
                    Toast.makeText(MainActivity.this,"Campo de Gasolina Vazio !",Toast.LENGTH_LONG).show();
                    txt_ValGasolina.setError("*Obrigatório");//>>Metodo concentra o curso no campo de Texto com um simbolo de erro
                    txt_ValGasolina.requestFocus();

                } else if (TextUtils.isEmpty(txt_ValEtanol.getText())) {
                    Toast.makeText(MainActivity.this,"Campo de Etanol Vazio !",Toast.LENGTH_LONG).show();
                    txt_ValEtanol.setError("*Obrigatório");//>>Metodo concentra o curso no campo de Texto com um simbolo de erro
                    txt_ValEtanol.requestFocus();
                }else{
                    double valorGas = Double.parseDouble(txt_ValGasolina.getText().toString());
                    double ValorEtanol = Double.parseDouble(txt_ValEtanol.getText().toString());
                    String messagemRetornada = UltilGasEta.messagem(valorGas, ValorEtanol);
                    lb_Resultado.setText(messagemRetornada);
                }
            }
        });


        btn_salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editUserPref.putString("ValGasolina", txt_ValGasolina.getText().toString());
                editUserPref.putString("ValEtanol", txt_ValGasolina.getText().toString());
                editUserPref.apply();
            }
        });


        btn_Limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                lb_Resultado.setText("");
                txt_ValEtanol.setText("");
                txt_ValGasolina.setText("");
            }
        });

        btn_finalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Obrigado, Boa Economia Chefe(a) !", Toast.LENGTH_SHORT).show();
                finish();
            }
        });


    }
}