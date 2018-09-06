package xyz.camiloarguello.iniciosesion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;


public class CrearCuenta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_cuenta);

        Toolbar toolbarRegistro = findViewById(R.id.miToolbar);
        setSupportActionBar(toolbarRegistro);
        getSupportActionBar().setTitle("Registro");

    }
    public void irALogin(View view){
        Intent iralogin = new Intent(this, LoginActivity.class);
        startActivity(iralogin);
    }
}
