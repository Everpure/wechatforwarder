.class final Landroid/support/v4/i/dw;
.super Landroid/animation/AnimatorListenerAdapter;


# instance fields
.field final synthetic a:Landroid/support/v4/i/dz;

.field final synthetic b:Landroid/view/View;


# direct methods
.method constructor <init>(Landroid/support/v4/i/dz;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Landroid/support/v4/i/dw;->a:Landroid/support/v4/i/dz;

    iput-object p2, p0, Landroid/support/v4/i/dw;->b:Landroid/view/View;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 2

    iget-object v0, p0, Landroid/support/v4/i/dw;->a:Landroid/support/v4/i/dz;

    iget-object v1, p0, Landroid/support/v4/i/dw;->b:Landroid/view/View;

    invoke-interface {v0, v1}, Landroid/support/v4/i/dz;->c(Landroid/view/View;)V

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    iget-object v0, p0, Landroid/support/v4/i/dw;->a:Landroid/support/v4/i/dz;

    iget-object v1, p0, Landroid/support/v4/i/dw;->b:Landroid/view/View;

    invoke-interface {v0, v1}, Landroid/support/v4/i/dz;->b(Landroid/view/View;)V

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 2

    iget-object v0, p0, Landroid/support/v4/i/dw;->a:Landroid/support/v4/i/dz;

    iget-object v1, p0, Landroid/support/v4/i/dw;->b:Landroid/view/View;

    invoke-interface {v0, v1}, Landroid/support/v4/i/dz;->a(Landroid/view/View;)V

    return-void
.end method
