package android.support.v4.f;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

class f
  implements Parcelable.ClassLoaderCreator
{
  private final e a;
  
  public f(e parame)
  {
    this.a = parame;
  }
  
  public Object createFromParcel(Parcel paramParcel)
  {
    return this.a.b(paramParcel, null);
  }
  
  public Object createFromParcel(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    return this.a.b(paramParcel, paramClassLoader);
  }
  
  public Object[] newArray(int paramInt)
  {
    return this.a.b(paramInt);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/f/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */