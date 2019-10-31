package edu.wmdd.sqliteexample;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SQLiteOpenHelper helper = new SQLiteOpenHelper(this, "rentals.db", null, 1) {

            @Override
            public void onCreate(SQLiteDatabase db) {
                Log.d(MainActivity.class.getName(), "Creating database");
                db.execSQL("CREATE TABLE test (id int, data TEXT)");
            }

            @Override
            public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

            }
        };

        SQLiteDatabase db = helper.getWritableDatabase();
    }
}
