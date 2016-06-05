package pratchayawasin.thammarat.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    //Explicit
    private TextView nameTextView, detailTextView;
    private ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //Bind Widget
        nameTextView = (TextView) findViewById(R.id.textView4);
        detailTextView = (TextView) findViewById(R.id.textView5);
        imageView = (ImageView) findViewById(R.id.imageView2);

        //Show view
        String strName = getIntent().getStringExtra("Name");
        nameTextView.setText(strName);

        int intImage = getIntent().getIntExtra("Image", R.drawable.traffic_01);
        imageView.setImageResource(intImage);

        int intIndex = getIntent().getIntExtra("Index", 0);
        String[] detailStrings = getResources().getStringArray(R.array.detail_long);
        detailTextView.setText(detailStrings[intIndex]);

    }//main method

    public void ClickBack(View view){
        finish();
    }

}// main class
