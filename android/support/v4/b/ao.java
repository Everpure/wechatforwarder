package android.support.v4.b;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Log;

final class ao
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new ap();
  final String a;
  final int b;
  final boolean c;
  final int d;
  final int e;
  final String f;
  final boolean g;
  final boolean h;
  final Bundle i;
  Bundle j;
  t k;
  
  public ao(Parcel paramParcel)
  {
    this.a = paramParcel.readString();
    this.b = paramParcel.readInt();
    if (paramParcel.readInt() != 0)
    {
      bool1 = true;
      this.c = bool1;
      this.d = paramParcel.readInt();
      this.e = paramParcel.readInt();
      this.f = paramParcel.readString();
      if (paramParcel.readInt() == 0) {
        break label110;
      }
      bool1 = true;
      label69:
      this.g = bool1;
      if (paramParcel.readInt() == 0) {
        break label115;
      }
    }
    label110:
    label115:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      this.h = bool1;
      this.i = paramParcel.readBundle();
      this.j = paramParcel.readBundle();
      return;
      bool1 = false;
      break;
      bool1 = false;
      break label69;
    }
  }
  
  public ao(t paramt)
  {
    this.a = paramt.getClass().getName();
    this.b = paramt.g;
    this.c = paramt.o;
    this.d = paramt.w;
    this.e = paramt.x;
    this.f = paramt.y;
    this.g = paramt.B;
    this.h = paramt.A;
    this.i = paramt.i;
  }
  
  public t a(ac paramac, t paramt)
  {
    if (this.k != null) {
      return this.k;
    }
    Context localContext = paramac.g();
    if (this.i != null) {
      this.i.setClassLoader(localContext.getClassLoader());
    }
    this.k = t.a(localContext, this.a, this.i);
    if (this.j != null)
    {
      this.j.setClassLoader(localContext.getClassLoader());
      this.k.e = this.j;
    }
    this.k.a(this.b, paramt);
    this.k.o = this.c;
    this.k.q = true;
    this.k.w = this.d;
    this.k.x = this.e;
    this.k.y = this.f;
    this.k.B = this.g;
    this.k.A = this.h;
    this.k.s = paramac.d;
    if (af.a) {
      Log.v("FragmentManager", "Instantiated fragment " + this.k);
    }
    return this.k;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int m = 1;
    paramParcel.writeString(this.a);
    paramParcel.writeInt(this.b);
    if (this.c)
    {
      paramInt = 1;
      paramParcel.writeInt(paramInt);
      paramParcel.writeInt(this.d);
      paramParcel.writeInt(this.e);
      paramParcel.writeString(this.f);
      if (!this.g) {
        break label106;
      }
      paramInt = 1;
      label65:
      paramParcel.writeInt(paramInt);
      if (!this.h) {
        break label111;
      }
    }
    label106:
    label111:
    for (paramInt = m;; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      paramParcel.writeBundle(this.i);
      paramParcel.writeBundle(this.j);
      return;
      paramInt = 0;
      break;
      paramInt = 0;
      break label65;
    }
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/b/ao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */