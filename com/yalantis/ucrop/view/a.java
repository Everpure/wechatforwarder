package com.yalantis.ucrop.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.yalantis.ucrop.j;
import java.util.Arrays;

public class a
  extends i
{
  private final RectF g = new RectF();
  private final Matrix h = new Matrix();
  private float i;
  private float j = 10.0F;
  private b k;
  private Runnable l;
  private Runnable m = null;
  private float n;
  private float o;
  private int p = 0;
  private int q = 0;
  private long r = 500L;
  
  public a(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public a(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public a(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  private void b(float paramFloat1, float paramFloat2)
  {
    float f2 = this.g.width();
    float f1 = this.g.height();
    this.o = Math.max(f2 / paramFloat1, f1 / paramFloat2);
    this.n = (this.o * this.j);
    paramFloat1 = (f2 - this.o * paramFloat1) / 2.0F;
    f2 = this.g.left;
    paramFloat2 = (f1 - this.o * paramFloat2) / 2.0F;
    f1 = this.g.top;
    this.c.reset();
    this.c.postScale(this.o, this.o);
    this.c.postTranslate(paramFloat1 + f2, paramFloat2 + f1);
  }
  
  private float[] h()
  {
    float f3 = 0.0F;
    this.h.reset();
    this.h.setRotate(-getCurrentAngle());
    Object localObject2 = Arrays.copyOf(this.a, this.a.length);
    Object localObject1 = com.yalantis.ucrop.a.k.a(this.g);
    this.h.mapPoints((float[])localObject2);
    this.h.mapPoints((float[])localObject1);
    localObject2 = com.yalantis.ucrop.a.k.b((float[])localObject2);
    localObject1 = com.yalantis.ucrop.a.k.b((float[])localObject1);
    float f1 = ((RectF)localObject2).left - ((RectF)localObject1).left;
    float f5 = ((RectF)localObject2).top - ((RectF)localObject1).top;
    float f4 = ((RectF)localObject2).right - ((RectF)localObject1).right;
    float f2 = ((RectF)localObject2).bottom - ((RectF)localObject1).bottom;
    localObject1 = new float[4];
    if (f1 > 0.0F)
    {
      localObject1[0] = f1;
      if (f5 <= 0.0F) {
        break label222;
      }
      f1 = f5;
      label152:
      localObject1[1] = f1;
      if (f4 >= 0.0F) {
        break label227;
      }
    }
    label222:
    label227:
    for (f1 = f4;; f1 = 0.0F)
    {
      localObject1[2] = f1;
      f1 = f3;
      if (f2 < 0.0F) {
        f1 = f2;
      }
      localObject1[3] = f1;
      this.h.reset();
      this.h.setRotate(getCurrentAngle());
      this.h.mapPoints((float[])localObject1);
      return (float[])localObject1;
      f1 = 0.0F;
      break;
      f1 = 0.0F;
      break label152;
    }
  }
  
  private void i()
  {
    int i1 = (int)(this.d / this.i);
    int i2;
    if (i1 > this.e)
    {
      i1 = (int)(this.e * this.i);
      i2 = (this.d - i1) / 2;
      this.g.set(i2, 0.0F, i1 + i2, this.e);
    }
    for (;;)
    {
      if (this.k != null) {
        this.k.a(this.i);
      }
      return;
      i2 = (this.e - i1) / 2;
      this.g.set(0.0F, i2, this.d, i1 + i2);
    }
  }
  
  public Bitmap a()
  {
    Object localObject1 = getViewBitmap();
    if ((localObject1 == null) || (((Bitmap)localObject1).isRecycled())) {}
    RectF localRectF;
    do
    {
      return null;
      b();
      setImageToWrapCropBounds(false);
      localRectF = com.yalantis.ucrop.a.k.b(this.a);
    } while (localRectF.isEmpty());
    float f1 = getCurrentScale();
    float f2 = getCurrentAngle();
    Object localObject2;
    if ((this.p > 0) && (this.q > 0))
    {
      float f3 = this.g.width() / f1;
      float f4 = this.g.height() / f1;
      if ((f3 > this.p) || (f4 > this.q))
      {
        f3 = Math.min(this.p / f3, this.q / f4);
        localObject2 = Bitmap.createScaledBitmap((Bitmap)localObject1, (int)(((Bitmap)localObject1).getWidth() * f3), (int)(((Bitmap)localObject1).getHeight() * f3), false);
        if (localObject1 != localObject2) {
          ((Bitmap)localObject1).recycle();
        }
        f1 /= f3;
        localObject1 = localObject2;
      }
    }
    for (;;)
    {
      localObject2 = localObject1;
      if (f2 != 0.0F)
      {
        this.h.reset();
        this.h.setRotate(f2, ((Bitmap)localObject1).getWidth() / 2, ((Bitmap)localObject1).getHeight() / 2);
        localObject2 = Bitmap.createBitmap((Bitmap)localObject1, 0, 0, ((Bitmap)localObject1).getWidth(), ((Bitmap)localObject1).getHeight(), this.h, true);
        if (localObject1 != localObject2) {
          ((Bitmap)localObject1).recycle();
        }
      }
      int i1 = (int)((this.g.top - localRectF.top) / f1);
      return Bitmap.createBitmap((Bitmap)localObject2, (int)((this.g.left - localRectF.left) / f1), i1, (int)(this.g.width() / f1), (int)(this.g.height() / f1));
    }
  }
  
  public void a(float paramFloat)
  {
    a(paramFloat, this.g.centerX(), this.g.centerY());
  }
  
  public void a(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    if (paramFloat1 >= getMinScale()) {
      c(paramFloat1 / getCurrentScale(), paramFloat2, paramFloat3);
    }
  }
  
  protected void a(float paramFloat1, float paramFloat2, float paramFloat3, long paramLong)
  {
    float f = paramFloat1;
    if (paramFloat1 > getMaxScale()) {
      f = getMaxScale();
    }
    paramFloat1 = getCurrentScale();
    d locald = new d(this, paramLong, paramFloat1, f - paramFloat1, paramFloat2, paramFloat3);
    this.m = locald;
    post(locald);
  }
  
  protected void a(TypedArray paramTypedArray)
  {
    float f1 = Math.abs(paramTypedArray.getFloat(j.ucrop_UCropView_ucrop_aspect_ratio_x, 0.0F));
    float f2 = Math.abs(paramTypedArray.getFloat(j.ucrop_UCropView_ucrop_aspect_ratio_y, 0.0F));
    if ((f1 == 0.0F) || (f2 == 0.0F))
    {
      this.i = 0.0F;
      return;
    }
    this.i = (f1 / f2);
  }
  
  protected boolean a(float[] paramArrayOfFloat)
  {
    this.h.reset();
    this.h.setRotate(-getCurrentAngle());
    paramArrayOfFloat = Arrays.copyOf(paramArrayOfFloat, paramArrayOfFloat.length);
    this.h.mapPoints(paramArrayOfFloat);
    float[] arrayOfFloat = com.yalantis.ucrop.a.k.a(this.g);
    this.h.mapPoints(arrayOfFloat);
    return com.yalantis.ucrop.a.k.b(paramArrayOfFloat).contains(com.yalantis.ucrop.a.k.b(arrayOfFloat));
  }
  
  public void b()
  {
    removeCallbacks(this.l);
    removeCallbacks(this.m);
  }
  
  public void b(float paramFloat)
  {
    b(paramFloat, this.g.centerX(), this.g.centerY());
  }
  
  public void b(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    if (paramFloat1 <= getMaxScale()) {
      c(paramFloat1 / getCurrentScale(), paramFloat2, paramFloat3);
    }
  }
  
  public void c()
  {
    setImageToWrapCropBounds(true);
  }
  
  public void c(float paramFloat)
  {
    d(paramFloat, this.g.centerX(), this.g.centerY());
  }
  
  public void c(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    if ((paramFloat1 > 1.0F) && (getCurrentScale() * paramFloat1 <= getMaxScale())) {
      super.c(paramFloat1, paramFloat2, paramFloat3);
    }
    while ((paramFloat1 >= 1.0F) || (getCurrentScale() * paramFloat1 < getMinScale())) {
      return;
    }
    super.c(paramFloat1, paramFloat2, paramFloat3);
  }
  
  protected void d()
  {
    super.d();
    Drawable localDrawable = getDrawable();
    if (localDrawable == null) {}
    do
    {
      return;
      float f1 = localDrawable.getIntrinsicWidth();
      float f2 = localDrawable.getIntrinsicHeight();
      if (this.i == 0.0F) {
        this.i = (f1 / f2);
      }
      i();
      b(f1, f2);
      setImageMatrix(this.c);
    } while (this.f == null);
    this.f.b(getCurrentScale());
    this.f.a(getCurrentAngle());
  }
  
  protected boolean e()
  {
    return a(this.a);
  }
  
  public b getCropBoundsChangeListener()
  {
    return this.k;
  }
  
  public float getMaxScale()
  {
    return this.n;
  }
  
  public float getMinScale()
  {
    return this.o;
  }
  
  public float getTargetAspectRatio()
  {
    return this.i;
  }
  
  public void setCropBoundsChangeListener(b paramb)
  {
    this.k = paramb;
  }
  
  public void setImageToWrapCropBounds(boolean paramBoolean)
  {
    float f6;
    float f1;
    float f2;
    float f3;
    Object localObject;
    boolean bool;
    if (!e())
    {
      float f4 = this.b[0];
      float f5 = this.b[1];
      f6 = getCurrentScale();
      f1 = this.g.centerX() - f4;
      f2 = this.g.centerY() - f5;
      f3 = 0.0F;
      this.h.reset();
      this.h.setTranslate(f1, f2);
      localObject = Arrays.copyOf(this.a, this.a.length);
      this.h.mapPoints((float[])localObject);
      bool = a((float[])localObject);
      if (!bool) {
        break label180;
      }
      localObject = h();
      f1 = -(localObject[0] + localObject[2]);
      f2 = localObject[1];
      f2 = -(localObject[3] + f2);
      if (!paramBoolean) {
        break label270;
      }
      localObject = new c(this, this.r, f4, f5, f1, f2, f6, f3, bool);
      this.l = ((Runnable)localObject);
      post((Runnable)localObject);
    }
    label180:
    label270:
    do
    {
      return;
      localObject = new RectF(this.g);
      this.h.reset();
      this.h.setRotate(getCurrentAngle());
      this.h.mapRect((RectF)localObject);
      float[] arrayOfFloat = com.yalantis.ucrop.a.k.a(this.a);
      f3 = (float)(Math.max(((RectF)localObject).width() / arrayOfFloat[0], ((RectF)localObject).height() / arrayOfFloat[1]) * 1.01D) * f6 - f6;
      break;
      a(f1, f2);
    } while (bool);
    b(f6 + f3, this.g.centerX(), this.g.centerY());
  }
  
  public void setImageToWrapCropBoundsAnimDuration(long paramLong)
  {
    if (paramLong > 0L)
    {
      this.r = paramLong;
      return;
    }
    throw new IllegalArgumentException("Animation duration cannot be negative value.");
  }
  
  public void setMaxResultImageSizeX(int paramInt)
  {
    this.p = paramInt;
  }
  
  public void setMaxResultImageSizeY(int paramInt)
  {
    this.q = paramInt;
  }
  
  public void setMaxScaleMultiplier(float paramFloat)
  {
    this.j = paramFloat;
  }
  
  public void setTargetAspectRatio(float paramFloat)
  {
    Drawable localDrawable = getDrawable();
    if (localDrawable == null)
    {
      this.i = paramFloat;
      return;
    }
    if (paramFloat == 0.0F) {}
    for (this.i = (localDrawable.getIntrinsicWidth() / localDrawable.getIntrinsicHeight());; this.i = paramFloat)
    {
      i();
      postInvalidate();
      return;
    }
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/yalantis/ucrop/view/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */