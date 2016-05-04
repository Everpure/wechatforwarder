package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

class fk
  extends Drawable
{
  private float a;
  private final Paint b;
  private final RectF c;
  private final Rect d;
  private float e;
  private boolean f = false;
  private boolean g = true;
  private PorterDuffColorFilter h;
  private ColorStateList i;
  private PorterDuff.Mode j;
  
  public fk(int paramInt, float paramFloat)
  {
    this.a = paramFloat;
    this.b = new Paint(5);
    this.b.setColor(paramInt);
    this.c = new RectF();
    this.d = new Rect();
  }
  
  private PorterDuffColorFilter a(ColorStateList paramColorStateList, PorterDuff.Mode paramMode)
  {
    if ((paramColorStateList == null) || (paramMode == null)) {
      return null;
    }
    return new PorterDuffColorFilter(paramColorStateList.getColorForState(getState(), 0), paramMode);
  }
  
  private void a(Rect paramRect)
  {
    Rect localRect = paramRect;
    if (paramRect == null) {
      localRect = getBounds();
    }
    this.c.set(localRect.left, localRect.top, localRect.right, localRect.bottom);
    this.d.set(localRect);
    if (this.f)
    {
      float f1 = fl.a(this.e, this.a, this.g);
      float f2 = fl.b(this.e, this.a, this.g);
      this.d.inset((int)Math.ceil(f2), (int)Math.ceil(f1));
      this.c.set(this.d);
    }
  }
  
  float a()
  {
    return this.e;
  }
  
  void a(float paramFloat)
  {
    if (paramFloat == this.a) {
      return;
    }
    this.a = paramFloat;
    a(null);
    invalidateSelf();
  }
  
  void a(float paramFloat, boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((paramFloat == this.e) && (this.f == paramBoolean1) && (this.g == paramBoolean2)) {
      return;
    }
    this.e = paramFloat;
    this.f = paramBoolean1;
    this.g = paramBoolean2;
    a(null);
    invalidateSelf();
  }
  
  public void a(int paramInt)
  {
    this.b.setColor(paramInt);
    invalidateSelf();
  }
  
  public float b()
  {
    return this.a;
  }
  
  public void draw(Canvas paramCanvas)
  {
    Paint localPaint = this.b;
    if ((this.h != null) && (localPaint.getColorFilter() == null)) {
      localPaint.setColorFilter(this.h);
    }
    for (int k = 1;; k = 0)
    {
      paramCanvas.drawRoundRect(this.c, this.a, this.a, localPaint);
      if (k != 0) {
        localPaint.setColorFilter(null);
      }
      return;
    }
  }
  
  public int getOpacity()
  {
    return -3;
  }
  
  public void getOutline(Outline paramOutline)
  {
    paramOutline.setRoundRect(this.d, this.a);
  }
  
  public boolean isStateful()
  {
    return ((this.i != null) && (this.i.isStateful())) || (super.isStateful());
  }
  
  protected void onBoundsChange(Rect paramRect)
  {
    super.onBoundsChange(paramRect);
    a(paramRect);
  }
  
  protected boolean onStateChange(int[] paramArrayOfInt)
  {
    if ((this.i != null) && (this.j != null))
    {
      this.h = a(this.i, this.j);
      return true;
    }
    return false;
  }
  
  public void setAlpha(int paramInt)
  {
    this.b.setAlpha(paramInt);
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    this.b.setColorFilter(paramColorFilter);
  }
  
  public void setTintList(ColorStateList paramColorStateList)
  {
    this.i = paramColorStateList;
    this.h = a(this.i, this.j);
    invalidateSelf();
  }
  
  public void setTintMode(PorterDuff.Mode paramMode)
  {
    this.j = paramMode;
    this.h = a(this.i, this.j);
    invalidateSelf();
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/fk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */