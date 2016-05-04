package android.support.design.widget;

import android.support.v4.i.bu;
import android.view.View;
import java.util.Comparator;

class z
  implements Comparator
{
  public int a(View paramView1, View paramView2)
  {
    float f1 = bu.B(paramView1);
    float f2 = bu.B(paramView2);
    if (f1 > f2) {
      return -1;
    }
    if (f1 < f2) {
      return 1;
    }
    return 0;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/design/widget/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */