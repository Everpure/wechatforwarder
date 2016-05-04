package com.yalantis.ucrop.view;

import android.graphics.RectF;
import com.yalantis.ucrop.a.e;
import java.lang.ref.WeakReference;

class c
  implements Runnable
{
  private final WeakReference a;
  private final long b;
  private final long c;
  private final float d;
  private final float e;
  private final float f;
  private final float g;
  private final float h;
  private final float i;
  private final boolean j;
  
  public c(a parama, long paramLong, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, boolean paramBoolean)
  {
    this.a = new WeakReference(parama);
    this.b = paramLong;
    this.c = System.currentTimeMillis();
    this.d = paramFloat1;
    this.e = paramFloat2;
    this.f = paramFloat3;
    this.g = paramFloat4;
    this.h = paramFloat5;
    this.i = paramFloat6;
    this.j = paramBoolean;
  }
  
  public void run()
  {
    a locala = (a)this.a.get();
    if (locala == null) {}
    do
    {
      float f1;
      float f2;
      float f3;
      float f4;
      do
      {
        return;
        long l = System.currentTimeMillis();
        f1 = (float)Math.min(this.b, l - this.c);
        f2 = e.a(f1, 0.0F, this.f, (float)this.b);
        f3 = e.a(f1, 0.0F, this.g, (float)this.b);
        f4 = e.b(f1, 0.0F, this.i, (float)this.b);
      } while (f1 >= (float)this.b);
      locala.a(f2 - (locala.b[0] - this.d), f3 - (locala.b[1] - this.e));
      if (!this.j) {
        locala.b(this.h + f4, a.a(locala).centerX(), a.a(locala).centerY());
      }
    } while (locala.e());
    locala.post(this);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/yalantis/ucrop/view/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */