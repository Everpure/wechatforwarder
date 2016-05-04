package android.support.v4.f;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class d
  implements Parcelable.Creator
{
  final e a;
  
  public d(e parame)
  {
    this.a = parame;
  }
  
  public Object createFromParcel(Parcel paramParcel)
  {
    return this.a.b(paramParcel, null);
  }
  
  public Object[] newArray(int paramInt)
  {
    return this.a.b(paramInt);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/f/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */