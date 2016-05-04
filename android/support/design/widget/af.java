package android.support.design.widget;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;

class af
  implements ay
{
  private af(FloatingActionButton paramFloatingActionButton) {}
  
  public float a()
  {
    return this.a.getSizeDimension() / 2.0F;
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    FloatingActionButton.a(this.a).set(paramInt1, paramInt2, paramInt3, paramInt4);
    this.a.setPadding(FloatingActionButton.b(this.a) + paramInt1, FloatingActionButton.b(this.a) + paramInt2, FloatingActionButton.b(this.a) + paramInt3, FloatingActionButton.b(this.a) + paramInt4);
  }
  
  public void a(Drawable paramDrawable)
  {
    FloatingActionButton.a(this.a, paramDrawable);
  }
  
  public boolean b()
  {
    return FloatingActionButton.c(this.a);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/design/widget/af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */