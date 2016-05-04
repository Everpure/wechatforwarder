package android.support.v7.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.support.v4.e.a.a;
import android.support.v7.view.menu.ab;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

@TargetApi(11)
public class g
  extends ActionMode
{
  final Context a;
  final b b;
  
  public g(Context paramContext, b paramb)
  {
    this.a = paramContext;
    this.b = paramb;
  }
  
  public void finish()
  {
    this.b.c();
  }
  
  public View getCustomView()
  {
    return this.b.i();
  }
  
  public Menu getMenu()
  {
    return ab.a(this.a, (a)this.b.b());
  }
  
  public MenuInflater getMenuInflater()
  {
    return this.b.a();
  }
  
  public CharSequence getSubtitle()
  {
    return this.b.g();
  }
  
  public Object getTag()
  {
    return this.b.j();
  }
  
  public CharSequence getTitle()
  {
    return this.b.f();
  }
  
  public boolean getTitleOptionalHint()
  {
    return this.b.k();
  }
  
  public void invalidate()
  {
    this.b.d();
  }
  
  public boolean isTitleOptional()
  {
    return this.b.h();
  }
  
  public void setCustomView(View paramView)
  {
    this.b.a(paramView);
  }
  
  public void setSubtitle(int paramInt)
  {
    this.b.b(paramInt);
  }
  
  public void setSubtitle(CharSequence paramCharSequence)
  {
    this.b.a(paramCharSequence);
  }
  
  public void setTag(Object paramObject)
  {
    this.b.a(paramObject);
  }
  
  public void setTitle(int paramInt)
  {
    this.b.a(paramInt);
  }
  
  public void setTitle(CharSequence paramCharSequence)
  {
    this.b.b(paramCharSequence);
  }
  
  public void setTitleOptionalHint(boolean paramBoolean)
  {
    this.b.a(paramBoolean);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/view/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */