package android.support.design.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.design.d;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;

abstract class ap
{
  static final int[] h = { 16842919, 16842910 };
  static final int[] i = { 16842908, 16842910 };
  static final int[] j = new int[0];
  private final Rect a = new Rect();
  Drawable b;
  Drawable c;
  o d;
  Drawable e;
  float f;
  float g;
  final cw k;
  final ay l;
  private ViewTreeObserver.OnPreDrawListener m;
  
  ap(cw paramcw, ay paramay)
  {
    this.k = paramcw;
    this.l = paramay;
  }
  
  private void l()
  {
    if (this.m == null) {
      this.m = new aq(this);
    }
  }
  
  abstract float a();
  
  o a(int paramInt, ColorStateList paramColorStateList)
  {
    Resources localResources = this.k.getResources();
    o localo = j();
    localo.a(localResources.getColor(d.design_fab_stroke_top_outer_color), localResources.getColor(d.design_fab_stroke_top_inner_color), localResources.getColor(d.design_fab_stroke_end_inner_color), localResources.getColor(d.design_fab_stroke_end_outer_color));
    localo.a(paramInt);
    localo.a(paramColorStateList);
    return localo;
  }
  
  abstract void a(float paramFloat);
  
  abstract void a(int paramInt);
  
  abstract void a(ColorStateList paramColorStateList);
  
  abstract void a(ColorStateList paramColorStateList, PorterDuff.Mode paramMode, int paramInt1, int paramInt2);
  
  abstract void a(PorterDuff.Mode paramMode);
  
  abstract void a(Rect paramRect);
  
  abstract void a(ar paramar, boolean paramBoolean);
  
  abstract void a(int[] paramArrayOfInt);
  
  abstract void b();
  
  abstract void b(float paramFloat);
  
  void b(Rect paramRect) {}
  
  abstract void b(ar paramar, boolean paramBoolean);
  
  abstract void c();
  
  final void c(float paramFloat)
  {
    if (this.f != paramFloat)
    {
      this.f = paramFloat;
      a(paramFloat);
    }
  }
  
  final void d(float paramFloat)
  {
    if (this.g != paramFloat)
    {
      this.g = paramFloat;
      b(paramFloat);
    }
  }
  
  boolean d()
  {
    return false;
  }
  
  void e() {}
  
  final Drawable f()
  {
    return this.e;
  }
  
  final void g()
  {
    Rect localRect = this.a;
    a(localRect);
    b(localRect);
    this.l.a(localRect.left, localRect.top, localRect.right, localRect.bottom);
  }
  
  void h()
  {
    if (d())
    {
      l();
      this.k.getViewTreeObserver().addOnPreDrawListener(this.m);
    }
  }
  
  void i()
  {
    if (this.m != null)
    {
      this.k.getViewTreeObserver().removeOnPreDrawListener(this.m);
      this.m = null;
    }
  }
  
  o j()
  {
    return new o();
  }
  
  GradientDrawable k()
  {
    GradientDrawable localGradientDrawable = new GradientDrawable();
    localGradientDrawable.setShape(1);
    localGradientDrawable.setColor(-1);
    return localGradientDrawable;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/design/widget/ap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */