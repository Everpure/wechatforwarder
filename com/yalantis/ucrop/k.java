package com.yalantis.ucrop;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class k
{
  private Intent a = new Intent();
  private Bundle b = new Bundle();
  
  private k(Uri paramUri1, Uri paramUri2)
  {
    this.b.putParcelable("com.yalantis.ucrop.InputUri", paramUri1);
    this.b.putParcelable("com.yalantis.ucrop.OutputUri", paramUri2);
  }
  
  public static Uri a(Intent paramIntent)
  {
    return (Uri)paramIntent.getParcelableExtra("com.yalantis.ucrop.OutputUri");
  }
  
  public static k a(Uri paramUri1, Uri paramUri2)
  {
    return new k(paramUri1, paramUri2);
  }
  
  public Intent a(Context paramContext)
  {
    this.a.setClass(paramContext, UCropActivity.class);
    this.a.putExtras(this.b);
    return this.a;
  }
  
  public k a(l paraml)
  {
    this.b.putAll(paraml.a());
    return this;
  }
  
  public void a(Activity paramActivity)
  {
    a(paramActivity, 69);
  }
  
  public void a(Activity paramActivity, int paramInt)
  {
    paramActivity.startActivityForResult(a(paramActivity), paramInt);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/yalantis/ucrop/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */