package android.support.design.widget;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

class br
  implements Animation.AnimationListener
{
  br(bq parambq) {}
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    if (bq.a(this.a) == paramAnimation) {
      bq.a(this.a, null);
    }
  }
  
  public void onAnimationRepeat(Animation paramAnimation) {}
  
  public void onAnimationStart(Animation paramAnimation) {}
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/design/widget/br.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */