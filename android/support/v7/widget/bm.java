package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.i.bu;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SpinnerAdapter;

class bm
  extends dg
{
  private CharSequence c;
  private ListAdapter d;
  private final Rect e = new Rect();
  
  public bm(bj parambj, Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(parambj);
    a(true);
    a(0);
    a(new bn(this, parambj));
  }
  
  private boolean b(View paramView)
  {
    return (bu.C(paramView)) && (paramView.getGlobalVisibleRect(this.e));
  }
  
  public CharSequence a()
  {
    return this.c;
  }
  
  public void a(ListAdapter paramListAdapter)
  {
    super.a(paramListAdapter);
    this.d = paramListAdapter;
  }
  
  public void a(CharSequence paramCharSequence)
  {
    this.c = paramCharSequence;
  }
  
  void b()
  {
    Object localObject = d();
    int i;
    int m;
    int n;
    int i1;
    int j;
    if (localObject != null)
    {
      ((Drawable)localObject).getPadding(bj.b(this.a));
      if (hh.a(this.a))
      {
        i = bj.b(this.a).right;
        m = this.a.getPaddingLeft();
        n = this.a.getPaddingRight();
        i1 = this.a.getWidth();
        if (bj.c(this.a) != -2) {
          break label240;
        }
        j = bj.a(this.a, (SpinnerAdapter)this.d, d());
        int k = this.a.getContext().getResources().getDisplayMetrics().widthPixels - bj.b(this.a).left - bj.b(this.a).right;
        if (j <= k) {
          break label288;
        }
        j = k;
      }
    }
    label165:
    label240:
    label288:
    for (;;)
    {
      f(Math.max(j, i1 - m - n));
      if (hh.a(this.a)) {
        i = i1 - n - h() + i;
      }
      for (;;)
      {
        b(i);
        return;
        i = -bj.b(this.a).left;
        break;
        localObject = bj.b(this.a);
        bj.b(this.a).right = 0;
        ((Rect)localObject).left = 0;
        i = 0;
        break;
        if (bj.c(this.a) == -1)
        {
          f(i1 - m - n);
          break label165;
        }
        f(bj.c(this.a));
        break label165;
        i += m;
      }
    }
  }
  
  public void c()
  {
    boolean bool = k();
    b();
    g(2);
    super.c();
    m().setChoiceMode(1);
    h(this.a.getSelectedItemPosition());
    if (bool) {}
    ViewTreeObserver localViewTreeObserver;
    do
    {
      return;
      localViewTreeObserver = this.a.getViewTreeObserver();
    } while (localViewTreeObserver == null);
    bo localbo = new bo(this);
    localViewTreeObserver.addOnGlobalLayoutListener(localbo);
    a(new bp(this, localbo));
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/bm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */