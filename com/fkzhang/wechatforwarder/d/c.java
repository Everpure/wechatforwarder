package com.fkzhang.wechatforwarder.d;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class c
{
  private Context a;
  private String[] b = { "_ID", "ACCOUNT", "USERNAME", "NICKNAME", "TARGETS", "TARGETSNICK", "ACCOUNTNICK", "CHATMEMBER", "CHATMEMBERNICK", "TYPES", "ENABLE" };
  private String c = "ACCOUNT = ? AND USERNAME = ?";
  private Uri d;
  private String e;
  
  public c(Context paramContext, Uri paramUri)
  {
    this.a = paramContext;
    this.d = paramUri;
  }
  
  private d a(Cursor paramCursor)
  {
    String str1 = paramCursor.getString(paramCursor.getColumnIndex("ACCOUNT"));
    String str2 = paramCursor.getString(paramCursor.getColumnIndex("USERNAME"));
    String str3 = paramCursor.getString(paramCursor.getColumnIndex("NICKNAME"));
    String str4 = paramCursor.getString(paramCursor.getColumnIndex("TARGETSNICK"));
    return new d(str1, str2, paramCursor.getString(paramCursor.getColumnIndex("TARGETS")), str3, str4, paramCursor.getString(paramCursor.getColumnIndex("ACCOUNTNICK")), paramCursor.getString(paramCursor.getColumnIndex("CHATMEMBER")), paramCursor.getString(paramCursor.getColumnIndex("CHATMEMBERNICK")), paramCursor.getString(paramCursor.getColumnIndex("TYPES")), paramCursor.getInt(paramCursor.getColumnIndex("ENABLE")));
  }
  
  private void a(Integer paramInteger)
  {
    this.a.getContentResolver().delete(this.d, "ACCOUNT=? AND _ID=?", new String[] { this.e, String.valueOf(paramInteger) });
  }
  
  private void a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, int paramInt)
  {
    Cursor localCursor = b(paramString1);
    if (localCursor == null)
    {
      b(paramString1, paramString2, paramString3, paramString4, paramString5, paramString6, paramString7, paramString8, paramInt);
      return;
    }
    if (localCursor.getCount() > 0) {
      c(paramString1, paramString2, paramString3, paramString4, paramString5, paramString6, paramString7, paramString8, paramInt);
    }
    for (;;)
    {
      localCursor.close();
      return;
      b(paramString1, paramString2, paramString3, paramString4, paramString5, paramString6, paramString7, paramString8, paramInt);
    }
  }
  
  private Cursor b()
  {
    return this.a.getContentResolver().query(this.d, this.b, "ACCOUNT = ?", new String[] { this.e }, null);
  }
  
  private Cursor b(String paramString)
  {
    return this.a.getContentResolver().query(this.d, this.b, this.c, new String[] { this.e, paramString }, null);
  }
  
  private ArrayList b(Cursor paramCursor)
  {
    ArrayList localArrayList1 = new ArrayList();
    if (paramCursor == null) {
      return localArrayList1;
    }
    HashSet localHashSet = new HashSet();
    ArrayList localArrayList2 = new ArrayList();
    d locald;
    if (paramCursor.moveToFirst())
    {
      locald = a(paramCursor);
      if (!localHashSet.contains(locald.b())) {
        break label138;
      }
      localArrayList2.add(Integer.valueOf(paramCursor.getInt(paramCursor.getColumnIndex("_ID"))));
    }
    for (;;)
    {
      localHashSet.add(locald.b());
      if (paramCursor.moveToNext()) {
        break;
      }
      paramCursor.close();
      paramCursor = localArrayList2.iterator();
      while (paramCursor.hasNext()) {
        a((Integer)paramCursor.next());
      }
      label138:
      localArrayList1.add(locald);
    }
    return localArrayList1;
  }
  
  private void b(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, int paramInt)
  {
    this.a.getContentResolver().insert(this.d, d(paramString1, paramString2, paramString3, paramString4, paramString5, paramString6, paramString7, paramString8, paramInt));
  }
  
  private void c(String paramString)
  {
    this.a.getContentResolver().delete(this.d, this.c, new String[] { this.e, paramString });
  }
  
  private void c(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, int paramInt)
  {
    this.a.getContentResolver().update(this.d, d(paramString1, paramString2, paramString3, paramString4, paramString5, paramString6, paramString7, paramString8, paramInt), this.c, new String[] { this.e, paramString1 });
  }
  
  private ContentValues d(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, int paramInt)
  {
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("ACCOUNT", this.e);
    localContentValues.put("USERNAME", paramString1);
    localContentValues.put("NICKNAME", paramString3);
    localContentValues.put("TARGETSNICK", paramString4);
    localContentValues.put("TARGETS", paramString2);
    localContentValues.put("ACCOUNTNICK", paramString5);
    localContentValues.put("CHATMEMBER", paramString6);
    localContentValues.put("CHATMEMBERNICK", paramString7);
    localContentValues.put("TYPES", paramString8);
    localContentValues.put("ENABLE", Integer.valueOf(paramInt));
    return localContentValues;
  }
  
  public ArrayList a()
  {
    return b(b());
  }
  
  public void a(d paramd)
  {
    a(paramd.b(), paramd.a(), paramd.c(), paramd.d(), paramd.e(), paramd.g(), paramd.h(), paramd.i(), paramd.f());
  }
  
  public void a(String paramString)
  {
    this.e = paramString;
  }
  
  public void b(d paramd)
  {
    c(paramd.b());
  }
  
  public void c(d paramd)
  {
    a(paramd.b(), paramd.a(), paramd.c(), paramd.d(), paramd.e(), paramd.g(), paramd.h(), paramd.i(), paramd.f());
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fkzhang/wechatforwarder/d/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */