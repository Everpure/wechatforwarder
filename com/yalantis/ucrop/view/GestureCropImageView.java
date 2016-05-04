package com.yalantis.ucrop.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.yalantis.ucrop.a.l;

public class GestureCropImageView
  extends a
{
  private ScaleGestureDetector g;
  private l h;
  private GestureDetector i;
  private float j;
  private float k;
  private boolean l = true;
  private boolean m = true;
  private int n = 5;
  
  public GestureCropImageView(Context paramContext)
  {
    super(paramContext);
  }
  
  public GestureCropImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public GestureCropImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  private void h()
  {
    this.i = new GestureDetector(getContext(), new f(this, null), null, true);
    this.g = new ScaleGestureDetector(getContext(), new h(this, null));
    this.h = new l(new g(this, null));
  }
  
  protected void f()
  {
    super.f();
    h();
  }
  
  public int getDoubleTapScaleSteps()
  {
    return this.n;
  }
  
  protected float getDoubleTapTargetScale()
  {
    return getCurrentScale() * (float)Math.pow(getMaxScale() / getMinScale(), 1.0F / this.n);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if ((paramMotionEvent.getAction() & 0xFF) == 0) {
      b();
    }
    if (paramMotionEvent.getPointerCount() > 1)
    {
      this.j = ((paramMotionEvent.getX(0) + paramMotionEvent.getX(1)) / 2.0F);
      this.k = ((paramMotionEvent.getY(0) + paramMotionEvent.getY(1)) / 2.0F);
    }
    this.i.onTouchEvent(paramMotionEvent);
    if (this.m) {
      this.g.onTouchEvent(paramMotionEvent);
    }
    if (this.l) {
      this.h.a(paramMotionEvent);
    }
    if ((paramMotionEvent.getAction() & 0xFF) == 1) {
      c();
    }
    return true;
  }
  
  public void setDoubleTapScaleSteps(int paramInt)
  {
    this.n = paramInt;
  }
  
  public void setRotateEnabled(boolean paramBoolean)
  {
    this.l = paramBoolean;
  }
  
  public void setScaleEnabled(boolean paramBoolean)
  {
    this.m = paramBoolean;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/yalantis/ucrop/view/GestureCropImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */