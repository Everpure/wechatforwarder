package android.support.v7.widget;

class eo
  implements em
{
  private eo(RecyclerView paramRecyclerView) {}
  
  public void a(fh paramfh)
  {
    paramfh.a(true);
    if ((paramfh.g != null) && (paramfh.h == null)) {
      paramfh.g = null;
    }
    paramfh.h = null;
    if ((!fh.e(paramfh)) && (!RecyclerView.c(this.a, paramfh.a)) && (paramfh.r())) {
      this.a.removeDetachedView(paramfh.a, false);
    }
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/eo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */