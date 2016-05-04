.class Landroid/support/v7/widget/bk;
.super Landroid/support/v7/widget/dl;


# instance fields
.field final synthetic a:Landroid/support/v7/widget/bm;

.field final synthetic b:Landroid/support/v7/widget/bj;


# direct methods
.method constructor <init>(Landroid/support/v7/widget/bj;Landroid/view/View;Landroid/support/v7/widget/bm;)V
    .locals 0

    iput-object p1, p0, Landroid/support/v7/widget/bk;->b:Landroid/support/v7/widget/bj;

    iput-object p3, p0, Landroid/support/v7/widget/bk;->a:Landroid/support/v7/widget/bm;

    invoke-direct {p0, p2}, Landroid/support/v7/widget/dl;-><init>(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public a()Landroid/support/v7/widget/dg;
    .locals 1

    iget-object v0, p0, Landroid/support/v7/widget/bk;->a:Landroid/support/v7/widget/bm;

    return-object v0
.end method

.method public b()Z
    .locals 1

    iget-object v0, p0, Landroid/support/v7/widget/bk;->b:Landroid/support/v7/widget/bj;

    invoke-static {v0}, Landroid/support/v7/widget/bj;->a(Landroid/support/v7/widget/bj;)Landroid/support/v7/widget/bm;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/widget/bm;->k()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/bk;->b:Landroid/support/v7/widget/bj;

    invoke-static {v0}, Landroid/support/v7/widget/bj;->a(Landroid/support/v7/widget/bj;)Landroid/support/v7/widget/bm;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/widget/bm;->c()V

    :cond_0
    const/4 v0, 0x1

    return v0
.end method
