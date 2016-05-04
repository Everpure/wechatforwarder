package android.support.v7.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

class h
  extends BaseAdapter
{
  private int b = -1;
  
  public h(g paramg)
  {
    a();
  }
  
  public m a(int paramInt)
  {
    ArrayList localArrayList = this.a.c.l();
    int i = g.a(this.a) + paramInt;
    paramInt = i;
    if (this.b >= 0)
    {
      paramInt = i;
      if (i >= this.b) {
        paramInt = i + 1;
      }
    }
    return (m)localArrayList.get(paramInt);
  }
  
  void a()
  {
    m localm = this.a.c.r();
    if (localm != null)
    {
      ArrayList localArrayList = this.a.c.l();
      int j = localArrayList.size();
      int i = 0;
      while (i < j)
      {
        if ((m)localArrayList.get(i) == localm)
        {
          this.b = i;
          return;
        }
        i += 1;
      }
    }
    this.b = -1;
  }
  
  public int getCount()
  {
    int i = this.a.c.l().size() - g.a(this.a);
    if (this.b < 0) {
      return i;
    }
    return i - 1;
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null) {
      paramView = this.a.b.inflate(this.a.f, paramViewGroup, false);
    }
    for (;;)
    {
      ((aa)paramView).a(a(paramInt), 0);
      return paramView;
    }
  }
  
  public void notifyDataSetChanged()
  {
    a();
    super.notifyDataSetChanged();
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/view/menu/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */