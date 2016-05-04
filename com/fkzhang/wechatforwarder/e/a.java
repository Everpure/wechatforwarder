package com.fkzhang.wechatforwarder.e;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.text.Html;
import android.text.TextUtils;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;
import com.fkzhang.wechatforwarder.b.d;
import java.security.MessageDigest;
import java.util.List;

public class a
{
  public static String a()
  {
    String str1 = Build.MANUFACTURER;
    String str2 = Build.MODEL;
    if (str2.startsWith(str1)) {
      return a(str2);
    }
    return a(str1) + " " + str2;
  }
  
  public static String a(Context paramContext)
  {
    try
    {
      paramContext = a(paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 64).signatures[0].toByteArray(), "MD5");
      return paramContext;
    }
    catch (Exception paramContext) {}
    return null;
  }
  
  public static String a(String paramString)
  {
    String str;
    if ((paramString == null) || (paramString.length() == 0)) {
      str = "";
    }
    char c;
    do
    {
      return str;
      c = paramString.charAt(0);
      str = paramString;
    } while (Character.isUpperCase(c));
    return Character.toUpperCase(c) + paramString.substring(1);
  }
  
  protected static String a(byte[] paramArrayOfByte, String paramString)
  {
    paramString = MessageDigest.getInstance(paramString);
    paramString.update(paramArrayOfByte);
    byte[] arrayOfByte = paramString.digest();
    paramString = "";
    int i = 0;
    while (i < arrayOfByte.length)
    {
      paramArrayOfByte = paramString;
      if (i != 0) {
        paramArrayOfByte = paramString + ":";
      }
      String str = Integer.toHexString(arrayOfByte[i] & 0xFF);
      paramString = paramArrayOfByte;
      if (str.length() == 1) {
        paramString = paramArrayOfByte + "0";
      }
      paramString = paramString + str;
      i += 1;
    }
    return paramString;
  }
  
  public static void a(Activity paramActivity, Uri paramUri)
  {
    paramUri = new Intent("android.intent.action.VIEW", paramUri);
    try
    {
      paramActivity.startActivity(paramUri);
      return;
    }
    catch (Throwable paramActivity)
    {
      Log.d("WechatContactsManager", "startBrowserIntent", paramActivity);
    }
  }
  
  public static void a(Activity paramActivity, String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return;
    }
    Toast.makeText(paramActivity, paramString, 0).show();
  }
  
  public static void a(Activity paramActivity, String paramString, int paramInt)
  {
    if (TextUtils.isEmpty(paramString)) {
      return;
    }
    Toast.makeText(paramActivity, paramString, paramInt).show();
  }
  
  public static void a(Activity paramActivity, boolean paramBoolean)
  {
    TextView localTextView = (TextView)paramActivity.findViewById(2131492996);
    localTextView.setVisibility(8);
    if ((!paramBoolean) && (!a(paramActivity, "de.robv.android.xposed.installer")) && (!a(paramActivity, "pro.burgerz.wsm.manager")))
    {
      localTextView.setVisibility(0);
      localTextView.setText(paramActivity.getString(2131099790));
      localTextView.setOnClickListener(new b(paramActivity));
    }
    localTextView = (TextView)paramActivity.findViewById(2131492997);
    localTextView.setVisibility(8);
    try
    {
      String str = paramActivity.getPackageManager().getPackageInfo("com.tencent.mm", 0).versionName;
      if ((!TextUtils.isEmpty(str)) && (!d.a(str)))
      {
        localTextView.setVisibility(0);
        localTextView.setText(paramActivity.getString(2131099776) + " (" + str + ")");
      }
      ((TextView)paramActivity.findViewById(2131492998)).setText(Html.fromHtml(paramActivity.getString(2131099760)));
      return;
    }
    catch (Throwable localThrowable)
    {
      for (;;) {}
    }
  }
  
  public static boolean a(Context paramContext, String paramString)
  {
    paramContext = paramContext.getPackageManager();
    paramString = paramContext.getLaunchIntentForPackage(paramString);
    if (paramString == null) {}
    while (paramContext.queryIntentActivities(paramString, 65536).size() <= 0) {
      return false;
    }
    return true;
  }
  
  public static String b(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {}
    while (paramString.length() <= 20) {
      return paramString;
    }
    return paramString.substring(0, 20) + "...";
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fkzhang/wechatforwarder/e/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */