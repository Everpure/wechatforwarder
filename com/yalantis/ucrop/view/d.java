package com.yalantis.ucrop.view;

import com.yalantis.ucrop.a.e;
import java.lang.ref.WeakReference;

class d
  implements Runnable
{
  private final WeakReference a;
  private final long b;
  private final long c;
  private final float d;
  private final float e;
  private final float f;
  private final float g;
  
  public d(a parama, long paramLong, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    this.a = new WeakReference(parama);
    this.c = System.currentTimeMillis();
    this.b = paramLong;
    this.d = paramFloat1;
    this.e = paramFloat2;
    this.f = paramFloat3;
    this.g = paramFloat4;
  }
  
  public void run()
  {
    a locala = (a)this.a.get();
    if (locala == null) {
      return;
    }
    long l = System.currentTimeMillis();
    float f1 = (float)Math.min(this.b, l - this.c);
    float f2 = e.b(f1, 0.0F, this.e, (float)this.b);
    if (f1 < (float)this.b)
    {
      locala.b(this.d + f2, this.f, this.g);
      locala.post(this);
      return;
    }
    locala.c();
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/yalantis/ucrop/view/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */