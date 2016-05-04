package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.design.i;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout.LayoutParams;

public class h
  extends LinearLayout.LayoutParams
{
  int a = 1;
  Interpolator b;
  
  public h(int paramInt1, int paramInt2)
  {
    super(paramInt1, paramInt2);
  }
  
  public h(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, i.AppBarLayout_LayoutParams);
    this.a = paramAttributeSet.getInt(i.AppBarLayout_LayoutParams_layout_scrollFlags, 0);
    if (paramAttributeSet.hasValue(i.AppBarLayout_LayoutParams_layout_scrollInterpolator)) {
      this.b = AnimationUtils.loadInterpolator(paramContext, paramAttributeSet.getResourceId(i.AppBarLayout_LayoutParams_layout_scrollInterpolator, 0));
    }
    paramAttributeSet.recycle();
  }
  
  public h(ViewGroup.LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
  }
  
  public h(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    super(paramMarginLayoutParams);
  }
  
  public h(LinearLayout.LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
  }
  
  public int a()
  {
    return this.a;
  }
  
  public Interpolator b()
  {
    return this.b;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/design/widget/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */