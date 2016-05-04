package android.support.v4.i;

import android.os.Build.VERSION;
import android.view.KeyEvent;

public final class v
{
  static final z a = new w();
  
  static
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      a = new y();
      return;
    }
  }
  
  public static boolean a(KeyEvent paramKeyEvent, int paramInt)
  {
    return a.a(paramKeyEvent.getMetaState(), paramInt);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/i/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */