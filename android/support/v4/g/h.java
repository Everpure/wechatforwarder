package android.support.v4.g;

import android.os.Build.VERSION;
import java.util.Locale;

public final class h
{
  public static final Locale a;
  private static final j b;
  private static String c;
  private static String d;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 17) {}
    for (b = new k(null);; b = new j(null))
    {
      a = new Locale("", "");
      c = "Arab";
      d = "Hebr";
      return;
    }
  }
  
  public static int a(Locale paramLocale)
  {
    return b.a(paramLocale);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/g/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */