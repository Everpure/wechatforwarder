package com.rarepebble.colorpicker;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;

public class HueSatView
  extends n
  implements f
{
  private final Paint a;
  private final Paint b;
  private final Path c;
  private final Path d;
  private final Rect e = new Rect();
  private int f;
  private int g;
  private Bitmap h;
  private final PointF i = new PointF();
  private e j = new e(0);
  
  public HueSatView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public HueSatView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.a = l.a(paramContext);
    this.b = l.a(paramContext);
    this.b.setColor(-16777216);
    this.c = l.c(paramContext);
    this.d = new Path();
    this.h = a(1);
  }
  
  private static float a(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    double d1 = paramFloat3 - 1.0F;
    double d2 = (d1 - paramFloat1) / d1;
    return (float)(Math.atan2((d1 - paramFloat2) / d1, d2) * 360.0D / 1.5707963267948966D);
  }
  
  private static Bitmap a(int paramInt)
  {
    int[] arrayOfInt = new int[paramInt * paramInt];
    float[] arrayOfFloat = new float[3];
    float[] tmp14_12 = arrayOfFloat;
    tmp14_12[0] = 0.0F;
    float[] tmp18_14 = tmp14_12;
    tmp18_14[1] = 0.0F;
    float[] tmp22_18 = tmp18_14;
    tmp22_18[2] = 1.0F;
    tmp22_18;
    int k = 0;
    while (k < paramInt)
    {
      int m = 0;
      while (m < paramInt)
      {
        float f1 = b(m, k, paramInt);
        int n = (int)(Math.max(0.0F, Math.min(1.0F, (1.0F - f1) * paramInt)) * 255.0F);
        arrayOfFloat[0] = a(m, k, paramInt);
        arrayOfFloat[1] = f1;
        arrayOfInt[(k * paramInt + m)] = Color.HSVToColor(n, arrayOfFloat);
        m += 1;
      }
      k += 1;
    }
    return Bitmap.createBitmap(arrayOfInt, paramInt, paramInt, Bitmap.Config.ARGB_8888);
  }
  
  private void a()
  {
    this.j.a(a(this.i.x, this.i.y, this.f), b(this.i.x, this.i.y, this.f), this);
    b();
    invalidate();
  }
  
  private static void a(Path paramPath, int paramInt1, int paramInt2, float paramFloat)
  {
    paramInt1 = (int)(paramInt1 - paramFloat);
    paramInt2 = (int)(paramInt2 - paramFloat);
    paramPath.reset();
    paramPath.moveTo(paramInt1, paramFloat);
    paramPath.lineTo(paramInt1, paramInt2);
    paramPath.lineTo(paramFloat, paramInt2);
    paramPath.addArc(new RectF(paramFloat, paramFloat, paramInt1 * 2, paramInt2 * 2), 180.0F, 270.0F);
    paramPath.close();
  }
  
  private static void a(PointF paramPointF, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    paramFloat3 -= 1.0F;
    double d1 = paramFloat3 * Math.sqrt(paramFloat2);
    double d3 = paramFloat1 / 360.0F * 3.141592653589793D / 2.0D;
    double d2 = Math.cos(d3);
    d3 = Math.sin(d3);
    paramPointF.set(paramFloat3 - (float)(d2 * d1), paramFloat3 - (float)(d1 * d3));
  }
  
  private boolean a(PointF paramPointF, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    float f1 = Math.min(paramFloat1, this.f);
    paramFloat1 = Math.min(paramFloat2, this.g);
    float f4 = this.f - f1;
    float f2 = this.g - paramFloat1;
    float f3 = (float)Math.sqrt(f4 * f4 + f2 * f2);
    if (f3 > this.f) {}
    for (int k = 1;; k = 0)
    {
      if ((k == 0) || (!paramBoolean))
      {
        paramFloat2 = f1;
        if (k != 0)
        {
          paramFloat2 = this.f - this.f * f4 / f3;
          paramFloat1 = this.f - this.f * f2 / f3;
        }
        paramPointF.set(paramFloat2, paramFloat1);
      }
      if (k != 0) {
        break;
      }
      return true;
    }
    return false;
  }
  
  private static float b(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    double d2 = paramFloat3 - 1.0F;
    double d1 = (d2 - paramFloat1) / d2;
    d2 = (d2 - paramFloat2) / d2;
    return (float)(d2 * d2 + d1 * d1);
  }
  
  private void b()
  {
    Paint localPaint = this.b;
    if (this.j.a(1.0F) > 0.5D) {}
    for (int k = -16777216;; k = -1)
    {
      localPaint.setColor(k);
      return;
    }
  }
  
  public void a(e parame)
  {
    this.j = parame;
    parame.a(this);
  }
  
  public void b(e parame)
  {
    a(this.i, parame.b(), parame.c(), this.f);
    b();
    invalidate();
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    paramCanvas.drawBitmap(this.h, null, this.e, null);
    paramCanvas.drawPath(this.d, this.a);
    paramCanvas.save(3);
    if (Build.VERSION.SDK_INT >= 18) {
      paramCanvas.clipPath(this.d);
    }
    paramCanvas.translate(this.i.x, this.i.y);
    paramCanvas.drawPath(this.c, this.b);
    paramCanvas.restore();
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.f = paramInt1;
    this.g = paramInt2;
    this.e.set(0, 0, paramInt1, paramInt2);
    float f1 = this.a.getStrokeWidth() / 2.0F;
    a(this.d, paramInt1, paramInt2, f1);
    this.h = a(Math.min(paramInt1, paramInt2) / 2);
    b(this.j);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool1;
    switch (paramMotionEvent.getActionMasked())
    {
    case 1: 
    default: 
      bool1 = super.onTouchEvent(paramMotionEvent);
    case 0: 
      boolean bool2;
      do
      {
        return bool1;
        bool2 = a(this.i, paramMotionEvent.getX(), paramMotionEvent.getY(), true);
        bool1 = bool2;
      } while (!bool2);
      a();
      return bool2;
    }
    a(this.i, paramMotionEvent.getX(), paramMotionEvent.getY(), false);
    a();
    getParent().requestDisallowInterceptTouchEvent(true);
    return true;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/rarepebble/colorpicker/HueSatView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */