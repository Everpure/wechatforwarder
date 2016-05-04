package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;

public class fa
  extends View.BaseSavedState
{
  public static final Parcelable.Creator CREATOR = new fb();
  Parcelable a;
  
  fa(Parcel paramParcel)
  {
    super(paramParcel);
    this.a = paramParcel.readParcelable(eq.class.getClassLoader());
  }
  
  fa(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }
  
  private void a(fa paramfa)
  {
    this.a = paramfa.a;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeParcelable(this.a, 0);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/fa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */