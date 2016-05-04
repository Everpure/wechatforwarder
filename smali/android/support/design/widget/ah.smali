.class Landroid/support/design/widget/ah;
.super Landroid/support/design/widget/b;


# instance fields
.field final synthetic a:Z

.field final synthetic b:Landroid/support/design/widget/ar;

.field final synthetic c:Landroid/support/design/widget/ag;


# direct methods
.method constructor <init>(Landroid/support/design/widget/ag;ZLandroid/support/design/widget/ar;)V
    .locals 0

    iput-object p1, p0, Landroid/support/design/widget/ah;->c:Landroid/support/design/widget/ag;

    iput-boolean p2, p0, Landroid/support/design/widget/ah;->a:Z

    iput-object p3, p0, Landroid/support/design/widget/ah;->b:Landroid/support/design/widget/ar;

    invoke-direct {p0}, Landroid/support/design/widget/b;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 3

    iget-object v0, p0, Landroid/support/design/widget/ah;->c:Landroid/support/design/widget/ag;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/support/design/widget/ag;->a(Landroid/support/design/widget/ag;Z)Z

    iget-object v0, p0, Landroid/support/design/widget/ah;->c:Landroid/support/design/widget/ag;

    iget-object v0, v0, Landroid/support/design/widget/ag;->k:Landroid/support/design/widget/cw;

    const/16 v1, 0x8

    iget-boolean v2, p0, Landroid/support/design/widget/ah;->a:Z

    invoke-virtual {v0, v1, v2}, Landroid/support/design/widget/cw;->a(IZ)V

    iget-object v0, p0, Landroid/support/design/widget/ah;->b:Landroid/support/design/widget/ar;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/design/widget/ah;->b:Landroid/support/design/widget/ar;

    invoke-interface {v0}, Landroid/support/design/widget/ar;->b()V

    :cond_0
    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 2

    iget-object v0, p0, Landroid/support/design/widget/ah;->c:Landroid/support/design/widget/ag;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Landroid/support/design/widget/ag;->a(Landroid/support/design/widget/ag;Z)Z

    return-void
.end method
