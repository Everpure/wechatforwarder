package com.yalantis.ucrop.a;

import android.graphics.RectF;

public class k
{
  public static float[] a(RectF paramRectF)
  {
    return new float[] { paramRectF.left, paramRectF.top, paramRectF.right, paramRectF.top, paramRectF.right, paramRectF.bottom, paramRectF.left, paramRectF.bottom };
  }
  
  public static float[] a(float[] paramArrayOfFloat)
  {
    return new float[] { (float)Math.sqrt(Math.pow(paramArrayOfFloat[0] - paramArrayOfFloat[2], 2.0D) + Math.pow(paramArrayOfFloat[1] - paramArrayOfFloat[3], 2.0D)), (float)Math.sqrt(Math.pow(paramArrayOfFloat[2] - paramArrayOfFloat[4], 2.0D) + Math.pow(paramArrayOfFloat[3] - paramArrayOfFloat[5], 2.0D)) };
  }
  
  public static RectF b(float[] paramArrayOfFloat)
  {
    RectF localRectF = new RectF(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    int i = 1;
    if (i < paramArrayOfFloat.length)
    {
      float f2 = paramArrayOfFloat[(i - 1)];
      float f1 = paramArrayOfFloat[i];
      float f3;
      if (f2 < localRectF.left)
      {
        f3 = f2;
        label51:
        localRectF.left = f3;
        if (f1 >= localRectF.top) {
          break label125;
        }
        f3 = f1;
        label69:
        localRectF.top = f3;
        if (f2 <= localRectF.right) {
          break label134;
        }
        label85:
        localRectF.right = f2;
        if (f1 <= localRectF.bottom) {
          break label143;
        }
      }
      for (;;)
      {
        localRectF.bottom = f1;
        i += 2;
        break;
        f3 = localRectF.left;
        break label51;
        label125:
        f3 = localRectF.top;
        break label69;
        label134:
        f2 = localRectF.right;
        break label85;
        label143:
        f1 = localRectF.bottom;
      }
    }
    localRectF.sort();
    return localRectF;
  }
  
  public static float[] b(RectF paramRectF)
  {
    return new float[] { paramRectF.centerX(), paramRectF.centerY() };
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/yalantis/ucrop/a/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */