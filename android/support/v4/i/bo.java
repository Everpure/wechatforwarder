package android.support.v4.i;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;

public abstract interface bo
{
  public abstract ColorStateList getSupportBackgroundTintList();
  
  public abstract PorterDuff.Mode getSupportBackgroundTintMode();
  
  public abstract void setSupportBackgroundTintList(ColorStateList paramColorStateList);
  
  public abstract void setSupportBackgroundTintMode(PorterDuff.Mode paramMode);
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/i/bo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */