package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;

class bv
  implements bx
{
  final RectF a = new RectF();
  
  private fl i(bu parambu)
  {
    return (fl)parambu.getBackground();
  }
  
  public float a(bu parambu)
  {
    return i(parambu).c();
  }
  
  fl a(Context paramContext, int paramInt, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    return new fl(paramContext.getResources(), paramInt, paramFloat1, paramFloat2, paramFloat3);
  }
  
  public void a()
  {
    fl.c = new bw(this);
  }
  
  public void a(bu parambu, float paramFloat)
  {
    i(parambu).a(paramFloat);
    f(parambu);
  }
  
  public void a(bu parambu, int paramInt)
  {
    i(parambu).a(paramInt);
  }
  
  public void a(bu parambu, Context paramContext, int paramInt, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    paramContext = a(paramContext, paramInt, paramFloat1, paramFloat2, paramFloat3);
    paramContext.a(parambu.getPreventCornerOverlap());
    parambu.setBackgroundDrawable(paramContext);
    f(parambu);
  }
  
  public float b(bu parambu)
  {
    return i(parambu).d();
  }
  
  public void b(bu parambu, float paramFloat)
  {
    i(parambu).c(paramFloat);
    f(parambu);
  }
  
  public float c(bu parambu)
  {
    return i(parambu).e();
  }
  
  public void c(bu parambu, float paramFloat)
  {
    i(parambu).b(paramFloat);
  }
  
  public float d(bu parambu)
  {
    return i(parambu).a();
  }
  
  public float e(bu parambu)
  {
    return i(parambu).b();
  }
  
  public void f(bu parambu)
  {
    Rect localRect = new Rect();
    i(parambu).a(localRect);
    parambu.a((int)Math.ceil(b(parambu)), (int)Math.ceil(c(parambu)));
    parambu.a(localRect.left, localRect.top, localRect.right, localRect.bottom);
  }
  
  public void g(bu parambu) {}
  
  public void h(bu parambu)
  {
    i(parambu).a(parambu.getPreventCornerOverlap());
    f(parambu);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/bv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */