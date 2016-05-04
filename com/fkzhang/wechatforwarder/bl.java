package com.fkzhang.wechatforwarder;

import android.app.Application;
import android.content.pm.ApplicationInfo;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XC_MethodHook.MethodHookParam;
import de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam;

class bl
  extends XC_MethodHook
{
  bl(XposedInit paramXposedInit, String paramString, XC_LoadPackage.LoadPackageParam paramLoadPackageParam) {}
  
  protected void beforeHookedMethod(XC_MethodHook.MethodHookParam paramMethodHookParam)
  {
    paramMethodHookParam = ((Application)paramMethodHookParam.thisObject).getApplicationContext();
    XposedInit.a(this.c, paramMethodHookParam, this.a, this.b.classLoader, this.b.appInfo.uid);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fkzhang/wechatforwarder/bl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */