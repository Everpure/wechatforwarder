.class Landroid/support/v7/a/ak;
.super Landroid/support/v4/i/ea;


# instance fields
.field final synthetic a:Landroid/support/v7/a/aj;


# direct methods
.method constructor <init>(Landroid/support/v7/a/aj;)V
    .locals 0

    iput-object p1, p0, Landroid/support/v7/a/ak;->a:Landroid/support/v7/a/aj;

    invoke-direct {p0}, Landroid/support/v4/i/ea;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Landroid/support/v7/a/ak;->a:Landroid/support/v7/a/aj;

    iget-object v0, v0, Landroid/support/v7/a/aj;->a:Landroid/support/v7/a/ae;

    iget-object v0, v0, Landroid/support/v7/a/ae;->n:Landroid/support/v7/widget/ActionBarContextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/ActionBarContextView;->setVisibility(I)V

    return-void
.end method

.method public b(Landroid/view/View;)V
    .locals 3

    const/4 v2, 0x0

    iget-object v0, p0, Landroid/support/v7/a/ak;->a:Landroid/support/v7/a/aj;

    iget-object v0, v0, Landroid/support/v7/a/aj;->a:Landroid/support/v7/a/ae;

    iget-object v0, v0, Landroid/support/v7/a/ae;->n:Landroid/support/v7/widget/ActionBarContextView;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v0, v1}, Landroid/support/v4/i/bu;->c(Landroid/view/View;F)V

    iget-object v0, p0, Landroid/support/v7/a/ak;->a:Landroid/support/v7/a/aj;

    iget-object v0, v0, Landroid/support/v7/a/aj;->a:Landroid/support/v7/a/ae;

    iget-object v0, v0, Landroid/support/v7/a/ae;->q:Landroid/support/v4/i/di;

    invoke-virtual {v0, v2}, Landroid/support/v4/i/di;->a(Landroid/support/v4/i/dz;)Landroid/support/v4/i/di;

    iget-object v0, p0, Landroid/support/v7/a/ak;->a:Landroid/support/v7/a/aj;

    iget-object v0, v0, Landroid/support/v7/a/aj;->a:Landroid/support/v7/a/ae;

    iput-object v2, v0, Landroid/support/v7/a/ae;->q:Landroid/support/v4/i/di;

    return-void
.end method
