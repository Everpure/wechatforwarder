package android.support.v7.widget;

import android.content.pm.ResolveInfo;
import java.math.BigDecimal;

public final class ab
  implements Comparable
{
  public final ResolveInfo a;
  public float b;
  
  public ab(z paramz, ResolveInfo paramResolveInfo)
  {
    this.a = paramResolveInfo;
  }
  
  public int a(ab paramab)
  {
    return Float.floatToIntBits(paramab.b) - Float.floatToIntBits(this.b);
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (paramObject == null) {
        return false;
      }
      if (getClass() != paramObject.getClass()) {
        return false;
      }
      paramObject = (ab)paramObject;
    } while (Float.floatToIntBits(this.b) == Float.floatToIntBits(((ab)paramObject).b));
    return false;
  }
  
  public int hashCode()
  {
    return Float.floatToIntBits(this.b) + 31;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("[");
    localStringBuilder.append("resolveInfo:").append(this.a.toString());
    localStringBuilder.append("; weight:").append(new BigDecimal(this.b));
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */