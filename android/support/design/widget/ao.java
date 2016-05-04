package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

class ao
  extends AnimatorListenerAdapter
{
  ao(am paramam, boolean paramBoolean, ar paramar) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    if (this.b != null) {
      this.b.a();
    }
  }
  
  public void onAnimationStart(Animator paramAnimator)
  {
    this.c.k.a(0, this.a);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/design/widget/ao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */