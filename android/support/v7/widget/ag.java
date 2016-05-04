package android.support.v7.widget;

import android.content.Context;
import android.content.pm.ResolveInfo;
import android.support.v4.i.bu;
import android.support.v7.b.g;
import android.support.v7.b.i;
import android.support.v7.b.j;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

class ag
  extends BaseAdapter
{
  private z b;
  private int c;
  private boolean d;
  private boolean e;
  private boolean f;
  
  public int a()
  {
    int i = 0;
    int k = this.c;
    this.c = Integer.MAX_VALUE;
    int m = View.MeasureSpec.makeMeasureSpec(0, 0);
    int n = View.MeasureSpec.makeMeasureSpec(0, 0);
    int i1 = getCount();
    View localView = null;
    int j = 0;
    while (i < i1)
    {
      localView = getView(i, localView, null);
      localView.measure(m, n);
      j = Math.max(j, localView.getMeasuredWidth());
      i += 1;
    }
    this.c = k;
    return j;
  }
  
  public void a(int paramInt)
  {
    if (this.c != paramInt)
    {
      this.c = paramInt;
      notifyDataSetChanged();
    }
  }
  
  public void a(z paramz)
  {
    z localz = ActivityChooserView.a(this.a).d();
    if ((localz != null) && (this.a.isShown())) {
      localz.unregisterObserver(ActivityChooserView.g(this.a));
    }
    this.b = paramz;
    if ((paramz != null) && (this.a.isShown())) {
      paramz.registerObserver(ActivityChooserView.g(this.a));
    }
    notifyDataSetChanged();
  }
  
  public void a(boolean paramBoolean)
  {
    if (this.f != paramBoolean)
    {
      this.f = paramBoolean;
      notifyDataSetChanged();
    }
  }
  
  public void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((this.d != paramBoolean1) || (this.e != paramBoolean2))
    {
      this.d = paramBoolean1;
      this.e = paramBoolean2;
      notifyDataSetChanged();
    }
  }
  
  public ResolveInfo b()
  {
    return this.b.b();
  }
  
  public int c()
  {
    return this.b.a();
  }
  
  public z d()
  {
    return this.b;
  }
  
  public boolean e()
  {
    return this.d;
  }
  
  public int getCount()
  {
    int j = this.b.a();
    int i = j;
    if (!this.d)
    {
      i = j;
      if (this.b.b() != null) {
        i = j - 1;
      }
    }
    j = Math.min(i, this.c);
    i = j;
    if (this.f) {
      i = j + 1;
    }
    return i;
  }
  
  public Object getItem(int paramInt)
  {
    switch (getItemViewType(paramInt))
    {
    default: 
      throw new IllegalArgumentException();
    case 1: 
      return null;
    }
    int i = paramInt;
    if (!this.d)
    {
      i = paramInt;
      if (this.b.b() != null) {
        i = paramInt + 1;
      }
    }
    return this.b.a(i);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public int getItemViewType(int paramInt)
  {
    if ((this.f) && (paramInt == getCount() - 1)) {
      return 1;
    }
    return 0;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    View localView;
    switch (getItemViewType(paramInt))
    {
    default: 
      throw new IllegalArgumentException();
    case 1: 
      if (paramView != null)
      {
        localView = paramView;
        if (paramView.getId() == 1) {}
      }
      else
      {
        localView = LayoutInflater.from(this.a.getContext()).inflate(i.abc_activity_chooser_view_list_item, paramViewGroup, false);
        localView.setId(1);
        ((TextView)localView.findViewById(g.title)).setText(this.a.getContext().getString(j.abc_activity_chooser_view_see_all));
      }
      return localView;
    }
    if (paramView != null)
    {
      localView = paramView;
      if (paramView.getId() == g.list_item) {}
    }
    else
    {
      localView = LayoutInflater.from(this.a.getContext()).inflate(i.abc_activity_chooser_view_list_item, paramViewGroup, false);
    }
    paramView = this.a.getContext().getPackageManager();
    paramViewGroup = (ImageView)localView.findViewById(g.icon);
    ResolveInfo localResolveInfo = (ResolveInfo)getItem(paramInt);
    paramViewGroup.setImageDrawable(localResolveInfo.loadIcon(paramView));
    ((TextView)localView.findViewById(g.title)).setText(localResolveInfo.loadLabel(paramView));
    if ((this.d) && (paramInt == 0) && (this.e))
    {
      bu.c(localView, true);
      return localView;
    }
    bu.c(localView, false);
    return localView;
  }
  
  public int getViewTypeCount()
  {
    return 3;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */