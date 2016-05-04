.class Landroid/support/v7/widget/di;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Landroid/support/v7/widget/dg;


# direct methods
.method constructor <init>(Landroid/support/v7/widget/dg;)V
    .locals 0

    iput-object p1, p0, Landroid/support/v7/widget/di;->a:Landroid/support/v7/widget/dg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Landroid/support/v7/widget/di;->a:Landroid/support/v7/widget/dg;

    invoke-virtual {v0}, Landroid/support/v7/widget/dg;->e()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/di;->a:Landroid/support/v7/widget/dg;

    invoke-virtual {v0}, Landroid/support/v7/widget/dg;->c()V

    :cond_0
    return-void
.end method
