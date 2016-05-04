.class Landroid/support/v7/widget/cl;
.super Landroid/support/v7/widget/cr;


# instance fields
.field final synthetic a:Landroid/support/v7/widget/fh;

.field final synthetic b:Landroid/support/v4/i/di;

.field final synthetic c:Landroid/support/v7/widget/cg;


# direct methods
.method constructor <init>(Landroid/support/v7/widget/cg;Landroid/support/v7/widget/fh;Landroid/support/v4/i/di;)V
    .locals 1

    iput-object p1, p0, Landroid/support/v7/widget/cl;->c:Landroid/support/v7/widget/cg;

    iput-object p2, p0, Landroid/support/v7/widget/cl;->a:Landroid/support/v7/widget/fh;

    iput-object p3, p0, Landroid/support/v7/widget/cl;->b:Landroid/support/v4/i/di;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Landroid/support/v7/widget/cr;-><init>(Landroid/support/v7/widget/ch;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Landroid/support/v7/widget/cl;->c:Landroid/support/v7/widget/cg;

    iget-object v1, p0, Landroid/support/v7/widget/cl;->a:Landroid/support/v7/widget/fh;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/cg;->m(Landroid/support/v7/widget/fh;)V

    return-void
.end method

.method public b(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Landroid/support/v7/widget/cl;->b:Landroid/support/v4/i/di;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v4/i/di;->a(Landroid/support/v4/i/dz;)Landroid/support/v4/i/di;

    iget-object v0, p0, Landroid/support/v7/widget/cl;->c:Landroid/support/v7/widget/cg;

    iget-object v1, p0, Landroid/support/v7/widget/cl;->a:Landroid/support/v7/widget/fh;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/cg;->j(Landroid/support/v7/widget/fh;)V

    iget-object v0, p0, Landroid/support/v7/widget/cl;->c:Landroid/support/v7/widget/cg;

    invoke-static {v0}, Landroid/support/v7/widget/cg;->f(Landroid/support/v7/widget/cg;)Ljava/util/ArrayList;

    move-result-object v0

    iget-object v1, p0, Landroid/support/v7/widget/cl;->a:Landroid/support/v7/widget/fh;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-object v0, p0, Landroid/support/v7/widget/cl;->c:Landroid/support/v7/widget/cg;

    invoke-static {v0}, Landroid/support/v7/widget/cg;->e(Landroid/support/v7/widget/cg;)V

    return-void
.end method

.method public c(Landroid/view/View;)V
    .locals 1

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {p1, v0}, Landroid/support/v4/i/bu;->c(Landroid/view/View;F)V

    return-void
.end method
