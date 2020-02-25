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
public class ResFragment extends android.support.v4.app.Fragment {


    public ResFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView =inflater.inflate(R.layout.info_list,container,false);
        ArrayList<Info> res = new ArrayList<Info>();
        res.add(new Info(getString(R.string.res), getString(R.string.phonNumber),R.drawable.res));
        res.add(new Info(getString(R.string.res), getString(R.string.phonNumber),R.drawable.res));
        res.add(new Info(getString(R.string.res), getString(R.string.phonNumber),R.drawable.res));
        res.add(new Info(getString(R.string.res), getString(R.string.phonNumber),R.drawable.res));
        res.add(new Info(getString(R.string.res), getString(R.string.phonNumber),R.drawable.res));
        res.add(new Info(getString(R.string.res), getString(R.string.phonNumber),R.drawable.res));
        res.add(new Info(getString(R.string.res), getString(R.string.phonNumber),R.drawable.res));

        InfoAdapter adapter = new InfoAdapter(getActivity(),res);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }

    @Override
    public void onStop() {
        super.onStop();
    }
}
