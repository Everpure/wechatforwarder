package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.b.l;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public class da
  extends ViewGroup.MarginLayoutParams
{
  public float g;
  public int h = -1;
  
  public da(int paramInt1, int paramInt2)
  {
    super(paramInt1, paramInt2);
    this.g = 0.0F;
  }
  
  public da(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, l.LinearLayoutCompat_Layout);
    this.g = paramContext.getFloat(l.LinearLayoutCompat_Layout_android_layout_weight, 0.0F);
    this.h = paramContext.getInt(l.LinearLayoutCompat_Layout_android_layout_gravity, -1);
    paramContext.recycle();
  }
  
  public da(ViewGroup.LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/da.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */