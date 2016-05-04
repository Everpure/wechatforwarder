package com.fkzhang.wechatforwarder.Data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class c
  extends SQLiteOpenHelper
{
  private static final String a = "WechatForwarder (2.1.0) ".toUpperCase() + "_CONTACTS";
  
  public c(Context paramContext)
  {
    super(paramContext, a, null, 1);
  }
  
  public void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("CREATE TABLE CONTACTS(_ID INTEGER PRIMARY KEY NOT NULL, ACCOUNT TEXT, USERNAME TEXT, NICKNAME TEXT, TYPE INTEGER)");
    paramSQLiteDatabase.execSQL("CREATE TABLE CHATROOMS(_ID INTEGER PRIMARY KEY NOT NULL, ACCOUNT TEXT, USERNAME TEXT, NICKNAME TEXT, MEMBERS TEXT, MEMBERSNICKNAMES TEXT)");
    paramSQLiteDatabase.execSQL("CREATE TABLE ACCOUNTS(_ID INTEGER PRIMARY KEY NOT NULL, USERNAME TEXT, NICKNAME TEXT)");
  }
  
  public void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS CONTACTS");
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS CHATROOMS");
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS ACCOUNTS");
    onCreate(paramSQLiteDatabase);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fkzhang/wechatforwarder/Data/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */