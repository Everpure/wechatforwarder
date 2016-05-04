package android.support.v7.widget;

import android.util.Log;
import android.view.View;

public abstract class fc
{
  private int a;
  private RecyclerView b;
  private eq c;
  private boolean d;
  private boolean e;
  private View f;
  private final fd g;
  
  private void a(int paramInt1, int paramInt2)
  {
    RecyclerView localRecyclerView = this.b;
    if ((!this.e) || (this.a == -1) || (localRecyclerView == null)) {
      a();
    }
    this.d = false;
    if (this.f != null)
    {
      if (a(this.f) != this.a) {
        break label151;
      }
      a(this.f, localRecyclerView.g, this.g);
      fd.a(this.g, localRecyclerView);
      a();
    }
    for (;;)
    {
      if (this.e)
      {
        a(paramInt1, paramInt2, localRecyclerView.g, this.g);
        boolean bool = this.g.a();
        fd.a(this.g, localRecyclerView);
        if (bool)
        {
          if (!this.e) {
            break;
          }
          this.d = true;
          RecyclerView.q(localRecyclerView).a();
        }
      }
      return;
      label151:
      Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
      this.f = null;
    }
    a();
  }
  
  public int a(View paramView)
  {
    return this.b.d(paramView);
  }
  
  protected final void a()
  {
    if (!this.e) {
      return;
    }
    e();
    fe.e(this.b.g, -1);
    this.f = null;
    this.a = -1;
    this.d = false;
    this.e = false;
    eq.a(this.c, this);
    this.c = null;
    this.b = null;
  }
  
  public void a(int paramInt)
  {
    this.a = paramInt;
  }
  
  protected abstract void a(int paramInt1, int paramInt2, fe paramfe, fd paramfd);
  
  protected abstract void a(View paramView, fe paramfe, fd paramfd);
  
  protected void b(View paramView)
  {
    if (a(paramView) == d()) {
      this.f = paramView;
    }
  }
  
  public boolean b()
  {
    return this.d;
  }
  
  public boolean c()
  {
    return this.e;
  }
  
  public int d()
  {
    return this.a;
  }
  
  protected abstract void e();
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/fc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */