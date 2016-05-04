.class public Lcom/rarepebble/colorpicker/HueSatView;
.super Lcom/rarepebble/colorpicker/n;

# interfaces
.implements Lcom/rarepebble/colorpicker/f;


# instance fields
.field private final a:Landroid/graphics/Paint;

.field private final b:Landroid/graphics/Paint;

.field private final c:Landroid/graphics/Path;

.field private final d:Landroid/graphics/Path;

.field private final e:Landroid/graphics/Rect;

.field private f:I

.field private g:I

.field private h:Landroid/graphics/Bitmap;

.field private final i:Landroid/graphics/PointF;

.field private j:Lcom/rarepebble/colorpicker/e;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/rarepebble/colorpicker/HueSatView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    invoke-direct {p0, p1, p2}, Lcom/rarepebble/colorpicker/n;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/rarepebble/colorpicker/HueSatView;->e:Landroid/graphics/Rect;

    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Lcom/rarepebble/colorpicker/HueSatView;->i:Landroid/graphics/PointF;

    new-instance v0, Lcom/rarepebble/colorpicker/e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/rarepebble/colorpicker/e;-><init>(I)V

    iput-object v0, p0, Lcom/rarepebble/colorpicker/HueSatView;->j:Lcom/rarepebble/colorpicker/e;

    invoke-static {p1}, Lcom/rarepebble/colorpicker/l;->a(Landroid/content/Context;)Landroid/graphics/Paint;

    move-result-object v0

    iput-object v0, p0, Lcom/rarepebble/colorpicker/HueSatView;->a:Landroid/graphics/Paint;

    invoke-static {p1}, Lcom/rarepebble/colorpicker/l;->a(Landroid/content/Context;)Landroid/graphics/Paint;

    move-result-object v0

    iput-object v0, p0, Lcom/rarepebble/colorpicker/HueSatView;->b:Landroid/graphics/Paint;

    iget-object v0, p0, Lcom/rarepebble/colorpicker/HueSatView;->b:Landroid/graphics/Paint;

    const/high16 v1, -0x1000000

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    invoke-static {p1}, Lcom/rarepebble/colorpicker/l;->c(Landroid/content/Context;)Landroid/graphics/Path;

    move-result-object v0

    iput-object v0, p0, Lcom/rarepebble/colorpicker/HueSatView;->c:Landroid/graphics/Path;

    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lcom/rarepebble/colorpicker/HueSatView;->d:Landroid/graphics/Path;

    const/4 v0, 0x1

    invoke-static {v0}, Lcom/rarepebble/colorpicker/HueSatView;->a(I)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/rarepebble/colorpicker/HueSatView;->h:Landroid/graphics/Bitmap;

    return-void
.end method

.method private static a(FFF)F
    .locals 6

    const/high16 v0, 0x3f800000    # 1.0f

    sub-float v0, p2, v0

    float-to-double v0, v0

    float-to-double v2, p0

    sub-double v2, v0, v2

    div-double/2addr v2, v0

    float-to-double v4, p1

    sub-double v4, v0, v4

    div-double v0, v4, v0

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v0

    const-wide v2, 0x4076800000000000L    # 360.0

    mul-double/2addr v0, v2

    const-wide v2, 0x3ff921fb54442d18L    # 1.5707963267948966

    div-double/2addr v0, v2

    double-to-float v0, v0

    return v0
.end method

.method private static a(I)Landroid/graphics/Bitmap;
    .locals 12

    const/high16 v11, 0x3f800000    # 1.0f

    const/4 v1, 0x0

    mul-int v0, p0, p0

    new-array v3, v0, [I

    const/4 v0, 0x3

    new-array v4, v0, [F

    fill-array-data v4, :array_0

    move v2, v1

    :goto_0
    if-ge v2, p0, :cond_1

    move v0, v1

    :goto_1
    if-ge v0, p0, :cond_0

    mul-int v5, v2, p0

    add-int/2addr v5, v0

    int-to-float v6, v0

    int-to-float v7, v2

    int-to-float v8, p0

    invoke-static {v6, v7, v8}, Lcom/rarepebble/colorpicker/HueSatView;->b(FFF)F

    move-result v6

    const/4 v7, 0x0

    sub-float v8, v11, v6

    int-to-float v9, p0

    mul-float/2addr v8, v9

    invoke-static {v11, v8}, Ljava/lang/Math;->min(FF)F

    move-result v8

    invoke-static {v7, v8}, Ljava/lang/Math;->max(FF)F

    move-result v7

    const/high16 v8, 0x437f0000    # 255.0f

    mul-float/2addr v7, v8

    float-to-int v7, v7

    int-to-float v8, v0

    int-to-float v9, v2

    int-to-float v10, p0

    invoke-static {v8, v9, v10}, Lcom/rarepebble/colorpicker/HueSatView;->a(FFF)F

    move-result v8

    aput v8, v4, v1

    const/4 v8, 0x1

    aput v6, v4, v8

    invoke-static {v7, v4}, Landroid/graphics/Color;->HSVToColor(I[F)I

    move-result v6

    aput v6, v3, v5

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    :cond_1
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v3, p0, p0, v0}, Landroid/graphics/Bitmap;->createBitmap([IIILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0

    :array_0
    .array-data 4
        0x0
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method private a()V
    .locals 5

    iget-object v0, p0, Lcom/rarepebble/colorpicker/HueSatView;->j:Lcom/rarepebble/colorpicker/e;

    iget-object v1, p0, Lcom/rarepebble/colorpicker/HueSatView;->i:Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->x:F

    iget-object v2, p0, Lcom/rarepebble/colorpicker/HueSatView;->i:Landroid/graphics/PointF;

    iget v2, v2, Landroid/graphics/PointF;->y:F

    iget v3, p0, Lcom/rarepebble/colorpicker/HueSatView;->f:I

    int-to-float v3, v3

    invoke-static {v1, v2, v3}, Lcom/rarepebble/colorpicker/HueSatView;->a(FFF)F

    move-result v1

    iget-object v2, p0, Lcom/rarepebble/colorpicker/HueSatView;->i:Landroid/graphics/PointF;

    iget v2, v2, Landroid/graphics/PointF;->x:F

    iget-object v3, p0, Lcom/rarepebble/colorpicker/HueSatView;->i:Landroid/graphics/PointF;

    iget v3, v3, Landroid/graphics/PointF;->y:F

    iget v4, p0, Lcom/rarepebble/colorpicker/HueSatView;->f:I

    int-to-float v4, v4

    invoke-static {v2, v3, v4}, Lcom/rarepebble/colorpicker/HueSatView;->b(FFF)F

    move-result v2

    invoke-virtual {v0, v1, v2, p0}, Lcom/rarepebble/colorpicker/e;->a(FFLcom/rarepebble/colorpicker/f;)V

    invoke-direct {p0}, Lcom/rarepebble/colorpicker/HueSatView;->b()V

    invoke-virtual {p0}, Lcom/rarepebble/colorpicker/HueSatView;->invalidate()V

    return-void
.end method

.method private static a(Landroid/graphics/Path;IIF)V
    .locals 4

    int-to-float v0, p1

    sub-float/2addr v0, p3

    float-to-int v0, v0

    int-to-float v1, p2

    sub-float/2addr v1, p3

    float-to-int v1, v1

    invoke-virtual {p0}, Landroid/graphics/Path;->reset()V

    int-to-float v2, v0

    invoke-virtual {p0, v2, p3}, Landroid/graphics/Path;->moveTo(FF)V

    int-to-float v2, v0

    int-to-float v3, v1

    invoke-virtual {p0, v2, v3}, Landroid/graphics/Path;->lineTo(FF)V

    int-to-float v2, v1

    invoke-virtual {p0, p3, v2}, Landroid/graphics/Path;->lineTo(FF)V

    new-instance v2, Landroid/graphics/RectF;

    mul-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    mul-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    invoke-direct {v2, p3, p3, v0, v1}, Landroid/graphics/RectF;-><init>(FFFF)V

    const/high16 v0, 0x43340000    # 180.0f

    const/high16 v1, 0x43870000    # 270.0f

    invoke-virtual {p0, v2, v0, v1}, Landroid/graphics/Path;->addArc(Landroid/graphics/RectF;FF)V

    invoke-virtual {p0}, Landroid/graphics/Path;->close()V

    return-void
.end method

.method private static a(Landroid/graphics/PointF;FFF)V
    .locals 8

    const/high16 v0, 0x3f800000    # 1.0f

    sub-float v0, p3, v0

    float-to-double v2, v0

    float-to-double v4, p2

    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v4

    mul-double/2addr v2, v4

    const/high16 v1, 0x43b40000    # 360.0f

    div-float v1, p1, v1

    float-to-double v4, v1

    const-wide v6, 0x400921fb54442d18L    # Math.PI

    mul-double/2addr v4, v6

    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    div-double/2addr v4, v6

    invoke-static {v4, v5}, Ljava/lang/Math;->cos(D)D

    move-result-wide v6

    mul-double/2addr v6, v2

    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    move-result-wide v4

    mul-double/2addr v2, v4

    double-to-float v1, v6

    sub-float v1, v0, v1

    double-to-float v2, v2

    sub-float/2addr v0, v2

    invoke-virtual {p0, v1, v0}, Landroid/graphics/PointF;->set(FF)V

    return-void
.end method

.method private a(Landroid/graphics/PointF;FFZ)Z
    .locals 10

    const/4 v2, 0x1

    const/4 v3, 0x0

    iget v0, p0, Lcom/rarepebble/colorpicker/HueSatView;->f:I

    int-to-float v0, v0

    invoke-static {p2, v0}, Ljava/lang/Math;->min(FF)F

    move-result v1

    iget v0, p0, Lcom/rarepebble/colorpicker/HueSatView;->g:I

    int-to-float v0, v0

    invoke-static {p3, v0}, Ljava/lang/Math;->min(FF)F

    move-result v0

    iget v4, p0, Lcom/rarepebble/colorpicker/HueSatView;->f:I

    int-to-float v4, v4

    sub-float v5, v4, v1

    iget v4, p0, Lcom/rarepebble/colorpicker/HueSatView;->g:I

    int-to-float v4, v4

    sub-float v6, v4, v0

    mul-float v4, v5, v5

    mul-float v7, v6, v6

    add-float/2addr v4, v7

    float-to-double v8, v4

    invoke-static {v8, v9}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v8

    double-to-float v7, v8

    iget v4, p0, Lcom/rarepebble/colorpicker/HueSatView;->f:I

    int-to-float v4, v4

    cmpl-float v4, v7, v4

    if-lez v4, :cond_3

    move v4, v2

    :goto_0
    if-eqz v4, :cond_0

    if-nez p4, :cond_2

    :cond_0
    if-eqz v4, :cond_1

    iget v0, p0, Lcom/rarepebble/colorpicker/HueSatView;->f:I

    int-to-float v0, v0

    iget v1, p0, Lcom/rarepebble/colorpicker/HueSatView;->f:I

    int-to-float v1, v1

    mul-float/2addr v1, v5

    div-float/2addr v1, v7

    sub-float v1, v0, v1

    iget v0, p0, Lcom/rarepebble/colorpicker/HueSatView;->f:I

    int-to-float v0, v0

    iget v5, p0, Lcom/rarepebble/colorpicker/HueSatView;->f:I

    int-to-float v5, v5

    mul-float/2addr v5, v6

    div-float/2addr v5, v7

    sub-float/2addr v0, v5

    :cond_1
    invoke-virtual {p1, v1, v0}, Landroid/graphics/PointF;->set(FF)V

    :cond_2
    if-nez v4, :cond_4

    move v0, v2

    :goto_1
    return v0

    :cond_3
    move v4, v3

    goto :goto_0

    :cond_4
    move v0, v3

    goto :goto_1
.end method

.method private static b(FFF)F
    .locals 6

    const/high16 v0, 0x3f800000    # 1.0f

    sub-float v0, p2, v0

    float-to-double v0, v0

    float-to-double v2, p0

    sub-double v2, v0, v2

    div-double/2addr v2, v0

    float-to-double v4, p1

    sub-double v4, v0, v4

    div-double v0, v4, v0

    mul-double/2addr v2, v2

    mul-double/2addr v0, v0

    add-double/2addr v0, v2

    double-to-float v0, v0

    return v0
.end method

.method private b()V
    .locals 6

    iget-object v1, p0, Lcom/rarepebble/colorpicker/HueSatView;->b:Landroid/graphics/Paint;

    iget-object v0, p0, Lcom/rarepebble/colorpicker/HueSatView;->j:Lcom/rarepebble/colorpicker/e;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v0, v2}, Lcom/rarepebble/colorpicker/e;->a(F)F

    move-result v0

    float-to-double v2, v0

    const-wide/high16 v4, 0x3fe0000000000000L    # 0.5

    cmpl-double v0, v2, v4

    if-lez v0, :cond_0

    const/high16 v0, -0x1000000

    :goto_0
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColor(I)V

    return-void

    :cond_0
    const/4 v0, -0x1

    goto :goto_0
.end method


# virtual methods
.method public a(Lcom/rarepebble/colorpicker/e;)V
    .locals 0

    iput-object p1, p0, Lcom/rarepebble/colorpicker/HueSatView;->j:Lcom/rarepebble/colorpicker/e;

    invoke-virtual {p1, p0}, Lcom/rarepebble/colorpicker/e;->a(Lcom/rarepebble/colorpicker/f;)V

    return-void
.end method

.method public b(Lcom/rarepebble/colorpicker/e;)V
    .locals 4

    iget-object v0, p0, Lcom/rarepebble/colorpicker/HueSatView;->i:Landroid/graphics/PointF;

    invoke-virtual {p1}, Lcom/rarepebble/colorpicker/e;->b()F

    move-result v1

    invoke-virtual {p1}, Lcom/rarepebble/colorpicker/e;->c()F

    move-result v2

    iget v3, p0, Lcom/rarepebble/colorpicker/HueSatView;->f:I

    int-to-float v3, v3

    invoke-static {v0, v1, v2, v3}, Lcom/rarepebble/colorpicker/HueSatView;->a(Landroid/graphics/PointF;FFF)V

    invoke-direct {p0}, Lcom/rarepebble/colorpicker/HueSatView;->b()V

    invoke-virtual {p0}, Lcom/rarepebble/colorpicker/HueSatView;->invalidate()V

    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 3

    const/4 v2, 0x0

    invoke-super {p0, p1}, Lcom/rarepebble/colorpicker/n;->onDraw(Landroid/graphics/Canvas;)V

    iget-object v0, p0, Lcom/rarepebble/colorpicker/HueSatView;->h:Landroid/graphics/Bitmap;

    iget-object v1, p0, Lcom/rarepebble/colorpicker/HueSatView;->e:Landroid/graphics/Rect;

    invoke-virtual {p1, v0, v2, v1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    iget-object v0, p0, Lcom/rarepebble/colorpicker/HueSatView;->d:Landroid/graphics/Path;

    iget-object v1, p0, Lcom/rarepebble/colorpicker/HueSatView;->a:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    const/4 v0, 0x3

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->save(I)I

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x12

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Lcom/rarepebble/colorpicker/HueSatView;->d:Landroid/graphics/Path;

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    :cond_0
    iget-object v0, p0, Lcom/rarepebble/colorpicker/HueSatView;->i:Landroid/graphics/PointF;

    iget v0, v0, Landroid/graphics/PointF;->x:F

    iget-object v1, p0, Lcom/rarepebble/colorpicker/HueSatView;->i:Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->y:F

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V

    iget-object v0, p0, Lcom/rarepebble/colorpicker/HueSatView;->c:Landroid/graphics/Path;

    iget-object v1, p0, Lcom/rarepebble/colorpicker/HueSatView;->b:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 2

    const/4 v1, 0x0

    iput p1, p0, Lcom/rarepebble/colorpicker/HueSatView;->f:I

    iput p2, p0, Lcom/rarepebble/colorpicker/HueSatView;->g:I

    iget-object v0, p0, Lcom/rarepebble/colorpicker/HueSatView;->e:Landroid/graphics/Rect;

    invoke-virtual {v0, v1, v1, p1, p2}, Landroid/graphics/Rect;->set(IIII)V

    iget-object v0, p0, Lcom/rarepebble/colorpicker/HueSatView;->a:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    iget-object v1, p0, Lcom/rarepebble/colorpicker/HueSatView;->d:Landroid/graphics/Path;

    invoke-static {v1, p1, p2, v0}, Lcom/rarepebble/colorpicker/HueSatView;->a(Landroid/graphics/Path;IIF)V

    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lcom/rarepebble/colorpicker/HueSatView;->a(I)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/rarepebble/colorpicker/HueSatView;->h:Landroid/graphics/Bitmap;

    iget-object v0, p0, Lcom/rarepebble/colorpicker/HueSatView;->j:Lcom/rarepebble/colorpicker/e;

    invoke-virtual {p0, v0}, Lcom/rarepebble/colorpicker/HueSatView;->b(Lcom/rarepebble/colorpicker/e;)V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 5

    const/4 v0, 0x1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v1

    packed-switch v1, :pswitch_data_0

    :pswitch_0
    invoke-super {p0, p1}, Lcom/rarepebble/colorpicker/n;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    :cond_0
    :goto_0
    return v0

    :pswitch_1
    iget-object v1, p0, Lcom/rarepebble/colorpicker/HueSatView;->i:Landroid/graphics/PointF;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    invoke-direct {p0, v1, v2, v3, v0}, Lcom/rarepebble/colorpicker/HueSatView;->a(Landroid/graphics/PointF;FFZ)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/rarepebble/colorpicker/HueSatView;->a()V

    goto :goto_0

    :pswitch_2
    iget-object v1, p0, Lcom/rarepebble/colorpicker/HueSatView;->i:Landroid/graphics/PointF;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    const/4 v4, 0x0

    invoke-direct {p0, v1, v2, v3, v4}, Lcom/rarepebble/colorpicker/HueSatView;->a(Landroid/graphics/PointF;FFZ)Z

    invoke-direct {p0}, Lcom/rarepebble/colorpicker/HueSatView;->a()V

    invoke-virtual {p0}, Lcom/rarepebble/colorpicker/HueSatView;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    invoke-interface {v1, v0}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method
