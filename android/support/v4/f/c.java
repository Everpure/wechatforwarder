package android.support.v4.f;

import android.os.Build.VERSION;
import android.os.Parcelable.Creator;

public final class c
{
  public static Parcelable.Creator a(e parame)
  {
    if (Build.VERSION.SDK_INT >= 13) {
      return g.a(parame);
    }
    return new d(parame);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/f/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */