package android.support.design.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.v4.i.bu;
import android.support.v4.i.q;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import java.util.List;

abstract class av
  extends co
{
  private final Rect a = new Rect();
  private final Rect b = new Rect();
  private int c = 0;
  private int d;
  
  public av() {}
  
  public av(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  private static int c(int paramInt)
  {
    int i = paramInt;
    if (paramInt == 0) {
      i = 8388659;
    }
    return i;
  }
  
  float a(View paramView)
  {
    return 1.0F;
  }
  
  final int a()
  {
    return this.c;
  }
  
  abstract View a(List paramList);
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int j = paramView.getLayoutParams().height;
    if ((j == -1) || (j == -2))
    {
      View localView = a(paramCoordinatorLayout.d(paramView));
      if (localView != null)
      {
        if ((bu.t(localView)) && (!bu.t(paramView)))
        {
          bu.a(paramView, true);
          if (bu.t(paramView))
          {
            paramView.requestLayout();
            return true;
          }
        }
        if (bu.A(localView))
        {
          int i = View.MeasureSpec.getSize(paramInt3);
          paramInt3 = i;
          if (i == 0) {
            paramInt3 = paramCoordinatorLayout.getHeight();
          }
          int k = localView.getMeasuredHeight();
          int m = b(localView);
          if (j == -1) {}
          for (i = 1073741824;; i = Integer.MIN_VALUE)
          {
            paramCoordinatorLayout.a(paramView, paramInt1, paramInt2, View.MeasureSpec.makeMeasureSpec(m + (paramInt3 - k), i), paramInt4);
            return true;
          }
        }
      }
    }
    return false;
  }
  
  int b(View paramView)
  {
    return paramView.getMeasuredHeight();
  }
  
  public final void b(int paramInt)
  {
    this.d = paramInt;
  }
  
  protected void b(CoordinatorLayout paramCoordinatorLayout, View paramView, int paramInt)
  {
    View localView = a(paramCoordinatorLayout.d(paramView));
    if (localView != null)
    {
      v localv = (v)paramView.getLayoutParams();
      Rect localRect = this.a;
      localRect.set(paramCoordinatorLayout.getPaddingLeft() + localv.leftMargin, localView.getBottom() + localv.topMargin, paramCoordinatorLayout.getWidth() - paramCoordinatorLayout.getPaddingRight() - localv.rightMargin, paramCoordinatorLayout.getHeight() + localView.getBottom() - paramCoordinatorLayout.getPaddingBottom() - localv.bottomMargin);
      paramCoordinatorLayout = this.b;
      q.a(c(localv.c), paramView.getMeasuredWidth(), paramView.getMeasuredHeight(), localRect, paramCoordinatorLayout, paramInt);
      paramInt = c(localView);
      paramView.layout(paramCoordinatorLayout.left, paramCoordinatorLayout.top - paramInt, paramCoordinatorLayout.right, paramCoordinatorLayout.bottom - paramInt);
      this.c = (paramCoordinatorLayout.top - localView.getBottom());
      return;
    }
    super.b(paramCoordinatorLayout, paramView, paramInt);
    this.c = 0;
  }
  
  final int c(View paramView)
  {
    if (this.d == 0) {
      return 0;
    }
    return aw.a(Math.round(a(paramView) * this.d), 0, this.d);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/design/widget/av.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */