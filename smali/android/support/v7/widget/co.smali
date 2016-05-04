.class Landroid/support/v7/widget/co;
.super Landroid/support/v7/widget/cr;


# instance fields
.field final synthetic a:Landroid/support/v7/widget/cp;

.field final synthetic b:Landroid/support/v4/i/di;

.field final synthetic c:Landroid/view/View;

.field final synthetic d:Landroid/support/v7/widget/cg;


# direct methods
.method constructor <init>(Landroid/support/v7/widget/cg;Landroid/support/v7/widget/cp;Landroid/support/v4/i/di;Landroid/view/View;)V
    .locals 1

    iput-object p1, p0, Landroid/support/v7/widget/co;->d:Landroid/support/v7/widget/cg;

    iput-object p2, p0, Landroid/support/v7/widget/co;->a:Landroid/support/v7/widget/cp;

    iput-object p3, p0, Landroid/support/v7/widget/co;->b:Landroid/support/v4/i/di;

    iput-object p4, p0, Landroid/support/v7/widget/co;->c:Landroid/view/View;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Landroid/support/v7/widget/cr;-><init>(Landroid/support/v7/widget/ch;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;)V
    .locals 3

    iget-object v0, p0, Landroid/support/v7/widget/co;->d:Landroid/support/v7/widget/cg;

    iget-object v1, p0, Landroid/support/v7/widget/co;->a:Landroid/support/v7/widget/cp;

    iget-object v1, v1, Landroid/support/v7/widget/cp;->b:Landroid/support/v7/widget/fh;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/support/v7/widget/cg;->b(Landroid/support/v7/widget/fh;Z)V

    return-void
.end method

.method public b(Landroid/view/View;)V
    .locals 3

    const/4 v2, 0x0

    iget-object v0, p0, Landroid/support/v7/widget/co;->b:Landroid/support/v4/i/di;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v4/i/di;->a(Landroid/support/v4/i/dz;)Landroid/support/v4/i/di;

    iget-object v0, p0, Landroid/support/v7/widget/co;->c:Landroid/view/View;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v0, v1}, Landroid/support/v4/i/bu;->c(Landroid/view/View;F)V

    iget-object v0, p0, Landroid/support/v7/widget/co;->c:Landroid/view/View;

    invoke-static {v0, v2}, Landroid/support/v4/i/bu;->a(Landroid/view/View;F)V

    iget-object v0, p0, Landroid/support/v7/widget/co;->c:Landroid/view/View;

    invoke-static {v0, v2}, Landroid/support/v4/i/bu;->b(Landroid/view/View;F)V

    iget-object v0, p0, Landroid/support/v7/widget/co;->d:Landroid/support/v7/widget/cg;

    iget-object v1, p0, Landroid/support/v7/widget/co;->a:Landroid/support/v7/widget/cp;

    iget-object v1, v1, Landroid/support/v7/widget/cp;->b:Landroid/support/v7/widget/fh;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/support/v7/widget/cg;->a(Landroid/support/v7/widget/fh;Z)V

    iget-object v0, p0, Landroid/support/v7/widget/co;->d:Landroid/support/v7/widget/cg;

    invoke-static {v0}, Landroid/support/v7/widget/cg;->h(Landroid/support/v7/widget/cg;)Ljava/util/ArrayList;

    move-result-object v0

    iget-object v1, p0, Landroid/support/v7/widget/co;->a:Landroid/support/v7/widget/cp;

    iget-object v1, v1, Landroid/support/v7/widget/cp;->b:Landroid/support/v7/widget/fh;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-object v0, p0, Landroid/support/v7/widget/co;->d:Landroid/support/v7/widget/cg;

    invoke-static {v0}, Landroid/support/v7/widget/cg;->e(Landroid/support/v7/widget/cg;)V

    return-void
.end method
