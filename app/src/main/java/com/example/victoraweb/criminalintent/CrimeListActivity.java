package com.example.victoraweb.criminalintent;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

/**
 * Created by victoraweb on 5/14/16.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    public static Intent newIntent(Context packageContext) {
        Intent i = new Intent(packageContext, CrimeListActivity.class);
        return i;
    }

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
