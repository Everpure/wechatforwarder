package com.yalantis.ucrop.a;

import android.view.MotionEvent;

public class l
{
  private float a;
  private float b;
  private float c;
  private float d;
  private int e;
  private int f;
  private float g;
  private boolean h;
  private m i;
  
  public l(m paramm)
  {
    this.i = paramm;
    this.e = -1;
    this.f = -1;
  }
  
  private float a(float paramFloat1, float paramFloat2)
  {
    this.g = (paramFloat2 % 360.0F - paramFloat1 % 360.0F);
    if (this.g < -180.0F) {
      this.g += 360.0F;
    }
    for (;;)
    {
      return this.g;
      if (this.g > 180.0F) {
        this.g -= 360.0F;
      }
    }
  }
  
  private float a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, float paramFloat8)
  {
    return a((float)Math.toDegrees((float)Math.atan2(paramFloat2 - paramFloat4, paramFloat1 - paramFloat3)), (float)Math.toDegrees((float)Math.atan2(paramFloat6 - paramFloat8, paramFloat5 - paramFloat7)));
  }
  
  public float a()
  {
    return this.g;
  }
  
  public boolean a(MotionEvent paramMotionEvent)
  {
    switch (paramMotionEvent.getActionMasked())
    {
    case 3: 
    case 4: 
    default: 
    case 0: 
    case 5: 
    case 2: 
      do
      {
        return true;
        this.c = paramMotionEvent.getX();
        this.d = paramMotionEvent.getY();
        this.e = paramMotionEvent.findPointerIndex(paramMotionEvent.getPointerId(0));
        this.g = 0.0F;
        this.h = true;
        return true;
        this.a = paramMotionEvent.getX();
        this.b = paramMotionEvent.getY();
        this.f = paramMotionEvent.findPointerIndex(paramMotionEvent.getPointerId(paramMotionEvent.getActionIndex()));
        this.g = 0.0F;
        this.h = true;
        return true;
      } while ((this.e == -1) || (this.f == -1) || (paramMotionEvent.getPointerCount() <= this.f));
      float f1 = paramMotionEvent.getX(this.e);
      float f2 = paramMotionEvent.getY(this.e);
      float f3 = paramMotionEvent.getX(this.f);
      float f4 = paramMotionEvent.getY(this.f);
      if (this.h)
      {
        this.g = 0.0F;
        this.h = false;
      }
      for (;;)
      {
        if (this.i != null) {
          this.i.a(this);
        }
        this.a = f3;
        this.b = f4;
        this.c = f1;
        this.d = f2;
        return true;
        a(this.a, this.b, this.c, this.d, f3, f4, f1, f2);
      }
    case 1: 
      this.e = -1;
      return true;
    }
    this.f = -1;
    return true;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/yalantis/ucrop/a/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */