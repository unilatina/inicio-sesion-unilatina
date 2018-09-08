package xyz.camiloarguello.iniciosesion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class FamiliaActivity extends AppCompatActivity {

    ArrayList<String> myFamily;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_familia);















        // Calling the listview
        ListView listView = findViewById(R.id.myFamily);

        myFamily = new ArrayList<>();
        myFamily.add("Jose");
        myFamily.add("Blanca");
        myFamily.add("Camilo");
        myFamily.add("Edison");
        myFamily.add("Carlos");
        myFamily.add("Angela");
        myFamily.add("Sophia");

        // Convert Array into a List view with Adapter
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, myFamily);
        listView.setAdapter(arrayAdapter);

    }
}
