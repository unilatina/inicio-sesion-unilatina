package xyz.camiloarguello.iniciosesion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int menuItemWasSelected = item.getItemId();

        if(menuItemWasSelected == R.id.buscar){
            Toast.makeText(this, "Clickeaste buscar", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Clickeaste acerca de", Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }
}
