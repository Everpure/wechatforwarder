package android.support.v4.i;

import android.os.Build.VERSION;
import android.view.ViewGroup.MarginLayoutParams;

public final class am
{
  static final an a = new ao();
  
  static
  {
    if (Build.VERSION.SDK_INT >= 17)
    {
      a = new ap();
      return;
    }
  }
  
  public static int a(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    return a.a(paramMarginLayoutParams);
  }
  
  public static int b(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    return a.b(paramMarginLayoutParams);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/i/am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */