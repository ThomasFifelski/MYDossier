package com.deltaprogram.lldossier;

/**
 * Created by tom on 8/2/13.
 */
public class Person {
    private String mFirstName = "unknown";
    private String mLastName =  "unknown";
    private int mNumberOfAppsMade = 1;


    public Person (String startFirstName, String startLastName) {
        mFirstName = startFirstName;
        mLastName = startLastName;
    }

    public String getmFirstName() {
        return mFirstName;
    }

    public void setmFirstName(String mFirstName) {
        this.mFirstName = mFirstName;
    }

    public String getmLastName() {
        return mLastName;
    }

    public void setmLastName(String mLastName) {
        this.mLastName = mLastName;
    }

    public int getmNumberOfAppsMade() {
        return mNumberOfAppsMade;
    }

    public void setmNumberOfAppsMade(int mNumberOfAppsMade) {
        this.mNumberOfAppsMade = mNumberOfAppsMade;
    }


}





