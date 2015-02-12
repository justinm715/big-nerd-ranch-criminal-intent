package com.bignerdranch.android.criminalintent.criminalintent;

import android.app.Fragment;

/**
 * Created by Justin on 2/11/2015.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
