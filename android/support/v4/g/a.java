package android.support.v4.g;

import android.os.Build.VERSION;
import java.util.Locale;

public final class a
{
  private static final b a = new c();
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 21)
    {
      a = new e();
      return;
    }
    if (i >= 14)
    {
      a = new d();
      return;
    }
  }
  
  public static String a(Locale paramLocale)
  {
    return a.a(paramLocale);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/g/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */