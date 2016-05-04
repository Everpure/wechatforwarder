package android.support.v7.widget;

import android.support.v4.i.ea;
import android.view.View;

class hc
  extends ea
{
  private boolean c = false;
  
  hc(ha paramha, int paramInt) {}
  
  public void a(View paramView)
  {
    ha.a(this.b).setVisibility(0);
  }
  
  public void b(View paramView)
  {
    if (!this.c) {
      ha.a(this.b).setVisibility(this.a);
    }
  }
  
  public void c(View paramView)
  {
    this.c = true;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/hc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */