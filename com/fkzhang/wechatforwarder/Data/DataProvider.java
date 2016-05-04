package com.fkzhang.wechatforwarder.Data;

import android.content.ContentProvider;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.MatrixCursor.RowBuilder;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.IOException;

public class DataProvider
  extends ContentProvider
{
  private static final UriMatcher a = new UriMatcher(-1);
  private c b;
  private String c;
  private d d;
  private b e;
  
  static
  {
    a.addURI("com.fkzhang.wechatforwarder.contentprovider", "contact", 10);
    a.addURI("com.fkzhang.wechatforwarder.contentprovider", "preference", 20);
    a.addURI("com.fkzhang.wechatforwarder.contentprovider", "chatrooms", 101);
    a.addURI("com.fkzhang.wechatforwarder.contentprovider", "bitmap/*", 70);
    a.addURI("com.fkzhang.wechatforwarder.contentprovider", "autoforwardlist", 102);
    a.addURI("com.fkzhang.wechatforwarder.contentprovider", "account", 40);
  }
  
  private File a()
  {
    Context localContext = getContext();
    if (localContext == null) {
      return null;
    }
    return localContext.getCacheDir();
  }
  
  private void a(Uri paramUri)
  {
    Object localObject = getContext();
    if (localObject == null) {}
    do
    {
      return;
      localObject = ((Context)localObject).getContentResolver();
    } while (localObject == null);
    ((ContentResolver)localObject).notifyChange(paramUri, null);
  }
  
  public int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    switch (a.match(paramUri))
    {
    }
    do
    {
      return -1;
      int i = this.b.getWritableDatabase().delete("CONTACTS", paramString, paramArrayOfString);
      for (;;)
      {
        a(paramUri);
        return i;
        i = this.b.getWritableDatabase().delete("ACCOUNTS", paramString, paramArrayOfString);
        continue;
        i = this.d.getWritableDatabase().delete("PREFERENCES", paramString, paramArrayOfString);
        continue;
        i = this.b.getWritableDatabase().delete("CHATROOMS", paramString, paramArrayOfString);
        continue;
        i = this.e.getWritableDatabase().delete("AUTOFORWARDLIST", paramString, paramArrayOfString);
      }
      paramUri = new File(a(), paramUri.getLastPathSegment());
    } while (!paramUri.exists());
    paramUri.delete();
    return -1;
  }
  
  public String getType(Uri paramUri)
  {
    switch (a.match(paramUri))
    {
    default: 
      return null;
    case 10: 
      return "vnd.android.cursor.dir/vnd." + this.c + ".contentprovider.contact";
    case 40: 
      return "vnd.android.cursor.dir/vnd." + this.c + ".contentprovider.account";
    case 20: 
      return "vnd.android.cursor.item/vnd." + this.c + ".contentprovider.preference";
    case 101: 
      return "vnd.android.cursor.item/vnd." + this.c + ".contentprovider.chatrooms";
    case 102: 
      return "vnd.android.cursor.item/vnd." + this.c + ".contentprovider.autoforwardlist";
    }
    return "vnd.android.cursor.item/vnd.com." + this.c + ".contentprovider.bitmap";
  }
  
  public Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    long l;
    switch (a.match(paramUri))
    {
    default: 
      return null;
    case 10: 
      l = this.b.getWritableDatabase().insert("CONTACTS", null, paramContentValues);
      paramContentValues = "contact";
    }
    for (;;)
    {
      a(paramUri);
      return Uri.parse(paramContentValues + "/" + l);
      l = this.b.getWritableDatabase().insert("ACCOUNTS", null, paramContentValues);
      paramContentValues = "account";
      continue;
      l = this.d.getWritableDatabase().insert("PREFERENCES", null, paramContentValues);
      paramContentValues = "preference";
      continue;
      l = this.b.getWritableDatabase().insert("CHATROOMS", null, paramContentValues);
      paramContentValues = "chatrooms";
      continue;
      l = this.e.getWritableDatabase().insert("AUTOFORWARDLIST", null, paramContentValues);
      paramContentValues = "autoforwardlist";
    }
  }
  
  public boolean onCreate()
  {
    this.b = new c(getContext());
    this.d = new d(getContext());
    this.e = new b(getContext());
    this.c = "com.fkzhang.wechatforwarder";
    return false;
  }
  
  public ParcelFileDescriptor openFile(Uri paramUri, String paramString)
  {
    if (a.match(paramUri) != 70) {
      return null;
    }
    paramUri = new File(a(), paramUri.getLastPathSegment());
    int i = 0;
    if (paramString.contains("w"))
    {
      j = 536870912;
      i = j;
      if (paramUri.exists()) {}
    }
    try
    {
      paramUri.createNewFile();
      i = j;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        localIOException.printStackTrace();
        i = j;
      }
      j = i | 0x10000000;
      i = j;
      if (!paramString.contains("+")) {
        break label121;
      }
      i = j | 0x2000000;
    }
    int j = i;
    if (paramString.contains("r")) {
      if (!paramUri.exists()) {
        return null;
      }
    }
    label121:
    return ParcelFileDescriptor.open(paramUri, i);
  }
  
  public Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    Object localObject = null;
    SQLiteQueryBuilder localSQLiteQueryBuilder = new SQLiteQueryBuilder();
    SQLiteDatabase localSQLiteDatabase;
    switch (a.match(paramUri))
    {
    default: 
      return (Cursor)localObject;
    case 10: 
      localSQLiteDatabase = this.b.getWritableDatabase();
      localSQLiteQueryBuilder.setTables("CONTACTS");
    case 40: 
    case 20: 
    case 101: 
    case 102: 
      while (localSQLiteDatabase != null)
      {
        paramArrayOfString1 = localSQLiteQueryBuilder.query(localSQLiteDatabase, paramArrayOfString1, paramString1, paramArrayOfString2, null, null, paramString2);
        paramString1 = getContext();
        localObject = paramArrayOfString1;
        if (paramString1 == null) {
          break;
        }
        paramArrayOfString1.setNotificationUri(paramString1.getContentResolver(), paramUri);
        return paramArrayOfString1;
        localSQLiteDatabase = this.b.getWritableDatabase();
        localSQLiteQueryBuilder.setTables("ACCOUNTS");
        continue;
        localSQLiteDatabase = this.d.getWritableDatabase();
        localSQLiteQueryBuilder.setTables("PREFERENCES");
        continue;
        localSQLiteDatabase = this.b.getWritableDatabase();
        localSQLiteQueryBuilder.setTables("CHATROOMS");
        continue;
        localSQLiteDatabase = this.e.getWritableDatabase();
        localSQLiteQueryBuilder.setTables("AUTOFORWARDLIST");
      }
    }
    paramArrayOfString1 = new MatrixCursor(new String[] { "exist" });
    paramUri = new File(a(), paramUri.getLastPathSegment());
    paramString1 = paramArrayOfString1.newRow();
    if (paramUri.exists()) {}
    for (int i = 1;; i = 0)
    {
      paramString1.add(Integer.valueOf(i));
      return paramArrayOfString1;
    }
  }
  
  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    int j = a.match(paramUri);
    int i = 0;
    switch (j)
    {
    }
    for (;;)
    {
      a(paramUri);
      return i;
      i = this.b.getWritableDatabase().update("CONTACTS", paramContentValues, paramString, paramArrayOfString);
      continue;
      i = this.b.getWritableDatabase().update("ACCOUNTS", paramContentValues, paramString, paramArrayOfString);
      continue;
      i = this.d.getWritableDatabase().update("PREFERENCES", paramContentValues, paramString, paramArrayOfString);
      continue;
      i = this.b.getWritableDatabase().update("CHATROOMS", paramContentValues, paramString, paramArrayOfString);
      continue;
      i = this.e.getWritableDatabase().update("AUTOFORWARDLIST", paramContentValues, paramString, paramArrayOfString);
    }
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fkzhang/wechatforwarder/Data/DataProvider.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */