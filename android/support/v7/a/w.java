package android.support.v7.a;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;

public abstract class w
{
  private static int a = -1;
  
  public static w a(Activity paramActivity, v paramv)
  {
    return a(paramActivity, paramActivity.getWindow(), paramv);
  }
  
  public static w a(Dialog paramDialog, v paramv)
  {
    return a(paramDialog.getContext(), paramDialog.getWindow(), paramv);
  }
  
  private static w a(Context paramContext, Window paramWindow, v paramv)
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 23) {
      return new ac(paramContext, paramWindow, paramv);
    }
    if (i >= 14) {
      return new aa(paramContext, paramWindow, paramv);
    }
    if (i >= 11) {
      return new z(paramContext, paramWindow, paramv);
    }
    return new ae(paramContext, paramWindow, paramv);
  }
  
  public static int i()
  {
    return a;
  }
  
  public abstract a a();
  
  public abstract View a(int paramInt);
  
  public abstract void a(Configuration paramConfiguration);
  
  public abstract void a(Bundle paramBundle);
  
  public abstract void a(Toolbar paramToolbar);
  
  public abstract void a(View paramView);
  
  public abstract void a(View paramView, ViewGroup.LayoutParams paramLayoutParams);
  
  public abstract void a(CharSequence paramCharSequence);
  
  public abstract MenuInflater b();
  
  public abstract void b(int paramInt);
  
  public abstract void b(Bundle paramBundle);
  
  public abstract void b(View paramView, ViewGroup.LayoutParams paramLayoutParams);
  
  public abstract void c();
  
  public abstract void c(Bundle paramBundle);
  
  public abstract boolean c(int paramInt);
  
  public abstract void d();
  
  public abstract void e();
  
  public abstract void f();
  
  public abstract void g();
  
  public abstract boolean h();
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/a/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */