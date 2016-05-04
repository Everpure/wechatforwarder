package com.rarepebble.colorpicker;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Color;
import android.util.AttributeSet;

public class ValueView
  extends m
  implements f
{
  private e a = new e(0);
  
  public ValueView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public ValueView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  protected Bitmap a(int paramInt1, int paramInt2)
  {
    int k = 1;
    int i;
    int m;
    int[] arrayOfInt;
    float[] arrayOfFloat;
    int j;
    if (paramInt1 > paramInt2)
    {
      i = 1;
      m = Math.max(paramInt1, paramInt2);
      arrayOfInt = new int[m];
      arrayOfFloat = new float[3];
      float[] tmp31_29 = arrayOfFloat;
      tmp31_29[0] = 0.0F;
      float[] tmp35_31 = tmp31_29;
      tmp35_31[1] = 0.0F;
      float[] tmp39_35 = tmp35_31;
      tmp39_35[2] = 0.0F;
      tmp39_35;
      this.a.a(arrayOfFloat);
      j = 0;
      label56:
      if (j >= m) {
        break label119;
      }
      if (i == 0) {
        break label106;
      }
    }
    label106:
    for (float f = j / m;; f = 1.0F - j / m)
    {
      arrayOfFloat[2] = f;
      arrayOfInt[j] = Color.HSVToColor(arrayOfFloat);
      j += 1;
      break label56;
      i = 0;
      break;
    }
    label119:
    if (i != 0)
    {
      if (i == 0) {
        break label148;
      }
      paramInt2 = k;
    }
    label148:
    for (;;)
    {
      return Bitmap.createBitmap(arrayOfInt, paramInt1, paramInt2, Bitmap.Config.ARGB_8888);
      paramInt1 = 1;
      break;
    }
  }
  
  protected void a(float paramFloat)
  {
    this.a.a(paramFloat, this);
  }
  
  public void a(e parame)
  {
    this.a = parame;
    parame.a(this);
  }
  
  protected int b(float paramFloat)
  {
    if (this.a.f() * paramFloat > 0.5F) {
      return -16777216;
    }
    return -1;
  }
  
  public void b(e parame)
  {
    setPos(this.a.d());
    a();
    invalidate();
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/rarepebble/colorpicker/ValueView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */