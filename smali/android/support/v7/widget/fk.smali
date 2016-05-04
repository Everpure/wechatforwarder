.class Landroid/support/v7/widget/fk;
.super Landroid/graphics/drawable/Drawable;


# instance fields
.field private a:F

.field private final b:Landroid/graphics/Paint;

.field private final c:Landroid/graphics/RectF;

.field private final d:Landroid/graphics/Rect;

.field private e:F

.field private f:Z

.field private g:Z

.field private h:Landroid/graphics/PorterDuffColorFilter;

.field private i:Landroid/content/res/ColorStateList;

.field private j:Landroid/graphics/PorterDuff$Mode;


# direct methods
.method public constructor <init>(IF)V
    .locals 2

    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v7/widget/fk;->f:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v7/widget/fk;->g:Z

    iput p2, p0, Landroid/support/v7/widget/fk;->a:F

    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Landroid/support/v7/widget/fk;->b:Landroid/graphics/Paint;

    iget-object v0, p0, Landroid/support/v7/widget/fk;->b:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Landroid/support/v7/widget/fk;->c:Landroid/graphics/RectF;

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Landroid/support/v7/widget/fk;->d:Landroid/graphics/Rect;

    return-void
.end method

.method private a(Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;
    .locals 2

    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_1
    invoke-virtual {p0}, Landroid/support/v7/widget/fk;->getState()[I

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result v1

    new-instance v0, Landroid/graphics/PorterDuffColorFilter;

    invoke-direct {v0, v1, p2}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    goto :goto_0
.end method

.method private a(Landroid/graphics/Rect;)V
    .locals 6

    if-nez p1, :cond_0

    invoke-virtual {p0}, Landroid/support/v7/widget/fk;->getBounds()Landroid/graphics/Rect;

    move-result-object p1

    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/fk;->c:Landroid/graphics/RectF;

    iget v1, p1, Landroid/graphics/Rect;->left:I

    int-to-float v1, v1

    iget v2, p1, Landroid/graphics/Rect;->top:I

    int-to-float v2, v2

    iget v3, p1, Landroid/graphics/Rect;->right:I

    int-to-float v3, v3

    iget v4, p1, Landroid/graphics/Rect;->bottom:I

    int-to-float v4, v4

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v0, p0, Landroid/support/v7/widget/fk;->d:Landroid/graphics/Rect;

    invoke-virtual {v0, p1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    iget-boolean v0, p0, Landroid/support/v7/widget/fk;->f:Z

    if-eqz v0, :cond_1

    iget v0, p0, Landroid/support/v7/widget/fk;->e:F

    iget v1, p0, Landroid/support/v7/widget/fk;->a:F

    iget-boolean v2, p0, Landroid/support/v7/widget/fk;->g:Z

    invoke-static {v0, v1, v2}, Landroid/support/v7/widget/fl;->a(FFZ)F

    move-result v0

    iget v1, p0, Landroid/support/v7/widget/fk;->e:F

    iget v2, p0, Landroid/support/v7/widget/fk;->a:F

    iget-boolean v3, p0, Landroid/support/v7/widget/fk;->g:Z

    invoke-static {v1, v2, v3}, Landroid/support/v7/widget/fl;->b(FFZ)F

    move-result v1

    iget-object v2, p0, Landroid/support/v7/widget/fk;->d:Landroid/graphics/Rect;

    float-to-double v4, v1

    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v4

    double-to-int v1, v4

    float-to-double v4, v0

    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v4

    double-to-int v0, v4

    invoke-virtual {v2, v1, v0}, Landroid/graphics/Rect;->inset(II)V

    iget-object v0, p0, Landroid/support/v7/widget/fk;->c:Landroid/graphics/RectF;

    iget-object v1, p0, Landroid/support/v7/widget/fk;->d:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/graphics/RectF;->set(Landroid/graphics/Rect;)V

    :cond_1
    return-void
.end method


# virtual methods
.method a()F
    .locals 1

    iget v0, p0, Landroid/support/v7/widget/fk;->e:F

    return v0
.end method

.method a(F)V
    .locals 1

    iget v0, p0, Landroid/support/v7/widget/fk;->a:F

    cmpl-float v0, p1, v0

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iput p1, p0, Landroid/support/v7/widget/fk;->a:F

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Landroid/support/v7/widget/fk;->a(Landroid/graphics/Rect;)V

    invoke-virtual {p0}, Landroid/support/v7/widget/fk;->invalidateSelf()V

    goto :goto_0
.end method

.method a(FZZ)V
    .locals 1

    iget v0, p0, Landroid/support/v7/widget/fk;->e:F

    cmpl-float v0, p1, v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Landroid/support/v7/widget/fk;->f:Z

    if-ne v0, p2, :cond_0

    iget-boolean v0, p0, Landroid/support/v7/widget/fk;->g:Z

    if-ne v0, p3, :cond_0

    :goto_0
    return-void

    :cond_0
    iput p1, p0, Landroid/support/v7/widget/fk;->e:F

    iput-boolean p2, p0, Landroid/support/v7/widget/fk;->f:Z

    iput-boolean p3, p0, Landroid/support/v7/widget/fk;->g:Z

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Landroid/support/v7/widget/fk;->a(Landroid/graphics/Rect;)V

    invoke-virtual {p0}, Landroid/support/v7/widget/fk;->invalidateSelf()V

    goto :goto_0
.end method

.method public a(I)V
    .locals 1

    iget-object v0, p0, Landroid/support/v7/widget/fk;->b:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    invoke-virtual {p0}, Landroid/support/v7/widget/fk;->invalidateSelf()V

    return-void
.end method

.method public b()F
    .locals 1

    iget v0, p0, Landroid/support/v7/widget/fk;->a:F

    return v0
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 5

    iget-object v1, p0, Landroid/support/v7/widget/fk;->b:Landroid/graphics/Paint;

    iget-object v0, p0, Landroid/support/v7/widget/fk;->h:Landroid/graphics/PorterDuffColorFilter;

    if-eqz v0, :cond_1

    invoke-virtual {v1}, Landroid/graphics/Paint;->getColorFilter()Landroid/graphics/ColorFilter;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object v0, p0, Landroid/support/v7/widget/fk;->h:Landroid/graphics/PorterDuffColorFilter;

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    const/4 v0, 0x1

    :goto_0
    iget-object v2, p0, Landroid/support/v7/widget/fk;->c:Landroid/graphics/RectF;

    iget v3, p0, Landroid/support/v7/widget/fk;->a:F

    iget v4, p0, Landroid/support/v7/widget/fk;->a:F

    invoke-virtual {p1, v2, v3, v4, v1}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    :cond_0
    return-void

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getOpacity()I
    .locals 1

    const/4 v0, -0x3

    return v0
.end method

.method public getOutline(Landroid/graphics/Outline;)V
    .locals 2

    iget-object v0, p0, Landroid/support/v7/widget/fk;->d:Landroid/graphics/Rect;

    iget v1, p0, Landroid/support/v7/widget/fk;->a:F

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Outline;->setRoundRect(Landroid/graphics/Rect;F)V

    return-void
.end method

.method public isStateful()Z
    .locals 1

    iget-object v0, p0, Landroid/support/v7/widget/fk;->i:Landroid/content/res/ColorStateList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/fk;->i:Landroid/content/res/ColorStateList;

    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->isStateful()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected onBoundsChange(Landroid/graphics/Rect;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->onBoundsChange(Landroid/graphics/Rect;)V

    invoke-direct {p0, p1}, Landroid/support/v7/widget/fk;->a(Landroid/graphics/Rect;)V

    return-void
.end method

.method protected onStateChange([I)Z
    .locals 2

    iget-object v0, p0, Landroid/support/v7/widget/fk;->i:Landroid/content/res/ColorStateList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/fk;->j:Landroid/graphics/PorterDuff$Mode;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/fk;->i:Landroid/content/res/ColorStateList;

    iget-object v1, p0, Landroid/support/v7/widget/fk;->j:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {p0, v0, v1}, Landroid/support/v7/widget/fk;->a(Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/widget/fk;->h:Landroid/graphics/PorterDuffColorFilter;

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public setAlpha(I)V
    .locals 1

    iget-object v0, p0, Landroid/support/v7/widget/fk;->b:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    return-void
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 1

    iget-object v0, p0, Landroid/support/v7/widget/fk;->b:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    return-void
.end method

.method public setTintList(Landroid/content/res/ColorStateList;)V
    .locals 2

    iput-object p1, p0, Landroid/support/v7/widget/fk;->i:Landroid/content/res/ColorStateList;

    iget-object v0, p0, Landroid/support/v7/widget/fk;->i:Landroid/content/res/ColorStateList;

    iget-object v1, p0, Landroid/support/v7/widget/fk;->j:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {p0, v0, v1}, Landroid/support/v7/widget/fk;->a(Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/widget/fk;->h:Landroid/graphics/PorterDuffColorFilter;

    invoke-virtual {p0}, Landroid/support/v7/widget/fk;->invalidateSelf()V

    return-void
.end method

.method public setTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 2

    iput-object p1, p0, Landroid/support/v7/widget/fk;->j:Landroid/graphics/PorterDuff$Mode;

    iget-object v0, p0, Landroid/support/v7/widget/fk;->i:Landroid/content/res/ColorStateList;

    iget-object v1, p0, Landroid/support/v7/widget/fk;->j:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {p0, v0, v1}, Landroid/support/v7/widget/fk;->a(Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/widget/fk;->h:Landroid/graphics/PorterDuffColorFilter;

    invoke-virtual {p0}, Landroid/support/v7/widget/fk;->invalidateSelf()V

    return-void
.end method
