package com.yalantis.ucrop.a;

public final class e
{
  public static float a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    paramFloat1 = paramFloat1 / paramFloat4 - 1.0F;
    return (paramFloat1 * (paramFloat1 * paramFloat1) + 1.0F) * paramFloat3 + paramFloat2;
  }
  
  public static float b(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    paramFloat1 /= paramFloat4 / 2.0F;
    if (paramFloat1 < 1.0F) {
      return paramFloat1 * (paramFloat3 / 2.0F * paramFloat1 * paramFloat1) + paramFloat2;
    }
    paramFloat3 /= 2.0F;
    paramFloat1 -= 2.0F;
    return (paramFloat1 * (paramFloat1 * paramFloat1) + 2.0F) * paramFloat3 + paramFloat2;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/yalantis/ucrop/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */