package com.example.android.riyadhtourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by marinz on 5/7/18.
 */

public class InfoAdapter extends android.widget.ArrayAdapter {
    public InfoAdapter(@NonNull Context context, @NonNull ArrayList<Info> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        TextView placeName = listItemView.findViewById(R.id.placeName);
        TextView placeNumber = listItemView.findViewById(R.id.placeNumber);
        ImageView placeImage = listItemView.findViewById(R.id.placeImage);

        Info info = (Info) getItem(position);


        placeName.setText(info.getPlaceName());
        placeNumber.setText(info.getPlacePhoneNumber());
        placeImage.setImageResource(info.getImageRes());



        return listItemView;
    }
}
