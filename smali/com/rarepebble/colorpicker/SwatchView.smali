.class public Lcom/rarepebble/colorpicker/SwatchView;
.super Lcom/rarepebble/colorpicker/n;

# interfaces
.implements Lcom/rarepebble/colorpicker/f;


# instance fields
.field private final a:Landroid/graphics/Paint;

.field private final b:Landroid/graphics/Path;

.field private final c:Landroid/graphics/Paint;

.field private final d:Landroid/graphics/Path;

.field private final e:Landroid/graphics/Path;

.field private final f:Landroid/graphics/Paint;

.field private final g:Landroid/graphics/Paint;

.field private final h:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/rarepebble/colorpicker/SwatchView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    const/4 v3, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, p1, p2}, Lcom/rarepebble/colorpicker/n;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    sget-object v1, Lcom/rarepebble/colorpicker/k;->SwatchView:[I

    invoke-virtual {v0, p2, v1, v3, v3}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v0

    sget v1, Lcom/rarepebble/colorpicker/k;->SwatchView_radialMargin:I

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v0

    iput v0, p0, Lcom/rarepebble/colorpicker/SwatchView;->h:F

    :goto_0
    invoke-static {p1}, Lcom/rarepebble/colorpicker/l;->a(Landroid/content/Context;)Landroid/graphics/Paint;

    move-result-object v0

    iput-object v0, p0, Lcom/rarepebble/colorpicker/SwatchView;->a:Landroid/graphics/Paint;

    invoke-static {p1}, Lcom/rarepebble/colorpicker/l;->b(Landroid/content/Context;)Landroid/graphics/Paint;

    move-result-object v0

    iput-object v0, p0, Lcom/rarepebble/colorpicker/SwatchView;->c:Landroid/graphics/Paint;

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/rarepebble/colorpicker/SwatchView;->f:Landroid/graphics/Paint;

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/rarepebble/colorpicker/SwatchView;->g:Landroid/graphics/Paint;

    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lcom/rarepebble/colorpicker/SwatchView;->b:Landroid/graphics/Path;

    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lcom/rarepebble/colorpicker/SwatchView;->d:Landroid/graphics/Path;

    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lcom/rarepebble/colorpicker/SwatchView;->e:Landroid/graphics/Path;

    return-void

    :cond_0
    iput v2, p0, Lcom/rarepebble/colorpicker/SwatchView;->h:F

    goto :goto_0
.end method

.method private static a(Landroid/graphics/Path;FFFF)V
    .locals 6

    invoke-virtual {p0}, Landroid/graphics/Path;->reset()V

    invoke-virtual {p0, p1, p1}, Landroid/graphics/Path;->moveTo(FF)V

    sub-float v3, p3, p1

    const/4 v4, 0x0

    move-object v0, p0

    move v1, p2

    move v2, p1

    move v5, p4

    invoke-static/range {v0 .. v5}, Lcom/rarepebble/colorpicker/SwatchView;->a(Landroid/graphics/Path;FFFFF)V

    return-void
.end method

.method private static a(Landroid/graphics/Path;FFFFF)V
    .locals 3

    new-instance v0, Landroid/graphics/RectF;

    neg-float v1, p3

    neg-float v2, p3

    invoke-direct {v0, v1, v2, p3, p3}, Landroid/graphics/RectF;-><init>(FFFF)V

    invoke-virtual {v0, p1, p2}, Landroid/graphics/RectF;->offset(FF)V

    invoke-virtual {p0, v0, p4, p5}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FF)V

    return-void
.end method

.method private static b(Landroid/graphics/Path;FFFF)V
    .locals 6

    sub-float v3, p3, p1

    const/high16 v0, 0x42b40000    # 90.0f

    sub-float v4, v0, p4

    move-object v0, p0

    move v1, p1

    move v2, p2

    move v5, p4

    invoke-static/range {v0 .. v5}, Lcom/rarepebble/colorpicker/SwatchView;->a(Landroid/graphics/Path;FFFFF)V

    invoke-virtual {p0, p1, p1}, Landroid/graphics/Path;->lineTo(FF)V

    invoke-virtual {p0}, Landroid/graphics/Path;->close()V

    return-void
.end method

.method private static c(Landroid/graphics/Path;FFFF)V
    .locals 4

    add-float v0, p1, p2

    new-instance v1, Landroid/graphics/RectF;

    neg-float v2, v0

    neg-float v3, v0

    invoke-direct {v1, v2, v3, v0, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    invoke-virtual {v1, p1, p1}, Landroid/graphics/RectF;->offset(FF)V

    invoke-virtual {p0, v1, p3, p4}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FF)V

    return-void
.end method


# virtual methods
.method a(Lcom/rarepebble/colorpicker/e;)V
    .locals 0

    invoke-virtual {p1, p0}, Lcom/rarepebble/colorpicker/e;->a(Lcom/rarepebble/colorpicker/f;)V

    return-void
.end method

.method public b(Lcom/rarepebble/colorpicker/e;)V
    .locals 2

    iget-object v0, p0, Lcom/rarepebble/colorpicker/SwatchView;->g:Landroid/graphics/Paint;

    invoke-virtual {p1}, Lcom/rarepebble/colorpicker/e;->a()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    invoke-virtual {p0}, Lcom/rarepebble/colorpicker/SwatchView;->invalidate()V

    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 2

    invoke-super {p0, p1}, Lcom/rarepebble/colorpicker/n;->onDraw(Landroid/graphics/Canvas;)V

    iget-object v0, p0, Lcom/rarepebble/colorpicker/SwatchView;->b:Landroid/graphics/Path;

    iget-object v1, p0, Lcom/rarepebble/colorpicker/SwatchView;->c:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    iget-object v0, p0, Lcom/rarepebble/colorpicker/SwatchView;->d:Landroid/graphics/Path;

    iget-object v1, p0, Lcom/rarepebble/colorpicker/SwatchView;->f:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    iget-object v0, p0, Lcom/rarepebble/colorpicker/SwatchView;->e:Landroid/graphics/Path;

    iget-object v1, p0, Lcom/rarepebble/colorpicker/SwatchView;->g:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    iget-object v0, p0, Lcom/rarepebble/colorpicker/SwatchView;->b:Landroid/graphics/Path;

    iget-object v1, p0, Lcom/rarepebble/colorpicker/SwatchView;->a:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 11

    const/high16 v10, 0x40000000    # 2.0f

    iget-object v0, p0, Lcom/rarepebble/colorpicker/SwatchView;->a:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v0

    div-float/2addr v0, v10

    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result v1

    int-to-float v1, v1

    iget v2, p0, Lcom/rarepebble/colorpicker/SwatchView;->h:F

    mul-float v3, v10, v2

    add-float/2addr v3, v1

    mul-float/2addr v3, v3

    mul-float v4, v1, v1

    sub-float/2addr v3, v4

    float-to-double v4, v3

    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v4

    double-to-float v3, v4

    sub-float v4, v1, v3

    float-to-double v6, v3

    float-to-double v8, v1

    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v6

    double-to-float v3, v6

    const/high16 v5, 0x43870000    # 270.0f

    sub-float/2addr v5, v3

    const/high16 v6, 0x42340000    # 45.0f

    sub-float v6, v3, v6

    const/high16 v7, 0x42b40000    # 90.0f

    sub-float v3, v7, v3

    iget-object v7, p0, Lcom/rarepebble/colorpicker/SwatchView;->b:Landroid/graphics/Path;

    invoke-static {v7, v0, v4, v2, v3}, Lcom/rarepebble/colorpicker/SwatchView;->a(Landroid/graphics/Path;FFFF)V

    iget-object v7, p0, Lcom/rarepebble/colorpicker/SwatchView;->b:Landroid/graphics/Path;

    mul-float v8, v10, v6

    invoke-static {v7, v1, v2, v5, v8}, Lcom/rarepebble/colorpicker/SwatchView;->c(Landroid/graphics/Path;FFFF)V

    iget-object v7, p0, Lcom/rarepebble/colorpicker/SwatchView;->b:Landroid/graphics/Path;

    invoke-static {v7, v0, v4, v2, v3}, Lcom/rarepebble/colorpicker/SwatchView;->b(Landroid/graphics/Path;FFFF)V

    iget-object v7, p0, Lcom/rarepebble/colorpicker/SwatchView;->d:Landroid/graphics/Path;

    invoke-virtual {v7}, Landroid/graphics/Path;->reset()V

    iget-object v7, p0, Lcom/rarepebble/colorpicker/SwatchView;->d:Landroid/graphics/Path;

    invoke-virtual {v7, v0, v0}, Landroid/graphics/Path;->moveTo(FF)V

    iget-object v7, p0, Lcom/rarepebble/colorpicker/SwatchView;->d:Landroid/graphics/Path;

    const/high16 v8, 0x43610000    # 225.0f

    invoke-static {v7, v1, v2, v8, v6}, Lcom/rarepebble/colorpicker/SwatchView;->c(Landroid/graphics/Path;FFFF)V

    iget-object v7, p0, Lcom/rarepebble/colorpicker/SwatchView;->d:Landroid/graphics/Path;

    invoke-static {v7, v0, v4, v2, v3}, Lcom/rarepebble/colorpicker/SwatchView;->b(Landroid/graphics/Path;FFFF)V

    iget-object v7, p0, Lcom/rarepebble/colorpicker/SwatchView;->e:Landroid/graphics/Path;

    invoke-static {v7, v0, v4, v2, v3}, Lcom/rarepebble/colorpicker/SwatchView;->a(Landroid/graphics/Path;FFFF)V

    iget-object v3, p0, Lcom/rarepebble/colorpicker/SwatchView;->e:Landroid/graphics/Path;

    invoke-static {v3, v1, v2, v5, v6}, Lcom/rarepebble/colorpicker/SwatchView;->c(Landroid/graphics/Path;FFFF)V

    iget-object v1, p0, Lcom/rarepebble/colorpicker/SwatchView;->e:Landroid/graphics/Path;

    invoke-virtual {v1, v0, v0}, Landroid/graphics/Path;->lineTo(FF)V

    iget-object v0, p0, Lcom/rarepebble/colorpicker/SwatchView;->e:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->close()V

    return-void
.end method

.method setOriginalColor(I)V
    .locals 1

    iget-object v0, p0, Lcom/rarepebble/colorpicker/SwatchView;->f:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    invoke-virtual {p0}, Lcom/rarepebble/colorpicker/SwatchView;->invalidate()V

    return-void
.end method
