package com.fkzhang.wechatforwarder.b;

import android.content.Context;
import android.content.res.AssetManager;
import com.fkzhang.wechatforwarder.ak;
import dalvik.system.DexClassLoader;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class b
{
  private Context a;
  private ClassLoader b;
  private final boolean c;
  private final String d;
  private File e;
  private Context f;
  private Class g;
  private String h;
  private String i;
  
  public b(Context paramContext1, Context paramContext2, ClassLoader paramClassLoader, String paramString, boolean paramBoolean)
  {
    this.a = paramContext2;
    this.b = paramClassLoader;
    this.c = paramBoolean;
    this.d = paramString;
    paramContext2 = ak.a;
    if (this.c) {}
    for (this.i = paramContext2;; this.i = (paramContext2 + ".apk")) {
      try
      {
        this.f = paramContext1.createPackageContext(paramString, 2);
        this.h = com.fkzhang.wechatforwarder.e.a.a(this.f);
        this.e = new File(c(), this.i);
        a(this.i, this.e);
        return;
      }
      catch (Throwable paramContext1)
      {
        XposedBridge.log(paramContext1);
      }
    }
  }
  
  private Class a(String paramString1, String paramString2, ClassLoader paramClassLoader)
  {
    Object localObject = null;
    paramString2 = new DexClassLoader(paramString2, c().getAbsolutePath(), null, paramClassLoader);
    try
    {
      paramString1 = paramString2.loadClass(paramString1);
      b();
      return paramString1;
    }
    catch (Throwable paramString1)
    {
      for (;;)
      {
        XposedBridge.log(paramString1);
        paramString1 = (String)localObject;
      }
    }
  }
  
  private String a(String paramString, File paramFile)
  {
    try
    {
      Object localObject = new BufferedInputStream(this.f.getAssets().open(paramString));
      paramString = new byte[((BufferedInputStream)localObject).available()];
      ((BufferedInputStream)localObject).read(paramString);
      ((BufferedInputStream)localObject).close();
      if (!paramFile.exists()) {
        paramFile.createNewFile();
      }
      localObject = new BufferedOutputStream(new FileOutputStream(paramFile));
      ((BufferedOutputStream)localObject).write(paramString);
      ((BufferedOutputStream)localObject).flush();
      ((BufferedOutputStream)localObject).close();
      paramString = paramFile.getAbsolutePath();
      return paramString;
    }
    catch (Throwable paramString)
    {
      XposedBridge.log(paramString);
    }
    return null;
  }
  
  private Object b(String paramString)
  {
    return XposedHelpers.newInstance(this.g, new Object[] { this.a.getPackageName(), paramString, this.d, "WechatForwarder (2.1.0) ", this.h });
  }
  
  private void b()
  {
    if (this.c) {
      if (!this.i.contains(".apk")) {
        break label50;
      }
    }
    label50:
    for (Object localObject = this.i;; localObject = this.i + ".apk")
    {
      localObject = new File(c(), (String)localObject);
      if (((File)localObject).exists()) {
        ((File)localObject).delete();
      }
      return;
    }
  }
  
  private File c()
  {
    return this.a.getDir("dex", 0);
  }
  
  private void c(String paramString)
  {
    try
    {
      paramString = new a.a.a.a.b(paramString);
      paramString.b(ak.b);
      paramString.a(c().getAbsolutePath());
      return;
    }
    catch (a.a.a.c.a paramString)
    {
      XposedBridge.log(paramString);
    }
  }
  
  public a a(String paramString)
  {
    return new c(b(paramString));
  }
  
  public void a()
  {
    try
    {
      if (this.c)
      {
        c(this.e.getAbsolutePath());
        this.g = a(this.d + "hooks.Wrapper.HookWrapper", new File(c(), this.i + ".apk").getAbsolutePath(), this.b);
        return;
      }
      this.e = new File(c(), this.i);
      a(this.i, this.e);
      this.g = a(this.d + "hooks.Wrapper.HookWrapper", this.e.getAbsolutePath(), this.b);
      return;
    }
    catch (Throwable localThrowable)
    {
      XposedBridge.log(localThrowable);
    }
  }
  
  public void a(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public void a(ClassLoader paramClassLoader)
  {
    this.b = paramClassLoader;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fkzhang/wechatforwarder/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */