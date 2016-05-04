package android.support.v7.widget;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v7.d.a.a;

class du
  extends a
{
  private boolean a = true;
  
  public du(Drawable paramDrawable)
  {
    super(paramDrawable);
  }
  
  void a(boolean paramBoolean)
  {
    this.a = paramBoolean;
  }
  
  public void draw(Canvas paramCanvas)
  {
    if (this.a) {
      super.draw(paramCanvas);
    }
  }
  
  public void setHotspot(float paramFloat1, float paramFloat2)
  {
    if (this.a) {
      super.setHotspot(paramFloat1, paramFloat2);
    }
  }
  
  public void setHotspotBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (this.a) {
      super.setHotspotBounds(paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }
  
  public boolean setState(int[] paramArrayOfInt)
  {
    if (this.a) {
      return super.setState(paramArrayOfInt);
    }
    return false;
  }
  
  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.a) {
      return super.setVisible(paramBoolean1, paramBoolean2);
    }
    return false;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/du.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */