package android.support.v7.widget;

class ed
  implements hf
{
  ed(RecyclerView paramRecyclerView) {}
  
  public void a(fh paramfh)
  {
    this.a.e.a(paramfh.a, this.a.a);
  }
  
  public void a(fh paramfh, en paramen1, en paramen2)
  {
    this.a.a.d(paramfh);
    RecyclerView.a(this.a, paramfh, paramen1, paramen2);
  }
  
  public void b(fh paramfh, en paramen1, en paramen2)
  {
    RecyclerView.b(this.a, paramfh, paramen1, paramen2);
  }
  
  public void c(fh paramfh, en paramen1, en paramen2)
  {
    paramfh.a(false);
    if (RecyclerView.d(this.a)) {
      if (this.a.f.a(paramfh, paramfh, paramen1, paramen2)) {
        RecyclerView.e(this.a);
      }
    }
    while (!this.a.f.c(paramfh, paramen1, paramen2)) {
      return;
    }
    RecyclerView.e(this.a);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/ed.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */