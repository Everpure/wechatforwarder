package android.support.v7.view.menu;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v4.e.a.b;
import android.support.v4.i.n;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Method;

@TargetApi(14)
public class o
  extends e
  implements MenuItem
{
  private Method c;
  
  o(Context paramContext, b paramb)
  {
    super(paramContext, paramb);
  }
  
  p a(ActionProvider paramActionProvider)
  {
    return new p(this, this.a, paramActionProvider);
  }
  
  public void a(boolean paramBoolean)
  {
    try
    {
      if (this.c == null) {
        this.c = ((b)this.b).getClass().getDeclaredMethod("setExclusiveCheckable", new Class[] { Boolean.TYPE });
      }
      this.c.invoke(this.b, new Object[] { Boolean.valueOf(paramBoolean) });
      return;
    }
    catch (Exception localException)
    {
      Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", localException);
    }
  }
  
  public boolean collapseActionView()
  {
    return ((b)this.b).collapseActionView();
  }
  
  public boolean expandActionView()
  {
    return ((b)this.b).expandActionView();
  }
  
  public ActionProvider getActionProvider()
  {
    n localn = ((b)this.b).a();
    if ((localn instanceof p)) {
      return ((p)localn).a;
    }
    return null;
  }
  
  public View getActionView()
  {
    View localView2 = ((b)this.b).getActionView();
    View localView1 = localView2;
    if ((localView2 instanceof q)) {
      localView1 = ((q)localView2).c();
    }
    return localView1;
  }
  
  public char getAlphabeticShortcut()
  {
    return ((b)this.b).getAlphabeticShortcut();
  }
  
  public int getGroupId()
  {
    return ((b)this.b).getGroupId();
  }
  
  public Drawable getIcon()
  {
    return ((b)this.b).getIcon();
  }
  
  public Intent getIntent()
  {
    return ((b)this.b).getIntent();
  }
  
  public int getItemId()
  {
    return ((b)this.b).getItemId();
  }
  
  public ContextMenu.ContextMenuInfo getMenuInfo()
  {
    return ((b)this.b).getMenuInfo();
  }
  
  public char getNumericShortcut()
  {
    return ((b)this.b).getNumericShortcut();
  }
  
  public int getOrder()
  {
    return ((b)this.b).getOrder();
  }
  
  public SubMenu getSubMenu()
  {
    return a(((b)this.b).getSubMenu());
  }
  
  public CharSequence getTitle()
  {
    return ((b)this.b).getTitle();
  }
  
  public CharSequence getTitleCondensed()
  {
    return ((b)this.b).getTitleCondensed();
  }
  
  public boolean hasSubMenu()
  {
    return ((b)this.b).hasSubMenu();
  }
  
  public boolean isActionViewExpanded()
  {
    return ((b)this.b).isActionViewExpanded();
  }
  
  public boolean isCheckable()
  {
    return ((b)this.b).isCheckable();
  }
  
  public boolean isChecked()
  {
    return ((b)this.b).isChecked();
  }
  
  public boolean isEnabled()
  {
    return ((b)this.b).isEnabled();
  }
  
  public boolean isVisible()
  {
    return ((b)this.b).isVisible();
  }
  
  public MenuItem setActionProvider(ActionProvider paramActionProvider)
  {
    b localb = (b)this.b;
    if (paramActionProvider != null) {}
    for (paramActionProvider = a(paramActionProvider);; paramActionProvider = null)
    {
      localb.a(paramActionProvider);
      return this;
    }
  }
  
  public MenuItem setActionView(int paramInt)
  {
    ((b)this.b).setActionView(paramInt);
    View localView = ((b)this.b).getActionView();
    if ((localView instanceof CollapsibleActionView)) {
      ((b)this.b).setActionView(new q(localView));
    }
    return this;
  }
  
  public MenuItem setActionView(View paramView)
  {
    Object localObject = paramView;
    if ((paramView instanceof CollapsibleActionView)) {
      localObject = new q(paramView);
    }
    ((b)this.b).setActionView((View)localObject);
    return this;
  }
  
  public MenuItem setAlphabeticShortcut(char paramChar)
  {
    ((b)this.b).setAlphabeticShortcut(paramChar);
    return this;
  }
  
  public MenuItem setCheckable(boolean paramBoolean)
  {
    ((b)this.b).setCheckable(paramBoolean);
    return this;
  }
  
  public MenuItem setChecked(boolean paramBoolean)
  {
    ((b)this.b).setChecked(paramBoolean);
    return this;
  }
  
  public MenuItem setEnabled(boolean paramBoolean)
  {
    ((b)this.b).setEnabled(paramBoolean);
    return this;
  }
  
  public MenuItem setIcon(int paramInt)
  {
    ((b)this.b).setIcon(paramInt);
    return this;
  }
  
  public MenuItem setIcon(Drawable paramDrawable)
  {
    ((b)this.b).setIcon(paramDrawable);
    return this;
  }
  
  public MenuItem setIntent(Intent paramIntent)
  {
    ((b)this.b).setIntent(paramIntent);
    return this;
  }
  
  public MenuItem setNumericShortcut(char paramChar)
  {
    ((b)this.b).setNumericShortcut(paramChar);
    return this;
  }
  
  public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener paramOnActionExpandListener)
  {
    b localb = (b)this.b;
    if (paramOnActionExpandListener != null) {}
    for (paramOnActionExpandListener = new r(this, paramOnActionExpandListener);; paramOnActionExpandListener = null)
    {
      localb.a(paramOnActionExpandListener);
      return this;
    }
  }
  
  public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    b localb = (b)this.b;
    if (paramOnMenuItemClickListener != null) {}
    for (paramOnMenuItemClickListener = new s(this, paramOnMenuItemClickListener);; paramOnMenuItemClickListener = null)
    {
      localb.setOnMenuItemClickListener(paramOnMenuItemClickListener);
      return this;
    }
  }
  
  public MenuItem setShortcut(char paramChar1, char paramChar2)
  {
    ((b)this.b).setShortcut(paramChar1, paramChar2);
    return this;
  }
  
  public void setShowAsAction(int paramInt)
  {
    ((b)this.b).setShowAsAction(paramInt);
  }
  
  public MenuItem setShowAsActionFlags(int paramInt)
  {
    ((b)this.b).setShowAsActionFlags(paramInt);
    return this;
  }
  
  public MenuItem setTitle(int paramInt)
  {
    ((b)this.b).setTitle(paramInt);
    return this;
  }
  
  public MenuItem setTitle(CharSequence paramCharSequence)
  {
    ((b)this.b).setTitle(paramCharSequence);
    return this;
  }
  
  public MenuItem setTitleCondensed(CharSequence paramCharSequence)
  {
    ((b)this.b).setTitleCondensed(paramCharSequence);
    return this;
  }
  
  public MenuItem setVisible(boolean paramBoolean)
  {
    return ((b)this.b).setVisible(paramBoolean);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/view/menu/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */