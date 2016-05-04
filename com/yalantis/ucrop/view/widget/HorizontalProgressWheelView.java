package com.yalantis.ucrop.view.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.yalantis.ucrop.c;
import com.yalantis.ucrop.d;

public class HorizontalProgressWheelView
  extends View
{
  private final Rect a = new Rect();
  private a b;
  private float c;
  private Paint d;
  private int e;
  private int f;
  private int g;
  private boolean h;
  private float i;
  private int j;
  
  public HorizontalProgressWheelView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public HorizontalProgressWheelView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public HorizontalProgressWheelView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a();
  }
  
  @TargetApi(21)
  public HorizontalProgressWheelView(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
  }
  
  private void a()
  {
    this.j = android.support.v4.c.a.b(getContext(), c.ucrop_color_progress_wheel_line);
    this.e = getContext().getResources().getDimensionPixelSize(d.ucrop_width_horizontal_wheel_progress_line);
    this.f = getContext().getResources().getDimensionPixelSize(d.ucrop_height_horizontal_wheel_progress_line);
    this.g = getContext().getResources().getDimensionPixelSize(d.ucrop_margin_horizontal_wheel_progress_line);
    this.d = new Paint(1);
    this.d.setStyle(Paint.Style.STROKE);
    this.d.setStrokeWidth(this.e);
  }
  
  private void a(MotionEvent paramMotionEvent, float paramFloat)
  {
    this.i -= paramFloat;
    postInvalidate();
    this.c = paramMotionEvent.getX();
    if (this.b != null) {
      this.b.a(-paramFloat, this.i);
    }
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    paramCanvas.getClipBounds(this.a);
    int m = this.a.width() / (this.e + this.g);
    float f1 = this.i % (this.g + this.e);
    this.d.setColor(getResources().getColor(c.ucrop_color_progress_wheel_line));
    int k = 0;
    if (k < m)
    {
      if (k < m / 4) {
        this.d.setAlpha((int)(k / (m / 4) * 255.0F));
      }
      for (;;)
      {
        f2 = -f1;
        f3 = this.a.left;
        f4 = (this.e + this.g) * k;
        f5 = this.a.centerY();
        float f6 = this.f / 4.0F;
        float f7 = -f1;
        float f8 = this.a.left;
        float f9 = (this.e + this.g) * k;
        float f10 = this.a.centerY();
        paramCanvas.drawLine(f4 + (f2 + f3), f5 - f6, f9 + (f7 + f8), this.f / 4.0F + f10, this.d);
        k += 1;
        break;
        if (k > m * 3 / 4) {
          this.d.setAlpha((int)((m - k) / (m / 4) * 255.0F));
        } else {
          this.d.setAlpha(255);
        }
      }
    }
    this.d.setColor(this.j);
    f1 = this.a.centerX();
    float f2 = this.a.centerY();
    float f3 = this.f / 2.0F;
    float f4 = this.a.centerX();
    float f5 = this.a.centerY();
    paramCanvas.drawLine(f1, f2 - f3, f4, this.f / 2.0F + f5, this.d);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    switch (paramMotionEvent.getAction())
    {
    }
    float f1;
    do
    {
      do
      {
        return true;
        this.c = paramMotionEvent.getX();
        return true;
      } while (this.b == null);
      this.h = false;
      this.b.a();
      return true;
      f1 = paramMotionEvent.getX() - this.c;
    } while (f1 == 0.0F);
    if (!this.h)
    {
      this.h = true;
      if (this.b != null) {
        this.b.b();
      }
    }
    a(paramMotionEvent, f1);
    return true;
  }
  
  public void setMiddleLineColor(int paramInt)
  {
    this.j = paramInt;
    invalidate();
  }
  
  public void setScrollingListener(a parama)
  {
    this.b = parama;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/yalantis/ucrop/view/widget/HorizontalProgressWheelView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */