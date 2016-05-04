package android.support.v7.widget;

import android.support.v7.a.d;
import android.view.View;
import android.view.View.OnClickListener;

class fs
  implements View.OnClickListener
{
  private fs(fp paramfp) {}
  
  public void onClick(View paramView)
  {
    ((ft)paramView).b().d();
    int j = fp.a(this.a).getChildCount();
    int i = 0;
    if (i < j)
    {
      View localView = fp.a(this.a).getChildAt(i);
      if (localView == paramView) {}
      for (boolean bool = true;; bool = false)
      {
        localView.setSelected(bool);
        i += 1;
        break;
      }
    }
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/fs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */