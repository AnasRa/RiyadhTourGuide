package com.example.android.riyadhtourguide;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HotelFragment extends android.support.v4.app.Fragment {


    public HotelFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.info_list,container,false);

        ArrayList<Info> hotels;
        hotels = new ArrayList<Info>();

        hotels.add(new Info(getString(R.string.hotel), getString(R.string.phonNumber),R.drawable.hotel));
        hotels.add(new Info(getString(R.string.hotel), getString(R.string.phonNumber),R.drawable.hotel));
        hotels.add(new Info(getString(R.string.hotel), getString(R.string.phonNumber),R.drawable.hotel));
        hotels.add(new Info(getString(R.string.hotel), getString(R.string.phonNumber),R.drawable.hotel));
        hotels.add(new Info(getString(R.string.hotel), getString(R.string.phonNumber),R.drawable.hotel));
        hotels.add(new Info(getString(R.string.hotel), getString(R.string.phonNumber),R.drawable.hotel));
        hotels.add(new Info(getString(R.string.hotel), getString(R.string.phonNumber),R.drawable.hotel));
        hotels.add(new Info(getString(R.string.hotel), getString(R.string.phonNumber),R.drawable.hotel));
        hotels.add(new Info(getString(R.string.hotel), getString(R.string.phonNumber),R.drawable.hotel));
        hotels.add(new Info(getString(R.string.hotel), getString(R.string.phonNumber),R.drawable.hotel));

        InfoAdapter adapter = new InfoAdapter(getActivity(),hotels);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
