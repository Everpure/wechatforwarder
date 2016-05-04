package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.f.h;
import android.support.v4.i.a.a;
import android.support.v4.i.az;
import android.support.v4.i.bi;
import android.support.v4.i.bj;
import android.support.v4.i.bn;
import android.support.v4.i.bp;
import android.support.v4.i.bu;
import android.support.v4.i.ct;
import android.support.v4.widget.s;
import android.support.v7.e.b;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class RecyclerView
  extends ViewGroup
  implements bi, bn
{
  private static final Interpolator ao;
  private static final boolean j;
  private static final Class[] k;
  private boolean A;
  private boolean B;
  private int C;
  private boolean D;
  private final boolean E;
  private final AccessibilityManager F;
  private List G;
  private boolean H = false;
  private int I = 0;
  private s J;
  private s K;
  private s L;
  private s M;
  private int N = 0;
  private int O = -1;
  private VelocityTracker P;
  private int Q;
  private int R;
  private int S;
  private int T;
  private int U;
  private final int V;
  private final int W;
  final ex a = new ex(this);
  private float aa = Float.MIN_VALUE;
  private final fg ab = new fg(this);
  private ev ac;
  private List ad;
  private em ae = new eo(this, null);
  private boolean af = false;
  private fi ag;
  private ej ah;
  private final int[] ai = new int[2];
  private final bj aj;
  private final int[] ak = new int[2];
  private final int[] al = new int[2];
  private final int[] am = new int[2];
  private Runnable an = new eb(this);
  private final hf ap = new ed(this);
  ai b;
  ca c;
  final hd d = new hd();
  eq e;
  ek f = new cg();
  final fe g = new fe();
  boolean h = false;
  boolean i = false;
  private final ez l = new ez(this, null);
  private fa m;
  private boolean n;
  private final Runnable o = new ea(this);
  private final Rect p = new Rect();
  private eg q;
  private ey r;
  private final ArrayList s = new ArrayList();
  private final ArrayList t = new ArrayList();
  private eu u;
  private boolean v;
  private boolean w;
  private boolean x;
  private int y = 0;
  private boolean z;
  
  static
  {
    if ((Build.VERSION.SDK_INT == 18) || (Build.VERSION.SDK_INT == 19) || (Build.VERSION.SDK_INT == 20)) {}
    for (boolean bool = true;; bool = false)
    {
      j = bool;
      k = new Class[] { Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE };
      ao = new ec();
      return;
    }
  }
  
  public RecyclerView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public RecyclerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public RecyclerView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setScrollContainer(true);
    setFocusableInTouchMode(true);
    Object localObject;
    if (Build.VERSION.SDK_INT >= 16)
    {
      bool = true;
      this.E = bool;
      localObject = ViewConfiguration.get(paramContext);
      this.U = ((ViewConfiguration)localObject).getScaledTouchSlop();
      this.V = ((ViewConfiguration)localObject).getScaledMinimumFlingVelocity();
      this.W = ((ViewConfiguration)localObject).getScaledMaximumFlingVelocity();
      if (bu.a(this) != 2) {
        break label435;
      }
    }
    label435:
    for (boolean bool = true;; bool = false)
    {
      setWillNotDraw(bool);
      this.f.a(this.ae);
      a();
      s();
      if (bu.e(this) == 0) {
        bu.c(this, 1);
      }
      this.F = ((AccessibilityManager)getContext().getSystemService("accessibility"));
      setAccessibilityDelegateCompat(new fi(this));
      if (paramAttributeSet != null)
      {
        localObject = paramContext.obtainStyledAttributes(paramAttributeSet, b.RecyclerView, paramInt, 0);
        String str = ((TypedArray)localObject).getString(b.RecyclerView_layoutManager);
        ((TypedArray)localObject).recycle();
        a(paramContext, str, paramAttributeSet, paramInt, 0);
      }
      this.aj = new bj(this);
      setNestedScrollingEnabled(true);
      return;
      bool = false;
      break;
    }
  }
  
  private void A()
  {
    this.I -= 1;
    if (this.I < 1)
    {
      this.I = 0;
      B();
    }
  }
  
  private void B()
  {
    int i1 = this.C;
    this.C = 0;
    if ((i1 != 0) && (i()))
    {
      AccessibilityEvent localAccessibilityEvent = AccessibilityEvent.obtain();
      localAccessibilityEvent.setEventType(2048);
      a.a(localAccessibilityEvent, i1);
      sendAccessibilityEventUnchecked(localAccessibilityEvent);
    }
  }
  
  private void C()
  {
    if ((!this.af) && (this.v))
    {
      bu.a(this, this.an);
      this.af = true;
    }
  }
  
  private boolean D()
  {
    return (this.f != null) && (this.e.b());
  }
  
  private void E()
  {
    boolean bool2 = true;
    if (this.H)
    {
      this.b.a();
      o();
      this.e.a(this);
    }
    int i1;
    label58:
    fe localfe;
    if (D())
    {
      this.b.b();
      if ((!this.h) && (!this.i)) {
        break label179;
      }
      i1 = 1;
      localfe = this.g;
      if ((!this.x) || (this.f == null) || ((!this.H) && (i1 == 0) && (!eq.b(this.e))) || ((this.H) && (!this.q.b()))) {
        break label184;
      }
      bool1 = true;
      label118:
      fe.d(localfe, bool1);
      localfe = this.g;
      if ((!fe.c(this.g)) || (i1 == 0) || (this.H) || (!D())) {
        break label189;
      }
    }
    label179:
    label184:
    label189:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      fe.e(localfe, bool1);
      return;
      this.b.e();
      break;
      i1 = 0;
      break label58;
      bool1 = false;
      break label118;
    }
  }
  
  private void F()
  {
    boolean bool = true;
    this.g.a(1);
    fe.b(this.g, false);
    b();
    this.d.a();
    z();
    E();
    Object localObject = this.g;
    int i2;
    int i1;
    if ((fe.c(this.g)) && (this.i))
    {
      fe.f((fe)localObject, bool);
      this.i = false;
      this.h = false;
      fe.c(this.g, fe.b(this.g));
      this.g.a = this.q.a();
      a(this.ai);
      if (!fe.c(this.g)) {
        break label294;
      }
      i2 = this.c.b();
      i1 = 0;
      label137:
      if (i1 >= i2) {
        break label294;
      }
      localObject = c(this.c.b(i1));
      if ((!((fh)localObject).c()) && ((!((fh)localObject).n()) || (this.q.b()))) {
        break label194;
      }
    }
    label194:
    en localen;
    for (;;)
    {
      i1 += 1;
      break label137;
      bool = false;
      break;
      localen = this.f.a(this.g, (fh)localObject, ek.d((fh)localObject), ((fh)localObject).u());
      this.d.a((fh)localObject, localen);
      if ((fe.d(this.g)) && (((fh)localObject).x()) && (!((fh)localObject).q()) && (!((fh)localObject).c()) && (!((fh)localObject).n()))
      {
        long l1 = a((fh)localObject);
        this.d.a(l1, (fh)localObject);
      }
    }
    label294:
    if (fe.b(this.g))
    {
      m();
      bool = fe.e(this.g);
      fe.a(this.g, false);
      this.e.c(this.a, this.g);
      fe.a(this.g, bool);
      i1 = 0;
      if (i1 < this.c.b())
      {
        localObject = c(this.c.b(i1));
        if (((fh)localObject).c()) {}
        for (;;)
        {
          i1 += 1;
          break;
          if (!this.d.d((fh)localObject))
          {
            int i3 = ek.d((fh)localObject);
            bool = ((fh)localObject).a(8192);
            i2 = i3;
            if (!bool) {
              i2 = i3 | 0x1000;
            }
            localen = this.f.a(this.g, (fh)localObject, i2, ((fh)localObject).u());
            if (bool) {
              a((fh)localObject, localen);
            } else {
              this.d.b((fh)localObject, localen);
            }
          }
        }
      }
      n();
    }
    for (;;)
    {
      A();
      a(false);
      fe.b(this.g, 2);
      return;
      n();
    }
  }
  
  private void G()
  {
    b();
    z();
    this.g.a(6);
    this.b.e();
    this.g.a = this.q.a();
    fe.c(this.g, 0);
    fe.c(this.g, false);
    this.e.c(this.a, this.g);
    fe.a(this.g, false);
    this.m = null;
    fe localfe = this.g;
    if ((fe.c(this.g)) && (this.f != null)) {}
    for (boolean bool = true;; bool = false)
    {
      fe.d(localfe, bool);
      fe.b(this.g, 4);
      A();
      a(false);
      return;
    }
  }
  
  private void H()
  {
    this.g.a(4);
    b();
    z();
    fe.b(this.g, 1);
    if (fe.c(this.g))
    {
      int i1 = this.c.b() - 1;
      if (i1 >= 0)
      {
        fh localfh1 = c(this.c.b(i1));
        if (localfh1.c()) {}
        for (;;)
        {
          i1 -= 1;
          break;
          long l1 = a(localfh1);
          en localen2 = this.f.a(this.g, localfh1);
          fh localfh2 = this.d.a(l1);
          if ((localfh2 != null) && (!localfh2.c()))
          {
            boolean bool1 = this.d.a(localfh2);
            boolean bool2 = this.d.a(localfh1);
            if ((bool1) && (localfh2 == localfh1))
            {
              this.d.c(localfh1, localen2);
            }
            else
            {
              en localen1 = this.d.b(localfh2);
              this.d.c(localfh1, localen2);
              localen2 = this.d.c(localfh1);
              if (localen1 == null) {
                a(l1, localfh1, localfh2);
              } else {
                a(localfh2, localfh1, localen1, localen2, bool1, bool2);
              }
            }
          }
          else
          {
            this.d.c(localfh1, localen2);
          }
        }
      }
      this.d.a(this.ap);
    }
    this.e.b(this.a);
    fe.d(this.g, this.g.a);
    this.H = false;
    fe.d(this.g, false);
    fe.e(this.g, false);
    eq.a(this.e, false);
    if (ex.a(this.a) != null) {
      ex.a(this.a).clear();
    }
    A();
    a(false);
    this.d.a();
    if (j(this.ai[0], this.ai[1])) {
      h(0, 0);
    }
  }
  
  private void I()
  {
    if (this.H) {
      return;
    }
    this.H = true;
    int i2 = this.c.c();
    int i1 = 0;
    while (i1 < i2)
    {
      fh localfh = c(this.c.c(i1));
      if ((localfh != null) && (!localfh.c())) {
        localfh.b(512);
      }
      i1 += 1;
    }
    this.a.g();
  }
  
  private void J()
  {
    int i2 = this.c.b();
    int i1 = 0;
    while (i1 < i2)
    {
      View localView = this.c.b(i1);
      Object localObject = a(localView);
      if ((localObject != null) && (((fh)localObject).h != null))
      {
        localObject = ((fh)localObject).h.a;
        int i3 = localView.getLeft();
        int i4 = localView.getTop();
        if ((i3 != ((View)localObject).getLeft()) || (i4 != ((View)localObject).getTop())) {
          ((View)localObject).layout(i3, i4, ((View)localObject).getWidth() + i3, ((View)localObject).getHeight() + i4);
        }
      }
      i1 += 1;
    }
  }
  
  private String a(Context paramContext, String paramString)
  {
    if (paramString.charAt(0) == '.') {
      paramContext = paramContext.getPackageName() + paramString;
    }
    do
    {
      return paramContext;
      paramContext = paramString;
    } while (paramString.contains("."));
    return RecyclerView.class.getPackage().getName() + '.' + paramString;
  }
  
  private void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    int i2 = 1;
    int i3 = 0;
    int i1;
    if (paramFloat2 < 0.0F)
    {
      d();
      i1 = i3;
      if (this.J.a(-paramFloat2 / getWidth(), 1.0F - paramFloat3 / getHeight())) {
        i1 = 1;
      }
      if (paramFloat4 >= 0.0F) {
        break label158;
      }
      f();
      if (!this.K.a(-paramFloat4 / getHeight(), paramFloat1 / getWidth())) {
        break label196;
      }
    }
    for (;;)
    {
      if ((i2 != 0) || (paramFloat2 != 0.0F) || (paramFloat4 != 0.0F)) {
        bu.d(this);
      }
      return;
      i1 = i3;
      if (paramFloat2 <= 0.0F) {
        break;
      }
      e();
      i1 = i3;
      if (!this.L.a(paramFloat2 / getWidth(), paramFloat3 / getHeight())) {
        break;
      }
      i1 = 1;
      break;
      label158:
      if (paramFloat4 > 0.0F)
      {
        g();
        if (this.M.a(paramFloat4 / getHeight(), 1.0F - paramFloat1 / getWidth())) {}
      }
      else
      {
        label196:
        i2 = i1;
      }
    }
  }
  
  private void a(long paramLong, fh paramfh1, fh paramfh2)
  {
    int i2 = this.c.b();
    int i1 = 0;
    if (i1 < i2)
    {
      fh localfh = c(this.c.b(i1));
      if (localfh == paramfh1) {}
      while (a(localfh) != paramLong)
      {
        i1 += 1;
        break;
      }
      if ((this.q != null) && (this.q.b())) {
        throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + localfh + " \n View Holder 2:" + paramfh1);
      }
      throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + localfh + " \n View Holder 2:" + paramfh1);
    }
    Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + paramfh2 + " cannot be found but it is necessary for " + paramfh1);
  }
  
  private void a(Context paramContext, String paramString, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    if (paramString != null)
    {
      paramString = paramString.trim();
      if (paramString.length() != 0)
      {
        String str = a(paramContext, paramString);
        try
        {
          if (isInEditMode()) {}
          Class localClass;
          for (paramString = getClass().getClassLoader();; paramString = paramContext.getClassLoader())
          {
            localClass = paramString.loadClass(str).asSubclass(eq.class);
            try
            {
              paramString = localClass.getConstructor(k);
              Object[] arrayOfObject = new Object[4];
              arrayOfObject[0] = paramContext;
              arrayOfObject[1] = paramAttributeSet;
              arrayOfObject[2] = Integer.valueOf(paramInt1);
              arrayOfObject[3] = Integer.valueOf(paramInt2);
              paramContext = arrayOfObject;
            }
            catch (NoSuchMethodException paramContext)
            {
              try
              {
                paramString = localClass.getConstructor(new Class[0]);
                paramContext = null;
              }
              catch (NoSuchMethodException paramString)
              {
                paramString.initCause(paramContext);
                throw new IllegalStateException(paramAttributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, paramString);
              }
            }
            paramString.setAccessible(true);
            setLayoutManager((eq)paramString.newInstance(paramContext));
            return;
          }
          return;
        }
        catch (ClassNotFoundException paramContext)
        {
          throw new IllegalStateException(paramAttributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, paramContext);
        }
        catch (InvocationTargetException paramContext)
        {
          throw new IllegalStateException(paramAttributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, paramContext);
        }
        catch (InstantiationException paramContext)
        {
          throw new IllegalStateException(paramAttributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, paramContext);
        }
        catch (IllegalAccessException paramContext)
        {
          throw new IllegalStateException(paramAttributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, paramContext);
        }
        catch (ClassCastException paramContext)
        {
          throw new IllegalStateException(paramAttributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, paramContext);
        }
      }
    }
  }
  
  private void a(eg parameg, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.q != null)
    {
      this.q.b(this.l);
      this.q.b(this);
    }
    if ((!paramBoolean1) || (paramBoolean2))
    {
      if (this.f != null) {
        this.f.c();
      }
      if (this.e != null)
      {
        this.e.c(this.a);
        this.e.b(this.a);
      }
      this.a.a();
    }
    this.b.a();
    eg localeg = this.q;
    this.q = parameg;
    if (parameg != null)
    {
      parameg.a(this.l);
      parameg.a(this);
    }
    if (this.e != null) {
      this.e.a(localeg, this.q);
    }
    this.a.a(localeg, this.q, paramBoolean1);
    fe.a(this.g, true);
    o();
  }
  
  private void a(fh paramfh, en paramen)
  {
    paramfh.a(0, 8192);
    if ((fe.d(this.g)) && (paramfh.x()) && (!paramfh.q()) && (!paramfh.c()))
    {
      long l1 = a(paramfh);
      this.d.a(l1, paramfh);
    }
    this.d.a(paramfh, paramen);
  }
  
  private void a(fh paramfh, en paramen1, en paramen2)
  {
    paramfh.a(false);
    if (this.f.b(paramfh, paramen1, paramen2)) {
      C();
    }
  }
  
  private void a(fh paramfh1, fh paramfh2, en paramen1, en paramen2, boolean paramBoolean1, boolean paramBoolean2)
  {
    paramfh1.a(false);
    if (paramBoolean1) {
      b(paramfh1);
    }
    if (paramfh1 != paramfh2)
    {
      if (paramBoolean2) {
        b(paramfh2);
      }
      paramfh1.g = paramfh2;
      b(paramfh1);
      this.a.d(paramfh1);
      paramfh2.a(false);
      paramfh2.h = paramfh1;
    }
    if (this.f.a(paramfh1, paramfh2, paramen1, paramen2)) {
      C();
    }
  }
  
  private void a(int[] paramArrayOfInt)
  {
    int i6 = this.c.b();
    if (i6 == 0)
    {
      paramArrayOfInt[0] = 0;
      paramArrayOfInt[1] = 0;
      return;
    }
    int i1 = Integer.MAX_VALUE;
    int i4 = Integer.MIN_VALUE;
    int i3 = 0;
    fh localfh;
    if (i3 < i6)
    {
      localfh = c(this.c.b(i3));
      if (!localfh.c()) {}
    }
    for (;;)
    {
      i3 += 1;
      break;
      int i5 = localfh.d();
      int i2 = i1;
      if (i5 < i1) {
        i2 = i5;
      }
      if (i5 > i4)
      {
        i4 = i5;
        i1 = i2;
        continue;
        paramArrayOfInt[0] = i1;
        paramArrayOfInt[1] = i4;
      }
      else
      {
        i1 = i2;
      }
    }
  }
  
  private boolean a(MotionEvent paramMotionEvent)
  {
    int i2 = paramMotionEvent.getAction();
    if ((i2 == 3) || (i2 == 0)) {
      this.u = null;
    }
    int i3 = this.t.size();
    int i1 = 0;
    while (i1 < i3)
    {
      eu localeu = (eu)this.t.get(i1);
      if ((localeu.a(this, paramMotionEvent)) && (i2 != 3))
      {
        this.u = localeu;
        return true;
      }
      i1 += 1;
    }
    return false;
  }
  
  private void b(fh paramfh)
  {
    View localView = paramfh.a;
    if (localView.getParent() == this) {}
    for (int i1 = 1;; i1 = 0)
    {
      this.a.d(a(localView));
      if (!paramfh.r()) {
        break;
      }
      this.c.a(localView, -1, localView.getLayoutParams(), true);
      return;
    }
    if (i1 == 0)
    {
      this.c.a(localView, true);
      return;
    }
    this.c.d(localView);
  }
  
  private void b(fh paramfh, en paramen1, en paramen2)
  {
    b(paramfh);
    paramfh.a(false);
    if (this.f.a(paramfh, paramen1, paramen2)) {
      C();
    }
  }
  
  private boolean b(MotionEvent paramMotionEvent)
  {
    int i1 = paramMotionEvent.getAction();
    int i2;
    if (this.u != null)
    {
      if (i1 == 0) {
        this.u = null;
      }
    }
    else
    {
      if (i1 == 0) {
        break label108;
      }
      i2 = this.t.size();
      i1 = 0;
    }
    while (i1 < i2)
    {
      eu localeu = (eu)this.t.get(i1);
      if (localeu.a(this, paramMotionEvent))
      {
        this.u = localeu;
        return true;
        this.u.b(this, paramMotionEvent);
        if ((i1 == 3) || (i1 == 1)) {
          this.u = null;
        }
        return true;
      }
      i1 += 1;
    }
    label108:
    return false;
  }
  
  static fh c(View paramView)
  {
    if (paramView == null) {
      return null;
    }
    return ((es)paramView.getLayoutParams()).a;
  }
  
  private void c(MotionEvent paramMotionEvent)
  {
    int i1 = az.b(paramMotionEvent);
    if (az.b(paramMotionEvent, i1) == this.O) {
      if (i1 != 0) {
        break label75;
      }
    }
    label75:
    for (i1 = 1;; i1 = 0)
    {
      this.O = az.b(paramMotionEvent, i1);
      int i2 = (int)(az.c(paramMotionEvent, i1) + 0.5F);
      this.S = i2;
      this.Q = i2;
      i1 = (int)(az.d(paramMotionEvent, i1) + 0.5F);
      this.T = i1;
      this.R = i1;
      return;
    }
  }
  
  private boolean c(fh paramfh)
  {
    return (this.f == null) || (this.f.a(paramfh, paramfh.u()));
  }
  
  private int d(fh paramfh)
  {
    if ((paramfh.a(524)) || (!paramfh.p())) {
      return -1;
    }
    return this.b.c(paramfh.b);
  }
  
  private void e(int paramInt)
  {
    if (this.e == null) {
      return;
    }
    this.e.d(paramInt);
    awakenScrollBars();
  }
  
  private float getScrollFactor()
  {
    if (this.aa == Float.MIN_VALUE)
    {
      TypedValue localTypedValue = new TypedValue();
      if (getContext().getTheme().resolveAttribute(16842829, localTypedValue, true)) {
        this.aa = localTypedValue.getDimension(getContext().getResources().getDisplayMetrics());
      }
    }
    else
    {
      return this.aa;
    }
    return 0.0F;
  }
  
  private boolean h(View paramView)
  {
    b();
    boolean bool2 = this.c.f(paramView);
    if (bool2)
    {
      paramView = c(paramView);
      this.a.d(paramView);
      this.a.b(paramView);
    }
    if (!bool2) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      a(bool1);
      return bool2;
    }
  }
  
  private void i(int paramInt1, int paramInt2)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (this.J != null)
    {
      bool1 = bool2;
      if (!this.J.a())
      {
        bool1 = bool2;
        if (paramInt1 > 0) {
          bool1 = this.J.b();
        }
      }
    }
    bool2 = bool1;
    if (this.L != null)
    {
      bool2 = bool1;
      if (!this.L.a())
      {
        bool2 = bool1;
        if (paramInt1 < 0) {
          bool2 = bool1 | this.L.b();
        }
      }
    }
    bool1 = bool2;
    if (this.K != null)
    {
      bool1 = bool2;
      if (!this.K.a())
      {
        bool1 = bool2;
        if (paramInt2 > 0) {
          bool1 = bool2 | this.K.b();
        }
      }
    }
    bool2 = bool1;
    if (this.M != null)
    {
      bool2 = bool1;
      if (!this.M.a())
      {
        bool2 = bool1;
        if (paramInt2 < 0) {
          bool2 = bool1 | this.M.b();
        }
      }
    }
    if (bool2) {
      bu.d(this);
    }
  }
  
  private void i(View paramView)
  {
    fh localfh = c(paramView);
    f(paramView);
    if ((this.q != null) && (localfh != null)) {
      this.q.d(localfh);
    }
    if (this.G != null)
    {
      int i1 = this.G.size() - 1;
      while (i1 >= 0)
      {
        ((et)this.G.get(i1)).b(paramView);
        i1 -= 1;
      }
    }
  }
  
  private void j(View paramView)
  {
    fh localfh = c(paramView);
    e(paramView);
    if ((this.q != null) && (localfh != null)) {
      this.q.c(localfh);
    }
    if (this.G != null)
    {
      int i1 = this.G.size() - 1;
      while (i1 >= 0)
      {
        ((et)this.G.get(i1)).a(paramView);
        i1 -= 1;
      }
    }
  }
  
  private boolean j(int paramInt1, int paramInt2)
  {
    boolean bool2 = false;
    int i2 = this.c.b();
    boolean bool1;
    if (i2 == 0) {
      if (paramInt1 == 0)
      {
        bool1 = bool2;
        if (paramInt2 == 0) {}
      }
      else
      {
        bool1 = true;
      }
    }
    int i1;
    do
    {
      return bool1;
      i1 = 0;
      bool1 = bool2;
    } while (i1 >= i2);
    fh localfh = c(this.c.b(i1));
    if (localfh.c()) {}
    int i3;
    do
    {
      i1 += 1;
      break;
      i3 = localfh.d();
    } while ((i3 >= paramInt1) && (i3 <= paramInt2));
    return true;
  }
  
  private void s()
  {
    this.c = new ca(new ee(this));
  }
  
  private void setScrollState(int paramInt)
  {
    if (paramInt == this.N) {
      return;
    }
    this.N = paramInt;
    if (paramInt != 2) {
      v();
    }
    d(paramInt);
  }
  
  private void t()
  {
    if (!this.x) {}
    label106:
    do
    {
      do
      {
        return;
        if (this.H)
        {
          h.a("RV FullInvalidate");
          k();
          h.a();
          return;
        }
      } while (!this.b.d());
      if ((this.b.a(4)) && (!this.b.a(11)))
      {
        h.a("RV PartialInvalidate");
        b();
        this.b.b();
        if (!this.z)
        {
          if (!u()) {
            break label106;
          }
          k();
        }
        for (;;)
        {
          a(true);
          h.a();
          return;
          this.b.c();
        }
      }
    } while (!this.b.d());
    h.a("RV FullInvalidate");
    k();
    h.a();
  }
  
  private boolean u()
  {
    boolean bool2 = false;
    int i2 = this.c.b();
    int i1 = 0;
    boolean bool1 = bool2;
    if (i1 < i2)
    {
      fh localfh = c(this.c.b(i1));
      if ((localfh == null) || (localfh.c())) {}
      while (!localfh.x())
      {
        i1 += 1;
        break;
      }
      bool1 = true;
    }
    return bool1;
  }
  
  private void v()
  {
    this.ab.b();
    if (this.e != null) {
      this.e.E();
    }
  }
  
  private void w()
  {
    boolean bool2 = false;
    if (this.J != null) {
      bool2 = this.J.b();
    }
    boolean bool1 = bool2;
    if (this.K != null) {
      bool1 = bool2 | this.K.b();
    }
    bool2 = bool1;
    if (this.L != null) {
      bool2 = bool1 | this.L.b();
    }
    bool1 = bool2;
    if (this.M != null) {
      bool1 = bool2 | this.M.b();
    }
    if (bool1) {
      bu.d(this);
    }
  }
  
  private void x()
  {
    if (this.P != null) {
      this.P.clear();
    }
    stopNestedScroll();
    w();
  }
  
  private void y()
  {
    x();
    setScrollState(0);
  }
  
  private void z()
  {
    this.I += 1;
  }
  
  long a(fh paramfh)
  {
    if (this.q.b()) {
      return paramfh.g();
    }
    return paramfh.b;
  }
  
  fh a(int paramInt, boolean paramBoolean)
  {
    int i2 = this.c.c();
    int i1 = 0;
    while (i1 < i2)
    {
      fh localfh = c(this.c.c(i1));
      if ((localfh != null) && (!localfh.q())) {
        if (paramBoolean)
        {
          if (localfh.b != paramInt) {}
        }
        else {
          while (localfh.d() == paramInt) {
            return localfh;
          }
        }
      }
      i1 += 1;
    }
    return null;
  }
  
  public fh a(View paramView)
  {
    ViewParent localViewParent = paramView.getParent();
    if ((localViewParent != null) && (localViewParent != this)) {
      throw new IllegalArgumentException("View " + paramView + " is not a direct child of " + this);
    }
    return c(paramView);
  }
  
  void a()
  {
    this.b = new ai(new ef(this));
  }
  
  public void a(int paramInt)
  {
    int i2 = this.c.b();
    int i1 = 0;
    while (i1 < i2)
    {
      this.c.b(i1).offsetTopAndBottom(paramInt);
      i1 += 1;
    }
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    int i1 = 0;
    if (this.e == null) {
      Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
    }
    for (;;)
    {
      return;
      if (!this.A)
      {
        if (!this.e.d()) {
          paramInt1 = 0;
        }
        if (!this.e.e()) {
          paramInt2 = i1;
        }
        while ((paramInt1 != 0) || (paramInt2 != 0))
        {
          this.ab.b(paramInt1, paramInt2);
          return;
        }
      }
    }
  }
  
  void a(int paramInt1, int paramInt2, Object paramObject)
  {
    int i2 = this.c.c();
    int i1 = 0;
    if (i1 < i2)
    {
      View localView = this.c.c(i1);
      fh localfh = c(localView);
      if ((localfh == null) || (localfh.c())) {}
      for (;;)
      {
        i1 += 1;
        break;
        if ((localfh.b >= paramInt1) && (localfh.b < paramInt1 + paramInt2))
        {
          localfh.b(2);
          localfh.a(paramObject);
          ((es)localView.getLayoutParams()).c = true;
        }
      }
    }
    this.a.c(paramInt1, paramInt2);
  }
  
  void a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i2 = this.c.c();
    int i1 = 0;
    if (i1 < i2)
    {
      fh localfh = c(this.c.c(i1));
      if ((localfh != null) && (!localfh.c()))
      {
        if (localfh.b < paramInt1 + paramInt2) {
          break label83;
        }
        localfh.a(-paramInt2, paramBoolean);
        fe.a(this.g, true);
      }
      for (;;)
      {
        i1 += 1;
        break;
        label83:
        if (localfh.b >= paramInt1)
        {
          localfh.a(paramInt1 - 1, -paramInt2, paramBoolean);
          fe.a(this.g, true);
        }
      }
    }
    this.a.b(paramInt1, paramInt2, paramBoolean);
    requestLayout();
  }
  
  void a(String paramString)
  {
    if (j())
    {
      if (paramString == null) {
        throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling");
      }
      throw new IllegalStateException(paramString);
    }
  }
  
  void a(boolean paramBoolean)
  {
    if (this.y < 1) {
      this.y = 1;
    }
    if (!paramBoolean) {
      this.z = false;
    }
    if (this.y == 1)
    {
      if ((paramBoolean) && (this.z) && (!this.A) && (this.e != null) && (this.q != null)) {
        k();
      }
      if (!this.A) {
        this.z = false;
      }
    }
    this.y -= 1;
  }
  
  boolean a(int paramInt1, int paramInt2, MotionEvent paramMotionEvent)
  {
    boolean bool = false;
    t();
    int i2;
    int i1;
    int i3;
    int i4;
    if (this.q != null)
    {
      b();
      z();
      h.a("RV Scroll");
      if (paramInt1 != 0)
      {
        i2 = this.e.a(paramInt1, this.a, this.g);
        i1 = paramInt1 - i2;
        if (paramInt2 != 0)
        {
          i3 = this.e.b(paramInt2, this.a, this.g);
          i4 = paramInt2 - i3;
          label84:
          h.a();
          J();
          A();
          a(false);
          int i5 = i3;
          i3 = i1;
          i1 = i5;
        }
      }
    }
    for (;;)
    {
      if (!this.s.isEmpty()) {
        invalidate();
      }
      if (dispatchNestedScroll(i2, i1, i3, i4, this.ak))
      {
        this.S -= this.ak[0];
        this.T -= this.ak[1];
        if (paramMotionEvent != null) {
          paramMotionEvent.offsetLocation(this.ak[0], this.ak[1]);
        }
        paramMotionEvent = this.am;
        paramMotionEvent[0] += this.ak[0];
        paramMotionEvent = this.am;
        paramMotionEvent[1] += this.ak[1];
      }
      for (;;)
      {
        if ((i2 != 0) || (i1 != 0)) {
          h(i2, i1);
        }
        if (!awakenScrollBars()) {
          invalidate();
        }
        if ((i2 != 0) || (i1 != 0)) {
          bool = true;
        }
        return bool;
        if (bu.a(this) != 2)
        {
          if (paramMotionEvent != null) {
            a(paramMotionEvent.getX(), i3, paramMotionEvent.getY(), i4);
          }
          i(paramInt1, paramInt2);
        }
      }
      i3 = 0;
      i4 = 0;
      break label84;
      i2 = 0;
      i1 = 0;
      break;
      i1 = 0;
      i2 = 0;
      i4 = 0;
      i3 = 0;
    }
  }
  
  boolean a(AccessibilityEvent paramAccessibilityEvent)
  {
    boolean bool = false;
    int i2 = 0;
    if (j()) {
      if (paramAccessibilityEvent == null) {
        break label46;
      }
    }
    label46:
    for (int i1 = a.b(paramAccessibilityEvent);; i1 = 0)
    {
      if (i1 == 0) {
        i1 = i2;
      }
      for (;;)
      {
        this.C = (i1 | this.C);
        bool = true;
        return bool;
      }
    }
  }
  
  public void addFocusables(ArrayList paramArrayList, int paramInt1, int paramInt2)
  {
    if ((this.e == null) || (!this.e.a(this, paramArrayList, paramInt1, paramInt2))) {
      super.addFocusables(paramArrayList, paramInt1, paramInt2);
    }
  }
  
  public View b(View paramView)
  {
    for (ViewParent localViewParent = paramView.getParent(); (localViewParent != null) && (localViewParent != this) && ((localViewParent instanceof View)); localViewParent = paramView.getParent()) {
      paramView = (View)localViewParent;
    }
    if (localViewParent == this) {
      return paramView;
    }
    return null;
  }
  
  void b()
  {
    this.y += 1;
    if ((this.y == 1) && (!this.A)) {
      this.z = false;
    }
  }
  
  public void b(int paramInt)
  {
    int i2 = this.c.b();
    int i1 = 0;
    while (i1 < i2)
    {
      this.c.b(i1).offsetLeftAndRight(paramInt);
      i1 += 1;
    }
  }
  
  public boolean b(int paramInt1, int paramInt2)
  {
    if (this.e == null) {
      Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
    }
    boolean bool2;
    int i1;
    do
    {
      do
      {
        return false;
      } while (this.A);
      bool1 = this.e.d();
      bool2 = this.e.e();
      if (bool1)
      {
        i1 = paramInt1;
        if (Math.abs(paramInt1) >= this.V) {}
      }
      else
      {
        i1 = 0;
      }
      if (bool2)
      {
        paramInt1 = paramInt2;
        if (Math.abs(paramInt2) >= this.V) {}
      }
      else
      {
        paramInt1 = 0;
      }
    } while (((i1 == 0) && (paramInt1 == 0)) || (dispatchNestedPreFling(i1, paramInt1)));
    if ((bool1) || (bool2)) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      dispatchNestedFling(i1, paramInt1, bool1);
      if (!bool1) {
        break;
      }
      paramInt2 = Math.max(-this.W, Math.min(i1, this.W));
      paramInt1 = Math.max(-this.W, Math.min(paramInt1, this.W));
      this.ab.a(paramInt2, paramInt1);
      return true;
    }
  }
  
  public void c()
  {
    setScrollState(0);
    v();
  }
  
  public void c(int paramInt) {}
  
  void c(int paramInt1, int paramInt2)
  {
    if (paramInt1 < 0)
    {
      d();
      this.J.a(-paramInt1);
      if (paramInt2 >= 0) {
        break label69;
      }
      f();
      this.K.a(-paramInt2);
    }
    for (;;)
    {
      if ((paramInt1 != 0) || (paramInt2 != 0)) {
        bu.d(this);
      }
      return;
      if (paramInt1 <= 0) {
        break;
      }
      e();
      this.L.a(paramInt1);
      break;
      label69:
      if (paramInt2 > 0)
      {
        g();
        this.M.a(paramInt2);
      }
    }
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return ((paramLayoutParams instanceof es)) && (this.e.a((es)paramLayoutParams));
  }
  
  public int computeHorizontalScrollExtent()
  {
    if (this.e == null) {}
    while (!this.e.d()) {
      return 0;
    }
    return this.e.d(this.g);
  }
  
  public int computeHorizontalScrollOffset()
  {
    if (this.e == null) {}
    while (!this.e.d()) {
      return 0;
    }
    return this.e.b(this.g);
  }
  
  public int computeHorizontalScrollRange()
  {
    if (this.e == null) {}
    while (!this.e.d()) {
      return 0;
    }
    return this.e.f(this.g);
  }
  
  public int computeVerticalScrollExtent()
  {
    if (this.e == null) {}
    while (!this.e.e()) {
      return 0;
    }
    return this.e.e(this.g);
  }
  
  public int computeVerticalScrollOffset()
  {
    if (this.e == null) {}
    while (!this.e.e()) {
      return 0;
    }
    return this.e.c(this.g);
  }
  
  public int computeVerticalScrollRange()
  {
    if (this.e == null) {}
    while (!this.e.e()) {
      return 0;
    }
    return this.e.g(this.g);
  }
  
  public int d(View paramView)
  {
    paramView = c(paramView);
    if (paramView != null) {
      return paramView.d();
    }
    return -1;
  }
  
  void d()
  {
    if (this.J != null) {
      return;
    }
    this.J = new s(getContext());
    if (this.n)
    {
      this.J.a(getMeasuredHeight() - getPaddingTop() - getPaddingBottom(), getMeasuredWidth() - getPaddingLeft() - getPaddingRight());
      return;
    }
    this.J.a(getMeasuredHeight(), getMeasuredWidth());
  }
  
  void d(int paramInt)
  {
    if (this.e != null) {
      this.e.k(paramInt);
    }
    c(paramInt);
    if (this.ac != null) {
      this.ac.a(this, paramInt);
    }
    if (this.ad != null)
    {
      int i1 = this.ad.size() - 1;
      while (i1 >= 0)
      {
        ((ev)this.ad.get(i1)).a(this, paramInt);
        i1 -= 1;
      }
    }
  }
  
  void d(int paramInt1, int paramInt2)
  {
    setMeasuredDimension(eq.a(paramInt1, getPaddingLeft() + getPaddingRight(), bu.o(this)), eq.a(paramInt2, getPaddingTop() + getPaddingBottom(), bu.p(this)));
  }
  
  public boolean dispatchNestedFling(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    return this.aj.a(paramFloat1, paramFloat2, paramBoolean);
  }
  
  public boolean dispatchNestedPreFling(float paramFloat1, float paramFloat2)
  {
    return this.aj.a(paramFloat1, paramFloat2);
  }
  
  public boolean dispatchNestedPreScroll(int paramInt1, int paramInt2, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    return this.aj.a(paramInt1, paramInt2, paramArrayOfInt1, paramArrayOfInt2);
  }
  
  public boolean dispatchNestedScroll(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt)
  {
    return this.aj.a(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfInt);
  }
  
  protected void dispatchRestoreInstanceState(SparseArray paramSparseArray)
  {
    dispatchThawSelfOnly(paramSparseArray);
  }
  
  protected void dispatchSaveInstanceState(SparseArray paramSparseArray)
  {
    dispatchFreezeSelfOnly(paramSparseArray);
  }
  
  public void draw(Canvas paramCanvas)
  {
    int i3 = 1;
    int i4 = 0;
    super.draw(paramCanvas);
    int i2 = this.s.size();
    int i1 = 0;
    while (i1 < i2)
    {
      ((ep)this.s.get(i1)).b(paramCanvas, this, this.g);
      i1 += 1;
    }
    int i5;
    if ((this.J != null) && (!this.J.a()))
    {
      i5 = paramCanvas.save();
      if (this.n)
      {
        i1 = getPaddingBottom();
        paramCanvas.rotate(270.0F);
        paramCanvas.translate(i1 + -getHeight(), 0.0F);
        if ((this.J == null) || (!this.J.a(paramCanvas))) {
          break label456;
        }
        i2 = 1;
        label128:
        paramCanvas.restoreToCount(i5);
      }
    }
    for (;;)
    {
      i1 = i2;
      if (this.K != null)
      {
        i1 = i2;
        if (!this.K.a())
        {
          i5 = paramCanvas.save();
          if (this.n) {
            paramCanvas.translate(getPaddingLeft(), getPaddingTop());
          }
          if ((this.K == null) || (!this.K.a(paramCanvas))) {
            break label461;
          }
          i1 = 1;
          label202:
          i1 = i2 | i1;
          paramCanvas.restoreToCount(i5);
        }
      }
      i2 = i1;
      if (this.L != null)
      {
        i2 = i1;
        if (!this.L.a())
        {
          i5 = paramCanvas.save();
          int i6 = getWidth();
          if (!this.n) {
            break label466;
          }
          i2 = getPaddingTop();
          label257:
          paramCanvas.rotate(90.0F);
          paramCanvas.translate(-i2, -i6);
          if ((this.L == null) || (!this.L.a(paramCanvas))) {
            break label471;
          }
          i2 = 1;
          label295:
          i2 = i1 | i2;
          paramCanvas.restoreToCount(i5);
        }
      }
      i1 = i2;
      if (this.M != null)
      {
        i1 = i2;
        if (!this.M.a())
        {
          i5 = paramCanvas.save();
          paramCanvas.rotate(180.0F);
          if (!this.n) {
            break label476;
          }
          paramCanvas.translate(-getWidth() + getPaddingRight(), -getHeight() + getPaddingBottom());
          label372:
          i1 = i4;
          if (this.M != null)
          {
            i1 = i4;
            if (this.M.a(paramCanvas)) {
              i1 = 1;
            }
          }
          i1 = i2 | i1;
          paramCanvas.restoreToCount(i5);
        }
      }
      if ((i1 == 0) && (this.f != null) && (this.s.size() > 0) && (this.f.b())) {
        i1 = i3;
      }
      for (;;)
      {
        if (i1 != 0) {
          bu.d(this);
        }
        return;
        i1 = 0;
        break;
        label456:
        i2 = 0;
        break label128;
        label461:
        i1 = 0;
        break label202;
        label466:
        i2 = 0;
        break label257;
        label471:
        i2 = 0;
        break label295;
        label476:
        paramCanvas.translate(-getWidth(), -getHeight());
        break label372;
      }
      i2 = 0;
    }
  }
  
  public boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    return super.drawChild(paramCanvas, paramView, paramLong);
  }
  
  void e()
  {
    if (this.L != null) {
      return;
    }
    this.L = new s(getContext());
    if (this.n)
    {
      this.L.a(getMeasuredHeight() - getPaddingTop() - getPaddingBottom(), getMeasuredWidth() - getPaddingLeft() - getPaddingRight());
      return;
    }
    this.L.a(getMeasuredHeight(), getMeasuredWidth());
  }
  
  void e(int paramInt1, int paramInt2)
  {
    int i5 = this.c.c();
    int i1;
    int i2;
    if (paramInt1 < paramInt2)
    {
      i1 = -1;
      i2 = paramInt2;
    }
    fh localfh;
    for (int i3 = paramInt1;; i3 = paramInt2)
    {
      int i4 = 0;
      for (;;)
      {
        if (i4 >= i5) {
          break label131;
        }
        localfh = c(this.c.c(i4));
        if ((localfh != null) && (localfh.b >= i3) && (localfh.b <= i2)) {
          break;
        }
        i4 += 1;
      }
      i1 = 1;
      i2 = paramInt1;
    }
    if (localfh.b == paramInt1) {
      localfh.a(paramInt2 - paramInt1, false);
    }
    for (;;)
    {
      fe.a(this.g, true);
      break;
      localfh.a(i1, false);
    }
    label131:
    this.a.a(paramInt1, paramInt2);
    requestLayout();
  }
  
  public void e(View paramView) {}
  
  void f()
  {
    if (this.K != null) {
      return;
    }
    this.K = new s(getContext());
    if (this.n)
    {
      this.K.a(getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), getMeasuredHeight() - getPaddingTop() - getPaddingBottom());
      return;
    }
    this.K.a(getMeasuredWidth(), getMeasuredHeight());
  }
  
  void f(int paramInt1, int paramInt2)
  {
    int i2 = this.c.c();
    int i1 = 0;
    while (i1 < i2)
    {
      fh localfh = c(this.c.c(i1));
      if ((localfh != null) && (!localfh.c()) && (localfh.b >= paramInt1))
      {
        localfh.a(paramInt2, false);
        fe.a(this.g, true);
      }
      i1 += 1;
    }
    this.a.b(paramInt1, paramInt2);
    requestLayout();
  }
  
  public void f(View paramView) {}
  
  public View focusSearch(View paramView, int paramInt)
  {
    Object localObject2 = this.e.d(paramView, paramInt);
    if (localObject2 != null) {}
    Object localObject1;
    do
    {
      return (View)localObject2;
      localObject2 = FocusFinder.getInstance().findNextFocus(this, paramView, paramInt);
      localObject1 = localObject2;
      if (localObject2 == null)
      {
        localObject1 = localObject2;
        if (this.q != null)
        {
          localObject1 = localObject2;
          if (this.e != null)
          {
            localObject1 = localObject2;
            if (!j())
            {
              localObject1 = localObject2;
              if (!this.A)
              {
                b();
                localObject1 = this.e.a(paramView, paramInt, this.a, this.g);
                a(false);
              }
            }
          }
        }
      }
      localObject2 = localObject1;
    } while (localObject1 != null);
    return super.focusSearch(paramView, paramInt);
  }
  
  Rect g(View paramView)
  {
    es locales = (es)paramView.getLayoutParams();
    if (!locales.c) {
      return locales.b;
    }
    Rect localRect = locales.b;
    localRect.set(0, 0, 0, 0);
    int i2 = this.s.size();
    int i1 = 0;
    while (i1 < i2)
    {
      this.p.set(0, 0, 0, 0);
      ((ep)this.s.get(i1)).a(this.p, paramView, this, this.g);
      localRect.left += this.p.left;
      localRect.top += this.p.top;
      localRect.right += this.p.right;
      localRect.bottom += this.p.bottom;
      i1 += 1;
    }
    locales.c = false;
    return localRect;
  }
  
  void g()
  {
    if (this.M != null) {
      return;
    }
    this.M = new s(getContext());
    if (this.n)
    {
      this.M.a(getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), getMeasuredHeight() - getPaddingTop() - getPaddingBottom());
      return;
    }
    this.M.a(getMeasuredWidth(), getMeasuredHeight());
  }
  
  public void g(int paramInt1, int paramInt2) {}
  
  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    if (this.e == null) {
      throw new IllegalStateException("RecyclerView has no LayoutManager");
    }
    return this.e.a();
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    if (this.e == null) {
      throw new IllegalStateException("RecyclerView has no LayoutManager");
    }
    return this.e.a(getContext(), paramAttributeSet);
  }
  
  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    if (this.e == null) {
      throw new IllegalStateException("RecyclerView has no LayoutManager");
    }
    return this.e.a(paramLayoutParams);
  }
  
  public eg getAdapter()
  {
    return this.q;
  }
  
  public int getBaseline()
  {
    if (this.e != null) {
      return this.e.r();
    }
    return super.getBaseline();
  }
  
  protected int getChildDrawingOrder(int paramInt1, int paramInt2)
  {
    if (this.ah == null) {
      return super.getChildDrawingOrder(paramInt1, paramInt2);
    }
    return this.ah.a(paramInt1, paramInt2);
  }
  
  public fi getCompatAccessibilityDelegate()
  {
    return this.ag;
  }
  
  public ek getItemAnimator()
  {
    return this.f;
  }
  
  public eq getLayoutManager()
  {
    return this.e;
  }
  
  public int getMaxFlingVelocity()
  {
    return this.W;
  }
  
  public int getMinFlingVelocity()
  {
    return this.V;
  }
  
  public ew getRecycledViewPool()
  {
    return this.a.f();
  }
  
  public int getScrollState()
  {
    return this.N;
  }
  
  void h()
  {
    this.M = null;
    this.K = null;
    this.L = null;
    this.J = null;
  }
  
  void h(int paramInt1, int paramInt2)
  {
    int i1 = getScrollX();
    int i2 = getScrollY();
    onScrollChanged(i1, i2, i1, i2);
    g(paramInt1, paramInt2);
    if (this.ac != null) {
      this.ac.a(this, paramInt1, paramInt2);
    }
    if (this.ad != null)
    {
      i1 = this.ad.size() - 1;
      while (i1 >= 0)
      {
        ((ev)this.ad.get(i1)).a(this, paramInt1, paramInt2);
        i1 -= 1;
      }
    }
  }
  
  public boolean hasNestedScrollingParent()
  {
    return this.aj.b();
  }
  
  boolean i()
  {
    return (this.F != null) && (this.F.isEnabled());
  }
  
  public boolean isAttachedToWindow()
  {
    return this.v;
  }
  
  public boolean isNestedScrollingEnabled()
  {
    return this.aj.a();
  }
  
  public boolean j()
  {
    return this.I > 0;
  }
  
  void k()
  {
    if (this.q == null)
    {
      Log.e("RecyclerView", "No adapter attached; skipping layout");
      return;
    }
    if (this.e == null)
    {
      Log.e("RecyclerView", "No layout manager attached; skipping layout");
      return;
    }
    fe.b(this.g, false);
    if (fe.a(this.g) == 1)
    {
      F();
      this.e.f(this);
      G();
    }
    for (;;)
    {
      H();
      return;
      if ((this.b.f()) || (this.e.v() != getWidth()) || (this.e.w() != getHeight()))
      {
        this.e.f(this);
        G();
      }
      else
      {
        this.e.f(this);
      }
    }
  }
  
  void l()
  {
    int i2 = this.c.c();
    int i1 = 0;
    while (i1 < i2)
    {
      ((es)this.c.c(i1).getLayoutParams()).c = true;
      i1 += 1;
    }
    this.a.j();
  }
  
  void m()
  {
    int i2 = this.c.c();
    int i1 = 0;
    while (i1 < i2)
    {
      fh localfh = c(this.c.c(i1));
      if (!localfh.c()) {
        localfh.b();
      }
      i1 += 1;
    }
  }
  
  void n()
  {
    int i2 = this.c.c();
    int i1 = 0;
    while (i1 < i2)
    {
      fh localfh = c(this.c.c(i1));
      if (!localfh.c()) {
        localfh.a();
      }
      i1 += 1;
    }
    this.a.i();
  }
  
  void o()
  {
    int i2 = this.c.c();
    int i1 = 0;
    while (i1 < i2)
    {
      fh localfh = c(this.c.c(i1));
      if ((localfh != null) && (!localfh.c())) {
        localfh.b(6);
      }
      i1 += 1;
    }
    l();
    this.a.h();
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.I = 0;
    this.v = true;
    this.x = false;
    if (this.e != null) {
      this.e.c(this);
    }
    this.af = false;
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.f != null) {
      this.f.c();
    }
    this.x = false;
    c();
    this.v = false;
    if (this.e != null) {
      this.e.b(this, this.a);
    }
    removeCallbacks(this.an);
    this.d.b();
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    int i2 = this.s.size();
    int i1 = 0;
    while (i1 < i2)
    {
      ((ep)this.s.get(i1)).a(paramCanvas, this, this.g);
      i1 += 1;
    }
  }
  
  public boolean onGenericMotionEvent(MotionEvent paramMotionEvent)
  {
    if (this.e == null) {}
    label110:
    label113:
    for (;;)
    {
      return false;
      if ((!this.A) && ((az.d(paramMotionEvent) & 0x2) != 0) && (paramMotionEvent.getAction() == 8))
      {
        float f1;
        if (this.e.e())
        {
          f1 = -az.e(paramMotionEvent, 9);
          if (!this.e.d()) {
            break label110;
          }
        }
        for (float f2 = az.e(paramMotionEvent, 10);; f2 = 0.0F)
        {
          if ((f1 == 0.0F) && (f2 == 0.0F)) {
            break label113;
          }
          float f3 = getScrollFactor();
          a((int)(f2 * f3), (int)(f1 * f3), paramMotionEvent);
          return false;
          f1 = 0.0F;
          break;
        }
      }
    }
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int i3 = -1;
    boolean bool1 = true;
    if (this.A) {}
    do
    {
      return false;
      if (a(paramMotionEvent))
      {
        y();
        return true;
      }
    } while (this.e == null);
    boolean bool2 = this.e.d();
    boolean bool3 = this.e.e();
    if (this.P == null) {
      this.P = VelocityTracker.obtain();
    }
    this.P.addMovement(paramMotionEvent);
    int i2 = az.a(paramMotionEvent);
    int i1 = az.b(paramMotionEvent);
    switch (i2)
    {
    case 4: 
    default: 
      if (this.N == 1) {
        return bool1;
      }
      break;
    case 0: 
      label136:
      if (this.B) {
        this.B = false;
      }
      this.O = az.b(paramMotionEvent, 0);
      i1 = (int)(paramMotionEvent.getX() + 0.5F);
      this.S = i1;
      this.Q = i1;
      i1 = (int)(paramMotionEvent.getY() + 0.5F);
      this.T = i1;
      this.R = i1;
      if (this.N == 2)
      {
        getParent().requestDisallowInterceptTouchEvent(true);
        setScrollState(1);
      }
      paramMotionEvent = this.am;
      this.am[1] = 0;
      paramMotionEvent[0] = 0;
      if (!bool2) {}
      break;
    }
    for (i1 = 1;; i1 = 0)
    {
      i2 = i1;
      if (bool3) {
        i2 = i1 | 0x2;
      }
      startNestedScroll(i2);
      break;
      this.O = az.b(paramMotionEvent, i1);
      i2 = (int)(az.c(paramMotionEvent, i1) + 0.5F);
      this.S = i2;
      this.Q = i2;
      i1 = (int)(az.d(paramMotionEvent, i1) + 0.5F);
      this.T = i1;
      this.R = i1;
      break;
      i2 = az.a(paramMotionEvent, this.O);
      if (i2 < 0)
      {
        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.O + " not found. Did any MotionEvents get skipped?");
        return false;
      }
      i1 = (int)(az.c(paramMotionEvent, i2) + 0.5F);
      i2 = (int)(az.d(paramMotionEvent, i2) + 0.5F);
      if (this.N == 1) {
        break;
      }
      i1 -= this.Q;
      int i4 = i2 - this.R;
      int i5;
      if ((bool2) && (Math.abs(i1) > this.U))
      {
        i2 = this.Q;
        i5 = this.U;
        if (i1 < 0)
        {
          i1 = -1;
          label449:
          this.S = (i1 * i5 + i2);
        }
      }
      for (i1 = 1;; i1 = 0)
      {
        i2 = i1;
        if (bool3)
        {
          i2 = i1;
          if (Math.abs(i4) > this.U)
          {
            i2 = this.R;
            i5 = this.U;
            if (i4 >= 0) {
              break label530;
            }
          }
        }
        label530:
        for (i1 = i3;; i1 = 1)
        {
          this.T = (i2 + i1 * i5);
          i2 = 1;
          if (i2 == 0) {
            break;
          }
          setScrollState(1);
          break;
          i1 = 1;
          break label449;
        }
        c(paramMotionEvent);
        break;
        this.P.clear();
        stopNestedScroll();
        break;
        y();
        break;
        bool1 = false;
        break label136;
      }
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    h.a("RV OnLayout");
    k();
    h.a();
    this.x = true;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i2 = 0;
    if (this.e == null) {
      d(paramInt1, paramInt2);
    }
    do
    {
      int i1;
      do
      {
        return;
        if (!eq.a(this.e)) {
          break;
        }
        int i3 = View.MeasureSpec.getMode(paramInt1);
        int i4 = View.MeasureSpec.getMode(paramInt2);
        i1 = i2;
        if (i3 == 1073741824)
        {
          i1 = i2;
          if (i4 == 1073741824) {
            i1 = 1;
          }
        }
        this.e.a(this.a, this.g, paramInt1, paramInt2);
      } while ((i1 != 0) || (this.q == null));
      if (fe.a(this.g) == 1) {
        F();
      }
      this.e.a(paramInt1, paramInt2);
      fe.b(this.g, true);
      G();
      this.e.b(paramInt1, paramInt2);
    } while (!this.e.j());
    this.e.a(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
    fe.b(this.g, true);
    G();
    this.e.b(paramInt1, paramInt2);
    return;
    if (this.w)
    {
      this.e.a(this.a, this.g, paramInt1, paramInt2);
      return;
    }
    if (this.D)
    {
      b();
      E();
      if (fe.b(this.g))
      {
        fe.c(this.g, true);
        this.D = false;
        a(false);
      }
    }
    else
    {
      if (this.q == null) {
        break label342;
      }
    }
    label342:
    for (this.g.a = this.q.a();; this.g.a = 0)
    {
      b();
      this.e.a(this.a, this.g, paramInt1, paramInt2);
      a(false);
      fe.c(this.g, false);
      return;
      this.b.e();
      fe.c(this.g, false);
      break;
    }
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    this.m = ((fa)paramParcelable);
    super.onRestoreInstanceState(this.m.getSuperState());
    if ((this.e != null) && (this.m.a != null)) {
      this.e.a(this.m.a);
    }
  }
  
  protected Parcelable onSaveInstanceState()
  {
    fa localfa = new fa(super.onSaveInstanceState());
    if (this.m != null)
    {
      fa.a(localfa, this.m);
      return localfa;
    }
    if (this.e != null)
    {
      localfa.a = this.e.c();
      return localfa;
    }
    localfa.a = null;
    return localfa;
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if ((paramInt1 != paramInt3) || (paramInt2 != paramInt4)) {
      h();
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i7 = 0;
    if ((this.A) || (this.B)) {}
    do
    {
      return false;
      if (b(paramMotionEvent))
      {
        y();
        return true;
      }
    } while (this.e == null);
    boolean bool1 = this.e.d();
    boolean bool2 = this.e.e();
    if (this.P == null) {
      this.P = VelocityTracker.obtain();
    }
    MotionEvent localMotionEvent = MotionEvent.obtain(paramMotionEvent);
    int i3 = az.a(paramMotionEvent);
    int i2 = az.b(paramMotionEvent);
    if (i3 == 0)
    {
      int[] arrayOfInt = this.am;
      this.am[1] = 0;
      arrayOfInt[0] = 0;
    }
    localMotionEvent.offsetLocation(this.am[0], this.am[1]);
    int i1 = i7;
    switch (i3)
    {
    default: 
      i1 = i7;
    case 4: 
      if (i1 == 0) {
        this.P.addMovement(localMotionEvent);
      }
      localMotionEvent.recycle();
      return true;
    case 0: 
      this.O = az.b(paramMotionEvent, 0);
      i1 = (int)(paramMotionEvent.getX() + 0.5F);
      this.S = i1;
      this.Q = i1;
      i1 = (int)(paramMotionEvent.getY() + 0.5F);
      this.T = i1;
      this.R = i1;
      if (!bool1) {
        break;
      }
    }
    for (i1 = 1;; i1 = 0)
    {
      i2 = i1;
      if (bool2) {
        i2 = i1 | 0x2;
      }
      startNestedScroll(i2);
      i1 = i7;
      break;
      this.O = az.b(paramMotionEvent, i2);
      i1 = (int)(az.c(paramMotionEvent, i2) + 0.5F);
      this.S = i1;
      this.Q = i1;
      i1 = (int)(az.d(paramMotionEvent, i2) + 0.5F);
      this.T = i1;
      this.R = i1;
      i1 = i7;
      break;
      i1 = az.a(paramMotionEvent, this.O);
      if (i1 < 0)
      {
        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.O + " not found. Did any MotionEvents get skipped?");
        return false;
      }
      int i8 = (int)(az.c(paramMotionEvent, i1) + 0.5F);
      int i9 = (int)(az.d(paramMotionEvent, i1) + 0.5F);
      int i4 = this.S - i8;
      i3 = this.T - i9;
      i1 = i3;
      i2 = i4;
      if (dispatchNestedPreScroll(i4, i3, this.al, this.ak))
      {
        i2 = i4 - this.al[0];
        i1 = i3 - this.al[1];
        localMotionEvent.offsetLocation(this.ak[0], this.ak[1]);
        paramMotionEvent = this.am;
        paramMotionEvent[0] += this.ak[0];
        paramMotionEvent = this.am;
        paramMotionEvent[1] += this.ak[1];
      }
      i3 = i1;
      i4 = i2;
      if (this.N != 1)
      {
        if ((!bool1) || (Math.abs(i2) <= this.U)) {
          break label940;
        }
        if (i2 <= 0) {
          break label773;
        }
        i2 -= this.U;
      }
      label612:
      label662:
      label734:
      label773:
      label785:
      label803:
      label863:
      label924:
      label940:
      for (i3 = 1;; i3 = 0)
      {
        int i5 = i1;
        int i6 = i3;
        if (bool2)
        {
          i5 = i1;
          i6 = i3;
          if (Math.abs(i1) > this.U)
          {
            if (i1 <= 0) {
              break label785;
            }
            i5 = i1 - this.U;
            i6 = 1;
          }
        }
        i3 = i5;
        i4 = i2;
        if (i6 != 0)
        {
          setScrollState(1);
          i4 = i2;
          i3 = i5;
        }
        i1 = i7;
        if (this.N != 1) {
          break;
        }
        this.S = (i8 - this.ak[0]);
        this.T = (i9 - this.ak[1]);
        if (bool1) {
          if (!bool2) {
            break label803;
          }
        }
        for (;;)
        {
          i1 = i7;
          if (!a(i4, i3, localMotionEvent)) {
            break;
          }
          getParent().requestDisallowInterceptTouchEvent(true);
          i1 = i7;
          break;
          i2 += this.U;
          break label612;
          i5 = i1 + this.U;
          break label662;
          i4 = 0;
          break label734;
          i3 = 0;
        }
        c(paramMotionEvent);
        i1 = i7;
        break;
        this.P.addMovement(localMotionEvent);
        this.P.computeCurrentVelocity(1000, this.W);
        float f1;
        if (bool1)
        {
          f1 = -bp.a(this.P, this.O);
          if (!bool2) {
            break label924;
          }
        }
        for (float f2 = -bp.b(this.P, this.O);; f2 = 0.0F)
        {
          if (((f1 == 0.0F) && (f2 == 0.0F)) || (!b((int)f1, (int)f2))) {
            setScrollState(0);
          }
          x();
          i1 = 1;
          break;
          f1 = 0.0F;
          break label863;
        }
        y();
        i1 = i7;
        break;
      }
    }
  }
  
  public boolean p()
  {
    return (!this.x) || (this.H) || (this.b.d());
  }
  
  protected void removeDetachedView(View paramView, boolean paramBoolean)
  {
    fh localfh = c(paramView);
    if (localfh != null)
    {
      if (!localfh.r()) {
        break label32;
      }
      localfh.m();
    }
    label32:
    while (localfh.c())
    {
      i(paramView);
      super.removeDetachedView(paramView, paramBoolean);
      return;
    }
    throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + localfh);
  }
  
  public void requestChildFocus(View paramView1, View paramView2)
  {
    Object localObject;
    if ((!this.e.a(this, this.g, paramView1, paramView2)) && (paramView2 != null))
    {
      this.p.set(0, 0, paramView2.getWidth(), paramView2.getHeight());
      localObject = paramView2.getLayoutParams();
      if ((localObject instanceof es))
      {
        localObject = (es)localObject;
        if (!((es)localObject).c)
        {
          localObject = ((es)localObject).b;
          Rect localRect = this.p;
          localRect.left -= ((Rect)localObject).left;
          localRect = this.p;
          localRect.right += ((Rect)localObject).right;
          localRect = this.p;
          localRect.top -= ((Rect)localObject).top;
          localRect = this.p;
          int i1 = localRect.bottom;
          localRect.bottom = (((Rect)localObject).bottom + i1);
        }
      }
      offsetDescendantRectToMyCoords(paramView2, this.p);
      offsetRectIntoDescendantCoords(paramView1, this.p);
      localObject = this.p;
      if (this.x) {
        break label215;
      }
    }
    label215:
    for (boolean bool = true;; bool = false)
    {
      requestChildRectangleOnScreen(paramView1, (Rect)localObject, bool);
      super.requestChildFocus(paramView1, paramView2);
      return;
    }
  }
  
  public boolean requestChildRectangleOnScreen(View paramView, Rect paramRect, boolean paramBoolean)
  {
    return this.e.a(this, paramView, paramRect, paramBoolean);
  }
  
  public void requestDisallowInterceptTouchEvent(boolean paramBoolean)
  {
    int i2 = this.t.size();
    int i1 = 0;
    while (i1 < i2)
    {
      ((eu)this.t.get(i1)).a(paramBoolean);
      i1 += 1;
    }
    super.requestDisallowInterceptTouchEvent(paramBoolean);
  }
  
  public void requestLayout()
  {
    if ((this.y == 0) && (!this.A))
    {
      super.requestLayout();
      return;
    }
    this.z = true;
  }
  
  public void scrollBy(int paramInt1, int paramInt2)
  {
    if (this.e == null) {}
    boolean bool1;
    boolean bool2;
    do
    {
      Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
      do
      {
        return;
      } while (this.A);
      bool1 = this.e.d();
      bool2 = this.e.e();
    } while ((!bool1) && (!bool2));
    if (bool1) {
      if (!bool2) {
        break label74;
      }
    }
    for (;;)
    {
      a(paramInt1, paramInt2, null);
      return;
      paramInt1 = 0;
      break;
      label74:
      paramInt2 = 0;
    }
  }
  
  public void scrollTo(int paramInt1, int paramInt2)
  {
    Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
  }
  
  public void sendAccessibilityEventUnchecked(AccessibilityEvent paramAccessibilityEvent)
  {
    if (a(paramAccessibilityEvent)) {
      return;
    }
    super.sendAccessibilityEventUnchecked(paramAccessibilityEvent);
  }
  
  public void setAccessibilityDelegateCompat(fi paramfi)
  {
    this.ag = paramfi;
    bu.a(this, this.ag);
  }
  
  public void setAdapter(eg parameg)
  {
    setLayoutFrozen(false);
    a(parameg, false, true);
    requestLayout();
  }
  
  public void setChildDrawingOrderCallback(ej paramej)
  {
    if (paramej == this.ah) {
      return;
    }
    this.ah = paramej;
    if (this.ah != null) {}
    for (boolean bool = true;; bool = false)
    {
      setChildrenDrawingOrderEnabled(bool);
      return;
    }
  }
  
  public void setClipToPadding(boolean paramBoolean)
  {
    if (paramBoolean != this.n) {
      h();
    }
    this.n = paramBoolean;
    super.setClipToPadding(paramBoolean);
    if (this.x) {
      requestLayout();
    }
  }
  
  public void setHasFixedSize(boolean paramBoolean)
  {
    this.w = paramBoolean;
  }
  
  public void setItemAnimator(ek paramek)
  {
    if (this.f != null)
    {
      this.f.c();
      this.f.a(null);
    }
    this.f = paramek;
    if (this.f != null) {
      this.f.a(this.ae);
    }
  }
  
  public void setItemViewCacheSize(int paramInt)
  {
    this.a.a(paramInt);
  }
  
  public void setLayoutFrozen(boolean paramBoolean)
  {
    if (paramBoolean != this.A)
    {
      a("Do not setLayoutFrozen in layout or scroll");
      if (!paramBoolean)
      {
        this.A = false;
        if ((this.z) && (this.e != null) && (this.q != null)) {
          requestLayout();
        }
        this.z = false;
      }
    }
    else
    {
      return;
    }
    long l1 = SystemClock.uptimeMillis();
    onTouchEvent(MotionEvent.obtain(l1, l1, 3, 0.0F, 0.0F, 0));
    this.A = true;
    this.B = true;
    c();
  }
  
  public void setLayoutManager(eq parameq)
  {
    if (parameq == this.e) {
      return;
    }
    c();
    if (this.e != null)
    {
      if (this.v) {
        this.e.b(this, this.a);
      }
      this.e.b(null);
    }
    this.a.a();
    this.c.a();
    this.e = parameq;
    if (parameq != null)
    {
      if (parameq.q != null) {
        throw new IllegalArgumentException("LayoutManager " + parameq + " is already attached to a RecyclerView: " + parameq.q);
      }
      this.e.b(this);
      if (this.v) {
        this.e.c(this);
      }
    }
    requestLayout();
  }
  
  public void setNestedScrollingEnabled(boolean paramBoolean)
  {
    this.aj.a(paramBoolean);
  }
  
  @Deprecated
  public void setOnScrollListener(ev paramev)
  {
    this.ac = paramev;
  }
  
  public void setRecycledViewPool(ew paramew)
  {
    this.a.a(paramew);
  }
  
  public void setRecyclerListener(ey paramey)
  {
    this.r = paramey;
  }
  
  public void setScrollingTouchSlop(int paramInt)
  {
    ViewConfiguration localViewConfiguration = ViewConfiguration.get(getContext());
    switch (paramInt)
    {
    default: 
      Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + paramInt + "; using default value");
    case 0: 
      this.U = localViewConfiguration.getScaledTouchSlop();
      return;
    }
    this.U = ct.a(localViewConfiguration);
  }
  
  public void setViewCacheExtension(ff paramff)
  {
    this.a.a(paramff);
  }
  
  public boolean startNestedScroll(int paramInt)
  {
    return this.aj.a(paramInt);
  }
  
  public void stopNestedScroll()
  {
    this.aj.c();
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/RecyclerView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */