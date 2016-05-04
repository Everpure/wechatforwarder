.class public final Landroid/support/v4/i/ab;
.super Ljava/lang/Object;


# static fields
.field static final a:Landroid/support/v4/i/ac;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    new-instance v0, Landroid/support/v4/i/af;

    invoke-direct {v0}, Landroid/support/v4/i/af;-><init>()V

    sput-object v0, Landroid/support/v4/i/ab;->a:Landroid/support/v4/i/ac;

    :goto_0
    return-void

    :cond_0
    const/16 v1, 0xb

    if-lt v0, v1, :cond_1

    new-instance v0, Landroid/support/v4/i/ae;

    invoke-direct {v0}, Landroid/support/v4/i/ae;-><init>()V

    sput-object v0, Landroid/support/v4/i/ab;->a:Landroid/support/v4/i/ac;

    goto :goto_0

    :cond_1
    new-instance v0, Landroid/support/v4/i/ad;

    invoke-direct {v0}, Landroid/support/v4/i/ad;-><init>()V

    sput-object v0, Landroid/support/v4/i/ab;->a:Landroid/support/v4/i/ac;

    goto :goto_0
.end method

.method public static a(Landroid/view/LayoutInflater;)Landroid/support/v4/i/al;
    .locals 1

    sget-object v0, Landroid/support/v4/i/ab;->a:Landroid/support/v4/i/ac;

    invoke-interface {v0, p0}, Landroid/support/v4/i/ac;->a(Landroid/view/LayoutInflater;)Landroid/support/v4/i/al;

    move-result-object v0

    return-object v0
.end method

.method public static a(Landroid/view/LayoutInflater;Landroid/support/v4/i/al;)V
    .locals 1

    sget-object v0, Landroid/support/v4/i/ab;->a:Landroid/support/v4/i/ac;

    invoke-interface {v0, p0, p1}, Landroid/support/v4/i/ac;->a(Landroid/view/LayoutInflater;Landroid/support/v4/i/al;)V

    return-void
.end method
