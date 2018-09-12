package xyz.camiloarguello.iniciosesion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class FamiliaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_familia);

        // Creo los datos con ArrayList
        ArrayList<String> myFamily = new ArrayList<>();
        myFamily.add("Jose");
        myFamily.add("Blanca");
        myFamily.add("Camilo");
        myFamily.add("Edison");
        myFamily.add("Carlos");
        myFamily.add("Angela");
        myFamily.add("Sophia");
        myFamily.add("Jose");
        myFamily.add("Blanca");
        myFamily.add("Camilo");
        myFamily.add("Edison");
        myFamily.add("Carlos");
        myFamily.add("Angela");
        myFamily.add("Sophia");
        myFamily.add("Jose");
        myFamily.add("Blanca");
        myFamily.add("Camilo");
        myFamily.add("Edison");
        myFamily.add("Carlos");
        myFamily.add("Angela");
        myFamily.add("Sophia");
        myFamily.add("Jose");
        myFamily.add("Blanca");
        myFamily.add("Camilo");
        myFamily.add("Edison");
        myFamily.add("Carlos");
        myFamily.add("Angela");
        myFamily.add("Sophia");

        // Llamo el elemento lista que definí
        ListView listView = findViewById(R.id.familia);

        // Creo el adaptador para sincronizarlo con la información
        ArrayAdapter<String> adaptador = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, myFamily);
        listView.setAdapter(adaptador);

    }

    public void irAAmigos(View view){
        Intent a = new Intent(this,AmigosActivity.class);
        startActivity(a);
    }
}
