package android.support.v7.view.menu;

import android.content.Context;
import android.view.ActionProvider;
import android.view.ActionProvider.VisibilityListener;
import android.view.MenuItem;
import android.view.View;

class u
  extends p
  implements ActionProvider.VisibilityListener
{
  android.support.v4.i.p c;
  
  public u(t paramt, Context paramContext, ActionProvider paramActionProvider)
  {
    super(paramt, paramContext, paramActionProvider);
  }
  
  public View a(MenuItem paramMenuItem)
  {
    return this.a.onCreateActionView(paramMenuItem);
  }
  
  public void a(android.support.v4.i.p paramp)
  {
    this.c = paramp;
    ActionProvider localActionProvider = this.a;
    if (paramp != null) {}
    for (paramp = this;; paramp = null)
    {
      localActionProvider.setVisibilityListener(paramp);
      return;
    }
  }
  
  public boolean b()
  {
    return this.a.overridesItemVisibility();
  }
  
  public boolean c()
  {
    return this.a.isVisible();
  }
  
  public void onActionProviderVisibilityChanged(boolean paramBoolean)
  {
    if (this.c != null) {
      this.c.a(paramBoolean);
    }
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/view/menu/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */