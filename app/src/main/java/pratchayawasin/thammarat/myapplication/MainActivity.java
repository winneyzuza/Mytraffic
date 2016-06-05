package pratchayawasin.thammarat.myapplication;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    // ctrl + allt + L (reformat code)
    //Explicit

    private ListView trafficListView;
    private Button aboutMeButton;
    private String urlYoutubeString = "https://youtu.be/L7RMffkJsC0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Bind Widget
        trafficListView = (ListView) findViewById(R.id.listView);
        aboutMeButton = (Button) findViewById(R.id.button); // alt + enter = Cast Data Type

        //Controller button

        controllerButton();

    }

    private void controllerButton() {
        aboutMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Sound Effect
                MediaPlayer mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.lion);
                mediaPlayer.start();

                // Web View
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(urlYoutubeString));
                startActivity(intent);

            }// On Click
        });
    }// Controller Button

}// Main Class
