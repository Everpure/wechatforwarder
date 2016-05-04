package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;

class gf
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new gg();
  int a;
  int b;
  int[] c;
  boolean d;
  
  public gf() {}
  
  public gf(Parcel paramParcel)
  {
    this.a = paramParcel.readInt();
    this.b = paramParcel.readInt();
    if (paramParcel.readInt() == 1) {}
    for (;;)
    {
      this.d = bool;
      int i = paramParcel.readInt();
      if (i > 0)
      {
        this.c = new int[i];
        paramParcel.readIntArray(this.c);
      }
      return;
      bool = false;
    }
  }
  
  int a(int paramInt)
  {
    if (this.c == null) {
      return 0;
    }
    return this.c[paramInt];
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    return "FullSpanItem{mPosition=" + this.a + ", mGapDir=" + this.b + ", mHasUnwantedGapAfter=" + this.d + ", mGapPerSpan=" + Arrays.toString(this.c) + '}';
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.a);
    paramParcel.writeInt(this.b);
    if (this.d) {}
    for (paramInt = 1;; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      if ((this.c == null) || (this.c.length <= 0)) {
        break;
      }
      paramParcel.writeInt(this.c.length);
      paramParcel.writeIntArray(this.c);
      return;
    }
    paramParcel.writeInt(0);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/gf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */