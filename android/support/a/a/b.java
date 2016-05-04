package android.support.a.a;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

@TargetApi(21)
public class b
  extends k
  implements Animatable
{
  private d b;
  private Context c;
  private ArgbEvaluator d = null;
  private final Drawable.Callback e = new c(this);
  
  private b()
  {
    this(null, null, null);
  }
  
  private b(Context paramContext)
  {
    this(paramContext, null, null);
  }
  
  private b(Context paramContext, d paramd, Resources paramResources)
  {
    this.c = paramContext;
    if (paramd != null)
    {
      this.b = paramd;
      return;
    }
    this.b = new d(paramContext, paramd, this.e, paramResources);
  }
  
  static TypedArray a(Resources paramResources, Resources.Theme paramTheme, AttributeSet paramAttributeSet, int[] paramArrayOfInt)
  {
    if (paramTheme == null) {
      return paramResources.obtainAttributes(paramAttributeSet, paramArrayOfInt);
    }
    return paramTheme.obtainStyledAttributes(paramAttributeSet, paramArrayOfInt, 0, 0);
  }
  
  public static b a(Context paramContext, Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    paramContext = new b(paramContext);
    paramContext.inflate(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
    return paramContext;
  }
  
  private void a(Animator paramAnimator)
  {
    Object localObject;
    if ((paramAnimator instanceof AnimatorSet))
    {
      localObject = ((AnimatorSet)paramAnimator).getChildAnimations();
      if (localObject != null)
      {
        int i = 0;
        while (i < ((List)localObject).size())
        {
          a((Animator)((List)localObject).get(i));
          i += 1;
        }
      }
    }
    if ((paramAnimator instanceof ObjectAnimator))
    {
      paramAnimator = (ObjectAnimator)paramAnimator;
      localObject = paramAnimator.getPropertyName();
      if (("fillColor".equals(localObject)) || ("strokeColor".equals(localObject)))
      {
        if (this.d == null) {
          this.d = new ArgbEvaluator();
        }
        paramAnimator.setEvaluator(this.d);
      }
    }
  }
  
  private void a(String paramString, Animator paramAnimator)
  {
    paramAnimator.setTarget(this.b.b.a(paramString));
    if (Build.VERSION.SDK_INT < 21) {
      a(paramAnimator);
    }
    if (this.b.c == null)
    {
      this.b.c = new ArrayList();
      this.b.d = new android.support.v4.h.a();
    }
    this.b.c.add(paramAnimator);
    this.b.d.put(paramAnimator, paramString);
  }
  
  private boolean a()
  {
    ArrayList localArrayList = this.b.c;
    if (localArrayList == null) {
      return false;
    }
    int j = localArrayList.size();
    int i = 0;
    while (i < j)
    {
      if (((Animator)localArrayList.get(i)).isRunning()) {
        return true;
      }
      i += 1;
    }
    return false;
  }
  
  public void applyTheme(Resources.Theme paramTheme)
  {
    if (this.a != null) {
      android.support.v4.d.a.a.a(this.a, paramTheme);
    }
  }
  
  public boolean canApplyTheme()
  {
    if (this.a != null) {
      return android.support.v4.d.a.a.d(this.a);
    }
    return false;
  }
  
  public void draw(Canvas paramCanvas)
  {
    if (this.a != null) {
      this.a.draw(paramCanvas);
    }
    do
    {
      return;
      this.b.b.draw(paramCanvas);
    } while (!a());
    invalidateSelf();
  }
  
  public int getAlpha()
  {
    if (this.a != null) {
      return android.support.v4.d.a.a.c(this.a);
    }
    return this.b.b.getAlpha();
  }
  
  public int getChangingConfigurations()
  {
    if (this.a != null) {
      return this.a.getChangingConfigurations();
    }
    return super.getChangingConfigurations() | this.b.a;
  }
  
  public Drawable.ConstantState getConstantState()
  {
    if (this.a != null) {
      return new e(this.a.getConstantState());
    }
    return null;
  }
  
  public int getIntrinsicHeight()
  {
    if (this.a != null) {
      return this.a.getIntrinsicHeight();
    }
    return this.b.b.getIntrinsicHeight();
  }
  
  public int getIntrinsicWidth()
  {
    if (this.a != null) {
      return this.a.getIntrinsicWidth();
    }
    return this.b.b.getIntrinsicWidth();
  }
  
  public int getOpacity()
  {
    if (this.a != null) {
      return this.a.getOpacity();
    }
    return this.b.b.getOpacity();
  }
  
  public void inflate(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet)
  {
    inflate(paramResources, paramXmlPullParser, paramAttributeSet, null);
  }
  
  public void inflate(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    if (this.a != null)
    {
      android.support.v4.d.a.a.a(this.a, paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
      return;
    }
    int i = paramXmlPullParser.getEventType();
    label28:
    Object localObject1;
    Object localObject2;
    if (i != 1) {
      if (i == 2)
      {
        localObject1 = paramXmlPullParser.getName();
        if (!"animated-vector".equals(localObject1)) {
          break label156;
        }
        localObject1 = a(paramResources, paramTheme, paramAttributeSet, a.e);
        i = ((TypedArray)localObject1).getResourceId(0, 0);
        if (i != 0)
        {
          localObject2 = l.a(paramResources, i, paramTheme);
          ((l)localObject2).a(false);
          ((l)localObject2).setCallback(this.e);
          if (this.b.b != null) {
            this.b.b.setCallback(null);
          }
          this.b.b = ((l)localObject2);
        }
        ((TypedArray)localObject1).recycle();
      }
    }
    for (;;)
    {
      i = paramXmlPullParser.next();
      break label28;
      break;
      label156:
      if ("target".equals(localObject1))
      {
        localObject1 = paramResources.obtainAttributes(paramAttributeSet, a.f);
        localObject2 = ((TypedArray)localObject1).getString(0);
        i = ((TypedArray)localObject1).getResourceId(1, 0);
        if (i != 0)
        {
          if (this.c == null) {
            break label229;
          }
          a((String)localObject2, AnimatorInflater.loadAnimator(this.c, i));
        }
        ((TypedArray)localObject1).recycle();
      }
    }
    label229:
    throw new IllegalStateException("Context can't be null when inflating animators");
  }
  
  public boolean isRunning()
  {
    if (this.a != null) {
      return ((AnimatedVectorDrawable)this.a).isRunning();
    }
    ArrayList localArrayList = this.b.c;
    int j = localArrayList.size();
    int i = 0;
    while (i < j)
    {
      if (((Animator)localArrayList.get(i)).isRunning()) {
        return true;
      }
      i += 1;
    }
    return false;
  }
  
  public boolean isStateful()
  {
    if (this.a != null) {
      return this.a.isStateful();
    }
    return this.b.b.isStateful();
  }
  
  public Drawable mutate()
  {
    if (this.a != null)
    {
      this.a.mutate();
      return this;
    }
    throw new IllegalStateException("Mutate() is not supported for older platform");
  }
  
  protected void onBoundsChange(Rect paramRect)
  {
    if (this.a != null)
    {
      this.a.setBounds(paramRect);
      return;
    }
    this.b.b.setBounds(paramRect);
  }
  
  protected boolean onLevelChange(int paramInt)
  {
    if (this.a != null) {
      return this.a.setLevel(paramInt);
    }
    return this.b.b.setLevel(paramInt);
  }
  
  protected boolean onStateChange(int[] paramArrayOfInt)
  {
    if (this.a != null) {
      return this.a.setState(paramArrayOfInt);
    }
    return this.b.b.setState(paramArrayOfInt);
  }
  
  public void setAlpha(int paramInt)
  {
    if (this.a != null)
    {
      this.a.setAlpha(paramInt);
      return;
    }
    this.b.b.setAlpha(paramInt);
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    if (this.a != null)
    {
      this.a.setColorFilter(paramColorFilter);
      return;
    }
    this.b.b.setColorFilter(paramColorFilter);
  }
  
  public void setTint(int paramInt)
  {
    if (this.a != null)
    {
      android.support.v4.d.a.a.a(this.a, paramInt);
      return;
    }
    this.b.b.setTint(paramInt);
  }
  
  public void setTintList(ColorStateList paramColorStateList)
  {
    if (this.a != null)
    {
      android.support.v4.d.a.a.a(this.a, paramColorStateList);
      return;
    }
    this.b.b.setTintList(paramColorStateList);
  }
  
  public void setTintMode(PorterDuff.Mode paramMode)
  {
    if (this.a != null)
    {
      android.support.v4.d.a.a.a(this.a, paramMode);
      return;
    }
    this.b.b.setTintMode(paramMode);
  }
  
  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.a != null) {
      return this.a.setVisible(paramBoolean1, paramBoolean2);
    }
    this.b.b.setVisible(paramBoolean1, paramBoolean2);
    return super.setVisible(paramBoolean1, paramBoolean2);
  }
  
  public void start()
  {
    if (this.a != null) {
      ((AnimatedVectorDrawable)this.a).start();
    }
    while (a()) {
      return;
    }
    ArrayList localArrayList = this.b.c;
    int j = localArrayList.size();
    int i = 0;
    while (i < j)
    {
      ((Animator)localArrayList.get(i)).start();
      i += 1;
    }
    invalidateSelf();
  }
  
  public void stop()
  {
    if (this.a != null) {
      ((AnimatedVectorDrawable)this.a).stop();
    }
    for (;;)
    {
      return;
      ArrayList localArrayList = this.b.c;
      int j = localArrayList.size();
      int i = 0;
      while (i < j)
      {
        ((Animator)localArrayList.get(i)).end();
        i += 1;
      }
    }
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/a/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */