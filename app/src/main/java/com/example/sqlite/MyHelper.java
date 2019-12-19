package com.example.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MyHelper extends SQLiteOpenHelper {

    private static final String databaseName = "DictionaryDB";
    private static final int dbVersion=1;

    private  static final String tblword ="tblword";
    private static final String wordID ="wordId";
    private static final String word="word";
    private static final String meaning="meaning";

    public MyHelper(Context context){
        super (context, databaseName,null,dbVersion);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {

        String query = "CREATE TABLE " + tblword + "("
                + wordID + " INTEGER PRIMARY KEY AUTOINCREMENT ," +
                word + "TEXT, "
                + meaning + "TEXT "+
                ")";
        db.execSQL(query);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
