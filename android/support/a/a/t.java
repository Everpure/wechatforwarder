package android.support.a.a;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.VectorDrawable;

class t
  extends Drawable.ConstantState
{
  private final Drawable.ConstantState a;
  
  public t(Drawable.ConstantState paramConstantState)
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
    l locall = new l(null);
    locall.a = ((VectorDrawable)this.a.newDrawable());
    return locall;
  }
  
  public Drawable newDrawable(Resources paramResources)
  {
    l locall = new l(null);
    locall.a = ((VectorDrawable)this.a.newDrawable(paramResources));
    return locall;
  }
  
  public Drawable newDrawable(Resources paramResources, Resources.Theme paramTheme)
  {
    l locall = new l(null);
    locall.a = ((VectorDrawable)this.a.newDrawable(paramResources, paramTheme));
    return locall;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/a/a/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */