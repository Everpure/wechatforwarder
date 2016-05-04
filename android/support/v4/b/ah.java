package android.support.v4.b;

import android.view.View;
import android.view.animation.Animation;

class ah
  extends ai
{
  ah(af paramaf, View paramView, Animation paramAnimation, t paramt)
  {
    super(paramView, paramAnimation);
  }
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    super.onAnimationEnd(paramAnimation);
    if (this.a.c != null)
    {
      this.a.c = null;
      this.b.a(this.a, this.a.d, 0, 0, false);
    }
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/b/ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */