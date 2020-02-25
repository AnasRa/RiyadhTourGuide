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
public class ThingToDoFragment extends android.support.v4.app.Fragment {


    public ThingToDoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView =inflater.inflate(R.layout.info_list,container,false);

        ArrayList<Info> toDo = new ArrayList<>();

        toDo.add(new Info(getString(R.string.todo), getString(R.string.phonNumber),R.drawable.thingtodo));
        toDo.add(new Info(getString(R.string.todo), getString(R.string.phonNumber),R.drawable.thingtodo));
        toDo.add(new Info(getString(R.string.todo), getString(R.string.phonNumber),R.drawable.thingtodo));
        toDo.add(new Info(getString(R.string.todo), getString(R.string.phonNumber),R.drawable.thingtodo));
        toDo.add(new Info(getString(R.string.todo), getString(R.string.phonNumber),R.drawable.thingtodo));
        toDo.add(new Info(getString(R.string.todo), getString(R.string.phonNumber),R.drawable.thingtodo));
        toDo.add(new Info(getString(R.string.todo), getString(R.string.phonNumber),R.drawable.thingtodo));
        toDo.add(new Info(getString(R.string.todo), getString(R.string.phonNumber),R.drawable.thingtodo));
        toDo.add(new Info(getString(R.string.todo), getString(R.string.phonNumber),R.drawable.thingtodo));
        toDo.add(new Info(getString(R.string.todo), getString(R.string.phonNumber),R.drawable.thingtodo));


        InfoAdapter adapter = new InfoAdapter(getActivity(),toDo);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;

    }

}
