package android.support.v4.i;

import android.view.View;

class cp
{
  public static void a(View paramView, int paramInt)
  {
    paramView.setAccessibilityLiveRegion(paramInt);
  }
  
  public static boolean a(View paramView)
  {
    return paramView.isLaidOut();
  }
  
  public static boolean b(View paramView)
  {
    return paramView.isAttachedToWindow();
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/i/cp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */