package xyz.camiloarguello.iniciosesion;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AudioActivity extends AppCompatActivity {

    MediaPlayer audio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio);
        audio = MediaPlayer.create(this, R.raw.drum);
    }
    public void playSound(View view){

        audio.start();
    }
    public void pauseSound(View view){
        audio.pause();
    }
}
