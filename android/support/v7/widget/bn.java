package android.support.v7.widget;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;

class bn
  implements AdapterView.OnItemClickListener
{
  bn(bm parambm, bj parambj) {}
  
  public void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    this.b.a.setSelection(paramInt);
    if (this.b.a.getOnItemClickListener() != null) {
      this.b.a.performItemClick(paramView, paramInt, bm.a(this.b).getItemId(paramInt));
    }
    this.b.i();
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/bn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */