package android.support.v4.i;

import android.os.Build.VERSION;
import android.view.LayoutInflater;

public final class ab
{
  static final ac a = new ad();
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 21)
    {
      a = new af();
      return;
    }
    if (i >= 11)
    {
      a = new ae();
      return;
    }
  }
  
  public static al a(LayoutInflater paramLayoutInflater)
  {
    return a.a(paramLayoutInflater);
  }
  
  public static void a(LayoutInflater paramLayoutInflater, al paramal)
  {
    a.a(paramLayoutInflater, paramal);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/i/ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */