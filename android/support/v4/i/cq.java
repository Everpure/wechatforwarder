package android.support.v4.i;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.view.View;
import android.view.WindowInsets;

class cq
{
  public static ec a(View paramView, ec paramec)
  {
    Object localObject = paramec;
    if ((paramec instanceof ed))
    {
      WindowInsets localWindowInsets = ((ed)paramec).f();
      paramView = paramView.onApplyWindowInsets(localWindowInsets);
      localObject = paramec;
      if (paramView != localWindowInsets) {
        localObject = new ed(paramView);
      }
    }
    return (ec)localObject;
  }
  
  public static void a(View paramView)
  {
    paramView.requestApplyInsets();
  }
  
  public static void a(View paramView, float paramFloat)
  {
    paramView.setElevation(paramFloat);
  }
  
  static void a(View paramView, ColorStateList paramColorStateList)
  {
    paramView.setBackgroundTintList(paramColorStateList);
  }
  
  static void a(View paramView, PorterDuff.Mode paramMode)
  {
    paramView.setBackgroundTintMode(paramMode);
  }
  
  public static void a(View paramView, bm parambm)
  {
    if (parambm == null)
    {
      paramView.setOnApplyWindowInsetsListener(null);
      return;
    }
    paramView.setOnApplyWindowInsetsListener(new cr(parambm));
  }
  
  public static float b(View paramView)
  {
    return paramView.getElevation();
  }
  
  public static float c(View paramView)
  {
    return paramView.getTranslationZ();
  }
  
  static ColorStateList d(View paramView)
  {
    return paramView.getBackgroundTintList();
  }
  
  static PorterDuff.Mode e(View paramView)
  {
    return paramView.getBackgroundTintMode();
  }
  
  public static void f(View paramView)
  {
    paramView.stopNestedScroll();
  }
  
  public static float g(View paramView)
  {
    return paramView.getZ();
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/i/cq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */