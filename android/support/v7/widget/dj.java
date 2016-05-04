package android.support.v7.widget;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

class dj
  implements AdapterView.OnItemSelectedListener
{
  dj(dg paramdg) {}
  
  public void onItemSelected(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (paramInt != -1)
    {
      paramAdapterView = dg.a(this.a);
      if (paramAdapterView != null) {
        dk.a(paramAdapterView, false);
      }
    }
  }
  
  public void onNothingSelected(AdapterView paramAdapterView) {}
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/dj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */