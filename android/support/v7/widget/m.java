package android.support.v7.widget;

import android.content.Context;
import android.support.v7.b.b;
import android.support.v7.view.menu.ad;
import android.support.v7.view.menu.v;
import android.view.MenuItem;
import android.view.View;

class m
  extends v
{
  private ad d;
  
  public m(k paramk, Context paramContext, ad paramad)
  {
    super(paramContext, paramad, null, false, b.actionOverflowMenuStyle);
    this.d = paramad;
    int j;
    int i;
    if (!((android.support.v7.view.menu.m)paramad.getItem()).j())
    {
      if (k.e(paramk) == null)
      {
        paramContext = (View)k.f(paramk);
        a(paramContext);
      }
    }
    else
    {
      a(paramk.g);
      j = paramad.size();
      i = 0;
    }
    for (;;)
    {
      boolean bool1 = bool2;
      if (i < j)
      {
        paramk = paramad.getItem(i);
        if ((paramk.isVisible()) && (paramk.getIcon() != null)) {
          bool1 = true;
        }
      }
      else
      {
        a(bool1);
        return;
        paramContext = k.e(paramk);
        break;
      }
      i += 1;
    }
  }
  
  public void onDismiss()
  {
    super.onDismiss();
    k.a(this.c, null);
    this.c.h = 0;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */