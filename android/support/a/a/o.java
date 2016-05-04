package android.support.a.a;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

class o
  extends q
{
  int a = 0;
  float b = 0.0F;
  int c = 0;
  float d = 1.0F;
  int e;
  float f = 1.0F;
  float g = 0.0F;
  float h = 1.0F;
  float i = 0.0F;
  Paint.Cap j = Paint.Cap.BUTT;
  Paint.Join k = Paint.Join.MITER;
  float l = 4.0F;
  private int[] p;
  
  public o() {}
  
  public o(o paramo)
  {
    super(paramo);
    this.p = paramo.p;
    this.a = paramo.a;
    this.b = paramo.b;
    this.d = paramo.d;
    this.c = paramo.c;
    this.e = paramo.e;
    this.f = paramo.f;
    this.g = paramo.g;
    this.h = paramo.h;
    this.i = paramo.i;
    this.j = paramo.j;
    this.k = paramo.k;
    this.l = paramo.l;
  }
  
  private Paint.Cap a(int paramInt, Paint.Cap paramCap)
  {
    switch (paramInt)
    {
    default: 
      return paramCap;
    case 0: 
      return Paint.Cap.BUTT;
    case 1: 
      return Paint.Cap.ROUND;
    }
    return Paint.Cap.SQUARE;
  }
  
  private Paint.Join a(int paramInt, Paint.Join paramJoin)
  {
    switch (paramInt)
    {
    default: 
      return paramJoin;
    case 0: 
      return Paint.Join.MITER;
    case 1: 
      return Paint.Join.ROUND;
    }
    return Paint.Join.BEVEL;
  }
  
  private void a(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser)
  {
    this.p = null;
    if (!j.a(paramXmlPullParser, "pathData")) {
      return;
    }
    String str = paramTypedArray.getString(0);
    if (str != null) {
      this.n = str;
    }
    str = paramTypedArray.getString(2);
    if (str != null) {
      this.m = f.a(str);
    }
    this.c = j.b(paramTypedArray, paramXmlPullParser, "fillColor", 1, this.c);
    this.f = j.a(paramTypedArray, paramXmlPullParser, "fillAlpha", 12, this.f);
    this.j = a(j.a(paramTypedArray, paramXmlPullParser, "strokeLineCap", 8, -1), this.j);
    this.k = a(j.a(paramTypedArray, paramXmlPullParser, "strokeLineJoin", 9, -1), this.k);
    this.l = j.a(paramTypedArray, paramXmlPullParser, "strokeMiterLimit", 10, this.l);
    this.a = j.b(paramTypedArray, paramXmlPullParser, "strokeColor", 3, this.a);
    this.d = j.a(paramTypedArray, paramXmlPullParser, "strokeAlpha", 11, this.d);
    this.b = j.a(paramTypedArray, paramXmlPullParser, "strokeWidth", 4, this.b);
    this.h = j.a(paramTypedArray, paramXmlPullParser, "trimPathEnd", 6, this.h);
    this.i = j.a(paramTypedArray, paramXmlPullParser, "trimPathOffset", 7, this.i);
    this.g = j.a(paramTypedArray, paramXmlPullParser, "trimPathStart", 5, this.g);
  }
  
  public void a(Resources paramResources, AttributeSet paramAttributeSet, Resources.Theme paramTheme, XmlPullParser paramXmlPullParser)
  {
    paramResources = k.b(paramResources, paramTheme, paramAttributeSet, a.c);
    a(paramResources, paramXmlPullParser);
    paramResources.recycle();
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/a/a/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */