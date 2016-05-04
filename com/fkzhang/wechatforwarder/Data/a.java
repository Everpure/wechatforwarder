package com.fkzhang.wechatforwarder.Data;

import android.net.Uri;

public class a
{
  public String a;
  
  public a() {}
  
  public a(String paramString)
  {
    a(paramString + ".contentprovider");
  }
  
  public Uri a()
  {
    return Uri.parse("content://" + this.a + "/" + "contact");
  }
  
  public void a(String paramString)
  {
    this.a = paramString;
  }
  
  public Uri b()
  {
    return Uri.parse("content://" + this.a + "/" + "chatrooms");
  }
  
  public Uri c()
  {
    return Uri.parse("content://" + this.a + "/" + "account");
  }
  
  public Uri d()
  {
    return Uri.parse("content://" + this.a + "/" + "autoforwardlist");
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fkzhang/wechatforwarder/Data/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */