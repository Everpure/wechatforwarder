.class Landroid/support/v7/widget/bt;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/support/v7/widget/bx;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/support/v7/widget/bu;)F
    .locals 1

    invoke-interface {p1}, Landroid/support/v7/widget/bu;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/fk;

    check-cast v0, Landroid/support/v7/widget/fk;

    invoke-virtual {v0}, Landroid/support/v7/widget/fk;->a()F

    move-result v0

    return v0
.end method

.method public a()V
    .locals 0

    return-void
.end method

.method public a(Landroid/support/v7/widget/bu;F)V
    .locals 1

    invoke-interface {p1}, Landroid/support/v7/widget/bu;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/fk;

    check-cast v0, Landroid/support/v7/widget/fk;

    invoke-virtual {v0, p2}, Landroid/support/v7/widget/fk;->a(F)V

    return-void
.end method

.method public a(Landroid/support/v7/widget/bu;I)V
    .locals 1

    invoke-interface {p1}, Landroid/support/v7/widget/bu;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/fk;

    check-cast v0, Landroid/support/v7/widget/fk;

    invoke-virtual {v0, p2}, Landroid/support/v7/widget/fk;->a(I)V

    return-void
.end method

.method public a(Landroid/support/v7/widget/bu;Landroid/content/Context;IFFF)V
    .locals 2

    new-instance v0, Landroid/support/v7/widget/fk;

    invoke-direct {v0, p3, p4}, Landroid/support/v7/widget/fk;-><init>(IF)V

    invoke-interface {p1, v0}, Landroid/support/v7/widget/bu;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    move-object v0, p1

    check-cast v0, Landroid/view/View;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setClipToOutline(Z)V

    invoke-virtual {v0, p5}, Landroid/view/View;->setElevation(F)V

    invoke-virtual {p0, p1, p6}, Landroid/support/v7/widget/bt;->b(Landroid/support/v7/widget/bu;F)V

    return-void
.end method

.method public b(Landroid/support/v7/widget/bu;)F
    .locals 2

    invoke-virtual {p0, p1}, Landroid/support/v7/widget/bt;->d(Landroid/support/v7/widget/bu;)F

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v0, v1

    return v0
.end method

.method public b(Landroid/support/v7/widget/bu;F)V
    .locals 3

    invoke-interface {p1}, Landroid/support/v7/widget/bu;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/fk;

    check-cast v0, Landroid/support/v7/widget/fk;

    invoke-interface {p1}, Landroid/support/v7/widget/bu;->getUseCompatPadding()Z

    move-result v1

    invoke-interface {p1}, Landroid/support/v7/widget/bu;->getPreventCornerOverlap()Z

    move-result v2

    invoke-virtual {v0, p2, v1, v2}, Landroid/support/v7/widget/fk;->a(FZZ)V

    invoke-virtual {p0, p1}, Landroid/support/v7/widget/bt;->f(Landroid/support/v7/widget/bu;)V

    return-void
.end method

.method public c(Landroid/support/v7/widget/bu;)F
    .locals 2

    invoke-virtual {p0, p1}, Landroid/support/v7/widget/bt;->d(Landroid/support/v7/widget/bu;)F

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v0, v1

    return v0
.end method

.method public c(Landroid/support/v7/widget/bu;F)V
    .locals 0

    check-cast p1, Landroid/view/View;

    invoke-virtual {p1, p2}, Landroid/view/View;->setElevation(F)V

    return-void
.end method

.method public d(Landroid/support/v7/widget/bu;)F
    .locals 1

    invoke-interface {p1}, Landroid/support/v7/widget/bu;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/fk;

    check-cast v0, Landroid/support/v7/widget/fk;

    invoke-virtual {v0}, Landroid/support/v7/widget/fk;->b()F

    move-result v0

    return v0
.end method

.method public e(Landroid/support/v7/widget/bu;)F
    .locals 1

    check-cast p1, Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getElevation()F

    move-result v0

    return v0
.end method

.method public f(Landroid/support/v7/widget/bu;)V
    .locals 4

    const/4 v1, 0x0

    invoke-interface {p1}, Landroid/support/v7/widget/bu;->getUseCompatPadding()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p1, v1, v1, v1, v1}, Landroid/support/v7/widget/bu;->a(IIII)V

    :goto_0
    return-void

    :cond_0
    invoke-virtual {p0, p1}, Landroid/support/v7/widget/bt;->a(Landroid/support/v7/widget/bu;)F

    move-result v0

    invoke-virtual {p0, p1}, Landroid/support/v7/widget/bt;->d(Landroid/support/v7/widget/bu;)F

    move-result v1

    invoke-interface {p1}, Landroid/support/v7/widget/bu;->getPreventCornerOverlap()Z

    move-result v2

    invoke-static {v0, v1, v2}, Landroid/support/v7/widget/fl;->b(FFZ)F

    move-result v2

    float-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v2, v2

    invoke-interface {p1}, Landroid/support/v7/widget/bu;->getPreventCornerOverlap()Z

    move-result v3

    invoke-static {v0, v1, v3}, Landroid/support/v7/widget/fl;->a(FFZ)F

    move-result v0

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    invoke-interface {p1, v2, v0, v2, v0}, Landroid/support/v7/widget/bu;->a(IIII)V

    goto :goto_0
.end method

.method public g(Landroid/support/v7/widget/bu;)V
    .locals 1

    invoke-virtual {p0, p1}, Landroid/support/v7/widget/bt;->a(Landroid/support/v7/widget/bu;)F

    move-result v0

    invoke-virtual {p0, p1, v0}, Landroid/support/v7/widget/bt;->b(Landroid/support/v7/widget/bu;F)V

    return-void
.end method

.method public h(Landroid/support/v7/widget/bu;)V
    .locals 1

    invoke-virtual {p0, p1}, Landroid/support/v7/widget/bt;->a(Landroid/support/v7/widget/bu;)F

    move-result v0

    invoke-virtual {p0, p1, v0}, Landroid/support/v7/widget/bt;->b(Landroid/support/v7/widget/bu;F)V

    return-void
.end method
