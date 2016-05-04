package android.support.a.a;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

class p
{
  final ArrayList a = new ArrayList();
  private final Matrix b = new Matrix();
  private float c = 0.0F;
  private float d = 0.0F;
  private float e = 0.0F;
  private float f = 1.0F;
  private float g = 1.0F;
  private float h = 0.0F;
  private float i = 0.0F;
  private final Matrix j = new Matrix();
  private int k;
  private int[] l;
  private String m = null;
  
  public p() {}
  
  public p(p paramp, android.support.v4.h.a parama)
  {
    this.c = paramp.c;
    this.d = paramp.d;
    this.e = paramp.e;
    this.f = paramp.f;
    this.g = paramp.g;
    this.h = paramp.h;
    this.i = paramp.i;
    this.l = paramp.l;
    this.m = paramp.m;
    this.k = paramp.k;
    if (this.m != null) {
      parama.put(this.m, this);
    }
    this.j.set(paramp.j);
    ArrayList localArrayList = paramp.a;
    int n = 0;
    while (n < localArrayList.size())
    {
      paramp = localArrayList.get(n);
      if ((paramp instanceof p))
      {
        paramp = (p)paramp;
        this.a.add(new p(paramp, parama));
        n += 1;
      }
      else
      {
        if ((paramp instanceof o)) {}
        for (paramp = new o((o)paramp);; paramp = new n((n)paramp))
        {
          this.a.add(paramp);
          if (paramp.n == null) {
            break;
          }
          parama.put(paramp.n, paramp);
          break;
          if (!(paramp instanceof n)) {
            break label315;
          }
        }
        label315:
        throw new IllegalStateException("Unknown object in the tree!");
      }
    }
  }
  
  private void a(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser)
  {
    this.l = null;
    this.c = j.a(paramTypedArray, paramXmlPullParser, "rotation", 5, this.c);
    this.d = paramTypedArray.getFloat(1, this.d);
    this.e = paramTypedArray.getFloat(2, this.e);
    this.f = j.a(paramTypedArray, paramXmlPullParser, "scaleX", 3, this.f);
    this.g = j.a(paramTypedArray, paramXmlPullParser, "scaleY", 4, this.g);
    this.h = j.a(paramTypedArray, paramXmlPullParser, "translateX", 6, this.h);
    this.i = j.a(paramTypedArray, paramXmlPullParser, "translateY", 7, this.i);
    paramTypedArray = paramTypedArray.getString(0);
    if (paramTypedArray != null) {
      this.m = paramTypedArray;
    }
    b();
  }
  
  private void b()
  {
    this.j.reset();
    this.j.postTranslate(-this.d, -this.e);
    this.j.postScale(this.f, this.g);
    this.j.postRotate(this.c, 0.0F, 0.0F);
    this.j.postTranslate(this.h + this.d, this.i + this.e);
  }
  
  public String a()
  {
    return this.m;
  }
  
  public void a(Resources paramResources, AttributeSet paramAttributeSet, Resources.Theme paramTheme, XmlPullParser paramXmlPullParser)
  {
    paramResources = k.b(paramResources, paramTheme, paramAttributeSet, a.b);
    a(paramResources, paramXmlPullParser);
    paramResources.recycle();
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/a/a/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */