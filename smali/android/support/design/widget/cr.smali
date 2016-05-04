.class final Landroid/support/design/widget/cr;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/support/design/widget/ca;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Landroid/support/design/widget/bx;
    .locals 3

    new-instance v1, Landroid/support/design/widget/bx;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0xc

    if-lt v0, v2, :cond_0

    new-instance v0, Landroid/support/design/widget/cg;

    invoke-direct {v0}, Landroid/support/design/widget/cg;-><init>()V

    :goto_0
    invoke-direct {v1, v0}, Landroid/support/design/widget/bx;-><init>(Landroid/support/design/widget/cb;)V

    return-object v1

    :cond_0
    new-instance v0, Landroid/support/design/widget/ce;

    invoke-direct {v0}, Landroid/support/design/widget/ce;-><init>()V

    goto :goto_0
.end method
