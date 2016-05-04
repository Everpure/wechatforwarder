package android.support.v4.i;

import android.view.View;
import java.lang.reflect.Field;
import java.util.WeakHashMap;

class ca
  extends by
{
  static Field b;
  static boolean c = false;
  
  public void a(View paramView, a parama)
  {
    if (parama == null) {}
    for (parama = null;; parama = parama.a())
    {
      cl.a(paramView, parama);
      return;
    }
  }
  
  public void a(View paramView, boolean paramBoolean)
  {
    cl.a(paramView, paramBoolean);
  }
  
  public boolean a(View paramView, int paramInt)
  {
    return cl.a(paramView, paramInt);
  }
  
  /* Error */
  public boolean b(View paramView)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: getstatic 12	android/support/v4/i/ca:c	Z
    //   5: ifeq +5 -> 10
    //   8: iconst_0
    //   9: ireturn
    //   10: getstatic 39	android/support/v4/i/ca:b	Ljava/lang/reflect/Field;
    //   13: ifnonnull +20 -> 33
    //   16: ldc 41
    //   18: ldc 43
    //   20: invokevirtual 49	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   23: putstatic 39	android/support/v4/i/ca:b	Ljava/lang/reflect/Field;
    //   26: getstatic 39	android/support/v4/i/ca:b	Ljava/lang/reflect/Field;
    //   29: iconst_1
    //   30: invokevirtual 55	java/lang/reflect/Field:setAccessible	(Z)V
    //   33: getstatic 39	android/support/v4/i/ca:b	Ljava/lang/reflect/Field;
    //   36: aload_1
    //   37: invokevirtual 59	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   40: astore_1
    //   41: aload_1
    //   42: ifnull +12 -> 54
    //   45: iload_2
    //   46: ireturn
    //   47: astore_1
    //   48: iconst_1
    //   49: putstatic 12	android/support/v4/i/ca:c	Z
    //   52: iconst_0
    //   53: ireturn
    //   54: iconst_0
    //   55: istore_2
    //   56: goto -11 -> 45
    //   59: astore_1
    //   60: iconst_1
    //   61: putstatic 12	android/support/v4/i/ca:c	Z
    //   64: iconst_0
    //   65: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	66	0	this	ca
    //   0	66	1	paramView	View
    //   1	55	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   16	33	47	java/lang/Throwable
    //   33	41	59	java/lang/Throwable
  }
  
  public boolean b(View paramView, int paramInt)
  {
    return cl.b(paramView, paramInt);
  }
  
  public di r(View paramView)
  {
    if (this.a == null) {
      this.a = new WeakHashMap();
    }
    di localdi2 = (di)this.a.get(paramView);
    di localdi1 = localdi2;
    if (localdi2 == null)
    {
      localdi1 = new di(paramView);
      this.a.put(paramView, localdi1);
    }
    return localdi1;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/i/ca.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */