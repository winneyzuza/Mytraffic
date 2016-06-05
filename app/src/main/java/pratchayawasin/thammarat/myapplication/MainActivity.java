package pratchayawasin.thammarat.myapplication;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    // ctrl + allt + L (reformat code)
    //Explicit

    private ListView trafficListView;
    private Button aboutMeButton;
    private String urlYoutubeString = "https://youtu.be/9X-6Jjn2f4I";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Bind Widget
        trafficListView = (ListView) findViewById(R.id.listView);
        aboutMeButton = (Button) findViewById(R.id.button); // alt + enter = Cast Data Type

        //Controller button

        controllerButton();

        //Controller ListView

        controllerListView();

    }

    private void controllerListView() {
        //setup for name
        final String[] nameStrings = new String[10];
        nameStrings[0] = "Brand 1";
        nameStrings[1] = "Brand 2";
        nameStrings[2] = "Brand 3";
        nameStrings[3] = "Brand 4";
        nameStrings[4] = "Brand 5";

        nameStrings[5] = "Brand 6";
        nameStrings[6] = "Brand 7";
        nameStrings[7] = "Brand 8";
        nameStrings[8] = "Brand 9";
        nameStrings[9] = "Brand 10";

        //for Detail Short
        String[] detailStrings = getResources().getStringArray(R.array.detail_short);

        //for image
        MyData myData = new MyData();
        final int[] ints = myData.getInts();
        //final int[] intbag = myData.getIntbag();

        //Create ListView
        MyAdapter myAdapter = new MyAdapter(this, ints, nameStrings, detailStrings);
        trafficListView.setAdapter(myAdapter);

        trafficListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);

                intent.putExtra("Name", nameStrings[position]);
                intent.putExtra("Image", ints[position]);
                intent.putExtra("Index", position);
                startActivity(intent);
            }
        });

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
