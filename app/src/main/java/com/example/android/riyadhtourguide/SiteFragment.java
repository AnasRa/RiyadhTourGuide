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
public class SiteFragment extends android.support.v4.app.Fragment {


    public SiteFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.info_list, container, false);


        ArrayList<Info> site = new ArrayList<>();

        site.add(new Info(getString(R.string.site), getString(R.string.phonNumber), R.drawable.site));
        site.add(new Info(getString(R.string.site), getString(R.string.phonNumber), R.drawable.site));
        site.add(new Info(getString(R.string.site), getString(R.string.phonNumber), R.drawable.site));
        site.add(new Info(getString(R.string.site), getString(R.string.phonNumber), R.drawable.site));
        site.add(new Info(getString(R.string.site), getString(R.string.phonNumber), R.drawable.site));
        site.add(new Info(getString(R.string.site), getString(R.string.phonNumber), R.drawable.site));
        site.add(new Info(getString(R.string.site), getString(R.string.phonNumber), R.drawable.site));
        site.add(new Info(getString(R.string.site), getString(R.string.phonNumber), R.drawable.site));
        site.add(new Info(getString(R.string.site), getString(R.string.phonNumber), R.drawable.site));

    InfoAdapter adapter = new InfoAdapter(getActivity(),site);
    ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
}

}
