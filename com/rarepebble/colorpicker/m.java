package com.rarepebble.colorpicker;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

public abstract class m
  extends View
{
  private final Paint a;
  private final Paint b;
  private final Rect c = new Rect();
  private int d;
  private int e;
  private final Path f;
  private Bitmap g;
  private final Path h;
  private final Paint i;
  private float j;
  
  public m(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.b = l.b(paramContext);
    this.a = l.a(paramContext);
    this.i = l.a(paramContext);
    this.h = l.c(paramContext);
    this.f = new Path();
  }
  
  private float a(float paramFloat1, float paramFloat2)
  {
    if (b()) {}
    for (paramFloat1 /= this.d;; paramFloat1 = 1.0F - paramFloat2 / this.e) {
      return Math.max(0.0F, Math.min(1.0F, paramFloat1));
    }
  }
  
  private boolean b()
  {
    return this.d > this.e;
  }
  
  private void c()
  {
    this.i.setColor(b(this.j));
  }
  
  protected abstract Bitmap a(int paramInt1, int paramInt2);
  
  protected void a()
  {
    if ((this.d > 0) && (this.e > 0))
    {
      this.g = a(this.d, this.e);
      c();
    }
  }
  
  protected abstract void a(float paramFloat);
  
  protected abstract int b(float paramFloat);
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    paramCanvas.drawPath(this.f, this.b);
    paramCanvas.drawBitmap(this.g, null, this.c, null);
    paramCanvas.drawPath(this.f, this.a);
    paramCanvas.save(1);
    if (b()) {
      paramCanvas.translate(this.d * this.j, this.e / 2);
    }
    for (;;)
    {
      paramCanvas.drawPath(this.h, this.i);
      paramCanvas.restore();
      return;
      paramCanvas.translate(this.d / 2, this.e * (1.0F - this.j));
    }
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.d = paramInt1;
    this.e = paramInt2;
    this.c.set(0, 0, paramInt1, paramInt2);
    float f1 = this.a.getStrokeWidth() / 2.0F;
    this.f.reset();
    this.f.addRect(new RectF(f1, f1, paramInt1 - f1, paramInt2 - f1), Path.Direction.CW);
    a();
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    switch (paramMotionEvent.getActionMasked())
    {
    case 1: 
    default: 
      return super.onTouchEvent(paramMotionEvent);
    }
    this.j = a(paramMotionEvent.getX(), paramMotionEvent.getY());
    c();
    a(this.j);
    invalidate();
    getParent().requestDisallowInterceptTouchEvent(true);
    return true;
  }
  
  protected void setPos(float paramFloat)
  {
    this.j = paramFloat;
    c();
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/rarepebble/colorpicker/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */