package android.support.v4.b;

import android.os.Build.VERSION;
import android.support.v4.h.a;
import android.support.v4.h.e;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

final class j
  extends aq
  implements Runnable
{
  static final boolean a;
  final af b;
  n c;
  n d;
  int e;
  int f;
  int g;
  int h;
  int i;
  int j;
  int k;
  boolean l;
  boolean m = true;
  String n;
  boolean o;
  int p = -1;
  int q;
  CharSequence r;
  int s;
  CharSequence t;
  ArrayList u;
  ArrayList v;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 21) {}
    for (boolean bool = true;; bool = false)
    {
      a = bool;
      return;
    }
  }
  
  public j(af paramaf)
  {
    this.b = paramaf;
  }
  
  private o a(SparseArray paramSparseArray1, SparseArray paramSparseArray2, boolean paramBoolean)
  {
    int i5 = 0;
    a(paramSparseArray2);
    o localo = new o(this);
    localo.d = new View(this.b.o.g());
    int i2 = 0;
    int i1 = 0;
    int i3 = i5;
    int i4 = i1;
    if (i2 < paramSparseArray1.size())
    {
      if (!a(paramSparseArray1.keyAt(i2), localo, paramBoolean, paramSparseArray1, paramSparseArray2)) {
        break label169;
      }
      i1 = 1;
    }
    label169:
    for (;;)
    {
      i2 += 1;
      break;
      while (i3 < paramSparseArray2.size())
      {
        i2 = paramSparseArray2.keyAt(i3);
        i1 = i4;
        if (paramSparseArray1.get(i2) == null)
        {
          i1 = i4;
          if (a(i2, localo, paramBoolean, paramSparseArray1, paramSparseArray2)) {
            i1 = 1;
          }
        }
        i3 += 1;
        i4 = i1;
      }
      paramSparseArray1 = localo;
      if (i4 == 0) {
        paramSparseArray1 = null;
      }
      return paramSparseArray1;
    }
  }
  
  private a a(o paramo, t paramt, boolean paramBoolean)
  {
    a locala2 = new a();
    a locala1 = locala2;
    if (this.u != null)
    {
      ar.a(locala2, paramt.g());
      if (!paramBoolean) {
        break label82;
      }
      locala2.a(this.v);
    }
    label82:
    for (locala1 = locala2; paramBoolean; locala1 = a(this.u, this.v, locala2))
    {
      if (paramt.X != null) {
        paramt.X.a(this.v, locala1);
      }
      a(paramo, locala1, false);
      return locala1;
    }
    if (paramt.Y != null) {
      paramt.Y.a(this.v, locala1);
    }
    b(paramo, locala1, false);
    return locala1;
  }
  
  private a a(o paramo, boolean paramBoolean, t paramt)
  {
    a locala = b(paramo, paramt, paramBoolean);
    if (paramBoolean)
    {
      if (paramt.Y != null) {
        paramt.Y.a(this.v, locala);
      }
      a(paramo, locala, true);
      return locala;
    }
    if (paramt.X != null) {
      paramt.X.a(this.v, locala);
    }
    b(paramo, locala, true);
    return locala;
  }
  
  private static a a(ArrayList paramArrayList1, ArrayList paramArrayList2, a parama)
  {
    if (parama.isEmpty()) {
      return parama;
    }
    a locala = new a();
    int i2 = paramArrayList1.size();
    int i1 = 0;
    while (i1 < i2)
    {
      View localView = (View)parama.get(paramArrayList1.get(i1));
      if (localView != null) {
        locala.put(paramArrayList2.get(i1), localView);
      }
      i1 += 1;
    }
    return locala;
  }
  
  private static Object a(t paramt1, t paramt2, boolean paramBoolean)
  {
    if ((paramt1 == null) || (paramt2 == null)) {
      return null;
    }
    if (paramBoolean) {}
    for (paramt1 = paramt2.v();; paramt1 = paramt1.u()) {
      return ar.b(paramt1);
    }
  }
  
  private static Object a(t paramt, boolean paramBoolean)
  {
    if (paramt == null) {
      return null;
    }
    if (paramBoolean) {}
    for (paramt = paramt.t();; paramt = paramt.q()) {
      return ar.a(paramt);
    }
  }
  
  private static Object a(Object paramObject, t paramt, ArrayList paramArrayList, a parama, View paramView)
  {
    Object localObject = paramObject;
    if (paramObject != null) {
      localObject = ar.a(paramObject, paramt.g(), paramArrayList, parama, paramView);
    }
    return localObject;
  }
  
  private void a(o paramo, int paramInt, Object paramObject)
  {
    if (this.b.g != null)
    {
      int i1 = 0;
      if (i1 < this.b.g.size())
      {
        t localt = (t)this.b.g.get(i1);
        if ((localt.I != null) && (localt.H != null) && (localt.x == paramInt))
        {
          if (!localt.z) {
            break label125;
          }
          if (!paramo.b.contains(localt.I))
          {
            ar.a(paramObject, localt.I, true);
            paramo.b.add(localt.I);
          }
        }
        for (;;)
        {
          i1 += 1;
          break;
          label125:
          ar.a(paramObject, localt.I, false);
          paramo.b.remove(localt.I);
        }
      }
    }
  }
  
  private void a(o paramo, t paramt1, t paramt2, boolean paramBoolean, a parama)
  {
    if (paramBoolean) {}
    for (paramo = paramt2.X;; paramo = paramt1.X)
    {
      if (paramo != null) {
        paramo.b(new ArrayList(parama.keySet()), new ArrayList(parama.values()), null);
      }
      return;
    }
  }
  
  private void a(o paramo, a parama, boolean paramBoolean)
  {
    int i1;
    int i2;
    label13:
    String str;
    Object localObject;
    if (this.v == null)
    {
      i1 = 0;
      i2 = 0;
      if (i2 >= i1) {
        return;
      }
      str = (String)this.u.get(i2);
      localObject = (View)parama.get((String)this.v.get(i2));
      if (localObject != null)
      {
        localObject = ar.a((View)localObject);
        if (!paramBoolean) {
          break label103;
        }
        a(paramo.a, str, (String)localObject);
      }
    }
    for (;;)
    {
      i2 += 1;
      break label13;
      i1 = this.v.size();
      break;
      label103:
      a(paramo.a, (String)localObject, str);
    }
  }
  
  private void a(o paramo, View paramView, Object paramObject, t paramt1, t paramt2, boolean paramBoolean, ArrayList paramArrayList)
  {
    paramView.getViewTreeObserver().addOnPreDrawListener(new l(this, paramView, paramObject, paramArrayList, paramo, paramBoolean, paramt1, paramt2));
  }
  
  private static void a(o paramo, ArrayList paramArrayList1, ArrayList paramArrayList2)
  {
    if (paramArrayList1 != null)
    {
      int i1 = 0;
      while (i1 < paramArrayList1.size())
      {
        String str1 = (String)paramArrayList1.get(i1);
        String str2 = (String)paramArrayList2.get(i1);
        a(paramo.a, str1, str2);
        i1 += 1;
      }
    }
  }
  
  private void a(a parama, o paramo)
  {
    if ((this.v != null) && (!parama.isEmpty()))
    {
      parama = (View)parama.get(this.v.get(0));
      if (parama != null) {
        paramo.c.a = parama;
      }
    }
  }
  
  private static void a(a parama, String paramString1, String paramString2)
  {
    int i1;
    if ((paramString1 != null) && (paramString2 != null)) {
      i1 = 0;
    }
    while (i1 < parama.size())
    {
      if (paramString1.equals(parama.c(i1)))
      {
        parama.a(i1, paramString2);
        return;
      }
      i1 += 1;
    }
    parama.put(paramString1, paramString2);
  }
  
  private void a(SparseArray paramSparseArray)
  {
    int i2 = paramSparseArray.size();
    int i1 = 0;
    while (i1 < i2)
    {
      t localt = (t)paramSparseArray.valueAt(i1);
      if (localt.b < 1)
      {
        this.b.c(localt);
        this.b.a(localt, 1, 0, 0, false);
      }
      i1 += 1;
    }
  }
  
  private static void a(SparseArray paramSparseArray1, SparseArray paramSparseArray2, t paramt)
  {
    if (paramt != null)
    {
      int i1 = paramt.x;
      if ((i1 != 0) && (!paramt.f()))
      {
        if ((paramt.e()) && (paramt.g() != null) && (paramSparseArray1.get(i1) == null)) {
          paramSparseArray1.put(i1, paramt);
        }
        if (paramSparseArray2.get(i1) == paramt) {
          paramSparseArray2.remove(i1);
        }
      }
    }
  }
  
  private void a(View paramView, o paramo, int paramInt, Object paramObject)
  {
    paramView.getViewTreeObserver().addOnPreDrawListener(new m(this, paramView, paramo, paramInt, paramObject));
  }
  
  private boolean a(int paramInt, o paramo, boolean paramBoolean, SparseArray paramSparseArray1, SparseArray paramSparseArray2)
  {
    ViewGroup localViewGroup = (ViewGroup)this.b.p.a(paramInt);
    if (localViewGroup == null) {
      return false;
    }
    Object localObject2 = (t)paramSparseArray2.get(paramInt);
    Object localObject4 = (t)paramSparseArray1.get(paramInt);
    Object localObject3 = a((t)localObject2, paramBoolean);
    paramSparseArray2 = a((t)localObject2, (t)localObject4, paramBoolean);
    Object localObject5 = b((t)localObject4, paramBoolean);
    paramSparseArray1 = null;
    ArrayList localArrayList1 = new ArrayList();
    if (paramSparseArray2 != null)
    {
      localObject1 = a(paramo, (t)localObject4, paramBoolean);
      if (((a)localObject1).isEmpty())
      {
        paramSparseArray1 = null;
        paramSparseArray2 = null;
        if ((localObject3 != null) || (paramSparseArray2 != null) || (localObject5 != null)) {
          break label208;
        }
        return false;
      }
      if (!paramBoolean) {
        break label198;
      }
    }
    label198:
    for (paramSparseArray1 = ((t)localObject4).X;; paramSparseArray1 = ((t)localObject2).X)
    {
      if (paramSparseArray1 != null) {
        paramSparseArray1.a(new ArrayList(((a)localObject1).keySet()), new ArrayList(((a)localObject1).values()), null);
      }
      a(paramo, localViewGroup, paramSparseArray2, (t)localObject2, (t)localObject4, paramBoolean, localArrayList1);
      paramSparseArray1 = (SparseArray)localObject1;
      break;
    }
    label208:
    Object localObject1 = new ArrayList();
    localObject4 = a(localObject5, (t)localObject4, (ArrayList)localObject1, paramSparseArray1, paramo.d);
    if ((this.v != null) && (paramSparseArray1 != null))
    {
      localObject5 = (View)paramSparseArray1.get(this.v.get(0));
      if (localObject5 != null)
      {
        if (localObject4 != null) {
          ar.a(localObject4, (View)localObject5);
        }
        if (paramSparseArray2 != null) {
          ar.a(paramSparseArray2, (View)localObject5);
        }
      }
    }
    localObject5 = new k(this, (t)localObject2);
    ArrayList localArrayList2 = new ArrayList();
    a locala = new a();
    boolean bool = true;
    if (localObject2 != null) {
      if (!paramBoolean) {
        break label462;
      }
    }
    label462:
    for (bool = ((t)localObject2).x();; bool = ((t)localObject2).w())
    {
      localObject2 = ar.a(localObject3, localObject4, paramSparseArray2, bool);
      if (localObject2 != null)
      {
        ar.a(localObject3, paramSparseArray2, localViewGroup, (ax)localObject5, paramo.d, paramo.c, paramo.a, localArrayList2, paramSparseArray1, locala, localArrayList1);
        a(localViewGroup, paramo, paramInt, localObject2);
        ar.a(localObject2, paramo.d, true);
        a(paramo, paramInt, localObject2);
        ar.a(localViewGroup, localObject2);
        ar.a(localViewGroup, paramo.d, localObject3, localArrayList2, localObject4, (ArrayList)localObject1, paramSparseArray2, localArrayList1, localObject2, paramo.b, locala);
      }
      if (localObject2 == null) {
        break;
      }
      return true;
    }
    return false;
  }
  
  private a b(o paramo, t paramt, boolean paramBoolean)
  {
    a locala = new a();
    paramt = paramt.g();
    paramo = locala;
    if (paramt != null)
    {
      paramo = locala;
      if (this.u != null)
      {
        ar.a(locala, paramt);
        if (!paramBoolean) {
          break label57;
        }
        paramo = a(this.u, this.v, locala);
      }
    }
    return paramo;
    label57:
    locala.a(this.v);
    return locala;
  }
  
  private static Object b(t paramt, boolean paramBoolean)
  {
    if (paramt == null) {
      return null;
    }
    if (paramBoolean) {}
    for (paramt = paramt.r();; paramt = paramt.s()) {
      return ar.a(paramt);
    }
  }
  
  private void b(o paramo, a parama, boolean paramBoolean)
  {
    int i2 = parama.size();
    int i1 = 0;
    if (i1 < i2)
    {
      String str1 = (String)parama.b(i1);
      String str2 = ar.a((View)parama.c(i1));
      if (paramBoolean) {
        a(paramo.a, str1, str2);
      }
      for (;;)
      {
        i1 += 1;
        break;
        a(paramo.a, str2, str1);
      }
    }
  }
  
  private void b(SparseArray paramSparseArray1, SparseArray paramSparseArray2)
  {
    if (!this.b.p.a()) {}
    n localn;
    do
    {
      return;
      localn = this.c;
    } while (localn == null);
    switch (localn.c)
    {
    }
    for (;;)
    {
      localn = localn.a;
      break;
      b(paramSparseArray1, paramSparseArray2, localn.d);
      continue;
      Object localObject1 = localn.d;
      if (this.b.g != null)
      {
        int i1 = 0;
        if (i1 < this.b.g.size())
        {
          t localt = (t)this.b.g.get(i1);
          Object localObject2;
          if (localObject1 != null)
          {
            localObject2 = localObject1;
            if (localt.x != ((t)localObject1).x) {}
          }
          else
          {
            if (localt != localObject1) {
              break label197;
            }
            localObject2 = null;
            paramSparseArray2.remove(localt.x);
          }
          for (;;)
          {
            i1 += 1;
            localObject1 = localObject2;
            break;
            label197:
            a(paramSparseArray1, paramSparseArray2, localt);
            localObject2 = localObject1;
          }
        }
      }
      b(paramSparseArray1, paramSparseArray2, localn.d);
      continue;
      a(paramSparseArray1, paramSparseArray2, localn.d);
      continue;
      a(paramSparseArray1, paramSparseArray2, localn.d);
      continue;
      b(paramSparseArray1, paramSparseArray2, localn.d);
      continue;
      a(paramSparseArray1, paramSparseArray2, localn.d);
      continue;
      b(paramSparseArray1, paramSparseArray2, localn.d);
    }
  }
  
  private void b(SparseArray paramSparseArray1, SparseArray paramSparseArray2, t paramt)
  {
    if (paramt != null)
    {
      int i1 = paramt.x;
      if (i1 != 0)
      {
        if (!paramt.e()) {
          paramSparseArray2.put(i1, paramt);
        }
        if (paramSparseArray1.get(i1) == paramt) {
          paramSparseArray1.remove(i1);
        }
      }
    }
  }
  
  public o a(boolean paramBoolean, o paramo, SparseArray paramSparseArray1, SparseArray paramSparseArray2)
  {
    if (af.a)
    {
      Log.v("FragmentManager", "popFromBackStack: " + this);
      a("  ", null, new PrintWriter(new e("FragmentManager")), null);
    }
    o localo = paramo;
    if (a)
    {
      if (paramo != null) {
        break label223;
      }
      if (paramSparseArray1.size() == 0)
      {
        localo = paramo;
        if (paramSparseArray2.size() == 0) {}
      }
      else
      {
        localo = a(paramSparseArray1, paramSparseArray2, true);
      }
    }
    label100:
    a(-1);
    int i1;
    label113:
    int i2;
    label121:
    int i3;
    if (localo != null)
    {
      i1 = 0;
      if (localo == null) {
        break label257;
      }
      i2 = 0;
      paramo = this.d;
      if (paramo == null) {
        break label546;
      }
      if (localo == null) {
        break label266;
      }
      i3 = 0;
      label138:
      if (localo == null) {
        break label275;
      }
    }
    label223:
    label257:
    label266:
    label275:
    for (int i4 = 0;; i4 = paramo.h) {
      switch (paramo.c)
      {
      default: 
        throw new IllegalArgumentException("Unknown cmd: " + paramo.c);
        localo = paramo;
        if (paramBoolean) {
          break label100;
        }
        a(paramo, this.v, this.u);
        localo = paramo;
        break label100;
        i1 = this.k;
        break label113;
        i2 = this.j;
        break label121;
        i3 = paramo.g;
        break label138;
      }
    }
    paramSparseArray1 = paramo.d;
    paramSparseArray1.G = i4;
    this.b.a(paramSparseArray1, af.c(i2), i1);
    for (;;)
    {
      paramo = paramo.b;
      break;
      paramSparseArray1 = paramo.d;
      if (paramSparseArray1 != null)
      {
        paramSparseArray1.G = i4;
        this.b.a(paramSparseArray1, af.c(i2), i1);
      }
      if (paramo.i != null)
      {
        i4 = 0;
        while (i4 < paramo.i.size())
        {
          paramSparseArray1 = (t)paramo.i.get(i4);
          paramSparseArray1.G = i3;
          this.b.a(paramSparseArray1, false);
          i4 += 1;
        }
        paramSparseArray1 = paramo.d;
        paramSparseArray1.G = i3;
        this.b.a(paramSparseArray1, false);
        continue;
        paramSparseArray1 = paramo.d;
        paramSparseArray1.G = i3;
        this.b.c(paramSparseArray1, af.c(i2), i1);
        continue;
        paramSparseArray1 = paramo.d;
        paramSparseArray1.G = i4;
        this.b.b(paramSparseArray1, af.c(i2), i1);
        continue;
        paramSparseArray1 = paramo.d;
        paramSparseArray1.G = i3;
        this.b.e(paramSparseArray1, af.c(i2), i1);
        continue;
        paramSparseArray1 = paramo.d;
        paramSparseArray1.G = i3;
        this.b.d(paramSparseArray1, af.c(i2), i1);
      }
    }
    label546:
    if (paramBoolean)
    {
      this.b.a(this.b.n, af.c(i2), i1, true);
      localo = null;
    }
    if (this.p >= 0)
    {
      this.b.b(this.p);
      this.p = -1;
    }
    return localo;
  }
  
  public String a()
  {
    return this.n;
  }
  
  void a(int paramInt)
  {
    if (!this.l) {}
    for (;;)
    {
      return;
      if (af.a) {
        Log.v("FragmentManager", "Bump nesting in " + this + " by " + paramInt);
      }
      for (n localn = this.c; localn != null; localn = localn.a)
      {
        t localt;
        if (localn.d != null)
        {
          localt = localn.d;
          localt.r += paramInt;
          if (af.a) {
            Log.v("FragmentManager", "Bump nesting of " + localn.d + " to " + localn.d.r);
          }
        }
        if (localn.i != null)
        {
          int i1 = localn.i.size() - 1;
          while (i1 >= 0)
          {
            localt = (t)localn.i.get(i1);
            localt.r += paramInt;
            if (af.a) {
              Log.v("FragmentManager", "Bump nesting of " + localt + " to " + localt.r);
            }
            i1 -= 1;
          }
        }
      }
    }
  }
  
  void a(n paramn)
  {
    if (this.c == null)
    {
      this.d = paramn;
      this.c = paramn;
    }
    for (;;)
    {
      paramn.e = this.f;
      paramn.f = this.g;
      paramn.g = this.h;
      paramn.h = this.i;
      this.e += 1;
      return;
      paramn.b = this.d;
      this.d.a = paramn;
      this.d = paramn;
    }
  }
  
  public void a(SparseArray paramSparseArray1, SparseArray paramSparseArray2)
  {
    if (!this.b.p.a()) {}
    n localn;
    do
    {
      return;
      localn = this.d;
    } while (localn == null);
    switch (localn.c)
    {
    }
    for (;;)
    {
      localn = localn.b;
      break;
      a(paramSparseArray1, paramSparseArray2, localn.d);
      continue;
      if (localn.i != null)
      {
        int i1 = localn.i.size() - 1;
        while (i1 >= 0)
        {
          b(paramSparseArray1, paramSparseArray2, (t)localn.i.get(i1));
          i1 -= 1;
        }
      }
      a(paramSparseArray1, paramSparseArray2, localn.d);
      continue;
      b(paramSparseArray1, paramSparseArray2, localn.d);
      continue;
      b(paramSparseArray1, paramSparseArray2, localn.d);
      continue;
      a(paramSparseArray1, paramSparseArray2, localn.d);
      continue;
      b(paramSparseArray1, paramSparseArray2, localn.d);
      continue;
      a(paramSparseArray1, paramSparseArray2, localn.d);
    }
  }
  
  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    a(paramString, paramPrintWriter, true);
  }
  
  public void a(String paramString, PrintWriter paramPrintWriter, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mName=");
      paramPrintWriter.print(this.n);
      paramPrintWriter.print(" mIndex=");
      paramPrintWriter.print(this.p);
      paramPrintWriter.print(" mCommitted=");
      paramPrintWriter.println(this.o);
      if (this.j != 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mTransition=#");
        paramPrintWriter.print(Integer.toHexString(this.j));
        paramPrintWriter.print(" mTransitionStyle=#");
        paramPrintWriter.println(Integer.toHexString(this.k));
      }
      if ((this.f != 0) || (this.g != 0))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mEnterAnim=#");
        paramPrintWriter.print(Integer.toHexString(this.f));
        paramPrintWriter.print(" mExitAnim=#");
        paramPrintWriter.println(Integer.toHexString(this.g));
      }
      if ((this.h != 0) || (this.i != 0))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mPopEnterAnim=#");
        paramPrintWriter.print(Integer.toHexString(this.h));
        paramPrintWriter.print(" mPopExitAnim=#");
        paramPrintWriter.println(Integer.toHexString(this.i));
      }
      if ((this.q != 0) || (this.r != null))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mBreadCrumbTitleRes=#");
        paramPrintWriter.print(Integer.toHexString(this.q));
        paramPrintWriter.print(" mBreadCrumbTitleText=");
        paramPrintWriter.println(this.r);
      }
      if ((this.s != 0) || (this.t != null))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mBreadCrumbShortTitleRes=#");
        paramPrintWriter.print(Integer.toHexString(this.s));
        paramPrintWriter.print(" mBreadCrumbShortTitleText=");
        paramPrintWriter.println(this.t);
      }
    }
    if (this.c != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Operations:");
      String str2 = paramString + "    ";
      n localn = this.c;
      int i1 = 0;
      while (localn != null)
      {
        String str1;
        int i2;
        switch (localn.c)
        {
        default: 
          str1 = "cmd=" + localn.c;
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  Op #");
          paramPrintWriter.print(i1);
          paramPrintWriter.print(": ");
          paramPrintWriter.print(str1);
          paramPrintWriter.print(" ");
          paramPrintWriter.println(localn.d);
          if (paramBoolean)
          {
            if ((localn.e != 0) || (localn.f != 0))
            {
              paramPrintWriter.print(paramString);
              paramPrintWriter.print("enterAnim=#");
              paramPrintWriter.print(Integer.toHexString(localn.e));
              paramPrintWriter.print(" exitAnim=#");
              paramPrintWriter.println(Integer.toHexString(localn.f));
            }
            if ((localn.g != 0) || (localn.h != 0))
            {
              paramPrintWriter.print(paramString);
              paramPrintWriter.print("popEnterAnim=#");
              paramPrintWriter.print(Integer.toHexString(localn.g));
              paramPrintWriter.print(" popExitAnim=#");
              paramPrintWriter.println(Integer.toHexString(localn.h));
            }
          }
          if ((localn.i == null) || (localn.i.size() <= 0)) {
            break label807;
          }
          i2 = 0;
          label641:
          if (i2 >= localn.i.size()) {
            break label807;
          }
          paramPrintWriter.print(str2);
          if (localn.i.size() == 1) {
            paramPrintWriter.print("Removed: ");
          }
          break;
        }
        for (;;)
        {
          paramPrintWriter.println(localn.i.get(i2));
          i2 += 1;
          break label641;
          str1 = "NULL";
          break;
          str1 = "ADD";
          break;
          str1 = "REPLACE";
          break;
          str1 = "REMOVE";
          break;
          str1 = "HIDE";
          break;
          str1 = "SHOW";
          break;
          str1 = "DETACH";
          break;
          str1 = "ATTACH";
          break;
          if (i2 == 0) {
            paramPrintWriter.println("Removed:");
          }
          paramPrintWriter.print(str2);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i2);
          paramPrintWriter.print(": ");
        }
        label807:
        localn = localn.a;
        i1 += 1;
      }
    }
  }
  
  public void run()
  {
    if (af.a) {
      Log.v("FragmentManager", "Run: " + this);
    }
    if ((this.l) && (this.p < 0)) {
      throw new IllegalStateException("addToBackStack() called after commit()");
    }
    a(1);
    Object localObject1;
    if (a)
    {
      localObject1 = new SparseArray();
      localObject2 = new SparseArray();
      b((SparseArray)localObject1, (SparseArray)localObject2);
    }
    for (Object localObject2 = a((SparseArray)localObject1, (SparseArray)localObject2, false);; localObject2 = null)
    {
      int i1;
      label113:
      int i2;
      label120:
      n localn;
      int i3;
      if (localObject2 != null)
      {
        i1 = 0;
        if (localObject2 == null) {
          break label232;
        }
        i2 = 0;
        localn = this.c;
        if (localn == null) {
          break label721;
        }
        if (localObject2 == null) {
          break label240;
        }
        i3 = 0;
        label138:
        if (localObject2 == null) {
          break label249;
        }
      }
      label232:
      label240:
      label249:
      for (int i4 = 0;; i4 = localn.f) {
        switch (localn.c)
        {
        default: 
          throw new IllegalArgumentException("Unknown cmd: " + localn.c);
          i1 = this.k;
          break label113;
          i2 = this.j;
          break label120;
          i3 = localn.e;
          break label138;
        }
      }
      localObject1 = localn.d;
      ((t)localObject1).G = i3;
      this.b.a((t)localObject1, false);
      for (;;)
      {
        localn = localn.a;
        break;
        localObject1 = localn.d;
        int i6 = ((t)localObject1).x;
        Object localObject3 = localObject1;
        if (this.b.g != null)
        {
          int i5 = this.b.g.size() - 1;
          localObject3 = localObject1;
          if (i5 >= 0)
          {
            localObject3 = (t)this.b.g.get(i5);
            if (af.a) {
              Log.v("FragmentManager", "OP_REPLACE: adding=" + localObject1 + " old=" + localObject3);
            }
            if (((t)localObject3).x == i6) {
              if (localObject3 == localObject1)
              {
                localObject1 = null;
                localn.d = null;
              }
            }
            for (;;)
            {
              i5 -= 1;
              break;
              if (localn.i == null) {
                localn.i = new ArrayList();
              }
              localn.i.add(localObject3);
              ((t)localObject3).G = i4;
              if (this.l)
              {
                ((t)localObject3).r += 1;
                if (af.a) {
                  Log.v("FragmentManager", "Bump nesting of " + localObject3 + " to " + ((t)localObject3).r);
                }
              }
              this.b.a((t)localObject3, i2, i1);
            }
          }
        }
        if (localObject3 != null)
        {
          ((t)localObject3).G = i3;
          this.b.a((t)localObject3, false);
          continue;
          localObject1 = localn.d;
          ((t)localObject1).G = i4;
          this.b.a((t)localObject1, i2, i1);
          continue;
          localObject1 = localn.d;
          ((t)localObject1).G = i4;
          this.b.b((t)localObject1, i2, i1);
          continue;
          localObject1 = localn.d;
          ((t)localObject1).G = i3;
          this.b.c((t)localObject1, i2, i1);
          continue;
          localObject1 = localn.d;
          ((t)localObject1).G = i4;
          this.b.d((t)localObject1, i2, i1);
          continue;
          localObject1 = localn.d;
          ((t)localObject1).G = i3;
          this.b.e((t)localObject1, i2, i1);
        }
      }
      label721:
      this.b.a(this.b.n, i2, i1, true);
      if (this.l) {
        this.b.a(this);
      }
      return;
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append("BackStackEntry{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    if (this.p >= 0)
    {
      localStringBuilder.append(" #");
      localStringBuilder.append(this.p);
    }
    if (this.n != null)
    {
      localStringBuilder.append(" ");
      localStringBuilder.append(this.n);
    }
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/b/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */