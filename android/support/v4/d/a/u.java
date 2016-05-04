package android.support.v4.d.a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

class u
  extends r
{
  u(Drawable paramDrawable)
  {
    super(paramDrawable);
  }
  
  u(s params, Resources paramResources)
  {
    super(params, paramResources);
  }
  
  protected Drawable a(Drawable.ConstantState paramConstantState, Resources paramResources)
  {
    return paramConstantState.newDrawable(paramResources);
  }
  
  s b()
  {
    return new v(this.b, null);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/d/a/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */