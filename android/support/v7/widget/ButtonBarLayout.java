package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.v4.i.bu;
import android.support.v7.b.g;
import android.support.v7.b.l;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;

public class ButtonBarLayout
  extends LinearLayout
{
  private boolean a;
  private int b = -1;
  
  public ButtonBarLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, l.ButtonBarLayout);
    this.a = paramContext.getBoolean(l.ButtonBarLayout_allowStacking, false);
    paramContext.recycle();
  }
  
  private boolean a()
  {
    return getOrientation() == 1;
  }
  
  private void setStacked(boolean paramBoolean)
  {
    label17:
    View localView;
    if (paramBoolean)
    {
      i = 1;
      setOrientation(i);
      if (!paramBoolean) {
        break label78;
      }
      i = 5;
      setGravity(i);
      localView = findViewById(g.spacer);
      if (localView != null) {
        if (!paramBoolean) {
          break label84;
        }
      }
    }
    label78:
    label84:
    for (int i = 8;; i = 4)
    {
      localView.setVisibility(i);
      i = getChildCount() - 2;
      while (i >= 0)
      {
        bringChildToFront(getChildAt(i));
        i -= 1;
      }
      i = 0;
      break;
      i = 80;
      break label17;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int m = 0;
    int n = View.MeasureSpec.getSize(paramInt1);
    if (this.a)
    {
      if ((n > this.b) && (a())) {
        setStacked(false);
      }
      this.b = n;
    }
    int j;
    int i;
    int k;
    if ((!a()) && (View.MeasureSpec.getMode(paramInt1) == 1073741824))
    {
      j = View.MeasureSpec.makeMeasureSpec(n, Integer.MIN_VALUE);
      i = 1;
      super.onMeasure(j, paramInt2);
      k = i;
      if (this.a)
      {
        k = i;
        if (!a())
        {
          if (Build.VERSION.SDK_INT < 11) {
            break label160;
          }
          j = m;
          if ((bu.i(this) & 0xFF000000) == 16777216) {
            j = 1;
          }
        }
      }
    }
    for (;;)
    {
      k = i;
      if (j != 0)
      {
        setStacked(true);
        k = 1;
      }
      if (k != 0) {
        super.onMeasure(paramInt1, paramInt2);
      }
      return;
      j = paramInt1;
      i = 0;
      break;
      label160:
      int i1 = getChildCount();
      j = 0;
      k = 0;
      while (j < i1)
      {
        k += getChildAt(j).getMeasuredWidth();
        j += 1;
      }
      j = m;
      if (getPaddingLeft() + k + getPaddingRight() > n) {
        j = 1;
      }
    }
  }
  
  public void setAllowStacking(boolean paramBoolean)
  {
    if (this.a != paramBoolean)
    {
      this.a = paramBoolean;
      if ((!this.a) && (getOrientation() == 1)) {
        setStacked(false);
      }
      requestLayout();
    }
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/ButtonBarLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */