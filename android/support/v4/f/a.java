package android.support.v4.f;

import android.os.AsyncTask;
import android.os.Build.VERSION;

public final class a
{
  public static AsyncTask a(AsyncTask paramAsyncTask, Object... paramVarArgs)
  {
    if (paramAsyncTask == null) {
      throw new IllegalArgumentException("task can not be null");
    }
    if (Build.VERSION.SDK_INT >= 11)
    {
      b.a(paramAsyncTask, paramVarArgs);
      return paramAsyncTask;
    }
    paramAsyncTask.execute(paramVarArgs);
    return paramAsyncTask;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/f/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */