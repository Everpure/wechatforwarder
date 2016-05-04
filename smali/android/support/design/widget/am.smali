.class Landroid/support/design/widget/am;
.super Landroid/support/design/widget/ag;


# instance fields
.field private m:Z


# direct methods
.method constructor <init>(Landroid/support/design/widget/cw;Landroid/support/design/widget/ay;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroid/support/design/widget/ag;-><init>(Landroid/support/design/widget/cw;Landroid/support/design/widget/ay;)V

    return-void
.end method

.method static synthetic a(Landroid/support/design/widget/am;Z)Z
    .locals 0

    iput-boolean p1, p0, Landroid/support/design/widget/am;->m:Z

    return p1
.end method

.method private e(F)V
    .locals 2

    iget-object v0, p0, Landroid/support/design/widget/am;->a:Landroid/support/design/widget/ax;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/design/widget/am;->a:Landroid/support/design/widget/ax;

    neg-float v1, p1

    invoke-virtual {v0, v1}, Landroid/support/design/widget/ax;->a(F)V

    :cond_0
    iget-object v0, p0, Landroid/support/design/widget/am;->d:Landroid/support/design/widget/o;

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroid/support/design/widget/am;->d:Landroid/support/design/widget/o;

    neg-float v1, p1

    invoke-virtual {v0, v1}, Landroid/support/design/widget/o;->b(F)V

    :cond_1
    return-void
.end method


# virtual methods
.method a(Landroid/support/design/widget/ar;Z)V
    .locals 4

    const/4 v1, 0x0

    iget-boolean v0, p0, Landroid/support/design/widget/am;->m:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Landroid/support/design/widget/am;->k:Landroid/support/design/widget/cw;

    invoke-virtual {v0}, Landroid/support/design/widget/cw;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_2

    :cond_0
    if-eqz p1, :cond_1

    invoke-interface {p1}, Landroid/support/design/widget/ar;->b()V

    :cond_1
    :goto_0
    return-void

    :cond_2
    iget-object v0, p0, Landroid/support/design/widget/am;->k:Landroid/support/design/widget/cw;

    invoke-static {v0}, Landroid/support/v4/i/bu;->A(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Landroid/support/design/widget/am;->k:Landroid/support/design/widget/cw;

    invoke-virtual {v0}, Landroid/support/design/widget/cw;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_3
    iget-object v0, p0, Landroid/support/design/widget/am;->k:Landroid/support/design/widget/cw;

    const/16 v1, 0x8

    invoke-virtual {v0, v1, p2}, Landroid/support/design/widget/cw;->a(IZ)V

    if-eqz p1, :cond_1

    invoke-interface {p1}, Landroid/support/design/widget/ar;->b()V

    goto :goto_0

    :cond_4
    iget-object v0, p0, Landroid/support/design/widget/am;->k:Landroid/support/design/widget/cw;

    invoke-virtual {v0}, Landroid/support/design/widget/cw;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->cancel()V

    iget-object v0, p0, Landroid/support/design/widget/am;->k:Landroid/support/design/widget/cw;

    invoke-virtual {v0}, Landroid/support/design/widget/cw;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->scaleX(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->scaleY(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v2, v3}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    sget-object v1, Landroid/support/design/widget/a;->c:Landroid/view/animation/Interpolator;

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    new-instance v1, Landroid/support/design/widget/an;

    invoke-direct {v1, p0, p2, p1}, Landroid/support/design/widget/an;-><init>(Landroid/support/design/widget/am;ZLandroid/support/design/widget/ar;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    goto :goto_0
.end method

.method b(Landroid/support/design/widget/ar;Z)V
    .locals 4

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    iget-boolean v0, p0, Landroid/support/design/widget/am;->m:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Landroid/support/design/widget/am;->k:Landroid/support/design/widget/cw;

    invoke-virtual {v0}, Landroid/support/design/widget/cw;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_2

    :cond_0
    iget-object v0, p0, Landroid/support/design/widget/am;->k:Landroid/support/design/widget/cw;

    invoke-static {v0}, Landroid/support/v4/i/bu;->A(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Landroid/support/design/widget/am;->k:Landroid/support/design/widget/cw;

    invoke-virtual {v0}, Landroid/support/design/widget/cw;->isInEditMode()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Landroid/support/design/widget/am;->k:Landroid/support/design/widget/cw;

    invoke-virtual {v0}, Landroid/support/design/widget/cw;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->cancel()V

    iget-object v0, p0, Landroid/support/design/widget/am;->k:Landroid/support/design/widget/cw;

    invoke-virtual {v0}, Landroid/support/design/widget/cw;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroid/support/design/widget/am;->k:Landroid/support/design/widget/cw;

    invoke-virtual {v0, v1}, Landroid/support/design/widget/cw;->setAlpha(F)V

    iget-object v0, p0, Landroid/support/design/widget/am;->k:Landroid/support/design/widget/cw;

    invoke-virtual {v0, v1}, Landroid/support/design/widget/cw;->setScaleY(F)V

    iget-object v0, p0, Landroid/support/design/widget/am;->k:Landroid/support/design/widget/cw;

    invoke-virtual {v0, v1}, Landroid/support/design/widget/cw;->setScaleX(F)V

    :cond_1
    iget-object v0, p0, Landroid/support/design/widget/am;->k:Landroid/support/design/widget/cw;

    invoke-virtual {v0}, Landroid/support/design/widget/cw;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/ViewPropertyAnimator;->scaleX(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/ViewPropertyAnimator;->scaleY(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v2, v3}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    sget-object v1, Landroid/support/design/widget/a;->d:Landroid/view/animation/Interpolator;

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    new-instance v1, Landroid/support/design/widget/ao;

    invoke-direct {v1, p0, p2, p1}, Landroid/support/design/widget/ao;-><init>(Landroid/support/design/widget/am;ZLandroid/support/design/widget/ar;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    :cond_2
    :goto_0
    return-void

    :cond_3
    iget-object v0, p0, Landroid/support/design/widget/am;->k:Landroid/support/design/widget/cw;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p2}, Landroid/support/design/widget/cw;->a(IZ)V

    iget-object v0, p0, Landroid/support/design/widget/am;->k:Landroid/support/design/widget/cw;

    invoke-virtual {v0, v2}, Landroid/support/design/widget/cw;->setAlpha(F)V

    iget-object v0, p0, Landroid/support/design/widget/am;->k:Landroid/support/design/widget/cw;

    invoke-virtual {v0, v2}, Landroid/support/design/widget/cw;->setScaleY(F)V

    iget-object v0, p0, Landroid/support/design/widget/am;->k:Landroid/support/design/widget/cw;

    invoke-virtual {v0, v2}, Landroid/support/design/widget/cw;->setScaleX(F)V

    if-eqz p1, :cond_2

    invoke-interface {p1}, Landroid/support/design/widget/ar;->a()V

    goto :goto_0
.end method

.method d()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method e()V
    .locals 1

    iget-object v0, p0, Landroid/support/design/widget/am;->k:Landroid/support/design/widget/cw;

    invoke-virtual {v0}, Landroid/support/design/widget/cw;->getRotation()F

    move-result v0

    invoke-direct {p0, v0}, Landroid/support/design/widget/am;->e(F)V

    return-void
.end method
