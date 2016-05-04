.class public final Landroid/support/v4/i/v;
.super Ljava/lang/Object;


# static fields
.field static final a:Landroid/support/v4/i/z;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_0

    new-instance v0, Landroid/support/v4/i/y;

    invoke-direct {v0}, Landroid/support/v4/i/y;-><init>()V

    sput-object v0, Landroid/support/v4/i/v;->a:Landroid/support/v4/i/z;

    :goto_0
    return-void

    :cond_0
    new-instance v0, Landroid/support/v4/i/w;

    invoke-direct {v0}, Landroid/support/v4/i/w;-><init>()V

    sput-object v0, Landroid/support/v4/i/v;->a:Landroid/support/v4/i/z;

    goto :goto_0
.end method

.method public static a(Landroid/view/KeyEvent;I)Z
    .locals 2

    sget-object v0, Landroid/support/v4/i/v;->a:Landroid/support/v4/i/z;

    invoke-virtual {p0}, Landroid/view/KeyEvent;->getMetaState()I

    move-result v1

    invoke-interface {v0, v1, p1}, Landroid/support/v4/i/z;->a(II)Z

    move-result v0

    return v0
.end method
