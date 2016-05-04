package android.support.v4.i;

import android.view.LayoutInflater;

class ag
{
  static al a(LayoutInflater paramLayoutInflater)
  {
    paramLayoutInflater = paramLayoutInflater.getFactory();
    if ((paramLayoutInflater instanceof ah)) {
      return ((ah)paramLayoutInflater).a;
    }
    return null;
  }
  
  static void a(LayoutInflater paramLayoutInflater, al paramal)
  {
    if (paramal != null) {}
    for (paramal = new ah(paramal);; paramal = null)
    {
      paramLayoutInflater.setFactory(paramal);
      return;
    }
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/i/ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */