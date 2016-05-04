.class Landroid/support/design/widget/an;
.super Landroid/animation/AnimatorListenerAdapter;


# instance fields
.field final synthetic a:Z

.field final synthetic b:Landroid/support/design/widget/ar;

.field final synthetic c:Landroid/support/design/widget/am;

.field private d:Z


# direct methods
.method constructor <init>(Landroid/support/design/widget/am;ZLandroid/support/design/widget/ar;)V
    .locals 0

    iput-object p1, p0, Landroid/support/design/widget/an;->c:Landroid/support/design/widget/am;

    iput-boolean p2, p0, Landroid/support/design/widget/an;->a:Z

    iput-object p3, p0, Landroid/support/design/widget/an;->b:Landroid/support/design/widget/ar;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 2

    iget-object v0, p0, Landroid/support/design/widget/an;->c:Landroid/support/design/widget/am;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/support/design/widget/am;->a(Landroid/support/design/widget/am;Z)Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/design/widget/an;->d:Z

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 3

    iget-object v0, p0, Landroid/support/design/widget/an;->c:Landroid/support/design/widget/am;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/support/design/widget/am;->a(Landroid/support/design/widget/am;Z)Z

    iget-boolean v0, p0, Landroid/support/design/widget/an;->d:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Landroid/support/design/widget/an;->c:Landroid/support/design/widget/am;

    iget-object v0, v0, Landroid/support/design/widget/am;->k:Landroid/support/design/widget/cw;

    const/16 v1, 0x8

    iget-boolean v2, p0, Landroid/support/design/widget/an;->a:Z

    invoke-virtual {v0, v1, v2}, Landroid/support/design/widget/cw;->a(IZ)V

    iget-object v0, p0, Landroid/support/design/widget/an;->b:Landroid/support/design/widget/ar;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/design/widget/an;->b:Landroid/support/design/widget/ar;

    invoke-interface {v0}, Landroid/support/design/widget/ar;->b()V

    :cond_0
    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 3

    const/4 v2, 0x0

    iget-object v0, p0, Landroid/support/design/widget/an;->c:Landroid/support/design/widget/am;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Landroid/support/design/widget/am;->a(Landroid/support/design/widget/am;Z)Z

    iput-boolean v2, p0, Landroid/support/design/widget/an;->d:Z

    iget-object v0, p0, Landroid/support/design/widget/an;->c:Landroid/support/design/widget/am;

    iget-object v0, v0, Landroid/support/design/widget/am;->k:Landroid/support/design/widget/cw;

    iget-boolean v1, p0, Landroid/support/design/widget/an;->a:Z

    invoke-virtual {v0, v2, v1}, Landroid/support/design/widget/cw;->a(IZ)V

    return-void
.end method
