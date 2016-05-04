package android.support.v7.a;

import android.content.DialogInterface.OnClickListener;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

class n
  implements AdapterView.OnItemClickListener
{
  n(k paramk, e parame) {}
  
  public void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    this.b.u.onClick(e.g(this.a), paramInt);
    if (!this.b.E) {
      e.g(this.a).dismiss();
    }
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/a/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */