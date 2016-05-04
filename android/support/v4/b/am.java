package android.support.v4.b;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

final class am
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new an();
  ao[] a;
  int[] b;
  p[] c;
  
  public am() {}
  
  public am(Parcel paramParcel)
  {
    this.a = ((ao[])paramParcel.createTypedArray(ao.CREATOR));
    this.b = paramParcel.createIntArray();
    this.c = ((p[])paramParcel.createTypedArray(p.CREATOR));
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeTypedArray(this.a, paramInt);
    paramParcel.writeIntArray(this.b);
    paramParcel.writeTypedArray(this.c, paramInt);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/b/am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */