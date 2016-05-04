package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.v4.i.a.g;
import android.support.v4.i.a.r;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import java.util.Arrays;

public class GridLayoutManager
  extends LinearLayoutManager
{
  boolean a = false;
  int b = -1;
  int[] c;
  View[] d;
  final SparseIntArray e = new SparseIntArray();
  final SparseIntArray f = new SparseIntArray();
  cx g = new cv();
  final Rect h = new Rect();
  
  public GridLayoutManager(Context paramContext, int paramInt)
  {
    super(paramContext);
    a(paramInt);
  }
  
  public GridLayoutManager(Context paramContext, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    super(paramContext, paramInt2, paramBoolean);
    a(paramInt1);
  }
  
  public GridLayoutManager(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    a(a(paramContext, paramAttributeSet, paramInt1, paramInt2).b);
  }
  
  private void H()
  {
    this.e.clear();
    this.f.clear();
  }
  
  private void I()
  {
    int j = s();
    int i = 0;
    while (i < j)
    {
      cw localcw = (cw)h(i).getLayoutParams();
      int k = localcw.e();
      this.e.put(k, localcw.b());
      this.f.put(k, localcw.a());
      i += 1;
    }
  }
  
  private void J()
  {
    if (f() == 1) {}
    for (int i = v() - z() - x();; i = w() - A() - y())
    {
      l(i);
      return;
    }
  }
  
  private void K()
  {
    if ((this.d == null) || (this.d.length != this.b)) {
      this.d = new View[this.b];
    }
  }
  
  private int a(ex paramex, fe paramfe, int paramInt)
  {
    if (!paramfe.a()) {
      return this.g.c(paramInt, this.b);
    }
    int i = paramex.b(paramInt);
    if (i == -1)
    {
      Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + paramInt);
      return 0;
    }
    return this.g.c(i, this.b);
  }
  
  private void a(float paramFloat, int paramInt)
  {
    l(Math.max(Math.round(this.b * paramFloat), paramInt));
  }
  
  private void a(ex paramex, fe paramfe, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i;
    int j;
    int k;
    label43:
    cw localcw;
    if (paramBoolean)
    {
      i = 1;
      paramInt2 = 0;
      j = paramInt1;
      paramInt1 = paramInt2;
      if ((this.i != 1) || (!g())) {
        break label150;
      }
      paramInt2 = this.b - 1;
      k = -1;
      if (paramInt1 == j) {
        return;
      }
      View localView = this.d[paramInt1];
      localcw = (cw)localView.getLayoutParams();
      cw.a(localcw, c(paramex, paramfe, d(localView)));
      if ((k != -1) || (cw.b(localcw) <= 1)) {
        break label159;
      }
      cw.b(localcw, paramInt2 - (cw.b(localcw) - 1));
    }
    for (;;)
    {
      paramInt2 += cw.b(localcw) * k;
      paramInt1 += i;
      break label43;
      paramInt1 -= 1;
      i = -1;
      j = -1;
      break;
      label150:
      paramInt2 = 0;
      k = 1;
      break label43;
      label159:
      cw.b(localcw, paramInt2);
    }
  }
  
  private void a(View paramView, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    a(paramView, this.h);
    es locales = (es)paramView.getLayoutParams();
    int i;
    if (!paramBoolean1)
    {
      i = paramInt1;
      if (this.i != 1) {}
    }
    else
    {
      i = b(paramInt1, locales.leftMargin + this.h.left, locales.rightMargin + this.h.right);
    }
    if (!paramBoolean1)
    {
      paramInt1 = paramInt2;
      if (this.i != 0) {}
    }
    else
    {
      paramInt1 = b(paramInt2, locales.topMargin + this.h.top, locales.bottomMargin + this.h.bottom);
    }
    if (paramBoolean2) {}
    for (paramBoolean1 = a(paramView, i, paramInt1, locales);; paramBoolean1 = b(paramView, i, paramInt1, locales))
    {
      if (paramBoolean1) {
        paramView.measure(i, paramInt1);
      }
      return;
    }
  }
  
  static int[] a(int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    int k = 0;
    int[] arrayOfInt;
    if ((paramArrayOfInt != null) && (paramArrayOfInt.length == paramInt1 + 1))
    {
      arrayOfInt = paramArrayOfInt;
      if (paramArrayOfInt[(paramArrayOfInt.length - 1)] == paramInt2) {}
    }
    else
    {
      arrayOfInt = new int[paramInt1 + 1];
    }
    arrayOfInt[0] = 0;
    int m = paramInt2 / paramInt1;
    int n = paramInt2 % paramInt1;
    int i = 1;
    int j = 0;
    paramInt2 = k;
    if (i <= paramInt1)
    {
      paramInt2 += n;
      if ((paramInt2 <= 0) || (paramInt1 - paramInt2 >= n)) {
        break label113;
      }
      k = m + 1;
      paramInt2 -= paramInt1;
    }
    for (;;)
    {
      j += k;
      arrayOfInt[i] = j;
      i += 1;
      break;
      return arrayOfInt;
      label113:
      k = m;
    }
  }
  
  private int b(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt2 == 0) && (paramInt3 == 0)) {}
    int i;
    do
    {
      return paramInt1;
      i = View.MeasureSpec.getMode(paramInt1);
    } while ((i != Integer.MIN_VALUE) && (i != 1073741824));
    return View.MeasureSpec.makeMeasureSpec(Math.max(0, View.MeasureSpec.getSize(paramInt1) - paramInt2 - paramInt3), i);
  }
  
  private int b(ex paramex, fe paramfe, int paramInt)
  {
    if (!paramfe.a()) {
      i = this.g.b(paramInt, this.b);
    }
    int j;
    do
    {
      return i;
      j = this.f.get(paramInt, -1);
      i = j;
    } while (j != -1);
    int i = paramex.b(paramInt);
    if (i == -1)
    {
      Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + paramInt);
      return 0;
    }
    return this.g.b(i, this.b);
  }
  
  private void b(ex paramex, fe paramfe, db paramdb, int paramInt)
  {
    int i = 1;
    if (paramInt == 1) {}
    for (;;)
    {
      paramInt = b(paramex, paramfe, paramdb.a);
      if (i == 0) {
        break;
      }
      while ((paramInt > 0) && (paramdb.a > 0))
      {
        paramdb.a -= 1;
        paramInt = b(paramex, paramfe, paramdb.a);
      }
      i = 0;
    }
    int k = paramfe.e();
    i = paramdb.a;
    while (i < k - 1)
    {
      int j = b(paramex, paramfe, i + 1);
      if (j <= paramInt) {
        break;
      }
      i += 1;
      paramInt = j;
    }
    paramdb.a = i;
  }
  
  private int c(ex paramex, fe paramfe, int paramInt)
  {
    if (!paramfe.a()) {
      i = this.g.a(paramInt);
    }
    int j;
    do
    {
      return i;
      j = this.e.get(paramInt, -1);
      i = j;
    } while (j != -1);
    int i = paramex.b(paramInt);
    if (i == -1)
    {
      Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + paramInt);
      return 1;
    }
    return this.g.a(i);
  }
  
  private void l(int paramInt)
  {
    this.c = a(this.c, this.b, paramInt);
  }
  
  public int a(int paramInt, ex paramex, fe paramfe)
  {
    J();
    K();
    return super.a(paramInt, paramex, paramfe);
  }
  
  public int a(ex paramex, fe paramfe)
  {
    if (this.i == 0) {
      return this.b;
    }
    if (paramfe.e() < 1) {
      return 0;
    }
    return a(paramex, paramfe, paramfe.e() - 1) + 1;
  }
  
  public es a()
  {
    if (this.i == 0) {
      return new cw(-2, -1);
    }
    return new cw(-1, -2);
  }
  
  public es a(Context paramContext, AttributeSet paramAttributeSet)
  {
    return new cw(paramContext, paramAttributeSet);
  }
  
  public es a(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams)) {
      return new cw((ViewGroup.MarginLayoutParams)paramLayoutParams);
    }
    return new cw(paramLayoutParams);
  }
  
  View a(ex paramex, fe paramfe, int paramInt1, int paramInt2, int paramInt3)
  {
    Object localObject2 = null;
    h();
    int j = this.j.c();
    int k = this.j.d();
    int i;
    Object localObject1;
    label37:
    Object localObject3;
    if (paramInt2 > paramInt1)
    {
      i = 1;
      localObject1 = null;
      if (paramInt1 == paramInt2) {
        break label197;
      }
      localObject3 = h(paramInt1);
      int m = d((View)localObject3);
      if ((m < 0) || (m >= paramInt3)) {
        break label216;
      }
      if (b(paramex, paramfe, m) == 0) {
        break label119;
      }
      localObject3 = localObject2;
      localObject2 = localObject1;
      localObject1 = localObject3;
    }
    for (;;)
    {
      paramInt1 += i;
      localObject3 = localObject2;
      localObject2 = localObject1;
      localObject1 = localObject3;
      break label37;
      i = -1;
      break;
      label119:
      if (((es)((View)localObject3).getLayoutParams()).c())
      {
        if (localObject1 == null)
        {
          localObject1 = localObject2;
          localObject2 = localObject3;
        }
      }
      else
      {
        Object localObject4;
        if (this.j.a((View)localObject3) < k)
        {
          localObject4 = localObject3;
          if (this.j.b((View)localObject3) >= j) {}
        }
        else
        {
          if (localObject2 != null) {
            break label216;
          }
          localObject2 = localObject1;
          localObject1 = localObject3;
          continue;
          label197:
          if (localObject2 == null) {
            break label209;
          }
        }
        for (;;)
        {
          localObject4 = localObject2;
          return (View)localObject4;
          label209:
          localObject2 = localObject1;
        }
      }
      label216:
      localObject3 = localObject1;
      localObject1 = localObject2;
      localObject2 = localObject3;
    }
  }
  
  public View a(View paramView, int paramInt, ex paramex, fe paramfe)
  {
    View localView = e(paramView);
    if (localView == null)
    {
      paramex = null;
      return paramex;
    }
    cw localcw = (cw)localView.getLayoutParams();
    int i4 = cw.a(localcw);
    int i5 = cw.a(localcw) + cw.b(localcw);
    if (super.a(paramView, paramInt, paramex, paramfe) == null) {
      return null;
    }
    int i8;
    label83:
    int m;
    int k;
    if (e(paramInt) == 1)
    {
      i8 = 1;
      if (i8 == this.k) {
        break label162;
      }
      paramInt = 1;
      if (paramInt == 0) {
        break label167;
      }
      paramInt = s() - 1;
      m = -1;
      k = -1;
      label100:
      if ((this.i != 1) || (!g())) {
        break label181;
      }
    }
    int j;
    int i;
    int i1;
    label132:
    label162:
    label167:
    label181:
    for (int n = 1;; n = 0)
    {
      paramView = null;
      j = -1;
      i = 0;
      i1 = paramInt;
      paramInt = j;
      if (i1 != k)
      {
        paramfe = h(i1);
        if (paramfe != localView) {
          break label187;
        }
      }
      return paramView;
      i8 = 0;
      break;
      paramInt = 0;
      break label83;
      k = s();
      paramInt = 0;
      m = 1;
      break label100;
    }
    label187:
    if (!paramfe.isFocusable())
    {
      j = i;
      i = paramInt;
      paramInt = j;
    }
    for (;;)
    {
      i1 += m;
      j = i;
      i = paramInt;
      paramInt = j;
      break label132;
      localcw = (cw)paramfe.getLayoutParams();
      int i6 = cw.a(localcw);
      int i7 = cw.a(localcw) + cw.b(localcw);
      if (i6 == i4)
      {
        paramex = paramfe;
        if (i7 == i5) {
          break;
        }
      }
      int i3 = 0;
      if (paramView == null) {
        j = 1;
      }
      for (;;)
      {
        if (j != 0)
        {
          i = cw.a(localcw);
          paramInt = Math.min(i7, i5) - Math.max(i6, i4);
          paramView = paramfe;
          break;
          j = Math.max(i6, i4);
          int i2 = Math.min(i7, i5) - j;
          if (i2 > i)
          {
            j = 1;
          }
          else
          {
            j = i3;
            if (i2 == i)
            {
              if (i6 > paramInt) {}
              for (i2 = 1;; i2 = 0)
              {
                j = i3;
                if (n != i2) {
                  break;
                }
                j = 1;
                break;
              }
            }
          }
        }
      }
      j = paramInt;
      paramInt = i;
      i = j;
    }
  }
  
  public void a(int paramInt)
  {
    if (paramInt == this.b) {
      return;
    }
    this.a = true;
    if (paramInt < 1) {
      throw new IllegalArgumentException("Span count should be at least 1. Provided " + paramInt);
    }
    this.b = paramInt;
    this.g.a();
  }
  
  public void a(Rect paramRect, int paramInt1, int paramInt2)
  {
    if (this.c == null) {
      super.a(paramRect, paramInt1, paramInt2);
    }
    int i = x();
    int j = z() + i;
    int k = y() + A();
    if (this.i == 1)
    {
      i = a(paramInt2, k + paramRect.height(), D());
      paramInt2 = a(paramInt1, j + this.c[(this.c.length - 1)], C());
      paramInt1 = i;
    }
    for (;;)
    {
      d(paramInt2, paramInt1);
      return;
      i = a(paramInt1, j + paramRect.width(), C());
      paramInt1 = a(paramInt2, k + this.c[(this.c.length - 1)], D());
      paramInt2 = i;
    }
  }
  
  public void a(RecyclerView paramRecyclerView)
  {
    this.g.a();
  }
  
  public void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    this.g.a();
  }
  
  public void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2, int paramInt3)
  {
    this.g.a();
  }
  
  public void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2, Object paramObject)
  {
    this.g.a();
  }
  
  void a(ex paramex, fe paramfe, db paramdb, int paramInt)
  {
    super.a(paramex, paramfe, paramdb, paramInt);
    J();
    if ((paramfe.e() > 0) && (!paramfe.a())) {
      b(paramex, paramfe, paramdb, paramInt);
    }
    K();
  }
  
  void a(ex paramex, fe paramfe, dd paramdd, dc paramdc)
  {
    int i3 = this.j.i();
    int j;
    int k;
    label37:
    boolean bool1;
    label57:
    int i1;
    int i2;
    int n;
    if (i3 != 1073741824)
    {
      j = 1;
      if (s() <= 0) {
        break label225;
      }
      k = this.c[this.b];
      if (j != 0) {
        J();
      }
      if (paramdd.e != 1) {
        break label231;
      }
      bool1 = true;
      i1 = 0;
      i2 = 0;
      i = this.b;
      n = i1;
      m = i2;
      if (!bool1)
      {
        i = b(paramex, paramfe, paramdd.d) + c(paramex, paramfe, paramdd.d);
        m = i2;
        n = i1;
      }
    }
    for (;;)
    {
      if ((n < this.b) && (paramdd.a(paramfe)) && (i > 0))
      {
        i2 = paramdd.d;
        i1 = c(paramex, paramfe, i2);
        if (i1 > this.b)
        {
          throw new IllegalArgumentException("Item at position " + i2 + " requires " + i1 + " spans but GridLayoutManager has only " + this.b + " spans.");
          j = 0;
          break;
          label225:
          k = 0;
          break label37;
          label231:
          bool1 = false;
          break label57;
        }
        i -= i1;
        if (i >= 0) {
          break label261;
        }
      }
      label261:
      View localView;
      do
      {
        if (n != 0) {
          break;
        }
        paramdc.b = true;
        return;
        localView = paramdd.a(paramex);
      } while (localView == null);
      m += i1;
      this.d[n] = localView;
      n += 1;
    }
    a(paramex, paramfe, n, m, bool1);
    int m = 0;
    float f1 = 0.0F;
    int i = 0;
    label351:
    label399:
    label447:
    boolean bool2;
    if (m < n)
    {
      paramex = this.d[m];
      if (paramdd.k == null) {
        if (bool1)
        {
          b(paramex);
          paramfe = (cw)paramex.getLayoutParams();
          i2 = this.c[(cw.a(paramfe) + cw.b(paramfe))];
          int i4 = this.c[cw.a(paramfe)];
          if (this.i != 0) {
            break label583;
          }
          i1 = paramfe.height;
          i2 = a(i2 - i4, i3, 0, i1, false);
          i4 = this.j.f();
          int i5 = this.j.h();
          if (this.i != 1) {
            break label592;
          }
          i1 = paramfe.height;
          i1 = a(i4, i5, 0, i1, true);
          if (this.i != 1) {
            break label607;
          }
          if (paramfe.height != -1) {
            break label601;
          }
          bool2 = true;
          label479:
          a(paramex, i2, i1, bool2, false);
          i1 = this.j.c(paramex);
          if (i1 <= i) {
            break label1459;
          }
          i = i1;
        }
      }
    }
    label583:
    label592:
    label601:
    label607:
    label729:
    label777:
    label809:
    label848:
    label857:
    label959:
    label1003:
    label1012:
    label1101:
    label1360:
    label1396:
    label1444:
    label1453:
    label1459:
    for (;;)
    {
      float f2 = 1.0F * this.j.d(paramex) / cw.b(paramfe);
      if (f2 > f1) {
        f1 = f2;
      }
      for (;;)
      {
        m += 1;
        break;
        b(paramex, 0);
        break label351;
        if (bool1)
        {
          a(paramex);
          break label351;
        }
        a(paramex, 0);
        break label351;
        i1 = paramfe.width;
        break label399;
        i1 = paramfe.width;
        break label447;
        bool2 = false;
        break label479;
        if (paramfe.width == -1) {}
        for (bool2 = true;; bool2 = false)
        {
          a(paramex, i1, i2, bool2, false);
          break;
        }
        m = i;
        if (j != 0)
        {
          a(f1, k);
          i = 0;
          j = 0;
          m = i;
          if (j < n)
          {
            paramex = this.d[j];
            paramfe = (cw)paramex.getLayoutParams();
            m = this.c[(cw.a(paramfe) + cw.b(paramfe))];
            i1 = this.c[cw.a(paramfe)];
            if (this.i == 0)
            {
              k = paramfe.height;
              m = a(m - i1, 1073741824, 0, k, false);
              i1 = this.j.f();
              i2 = this.j.h();
              if (this.i != 1) {
                break label848;
              }
              k = paramfe.height;
              k = a(i1, i2, 0, k, true);
              if (this.i != 1) {
                break label857;
              }
              a(paramex, m, k, false, true);
              k = this.j.c(paramex);
              if (k <= i) {
                break label1453;
              }
              i = k;
            }
          }
        }
        for (;;)
        {
          j += 1;
          break;
          k = paramfe.width;
          break label729;
          k = paramfe.width;
          break label777;
          a(paramex, k, m, false, true);
          break label809;
          k = View.MeasureSpec.makeMeasureSpec(m, 1073741824);
          i = 0;
          if (i < n)
          {
            paramex = this.d[i];
            if (this.j.c(paramex) != m)
            {
              paramfe = (cw)paramex.getLayoutParams();
              i1 = this.c[(cw.a(paramfe) + cw.b(paramfe))];
              i2 = this.c[cw.a(paramfe)];
              if (this.i != 0) {
                break label1003;
              }
              j = paramfe.height;
              j = a(i1 - i2, 1073741824, 0, j, false);
              if (this.i != 1) {
                break label1012;
              }
              a(paramex, j, k, true, true);
            }
            for (;;)
            {
              i += 1;
              break;
              j = paramfe.width;
              break label959;
              a(paramex, k, j, true, true);
            }
          }
          paramdc.a = m;
          j = 0;
          k = 0;
          if (this.i == 1) {
            if (paramdd.f == -1)
            {
              k = paramdd.b;
              m = k - m;
              i = 0;
              j = 0;
              i3 = 0;
              i1 = i;
              i2 = k;
              k = i3;
              i = j;
              j = i1;
              i1 = i2;
              if (k >= n) {
                break label1444;
              }
              paramex = this.d[k];
              paramfe = (cw)paramex.getLayoutParams();
              if (this.i != 1) {
                break label1396;
              }
              if (!g()) {
                break label1360;
              }
              j = x() + this.c[(cw.a(paramfe) + cw.b(paramfe))];
              i2 = this.j.d(paramex);
              i = j;
              j -= i2;
            }
          }
          for (;;)
          {
            a(paramex, j + paramfe.leftMargin, m + paramfe.topMargin, i - paramfe.rightMargin, i1 - paramfe.bottomMargin);
            if ((paramfe.c()) || (paramfe.d())) {
              paramdc.c = true;
            }
            paramdc.d |= paramex.isFocusable();
            i2 = k + 1;
            k = j;
            j = i;
            i = k;
            k = i2;
            break label1101;
            i = paramdd.b;
            k = i + m;
            i1 = 0;
            j = 0;
            m = i;
            i = i1;
            break;
            if (paramdd.f == -1)
            {
              i = paramdd.b;
              i1 = i - m;
              m = j;
              j = i1;
              break;
            }
            i1 = paramdd.b;
            i = m + i1;
            m = j;
            j = i1;
            break;
            i = x();
            j = this.c[cw.a(paramfe)] + i;
            i = this.j.d(paramex) + j;
            continue;
            m = y();
            m = this.c[cw.a(paramfe)] + m;
            i1 = this.j.d(paramex) + m;
            i2 = i;
            i = j;
            j = i2;
          }
          Arrays.fill(this.d, null);
          return;
        }
      }
    }
  }
  
  public void a(ex paramex, fe paramfe, View paramView, g paramg)
  {
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    if (!(localLayoutParams instanceof cw))
    {
      super.a(paramView, paramg);
      return;
    }
    paramView = (cw)localLayoutParams;
    int i = a(paramex, paramfe, paramView.e());
    if (this.i == 0)
    {
      j = paramView.a();
      k = paramView.b();
      if ((this.b > 1) && (paramView.b() == this.b)) {}
      for (bool = true;; bool = false)
      {
        paramg.b(r.a(j, k, i, 1, bool, false));
        return;
      }
    }
    int j = paramView.a();
    int k = paramView.b();
    if ((this.b > 1) && (paramView.b() == this.b)) {}
    for (boolean bool = true;; bool = false)
    {
      paramg.b(r.a(i, 1, j, k, bool, false));
      return;
    }
  }
  
  public void a(boolean paramBoolean)
  {
    if (paramBoolean) {
      throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }
    super.a(false);
  }
  
  public boolean a(es parames)
  {
    return parames instanceof cw;
  }
  
  public int b(int paramInt, ex paramex, fe paramfe)
  {
    J();
    K();
    return super.b(paramInt, paramex, paramfe);
  }
  
  public int b(ex paramex, fe paramfe)
  {
    if (this.i == 1) {
      return this.b;
    }
    if (paramfe.e() < 1) {
      return 0;
    }
    return a(paramex, paramfe, paramfe.e() - 1) + 1;
  }
  
  public void b(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    this.g.a();
  }
  
  public boolean b()
  {
    return (this.n == null) && (!this.a);
  }
  
  public void c(ex paramex, fe paramfe)
  {
    if (paramfe.a()) {
      I();
    }
    super.c(paramex, paramfe);
    H();
    if (!paramfe.a()) {
      this.a = false;
    }
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/GridLayoutManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */