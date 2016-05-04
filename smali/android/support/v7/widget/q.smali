.class Landroid/support/v7/widget/q;
.super Landroid/support/v7/widget/dl;


# instance fields
.field final synthetic a:Landroid/support/v7/widget/k;

.field final synthetic b:Landroid/support/v7/widget/p;


# direct methods
.method constructor <init>(Landroid/support/v7/widget/p;Landroid/view/View;Landroid/support/v7/widget/k;)V
    .locals 0

    iput-object p1, p0, Landroid/support/v7/widget/q;->b:Landroid/support/v7/widget/p;

    iput-object p3, p0, Landroid/support/v7/widget/q;->a:Landroid/support/v7/widget/k;

    invoke-direct {p0, p2}, Landroid/support/v7/widget/dl;-><init>(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public a()Landroid/support/v7/widget/dg;
    .locals 1

    iget-object v0, p0, Landroid/support/v7/widget/q;->b:Landroid/support/v7/widget/p;

    iget-object v0, v0, Landroid/support/v7/widget/p;->a:Landroid/support/v7/widget/k;

    invoke-static {v0}, Landroid/support/v7/widget/k;->a(Landroid/support/v7/widget/k;)Landroid/support/v7/widget/r;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/q;->b:Landroid/support/v7/widget/p;

    iget-object v0, v0, Landroid/support/v7/widget/p;->a:Landroid/support/v7/widget/k;

    invoke-static {v0}, Landroid/support/v7/widget/k;->a(Landroid/support/v7/widget/k;)Landroid/support/v7/widget/r;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/widget/r;->c()Landroid/support/v7/widget/dg;

    move-result-object v0

    goto :goto_0
.end method

.method public b()Z
    .locals 1

    iget-object v0, p0, Landroid/support/v7/widget/q;->b:Landroid/support/v7/widget/p;

    iget-object v0, v0, Landroid/support/v7/widget/p;->a:Landroid/support/v7/widget/k;

    invoke-virtual {v0}, Landroid/support/v7/widget/k;->d()Z

    const/4 v0, 0x1

    return v0
.end method

.method public c()Z
    .locals 1

    iget-object v0, p0, Landroid/support/v7/widget/q;->b:Landroid/support/v7/widget/p;

    iget-object v0, v0, Landroid/support/v7/widget/p;->a:Landroid/support/v7/widget/k;

    invoke-static {v0}, Landroid/support/v7/widget/k;->b(Landroid/support/v7/widget/k;)Landroid/support/v7/widget/o;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/q;->b:Landroid/support/v7/widget/p;

    iget-object v0, v0, Landroid/support/v7/widget/p;->a:Landroid/support/v7/widget/k;

    invoke-virtual {v0}, Landroid/support/v7/widget/k;->e()Z

    const/4 v0, 0x1

    goto :goto_0
.end method
