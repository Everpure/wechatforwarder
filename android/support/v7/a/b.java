package android.support.v7.a;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.b.l;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public class b
  extends ViewGroup.MarginLayoutParams
{
  public int a = 0;
  
  public b(int paramInt1, int paramInt2)
  {
    super(paramInt1, paramInt2);
    this.a = 8388627;
  }
  
  public b(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, l.ActionBarLayout);
    this.a = paramContext.getInt(l.ActionBarLayout_android_layout_gravity, 0);
    paramContext.recycle();
  }
  
  public b(b paramb)
  {
    super(paramb);
    this.a = paramb.a;
  }
  
  public b(ViewGroup.LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */