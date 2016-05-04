package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.c.a;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public class ad
  extends i
  implements SubMenu
{
  private i d;
  private m e;
  
  public ad(Context paramContext, i parami, m paramm)
  {
    super(paramContext);
    this.d = parami;
    this.e = paramm;
  }
  
  public String a()
  {
    if (this.e != null) {}
    for (int i = this.e.getItemId(); i == 0; i = 0) {
      return null;
    }
    return super.a() + ":" + i;
  }
  
  public void a(j paramj)
  {
    this.d.a(paramj);
  }
  
  boolean a(i parami, MenuItem paramMenuItem)
  {
    return (super.a(parami, paramMenuItem)) || (this.d.a(parami, paramMenuItem));
  }
  
  public boolean b()
  {
    return this.d.b();
  }
  
  public boolean c()
  {
    return this.d.c();
  }
  
  public boolean c(m paramm)
  {
    return this.d.c(paramm);
  }
  
  public boolean d(m paramm)
  {
    return this.d.d(paramm);
  }
  
  public MenuItem getItem()
  {
    return this.e;
  }
  
  public i p()
  {
    return this.d;
  }
  
  public Menu s()
  {
    return this.d;
  }
  
  public SubMenu setHeaderIcon(int paramInt)
  {
    super.a(a.a(e(), paramInt));
    return this;
  }
  
  public SubMenu setHeaderIcon(Drawable paramDrawable)
  {
    super.a(paramDrawable);
    return this;
  }
  
  public SubMenu setHeaderTitle(int paramInt)
  {
    super.a(e().getResources().getString(paramInt));
    return this;
  }
  
  public SubMenu setHeaderTitle(CharSequence paramCharSequence)
  {
    super.a(paramCharSequence);
    return this;
  }
  
  public SubMenu setHeaderView(View paramView)
  {
    super.a(paramView);
    return this;
  }
  
  public SubMenu setIcon(int paramInt)
  {
    this.e.setIcon(paramInt);
    return this;
  }
  
  public SubMenu setIcon(Drawable paramDrawable)
  {
    this.e.setIcon(paramDrawable);
    return this;
  }
  
  public void setQwertyMode(boolean paramBoolean)
  {
    this.d.setQwertyMode(paramBoolean);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/view/menu/ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */