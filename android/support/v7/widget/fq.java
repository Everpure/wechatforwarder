package android.support.v7.widget;

import android.view.View;

class fq
  implements Runnable
{
  fq(fp paramfp, View paramView) {}
  
  public void run()
  {
    int i = this.a.getLeft();
    int j = (this.b.getWidth() - this.a.getWidth()) / 2;
    this.b.smoothScrollTo(i - j, 0);
    this.b.a = null;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/fq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */