package com.yalantis.ucrop.a;

import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;

public class o
  extends StateListDrawable
{
  private int a;
  
  public o(Drawable paramDrawable, int paramInt)
  {
    this.a = paramInt;
    addState(new int[] { 16842913 }, paramDrawable);
    addState(new int[0], paramDrawable);
  }
  
  public boolean isStateful()
  {
    return true;
  }
  
  protected boolean onStateChange(int[] paramArrayOfInt)
  {
    int j = 0;
    int k = paramArrayOfInt.length;
    int i = 0;
    while (i < k)
    {
      if (paramArrayOfInt[i] == 16842913) {
        j = 1;
      }
      i += 1;
    }
    if (j != 0) {
      super.setColorFilter(this.a, PorterDuff.Mode.SRC_ATOP);
    }
    for (;;)
    {
      return super.onStateChange(paramArrayOfInt);
      super.clearColorFilter();
    }
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/yalantis/ucrop/a/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */