package com.fkzhang.wechatforwarder.d;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class b
{
  private Context a;
  private String[] b = { "_ID", "USERNAME", "NICKNAME" };
  private String c = "USERNAME = ?";
  private Uri d;
  
  public b(Context paramContext, Uri paramUri)
  {
    this.a = paramContext;
    this.d = paramUri;
  }
  
  private void a(Integer paramInteger)
  {
    this.a.getContentResolver().delete(this.d, "_ID=?", new String[] { String.valueOf(paramInteger) });
  }
  
  private Cursor b()
  {
    return this.a.getContentResolver().query(this.d, this.b, null, null, "NICKNAME");
  }
  
  public ArrayList a()
  {
    Object localObject = b();
    ArrayList localArrayList1 = new ArrayList();
    HashSet localHashSet = new HashSet();
    ArrayList localArrayList2 = new ArrayList();
    if (localObject == null) {
      return localArrayList1;
    }
    String str1;
    String str2;
    if (((Cursor)localObject).moveToFirst())
    {
      str1 = ((Cursor)localObject).getString(((Cursor)localObject).getColumnIndex("USERNAME"));
      str2 = ((Cursor)localObject).getString(((Cursor)localObject).getColumnIndex("NICKNAME"));
      if (!localHashSet.contains(str1)) {
        break label162;
      }
      localArrayList2.add(Integer.valueOf(((Cursor)localObject).getInt(((Cursor)localObject).getColumnIndex("_ID"))));
    }
    for (;;)
    {
      localHashSet.add(str1);
      if (((Cursor)localObject).moveToNext()) {
        break;
      }
      ((Cursor)localObject).close();
      localObject = localArrayList2.iterator();
      while (((Iterator)localObject).hasNext()) {
        a((Integer)((Iterator)localObject).next());
      }
      label162:
      localArrayList1.add(new a(str1, str2));
    }
    return localArrayList1;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fkzhang/wechatforwarder/d/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */