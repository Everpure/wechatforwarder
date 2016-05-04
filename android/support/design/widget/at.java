package android.support.design.widget;

import android.content.Context;
import android.support.v4.i.az;
import android.support.v4.i.bp;
import android.support.v4.i.bu;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;

abstract class at
  extends co
{
  private Runnable a;
  private android.support.v4.widget.at b;
  private boolean c;
  private int d = -1;
  private int e;
  private int f = -1;
  private VelocityTracker g;
  
  public at() {}
  
  public at(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  private void c()
  {
    if (this.g == null) {
      this.g = VelocityTracker.obtain();
    }
  }
  
  int a()
  {
    return b();
  }
  
  int a(CoordinatorLayout paramCoordinatorLayout, View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    int k = b();
    int j = 0;
    int i = j;
    if (paramInt2 != 0)
    {
      i = j;
      if (k >= paramInt2)
      {
        i = j;
        if (k <= paramInt3)
        {
          paramInt1 = aw.a(paramInt1, paramInt2, paramInt3);
          i = j;
          if (k != paramInt1)
          {
            a(paramInt1);
            i = k - paramInt1;
          }
        }
      }
    }
    return i;
  }
  
  int a(View paramView)
  {
    return paramView.getHeight();
  }
  
  void a(CoordinatorLayout paramCoordinatorLayout, View paramView) {}
  
  final boolean a(CoordinatorLayout paramCoordinatorLayout, View paramView, int paramInt1, int paramInt2, float paramFloat)
  {
    if (this.a != null)
    {
      paramView.removeCallbacks(this.a);
      this.a = null;
    }
    if (this.b == null) {
      this.b = android.support.v4.widget.at.a(paramView.getContext());
    }
    this.b.a(0, b(), 0, Math.round(paramFloat), 0, 0, paramInt1, paramInt2);
    if (this.b.g())
    {
      this.a = new au(this, paramCoordinatorLayout, paramView);
      bu.a(paramView, this.a);
      return true;
    }
    a(paramCoordinatorLayout, paramView);
    return false;
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, View paramView, MotionEvent paramMotionEvent)
  {
    if (this.f < 0) {
      this.f = ViewConfiguration.get(paramCoordinatorLayout.getContext()).getScaledTouchSlop();
    }
    if ((paramMotionEvent.getAction() == 2) && (this.c)) {
      return true;
    }
    switch (az.a(paramMotionEvent))
    {
    }
    for (;;)
    {
      if (this.g != null) {
        this.g.addMovement(paramMotionEvent);
      }
      return this.c;
      this.c = false;
      int i = (int)paramMotionEvent.getX();
      int j = (int)paramMotionEvent.getY();
      if ((c(paramView)) && (paramCoordinatorLayout.a(paramView, i, j)))
      {
        this.e = j;
        this.d = az.b(paramMotionEvent, 0);
        c();
        continue;
        i = this.d;
        if (i != -1)
        {
          i = az.a(paramMotionEvent, i);
          if (i != -1)
          {
            i = (int)az.d(paramMotionEvent, i);
            if (Math.abs(i - this.e) > this.f)
            {
              this.c = true;
              this.e = i;
              continue;
              this.c = false;
              this.d = -1;
              if (this.g != null)
              {
                this.g.recycle();
                this.g = null;
              }
            }
          }
        }
      }
    }
  }
  
  int a_(CoordinatorLayout paramCoordinatorLayout, View paramView, int paramInt)
  {
    return a(paramCoordinatorLayout, paramView, paramInt, Integer.MIN_VALUE, Integer.MAX_VALUE);
  }
  
  final int b(CoordinatorLayout paramCoordinatorLayout, View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    return a(paramCoordinatorLayout, paramView, a() - paramInt1, paramInt2, paramInt3);
  }
  
  int b(View paramView)
  {
    return -paramView.getHeight();
  }
  
  public boolean b(CoordinatorLayout paramCoordinatorLayout, View paramView, MotionEvent paramMotionEvent)
  {
    boolean bool2 = false;
    if (this.f < 0) {
      this.f = ViewConfiguration.get(paramCoordinatorLayout.getContext()).getScaledTouchSlop();
    }
    switch (az.a(paramMotionEvent))
    {
    }
    for (;;)
    {
      if (this.g != null) {
        this.g.addMovement(paramMotionEvent);
      }
      boolean bool1 = true;
      do
      {
        do
        {
          do
          {
            return bool1;
            i = (int)paramMotionEvent.getX();
            j = (int)paramMotionEvent.getY();
            bool1 = bool2;
          } while (!paramCoordinatorLayout.a(paramView, i, j));
          bool1 = bool2;
        } while (!c(paramView));
        this.e = j;
        this.d = az.b(paramMotionEvent, 0);
        c();
        break;
        i = az.a(paramMotionEvent, this.d);
        bool1 = bool2;
      } while (i == -1);
      int k = (int)az.d(paramMotionEvent, i);
      int j = this.e - k;
      int i = j;
      if (!this.c)
      {
        i = j;
        if (Math.abs(j) > this.f)
        {
          this.c = true;
          if (j <= 0) {
            break label260;
          }
        }
      }
      label260:
      for (i = j - this.f; this.c; i = j + this.f)
      {
        this.e = k;
        b(paramCoordinatorLayout, paramView, i, b(paramView), 0);
        break;
      }
      if (this.g != null)
      {
        this.g.addMovement(paramMotionEvent);
        this.g.computeCurrentVelocity(1000);
        float f1 = bp.b(this.g, this.d);
        a(paramCoordinatorLayout, paramView, -a(paramView), 0, f1);
      }
      this.c = false;
      this.d = -1;
      if (this.g != null)
      {
        this.g.recycle();
        this.g = null;
      }
    }
  }
  
  boolean c(View paramView)
  {
    return false;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/design/widget/at.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */