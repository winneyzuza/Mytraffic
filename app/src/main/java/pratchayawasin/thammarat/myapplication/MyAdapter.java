package pratchayawasin.thammarat.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import static android.content.Context.LAYOUT_INFLATER_SERVICE;

/**
 * Created by User on 05/06/2559.
 */
public class MyAdapter extends BaseAdapter {
    //Explicit
    private Context context;
    private int[] anInts;
    private String[] nameStrings, detailStrings;


    public MyAdapter(Context context,
                     int[] anInts,
                     String[] nameStrings,
                     String[] detailStrings) {
        this.context = context;
        this.anInts = anInts;
        this.nameStrings = nameStrings;
        this.detailStrings = detailStrings;
    }

    @Override
    public int getCount() {
        return anInts.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view1 = layoutInflater.inflate(R.layout.my_listview, viewGroup, false);

        //for Image
        ImageView imageView = (ImageView) view1.findViewById(R.id.imageView);
        imageView.setImageResource(anInts[i]);

        //for TextView
        TextView nameTextView = (TextView) view1.findViewById(R.id.textView2);
        nameTextView.setText(nameStrings[i]);

        TextView detailTextView = (TextView) view1.findViewById(R.id.textView3);
        detailTextView.setText(detailStrings[i]);

        return view1;
    }

    //Main Class
}
