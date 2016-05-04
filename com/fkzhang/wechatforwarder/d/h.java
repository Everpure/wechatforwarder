package com.fkzhang.wechatforwarder.d;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class h
{
  private HashMap a;
  private Context b;
  private String[] c = { "_ID", "ACCOUNT", "USERNAME", "NICKNAME", "TYPE" };
  private String d = "ACCOUNT = ? AND USERNAME = ?";
  private String e;
  private Uri f;
  
  public h(Context paramContext, Uri paramUri)
  {
    this.b = paramContext;
    this.a = new HashMap();
    this.e = "";
    this.f = paramUri;
  }
  
  private void a(Integer paramInteger)
  {
    this.b.getContentResolver().delete(this.f, "ACCOUNT=? AND _ID=?", new String[] { this.e, String.valueOf(paramInteger) });
  }
  
  private Cursor b()
  {
    return this.b.getContentResolver().query(this.f, this.c, "ACCOUNT = ? AND TYPE != 0 AND (TYPE &1 !=0 OR USERNAME LIKE '%@chatroom')", new String[] { this.e }, "NICKNAME");
  }
  
  private ArrayList b(Cursor paramCursor)
  {
    ArrayList localArrayList1 = new ArrayList();
    if (paramCursor == null) {
      return localArrayList1;
    }
    HashSet localHashSet = new HashSet();
    ArrayList localArrayList2 = new ArrayList();
    g localg;
    if (paramCursor.moveToFirst())
    {
      localg = a(paramCursor);
      if (!localHashSet.contains(localg.a())) {
        break label138;
      }
      localArrayList2.add(Integer.valueOf(paramCursor.getInt(paramCursor.getColumnIndex("_ID"))));
    }
    for (;;)
    {
      localHashSet.add(localg.a());
      if (paramCursor.moveToNext()) {
        break;
      }
      paramCursor.close();
      paramCursor = localArrayList2.iterator();
      while (paramCursor.hasNext()) {
        a((Integer)paramCursor.next());
      }
      label138:
      localArrayList1.add(localg);
    }
    return localArrayList1;
  }
  
  protected g a(Cursor paramCursor)
  {
    return new g(paramCursor.getString(paramCursor.getColumnIndex("ACCOUNT")), paramCursor.getString(paramCursor.getColumnIndex("USERNAME")), paramCursor.getString(paramCursor.getColumnIndex("NICKNAME")), paramCursor.getInt(paramCursor.getColumnIndex("TYPE")));
  }
  
  public ArrayList a()
  {
    return b(b());
  }
  
  public void a(String paramString)
  {
    this.e = paramString;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fkzhang/wechatforwarder/d/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */