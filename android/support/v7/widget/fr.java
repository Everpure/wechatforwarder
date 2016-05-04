package android.support.v7.widget;

import android.support.v7.a.d;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

class fr
  extends BaseAdapter
{
  private fr(fp paramfp) {}
  
  public int getCount()
  {
    return fp.a(this.a).getChildCount();
  }
  
  public Object getItem(int paramInt)
  {
    return ((ft)fp.a(this.a).getChildAt(paramInt)).b();
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null) {
      return fp.a(this.a, (d)getItem(paramInt), true);
    }
    ((ft)paramView).a((d)getItem(paramInt));
    return paramView;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/fr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */