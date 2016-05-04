package android.support.v4.i;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.os.Build.VERSION;
import android.view.View;

public final class bu
{
  static final ch a = new bv();
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 23)
    {
      a = new cg();
      return;
    }
    if (i >= 21)
    {
      a = new cf();
      return;
    }
    if (i >= 19)
    {
      a = new ce();
      return;
    }
    if (i >= 17)
    {
      a = new cc();
      return;
    }
    if (i >= 16)
    {
      a = new cb();
      return;
    }
    if (i >= 15)
    {
      a = new bz();
      return;
    }
    if (i >= 14)
    {
      a = new ca();
      return;
    }
    if (i >= 11)
    {
      a = new by();
      return;
    }
    if (i >= 9)
    {
      a = new bx();
      return;
    }
    if (i >= 7)
    {
      a = new bw();
      return;
    }
  }
  
  public static boolean A(View paramView)
  {
    return a.C(paramView);
  }
  
  public static float B(View paramView)
  {
    return a.D(paramView);
  }
  
  public static boolean C(View paramView)
  {
    return a.E(paramView);
  }
  
  public static boolean D(View paramView)
  {
    return a.F(paramView);
  }
  
  public static int a(int paramInt1, int paramInt2)
  {
    return a.a(paramInt1, paramInt2);
  }
  
  public static int a(int paramInt1, int paramInt2, int paramInt3)
  {
    return a.a(paramInt1, paramInt2, paramInt3);
  }
  
  public static int a(View paramView)
  {
    return a.a(paramView);
  }
  
  public static ec a(View paramView, ec paramec)
  {
    return a.a(paramView, paramec);
  }
  
  public static void a(View paramView, float paramFloat)
  {
    a.a(paramView, paramFloat);
  }
  
  public static void a(View paramView, int paramInt1, int paramInt2)
  {
    a.a(paramView, paramInt1, paramInt2);
  }
  
  public static void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    a.a(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public static void a(View paramView, int paramInt, Paint paramPaint)
  {
    a.a(paramView, paramInt, paramPaint);
  }
  
  public static void a(View paramView, ColorStateList paramColorStateList)
  {
    a.a(paramView, paramColorStateList);
  }
  
  public static void a(View paramView, PorterDuff.Mode paramMode)
  {
    a.a(paramView, paramMode);
  }
  
  public static void a(View paramView, a parama)
  {
    a.a(paramView, parama);
  }
  
  public static void a(View paramView, bm parambm)
  {
    a.a(paramView, parambm);
  }
  
  public static void a(View paramView, Runnable paramRunnable)
  {
    a.a(paramView, paramRunnable);
  }
  
  public static void a(View paramView, Runnable paramRunnable, long paramLong)
  {
    a.a(paramView, paramRunnable, paramLong);
  }
  
  public static void a(View paramView, boolean paramBoolean)
  {
    a.a(paramView, paramBoolean);
  }
  
  public static boolean a(View paramView, int paramInt)
  {
    return a.a(paramView, paramInt);
  }
  
  public static void b(View paramView, float paramFloat)
  {
    a.b(paramView, paramFloat);
  }
  
  public static void b(View paramView, boolean paramBoolean)
  {
    a.b(paramView, paramBoolean);
  }
  
  public static boolean b(View paramView)
  {
    return a.b(paramView);
  }
  
  public static boolean b(View paramView, int paramInt)
  {
    return a.b(paramView, paramInt);
  }
  
  public static void c(View paramView, float paramFloat)
  {
    a.c(paramView, paramFloat);
  }
  
  public static void c(View paramView, int paramInt)
  {
    a.c(paramView, paramInt);
  }
  
  public static void c(View paramView, boolean paramBoolean)
  {
    a.c(paramView, paramBoolean);
  }
  
  public static boolean c(View paramView)
  {
    return a.c(paramView);
  }
  
  public static void d(View paramView)
  {
    a.d(paramView);
  }
  
  public static void d(View paramView, float paramFloat)
  {
    a.d(paramView, paramFloat);
  }
  
  public static void d(View paramView, int paramInt)
  {
    a.d(paramView, paramInt);
  }
  
  public static int e(View paramView)
  {
    return a.e(paramView);
  }
  
  public static void e(View paramView, int paramInt)
  {
    a.f(paramView, paramInt);
  }
  
  public static float f(View paramView)
  {
    return a.f(paramView);
  }
  
  public static void f(View paramView, int paramInt)
  {
    a.e(paramView, paramInt);
  }
  
  public static int g(View paramView)
  {
    return a.g(paramView);
  }
  
  public static int h(View paramView)
  {
    return a.h(paramView);
  }
  
  public static int i(View paramView)
  {
    return a.i(paramView);
  }
  
  public static int j(View paramView)
  {
    return a.j(paramView);
  }
  
  public static int k(View paramView)
  {
    return a.k(paramView);
  }
  
  public static int l(View paramView)
  {
    return a.l(paramView);
  }
  
  public static float m(View paramView)
  {
    return a.n(paramView);
  }
  
  public static float n(View paramView)
  {
    return a.o(paramView);
  }
  
  public static int o(View paramView)
  {
    return a.p(paramView);
  }
  
  public static int p(View paramView)
  {
    return a.q(paramView);
  }
  
  public static di q(View paramView)
  {
    return a.r(paramView);
  }
  
  public static int r(View paramView)
  {
    return a.s(paramView);
  }
  
  public static void s(View paramView)
  {
    a.t(paramView);
  }
  
  public static boolean t(View paramView)
  {
    return a.w(paramView);
  }
  
  public static void u(View paramView)
  {
    a.x(paramView);
  }
  
  public static boolean v(View paramView)
  {
    return a.m(paramView);
  }
  
  public static boolean w(View paramView)
  {
    return a.y(paramView);
  }
  
  public static ColorStateList x(View paramView)
  {
    return a.z(paramView);
  }
  
  public static PorterDuff.Mode y(View paramView)
  {
    return a.A(paramView);
  }
  
  public static void z(View paramView)
  {
    a.B(paramView);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/i/bu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */