package com.fkzhang.wechatforwarder.Data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class d
  extends SQLiteOpenHelper
{
  private static final String a = "WechatForwarder (2.1.0) ".toUpperCase() + "_PREFERENCES";
  
  public d(Context paramContext)
  {
    super(paramContext, a, null, 1);
  }
  
  public void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("CREATE TABLE PREFERENCES(_ID INTEGER PRIMARY KEY NOT NULL,NAMESPACE TEXT, NAME TEXT, VALUE TEXT)");
  }
  
  public void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS PREFERENCES");
    onCreate(paramSQLiteDatabase);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fkzhang/wechatforwarder/Data/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */