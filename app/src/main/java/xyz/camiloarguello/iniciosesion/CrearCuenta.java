package xyz.camiloarguello.iniciosesion;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class CrearCuenta extends AppCompatActivity {
    private FirebaseAuth auth;
    private FirebaseAuth.AuthStateListener authStateListener;

    private Button btnCreateAccount;
    private TextInputEditText emailTextInput;
    private TextInputEditText nombreUsuarioTextInput;
    private TextInputEditText usuarioTextInput;
    private TextInputEditText passwordTextInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_cuenta);

        btnCreateAccount = findViewById(R.id.btn_crear_cuenta);
        emailTextInput = findViewById(R.id.email_create_account);
        nombreUsuarioTextInput = findViewById(R.id.nombre_usuario);
        usuarioTextInput = findViewById(R.id.usuario);
        passwordTextInput = findViewById(R.id.password_crear_cuenta);

        initialize();

        Toolbar toolbarRegistro = findViewById(R.id.miToolbar);
        setSupportActionBar(toolbarRegistro);
        getSupportActionBar().setTitle("Registro");

        btnCreateAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createAccount(emailTextInput.getText().toString(), passwordTextInput.getText().toString());
            }
        });

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

    public void createAccount(String mail, String pass){
        auth.createUserWithEmailAndPassword(mail,pass).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    Toast.makeText(CrearCuenta.this,"Cuenta creada", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(CrearCuenta.this,"ALgo salió mal", Toast.LENGTH_LONG).show();
                }
            }
        });
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
