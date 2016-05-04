package com.yalantis.ucrop.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.yalantis.ucrop.a.a;
import com.yalantis.ucrop.a.f;

public class i
  extends ImageView
{
  protected final float[] a = new float[8];
  protected final float[] b = new float[2];
  protected Matrix c = new Matrix();
  protected int d;
  protected int e;
  protected k f;
  private final float[] g = new float[9];
  private float[] h;
  private float[] i;
  private boolean j = false;
  private int k = 0;
  private Uri l;
  
  public i(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public i(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public i(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    f();
  }
  
  private void a()
  {
    this.c.mapPoints(this.a, this.h);
    this.c.mapPoints(this.b, this.i);
  }
  
  public float a(Matrix paramMatrix)
  {
    return (float)Math.sqrt(Math.pow(a(paramMatrix, 0), 2.0D) + Math.pow(a(paramMatrix, 3), 2.0D));
  }
  
  protected float a(Matrix paramMatrix, int paramInt)
  {
    paramMatrix.getValues(this.g);
    return this.g[paramInt];
  }
  
  public void a(float paramFloat1, float paramFloat2)
  {
    if ((paramFloat1 != 0.0F) || (paramFloat2 != 0.0F))
    {
      this.c.postTranslate(paramFloat1, paramFloat2);
      setImageMatrix(this.c);
    }
  }
  
  public float b(Matrix paramMatrix)
  {
    return (float)-(Math.atan2(a(paramMatrix, 1), a(paramMatrix, 0)) * 57.29577951308232D);
  }
  
  public void c(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    if (paramFloat1 != 0.0F)
    {
      this.c.postScale(paramFloat1, paramFloat1, paramFloat2, paramFloat3);
      setImageMatrix(this.c);
      if (this.f != null) {
        this.f.b(a(this.c));
      }
    }
  }
  
  protected void d()
  {
    Object localObject = getDrawable();
    if (localObject == null) {}
    do
    {
      return;
      float f1 = ((Drawable)localObject).getIntrinsicWidth();
      float f2 = ((Drawable)localObject).getIntrinsicHeight();
      Log.d("TransformImageView", String.format("Image size: [%d:%d]", new Object[] { Integer.valueOf((int)f1), Integer.valueOf((int)f2) }));
      localObject = new RectF(0.0F, 0.0F, f1, f2);
      this.h = com.yalantis.ucrop.a.k.a((RectF)localObject);
      this.i = com.yalantis.ucrop.a.k.b((RectF)localObject);
    } while (this.f == null);
    this.f.a();
  }
  
  public void d(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    if (paramFloat1 != 0.0F)
    {
      this.c.postRotate(paramFloat1, paramFloat2, paramFloat3);
      setImageMatrix(this.c);
      if (this.f != null) {
        this.f.a(b(this.c));
      }
    }
  }
  
  protected void f()
  {
    setScaleType(ImageView.ScaleType.MATRIX);
  }
  
  protected int g()
  {
    Display localDisplay = ((WindowManager)getContext().getSystemService("window")).getDefaultDisplay();
    Point localPoint = new Point();
    int n;
    if (Build.VERSION.SDK_INT >= 13)
    {
      localDisplay.getSize(localPoint);
      n = localPoint.x;
    }
    for (int m = localPoint.y;; m = localDisplay.getHeight())
    {
      double d1 = Math.pow(n, 2.0D);
      return (int)Math.sqrt(Math.pow(m, 2.0D) + d1);
      n = localDisplay.getWidth();
    }
  }
  
  public float getCurrentAngle()
  {
    return b(this.c);
  }
  
  public float getCurrentScale()
  {
    return a(this.c);
  }
  
  public Uri getImageUri()
  {
    return this.l;
  }
  
  public int getMaxBitmapSize()
  {
    if (this.k <= 0) {
      this.k = g();
    }
    return this.k;
  }
  
  public Bitmap getViewBitmap()
  {
    if ((getDrawable() == null) || (!(getDrawable() instanceof f))) {
      return null;
    }
    return ((f)getDrawable()).a();
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if ((paramBoolean) || (this.j))
    {
      if (this.j) {
        this.j = false;
      }
      paramInt1 = getPaddingLeft();
      paramInt2 = getPaddingTop();
      paramInt3 = getWidth();
      paramInt4 = getPaddingRight();
      int m = getHeight();
      int n = getPaddingBottom();
      this.d = (paramInt3 - paramInt4 - paramInt1);
      this.e = (m - n - paramInt2);
      d();
    }
  }
  
  public void setImageBitmap(Bitmap paramBitmap)
  {
    setImageDrawable(new f(paramBitmap));
  }
  
  public void setImageMatrix(Matrix paramMatrix)
  {
    super.setImageMatrix(paramMatrix);
    a();
  }
  
  public void setImageUri(Uri paramUri)
  {
    this.l = paramUri;
    int m = getMaxBitmapSize();
    a.a(getContext(), paramUri, m, m, new j(this));
  }
  
  public void setMaxBitmapSize(int paramInt)
  {
    this.k = paramInt;
  }
  
  public void setScaleType(ImageView.ScaleType paramScaleType)
  {
    if (paramScaleType == ImageView.ScaleType.MATRIX)
    {
      super.setScaleType(paramScaleType);
      return;
    }
    Log.w("TransformImageView", "Invalid ScaleType. Only ScaleType.MATRIX can be used");
  }
  
  public void setTransformImageListener(k paramk)
  {
    this.f = paramk;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/yalantis/ucrop/view/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */