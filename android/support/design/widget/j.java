package android.support.design.widget;

import android.support.v4.i.bu;
import android.support.v4.widget.bk;
import android.support.v4.widget.bn;
import android.view.View;
import java.lang.ref.WeakReference;

class j
  extends bn
{
  j(BottomSheetBehavior paramBottomSheetBehavior) {}
  
  public int a(View paramView)
  {
    if (BottomSheetBehavior.g(this.a)) {
      return BottomSheetBehavior.h(this.a) - BottomSheetBehavior.f(this.a);
    }
    return BottomSheetBehavior.i(this.a) - BottomSheetBehavior.f(this.a);
  }
  
  public int a(View paramView, int paramInt1, int paramInt2)
  {
    int i = BottomSheetBehavior.f(this.a);
    if (BottomSheetBehavior.g(this.a)) {}
    for (paramInt2 = BottomSheetBehavior.h(this.a);; paramInt2 = BottomSheetBehavior.i(this.a)) {
      return aw.a(paramInt1, i, paramInt2);
    }
  }
  
  public void a(int paramInt)
  {
    if (paramInt == 1) {
      BottomSheetBehavior.b(this.a, 1);
    }
  }
  
  public void a(View paramView, float paramFloat1, float paramFloat2)
  {
    int j = 3;
    int i;
    if (paramFloat2 < 0.0F) {
      i = BottomSheetBehavior.f(this.a);
    }
    while (BottomSheetBehavior.j(this.a).a(paramView.getLeft(), i))
    {
      BottomSheetBehavior.b(this.a, 2);
      bu.a(paramView, new n(this.a, paramView, j));
      return;
      if ((BottomSheetBehavior.g(this.a)) && (BottomSheetBehavior.a(this.a, paramView, paramFloat2)))
      {
        i = BottomSheetBehavior.h(this.a);
        j = 5;
      }
      else if (paramFloat2 == 0.0F)
      {
        i = paramView.getTop();
        if (Math.abs(i - BottomSheetBehavior.f(this.a)) < Math.abs(i - BottomSheetBehavior.i(this.a)))
        {
          i = BottomSheetBehavior.f(this.a);
        }
        else
        {
          i = BottomSheetBehavior.i(this.a);
          j = 4;
        }
      }
      else
      {
        i = BottomSheetBehavior.i(this.a);
        j = 4;
      }
    }
    BottomSheetBehavior.b(this.a, j);
  }
  
  public void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    BottomSheetBehavior.a(this.a, paramInt2);
  }
  
  public boolean a(View paramView, int paramInt)
  {
    if (BottomSheetBehavior.a(this.a) == 1) {}
    View localView;
    do
    {
      do
      {
        return false;
      } while (BottomSheetBehavior.b(this.a));
      if ((BottomSheetBehavior.a(this.a) != 3) || (BottomSheetBehavior.c(this.a) != paramInt)) {
        break;
      }
      localView = (View)BottomSheetBehavior.d(this.a).get();
    } while ((localView != null) && (bu.b(localView, -1)));
    if ((BottomSheetBehavior.e(this.a) != null) && (BottomSheetBehavior.e(this.a).get() == paramView)) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public int b(View paramView, int paramInt1, int paramInt2)
  {
    return paramView.getLeft();
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/design/widget/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */