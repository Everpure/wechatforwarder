package android.support.v7.a;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.support.v4.c.o;
import android.util.Log;
import java.util.Calendar;

class bd
{
  private static final bf a = new bf(null);
  private final Context b;
  private final LocationManager c;
  
  bd(Context paramContext)
  {
    this.b = paramContext;
    this.c = ((LocationManager)paramContext.getSystemService("location"));
  }
  
  private Location a(String paramString)
  {
    if (this.c != null) {
      try
      {
        if (this.c.isProviderEnabled(paramString))
        {
          paramString = this.c.getLastKnownLocation(paramString);
          return paramString;
        }
      }
      catch (Exception paramString)
      {
        Log.d("TwilightManager", "Failed to get last known location", paramString);
      }
    }
    return null;
  }
  
  private void a(Location paramLocation)
  {
    bf localbf = a;
    long l1 = System.currentTimeMillis();
    bc localbc = bc.a();
    localbc.a(l1 - 86400000L, paramLocation.getLatitude(), paramLocation.getLongitude());
    long l2 = localbc.a;
    localbc.a(l1, paramLocation.getLatitude(), paramLocation.getLongitude());
    if (localbc.c == 1) {}
    long l3;
    long l4;
    long l5;
    for (boolean bool = true;; bool = false)
    {
      l3 = localbc.b;
      l4 = localbc.a;
      localbc.a(86400000L + l1, paramLocation.getLatitude(), paramLocation.getLongitude());
      l5 = localbc.b;
      if ((l3 != -1L) && (l4 != -1L)) {
        break;
      }
      l1 = 43200000L + l1;
      localbf.a = bool;
      localbf.b = l2;
      localbf.c = l3;
      localbf.d = l4;
      localbf.e = l5;
      localbf.f = l1;
      return;
    }
    if (l1 > l4) {
      l1 = 0L + l5;
    }
    for (;;)
    {
      l1 += 60000L;
      break;
      if (l1 > l3) {
        l1 = 0L + l4;
      } else {
        l1 = 0L + l3;
      }
    }
  }
  
  private boolean a(bf parambf)
  {
    return (parambf != null) && (parambf.f > System.currentTimeMillis());
  }
  
  private Location b()
  {
    Object localObject1 = null;
    if (o.a(this.b, "android.permission.ACCESS_COARSE_LOCATION") == 0) {}
    for (Location localLocation = a("network");; localLocation = null)
    {
      if (o.a(this.b, "android.permission.ACCESS_FINE_LOCATION") == 0) {
        localObject1 = a("gps");
      }
      if ((localObject1 != null) && (localLocation != null))
      {
        Object localObject2 = localLocation;
        if (((Location)localObject1).getTime() > localLocation.getTime()) {
          localObject2 = localObject1;
        }
        return (Location)localObject2;
      }
      if (localObject1 != null) {}
      for (;;)
      {
        return (Location)localObject1;
        localObject1 = localLocation;
      }
    }
  }
  
  boolean a()
  {
    bf localbf = a;
    if (a(localbf)) {
      return localbf.a;
    }
    Location localLocation = b();
    if (localLocation != null)
    {
      a(localLocation);
      return localbf.a;
    }
    Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
    int i = Calendar.getInstance().get(11);
    return (i < 6) || (i >= 22);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/a/bd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */