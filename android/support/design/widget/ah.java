package android.support.design.widget;

import android.view.animation.Animation;

class ah
  extends b
{
  ah(ag paramag, boolean paramBoolean, ar paramar) {}
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    ag.a(this.c, false);
    this.c.k.a(8, this.a);
    if (this.b != null) {
      this.b.b();
    }
  }
  
  public void onAnimationStart(Animation paramAnimation)
  {
    ag.a(this.c, true);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/design/widget/ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */