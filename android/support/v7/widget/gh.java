package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.List;

public class gh
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new gi();
  int a;
  int b;
  int c;
  int[] d;
  int e;
  int[] f;
  List g;
  boolean h;
  boolean i;
  boolean j;
  
  public gh() {}
  
  gh(Parcel paramParcel)
  {
    this.a = paramParcel.readInt();
    this.b = paramParcel.readInt();
    this.c = paramParcel.readInt();
    if (this.c > 0)
    {
      this.d = new int[this.c];
      paramParcel.readIntArray(this.d);
    }
    this.e = paramParcel.readInt();
    if (this.e > 0)
    {
      this.f = new int[this.e];
      paramParcel.readIntArray(this.f);
    }
    if (paramParcel.readInt() == 1)
    {
      bool1 = true;
      this.h = bool1;
      if (paramParcel.readInt() != 1) {
        break label152;
      }
      bool1 = true;
      label113:
      this.i = bool1;
      if (paramParcel.readInt() != 1) {
        break label157;
      }
    }
    label152:
    label157:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      this.j = bool1;
      this.g = paramParcel.readArrayList(gf.class.getClassLoader());
      return;
      bool1 = false;
      break;
      bool1 = false;
      break label113;
    }
  }
  
  public gh(gh paramgh)
  {
    this.c = paramgh.c;
    this.a = paramgh.a;
    this.b = paramgh.b;
    this.d = paramgh.d;
    this.e = paramgh.e;
    this.f = paramgh.f;
    this.h = paramgh.h;
    this.i = paramgh.i;
    this.j = paramgh.j;
    this.g = paramgh.g;
  }
  
  void a()
  {
    this.d = null;
    this.c = 0;
    this.e = 0;
    this.f = null;
    this.g = null;
  }
  
  void b()
  {
    this.d = null;
    this.c = 0;
    this.a = -1;
    this.b = -1;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int k = 1;
    paramParcel.writeInt(this.a);
    paramParcel.writeInt(this.b);
    paramParcel.writeInt(this.c);
    if (this.c > 0) {
      paramParcel.writeIntArray(this.d);
    }
    paramParcel.writeInt(this.e);
    if (this.e > 0) {
      paramParcel.writeIntArray(this.f);
    }
    if (this.h)
    {
      paramInt = 1;
      paramParcel.writeInt(paramInt);
      if (!this.i) {
        break label120;
      }
      paramInt = 1;
      label87:
      paramParcel.writeInt(paramInt);
      if (!this.j) {
        break label125;
      }
    }
    label120:
    label125:
    for (paramInt = k;; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      paramParcel.writeList(this.g);
      return;
      paramInt = 0;
      break;
      paramInt = 0;
      break label87;
    }
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/gh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */