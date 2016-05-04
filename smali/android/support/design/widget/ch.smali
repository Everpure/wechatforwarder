.class Landroid/support/design/widget/ch;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field final synthetic a:Landroid/support/design/widget/cd;

.field final synthetic b:Landroid/support/design/widget/cg;


# direct methods
.method constructor <init>(Landroid/support/design/widget/cg;Landroid/support/design/widget/cd;)V
    .locals 0

    iput-object p1, p0, Landroid/support/design/widget/ch;->b:Landroid/support/design/widget/cg;

    iput-object p2, p0, Landroid/support/design/widget/ch;->a:Landroid/support/design/widget/cd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 1

    iget-object v0, p0, Landroid/support/design/widget/ch;->a:Landroid/support/design/widget/cd;

    invoke-interface {v0}, Landroid/support/design/widget/cd;->a()V

    return-void
.end method
