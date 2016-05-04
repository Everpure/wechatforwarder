package android.support.a.a;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.support.v4.d.a.a;
import android.util.AttributeSet;

@TargetApi(21)
abstract class k
  extends Drawable
{
  Drawable a;
  
  static TypedArray b(Resources paramResources, Resources.Theme paramTheme, AttributeSet paramAttributeSet, int[] paramArrayOfInt)
  {
    if (paramTheme == null) {
      return paramResources.obtainAttributes(paramAttributeSet, paramArrayOfInt);
    }
    return paramTheme.obtainStyledAttributes(paramAttributeSet, paramArrayOfInt, 0, 0);
  }
  
  public void applyTheme(Resources.Theme paramTheme)
  {
    if (this.a != null) {
      a.a(this.a, paramTheme);
    }
  }
  
  public void clearColorFilter()
  {
    if (this.a != null)
    {
      this.a.clearColorFilter();
      return;
    }
    super.clearColorFilter();
  }
  
  public ColorFilter getColorFilter()
  {
    if (this.a != null) {
      return a.e(this.a);
    }
    return null;
  }
  
  public Drawable getCurrent()
  {
    if (this.a != null) {
      return this.a.getCurrent();
    }
    return super.getCurrent();
  }
  
  public int getLayoutDirection()
  {
    if (this.a != null) {
      a.g(this.a);
    }
    return 0;
  }
  
  public int getMinimumHeight()
  {
    if (this.a != null) {
      return this.a.getMinimumHeight();
    }
    return super.getMinimumHeight();
  }
  
  public int getMinimumWidth()
  {
    if (this.a != null) {
      return this.a.getMinimumWidth();
    }
    return super.getMinimumWidth();
  }
  
  public boolean getPadding(Rect paramRect)
  {
    if (this.a != null) {
      return this.a.getPadding(paramRect);
    }
    return super.getPadding(paramRect);
  }
  
  public int[] getState()
  {
    if (this.a != null) {
      return this.a.getState();
    }
    return super.getState();
  }
  
  public Region getTransparentRegion()
  {
    if (this.a != null) {
      return this.a.getTransparentRegion();
    }
    return super.getTransparentRegion();
  }
  
  public boolean isAutoMirrored()
  {
    if (this.a != null) {
      a.b(this.a);
    }
    return false;
  }
  
  public void jumpToCurrentState()
  {
    if (this.a != null) {
      a.a(this.a);
    }
  }
  
  protected void onBoundsChange(Rect paramRect)
  {
    if (this.a != null)
    {
      this.a.setBounds(paramRect);
      return;
    }
    super.onBoundsChange(paramRect);
  }
  
  protected boolean onLevelChange(int paramInt)
  {
    if (this.a != null) {
      return this.a.setLevel(paramInt);
    }
    return super.onLevelChange(paramInt);
  }
  
  public void setAutoMirrored(boolean paramBoolean)
  {
    if (this.a != null) {
      a.a(this.a, paramBoolean);
    }
  }
  
  public void setChangingConfigurations(int paramInt)
  {
    if (this.a != null)
    {
      this.a.setChangingConfigurations(paramInt);
      return;
    }
    super.setChangingConfigurations(paramInt);
  }
  
  public void setColorFilter(int paramInt, PorterDuff.Mode paramMode)
  {
    if (this.a != null)
    {
      this.a.setColorFilter(paramInt, paramMode);
      return;
    }
    super.setColorFilter(paramInt, paramMode);
  }
  
  public void setFilterBitmap(boolean paramBoolean)
  {
    if (this.a != null) {
      this.a.setFilterBitmap(paramBoolean);
    }
  }
  
  public void setHotspot(float paramFloat1, float paramFloat2)
  {
    if (this.a != null) {
      a.a(this.a, paramFloat1, paramFloat2);
    }
  }
  
  public void setHotspotBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (this.a != null) {
      a.a(this.a, paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }
  
  public boolean setState(int[] paramArrayOfInt)
  {
    if (this.a != null) {
      return this.a.setState(paramArrayOfInt);
    }
    return super.setState(paramArrayOfInt);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/a/a/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */