package android.support.v7.widget;

import android.view.View;

class fo
{
  static int a(fe paramfe, dx paramdx, View paramView1, View paramView2, eq parameq, boolean paramBoolean)
  {
    if ((parameq.s() == 0) || (paramfe.e() == 0) || (paramView1 == null) || (paramView2 == null)) {
      return 0;
    }
    if (!paramBoolean) {
      return Math.abs(parameq.d(paramView1) - parameq.d(paramView2)) + 1;
    }
    int i = paramdx.b(paramView2);
    int j = paramdx.a(paramView1);
    return Math.min(paramdx.f(), i - j);
  }
  
  static int a(fe paramfe, dx paramdx, View paramView1, View paramView2, eq parameq, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = 0;
    int j = i;
    if (parameq.s() != 0)
    {
      j = i;
      if (paramfe.e() != 0)
      {
        j = i;
        if (paramView1 != null)
        {
          if (paramView2 != null) {
            break label45;
          }
          j = i;
        }
      }
    }
    return j;
    label45:
    i = Math.min(parameq.d(paramView1), parameq.d(paramView2));
    j = Math.max(parameq.d(paramView1), parameq.d(paramView2));
    if (paramBoolean2) {}
    for (i = Math.max(0, paramfe.e() - j - 1);; i = Math.max(0, i))
    {
      j = i;
      if (!paramBoolean1) {
        break;
      }
      j = Math.abs(paramdx.b(paramView2) - paramdx.a(paramView1));
      int k = Math.abs(parameq.d(paramView1) - parameq.d(paramView2));
      float f = j / (k + 1);
      return Math.round(i * f + (paramdx.c() - paramdx.a(paramView1)));
    }
  }
  
  static int b(fe paramfe, dx paramdx, View paramView1, View paramView2, eq parameq, boolean paramBoolean)
  {
    if ((parameq.s() == 0) || (paramfe.e() == 0) || (paramView1 == null) || (paramView2 == null)) {
      return 0;
    }
    if (!paramBoolean) {
      return paramfe.e();
    }
    int i = paramdx.b(paramView2);
    int j = paramdx.a(paramView1);
    int k = Math.abs(parameq.d(paramView1) - parameq.d(paramView2));
    return (int)((i - j) / (k + 1) * paramfe.e());
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/fo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */