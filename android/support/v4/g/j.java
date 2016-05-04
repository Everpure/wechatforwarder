package android.support.v4.g;

import java.util.Locale;

class j
{
  private static int b(Locale paramLocale)
  {
    switch (Character.getDirectionality(paramLocale.getDisplayName(paramLocale).charAt(0)))
    {
    default: 
      return 0;
    }
    return 1;
  }
  
  public int a(Locale paramLocale)
  {
    if ((paramLocale != null) && (!paramLocale.equals(h.a)))
    {
      String str = a.a(paramLocale);
      if (str == null) {
        return b(paramLocale);
      }
      if ((str.equalsIgnoreCase(h.a())) || (str.equalsIgnoreCase(h.b()))) {
        return 1;
      }
    }
    return 0;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/g/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */