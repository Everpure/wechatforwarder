package android.support.v7.view.menu;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;

public class g
  implements x, AdapterView.OnItemClickListener
{
  Context a;
  LayoutInflater b;
  i c;
  ExpandedMenuView d;
  int e;
  int f;
  h g;
  private int h;
  private y i;
  
  public g(int paramInt1, int paramInt2)
  {
    this.f = paramInt1;
    this.e = paramInt2;
  }
  
  public g(Context paramContext, int paramInt)
  {
    this(paramInt, 0);
    this.a = paramContext;
    this.b = LayoutInflater.from(this.a);
  }
  
  public z a(ViewGroup paramViewGroup)
  {
    if (this.d == null)
    {
      this.d = ((ExpandedMenuView)this.b.inflate(android.support.v7.b.i.abc_expanded_menu_layout, paramViewGroup, false));
      if (this.g == null) {
        this.g = new h(this);
      }
      this.d.setAdapter(this.g);
      this.d.setOnItemClickListener(this);
    }
    return this.d;
  }
  
  public ListAdapter a()
  {
    if (this.g == null) {
      this.g = new h(this);
    }
    return this.g;
  }
  
  public void a(Context paramContext, i parami)
  {
    if (this.e != 0)
    {
      this.a = new ContextThemeWrapper(paramContext, this.e);
      this.b = LayoutInflater.from(this.a);
    }
    for (;;)
    {
      this.c = parami;
      if (this.g != null) {
        this.g.notifyDataSetChanged();
      }
      return;
      if (this.a != null)
      {
        this.a = paramContext;
        if (this.b == null) {
          this.b = LayoutInflater.from(this.a);
        }
      }
    }
  }
  
  public void a(i parami, boolean paramBoolean)
  {
    if (this.i != null) {
      this.i.a(parami, paramBoolean);
    }
  }
  
  public void a(y paramy)
  {
    this.i = paramy;
  }
  
  public boolean a(ad paramad)
  {
    if (!paramad.hasVisibleItems()) {
      return false;
    }
    new l(paramad).a(null);
    if (this.i != null) {
      this.i.a(paramad);
    }
    return true;
  }
  
  public boolean a(i parami, m paramm)
  {
    return false;
  }
  
  public void b(boolean paramBoolean)
  {
    if (this.g != null) {
      this.g.notifyDataSetChanged();
    }
  }
  
  public boolean b()
  {
    return false;
  }
  
  public boolean b(i parami, m paramm)
  {
    return false;
  }
  
  public void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    this.c.a(this.g.a(paramInt), this, 0);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/view/menu/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */