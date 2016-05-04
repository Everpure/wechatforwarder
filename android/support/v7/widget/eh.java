package android.support.v7.widget;

import android.database.Observable;
import java.util.ArrayList;

class eh
  extends Observable
{
  public void a()
  {
    int i = this.mObservers.size() - 1;
    while (i >= 0)
    {
      ((ei)this.mObservers.get(i)).a();
      i -= 1;
    }
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/eh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */