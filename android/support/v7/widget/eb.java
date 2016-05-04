package android.support.v7.widget;

class eb
  implements Runnable
{
  eb(RecyclerView paramRecyclerView) {}
  
  public void run()
  {
    if (this.a.f != null) {
      this.a.f.a();
    }
    RecyclerView.b(this.a, false);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/eb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */