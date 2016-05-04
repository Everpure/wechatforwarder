package com.yalantis.ucrop.a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public class f
  extends Drawable
{
  private final Paint a = new Paint(2);
  private Bitmap b;
  private int c = 255;
  private int d;
  private int e;
  
  public f(Bitmap paramBitmap)
  {
    a(paramBitmap);
  }
  
  public Bitmap a()
  {
    return this.b;
  }
  
  public void a(Bitmap paramBitmap)
  {
    this.b = paramBitmap;
    if (paramBitmap != null)
    {
      this.d = this.b.getWidth();
      this.e = this.b.getHeight();
      return;
    }
    this.e = 0;
    this.d = 0;
  }
  
  public void draw(Canvas paramCanvas)
  {
    if ((this.b != null) && (!this.b.isRecycled()))
    {
      Rect localRect = getBounds();
      paramCanvas.drawBitmap(this.b, null, localRect, this.a);
    }
  }
  
  public int getAlpha()
  {
    return this.c;
  }
  
  public int getIntrinsicHeight()
  {
    return this.e;
  }
  
  public int getIntrinsicWidth()
  {
    return this.d;
  }
  
  public int getMinimumHeight()
  {
    return this.e;
  }
  
  public int getMinimumWidth()
  {
    return this.d;
  }
  
  public int getOpacity()
  {
    return -3;
  }
  
  public void setAlpha(int paramInt)
  {
    this.c = paramInt;
    this.a.setAlpha(paramInt);
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    this.a.setColorFilter(paramColorFilter);
  }
  
  public void setFilterBitmap(boolean paramBoolean)
  {
    this.a.setFilterBitmap(paramBoolean);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/yalantis/ucrop/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */