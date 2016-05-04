package android.support.v7.widget;

import android.view.View;
import android.view.ViewGroup.LayoutParams;

class ee
  implements cc
{
  ee(RecyclerView paramRecyclerView) {}
  
  public int a()
  {
    return this.a.getChildCount();
  }
  
  public int a(View paramView)
  {
    return this.a.indexOfChild(paramView);
  }
  
  public void a(int paramInt)
  {
    View localView = this.a.getChildAt(paramInt);
    if (localView != null) {
      RecyclerView.b(this.a, localView);
    }
    this.a.removeViewAt(paramInt);
  }
  
  public void a(View paramView, int paramInt)
  {
    this.a.addView(paramView, paramInt);
    RecyclerView.a(this.a, paramView);
  }
  
  public void a(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    fh localfh = RecyclerView.c(paramView);
    if (localfh != null)
    {
      if ((!localfh.r()) && (!localfh.c())) {
        throw new IllegalArgumentException("Called attach on a child which is not detached: " + localfh);
      }
      localfh.m();
    }
    RecyclerView.a(this.a, paramView, paramInt, paramLayoutParams);
  }
  
  public fh b(View paramView)
  {
    return RecyclerView.c(paramView);
  }
  
  public View b(int paramInt)
  {
    return this.a.getChildAt(paramInt);
  }
  
  public void b()
  {
    int j = a();
    int i = 0;
    while (i < j)
    {
      RecyclerView.b(this.a, b(i));
      i += 1;
    }
    this.a.removeAllViews();
  }
  
  public void c(int paramInt)
  {
    Object localObject = b(paramInt);
    if (localObject != null)
    {
      localObject = RecyclerView.c((View)localObject);
      if (localObject != null)
      {
        if ((((fh)localObject).r()) && (!((fh)localObject).c())) {
          throw new IllegalArgumentException("called detach on an already detached child " + localObject);
        }
        ((fh)localObject).b(256);
      }
    }
    RecyclerView.a(this.a, paramInt);
  }
  
  public void c(View paramView)
  {
    paramView = RecyclerView.c(paramView);
    if (paramView != null) {
      fh.a(paramView);
    }
  }
  
  public void d(View paramView)
  {
    paramView = RecyclerView.c(paramView);
    if (paramView != null) {
      fh.b(paramView);
    }
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/ee.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */