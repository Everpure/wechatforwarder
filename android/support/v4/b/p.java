package android.support.v4.b;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

final class p
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new q();
  final int[] a;
  final int b;
  final int c;
  final String d;
  final int e;
  final int f;
  final CharSequence g;
  final int h;
  final CharSequence i;
  final ArrayList j;
  final ArrayList k;
  
  public p(Parcel paramParcel)
  {
    this.a = paramParcel.createIntArray();
    this.b = paramParcel.readInt();
    this.c = paramParcel.readInt();
    this.d = paramParcel.readString();
    this.e = paramParcel.readInt();
    this.f = paramParcel.readInt();
    this.g = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    this.h = paramParcel.readInt();
    this.i = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    this.j = paramParcel.createStringArrayList();
    this.k = paramParcel.createStringArrayList();
  }
  
  public p(j paramj)
  {
    n localn = paramj.c;
    int n;
    for (int m = 0; localn != null; m = n)
    {
      n = m;
      if (localn.i != null) {
        n = m + localn.i.size();
      }
      localn = localn.a;
    }
    this.a = new int[m + paramj.e * 7];
    if (!paramj.l) {
      throw new IllegalStateException("Not on back stack");
    }
    localn = paramj.c;
    m = 0;
    if (localn != null)
    {
      int[] arrayOfInt = this.a;
      n = m + 1;
      arrayOfInt[m] = localn.c;
      arrayOfInt = this.a;
      int i1 = n + 1;
      if (localn.d != null) {}
      for (m = localn.d.g;; m = -1)
      {
        arrayOfInt[n] = m;
        arrayOfInt = this.a;
        m = i1 + 1;
        arrayOfInt[i1] = localn.e;
        arrayOfInt = this.a;
        n = m + 1;
        arrayOfInt[m] = localn.f;
        arrayOfInt = this.a;
        m = n + 1;
        arrayOfInt[n] = localn.g;
        arrayOfInt = this.a;
        n = m + 1;
        arrayOfInt[m] = localn.h;
        if (localn.i == null) {
          break label314;
        }
        i1 = localn.i.size();
        arrayOfInt = this.a;
        m = n + 1;
        arrayOfInt[n] = i1;
        n = 0;
        while (n < i1)
        {
          this.a[m] = ((t)localn.i.get(n)).g;
          n += 1;
          m += 1;
        }
      }
      for (;;)
      {
        localn = localn.a;
        break;
        label314:
        arrayOfInt = this.a;
        m = n + 1;
        arrayOfInt[n] = 0;
      }
    }
    this.b = paramj.j;
    this.c = paramj.k;
    this.d = paramj.n;
    this.e = paramj.p;
    this.f = paramj.q;
    this.g = paramj.r;
    this.h = paramj.s;
    this.i = paramj.t;
    this.j = paramj.u;
    this.k = paramj.v;
  }
  
  public j a(af paramaf)
  {
    j localj = new j(paramaf);
    int i1 = 0;
    int m = 0;
    while (m < this.a.length)
    {
      n localn = new n();
      Object localObject = this.a;
      int n = m + 1;
      localn.c = localObject[m];
      if (af.a) {
        Log.v("FragmentManager", "Instantiate " + localj + " op #" + i1 + " base fragment #" + this.a[n]);
      }
      localObject = this.a;
      m = n + 1;
      n = localObject[n];
      if (n >= 0) {}
      for (localn.d = ((t)paramaf.f.get(n));; localn.d = null)
      {
        localObject = this.a;
        n = m + 1;
        localn.e = localObject[m];
        localObject = this.a;
        m = n + 1;
        localn.f = localObject[n];
        localObject = this.a;
        n = m + 1;
        localn.g = localObject[m];
        localObject = this.a;
        m = n + 1;
        localn.h = localObject[n];
        localObject = this.a;
        n = m + 1;
        int i3 = localObject[m];
        m = n;
        if (i3 <= 0) {
          break;
        }
        localn.i = new ArrayList(i3);
        int i2 = 0;
        for (;;)
        {
          m = n;
          if (i2 >= i3) {
            break;
          }
          if (af.a) {
            Log.v("FragmentManager", "Instantiate " + localj + " set remove fragment #" + this.a[n]);
          }
          localObject = (t)paramaf.f.get(this.a[n]);
          localn.i.add(localObject);
          i2 += 1;
          n += 1;
        }
      }
      localj.a(localn);
      i1 += 1;
    }
    localj.j = this.b;
    localj.k = this.c;
    localj.n = this.d;
    localj.p = this.e;
    localj.l = true;
    localj.q = this.f;
    localj.r = this.g;
    localj.s = this.h;
    localj.t = this.i;
    localj.u = this.j;
    localj.v = this.k;
    localj.a(1);
    return localj;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeIntArray(this.a);
    paramParcel.writeInt(this.b);
    paramParcel.writeInt(this.c);
    paramParcel.writeString(this.d);
    paramParcel.writeInt(this.e);
    paramParcel.writeInt(this.f);
    TextUtils.writeToParcel(this.g, paramParcel, 0);
    paramParcel.writeInt(this.h);
    TextUtils.writeToParcel(this.i, paramParcel, 0);
    paramParcel.writeStringList(this.j);
    paramParcel.writeStringList(this.k);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/b/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */