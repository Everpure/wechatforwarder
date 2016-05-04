package android.support.design.widget;

import android.support.v4.i.bu;
import android.view.ViewPropertyAnimator;

class am
  extends ag
{
  private boolean m;
  
  am(cw paramcw, ay paramay)
  {
    super(paramcw, paramay);
  }
  
  private void e(float paramFloat)
  {
    if (this.a != null) {
      this.a.a(-paramFloat);
    }
    if (this.d != null) {
      this.d.b(-paramFloat);
    }
  }
  
  void a(ar paramar, boolean paramBoolean)
  {
    if ((this.m) || (this.k.getVisibility() != 0)) {
      if (paramar != null) {
        paramar.b();
      }
    }
    do
    {
      return;
      if ((bu.A(this.k)) && (!this.k.isInEditMode())) {
        break;
      }
      this.k.a(8, paramBoolean);
    } while (paramar == null);
    paramar.b();
    return;
    this.k.animate().cancel();
    this.k.animate().scaleX(0.0F).scaleY(0.0F).alpha(0.0F).setDuration(200L).setInterpolator(a.c).setListener(new an(this, paramBoolean, paramar));
  }
  
  void b(ar paramar, boolean paramBoolean)
  {
    if ((this.m) || (this.k.getVisibility() != 0))
    {
      if ((!bu.A(this.k)) || (this.k.isInEditMode())) {
        break label127;
      }
      this.k.animate().cancel();
      if (this.k.getVisibility() != 0)
      {
        this.k.setAlpha(0.0F);
        this.k.setScaleY(0.0F);
        this.k.setScaleX(0.0F);
      }
      this.k.animate().scaleX(1.0F).scaleY(1.0F).alpha(1.0F).setDuration(200L).setInterpolator(a.d).setListener(new ao(this, paramBoolean, paramar));
    }
    label127:
    do
    {
      return;
      this.k.a(0, paramBoolean);
      this.k.setAlpha(1.0F);
      this.k.setScaleY(1.0F);
      this.k.setScaleX(1.0F);
    } while (paramar == null);
    paramar.a();
  }
  
  boolean d()
  {
    return true;
  }
  
  void e()
  {
    e(this.k.getRotation());
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/design/widget/am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */