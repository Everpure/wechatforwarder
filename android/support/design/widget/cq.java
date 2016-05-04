package android.support.design.widget;

import android.os.Build.VERSION;
import android.view.View;

class cq
{
  static final ca a = new cr();
  private static final cs b = new ct(null);
  
  static
  {
    if (Build.VERSION.SDK_INT >= 21)
    {
      b = new cu(null);
      return;
    }
  }
  
  static bx a()
  {
    return a.a();
  }
  
  static void a(View paramView)
  {
    b.a(paramView);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/design/widget/cq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */