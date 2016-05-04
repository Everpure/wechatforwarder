package android.support.v7.a;

import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

public class k
{
  public int A;
  public boolean B = false;
  public boolean[] C;
  public boolean D;
  public boolean E;
  public int F = -1;
  public DialogInterface.OnMultiChoiceClickListener G;
  public Cursor H;
  public String I;
  public String J;
  public AdapterView.OnItemSelectedListener K;
  public p L;
  public boolean M = true;
  public final Context a;
  public final LayoutInflater b;
  public int c = 0;
  public Drawable d;
  public int e = 0;
  public CharSequence f;
  public View g;
  public CharSequence h;
  public CharSequence i;
  public DialogInterface.OnClickListener j;
  public CharSequence k;
  public DialogInterface.OnClickListener l;
  public CharSequence m;
  public DialogInterface.OnClickListener n;
  public boolean o;
  public DialogInterface.OnCancelListener p;
  public DialogInterface.OnDismissListener q;
  public DialogInterface.OnKeyListener r;
  public CharSequence[] s;
  public ListAdapter t;
  public DialogInterface.OnClickListener u;
  public int v;
  public View w;
  public int x;
  public int y;
  public int z;
  
  public k(Context paramContext)
  {
    this.a = paramContext;
    this.o = true;
    this.b = ((LayoutInflater)paramContext.getSystemService("layout_inflater"));
  }
  
  private void b(e parame)
  {
    ListView localListView = (ListView)this.b.inflate(e.k(parame), null);
    Object localObject;
    if (this.D) {
      if (this.H == null)
      {
        localObject = new l(this, this.a, e.l(parame), 16908308, this.s, localListView);
        if (this.L != null) {
          this.L.a(localListView);
        }
        e.a(parame, (ListAdapter)localObject);
        e.a(parame, this.F);
        if (this.u == null) {
          break label274;
        }
        localListView.setOnItemClickListener(new n(this, parame));
        label110:
        if (this.K != null) {
          localListView.setOnItemSelectedListener(this.K);
        }
        if (!this.E) {
          break label300;
        }
        localListView.setChoiceMode(1);
      }
    }
    for (;;)
    {
      e.a(parame, localListView);
      return;
      localObject = new m(this, this.a, this.H, false, localListView, parame);
      break;
      if (this.E) {}
      for (int i1 = e.m(parame);; i1 = e.n(parame))
      {
        if (this.H == null) {
          break label237;
        }
        localObject = new SimpleCursorAdapter(this.a, i1, this.H, new String[] { this.I }, new int[] { 16908308 });
        break;
      }
      label237:
      if (this.t != null)
      {
        localObject = this.t;
        break;
      }
      localObject = new r(this.a, i1, 16908308, this.s);
      break;
      label274:
      if (this.G == null) {
        break label110;
      }
      localListView.setOnItemClickListener(new o(this, localListView, parame));
      break label110;
      label300:
      if (this.D) {
        localListView.setChoiceMode(2);
      }
    }
  }
  
  public void a(e parame)
  {
    if (this.g != null)
    {
      parame.b(this.g);
      if (this.h != null) {
        parame.b(this.h);
      }
      if (this.i != null) {
        parame.a(-1, this.i, this.j, null);
      }
      if (this.k != null) {
        parame.a(-2, this.k, this.l, null);
      }
      if (this.m != null) {
        parame.a(-3, this.m, this.n, null);
      }
      if ((this.s != null) || (this.H != null) || (this.t != null)) {
        b(parame);
      }
      if (this.w == null) {
        break label236;
      }
      if (!this.B) {
        break label227;
      }
      parame.a(this.w, this.x, this.y, this.z, this.A);
    }
    label227:
    label236:
    while (this.v == 0)
    {
      return;
      if (this.f != null) {
        parame.a(this.f);
      }
      if (this.d != null) {
        parame.a(this.d);
      }
      if (this.c != 0) {
        parame.b(this.c);
      }
      if (this.e == 0) {
        break;
      }
      parame.b(parame.c(this.e));
      break;
      parame.c(this.w);
      return;
    }
    parame.a(this.v);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/a/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */