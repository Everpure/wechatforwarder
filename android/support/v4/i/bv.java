package android.support.v4.i;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.view.View;
import java.util.WeakHashMap;

class bv
  implements ch
{
  WeakHashMap a = null;
  
  private boolean a(bn parambn, int paramInt)
  {
    boolean bool = true;
    int i = parambn.computeHorizontalScrollOffset();
    int j = parambn.computeHorizontalScrollRange() - parambn.computeHorizontalScrollExtent();
    if (j == 0) {
      bool = false;
    }
    do
    {
      do
      {
        return bool;
        if (paramInt >= 0) {
          break;
        }
      } while (i > 0);
      return false;
    } while (i < j - 1);
    return false;
  }
  
  private boolean b(bn parambn, int paramInt)
  {
    boolean bool = true;
    int i = parambn.computeVerticalScrollOffset();
    int j = parambn.computeVerticalScrollRange() - parambn.computeVerticalScrollExtent();
    if (j == 0) {
      bool = false;
    }
    do
    {
      do
      {
        return bool;
        if (paramInt >= 0) {
          break;
        }
      } while (i > 0);
      return false;
    } while (i < j - 1);
    return false;
  }
  
  public PorterDuff.Mode A(View paramView)
  {
    return ci.b(paramView);
  }
  
  public void B(View paramView)
  {
    if ((paramView instanceof bi)) {
      ((bi)paramView).stopNestedScroll();
    }
  }
  
  public boolean C(View paramView)
  {
    return ci.c(paramView);
  }
  
  public float D(View paramView)
  {
    return v(paramView) + u(paramView);
  }
  
  public boolean E(View paramView)
  {
    return ci.f(paramView);
  }
  
  public boolean F(View paramView)
  {
    return false;
  }
  
  public int a(int paramInt1, int paramInt2)
  {
    return paramInt1 | paramInt2;
  }
  
  public int a(int paramInt1, int paramInt2, int paramInt3)
  {
    return View.resolveSize(paramInt1, paramInt2);
  }
  
  public int a(View paramView)
  {
    return 2;
  }
  
  long a()
  {
    return 10L;
  }
  
  public ec a(View paramView, ec paramec)
  {
    return paramec;
  }
  
  public void a(View paramView, float paramFloat) {}
  
  public void a(View paramView, int paramInt1, int paramInt2) {}
  
  public void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramView.setPadding(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void a(View paramView, int paramInt, Paint paramPaint) {}
  
  public void a(View paramView, ColorStateList paramColorStateList)
  {
    ci.a(paramView, paramColorStateList);
  }
  
  public void a(View paramView, PorterDuff.Mode paramMode)
  {
    ci.a(paramView, paramMode);
  }
  
  public void a(View paramView, a parama) {}
  
  public void a(View paramView, bm parambm) {}
  
  public void a(View paramView, Runnable paramRunnable)
  {
    paramView.postDelayed(paramRunnable, a());
  }
  
  public void a(View paramView, Runnable paramRunnable, long paramLong)
  {
    paramView.postDelayed(paramRunnable, a() + paramLong);
  }
  
  public void a(View paramView, boolean paramBoolean) {}
  
  public boolean a(View paramView, int paramInt)
  {
    return ((paramView instanceof bn)) && (a((bn)paramView, paramInt));
  }
  
  public void b(View paramView, float paramFloat) {}
  
  public void b(View paramView, boolean paramBoolean) {}
  
  public boolean b(View paramView)
  {
    return false;
  }
  
  public boolean b(View paramView, int paramInt)
  {
    return ((paramView instanceof bn)) && (b((bn)paramView, paramInt));
  }
  
  public void c(View paramView, float paramFloat) {}
  
  public void c(View paramView, int paramInt) {}
  
  public void c(View paramView, boolean paramBoolean) {}
  
  public boolean c(View paramView)
  {
    return false;
  }
  
  public void d(View paramView)
  {
    paramView.invalidate();
  }
  
  public void d(View paramView, float paramFloat) {}
  
  public void d(View paramView, int paramInt) {}
  
  public int e(View paramView)
  {
    return 0;
  }
  
  public void e(View paramView, int paramInt)
  {
    ci.b(paramView, paramInt);
  }
  
  public float f(View paramView)
  {
    return 1.0F;
  }
  
  public void f(View paramView, int paramInt)
  {
    ci.a(paramView, paramInt);
  }
  
  public int g(View paramView)
  {
    return 0;
  }
  
  public int h(View paramView)
  {
    return 0;
  }
  
  public int i(View paramView)
  {
    return paramView.getMeasuredWidth();
  }
  
  public int j(View paramView)
  {
    return 0;
  }
  
  public int k(View paramView)
  {
    return paramView.getPaddingLeft();
  }
  
  public int l(View paramView)
  {
    return paramView.getPaddingRight();
  }
  
  public boolean m(View paramView)
  {
    return true;
  }
  
  public float n(View paramView)
  {
    return 0.0F;
  }
  
  public float o(View paramView)
  {
    return 0.0F;
  }
  
  public int p(View paramView)
  {
    return ci.d(paramView);
  }
  
  public int q(View paramView)
  {
    return ci.e(paramView);
  }
  
  public di r(View paramView)
  {
    return new di(paramView);
  }
  
  public int s(View paramView)
  {
    return 0;
  }
  
  public void t(View paramView) {}
  
  public float u(View paramView)
  {
    return 0.0F;
  }
  
  public float v(View paramView)
  {
    return 0.0F;
  }
  
  public boolean w(View paramView)
  {
    return false;
  }
  
  public void x(View paramView) {}
  
  public boolean y(View paramView)
  {
    return false;
  }
  
  public ColorStateList z(View paramView)
  {
    return ci.a(paramView);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/i/bv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */