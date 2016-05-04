package android.support.v7.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

class w
  extends BaseAdapter
{
  private i b;
  private int c = -1;
  
  public w(v paramv, i parami)
  {
    this.b = parami;
    a();
  }
  
  public m a(int paramInt)
  {
    if (v.a(this.a)) {}
    for (ArrayList localArrayList = this.b.l();; localArrayList = this.b.i())
    {
      int i = paramInt;
      if (this.c >= 0)
      {
        i = paramInt;
        if (paramInt >= this.c) {
          i = paramInt + 1;
        }
      }
      return (m)localArrayList.get(i);
    }
  }
  
  void a()
  {
    m localm = v.c(this.a).r();
    if (localm != null)
    {
      ArrayList localArrayList = v.c(this.a).l();
      int j = localArrayList.size();
      int i = 0;
      while (i < j)
      {
        if ((m)localArrayList.get(i) == localm)
        {
          this.c = i;
          return;
        }
        i += 1;
      }
    }
    this.c = -1;
  }
  
  public int getCount()
  {
    if (v.a(this.a)) {}
    for (ArrayList localArrayList = this.b.l(); this.c < 0; localArrayList = this.b.i()) {
      return localArrayList.size();
    }
    return localArrayList.size() - 1;
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null) {
      paramView = v.b(this.a).inflate(v.a, paramViewGroup, false);
    }
    for (;;)
    {
      paramViewGroup = (aa)paramView;
      if (this.a.b) {
        ((ListMenuItemView)paramView).setForceShowIcon(true);
      }
      paramViewGroup.a(a(paramInt), 0);
      return paramView;
    }
  }
  
  public void notifyDataSetChanged()
  {
    a();
    super.notifyDataSetChanged();
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/view/menu/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */