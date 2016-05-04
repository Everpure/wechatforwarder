package android.support.design.widget;

import android.support.v4.widget.bk;
import android.support.v4.widget.bn;
import android.view.View;
import android.view.ViewParent;

class bt
  extends bn
{
  private int b;
  
  bt(SwipeDismissBehavior paramSwipeDismissBehavior) {}
  
  private boolean a(View paramView, float paramFloat)
  {
    int i;
    if (paramFloat != 0.0F) {
      if (android.support.v4.i.bu.h(paramView) == 1)
      {
        i = 1;
        if (SwipeDismissBehavior.c(this.a) != 2) {
          break label34;
        }
      }
    }
    label34:
    label56:
    label64:
    label87:
    int j;
    int k;
    do
    {
      do
      {
        do
        {
          do
          {
            do
            {
              return true;
              i = 0;
              break;
              if (SwipeDismissBehavior.c(this.a) != 0) {
                break label64;
              }
              if (i == 0) {
                break label56;
              }
            } while (paramFloat < 0.0F);
            return false;
          } while (paramFloat > 0.0F);
          return false;
          if (SwipeDismissBehavior.c(this.a) != 1) {
            break label138;
          }
          if (i == 0) {
            break label87;
          }
        } while (paramFloat > 0.0F);
        return false;
      } while (paramFloat < 0.0F);
      return false;
      i = paramView.getLeft();
      j = this.b;
      k = Math.round(paramView.getWidth() * SwipeDismissBehavior.d(this.a));
    } while (Math.abs(i - j) >= k);
    return false;
    label138:
    return false;
  }
  
  public int a(View paramView, int paramInt1, int paramInt2)
  {
    return paramView.getTop();
  }
  
  public void a(int paramInt)
  {
    if (SwipeDismissBehavior.a(this.a) != null) {
      SwipeDismissBehavior.a(this.a).a(paramInt);
    }
  }
  
  public void a(View paramView, float paramFloat1, float paramFloat2)
  {
    boolean bool = false;
    ViewParent localViewParent = paramView.getParent();
    if (localViewParent != null) {
      localViewParent.requestDisallowInterceptTouchEvent(false);
    }
    int i = paramView.getWidth();
    if (a(paramView, paramFloat1)) {
      if (paramView.getLeft() < this.b)
      {
        i = this.b - i;
        bool = true;
        label60:
        if (!SwipeDismissBehavior.b(this.a).a(i, paramView.getTop())) {
          break label119;
        }
        android.support.v4.i.bu.a(paramView, new bv(this.a, paramView, bool));
      }
    }
    label119:
    while ((!bool) || (SwipeDismissBehavior.a(this.a) == null))
    {
      return;
      i = this.b + i;
      break;
      i = this.b;
      break label60;
    }
    SwipeDismissBehavior.a(this.a).a(paramView);
  }
  
  public void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    float f1 = this.b + paramView.getWidth() * SwipeDismissBehavior.e(this.a);
    float f2 = this.b + paramView.getWidth() * SwipeDismissBehavior.f(this.a);
    if (paramInt1 <= f1)
    {
      android.support.v4.i.bu.c(paramView, 1.0F);
      return;
    }
    if (paramInt1 >= f2)
    {
      android.support.v4.i.bu.c(paramView, 0.0F);
      return;
    }
    android.support.v4.i.bu.c(paramView, SwipeDismissBehavior.b(0.0F, 1.0F - SwipeDismissBehavior.a(f1, f2, paramInt1), 1.0F));
  }
  
  public boolean a(View paramView, int paramInt)
  {
    return this.a.a(paramView);
  }
  
  public int b(View paramView)
  {
    return paramView.getWidth();
  }
  
  public int b(View paramView, int paramInt1, int paramInt2)
  {
    int i;
    if (android.support.v4.i.bu.h(paramView) == 1)
    {
      paramInt2 = 1;
      if (SwipeDismissBehavior.c(this.a) != 0) {
        break label72;
      }
      if (paramInt2 == 0) {
        break label53;
      }
      i = this.b - paramView.getWidth();
      paramInt2 = this.b;
    }
    for (;;)
    {
      return SwipeDismissBehavior.a(i, paramInt1, paramInt2);
      paramInt2 = 0;
      break;
      label53:
      i = this.b;
      paramInt2 = this.b + paramView.getWidth();
      continue;
      label72:
      if (SwipeDismissBehavior.c(this.a) == 1)
      {
        if (paramInt2 != 0)
        {
          i = this.b;
          paramInt2 = this.b + paramView.getWidth();
        }
        else
        {
          i = this.b - paramView.getWidth();
          paramInt2 = this.b;
        }
      }
      else
      {
        i = this.b - paramView.getWidth();
        paramInt2 = this.b + paramView.getWidth();
      }
    }
  }
  
  public void b(View paramView, int paramInt)
  {
    this.b = paramView.getLeft();
    paramView = paramView.getParent();
    if (paramView != null) {
      paramView.requestDisallowInterceptTouchEvent(true);
    }
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/design/widget/bt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */