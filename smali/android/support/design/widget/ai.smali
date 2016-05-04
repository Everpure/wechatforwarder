.class Landroid/support/design/widget/ai;
.super Landroid/support/design/widget/b;


# instance fields
.field final synthetic a:Landroid/support/design/widget/ar;

.field final synthetic b:Landroid/support/design/widget/ag;


# direct methods
.method constructor <init>(Landroid/support/design/widget/ag;Landroid/support/design/widget/ar;)V
    .locals 0

    iput-object p1, p0, Landroid/support/design/widget/ai;->b:Landroid/support/design/widget/ag;

    iput-object p2, p0, Landroid/support/design/widget/ai;->a:Landroid/support/design/widget/ar;

    invoke-direct {p0}, Landroid/support/design/widget/b;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 1

    iget-object v0, p0, Landroid/support/design/widget/ai;->a:Landroid/support/design/widget/ar;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/design/widget/ai;->a:Landroid/support/design/widget/ar;

    invoke-interface {v0}, Landroid/support/design/widget/ar;->a()V

    :cond_0
    return-void
.end method
