package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public class es
  extends ViewGroup.MarginLayoutParams
{
  fh a;
  final Rect b = new Rect();
  boolean c = true;
  boolean d = false;
  
  public es(int paramInt1, int paramInt2)
  {
    super(paramInt1, paramInt2);
  }
  
  public es(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public es(es parames)
  {
    super(parames);
  }
  
  public es(ViewGroup.LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
  }
  
  public es(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    super(paramMarginLayoutParams);
  }
  
  public boolean c()
  {
    return this.a.q();
  }
  
  public boolean d()
  {
    return this.a.x();
  }
  
  public int e()
  {
    return this.a.d();
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/es.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */