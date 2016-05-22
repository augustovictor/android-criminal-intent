package com.example.victoraweb.criminalintent;

/**
 * Created by victoraweb on 5/22/16.
 */
public class CrimeDbSchema {

    public static final class CrimeTable {
        public static final String NAME = "crimes";

        public static final class Cols {
            public static final String UUID = "uuid";
            public final static String TITLE = "title";
            public final static String DATE = "date";
            public final static String SOLVED = "solved";
        }
    }
}
