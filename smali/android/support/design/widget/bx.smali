.class Landroid/support/design/widget/bx;
.super Ljava/lang/Object;


# instance fields
.field private final a:Landroid/support/design/widget/cb;


# direct methods
.method constructor <init>(Landroid/support/design/widget/cb;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroid/support/design/widget/bx;->a:Landroid/support/design/widget/cb;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Landroid/support/design/widget/bx;->a:Landroid/support/design/widget/cb;

    invoke-virtual {v0}, Landroid/support/design/widget/cb;->a()V

    return-void
.end method

.method public a(FF)V
    .locals 1

    iget-object v0, p0, Landroid/support/design/widget/bx;->a:Landroid/support/design/widget/cb;

    invoke-virtual {v0, p1, p2}, Landroid/support/design/widget/cb;->a(FF)V

    return-void
.end method

.method public a(I)V
    .locals 1

    iget-object v0, p0, Landroid/support/design/widget/bx;->a:Landroid/support/design/widget/cb;

    invoke-virtual {v0, p1}, Landroid/support/design/widget/cb;->a(I)V

    return-void
.end method

.method public a(II)V
    .locals 1

    iget-object v0, p0, Landroid/support/design/widget/bx;->a:Landroid/support/design/widget/cb;

    invoke-virtual {v0, p1, p2}, Landroid/support/design/widget/cb;->a(II)V

    return-void
.end method

.method public a(Landroid/support/design/widget/bz;)V
    .locals 2

    if-eqz p1, :cond_0

    iget-object v0, p0, Landroid/support/design/widget/bx;->a:Landroid/support/design/widget/cb;

    new-instance v1, Landroid/support/design/widget/by;

    invoke-direct {v1, p0, p1}, Landroid/support/design/widget/by;-><init>(Landroid/support/design/widget/bx;Landroid/support/design/widget/bz;)V

    invoke-virtual {v0, v1}, Landroid/support/design/widget/cb;->a(Landroid/support/design/widget/cd;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Landroid/support/design/widget/bx;->a:Landroid/support/design/widget/cb;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/design/widget/cb;->a(Landroid/support/design/widget/cd;)V

    goto :goto_0
.end method

.method public a(Landroid/view/animation/Interpolator;)V
    .locals 1

    iget-object v0, p0, Landroid/support/design/widget/bx;->a:Landroid/support/design/widget/cb;

    invoke-virtual {v0, p1}, Landroid/support/design/widget/cb;->a(Landroid/view/animation/Interpolator;)V

    return-void
.end method

.method public b()Z
    .locals 1

    iget-object v0, p0, Landroid/support/design/widget/bx;->a:Landroid/support/design/widget/cb;

    invoke-virtual {v0}, Landroid/support/design/widget/cb;->b()Z

    move-result v0

    return v0
.end method

.method public c()I
    .locals 1

    iget-object v0, p0, Landroid/support/design/widget/bx;->a:Landroid/support/design/widget/cb;

    invoke-virtual {v0}, Landroid/support/design/widget/cb;->c()I

    move-result v0

    return v0
.end method

.method public d()F
    .locals 1

    iget-object v0, p0, Landroid/support/design/widget/bx;->a:Landroid/support/design/widget/cb;

    invoke-virtual {v0}, Landroid/support/design/widget/cb;->d()F

    move-result v0

    return v0
.end method

.method public e()V
    .locals 1

    iget-object v0, p0, Landroid/support/design/widget/bx;->a:Landroid/support/design/widget/cb;

    invoke-virtual {v0}, Landroid/support/design/widget/cb;->e()V

    return-void
.end method
