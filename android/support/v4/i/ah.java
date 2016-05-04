package android.support.v4.i;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater.Factory;
import android.view.View;

class ah
  implements LayoutInflater.Factory
{
  final al a;
  
  ah(al paramal)
  {
    this.a = paramal;
  }
  
  public View onCreateView(String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    return this.a.a(null, paramString, paramContext, paramAttributeSet);
  }
  
  public String toString()
  {
    return getClass().getName() + "{" + this.a + "}";
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/i/ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */