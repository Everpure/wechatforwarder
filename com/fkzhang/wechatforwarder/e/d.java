package com.fkzhang.wechatforwarder.e;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import de.robv.android.xposed.XSharedPreferences;

public class d
{
  private SharedPreferences a = null;
  private XSharedPreferences b = null;
  
  public d(Context paramContext, String paramString)
  {
    this.a = paramContext.getSharedPreferences(paramString + "_preferences", 1);
  }
  
  public int a(String paramString, int paramInt)
  {
    int i;
    if (this.a != null) {
      i = this.a.getInt(paramString, paramInt);
    }
    do
    {
      return i;
      i = paramInt;
    } while (this.b == null);
    return this.b.getInt(paramString, paramInt);
  }
  
  public String a(String paramString1, String paramString2)
  {
    String str;
    if (this.a != null) {
      str = this.a.getString(paramString1, paramString2);
    }
    do
    {
      return str;
      str = paramString2;
    } while (this.b == null);
    return this.b.getString(paramString1, paramString2);
  }
  
  public boolean a(String paramString, boolean paramBoolean)
  {
    boolean bool;
    if (this.a != null) {
      bool = this.a.getBoolean(paramString, paramBoolean);
    }
    do
    {
      return bool;
      bool = paramBoolean;
    } while (this.b == null);
    return this.b.getBoolean(paramString, paramBoolean);
  }
  
  public void b(String paramString, int paramInt)
  {
    SharedPreferences.Editor localEditor = null;
    if (this.a != null) {
      localEditor = this.a.edit();
    }
    for (;;)
    {
      if (localEditor != null)
      {
        localEditor.putInt(paramString, paramInt);
        localEditor.commit();
      }
      return;
      if (this.b != null) {
        localEditor = this.b.edit();
      }
    }
  }
  
  public void b(String paramString1, String paramString2)
  {
    SharedPreferences.Editor localEditor = null;
    if (this.a != null) {
      localEditor = this.a.edit();
    }
    for (;;)
    {
      if (localEditor != null)
      {
        localEditor.putString(paramString1, paramString2);
        localEditor.commit();
      }
      return;
      if (this.b != null) {
        localEditor = this.b.edit();
      }
    }
  }
  
  public void b(String paramString, boolean paramBoolean)
  {
    SharedPreferences.Editor localEditor = null;
    if (this.a != null) {
      localEditor = this.a.edit();
    }
    for (;;)
    {
      if (localEditor != null)
      {
        localEditor.putBoolean(paramString, paramBoolean);
        localEditor.commit();
      }
      return;
      if (this.b != null) {
        localEditor = this.b.edit();
      }
    }
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fkzhang/wechatforwarder/e/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */