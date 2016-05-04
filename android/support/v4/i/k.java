package android.support.v4.i;

import android.os.Bundle;
import android.view.View;
import android.view.View.AccessibilityDelegate;

class k
{
  public static Object a(m paramm)
  {
    return new l(paramm);
  }
  
  public static Object a(Object paramObject, View paramView)
  {
    return ((View.AccessibilityDelegate)paramObject).getAccessibilityNodeProvider(paramView);
  }
  
  public static boolean a(Object paramObject, View paramView, int paramInt, Bundle paramBundle)
  {
    return ((View.AccessibilityDelegate)paramObject).performAccessibilityAction(paramView, paramInt, paramBundle);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/i/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */