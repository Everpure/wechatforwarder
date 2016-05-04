package android.support.v4.f;

import android.os.AsyncTask;

class b
{
  static void a(AsyncTask paramAsyncTask, Object... paramVarArgs)
  {
    paramAsyncTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, paramVarArgs);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/f/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */