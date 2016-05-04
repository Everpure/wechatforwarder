package android.support.v4.i;

import android.graphics.Rect;
import android.os.Build.VERSION;

public final class q
{
  static final r a = new s();
  
  static
  {
    if (Build.VERSION.SDK_INT >= 17)
    {
      a = new t();
      return;
    }
  }
  
  public static int a(int paramInt1, int paramInt2)
  {
    return a.a(paramInt1, paramInt2);
  }
  
  public static void a(int paramInt1, int paramInt2, int paramInt3, Rect paramRect1, Rect paramRect2, int paramInt4)
  {
    a.a(paramInt1, paramInt2, paramInt3, paramRect1, paramRect2, paramInt4);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/i/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */