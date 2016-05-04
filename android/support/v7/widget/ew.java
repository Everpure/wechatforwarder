package android.support.v7.widget;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;

public class ew
{
  private SparseArray a = new SparseArray();
  private SparseIntArray b = new SparseIntArray();
  private int c = 0;
  
  private ArrayList b(int paramInt)
  {
    ArrayList localArrayList2 = (ArrayList)this.a.get(paramInt);
    ArrayList localArrayList1 = localArrayList2;
    if (localArrayList2 == null)
    {
      localArrayList2 = new ArrayList();
      this.a.put(paramInt, localArrayList2);
      localArrayList1 = localArrayList2;
      if (this.b.indexOfKey(paramInt) < 0)
      {
        this.b.put(paramInt, 5);
        localArrayList1 = localArrayList2;
      }
    }
    return localArrayList1;
  }
  
  public fh a(int paramInt)
  {
    ArrayList localArrayList = (ArrayList)this.a.get(paramInt);
    if ((localArrayList != null) && (!localArrayList.isEmpty()))
    {
      paramInt = localArrayList.size() - 1;
      fh localfh = (fh)localArrayList.get(paramInt);
      localArrayList.remove(paramInt);
      return localfh;
    }
    return null;
  }
  
  public void a()
  {
    this.a.clear();
  }
  
  void a(eg parameg)
  {
    this.c += 1;
  }
  
  void a(eg parameg1, eg parameg2, boolean paramBoolean)
  {
    if (parameg1 != null) {
      b();
    }
    if ((!paramBoolean) && (this.c == 0)) {
      a();
    }
    if (parameg2 != null) {
      a(parameg2);
    }
  }
  
  public void a(fh paramfh)
  {
    int i = paramfh.h();
    ArrayList localArrayList = b(i);
    if (this.b.get(i) <= localArrayList.size()) {
      return;
    }
    paramfh.v();
    localArrayList.add(paramfh);
  }
  
  void b()
  {
    this.c -= 1;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/ew.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */