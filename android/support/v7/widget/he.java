package android.support.v7.widget;

import android.support.v4.h.o;
import android.support.v4.h.p;

class he
{
  static o d = new p(20);
  int a;
  en b;
  en c;
  
  static he a()
  {
    he localhe2 = (he)d.a();
    he localhe1 = localhe2;
    if (localhe2 == null) {
      localhe1 = new he();
    }
    return localhe1;
  }
  
  static void a(he paramhe)
  {
    paramhe.a = 0;
    paramhe.b = null;
    paramhe.c = null;
    d.a(paramhe);
  }
  
  static void b()
  {
    while (d.a() != null) {}
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/he.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */