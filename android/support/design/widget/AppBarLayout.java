package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.design.i;
import android.support.v4.i.bu;
import android.support.v4.i.ec;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import java.util.ArrayList;
import java.util.List;

@t(a=AppBarLayout.Behavior.class)
public class AppBarLayout
  extends LinearLayout
{
  boolean a;
  private int b = -1;
  private int c = -1;
  private int d = -1;
  private float e;
  private int f = 0;
  private ec g;
  private final List h;
  
  public AppBarLayout(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public AppBarLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setOrientation(1);
    bw.a(paramContext);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, i.AppBarLayout, 0, android.support.design.h.Widget_Design_AppBarLayout);
    this.e = paramContext.getDimensionPixelSize(i.AppBarLayout_elevation, 0);
    setBackgroundDrawable(paramContext.getDrawable(i.AppBarLayout_android_background));
    if (paramContext.hasValue(i.AppBarLayout_expanded)) {
      setExpanded(paramContext.getBoolean(i.AppBarLayout_expanded, false));
    }
    paramContext.recycle();
    cq.a(this);
    this.h = new ArrayList();
    bu.d(this, this.e);
    bu.a(this, new c(this));
  }
  
  private ec a(ec paramec)
  {
    ec localec = null;
    if (bu.t(this)) {
      localec = paramec;
    }
    if (localec != this.g)
    {
      this.g = localec;
      b();
    }
    return paramec;
  }
  
  private void b()
  {
    this.b = -1;
    this.c = -1;
    this.d = -1;
  }
  
  private boolean c()
  {
    return this.a;
  }
  
  private boolean d()
  {
    return getTotalScrollRange() != 0;
  }
  
  private void e()
  {
    this.f = 0;
  }
  
  private int getDownNestedPreScrollRange()
  {
    if (this.c != -1) {
      return this.c;
    }
    int j = getChildCount() - 1;
    int i = 0;
    View localView;
    int k;
    int m;
    if (j >= 0)
    {
      localView = getChildAt(j);
      h localh = (h)localView.getLayoutParams();
      k = localView.getMeasuredHeight();
      m = localh.a;
      if ((m & 0x5) == 5)
      {
        int n = localh.topMargin;
        i = localh.bottomMargin + n + i;
        if ((m & 0x8) != 0) {
          i += bu.p(localView);
        }
      }
    }
    for (;;)
    {
      j -= 1;
      break;
      if ((m & 0x2) != 0)
      {
        i += k - bu.p(localView);
      }
      else
      {
        i += k;
        continue;
        if (i > 0)
        {
          i = Math.max(0, i - getTopInset());
          this.c = i;
          return i;
        }
      }
    }
  }
  
  private int getDownNestedScrollRange()
  {
    if (this.d != -1) {
      return this.d;
    }
    int k = getChildCount();
    int j = 0;
    int i = 0;
    if (j < k)
    {
      View localView = getChildAt(j);
      h localh = (h)localView.getLayoutParams();
      int n = localView.getMeasuredHeight();
      int i1 = localh.topMargin;
      int i2 = localh.bottomMargin;
      int m = localh.a;
      if ((m & 0x1) != 0)
      {
        i += n + (i1 + i2);
        if ((m & 0x2) != 0) {
          i -= bu.p(localView) + getTopInset();
        }
      }
    }
    for (;;)
    {
      i = Math.max(0, i);
      this.d = i;
      return i;
      j += 1;
      break;
    }
  }
  
  private int getPendingAction()
  {
    return this.f;
  }
  
  private int getTopInset()
  {
    if (this.g != null) {
      return this.g.b();
    }
    return 0;
  }
  
  private int getUpNestedPreScrollRange()
  {
    return getTotalScrollRange();
  }
  
  protected h a()
  {
    return new h(-1, -2);
  }
  
  public h a(AttributeSet paramAttributeSet)
  {
    return new h(getContext(), paramAttributeSet);
  }
  
  protected h a(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof LinearLayout.LayoutParams)) {
      return new h((LinearLayout.LayoutParams)paramLayoutParams);
    }
    if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams)) {
      return new h((ViewGroup.MarginLayoutParams)paramLayoutParams);
    }
    return new h(paramLayoutParams);
  }
  
  public void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    int i;
    if (paramBoolean1)
    {
      i = 1;
      if (!paramBoolean2) {
        break label31;
      }
    }
    label31:
    for (int j = 4;; j = 0)
    {
      this.f = (j | i);
      requestLayout();
      return;
      i = 2;
      break;
    }
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof h;
  }
  
  final int getMinimumHeightForVisibleOverlappingContent()
  {
    int i = getTopInset();
    int j = bu.p(this);
    if (j != 0) {
      return i + j * 2;
    }
    j = getChildCount();
    if (j >= 1) {
      return i + bu.p(getChildAt(j - 1)) * 2;
    }
    return 0;
  }
  
  public float getTargetElevation()
  {
    return this.e;
  }
  
  public final int getTotalScrollRange()
  {
    if (this.b != -1) {
      return this.b;
    }
    int k = getChildCount();
    int j = 0;
    int i = 0;
    if (j < k)
    {
      View localView = getChildAt(j);
      h localh = (h)localView.getLayoutParams();
      int n = localView.getMeasuredHeight();
      int m = localh.a;
      if ((m & 0x1) != 0)
      {
        int i1 = localh.topMargin;
        i += localh.bottomMargin + (n + i1);
        if ((m & 0x2) != 0) {
          i -= bu.p(localView);
        }
      }
    }
    for (;;)
    {
      i = Math.max(0, i - getTopInset());
      this.b = i;
      return i;
      j += 1;
      break;
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    b();
    this.a = false;
    paramInt2 = getChildCount();
    paramInt1 = 0;
    for (;;)
    {
      if (paramInt1 < paramInt2)
      {
        if (((h)getChildAt(paramInt1).getLayoutParams()).b() != null) {
          this.a = true;
        }
      }
      else {
        return;
      }
      paramInt1 += 1;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    b();
  }
  
  public void setExpanded(boolean paramBoolean)
  {
    a(paramBoolean, bu.A(this));
  }
  
  public void setOrientation(int paramInt)
  {
    if (paramInt != 1) {
      throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }
    super.setOrientation(paramInt);
  }
  
  public void setTargetElevation(float paramFloat)
  {
    this.e = paramFloat;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/design/widget/AppBarLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */