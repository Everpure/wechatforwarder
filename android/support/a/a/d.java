package android.support.a.a;

import android.animation.Animator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.support.v4.h.a;
import java.util.ArrayList;

class d
  extends Drawable.ConstantState
{
  int a;
  l b;
  ArrayList c;
  a d;
  
  public d(Context paramContext, d paramd, Drawable.Callback paramCallback, Resources paramResources)
  {
    if (paramd != null)
    {
      this.a = paramd.a;
      if (paramd.b != null)
      {
        paramContext = paramd.b.getConstantState();
        if (paramResources == null) {
          break label215;
        }
      }
      label215:
      for (this.b = ((l)paramContext.newDrawable(paramResources));; this.b = ((l)paramContext.newDrawable()))
      {
        this.b = ((l)this.b.mutate());
        this.b.setCallback(paramCallback);
        this.b.setBounds(paramd.b.getBounds());
        this.b.a(false);
        if (paramd.c == null) {
          break;
        }
        int j = paramd.c.size();
        this.c = new ArrayList(j);
        this.d = new a(j);
        while (i < j)
        {
          paramCallback = (Animator)paramd.c.get(i);
          paramContext = paramCallback.clone();
          paramCallback = (String)paramd.d.get(paramCallback);
          paramContext.setTarget(this.b.a(paramCallback));
          this.c.add(paramContext);
          this.d.put(paramContext, paramCallback);
          i += 1;
        }
      }
    }
  }
  
  public int getChangingConfigurations()
  {
    return this.a;
  }
  
  public Drawable newDrawable()
  {
    throw new IllegalStateException("No constant state support for SDK < 21.");
  }
  
  public Drawable newDrawable(Resources paramResources)
  {
    throw new IllegalStateException("No constant state support for SDK < 21.");
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/a/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */