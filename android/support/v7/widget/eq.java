package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.i.a.a;
import android.support.v4.i.a.aj;
import android.support.v4.i.a.g;
import android.support.v4.i.a.q;
import android.support.v4.i.a.r;
import android.support.v4.i.bu;
import android.support.v7.e.b;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;

public abstract class eq
{
  private boolean a = false;
  private boolean b = false;
  private boolean c = true;
  private int d;
  private int e;
  ca p;
  RecyclerView q;
  fc r;
  boolean s = false;
  
  public static int a(int paramInt1, int paramInt2, int paramInt3)
  {
    int j = View.MeasureSpec.getMode(paramInt1);
    int i = View.MeasureSpec.getSize(paramInt1);
    paramInt1 = i;
    switch (j)
    {
    default: 
      paramInt1 = Math.max(paramInt2, paramInt3);
    case 1073741824: 
      return paramInt1;
    }
    return Math.min(i, Math.max(paramInt2, paramInt3));
  }
  
  public static int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
  {
    int j = 0;
    int k = 0;
    int i = Math.max(0, paramInt1 - paramInt3);
    if (paramBoolean) {
      if (paramInt4 >= 0)
      {
        paramInt1 = 1073741824;
        paramInt3 = paramInt4;
      }
    }
    for (;;)
    {
      return View.MeasureSpec.makeMeasureSpec(paramInt3, paramInt1);
      if (paramInt4 == -1)
      {
        switch (paramInt2)
        {
        default: 
          paramInt2 = 0;
          paramInt1 = j;
        }
        for (;;)
        {
          paramInt3 = paramInt1;
          paramInt1 = paramInt2;
          break;
          paramInt1 = i;
          continue;
          paramInt2 = 0;
          paramInt1 = j;
        }
      }
      if (paramInt4 == -2)
      {
        paramInt3 = 0;
        paramInt1 = k;
        continue;
        if (paramInt4 >= 0)
        {
          paramInt1 = 1073741824;
          paramInt3 = paramInt4;
          continue;
        }
        if (paramInt4 == -1)
        {
          paramInt1 = paramInt2;
          paramInt3 = i;
          continue;
        }
        if (paramInt4 == -2)
        {
          if (paramInt2 != Integer.MIN_VALUE)
          {
            paramInt1 = k;
            paramInt3 = i;
            if (paramInt2 != 1073741824) {
              continue;
            }
          }
          paramInt1 = Integer.MIN_VALUE;
          paramInt3 = i;
          continue;
        }
      }
      paramInt3 = 0;
      paramInt1 = k;
    }
  }
  
  public static er a(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    er localer = new er();
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, b.RecyclerView, paramInt1, paramInt2);
    localer.a = paramContext.getInt(b.RecyclerView_android_orientation, 1);
    localer.b = paramContext.getInt(b.RecyclerView_spanCount, 1);
    localer.c = paramContext.getBoolean(b.RecyclerView_reverseLayout, false);
    localer.d = paramContext.getBoolean(b.RecyclerView_stackFromEnd, false);
    paramContext.recycle();
    return localer;
  }
  
  private void a(int paramInt, View paramView)
  {
    this.p.d(paramInt);
  }
  
  private void a(ex paramex, int paramInt, View paramView)
  {
    fh localfh = RecyclerView.c(paramView);
    if (localfh.c()) {
      return;
    }
    if ((localfh.n()) && (!localfh.q()) && (!RecyclerView.f(this.q).b()))
    {
      f(paramInt);
      paramex.b(localfh);
      return;
    }
    g(paramInt);
    paramex.c(paramView);
    this.q.d.h(localfh);
  }
  
  private void a(fc paramfc)
  {
    if (this.r == paramfc) {
      this.r = null;
    }
  }
  
  private void a(View paramView, int paramInt, boolean paramBoolean)
  {
    fh localfh = RecyclerView.c(paramView);
    es locales;
    if ((paramBoolean) || (localfh.q()))
    {
      this.q.d.e(localfh);
      locales = (es)paramView.getLayoutParams();
      if ((!localfh.k()) && (!localfh.i())) {
        break label128;
      }
      if (!localfh.i()) {
        break label120;
      }
      localfh.j();
      label68:
      this.p.a(paramView, paramInt, paramView.getLayoutParams(), false);
    }
    for (;;)
    {
      if (locales.d)
      {
        localfh.a.invalidate();
        locales.d = false;
      }
      return;
      this.q.d.f(localfh);
      break;
      label120:
      localfh.l();
      break label68;
      label128:
      if (paramView.getParent() == this.q)
      {
        int j = this.p.b(paramView);
        int i = paramInt;
        if (paramInt == -1) {
          i = this.p.b();
        }
        if (j == -1) {
          throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.q.indexOfChild(paramView));
        }
        if (j != i) {
          this.q.e.c(j, i);
        }
      }
      else
      {
        this.p.a(paramView, paramInt, false);
        locales.c = true;
        if ((this.r != null) && (this.r.c())) {
          this.r.b(paramView);
        }
      }
    }
  }
  
  private static boolean b(int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool2 = true;
    int i = View.MeasureSpec.getMode(paramInt2);
    paramInt2 = View.MeasureSpec.getSize(paramInt2);
    boolean bool1;
    if ((paramInt3 > 0) && (paramInt1 != paramInt3)) {
      bool1 = false;
    }
    do
    {
      do
      {
        return bool1;
        bool1 = bool2;
        switch (i)
        {
        case 0: 
        default: 
          return false;
        case -2147483648: 
          bool1 = bool2;
        }
      } while (paramInt2 >= paramInt1);
      return false;
      bool1 = bool2;
    } while (paramInt2 == paramInt1);
    return false;
  }
  
  public int A()
  {
    if (this.q != null) {
      return this.q.getPaddingBottom();
    }
    return 0;
  }
  
  public View B()
  {
    if (this.q == null) {}
    View localView;
    do
    {
      return null;
      localView = this.q.getFocusedChild();
    } while ((localView == null) || (this.p.c(localView)));
    return localView;
  }
  
  public int C()
  {
    return bu.o(this.q);
  }
  
  public int D()
  {
    return bu.p(this.q);
  }
  
  void E()
  {
    if (this.r != null) {
      this.r.a();
    }
  }
  
  public void F()
  {
    this.a = true;
  }
  
  boolean G()
  {
    boolean bool2 = false;
    int j = s();
    int i = 0;
    for (;;)
    {
      boolean bool1 = bool2;
      if (i < j)
      {
        ViewGroup.LayoutParams localLayoutParams = h(i).getLayoutParams();
        if ((localLayoutParams.width < 0) && (localLayoutParams.height < 0)) {
          bool1 = true;
        }
      }
      else
      {
        return bool1;
      }
      i += 1;
    }
  }
  
  public int a(int paramInt, ex paramex, fe paramfe)
  {
    return 0;
  }
  
  public int a(ex paramex, fe paramfe)
  {
    if ((this.q == null) || (RecyclerView.f(this.q) == null)) {}
    while (!e()) {
      return 1;
    }
    return RecyclerView.f(this.q).a();
  }
  
  public abstract es a();
  
  public es a(Context paramContext, AttributeSet paramAttributeSet)
  {
    return new es(paramContext, paramAttributeSet);
  }
  
  public es a(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof es)) {
      return new es((es)paramLayoutParams);
    }
    if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams)) {
      return new es((ViewGroup.MarginLayoutParams)paramLayoutParams);
    }
    return new es(paramLayoutParams);
  }
  
  public View a(View paramView, int paramInt, ex paramex, fe paramfe)
  {
    return null;
  }
  
  void a(int paramInt1, int paramInt2)
  {
    this.d = paramInt1;
    this.e = paramInt2;
  }
  
  public void a(int paramInt, ex paramex)
  {
    View localView = h(paramInt);
    f(paramInt);
    paramex.a(localView);
  }
  
  public void a(Rect paramRect, int paramInt1, int paramInt2)
  {
    int i = paramRect.width();
    int j = x();
    int k = z();
    int m = paramRect.height();
    int n = y();
    int i1 = A();
    d(a(paramInt1, i + j + k, C()), a(paramInt2, m + n + i1, D()));
  }
  
  public void a(Parcelable paramParcelable) {}
  
  void a(g paramg)
  {
    a(this.q.a, this.q.g, paramg);
  }
  
  public void a(RecyclerView paramRecyclerView) {}
  
  public void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2) {}
  
  public void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2, Object paramObject)
  {
    c(paramRecyclerView, paramInt1, paramInt2);
  }
  
  public void a(RecyclerView paramRecyclerView, ex paramex)
  {
    e(paramRecyclerView);
  }
  
  public void a(eg parameg1, eg parameg2) {}
  
  public void a(ex paramex)
  {
    int i = s() - 1;
    while (i >= 0)
    {
      a(paramex, i, h(i));
      i -= 1;
    }
  }
  
  public void a(ex paramex, fe paramfe, int paramInt1, int paramInt2)
  {
    this.q.d(paramInt1, paramInt2);
  }
  
  public void a(ex paramex, fe paramfe, g paramg)
  {
    if ((bu.b(this.q, -1)) || (bu.a(this.q, -1)))
    {
      paramg.a(8192);
      paramg.a(true);
    }
    if ((bu.b(this.q, 1)) || (bu.a(this.q, 1)))
    {
      paramg.a(4096);
      paramg.a(true);
    }
    paramg.a(q.a(a(paramex, paramfe), b(paramex, paramfe), e(paramex, paramfe), d(paramex, paramfe)));
  }
  
  public void a(ex paramex, fe paramfe, View paramView, g paramg)
  {
    int i;
    if (e())
    {
      i = d(paramView);
      if (!d()) {
        break label51;
      }
    }
    label51:
    for (int j = d(paramView);; j = 0)
    {
      paramg.b(r.a(i, 1, j, 1, false, false));
      return;
      i = 0;
      break;
    }
  }
  
  public void a(ex paramex, fe paramfe, AccessibilityEvent paramAccessibilityEvent)
  {
    boolean bool2 = true;
    paramex = a.a(paramAccessibilityEvent);
    if ((this.q == null) || (paramex == null)) {
      return;
    }
    boolean bool1 = bool2;
    if (!bu.b(this.q, 1))
    {
      bool1 = bool2;
      if (!bu.b(this.q, -1))
      {
        bool1 = bool2;
        if (!bu.a(this.q, -1)) {
          if (!bu.a(this.q, 1)) {
            break label111;
          }
        }
      }
    }
    label111:
    for (bool1 = bool2;; bool1 = false)
    {
      paramex.a(bool1);
      if (RecyclerView.f(this.q) == null) {
        break;
      }
      paramex.a(RecyclerView.f(this.q).a());
      return;
    }
  }
  
  public void a(View paramView)
  {
    a(paramView, -1);
  }
  
  public void a(View paramView, int paramInt)
  {
    a(paramView, paramInt, true);
  }
  
  public void a(View paramView, int paramInt1, int paramInt2)
  {
    es locales = (es)paramView.getLayoutParams();
    Rect localRect = this.q.g(paramView);
    int k = localRect.left;
    int m = localRect.right;
    int i = localRect.top;
    int j = localRect.bottom;
    paramInt1 = a(v(), t(), k + m + paramInt1 + (x() + z() + locales.leftMargin + locales.rightMargin), locales.width, d());
    paramInt2 = a(w(), u(), j + i + paramInt2 + (y() + A() + locales.topMargin + locales.bottomMargin), locales.height, e());
    if (b(paramView, paramInt1, paramInt2, locales)) {
      paramView.measure(paramInt1, paramInt2);
    }
  }
  
  public void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Rect localRect = ((es)paramView.getLayoutParams()).b;
    paramView.layout(localRect.left + paramInt1, localRect.top + paramInt2, paramInt3 - localRect.right, paramInt4 - localRect.bottom);
  }
  
  public void a(View paramView, int paramInt, es parames)
  {
    fh localfh = RecyclerView.c(paramView);
    if (localfh.q()) {
      this.q.d.e(localfh);
    }
    for (;;)
    {
      this.p.a(paramView, paramInt, parames, localfh.q());
      return;
      this.q.d.f(localfh);
    }
  }
  
  public void a(View paramView, Rect paramRect)
  {
    if (this.q == null)
    {
      paramRect.set(0, 0, 0, 0);
      return;
    }
    paramRect.set(this.q.g(paramView));
  }
  
  void a(View paramView, g paramg)
  {
    fh localfh = RecyclerView.c(paramView);
    if ((localfh != null) && (!localfh.q()) && (!this.p.c(localfh.a))) {
      a(this.q.a, this.q.g, paramView, paramg);
    }
  }
  
  public void a(View paramView, ex paramex)
  {
    c(paramView);
    paramex.a(paramView);
  }
  
  public void a(AccessibilityEvent paramAccessibilityEvent)
  {
    a(this.q.a, this.q.g, paramAccessibilityEvent);
  }
  
  public void a(String paramString)
  {
    if (this.q != null) {
      this.q.a(paramString);
    }
  }
  
  boolean a(int paramInt, Bundle paramBundle)
  {
    return a(this.q.a, this.q.g, paramInt, paramBundle);
  }
  
  public boolean a(RecyclerView paramRecyclerView, fe paramfe, View paramView1, View paramView2)
  {
    return a(paramRecyclerView, paramView1, paramView2);
  }
  
  public boolean a(RecyclerView paramRecyclerView, View paramView, Rect paramRect, boolean paramBoolean)
  {
    int i2 = x();
    int m = y();
    int i3 = v() - z();
    int i1 = w();
    int i6 = A();
    int i4 = paramView.getLeft() + paramRect.left - paramView.getScrollX();
    int n = paramView.getTop() + paramRect.top - paramView.getScrollY();
    int i5 = i4 + paramRect.width();
    int i7 = paramRect.height();
    int i = Math.min(0, i4 - i2);
    int j = Math.min(0, n - m);
    int k = Math.max(0, i5 - i3);
    i1 = Math.max(0, n + i7 - (i1 - i6));
    if (q() == 1) {
      if (k != 0)
      {
        i = k;
        if (j == 0) {
          break label217;
        }
        label154:
        if ((i == 0) && (j == 0)) {
          break label243;
        }
        if (!paramBoolean) {
          break label232;
        }
        paramRecyclerView.scrollBy(i, j);
      }
    }
    for (;;)
    {
      return true;
      i = Math.max(i, i5 - i3);
      break;
      if (i != 0) {
        break;
      }
      for (;;)
      {
        i = Math.min(i4 - i2, k);
      }
      label217:
      j = Math.min(n - m, i1);
      break label154;
      label232:
      paramRecyclerView.a(i, j);
    }
    label243:
    return false;
  }
  
  @Deprecated
  public boolean a(RecyclerView paramRecyclerView, View paramView1, View paramView2)
  {
    return (p()) || (paramRecyclerView.j());
  }
  
  public boolean a(RecyclerView paramRecyclerView, ArrayList paramArrayList, int paramInt1, int paramInt2)
  {
    return false;
  }
  
  public boolean a(es parames)
  {
    return parames != null;
  }
  
  public boolean a(ex paramex, fe paramfe, int paramInt, Bundle paramBundle)
  {
    if (this.q == null) {}
    int i;
    do
    {
      return false;
      switch (paramInt)
      {
      default: 
        paramInt = 0;
        i = 0;
      }
    } while ((i == 0) && (paramInt == 0));
    this.q.scrollBy(paramInt, i);
    return true;
    if (bu.b(this.q, -1)) {}
    for (paramInt = -(w() - y() - A());; paramInt = 0)
    {
      i = paramInt;
      int j;
      if (bu.a(this.q, -1))
      {
        j = -(v() - x() - z());
        i = paramInt;
        paramInt = j;
        break;
        if (!bu.b(this.q, 1)) {
          break label207;
        }
      }
      label207:
      for (paramInt = w() - y() - A();; paramInt = 0)
      {
        i = paramInt;
        if (bu.a(this.q, 1))
        {
          j = v();
          int k = x();
          int m = z();
          i = paramInt;
          paramInt = j - k - m;
          break;
        }
        paramInt = 0;
        break;
      }
    }
  }
  
  public boolean a(ex paramex, fe paramfe, View paramView, int paramInt, Bundle paramBundle)
  {
    return false;
  }
  
  boolean a(View paramView, int paramInt1, int paramInt2, es parames)
  {
    return (!this.c) || (!b(paramView.getMeasuredWidth(), paramInt1, parames.width)) || (!b(paramView.getMeasuredHeight(), paramInt2, parames.height));
  }
  
  boolean a(View paramView, int paramInt, Bundle paramBundle)
  {
    return a(this.q.a, this.q.g, paramView, paramInt, paramBundle);
  }
  
  public boolean a(Runnable paramRunnable)
  {
    if (this.q != null) {
      return this.q.removeCallbacks(paramRunnable);
    }
    return false;
  }
  
  public int b(int paramInt, ex paramex, fe paramfe)
  {
    return 0;
  }
  
  public int b(ex paramex, fe paramfe)
  {
    if ((this.q == null) || (RecyclerView.f(this.q) == null)) {}
    while (!d()) {
      return 1;
    }
    return RecyclerView.f(this.q).a();
  }
  
  public int b(fe paramfe)
  {
    return 0;
  }
  
  void b(int paramInt1, int paramInt2)
  {
    int j = Integer.MAX_VALUE;
    int i = Integer.MIN_VALUE;
    int i5 = s();
    if (i5 == 0)
    {
      this.q.d(paramInt1, paramInt2);
      return;
    }
    int n = 0;
    int k = Integer.MIN_VALUE;
    int m = Integer.MAX_VALUE;
    int i1;
    int i3;
    int i2;
    if (n < i5)
    {
      View localView = h(n);
      es locales = (es)localView.getLayoutParams();
      int i4 = h(localView) - locales.leftMargin;
      i1 = j(localView);
      i3 = locales.rightMargin + i1;
      i2 = i(localView) - locales.topMargin;
      i1 = k(localView);
      i1 = locales.bottomMargin + i1;
      if (i4 >= m) {
        break label221;
      }
      m = i4;
    }
    label221:
    for (;;)
    {
      if (i3 > k) {
        k = i3;
      }
      for (;;)
      {
        if (i2 < j) {
          j = i2;
        }
        for (;;)
        {
          if (i1 > i) {
            i = i1;
          }
          for (;;)
          {
            n += 1;
            break;
            RecyclerView.o(this.q).set(m, j, k, i);
            a(RecyclerView.o(this.q), paramInt1, paramInt2);
            return;
          }
        }
      }
    }
  }
  
  void b(RecyclerView paramRecyclerView)
  {
    if (paramRecyclerView == null)
    {
      this.q = null;
      this.p = null;
      this.d = View.MeasureSpec.makeMeasureSpec(0, 1073741824);
      this.e = View.MeasureSpec.makeMeasureSpec(0, 1073741824);
      return;
    }
    this.q = paramRecyclerView;
    this.p = paramRecyclerView.c;
    this.d = View.MeasureSpec.makeMeasureSpec(paramRecyclerView.getWidth(), 1073741824);
    this.e = View.MeasureSpec.makeMeasureSpec(paramRecyclerView.getHeight(), 1073741824);
  }
  
  public void b(RecyclerView paramRecyclerView, int paramInt1, int paramInt2) {}
  
  void b(RecyclerView paramRecyclerView, ex paramex)
  {
    this.s = false;
    a(paramRecyclerView, paramex);
  }
  
  void b(ex paramex)
  {
    int j = paramex.d();
    int i = j - 1;
    if (i >= 0)
    {
      View localView = paramex.e(i);
      fh localfh = RecyclerView.c(localView);
      if (localfh.c()) {}
      for (;;)
      {
        i -= 1;
        break;
        localfh.a(false);
        if (localfh.r()) {
          this.q.removeDetachedView(localView, false);
        }
        if (this.q.f != null) {
          this.q.f.c(localfh);
        }
        localfh.a(true);
        paramex.b(localView);
      }
    }
    paramex.e();
    if (j > 0) {
      this.q.invalidate();
    }
  }
  
  public void b(View paramView)
  {
    b(paramView, -1);
  }
  
  public void b(View paramView, int paramInt)
  {
    a(paramView, paramInt, false);
  }
  
  public boolean b()
  {
    return false;
  }
  
  boolean b(View paramView, int paramInt1, int paramInt2, es parames)
  {
    return (paramView.isLayoutRequested()) || (!this.c) || (!b(paramView.getWidth(), paramInt1, parames.width)) || (!b(paramView.getHeight(), paramInt2, parames.height));
  }
  
  public int c(fe paramfe)
  {
    return 0;
  }
  
  public Parcelable c()
  {
    return null;
  }
  
  public View c(int paramInt)
  {
    int j = s();
    int i = 0;
    if (i < j)
    {
      View localView = h(i);
      fh localfh = RecyclerView.c(localView);
      if (localfh == null) {}
      while ((localfh.d() != paramInt) || (localfh.c()) || ((!this.q.g.a()) && (localfh.q())))
      {
        i += 1;
        break;
      }
      return localView;
    }
    return null;
  }
  
  public void c(int paramInt1, int paramInt2)
  {
    View localView = h(paramInt1);
    if (localView == null) {
      throw new IllegalArgumentException("Cannot move a child from non-existing index:" + paramInt1);
    }
    g(paramInt1);
    c(localView, paramInt2);
  }
  
  void c(RecyclerView paramRecyclerView)
  {
    this.s = true;
    d(paramRecyclerView);
  }
  
  public void c(RecyclerView paramRecyclerView, int paramInt1, int paramInt2) {}
  
  public void c(ex paramex)
  {
    int i = s() - 1;
    while (i >= 0)
    {
      if (!RecyclerView.c(h(i)).c()) {
        a(i, paramex);
      }
      i -= 1;
    }
  }
  
  public void c(ex paramex, fe paramfe)
  {
    Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
  }
  
  public void c(View paramView)
  {
    this.p.a(paramView);
  }
  
  public void c(View paramView, int paramInt)
  {
    a(paramView, paramInt, (es)paramView.getLayoutParams());
  }
  
  public void c(boolean paramBoolean)
  {
    this.b = paramBoolean;
  }
  
  public int d(ex paramex, fe paramfe)
  {
    return 0;
  }
  
  public int d(fe paramfe)
  {
    return 0;
  }
  
  public int d(View paramView)
  {
    return ((es)paramView.getLayoutParams()).e();
  }
  
  public View d(View paramView, int paramInt)
  {
    return null;
  }
  
  public void d(int paramInt) {}
  
  public void d(int paramInt1, int paramInt2)
  {
    RecyclerView.b(this.q, paramInt1, paramInt2);
  }
  
  public void d(RecyclerView paramRecyclerView) {}
  
  public boolean d()
  {
    return false;
  }
  
  public int e(fe paramfe)
  {
    return 0;
  }
  
  public View e(View paramView)
  {
    if (this.q == null) {}
    do
    {
      return null;
      paramView = this.q.b(paramView);
    } while ((paramView == null) || (this.p.c(paramView)));
    return paramView;
  }
  
  @Deprecated
  public void e(RecyclerView paramRecyclerView) {}
  
  public boolean e()
  {
    return false;
  }
  
  public boolean e(ex paramex, fe paramfe)
  {
    return false;
  }
  
  public int f(fe paramfe)
  {
    return 0;
  }
  
  public int f(View paramView)
  {
    Rect localRect = ((es)paramView.getLayoutParams()).b;
    int i = paramView.getMeasuredWidth();
    int j = localRect.left;
    return localRect.right + (i + j);
  }
  
  public void f(int paramInt)
  {
    if (h(paramInt) != null) {
      this.p.a(paramInt);
    }
  }
  
  void f(RecyclerView paramRecyclerView)
  {
    a(View.MeasureSpec.makeMeasureSpec(paramRecyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(paramRecyclerView.getHeight(), 1073741824));
  }
  
  public int g(fe paramfe)
  {
    return 0;
  }
  
  public int g(View paramView)
  {
    Rect localRect = ((es)paramView.getLayoutParams()).b;
    int i = paramView.getMeasuredHeight();
    int j = localRect.top;
    return localRect.bottom + (i + j);
  }
  
  public void g(int paramInt)
  {
    a(paramInt, h(paramInt));
  }
  
  public int h(View paramView)
  {
    return paramView.getLeft() - n(paramView);
  }
  
  public View h(int paramInt)
  {
    if (this.p != null) {
      return this.p.b(paramInt);
    }
    return null;
  }
  
  public int i(View paramView)
  {
    return paramView.getTop() - l(paramView);
  }
  
  public void i(int paramInt)
  {
    if (this.q != null) {
      this.q.b(paramInt);
    }
  }
  
  public int j(View paramView)
  {
    return paramView.getRight() + o(paramView);
  }
  
  public void j(int paramInt)
  {
    if (this.q != null) {
      this.q.a(paramInt);
    }
  }
  
  boolean j()
  {
    return false;
  }
  
  public int k(View paramView)
  {
    return paramView.getBottom() + m(paramView);
  }
  
  public void k(int paramInt) {}
  
  public int l(View paramView)
  {
    return ((es)paramView.getLayoutParams()).b.top;
  }
  
  public int m(View paramView)
  {
    return ((es)paramView.getLayoutParams()).b.bottom;
  }
  
  public void m()
  {
    if (this.q != null) {
      this.q.requestLayout();
    }
  }
  
  public int n(View paramView)
  {
    return ((es)paramView.getLayoutParams()).b.left;
  }
  
  public boolean n()
  {
    return this.s;
  }
  
  public int o(View paramView)
  {
    return ((es)paramView.getLayoutParams()).b.right;
  }
  
  public boolean o()
  {
    return (this.q != null) && (RecyclerView.p(this.q));
  }
  
  public boolean p()
  {
    return (this.r != null) && (this.r.c());
  }
  
  public int q()
  {
    return bu.h(this.q);
  }
  
  public int r()
  {
    return -1;
  }
  
  public int s()
  {
    if (this.p != null) {
      return this.p.b();
    }
    return 0;
  }
  
  public int t()
  {
    return View.MeasureSpec.getMode(this.d);
  }
  
  public int u()
  {
    return View.MeasureSpec.getMode(this.e);
  }
  
  public int v()
  {
    return View.MeasureSpec.getSize(this.d);
  }
  
  public int w()
  {
    return View.MeasureSpec.getSize(this.e);
  }
  
  public int x()
  {
    if (this.q != null) {
      return this.q.getPaddingLeft();
    }
    return 0;
  }
  
  public int y()
  {
    if (this.q != null) {
      return this.q.getPaddingTop();
    }
    return 0;
  }
  
  public int z()
  {
    if (this.q != null) {
      return this.q.getPaddingRight();
    }
    return 0;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/eq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */