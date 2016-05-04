package android.support.v7.widget;

import android.support.v4.a.a;
import android.support.v4.i.bu;
import android.support.v4.i.di;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class cg
  extends ga
{
  private ArrayList b = new ArrayList();
  private ArrayList c = new ArrayList();
  private ArrayList d = new ArrayList();
  private ArrayList e = new ArrayList();
  private ArrayList f = new ArrayList();
  private ArrayList g = new ArrayList();
  private ArrayList h = new ArrayList();
  private ArrayList i = new ArrayList();
  private ArrayList j = new ArrayList();
  private ArrayList k = new ArrayList();
  private ArrayList l = new ArrayList();
  
  private void a(cp paramcp)
  {
    View localView = null;
    Object localObject = paramcp.a;
    if (localObject == null) {}
    for (localObject = null;; localObject = ((fh)localObject).a)
    {
      fh localfh = paramcp.b;
      if (localfh != null) {
        localView = localfh.a;
      }
      if (localObject != null)
      {
        localObject = bu.q((View)localObject).a(g());
        this.l.add(paramcp.a);
        ((di)localObject).b(paramcp.e - paramcp.c);
        ((di)localObject).c(paramcp.f - paramcp.d);
        ((di)localObject).a(0.0F).a(new cn(this, paramcp, (di)localObject)).c();
      }
      if (localView != null)
      {
        localObject = bu.q(localView);
        this.l.add(paramcp.b);
        ((di)localObject).b(0.0F).c(0.0F).a(g()).a(1.0F).a(new co(this, paramcp, (di)localObject, localView)).c();
      }
      return;
    }
  }
  
  private void a(List paramList, fh paramfh)
  {
    int m = paramList.size() - 1;
    while (m >= 0)
    {
      cp localcp = (cp)paramList.get(m);
      if ((a(localcp, paramfh)) && (localcp.a == null) && (localcp.b == null)) {
        paramList.remove(localcp);
      }
      m -= 1;
    }
  }
  
  private boolean a(cp paramcp, fh paramfh)
  {
    boolean bool2 = false;
    boolean bool1 = false;
    if (paramcp.b == paramfh) {
      paramcp.b = null;
    }
    for (;;)
    {
      bu.c(paramfh.a, 1.0F);
      bu.a(paramfh.a, 0.0F);
      bu.b(paramfh.a, 0.0F);
      a(paramfh, bool1);
      bool1 = true;
      do
      {
        return bool1;
        bool1 = bool2;
      } while (paramcp.a != paramfh);
      paramcp.a = null;
      bool1 = true;
    }
  }
  
  private void b(cp paramcp)
  {
    if (paramcp.a != null) {
      a(paramcp, paramcp.a);
    }
    if (paramcp.b != null) {
      a(paramcp, paramcp.b);
    }
  }
  
  private void b(fh paramfh, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Object localObject = paramfh.a;
    paramInt1 = paramInt3 - paramInt1;
    paramInt2 = paramInt4 - paramInt2;
    if (paramInt1 != 0) {
      bu.q((View)localObject).b(0.0F);
    }
    if (paramInt2 != 0) {
      bu.q((View)localObject).c(0.0F);
    }
    localObject = bu.q((View)localObject);
    this.j.add(paramfh);
    ((di)localObject).a(d()).a(new cm(this, paramfh, paramInt1, paramInt2, (di)localObject)).c();
  }
  
  private void j()
  {
    if (!b()) {
      h();
    }
  }
  
  private void t(fh paramfh)
  {
    di localdi = bu.q(paramfh.a);
    this.k.add(paramfh);
    localdi.a(f()).a(0.0F).a(new ck(this, paramfh, localdi)).c();
  }
  
  private void u(fh paramfh)
  {
    di localdi = bu.q(paramfh.a);
    this.i.add(paramfh);
    localdi.a(1.0F).a(e()).a(new cl(this, paramfh, localdi)).c();
  }
  
  private void v(fh paramfh)
  {
    a.a(paramfh.a);
    c(paramfh);
  }
  
  public void a()
  {
    int m;
    int n;
    label24:
    int i1;
    if (!this.b.isEmpty())
    {
      m = 1;
      if (this.d.isEmpty()) {
        break label72;
      }
      n = 1;
      if (this.e.isEmpty()) {
        break label77;
      }
      i1 = 1;
      label36:
      if (this.c.isEmpty()) {
        break label82;
      }
    }
    label72:
    label77:
    label82:
    for (int i2 = 1;; i2 = 0)
    {
      if ((m != 0) || (n != 0) || (i2 != 0) || (i1 != 0)) {
        break label88;
      }
      return;
      m = 0;
      break;
      n = 0;
      break label24;
      i1 = 0;
      break label36;
    }
    label88:
    Object localObject1 = this.b.iterator();
    while (((Iterator)localObject1).hasNext()) {
      t((fh)((Iterator)localObject1).next());
    }
    this.b.clear();
    Object localObject2;
    label211:
    label291:
    long l1;
    label366:
    long l2;
    if (n != 0)
    {
      localObject1 = new ArrayList();
      ((ArrayList)localObject1).addAll(this.d);
      this.g.add(localObject1);
      this.d.clear();
      localObject2 = new ch(this, (ArrayList)localObject1);
      if (m != 0) {
        bu.a(((cq)((ArrayList)localObject1).get(0)).a.a, (Runnable)localObject2, f());
      }
    }
    else
    {
      if (i1 != 0)
      {
        localObject1 = new ArrayList();
        ((ArrayList)localObject1).addAll(this.e);
        this.h.add(localObject1);
        this.e.clear();
        localObject2 = new ci(this, (ArrayList)localObject1);
        if (m == 0) {
          break label428;
        }
        bu.a(((cp)((ArrayList)localObject1).get(0)).a.a, (Runnable)localObject2, f());
      }
      if (i2 == 0) {
        break label436;
      }
      localObject1 = new ArrayList();
      ((ArrayList)localObject1).addAll(this.c);
      this.f.add(localObject1);
      this.c.clear();
      localObject2 = new cj(this, (ArrayList)localObject1);
      if ((m == 0) && (n == 0) && (i1 == 0)) {
        break label456;
      }
      if (m == 0) {
        break label438;
      }
      l1 = f();
      if (n == 0) {
        break label444;
      }
      l2 = d();
      label376:
      if (i1 == 0) {
        break label450;
      }
    }
    label428:
    label436:
    label438:
    label444:
    label450:
    for (long l3 = g();; l3 = 0L)
    {
      l2 = Math.max(l2, l3);
      bu.a(((fh)((ArrayList)localObject1).get(0)).a, (Runnable)localObject2, l1 + l2);
      return;
      ((Runnable)localObject2).run();
      break label211;
      ((Runnable)localObject2).run();
      break label291;
      break;
      l1 = 0L;
      break label366;
      l2 = 0L;
      break label376;
    }
    label456:
    ((Runnable)localObject2).run();
  }
  
  void a(List paramList)
  {
    int m = paramList.size() - 1;
    while (m >= 0)
    {
      bu.q(((fh)paramList.get(m)).a).b();
      m -= 1;
    }
  }
  
  public boolean a(fh paramfh)
  {
    v(paramfh);
    this.b.add(paramfh);
    return true;
  }
  
  public boolean a(fh paramfh, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    View localView = paramfh.a;
    paramInt1 = (int)(paramInt1 + bu.m(paramfh.a));
    paramInt2 = (int)(paramInt2 + bu.n(paramfh.a));
    v(paramfh);
    int m = paramInt3 - paramInt1;
    int n = paramInt4 - paramInt2;
    if ((m == 0) && (n == 0))
    {
      i(paramfh);
      return false;
    }
    if (m != 0) {
      bu.a(localView, -m);
    }
    if (n != 0) {
      bu.b(localView, -n);
    }
    this.d.add(new cq(paramfh, paramInt1, paramInt2, paramInt3, paramInt4, null));
    return true;
  }
  
  public boolean a(fh paramfh1, fh paramfh2, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (paramfh1 == paramfh2) {
      return a(paramfh1, paramInt1, paramInt2, paramInt3, paramInt4);
    }
    float f1 = bu.m(paramfh1.a);
    float f2 = bu.n(paramfh1.a);
    float f3 = bu.f(paramfh1.a);
    v(paramfh1);
    int m = (int)(paramInt3 - paramInt1 - f1);
    int n = (int)(paramInt4 - paramInt2 - f2);
    bu.a(paramfh1.a, f1);
    bu.b(paramfh1.a, f2);
    bu.c(paramfh1.a, f3);
    if (paramfh2 != null)
    {
      v(paramfh2);
      bu.a(paramfh2.a, -m);
      bu.b(paramfh2.a, -n);
      bu.c(paramfh2.a, 0.0F);
    }
    this.e.add(new cp(paramfh1, paramfh2, paramInt1, paramInt2, paramInt3, paramInt4, null));
    return true;
  }
  
  public boolean a(fh paramfh, List paramList)
  {
    return (!paramList.isEmpty()) || (super.a(paramfh, paramList));
  }
  
  public boolean b()
  {
    return (!this.c.isEmpty()) || (!this.e.isEmpty()) || (!this.d.isEmpty()) || (!this.b.isEmpty()) || (!this.j.isEmpty()) || (!this.k.isEmpty()) || (!this.i.isEmpty()) || (!this.l.isEmpty()) || (!this.g.isEmpty()) || (!this.f.isEmpty()) || (!this.h.isEmpty());
  }
  
  public boolean b(fh paramfh)
  {
    v(paramfh);
    bu.c(paramfh.a, 0.0F);
    this.c.add(paramfh);
    return true;
  }
  
  public void c()
  {
    int m = this.d.size() - 1;
    Object localObject1;
    Object localObject2;
    while (m >= 0)
    {
      localObject1 = (cq)this.d.get(m);
      localObject2 = ((cq)localObject1).a.a;
      bu.b((View)localObject2, 0.0F);
      bu.a((View)localObject2, 0.0F);
      i(((cq)localObject1).a);
      this.d.remove(m);
      m -= 1;
    }
    m = this.b.size() - 1;
    while (m >= 0)
    {
      h((fh)this.b.get(m));
      this.b.remove(m);
      m -= 1;
    }
    m = this.c.size() - 1;
    while (m >= 0)
    {
      localObject1 = (fh)this.c.get(m);
      bu.c(((fh)localObject1).a, 1.0F);
      j((fh)localObject1);
      this.c.remove(m);
      m -= 1;
    }
    m = this.e.size() - 1;
    while (m >= 0)
    {
      b((cp)this.e.get(m));
      m -= 1;
    }
    this.e.clear();
    if (!b()) {
      return;
    }
    m = this.g.size() - 1;
    int n;
    while (m >= 0)
    {
      localObject1 = (ArrayList)this.g.get(m);
      n = ((ArrayList)localObject1).size() - 1;
      while (n >= 0)
      {
        localObject2 = (cq)((ArrayList)localObject1).get(n);
        View localView = ((cq)localObject2).a.a;
        bu.b(localView, 0.0F);
        bu.a(localView, 0.0F);
        i(((cq)localObject2).a);
        ((ArrayList)localObject1).remove(n);
        if (((ArrayList)localObject1).isEmpty()) {
          this.g.remove(localObject1);
        }
        n -= 1;
      }
      m -= 1;
    }
    m = this.f.size() - 1;
    while (m >= 0)
    {
      localObject1 = (ArrayList)this.f.get(m);
      n = ((ArrayList)localObject1).size() - 1;
      while (n >= 0)
      {
        localObject2 = (fh)((ArrayList)localObject1).get(n);
        bu.c(((fh)localObject2).a, 1.0F);
        j((fh)localObject2);
        ((ArrayList)localObject1).remove(n);
        if (((ArrayList)localObject1).isEmpty()) {
          this.f.remove(localObject1);
        }
        n -= 1;
      }
      m -= 1;
    }
    m = this.h.size() - 1;
    while (m >= 0)
    {
      localObject1 = (ArrayList)this.h.get(m);
      n = ((ArrayList)localObject1).size() - 1;
      while (n >= 0)
      {
        b((cp)((ArrayList)localObject1).get(n));
        if (((ArrayList)localObject1).isEmpty()) {
          this.h.remove(localObject1);
        }
        n -= 1;
      }
      m -= 1;
    }
    a(this.k);
    a(this.j);
    a(this.i);
    a(this.l);
    h();
  }
  
  public void c(fh paramfh)
  {
    View localView = paramfh.a;
    bu.q(localView).b();
    int m = this.d.size() - 1;
    while (m >= 0)
    {
      if (((cq)this.d.get(m)).a == paramfh)
      {
        bu.b(localView, 0.0F);
        bu.a(localView, 0.0F);
        i(paramfh);
        this.d.remove(m);
      }
      m -= 1;
    }
    a(this.e, paramfh);
    if (this.b.remove(paramfh))
    {
      bu.c(localView, 1.0F);
      h(paramfh);
    }
    if (this.c.remove(paramfh))
    {
      bu.c(localView, 1.0F);
      j(paramfh);
    }
    m = this.h.size() - 1;
    ArrayList localArrayList;
    while (m >= 0)
    {
      localArrayList = (ArrayList)this.h.get(m);
      a(localArrayList, paramfh);
      if (localArrayList.isEmpty()) {
        this.h.remove(m);
      }
      m -= 1;
    }
    m = this.g.size() - 1;
    if (m >= 0)
    {
      localArrayList = (ArrayList)this.g.get(m);
      int n = localArrayList.size() - 1;
      for (;;)
      {
        if (n >= 0)
        {
          if (((cq)localArrayList.get(n)).a != paramfh) {
            break label293;
          }
          bu.b(localView, 0.0F);
          bu.a(localView, 0.0F);
          i(paramfh);
          localArrayList.remove(n);
          if (localArrayList.isEmpty()) {
            this.g.remove(m);
          }
        }
        m -= 1;
        break;
        label293:
        n -= 1;
      }
    }
    m = this.f.size() - 1;
    while (m >= 0)
    {
      localArrayList = (ArrayList)this.f.get(m);
      if (localArrayList.remove(paramfh))
      {
        bu.c(localView, 1.0F);
        j(paramfh);
        if (localArrayList.isEmpty()) {
          this.f.remove(m);
        }
      }
      m -= 1;
    }
    if ((!this.k.remove(paramfh)) || ((!this.i.remove(paramfh)) || ((!this.l.remove(paramfh)) || (this.j.remove(paramfh))))) {}
    j();
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/cg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */