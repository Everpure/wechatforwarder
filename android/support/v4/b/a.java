package android.support.v4.b;

import android.app.Activity;
import android.os.Build.VERSION;

public class a
  extends android.support.v4.c.a
{
  public static void a(Activity paramActivity)
  {
    if (Build.VERSION.SDK_INT >= 16)
    {
      d.a(paramActivity);
      return;
    }
    paramActivity.finish();
  }
  
  public static void b(Activity paramActivity)
  {
    if (Build.VERSION.SDK_INT >= 21)
    {
      b.a(paramActivity);
      return;
    }
    paramActivity.finish();
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */