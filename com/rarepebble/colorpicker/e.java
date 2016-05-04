package com.rarepebble.colorpicker;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class e
{
  private final float[] a = { 0.0F, 0.0F, 0.0F };
  private int b;
  private final List c = new ArrayList();
  
  e(int paramInt)
  {
    Color.colorToHSV(paramInt, this.a);
    this.b = Color.alpha(paramInt);
  }
  
  private void b(f paramf)
  {
    Iterator localIterator = this.c.iterator();
    while (localIterator.hasNext())
    {
      f localf = (f)localIterator.next();
      if (localf != paramf) {
        localf.b(this);
      }
    }
  }
  
  public float a(float paramFloat)
  {
    int i = Color.HSVToColor(new float[] { this.a[0], this.a[1], paramFloat });
    paramFloat = Color.red(i);
    float f = Color.green(i);
    return (Color.blue(i) * 0.0722F + (paramFloat * 0.2126F + f * 0.7152F)) / 255.0F;
  }
  
  public int a()
  {
    return Color.HSVToColor(this.b, this.a);
  }
  
  public void a(float paramFloat1, float paramFloat2, f paramf)
  {
    this.a[0] = paramFloat1;
    this.a[1] = paramFloat2;
    b(paramf);
  }
  
  public void a(float paramFloat, f paramf)
  {
    this.a[2] = paramFloat;
    b(paramf);
  }
  
  public void a(int paramInt, f paramf)
  {
    this.b = paramInt;
    b(paramf);
  }
  
  void a(f paramf)
  {
    this.c.add(paramf);
  }
  
  public void a(float[] paramArrayOfFloat)
  {
    paramArrayOfFloat[0] = this.a[0];
    paramArrayOfFloat[1] = this.a[1];
    paramArrayOfFloat[2] = this.a[2];
  }
  
  public float b()
  {
    return this.a[0];
  }
  
  public void b(int paramInt, f paramf)
  {
    Color.colorToHSV(paramInt, this.a);
    this.b = Color.alpha(paramInt);
    b(paramf);
  }
  
  public float c()
  {
    return this.a[1];
  }
  
  public float d()
  {
    return this.a[2];
  }
  
  public int e()
  {
    return this.b;
  }
  
  public float f()
  {
    return a(this.a[2]);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/rarepebble/colorpicker/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */