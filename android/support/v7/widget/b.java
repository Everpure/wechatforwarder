package android.support.v7.widget;

import android.support.v4.i.di;
import android.support.v4.i.dz;
import android.view.View;

public class b
  implements dz
{
  int a;
  private boolean c = false;
  
  protected b(a parama) {}
  
  public b a(di paramdi, int paramInt)
  {
    this.b.f = paramdi;
    this.a = paramInt;
    return this;
  }
  
  public void a(View paramView)
  {
    a.a(this.b, 0);
    this.c = false;
  }
  
  public void b(View paramView)
  {
    if (this.c) {
      return;
    }
    this.b.f = null;
    a.b(this.b, this.a);
  }
  
  public void c(View paramView)
  {
    this.c = true;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */