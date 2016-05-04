package com.fkzhang.wechatforwarder.b;

import android.text.TextUtils;

public class d
{
  public static String[] a = { "6.3.16", "6.3.15", "6.3.13", "6.3.11", "6.3.9", "6.3.8", "6.3.7", "6.3.5", "6.3.0", "6.2.5", "6.2.4", "6.0.0" };
  
  public static boolean a(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {}
    for (;;)
    {
      return false;
      String[] arrayOfString = a;
      int j = arrayOfString.length;
      int i = 0;
      while (i < j)
      {
        if (paramString.contains(arrayOfString[i])) {
          return true;
        }
        i += 1;
      }
    }
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fkzhang/wechatforwarder/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */