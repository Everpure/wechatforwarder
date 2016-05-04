.class Landroid/support/design/widget/ao;
.super Landroid/animation/AnimatorListenerAdapter;


# instance fields
.field final synthetic a:Z

.field final synthetic b:Landroid/support/design/widget/ar;

.field final synthetic c:Landroid/support/design/widget/am;


# direct methods
.method constructor <init>(Landroid/support/design/widget/am;ZLandroid/support/design/widget/ar;)V
    .locals 0

    iput-object p1, p0, Landroid/support/design/widget/ao;->c:Landroid/support/design/widget/am;

    iput-boolean p2, p0, Landroid/support/design/widget/ao;->a:Z

    iput-object p3, p0, Landroid/support/design/widget/ao;->b:Landroid/support/design/widget/ar;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    iget-object v0, p0, Landroid/support/design/widget/ao;->b:Landroid/support/design/widget/ar;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/design/widget/ao;->b:Landroid/support/design/widget/ar;

    invoke-interface {v0}, Landroid/support/design/widget/ar;->a()V

    :cond_0
    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 3

    iget-object v0, p0, Landroid/support/design/widget/ao;->c:Landroid/support/design/widget/am;

    iget-object v0, v0, Landroid/support/design/widget/am;->k:Landroid/support/design/widget/cw;

    const/4 v1, 0x0

    iget-boolean v2, p0, Landroid/support/design/widget/ao;->a:Z

    invoke-virtual {v0, v1, v2}, Landroid/support/design/widget/cw;->a(IZ)V

    return-void
.end method
