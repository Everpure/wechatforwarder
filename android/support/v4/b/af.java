package android.support.v4.b;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.h.d;
import android.support.v4.h.e;
import android.support.v4.i.bu;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class af
  extends ad
  implements android.support.v4.i.al
{
  static final Interpolator A = new DecelerateInterpolator(2.5F);
  static final Interpolator B = new DecelerateInterpolator(1.5F);
  static final Interpolator C = new AccelerateInterpolator(2.5F);
  static final Interpolator D = new AccelerateInterpolator(1.5F);
  static boolean a;
  static final boolean b;
  static Field r;
  ArrayList c;
  Runnable[] d;
  boolean e;
  ArrayList f;
  ArrayList g;
  ArrayList h;
  ArrayList i;
  ArrayList j;
  ArrayList k;
  ArrayList l;
  ArrayList m;
  int n = 0;
  ac o;
  aa p;
  t q;
  boolean s;
  boolean t;
  boolean u;
  String v;
  boolean w;
  Bundle x = null;
  SparseArray y = null;
  Runnable z = new ag(this);
  
  static
  {
    boolean bool = false;
    a = false;
    if (Build.VERSION.SDK_INT >= 11) {
      bool = true;
    }
    b = bool;
    r = null;
  }
  
  static Animation a(Context paramContext, float paramFloat1, float paramFloat2)
  {
    paramContext = new AlphaAnimation(paramFloat1, paramFloat2);
    paramContext.setInterpolator(B);
    paramContext.setDuration(220L);
    return paramContext;
  }
  
  static Animation a(Context paramContext, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    paramContext = new AnimationSet(false);
    Object localObject = new ScaleAnimation(paramFloat1, paramFloat2, paramFloat1, paramFloat2, 1, 0.5F, 1, 0.5F);
    ((ScaleAnimation)localObject).setInterpolator(A);
    ((ScaleAnimation)localObject).setDuration(220L);
    paramContext.addAnimation((Animation)localObject);
    localObject = new AlphaAnimation(paramFloat3, paramFloat4);
    ((AlphaAnimation)localObject).setInterpolator(B);
    ((AlphaAnimation)localObject).setDuration(220L);
    paramContext.addAnimation((Animation)localObject);
    return paramContext;
  }
  
  private void a(RuntimeException paramRuntimeException)
  {
    Log.e("FragmentManager", paramRuntimeException.getMessage());
    Log.e("FragmentManager", "Activity state:");
    PrintWriter localPrintWriter = new PrintWriter(new e("FragmentManager"));
    if (this.o != null) {}
    for (;;)
    {
      try
      {
        this.o.a("  ", null, localPrintWriter, new String[0]);
        throw paramRuntimeException;
      }
      catch (Exception localException1)
      {
        Log.e("FragmentManager", "Failed dumping state", localException1);
        continue;
      }
      try
      {
        a("  ", null, localException1, new String[0]);
      }
      catch (Exception localException2)
      {
        Log.e("FragmentManager", "Failed dumping state", localException2);
      }
    }
  }
  
  static boolean a(View paramView, Animation paramAnimation)
  {
    return (Build.VERSION.SDK_INT >= 19) && (bu.g(paramView) == 0) && (bu.v(paramView)) && (a(paramAnimation));
  }
  
  static boolean a(Animation paramAnimation)
  {
    boolean bool2 = false;
    boolean bool1;
    if ((paramAnimation instanceof AlphaAnimation)) {
      bool1 = true;
    }
    do
    {
      return bool1;
      bool1 = bool2;
    } while (!(paramAnimation instanceof AnimationSet));
    paramAnimation = ((AnimationSet)paramAnimation).getAnimations();
    int i1 = 0;
    for (;;)
    {
      bool1 = bool2;
      if (i1 >= paramAnimation.size()) {
        break;
      }
      if ((paramAnimation.get(i1) instanceof AlphaAnimation)) {
        return true;
      }
      i1 += 1;
    }
  }
  
  public static int b(int paramInt, boolean paramBoolean)
  {
    switch (paramInt)
    {
    default: 
      return -1;
    case 4097: 
      if (paramBoolean) {
        return 1;
      }
      return 2;
    case 8194: 
      if (paramBoolean) {
        return 3;
      }
      return 4;
    }
    if (paramBoolean) {
      return 5;
    }
    return 6;
  }
  
  private void b(View paramView, Animation paramAnimation)
  {
    if ((paramView == null) || (paramAnimation == null)) {}
    while (!a(paramView, paramAnimation)) {
      return;
    }
    try
    {
      if (r == null)
      {
        r = Animation.class.getDeclaredField("mListener");
        r.setAccessible(true);
      }
      localAnimationListener = (Animation.AnimationListener)r.get(paramAnimation);
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      for (;;)
      {
        Animation.AnimationListener localAnimationListener;
        Log.e("FragmentManager", "No field with the name mListener is found in Animation class", localNoSuchFieldException);
        Object localObject1 = null;
      }
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      for (;;)
      {
        Log.e("FragmentManager", "Cannot access Animation's mListener field", localIllegalAccessException);
        Object localObject2 = null;
      }
    }
    paramAnimation.setAnimationListener(new ai(paramView, paramAnimation, localAnimationListener));
  }
  
  public static int c(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return 0;
    case 4097: 
      return 8194;
    case 8194: 
      return 4097;
    }
    return 4099;
  }
  
  private void t()
  {
    if (this.t) {
      throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }
    if (this.v != null) {
      throw new IllegalStateException("Can not perform this action inside of " + this.v);
    }
  }
  
  public t a(int paramInt)
  {
    int i1;
    Object localObject;
    if (this.g != null)
    {
      i1 = this.g.size() - 1;
      while (i1 >= 0)
      {
        localObject = (t)this.g.get(i1);
        if ((localObject != null) && (((t)localObject).w == paramInt)) {
          return (t)localObject;
        }
        i1 -= 1;
      }
    }
    if (this.f != null)
    {
      i1 = this.f.size() - 1;
      for (;;)
      {
        if (i1 < 0) {
          break label112;
        }
        t localt = (t)this.f.get(i1);
        if (localt != null)
        {
          localObject = localt;
          if (localt.w == paramInt) {
            break;
          }
        }
        i1 -= 1;
      }
    }
    label112:
    return null;
  }
  
  public t a(Bundle paramBundle, String paramString)
  {
    int i1 = paramBundle.getInt(paramString, -1);
    if (i1 == -1) {
      paramBundle = null;
    }
    t localt;
    do
    {
      return paramBundle;
      if (i1 >= this.f.size()) {
        a(new IllegalStateException("Fragment no longer exists for key " + paramString + ": index " + i1));
      }
      localt = (t)this.f.get(i1);
      paramBundle = localt;
    } while (localt != null);
    a(new IllegalStateException("Fragment no longer exists for key " + paramString + ": index " + i1));
    return localt;
  }
  
  public t a(String paramString)
  {
    int i1;
    Object localObject;
    if ((this.g != null) && (paramString != null))
    {
      i1 = this.g.size() - 1;
      while (i1 >= 0)
      {
        localObject = (t)this.g.get(i1);
        if ((localObject != null) && (paramString.equals(((t)localObject).y))) {
          return (t)localObject;
        }
        i1 -= 1;
      }
    }
    if ((this.f != null) && (paramString != null))
    {
      i1 = this.f.size() - 1;
      for (;;)
      {
        if (i1 < 0) {
          break label126;
        }
        t localt = (t)this.f.get(i1);
        if (localt != null)
        {
          localObject = localt;
          if (paramString.equals(localt.y)) {
            break;
          }
        }
        i1 -= 1;
      }
    }
    label126:
    return null;
  }
  
  public View a(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    if (!"fragment".equals(paramString)) {
      return null;
    }
    String str1 = paramAttributeSet.getAttributeValue(null, "class");
    paramString = paramContext.obtainStyledAttributes(paramAttributeSet, al.a);
    if (str1 == null) {
      str1 = paramString.getString(0);
    }
    for (;;)
    {
      int i3 = paramString.getResourceId(1, -1);
      String str2 = paramString.getString(2);
      paramString.recycle();
      if (!t.b(this.o.g(), str1)) {
        return null;
      }
      if (paramView != null) {}
      for (int i1 = paramView.getId(); (i1 == -1) && (i3 == -1) && (str2 == null); i1 = 0) {
        throw new IllegalArgumentException(paramAttributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + str1);
      }
      int i2;
      if (i3 != -1)
      {
        paramString = a(i3);
        paramView = paramString;
        if (paramString == null)
        {
          paramView = paramString;
          if (str2 != null) {
            paramView = a(str2);
          }
        }
        paramString = paramView;
        if (paramView == null)
        {
          paramString = paramView;
          if (i1 != -1) {
            paramString = a(i1);
          }
        }
        if (a) {
          Log.v("FragmentManager", "onCreateView: id=0x" + Integer.toHexString(i3) + " fname=" + str1 + " existing=" + paramString);
        }
        if (paramString != null) {
          break label428;
        }
        paramView = t.a(paramContext, str1);
        paramView.o = true;
        if (i3 == 0) {
          break label421;
        }
        i2 = i3;
        label291:
        paramView.w = i2;
        paramView.x = i1;
        paramView.y = str2;
        paramView.p = true;
        paramView.s = this;
        paramView.t = this.o;
        paramView.a(this.o.g(), paramAttributeSet, paramView.e);
        a(paramView, true);
        label350:
        if ((this.n >= 1) || (!paramView.o)) {
          break label555;
        }
        a(paramView, 1, 0, 0, false);
      }
      for (;;)
      {
        if (paramView.I != null) {
          break label563;
        }
        throw new IllegalStateException("Fragment " + str1 + " did not create a view.");
        paramString = null;
        break;
        label421:
        i2 = i1;
        break label291;
        label428:
        if (paramString.p) {
          throw new IllegalArgumentException(paramAttributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(i3) + ", tag " + str2 + ", or parent id 0x" + Integer.toHexString(i1) + " with another fragment for " + str1);
        }
        paramString.p = true;
        paramString.t = this.o;
        if (!paramString.C) {
          paramString.a(this.o.g(), paramAttributeSet, paramString.e);
        }
        paramView = paramString;
        break label350;
        label555:
        b(paramView);
      }
      label563:
      if (i3 != 0) {
        paramView.I.setId(i3);
      }
      if (paramView.I.getTag() == null) {
        paramView.I.setTag(str2);
      }
      return paramView.I;
    }
  }
  
  Animation a(t paramt, int paramInt1, boolean paramBoolean, int paramInt2)
  {
    Animation localAnimation = paramt.a(paramInt1, paramBoolean, paramt.G);
    if (localAnimation != null) {
      paramt = localAnimation;
    }
    do
    {
      return paramt;
      if (paramt.G == 0) {
        break;
      }
      localAnimation = AnimationUtils.loadAnimation(this.o.g(), paramt.G);
      paramt = localAnimation;
    } while (localAnimation != null);
    if (paramInt1 == 0) {
      return null;
    }
    paramInt1 = b(paramInt1, paramBoolean);
    if (paramInt1 < 0) {
      return null;
    }
    switch (paramInt1)
    {
    default: 
      paramInt1 = paramInt2;
      if (paramInt2 == 0)
      {
        paramInt1 = paramInt2;
        if (this.o.d()) {
          paramInt1 = this.o.e();
        }
      }
      if (paramInt1 == 0) {
        return null;
      }
      break;
    case 1: 
      return a(this.o.g(), 1.125F, 1.0F, 0.0F, 1.0F);
    case 2: 
      return a(this.o.g(), 1.0F, 0.975F, 1.0F, 0.0F);
    case 3: 
      return a(this.o.g(), 0.975F, 1.0F, 0.0F, 1.0F);
    case 4: 
      return a(this.o.g(), 1.0F, 1.075F, 1.0F, 0.0F);
    case 5: 
      return a(this.o.g(), 0.0F, 1.0F);
    case 6: 
      return a(this.o.g(), 1.0F, 0.0F);
    }
    return null;
  }
  
  void a(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    if ((this.o == null) && (paramInt1 != 0)) {
      throw new IllegalStateException("No host");
    }
    if ((!paramBoolean) && (this.n == paramInt1)) {}
    do
    {
      return;
      this.n = paramInt1;
    } while (this.f == null);
    int i1 = 0;
    boolean bool = false;
    label54:
    if (i1 < this.f.size())
    {
      t localt = (t)this.f.get(i1);
      if (localt == null) {
        break label169;
      }
      a(localt, paramInt1, paramInt2, paramInt3, false);
      if (localt.M == null) {
        break label169;
      }
      bool |= localt.M.a();
    }
    label169:
    for (;;)
    {
      i1 += 1;
      break label54;
      if (!bool) {
        c();
      }
      if ((!this.s) || (this.o == null) || (this.n != 5)) {
        break;
      }
      this.o.c();
      this.s = false;
      return;
    }
  }
  
  /* Error */
  public void a(int paramInt, j paramj)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 478	android/support/v4/b/af:k	Ljava/util/ArrayList;
    //   6: ifnonnull +14 -> 20
    //   9: aload_0
    //   10: new 270	java/util/ArrayList
    //   13: dup
    //   14: invokespecial 479	java/util/ArrayList:<init>	()V
    //   17: putfield 478	android/support/v4/b/af:k	Ljava/util/ArrayList;
    //   20: aload_0
    //   21: getfield 478	android/support/v4/b/af:k	Ljava/util/ArrayList;
    //   24: invokevirtual 271	java/util/ArrayList:size	()I
    //   27: istore 4
    //   29: iload 4
    //   31: istore_3
    //   32: iload_1
    //   33: iload 4
    //   35: if_icmpge +58 -> 93
    //   38: getstatic 53	android/support/v4/b/af:a	Z
    //   41: ifeq +39 -> 80
    //   44: ldc -120
    //   46: new 255	java/lang/StringBuilder
    //   49: dup
    //   50: invokespecial 256	java/lang/StringBuilder:<init>	()V
    //   53: ldc_w 481
    //   56: invokevirtual 262	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   59: iload_1
    //   60: invokevirtual 292	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   63: ldc_w 483
    //   66: invokevirtual 262	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   69: aload_2
    //   70: invokevirtual 373	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   73: invokevirtual 265	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   76: invokestatic 375	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   79: pop
    //   80: aload_0
    //   81: getfield 478	android/support/v4/b/af:k	Ljava/util/ArrayList;
    //   84: iload_1
    //   85: aload_2
    //   86: invokevirtual 487	java/util/ArrayList:set	(ILjava/lang/Object;)Ljava/lang/Object;
    //   89: pop
    //   90: aload_0
    //   91: monitorexit
    //   92: return
    //   93: iload_3
    //   94: iload_1
    //   95: if_icmpge +81 -> 176
    //   98: aload_0
    //   99: getfield 478	android/support/v4/b/af:k	Ljava/util/ArrayList;
    //   102: aconst_null
    //   103: invokevirtual 490	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   106: pop
    //   107: aload_0
    //   108: getfield 492	android/support/v4/b/af:l	Ljava/util/ArrayList;
    //   111: ifnonnull +14 -> 125
    //   114: aload_0
    //   115: new 270	java/util/ArrayList
    //   118: dup
    //   119: invokespecial 479	java/util/ArrayList:<init>	()V
    //   122: putfield 492	android/support/v4/b/af:l	Ljava/util/ArrayList;
    //   125: getstatic 53	android/support/v4/b/af:a	Z
    //   128: ifeq +29 -> 157
    //   131: ldc -120
    //   133: new 255	java/lang/StringBuilder
    //   136: dup
    //   137: invokespecial 256	java/lang/StringBuilder:<init>	()V
    //   140: ldc_w 494
    //   143: invokevirtual 262	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   146: iload_3
    //   147: invokevirtual 292	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   150: invokevirtual 265	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   153: invokestatic 375	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   156: pop
    //   157: aload_0
    //   158: getfield 492	android/support/v4/b/af:l	Ljava/util/ArrayList;
    //   161: iload_3
    //   162: invokestatic 498	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   165: invokevirtual 490	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   168: pop
    //   169: iload_3
    //   170: iconst_1
    //   171: iadd
    //   172: istore_3
    //   173: goto -80 -> 93
    //   176: getstatic 53	android/support/v4/b/af:a	Z
    //   179: ifeq +39 -> 218
    //   182: ldc -120
    //   184: new 255	java/lang/StringBuilder
    //   187: dup
    //   188: invokespecial 256	java/lang/StringBuilder:<init>	()V
    //   191: ldc_w 500
    //   194: invokevirtual 262	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   197: iload_1
    //   198: invokevirtual 292	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   201: ldc_w 502
    //   204: invokevirtual 262	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   207: aload_2
    //   208: invokevirtual 373	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   211: invokevirtual 265	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   214: invokestatic 375	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   217: pop
    //   218: aload_0
    //   219: getfield 478	android/support/v4/b/af:k	Ljava/util/ArrayList;
    //   222: aload_2
    //   223: invokevirtual 490	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   226: pop
    //   227: goto -137 -> 90
    //   230: astore_2
    //   231: aload_0
    //   232: monitorexit
    //   233: aload_2
    //   234: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	235	0	this	af
    //   0	235	1	paramInt	int
    //   0	235	2	paramj	j
    //   31	142	3	i1	int
    //   27	9	4	i2	int
    // Exception table:
    //   from	to	target	type
    //   2	20	230	finally
    //   20	29	230	finally
    //   38	80	230	finally
    //   80	90	230	finally
    //   90	92	230	finally
    //   98	125	230	finally
    //   125	157	230	finally
    //   157	169	230	finally
    //   176	218	230	finally
    //   218	227	230	finally
    //   231	233	230	finally
  }
  
  void a(int paramInt, boolean paramBoolean)
  {
    a(paramInt, 0, 0, paramBoolean);
  }
  
  public void a(Configuration paramConfiguration)
  {
    if (this.g != null)
    {
      int i1 = 0;
      while (i1 < this.g.size())
      {
        t localt = (t)this.g.get(i1);
        if (localt != null) {
          localt.a(paramConfiguration);
        }
        i1 += 1;
      }
    }
  }
  
  public void a(Bundle paramBundle, String paramString, t paramt)
  {
    if (paramt.g < 0) {
      a(new IllegalStateException("Fragment " + paramt + " is not currently in the FragmentManager"));
    }
    paramBundle.putInt(paramString, paramt.g);
  }
  
  void a(Parcelable paramParcelable, List paramList)
  {
    if (paramParcelable == null) {}
    for (;;)
    {
      return;
      paramParcelable = (am)paramParcelable;
      if (paramParcelable.a != null)
      {
        Object localObject1;
        Object localObject2;
        if (paramList != null)
        {
          i1 = 0;
          while (i1 < paramList.size())
          {
            localObject1 = (t)paramList.get(i1);
            if (a) {
              Log.v("FragmentManager", "restoreAllState: re-attaching retained " + localObject1);
            }
            localObject2 = paramParcelable.a[localObject1.g];
            ((ao)localObject2).k = ((t)localObject1);
            ((t)localObject1).f = null;
            ((t)localObject1).r = 0;
            ((t)localObject1).p = false;
            ((t)localObject1).m = false;
            ((t)localObject1).j = null;
            if (((ao)localObject2).j != null)
            {
              ((ao)localObject2).j.setClassLoader(this.o.g().getClassLoader());
              ((t)localObject1).f = ((ao)localObject2).j.getSparseParcelableArray("android:view_state");
              ((t)localObject1).e = ((ao)localObject2).j;
            }
            i1 += 1;
          }
        }
        this.f = new ArrayList(paramParcelable.a.length);
        if (this.h != null) {
          this.h.clear();
        }
        int i1 = 0;
        if (i1 < paramParcelable.a.length)
        {
          localObject1 = paramParcelable.a[i1];
          if (localObject1 != null)
          {
            localObject2 = ((ao)localObject1).a(this.o, this.q);
            if (a) {
              Log.v("FragmentManager", "restoreAllState: active #" + i1 + ": " + localObject2);
            }
            this.f.add(localObject2);
            ((ao)localObject1).k = null;
          }
          for (;;)
          {
            i1 += 1;
            break;
            this.f.add(null);
            if (this.h == null) {
              this.h = new ArrayList();
            }
            if (a) {
              Log.v("FragmentManager", "restoreAllState: avail #" + i1);
            }
            this.h.add(Integer.valueOf(i1));
          }
        }
        if (paramList != null)
        {
          i1 = 0;
          if (i1 < paramList.size())
          {
            localObject1 = (t)paramList.get(i1);
            if (((t)localObject1).k >= 0) {
              if (((t)localObject1).k >= this.f.size()) {
                break label473;
              }
            }
            for (((t)localObject1).j = ((t)this.f.get(((t)localObject1).k));; ((t)localObject1).j = null)
            {
              i1 += 1;
              break;
              label473:
              Log.w("FragmentManager", "Re-attaching retained fragment " + localObject1 + " target no longer exists: " + ((t)localObject1).k);
            }
          }
        }
        if (paramParcelable.b != null)
        {
          this.g = new ArrayList(paramParcelable.b.length);
          i1 = 0;
          while (i1 < paramParcelable.b.length)
          {
            paramList = (t)this.f.get(paramParcelable.b[i1]);
            if (paramList == null) {
              a(new IllegalStateException("No instantiated fragment for index #" + paramParcelable.b[i1]));
            }
            paramList.m = true;
            if (a) {
              Log.v("FragmentManager", "restoreAllState: added #" + i1 + ": " + paramList);
            }
            if (this.g.contains(paramList)) {
              throw new IllegalStateException("Already added!");
            }
            this.g.add(paramList);
            i1 += 1;
          }
        }
        this.g = null;
        if (paramParcelable.c == null) {
          break;
        }
        this.i = new ArrayList(paramParcelable.c.length);
        i1 = 0;
        while (i1 < paramParcelable.c.length)
        {
          paramList = paramParcelable.c[i1].a(this);
          if (a)
          {
            Log.v("FragmentManager", "restoreAllState: back stack #" + i1 + " (index " + paramList.p + "): " + paramList);
            paramList.a("  ", new PrintWriter(new e("FragmentManager")), false);
          }
          this.i.add(paramList);
          if (paramList.p >= 0) {
            a(paramList.p, paramList);
          }
          i1 += 1;
        }
      }
    }
    this.i = null;
  }
  
  public void a(ac paramac, aa paramaa, t paramt)
  {
    if (this.o != null) {
      throw new IllegalStateException("Already attached");
    }
    this.o = paramac;
    this.p = paramaa;
    this.q = paramt;
  }
  
  void a(j paramj)
  {
    if (this.i == null) {
      this.i = new ArrayList();
    }
    this.i.add(paramj);
    e();
  }
  
  public void a(t paramt)
  {
    if (paramt.K)
    {
      if (this.e) {
        this.w = true;
      }
    }
    else {
      return;
    }
    paramt.K = false;
    a(paramt, this.n, 0, 0, false);
  }
  
  public void a(t paramt, int paramInt1, int paramInt2)
  {
    if (a) {
      Log.v("FragmentManager", "remove: " + paramt + " nesting=" + paramt.r);
    }
    if (!paramt.a())
    {
      i1 = 1;
      if ((!paramt.A) || (i1 != 0))
      {
        if (this.g != null) {
          this.g.remove(paramt);
        }
        if ((paramt.D) && (paramt.E)) {
          this.s = true;
        }
        paramt.m = false;
        paramt.n = true;
        if (i1 == 0) {
          break label137;
        }
      }
    }
    label137:
    for (int i1 = 0;; i1 = 1)
    {
      a(paramt, i1, paramInt1, paramInt2, false);
      return;
      i1 = 0;
      break;
    }
  }
  
  void a(t paramt, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    int i1;
    if (paramt.m)
    {
      i1 = paramInt1;
      if (!paramt.A) {}
    }
    else
    {
      i1 = paramInt1;
      if (paramInt1 > 1) {
        i1 = 1;
      }
    }
    int i2 = i1;
    if (paramt.n)
    {
      i2 = i1;
      if (i1 > paramt.b) {
        i2 = paramt.b;
      }
    }
    paramInt1 = i2;
    if (paramt.K)
    {
      paramInt1 = i2;
      if (paramt.b < 4)
      {
        paramInt1 = i2;
        if (i2 > 3) {
          paramInt1 = 3;
        }
      }
    }
    int i3;
    label615:
    label647:
    Object localObject2;
    if (paramt.b < paramInt1)
    {
      if ((paramt.o) && (!paramt.p)) {}
      do
      {
        return;
        if (paramt.c != null)
        {
          paramt.c = null;
          a(paramt, paramt.d, 0, 0, true);
        }
        i1 = paramInt1;
        i3 = paramInt1;
        i2 = paramInt1;
        switch (paramt.b)
        {
        default: 
          i1 = paramInt1;
        }
      } while (paramt.b == i1);
      Log.w("FragmentManager", "moveToState: Fragment state for " + paramt + " not updated inline; " + "expected state " + i1 + " found " + paramt.b);
      paramt.b = i1;
      return;
      if (a) {
        Log.v("FragmentManager", "moveto CREATED: " + paramt);
      }
      i2 = paramInt1;
      if (paramt.e != null)
      {
        paramt.e.setClassLoader(this.o.g().getClassLoader());
        paramt.f = paramt.e.getSparseParcelableArray("android:view_state");
        paramt.j = a(paramt.e, "android:target_state");
        if (paramt.j != null) {
          paramt.l = paramt.e.getInt("android:target_req_state", 0);
        }
        paramt.L = paramt.e.getBoolean("android:user_visible_hint", true);
        i2 = paramInt1;
        if (!paramt.L)
        {
          paramt.K = true;
          i2 = paramInt1;
          if (paramInt1 > 3) {
            i2 = 3;
          }
        }
      }
      paramt.t = this.o;
      paramt.v = this.q;
      if (this.q != null) {}
      for (localObject1 = this.q.u;; localObject1 = this.o.i())
      {
        paramt.s = ((af)localObject1);
        paramt.F = false;
        paramt.a(this.o.g());
        if (paramt.F) {
          break;
        }
        throw new bj("Fragment " + paramt + " did not call through to super.onAttach()");
      }
      if (paramt.v == null) {
        this.o.b(paramt);
      }
      if (!paramt.C) {
        paramt.g(paramt.e);
      }
      paramt.C = false;
      i1 = i2;
      if (paramt.o)
      {
        paramt.I = paramt.b(paramt.b(paramt.e), null, paramt.e);
        if (paramt.I == null) {
          break label1105;
        }
        paramt.J = paramt.I;
        if (Build.VERSION.SDK_INT >= 11)
        {
          bu.b(paramt.I, false);
          if (paramt.z) {
            paramt.I.setVisibility(8);
          }
          paramt.a(paramt.I, paramt.e);
          i1 = i2;
        }
      }
      else
      {
        i3 = i1;
        if (i1 > 1)
        {
          if (a) {
            Log.v("FragmentManager", "moveto ACTIVITY_CREATED: " + paramt);
          }
          if (!paramt.o)
          {
            if (paramt.x == 0) {
              break label1718;
            }
            localObject2 = (ViewGroup)this.p.a(paramt.x);
            localObject1 = localObject2;
            if (localObject2 == null)
            {
              localObject1 = localObject2;
              if (!paramt.q) {
                a(new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(paramt.x) + " (" + paramt.c().getResourceName(paramt.x) + ") for fragment " + paramt));
              }
            }
          }
        }
      }
    }
    label869:
    label1105:
    label1194:
    label1559:
    label1712:
    label1718:
    for (Object localObject1 = localObject2;; localObject1 = null)
    {
      paramt.H = ((ViewGroup)localObject1);
      paramt.I = paramt.b(paramt.b(paramt.e), (ViewGroup)localObject1, paramt.e);
      if (paramt.I != null)
      {
        paramt.J = paramt.I;
        if (Build.VERSION.SDK_INT >= 11)
        {
          bu.b(paramt.I, false);
          if (localObject1 != null)
          {
            localObject2 = a(paramt, paramInt2, true, paramInt3);
            if (localObject2 != null)
            {
              b(paramt.I, (Animation)localObject2);
              paramt.I.startAnimation((Animation)localObject2);
            }
            ((ViewGroup)localObject1).addView(paramt.I);
          }
          if (paramt.z) {
            paramt.I.setVisibility(8);
          }
          paramt.a(paramt.I, paramt.e);
        }
      }
      for (;;)
      {
        paramt.h(paramt.e);
        if (paramt.I != null) {
          paramt.a(paramt.e);
        }
        paramt.e = null;
        i3 = i1;
        i2 = i3;
        if (i3 > 3)
        {
          if (a) {
            Log.v("FragmentManager", "moveto STARTED: " + paramt);
          }
          paramt.z();
          i2 = i3;
        }
        i1 = i2;
        if (i2 <= 4) {
          break;
        }
        if (a) {
          Log.v("FragmentManager", "moveto RESUMED: " + paramt);
        }
        paramt.A();
        paramt.e = null;
        paramt.f = null;
        i1 = i2;
        break;
        paramt.I = bh.a(paramt.I);
        break label615;
        paramt.J = null;
        i1 = i2;
        break label647;
        paramt.I = bh.a(paramt.I);
        break label869;
        paramt.J = null;
      }
      i1 = paramInt1;
      if (paramt.b <= paramInt1) {
        break;
      }
      switch (paramt.b)
      {
      default: 
        i1 = paramInt1;
        break;
      case 1: 
      case 5: 
      case 4: 
      case 3: 
      case 2: 
        do
        {
          i1 = paramInt1;
          if (paramInt1 >= 1) {
            break;
          }
          if ((this.u) && (paramt.c != null))
          {
            localObject1 = paramt.c;
            paramt.c = null;
            ((View)localObject1).clearAnimation();
          }
          if (paramt.c == null) {
            break label1559;
          }
          paramt.d = paramInt1;
          i1 = 1;
          break;
          if (paramInt1 < 5)
          {
            if (a) {
              Log.v("FragmentManager", "movefrom RESUMED: " + paramt);
            }
            paramt.C();
          }
          if (paramInt1 < 4)
          {
            if (a) {
              Log.v("FragmentManager", "movefrom STARTED: " + paramt);
            }
            paramt.D();
          }
          if (paramInt1 < 3)
          {
            if (a) {
              Log.v("FragmentManager", "movefrom STOPPED: " + paramt);
            }
            paramt.E();
          }
        } while (paramInt1 >= 2);
        if (a) {
          Log.v("FragmentManager", "movefrom ACTIVITY_CREATED: " + paramt);
        }
        if ((paramt.I != null) && (this.o.a(paramt)) && (paramt.f == null)) {
          e(paramt);
        }
        paramt.F();
        if ((paramt.I != null) && (paramt.H != null)) {
          if ((this.n <= 0) || (this.u)) {
            break label1712;
          }
        }
        for (localObject1 = a(paramt, paramInt2, false, paramInt3);; localObject1 = null)
        {
          if (localObject1 != null)
          {
            paramt.c = paramt.I;
            paramt.d = paramInt1;
            ((Animation)localObject1).setAnimationListener(new ah(this, paramt.I, (Animation)localObject1, paramt));
            paramt.I.startAnimation((Animation)localObject1);
          }
          paramt.H.removeView(paramt.I);
          paramt.H = null;
          paramt.I = null;
          paramt.J = null;
          break label1194;
          if (a) {
            Log.v("FragmentManager", "movefrom CREATED: " + paramt);
          }
          if (!paramt.C) {
            paramt.G();
          }
          for (;;)
          {
            paramt.F = false;
            paramt.o();
            if (paramt.F) {
              break;
            }
            throw new bj("Fragment " + paramt + " did not call through to super.onDetach()");
            paramt.b = 0;
          }
          i1 = paramInt1;
          if (paramBoolean) {
            break;
          }
          if (!paramt.C)
          {
            d(paramt);
            i1 = paramInt1;
            break;
          }
          paramt.t = null;
          paramt.v = null;
          paramt.s = null;
          paramt.u = null;
          i1 = paramInt1;
          break;
        }
      }
    }
  }
  
  public void a(t paramt, boolean paramBoolean)
  {
    if (this.g == null) {
      this.g = new ArrayList();
    }
    if (a) {
      Log.v("FragmentManager", "add: " + paramt);
    }
    c(paramt);
    if (!paramt.A)
    {
      if (this.g.contains(paramt)) {
        throw new IllegalStateException("Fragment already added: " + paramt);
      }
      this.g.add(paramt);
      paramt.m = true;
      paramt.n = false;
      if ((paramt.D) && (paramt.E)) {
        this.s = true;
      }
      if (paramBoolean) {
        b(paramt);
      }
    }
  }
  
  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    int i2 = 0;
    String str = paramString + "    ";
    int i3;
    int i1;
    Object localObject;
    if (this.f != null)
    {
      i3 = this.f.size();
      if (i3 > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("Active Fragments in ");
        paramPrintWriter.print(Integer.toHexString(System.identityHashCode(this)));
        paramPrintWriter.println(":");
        i1 = 0;
        while (i1 < i3)
        {
          localObject = (t)this.f.get(i1);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i1);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(localObject);
          if (localObject != null) {
            ((t)localObject).a(str, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
          }
          i1 += 1;
        }
      }
    }
    if (this.g != null)
    {
      i3 = this.g.size();
      if (i3 > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.println("Added Fragments:");
        i1 = 0;
        while (i1 < i3)
        {
          localObject = (t)this.g.get(i1);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i1);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(((t)localObject).toString());
          i1 += 1;
        }
      }
    }
    if (this.j != null)
    {
      i3 = this.j.size();
      if (i3 > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.println("Fragments Created Menus:");
        i1 = 0;
        while (i1 < i3)
        {
          localObject = (t)this.j.get(i1);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i1);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(((t)localObject).toString());
          i1 += 1;
        }
      }
    }
    if (this.i != null)
    {
      i3 = this.i.size();
      if (i3 > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.println("Back Stack:");
        i1 = 0;
        while (i1 < i3)
        {
          localObject = (j)this.i.get(i1);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i1);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(((j)localObject).toString());
          ((j)localObject).a(str, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
          i1 += 1;
        }
      }
    }
    try
    {
      if (this.k != null)
      {
        i3 = this.k.size();
        if (i3 > 0)
        {
          paramPrintWriter.print(paramString);
          paramPrintWriter.println("Back Stack Indices:");
          i1 = 0;
          while (i1 < i3)
          {
            paramFileDescriptor = (j)this.k.get(i1);
            paramPrintWriter.print(paramString);
            paramPrintWriter.print("  #");
            paramPrintWriter.print(i1);
            paramPrintWriter.print(": ");
            paramPrintWriter.println(paramFileDescriptor);
            i1 += 1;
          }
        }
      }
      if ((this.l != null) && (this.l.size() > 0))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mAvailBackStackIndices: ");
        paramPrintWriter.println(Arrays.toString(this.l.toArray()));
      }
      if (this.c != null)
      {
        i3 = this.c.size();
        if (i3 > 0)
        {
          paramPrintWriter.print(paramString);
          paramPrintWriter.println("Pending Actions:");
          i1 = i2;
          while (i1 < i3)
          {
            paramFileDescriptor = (Runnable)this.c.get(i1);
            paramPrintWriter.print(paramString);
            paramPrintWriter.print("  #");
            paramPrintWriter.print(i1);
            paramPrintWriter.print(": ");
            paramPrintWriter.println(paramFileDescriptor);
            i1 += 1;
          }
        }
      }
      paramPrintWriter.print(paramString);
    }
    finally {}
    paramPrintWriter.println("FragmentManager misc state:");
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("  mHost=");
    paramPrintWriter.println(this.o);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("  mContainer=");
    paramPrintWriter.println(this.p);
    if (this.q != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mParent=");
      paramPrintWriter.println(this.q);
    }
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("  mCurState=");
    paramPrintWriter.print(this.n);
    paramPrintWriter.print(" mStateSaved=");
    paramPrintWriter.print(this.t);
    paramPrintWriter.print(" mDestroyed=");
    paramPrintWriter.println(this.u);
    if (this.s)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mNeedMenuInvalidate=");
      paramPrintWriter.println(this.s);
    }
    if (this.v != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mNoTransactionsBecause=");
      paramPrintWriter.println(this.v);
    }
    if ((this.h != null) && (this.h.size() > 0))
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mAvailIndices: ");
      paramPrintWriter.println(Arrays.toString(this.h.toArray()));
    }
  }
  
  public boolean a()
  {
    t();
    b();
    return a(this.o.h(), null, -1, 0);
  }
  
  boolean a(Handler paramHandler, String paramString, int paramInt1, int paramInt2)
  {
    if (this.i == null) {
      break label145;
    }
    label7:
    do
    {
      return false;
      if ((paramString != null) || (paramInt1 >= 0) || ((paramInt2 & 0x1) != 0)) {
        break;
      }
      paramInt1 = this.i.size() - 1;
    } while (paramInt1 < 0);
    paramHandler = (j)this.i.remove(paramInt1);
    paramString = new SparseArray();
    SparseArray localSparseArray1 = new SparseArray();
    paramHandler.a(paramString, localSparseArray1);
    paramHandler.a(true, null, paramString, localSparseArray1);
    e();
    for (;;)
    {
      return true;
      int i1 = -1;
      if ((paramString != null) || (paramInt1 >= 0))
      {
        int i2 = this.i.size() - 1;
        for (;;)
        {
          if (i2 >= 0)
          {
            paramHandler = (j)this.i.get(i2);
            if ((paramString == null) || (!paramString.equals(paramHandler.a()))) {}
          }
          else
          {
            label145:
            if (i2 < 0) {
              break label7;
            }
            i1 = i2;
            if ((paramInt2 & 0x1) == 0) {
              break label254;
            }
            paramInt2 = i2 - 1;
            for (;;)
            {
              i1 = paramInt2;
              if (paramInt2 < 0) {
                break;
              }
              paramHandler = (j)this.i.get(paramInt2);
              if ((paramString == null) || (!paramString.equals(paramHandler.a())))
              {
                i1 = paramInt2;
                if (paramInt1 < 0) {
                  break;
                }
                i1 = paramInt2;
                if (paramInt1 != paramHandler.p) {
                  break;
                }
              }
              paramInt2 -= 1;
            }
          }
          if ((paramInt1 >= 0) && (paramInt1 == paramHandler.p)) {
            break;
          }
          i2 -= 1;
        }
      }
      label254:
      if (i1 == this.i.size() - 1) {
        break label7;
      }
      paramString = new ArrayList();
      paramInt1 = this.i.size() - 1;
      while (paramInt1 > i1)
      {
        paramString.add(this.i.remove(paramInt1));
        paramInt1 -= 1;
      }
      paramInt2 = paramString.size() - 1;
      localSparseArray1 = new SparseArray();
      SparseArray localSparseArray2 = new SparseArray();
      paramInt1 = 0;
      while (paramInt1 <= paramInt2)
      {
        ((j)paramString.get(paramInt1)).a(localSparseArray1, localSparseArray2);
        paramInt1 += 1;
      }
      paramHandler = null;
      paramInt1 = 0;
      if (paramInt1 <= paramInt2)
      {
        if (a) {
          Log.v("FragmentManager", "Popping back stack state: " + paramString.get(paramInt1));
        }
        j localj = (j)paramString.get(paramInt1);
        if (paramInt1 == paramInt2) {}
        for (boolean bool = true;; bool = false)
        {
          paramHandler = localj.a(bool, paramHandler, localSparseArray1, localSparseArray2);
          paramInt1 += 1;
          break;
        }
      }
      e();
    }
  }
  
  public boolean a(Menu paramMenu)
  {
    if (this.g != null)
    {
      int i1 = 0;
      for (boolean bool1 = false;; bool1 = bool2)
      {
        bool2 = bool1;
        if (i1 >= this.g.size()) {
          break;
        }
        t localt = (t)this.g.get(i1);
        bool2 = bool1;
        if (localt != null)
        {
          bool2 = bool1;
          if (localt.c(paramMenu)) {
            bool2 = true;
          }
        }
        i1 += 1;
      }
    }
    boolean bool2 = false;
    return bool2;
  }
  
  public boolean a(Menu paramMenu, MenuInflater paramMenuInflater)
  {
    int i2 = 0;
    Object localObject2 = null;
    Object localObject1 = null;
    int i1;
    if (this.g != null)
    {
      i1 = 0;
      boolean bool1 = false;
      for (;;)
      {
        localObject2 = localObject1;
        bool2 = bool1;
        if (i1 >= this.g.size()) {
          break;
        }
        t localt = (t)this.g.get(i1);
        localObject2 = localObject1;
        bool2 = bool1;
        if (localt != null)
        {
          localObject2 = localObject1;
          bool2 = bool1;
          if (localt.b(paramMenu, paramMenuInflater))
          {
            bool2 = true;
            localObject2 = localObject1;
            if (localObject1 == null) {
              localObject2 = new ArrayList();
            }
            ((ArrayList)localObject2).add(localt);
          }
        }
        i1 += 1;
        bool1 = bool2;
        localObject1 = localObject2;
      }
    }
    boolean bool2 = false;
    if (this.j != null)
    {
      i1 = i2;
      while (i1 < this.j.size())
      {
        paramMenu = (t)this.j.get(i1);
        if ((localObject2 == null) || (!((ArrayList)localObject2).contains(paramMenu))) {
          paramMenu.p();
        }
        i1 += 1;
      }
    }
    this.j = ((ArrayList)localObject2);
    return bool2;
  }
  
  public boolean a(MenuItem paramMenuItem)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    int i1;
    if (this.g != null) {
      i1 = 0;
    }
    for (;;)
    {
      bool1 = bool2;
      if (i1 < this.g.size())
      {
        t localt = (t)this.g.get(i1);
        if ((localt != null) && (localt.c(paramMenuItem))) {
          bool1 = true;
        }
      }
      else
      {
        return bool1;
      }
      i1 += 1;
    }
  }
  
  public t b(String paramString)
  {
    if ((this.f != null) && (paramString != null))
    {
      int i1 = this.f.size() - 1;
      while (i1 >= 0)
      {
        t localt = (t)this.f.get(i1);
        if (localt != null)
        {
          localt = localt.a(paramString);
          if (localt != null) {
            return localt;
          }
        }
        i1 -= 1;
      }
    }
    return null;
  }
  
  public void b(int paramInt)
  {
    try
    {
      this.k.set(paramInt, null);
      if (this.l == null) {
        this.l = new ArrayList();
      }
      if (a) {
        Log.v("FragmentManager", "Freeing back stack index " + paramInt);
      }
      this.l.add(Integer.valueOf(paramInt));
      return;
    }
    finally {}
  }
  
  void b(t paramt)
  {
    a(paramt, this.n, 0, 0, false);
  }
  
  public void b(t paramt, int paramInt1, int paramInt2)
  {
    if (a) {
      Log.v("FragmentManager", "hide: " + paramt);
    }
    if (!paramt.z)
    {
      paramt.z = true;
      if (paramt.I != null)
      {
        Animation localAnimation = a(paramt, paramInt1, false, paramInt2);
        if (localAnimation != null)
        {
          b(paramt.I, localAnimation);
          paramt.I.startAnimation(localAnimation);
        }
        paramt.I.setVisibility(8);
      }
      if ((paramt.m) && (paramt.D) && (paramt.E)) {
        this.s = true;
      }
      paramt.a(true);
    }
  }
  
  public void b(Menu paramMenu)
  {
    if (this.g != null)
    {
      int i1 = 0;
      while (i1 < this.g.size())
      {
        t localt = (t)this.g.get(i1);
        if (localt != null) {
          localt.d(paramMenu);
        }
        i1 += 1;
      }
    }
  }
  
  public boolean b()
  {
    return d();
  }
  
  public boolean b(MenuItem paramMenuItem)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    int i1;
    if (this.g != null) {
      i1 = 0;
    }
    for (;;)
    {
      bool1 = bool2;
      if (i1 < this.g.size())
      {
        t localt = (t)this.g.get(i1);
        if ((localt != null) && (localt.d(paramMenuItem))) {
          bool1 = true;
        }
      }
      else
      {
        return bool1;
      }
      i1 += 1;
    }
  }
  
  void c()
  {
    if (this.f == null) {}
    for (;;)
    {
      return;
      int i1 = 0;
      while (i1 < this.f.size())
      {
        t localt = (t)this.f.get(i1);
        if (localt != null) {
          a(localt);
        }
        i1 += 1;
      }
    }
  }
  
  void c(t paramt)
  {
    if (paramt.g >= 0) {}
    for (;;)
    {
      return;
      if ((this.h == null) || (this.h.size() <= 0))
      {
        if (this.f == null) {
          this.f = new ArrayList();
        }
        paramt.a(this.f.size(), this.q);
        this.f.add(paramt);
      }
      while (a)
      {
        Log.v("FragmentManager", "Allocated fragment index " + paramt);
        return;
        paramt.a(((Integer)this.h.remove(this.h.size() - 1)).intValue(), this.q);
        this.f.set(paramt.g, paramt);
      }
    }
  }
  
  public void c(t paramt, int paramInt1, int paramInt2)
  {
    if (a) {
      Log.v("FragmentManager", "show: " + paramt);
    }
    if (paramt.z)
    {
      paramt.z = false;
      if (paramt.I != null)
      {
        Animation localAnimation = a(paramt, paramInt1, true, paramInt2);
        if (localAnimation != null)
        {
          b(paramt.I, localAnimation);
          paramt.I.startAnimation(localAnimation);
        }
        paramt.I.setVisibility(0);
      }
      if ((paramt.m) && (paramt.D) && (paramt.E)) {
        this.s = true;
      }
      paramt.a(false);
    }
  }
  
  void d(t paramt)
  {
    if (paramt.g < 0) {
      return;
    }
    if (a) {
      Log.v("FragmentManager", "Freeing fragment index " + paramt);
    }
    this.f.set(paramt.g, null);
    if (this.h == null) {
      this.h = new ArrayList();
    }
    this.h.add(Integer.valueOf(paramt.g));
    this.o.a(paramt.h);
    paramt.n();
  }
  
  public void d(t paramt, int paramInt1, int paramInt2)
  {
    if (a) {
      Log.v("FragmentManager", "detach: " + paramt);
    }
    if (!paramt.A)
    {
      paramt.A = true;
      if (paramt.m)
      {
        if (this.g != null)
        {
          if (a) {
            Log.v("FragmentManager", "remove from detach: " + paramt);
          }
          this.g.remove(paramt);
        }
        if ((paramt.D) && (paramt.E)) {
          this.s = true;
        }
        paramt.m = false;
        a(paramt, 1, paramInt1, paramInt2, false);
      }
    }
  }
  
  public boolean d()
  {
    if (this.e) {
      throw new IllegalStateException("Recursive entry to executePendingTransactions");
    }
    if (Looper.myLooper() != this.o.h().getLooper()) {
      throw new IllegalStateException("Must be called from main thread of process");
    }
    int i2;
    for (boolean bool = false;; bool = true) {
      try
      {
        if ((this.c == null) || (this.c.size() == 0))
        {
          if (!this.w) {
            break label276;
          }
          i1 = 0;
          int i4;
          for (i2 = 0; i1 < this.f.size(); i2 = i4)
          {
            t localt = (t)this.f.get(i1);
            int i3 = i2;
            if (localt != null)
            {
              i3 = i2;
              if (localt.M != null) {
                i4 = i2 | localt.M.a();
              }
            }
            i1 += 1;
          }
        }
        i2 = this.c.size();
        if ((this.d == null) || (this.d.length < i2)) {
          this.d = new Runnable[i2];
        }
        this.c.toArray(this.d);
        this.c.clear();
        this.o.h().removeCallbacks(this.z);
        this.e = true;
        int i1 = 0;
        while (i1 < i2)
        {
          this.d[i1].run();
          this.d[i1] = null;
          i1 += 1;
        }
        this.e = false;
      }
      finally {}
    }
    if (i2 == 0)
    {
      this.w = false;
      c();
    }
    label276:
    return bool;
  }
  
  void e()
  {
    if (this.m != null)
    {
      int i1 = 0;
      while (i1 < this.m.size())
      {
        ((ae)this.m.get(i1)).a();
        i1 += 1;
      }
    }
  }
  
  void e(t paramt)
  {
    if (paramt.J == null) {
      return;
    }
    if (this.y == null) {
      this.y = new SparseArray();
    }
    for (;;)
    {
      paramt.J.saveHierarchyState(this.y);
      if (this.y.size() <= 0) {
        break;
      }
      paramt.f = this.y;
      this.y = null;
      return;
      this.y.clear();
    }
  }
  
  public void e(t paramt, int paramInt1, int paramInt2)
  {
    if (a) {
      Log.v("FragmentManager", "attach: " + paramt);
    }
    if (paramt.A)
    {
      paramt.A = false;
      if (!paramt.m)
      {
        if (this.g == null) {
          this.g = new ArrayList();
        }
        if (this.g.contains(paramt)) {
          throw new IllegalStateException("Fragment already added: " + paramt);
        }
        if (a) {
          Log.v("FragmentManager", "add from attach: " + paramt);
        }
        this.g.add(paramt);
        paramt.m = true;
        if ((paramt.D) && (paramt.E)) {
          this.s = true;
        }
        a(paramt, this.n, paramInt1, paramInt2, false);
      }
    }
  }
  
  Bundle f(t paramt)
  {
    if (this.x == null) {
      this.x = new Bundle();
    }
    paramt.i(this.x);
    Object localObject2;
    if (!this.x.isEmpty())
    {
      localObject2 = this.x;
      this.x = null;
    }
    for (;;)
    {
      if (paramt.I != null) {
        e(paramt);
      }
      Object localObject1 = localObject2;
      if (paramt.f != null)
      {
        localObject1 = localObject2;
        if (localObject2 == null) {
          localObject1 = new Bundle();
        }
        ((Bundle)localObject1).putSparseParcelableArray("android:view_state", paramt.f);
      }
      localObject2 = localObject1;
      if (!paramt.L)
      {
        localObject2 = localObject1;
        if (localObject1 == null) {
          localObject2 = new Bundle();
        }
        ((Bundle)localObject2).putBoolean("android:user_visible_hint", paramt.L);
      }
      return (Bundle)localObject2;
      localObject2 = null;
    }
  }
  
  ArrayList f()
  {
    Object localObject2 = null;
    Object localObject1 = null;
    if (this.f != null)
    {
      int i1 = 0;
      localObject2 = localObject1;
      if (i1 < this.f.size())
      {
        t localt = (t)this.f.get(i1);
        Object localObject3 = localObject1;
        if (localt != null)
        {
          localObject3 = localObject1;
          if (localt.B)
          {
            localObject2 = localObject1;
            if (localObject1 == null) {
              localObject2 = new ArrayList();
            }
            ((ArrayList)localObject2).add(localt);
            localt.C = true;
            if (localt.j == null) {
              break label164;
            }
          }
        }
        label164:
        for (int i2 = localt.j.g;; i2 = -1)
        {
          localt.k = i2;
          localObject3 = localObject2;
          if (a)
          {
            Log.v("FragmentManager", "retainNonConfig: keeping retained " + localt);
            localObject3 = localObject2;
          }
          i1 += 1;
          localObject1 = localObject3;
          break;
        }
      }
    }
    return (ArrayList)localObject2;
  }
  
  Parcelable g()
  {
    Object localObject3 = null;
    d();
    if (b) {
      this.t = true;
    }
    if ((this.f == null) || (this.f.size() <= 0)) {
      return null;
    }
    int i3 = this.f.size();
    ao[] arrayOfao = new ao[i3];
    int i2 = 0;
    int i1 = 0;
    label56:
    Object localObject1;
    Object localObject2;
    if (i2 < i3)
    {
      localObject1 = (t)this.f.get(i2);
      if (localObject1 == null) {
        break label718;
      }
      if (((t)localObject1).g < 0) {
        a(new IllegalStateException("Failure saving state: active " + localObject1 + " has cleared index: " + ((t)localObject1).g));
      }
      localObject2 = new ao((t)localObject1);
      arrayOfao[i2] = localObject2;
      if ((((t)localObject1).b > 0) && (((ao)localObject2).j == null))
      {
        ((ao)localObject2).j = f((t)localObject1);
        if (((t)localObject1).j != null)
        {
          if (((t)localObject1).j.g < 0) {
            a(new IllegalStateException("Failure saving state: " + localObject1 + " has target not in fragment manager: " + ((t)localObject1).j));
          }
          if (((ao)localObject2).j == null) {
            ((ao)localObject2).j = new Bundle();
          }
          a(((ao)localObject2).j, "android:target_state", ((t)localObject1).j);
          if (((t)localObject1).l != 0) {
            ((ao)localObject2).j.putInt("android:target_req_state", ((t)localObject1).l);
          }
        }
        label303:
        if (a) {
          Log.v("FragmentManager", "Saved state of " + localObject1 + ": " + ((ao)localObject2).j);
        }
        i1 = 1;
      }
    }
    label718:
    for (;;)
    {
      i2 += 1;
      break label56;
      ((ao)localObject2).j = ((t)localObject1).e;
      break label303;
      if (i1 == 0)
      {
        if (!a) {
          break;
        }
        Log.v("FragmentManager", "saveAllState: no fragments!");
        return null;
      }
      if (this.g != null)
      {
        i2 = this.g.size();
        if (i2 > 0)
        {
          localObject2 = new int[i2];
          i1 = 0;
          for (;;)
          {
            localObject1 = localObject2;
            if (i1 >= i2) {
              break;
            }
            localObject2[i1] = ((t)this.g.get(i1)).g;
            if (localObject2[i1] < 0) {
              a(new IllegalStateException("Failure saving state: active " + this.g.get(i1) + " has cleared index: " + localObject2[i1]));
            }
            if (a) {
              Log.v("FragmentManager", "saveAllState: adding fragment #" + i1 + ": " + this.g.get(i1));
            }
            i1 += 1;
          }
        }
      }
      localObject1 = null;
      localObject2 = localObject3;
      if (this.i != null)
      {
        i2 = this.i.size();
        localObject2 = localObject3;
        if (i2 > 0)
        {
          localObject3 = new p[i2];
          i1 = 0;
          for (;;)
          {
            localObject2 = localObject3;
            if (i1 >= i2) {
              break;
            }
            localObject3[i1] = new p((j)this.i.get(i1));
            if (a) {
              Log.v("FragmentManager", "saveAllState: adding back stack #" + i1 + ": " + this.i.get(i1));
            }
            i1 += 1;
          }
        }
      }
      localObject3 = new am();
      ((am)localObject3).a = arrayOfao;
      ((am)localObject3).b = ((int[])localObject1);
      ((am)localObject3).c = ((p[])localObject2);
      return (Parcelable)localObject3;
    }
  }
  
  public void h()
  {
    this.t = false;
  }
  
  public void i()
  {
    this.t = false;
    a(1, false);
  }
  
  public void j()
  {
    this.t = false;
    a(2, false);
  }
  
  public void k()
  {
    this.t = false;
    a(4, false);
  }
  
  public void l()
  {
    this.t = false;
    a(5, false);
  }
  
  public void m()
  {
    a(4, false);
  }
  
  public void n()
  {
    this.t = true;
    a(3, false);
  }
  
  public void o()
  {
    a(2, false);
  }
  
  public void p()
  {
    a(1, false);
  }
  
  public void q()
  {
    this.u = true;
    d();
    a(0, false);
    this.o = null;
    this.p = null;
    this.q = null;
  }
  
  public void r()
  {
    if (this.g != null)
    {
      int i1 = 0;
      while (i1 < this.g.size())
      {
        t localt = (t)this.g.get(i1);
        if (localt != null) {
          localt.B();
        }
        i1 += 1;
      }
    }
  }
  
  android.support.v4.i.al s()
  {
    return this;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append("FragmentManager{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append(" in ");
    if (this.q != null) {
      d.a(this.q, localStringBuilder);
    }
    for (;;)
    {
      localStringBuilder.append("}}");
      return localStringBuilder.toString();
      d.a(this.o, localStringBuilder);
    }
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/b/af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */