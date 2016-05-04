package com.rarepebble.colorpicker;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.util.AttributeSet;

public class AlphaView
  extends m
  implements f
{
  private e a = new e(0);
  
  public AlphaView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public AlphaView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  protected Bitmap a(int paramInt1, int paramInt2)
  {
    int k = 1;
    int i;
    int m;
    int n;
    int[] arrayOfInt;
    int j;
    if (paramInt1 > paramInt2)
    {
      i = 1;
      m = Math.max(paramInt1, paramInt2);
      n = this.a.a();
      arrayOfInt = new int[m];
      j = 0;
      label36:
      if (j >= m) {
        break label103;
      }
      if (i == 0) {
        break label90;
      }
    }
    label90:
    for (float f = j / m;; f = 1.0F - j / m)
    {
      arrayOfInt[j] = ((int)(f * 255.0F) << 24 | 0xFFFFFF & n);
      j += 1;
      break label36;
      i = 0;
      break;
    }
    label103:
    if (i != 0)
    {
      if (i == 0) {
        break label132;
      }
      paramInt2 = k;
    }
    label132:
    for (;;)
    {
      return Bitmap.createBitmap(arrayOfInt, paramInt1, paramInt2, Bitmap.Config.ARGB_8888);
      paramInt1 = 1;
      break;
    }
  }
  
  protected void a(float paramFloat)
  {
    this.a.a((int)(255.0F * paramFloat), this);
  }
  
  public void a(e parame)
  {
    this.a = parame;
    parame.a(this);
  }
  
  protected int b(float paramFloat)
  {
    if ((this.a.f() - 1.0F) * paramFloat + 1.0F > 0.5F) {
      return -16777216;
    }
    return -1;
  }
  
  public void b(e parame)
  {
    setPos(parame.e() / 255.0F);
    a();
    invalidate();
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/rarepebble/colorpicker/AlphaView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */