package android.support.v4.i.a;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

class z
  implements af
{
  z(y paramy, w paramw) {}
  
  public Object a(int paramInt)
  {
    g localg = this.a.a(paramInt);
    if (localg == null) {
      return null;
    }
    return localg.a();
  }
  
  public List a(String paramString, int paramInt)
  {
    paramString = this.a.a(paramString, paramInt);
    ArrayList localArrayList = new ArrayList();
    int i = paramString.size();
    paramInt = 0;
    while (paramInt < i)
    {
      localArrayList.add(((g)paramString.get(paramInt)).a());
      paramInt += 1;
    }
    return localArrayList;
  }
  
  public boolean a(int paramInt1, int paramInt2, Bundle paramBundle)
  {
    return this.a.a(paramInt1, paramInt2, paramBundle);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/i/a/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */