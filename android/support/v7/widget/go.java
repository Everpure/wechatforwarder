package android.support.v7.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class go
  extends ContextWrapper
{
  private static final ArrayList a = new ArrayList();
  private Resources b;
  private final Resources.Theme c = getResources().newTheme();
  
  private go(Context paramContext)
  {
    super(paramContext);
    this.c.setTo(paramContext.getTheme());
  }
  
  public static Context a(Context paramContext)
  {
    Object localObject = paramContext;
    int j;
    int i;
    if (b(paramContext))
    {
      j = a.size();
      i = 0;
    }
    while (i < j)
    {
      localObject = (WeakReference)a.get(i);
      if (localObject != null) {}
      for (localObject = (go)((WeakReference)localObject).get(); (localObject != null) && (((go)localObject).getBaseContext() == paramContext); localObject = null) {
        return (Context)localObject;
      }
      i += 1;
    }
    paramContext = new go(paramContext);
    a.add(new WeakReference(paramContext));
    return paramContext;
  }
  
  private static boolean b(Context paramContext)
  {
    if ((paramContext instanceof go)) {}
    while ((paramContext.getResources() instanceof gq)) {
      return false;
    }
    return true;
  }
  
  public Resources getResources()
  {
    if (this.b == null) {
      this.b = new gq(this, super.getResources());
    }
    return this.b;
  }
  
  public Resources.Theme getTheme()
  {
    return this.c;
  }
  
  public void setTheme(int paramInt)
  {
    this.c.applyStyle(paramInt, true);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/go.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */