package android.support.v4.c;

import android.content.ComponentName;
import android.content.Intent;

class h
  implements g
{
  public Intent a(ComponentName paramComponentName)
  {
    Intent localIntent = new Intent("android.intent.action.MAIN");
    localIntent.setComponent(paramComponentName);
    localIntent.addCategory("android.intent.category.LAUNCHER");
    return localIntent;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/c/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */