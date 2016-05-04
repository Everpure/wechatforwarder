package android.support.v4.i;

import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.WindowInsets;

final class cr
  implements View.OnApplyWindowInsetsListener
{
  cr(bm parambm) {}
  
  public WindowInsets onApplyWindowInsets(View paramView, WindowInsets paramWindowInsets)
  {
    paramWindowInsets = new ed(paramWindowInsets);
    return ((ed)this.a.a(paramView, paramWindowInsets)).f();
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/i/cr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */