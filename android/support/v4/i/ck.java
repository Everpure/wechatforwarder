package android.support.v4.i;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.view.View;

class ck
{
  public static float a(View paramView)
  {
    return paramView.getAlpha();
  }
  
  public static int a(int paramInt1, int paramInt2)
  {
    return View.combineMeasuredStates(paramInt1, paramInt2);
  }
  
  public static int a(int paramInt1, int paramInt2, int paramInt3)
  {
    return View.resolveSizeAndState(paramInt1, paramInt2, paramInt3);
  }
  
  static long a()
  {
    return ValueAnimator.getFrameDelay();
  }
  
  public static void a(View paramView, float paramFloat)
  {
    paramView.setTranslationX(paramFloat);
  }
  
  static void a(View paramView, int paramInt)
  {
    paramView.offsetTopAndBottom(paramInt);
    paramView = paramView.getParent();
    if ((paramView instanceof View)) {
      h((View)paramView);
    }
  }
  
  public static void a(View paramView, int paramInt, Paint paramPaint)
  {
    paramView.setLayerType(paramInt, paramPaint);
  }
  
  public static void a(View paramView, boolean paramBoolean)
  {
    paramView.setSaveFromParentEnabled(paramBoolean);
  }
  
  public static int b(View paramView)
  {
    return paramView.getLayerType();
  }
  
  public static void b(View paramView, float paramFloat)
  {
    paramView.setTranslationY(paramFloat);
  }
  
  static void b(View paramView, int paramInt)
  {
    paramView.offsetLeftAndRight(paramInt);
    paramView = paramView.getParent();
    if ((paramView instanceof View)) {
      h((View)paramView);
    }
  }
  
  public static void b(View paramView, boolean paramBoolean)
  {
    paramView.setActivated(paramBoolean);
  }
  
  public static int c(View paramView)
  {
    return paramView.getMeasuredWidthAndState();
  }
  
  public static void c(View paramView, float paramFloat)
  {
    paramView.setAlpha(paramFloat);
  }
  
  public static int d(View paramView)
  {
    return paramView.getMeasuredState();
  }
  
  public static float e(View paramView)
  {
    return paramView.getTranslationX();
  }
  
  public static float f(View paramView)
  {
    return paramView.getTranslationY();
  }
  
  public static void g(View paramView)
  {
    paramView.jumpDrawablesToCurrentState();
  }
  
  private static void h(View paramView)
  {
    float f = paramView.getTranslationY();
    paramView.setTranslationY(1.0F + f);
    paramView.setTranslationY(f);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/i/ck.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */