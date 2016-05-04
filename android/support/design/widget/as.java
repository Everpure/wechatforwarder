package android.support.design.widget;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.support.v4.d.a.a;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

@TargetApi(21)
class as
  extends am
{
  private final Interpolator m;
  private InsetDrawable n;
  
  as(cw paramcw, ay paramay)
  {
    super(paramcw, paramay);
    if (paramcw.isInEditMode()) {}
    for (paramcw = null;; paramcw = AnimationUtils.loadInterpolator(this.k.getContext(), 17563661))
    {
      this.m = paramcw;
      return;
    }
  }
  
  private Animator a(Animator paramAnimator)
  {
    paramAnimator.setInterpolator(this.m);
    return paramAnimator;
  }
  
  public float a()
  {
    return this.k.getElevation();
  }
  
  public void a(float paramFloat)
  {
    this.k.setElevation(paramFloat);
    if (this.l.b()) {
      g();
    }
  }
  
  void a(int paramInt)
  {
    if ((this.c instanceof RippleDrawable))
    {
      ((RippleDrawable)this.c).setColor(ColorStateList.valueOf(paramInt));
      return;
    }
    super.a(paramInt);
  }
  
  void a(ColorStateList paramColorStateList, PorterDuff.Mode paramMode, int paramInt1, int paramInt2)
  {
    this.b = a.f(k());
    a.a(this.b, paramColorStateList);
    if (paramMode != null) {
      a.a(this.b, paramMode);
    }
    if (paramInt2 > 0) {
      this.d = a(paramInt2, paramColorStateList);
    }
    for (paramColorStateList = new LayerDrawable(new Drawable[] { this.d, this.b });; paramColorStateList = this.b)
    {
      this.c = new RippleDrawable(ColorStateList.valueOf(paramInt1), paramColorStateList, null);
      this.e = this.c;
      this.l.a(this.c);
      return;
      this.d = null;
    }
  }
  
  void a(Rect paramRect)
  {
    if (this.l.b())
    {
      float f1 = this.l.a();
      float f2 = a() + this.g;
      int i = (int)Math.ceil(ax.b(f2, f1, false));
      int j = (int)Math.ceil(ax.a(f2, f1, false));
      paramRect.set(i, j, i, j);
      return;
    }
    paramRect.set(0, 0, 0, 0);
  }
  
  void a(int[] paramArrayOfInt) {}
  
  void b() {}
  
  void b(float paramFloat)
  {
    StateListAnimator localStateListAnimator = new StateListAnimator();
    localStateListAnimator.addState(h, a(ObjectAnimator.ofFloat(this.k, "translationZ", new float[] { paramFloat })));
    localStateListAnimator.addState(i, a(ObjectAnimator.ofFloat(this.k, "translationZ", new float[] { paramFloat })));
    localStateListAnimator.addState(j, a(ObjectAnimator.ofFloat(this.k, "translationZ", new float[] { 0.0F })));
    this.k.setStateListAnimator(localStateListAnimator);
    if (this.l.b()) {
      g();
    }
  }
  
  void b(Rect paramRect)
  {
    if (this.l.b())
    {
      this.n = new InsetDrawable(this.c, paramRect.left, paramRect.top, paramRect.right, paramRect.bottom);
      this.l.a(this.n);
      return;
    }
    this.l.a(this.c);
  }
  
  void c()
  {
    g();
  }
  
  boolean d()
  {
    return false;
  }
  
  o j()
  {
    return new p();
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/design/widget/as.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */