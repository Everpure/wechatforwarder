package android.support.v4.i;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

final class du
  extends AnimatorListenerAdapter
{
  du(dz paramdz, View paramView) {}
  
  public void onAnimationCancel(Animator paramAnimator)
  {
    this.a.c(this.b);
  }
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    this.a.b(this.b);
  }
  
  public void onAnimationStart(Animator paramAnimator)
  {
    this.a.a(this.b);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/i/du.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */