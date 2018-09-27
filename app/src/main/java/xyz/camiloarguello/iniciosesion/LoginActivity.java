package xyz.camiloarguello.iniciosesion;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.Arrays;
import java.util.List;

public class LoginActivity extends AppCompatActivity {


    private FirebaseAuth auth;
    private FirebaseAuth.AuthStateListener authStateListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initialize();
    }

    public void initialize(){
        auth = FirebaseAuth.getInstance();
        authStateListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = firebaseAuth.getCurrentUser();

                if(firebaseAuth != null){
                    Log.i("HOLA", "Loggeado " + user.getEmail());
                }else{
                    Log.w("ERROR", "Cerro sesión");
                }

            }
        };
    }

    public void irACrearCuenta(View view){
       Intent a = new Intent(getApplicationContext(), CrearCuenta.class );
       startActivity(a);
    }


}

/**
 *
 * myRef.addValueEventListener(new ValueEventListener() {
@Override
public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
String value = dataSnapshot.getValue(String.class);
Snackbar.make(findViewById(R.id.login_layout),"Su dato es " + value,Snackbar.LENGTH_LONG).setAction("Deshacer", null).show();
}

@Override
public void onCancelled(@NonNull DatabaseError databaseError) {
Log.w("ERROR", "No se obtuvo el valor", databaseError.toException());
}
});
 */
