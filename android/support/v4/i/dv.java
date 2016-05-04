package android.support.v4.i;

import android.view.View;
import android.view.ViewPropertyAnimator;

class dv
{
  public static void a(View paramView, dz paramdz)
  {
    if (paramdz != null)
    {
      paramView.animate().setListener(new dw(paramdz, paramView));
      return;
    }
    paramView.animate().setListener(null);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/i/dv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */