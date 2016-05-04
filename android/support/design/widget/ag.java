package android.support.design.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.support.design.b;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

class ag
  extends ap
{
  ax a;
  private int m;
  private bq n;
  private boolean o;
  
  ag(cw paramcw, ay paramay)
  {
    super(paramcw, paramay);
    this.m = paramcw.getResources().getInteger(17694720);
    this.n = new bq();
    this.n.a(paramcw);
    this.n.a(h, a(new ak(this, null)));
    this.n.a(i, a(new ak(this, null)));
    this.n.a(j, a(new al(this, null)));
  }
  
  private Animation a(Animation paramAnimation)
  {
    paramAnimation.setInterpolator(a.b);
    paramAnimation.setDuration(this.m);
    return paramAnimation;
  }
  
  private static ColorStateList b(int paramInt)
  {
    return new ColorStateList(new int[][] { i, h, new int[0] }, new int[] { paramInt, paramInt, 0 });
  }
  
  float a()
  {
    return this.f;
  }
  
  void a(float paramFloat)
  {
    if (this.a != null)
    {
      this.a.a(paramFloat, this.g + paramFloat);
      g();
    }
  }
  
  void a(int paramInt)
  {
    if (this.c != null) {
      android.support.v4.d.a.a.a(this.c, b(paramInt));
    }
  }
  
  void a(ColorStateList paramColorStateList)
  {
    if (this.b != null) {
      android.support.v4.d.a.a.a(this.b, paramColorStateList);
    }
    if (this.d != null) {
      this.d.a(paramColorStateList);
    }
  }
  
  void a(ColorStateList paramColorStateList, PorterDuff.Mode paramMode, int paramInt1, int paramInt2)
  {
    this.b = android.support.v4.d.a.a.f(k());
    android.support.v4.d.a.a.a(this.b, paramColorStateList);
    if (paramMode != null) {
      android.support.v4.d.a.a.a(this.b, paramMode);
    }
    this.c = android.support.v4.d.a.a.f(k());
    android.support.v4.d.a.a.a(this.c, b(paramInt1));
    if (paramInt2 > 0)
    {
      this.d = a(paramInt2, paramColorStateList);
      paramColorStateList = new Drawable[3];
      paramColorStateList[0] = this.d;
      paramColorStateList[1] = this.b;
      paramColorStateList[2] = this.c;
    }
    for (;;)
    {
      this.e = new LayerDrawable(paramColorStateList);
      this.a = new ax(this.k.getResources(), this.e, this.l.a(), this.f, this.f + this.g);
      this.a.a(false);
      this.l.a(this.a);
      return;
      this.d = null;
      paramColorStateList = new Drawable[2];
      paramColorStateList[0] = this.b;
      paramColorStateList[1] = this.c;
    }
  }
  
  void a(PorterDuff.Mode paramMode)
  {
    if (this.b != null) {
      android.support.v4.d.a.a.a(this.b, paramMode);
    }
  }
  
  void a(Rect paramRect)
  {
    this.a.getPadding(paramRect);
  }
  
  void a(ar paramar, boolean paramBoolean)
  {
    if ((this.o) || (this.k.getVisibility() != 0))
    {
      if (paramar != null) {
        paramar.b();
      }
      return;
    }
    Animation localAnimation = AnimationUtils.loadAnimation(this.k.getContext(), b.design_fab_out);
    localAnimation.setInterpolator(a.c);
    localAnimation.setDuration(200L);
    localAnimation.setAnimationListener(new ah(this, paramBoolean, paramar));
    this.k.startAnimation(localAnimation);
  }
  
  void a(int[] paramArrayOfInt)
  {
    this.n.a(paramArrayOfInt);
  }
  
  void b()
  {
    this.n.b();
  }
  
  void b(float paramFloat)
  {
    if (this.a != null)
    {
      this.a.c(this.f + paramFloat);
      g();
    }
  }
  
  void b(ar paramar, boolean paramBoolean)
  {
    if ((this.k.getVisibility() != 0) || (this.o))
    {
      this.k.clearAnimation();
      this.k.a(0, paramBoolean);
      localAnimation = AnimationUtils.loadAnimation(this.k.getContext(), b.design_fab_in);
      localAnimation.setDuration(200L);
      localAnimation.setInterpolator(a.d);
      localAnimation.setAnimationListener(new ai(this, paramar));
      this.k.startAnimation(localAnimation);
    }
    while (paramar == null)
    {
      Animation localAnimation;
      return;
    }
    paramar.a();
  }
  
  void c() {}
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/design/widget/ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */