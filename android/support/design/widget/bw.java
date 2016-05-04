package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.design.c;

class bw
{
  private static final int[] a = { c.colorPrimary };
  
  static void a(Context paramContext)
  {
    int i = 0;
    paramContext = paramContext.obtainStyledAttributes(a);
    if (!paramContext.hasValue(0)) {
      i = 1;
    }
    if (paramContext != null) {
      paramContext.recycle();
    }
    if (i != 0) {
      throw new IllegalArgumentException("You need to use a Theme.AppCompat theme (or descendant) with the design library.");
    }
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/design/widget/bw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */