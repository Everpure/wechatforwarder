package com.fkzhang.wechatforwarder;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.SparseArray;
import com.fkzhang.wechatforwarder.b.a;
import com.fkzhang.wechatforwarder.b.b;
import com.fkzhang.wechatforwarder.b.d;
import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam;

public class XposedInit
  implements IXposedHookLoadPackage
{
  private SparseArray a;
  private b b;
  private Context c;
  
  private a a(b paramb, String paramString1, String paramString2, int paramInt)
  {
    if (this.a == null) {
      this.a = new SparseArray();
    }
    if (this.a.indexOfKey(paramInt) != -1) {
      return (a)this.a.get(paramInt);
    }
    if ((TextUtils.isEmpty(paramString2)) && (paramString1.equals("com.tencent.mm4"))) {
      this.a.put(paramInt, paramb.a("6.3.5"));
    }
    if (paramString2.equals("9.0")) {
      this.a.put(paramInt, paramb.a("6.3.9"));
    }
    for (;;)
    {
      return (a)this.a.get(paramInt);
      if (!d.a(paramString2)) {
        break;
      }
      this.a.put(paramInt, paramb.a(paramString2));
    }
    XposedBridge.log("WechatForwarder (2.1.0)  (2.1.0): wechat version " + paramString2 + " not supported!");
    return null;
  }
  
  private void a(Context paramContext, String paramString, ClassLoader paramClassLoader, int paramInt)
  {
    try
    {
      String str = paramContext.getPackageManager().getPackageInfo(paramString, 0).versionName;
      ClassLoader localClassLoader = getClass().getClassLoader();
      if (this.b == null) {
        this.b = new b(this.c, paramContext, localClassLoader, "com.fkzhang.wechatforwarder", true);
      }
      this.b.a(localClassLoader);
      this.b.a(paramContext);
      this.b.a();
      paramContext = a(this.b, paramString, str, paramInt);
      if (paramContext != null) {
        paramContext.a(paramClassLoader);
      }
      return;
    }
    catch (Exception paramContext)
    {
      XposedBridge.log(paramContext);
    }
  }
  
  public void handleLoadPackage(XC_LoadPackage.LoadPackageParam paramLoadPackageParam)
  {
    String str = paramLoadPackageParam.packageName;
    if ((!str.contains("com.tencen")) || (!str.contains("mm"))) {
      return;
    }
    try
    {
      this.c = ((Context)XposedHelpers.callMethod(XposedHelpers.callStaticMethod(XposedHelpers.findClass("android.app.ActivityThread", null), "currentActivityThread", new Object[0]), "getSystemContext", new Object[0]));
      XposedHelpers.findAndHookMethod(str + ".app.MMApplication", paramLoadPackageParam.classLoader, "onCreate", new Object[] { new bl(this, str, paramLoadPackageParam) });
      return;
    }
    catch (Exception paramLoadPackageParam)
    {
      XposedBridge.log(paramLoadPackageParam);
    }
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fkzhang/wechatforwarder/XposedInit.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */