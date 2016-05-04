package android.support.v7.widget;

import android.annotation.TargetApi;
import android.app.SearchableInfo;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.widget.m;
import android.support.v7.b.e;
import android.support.v7.view.d;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import java.util.WeakHashMap;

public class SearchView
  extends cz
  implements d
{
  static final fu a;
  private static final boolean b;
  private boolean A;
  private boolean B;
  private int C;
  private boolean D;
  private CharSequence E;
  private boolean F;
  private int G;
  private SearchableInfo H;
  private Bundle I;
  private Runnable J;
  private final Runnable K;
  private Runnable L;
  private final WeakHashMap M;
  private final SearchView.SearchAutoComplete c;
  private final View d;
  private final View e;
  private final ImageView f;
  private final ImageView g;
  private final ImageView h;
  private final ImageView i;
  private final ImageView j;
  private final Drawable k;
  private final int l;
  private final int m;
  private final Intent n;
  private final Intent o;
  private final CharSequence p;
  private fw q;
  private fv r;
  private View.OnFocusChangeListener s;
  private fx t;
  private View.OnClickListener u;
  private boolean v;
  private boolean w;
  private m x;
  private boolean y;
  private CharSequence z;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 8) {}
    for (boolean bool = true;; bool = false)
    {
      b = bool;
      a = new fu();
      return;
    }
  }
  
  private Intent a(String paramString1, Uri paramUri, String paramString2, String paramString3, int paramInt, String paramString4)
  {
    paramString1 = new Intent(paramString1);
    paramString1.addFlags(268435456);
    if (paramUri != null) {
      paramString1.setData(paramUri);
    }
    paramString1.putExtra("user_query", this.E);
    if (paramString3 != null) {
      paramString1.putExtra("query", paramString3);
    }
    if (paramString2 != null) {
      paramString1.putExtra("intent_extra_data_key", paramString2);
    }
    if (this.I != null) {
      paramString1.putExtra("app_data", this.I);
    }
    if (paramInt != 0)
    {
      paramString1.putExtra("action_key", paramInt);
      paramString1.putExtra("action_msg", paramString4);
    }
    if (b) {
      paramString1.setComponent(this.H.getSearchActivity());
    }
    return paramString1;
  }
  
  private void a(int paramInt, String paramString1, String paramString2)
  {
    paramString1 = a("android.intent.action.SEARCH", null, null, paramString2, paramInt, paramString1);
    getContext().startActivity(paramString1);
  }
  
  private void a(boolean paramBoolean)
  {
    boolean bool2 = true;
    int i2 = 8;
    this.w = paramBoolean;
    int i1;
    boolean bool1;
    if (paramBoolean)
    {
      i1 = 0;
      if (TextUtils.isEmpty(this.c.getText())) {
        break label123;
      }
      bool1 = true;
      label33:
      this.f.setVisibility(i1);
      b(bool1);
      View localView = this.d;
      if (!paramBoolean) {
        break label129;
      }
      i1 = 8;
      label60:
      localView.setVisibility(i1);
      i1 = i2;
      if (this.j.getDrawable() != null)
      {
        if (!this.v) {
          break label134;
        }
        i1 = i2;
      }
      label87:
      this.j.setVisibility(i1);
      h();
      if (bool1) {
        break label139;
      }
    }
    label123:
    label129:
    label134:
    label139:
    for (paramBoolean = bool2;; paramBoolean = false)
    {
      c(paramBoolean);
      g();
      return;
      i1 = 8;
      break;
      bool1 = false;
      break label33;
      i1 = 0;
      break label60;
      i1 = 0;
      break label87;
    }
  }
  
  static boolean a(Context paramContext)
  {
    return paramContext.getResources().getConfiguration().orientation == 2;
  }
  
  private CharSequence b(CharSequence paramCharSequence)
  {
    if ((!this.v) || (this.k == null)) {
      return paramCharSequence;
    }
    int i1 = (int)(this.c.getTextSize() * 1.25D);
    this.k.setBounds(0, 0, i1, i1);
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder("   ");
    localSpannableStringBuilder.setSpan(new ImageSpan(this.k), 1, 2, 33);
    localSpannableStringBuilder.append(paramCharSequence);
    return localSpannableStringBuilder;
  }
  
  private void b(boolean paramBoolean)
  {
    int i2 = 8;
    int i1 = i2;
    if (this.y)
    {
      i1 = i2;
      if (f())
      {
        i1 = i2;
        if (hasFocus()) {
          if (!paramBoolean)
          {
            i1 = i2;
            if (this.D) {}
          }
          else
          {
            i1 = 0;
          }
        }
      }
    }
    this.g.setVisibility(i1);
  }
  
  private void c(boolean paramBoolean)
  {
    int i1;
    if ((this.D) && (!c()) && (paramBoolean))
    {
      i1 = 0;
      this.g.setVisibility(8);
    }
    for (;;)
    {
      this.i.setVisibility(i1);
      return;
      i1 = 8;
    }
  }
  
  @TargetApi(8)
  private boolean e()
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    Intent localIntent;
    if (this.H != null)
    {
      bool1 = bool2;
      if (this.H.getVoiceSearchEnabled())
      {
        localIntent = null;
        if (!this.H.getVoiceSearchLaunchWebSearch()) {
          break label69;
        }
        localIntent = this.n;
      }
    }
    for (;;)
    {
      bool1 = bool2;
      if (localIntent != null)
      {
        bool1 = bool2;
        if (getContext().getPackageManager().resolveActivity(localIntent, 65536) != null) {
          bool1 = true;
        }
      }
      return bool1;
      label69:
      if (this.H.getVoiceSearchLaunchRecognizer()) {
        localIntent = this.o;
      }
    }
  }
  
  private boolean f()
  {
    return ((this.y) || (this.D)) && (!c());
  }
  
  private void g()
  {
    int i2 = 8;
    int i1 = i2;
    if (f()) {
      if (this.g.getVisibility() != 0)
      {
        i1 = i2;
        if (this.i.getVisibility() != 0) {}
      }
      else
      {
        i1 = 0;
      }
    }
    this.e.setVisibility(i1);
  }
  
  private int getPreferredWidth()
  {
    return getContext().getResources().getDimensionPixelSize(e.abc_search_view_preferred_width);
  }
  
  private void h()
  {
    int i4 = 1;
    int i3 = 0;
    int i1;
    int i2;
    label44:
    label56:
    Drawable localDrawable;
    if (!TextUtils.isEmpty(this.c.getText()))
    {
      i1 = 1;
      i2 = i4;
      if (i1 == 0)
      {
        if ((!this.v) || (this.F)) {
          break label99;
        }
        i2 = i4;
      }
      localObject = this.h;
      if (i2 == 0) {
        break label104;
      }
      i2 = i3;
      ((ImageView)localObject).setVisibility(i2);
      localDrawable = this.h.getDrawable();
      if (localDrawable != null) {
        if (i1 == 0) {
          break label110;
        }
      }
    }
    label99:
    label104:
    label110:
    for (Object localObject = ENABLED_STATE_SET;; localObject = EMPTY_STATE_SET)
    {
      localDrawable.setState((int[])localObject);
      return;
      i1 = 0;
      break;
      i2 = 0;
      break label44;
      i2 = 8;
      break label56;
    }
  }
  
  private void i()
  {
    post(this.K);
  }
  
  private void k()
  {
    CharSequence localCharSequence = getQueryHint();
    SearchView.SearchAutoComplete localSearchAutoComplete = this.c;
    Object localObject = localCharSequence;
    if (localCharSequence == null) {
      localObject = "";
    }
    localSearchAutoComplete.setHint(b((CharSequence)localObject));
  }
  
  @TargetApi(8)
  private void l()
  {
    int i2 = 1;
    this.c.setThreshold(this.H.getSuggestThreshold());
    this.c.setImeOptions(this.H.getImeOptions());
    int i3 = this.H.getInputType();
    int i1 = i3;
    if ((i3 & 0xF) == 1)
    {
      i3 &= 0xFFFEFFFF;
      i1 = i3;
      if (this.H.getSuggestAuthority() != null) {
        i1 = i3 | 0x10000 | 0x80000;
      }
    }
    this.c.setInputType(i1);
    if (this.x != null) {
      this.x.a(null);
    }
    if (this.H.getSuggestAuthority() != null)
    {
      this.x = new gk(getContext(), this, this.H, this.M);
      this.c.setAdapter(this.x);
      gk localgk = (gk)this.x;
      i1 = i2;
      if (this.A) {
        i1 = 2;
      }
      localgk.a(i1);
    }
  }
  
  private void m()
  {
    Editable localEditable = this.c.getText();
    if ((localEditable != null) && (TextUtils.getTrimmedLength(localEditable) > 0) && ((this.q == null) || (!this.q.a(localEditable.toString()))))
    {
      if (this.H != null) {
        a(0, null, localEditable.toString());
      }
      setImeVisibility(false);
      n();
    }
  }
  
  private void n()
  {
    this.c.dismissDropDown();
  }
  
  private void o()
  {
    if (TextUtils.isEmpty(this.c.getText()))
    {
      if ((this.v) && ((this.r == null) || (!this.r.a())))
      {
        clearFocus();
        a(true);
      }
      return;
    }
    this.c.setText("");
    this.c.requestFocus();
    setImeVisibility(true);
  }
  
  private void p()
  {
    a(false);
    this.c.requestFocus();
    setImeVisibility(true);
    if (this.u != null) {
      this.u.onClick(this);
    }
  }
  
  private void q()
  {
    a.a(this.c);
    a.b(this.c);
  }
  
  private void setImeVisibility(boolean paramBoolean)
  {
    if (paramBoolean) {
      post(this.J);
    }
    InputMethodManager localInputMethodManager;
    do
    {
      return;
      removeCallbacks(this.J);
      localInputMethodManager = (InputMethodManager)getContext().getSystemService("input_method");
    } while (localInputMethodManager == null);
    localInputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
  }
  
  private void setQuery(CharSequence paramCharSequence)
  {
    this.c.setText(paramCharSequence);
    SearchView.SearchAutoComplete localSearchAutoComplete = this.c;
    if (TextUtils.isEmpty(paramCharSequence)) {}
    for (int i1 = 0;; i1 = paramCharSequence.length())
    {
      localSearchAutoComplete.setSelection(i1);
      return;
    }
  }
  
  public void a()
  {
    if (this.F) {
      return;
    }
    this.F = true;
    this.G = this.c.getImeOptions();
    this.c.setImeOptions(this.G | 0x2000000);
    this.c.setText("");
    setIconified(false);
  }
  
  void a(CharSequence paramCharSequence)
  {
    setQuery(paramCharSequence);
  }
  
  public void a(CharSequence paramCharSequence, boolean paramBoolean)
  {
    this.c.setText(paramCharSequence);
    if (paramCharSequence != null)
    {
      this.c.setSelection(this.c.length());
      this.E = paramCharSequence;
    }
    if ((paramBoolean) && (!TextUtils.isEmpty(paramCharSequence))) {
      m();
    }
  }
  
  public void b()
  {
    a("", false);
    clearFocus();
    a(true);
    this.c.setImeOptions(this.G);
    this.F = false;
  }
  
  public boolean c()
  {
    return this.w;
  }
  
  public void clearFocus()
  {
    this.B = true;
    setImeVisibility(false);
    super.clearFocus();
    this.c.clearFocus();
    this.B = false;
  }
  
  void d()
  {
    a(c());
    i();
    if (this.c.hasFocus()) {
      q();
    }
  }
  
  public int getImeOptions()
  {
    return this.c.getImeOptions();
  }
  
  public int getInputType()
  {
    return this.c.getInputType();
  }
  
  public int getMaxWidth()
  {
    return this.C;
  }
  
  public CharSequence getQuery()
  {
    return this.c.getText();
  }
  
  public CharSequence getQueryHint()
  {
    if (this.z != null) {
      return this.z;
    }
    if ((b) && (this.H != null) && (this.H.getHintId() != 0)) {
      return getContext().getText(this.H.getHintId());
    }
    return this.p;
  }
  
  int getSuggestionCommitIconResId()
  {
    return this.m;
  }
  
  int getSuggestionRowLayout()
  {
    return this.l;
  }
  
  public m getSuggestionsAdapter()
  {
    return this.x;
  }
  
  protected void onDetachedFromWindow()
  {
    removeCallbacks(this.K);
    post(this.L);
    super.onDetachedFromWindow();
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if (c())
    {
      super.onMeasure(paramInt1, paramInt2);
      return;
    }
    int i2 = View.MeasureSpec.getMode(paramInt1);
    int i1 = View.MeasureSpec.getSize(paramInt1);
    switch (i2)
    {
    default: 
      paramInt1 = i1;
    }
    for (;;)
    {
      super.onMeasure(View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824), paramInt2);
      return;
      if (this.C > 0)
      {
        paramInt1 = Math.min(this.C, i1);
      }
      else
      {
        paramInt1 = Math.min(getPreferredWidth(), i1);
        continue;
        paramInt1 = i1;
        if (this.C > 0)
        {
          paramInt1 = Math.min(this.C, i1);
          continue;
          if (this.C > 0) {
            paramInt1 = this.C;
          } else {
            paramInt1 = getPreferredWidth();
          }
        }
      }
    }
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    paramParcelable = (fy)paramParcelable;
    super.onRestoreInstanceState(paramParcelable.getSuperState());
    a(paramParcelable.a);
    requestLayout();
  }
  
  protected Parcelable onSaveInstanceState()
  {
    fy localfy = new fy(super.onSaveInstanceState());
    localfy.a = c();
    return localfy;
  }
  
  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    i();
  }
  
  public boolean requestFocus(int paramInt, Rect paramRect)
  {
    if (this.B) {}
    while (!isFocusable()) {
      return false;
    }
    if (!c())
    {
      boolean bool = this.c.requestFocus(paramInt, paramRect);
      if (bool) {
        a(false);
      }
      return bool;
    }
    return super.requestFocus(paramInt, paramRect);
  }
  
  public void setAppSearchData(Bundle paramBundle)
  {
    this.I = paramBundle;
  }
  
  public void setIconified(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      o();
      return;
    }
    p();
  }
  
  public void setIconifiedByDefault(boolean paramBoolean)
  {
    if (this.v == paramBoolean) {
      return;
    }
    this.v = paramBoolean;
    a(paramBoolean);
    k();
  }
  
  public void setImeOptions(int paramInt)
  {
    this.c.setImeOptions(paramInt);
  }
  
  public void setInputType(int paramInt)
  {
    this.c.setInputType(paramInt);
  }
  
  public void setMaxWidth(int paramInt)
  {
    this.C = paramInt;
    requestLayout();
  }
  
  public void setOnCloseListener(fv paramfv)
  {
    this.r = paramfv;
  }
  
  public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener paramOnFocusChangeListener)
  {
    this.s = paramOnFocusChangeListener;
  }
  
  public void setOnQueryTextListener(fw paramfw)
  {
    this.q = paramfw;
  }
  
  public void setOnSearchClickListener(View.OnClickListener paramOnClickListener)
  {
    this.u = paramOnClickListener;
  }
  
  public void setOnSuggestionListener(fx paramfx)
  {
    this.t = paramfx;
  }
  
  public void setQueryHint(CharSequence paramCharSequence)
  {
    this.z = paramCharSequence;
    k();
  }
  
  public void setQueryRefinementEnabled(boolean paramBoolean)
  {
    this.A = paramBoolean;
    gk localgk;
    if ((this.x instanceof gk))
    {
      localgk = (gk)this.x;
      if (!paramBoolean) {
        break label35;
      }
    }
    label35:
    for (int i1 = 2;; i1 = 1)
    {
      localgk.a(i1);
      return;
    }
  }
  
  public void setSearchableInfo(SearchableInfo paramSearchableInfo)
  {
    this.H = paramSearchableInfo;
    if (this.H != null)
    {
      if (b) {
        l();
      }
      k();
    }
    if ((b) && (e())) {}
    for (boolean bool = true;; bool = false)
    {
      this.D = bool;
      if (this.D) {
        this.c.setPrivateImeOptions("nm");
      }
      a(c());
      return;
    }
  }
  
  public void setSubmitButtonEnabled(boolean paramBoolean)
  {
    this.y = paramBoolean;
    a(c());
  }
  
  public void setSuggestionsAdapter(m paramm)
  {
    this.x = paramm;
    this.c.setAdapter(this.x);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/SearchView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */