package android.support.v7.widget;

import android.content.Context;
import android.view.View;

class bt
  implements bx
{
  public float a(bu parambu)
  {
    return ((fk)parambu.getBackground()).a();
  }
  
  public void a() {}
  
  public void a(bu parambu, float paramFloat)
  {
    ((fk)parambu.getBackground()).a(paramFloat);
  }
  
  public void a(bu parambu, int paramInt)
  {
    ((fk)parambu.getBackground()).a(paramInt);
  }
  
  public void a(bu parambu, Context paramContext, int paramInt, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    parambu.setBackgroundDrawable(new fk(paramInt, paramFloat1));
    paramContext = (View)parambu;
    paramContext.setClipToOutline(true);
    paramContext.setElevation(paramFloat2);
    b(parambu, paramFloat3);
  }
  
  public float b(bu parambu)
  {
    return d(parambu) * 2.0F;
  }
  
  public void b(bu parambu, float paramFloat)
  {
    ((fk)parambu.getBackground()).a(paramFloat, parambu.getUseCompatPadding(), parambu.getPreventCornerOverlap());
    f(parambu);
  }
  
  public float c(bu parambu)
  {
    return d(parambu) * 2.0F;
  }
  
  public void c(bu parambu, float paramFloat)
  {
    ((View)parambu).setElevation(paramFloat);
  }
  
  public float d(bu parambu)
  {
    return ((fk)parambu.getBackground()).b();
  }
  
  public float e(bu parambu)
  {
    return ((View)parambu).getElevation();
  }
  
  public void f(bu parambu)
  {
    if (!parambu.getUseCompatPadding())
    {
      parambu.a(0, 0, 0, 0);
      return;
    }
    float f1 = a(parambu);
    float f2 = d(parambu);
    int i = (int)Math.ceil(fl.b(f1, f2, parambu.getPreventCornerOverlap()));
    int j = (int)Math.ceil(fl.a(f1, f2, parambu.getPreventCornerOverlap()));
    parambu.a(i, j, i, j);
  }
  
  public void g(bu parambu)
  {
    b(parambu, a(parambu));
  }
  
  public void h(bu parambu)
  {
    b(parambu, a(parambu));
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/bt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */