package smh.devices.dao;

import android.R.integer;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DBOpenHelper extends SQLiteOpenHelper
{
    private static final int VERSION = 1;
    private static final String DBNAME = "data.db";
    
    public DBOpenHelper(Context context)
    {
	super(context, DBNAME, null, VERSION);
	// TODO Auto-generated constructor stub
    }

    @Override
    public void onCreate(SQLiteDatabase db)

    {
        db.execSQL("create table pc (id integer primary key autoincrement, " +
        		                  "ipaddress varchar(30), " +
        		                  "info varchar(30))");
        db.execSQL("create table service (id integer primary key autoincrement, " +
        		                "ipaddress varchar(30), " +
        		                "name varchar(30))" );
        db.execSQL("insert into pc (ipaddress, info) values ('10.24.47.150','Pc in smh')");
        db.execSQL("insert into pc (ipaddress, info) values ('10.24.46.67','Left Pc in smh')");
        db.execSQL("insert into pc (ipaddress, info) values ('192.168.1.14','Pc in home')");
        db.execSQL("insert into pc (ipaddress, info) values ('10.24.46.3','blindroom')");
        db.execSQL("insert into pc (ipaddress, info) values ('10.24.46.60','Ps PC in sml')");
        db.execSQL("insert into service (ipaddress, name) values ('10.24.46.67','blind')");
        db.execSQL("insert into service (ipaddress, name) values ('129.186.93.168','lamp')");
        db.execSQL("insert into service (ipaddress, name) values ('129.186.93.168','radio')");
        db.execSQL("insert into service (ipaddress, name) values ('192.168.1.9','ppt')");
        db.execSQL("insert into service (ipaddress, name) values ('10.24.47.150','audioplayer')");
        Log.i("DBphil", "DBOpenHelper41");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
	// TODO Auto-generated method stub
	
    }

    
}


















































