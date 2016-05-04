package android.support.v7.widget;

import android.view.View;

class db
{
  int a;
  int b;
  boolean c;
  
  db(LinearLayoutManager paramLinearLayoutManager) {}
  
  private boolean a(View paramView, fe paramfe)
  {
    paramView = (es)paramView.getLayoutParams();
    return (!paramView.c()) && (paramView.e() >= 0) && (paramView.e() < paramfe.e());
  }
  
  void a()
  {
    this.a = -1;
    this.b = Integer.MIN_VALUE;
    this.c = false;
  }
  
  public void a(View paramView)
  {
    int j = this.d.j.b();
    if (j >= 0) {
      b(paramView);
    }
    int i;
    do
    {
      int k;
      do
      {
        do
        {
          do
          {
            return;
            this.a = this.d.d(paramView);
            if (!this.c) {
              break;
            }
            i = this.d.j.d() - j - this.d.j.b(paramView);
            this.b = (this.d.j.d() - i);
          } while (i <= 0);
          j = this.d.j.c(paramView);
          k = this.b;
          m = this.d.j.c();
          j = k - j - (m + Math.min(this.d.j.a(paramView) - m, 0));
        } while (j >= 0);
        k = this.b;
        this.b = (Math.min(i, -j) + k);
        return;
        k = this.d.j.a(paramView);
        i = k - this.d.j.c();
        this.b = k;
      } while (i <= 0);
      int m = this.d.j.c(paramView);
      int n = this.d.j.d();
      int i1 = this.d.j.b(paramView);
      j = this.d.j.d() - Math.min(0, n - j - i1) - (k + m);
    } while (j >= 0);
    this.b -= Math.min(i, -j);
  }
  
  void b()
  {
    if (this.c) {}
    for (int i = this.d.j.d();; i = this.d.j.c())
    {
      this.b = i;
      return;
    }
  }
  
  public void b(View paramView)
  {
    if (this.c) {}
    for (this.b = (this.d.j.b(paramView) + this.d.j.b());; this.b = this.d.j.a(paramView))
    {
      this.a = this.d.d(paramView);
      return;
    }
  }
  
  public String toString()
  {
    return "AnchorInfo{mPosition=" + this.a + ", mCoordinate=" + this.b + ", mLayoutFromEnd=" + this.c + '}';
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/db.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */