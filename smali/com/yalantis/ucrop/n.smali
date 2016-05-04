.class Lcom/yalantis/ucrop/n;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# instance fields
.field final synthetic a:Lcom/yalantis/ucrop/m;


# direct methods
.method constructor <init>(Lcom/yalantis/ucrop/m;)V
    .locals 0

    iput-object p1, p0, Lcom/yalantis/ucrop/n;->a:Lcom/yalantis/ucrop/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 2

    iget-object v0, p0, Lcom/yalantis/ucrop/n;->a:Lcom/yalantis/ucrop/m;

    iget-object v0, v0, Lcom/yalantis/ucrop/m;->a:Lcom/yalantis/ucrop/UCropActivity;

    invoke-static {v0}, Lcom/yalantis/ucrop/UCropActivity;->a(Lcom/yalantis/ucrop/UCropActivity;)Lcom/yalantis/ucrop/view/UCropView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/yalantis/ucrop/view/UCropView;->setVisibility(I)V

    return-void
.end method
