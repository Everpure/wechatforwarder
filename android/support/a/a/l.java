package android.support.a.a;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@TargetApi(21)
public class l
  extends k
{
  static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
  private s c;
  private PorterDuffColorFilter d;
  private ColorFilter e;
  private boolean f;
  private boolean g = true;
  private Drawable.ConstantState h;
  private final float[] i = new float[9];
  private final Matrix j = new Matrix();
  private final Rect k = new Rect();
  
  private l()
  {
    this.c = new s();
  }
  
  private l(s params)
  {
    this.c = params;
    this.d = a(this.d, params.c, params.d);
  }
  
  private static PorterDuff.Mode a(int paramInt, PorterDuff.Mode paramMode)
  {
    switch (paramInt)
    {
    case 4: 
    case 6: 
    case 7: 
    case 8: 
    case 10: 
    case 11: 
    case 12: 
    case 13: 
    default: 
      return paramMode;
    case 3: 
      return PorterDuff.Mode.SRC_OVER;
    case 5: 
      return PorterDuff.Mode.SRC_IN;
    case 9: 
      return PorterDuff.Mode.SRC_ATOP;
    case 14: 
      return PorterDuff.Mode.MULTIPLY;
    case 15: 
      return PorterDuff.Mode.SCREEN;
    }
    return PorterDuff.Mode.ADD;
  }
  
  public static l a(Resources paramResources, int paramInt, Resources.Theme paramTheme)
  {
    Object localObject;
    if (Build.VERSION.SDK_INT >= 21)
    {
      localObject = new l();
      ((l)localObject).a = android.support.v4.c.a.a.a(paramResources, paramInt, paramTheme);
      ((l)localObject).h = new t(((l)localObject).a.getConstantState());
      return (l)localObject;
    }
    try
    {
      localObject = paramResources.getXml(paramInt);
      localAttributeSet = Xml.asAttributeSet((XmlPullParser)localObject);
      do
      {
        paramInt = ((XmlPullParser)localObject).next();
      } while ((paramInt != 2) && (paramInt != 1));
      if (paramInt != 2) {
        throw new XmlPullParserException("No start tag found");
      }
    }
    catch (XmlPullParserException paramResources)
    {
      AttributeSet localAttributeSet;
      Log.e("VectorDrawableCompat", "parser error", paramResources);
      return null;
      paramResources = a(paramResources, (XmlPullParser)localObject, localAttributeSet, paramTheme);
      return paramResources;
    }
    catch (IOException paramResources)
    {
      for (;;)
      {
        Log.e("VectorDrawableCompat", "parser error", paramResources);
      }
    }
  }
  
  public static l a(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    l locall = new l();
    locall.inflate(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
    return locall;
  }
  
  private void a(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser)
  {
    s locals = this.c;
    r localr = locals.b;
    locals.d = a(j.a(paramTypedArray, paramXmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
    ColorStateList localColorStateList = paramTypedArray.getColorStateList(1);
    if (localColorStateList != null) {
      locals.c = localColorStateList;
    }
    locals.e = j.a(paramTypedArray, paramXmlPullParser, "autoMirrored", 5, locals.e);
    localr.c = j.a(paramTypedArray, paramXmlPullParser, "viewportWidth", 7, localr.c);
    localr.d = j.a(paramTypedArray, paramXmlPullParser, "viewportHeight", 8, localr.d);
    if (localr.c <= 0.0F) {
      throw new XmlPullParserException(paramTypedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
    }
    if (localr.d <= 0.0F) {
      throw new XmlPullParserException(paramTypedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }
    localr.a = paramTypedArray.getDimension(3, localr.a);
    localr.b = paramTypedArray.getDimension(2, localr.b);
    if (localr.a <= 0.0F) {
      throw new XmlPullParserException(paramTypedArray.getPositionDescription() + "<vector> tag requires width > 0");
    }
    if (localr.b <= 0.0F) {
      throw new XmlPullParserException(paramTypedArray.getPositionDescription() + "<vector> tag requires height > 0");
    }
    localr.a(j.a(paramTypedArray, paramXmlPullParser, "alpha", 4, localr.b()));
    paramTypedArray = paramTypedArray.getString(0);
    if (paramTypedArray != null)
    {
      localr.f = paramTypedArray;
      localr.g.put(paramTypedArray, localr);
    }
  }
  
  private boolean a()
  {
    return false;
  }
  
  private static int b(int paramInt, float paramFloat)
  {
    return (int)(Color.alpha(paramInt) * paramFloat) << 24 | 0xFFFFFF & paramInt;
  }
  
  private void b(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    s locals = this.c;
    r localr = locals.b;
    Stack localStack = new Stack();
    localStack.push(r.a(localr));
    int i1 = paramXmlPullParser.getEventType();
    int m = 1;
    if (i1 != 1)
    {
      Object localObject;
      p localp;
      int n;
      if (i1 == 2)
      {
        localObject = paramXmlPullParser.getName();
        localp = (p)localStack.peek();
        if ("path".equals(localObject))
        {
          localObject = new o();
          ((o)localObject).a(paramResources, paramAttributeSet, paramTheme, paramXmlPullParser);
          localp.a.add(localObject);
          if (((o)localObject).b() != null) {
            localr.g.put(((o)localObject).b(), localObject);
          }
          m = 0;
          n = locals.a;
          locals.a = (((o)localObject).o | n);
          label162:
          n = m;
        }
      }
      for (;;)
      {
        i1 = paramXmlPullParser.next();
        m = n;
        break;
        if ("clip-path".equals(localObject))
        {
          localObject = new n();
          ((n)localObject).a(paramResources, paramAttributeSet, paramTheme, paramXmlPullParser);
          localp.a.add(localObject);
          if (((n)localObject).b() != null) {
            localr.g.put(((n)localObject).b(), localObject);
          }
          locals.a |= ((n)localObject).o;
          break label162;
        }
        if ("group".equals(localObject))
        {
          localObject = new p();
          ((p)localObject).a(paramResources, paramAttributeSet, paramTheme, paramXmlPullParser);
          localp.a.add(localObject);
          localStack.push(localObject);
          if (((p)localObject).a() != null) {
            localr.g.put(((p)localObject).a(), localObject);
          }
          locals.a |= p.a((p)localObject);
        }
        break label162;
        n = m;
        if (i1 == 3)
        {
          n = m;
          if ("group".equals(paramXmlPullParser.getName()))
          {
            localStack.pop();
            n = m;
          }
        }
      }
    }
    if (m != 0)
    {
      paramResources = new StringBuffer();
      if (paramResources.length() > 0) {
        paramResources.append(" or ");
      }
      paramResources.append("path");
      throw new XmlPullParserException("no " + paramResources + " defined");
    }
  }
  
  PorterDuffColorFilter a(PorterDuffColorFilter paramPorterDuffColorFilter, ColorStateList paramColorStateList, PorterDuff.Mode paramMode)
  {
    if ((paramColorStateList == null) || (paramMode == null)) {
      return null;
    }
    return new PorterDuffColorFilter(paramColorStateList.getColorForState(getState(), 0), paramMode);
  }
  
  Object a(String paramString)
  {
    return this.c.b.g.get(paramString);
  }
  
  void a(boolean paramBoolean)
  {
    this.g = paramBoolean;
  }
  
  public boolean canApplyTheme()
  {
    if (this.a != null) {
      android.support.v4.d.a.a.d(this.a);
    }
    return false;
  }
  
  public void draw(Canvas paramCanvas)
  {
    if (this.a != null) {
      this.a.draw(paramCanvas);
    }
    Object localObject;
    int m;
    int n;
    do
    {
      do
      {
        return;
        copyBounds(this.k);
      } while ((this.k.width() <= 0) || (this.k.height() <= 0));
      if (this.e != null) {
        break;
      }
      localObject = this.d;
      paramCanvas.getMatrix(this.j);
      this.j.getValues(this.i);
      float f2 = Math.abs(this.i[0]);
      float f1 = Math.abs(this.i[4]);
      float f4 = Math.abs(this.i[1]);
      float f3 = Math.abs(this.i[3]);
      if ((f4 != 0.0F) || (f3 != 0.0F))
      {
        f1 = 1.0F;
        f2 = 1.0F;
      }
      m = (int)(f2 * this.k.width());
      n = (int)(f1 * this.k.height());
      m = Math.min(2048, m);
      n = Math.min(2048, n);
    } while ((m <= 0) || (n <= 0));
    int i1 = paramCanvas.save();
    paramCanvas.translate(this.k.left, this.k.top);
    if (a())
    {
      paramCanvas.translate(this.k.width(), 0.0F);
      paramCanvas.scale(-1.0F, 1.0F);
    }
    this.k.offsetTo(0, 0);
    this.c.b(m, n);
    if (!this.g) {
      this.c.a(m, n);
    }
    for (;;)
    {
      this.c.a(paramCanvas, (ColorFilter)localObject, this.k);
      paramCanvas.restoreToCount(i1);
      return;
      localObject = this.e;
      break;
      if (!this.c.b())
      {
        this.c.a(m, n);
        this.c.c();
      }
    }
  }
  
  public int getAlpha()
  {
    if (this.a != null) {
      return android.support.v4.d.a.a.c(this.a);
    }
    return this.c.b.a();
  }
  
  public int getChangingConfigurations()
  {
    if (this.a != null) {
      return this.a.getChangingConfigurations();
    }
    return super.getChangingConfigurations() | this.c.getChangingConfigurations();
  }
  
  public Drawable.ConstantState getConstantState()
  {
    if (this.a != null) {
      return new t(this.a.getConstantState());
    }
    this.c.a = getChangingConfigurations();
    return this.c;
  }
  
  public int getIntrinsicHeight()
  {
    if (this.a != null) {
      return this.a.getIntrinsicHeight();
    }
    return (int)this.c.b.b;
  }
  
  public int getIntrinsicWidth()
  {
    if (this.a != null) {
      return this.a.getIntrinsicWidth();
    }
    return (int)this.c.b.a;
  }
  
  public int getOpacity()
  {
    if (this.a != null) {
      return this.a.getOpacity();
    }
    return -3;
  }
  
  public void inflate(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet)
  {
    if (this.a != null)
    {
      this.a.inflate(paramResources, paramXmlPullParser, paramAttributeSet);
      return;
    }
    inflate(paramResources, paramXmlPullParser, paramAttributeSet, null);
  }
  
  public void inflate(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    if (this.a != null)
    {
      android.support.v4.d.a.a.a(this.a, paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
      return;
    }
    s locals = this.c;
    locals.b = new r();
    TypedArray localTypedArray = b(paramResources, paramTheme, paramAttributeSet, a.a);
    a(localTypedArray, paramXmlPullParser);
    localTypedArray.recycle();
    locals.a = getChangingConfigurations();
    locals.k = true;
    b(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
    this.d = a(this.d, locals.c, locals.d);
  }
  
  public void invalidateSelf()
  {
    if (this.a != null)
    {
      this.a.invalidateSelf();
      return;
    }
    super.invalidateSelf();
  }
  
  public boolean isStateful()
  {
    if (this.a != null) {
      return this.a.isStateful();
    }
    return (super.isStateful()) || ((this.c != null) && (this.c.c != null) && (this.c.c.isStateful()));
  }
  
  public Drawable mutate()
  {
    if (this.a != null) {
      this.a.mutate();
    }
    while ((this.f) || (super.mutate() != this)) {
      return this;
    }
    this.c = new s(this.c);
    this.f = true;
    return this;
  }
  
  protected boolean onStateChange(int[] paramArrayOfInt)
  {
    if (this.a != null) {
      return this.a.setState(paramArrayOfInt);
    }
    paramArrayOfInt = this.c;
    if ((paramArrayOfInt.c != null) && (paramArrayOfInt.d != null))
    {
      this.d = a(this.d, paramArrayOfInt.c, paramArrayOfInt.d);
      invalidateSelf();
      return true;
    }
    return false;
  }
  
  public void scheduleSelf(Runnable paramRunnable, long paramLong)
  {
    if (this.a != null)
    {
      this.a.scheduleSelf(paramRunnable, paramLong);
      return;
    }
    super.scheduleSelf(paramRunnable, paramLong);
  }
  
  public void setAlpha(int paramInt)
  {
    if (this.a != null) {
      this.a.setAlpha(paramInt);
    }
    while (this.c.b.a() == paramInt) {
      return;
    }
    this.c.b.a(paramInt);
    invalidateSelf();
  }
  
  public void setBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (this.a != null)
    {
      this.a.setBounds(paramInt1, paramInt2, paramInt3, paramInt4);
      return;
    }
    super.setBounds(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void setBounds(Rect paramRect)
  {
    if (this.a != null)
    {
      this.a.setBounds(paramRect);
      return;
    }
    super.setBounds(paramRect);
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    if (this.a != null)
    {
      this.a.setColorFilter(paramColorFilter);
      return;
    }
    this.e = paramColorFilter;
    invalidateSelf();
  }
  
  public void setTint(int paramInt)
  {
    if (this.a != null)
    {
      android.support.v4.d.a.a.a(this.a, paramInt);
      return;
    }
    setTintList(ColorStateList.valueOf(paramInt));
  }
  
  public void setTintList(ColorStateList paramColorStateList)
  {
    if (this.a != null) {
      android.support.v4.d.a.a.a(this.a, paramColorStateList);
    }
    s locals;
    do
    {
      return;
      locals = this.c;
    } while (locals.c == paramColorStateList);
    locals.c = paramColorStateList;
    this.d = a(this.d, paramColorStateList, locals.d);
    invalidateSelf();
  }
  
  public void setTintMode(PorterDuff.Mode paramMode)
  {
    if (this.a != null) {
      android.support.v4.d.a.a.a(this.a, paramMode);
    }
    s locals;
    do
    {
      return;
      locals = this.c;
    } while (locals.d == paramMode);
    locals.d = paramMode;
    this.d = a(this.d, locals.c, paramMode);
    invalidateSelf();
  }
  
  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.a != null) {
      return this.a.setVisible(paramBoolean1, paramBoolean2);
    }
    return super.setVisible(paramBoolean1, paramBoolean2);
  }
  
  public void unscheduleSelf(Runnable paramRunnable)
  {
    if (this.a != null)
    {
      this.a.unscheduleSelf(paramRunnable);
      return;
    }
    super.unscheduleSelf(paramRunnable);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/a/a/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */