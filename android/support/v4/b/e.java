package android.support.v4.b;

import android.content.Context;
import android.os.Build.VERSION;

public final class e
{
  private static final h a = new h(null);
  
  static
  {
    if (Build.VERSION.SDK_INT >= 23)
    {
      a = new g(null);
      return;
    }
  }
  
  public static int a(Context paramContext, String paramString1, String paramString2)
  {
    return a.a(paramContext, paramString1, paramString2);
  }
  
  public static String a(String paramString)
  {
    return a.a(paramString);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/b/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */