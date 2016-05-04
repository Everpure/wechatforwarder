package com.rarepebble.colorpicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;

class n
  extends View
{
  private final int a;
  
  public n(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.a = ((int)l.a(paramContext, 200.0F));
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getSize(paramInt1);
    int j = View.MeasureSpec.getSize(paramInt2);
    paramInt1 = View.MeasureSpec.getMode(paramInt1);
    paramInt2 = View.MeasureSpec.getMode(paramInt2);
    int k = this.a;
    if (paramInt1 == 0) {
      paramInt1 = j;
    }
    for (;;)
    {
      paramInt1 = Math.max(paramInt1, this.a);
      setMeasuredDimension(paramInt1, paramInt1);
      return;
      if (paramInt2 == 0) {
        paramInt1 = i;
      } else {
        paramInt1 = Math.min(i, j);
      }
    }
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/rarepebble/colorpicker/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */