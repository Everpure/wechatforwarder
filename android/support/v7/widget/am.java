package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build.VERSION;
import android.support.v4.i.bu;
import android.support.v7.b.l;
import android.util.AttributeSet;
import android.view.View;

class am
{
  private final View a;
  private final ar b;
  private gp c;
  private gp d;
  private gp e;
  
  am(View paramView, ar paramar)
  {
    this.a = paramView;
    this.b = paramar;
  }
  
  private boolean b(Drawable paramDrawable)
  {
    return (Build.VERSION.SDK_INT == 21) && ((paramDrawable instanceof GradientDrawable));
  }
  
  private void c(Drawable paramDrawable)
  {
    if (this.e == null) {
      this.e = new gp();
    }
    gp localgp = this.e;
    localgp.a();
    Object localObject = bu.x(this.a);
    if (localObject != null)
    {
      localgp.d = true;
      localgp.a = ((ColorStateList)localObject);
    }
    localObject = bu.y(this.a);
    if (localObject != null)
    {
      localgp.c = true;
      localgp.b = ((PorterDuff.Mode)localObject);
    }
    if ((localgp.d) || (localgp.c)) {
      ar.a(paramDrawable, localgp, this.a.getDrawableState());
    }
  }
  
  ColorStateList a()
  {
    if (this.d != null) {
      return this.d.a;
    }
    return null;
  }
  
  void a(int paramInt)
  {
    if (this.b != null) {}
    for (ColorStateList localColorStateList = this.b.b(this.a.getContext(), paramInt);; localColorStateList = null)
    {
      b(localColorStateList);
      return;
    }
  }
  
  void a(ColorStateList paramColorStateList)
  {
    if (this.d == null) {
      this.d = new gp();
    }
    this.d.a = paramColorStateList;
    this.d.d = true;
    c();
  }
  
  void a(PorterDuff.Mode paramMode)
  {
    if (this.d == null) {
      this.d = new gp();
    }
    this.d.b = paramMode;
    this.d.c = true;
    c();
  }
  
  void a(Drawable paramDrawable)
  {
    b(null);
  }
  
  void a(AttributeSet paramAttributeSet, int paramInt)
  {
    paramAttributeSet = this.a.getContext().obtainStyledAttributes(paramAttributeSet, l.ViewBackgroundHelper, paramInt, 0);
    try
    {
      if (paramAttributeSet.hasValue(l.ViewBackgroundHelper_android_background))
      {
        ColorStateList localColorStateList = this.b.b(this.a.getContext(), paramAttributeSet.getResourceId(l.ViewBackgroundHelper_android_background, -1));
        if (localColorStateList != null) {
          b(localColorStateList);
        }
      }
      if (paramAttributeSet.hasValue(l.ViewBackgroundHelper_backgroundTint)) {
        bu.a(this.a, paramAttributeSet.getColorStateList(l.ViewBackgroundHelper_backgroundTint));
      }
      if (paramAttributeSet.hasValue(l.ViewBackgroundHelper_backgroundTintMode)) {
        bu.a(this.a, cs.a(paramAttributeSet.getInt(l.ViewBackgroundHelper_backgroundTintMode, -1), null));
      }
      return;
    }
    finally
    {
      paramAttributeSet.recycle();
    }
  }
  
  PorterDuff.Mode b()
  {
    if (this.d != null) {
      return this.d.b;
    }
    return null;
  }
  
  void b(ColorStateList paramColorStateList)
  {
    if (paramColorStateList != null)
    {
      if (this.c == null) {
        this.c = new gp();
      }
      this.c.a = paramColorStateList;
      this.c.d = true;
    }
    for (;;)
    {
      c();
      return;
      this.c = null;
    }
  }
  
  void c()
  {
    Drawable localDrawable = this.a.getBackground();
    if (localDrawable != null)
    {
      if (this.d == null) {
        break label35;
      }
      ar.a(localDrawable, this.d, this.a.getDrawableState());
    }
    label35:
    do
    {
      return;
      if (this.c != null)
      {
        ar.a(localDrawable, this.c, this.a.getDrawableState());
        return;
      }
    } while (!b(localDrawable));
    c(localDrawable);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */