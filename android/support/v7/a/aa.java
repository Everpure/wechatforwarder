package android.support.v7.a;

import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Window;
import android.view.Window.Callback;

class aa
  extends z
{
  private static bd r;
  private int s = -100;
  private boolean t;
  private boolean u = true;
  
  aa(Context paramContext, Window paramWindow, v paramv)
  {
    super(paramContext, paramWindow, paramv);
  }
  
  private int d(int paramInt)
  {
    int j = 2;
    int i = j;
    switch (paramInt)
    {
    case 1: 
    default: 
      i = 1;
    case 2: 
      return i;
    case 0: 
      if (s().a()) {}
      for (paramInt = 2;; paramInt = 1) {
        return paramInt;
      }
    }
    i = j;
    switch (((UiModeManager)this.a.getSystemService("uimode")).getNightMode())
    {
    case 2: 
    case 1: 
    default: 
      return 1;
    }
    return 0;
  }
  
  private boolean e(int paramInt)
  {
    boolean bool = false;
    Resources localResources = this.a.getResources();
    Configuration localConfiguration = localResources.getConfiguration();
    int i = localConfiguration.uiMode;
    switch (paramInt)
    {
    default: 
      paramInt = 0;
    }
    for (;;)
    {
      if ((i & 0x30) != paramInt)
      {
        localConfiguration.uiMode = (localConfiguration.uiMode & 0xFFFFFFCF | paramInt);
        localResources.updateConfiguration(localConfiguration, null);
        bool = true;
      }
      return bool;
      paramInt = 16;
      continue;
      paramInt = 32;
    }
  }
  
  private int r()
  {
    if (this.s == -100) {}
    for (int i = i();; i = this.s) {
      return d(i);
    }
  }
  
  private bd s()
  {
    if (r == null) {
      r = new bd(this.a.getApplicationContext());
    }
    return r;
  }
  
  Window.Callback a(Window.Callback paramCallback)
  {
    return new ab(this, paramCallback);
  }
  
  public void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if ((paramBundle != null) && (this.s == -100)) {
      this.s = paramBundle.getInt("appcompat:local_night_mode", -100);
    }
  }
  
  public void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    if (this.s != -100) {
      paramBundle.putInt("appcompat:local_night_mode", this.s);
    }
  }
  
  public boolean h()
  {
    this.t = true;
    return e(r());
  }
  
  public boolean m()
  {
    return this.u;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/a/aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */