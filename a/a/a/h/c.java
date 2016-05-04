package a.a.a.h;

import a.a.a.c.a;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.Calendar;
import java.util.Date;

public class c
{
  public static long a(int paramInt)
  {
    Calendar localCalendar = Calendar.getInstance();
    localCalendar.set((paramInt >> 25 & 0x7F) + 1980, (paramInt >> 21 & 0xF) - 1, paramInt >> 16 & 0x1F, paramInt >> 11 & 0x1F, paramInt >> 5 & 0x3F, (paramInt & 0x1F) * 2);
    localCalendar.set(14, 0);
    return localCalendar.getTime().getTime();
  }
  
  public static String a(byte[] paramArrayOfByte)
  {
    try
    {
      String str = new String(paramArrayOfByte, "Cp850");
      return str;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException) {}
    return new String(paramArrayOfByte);
  }
  
  public static String a(byte[] paramArrayOfByte, boolean paramBoolean)
  {
    if (paramBoolean) {
      try
      {
        String str = new String(paramArrayOfByte, "UTF8");
        return str;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        return new String(paramArrayOfByte);
      }
    }
    return a(paramArrayOfByte);
  }
  
  public static boolean a(File paramFile)
  {
    if (paramFile == null) {
      throw new a("cannot check if file exists: input file is null");
    }
    return paramFile.exists();
  }
  
  public static boolean a(String paramString)
  {
    return (paramString != null) && (paramString.trim().length() > 0);
  }
  
  public static void b(File paramFile)
  {
    if (paramFile == null) {
      throw new a("input file is null. cannot set read only file attribute");
    }
    if (paramFile.exists()) {
      paramFile.setReadOnly();
    }
  }
  
  public static boolean b(String paramString)
  {
    if (!a(paramString)) {
      throw new a(new NullPointerException("output path is null"));
    }
    paramString = new File(paramString);
    if (paramString.exists())
    {
      if (!paramString.isDirectory()) {
        throw new a("output folder is not valid");
      }
      if (!paramString.canWrite()) {
        throw new a("no write access to output folder");
      }
    }
    else
    {
      try
      {
        paramString.mkdirs();
        if (!paramString.isDirectory()) {
          throw new a("output folder is not valid");
        }
      }
      catch (Exception paramString)
      {
        throw new a("Cannot create destination folder");
      }
      if (!paramString.canWrite()) {
        throw new a("no write access to destination folder");
      }
    }
    return true;
  }
  
  public static void c(File paramFile) {}
  
  public static boolean c(String paramString)
  {
    if (!a(paramString)) {
      throw new a("path is null");
    }
    if (!d(paramString)) {
      throw new a("file does not exist: " + paramString);
    }
    try
    {
      boolean bool = new File(paramString).canRead();
      return bool;
    }
    catch (Exception paramString)
    {
      throw new a("cannot read zip file");
    }
  }
  
  public static void d(File paramFile) {}
  
  public static boolean d(String paramString)
  {
    if (!a(paramString)) {
      throw new a("path is null");
    }
    return a(new File(paramString));
  }
  
  public static void e(File paramFile) {}
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/a/a/a/h/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */