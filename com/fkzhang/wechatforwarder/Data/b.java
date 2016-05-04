package com.fkzhang.wechatforwarder.Data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class b
  extends SQLiteOpenHelper
{
  private static final String a = "WechatForwarder (2.1.0) ".toUpperCase() + "_AUTOFORWARDLIST";
  
  public b(Context paramContext)
  {
    super(paramContext, a, null, 1);
  }
  
  public void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("CREATE TABLE AUTOFORWARDLIST(_ID INTEGER PRIMARY KEY NOT NULL, ACCOUNT TEXT, USERNAME TEXT, TARGETS TEXT, NICKNAME TEXT, TARGETSNICK TEXT, ACCOUNTNICK TEXT, CHATMEMBER TEXT, CHATMEMBERNICK TEXT, TYPES TEXT, ENABLE INTEGER)");
  }
  
  public void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS AUTOFORWARDLIST");
    onCreate(paramSQLiteDatabase);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fkzhang/wechatforwarder/Data/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */