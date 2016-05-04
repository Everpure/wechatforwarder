package android.support.v7.a;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.b.bc;
import android.support.v4.i.ab;
import android.support.v4.i.bu;
import android.support.v4.i.di;
import android.support.v7.b.d;
import android.support.v7.b.g;
import android.support.v7.b.l;
import android.support.v7.view.c;
import android.support.v7.view.e;
import android.support.v7.view.f;
import android.support.v7.view.menu.j;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ContentFrameLayout;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.ViewStubCompat;
import android.support.v7.widget.ce;
import android.support.v7.widget.hh;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.Window;
import android.view.Window.Callback;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

class ae
  extends x
  implements android.support.v4.i.al, j
{
  private boolean A;
  private aq[] B;
  private aq C;
  private boolean D;
  private boolean E;
  private int F;
  private final Runnable G = new af(this);
  private boolean H;
  private Rect I;
  private Rect J;
  private at K;
  android.support.v7.view.b m;
  ActionBarContextView n;
  PopupWindow o;
  Runnable p;
  di q = null;
  private ce r;
  private am s;
  private ar t;
  private boolean u;
  private ViewGroup v;
  private TextView w;
  private View x;
  private boolean y;
  private boolean z;
  
  ae(Context paramContext, Window paramWindow, v paramv)
  {
    super(paramContext, paramWindow, paramv);
  }
  
  private aq a(int paramInt, boolean paramBoolean)
  {
    Object localObject2 = this.B;
    Object localObject1;
    if (localObject2 != null)
    {
      localObject1 = localObject2;
      if (localObject2.length > paramInt) {}
    }
    else
    {
      localObject1 = new aq[paramInt + 1];
      if (localObject2 != null) {
        System.arraycopy(localObject2, 0, localObject1, 0, localObject2.length);
      }
      this.B = ((aq[])localObject1);
    }
    localObject2 = localObject1[paramInt];
    if (localObject2 == null)
    {
      localObject2 = new aq(paramInt);
      localObject1[paramInt] = localObject2;
      return (aq)localObject2;
    }
    return (aq)localObject2;
  }
  
  private aq a(Menu paramMenu)
  {
    aq[] arrayOfaq = this.B;
    int i;
    int j;
    if (arrayOfaq != null)
    {
      i = arrayOfaq.length;
      j = 0;
    }
    for (;;)
    {
      if (j >= i) {
        break label57;
      }
      aq localaq = arrayOfaq[j];
      if ((localaq != null) && (localaq.j == paramMenu))
      {
        return localaq;
        i = 0;
        break;
      }
      j += 1;
    }
    label57:
    return null;
  }
  
  private void a(int paramInt, aq paramaq, Menu paramMenu)
  {
    Object localObject1 = paramaq;
    Object localObject2 = paramMenu;
    if (paramMenu == null)
    {
      aq localaq = paramaq;
      if (paramaq == null)
      {
        localaq = paramaq;
        if (paramInt >= 0)
        {
          localaq = paramaq;
          if (paramInt < this.B.length) {
            localaq = this.B[paramInt];
          }
        }
      }
      localObject1 = localaq;
      localObject2 = paramMenu;
      if (localaq != null)
      {
        localObject2 = localaq.j;
        localObject1 = localaq;
      }
    }
    if ((localObject1 != null) && (!((aq)localObject1).o)) {}
    while (n()) {
      return;
    }
    this.c.onPanelClosed(paramInt, (Menu)localObject2);
  }
  
  private void a(aq paramaq, KeyEvent paramKeyEvent)
  {
    int k = -1;
    if ((paramaq.o) || (n())) {}
    Object localObject;
    int i;
    label112:
    label117:
    label121:
    label123:
    do
    {
      do
      {
        for (;;)
        {
          return;
          if (paramaq.a == 0)
          {
            localObject = this.a;
            if ((((Context)localObject).getResources().getConfiguration().screenLayout & 0xF) != 4) {
              break label112;
            }
            i = 1;
            if (((Context)localObject).getApplicationInfo().targetSdkVersion < 11) {
              break label117;
            }
          }
          for (int j = 1;; j = 0)
          {
            if ((i != 0) && (j != 0)) {
              break label121;
            }
            localObject = o();
            if ((localObject == null) || (((Window.Callback)localObject).onMenuOpened(paramaq.a, paramaq.j))) {
              break label123;
            }
            a(paramaq, true);
            return;
            i = 0;
            break;
          }
        }
        localObject = (WindowManager)this.a.getSystemService("window");
      } while ((localObject == null) || (!b(paramaq, paramKeyEvent)));
      if ((paramaq.g != null) && (!paramaq.q)) {
        break label398;
      }
      if (paramaq.g != null) {
        break;
      }
    } while ((!a(paramaq)) || (paramaq.g == null));
    label187:
    if ((c(paramaq)) && (paramaq.a()))
    {
      paramKeyEvent = paramaq.h.getLayoutParams();
      if (paramKeyEvent != null) {
        break label434;
      }
      paramKeyEvent = new ViewGroup.LayoutParams(-2, -2);
    }
    label398:
    label434:
    for (;;)
    {
      i = paramaq.b;
      paramaq.g.setBackgroundResource(i);
      ViewParent localViewParent = paramaq.h.getParent();
      if ((localViewParent != null) && ((localViewParent instanceof ViewGroup))) {
        ((ViewGroup)localViewParent).removeView(paramaq.h);
      }
      paramaq.g.addView(paramaq.h, paramKeyEvent);
      if (!paramaq.h.hasFocus()) {
        paramaq.h.requestFocus();
      }
      i = -2;
      for (;;)
      {
        paramaq.n = false;
        paramKeyEvent = new WindowManager.LayoutParams(i, -2, paramaq.d, paramaq.e, 1002, 8519680, -3);
        paramKeyEvent.gravity = paramaq.c;
        paramKeyEvent.windowAnimations = paramaq.f;
        ((WindowManager)localObject).addView(paramaq.g, paramKeyEvent);
        paramaq.o = true;
        return;
        if ((!paramaq.q) || (paramaq.g.getChildCount() <= 0)) {
          break label187;
        }
        paramaq.g.removeAllViews();
        break label187;
        break;
        if (paramaq.i != null)
        {
          paramKeyEvent = paramaq.i.getLayoutParams();
          if (paramKeyEvent != null)
          {
            i = k;
            if (paramKeyEvent.width == -1) {
              continue;
            }
          }
        }
        i = -2;
      }
    }
  }
  
  private void a(aq paramaq, boolean paramBoolean)
  {
    if ((paramBoolean) && (paramaq.a == 0) && (this.r != null) && (this.r.e())) {
      b(paramaq.j);
    }
    do
    {
      return;
      WindowManager localWindowManager = (WindowManager)this.a.getSystemService("window");
      if ((localWindowManager != null) && (paramaq.o) && (paramaq.g != null))
      {
        localWindowManager.removeView(paramaq.g);
        if (paramBoolean) {
          a(paramaq.a, paramaq, null);
        }
      }
      paramaq.m = false;
      paramaq.n = false;
      paramaq.o = false;
      paramaq.h = null;
      paramaq.q = true;
    } while (this.C != paramaq);
    this.C = null;
  }
  
  private void a(android.support.v7.view.menu.i parami, boolean paramBoolean)
  {
    if ((this.r != null) && (this.r.d()) && ((!android.support.v4.i.ct.b(ViewConfiguration.get(this.a))) || (this.r.f())))
    {
      parami = o();
      if ((!this.r.e()) || (!paramBoolean)) {
        if ((parami != null) && (!n()))
        {
          if ((this.E) && ((this.F & 0x1) != 0))
          {
            this.b.getDecorView().removeCallbacks(this.G);
            this.G.run();
          }
          aq localaq = a(0, true);
          if ((localaq.j != null) && (!localaq.r) && (parami.onPreparePanel(0, localaq.i, localaq.j)))
          {
            parami.onMenuOpened(108, localaq.j);
            this.r.g();
          }
        }
      }
      do
      {
        return;
        this.r.h();
      } while (n());
      parami.onPanelClosed(108, a(0, true).j);
      return;
    }
    parami = a(0, true);
    parami.q = true;
    a(parami, false);
    a(parami, null);
  }
  
  private boolean a(aq paramaq)
  {
    paramaq.a(l());
    paramaq.g = new ap(this, paramaq.l);
    paramaq.c = 81;
    return true;
  }
  
  private boolean a(aq paramaq, int paramInt1, KeyEvent paramKeyEvent, int paramInt2)
  {
    boolean bool2 = false;
    boolean bool1 = false;
    if (paramKeyEvent.isSystem()) {
      bool2 = bool1;
    }
    do
    {
      do
      {
        do
        {
          return bool2;
          if (!paramaq.m)
          {
            bool1 = bool2;
            if (!b(paramaq, paramKeyEvent)) {}
          }
          else
          {
            bool1 = bool2;
            if (paramaq.j != null) {
              bool1 = paramaq.j.performShortcut(paramInt1, paramKeyEvent, paramInt2);
            }
          }
          bool2 = bool1;
        } while (!bool1);
        bool2 = bool1;
      } while ((paramInt2 & 0x1) != 0);
      bool2 = bool1;
    } while (this.r != null);
    a(paramaq, true);
    return bool1;
  }
  
  private boolean a(ViewParent paramViewParent)
  {
    if (paramViewParent == null) {
      return false;
    }
    View localView = this.b.getDecorView();
    for (;;)
    {
      if (paramViewParent == null) {
        return true;
      }
      if ((paramViewParent == localView) || (!(paramViewParent instanceof View)) || (bu.C((View)paramViewParent))) {
        return false;
      }
      paramViewParent = paramViewParent.getParent();
    }
  }
  
  private void b(android.support.v7.view.menu.i parami)
  {
    if (this.A) {
      return;
    }
    this.A = true;
    this.r.j();
    Window.Callback localCallback = o();
    if ((localCallback != null) && (!n())) {
      localCallback.onPanelClosed(108, parami);
    }
    this.A = false;
  }
  
  private boolean b(aq paramaq)
  {
    Context localContext = this.a;
    TypedValue localTypedValue;
    Resources.Theme localTheme;
    Object localObject1;
    if (((paramaq.a == 0) || (paramaq.a == 108)) && (this.r != null))
    {
      localTypedValue = new TypedValue();
      localTheme = localContext.getTheme();
      localTheme.resolveAttribute(android.support.v7.b.b.actionBarTheme, localTypedValue, true);
      localObject1 = null;
      if (localTypedValue.resourceId != 0)
      {
        localObject1 = localContext.getResources().newTheme();
        ((Resources.Theme)localObject1).setTo(localTheme);
        ((Resources.Theme)localObject1).applyStyle(localTypedValue.resourceId, true);
        ((Resources.Theme)localObject1).resolveAttribute(android.support.v7.b.b.actionBarWidgetTheme, localTypedValue, true);
        Object localObject2 = localObject1;
        if (localTypedValue.resourceId != 0)
        {
          localObject2 = localObject1;
          if (localObject1 == null)
          {
            localObject2 = localContext.getResources().newTheme();
            ((Resources.Theme)localObject2).setTo(localTheme);
          }
          ((Resources.Theme)localObject2).applyStyle(localTypedValue.resourceId, true);
        }
        if (localObject2 == null) {
          break label203;
        }
        localObject1 = new e(localContext, 0);
        ((Context)localObject1).getTheme().setTo((Resources.Theme)localObject2);
      }
    }
    for (;;)
    {
      localObject1 = new android.support.v7.view.menu.i((Context)localObject1);
      ((android.support.v7.view.menu.i)localObject1).a(this);
      paramaq.a((android.support.v7.view.menu.i)localObject1);
      return true;
      localTheme.resolveAttribute(android.support.v7.b.b.actionBarWidgetTheme, localTypedValue, true);
      break;
      label203:
      localObject1 = localContext;
    }
  }
  
  private boolean b(aq paramaq, KeyEvent paramKeyEvent)
  {
    if (n()) {
      return false;
    }
    if (paramaq.m) {
      return true;
    }
    if ((this.C != null) && (this.C != paramaq)) {
      a(this.C, false);
    }
    Window.Callback localCallback = o();
    if (localCallback != null) {
      paramaq.i = localCallback.onCreatePanelView(paramaq.a);
    }
    if ((paramaq.a == 0) || (paramaq.a == 108)) {}
    for (int i = 1;; i = 0)
    {
      if ((i != 0) && (this.r != null)) {
        this.r.i();
      }
      if ((paramaq.i != null) || ((i != 0) && ((k() instanceof av)))) {
        break label408;
      }
      if ((paramaq.j != null) && (!paramaq.r)) {
        break label278;
      }
      if ((paramaq.j == null) && ((!b(paramaq)) || (paramaq.j == null))) {
        break;
      }
      if ((i != 0) && (this.r != null))
      {
        if (this.s == null) {
          this.s = new am(this, null);
        }
        this.r.a(paramaq.j, this.s);
      }
      paramaq.j.g();
      if (localCallback.onCreatePanelMenu(paramaq.a, paramaq.j)) {
        break label273;
      }
      paramaq.a(null);
      if ((i == 0) || (this.r == null)) {
        break;
      }
      this.r.a(null, this.s);
      return false;
    }
    label273:
    paramaq.r = false;
    label278:
    paramaq.j.g();
    if (paramaq.s != null)
    {
      paramaq.j.b(paramaq.s);
      paramaq.s = null;
    }
    if (!localCallback.onPreparePanel(0, paramaq.i, paramaq.j))
    {
      if ((i != 0) && (this.r != null)) {
        this.r.a(null, this.s);
      }
      paramaq.j.h();
      return false;
    }
    if (paramKeyEvent != null)
    {
      i = paramKeyEvent.getDeviceId();
      if (KeyCharacterMap.load(i).getKeyboardType() == 1) {
        break label430;
      }
    }
    label408:
    label430:
    for (boolean bool = true;; bool = false)
    {
      paramaq.p = bool;
      paramaq.j.setQwertyMode(paramaq.p);
      paramaq.j.h();
      paramaq.m = true;
      paramaq.n = false;
      this.C = paramaq;
      return true;
      i = -1;
      break;
    }
  }
  
  private boolean c(aq paramaq)
  {
    if (paramaq.i != null)
    {
      paramaq.h = paramaq.i;
      return true;
    }
    if (paramaq.j == null) {
      return false;
    }
    if (this.t == null) {
      this.t = new ar(this, null);
    }
    paramaq.h = ((View)paramaq.a(this.t));
    if (paramaq.h != null) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  private void d(int paramInt)
  {
    a(a(paramInt, true), true);
  }
  
  private boolean d(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramKeyEvent.getRepeatCount() == 0)
    {
      aq localaq = a(paramInt, true);
      if (!localaq.o) {
        return b(localaq, paramKeyEvent);
      }
    }
    return false;
  }
  
  private void e(int paramInt)
  {
    this.F |= 1 << paramInt;
    if (!this.E)
    {
      bu.a(this.b.getDecorView(), this.G);
      this.E = true;
    }
  }
  
  private boolean e(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool2 = true;
    if (this.m != null) {
      return false;
    }
    aq localaq = a(paramInt, true);
    if ((paramInt == 0) && (this.r != null) && (this.r.d()) && (!android.support.v4.i.ct.b(ViewConfiguration.get(this.a)))) {
      if (!this.r.e())
      {
        if ((n()) || (!b(localaq, paramKeyEvent))) {
          break label229;
        }
        bool1 = this.r.g();
      }
    }
    for (;;)
    {
      if (bool1)
      {
        paramKeyEvent = (AudioManager)this.a.getSystemService("audio");
        if (paramKeyEvent == null) {
          break label216;
        }
        paramKeyEvent.playSoundEffect(0);
      }
      label122:
      return bool1;
      bool1 = this.r.h();
      continue;
      if ((!localaq.o) && (!localaq.n)) {
        break;
      }
      bool1 = localaq.o;
      a(localaq, true);
    }
    if (localaq.m)
    {
      if (!localaq.r) {
        break label234;
      }
      localaq.m = false;
    }
    label216:
    label229:
    label234:
    for (boolean bool1 = b(localaq, paramKeyEvent);; bool1 = true)
    {
      if (bool1)
      {
        a(localaq, paramKeyEvent);
        bool1 = bool2;
        break;
        Log.w("AppCompatDelegate", "Couldn't get audio manager");
        break label122;
      }
      bool1 = false;
      break;
    }
  }
  
  private void f(int paramInt)
  {
    aq localaq = a(paramInt, true);
    if (localaq.j != null)
    {
      Bundle localBundle = new Bundle();
      localaq.j.a(localBundle);
      if (localBundle.size() > 0) {
        localaq.s = localBundle;
      }
      localaq.j.g();
      localaq.j.clear();
    }
    localaq.r = true;
    localaq.q = true;
    if (((paramInt == 108) || (paramInt == 0)) && (this.r != null))
    {
      localaq = a(0, false);
      if (localaq != null)
      {
        localaq.m = false;
        b(localaq, null);
      }
    }
  }
  
  private int g(int paramInt)
  {
    int j = 1;
    int k = 1;
    int i1 = 0;
    Object localObject1;
    Object localObject2;
    int i;
    if ((this.n != null) && ((this.n.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)))
    {
      localObject1 = (ViewGroup.MarginLayoutParams)this.n.getLayoutParams();
      if (this.n.isShown())
      {
        if (this.I == null)
        {
          this.I = new Rect();
          this.J = new Rect();
        }
        localObject2 = this.I;
        Rect localRect = this.J;
        ((Rect)localObject2).set(0, paramInt, 0, 0);
        hh.a(this.v, (Rect)localObject2, localRect);
        if (localRect.top == 0)
        {
          i = paramInt;
          if (((ViewGroup.MarginLayoutParams)localObject1).topMargin == i) {
            break label355;
          }
          ((ViewGroup.MarginLayoutParams)localObject1).topMargin = paramInt;
          if (this.x != null) {
            break label279;
          }
          this.x = new View(this.a);
          this.x.setBackgroundColor(this.a.getResources().getColor(d.abc_input_method_navigation_guard));
          this.v.addView(this.x, -1, new ViewGroup.LayoutParams(-1, paramInt));
          i = 1;
          label201:
          if (this.x == null) {
            break label317;
          }
          label208:
          j = paramInt;
          if (!this.j)
          {
            j = paramInt;
            if (k != 0) {
              j = 0;
            }
          }
          paramInt = j;
          j = i;
          i = k;
          label233:
          if (j != 0) {
            this.n.setLayoutParams((ViewGroup.LayoutParams)localObject1);
          }
        }
      }
    }
    for (;;)
    {
      if (this.x != null)
      {
        localObject1 = this.x;
        if (i == 0) {
          break label342;
        }
      }
      label279:
      label317:
      label342:
      for (i = i1;; i = 8)
      {
        ((View)localObject1).setVisibility(i);
        return paramInt;
        i = 0;
        break;
        localObject2 = this.x.getLayoutParams();
        if (((ViewGroup.LayoutParams)localObject2).height != paramInt)
        {
          ((ViewGroup.LayoutParams)localObject2).height = paramInt;
          this.x.setLayoutParams((ViewGroup.LayoutParams)localObject2);
        }
        i = 1;
        break label201;
        k = 0;
        break label208;
        if (((ViewGroup.MarginLayoutParams)localObject1).topMargin == 0) {
          break label348;
        }
        ((ViewGroup.MarginLayoutParams)localObject1).topMargin = 0;
        i = 0;
        break label233;
      }
      label348:
      j = 0;
      i = 0;
      break label233;
      label355:
      i = 0;
      break label201;
      i = 0;
    }
  }
  
  private int h(int paramInt)
  {
    int i;
    if (paramInt == 8)
    {
      Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
      i = 108;
    }
    do
    {
      return i;
      i = paramInt;
    } while (paramInt != 9);
    Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
    return 109;
  }
  
  private void r()
  {
    if (!this.u)
    {
      this.v = s();
      Object localObject = p();
      if (!TextUtils.isEmpty((CharSequence)localObject)) {
        b((CharSequence)localObject);
      }
      t();
      a(this.v);
      this.u = true;
      localObject = a(0, false);
      if ((!n()) && ((localObject == null) || (((aq)localObject).j == null))) {
        e(108);
      }
    }
  }
  
  private ViewGroup s()
  {
    Object localObject = this.a.obtainStyledAttributes(l.AppCompatTheme);
    if (!((TypedArray)localObject).hasValue(l.AppCompatTheme_windowActionBar))
    {
      ((TypedArray)localObject).recycle();
      throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }
    if (((TypedArray)localObject).getBoolean(l.AppCompatTheme_windowNoTitle, false))
    {
      c(1);
      if (((TypedArray)localObject).getBoolean(l.AppCompatTheme_windowActionBarOverlay, false)) {
        c(109);
      }
      if (((TypedArray)localObject).getBoolean(l.AppCompatTheme_windowActionModeOverlay, false)) {
        c(10);
      }
      this.k = ((TypedArray)localObject).getBoolean(l.AppCompatTheme_android_windowIsFloating, false);
      ((TypedArray)localObject).recycle();
      localObject = LayoutInflater.from(this.a);
      if (this.l) {
        break label422;
      }
      if (!this.k) {
        break label263;
      }
      localObject = (ViewGroup)((LayoutInflater)localObject).inflate(android.support.v7.b.i.abc_dialog_title_material, null);
      this.i = false;
      this.h = false;
    }
    for (;;)
    {
      if (localObject == null)
      {
        throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.h + ", windowActionBarOverlay: " + this.i + ", android:windowIsFloating: " + this.k + ", windowActionModeOverlay: " + this.j + ", windowNoTitle: " + this.l + " }");
        if (!((TypedArray)localObject).getBoolean(l.AppCompatTheme_windowActionBar, false)) {
          break;
        }
        c(108);
        break;
        label263:
        if (!this.h) {
          break label626;
        }
        localObject = new TypedValue();
        this.a.getTheme().resolveAttribute(android.support.v7.b.b.actionBarTheme, (TypedValue)localObject, true);
        if (((TypedValue)localObject).resourceId != 0) {}
        for (localObject = new e(this.a, ((TypedValue)localObject).resourceId);; localObject = this.a)
        {
          localObject = (ViewGroup)LayoutInflater.from((Context)localObject).inflate(android.support.v7.b.i.abc_screen_toolbar, null);
          this.r = ((ce)((ViewGroup)localObject).findViewById(g.decor_content_parent));
          this.r.setWindowCallback(o());
          if (this.i) {
            this.r.a(109);
          }
          if (this.y) {
            this.r.a(2);
          }
          if (this.z) {
            this.r.a(5);
          }
          break;
        }
        label422:
        if (this.j) {}
        for (localObject = (ViewGroup)((LayoutInflater)localObject).inflate(android.support.v7.b.i.abc_screen_simple_overlay_action_mode, null);; localObject = (ViewGroup)((LayoutInflater)localObject).inflate(android.support.v7.b.i.abc_screen_simple, null))
        {
          if (Build.VERSION.SDK_INT < 21) {
            break label479;
          }
          bu.a((View)localObject, new ag(this));
          break;
        }
        label479:
        ((android.support.v7.widget.ct)localObject).setOnFitSystemWindowsListener(new ah(this));
        continue;
      }
      if (this.r == null) {
        this.w = ((TextView)((ViewGroup)localObject).findViewById(g.title));
      }
      hh.b((View)localObject);
      ViewGroup localViewGroup = (ViewGroup)this.b.findViewById(16908290);
      ContentFrameLayout localContentFrameLayout = (ContentFrameLayout)((ViewGroup)localObject).findViewById(g.action_bar_activity_content);
      while (localViewGroup.getChildCount() > 0)
      {
        View localView = localViewGroup.getChildAt(0);
        localViewGroup.removeViewAt(0);
        localContentFrameLayout.addView(localView);
      }
      this.b.setContentView((View)localObject);
      localViewGroup.setId(-1);
      localContentFrameLayout.setId(16908290);
      if ((localViewGroup instanceof FrameLayout)) {
        ((FrameLayout)localViewGroup).setForeground(null);
      }
      localContentFrameLayout.setAttachListener(new ai(this));
      return (ViewGroup)localObject;
      label626:
      localObject = null;
    }
  }
  
  private void t()
  {
    ContentFrameLayout localContentFrameLayout = (ContentFrameLayout)this.v.findViewById(16908290);
    Object localObject = this.b.getDecorView();
    localContentFrameLayout.a(((View)localObject).getPaddingLeft(), ((View)localObject).getPaddingTop(), ((View)localObject).getPaddingRight(), ((View)localObject).getPaddingBottom());
    localObject = this.a.obtainStyledAttributes(l.AppCompatTheme);
    ((TypedArray)localObject).getValue(l.AppCompatTheme_windowMinWidthMajor, localContentFrameLayout.getMinWidthMajor());
    ((TypedArray)localObject).getValue(l.AppCompatTheme_windowMinWidthMinor, localContentFrameLayout.getMinWidthMinor());
    if (((TypedArray)localObject).hasValue(l.AppCompatTheme_windowFixedWidthMajor)) {
      ((TypedArray)localObject).getValue(l.AppCompatTheme_windowFixedWidthMajor, localContentFrameLayout.getFixedWidthMajor());
    }
    if (((TypedArray)localObject).hasValue(l.AppCompatTheme_windowFixedWidthMinor)) {
      ((TypedArray)localObject).getValue(l.AppCompatTheme_windowFixedWidthMinor, localContentFrameLayout.getFixedWidthMinor());
    }
    if (((TypedArray)localObject).hasValue(l.AppCompatTheme_windowFixedHeightMajor)) {
      ((TypedArray)localObject).getValue(l.AppCompatTheme_windowFixedHeightMajor, localContentFrameLayout.getFixedHeightMajor());
    }
    if (((TypedArray)localObject).hasValue(l.AppCompatTheme_windowFixedHeightMinor)) {
      ((TypedArray)localObject).getValue(l.AppCompatTheme_windowFixedHeightMinor, localContentFrameLayout.getFixedHeightMinor());
    }
    ((TypedArray)localObject).recycle();
    localContentFrameLayout.requestLayout();
  }
  
  private void u()
  {
    if (this.q != null) {
      this.q.b();
    }
  }
  
  private void v()
  {
    if (this.u) {
      throw new AndroidRuntimeException("Window feature must be requested before adding content");
    }
  }
  
  private void w()
  {
    if (this.r != null) {
      this.r.j();
    }
    if (this.o != null)
    {
      this.b.getDecorView().removeCallbacks(this.p);
      if (!this.o.isShowing()) {}
    }
    try
    {
      this.o.dismiss();
      this.o = null;
      u();
      aq localaq = a(0, false);
      if ((localaq != null) && (localaq.j != null)) {
        localaq.j.close();
      }
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;) {}
    }
  }
  
  android.support.v7.view.b a(c paramc)
  {
    u();
    if (this.m != null) {
      this.m.c();
    }
    an localan = new an(this, paramc);
    if ((this.e != null) && (!n())) {}
    for (;;)
    {
      try
      {
        android.support.v7.view.b localb = this.e.a(localan);
        if (localb != null)
        {
          this.m = localb;
          if ((this.m != null) && (this.e != null)) {
            this.e.a(this.m);
          }
          return this.m;
        }
      }
      catch (AbstractMethodError localAbstractMethodError)
      {
        localObject1 = null;
        continue;
        Object localObject2;
        if (this.n == null)
        {
          if (!this.k) {
            continue;
          }
          localObject2 = new TypedValue();
          localObject1 = this.a.getTheme();
          ((Resources.Theme)localObject1).resolveAttribute(android.support.v7.b.b.actionBarTheme, (TypedValue)localObject2, true);
          if (((TypedValue)localObject2).resourceId != 0)
          {
            Resources.Theme localTheme = this.a.getResources().newTheme();
            localTheme.setTo((Resources.Theme)localObject1);
            localTheme.applyStyle(((TypedValue)localObject2).resourceId, true);
            localObject1 = new e(this.a, 0);
            ((Context)localObject1).getTheme().setTo(localTheme);
            this.n = new ActionBarContextView((Context)localObject1);
            this.o = new PopupWindow((Context)localObject1, null, android.support.v7.b.b.actionModePopupWindowStyle);
            android.support.v4.widget.ah.a(this.o, 2);
            this.o.setContentView(this.n);
            this.o.setWidth(-1);
            ((Context)localObject1).getTheme().resolveAttribute(android.support.v7.b.b.actionBarSize, (TypedValue)localObject2, true);
            int i = TypedValue.complexToDimensionPixelSize(((TypedValue)localObject2).data, ((Context)localObject1).getResources().getDisplayMetrics());
            this.n.setContentHeight(i);
            this.o.setHeight(-2);
            this.p = new aj(this);
          }
        }
        else
        {
          if (this.n == null) {
            continue;
          }
          u();
          this.n.c();
          localObject1 = this.n.getContext();
          localObject2 = this.n;
          if (this.o != null) {
            continue;
          }
          bool = true;
          localObject1 = new f((Context)localObject1, (ActionBarContextView)localObject2, localan, bool);
          if (!paramc.a((android.support.v7.view.b)localObject1, ((android.support.v7.view.b)localObject1).b())) {
            continue;
          }
          ((android.support.v7.view.b)localObject1).d();
          this.n.a((android.support.v7.view.b)localObject1);
          this.m = ((android.support.v7.view.b)localObject1);
          bu.c(this.n, 0.0F);
          this.q = bu.q(this.n).a(1.0F);
          this.q.a(new al(this));
          if (this.o == null) {
            continue;
          }
          this.b.getDecorView().post(this.p);
          continue;
        }
        localObject1 = this.a;
        continue;
        localObject1 = (ViewStubCompat)this.v.findViewById(g.action_mode_bar_stub);
        if (localObject1 == null) {
          continue;
        }
        ((ViewStubCompat)localObject1).setLayoutInflater(LayoutInflater.from(l()));
        this.n = ((ActionBarContextView)((ViewStubCompat)localObject1).a());
        continue;
        boolean bool = false;
        continue;
        this.m = null;
        continue;
      }
      Object localObject1 = null;
    }
  }
  
  public View a(int paramInt)
  {
    r();
    return this.b.findViewById(paramInt);
  }
  
  public final View a(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    View localView = b(paramView, paramString, paramContext, paramAttributeSet);
    if (localView != null) {
      return localView;
    }
    return c(paramView, paramString, paramContext, paramAttributeSet);
  }
  
  void a(int paramInt, Menu paramMenu)
  {
    if (paramInt == 108)
    {
      paramMenu = a();
      if (paramMenu != null) {
        paramMenu.f(false);
      }
    }
    do
    {
      do
      {
        return;
      } while (paramInt != 0);
      paramMenu = a(paramInt, true);
    } while (!paramMenu.o);
    a(paramMenu, false);
  }
  
  public void a(Configuration paramConfiguration)
  {
    if ((this.h) && (this.u))
    {
      a locala = a();
      if (locala != null) {
        locala.a(paramConfiguration);
      }
    }
  }
  
  public void a(Bundle paramBundle)
  {
    if (((this.c instanceof Activity)) && (bc.b((Activity)this.c) != null))
    {
      paramBundle = k();
      if (paramBundle == null) {
        this.H = true;
      }
    }
    else
    {
      return;
    }
    paramBundle.d(true);
  }
  
  public void a(android.support.v7.view.menu.i parami)
  {
    a(parami, true);
  }
  
  public void a(Toolbar paramToolbar)
  {
    if (!(this.c instanceof Activity)) {
      return;
    }
    a locala = a();
    if ((locala instanceof bg)) {
      throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
    }
    this.g = null;
    if (locala != null) {
      locala.h();
    }
    if (paramToolbar != null)
    {
      paramToolbar = new av(paramToolbar, ((Activity)this.a).getTitle(), this.d);
      this.f = paramToolbar;
      this.b.setCallback(paramToolbar.i());
    }
    for (;;)
    {
      e();
      return;
      this.f = null;
      this.b.setCallback(this.d);
    }
  }
  
  public void a(View paramView)
  {
    r();
    ViewGroup localViewGroup = (ViewGroup)this.v.findViewById(16908290);
    localViewGroup.removeAllViews();
    localViewGroup.addView(paramView);
    this.c.onContentChanged();
  }
  
  public void a(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    r();
    ViewGroup localViewGroup = (ViewGroup)this.v.findViewById(16908290);
    localViewGroup.removeAllViews();
    localViewGroup.addView(paramView, paramLayoutParams);
    this.c.onContentChanged();
  }
  
  void a(ViewGroup paramViewGroup) {}
  
  boolean a(int paramInt, KeyEvent paramKeyEvent)
  {
    Object localObject = a();
    if ((localObject != null) && (((a)localObject).a(paramInt, paramKeyEvent))) {}
    boolean bool;
    do
    {
      do
      {
        return true;
        if ((this.C == null) || (!a(this.C, paramKeyEvent.getKeyCode(), paramKeyEvent, 1))) {
          break;
        }
      } while (this.C == null);
      this.C.n = true;
      return true;
      if (this.C != null) {
        break;
      }
      localObject = a(0, true);
      b((aq)localObject, paramKeyEvent);
      bool = a((aq)localObject, paramKeyEvent.getKeyCode(), paramKeyEvent, 1);
      ((aq)localObject).m = false;
    } while (bool);
    return false;
  }
  
  public boolean a(android.support.v7.view.menu.i parami, MenuItem paramMenuItem)
  {
    Window.Callback localCallback = o();
    if ((localCallback != null) && (!n()))
    {
      parami = a(parami.p());
      if (parami != null) {
        return localCallback.onMenuItemSelected(parami.a, paramMenuItem);
      }
    }
    return false;
  }
  
  boolean a(KeyEvent paramKeyEvent)
  {
    int i = 1;
    if ((paramKeyEvent.getKeyCode() == 82) && (this.c.dispatchKeyEvent(paramKeyEvent))) {
      return true;
    }
    int j = paramKeyEvent.getKeyCode();
    if (paramKeyEvent.getAction() == 0) {}
    while (i != 0)
    {
      return c(j, paramKeyEvent);
      i = 0;
    }
    return b(j, paramKeyEvent);
  }
  
  public android.support.v7.view.b b(c paramc)
  {
    if (paramc == null) {
      throw new IllegalArgumentException("ActionMode callback can not be null.");
    }
    if (this.m != null) {
      this.m.c();
    }
    paramc = new an(this, paramc);
    a locala = a();
    if (locala != null)
    {
      this.m = locala.a(paramc);
      if ((this.m != null) && (this.e != null)) {
        this.e.a(this.m);
      }
    }
    if (this.m == null) {
      this.m = a(paramc);
    }
    return this.m;
  }
  
  View b(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    if ((this.c instanceof LayoutInflater.Factory))
    {
      paramView = ((LayoutInflater.Factory)this.c).onCreateView(paramString, paramContext, paramAttributeSet);
      if (paramView != null) {
        return paramView;
      }
    }
    return null;
  }
  
  public void b(int paramInt)
  {
    r();
    ViewGroup localViewGroup = (ViewGroup)this.v.findViewById(16908290);
    localViewGroup.removeAllViews();
    LayoutInflater.from(this.a).inflate(paramInt, localViewGroup);
    this.c.onContentChanged();
  }
  
  public void b(Bundle paramBundle)
  {
    r();
  }
  
  public void b(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    r();
    ((ViewGroup)this.v.findViewById(16908290)).addView(paramView, paramLayoutParams);
    this.c.onContentChanged();
  }
  
  void b(CharSequence paramCharSequence)
  {
    if (this.r != null) {
      this.r.setWindowTitle(paramCharSequence);
    }
    do
    {
      return;
      if (k() != null)
      {
        k().a(paramCharSequence);
        return;
      }
    } while (this.w == null);
    this.w.setText(paramCharSequence);
  }
  
  boolean b(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool1 = true;
    switch (paramInt)
    {
    }
    do
    {
      bool1 = false;
      boolean bool2;
      do
      {
        return bool1;
        e(0, paramKeyEvent);
        return true;
        bool2 = this.D;
        this.D = false;
        paramKeyEvent = a(0, false);
        if ((paramKeyEvent == null) || (!paramKeyEvent.o)) {
          break;
        }
      } while (bool2);
      a(paramKeyEvent, true);
      return true;
    } while (!q());
    return true;
  }
  
  boolean b(int paramInt, Menu paramMenu)
  {
    if (paramInt == 108)
    {
      paramMenu = a();
      if (paramMenu != null) {
        paramMenu.f(true);
      }
      return true;
    }
    return false;
  }
  
  public View c(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    boolean bool1;
    if (Build.VERSION.SDK_INT < 21)
    {
      bool1 = true;
      if (this.K == null) {
        this.K = new at();
      }
      if ((!bool1) || (!a((ViewParent)paramView))) {
        break label74;
      }
    }
    label74:
    for (boolean bool2 = true;; bool2 = false)
    {
      return this.K.a(paramView, paramString, paramContext, paramAttributeSet, bool2, bool1, true, bool1);
      bool1 = false;
      break;
    }
  }
  
  public void c()
  {
    a locala = a();
    if (locala != null) {
      locala.e(false);
    }
  }
  
  public boolean c(int paramInt)
  {
    paramInt = h(paramInt);
    if ((this.l) && (paramInt == 108)) {
      return false;
    }
    if ((this.h) && (paramInt == 1)) {
      this.h = false;
    }
    switch (paramInt)
    {
    default: 
      return this.b.requestFeature(paramInt);
    case 108: 
      v();
      this.h = true;
      return true;
    case 109: 
      v();
      this.i = true;
      return true;
    case 10: 
      v();
      this.j = true;
      return true;
    case 2: 
      v();
      this.y = true;
      return true;
    case 5: 
      v();
      this.z = true;
      return true;
    }
    v();
    this.l = true;
    return true;
  }
  
  boolean c(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    switch (paramInt)
    {
    default: 
      if (Build.VERSION.SDK_INT < 11) {
        a(paramInt, paramKeyEvent);
      }
      return false;
    case 82: 
      d(0, paramKeyEvent);
      return true;
    }
    if ((paramKeyEvent.getFlags() & 0x80) != 0) {}
    for (;;)
    {
      this.D = bool;
      break;
      bool = false;
    }
  }
  
  public void d()
  {
    a locala = a();
    if (locala != null) {
      locala.e(true);
    }
  }
  
  public void e()
  {
    a locala = a();
    if ((locala != null) && (locala.e())) {
      return;
    }
    e(0);
  }
  
  public void f()
  {
    super.f();
    if (this.f != null)
    {
      this.f.h();
      this.f = null;
    }
  }
  
  public void g()
  {
    LayoutInflater localLayoutInflater = LayoutInflater.from(this.a);
    if (localLayoutInflater.getFactory() == null) {
      ab.a(localLayoutInflater, this);
    }
    while ((ab.a(localLayoutInflater) instanceof ae)) {
      return;
    }
    Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
  }
  
  public void j()
  {
    r();
    if ((!this.h) || (this.f != null)) {}
    for (;;)
    {
      return;
      if ((this.c instanceof Activity)) {
        this.f = new bg((Activity)this.c, this.i);
      }
      while (this.f != null)
      {
        this.f.d(this.H);
        return;
        if ((this.c instanceof Dialog)) {
          this.f = new bg((Dialog)this.c);
        }
      }
    }
  }
  
  boolean q()
  {
    if (this.m != null) {
      this.m.c();
    }
    a locala;
    do
    {
      return true;
      locala = a();
    } while ((locala != null) && (locala.f()));
    return false;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/a/ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */