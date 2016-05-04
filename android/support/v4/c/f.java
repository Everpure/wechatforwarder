package android.support.v4.c;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Build.VERSION;

public final class f
{
  private static final g a = new h();
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 15)
    {
      a = new j();
      return;
    }
    if (i >= 11)
    {
      a = new i();
      return;
    }
  }
  
  public static Intent a(ComponentName paramComponentName)
  {
    return a.a(paramComponentName);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/c/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */