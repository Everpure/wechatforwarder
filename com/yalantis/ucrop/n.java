package com.yalantis.ucrop;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.yalantis.ucrop.view.UCropView;

class n
  implements Animation.AnimationListener
{
  n(m paramm) {}
  
  public void onAnimationEnd(Animation paramAnimation) {}
  
  public void onAnimationRepeat(Animation paramAnimation) {}
  
  public void onAnimationStart(Animation paramAnimation)
  {
    UCropActivity.a(this.a.a).setVisibility(0);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/yalantis/ucrop/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */