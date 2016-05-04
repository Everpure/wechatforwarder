.class public final Landroid/support/v4/g/h;
.super Ljava/lang/Object;


# static fields
.field public static final a:Ljava/util/Locale;

.field private static final b:Landroid/support/v4/g/j;

.field private static c:Ljava/lang/String;

.field private static d:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v2, 0x0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    if-lt v0, v1, :cond_0

    new-instance v0, Landroid/support/v4/g/k;

    invoke-direct {v0, v2}, Landroid/support/v4/g/k;-><init>(Landroid/support/v4/g/i;)V

    sput-object v0, Landroid/support/v4/g/h;->b:Landroid/support/v4/g/j;

    :goto_0
    new-instance v0, Ljava/util/Locale;

    const-string v1, ""

    const-string v2, ""

    invoke-direct {v0, v1, v2}, Ljava/util/Locale;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Landroid/support/v4/g/h;->a:Ljava/util/Locale;

    const-string v0, "Arab"

    sput-object v0, Landroid/support/v4/g/h;->c:Ljava/lang/String;

    const-string v0, "Hebr"

    sput-object v0, Landroid/support/v4/g/h;->d:Ljava/lang/String;

    return-void

    :cond_0
    new-instance v0, Landroid/support/v4/g/j;

    invoke-direct {v0, v2}, Landroid/support/v4/g/j;-><init>(Landroid/support/v4/g/i;)V

    sput-object v0, Landroid/support/v4/g/h;->b:Landroid/support/v4/g/j;

    goto :goto_0
.end method

.method public static a(Ljava/util/Locale;)I
    .locals 1

    sget-object v0, Landroid/support/v4/g/h;->b:Landroid/support/v4/g/j;

    invoke-virtual {v0, p0}, Landroid/support/v4/g/j;->a(Ljava/util/Locale;)I

    move-result v0

    return v0
.end method

.method static synthetic a()Ljava/lang/String;
    .locals 1

    sget-object v0, Landroid/support/v4/g/h;->c:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic b()Ljava/lang/String;
    .locals 1

    sget-object v0, Landroid/support/v4/g/h;->d:Ljava/lang/String;

    return-object v0
.end method
