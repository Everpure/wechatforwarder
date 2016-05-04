package android.support.v7.a;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class au
  implements View.OnClickListener
{
  private final View a;
  private final String b;
  private Method c;
  private Context d;
  
  public au(View paramView, String paramString)
  {
    this.a = paramView;
    this.b = paramString;
  }
  
  private void a(Context paramContext, String paramString)
  {
    while (paramContext != null) {
      try
      {
        if (!paramContext.isRestricted())
        {
          paramString = paramContext.getClass().getMethod(this.b, new Class[] { View.class });
          if (paramString != null)
          {
            this.c = paramString;
            this.d = paramContext;
            return;
          }
        }
      }
      catch (NoSuchMethodException paramString)
      {
        if ((paramContext instanceof ContextWrapper)) {
          paramContext = ((ContextWrapper)paramContext).getBaseContext();
        } else {
          paramContext = null;
        }
      }
    }
    int i = this.a.getId();
    if (i == -1) {}
    for (paramContext = "";; paramContext = " with id '" + this.a.getContext().getResources().getResourceEntryName(i) + "'") {
      throw new IllegalStateException("Could not find method " + this.b + "(View) in a parent or ancestor Context for android:onClick " + "attribute defined on view " + this.a.getClass() + paramContext);
    }
  }
  
  public void onClick(View paramView)
  {
    if (this.c == null) {
      a(this.a.getContext(), this.b);
    }
    try
    {
      this.c.invoke(this.d, new Object[] { paramView });
      return;
    }
    catch (IllegalAccessException paramView)
    {
      throw new IllegalStateException("Could not execute non-public method for android:onClick", paramView);
    }
    catch (InvocationTargetException paramView)
    {
      throw new IllegalStateException("Could not execute method for android:onClick", paramView);
    }
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/a/au.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */