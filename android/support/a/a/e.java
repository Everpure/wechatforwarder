package android.support.a.a;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

class e
  extends Drawable.ConstantState
{
  private final Drawable.ConstantState a;
  
  public e(Drawable.ConstantState paramConstantState)
  {
    this.a = paramConstantState;
  }
  
  public boolean canApplyTheme()
  {
    return this.a.canApplyTheme();
  }
  
  public int getChangingConfigurations()
  {
    return this.a.getChangingConfigurations();
  }
  
  public Drawable newDrawable()
  {
    b localb = new b(null);
    localb.a = this.a.newDrawable();
    localb.a.setCallback(b.a(localb));
    return localb;
  }
  
  public Drawable newDrawable(Resources paramResources)
  {
    b localb = new b(null);
    localb.a = this.a.newDrawable(paramResources);
    localb.a.setCallback(b.a(localb));
    return localb;
  }
  
  public Drawable newDrawable(Resources paramResources, Resources.Theme paramTheme)
  {
    b localb = new b(null);
    localb.a = this.a.newDrawable(paramResources, paramTheme);
    localb.a.setCallback(b.a(localb));
    return localb;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/a/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */