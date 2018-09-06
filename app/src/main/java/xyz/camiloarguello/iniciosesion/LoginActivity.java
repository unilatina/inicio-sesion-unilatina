package xyz.camiloarguello.iniciosesion;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void irACrearCuenta(View view){
        Intent a = new Intent(getApplicationContext(), CrearCuenta.class );
        startActivity(a);
    }
    public void irAAudio(View view){
        Intent a = new Intent(getApplicationContext(), AudioActivity.class );
        startActivity(a);
    }

}
