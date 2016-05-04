package com.yalantis.ucrop;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.yalantis.ucrop.view.k;

class m
  implements k
{
  m(UCropActivity paramUCropActivity) {}
  
  public void a()
  {
    View localView = this.a.findViewById(f.ucrop);
    Animation localAnimation = AnimationUtils.loadAnimation(this.a.getApplicationContext(), b.ucrop_fade_in);
    localAnimation.setAnimationListener(new n(this));
    localView.startAnimation(localAnimation);
  }
  
  public void a(float paramFloat)
  {
    UCropActivity.a(this.a, paramFloat);
  }
  
  public void a(Exception paramException)
  {
    UCropActivity.a(this.a, paramException);
    this.a.finish();
  }
  
  public void b(float paramFloat)
  {
    UCropActivity.b(this.a, paramFloat);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/yalantis/ucrop/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */