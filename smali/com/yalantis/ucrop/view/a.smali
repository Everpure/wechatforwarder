.class public Lcom/yalantis/ucrop/view/a;
.super Lcom/yalantis/ucrop/view/i;


# instance fields
.field private final g:Landroid/graphics/RectF;

.field private final h:Landroid/graphics/Matrix;

.field private i:F

.field private j:F

.field private k:Lcom/yalantis/ucrop/view/b;

.field private l:Ljava/lang/Runnable;

.field private m:Ljava/lang/Runnable;

.field private n:F

.field private o:F

.field private p:I

.field private q:I

.field private r:J


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/yalantis/ucrop/view/a;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/yalantis/ucrop/view/a;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0, p1, p2, p3}, Lcom/yalantis/ucrop/view/i;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/yalantis/ucrop/view/a;->g:Landroid/graphics/RectF;

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/yalantis/ucrop/view/a;->h:Landroid/graphics/Matrix;

    const/high16 v0, 0x41200000    # 10.0f

    iput v0, p0, Lcom/yalantis/ucrop/view/a;->j:F

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/yalantis/ucrop/view/a;->m:Ljava/lang/Runnable;

    iput v1, p0, Lcom/yalantis/ucrop/view/a;->p:I

    iput v1, p0, Lcom/yalantis/ucrop/view/a;->q:I

    const-wide/16 v0, 0x1f4

    iput-wide v0, p0, Lcom/yalantis/ucrop/view/a;->r:J

    return-void
.end method

.method static synthetic a(Lcom/yalantis/ucrop/view/a;)Landroid/graphics/RectF;
    .locals 1

    iget-object v0, p0, Lcom/yalantis/ucrop/view/a;->g:Landroid/graphics/RectF;

    return-object v0
.end method

.method private b(FF)V
    .locals 5

    const/high16 v4, 0x40000000    # 2.0f

    iget-object v0, p0, Lcom/yalantis/ucrop/view/a;->g:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v0

    iget-object v1, p0, Lcom/yalantis/ucrop/view/a;->g:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->height()F

    move-result v1

    div-float v2, v0, p1

    div-float v3, v1, p2

    invoke-static {v2, v3}, Ljava/lang/Math;->max(FF)F

    move-result v2

    iput v2, p0, Lcom/yalantis/ucrop/view/a;->o:F

    iget v2, p0, Lcom/yalantis/ucrop/view/a;->o:F

    iget v3, p0, Lcom/yalantis/ucrop/view/a;->j:F

    mul-float/2addr v2, v3

    iput v2, p0, Lcom/yalantis/ucrop/view/a;->n:F

    iget v2, p0, Lcom/yalantis/ucrop/view/a;->o:F

    mul-float/2addr v2, p1

    sub-float/2addr v0, v2

    div-float/2addr v0, v4

    iget-object v2, p0, Lcom/yalantis/ucrop/view/a;->g:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->left:F

    add-float/2addr v0, v2

    iget v2, p0, Lcom/yalantis/ucrop/view/a;->o:F

    mul-float/2addr v2, p2

    sub-float/2addr v1, v2

    div-float/2addr v1, v4

    iget-object v2, p0, Lcom/yalantis/ucrop/view/a;->g:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->top:F

    add-float/2addr v1, v2

    iget-object v2, p0, Lcom/yalantis/ucrop/view/a;->c:Landroid/graphics/Matrix;

    invoke-virtual {v2}, Landroid/graphics/Matrix;->reset()V

    iget-object v2, p0, Lcom/yalantis/ucrop/view/a;->c:Landroid/graphics/Matrix;

    iget v3, p0, Lcom/yalantis/ucrop/view/a;->o:F

    iget v4, p0, Lcom/yalantis/ucrop/view/a;->o:F

    invoke-virtual {v2, v3, v4}, Landroid/graphics/Matrix;->postScale(FF)Z

    iget-object v2, p0, Lcom/yalantis/ucrop/view/a;->c:Landroid/graphics/Matrix;

    invoke-virtual {v2, v0, v1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    return-void
.end method

.method private h()[F
    .locals 8

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/yalantis/ucrop/view/a;->h:Landroid/graphics/Matrix;

    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    iget-object v0, p0, Lcom/yalantis/ucrop/view/a;->h:Landroid/graphics/Matrix;

    invoke-virtual {p0}, Lcom/yalantis/ucrop/view/a;->getCurrentAngle()F

    move-result v2

    neg-float v2, v2

    invoke-virtual {v0, v2}, Landroid/graphics/Matrix;->setRotate(F)V

    iget-object v0, p0, Lcom/yalantis/ucrop/view/a;->a:[F

    iget-object v2, p0, Lcom/yalantis/ucrop/view/a;->a:[F

    array-length v2, v2

    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([FI)[F

    move-result-object v0

    iget-object v2, p0, Lcom/yalantis/ucrop/view/a;->g:Landroid/graphics/RectF;

    invoke-static {v2}, Lcom/yalantis/ucrop/a/k;->a(Landroid/graphics/RectF;)[F

    move-result-object v2

    iget-object v3, p0, Lcom/yalantis/ucrop/view/a;->h:Landroid/graphics/Matrix;

    invoke-virtual {v3, v0}, Landroid/graphics/Matrix;->mapPoints([F)V

    iget-object v3, p0, Lcom/yalantis/ucrop/view/a;->h:Landroid/graphics/Matrix;

    invoke-virtual {v3, v2}, Landroid/graphics/Matrix;->mapPoints([F)V

    invoke-static {v0}, Lcom/yalantis/ucrop/a/k;->b([F)Landroid/graphics/RectF;

    move-result-object v4

    invoke-static {v2}, Lcom/yalantis/ucrop/a/k;->b([F)Landroid/graphics/RectF;

    move-result-object v5

    iget v0, v4, Landroid/graphics/RectF;->left:F

    iget v2, v5, Landroid/graphics/RectF;->left:F

    sub-float/2addr v0, v2

    iget v2, v4, Landroid/graphics/RectF;->top:F

    iget v3, v5, Landroid/graphics/RectF;->top:F

    sub-float/2addr v2, v3

    iget v3, v4, Landroid/graphics/RectF;->right:F

    iget v6, v5, Landroid/graphics/RectF;->right:F

    sub-float/2addr v3, v6

    iget v4, v4, Landroid/graphics/RectF;->bottom:F

    iget v5, v5, Landroid/graphics/RectF;->bottom:F

    sub-float/2addr v4, v5

    const/4 v5, 0x4

    new-array v5, v5, [F

    const/4 v6, 0x0

    cmpl-float v7, v0, v1

    if-lez v7, :cond_1

    :goto_0
    aput v0, v5, v6

    const/4 v6, 0x1

    cmpl-float v0, v2, v1

    if-lez v0, :cond_2

    move v0, v2

    :goto_1
    aput v0, v5, v6

    const/4 v2, 0x2

    cmpg-float v0, v3, v1

    if-gez v0, :cond_3

    move v0, v3

    :goto_2
    aput v0, v5, v2

    const/4 v0, 0x3

    cmpg-float v2, v4, v1

    if-gez v2, :cond_0

    move v1, v4

    :cond_0
    aput v1, v5, v0

    iget-object v0, p0, Lcom/yalantis/ucrop/view/a;->h:Landroid/graphics/Matrix;

    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    iget-object v0, p0, Lcom/yalantis/ucrop/view/a;->h:Landroid/graphics/Matrix;

    invoke-virtual {p0}, Lcom/yalantis/ucrop/view/a;->getCurrentAngle()F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->setRotate(F)V

    iget-object v0, p0, Lcom/yalantis/ucrop/view/a;->h:Landroid/graphics/Matrix;

    invoke-virtual {v0, v5}, Landroid/graphics/Matrix;->mapPoints([F)V

    return-object v5

    :cond_1
    move v0, v1

    goto :goto_0

    :cond_2
    move v0, v1

    goto :goto_1

    :cond_3
    move v0, v1

    goto :goto_2
.end method

.method private i()V
    .locals 6

    const/4 v5, 0x0

    iget v0, p0, Lcom/yalantis/ucrop/view/a;->d:I

    int-to-float v0, v0

    iget v1, p0, Lcom/yalantis/ucrop/view/a;->i:F

    div-float/2addr v0, v1

    float-to-int v0, v0

    iget v1, p0, Lcom/yalantis/ucrop/view/a;->e:I

    if-le v0, v1, :cond_1

    iget v0, p0, Lcom/yalantis/ucrop/view/a;->e:I

    int-to-float v0, v0

    iget v1, p0, Lcom/yalantis/ucrop/view/a;->i:F

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iget v1, p0, Lcom/yalantis/ucrop/view/a;->d:I

    sub-int/2addr v1, v0

    div-int/lit8 v1, v1, 0x2

    iget-object v2, p0, Lcom/yalantis/ucrop/view/a;->g:Landroid/graphics/RectF;

    int-to-float v3, v1

    add-int/2addr v0, v1

    int-to-float v0, v0

    iget v1, p0, Lcom/yalantis/ucrop/view/a;->e:I

    int-to-float v1, v1

    invoke-virtual {v2, v3, v5, v0, v1}, Landroid/graphics/RectF;->set(FFFF)V

    :goto_0
    iget-object v0, p0, Lcom/yalantis/ucrop/view/a;->k:Lcom/yalantis/ucrop/view/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/yalantis/ucrop/view/a;->k:Lcom/yalantis/ucrop/view/b;

    iget v1, p0, Lcom/yalantis/ucrop/view/a;->i:F

    invoke-interface {v0, v1}, Lcom/yalantis/ucrop/view/b;->a(F)V

    :cond_0
    return-void

    :cond_1
    iget v1, p0, Lcom/yalantis/ucrop/view/a;->e:I

    sub-int/2addr v1, v0

    div-int/lit8 v1, v1, 0x2

    iget-object v2, p0, Lcom/yalantis/ucrop/view/a;->g:Landroid/graphics/RectF;

    int-to-float v3, v1

    iget v4, p0, Lcom/yalantis/ucrop/view/a;->d:I

    int-to-float v4, v4

    add-int/2addr v0, v1

    int-to-float v0, v0

    invoke-virtual {v2, v5, v3, v4, v0}, Landroid/graphics/RectF;->set(FFFF)V

    goto :goto_0
.end method


# virtual methods
.method public a()Landroid/graphics/Bitmap;
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0}, Lcom/yalantis/ucrop/view/a;->getViewBitmap()Landroid/graphics/Bitmap;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v3

    if-eqz v3, :cond_1

    :cond_0
    :goto_0
    return-object v0

    :cond_1
    invoke-virtual {p0}, Lcom/yalantis/ucrop/view/a;->b()V

    invoke-virtual {p0, v1}, Lcom/yalantis/ucrop/view/a;->setImageToWrapCropBounds(Z)V

    iget-object v3, p0, Lcom/yalantis/ucrop/view/a;->a:[F

    invoke-static {v3}, Lcom/yalantis/ucrop/a/k;->b([F)Landroid/graphics/RectF;

    move-result-object v8

    invoke-virtual {v8}, Landroid/graphics/RectF;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {p0}, Lcom/yalantis/ucrop/view/a;->getCurrentScale()F

    move-result v0

    invoke-virtual {p0}, Lcom/yalantis/ucrop/view/a;->getCurrentAngle()F

    move-result v4

    iget v3, p0, Lcom/yalantis/ucrop/view/a;->p:I

    if-lez v3, :cond_6

    iget v3, p0, Lcom/yalantis/ucrop/view/a;->q:I

    if-lez v3, :cond_6

    iget-object v3, p0, Lcom/yalantis/ucrop/view/a;->g:Landroid/graphics/RectF;

    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    move-result v3

    div-float/2addr v3, v0

    iget-object v5, p0, Lcom/yalantis/ucrop/view/a;->g:Landroid/graphics/RectF;

    invoke-virtual {v5}, Landroid/graphics/RectF;->height()F

    move-result v5

    div-float/2addr v5, v0

    iget v6, p0, Lcom/yalantis/ucrop/view/a;->p:I

    int-to-float v6, v6

    cmpl-float v6, v3, v6

    if-gtz v6, :cond_2

    iget v6, p0, Lcom/yalantis/ucrop/view/a;->q:I

    int-to-float v6, v6

    cmpl-float v6, v5, v6

    if-lez v6, :cond_6

    :cond_2
    iget v6, p0, Lcom/yalantis/ucrop/view/a;->p:I

    int-to-float v6, v6

    div-float v3, v6, v3

    iget v6, p0, Lcom/yalantis/ucrop/view/a;->q:I

    int-to-float v6, v6

    div-float v5, v6, v5

    invoke-static {v3, v5}, Ljava/lang/Math;->min(FF)F

    move-result v5

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    int-to-float v3, v3

    mul-float/2addr v3, v5

    float-to-int v3, v3

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v6

    int-to-float v6, v6

    mul-float/2addr v6, v5

    float-to-int v6, v6

    invoke-static {v2, v3, v6, v1}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object v3

    if-eq v2, v3, :cond_3

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V

    :cond_3
    div-float/2addr v0, v5

    move v7, v0

    move-object v0, v3

    :goto_1
    const/4 v2, 0x0

    cmpl-float v2, v4, v2

    if-eqz v2, :cond_5

    iget-object v2, p0, Lcom/yalantis/ucrop/view/a;->h:Landroid/graphics/Matrix;

    invoke-virtual {v2}, Landroid/graphics/Matrix;->reset()V

    iget-object v2, p0, Lcom/yalantis/ucrop/view/a;->h:Landroid/graphics/Matrix;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    div-int/lit8 v3, v3, 0x2

    int-to-float v3, v3

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v5

    div-int/lit8 v5, v5, 0x2

    int-to-float v5, v5

    invoke-virtual {v2, v4, v3, v5}, Landroid/graphics/Matrix;->setRotate(FFF)V

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    iget-object v5, p0, Lcom/yalantis/ucrop/view/a;->h:Landroid/graphics/Matrix;

    const/4 v6, 0x1

    move v2, v1

    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object v1

    if-eq v0, v1, :cond_4

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    :cond_4
    move-object v0, v1

    :cond_5
    iget-object v1, p0, Lcom/yalantis/ucrop/view/a;->g:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->top:F

    iget v2, v8, Landroid/graphics/RectF;->top:F

    sub-float/2addr v1, v2

    div-float/2addr v1, v7

    float-to-int v1, v1

    iget-object v2, p0, Lcom/yalantis/ucrop/view/a;->g:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->left:F

    iget v3, v8, Landroid/graphics/RectF;->left:F

    sub-float/2addr v2, v3

    div-float/2addr v2, v7

    float-to-int v2, v2

    iget-object v3, p0, Lcom/yalantis/ucrop/view/a;->g:Landroid/graphics/RectF;

    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    move-result v3

    div-float/2addr v3, v7

    float-to-int v3, v3

    iget-object v4, p0, Lcom/yalantis/ucrop/view/a;->g:Landroid/graphics/RectF;

    invoke-virtual {v4}, Landroid/graphics/RectF;->height()F

    move-result v4

    div-float/2addr v4, v7

    float-to-int v4, v4

    invoke-static {v0, v2, v1, v3, v4}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    move-result-object v0

    goto/16 :goto_0

    :cond_6
    move v7, v0

    move-object v0, v2

    goto :goto_1
.end method

.method public a(F)V
    .locals 2

    iget-object v0, p0, Lcom/yalantis/ucrop/view/a;->g:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    move-result v0

    iget-object v1, p0, Lcom/yalantis/ucrop/view/a;->g:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->centerY()F

    move-result v1

    invoke-virtual {p0, p1, v0, v1}, Lcom/yalantis/ucrop/view/a;->a(FFF)V

    return-void
.end method

.method public a(FFF)V
    .locals 1

    invoke-virtual {p0}, Lcom/yalantis/ucrop/view/a;->getMinScale()F

    move-result v0

    cmpl-float v0, p1, v0

    if-ltz v0, :cond_0

    invoke-virtual {p0}, Lcom/yalantis/ucrop/view/a;->getCurrentScale()F

    move-result v0

    div-float v0, p1, v0

    invoke-virtual {p0, v0, p2, p3}, Lcom/yalantis/ucrop/view/a;->c(FFF)V

    :cond_0
    return-void
.end method

.method protected a(FFFJ)V
    .locals 8

    invoke-virtual {p0}, Lcom/yalantis/ucrop/view/a;->getMaxScale()F

    move-result v0

    cmpl-float v0, p1, v0

    if-lez v0, :cond_0

    invoke-virtual {p0}, Lcom/yalantis/ucrop/view/a;->getMaxScale()F

    move-result p1

    :cond_0
    invoke-virtual {p0}, Lcom/yalantis/ucrop/view/a;->getCurrentScale()F

    move-result v4

    sub-float v5, p1, v4

    new-instance v0, Lcom/yalantis/ucrop/view/d;

    move-object v1, p0

    move-wide v2, p4

    move v6, p2

    move v7, p3

    invoke-direct/range {v0 .. v7}, Lcom/yalantis/ucrop/view/d;-><init>(Lcom/yalantis/ucrop/view/a;JFFFF)V

    iput-object v0, p0, Lcom/yalantis/ucrop/view/a;->m:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Lcom/yalantis/ucrop/view/a;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method protected a(Landroid/content/res/TypedArray;)V
    .locals 4

    const/4 v3, 0x0

    sget v0, Lcom/yalantis/ucrop/j;->ucrop_UCropView_ucrop_aspect_ratio_x:I

    invoke-virtual {p1, v0, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    sget v1, Lcom/yalantis/ucrop/j;->ucrop_UCropView_ucrop_aspect_ratio_y:I

    invoke-virtual {p1, v1, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    cmpl-float v2, v0, v3

    if-eqz v2, :cond_0

    cmpl-float v2, v1, v3

    if-nez v2, :cond_1

    :cond_0
    iput v3, p0, Lcom/yalantis/ucrop/view/a;->i:F

    :goto_0
    return-void

    :cond_1
    div-float/2addr v0, v1

    iput v0, p0, Lcom/yalantis/ucrop/view/a;->i:F

    goto :goto_0
.end method

.method protected a([F)Z
    .locals 3

    iget-object v0, p0, Lcom/yalantis/ucrop/view/a;->h:Landroid/graphics/Matrix;

    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    iget-object v0, p0, Lcom/yalantis/ucrop/view/a;->h:Landroid/graphics/Matrix;

    invoke-virtual {p0}, Lcom/yalantis/ucrop/view/a;->getCurrentAngle()F

    move-result v1

    neg-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->setRotate(F)V

    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([FI)[F

    move-result-object v0

    iget-object v1, p0, Lcom/yalantis/ucrop/view/a;->h:Landroid/graphics/Matrix;

    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->mapPoints([F)V

    iget-object v1, p0, Lcom/yalantis/ucrop/view/a;->g:Landroid/graphics/RectF;

    invoke-static {v1}, Lcom/yalantis/ucrop/a/k;->a(Landroid/graphics/RectF;)[F

    move-result-object v1

    iget-object v2, p0, Lcom/yalantis/ucrop/view/a;->h:Landroid/graphics/Matrix;

    invoke-virtual {v2, v1}, Landroid/graphics/Matrix;->mapPoints([F)V

    invoke-static {v0}, Lcom/yalantis/ucrop/a/k;->b([F)Landroid/graphics/RectF;

    move-result-object v0

    invoke-static {v1}, Lcom/yalantis/ucrop/a/k;->b([F)Landroid/graphics/RectF;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/RectF;->contains(Landroid/graphics/RectF;)Z

    move-result v0

    return v0
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lcom/yalantis/ucrop/view/a;->l:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Lcom/yalantis/ucrop/view/a;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v0, p0, Lcom/yalantis/ucrop/view/a;->m:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Lcom/yalantis/ucrop/view/a;->removeCallbacks(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public b(F)V
    .locals 2

    iget-object v0, p0, Lcom/yalantis/ucrop/view/a;->g:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    move-result v0

    iget-object v1, p0, Lcom/yalantis/ucrop/view/a;->g:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->centerY()F

    move-result v1

    invoke-virtual {p0, p1, v0, v1}, Lcom/yalantis/ucrop/view/a;->b(FFF)V

    return-void
.end method

.method public b(FFF)V
    .locals 1

    invoke-virtual {p0}, Lcom/yalantis/ucrop/view/a;->getMaxScale()F

    move-result v0

    cmpg-float v0, p1, v0

    if-gtz v0, :cond_0

    invoke-virtual {p0}, Lcom/yalantis/ucrop/view/a;->getCurrentScale()F

    move-result v0

    div-float v0, p1, v0

    invoke-virtual {p0, v0, p2, p3}, Lcom/yalantis/ucrop/view/a;->c(FFF)V

    :cond_0
    return-void
.end method

.method public c()V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/yalantis/ucrop/view/a;->setImageToWrapCropBounds(Z)V

    return-void
.end method

.method public c(F)V
    .locals 2

    iget-object v0, p0, Lcom/yalantis/ucrop/view/a;->g:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    move-result v0

    iget-object v1, p0, Lcom/yalantis/ucrop/view/a;->g:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->centerY()F

    move-result v1

    invoke-virtual {p0, p1, v0, v1}, Lcom/yalantis/ucrop/view/a;->d(FFF)V

    return-void
.end method

.method public c(FFF)V
    .locals 3

    const/high16 v2, 0x3f800000    # 1.0f

    cmpl-float v0, p1, v2

    if-lez v0, :cond_1

    invoke-virtual {p0}, Lcom/yalantis/ucrop/view/a;->getCurrentScale()F

    move-result v0

    mul-float/2addr v0, p1

    invoke-virtual {p0}, Lcom/yalantis/ucrop/view/a;->getMaxScale()F

    move-result v1

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_1

    invoke-super {p0, p1, p2, p3}, Lcom/yalantis/ucrop/view/i;->c(FFF)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    cmpg-float v0, p1, v2

    if-gez v0, :cond_0

    invoke-virtual {p0}, Lcom/yalantis/ucrop/view/a;->getCurrentScale()F

    move-result v0

    mul-float/2addr v0, p1

    invoke-virtual {p0}, Lcom/yalantis/ucrop/view/a;->getMinScale()F

    move-result v1

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_0

    invoke-super {p0, p1, p2, p3}, Lcom/yalantis/ucrop/view/i;->c(FFF)V

    goto :goto_0
.end method

.method protected d()V
    .locals 4

    invoke-super {p0}, Lcom/yalantis/ucrop/view/i;->d()V

    invoke-virtual {p0}, Lcom/yalantis/ucrop/view/a;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    int-to-float v0, v0

    iget v2, p0, Lcom/yalantis/ucrop/view/a;->i:F

    const/4 v3, 0x0

    cmpl-float v2, v2, v3

    if-nez v2, :cond_2

    div-float v2, v1, v0

    iput v2, p0, Lcom/yalantis/ucrop/view/a;->i:F

    :cond_2
    invoke-direct {p0}, Lcom/yalantis/ucrop/view/a;->i()V

    invoke-direct {p0, v1, v0}, Lcom/yalantis/ucrop/view/a;->b(FF)V

    iget-object v0, p0, Lcom/yalantis/ucrop/view/a;->c:Landroid/graphics/Matrix;

    invoke-virtual {p0, v0}, Lcom/yalantis/ucrop/view/a;->setImageMatrix(Landroid/graphics/Matrix;)V

    iget-object v0, p0, Lcom/yalantis/ucrop/view/a;->f:Lcom/yalantis/ucrop/view/k;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/yalantis/ucrop/view/a;->f:Lcom/yalantis/ucrop/view/k;

    invoke-virtual {p0}, Lcom/yalantis/ucrop/view/a;->getCurrentScale()F

    move-result v1

    invoke-interface {v0, v1}, Lcom/yalantis/ucrop/view/k;->b(F)V

    iget-object v0, p0, Lcom/yalantis/ucrop/view/a;->f:Lcom/yalantis/ucrop/view/k;

    invoke-virtual {p0}, Lcom/yalantis/ucrop/view/a;->getCurrentAngle()F

    move-result v1

    invoke-interface {v0, v1}, Lcom/yalantis/ucrop/view/k;->a(F)V

    goto :goto_0
.end method

.method protected e()Z
    .locals 1

    iget-object v0, p0, Lcom/yalantis/ucrop/view/a;->a:[F

    invoke-virtual {p0, v0}, Lcom/yalantis/ucrop/view/a;->a([F)Z

    move-result v0

    return v0
.end method

.method public getCropBoundsChangeListener()Lcom/yalantis/ucrop/view/b;
    .locals 1

    iget-object v0, p0, Lcom/yalantis/ucrop/view/a;->k:Lcom/yalantis/ucrop/view/b;

    return-object v0
.end method

.method public getMaxScale()F
    .locals 1

    iget v0, p0, Lcom/yalantis/ucrop/view/a;->n:F

    return v0
.end method

.method public getMinScale()F
    .locals 1

    iget v0, p0, Lcom/yalantis/ucrop/view/a;->o:F

    return v0
.end method

.method public getTargetAspectRatio()F
    .locals 1

    iget v0, p0, Lcom/yalantis/ucrop/view/a;->i:F

    return v0
.end method

.method public setCropBoundsChangeListener(Lcom/yalantis/ucrop/view/b;)V
    .locals 0

    iput-object p1, p0, Lcom/yalantis/ucrop/view/a;->k:Lcom/yalantis/ucrop/view/b;

    return-void
.end method

.method public setImageToWrapCropBounds(Z)V
    .locals 12

    const/4 v11, 0x1

    const/4 v3, 0x0

    invoke-virtual {p0}, Lcom/yalantis/ucrop/view/a;->e()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/yalantis/ucrop/view/a;->b:[F

    aget v4, v0, v3

    iget-object v0, p0, Lcom/yalantis/ucrop/view/a;->b:[F

    aget v5, v0, v11

    invoke-virtual {p0}, Lcom/yalantis/ucrop/view/a;->getCurrentScale()F

    move-result v8

    iget-object v0, p0, Lcom/yalantis/ucrop/view/a;->g:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    move-result v0

    sub-float v6, v0, v4

    iget-object v0, p0, Lcom/yalantis/ucrop/view/a;->g:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->centerY()F

    move-result v0

    sub-float v7, v0, v5

    const/4 v9, 0x0

    iget-object v0, p0, Lcom/yalantis/ucrop/view/a;->h:Landroid/graphics/Matrix;

    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    iget-object v0, p0, Lcom/yalantis/ucrop/view/a;->h:Landroid/graphics/Matrix;

    invoke-virtual {v0, v6, v7}, Landroid/graphics/Matrix;->setTranslate(FF)V

    iget-object v0, p0, Lcom/yalantis/ucrop/view/a;->a:[F

    iget-object v1, p0, Lcom/yalantis/ucrop/view/a;->a:[F

    array-length v1, v1

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([FI)[F

    move-result-object v0

    iget-object v1, p0, Lcom/yalantis/ucrop/view/a;->h:Landroid/graphics/Matrix;

    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->mapPoints([F)V

    invoke-virtual {p0, v0}, Lcom/yalantis/ucrop/view/a;->a([F)Z

    move-result v10

    if-eqz v10, :cond_1

    invoke-direct {p0}, Lcom/yalantis/ucrop/view/a;->h()[F

    move-result-object v0

    aget v1, v0, v3

    const/4 v2, 0x2

    aget v2, v0, v2

    add-float/2addr v1, v2

    neg-float v6, v1

    aget v1, v0, v11

    const/4 v2, 0x3

    aget v0, v0, v2

    add-float/2addr v0, v1

    neg-float v7, v0

    :goto_0
    if-eqz p1, :cond_2

    new-instance v0, Lcom/yalantis/ucrop/view/c;

    iget-wide v2, p0, Lcom/yalantis/ucrop/view/a;->r:J

    move-object v1, p0

    invoke-direct/range {v0 .. v10}, Lcom/yalantis/ucrop/view/c;-><init>(Lcom/yalantis/ucrop/view/a;JFFFFFFZ)V

    iput-object v0, p0, Lcom/yalantis/ucrop/view/a;->l:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Lcom/yalantis/ucrop/view/a;->post(Ljava/lang/Runnable;)Z

    :cond_0
    :goto_1
    return-void

    :cond_1
    new-instance v0, Landroid/graphics/RectF;

    iget-object v1, p0, Lcom/yalantis/ucrop/view/a;->g:Landroid/graphics/RectF;

    invoke-direct {v0, v1}, Landroid/graphics/RectF;-><init>(Landroid/graphics/RectF;)V

    iget-object v1, p0, Lcom/yalantis/ucrop/view/a;->h:Landroid/graphics/Matrix;

    invoke-virtual {v1}, Landroid/graphics/Matrix;->reset()V

    iget-object v1, p0, Lcom/yalantis/ucrop/view/a;->h:Landroid/graphics/Matrix;

    invoke-virtual {p0}, Lcom/yalantis/ucrop/view/a;->getCurrentAngle()F

    move-result v2

    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->setRotate(F)V

    iget-object v1, p0, Lcom/yalantis/ucrop/view/a;->h:Landroid/graphics/Matrix;

    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    iget-object v1, p0, Lcom/yalantis/ucrop/view/a;->a:[F

    invoke-static {v1}, Lcom/yalantis/ucrop/a/k;->a([F)[F

    move-result-object v1

    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v2

    aget v3, v1, v3

    div-float/2addr v2, v3

    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    move-result v0

    aget v1, v1, v11

    div-float/2addr v0, v1

    invoke-static {v2, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    float-to-double v0, v0

    const-wide v2, 0x3ff028f5c28f5c29L    # 1.01

    mul-double/2addr v0, v2

    double-to-float v0, v0

    mul-float/2addr v0, v8

    sub-float v9, v0, v8

    goto :goto_0

    :cond_2
    invoke-virtual {p0, v6, v7}, Lcom/yalantis/ucrop/view/a;->a(FF)V

    if-nez v10, :cond_0

    add-float v0, v8, v9

    iget-object v1, p0, Lcom/yalantis/ucrop/view/a;->g:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->centerX()F

    move-result v1

    iget-object v2, p0, Lcom/yalantis/ucrop/view/a;->g:Landroid/graphics/RectF;

    invoke-virtual {v2}, Landroid/graphics/RectF;->centerY()F

    move-result v2

    invoke-virtual {p0, v0, v1, v2}, Lcom/yalantis/ucrop/view/a;->b(FFF)V

    goto :goto_1
.end method

.method public setImageToWrapCropBoundsAnimDuration(J)V
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-lez v0, :cond_0

    iput-wide p1, p0, Lcom/yalantis/ucrop/view/a;->r:J

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Animation duration cannot be negative value."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public setMaxResultImageSizeX(I)V
    .locals 0

    iput p1, p0, Lcom/yalantis/ucrop/view/a;->p:I

    return-void
.end method

.method public setMaxResultImageSizeY(I)V
    .locals 0

    iput p1, p0, Lcom/yalantis/ucrop/view/a;->q:I

    return-void
.end method

.method public setMaxScaleMultiplier(F)V
    .locals 0

    iput p1, p0, Lcom/yalantis/ucrop/view/a;->j:F

    return-void
.end method

.method public setTargetAspectRatio(F)V
    .locals 2

    invoke-virtual {p0}, Lcom/yalantis/ucrop/view/a;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-nez v0, :cond_0

    iput p1, p0, Lcom/yalantis/ucrop/view/a;->i:F

    :goto_0
    return-void

    :cond_0
    const/4 v1, 0x0

    cmpl-float v1, p1, v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    int-to-float v0, v0

    div-float v0, v1, v0

    iput v0, p0, Lcom/yalantis/ucrop/view/a;->i:F

    :goto_1
    invoke-direct {p0}, Lcom/yalantis/ucrop/view/a;->i()V

    invoke-virtual {p0}, Lcom/yalantis/ucrop/view/a;->postInvalidate()V

    goto :goto_0

    :cond_1
    iput p1, p0, Lcom/yalantis/ucrop/view/a;->i:F

    goto :goto_1
.end method
