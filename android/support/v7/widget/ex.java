package android.support.v7.widget;

import android.support.v4.i.bu;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ex
{
  final ArrayList a = new ArrayList();
  final ArrayList b = new ArrayList();
  private ArrayList d = null;
  private final List e = Collections.unmodifiableList(this.a);
  private int f = 2;
  private ew g;
  private ff h;
  
  public ex(RecyclerView paramRecyclerView) {}
  
  private void a(ViewGroup paramViewGroup, boolean paramBoolean)
  {
    int i = paramViewGroup.getChildCount() - 1;
    while (i >= 0)
    {
      View localView = paramViewGroup.getChildAt(i);
      if ((localView instanceof ViewGroup)) {
        a((ViewGroup)localView, true);
      }
      i -= 1;
    }
    if (!paramBoolean) {
      return;
    }
    if (paramViewGroup.getVisibility() == 4)
    {
      paramViewGroup.setVisibility(0);
      paramViewGroup.setVisibility(4);
      return;
    }
    i = paramViewGroup.getVisibility();
    paramViewGroup.setVisibility(4);
    paramViewGroup.setVisibility(i);
  }
  
  private void d(View paramView)
  {
    if (this.c.i())
    {
      if (bu.e(paramView) == 0) {
        bu.c(paramView, 1);
      }
      if (!bu.b(paramView)) {
        bu.a(paramView, RecyclerView.m(this.c).b());
      }
    }
  }
  
  private void f(fh paramfh)
  {
    if ((paramfh.a instanceof ViewGroup)) {
      a((ViewGroup)paramfh.a, false);
    }
  }
  
  fh a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int j = 0;
    int k = this.a.size();
    int i = 0;
    Object localObject;
    fh localfh;
    for (;;)
    {
      if (i < k)
      {
        localObject = (fh)this.a.get(i);
        if ((((fh)localObject).k()) || (((fh)localObject).d() != paramInt1) || (((fh)localObject).n()) || ((!fe.f(this.c.g)) && (((fh)localObject).q()))) {
          break label251;
        }
        if ((paramInt2 != -1) && (((fh)localObject).h() != paramInt2)) {
          Log.e("RecyclerView", "Scrap view for position " + paramInt1 + " isn't dirty but has" + " wrong view type! (found " + ((fh)localObject).h() + " but expected " + paramInt2 + ")");
        }
      }
      else
      {
        if (paramBoolean) {
          break label288;
        }
        localObject = this.c.c.a(paramInt1, paramInt2);
        if (localObject == null) {
          break label288;
        }
        localfh = RecyclerView.c((View)localObject);
        this.c.c.e((View)localObject);
        paramInt1 = this.c.c.b((View)localObject);
        if (paramInt1 != -1) {
          break;
        }
        throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + localfh);
      }
      ((fh)localObject).b(32);
      return (fh)localObject;
      label251:
      i += 1;
    }
    this.c.c.d(paramInt1);
    c((View)localObject);
    localfh.b(8224);
    return localfh;
    label288:
    i = this.b.size();
    paramInt2 = j;
    for (;;)
    {
      if (paramInt2 >= i) {
        break label363;
      }
      localfh = (fh)this.b.get(paramInt2);
      if ((!localfh.n()) && (localfh.d() == paramInt1))
      {
        localObject = localfh;
        if (paramBoolean) {
          break;
        }
        this.b.remove(paramInt2);
        return localfh;
      }
      paramInt2 += 1;
    }
    label363:
    return null;
  }
  
  fh a(long paramLong, int paramInt, boolean paramBoolean)
  {
    int i = this.a.size() - 1;
    fh localfh2;
    fh localfh1;
    while (i >= 0)
    {
      localfh2 = (fh)this.a.get(i);
      if ((localfh2.g() == paramLong) && (!localfh2.k()))
      {
        if (paramInt == localfh2.h())
        {
          localfh2.b(32);
          localfh1 = localfh2;
          if (localfh2.q())
          {
            localfh1 = localfh2;
            if (!this.c.g.a())
            {
              localfh2.a(2, 14);
              localfh1 = localfh2;
            }
          }
          return localfh1;
        }
        if (!paramBoolean)
        {
          this.a.remove(i);
          this.c.removeDetachedView(localfh2.a, false);
          b(localfh2.a);
        }
      }
      i -= 1;
    }
    i = this.b.size() - 1;
    for (;;)
    {
      if (i < 0) {
        break label245;
      }
      localfh2 = (fh)this.b.get(i);
      if (localfh2.g() == paramLong)
      {
        if (paramInt == localfh2.h())
        {
          localfh1 = localfh2;
          if (paramBoolean) {
            break;
          }
          this.b.remove(i);
          return localfh2;
        }
        if (!paramBoolean) {
          d(i);
        }
      }
      i -= 1;
    }
    label245:
    return null;
  }
  
  View a(int paramInt, boolean paramBoolean)
  {
    boolean bool = true;
    if ((paramInt < 0) || (paramInt >= this.c.g.e())) {
      throw new IndexOutOfBoundsException("Invalid item position " + paramInt + "(" + paramInt + "). Item count:" + this.c.g.e());
    }
    Object localObject2;
    int i;
    if (this.c.g.a())
    {
      localObject2 = f(paramInt);
      if (localObject2 != null) {
        i = 1;
      }
    }
    for (;;)
    {
      Object localObject1 = localObject2;
      if (localObject2 == null)
      {
        localObject2 = a(paramInt, -1, paramBoolean);
        localObject1 = localObject2;
        if (localObject2 != null) {
          if (!a((fh)localObject2)) {
            if (!paramBoolean)
            {
              ((fh)localObject2).b(4);
              if (((fh)localObject2).i())
              {
                this.c.removeDetachedView(((fh)localObject2).a, false);
                ((fh)localObject2).j();
                label174:
                b((fh)localObject2);
              }
            }
            else
            {
              localObject1 = null;
            }
          }
        }
      }
      for (;;)
      {
        Object localObject3 = localObject1;
        int k = i;
        int j;
        if (localObject1 == null)
        {
          k = this.c.b.b(paramInt);
          if ((k < 0) || (k >= RecyclerView.f(this.c).a()))
          {
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + paramInt + "(offset:" + k + ")." + "state:" + this.c.g.e());
            i = 0;
            break;
            if (!((fh)localObject2).k()) {
              break label174;
            }
            ((fh)localObject2).l();
            break label174;
            i = 1;
            localObject1 = localObject2;
            continue;
          }
          int m = RecyclerView.f(this.c).a(k);
          localObject2 = localObject1;
          j = i;
          if (RecyclerView.f(this.c).b())
          {
            localObject1 = a(RecyclerView.f(this.c).b(k), m, paramBoolean);
            localObject2 = localObject1;
            j = i;
            if (localObject1 != null)
            {
              ((fh)localObject1).b = k;
              j = 1;
              localObject2 = localObject1;
            }
          }
          localObject1 = localObject2;
          if (localObject2 == null)
          {
            localObject1 = localObject2;
            if (this.h != null)
            {
              localObject3 = this.h.a(this, paramInt, m);
              localObject1 = localObject2;
              if (localObject3 != null)
              {
                localObject2 = this.c.a((View)localObject3);
                if (localObject2 == null) {
                  throw new IllegalArgumentException("getViewForPositionAndType returned a view which does not have a ViewHolder");
                }
                localObject1 = localObject2;
                if (((fh)localObject2).c()) {
                  throw new IllegalArgumentException("getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view.");
                }
              }
            }
          }
          localObject2 = localObject1;
          if (localObject1 == null)
          {
            localObject1 = f().a(m);
            localObject2 = localObject1;
            if (localObject1 != null)
            {
              ((fh)localObject1).v();
              localObject2 = localObject1;
              if (RecyclerView.r())
              {
                f((fh)localObject1);
                localObject2 = localObject1;
              }
            }
          }
          localObject3 = localObject2;
          k = j;
          if (localObject2 == null) {
            localObject2 = RecyclerView.f(this.c).b(this.c, m);
          }
        }
        for (i = j;; i = k)
        {
          if ((i != 0) && (!this.c.g.a()) && (((fh)localObject2).a(8192)))
          {
            ((fh)localObject2).a(0, 8192);
            if (fe.c(this.c.g))
            {
              j = ek.d((fh)localObject2);
              localObject1 = this.c.f.a(this.c.g, (fh)localObject2, j | 0x1000, ((fh)localObject2).u());
              RecyclerView.a(this.c, (fh)localObject2, (en)localObject1);
            }
          }
          if ((this.c.g.a()) && (((fh)localObject2).p()))
          {
            ((fh)localObject2).f = paramInt;
            paramInt = 0;
          }
          for (;;)
          {
            localObject1 = ((fh)localObject2).a.getLayoutParams();
            if (localObject1 == null)
            {
              localObject1 = (es)this.c.generateDefaultLayoutParams();
              ((fh)localObject2).a.setLayoutParams((ViewGroup.LayoutParams)localObject1);
              label748:
              ((es)localObject1).a = ((fh)localObject2);
              if ((i == 0) || (paramInt == 0)) {
                break label920;
              }
            }
            label920:
            for (paramBoolean = bool;; paramBoolean = false)
            {
              ((es)localObject1).d = paramBoolean;
              return ((fh)localObject2).a;
              if ((((fh)localObject2).p()) && (!((fh)localObject2).o()) && (!((fh)localObject2).n())) {
                break label925;
              }
              j = this.c.b.b(paramInt);
              ((fh)localObject2).k = this.c;
              RecyclerView.f(this.c).b((fh)localObject2, j);
              d(((fh)localObject2).a);
              if (this.c.g.a()) {
                ((fh)localObject2).f = paramInt;
              }
              paramInt = 1;
              break;
              if (!this.c.checkLayoutParams((ViewGroup.LayoutParams)localObject1))
              {
                localObject1 = (es)this.c.generateLayoutParams((ViewGroup.LayoutParams)localObject1);
                ((fh)localObject2).a.setLayoutParams((ViewGroup.LayoutParams)localObject1);
                break label748;
              }
              localObject1 = (es)localObject1;
              break label748;
            }
            label925:
            paramInt = 0;
          }
          localObject2 = localObject3;
        }
      }
      localObject2 = null;
      i = 0;
    }
  }
  
  public void a()
  {
    this.a.clear();
    c();
  }
  
  public void a(int paramInt)
  {
    this.f = paramInt;
    int i = this.b.size() - 1;
    while ((i >= 0) && (this.b.size() > paramInt))
    {
      d(i);
      i -= 1;
    }
  }
  
  void a(int paramInt1, int paramInt2)
  {
    int i;
    int j;
    int k;
    int m;
    label25:
    fh localfh;
    if (paramInt1 < paramInt2)
    {
      i = -1;
      j = paramInt2;
      k = paramInt1;
      int n = this.b.size();
      m = 0;
      if (m >= n) {
        return;
      }
      localfh = (fh)this.b.get(m);
      if ((localfh != null) && (localfh.b >= k) && (localfh.b <= j)) {
        break label91;
      }
    }
    for (;;)
    {
      m += 1;
      break label25;
      i = 1;
      j = paramInt1;
      k = paramInt2;
      break;
      label91:
      if (localfh.b == paramInt1) {
        localfh.a(paramInt2 - paramInt1, false);
      } else {
        localfh.a(i, false);
      }
    }
  }
  
  void a(eg parameg1, eg parameg2, boolean paramBoolean)
  {
    a();
    f().a(parameg1, parameg2, paramBoolean);
  }
  
  void a(ew paramew)
  {
    if (this.g != null) {
      this.g.b();
    }
    this.g = paramew;
    if (paramew != null) {
      this.g.a(this.c.getAdapter());
    }
  }
  
  void a(ff paramff)
  {
    this.h = paramff;
  }
  
  public void a(View paramView)
  {
    fh localfh = RecyclerView.c(paramView);
    if (localfh.r()) {
      this.c.removeDetachedView(paramView, false);
    }
    if (localfh.i()) {
      localfh.j();
    }
    for (;;)
    {
      b(localfh);
      return;
      if (localfh.k()) {
        localfh.l();
      }
    }
  }
  
  boolean a(fh paramfh)
  {
    boolean bool2 = true;
    boolean bool1;
    if (paramfh.q()) {
      bool1 = this.c.g.a();
    }
    do
    {
      do
      {
        return bool1;
        if ((paramfh.b < 0) || (paramfh.b >= RecyclerView.f(this.c).a())) {
          throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + paramfh);
        }
        if ((!this.c.g.a()) && (RecyclerView.f(this.c).a(paramfh.b) != paramfh.h())) {
          return false;
        }
        bool1 = bool2;
      } while (!RecyclerView.f(this.c).b());
      bool1 = bool2;
    } while (paramfh.g() == RecyclerView.f(this.c).b(paramfh.b));
    return false;
  }
  
  public int b(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.c.g.e())) {
      throw new IndexOutOfBoundsException("invalid position " + paramInt + ". State " + "item count is " + this.c.g.e());
    }
    if (!this.c.g.a()) {
      return paramInt;
    }
    return this.c.b.b(paramInt);
  }
  
  public List b()
  {
    return this.e;
  }
  
  void b(int paramInt1, int paramInt2)
  {
    int j = this.b.size();
    int i = 0;
    while (i < j)
    {
      fh localfh = (fh)this.b.get(i);
      if ((localfh != null) && (localfh.b >= paramInt1)) {
        localfh.a(paramInt2, true);
      }
      i += 1;
    }
  }
  
  void b(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i = this.b.size() - 1;
    if (i >= 0)
    {
      fh localfh = (fh)this.b.get(i);
      if (localfh != null)
      {
        if (localfh.b < paramInt1 + paramInt2) {
          break label63;
        }
        localfh.a(-paramInt2, paramBoolean);
      }
      for (;;)
      {
        i -= 1;
        break;
        label63:
        if (localfh.b >= paramInt1)
        {
          localfh.b(8);
          d(i);
        }
      }
    }
  }
  
  void b(fh paramfh)
  {
    boolean bool = true;
    int j = 0;
    if ((paramfh.i()) || (paramfh.a.getParent() != null))
    {
      StringBuilder localStringBuilder = new StringBuilder().append("Scrapped or attached views may not be recycled. isScrap:").append(paramfh.i()).append(" isAttached:");
      if (paramfh.a.getParent() != null) {}
      for (;;)
      {
        throw new IllegalArgumentException(bool);
        bool = false;
      }
    }
    if (paramfh.r()) {
      throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + paramfh);
    }
    if (paramfh.c()) {
      throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.");
    }
    bool = fh.c(paramfh);
    int i;
    if ((RecyclerView.f(this.c) != null) && (bool) && (RecyclerView.f(this.c).b(paramfh)))
    {
      i = 1;
      if ((i == 0) && (!paramfh.w())) {
        break label292;
      }
      if (paramfh.a(14)) {
        break label287;
      }
      i = this.b.size();
      if ((i == this.f) && (i > 0)) {
        d(0);
      }
      if (i >= this.f) {
        break label287;
      }
      this.b.add(paramfh);
      i = 1;
      label238:
      if (i != 0) {
        break label284;
      }
      c(paramfh);
      j = 1;
    }
    for (;;)
    {
      this.c.d.g(paramfh);
      if ((i == 0) && (j == 0) && (bool)) {
        paramfh.k = null;
      }
      return;
      i = 0;
      break;
      label284:
      continue;
      label287:
      i = 0;
      break label238;
      label292:
      i = 0;
    }
  }
  
  void b(View paramView)
  {
    paramView = RecyclerView.c(paramView);
    fh.a(paramView, null);
    fh.a(paramView, false);
    paramView.l();
    b(paramView);
  }
  
  public View c(int paramInt)
  {
    return a(paramInt, false);
  }
  
  void c()
  {
    int i = this.b.size() - 1;
    while (i >= 0)
    {
      d(i);
      i -= 1;
    }
    this.b.clear();
  }
  
  void c(int paramInt1, int paramInt2)
  {
    int i = this.b.size() - 1;
    if (i >= 0)
    {
      fh localfh = (fh)this.b.get(i);
      if (localfh == null) {}
      for (;;)
      {
        i -= 1;
        break;
        int j = localfh.d();
        if ((j >= paramInt1) && (j < paramInt1 + paramInt2))
        {
          localfh.b(2);
          d(i);
        }
      }
    }
  }
  
  void c(fh paramfh)
  {
    bu.a(paramfh.a, null);
    e(paramfh);
    paramfh.k = null;
    f().a(paramfh);
  }
  
  void c(View paramView)
  {
    paramView = RecyclerView.c(paramView);
    if ((paramView.a(12)) || (!paramView.x()) || (RecyclerView.a(this.c, paramView)))
    {
      if ((paramView.n()) && (!paramView.q()) && (!RecyclerView.f(this.c).b())) {
        throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.");
      }
      paramView.a(this, false);
      this.a.add(paramView);
      return;
    }
    if (this.d == null) {
      this.d = new ArrayList();
    }
    paramView.a(this, true);
    this.d.add(paramView);
  }
  
  int d()
  {
    return this.a.size();
  }
  
  void d(int paramInt)
  {
    c((fh)this.b.get(paramInt));
    this.b.remove(paramInt);
  }
  
  void d(fh paramfh)
  {
    if (fh.d(paramfh)) {
      this.d.remove(paramfh);
    }
    for (;;)
    {
      fh.a(paramfh, null);
      fh.a(paramfh, false);
      paramfh.l();
      return;
      this.a.remove(paramfh);
    }
  }
  
  View e(int paramInt)
  {
    return ((fh)this.a.get(paramInt)).a;
  }
  
  void e()
  {
    this.a.clear();
    if (this.d != null) {
      this.d.clear();
    }
  }
  
  void e(fh paramfh)
  {
    if (RecyclerView.n(this.c) != null) {
      RecyclerView.n(this.c).a(paramfh);
    }
    if (RecyclerView.f(this.c) != null) {
      RecyclerView.f(this.c).a(paramfh);
    }
    if (this.c.g != null) {
      this.c.d.g(paramfh);
    }
  }
  
  ew f()
  {
    if (this.g == null) {
      this.g = new ew();
    }
    return this.g;
  }
  
  fh f(int paramInt)
  {
    int j = 0;
    int k;
    if (this.d != null)
    {
      k = this.d.size();
      if (k != 0) {}
    }
    else
    {
      return null;
    }
    int i = 0;
    fh localfh;
    while (i < k)
    {
      localfh = (fh)this.d.get(i);
      if ((!localfh.k()) && (localfh.d() == paramInt))
      {
        localfh.b(32);
        return localfh;
      }
      i += 1;
    }
    if (RecyclerView.f(this.c).b())
    {
      paramInt = this.c.b.b(paramInt);
      if ((paramInt > 0) && (paramInt < RecyclerView.f(this.c).a()))
      {
        long l = RecyclerView.f(this.c).b(paramInt);
        paramInt = j;
        while (paramInt < k)
        {
          localfh = (fh)this.d.get(paramInt);
          if ((!localfh.k()) && (localfh.g() == l))
          {
            localfh.b(32);
            return localfh;
          }
          paramInt += 1;
        }
      }
    }
    return null;
  }
  
  void g()
  {
    int j = this.b.size();
    int i = 0;
    while (i < j)
    {
      fh localfh = (fh)this.b.get(i);
      if (localfh != null) {
        localfh.b(512);
      }
      i += 1;
    }
  }
  
  void h()
  {
    int j;
    int i;
    if ((RecyclerView.f(this.c) != null) && (RecyclerView.f(this.c).b()))
    {
      j = this.b.size();
      i = 0;
    }
    while (i < j)
    {
      fh localfh = (fh)this.b.get(i);
      if (localfh != null)
      {
        localfh.b(6);
        localfh.a(null);
      }
      i += 1;
      continue;
      c();
    }
  }
  
  void i()
  {
    int j = 0;
    int k = this.b.size();
    int i = 0;
    while (i < k)
    {
      ((fh)this.b.get(i)).a();
      i += 1;
    }
    k = this.a.size();
    i = 0;
    while (i < k)
    {
      ((fh)this.a.get(i)).a();
      i += 1;
    }
    if (this.d != null)
    {
      k = this.d.size();
      i = j;
      while (i < k)
      {
        ((fh)this.d.get(i)).a();
        i += 1;
      }
    }
  }
  
  void j()
  {
    int j = this.b.size();
    int i = 0;
    while (i < j)
    {
      es locales = (es)((fh)this.b.get(i)).a.getLayoutParams();
      if (locales != null) {
        locales.c = true;
      }
      i += 1;
    }
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/ex.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */