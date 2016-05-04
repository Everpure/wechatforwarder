.class Lcom/yalantis/ucrop/m;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/yalantis/ucrop/view/k;


# instance fields
.field final synthetic a:Lcom/yalantis/ucrop/UCropActivity;


# direct methods
.method constructor <init>(Lcom/yalantis/ucrop/UCropActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/yalantis/ucrop/m;->a:Lcom/yalantis/ucrop/UCropActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    iget-object v0, p0, Lcom/yalantis/ucrop/m;->a:Lcom/yalantis/ucrop/UCropActivity;

    sget v1, Lcom/yalantis/ucrop/f;->ucrop:I

    invoke-virtual {v0, v1}, Lcom/yalantis/ucrop/UCropActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/yalantis/ucrop/m;->a:Lcom/yalantis/ucrop/UCropActivity;

    invoke-virtual {v1}, Lcom/yalantis/ucrop/UCropActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/yalantis/ucrop/b;->ucrop_fade_in:I

    invoke-static {v1, v2}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v1

    new-instance v2, Lcom/yalantis/ucrop/n;

    invoke-direct {v2, p0}, Lcom/yalantis/ucrop/n;-><init>(Lcom/yalantis/ucrop/m;)V

    invoke-virtual {v1, v2}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method public a(F)V
    .locals 1

    iget-object v0, p0, Lcom/yalantis/ucrop/m;->a:Lcom/yalantis/ucrop/UCropActivity;

    invoke-static {v0, p1}, Lcom/yalantis/ucrop/UCropActivity;->a(Lcom/yalantis/ucrop/UCropActivity;F)V

    return-void
.end method

.method public a(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Lcom/yalantis/ucrop/m;->a:Lcom/yalantis/ucrop/UCropActivity;

    invoke-static {v0, p1}, Lcom/yalantis/ucrop/UCropActivity;->a(Lcom/yalantis/ucrop/UCropActivity;Ljava/lang/Throwable;)V

    iget-object v0, p0, Lcom/yalantis/ucrop/m;->a:Lcom/yalantis/ucrop/UCropActivity;

    invoke-virtual {v0}, Lcom/yalantis/ucrop/UCropActivity;->finish()V

    return-void
.end method

.method public b(F)V
    .locals 1

    iget-object v0, p0, Lcom/yalantis/ucrop/m;->a:Lcom/yalantis/ucrop/UCropActivity;

    invoke-static {v0, p1}, Lcom/yalantis/ucrop/UCropActivity;->b(Lcom/yalantis/ucrop/UCropActivity;F)V

    return-void
.end method
