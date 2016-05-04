package android.support.v7.widget;

import android.support.v4.f.h;
import android.view.ViewGroup;
import java.util.List;

public abstract class eg
{
  private final eh a = new eh();
  private boolean b = false;
  
  public abstract int a();
  
  public int a(int paramInt)
  {
    return 0;
  }
  
  public abstract fh a(ViewGroup paramViewGroup, int paramInt);
  
  public void a(RecyclerView paramRecyclerView) {}
  
  public void a(ei paramei)
  {
    this.a.registerObserver(paramei);
  }
  
  public void a(fh paramfh) {}
  
  public abstract void a(fh paramfh, int paramInt);
  
  public void a(fh paramfh, int paramInt, List paramList)
  {
    a(paramfh, paramInt);
  }
  
  public long b(int paramInt)
  {
    return -1L;
  }
  
  public final fh b(ViewGroup paramViewGroup, int paramInt)
  {
    h.a("RV CreateView");
    paramViewGroup = a(paramViewGroup, paramInt);
    paramViewGroup.e = paramInt;
    h.a();
    return paramViewGroup;
  }
  
  public void b(RecyclerView paramRecyclerView) {}
  
  public void b(ei paramei)
  {
    this.a.unregisterObserver(paramei);
  }
  
  public final void b(fh paramfh, int paramInt)
  {
    paramfh.b = paramInt;
    if (b()) {
      paramfh.d = b(paramInt);
    }
    paramfh.a(1, 519);
    h.a("RV OnBindView");
    a(paramfh, paramInt, paramfh.u());
    paramfh.t();
    h.a();
  }
  
  public final boolean b()
  {
    return this.b;
  }
  
  public boolean b(fh paramfh)
  {
    return false;
  }
  
  public final void c()
  {
    this.a.a();
  }
  
  public void c(fh paramfh) {}
  
  public void d(fh paramfh) {}
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/eg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */