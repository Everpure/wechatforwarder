package android.support.v7.widget;

import android.os.SystemClock;
import android.support.v4.i.az;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.ViewParent;

public abstract class dl
  implements View.OnTouchListener
{
  private final float a;
  private final int b;
  private final int c;
  private final View d;
  private Runnable e;
  private Runnable f;
  private boolean g;
  private boolean h;
  private int i;
  private final int[] j = new int[2];
  
  public dl(View paramView)
  {
    this.d = paramView;
    this.a = ViewConfiguration.get(paramView.getContext()).getScaledTouchSlop();
    this.b = ViewConfiguration.getTapTimeout();
    this.c = ((this.b + ViewConfiguration.getLongPressTimeout()) / 2);
  }
  
  private boolean a(MotionEvent paramMotionEvent)
  {
    View localView = this.d;
    if (!localView.isEnabled()) {}
    int k;
    do
    {
      return false;
      switch (az.a(paramMotionEvent))
      {
      default: 
        return false;
      case 0: 
        this.i = paramMotionEvent.getPointerId(0);
        this.h = false;
        if (this.e == null) {
          this.e = new dm(this, null);
        }
        localView.postDelayed(this.e, this.b);
        if (this.f == null) {
          this.f = new dn(this, null);
        }
        localView.postDelayed(this.f, this.c);
        return false;
      case 2: 
        k = paramMotionEvent.findPointerIndex(this.i);
      }
    } while ((k < 0) || (a(localView, paramMotionEvent.getX(k), paramMotionEvent.getY(k), this.a)));
    d();
    localView.getParent().requestDisallowInterceptTouchEvent(true);
    return true;
    d();
    return false;
  }
  
  private static boolean a(View paramView, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    return (paramFloat1 >= -paramFloat3) && (paramFloat2 >= -paramFloat3) && (paramFloat1 < paramView.getRight() - paramView.getLeft() + paramFloat3) && (paramFloat2 < paramView.getBottom() - paramView.getTop() + paramFloat3);
  }
  
  private boolean a(View paramView, MotionEvent paramMotionEvent)
  {
    int[] arrayOfInt = this.j;
    paramView.getLocationOnScreen(arrayOfInt);
    paramMotionEvent.offsetLocation(-arrayOfInt[0], -arrayOfInt[1]);
    return true;
  }
  
  private boolean b(MotionEvent paramMotionEvent)
  {
    boolean bool1 = true;
    View localView = this.d;
    Object localObject = a();
    if ((localObject == null) || (!((dg)localObject).k())) {}
    do
    {
      return false;
      localObject = dg.a((dg)localObject);
    } while ((localObject == null) || (!((dk)localObject).isShown()));
    MotionEvent localMotionEvent = MotionEvent.obtainNoHistory(paramMotionEvent);
    b(localView, localMotionEvent);
    a((View)localObject, localMotionEvent);
    boolean bool2 = ((dk)localObject).a(localMotionEvent, this.i);
    localMotionEvent.recycle();
    int k = az.a(paramMotionEvent);
    if ((k != 1) && (k != 3))
    {
      k = 1;
      if ((!bool2) || (k == 0)) {
        break label124;
      }
    }
    for (;;)
    {
      return bool1;
      k = 0;
      break;
      label124:
      bool1 = false;
    }
  }
  
  private boolean b(View paramView, MotionEvent paramMotionEvent)
  {
    int[] arrayOfInt = this.j;
    paramView.getLocationOnScreen(arrayOfInt);
    paramMotionEvent.offsetLocation(arrayOfInt[0], arrayOfInt[1]);
    return true;
  }
  
  private void d()
  {
    if (this.f != null) {
      this.d.removeCallbacks(this.f);
    }
    if (this.e != null) {
      this.d.removeCallbacks(this.e);
    }
  }
  
  private void e()
  {
    d();
    View localView = this.d;
    if ((!localView.isEnabled()) || (localView.isLongClickable())) {}
    while (!b()) {
      return;
    }
    localView.getParent().requestDisallowInterceptTouchEvent(true);
    long l = SystemClock.uptimeMillis();
    MotionEvent localMotionEvent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
    localView.onTouchEvent(localMotionEvent);
    localMotionEvent.recycle();
    this.g = true;
    this.h = true;
  }
  
  public abstract dg a();
  
  protected boolean b()
  {
    dg localdg = a();
    if ((localdg != null) && (!localdg.k())) {
      localdg.c();
    }
    return true;
  }
  
  protected boolean c()
  {
    dg localdg = a();
    if ((localdg != null) && (localdg.k())) {
      localdg.i();
    }
    return true;
  }
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    boolean bool2 = false;
    boolean bool3 = this.g;
    if (bool3)
    {
      if (this.h) {
        bool1 = b(paramMotionEvent);
      }
      for (;;)
      {
        this.g = bool1;
        if (!bool1)
        {
          bool1 = bool2;
          if (!bool3) {}
        }
        else
        {
          bool1 = true;
        }
        return bool1;
        if ((b(paramMotionEvent)) || (!c())) {
          bool1 = true;
        } else {
          bool1 = false;
        }
      }
    }
    if ((a(paramMotionEvent)) && (b())) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      if (bool1)
      {
        long l = SystemClock.uptimeMillis();
        paramView = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
        this.d.onTouchEvent(paramView);
        paramView.recycle();
      }
      break;
    }
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/dl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */