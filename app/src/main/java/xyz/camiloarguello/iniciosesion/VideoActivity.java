package xyz.camiloarguello.iniciosesion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toolbar;
import android.widget.VideoView;

public class VideoActivity extends AppCompatActivity {
    VideoView miVideo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        miVideo = findViewById(R.id.videoUnilatina); // Encontrar el ID
        miVideo.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.video); // Indicarle la ruta
    }

    public void playVideo(View view){

        miVideo.start();
    }
    public void irAFamilia(View view){
        Intent a = new Intent(getApplicationContext(), FamiliaActivity.class );
        startActivity(a);
    }
}
