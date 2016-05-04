.class Landroid/support/design/widget/cq;
.super Ljava/lang/Object;


# static fields
.field static final a:Landroid/support/design/widget/ca;

.field private static final b:Landroid/support/design/widget/cs;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v2, 0x0

    new-instance v0, Landroid/support/design/widget/cr;

    invoke-direct {v0}, Landroid/support/design/widget/cr;-><init>()V

    sput-object v0, Landroid/support/design/widget/cq;->a:Landroid/support/design/widget/ca;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    new-instance v0, Landroid/support/design/widget/cu;

    invoke-direct {v0, v2}, Landroid/support/design/widget/cu;-><init>(Landroid/support/design/widget/cr;)V

    sput-object v0, Landroid/support/design/widget/cq;->b:Landroid/support/design/widget/cs;

    :goto_0
    return-void

    :cond_0
    new-instance v0, Landroid/support/design/widget/ct;

    invoke-direct {v0, v2}, Landroid/support/design/widget/ct;-><init>(Landroid/support/design/widget/cr;)V

    sput-object v0, Landroid/support/design/widget/cq;->b:Landroid/support/design/widget/cs;

    goto :goto_0
.end method

.method static a()Landroid/support/design/widget/bx;
    .locals 1

    sget-object v0, Landroid/support/design/widget/cq;->a:Landroid/support/design/widget/ca;

    invoke-interface {v0}, Landroid/support/design/widget/ca;->a()Landroid/support/design/widget/bx;

    move-result-object v0

    return-object v0
.end method

.method static a(Landroid/view/View;)V
    .locals 1

    sget-object v0, Landroid/support/design/widget/cq;->b:Landroid/support/design/widget/cs;

    invoke-interface {v0, p0}, Landroid/support/design/widget/cs;->a(Landroid/view/View;)V

    return-void
.end method
