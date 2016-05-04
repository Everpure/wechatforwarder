package android.support.design.widget;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.support.design.b;
import android.support.v4.i.bu;
import android.support.v4.i.di;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public final class Snackbar
{
  private static final Handler a = new Handler(Looper.getMainLooper(), new az());
  private final ViewGroup b;
  private final Snackbar.SnackbarLayout c;
  private bj d;
  private final AccessibilityManager e;
  private final bo f;
  
  private void b(int paramInt)
  {
    bm.a().a(this.f, paramInt);
  }
  
  private void c(int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 14)
    {
      bu.q(this.c).c(this.c.getHeight()).a(a.b).a(250L).a(new bh(this, paramInt)).c();
      return;
    }
    Animation localAnimation = AnimationUtils.loadAnimation(this.c.getContext(), b.design_snackbar_out);
    localAnimation.setInterpolator(a.b);
    localAnimation.setDuration(250L);
    localAnimation.setAnimationListener(new ba(this, paramInt));
    this.c.startAnimation(localAnimation);
  }
  
  private void d()
  {
    if (Build.VERSION.SDK_INT >= 14)
    {
      bu.b(this.c, this.c.getHeight());
      bu.q(this.c).c(0.0F).a(a.b).a(250L).a(new bf(this)).c();
      return;
    }
    Animation localAnimation = AnimationUtils.loadAnimation(this.c.getContext(), b.design_snackbar_in);
    localAnimation.setInterpolator(a.b);
    localAnimation.setDuration(250L);
    localAnimation.setAnimationListener(new bg(this));
    this.c.startAnimation(localAnimation);
  }
  
  private void d(int paramInt)
  {
    bm.a().a(this.f);
    if (this.d != null) {
      this.d.a(this, paramInt);
    }
    ViewParent localViewParent = this.c.getParent();
    if ((localViewParent instanceof ViewGroup)) {
      ((ViewGroup)localViewParent).removeView(this.c);
    }
  }
  
  private void e()
  {
    bm.a().b(this.f);
    if (this.d != null) {
      this.d.a(this);
    }
  }
  
  final void a(int paramInt)
  {
    if (this.c.getVisibility() != 0)
    {
      d(paramInt);
      return;
    }
    c(paramInt);
  }
  
  public boolean a()
  {
    return bm.a().e(this.f);
  }
  
  final void b()
  {
    if (this.c.getParent() == null)
    {
      ViewGroup.LayoutParams localLayoutParams = this.c.getLayoutParams();
      if ((localLayoutParams instanceof v))
      {
        bi localbi = new bi(this);
        localbi.a(0.1F);
        localbi.b(0.6F);
        localbi.a(0);
        localbi.a(new bb(this));
        ((v)localLayoutParams).a(localbi);
      }
      this.b.addView(this.c);
    }
    this.c.setOnAttachStateChangeListener(new bc(this));
    if (bu.A(this.c))
    {
      d();
      return;
    }
    this.c.setOnLayoutChangeListener(new be(this));
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/design/widget/Snackbar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */