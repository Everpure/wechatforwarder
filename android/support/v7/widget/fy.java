package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;

class fy
  extends View.BaseSavedState
{
  public static final Parcelable.Creator CREATOR = new fz();
  boolean a;
  
  public fy(Parcel paramParcel)
  {
    super(paramParcel);
    this.a = ((Boolean)paramParcel.readValue(null)).booleanValue();
  }
  
  fy(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }
  
  public String toString()
  {
    return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.a + "}";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeValue(Boolean.valueOf(this.a));
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/fy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */