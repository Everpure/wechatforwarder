package com.yalantis.ucrop.view;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;

class f
  extends GestureDetector.SimpleOnGestureListener
{
  private f(GestureCropImageView paramGestureCropImageView) {}
  
  public boolean onDoubleTap(MotionEvent paramMotionEvent)
  {
    this.a.a(this.a.getDoubleTapTargetScale(), paramMotionEvent.getX(), paramMotionEvent.getY(), 200L);
    return super.onDoubleTap(paramMotionEvent);
  }
  
  public boolean onScroll(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    this.a.a(-paramFloat1, -paramFloat2);
    return true;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/yalantis/ucrop/view/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */