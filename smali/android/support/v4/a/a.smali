.class public final Landroid/support/v4/a/a;
.super Ljava/lang/Object;


# static fields
.field private static final a:Landroid/support/v4/a/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xc

    if-lt v0, v1, :cond_0

    new-instance v0, Landroid/support/v4/a/d;

    invoke-direct {v0}, Landroid/support/v4/a/d;-><init>()V

    sput-object v0, Landroid/support/v4/a/a;->a:Landroid/support/v4/a/b;

    :goto_0
    return-void

    :cond_0
    new-instance v0, Landroid/support/v4/a/c;

    invoke-direct {v0}, Landroid/support/v4/a/c;-><init>()V

    sput-object v0, Landroid/support/v4/a/a;->a:Landroid/support/v4/a/b;

    goto :goto_0
.end method

.method public static a(Landroid/view/View;)V
    .locals 1

    sget-object v0, Landroid/support/v4/a/a;->a:Landroid/support/v4/a/b;

    invoke-interface {v0, p0}, Landroid/support/v4/a/b;->a(Landroid/view/View;)V

    return-void
.end method
