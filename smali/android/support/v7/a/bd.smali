.class Landroid/support/v7/a/bd;
.super Ljava/lang/Object;


# static fields
.field private static final a:Landroid/support/v7/a/bf;


# instance fields
.field private final b:Landroid/content/Context;

.field private final c:Landroid/location/LocationManager;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroid/support/v7/a/bf;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroid/support/v7/a/bf;-><init>(Landroid/support/v7/a/be;)V

    sput-object v0, Landroid/support/v7/a/bd;->a:Landroid/support/v7/a/bf;

    return-void
.end method

.method constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroid/support/v7/a/bd;->b:Landroid/content/Context;

    const-string v0, "location"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/location/LocationManager;

    iput-object v0, p0, Landroid/support/v7/a/bd;->c:Landroid/location/LocationManager;

    return-void
.end method

.method private a(Ljava/lang/String;)Landroid/location/Location;
    .locals 3

    iget-object v0, p0, Landroid/support/v7/a/bd;->c:Landroid/location/LocationManager;

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Landroid/support/v7/a/bd;->c:Landroid/location/LocationManager;

    invoke-virtual {v0, p1}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/a/bd;->c:Landroid/location/LocationManager;

    invoke-virtual {v0, p1}, Landroid/location/LocationManager;->getLastKnownLocation(Ljava/lang/String;)Landroid/location/Location;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const-string v1, "TwilightManager"

    const-string v2, "Failed to get last known location"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private a(Landroid/location/Location;)V
    .locals 20

    sget-object v10, Landroid/support/v7/a/bd;->a:Landroid/support/v7/a/bf;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    invoke-static {}, Landroid/support/v7/a/bc;->a()Landroid/support/v7/a/bc;

    move-result-object v3

    const-wide/32 v4, 0x5265c00

    sub-long v4, v12, v4

    invoke-virtual/range {p1 .. p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v6

    invoke-virtual/range {p1 .. p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v8

    invoke-virtual/range {v3 .. v9}, Landroid/support/v7/a/bc;->a(JDD)V

    iget-wide v14, v3, Landroid/support/v7/a/bc;->a:J

    invoke-virtual/range {p1 .. p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v6

    invoke-virtual/range {p1 .. p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v8

    move-wide v4, v12

    invoke-virtual/range {v3 .. v9}, Landroid/support/v7/a/bc;->a(JDD)V

    iget v2, v3, Landroid/support/v7/a/bc;->c:I

    const/4 v4, 0x1

    if-ne v2, v4, :cond_1

    const/4 v2, 0x1

    :goto_0
    iget-wide v0, v3, Landroid/support/v7/a/bc;->b:J

    move-wide/from16 v16, v0

    iget-wide v0, v3, Landroid/support/v7/a/bc;->a:J

    move-wide/from16 v18, v0

    const-wide/32 v4, 0x5265c00

    add-long/2addr v4, v12

    invoke-virtual/range {p1 .. p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v6

    invoke-virtual/range {p1 .. p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v8

    invoke-virtual/range {v3 .. v9}, Landroid/support/v7/a/bc;->a(JDD)V

    iget-wide v6, v3, Landroid/support/v7/a/bc;->b:J

    const-wide/16 v4, 0x0

    const-wide/16 v8, -0x1

    cmp-long v3, v16, v8

    if-eqz v3, :cond_0

    const-wide/16 v8, -0x1

    cmp-long v3, v18, v8

    if-nez v3, :cond_2

    :cond_0
    const-wide/32 v4, 0x2932e00

    add-long/2addr v4, v12

    :goto_1
    iput-boolean v2, v10, Landroid/support/v7/a/bf;->a:Z

    iput-wide v14, v10, Landroid/support/v7/a/bf;->b:J

    move-wide/from16 v0, v16

    iput-wide v0, v10, Landroid/support/v7/a/bf;->c:J

    move-wide/from16 v0, v18

    iput-wide v0, v10, Landroid/support/v7/a/bf;->d:J

    iput-wide v6, v10, Landroid/support/v7/a/bf;->e:J

    iput-wide v4, v10, Landroid/support/v7/a/bf;->f:J

    return-void

    :cond_1
    const/4 v2, 0x0

    goto :goto_0

    :cond_2
    cmp-long v3, v12, v18

    if-lez v3, :cond_3

    add-long/2addr v4, v6

    :goto_2
    const-wide/32 v8, 0xea60

    add-long/2addr v4, v8

    goto :goto_1

    :cond_3
    cmp-long v3, v12, v16

    if-lez v3, :cond_4

    add-long v4, v4, v18

    goto :goto_2

    :cond_4
    add-long v4, v4, v16

    goto :goto_2
.end method

.method private a(Landroid/support/v7/a/bf;)Z
    .locals 4

    if-eqz p1, :cond_0

    iget-wide v0, p1, Landroid/support/v7/a/bf;->f:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private b()Landroid/location/Location;
    .locals 6

    const/4 v1, 0x0

    iget-object v0, p0, Landroid/support/v7/a/bd;->b:Landroid/content/Context;

    const-string v2, "android.permission.ACCESS_COARSE_LOCATION"

    invoke-static {v0, v2}, Landroid/support/v4/c/o;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "network"

    invoke-direct {p0, v0}, Landroid/support/v7/a/bd;->a(Ljava/lang/String;)Landroid/location/Location;

    move-result-object v0

    :goto_0
    iget-object v2, p0, Landroid/support/v7/a/bd;->b:Landroid/content/Context;

    const-string v3, "android.permission.ACCESS_FINE_LOCATION"

    invoke-static {v2, v3}, Landroid/support/v4/c/o;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    if-nez v2, :cond_0

    const-string v1, "gps"

    invoke-direct {p0, v1}, Landroid/support/v7/a/bd;->a(Ljava/lang/String;)Landroid/location/Location;

    move-result-object v1

    :cond_0
    if-eqz v1, :cond_2

    if-eqz v0, :cond_2

    invoke-virtual {v1}, Landroid/location/Location;->getTime()J

    move-result-wide v2

    invoke-virtual {v0}, Landroid/location/Location;->getTime()J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-lez v2, :cond_1

    move-object v0, v1

    :cond_1
    :goto_1
    return-object v0

    :cond_2
    if-eqz v1, :cond_3

    :goto_2
    move-object v0, v1

    goto :goto_1

    :cond_3
    move-object v1, v0

    goto :goto_2

    :cond_4
    move-object v0, v1

    goto :goto_0
.end method


# virtual methods
.method a()Z
    .locals 2

    sget-object v0, Landroid/support/v7/a/bd;->a:Landroid/support/v7/a/bf;

    invoke-direct {p0, v0}, Landroid/support/v7/a/bd;->a(Landroid/support/v7/a/bf;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-boolean v0, v0, Landroid/support/v7/a/bf;->a:Z

    :goto_0
    return v0

    :cond_0
    invoke-direct {p0}, Landroid/support/v7/a/bd;->b()Landroid/location/Location;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-direct {p0, v1}, Landroid/support/v7/a/bd;->a(Landroid/location/Location;)V

    iget-boolean v0, v0, Landroid/support/v7/a/bf;->a:Z

    goto :goto_0

    :cond_1
    const-string v0, "TwilightManager"

    const-string v1, "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values."

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    const/16 v1, 0xb

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    move-result v0

    const/4 v1, 0x6

    if-lt v0, v1, :cond_2

    const/16 v1, 0x16

    if-lt v0, v1, :cond_3

    :cond_2
    const/4 v0, 0x1

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    goto :goto_0
.end method
