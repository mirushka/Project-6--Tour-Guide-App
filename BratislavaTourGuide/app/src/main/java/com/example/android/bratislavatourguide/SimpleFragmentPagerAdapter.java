package com.example.android.bratislavatourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Mirka on 12/06/2017.
 */

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {
    /**
     * Context of the app
     */
    private Context mContext;
    private String tabTitles[];

    public SimpleFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
        tabTitles = new String[]{context.getString(R.string.category_attraction), context.getString(R.string.category_eatAndDrink),
                context.getString(R.string.category_shopping), context.getString(R.string.category_events)};
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new Attractions();
        } else if (position == 1) {
            return new EatAndDrink();
        } else if (position == 2) {
            return new Shopping();
        } else {
            return new Events();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_attraction);
        } else if (position == 1) {
            return mContext.getString(R.string.category_eatAndDrink);
        } else if (position == 2) {
            return mContext.getString(R.string.category_shopping);
        } else if (position == 3) {
            return mContext.getString(R.string.category_events);
        }
        return null;
    }
}

