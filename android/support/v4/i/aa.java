package android.support.v4.i;

import android.view.KeyEvent;

class aa
{
  public static int a(int paramInt)
  {
    return KeyEvent.normalizeMetaState(paramInt);
  }
  
  public static boolean a(int paramInt1, int paramInt2)
  {
    return KeyEvent.metaStateHasModifiers(paramInt1, paramInt2);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/i/aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */