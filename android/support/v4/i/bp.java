package android.support.v4.i;

import android.os.Build.VERSION;
import android.view.VelocityTracker;

public final class bp
{
  static final bs a = new bq();
  
  static
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      a = new br();
      return;
    }
  }
  
  public static float a(VelocityTracker paramVelocityTracker, int paramInt)
  {
    return a.a(paramVelocityTracker, paramInt);
  }
  
  public static float b(VelocityTracker paramVelocityTracker, int paramInt)
  {
    return a.b(paramVelocityTracker, paramInt);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/i/bp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */