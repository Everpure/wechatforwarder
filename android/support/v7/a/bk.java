package android.support.v7.a;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.view.b;
import android.support.v7.view.c;
import android.support.v7.view.menu.j;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.support.v7.widget.cf;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

public class bk
  extends b
  implements j
{
  private final Context b;
  private final android.support.v7.view.menu.i c;
  private c d;
  private WeakReference e;
  
  public bk(bg parambg, Context paramContext, c paramc)
  {
    this.b = paramContext;
    this.d = paramc;
    this.c = new android.support.v7.view.menu.i(paramContext).a(1);
    this.c.a(this);
  }
  
  public MenuInflater a()
  {
    return new android.support.v7.view.i(this.b);
  }
  
  public void a(int paramInt)
  {
    b(bg.i(this.a).getResources().getString(paramInt));
  }
  
  public void a(android.support.v7.view.menu.i parami)
  {
    if (this.d == null) {
      return;
    }
    d();
    bg.g(this.a).a();
  }
  
  public void a(View paramView)
  {
    bg.g(this.a).setCustomView(paramView);
    this.e = new WeakReference(paramView);
  }
  
  public void a(CharSequence paramCharSequence)
  {
    bg.g(this.a).setSubtitle(paramCharSequence);
  }
  
  public void a(boolean paramBoolean)
  {
    super.a(paramBoolean);
    bg.g(this.a).setTitleOptional(paramBoolean);
  }
  
  public boolean a(android.support.v7.view.menu.i parami, MenuItem paramMenuItem)
  {
    if (this.d != null) {
      return this.d.a(this, paramMenuItem);
    }
    return false;
  }
  
  public Menu b()
  {
    return this.c;
  }
  
  public void b(int paramInt)
  {
    a(bg.i(this.a).getResources().getString(paramInt));
  }
  
  public void b(CharSequence paramCharSequence)
  {
    bg.g(this.a).setTitle(paramCharSequence);
  }
  
  public void c()
  {
    if (this.a.a != this) {
      return;
    }
    if (!bg.a(bg.e(this.a), bg.f(this.a), false))
    {
      this.a.b = this;
      this.a.c = this.d;
    }
    for (;;)
    {
      this.d = null;
      this.a.k(false);
      bg.g(this.a).b();
      bg.h(this.a).a().sendAccessibilityEvent(32);
      bg.d(this.a).setHideOnContentScrollEnabled(this.a.d);
      this.a.a = null;
      return;
      this.d.a(this);
    }
  }
  
  public void d()
  {
    if (this.a.a != this) {
      return;
    }
    this.c.g();
    try
    {
      this.d.b(this, this.c);
      return;
    }
    finally
    {
      this.c.h();
    }
  }
  
  public boolean e()
  {
    this.c.g();
    try
    {
      boolean bool = this.d.a(this, this.c);
      return bool;
    }
    finally
    {
      this.c.h();
    }
  }
  
  public CharSequence f()
  {
    return bg.g(this.a).getTitle();
  }
  
  public CharSequence g()
  {
    return bg.g(this.a).getSubtitle();
  }
  
  public boolean h()
  {
    return bg.g(this.a).d();
  }
  
  public View i()
  {
    if (this.e != null) {
      return (View)this.e.get();
    }
    return null;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/a/bk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */