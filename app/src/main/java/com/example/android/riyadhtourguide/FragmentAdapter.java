package com.example.android.riyadhtourguide;


import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class FragmentAdapter extends FragmentPagerAdapter {
    private Activity thisActivity;
    String[] tabName;

    public FragmentAdapter(FragmentManager fm, Activity thisActivity) {
        super(fm);
        this.thisActivity = thisActivity;
        tabName = new String[]{thisActivity.getString(R.string.res), thisActivity.getString(R.string.hotel),
                thisActivity.getString(R.string.site), thisActivity.getString(R.string.todo)};
    }


    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new ResFragment();
        } else if (position == 1) {
            return new HotelFragment();
        } else if (position == 2) {
            return new SiteFragment();
        } else {
            return new ThingToDoFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {

        return tabName[position];
    }

    @Override
    public int getCount() {
        return 4;
    }
}


