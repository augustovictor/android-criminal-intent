package com.example.victoraweb.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by victoraweb on 5/14/16.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
