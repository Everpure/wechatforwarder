package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class de
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new df();
  int a;
  int b;
  boolean c;
  
  public de() {}
  
  de(Parcel paramParcel)
  {
    this.a = paramParcel.readInt();
    this.b = paramParcel.readInt();
    if (paramParcel.readInt() == 1) {}
    for (;;)
    {
      this.c = bool;
      return;
      bool = false;
    }
  }
  
  public de(de paramde)
  {
    this.a = paramde.a;
    this.b = paramde.b;
    this.c = paramde.c;
  }
  
  boolean a()
  {
    return this.a >= 0;
  }
  
  void b()
  {
    this.a = -1;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.a);
    paramParcel.writeInt(this.b);
    if (this.c) {}
    for (paramInt = 1;; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      return;
    }
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/de.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */