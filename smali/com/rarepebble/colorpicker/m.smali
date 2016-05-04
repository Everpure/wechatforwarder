.class public abstract Lcom/rarepebble/colorpicker/m;
.super Landroid/view/View;


# instance fields
.field private final a:Landroid/graphics/Paint;

.field private final b:Landroid/graphics/Paint;

.field private final c:Landroid/graphics/Rect;

.field private d:I

.field private e:I

.field private final f:Landroid/graphics/Path;

.field private g:Landroid/graphics/Bitmap;

.field private final h:Landroid/graphics/Path;

.field private final i:Landroid/graphics/Paint;

.field private j:F


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/rarepebble/colorpicker/m;->c:Landroid/graphics/Rect;

    invoke-static {p1}, Lcom/rarepebble/colorpicker/l;->b(Landroid/content/Context;)Landroid/graphics/Paint;

    move-result-object v0

    iput-object v0, p0, Lcom/rarepebble/colorpicker/m;->b:Landroid/graphics/Paint;

    invoke-static {p1}, Lcom/rarepebble/colorpicker/l;->a(Landroid/content/Context;)Landroid/graphics/Paint;

    move-result-object v0

    iput-object v0, p0, Lcom/rarepebble/colorpicker/m;->a:Landroid/graphics/Paint;

    invoke-static {p1}, Lcom/rarepebble/colorpicker/l;->a(Landroid/content/Context;)Landroid/graphics/Paint;

    move-result-object v0

    iput-object v0, p0, Lcom/rarepebble/colorpicker/m;->i:Landroid/graphics/Paint;

    invoke-static {p1}, Lcom/rarepebble/colorpicker/l;->c(Landroid/content/Context;)Landroid/graphics/Path;

    move-result-object v0

    iput-object v0, p0, Lcom/rarepebble/colorpicker/m;->h:Landroid/graphics/Path;

    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lcom/rarepebble/colorpicker/m;->f:Landroid/graphics/Path;

    return-void
.end method

.method private a(FF)F
    .locals 3

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-direct {p0}, Lcom/rarepebble/colorpicker/m;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/rarepebble/colorpicker/m;->d:I

    int-to-float v0, v0

    div-float v0, p1, v0

    :goto_0
    const/4 v1, 0x0

    invoke-static {v2, v0}, Ljava/lang/Math;->min(FF)F

    move-result v0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    return v0

    :cond_0
    iget v0, p0, Lcom/rarepebble/colorpicker/m;->e:I

    int-to-float v0, v0

    div-float v0, p2, v0

    sub-float v0, v2, v0

    goto :goto_0
.end method

.method private b()Z
    .locals 2

    iget v0, p0, Lcom/rarepebble/colorpicker/m;->d:I

    iget v1, p0, Lcom/rarepebble/colorpicker/m;->e:I

    if-le v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private c()V
    .locals 2

    iget-object v0, p0, Lcom/rarepebble/colorpicker/m;->i:Landroid/graphics/Paint;

    iget v1, p0, Lcom/rarepebble/colorpicker/m;->j:F

    invoke-virtual {p0, v1}, Lcom/rarepebble/colorpicker/m;->b(F)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method


# virtual methods
.method protected abstract a(II)Landroid/graphics/Bitmap;
.end method

.method protected a()V
    .locals 2

    iget v0, p0, Lcom/rarepebble/colorpicker/m;->d:I

    if-lez v0, :cond_0

    iget v0, p0, Lcom/rarepebble/colorpicker/m;->e:I

    if-lez v0, :cond_0

    iget v0, p0, Lcom/rarepebble/colorpicker/m;->d:I

    iget v1, p0, Lcom/rarepebble/colorpicker/m;->e:I

    invoke-virtual {p0, v0, v1}, Lcom/rarepebble/colorpicker/m;->a(II)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/rarepebble/colorpicker/m;->g:Landroid/graphics/Bitmap;

    invoke-direct {p0}, Lcom/rarepebble/colorpicker/m;->c()V

    :cond_0
    return-void
.end method

.method protected abstract a(F)V
.end method

.method protected abstract b(F)I
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 4

    const/4 v2, 0x0

    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    iget-object v0, p0, Lcom/rarepebble/colorpicker/m;->f:Landroid/graphics/Path;

    iget-object v1, p0, Lcom/rarepebble/colorpicker/m;->b:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    iget-object v0, p0, Lcom/rarepebble/colorpicker/m;->g:Landroid/graphics/Bitmap;

    iget-object v1, p0, Lcom/rarepebble/colorpicker/m;->c:Landroid/graphics/Rect;

    invoke-virtual {p1, v0, v2, v1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    iget-object v0, p0, Lcom/rarepebble/colorpicker/m;->f:Landroid/graphics/Path;

    iget-object v1, p0, Lcom/rarepebble/colorpicker/m;->a:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->save(I)I

    invoke-direct {p0}, Lcom/rarepebble/colorpicker/m;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/rarepebble/colorpicker/m;->d:I

    int-to-float v0, v0

    iget v1, p0, Lcom/rarepebble/colorpicker/m;->j:F

    mul-float/2addr v0, v1

    iget v1, p0, Lcom/rarepebble/colorpicker/m;->e:I

    div-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V

    :goto_0
    iget-object v0, p0, Lcom/rarepebble/colorpicker/m;->h:Landroid/graphics/Path;

    iget-object v1, p0, Lcom/rarepebble/colorpicker/m;->i:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    return-void

    :cond_0
    iget v0, p0, Lcom/rarepebble/colorpicker/m;->d:I

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    iget v1, p0, Lcom/rarepebble/colorpicker/m;->e:I

    int-to-float v1, v1

    const/high16 v2, 0x3f800000    # 1.0f

    iget v3, p0, Lcom/rarepebble/colorpicker/m;->j:F

    sub-float/2addr v2, v3

    mul-float/2addr v1, v2

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V

    goto :goto_0
.end method

.method protected onSizeChanged(IIII)V
    .locals 5

    const/4 v1, 0x0

    iput p1, p0, Lcom/rarepebble/colorpicker/m;->d:I

    iput p2, p0, Lcom/rarepebble/colorpicker/m;->e:I

    iget-object v0, p0, Lcom/rarepebble/colorpicker/m;->c:Landroid/graphics/Rect;

    invoke-virtual {v0, v1, v1, p1, p2}, Landroid/graphics/Rect;->set(IIII)V

    iget-object v0, p0, Lcom/rarepebble/colorpicker/m;->a:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    iget-object v1, p0, Lcom/rarepebble/colorpicker/m;->f:Landroid/graphics/Path;

    invoke-virtual {v1}, Landroid/graphics/Path;->reset()V

    iget-object v1, p0, Lcom/rarepebble/colorpicker/m;->f:Landroid/graphics/Path;

    new-instance v2, Landroid/graphics/RectF;

    int-to-float v3, p1

    sub-float/2addr v3, v0

    int-to-float v4, p2

    sub-float/2addr v4, v0

    invoke-direct {v2, v0, v0, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    sget-object v0, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    invoke-virtual {v1, v2, v0}, Landroid/graphics/Path;->addRect(Landroid/graphics/RectF;Landroid/graphics/Path$Direction;)V

    invoke-virtual {p0}, Lcom/rarepebble/colorpicker/m;->a()V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    const/4 v0, 0x1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v1

    packed-switch v1, :pswitch_data_0

    :pswitch_0
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    :goto_0
    return v0

    :pswitch_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    invoke-direct {p0, v1, v2}, Lcom/rarepebble/colorpicker/m;->a(FF)F

    move-result v1

    iput v1, p0, Lcom/rarepebble/colorpicker/m;->j:F

    invoke-direct {p0}, Lcom/rarepebble/colorpicker/m;->c()V

    iget v1, p0, Lcom/rarepebble/colorpicker/m;->j:F

    invoke-virtual {p0, v1}, Lcom/rarepebble/colorpicker/m;->a(F)V

    invoke-virtual {p0}, Lcom/rarepebble/colorpicker/m;->invalidate()V

    invoke-virtual {p0}, Lcom/rarepebble/colorpicker/m;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    invoke-interface {v1, v0}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method protected setPos(F)V
    .locals 0

    iput p1, p0, Lcom/rarepebble/colorpicker/m;->j:F

    invoke-direct {p0}, Lcom/rarepebble/colorpicker/m;->c()V

    return-void
.end method
