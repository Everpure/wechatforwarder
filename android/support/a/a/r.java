package android.support.a.a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Region.Op;
import android.support.v4.h.a;
import java.util.ArrayList;

class r
{
  private static final Matrix j = new Matrix();
  float a = 0.0F;
  float b = 0.0F;
  float c = 0.0F;
  float d = 0.0F;
  int e = 255;
  String f = null;
  final a g = new a();
  private final Path h;
  private final Path i;
  private final Matrix k = new Matrix();
  private Paint l;
  private Paint m;
  private PathMeasure n;
  private int o;
  private final p p;
  
  public r()
  {
    this.p = new p();
    this.h = new Path();
    this.i = new Path();
  }
  
  public r(r paramr)
  {
    this.p = new p(paramr.p, this.g);
    this.h = new Path(paramr.h);
    this.i = new Path(paramr.i);
    this.a = paramr.a;
    this.b = paramr.b;
    this.c = paramr.c;
    this.d = paramr.d;
    this.o = paramr.o;
    this.e = paramr.e;
    this.f = paramr.f;
    if (paramr.f != null) {
      this.g.put(paramr.f, this);
    }
  }
  
  private static float a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    return paramFloat1 * paramFloat4 - paramFloat2 * paramFloat3;
  }
  
  private float a(Matrix paramMatrix)
  {
    float f1 = 0.0F;
    float[] arrayOfFloat = new float[4];
    float[] tmp9_7 = arrayOfFloat;
    tmp9_7[0] = 0.0F;
    float[] tmp13_9 = tmp9_7;
    tmp13_9[1] = 1.0F;
    float[] tmp17_13 = tmp13_9;
    tmp17_13[2] = 1.0F;
    float[] tmp21_17 = tmp17_13;
    tmp21_17[3] = 0.0F;
    tmp21_17;
    paramMatrix.mapVectors(arrayOfFloat);
    float f3 = (float)Math.hypot(arrayOfFloat[0], arrayOfFloat[1]);
    float f4 = (float)Math.hypot(arrayOfFloat[2], arrayOfFloat[3]);
    float f2 = a(arrayOfFloat[0], arrayOfFloat[1], arrayOfFloat[2], arrayOfFloat[3]);
    f3 = Math.max(f3, f4);
    if (f3 > 0.0F) {
      f1 = Math.abs(f2) / f3;
    }
    return f1;
  }
  
  private void a(p paramp, Matrix paramMatrix, Canvas paramCanvas, int paramInt1, int paramInt2, ColorFilter paramColorFilter)
  {
    p.b(paramp).set(paramMatrix);
    p.b(paramp).preConcat(p.c(paramp));
    int i1 = 0;
    if (i1 < paramp.a.size())
    {
      paramMatrix = paramp.a.get(i1);
      if ((paramMatrix instanceof p)) {
        a((p)paramMatrix, p.b(paramp), paramCanvas, paramInt1, paramInt2, paramColorFilter);
      }
      for (;;)
      {
        i1 += 1;
        break;
        if ((paramMatrix instanceof q)) {
          a(paramp, (q)paramMatrix, paramCanvas, paramInt1, paramInt2, paramColorFilter);
        }
      }
    }
  }
  
  private void a(p paramp, q paramq, Canvas paramCanvas, int paramInt1, int paramInt2, ColorFilter paramColorFilter)
  {
    float f2 = paramInt1 / this.c;
    float f3 = paramInt2 / this.d;
    float f1 = Math.min(f2, f3);
    paramp = p.b(paramp);
    this.k.set(paramp);
    this.k.postScale(f2, f3);
    f2 = a(paramp);
    if (f2 == 0.0F) {
      return;
    }
    paramq.a(this.h);
    Path localPath = this.h;
    this.i.reset();
    if (paramq.a())
    {
      this.i.addPath(localPath, this.k);
      paramCanvas.clipPath(this.i, Region.Op.REPLACE);
      return;
    }
    paramp = (o)paramq;
    float f6;
    float f4;
    if ((paramp.g != 0.0F) || (paramp.h != 1.0F))
    {
      f6 = paramp.g;
      float f7 = paramp.i;
      f4 = paramp.h;
      float f5 = paramp.i;
      if (this.n == null) {
        this.n = new PathMeasure();
      }
      this.n.setPath(this.h, false);
      f3 = this.n.getLength();
      f6 = (f6 + f7) % 1.0F * f3;
      f4 = (f4 + f5) % 1.0F * f3;
      localPath.reset();
      if (f6 <= f4) {
        break label506;
      }
      this.n.getSegment(f6, f3, localPath, true);
      this.n.getSegment(0.0F, f4, localPath, true);
    }
    for (;;)
    {
      localPath.rLineTo(0.0F, 0.0F);
      this.i.addPath(localPath, this.k);
      if (paramp.c != 0)
      {
        if (this.m == null)
        {
          this.m = new Paint();
          this.m.setStyle(Paint.Style.FILL);
          this.m.setAntiAlias(true);
        }
        paramq = this.m;
        paramq.setColor(l.a(paramp.c, paramp.f));
        paramq.setColorFilter(paramColorFilter);
        paramCanvas.drawPath(this.i, paramq);
      }
      if (paramp.a == 0) {
        break;
      }
      if (this.l == null)
      {
        this.l = new Paint();
        this.l.setStyle(Paint.Style.STROKE);
        this.l.setAntiAlias(true);
      }
      paramq = this.l;
      if (paramp.k != null) {
        paramq.setStrokeJoin(paramp.k);
      }
      if (paramp.j != null) {
        paramq.setStrokeCap(paramp.j);
      }
      paramq.setStrokeMiter(paramp.l);
      paramq.setColor(l.a(paramp.a, paramp.d));
      paramq.setColorFilter(paramColorFilter);
      paramq.setStrokeWidth(f2 * f1 * paramp.b);
      paramCanvas.drawPath(this.i, paramq);
      return;
      label506:
      this.n.getSegment(f6, f4, localPath, true);
    }
  }
  
  public int a()
  {
    return this.e;
  }
  
  public void a(float paramFloat)
  {
    a((int)(255.0F * paramFloat));
  }
  
  public void a(int paramInt)
  {
    this.e = paramInt;
  }
  
  public void a(Canvas paramCanvas, int paramInt1, int paramInt2, ColorFilter paramColorFilter)
  {
    a(this.p, j, paramCanvas, paramInt1, paramInt2, paramColorFilter);
  }
  
  public float b()
  {
    return a() / 255.0F;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/a/a/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */