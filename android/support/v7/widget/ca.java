package android.support.v7.widget;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;
import java.util.List;

class ca
{
  final cc a;
  final cb b;
  final List c;
  
  ca(cc paramcc)
  {
    this.a = paramcc;
    this.b = new cb();
    this.c = new ArrayList();
  }
  
  private int e(int paramInt)
  {
    if (paramInt < 0)
    {
      paramInt = -1;
      return paramInt;
    }
    int j = this.a.a();
    int i = paramInt;
    for (;;)
    {
      if (i >= j) {
        break label72;
      }
      int k = paramInt - (i - this.b.e(i));
      if (k == 0) {
        for (;;)
        {
          paramInt = i;
          if (!this.b.c(i)) {
            break;
          }
          i += 1;
        }
      }
      i += k;
    }
    label72:
    return -1;
  }
  
  private void g(View paramView)
  {
    this.c.add(paramView);
    this.a.c(paramView);
  }
  
  private boolean h(View paramView)
  {
    if (this.c.remove(paramView))
    {
      this.a.d(paramView);
      return true;
    }
    return false;
  }
  
  View a(int paramInt1, int paramInt2)
  {
    int j = this.c.size();
    int i = 0;
    while (i < j)
    {
      View localView = (View)this.c.get(i);
      fh localfh = this.a.b(localView);
      if ((localfh.d() == paramInt1) && (!localfh.n()) && (!localfh.q()) && ((paramInt2 == -1) || (localfh.h() == paramInt2))) {
        return localView;
      }
      i += 1;
    }
    return null;
  }
  
  void a()
  {
    this.b.a();
    int i = this.c.size() - 1;
    while (i >= 0)
    {
      this.a.d((View)this.c.get(i));
      this.c.remove(i);
      i -= 1;
    }
    this.a.b();
  }
  
  void a(int paramInt)
  {
    paramInt = e(paramInt);
    View localView = this.a.b(paramInt);
    if (localView == null) {
      return;
    }
    if (this.b.d(paramInt)) {
      h(localView);
    }
    this.a.a(paramInt);
  }
  
  void a(View paramView)
  {
    int i = this.a.a(paramView);
    if (i < 0) {
      return;
    }
    if (this.b.d(i)) {
      h(paramView);
    }
    this.a.a(i);
  }
  
  void a(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams, boolean paramBoolean)
  {
    if (paramInt < 0) {}
    for (paramInt = this.a.a();; paramInt = e(paramInt))
    {
      this.b.a(paramInt, paramBoolean);
      if (paramBoolean) {
        g(paramView);
      }
      this.a.a(paramView, paramInt, paramLayoutParams);
      return;
    }
  }
  
  void a(View paramView, int paramInt, boolean paramBoolean)
  {
    if (paramInt < 0) {}
    for (paramInt = this.a.a();; paramInt = e(paramInt))
    {
      this.b.a(paramInt, paramBoolean);
      if (paramBoolean) {
        g(paramView);
      }
      this.a.a(paramView, paramInt);
      return;
    }
  }
  
  void a(View paramView, boolean paramBoolean)
  {
    a(paramView, -1, paramBoolean);
  }
  
  int b()
  {
    return this.a.a() - this.c.size();
  }
  
  int b(View paramView)
  {
    int i = this.a.a(paramView);
    if (i == -1) {}
    while (this.b.c(i)) {
      return -1;
    }
    return i - this.b.e(i);
  }
  
  View b(int paramInt)
  {
    paramInt = e(paramInt);
    return this.a.b(paramInt);
  }
  
  int c()
  {
    return this.a.a();
  }
  
  View c(int paramInt)
  {
    return this.a.b(paramInt);
  }
  
  boolean c(View paramView)
  {
    return this.c.contains(paramView);
  }
  
  void d(int paramInt)
  {
    paramInt = e(paramInt);
    this.b.d(paramInt);
    this.a.c(paramInt);
  }
  
  void d(View paramView)
  {
    int i = this.a.a(paramView);
    if (i < 0) {
      throw new IllegalArgumentException("view is not a child, cannot hide " + paramView);
    }
    this.b.a(i);
    g(paramView);
  }
  
  void e(View paramView)
  {
    int i = this.a.a(paramView);
    if (i < 0) {
      throw new IllegalArgumentException("view is not a child, cannot hide " + paramView);
    }
    if (!this.b.c(i)) {
      throw new RuntimeException("trying to unhide a view that was not hidden" + paramView);
    }
    this.b.b(i);
    h(paramView);
  }
  
  boolean f(View paramView)
  {
    int i = this.a.a(paramView);
    if (i == -1)
    {
      if (h(paramView)) {}
      return true;
    }
    if (this.b.c(i))
    {
      this.b.d(i);
      if (!h(paramView)) {}
      this.a.a(i);
      return true;
    }
    return false;
  }
  
  public String toString()
  {
    return this.b.toString() + ", hidden list:" + this.c.size();
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/ca.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */