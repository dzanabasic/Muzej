package com.example.dana.muzej;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Džana on 17.12.2016.
 */

public class DBHelper extends SQLiteOpenHelper {

    public static  final String DATABASE_NAME="Museum.db";
    public static  final String TABLE_NAME="gallery_table";
    public static  final String COL_1="id";
    public static  final String COL_2="image";
    String TAG = "DbHelper";


    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
        SQLiteDatabase db=this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //super.onCreate(savedInstanceState);
      //  setContentView(R.layout.main);
        db.execSQL("create table gallery_table (id integer primary key autoincrement, image text)");
       // String sql =
            //    "INSERT or replace INTO gallery_table (id, image) VALUES('1','HELLO FIRST ROW')" ;
       // db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public String getTableAsString(SQLiteDatabase db, String tableName) {
        Log.d(TAG, "getTableAsString called");
        String tableString = String.format("Table %s:\n", tableName);
        Cursor allRows  = db.rawQuery("SELECT * FROM " + tableName, null);
        if (allRows.moveToFirst() ){
            String[] columnNames = allRows.getColumnNames();
            do {
                for (String name: columnNames) {
                    tableString += String.format("%s: %s\n", name,
                            allRows.getString(allRows.getColumnIndex(name)));
                }
                tableString += "\n";

            } while (allRows.moveToNext());
        }

        return tableString;
    }

}

