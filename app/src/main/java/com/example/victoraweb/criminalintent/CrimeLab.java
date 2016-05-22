package com.example.victoraweb.criminalintent;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.victoraweb.criminalintent.database.CrimeBaseHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by victoraweb on 5/13/16.
 */
public class CrimeLab {
    private static CrimeLab sCrimeLab; // s stands for static
    private List<Crime> mCrimes; // List<E> => Ordered list of a given type
    private Context mContext;
    private SQLiteDatabase mDatabase;

    private CrimeLab(Context context) {
        mContext = context.getApplicationContext();
        mDatabase = new CrimeBaseHelper(context).getWritableDatabase();
        mCrimes = new ArrayList<>();
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

    public void addCrime(Crime c) {
        this.mCrimes.add(c);
    }

    public void removeCrime(Crime c) {
        this.mCrimes.remove(c);
    }
}
