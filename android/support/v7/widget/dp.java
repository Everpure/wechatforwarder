package android.support.v7.widget;

import android.database.DataSetObserver;

class dp
  extends DataSetObserver
{
  private dp(dg paramdg) {}
  
  public void onChanged()
  {
    if (this.a.k()) {
      this.a.c();
    }
  }
  
  public void onInvalidated()
  {
    this.a.i();
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/dp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */