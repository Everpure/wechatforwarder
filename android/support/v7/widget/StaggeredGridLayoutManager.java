package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.support.v4.i.a.a;
import android.support.v4.i.a.aj;
import android.support.v4.i.a.g;
import android.support.v4.i.a.r;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.BitSet;

public class StaggeredGridLayoutManager
  extends eq
{
  private final Runnable A = new gb(this);
  dx a;
  dx b;
  boolean c = false;
  int d = -1;
  int e = Integer.MIN_VALUE;
  ge f = new ge();
  private int g = -1;
  private gj[] h;
  private int i;
  private int j;
  private cy k;
  private boolean l = false;
  private BitSet m;
  private int n = 2;
  private boolean o;
  private boolean t;
  private gh u;
  private int v;
  private final Rect w = new Rect();
  private final gc x = new gc(this, null);
  private boolean y = false;
  private boolean z = true;
  
  public StaggeredGridLayoutManager(int paramInt1, int paramInt2)
  {
    this.i = paramInt2;
    a(paramInt1);
    if (this.n != 0) {}
    for (;;)
    {
      c(bool);
      return;
      bool = false;
    }
  }
  
  public StaggeredGridLayoutManager(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    paramContext = a(paramContext, paramAttributeSet, paramInt1, paramInt2);
    b(paramContext.a);
    a(paramContext.b);
    a(paramContext.c);
    if (this.n != 0) {}
    for (;;)
    {
      c(bool);
      return;
      bool = false;
    }
  }
  
  private boolean H()
  {
    if ((s() == 0) || (this.n == 0) || (!n())) {
      return false;
    }
    int i2;
    if (this.c) {
      i2 = L();
    }
    for (int i1 = M(); (i2 == 0) && (f() != null); i1 = L())
    {
      this.f.a();
      F();
      m();
      return true;
      i2 = M();
    }
    if (!this.y) {
      return false;
    }
    if (this.c) {}
    gf localgf1;
    for (int i3 = -1;; i3 = 1)
    {
      localgf1 = this.f.a(i2, i1 + 1, i3, true);
      if (localgf1 != null) {
        break;
      }
      this.y = false;
      this.f.a(i1 + 1);
      return false;
    }
    gf localgf2 = this.f.a(i2, localgf1.a, i3 * -1, true);
    if (localgf2 == null) {
      this.f.a(localgf1.a);
    }
    for (;;)
    {
      F();
      m();
      return true;
      this.f.a(localgf2.a + 1);
    }
  }
  
  private void I()
  {
    if (this.a == null)
    {
      this.a = dx.a(this, this.i);
      this.b = dx.a(this, 1 - this.i);
      this.k = new cy();
    }
  }
  
  private void J()
  {
    boolean bool = true;
    if ((this.i == 1) || (!h()))
    {
      this.c = this.l;
      return;
    }
    if (!this.l) {}
    for (;;)
    {
      this.c = bool;
      return;
      bool = false;
    }
  }
  
  private void K()
  {
    if (this.b.h() == 1073741824) {
      return;
    }
    float f1 = 0.0F;
    int i3 = s();
    int i1 = 0;
    View localView;
    float f2;
    while (i1 < i3)
    {
      localView = h(i1);
      f2 = this.b.c(localView);
      if (f2 < f1)
      {
        label53:
        i1 += 1;
      }
      else
      {
        if (!((gd)localView.getLayoutParams()).a()) {
          break label319;
        }
        f2 = 1.0F * f2 / this.g;
      }
    }
    label155:
    label193:
    label319:
    for (;;)
    {
      f1 = Math.max(f1, f2);
      break label53;
      int i4 = this.j;
      int i2 = Math.round(this.g * f1);
      i1 = i2;
      if (this.b.h() == Integer.MIN_VALUE) {
        i1 = Math.min(i2, this.b.f());
      }
      e(i1);
      if (this.j == i4) {
        break;
      }
      i1 = 0;
      gd localgd;
      if (i1 < i3)
      {
        localView = h(i1);
        localgd = (gd)localView.getLayoutParams();
        if (!localgd.f) {
          break label193;
        }
      }
      for (;;)
      {
        i1 += 1;
        break label155;
        break;
        if ((h()) && (this.i == 1))
        {
          localView.offsetLeftAndRight(-(this.g - 1 - localgd.e.d) * this.j - -(this.g - 1 - localgd.e.d) * i4);
        }
        else
        {
          i2 = localgd.e.d * this.j;
          int i5 = localgd.e.d * i4;
          if (this.i == 1) {
            localView.offsetLeftAndRight(i2 - i5);
          } else {
            localView.offsetTopAndBottom(i2 - i5);
          }
        }
      }
    }
  }
  
  private int L()
  {
    int i1 = s();
    if (i1 == 0) {
      return 0;
    }
    return d(h(i1 - 1));
  }
  
  private int M()
  {
    if (s() == 0) {
      return 0;
    }
    return d(h(0));
  }
  
  private int a(ex paramex, cy paramcy, fe paramfe)
  {
    this.m.set(0, this.g, true);
    int i1;
    int i4;
    label61:
    int i2;
    label64:
    View localView;
    gd localgd;
    int i7;
    int i6;
    label136:
    gj localgj;
    label157:
    label168:
    label189:
    label222:
    int i5;
    gf localgf;
    int i3;
    if (this.k.i) {
      if (paramcy.e == 1)
      {
        i1 = Integer.MAX_VALUE;
        e(paramcy.e, i1);
        if (!this.c) {
          break label506;
        }
        i4 = this.a.d();
        i2 = 0;
        if ((!paramcy.a(paramfe)) || ((!this.k.i) && (this.m.isEmpty()))) {
          break label876;
        }
        localView = paramcy.a(paramex);
        localgd = (gd)localView.getLayoutParams();
        i7 = localgd.e();
        i2 = this.f.c(i7);
        if (i2 != -1) {
          break label518;
        }
        i6 = 1;
        if (i6 == 0) {
          break label534;
        }
        if (!localgd.f) {
          break label524;
        }
        localgj = this.h[0];
        this.f.a(i7, localgj);
        localgd.e = localgj;
        if (paramcy.e != 1) {
          break label546;
        }
        b(localView);
        a(localView, localgd, false);
        if (paramcy.e != 1) {
          break label568;
        }
        if (!localgd.f) {
          break label556;
        }
        i2 = q(i4);
        i5 = i2 + this.a.c(localView);
        if ((i6 == 0) || (!localgd.f)) {
          break label967;
        }
        localgf = m(i2);
        localgf.b = -1;
        localgf.a = i7;
        this.f.a(localgf);
        i3 = i2;
      }
    }
    for (;;)
    {
      if ((localgd.f) && (paramcy.d == -1))
      {
        if (i6 != 0) {
          this.y = true;
        }
      }
      else
      {
        label309:
        a(localView, localgd, paramcy);
        if ((!h()) || (this.i != 1)) {
          break label768;
        }
        if (!localgd.f) {
          break label738;
        }
        i2 = this.b.d();
        label350:
        i7 = i2 - this.b.c(localView);
        i6 = i2;
        i2 = i7;
        if (this.i != 1) {
          break label825;
        }
        b(localView, i2, i3, i6, i5);
        label394:
        if (!localgd.f) {
          break label842;
        }
        e(this.k.e, i1);
        label415:
        a(paramex, this.k);
        if ((this.k.h) && (localView.isFocusable()))
        {
          if (!localgd.f) {
            break label860;
          }
          this.m.clear();
        }
      }
      for (;;)
      {
        i2 = 1;
        break label64;
        i1 = Integer.MIN_VALUE;
        break;
        if (paramcy.e == 1)
        {
          i1 = paramcy.g + paramcy.b;
          break;
        }
        i1 = paramcy.f - paramcy.b;
        break;
        label506:
        i4 = this.a.c();
        break label61;
        label518:
        i6 = 0;
        break label136;
        label524:
        localgj = a(paramcy);
        break label157;
        label534:
        localgj = this.h[i2];
        break label168;
        label546:
        b(localView, 0);
        break label189;
        label556:
        i2 = localgj.b(i4);
        break label222;
        label568:
        if (localgd.f) {}
        for (i2 = p(i4);; i2 = localgj.a(i4))
        {
          i3 = i2 - this.a.c(localView);
          if ((i6 != 0) && (localgd.f))
          {
            localgf = n(i2);
            localgf.b = 1;
            localgf.a = i7;
            this.f.a(localgf);
          }
          i5 = i2;
          break;
        }
        if (paramcy.e == 1) {
          if (!k()) {
            i2 = 1;
          }
        }
        for (;;)
        {
          if (i2 == 0) {
            break label736;
          }
          localgf = this.f.f(i7);
          if (localgf != null) {
            localgf.d = true;
          }
          this.y = true;
          break;
          i2 = 0;
          continue;
          if (!l()) {
            i2 = 1;
          } else {
            i2 = 0;
          }
        }
        label736:
        break label309;
        label738:
        i2 = this.b.d() - (this.g - 1 - localgj.d) * this.j;
        break label350;
        label768:
        if (localgd.f) {}
        for (i2 = this.b.c();; i2 = localgj.d * this.j + this.b.c())
        {
          i6 = i2 + this.b.c(localView);
          break;
        }
        label825:
        b(localView, i3, i2, i5, i6);
        break label394;
        label842:
        a(localgj, this.k.e, i1);
        break label415;
        label860:
        this.m.set(localgj.d, false);
      }
      label876:
      if (i2 == 0) {
        a(paramex, this.k);
      }
      if (this.k.e == -1) {
        i1 = p(this.a.c());
      }
      for (i1 = this.a.c() - i1; i1 > 0; i1 = q(this.a.d()) - this.a.d()) {
        return Math.min(paramcy.b, i1);
      }
      return 0;
      label967:
      i3 = i2;
    }
  }
  
  private int a(fe paramfe)
  {
    boolean bool2 = false;
    if (s() == 0) {
      return 0;
    }
    I();
    dx localdx = this.a;
    if (!this.z) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      View localView = a(bool1, true);
      bool1 = bool2;
      if (!this.z) {
        bool1 = true;
      }
      return fo.a(paramfe, localdx, localView, b(bool1, true), this, this.z, this.c);
    }
  }
  
  private gj a(cy paramcy)
  {
    Object localObject2 = null;
    Object localObject1 = null;
    int i2 = -1;
    int i1;
    int i3;
    int i6;
    int i5;
    int i4;
    if (s(paramcy.e))
    {
      i1 = this.g - 1;
      i3 = -1;
      if (paramcy.e != 1) {
        break label121;
      }
      i6 = this.a.c();
      i5 = Integer.MAX_VALUE;
      i4 = i1;
      paramcy = (cy)localObject1;
      i1 = i5;
      label59:
      localObject1 = paramcy;
      if (i4 == i3) {
        break label192;
      }
      localObject1 = this.h[i4];
      i5 = ((gj)localObject1).b(i6);
      if (i5 >= i1) {
        break label198;
      }
      paramcy = (cy)localObject1;
      i1 = i5;
    }
    label121:
    label192:
    label195:
    label198:
    for (;;)
    {
      i4 += i2;
      break label59;
      i3 = this.g;
      i1 = 0;
      i2 = 1;
      break;
      i6 = this.a.d();
      i5 = Integer.MIN_VALUE;
      i4 = i1;
      paramcy = (cy)localObject2;
      i1 = i5;
      localObject1 = paramcy;
      if (i4 != i3)
      {
        localObject1 = this.h[i4];
        i5 = ((gj)localObject1).a(i6);
        if (i5 <= i1) {
          break label195;
        }
        paramcy = (cy)localObject1;
        i1 = i5;
      }
      for (;;)
      {
        i4 += i2;
        break;
        return (gj)localObject1;
      }
    }
  }
  
  private void a(int paramInt, fe paramfe)
  {
    boolean bool2 = false;
    this.k.b = 0;
    this.k.c = paramInt;
    int i1;
    boolean bool1;
    if (p())
    {
      i1 = paramfe.c();
      if (i1 != -1)
      {
        boolean bool3 = this.c;
        if (i1 < paramInt)
        {
          bool1 = true;
          if (bool3 != bool1) {
            break label157;
          }
          paramInt = this.a.f();
          i1 = 0;
        }
      }
    }
    for (;;)
    {
      label67:
      if (o())
      {
        this.k.f = (this.a.c() - i1);
        this.k.g = (paramInt + this.a.d());
      }
      for (;;)
      {
        this.k.h = false;
        this.k.a = true;
        paramfe = this.k;
        bool1 = bool2;
        if (this.a.h() == 0) {
          bool1 = true;
        }
        paramfe.i = bool1;
        return;
        bool1 = false;
        break;
        label157:
        i1 = this.a.f();
        paramInt = 0;
        break label67;
        this.k.g = (paramInt + this.a.e());
        this.k.f = (-i1);
      }
      paramInt = 0;
      i1 = 0;
    }
  }
  
  private void a(ex paramex, int paramInt)
  {
    for (;;)
    {
      View localView;
      gd localgd;
      if (s() > 0)
      {
        localView = h(0);
        if (this.a.b(localView) <= paramInt)
        {
          localgd = (gd)localView.getLayoutParams();
          if (!localgd.f) {
            break label105;
          }
          i1 = 0;
          if (i1 >= this.g) {
            break label79;
          }
          if (gj.a(this.h[i1]).size() != 1) {
            break label72;
          }
        }
      }
      label72:
      label79:
      label105:
      while (gj.a(localgd.e).size() == 1)
      {
        for (;;)
        {
          return;
          i1 += 1;
        }
        int i1 = 0;
        while (i1 < this.g)
        {
          this.h[i1].h();
          i1 += 1;
        }
      }
      localgd.e.h();
      a(localView, paramex);
    }
  }
  
  private void a(ex paramex, cy paramcy)
  {
    if ((!paramcy.a) || (paramcy.i)) {
      return;
    }
    if (paramcy.b == 0)
    {
      if (paramcy.e == -1)
      {
        b(paramex, paramcy.g);
        return;
      }
      a(paramex, paramcy.f);
      return;
    }
    if (paramcy.e == -1)
    {
      i1 = paramcy.f - o(paramcy.f);
      if (i1 < 0) {}
      for (i1 = paramcy.g;; i1 = paramcy.g - Math.min(i1, paramcy.b))
      {
        b(paramex, i1);
        return;
      }
    }
    int i1 = r(paramcy.g) - paramcy.g;
    if (i1 < 0) {}
    int i2;
    for (i1 = paramcy.f;; i1 = Math.min(i1, paramcy.b) + i2)
    {
      a(paramex, i1);
      return;
      i2 = paramcy.f;
    }
  }
  
  private void a(ex paramex, fe paramfe, boolean paramBoolean)
  {
    I();
    gc localgc = this.x;
    localgc.a();
    if (((this.u != null) || (this.d != -1)) && (paramfe.e() == 0))
    {
      c(paramex);
      return;
    }
    if (this.u != null) {
      a(localgc);
    }
    for (;;)
    {
      a(paramfe, localgc);
      if ((this.u == null) && ((localgc.c != this.o) || (h() != this.t)))
      {
        this.f.a();
        localgc.d = true;
      }
      if ((s() <= 0) || ((this.u != null) && (this.u.c >= 1))) {
        break label251;
      }
      if (!localgc.d) {
        break;
      }
      i1 = 0;
      while (i1 < this.g)
      {
        this.h[i1].e();
        if (localgc.b != Integer.MIN_VALUE) {
          this.h[i1].c(localgc.b);
        }
        i1 += 1;
      }
      J();
      localgc.c = this.c;
    }
    int i1 = 0;
    while (i1 < this.g)
    {
      this.h[i1].a(this.c, localgc.b);
      i1 += 1;
    }
    label251:
    a(paramex);
    this.k.a = false;
    this.y = false;
    e(this.b.f());
    a(localgc.a, paramfe);
    if (localgc.c)
    {
      l(-1);
      a(paramex, this.k, paramfe);
      l(1);
      this.k.c = (localgc.a + this.k.d);
      a(paramex, this.k, paramfe);
      label350:
      K();
      if (s() > 0)
      {
        if (!this.c) {
          break label549;
        }
        b(paramex, paramfe, true);
        c(paramex, paramfe, false);
      }
      label382:
      if ((!paramBoolean) || (paramfe.a())) {
        break label578;
      }
      if ((this.n == 0) || (s() <= 0) || ((!this.y) && (f() == null))) {
        break label566;
      }
      i1 = 1;
      label424:
      if (i1 == 0) {
        break label572;
      }
      a(this.A);
      if (!H()) {
        break label572;
      }
      i1 = 1;
      label448:
      this.d = -1;
      this.e = Integer.MIN_VALUE;
    }
    for (;;)
    {
      this.o = localgc.c;
      this.t = h();
      this.u = null;
      if (i1 == 0) {
        break;
      }
      a(paramex, paramfe, false);
      return;
      l(1);
      a(paramex, this.k, paramfe);
      l(-1);
      this.k.c = (localgc.a + this.k.d);
      a(paramex, this.k, paramfe);
      break label350;
      label549:
      c(paramex, paramfe, true);
      b(paramex, paramfe, false);
      break label382;
      label566:
      i1 = 0;
      break label424;
      label572:
      i1 = 0;
      break label448;
      label578:
      i1 = 0;
    }
  }
  
  private void a(gc paramgc)
  {
    if (this.u.c > 0) {
      if (this.u.c == this.g)
      {
        int i2 = 0;
        if (i2 < this.g)
        {
          this.h[i2].e();
          int i3 = this.u.d[i2];
          int i1 = i3;
          if (i3 != Integer.MIN_VALUE) {
            if (!this.u.i) {
              break label102;
            }
          }
          label102:
          for (i1 = i3 + this.a.d();; i1 = i3 + this.a.c())
          {
            this.h[i2].c(i1);
            i2 += 1;
            break;
          }
        }
      }
      else
      {
        this.u.a();
        this.u.a = this.u.b;
      }
    }
    this.t = this.u.j;
    a(this.u.h);
    J();
    if (this.u.a != -1) {
      this.d = this.u.a;
    }
    for (paramgc.c = this.u.i;; paramgc.c = this.c)
    {
      if (this.u.e > 1)
      {
        this.f.a = this.u.f;
        this.f.b = this.u.g;
      }
      return;
    }
  }
  
  private void a(gj paramgj, int paramInt1, int paramInt2)
  {
    int i1 = paramgj.i();
    if (paramInt1 == -1) {
      if (i1 + paramgj.b() <= paramInt2) {
        this.m.set(paramgj.d, false);
      }
    }
    while (paramgj.d() - i1 < paramInt2) {
      return;
    }
    this.m.set(paramgj.d, false);
  }
  
  private void a(View paramView, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    a(paramView, this.w);
    gd localgd = (gd)paramView.getLayoutParams();
    paramInt1 = b(paramInt1, localgd.leftMargin + this.w.left, localgd.rightMargin + this.w.right);
    paramInt2 = b(paramInt2, localgd.topMargin + this.w.top, localgd.bottomMargin + this.w.bottom);
    if (paramBoolean) {}
    for (paramBoolean = a(paramView, paramInt1, paramInt2, localgd);; paramBoolean = b(paramView, paramInt1, paramInt2, localgd))
    {
      if (paramBoolean) {
        paramView.measure(paramInt1, paramInt2);
      }
      return;
    }
  }
  
  private void a(View paramView, gd paramgd, cy paramcy)
  {
    if (paramcy.e == 1)
    {
      if (paramgd.f)
      {
        p(paramView);
        return;
      }
      paramgd.e.b(paramView);
      return;
    }
    if (paramgd.f)
    {
      q(paramView);
      return;
    }
    paramgd.e.a(paramView);
  }
  
  private void a(View paramView, gd paramgd, boolean paramBoolean)
  {
    if (paramgd.f)
    {
      if (this.i == 1)
      {
        a(paramView, this.v, a(w(), u(), 0, paramgd.height, true), paramBoolean);
        return;
      }
      a(paramView, a(v(), t(), 0, paramgd.width, true), this.v, paramBoolean);
      return;
    }
    if (this.i == 1)
    {
      a(paramView, a(this.j, t(), 0, paramgd.width, false), a(w(), u(), 0, paramgd.height, true), paramBoolean);
      return;
    }
    a(paramView, a(v(), t(), 0, paramgd.width, true), a(this.j, u(), 0, paramgd.height, false), paramBoolean);
  }
  
  private boolean a(gj paramgj)
  {
    boolean bool = true;
    if (this.c)
    {
      if (paramgj.d() < this.a.d()) {
        return !paramgj.c((View)gj.a(paramgj).get(gj.a(paramgj).size() - 1)).f;
      }
    }
    else if (paramgj.b() > this.a.c())
    {
      if (!paramgj.c((View)gj.a(paramgj).get(0)).f) {}
      for (;;)
      {
        return bool;
        bool = false;
      }
    }
    return false;
  }
  
  private int b(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt2 == 0) && (paramInt3 == 0)) {}
    int i1;
    do
    {
      return paramInt1;
      i1 = View.MeasureSpec.getMode(paramInt1);
    } while ((i1 != Integer.MIN_VALUE) && (i1 != 1073741824));
    return View.MeasureSpec.makeMeasureSpec(Math.max(0, View.MeasureSpec.getSize(paramInt1) - paramInt2 - paramInt3), i1);
  }
  
  private void b(ex paramex, int paramInt)
  {
    int i1 = s() - 1;
    for (;;)
    {
      View localView;
      gd localgd;
      if (i1 >= 0)
      {
        localView = h(i1);
        if (this.a.a(localView) >= paramInt)
        {
          localgd = (gd)localView.getLayoutParams();
          if (!localgd.f) {
            break label119;
          }
          i2 = 0;
          if (i2 >= this.g) {
            break label88;
          }
          if (gj.a(this.h[i2]).size() != 1) {
            break label79;
          }
        }
      }
      label79:
      label88:
      label119:
      while (gj.a(localgd.e).size() == 1)
      {
        for (;;)
        {
          return;
          i2 += 1;
        }
        int i2 = 0;
        while (i2 < this.g)
        {
          this.h[i2].g();
          i2 += 1;
        }
      }
      localgd.e.g();
      a(localView, paramex);
      i1 -= 1;
    }
  }
  
  private void b(ex paramex, fe paramfe, boolean paramBoolean)
  {
    int i1 = q(Integer.MIN_VALUE);
    if (i1 == Integer.MIN_VALUE) {}
    do
    {
      do
      {
        return;
        i1 = this.a.d() - i1;
      } while (i1 <= 0);
      i1 -= -c(-i1, paramex, paramfe);
    } while ((!paramBoolean) || (i1 <= 0));
    this.a.a(i1);
  }
  
  private void b(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    gd localgd = (gd)paramView.getLayoutParams();
    a(paramView, paramInt1 + localgd.leftMargin, paramInt2 + localgd.topMargin, paramInt3 - localgd.rightMargin, paramInt4 - localgd.bottomMargin);
  }
  
  private void c(int paramInt1, int paramInt2, int paramInt3)
  {
    int i3;
    int i2;
    int i1;
    if (this.c)
    {
      i3 = L();
      if (paramInt3 != 8) {
        break label104;
      }
      if (paramInt1 >= paramInt2) {
        break label93;
      }
      i2 = paramInt2 + 1;
      i1 = paramInt1;
      label32:
      this.f.b(i1);
      switch (paramInt3)
      {
      default: 
        label76:
        if (i2 > i3) {
          break;
        }
      }
    }
    for (;;)
    {
      return;
      i3 = M();
      break;
      label93:
      i2 = paramInt1 + 1;
      i1 = paramInt2;
      break label32;
      label104:
      i2 = paramInt1 + paramInt2;
      i1 = paramInt1;
      break label32;
      this.f.b(paramInt1, paramInt2);
      break label76;
      this.f.a(paramInt1, paramInt2);
      break label76;
      this.f.a(paramInt1, 1);
      this.f.b(paramInt2, 1);
      break label76;
      if (this.c) {}
      for (paramInt1 = M(); i1 <= paramInt1; paramInt1 = L())
      {
        m();
        return;
      }
    }
  }
  
  private void c(ex paramex, fe paramfe, boolean paramBoolean)
  {
    int i1 = p(Integer.MAX_VALUE);
    if (i1 == Integer.MAX_VALUE) {}
    do
    {
      do
      {
        return;
        i1 -= this.a.c();
      } while (i1 <= 0);
      i1 -= c(i1, paramex, paramfe);
    } while ((!paramBoolean) || (i1 <= 0));
    this.a.a(-i1);
  }
  
  private boolean c(fe paramfe, gc paramgc)
  {
    if (this.o) {}
    for (int i1 = v(paramfe.e());; i1 = u(paramfe.e()))
    {
      paramgc.a = i1;
      paramgc.b = Integer.MIN_VALUE;
      return true;
    }
  }
  
  private void e(int paramInt1, int paramInt2)
  {
    int i1 = 0;
    if (i1 < this.g)
    {
      if (gj.a(this.h[i1]).isEmpty()) {}
      for (;;)
      {
        i1 += 1;
        break;
        a(this.h[i1], paramInt1, paramInt2);
      }
    }
  }
  
  private int h(fe paramfe)
  {
    boolean bool2 = false;
    if (s() == 0) {
      return 0;
    }
    I();
    dx localdx = this.a;
    if (!this.z) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      View localView = a(bool1, true);
      bool1 = bool2;
      if (!this.z) {
        bool1 = true;
      }
      return fo.a(paramfe, localdx, localView, b(bool1, true), this, this.z);
    }
  }
  
  private int i(fe paramfe)
  {
    boolean bool2 = false;
    if (s() == 0) {
      return 0;
    }
    I();
    dx localdx = this.a;
    if (!this.z) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      View localView = a(bool1, true);
      bool1 = bool2;
      if (!this.z) {
        bool1 = true;
      }
      return fo.b(paramfe, localdx, localView, b(bool1, true), this, this.z);
    }
  }
  
  private void l(int paramInt)
  {
    int i1 = 1;
    this.k.e = paramInt;
    cy localcy = this.k;
    boolean bool2 = this.c;
    boolean bool1;
    if (paramInt == -1)
    {
      bool1 = true;
      if (bool2 != bool1) {
        break label49;
      }
    }
    label49:
    for (paramInt = i1;; paramInt = -1)
    {
      localcy.d = paramInt;
      return;
      bool1 = false;
      break;
    }
  }
  
  private gf m(int paramInt)
  {
    gf localgf = new gf();
    localgf.c = new int[this.g];
    int i1 = 0;
    while (i1 < this.g)
    {
      localgf.c[i1] = (paramInt - this.h[i1].b(paramInt));
      i1 += 1;
    }
    return localgf;
  }
  
  private gf n(int paramInt)
  {
    gf localgf = new gf();
    localgf.c = new int[this.g];
    int i1 = 0;
    while (i1 < this.g)
    {
      localgf.c[i1] = (this.h[i1].a(paramInt) - paramInt);
      i1 += 1;
    }
    return localgf;
  }
  
  private int o(int paramInt)
  {
    int i2 = this.h[0].a(paramInt);
    int i1 = 1;
    while (i1 < this.g)
    {
      int i4 = this.h[i1].a(paramInt);
      int i3 = i2;
      if (i4 > i2) {
        i3 = i4;
      }
      i1 += 1;
      i2 = i3;
    }
    return i2;
  }
  
  private int p(int paramInt)
  {
    int i2 = this.h[0].a(paramInt);
    int i1 = 1;
    while (i1 < this.g)
    {
      int i4 = this.h[i1].a(paramInt);
      int i3 = i2;
      if (i4 < i2) {
        i3 = i4;
      }
      i1 += 1;
      i2 = i3;
    }
    return i2;
  }
  
  private void p(View paramView)
  {
    int i1 = this.g - 1;
    while (i1 >= 0)
    {
      this.h[i1].b(paramView);
      i1 -= 1;
    }
  }
  
  private int q(int paramInt)
  {
    int i2 = this.h[0].b(paramInt);
    int i1 = 1;
    while (i1 < this.g)
    {
      int i4 = this.h[i1].b(paramInt);
      int i3 = i2;
      if (i4 > i2) {
        i3 = i4;
      }
      i1 += 1;
      i2 = i3;
    }
    return i2;
  }
  
  private void q(View paramView)
  {
    int i1 = this.g - 1;
    while (i1 >= 0)
    {
      this.h[i1].a(paramView);
      i1 -= 1;
    }
  }
  
  private int r(int paramInt)
  {
    int i2 = this.h[0].b(paramInt);
    int i1 = 1;
    while (i1 < this.g)
    {
      int i4 = this.h[i1].b(paramInt);
      int i3 = i2;
      if (i4 < i2) {
        i3 = i4;
      }
      i1 += 1;
      i2 = i3;
    }
    return i2;
  }
  
  private boolean s(int paramInt)
  {
    int i1;
    if (this.i == 0) {
      if (paramInt == -1)
      {
        i1 = 1;
        if (i1 == this.c) {
          break label29;
        }
      }
    }
    label29:
    label63:
    label66:
    for (;;)
    {
      return true;
      i1 = 0;
      break;
      return false;
      if (paramInt == -1)
      {
        i1 = 1;
        if (i1 != this.c) {
          break label63;
        }
      }
      for (i1 = 1;; i1 = 0)
      {
        if (i1 == h()) {
          break label66;
        }
        return false;
        i1 = 0;
        break;
      }
    }
  }
  
  private int t(int paramInt)
  {
    int i1 = -1;
    if (s() == 0)
    {
      if (this.c) {
        return 1;
      }
      return -1;
    }
    int i2;
    if (paramInt < M())
    {
      i2 = 1;
      if (i2 == this.c) {
        break label47;
      }
    }
    label47:
    for (paramInt = i1;; paramInt = 1)
    {
      return paramInt;
      i2 = 0;
      break;
    }
  }
  
  private int u(int paramInt)
  {
    int i2 = s();
    int i1 = 0;
    while (i1 < i2)
    {
      int i3 = d(h(i1));
      if ((i3 >= 0) && (i3 < paramInt)) {
        return i3;
      }
      i1 += 1;
    }
    return 0;
  }
  
  private int v(int paramInt)
  {
    int i1 = s() - 1;
    while (i1 >= 0)
    {
      int i2 = d(h(i1));
      if ((i2 >= 0) && (i2 < paramInt)) {
        return i2;
      }
      i1 -= 1;
    }
    return 0;
  }
  
  private int w(int paramInt)
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
  
  public int a(int paramInt, ex paramex, fe paramfe)
  {
    return c(paramInt, paramex, paramfe);
  }
  
  public int a(ex paramex, fe paramfe)
  {
    if (this.i == 0) {
      return this.g;
    }
    return super.a(paramex, paramfe);
  }
  
  public es a()
  {
    if (this.i == 0) {
      return new gd(-2, -1);
    }
    return new gd(-1, -2);
  }
  
  public es a(Context paramContext, AttributeSet paramAttributeSet)
  {
    return new gd(paramContext, paramAttributeSet);
  }
  
  public es a(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams)) {
      return new gd((ViewGroup.MarginLayoutParams)paramLayoutParams);
    }
    return new gd(paramLayoutParams);
  }
  
  public View a(View paramView, int paramInt, ex paramex, fe paramfe)
  {
    int i1 = 0;
    if (s() == 0) {
      return null;
    }
    paramView = e(paramView);
    if (paramView == null) {
      return null;
    }
    I();
    J();
    int i2 = w(paramInt);
    if (i2 == Integer.MIN_VALUE) {
      return null;
    }
    Object localObject = (gd)paramView.getLayoutParams();
    boolean bool = ((gd)localObject).f;
    localObject = ((gd)localObject).e;
    if (i2 == 1) {}
    for (paramInt = L();; paramInt = M())
    {
      a(paramInt, paramfe);
      l(i2);
      this.k.c = (this.k.d + paramInt);
      this.k.b = ((int)(0.33333334F * this.a.f()));
      this.k.h = true;
      this.k.a = false;
      a(paramex, this.k, paramfe);
      this.o = this.c;
      if (bool) {
        break;
      }
      paramex = ((gj)localObject).a(paramInt, i2);
      if ((paramex == null) || (paramex == paramView)) {
        break;
      }
      return paramex;
    }
    if (s(i2))
    {
      i1 = this.g - 1;
      while (i1 >= 0)
      {
        paramex = this.h[i1].a(paramInt, i2);
        if ((paramex != null) && (paramex != paramView)) {
          return paramex;
        }
        i1 -= 1;
      }
    }
    do
    {
      i1 += 1;
      if (i1 >= this.g) {
        break;
      }
      paramex = this.h[i1].a(paramInt, i2);
    } while ((paramex == null) || (paramex == paramView));
    return paramex;
    return null;
  }
  
  View a(boolean paramBoolean1, boolean paramBoolean2)
  {
    I();
    int i2 = this.a.c();
    int i3 = this.a.d();
    int i4 = s();
    int i1 = 0;
    Object localObject1 = null;
    if (i1 < i4)
    {
      View localView = h(i1);
      int i5 = this.a.a(localView);
      Object localObject2 = localObject1;
      if (this.a.b(localView) > i2)
      {
        if (i5 < i3) {
          break label97;
        }
        localObject2 = localObject1;
      }
      for (;;)
      {
        i1 += 1;
        localObject1 = localObject2;
        break;
        label97:
        if ((i5 >= i2) || (!paramBoolean1)) {
          return localView;
        }
        localObject2 = localObject1;
        if (paramBoolean2)
        {
          localObject2 = localObject1;
          if (localObject1 == null) {
            localObject2 = localView;
          }
        }
      }
    }
    return (View)localObject1;
  }
  
  public void a(int paramInt)
  {
    a(null);
    if (paramInt != this.g)
    {
      g();
      this.g = paramInt;
      this.m = new BitSet(this.g);
      this.h = new gj[this.g];
      paramInt = 0;
      while (paramInt < this.g)
      {
        this.h[paramInt] = new gj(this, paramInt, null);
        paramInt += 1;
      }
      m();
    }
  }
  
  public void a(Rect paramRect, int paramInt1, int paramInt2)
  {
    int i1 = x();
    int i2 = z() + i1;
    int i3 = y() + A();
    if (this.i == 1)
    {
      i1 = a(paramInt2, i3 + paramRect.height(), D());
      paramInt2 = a(paramInt1, i2 + this.j * this.g, C());
      paramInt1 = i1;
    }
    for (;;)
    {
      d(paramInt2, paramInt1);
      return;
      i1 = a(paramInt1, i2 + paramRect.width(), C());
      paramInt1 = a(paramInt2, i3 + this.j * this.g, D());
      paramInt2 = i1;
    }
  }
  
  public void a(Parcelable paramParcelable)
  {
    if ((paramParcelable instanceof gh))
    {
      this.u = ((gh)paramParcelable);
      m();
    }
  }
  
  public void a(RecyclerView paramRecyclerView)
  {
    this.f.a();
    m();
  }
  
  public void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    c(paramInt1, paramInt2, 1);
  }
  
  public void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2, int paramInt3)
  {
    c(paramInt1, paramInt2, 8);
  }
  
  public void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2, Object paramObject)
  {
    c(paramInt1, paramInt2, 4);
  }
  
  public void a(RecyclerView paramRecyclerView, ex paramex)
  {
    a(this.A);
    int i1 = 0;
    while (i1 < this.g)
    {
      this.h[i1].e();
      i1 += 1;
    }
  }
  
  public void a(ex paramex, fe paramfe, View paramView, g paramg)
  {
    paramex = paramView.getLayoutParams();
    if (!(paramex instanceof gd))
    {
      super.a(paramView, paramg);
      return;
    }
    paramex = (gd)paramex;
    if (this.i == 0)
    {
      i2 = paramex.b();
      if (paramex.f) {}
      for (i1 = this.g;; i1 = 1)
      {
        paramg.b(r.a(i2, i1, -1, -1, paramex.f, false));
        return;
      }
    }
    int i2 = paramex.b();
    if (paramex.f) {}
    for (int i1 = this.g;; i1 = 1)
    {
      paramg.b(r.a(-1, -1, i2, i1, paramex.f, false));
      return;
    }
  }
  
  void a(fe paramfe, gc paramgc)
  {
    if (b(paramfe, paramgc)) {}
    while (c(paramfe, paramgc)) {
      return;
    }
    paramgc.b();
    paramgc.a = 0;
  }
  
  public void a(AccessibilityEvent paramAccessibilityEvent)
  {
    super.a(paramAccessibilityEvent);
    View localView1;
    View localView2;
    if (s() > 0)
    {
      paramAccessibilityEvent = a.a(paramAccessibilityEvent);
      localView1 = a(false, true);
      localView2 = b(false, true);
      if ((localView1 != null) && (localView2 != null)) {}
    }
    else
    {
      return;
    }
    int i1 = d(localView1);
    int i2 = d(localView2);
    if (i1 < i2)
    {
      paramAccessibilityEvent.b(i1);
      paramAccessibilityEvent.c(i2);
      return;
    }
    paramAccessibilityEvent.b(i2);
    paramAccessibilityEvent.c(i1);
  }
  
  public void a(String paramString)
  {
    if (this.u == null) {
      super.a(paramString);
    }
  }
  
  public void a(boolean paramBoolean)
  {
    a(null);
    if ((this.u != null) && (this.u.h != paramBoolean)) {
      this.u.h = paramBoolean;
    }
    this.l = paramBoolean;
    m();
  }
  
  public boolean a(es parames)
  {
    return parames instanceof gd;
  }
  
  public int b(int paramInt, ex paramex, fe paramfe)
  {
    return c(paramInt, paramex, paramfe);
  }
  
  public int b(ex paramex, fe paramfe)
  {
    if (this.i == 1) {
      return this.g;
    }
    return super.b(paramex, paramfe);
  }
  
  public int b(fe paramfe)
  {
    return a(paramfe);
  }
  
  View b(boolean paramBoolean1, boolean paramBoolean2)
  {
    I();
    int i2 = this.a.c();
    int i3 = this.a.d();
    int i1 = s() - 1;
    Object localObject1 = null;
    if (i1 >= 0)
    {
      View localView = h(i1);
      int i4 = this.a.a(localView);
      int i5 = this.a.b(localView);
      Object localObject2 = localObject1;
      if (i5 > i2)
      {
        if (i4 < i3) {
          break label98;
        }
        localObject2 = localObject1;
      }
      for (;;)
      {
        i1 -= 1;
        localObject1 = localObject2;
        break;
        label98:
        if ((i5 <= i3) || (!paramBoolean1)) {
          return localView;
        }
        localObject2 = localObject1;
        if (paramBoolean2)
        {
          localObject2 = localObject1;
          if (localObject1 == null) {
            localObject2 = localView;
          }
        }
      }
    }
    return (View)localObject1;
  }
  
  public void b(int paramInt)
  {
    if ((paramInt != 0) && (paramInt != 1)) {
      throw new IllegalArgumentException("invalid orientation.");
    }
    a(null);
    if (paramInt == this.i) {
      return;
    }
    this.i = paramInt;
    if ((this.a != null) && (this.b != null))
    {
      dx localdx = this.a;
      this.a = this.b;
      this.b = localdx;
    }
    m();
  }
  
  public void b(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    c(paramInt1, paramInt2, 2);
  }
  
  public boolean b()
  {
    return this.u == null;
  }
  
  boolean b(fe paramfe, gc paramgc)
  {
    boolean bool = false;
    if ((paramfe.a()) || (this.d == -1)) {
      return false;
    }
    if ((this.d < 0) || (this.d >= paramfe.e()))
    {
      this.d = -1;
      this.e = Integer.MIN_VALUE;
      return false;
    }
    if ((this.u == null) || (this.u.a == -1) || (this.u.c < 1))
    {
      paramfe = c(this.d);
      if (paramfe != null)
      {
        if (this.c) {}
        for (int i1 = L();; i1 = M())
        {
          paramgc.a = i1;
          if (this.e == Integer.MIN_VALUE) {
            break label188;
          }
          if (!paramgc.c) {
            break;
          }
          paramgc.b = (this.a.d() - this.e - this.a.b(paramfe));
          return true;
        }
        paramgc.b = (this.a.c() + this.e - this.a.a(paramfe));
        return true;
        label188:
        if (this.a.c(paramfe) > this.a.f())
        {
          if (paramgc.c) {}
          for (i1 = this.a.d();; i1 = this.a.c())
          {
            paramgc.b = i1;
            return true;
          }
        }
        i1 = this.a.a(paramfe) - this.a.c();
        if (i1 < 0)
        {
          paramgc.b = (-i1);
          return true;
        }
        i1 = this.a.d() - this.a.b(paramfe);
        if (i1 < 0)
        {
          paramgc.b = i1;
          return true;
        }
        paramgc.b = Integer.MIN_VALUE;
        return true;
      }
      paramgc.a = this.d;
      if (this.e == Integer.MIN_VALUE)
      {
        if (t(paramgc.a) == 1) {
          bool = true;
        }
        paramgc.c = bool;
        paramgc.b();
      }
      for (;;)
      {
        paramgc.d = true;
        return true;
        paramgc.a(this.e);
      }
    }
    paramgc.b = Integer.MIN_VALUE;
    paramgc.a = this.d;
    return true;
  }
  
  int c(int paramInt, ex paramex, fe paramfe)
  {
    I();
    int i2;
    int i1;
    if (paramInt > 0)
    {
      i2 = L();
      i1 = 1;
      this.k.a = true;
      a(i2, paramfe);
      l(i1);
      this.k.c = (this.k.d + i2);
      i2 = Math.abs(paramInt);
      this.k.b = i2;
      i1 = a(paramex, this.k, paramfe);
      if (i2 >= i1) {
        break label120;
      }
    }
    for (;;)
    {
      this.a.a(-paramInt);
      this.o = this.c;
      return paramInt;
      i1 = -1;
      i2 = M();
      break;
      label120:
      if (paramInt < 0) {
        paramInt = -i1;
      } else {
        paramInt = i1;
      }
    }
  }
  
  public int c(fe paramfe)
  {
    return a(paramfe);
  }
  
  public Parcelable c()
  {
    if (this.u != null) {
      return new gh(this.u);
    }
    gh localgh = new gh();
    localgh.h = this.l;
    localgh.i = this.o;
    localgh.j = this.t;
    int i1;
    label130:
    int i2;
    label167:
    int i3;
    if ((this.f != null) && (this.f.a != null))
    {
      localgh.f = this.f.a;
      localgh.e = localgh.f.length;
      localgh.g = this.f.b;
      if (s() <= 0) {
        break label277;
      }
      I();
      if (!this.o) {
        break label236;
      }
      i1 = L();
      localgh.a = i1;
      localgh.b = i();
      localgh.c = this.g;
      localgh.d = new int[this.g];
      i2 = 0;
      if (i2 >= this.g) {
        break label295;
      }
      if (!this.o) {
        break label244;
      }
      i3 = this.h[i2].b(Integer.MIN_VALUE);
      i1 = i3;
      if (i3 != Integer.MIN_VALUE) {
        i1 = i3 - this.a.d();
      }
    }
    for (;;)
    {
      localgh.d[i2] = i1;
      i2 += 1;
      break label167;
      localgh.e = 0;
      break;
      label236:
      i1 = M();
      break label130;
      label244:
      i3 = this.h[i2].a(Integer.MIN_VALUE);
      i1 = i3;
      if (i3 != Integer.MIN_VALUE) {
        i1 = i3 - this.a.c();
      }
    }
    label277:
    localgh.a = -1;
    localgh.b = -1;
    localgh.c = 0;
    label295:
    return localgh;
  }
  
  public void c(ex paramex, fe paramfe)
  {
    a(paramex, paramfe, true);
  }
  
  public int d(fe paramfe)
  {
    return h(paramfe);
  }
  
  public void d(int paramInt)
  {
    if ((this.u != null) && (this.u.a != paramInt)) {
      this.u.b();
    }
    this.d = paramInt;
    this.e = Integer.MIN_VALUE;
    m();
  }
  
  public boolean d()
  {
    return this.i == 0;
  }
  
  public int e(fe paramfe)
  {
    return h(paramfe);
  }
  
  void e(int paramInt)
  {
    this.j = (paramInt / this.g);
    this.v = View.MeasureSpec.makeMeasureSpec(paramInt, this.b.h());
  }
  
  public boolean e()
  {
    return this.i == 1;
  }
  
  public int f(fe paramfe)
  {
    return i(paramfe);
  }
  
  View f()
  {
    int i1 = s() - 1;
    BitSet localBitSet = new BitSet(this.g);
    localBitSet.set(0, this.g, true);
    int i2;
    int i3;
    if ((this.i == 1) && (h()))
    {
      i2 = 1;
      if (!this.c) {
        break label128;
      }
      i3 = -1;
      label57:
      if (i1 >= i3) {
        break label137;
      }
    }
    int i5;
    View localView;
    gd localgd;
    label128:
    label137:
    for (int i4 = 1;; i4 = -1)
    {
      i5 = i1;
      if (i5 == i3) {
        break label343;
      }
      localView = h(i5);
      localgd = (gd)localView.getLayoutParams();
      if (!localBitSet.get(localgd.e.d)) {
        break label156;
      }
      if (!a(localgd.e)) {
        break label143;
      }
      return localView;
      i2 = -1;
      break;
      i3 = i1 + 1;
      i1 = 0;
      break label57;
    }
    label143:
    localBitSet.clear(localgd.e.d);
    label156:
    if (localgd.f) {}
    label275:
    label337:
    label341:
    label343:
    label345:
    label348:
    for (;;)
    {
      i5 += i4;
      break;
      if (i5 + i4 != i3)
      {
        Object localObject = h(i5 + i4);
        int i6;
        if (this.c)
        {
          i1 = this.a.b(localView);
          i6 = this.a.b((View)localObject);
          if (i1 < i6) {
            return localView;
          }
          if (i1 != i6) {
            break label345;
          }
          i1 = 1;
        }
        for (;;)
        {
          if (i1 == 0) {
            break label348;
          }
          localObject = (gd)((View)localObject).getLayoutParams();
          if (localgd.e.d - ((gd)localObject).e.d < 0)
          {
            i1 = 1;
            if (i2 >= 0) {
              break label337;
            }
          }
          for (i6 = 1;; i6 = 0)
          {
            if (i1 == i6) {
              break label341;
            }
            return localView;
            i1 = this.a.a(localView);
            i6 = this.a.a((View)localObject);
            if (i1 > i6) {
              return localView;
            }
            if (i1 != i6) {
              break label345;
            }
            i1 = 1;
            break;
            i1 = 0;
            break label275;
          }
          break;
          return null;
          i1 = 0;
        }
      }
    }
  }
  
  public int g(fe paramfe)
  {
    return i(paramfe);
  }
  
  public void g()
  {
    this.f.a();
    m();
  }
  
  boolean h()
  {
    return q() == 1;
  }
  
  int i()
  {
    if (this.c) {}
    for (View localView = b(true, true); localView == null; localView = a(true, true)) {
      return -1;
    }
    return d(localView);
  }
  
  public void i(int paramInt)
  {
    super.i(paramInt);
    int i1 = 0;
    while (i1 < this.g)
    {
      this.h[i1].d(paramInt);
      i1 += 1;
    }
  }
  
  public void j(int paramInt)
  {
    super.j(paramInt);
    int i1 = 0;
    while (i1 < this.g)
    {
      this.h[i1].d(paramInt);
      i1 += 1;
    }
  }
  
  public void k(int paramInt)
  {
    if (paramInt == 0) {
      H();
    }
  }
  
  boolean k()
  {
    boolean bool2 = true;
    int i2 = this.h[0].b(Integer.MIN_VALUE);
    int i1 = 1;
    for (;;)
    {
      boolean bool1 = bool2;
      if (i1 < this.g)
      {
        if (this.h[i1].b(Integer.MIN_VALUE) != i2) {
          bool1 = false;
        }
      }
      else {
        return bool1;
      }
      i1 += 1;
    }
  }
  
  boolean l()
  {
    boolean bool2 = true;
    int i2 = this.h[0].a(Integer.MIN_VALUE);
    int i1 = 1;
    for (;;)
    {
      boolean bool1 = bool2;
      if (i1 < this.g)
      {
        if (this.h[i1].a(Integer.MIN_VALUE) != i2) {
          bool1 = false;
        }
      }
      else {
        return bool1;
      }
      i1 += 1;
    }
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/StaggeredGridLayoutManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */