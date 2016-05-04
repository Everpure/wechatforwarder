.class public final Landroid/support/v4/i/ct;
.super Ljava/lang/Object;


# static fields
.field static final a:Landroid/support/v4/i/cy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_0

    new-instance v0, Landroid/support/v4/i/cx;

    invoke-direct {v0}, Landroid/support/v4/i/cx;-><init>()V

    sput-object v0, Landroid/support/v4/i/ct;->a:Landroid/support/v4/i/cy;

    :goto_0
    return-void

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_1

    new-instance v0, Landroid/support/v4/i/cw;

    invoke-direct {v0}, Landroid/support/v4/i/cw;-><init>()V

    sput-object v0, Landroid/support/v4/i/ct;->a:Landroid/support/v4/i/cy;

    goto :goto_0

    :cond_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x8

    if-lt v0, v1, :cond_2

    new-instance v0, Landroid/support/v4/i/cv;

    invoke-direct {v0}, Landroid/support/v4/i/cv;-><init>()V

    sput-object v0, Landroid/support/v4/i/ct;->a:Landroid/support/v4/i/cy;

    goto :goto_0

    :cond_2
    new-instance v0, Landroid/support/v4/i/cu;

    invoke-direct {v0}, Landroid/support/v4/i/cu;-><init>()V

    sput-object v0, Landroid/support/v4/i/ct;->a:Landroid/support/v4/i/cy;

    goto :goto_0
.end method

.method public static a(Landroid/view/ViewConfiguration;)I
    .locals 1

    sget-object v0, Landroid/support/v4/i/ct;->a:Landroid/support/v4/i/cy;

    invoke-interface {v0, p0}, Landroid/support/v4/i/cy;->a(Landroid/view/ViewConfiguration;)I

    move-result v0

    return v0
.end method

.method public static b(Landroid/view/ViewConfiguration;)Z
    .locals 1

    sget-object v0, Landroid/support/v4/i/ct;->a:Landroid/support/v4/i/cy;

    invoke-interface {v0, p0}, Landroid/support/v4/i/cy;->b(Landroid/view/ViewConfiguration;)Z

    move-result v0

    return v0
.end method
