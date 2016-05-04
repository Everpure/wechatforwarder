package a.a.a.g;

import a.a.a.c.a;
import a.a.a.e.f;
import a.a.a.e.h;
import a.a.a.h.c;
import java.io.File;

public class d
{
  private static void a(f paramf, File paramFile)
  {
    if (paramf.b() <= 0) {}
    while (!paramFile.exists()) {
      return;
    }
    paramFile.setLastModified(c.a(paramf.b()));
  }
  
  public static void a(f paramf, File paramFile, h paramh)
  {
    if (paramf == null) {
      throw new a("cannot set file properties: file header is null");
    }
    if (paramFile == null) {
      throw new a("cannot set file properties: output file is null");
    }
    if (!c.a(paramFile)) {
      throw new a("cannot set file properties: file doesnot exist");
    }
    if ((paramh == null) || (!paramh.f())) {
      a(paramf, paramFile);
    }
    if (paramh == null)
    {
      a(paramf, paramFile, true, true, true, true);
      return;
    }
    if (paramh.e())
    {
      a(paramf, paramFile, false, false, false, false);
      return;
    }
    boolean bool1;
    boolean bool2;
    label111:
    boolean bool3;
    if (paramh.a())
    {
      bool1 = false;
      if (!paramh.b()) {
        break label149;
      }
      bool2 = false;
      if (!paramh.c()) {
        break label155;
      }
      bool3 = false;
      label121:
      if (!paramh.d()) {
        break label161;
      }
    }
    label149:
    label155:
    label161:
    for (boolean bool4 = false;; bool4 = true)
    {
      a(paramf, paramFile, bool1, bool2, bool3, bool4);
      return;
      bool1 = true;
      break;
      bool2 = true;
      break label111;
      bool3 = true;
      break label121;
    }
  }
  
  private static void a(f paramf, File paramFile, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
  {
    if (paramf == null) {
      throw new a("invalid file header. cannot set file attributes");
    }
    paramf = paramf.h();
    if (paramf == null) {}
    do
    {
      do
      {
        do
        {
          do
          {
            do
            {
              do
              {
                do
                {
                  do
                  {
                    return;
                    switch (paramf[0])
                    {
                    default: 
                      return;
                    }
                  } while (!paramBoolean1);
                  c.b(paramFile);
                  return;
                } while (!paramBoolean2);
                c.c(paramFile);
                return;
              } while (!paramBoolean3);
              c.d(paramFile);
              return;
              if (paramBoolean1) {
                c.b(paramFile);
              }
            } while (!paramBoolean2);
            c.c(paramFile);
            return;
            if (paramBoolean3) {
              c.d(paramFile);
            }
          } while (!paramBoolean1);
          c.b(paramFile);
          return;
          if (paramBoolean3) {
            c.d(paramFile);
          }
        } while (!paramBoolean2);
        c.c(paramFile);
        return;
        if (paramBoolean3) {
          c.d(paramFile);
        }
        if (paramBoolean1) {
          c.b(paramFile);
        }
      } while (!paramBoolean2);
      c.c(paramFile);
      return;
      if (paramBoolean1) {
        c.b(paramFile);
      }
      if (paramBoolean2) {
        c.c(paramFile);
      }
    } while (!paramBoolean4);
    c.e(paramFile);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/a/a/a/g/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */