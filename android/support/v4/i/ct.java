package android.support.v4.i;

import android.os.Build.VERSION;
import android.view.ViewConfiguration;

public final class ct
{
  static final cy a = new cu();
  
  static
  {
    if (Build.VERSION.SDK_INT >= 14)
    {
      a = new cx();
      return;
    }
    if (Build.VERSION.SDK_INT >= 11)
    {
      a = new cw();
      return;
    }
    if (Build.VERSION.SDK_INT >= 8)
    {
      a = new cv();
      return;
    }
  }
  
  public static int a(ViewConfiguration paramViewConfiguration)
  {
    return a.a(paramViewConfiguration);
  }
  
  public static boolean b(ViewConfiguration paramViewConfiguration)
  {
    return a.b(paramViewConfiguration);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/i/ct.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */