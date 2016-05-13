package com.example.victoraweb.criminalintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by victoraweb on 5/13/16.
 */
public class CrimeLab {
    private static CrimeLab sCrimeLab; // s stands for static
    private List<Crime> mCrimes; // List<E> => Ordered list of a given type

    private CrimeLab(Context context) {
        mCrimes = new ArrayList<>();
        for(int i = 0; i < 100; i++) {
            Crime c = new Crime();
            c.setmTitle("Crime #" + i);
            c.setmSolved(i % 2 == 0);
            mCrimes.add(c);
        }
    }

    public static CrimeLab get(Context context) {
        if(sCrimeLab == null) {
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }

    public List<Crime> getmCrimes() {
        return this.mCrimes;
    }

    public Crime getCrime(UUID id) {
        for(Crime crime : mCrimes) {
            if(crime.getmId().equals(id)) {
                return crime;
            }
        }
        return null;
    }
}
