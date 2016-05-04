package com.fkzhang.wechatforwarder.d;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class f
{
  private Context a;
  private String[] b = { "_ID", "ACCOUNT", "USERNAME", "NICKNAME", "MEMBERS", "MEMBERSNICKNAMES" };
  private String c = "ACCOUNT = ? AND USERNAME = ?";
  private String d;
  private Uri e;
  private HashMap f;
  
  public f(Context paramContext, Uri paramUri)
  {
    this.a = paramContext;
    this.d = "";
    this.e = paramUri;
    this.f = new HashMap();
  }
  
  private e a(Cursor paramCursor)
  {
    String str1 = paramCursor.getString(paramCursor.getColumnIndex("ACCOUNT"));
    String str2 = paramCursor.getString(paramCursor.getColumnIndex("NICKNAME"));
    String str3 = paramCursor.getString(paramCursor.getColumnIndex("MEMBERS"));
    String str4 = paramCursor.getString(paramCursor.getColumnIndex("MEMBERSNICKNAMES"));
    return new e(str1, paramCursor.getString(paramCursor.getColumnIndex("USERNAME")), str2, str3, str4);
  }
  
  private void a(Integer paramInteger)
  {
    this.a.getContentResolver().delete(this.e, "ACCOUNT=? AND _ID=?", new String[] { this.d, String.valueOf(paramInteger) });
  }
  
  private Cursor b()
  {
    return this.a.getContentResolver().query(this.e, this.b, "ACCOUNT = ?", new String[] { this.d }, "NICKNAME");
  }
  
  private ArrayList b(Cursor paramCursor)
  {
    ArrayList localArrayList1 = new ArrayList();
    if (paramCursor == null) {
      return localArrayList1;
    }
    HashSet localHashSet = new HashSet();
    ArrayList localArrayList2 = new ArrayList();
    e locale;
    if (paramCursor.moveToFirst())
    {
      locale = a(paramCursor);
      if (!localHashSet.contains(locale.a())) {
        break label138;
      }
      localArrayList2.add(Integer.valueOf(paramCursor.getInt(paramCursor.getColumnIndex("_ID"))));
    }
    for (;;)
    {
      localHashSet.add(locale.a());
      if (paramCursor.moveToNext()) {
        break;
      }
      paramCursor.close();
      paramCursor = localArrayList2.iterator();
      while (paramCursor.hasNext()) {
        a((Integer)paramCursor.next());
      }
      label138:
      localArrayList1.add(locale);
    }
    return localArrayList1;
  }
  
  public ArrayList a()
  {
    return b(b());
  }
  
  public void a(String paramString)
  {
    this.d = paramString;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fkzhang/wechatforwarder/d/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */