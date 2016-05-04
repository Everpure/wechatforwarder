.class Lcom/yalantis/ucrop/view/j;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/yalantis/ucrop/a/b;


# instance fields
.field final synthetic a:Lcom/yalantis/ucrop/view/i;


# direct methods
.method constructor <init>(Lcom/yalantis/ucrop/view/i;)V
    .locals 0

    iput-object p1, p0, Lcom/yalantis/ucrop/view/j;->a:Lcom/yalantis/ucrop/view/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/Bitmap;)V
    .locals 2

    iget-object v0, p0, Lcom/yalantis/ucrop/view/j;->a:Lcom/yalantis/ucrop/view/i;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/yalantis/ucrop/view/i;->a(Lcom/yalantis/ucrop/view/i;Z)Z

    iget-object v0, p0, Lcom/yalantis/ucrop/view/j;->a:Lcom/yalantis/ucrop/view/i;

    invoke-virtual {v0, p1}, Lcom/yalantis/ucrop/view/i;->setImageBitmap(Landroid/graphics/Bitmap;)V

    iget-object v0, p0, Lcom/yalantis/ucrop/view/j;->a:Lcom/yalantis/ucrop/view/i;

    invoke-virtual {v0}, Lcom/yalantis/ucrop/view/i;->invalidate()V

    return-void
.end method

.method public a(Ljava/lang/Exception;)V
    .locals 2

    const-string v0, "TransformImageView"

    const-string v1, "onFailure: setImageUri"

    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iget-object v0, p0, Lcom/yalantis/ucrop/view/j;->a:Lcom/yalantis/ucrop/view/i;

    iget-object v0, v0, Lcom/yalantis/ucrop/view/i;->f:Lcom/yalantis/ucrop/view/k;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/yalantis/ucrop/view/j;->a:Lcom/yalantis/ucrop/view/i;

    iget-object v0, v0, Lcom/yalantis/ucrop/view/i;->f:Lcom/yalantis/ucrop/view/k;

    invoke-interface {v0, p1}, Lcom/yalantis/ucrop/view/k;->a(Ljava/lang/Exception;)V

    :cond_0
    return-void
.end method
