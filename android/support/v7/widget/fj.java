package android.support.v7.widget;

import android.os.Bundle;
import android.support.v4.i.a;
import android.support.v4.i.a.g;
import android.view.View;

class fj
  extends a
{
  fj(fi paramfi) {}
  
  public void a(View paramView, g paramg)
  {
    super.a(paramView, paramg);
    if ((!fi.a(this.b)) && (this.b.b.getLayoutManager() != null)) {
      this.b.b.getLayoutManager().a(paramView, paramg);
    }
  }
  
  public boolean a(View paramView, int paramInt, Bundle paramBundle)
  {
    if (super.a(paramView, paramInt, paramBundle)) {
      return true;
    }
    if ((!fi.a(this.b)) && (this.b.b.getLayoutManager() != null)) {
      return this.b.b.getLayoutManager().a(paramView, paramInt, paramBundle);
    }
    return false;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/fj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */