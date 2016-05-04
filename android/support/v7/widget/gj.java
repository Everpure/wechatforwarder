package android.support.v7.widget;

import android.view.View;
import java.util.ArrayList;

class gj
{
  int a = Integer.MIN_VALUE;
  int b = Integer.MIN_VALUE;
  int c = 0;
  final int d;
  private ArrayList f = new ArrayList();
  
  private gj(StaggeredGridLayoutManager paramStaggeredGridLayoutManager, int paramInt)
  {
    this.d = paramInt;
  }
  
  int a(int paramInt)
  {
    if (this.a != Integer.MIN_VALUE) {
      paramInt = this.a;
    }
    while (this.f.size() == 0) {
      return paramInt;
    }
    a();
    return this.a;
  }
  
  public View a(int paramInt1, int paramInt2)
  {
    View localView2 = null;
    View localView1 = null;
    int i;
    if (paramInt2 == -1)
    {
      i = this.f.size();
      paramInt2 = 0;
      if (paramInt2 < i)
      {
        localView2 = (View)this.f.get(paramInt2);
        if (localView2.isFocusable())
        {
          if (this.e.d(localView2) > paramInt1) {}
          for (int k = 1;; k = 0)
          {
            if (k != StaggeredGridLayoutManager.b(this.e)) {
              break label92;
            }
            paramInt2 += 1;
            localView1 = localView2;
            break;
          }
        }
      }
      label92:
      return localView1;
    }
    paramInt2 = this.f.size() - 1;
    localView1 = localView2;
    if (paramInt2 >= 0)
    {
      localView2 = (View)this.f.get(paramInt2);
      if (localView2.isFocusable())
      {
        if (this.e.d(localView2) > paramInt1)
        {
          i = 1;
          label149:
          if (StaggeredGridLayoutManager.b(this.e)) {
            break label184;
          }
        }
        label184:
        for (int j = 1;; j = 0)
        {
          if (i != j) {
            break label190;
          }
          paramInt2 -= 1;
          localView1 = localView2;
          break;
          i = 0;
          break label149;
        }
      }
    }
    label190:
    return localView1;
  }
  
  void a()
  {
    Object localObject = (View)this.f.get(0);
    gd localgd = c((View)localObject);
    this.a = this.e.a.a((View)localObject);
    if (localgd.f)
    {
      localObject = this.e.f.f(localgd.e());
      if ((localObject != null) && (((gf)localObject).b == -1)) {
        this.a -= ((gf)localObject).a(this.d);
      }
    }
  }
  
  void a(View paramView)
  {
    gd localgd = c(paramView);
    localgd.e = this;
    this.f.add(0, paramView);
    this.a = Integer.MIN_VALUE;
    if (this.f.size() == 1) {
      this.b = Integer.MIN_VALUE;
    }
    if ((localgd.c()) || (localgd.d())) {
      this.c += this.e.a.c(paramView);
    }
  }
  
  void a(boolean paramBoolean, int paramInt)
  {
    int i;
    if (paramBoolean)
    {
      i = b(Integer.MIN_VALUE);
      e();
      if (i != Integer.MIN_VALUE) {
        break label32;
      }
    }
    label32:
    while (((paramBoolean) && (i < this.e.a.d())) || ((!paramBoolean) && (i > this.e.a.c())))
    {
      return;
      i = a(Integer.MIN_VALUE);
      break;
    }
    int j = i;
    if (paramInt != Integer.MIN_VALUE) {
      j = i + paramInt;
    }
    this.b = j;
    this.a = j;
  }
  
  int b()
  {
    if (this.a != Integer.MIN_VALUE) {
      return this.a;
    }
    a();
    return this.a;
  }
  
  int b(int paramInt)
  {
    if (this.b != Integer.MIN_VALUE) {
      paramInt = this.b;
    }
    while (this.f.size() == 0) {
      return paramInt;
    }
    c();
    return this.b;
  }
  
  void b(View paramView)
  {
    gd localgd = c(paramView);
    localgd.e = this;
    this.f.add(paramView);
    this.b = Integer.MIN_VALUE;
    if (this.f.size() == 1) {
      this.a = Integer.MIN_VALUE;
    }
    if ((localgd.c()) || (localgd.d())) {
      this.c += this.e.a.c(paramView);
    }
  }
  
  gd c(View paramView)
  {
    return (gd)paramView.getLayoutParams();
  }
  
  void c()
  {
    Object localObject = (View)this.f.get(this.f.size() - 1);
    gd localgd = c((View)localObject);
    this.b = this.e.a.b((View)localObject);
    if (localgd.f)
    {
      localObject = this.e.f.f(localgd.e());
      if ((localObject != null) && (((gf)localObject).b == 1))
      {
        int i = this.b;
        this.b = (((gf)localObject).a(this.d) + i);
      }
    }
  }
  
  void c(int paramInt)
  {
    this.a = paramInt;
    this.b = paramInt;
  }
  
  int d()
  {
    if (this.b != Integer.MIN_VALUE) {
      return this.b;
    }
    c();
    return this.b;
  }
  
  void d(int paramInt)
  {
    if (this.a != Integer.MIN_VALUE) {
      this.a += paramInt;
    }
    if (this.b != Integer.MIN_VALUE) {
      this.b += paramInt;
    }
  }
  
  void e()
  {
    this.f.clear();
    f();
    this.c = 0;
  }
  
  void f()
  {
    this.a = Integer.MIN_VALUE;
    this.b = Integer.MIN_VALUE;
  }
  
  void g()
  {
    int i = this.f.size();
    View localView = (View)this.f.remove(i - 1);
    gd localgd = c(localView);
    localgd.e = null;
    if ((localgd.c()) || (localgd.d())) {
      this.c -= this.e.a.c(localView);
    }
    if (i == 1) {
      this.a = Integer.MIN_VALUE;
    }
    this.b = Integer.MIN_VALUE;
  }
  
  void h()
  {
    View localView = (View)this.f.remove(0);
    gd localgd = c(localView);
    localgd.e = null;
    if (this.f.size() == 0) {
      this.b = Integer.MIN_VALUE;
    }
    if ((localgd.c()) || (localgd.d())) {
      this.c -= this.e.a.c(localView);
    }
    this.a = Integer.MIN_VALUE;
  }
  
  public int i()
  {
    return this.c;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/gj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */