package a.a.a.g;

import a.a.a.e.f;
import a.a.a.e.h;
import a.a.a.e.k;
import a.a.a.e.l;
import java.io.File;
import java.util.ArrayList;

public class a
{
  private l a;
  
  public a(l paraml)
  {
    if (paraml == null) {
      throw new a.a.a.c.a("ZipModel is null");
    }
    this.a = paraml;
  }
  
  private long a(ArrayList paramArrayList)
  {
    if (paramArrayList == null) {
      throw new a.a.a.c.a("fileHeaders is null, cannot calculate total work");
    }
    int i = 0;
    long l = 0L;
    if (i >= paramArrayList.size()) {
      return l;
    }
    f localf = (f)paramArrayList.get(i);
    if ((localf.q() != null) && (localf.q().b() > 0L)) {}
    for (l += localf.q().a();; l += localf.d())
    {
      i += 1;
      break;
    }
  }
  
  private void a(f paramf, String paramString1, h paramh, String paramString2, a.a.a.f.a parama)
  {
    if (paramf == null) {
      throw new a.a.a.c.a("fileHeader is null");
    }
    try
    {
      parama.a(paramf.j());
      String str = paramString1;
      if (!paramString1.endsWith(a.a.a.h.a.b)) {
        str = paramString1 + a.a.a.h.a.b;
      }
      boolean bool = paramf.k();
      if (bool) {
        try
        {
          paramf = paramf.j();
          if (!a.a.a.h.c.a(paramf)) {
            return;
          }
          paramf = new File(str + paramf);
          if (!paramf.exists())
          {
            paramf.mkdirs();
            return;
          }
        }
        catch (Exception paramf)
        {
          parama.a(paramf);
          throw new a.a.a.c.a(paramf);
        }
      }
      return;
    }
    catch (a.a.a.c.a paramf)
    {
      parama.a(paramf);
      throw paramf;
      a(paramf, str, paramString2);
      paramf = new c(this.a, paramf);
      try
      {
        paramf.a(parama, str, paramString2, paramh);
        return;
      }
      catch (Exception paramf)
      {
        parama.a(paramf);
        throw new a.a.a.c.a(paramf);
      }
    }
    catch (Exception paramf)
    {
      parama.a(paramf);
      throw new a.a.a.c.a(paramf);
    }
  }
  
  private void a(f paramf, String paramString1, String paramString2)
  {
    if ((paramf == null) || (!a.a.a.h.c.a(paramString1))) {
      throw new a.a.a.c.a("Cannot check output directory structure...one of the parameters was null");
    }
    paramf = paramf.j();
    if (a.a.a.h.c.a(paramString2)) {}
    for (;;)
    {
      if (!a.a.a.h.c.a(paramString2)) {}
      for (;;)
      {
        return;
        paramf = paramString1 + paramString2;
        try
        {
          paramf = new File(new File(paramf).getParent());
          if (!paramf.exists())
          {
            paramf.mkdirs();
            return;
          }
        }
        catch (Exception paramf)
        {
          throw new a.a.a.c.a(paramf);
        }
      }
      paramString2 = paramf;
    }
  }
  
  static void a(a parama, ArrayList paramArrayList, h paramh, a.a.a.f.a parama1, String paramString)
  {
    parama.a(paramArrayList, paramh, parama1, paramString);
  }
  
  private void a(ArrayList paramArrayList, h paramh, a.a.a.f.a parama, String paramString)
  {
    int i = 0;
    for (;;)
    {
      if (i >= paramArrayList.size()) {
        return;
      }
      a((f)paramArrayList.get(i), paramString, paramh, null, parama);
      if (parama.d())
      {
        parama.b(3);
        parama.a(0);
        return;
      }
      i += 1;
    }
  }
  
  public void a(h paramh, String paramString, a.a.a.f.a parama, boolean paramBoolean)
  {
    Object localObject = this.a.a();
    if ((localObject == null) || (((a.a.a.e.b)localObject).a() == null)) {
      throw new a.a.a.c.a("invalid central directory in zipModel");
    }
    localObject = ((a.a.a.e.b)localObject).a();
    parama.c(1);
    parama.a(a((ArrayList)localObject));
    parama.a(1);
    if (paramBoolean)
    {
      new b(this, "Zip4j", (ArrayList)localObject, paramh, parama, paramString).start();
      return;
    }
    a((ArrayList)localObject, paramh, parama, paramString);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/a/a/a/g/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */