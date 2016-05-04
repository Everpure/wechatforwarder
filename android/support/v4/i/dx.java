package android.support.v4.i;

import android.view.View;
import android.view.ViewPropertyAnimator;

class dx
{
  public static void a(View paramView, eb parameb)
  {
    dy localdy = null;
    if (parameb != null) {
      localdy = new dy(parameb, paramView);
    }
    paramView.animate().setUpdateListener(localdy);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/i/dx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */