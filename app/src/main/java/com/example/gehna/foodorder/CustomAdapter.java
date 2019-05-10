package com.example.gehna.foodorder;
import android.content.Context;
import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by GEHNA on 2/11/2018.
 */

class CustomAdapter extends ArrayAdapter<String>{
    int[] imagesIcons;
    CustomAdapter( Context context, String[] rest, int[] Icons) {
        super(context,R.layout.custom_row, rest);
        this.imagesIcons = Icons;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater=LayoutInflater.from(getContext());
        View customView= inflater.inflate(R.layout.custom_row,parent,false);

        String singleRest=getItem(position);
        TextView text=(TextView)customView.findViewById(R.id.text);
        ImageView image=(ImageView)customView.findViewById(R.id.image);

        text.setText(singleRest);
        image.setImageResource(imagesIcons[position]);
        return customView;
    }
}
