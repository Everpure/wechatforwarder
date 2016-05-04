package android.support.v7.widget;

import android.content.Context;
import android.os.Parcelable;
import android.support.v4.i.a.a;
import android.support.v4.i.a.aj;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

public class LinearLayoutManager
  extends eq
{
  private dd a;
  private boolean b;
  private boolean c = false;
  private boolean d = false;
  private boolean e = true;
  private boolean f;
  int i;
  dx j;
  boolean k = false;
  int l = -1;
  int m = Integer.MIN_VALUE;
  de n = null;
  final db o = new db(this);
  
  public LinearLayoutManager(Context paramContext)
  {
    this(paramContext, 1, false);
  }
  
  public LinearLayoutManager(Context paramContext, int paramInt, boolean paramBoolean)
  {
    b(paramInt);
    b(paramBoolean);
    c(true);
  }
  
  public LinearLayoutManager(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    paramContext = a(paramContext, paramAttributeSet, paramInt1, paramInt2);
    b(paramContext.a);
    b(paramContext.c);
    a(paramContext.d);
    c(true);
  }
  
  private void H()
  {
    boolean bool = true;
    if ((this.i == 1) || (!g()))
    {
      this.k = this.c;
      return;
    }
    if (!this.c) {}
    for (;;)
    {
      this.k = bool;
      return;
      bool = false;
    }
  }
  
  private View I()
  {
    if (this.k) {}
    for (int i1 = s() - 1;; i1 = 0) {
      return h(i1);
    }
  }
  
  private View J()
  {
    if (this.k) {}
    for (int i1 = 0;; i1 = s() - 1) {
      return h(i1);
    }
  }
  
  private int a(int paramInt, ex paramex, fe paramfe, boolean paramBoolean)
  {
    int i1 = this.j.d() - paramInt;
    if (i1 > 0)
    {
      int i2 = -c(-i1, paramex, paramfe);
      i1 = i2;
      if (paramBoolean)
      {
        paramInt = this.j.d() - (paramInt + i2);
        i1 = i2;
        if (paramInt > 0)
        {
          this.j.a(paramInt);
          i1 = i2 + paramInt;
        }
      }
      return i1;
    }
    return 0;
  }
  
  private View a(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.k) {
      return a(s() - 1, -1, paramBoolean1, paramBoolean2);
    }
    return a(0, s(), paramBoolean1, paramBoolean2);
  }
  
  private void a(int paramInt1, int paramInt2, boolean paramBoolean, fe paramfe)
  {
    int i2 = 1;
    int i1 = 1;
    dd localdd = this.a;
    if (this.j.h() == 0) {}
    for (boolean bool = true;; bool = false)
    {
      localdd.l = bool;
      this.a.h = a(paramfe);
      this.a.f = paramInt1;
      if (paramInt1 != 1) {
        break;
      }
      paramfe = this.a;
      paramfe.h += this.j.g();
      paramfe = J();
      localdd = this.a;
      paramInt1 = i1;
      if (this.k) {
        paramInt1 = -1;
      }
      localdd.e = paramInt1;
      this.a.d = (d(paramfe) + this.a.e);
      this.a.b = this.j.b(paramfe);
      paramInt1 = this.j.b(paramfe) - this.j.d();
      this.a.c = paramInt2;
      if (paramBoolean)
      {
        paramfe = this.a;
        paramfe.c -= paramInt1;
      }
      this.a.g = paramInt1;
      return;
    }
    paramfe = I();
    localdd = this.a;
    localdd.h += this.j.c();
    localdd = this.a;
    if (this.k) {}
    for (paramInt1 = i2;; paramInt1 = -1)
    {
      localdd.e = paramInt1;
      this.a.d = (d(paramfe) + this.a.e);
      this.a.b = this.j.a(paramfe);
      paramInt1 = -this.j.a(paramfe) + this.j.c();
      break;
    }
  }
  
  private void a(db paramdb)
  {
    e(paramdb.a, paramdb.b);
  }
  
  private void a(ex paramex, int paramInt)
  {
    if (paramInt < 0) {}
    for (;;)
    {
      return;
      int i2 = s();
      int i1;
      View localView;
      if (this.k)
      {
        i1 = i2 - 1;
        while (i1 >= 0)
        {
          localView = h(i1);
          if (this.j.b(localView) > paramInt)
          {
            a(paramex, i2 - 1, i1);
            return;
          }
          i1 -= 1;
        }
      }
      else
      {
        i1 = 0;
        while (i1 < i2)
        {
          localView = h(i1);
          if (this.j.b(localView) > paramInt)
          {
            a(paramex, 0, i1);
            return;
          }
          i1 += 1;
        }
      }
    }
  }
  
  private void a(ex paramex, int paramInt1, int paramInt2)
  {
    if (paramInt1 == paramInt2) {}
    for (;;)
    {
      return;
      int i1 = paramInt1;
      if (paramInt2 > paramInt1)
      {
        paramInt2 -= 1;
        while (paramInt2 >= paramInt1)
        {
          a(paramInt2, paramex);
          paramInt2 -= 1;
        }
      }
      else
      {
        while (i1 > paramInt2)
        {
          a(i1, paramex);
          i1 -= 1;
        }
      }
    }
  }
  
  private void a(ex paramex, dd paramdd)
  {
    if ((!paramdd.a) || (paramdd.l)) {
      return;
    }
    if (paramdd.f == -1)
    {
      b(paramex, paramdd.g);
      return;
    }
    a(paramex, paramdd.g);
  }
  
  private void a(ex paramex, fe paramfe, db paramdb)
  {
    if (a(paramfe, paramdb)) {}
    while (b(paramex, paramfe, paramdb)) {
      return;
    }
    paramdb.b();
    if (this.d) {}
    for (int i1 = paramfe.e() - 1;; i1 = 0)
    {
      paramdb.a = i1;
      return;
    }
  }
  
  private boolean a(fe paramfe, db paramdb)
  {
    boolean bool = false;
    if ((paramfe.a()) || (this.l == -1)) {
      return false;
    }
    if ((this.l < 0) || (this.l >= paramfe.e()))
    {
      this.l = -1;
      this.m = Integer.MIN_VALUE;
      return false;
    }
    paramdb.a = this.l;
    if ((this.n != null) && (this.n.a()))
    {
      paramdb.c = this.n.c;
      if (paramdb.c)
      {
        paramdb.b = (this.j.d() - this.n.b);
        return true;
      }
      paramdb.b = (this.j.c() + this.n.b);
      return true;
    }
    if (this.m == Integer.MIN_VALUE)
    {
      paramfe = c(this.l);
      int i1;
      if (paramfe != null)
      {
        if (this.j.c(paramfe) > this.j.f())
        {
          paramdb.b();
          return true;
        }
        if (this.j.a(paramfe) - this.j.c() < 0)
        {
          paramdb.b = this.j.c();
          paramdb.c = false;
          return true;
        }
        if (this.j.d() - this.j.b(paramfe) < 0)
        {
          paramdb.b = this.j.d();
          paramdb.c = true;
          return true;
        }
        if (paramdb.c) {}
        for (i1 = this.j.b(paramfe) + this.j.b();; i1 = this.j.a(paramfe))
        {
          paramdb.b = i1;
          return true;
        }
      }
      if (s() > 0)
      {
        i1 = d(h(0));
        if (this.l >= i1) {
          break label351;
        }
      }
      label351:
      for (int i2 = 1;; i2 = 0)
      {
        if (i2 == this.k) {
          bool = true;
        }
        paramdb.c = bool;
        paramdb.b();
        return true;
      }
    }
    paramdb.c = this.k;
    if (this.k)
    {
      paramdb.b = (this.j.d() - this.m);
      return true;
    }
    paramdb.b = (this.j.c() + this.m);
    return true;
  }
  
  private int b(int paramInt, ex paramex, fe paramfe, boolean paramBoolean)
  {
    int i1 = paramInt - this.j.c();
    if (i1 > 0)
    {
      int i2 = -c(i1, paramex, paramfe);
      i1 = i2;
      if (paramBoolean)
      {
        paramInt = paramInt + i2 - this.j.c();
        i1 = i2;
        if (paramInt > 0)
        {
          this.j.a(-paramInt);
          i1 = i2 - paramInt;
        }
      }
      return i1;
    }
    return 0;
  }
  
  private View b(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.k) {
      return a(0, s(), paramBoolean1, paramBoolean2);
    }
    return a(s() - 1, -1, paramBoolean1, paramBoolean2);
  }
  
  private void b(db paramdb)
  {
    f(paramdb.a, paramdb.b);
  }
  
  private void b(ex paramex, int paramInt)
  {
    int i1 = s();
    if (paramInt < 0) {}
    for (;;)
    {
      return;
      int i2 = this.j.e() - paramInt;
      View localView;
      if (this.k)
      {
        paramInt = 0;
        while (paramInt < i1)
        {
          localView = h(paramInt);
          if (this.j.a(localView) < i2)
          {
            a(paramex, 0, paramInt);
            return;
          }
          paramInt += 1;
        }
      }
      else
      {
        paramInt = i1 - 1;
        while (paramInt >= 0)
        {
          localView = h(paramInt);
          if (this.j.a(localView) < i2)
          {
            a(paramex, i1 - 1, paramInt);
            return;
          }
          paramInt -= 1;
        }
      }
    }
  }
  
  private void b(ex paramex, fe paramfe, int paramInt1, int paramInt2)
  {
    if ((!paramfe.b()) || (s() == 0) || (paramfe.a()) || (!b())) {
      return;
    }
    int i1 = 0;
    int i2 = 0;
    List localList = paramex.b();
    int i5 = localList.size();
    int i6 = d(h(0));
    int i3 = 0;
    if (i3 < i5)
    {
      fh localfh = (fh)localList.get(i3);
      int i4;
      if (localfh.q())
      {
        i4 = i2;
        i2 = i1;
        i1 = i4;
      }
      for (;;)
      {
        i4 = i3 + 1;
        i3 = i2;
        i2 = i1;
        i1 = i3;
        i3 = i4;
        break;
        int i7;
        if (localfh.d() < i6)
        {
          i7 = 1;
          label143:
          if (i7 == this.k) {
            break label195;
          }
        }
        label195:
        for (i4 = -1;; i4 = 1)
        {
          if (i4 != -1) {
            break label201;
          }
          i4 = this.j.c(localfh.a) + i1;
          i1 = i2;
          i2 = i4;
          break;
          i7 = 0;
          break label143;
        }
        label201:
        i4 = this.j.c(localfh.a) + i2;
        i2 = i1;
        i1 = i4;
      }
    }
    this.a.k = localList;
    if (i1 > 0)
    {
      f(d(I()), paramInt1);
      this.a.h = i1;
      this.a.c = 0;
      this.a.a();
      a(paramex, this.a, paramfe, false);
    }
    if (i2 > 0)
    {
      e(d(J()), paramInt2);
      this.a.h = i2;
      this.a.c = 0;
      this.a.a();
      a(paramex, this.a, paramfe, false);
    }
    this.a.k = null;
  }
  
  private boolean b(ex paramex, fe paramfe, db paramdb)
  {
    int i1 = 0;
    if (s() == 0) {}
    do
    {
      return false;
      View localView = B();
      if ((localView != null) && (db.a(paramdb, localView, paramfe)))
      {
        paramdb.a(localView);
        return true;
      }
    } while (this.b != this.d);
    if (paramdb.c)
    {
      paramex = f(paramex, paramfe);
      label66:
      if (paramex == null) {
        break label165;
      }
      paramdb.b(paramex);
      if ((!paramfe.a()) && (b()))
      {
        if ((this.j.a(paramex) >= this.j.d()) || (this.j.b(paramex) < this.j.c())) {
          i1 = 1;
        }
        if (i1 != 0) {
          if (!paramdb.c) {
            break label167;
          }
        }
      }
    }
    label165:
    label167:
    for (i1 = this.j.d();; i1 = this.j.c())
    {
      paramdb.b = i1;
      return true;
      paramex = g(paramex, paramfe);
      break label66;
      break;
    }
  }
  
  private void e(int paramInt1, int paramInt2)
  {
    this.a.c = (this.j.d() - paramInt2);
    dd localdd = this.a;
    if (this.k) {}
    for (int i1 = -1;; i1 = 1)
    {
      localdd.e = i1;
      this.a.d = paramInt1;
      this.a.f = 1;
      this.a.b = paramInt2;
      this.a.g = Integer.MIN_VALUE;
      return;
    }
  }
  
  private View f(ex paramex, fe paramfe)
  {
    if (this.k) {
      return h(paramex, paramfe);
    }
    return i(paramex, paramfe);
  }
  
  private void f(int paramInt1, int paramInt2)
  {
    this.a.c = (paramInt2 - this.j.c());
    this.a.d = paramInt1;
    dd localdd = this.a;
    if (this.k) {}
    for (paramInt1 = 1;; paramInt1 = -1)
    {
      localdd.e = paramInt1;
      this.a.f = -1;
      this.a.b = paramInt2;
      this.a.g = Integer.MIN_VALUE;
      return;
    }
  }
  
  private View g(ex paramex, fe paramfe)
  {
    if (this.k) {
      return i(paramex, paramfe);
    }
    return h(paramex, paramfe);
  }
  
  private int h(fe paramfe)
  {
    boolean bool2 = false;
    if (s() == 0) {
      return 0;
    }
    h();
    dx localdx = this.j;
    if (!this.e) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      View localView = a(bool1, true);
      bool1 = bool2;
      if (!this.e) {
        bool1 = true;
      }
      return fo.a(paramfe, localdx, localView, b(bool1, true), this, this.e, this.k);
    }
  }
  
  private View h(ex paramex, fe paramfe)
  {
    return a(paramex, paramfe, 0, s(), paramfe.e());
  }
  
  private int i(fe paramfe)
  {
    boolean bool2 = false;
    if (s() == 0) {
      return 0;
    }
    h();
    dx localdx = this.j;
    if (!this.e) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      View localView = a(bool1, true);
      bool1 = bool2;
      if (!this.e) {
        bool1 = true;
      }
      return fo.a(paramfe, localdx, localView, b(bool1, true), this, this.e);
    }
  }
  
  private View i(ex paramex, fe paramfe)
  {
    return a(paramex, paramfe, s() - 1, -1, paramfe.e());
  }
  
  private int j(fe paramfe)
  {
    boolean bool2 = false;
    if (s() == 0) {
      return 0;
    }
    h();
    dx localdx = this.j;
    if (!this.e) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      View localView = a(bool1, true);
      bool1 = bool2;
      if (!this.e) {
        bool1 = true;
      }
      return fo.b(paramfe, localdx, localView, b(bool1, true), this, this.e);
    }
  }
  
  public int a(int paramInt, ex paramex, fe paramfe)
  {
    if (this.i == 1) {
      return 0;
    }
    return c(paramInt, paramex, paramfe);
  }
  
  int a(ex paramex, dd paramdd, fe paramfe, boolean paramBoolean)
  {
    int i3 = paramdd.c;
    if (paramdd.g != Integer.MIN_VALUE)
    {
      if (paramdd.c < 0) {
        paramdd.g += paramdd.c;
      }
      a(paramex, paramdd);
    }
    int i1 = paramdd.c + paramdd.h;
    dc localdc = new dc();
    if (((paramdd.l) || (i1 > 0)) && (paramdd.a(paramfe)))
    {
      localdc.a();
      a(paramex, paramfe, paramdd, localdc);
      if (!localdc.b) {
        break label111;
      }
    }
    for (;;)
    {
      return i3 - paramdd.c;
      label111:
      paramdd.b += localdc.a * paramdd.f;
      int i2;
      if ((localdc.c) && (this.a.k == null))
      {
        i2 = i1;
        if (paramfe.a()) {}
      }
      else
      {
        paramdd.c -= localdc.a;
        i2 = i1 - localdc.a;
      }
      if (paramdd.g != Integer.MIN_VALUE)
      {
        paramdd.g += localdc.a;
        if (paramdd.c < 0) {
          paramdd.g += paramdd.c;
        }
        a(paramex, paramdd);
      }
      i1 = i2;
      if (!paramBoolean) {
        break;
      }
      i1 = i2;
      if (!localdc.d) {
        break;
      }
    }
  }
  
  protected int a(fe paramfe)
  {
    if (paramfe.d()) {
      return this.j.f();
    }
    return 0;
  }
  
  public es a()
  {
    return new es(-2, -2);
  }
  
  View a(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    h();
    int i2 = this.j.c();
    int i3 = this.j.d();
    if (paramInt2 > paramInt1) {}
    Object localObject;
    View localView;
    for (int i1 = 1;; i1 = -1)
    {
      localObject = null;
      if (paramInt1 == paramInt2) {
        break label130;
      }
      localView = h(paramInt1);
      int i4 = this.j.a(localView);
      int i5 = this.j.b(localView);
      if ((i4 >= i3) || (i5 <= i2)) {
        break label133;
      }
      if ((paramBoolean1) && ((i4 < i2) || (i5 > i3))) {
        break;
      }
      return localView;
    }
    if ((paramBoolean2) && (localObject == null)) {
      localObject = localView;
    }
    label130:
    label133:
    for (;;)
    {
      paramInt1 += i1;
      break;
      return (View)localObject;
    }
  }
  
  View a(ex paramex, fe paramfe, int paramInt1, int paramInt2, int paramInt3)
  {
    paramfe = null;
    h();
    int i2 = this.j.c();
    int i3 = this.j.d();
    int i1;
    label35:
    Object localObject1;
    if (paramInt2 > paramInt1)
    {
      i1 = 1;
      paramex = null;
      if (paramInt1 == paramInt2) {
        break label157;
      }
      localObject1 = h(paramInt1);
      int i4 = d((View)localObject1);
      if ((i4 < 0) || (i4 >= paramInt3)) {
        break label172;
      }
      if (!((es)((View)localObject1).getLayoutParams()).c()) {
        break label113;
      }
      if (paramex != null) {
        break label172;
      }
      paramex = paramfe;
      paramfe = (fe)localObject1;
    }
    for (;;)
    {
      paramInt1 += i1;
      localObject1 = paramfe;
      paramfe = paramex;
      paramex = (ex)localObject1;
      break label35;
      i1 = -1;
      break;
      label113:
      Object localObject2;
      if (this.j.a((View)localObject1) < i3)
      {
        localObject2 = localObject1;
        if (this.j.b((View)localObject1) >= i2) {}
      }
      else
      {
        if (paramfe != null) {
          break label172;
        }
        paramfe = paramex;
        paramex = (ex)localObject1;
        continue;
        label157:
        if (paramfe == null) {
          break label167;
        }
      }
      for (;;)
      {
        localObject2 = paramfe;
        return (View)localObject2;
        label167:
        paramfe = paramex;
      }
      label172:
      localObject1 = paramex;
      paramex = paramfe;
      paramfe = (fe)localObject1;
    }
  }
  
  public View a(View paramView, int paramInt, ex paramex, fe paramfe)
  {
    H();
    if (s() == 0) {}
    label42:
    label134:
    label136:
    label142:
    for (;;)
    {
      return null;
      paramInt = e(paramInt);
      if (paramInt != Integer.MIN_VALUE)
      {
        h();
        if (paramInt == -1)
        {
          paramView = g(paramex, paramfe);
          if (paramView == null) {
            break label134;
          }
          h();
          a(paramInt, (int)(0.33333334F * this.j.f()), false, paramfe);
          this.a.g = Integer.MIN_VALUE;
          this.a.a = false;
          a(paramex, this.a, paramfe, true);
          if (paramInt != -1) {
            break label136;
          }
        }
        for (paramex = I();; paramex = J())
        {
          if ((paramex == paramView) || (!paramex.isFocusable())) {
            break label142;
          }
          return paramex;
          paramView = f(paramex, paramfe);
          break label42;
          break;
        }
      }
    }
  }
  
  public void a(Parcelable paramParcelable)
  {
    if ((paramParcelable instanceof de))
    {
      this.n = ((de)paramParcelable);
      m();
    }
  }
  
  public void a(RecyclerView paramRecyclerView, ex paramex)
  {
    super.a(paramRecyclerView, paramex);
    if (this.f)
    {
      c(paramex);
      paramex.a();
    }
  }
  
  void a(ex paramex, fe paramfe, db paramdb, int paramInt) {}
  
  void a(ex paramex, fe paramfe, dd paramdd, dc paramdc)
  {
    paramex = paramdd.a(paramex);
    if (paramex == null)
    {
      paramdc.b = true;
      return;
    }
    paramfe = (es)paramex.getLayoutParams();
    boolean bool2;
    boolean bool1;
    label61:
    int i1;
    int i2;
    label120:
    int i3;
    int i4;
    if (paramdd.k == null)
    {
      bool2 = this.k;
      if (paramdd.f == -1)
      {
        bool1 = true;
        if (bool2 != bool1) {
          break label215;
        }
        b(paramex);
        a(paramex, 0, 0);
        paramdc.a = this.j.c(paramex);
        if (this.i != 1) {
          break label322;
        }
        if (!g()) {
          break label271;
        }
        i1 = v() - z();
        i2 = i1 - this.j.d(paramex);
        if (paramdd.f != -1) {
          break label293;
        }
        i3 = paramdd.b;
        i4 = paramdd.b - paramdc.a;
      }
    }
    for (;;)
    {
      a(paramex, i2 + paramfe.leftMargin, i4 + paramfe.topMargin, i1 - paramfe.rightMargin, i3 - paramfe.bottomMargin);
      if ((paramfe.c()) || (paramfe.d())) {
        paramdc.c = true;
      }
      paramdc.d = paramex.isFocusable();
      return;
      bool1 = false;
      break;
      label215:
      b(paramex, 0);
      break label61;
      bool2 = this.k;
      if (paramdd.f == -1) {}
      for (bool1 = true;; bool1 = false)
      {
        if (bool2 != bool1) {
          break label262;
        }
        a(paramex);
        break;
      }
      label262:
      a(paramex, 0);
      break label61;
      label271:
      i2 = x();
      i1 = this.j.d(paramex) + i2;
      break label120;
      label293:
      i4 = paramdd.b;
      i3 = paramdd.b;
      int i5 = paramdc.a;
      i3 += i5;
      continue;
      label322:
      i4 = y();
      i3 = this.j.d(paramex) + i4;
      if (paramdd.f == -1)
      {
        i1 = paramdd.b;
        i2 = paramdd.b - paramdc.a;
      }
      else
      {
        i2 = paramdd.b;
        i1 = paramdd.b;
        i5 = paramdc.a;
        i1 += i5;
      }
    }
  }
  
  public void a(AccessibilityEvent paramAccessibilityEvent)
  {
    super.a(paramAccessibilityEvent);
    if (s() > 0)
    {
      paramAccessibilityEvent = a.a(paramAccessibilityEvent);
      paramAccessibilityEvent.b(k());
      paramAccessibilityEvent.c(l());
    }
  }
  
  public void a(String paramString)
  {
    if (this.n == null) {
      super.a(paramString);
    }
  }
  
  public void a(boolean paramBoolean)
  {
    a(null);
    if (this.d == paramBoolean) {
      return;
    }
    this.d = paramBoolean;
    m();
  }
  
  public int b(int paramInt, ex paramex, fe paramfe)
  {
    if (this.i == 0) {
      return 0;
    }
    return c(paramInt, paramex, paramfe);
  }
  
  public int b(fe paramfe)
  {
    return h(paramfe);
  }
  
  public void b(int paramInt)
  {
    if ((paramInt != 0) && (paramInt != 1)) {
      throw new IllegalArgumentException("invalid orientation:" + paramInt);
    }
    a(null);
    if (paramInt == this.i) {
      return;
    }
    this.i = paramInt;
    this.j = null;
    m();
  }
  
  public void b(boolean paramBoolean)
  {
    a(null);
    if (paramBoolean == this.c) {
      return;
    }
    this.c = paramBoolean;
    m();
  }
  
  public boolean b()
  {
    return (this.n == null) && (this.b == this.d);
  }
  
  int c(int paramInt, ex paramex, fe paramfe)
  {
    if ((s() == 0) || (paramInt == 0)) {
      return 0;
    }
    this.a.a = true;
    h();
    if (paramInt > 0) {}
    int i2;
    int i3;
    for (int i1 = 1;; i1 = -1)
    {
      i2 = Math.abs(paramInt);
      a(i1, i2, true, paramfe);
      i3 = this.a.g + a(paramex, this.a, paramfe, false);
      if (i3 >= 0) {
        break;
      }
      return 0;
    }
    if (i2 > i3) {
      paramInt = i1 * i3;
    }
    this.j.a(-paramInt);
    this.a.j = paramInt;
    return paramInt;
  }
  
  public int c(fe paramfe)
  {
    return h(paramfe);
  }
  
  public Parcelable c()
  {
    if (this.n != null) {
      return new de(this.n);
    }
    de localde = new de();
    if (s() > 0)
    {
      h();
      boolean bool = this.b ^ this.k;
      localde.c = bool;
      if (bool)
      {
        localView = J();
        localde.b = (this.j.d() - this.j.b(localView));
        localde.a = d(localView);
        return localde;
      }
      View localView = I();
      localde.a = d(localView);
      localde.b = (this.j.a(localView) - this.j.c());
      return localde;
    }
    localde.b();
    return localde;
  }
  
  public View c(int paramInt)
  {
    int i1 = s();
    Object localObject;
    if (i1 == 0) {
      localObject = null;
    }
    View localView;
    do
    {
      return (View)localObject;
      int i2 = paramInt - d(h(0));
      if ((i2 < 0) || (i2 >= i1)) {
        break;
      }
      localView = h(i2);
      localObject = localView;
    } while (d(localView) == paramInt);
    return super.c(paramInt);
  }
  
  public void c(ex paramex, fe paramfe)
  {
    if (((this.n != null) || (this.l != -1)) && (paramfe.e() == 0))
    {
      c(paramex);
      return;
    }
    if ((this.n != null) && (this.n.a())) {
      this.l = this.n.a;
    }
    h();
    this.a.a = false;
    H();
    this.o.a();
    this.o.c = (this.k ^ this.d);
    a(paramex, paramfe, this.o);
    int i1 = a(paramfe);
    int i2;
    int i4;
    int i5;
    int i3;
    Object localObject;
    label248:
    label262:
    label281:
    boolean bool;
    if (this.a.j >= 0)
    {
      i2 = 0;
      i4 = i2 + this.j.c();
      i5 = i1 + this.j.g();
      i2 = i5;
      i3 = i4;
      if (paramfe.a())
      {
        i2 = i5;
        i3 = i4;
        if (this.l != -1)
        {
          i2 = i5;
          i3 = i4;
          if (this.m != Integer.MIN_VALUE)
          {
            localObject = c(this.l);
            i2 = i5;
            i3 = i4;
            if (localObject != null)
            {
              if (!this.k) {
                break label663;
              }
              i1 = this.j.d() - this.j.b((View)localObject) - this.m;
              if (i1 <= 0) {
                break label695;
              }
              i3 = i4 + i1;
              i2 = i5;
            }
          }
        }
      }
      if (!this.o.c) {
        break label713;
      }
      if (!this.k) {
        break label708;
      }
      i1 = 1;
      a(paramex, paramfe, this.o, i1);
      a(paramex);
      localObject = this.a;
      if (this.j.h() != 0) {
        break label730;
      }
      bool = true;
      label316:
      ((dd)localObject).l = bool;
      this.a.i = paramfe.a();
      if (!this.o.c) {
        break label736;
      }
      b(this.o);
      this.a.h = i3;
      a(paramex, this.a, paramfe, false);
      i4 = this.a.b;
      i5 = this.a.d;
      i1 = i2;
      if (this.a.c > 0) {
        i1 = i2 + this.a.c;
      }
      a(this.o);
      this.a.h = i1;
      localObject = this.a;
      ((dd)localObject).d += this.a.e;
      a(paramex, this.a, paramfe, false);
      i3 = this.a.b;
      if (this.a.c <= 0) {
        break label981;
      }
      i1 = this.a.c;
      f(i5, i4);
      this.a.h = i1;
      a(paramex, this.a, paramfe, false);
    }
    label536:
    label663:
    label695:
    label708:
    label713:
    label730:
    label736:
    label936:
    label981:
    for (i1 = this.a.b;; i1 = i4)
    {
      i2 = i1;
      i1 = i3;
      i3 = i1;
      i4 = i2;
      if (s() > 0)
      {
        if (!(this.k ^ this.d)) {
          break label936;
        }
        i3 = a(i1, paramex, paramfe, true);
        i4 = i2 + i3;
        i2 = b(i4, paramex, paramfe, false);
        i4 += i2;
      }
      for (i3 = i1 + i3 + i2;; i3 = i1 + i5)
      {
        b(paramex, paramfe, i4, i3);
        if (!paramfe.a())
        {
          this.l = -1;
          this.m = Integer.MIN_VALUE;
          this.j.a();
        }
        this.b = this.d;
        this.n = null;
        return;
        i2 = i1;
        i1 = 0;
        break;
        i1 = this.j.a((View)localObject);
        i2 = this.j.c();
        i1 = this.m - (i1 - i2);
        break label248;
        i2 = i5 - i1;
        i3 = i4;
        break label262;
        i1 = -1;
        break label281;
        if (this.k)
        {
          i1 = -1;
          break label281;
        }
        i1 = 1;
        break label281;
        bool = false;
        break label316;
        a(this.o);
        this.a.h = i2;
        a(paramex, this.a, paramfe, false);
        i4 = this.a.b;
        i5 = this.a.d;
        i1 = i3;
        if (this.a.c > 0) {
          i1 = i3 + this.a.c;
        }
        b(this.o);
        this.a.h = i1;
        localObject = this.a;
        ((dd)localObject).d += this.a.e;
        a(paramex, this.a, paramfe, false);
        i3 = this.a.b;
        i1 = i4;
        i2 = i3;
        if (this.a.c <= 0) {
          break label536;
        }
        i1 = this.a.c;
        e(i5, i4);
        this.a.h = i1;
        a(paramex, this.a, paramfe, false);
        i1 = this.a.b;
        i2 = i3;
        break label536;
        i3 = b(i2, paramex, paramfe, true);
        i1 += i3;
        i5 = a(i1, paramex, paramfe, false);
        i4 = i2 + i3 + i5;
      }
    }
  }
  
  public int d(fe paramfe)
  {
    return i(paramfe);
  }
  
  public void d(int paramInt)
  {
    this.l = paramInt;
    this.m = Integer.MIN_VALUE;
    if (this.n != null) {
      this.n.b();
    }
    m();
  }
  
  public boolean d()
  {
    return this.i == 0;
  }
  
  int e(int paramInt)
  {
    int i2 = -1;
    int i3 = 1;
    int i4 = Integer.MIN_VALUE;
    int i1 = i2;
    switch (paramInt)
    {
    default: 
      i1 = Integer.MIN_VALUE;
    case 1: 
    case 2: 
    case 33: 
    case 130: 
    case 17: 
      do
      {
        do
        {
          return i1;
          return 1;
          i1 = i2;
        } while (this.i == 1);
        return Integer.MIN_VALUE;
        paramInt = i4;
        if (this.i == 1) {
          paramInt = 1;
        }
        return paramInt;
        i1 = i2;
      } while (this.i == 0);
      return Integer.MIN_VALUE;
    }
    if (this.i == 0) {}
    for (paramInt = i3;; paramInt = Integer.MIN_VALUE) {
      return paramInt;
    }
  }
  
  public int e(fe paramfe)
  {
    return i(paramfe);
  }
  
  public boolean e()
  {
    return this.i == 1;
  }
  
  public int f()
  {
    return this.i;
  }
  
  public int f(fe paramfe)
  {
    return j(paramfe);
  }
  
  public int g(fe paramfe)
  {
    return j(paramfe);
  }
  
  protected boolean g()
  {
    return q() == 1;
  }
  
  void h()
  {
    if (this.a == null) {
      this.a = i();
    }
    if (this.j == null) {
      this.j = dx.a(this, this.i);
    }
  }
  
  dd i()
  {
    return new dd();
  }
  
  boolean j()
  {
    return (u() != 1073741824) && (t() != 1073741824) && (G());
  }
  
  public int k()
  {
    View localView = a(0, s(), false, true);
    if (localView == null) {
      return -1;
    }
    return d(localView);
  }
  
  public int l()
  {
    View localView = a(s() - 1, -1, false, true);
    if (localView == null) {
      return -1;
    }
    return d(localView);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/LinearLayoutManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */