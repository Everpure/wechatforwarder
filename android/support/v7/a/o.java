package android.support.v7.a;

import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

class o
  implements AdapterView.OnItemClickListener
{
  o(k paramk, ListView paramListView, e parame) {}
  
  public void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (this.c.C != null) {
      this.c.C[paramInt] = this.a.isItemChecked(paramInt);
    }
    this.c.G.onClick(e.g(this.b), paramInt, this.a.isItemChecked(paramInt));
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/a/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */