package com.example.victoraweb.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by victoraweb on 5/10/16.
 */

// Model
public class Crime {

//  Instance variables
    private UUID mId;

    private String mTitle;

    private Date mDate;

    private boolean mSolved;

    //    Methods
    public Crime() {
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public Crime(UUID id) {
        mId = id;
        mDate = new Date();
    }

    public Date getmDate() {
        return mDate;
    }


    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    public boolean ismSolved() {
        return mSolved;
    }

    public void setmSolved(boolean mSolved) {
        this.mSolved = mSolved;
    }

    public UUID getmId() {
        return mId;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }
    
}

