package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.support.design.i;
import android.support.v4.i.az;
import android.support.v4.i.bi;
import android.support.v4.i.bp;
import android.support.v4.i.bu;
import android.support.v4.widget.bk;
import android.support.v4.widget.bn;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

public class BottomSheetBehavior
  extends s
{
  private float a;
  private int b;
  private int c;
  private int d;
  private boolean e;
  private int f = 4;
  private bk g;
  private boolean h;
  private int i;
  private boolean j;
  private int k;
  private WeakReference l;
  private WeakReference m;
  private k n;
  private VelocityTracker o;
  private int p;
  private int q;
  private boolean r;
  private final bn s = new j(this);
  
  public BottomSheetBehavior() {}
  
  public BottomSheetBehavior(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, i.BottomSheetBehavior_Params);
    a(paramAttributeSet.getDimensionPixelSize(i.BottomSheetBehavior_Params_behavior_peekHeight, 0));
    a(paramAttributeSet.getBoolean(i.BottomSheetBehavior_Params_behavior_hideable, false));
    paramAttributeSet.recycle();
    this.a = ViewConfiguration.get(paramContext).getScaledMaximumFlingVelocity();
  }
  
  private View a(View paramView)
  {
    if ((paramView instanceof bi)) {
      return paramView;
    }
    if ((paramView instanceof ViewGroup))
    {
      paramView = (ViewGroup)paramView;
      int i2 = paramView.getChildCount();
      int i1 = 0;
      while (i1 < i2)
      {
        View localView = a(paramView.getChildAt(i1));
        if (localView != null) {
          return localView;
        }
        i1 += 1;
      }
    }
    return null;
  }
  
  private void a()
  {
    this.p = -1;
    if (this.o != null)
    {
      this.o.recycle();
      this.o = null;
    }
  }
  
  private boolean a(View paramView, float paramFloat)
  {
    if (paramView.getTop() < this.d) {}
    while (Math.abs(paramView.getTop() + 0.1F * paramFloat - this.d) / this.b <= 0.5F) {
      return false;
    }
    return true;
  }
  
  private float b()
  {
    this.o.computeCurrentVelocity(1000, this.a);
    return bp.b(this.o, this.p);
  }
  
  private void b(int paramInt)
  {
    if (this.f == paramInt) {}
    View localView;
    do
    {
      return;
      this.f = paramInt;
      localView = (View)this.l.get();
    } while ((localView == null) || (this.n == null));
    this.n.a(localView, paramInt);
  }
  
  private void c(int paramInt)
  {
    View localView = (View)this.l.get();
    if ((localView != null) && (this.n != null))
    {
      if (paramInt > this.d) {
        this.n.a(localView, (this.d - paramInt) / this.b);
      }
    }
    else {
      return;
    }
    this.n.a(localView, (this.d - paramInt) / (this.d - this.c));
  }
  
  public final void a(int paramInt)
  {
    this.b = Math.max(0, paramInt);
    this.d = (this.k - paramInt);
  }
  
  public void a(CoordinatorLayout paramCoordinatorLayout, View paramView, Parcelable paramParcelable)
  {
    paramParcelable = (l)paramParcelable;
    super.a(paramCoordinatorLayout, paramView, paramParcelable.getSuperState());
    if ((paramParcelable.a == 1) || (paramParcelable.a == 2))
    {
      this.f = 4;
      return;
    }
    this.f = paramParcelable.a;
  }
  
  public void a(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2)
  {
    int i2 = 3;
    if (paramView1.getTop() == this.c) {
      b(3);
    }
    while ((paramView2 != this.m.get()) || (!this.j)) {
      return;
    }
    int i1;
    if (this.i > 0)
    {
      i1 = this.c;
      if (!this.g.a(paramView1, paramView1.getLeft(), i1)) {
        break label194;
      }
      b(2);
      bu.a(paramView1, new n(this, paramView1, i2));
    }
    for (;;)
    {
      this.j = false;
      return;
      if ((this.e) && (a(paramView1, b())))
      {
        i1 = this.k;
        i2 = 5;
        break;
      }
      if (this.i == 0)
      {
        i1 = paramView1.getTop();
        if (Math.abs(i1 - this.c) < Math.abs(i1 - this.d))
        {
          i1 = this.c;
          break;
        }
        i1 = this.d;
        i2 = 4;
        break;
      }
      i1 = this.d;
      i2 = 4;
      break;
      label194:
      b(i2);
    }
  }
  
  public void a(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2, int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    if (paramView2 != (View)this.m.get()) {
      return;
    }
    paramInt1 = paramView1.getTop();
    int i1 = paramInt1 - paramInt2;
    if (paramInt2 > 0) {
      if (i1 < this.c)
      {
        paramArrayOfInt[1] = (paramInt1 - this.c);
        bu.e(paramView1, -paramArrayOfInt[1]);
        b(3);
      }
    }
    for (;;)
    {
      c(paramView1.getTop());
      this.i = paramInt2;
      this.j = true;
      return;
      paramArrayOfInt[1] = paramInt2;
      bu.e(paramView1, -paramInt2);
      b(1);
      continue;
      if ((paramInt2 < 0) && (!bu.b(paramView2, -1))) {
        if ((i1 <= this.d) || (this.e))
        {
          paramArrayOfInt[1] = paramInt2;
          bu.e(paramView1, -paramInt2);
          b(1);
        }
        else
        {
          paramArrayOfInt[1] = (paramInt1 - this.d);
          bu.e(paramView1, -paramArrayOfInt[1]);
          b(4);
        }
      }
    }
  }
  
  public void a(boolean paramBoolean)
  {
    this.e = paramBoolean;
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, View paramView, int paramInt)
  {
    if ((this.f != 1) && (this.f != 2)) {
      paramCoordinatorLayout.a(paramView, paramInt);
    }
    this.k = paramCoordinatorLayout.getHeight();
    this.c = Math.max(0, this.k - paramView.getHeight());
    this.d = Math.max(this.k - this.b, this.c);
    if (this.f == 3) {
      bu.e(paramView, this.c);
    }
    for (;;)
    {
      if (this.g == null) {
        this.g = bk.a(paramCoordinatorLayout, this.s);
      }
      this.l = new WeakReference(paramView);
      this.m = new WeakReference(a(paramView));
      return true;
      if ((this.e) && (this.f == 5)) {
        bu.e(paramView, this.k);
      } else if (this.f == 4) {
        bu.e(paramView, this.d);
      }
    }
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, View paramView, MotionEvent paramMotionEvent)
  {
    boolean bool2 = true;
    if (!paramView.isShown()) {
      return false;
    }
    int i1 = az.a(paramMotionEvent);
    if (i1 == 0) {
      a();
    }
    if (this.o == null) {
      this.o = VelocityTracker.obtain();
    }
    this.o.addMovement(paramMotionEvent);
    switch (i1)
    {
    }
    while ((!this.h) && (this.g.a(paramMotionEvent)))
    {
      return true;
      this.r = false;
      this.p = -1;
      if (this.h)
      {
        this.h = false;
        return false;
        int i2 = (int)paramMotionEvent.getX();
        this.q = ((int)paramMotionEvent.getY());
        View localView = (View)this.m.get();
        if ((localView != null) && (paramCoordinatorLayout.a(localView, i2, this.q)))
        {
          this.p = paramMotionEvent.getPointerId(paramMotionEvent.getActionIndex());
          this.r = true;
        }
        if ((this.p == -1) && (!paramCoordinatorLayout.a(paramView, i2, this.q))) {}
        for (bool1 = true;; bool1 = false)
        {
          this.h = bool1;
          break;
        }
      }
    }
    paramView = (View)this.m.get();
    if ((i1 == 2) && (paramView != null) && (!this.h) && (this.f != 1) && (!paramCoordinatorLayout.a(paramView, (int)paramMotionEvent.getX(), (int)paramMotionEvent.getY())) && (Math.abs(this.q - paramMotionEvent.getY()) > this.g.a())) {}
    for (boolean bool1 = bool2;; bool1 = false) {
      return bool1;
    }
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2, float paramFloat1, float paramFloat2)
  {
    return (paramView2 == this.m.get()) && ((this.f != 3) || (super.a(paramCoordinatorLayout, paramView1, paramView2, paramFloat1, paramFloat2)));
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2, View paramView3, int paramInt)
  {
    boolean bool = false;
    this.i = 0;
    this.j = false;
    if ((paramInt & 0x2) != 0) {
      bool = true;
    }
    return bool;
  }
  
  public Parcelable b(CoordinatorLayout paramCoordinatorLayout, View paramView)
  {
    return new l(super.b(paramCoordinatorLayout, paramView), this.f);
  }
  
  public boolean b(CoordinatorLayout paramCoordinatorLayout, View paramView, MotionEvent paramMotionEvent)
  {
    boolean bool2 = true;
    boolean bool1;
    if (!paramView.isShown()) {
      bool1 = false;
    }
    do
    {
      int i1;
      do
      {
        do
        {
          return bool1;
          i1 = az.a(paramMotionEvent);
          if (this.f != 1) {
            break;
          }
          bool1 = bool2;
        } while (i1 == 0);
        this.g.b(paramMotionEvent);
        if (i1 == 0) {
          a();
        }
        if (this.o == null) {
          this.o = VelocityTracker.obtain();
        }
        this.o.addMovement(paramMotionEvent);
        bool1 = bool2;
      } while (i1 != 2);
      bool1 = bool2;
    } while (Math.abs(this.q - paramMotionEvent.getY()) <= this.g.a());
    this.g.a(paramView, paramMotionEvent.getPointerId(paramMotionEvent.getActionIndex()));
    return true;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/design/widget/BottomSheetBehavior.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */