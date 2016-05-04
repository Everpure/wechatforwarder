package com.fkzhang.wechatforwarder.b;

import de.robv.android.xposed.XposedHelpers;

public class c
  implements a
{
  private Object a;
  
  public c(Object paramObject)
  {
    this.a = paramObject;
  }
  
  public void a(ClassLoader paramClassLoader)
  {
    if (this.a == null) {
      return;
    }
    XposedHelpers.callMethod(this.a, "hook", new Object[] { paramClassLoader });
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fkzhang/wechatforwarder/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */