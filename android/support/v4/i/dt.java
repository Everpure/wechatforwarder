package android.support.v4.i;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;

class dt
{
  public static long a(View paramView)
  {
    return paramView.animate().getDuration();
  }
  
  public static void a(View paramView, float paramFloat)
  {
    paramView.animate().alpha(paramFloat);
  }
  
  public static void a(View paramView, long paramLong)
  {
    paramView.animate().setDuration(paramLong);
  }
  
  public static void a(View paramView, dz paramdz)
  {
    if (paramdz != null)
    {
      paramView.animate().setListener(new du(paramdz, paramView));
      return;
    }
    paramView.animate().setListener(null);
  }
  
  public static void a(View paramView, Interpolator paramInterpolator)
  {
    paramView.animate().setInterpolator(paramInterpolator);
  }
  
  public static void b(View paramView)
  {
    paramView.animate().cancel();
  }
  
  public static void b(View paramView, float paramFloat)
  {
    paramView.animate().translationX(paramFloat);
  }
  
  public static void b(View paramView, long paramLong)
  {
    paramView.animate().setStartDelay(paramLong);
  }
  
  public static void c(View paramView)
  {
    paramView.animate().start();
  }
  
  public static void c(View paramView, float paramFloat)
  {
    paramView.animate().translationY(paramFloat);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/i/dt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */