package android.support.v4.widget;

import android.os.Build.VERSION;
import android.widget.ListView;

public final class aa
{
  public static void a(ListView paramListView, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 19)
    {
      ac.a(paramListView, paramInt);
      return;
    }
    ab.a(paramListView, paramInt);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/widget/aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */