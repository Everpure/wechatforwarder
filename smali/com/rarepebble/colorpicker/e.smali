.class Lcom/rarepebble/colorpicker/e;
.super Ljava/lang/Object;


# instance fields
.field private final a:[F

.field private b:I

.field private final c:Ljava/util/List;


# direct methods
.method constructor <init>(I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x3

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    iput-object v0, p0, Lcom/rarepebble/colorpicker/e;->a:[F

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/rarepebble/colorpicker/e;->c:Ljava/util/List;

    iget-object v0, p0, Lcom/rarepebble/colorpicker/e;->a:[F

    invoke-static {p1, v0}, Landroid/graphics/Color;->colorToHSV(I[F)V

    invoke-static {p1}, Landroid/graphics/Color;->alpha(I)I

    move-result v0

    iput v0, p0, Lcom/rarepebble/colorpicker/e;->b:I

    return-void

    :array_0
    .array-data 4
        0x0
        0x0
        0x0
    .end array-data
.end method

.method private b(Lcom/rarepebble/colorpicker/f;)V
    .locals 2

    iget-object v0, p0, Lcom/rarepebble/colorpicker/e;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/rarepebble/colorpicker/f;

    if-eq v0, p1, :cond_0

    invoke-interface {v0, p0}, Lcom/rarepebble/colorpicker/f;->b(Lcom/rarepebble/colorpicker/e;)V

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public a(F)F
    .locals 4

    const/4 v3, 0x1

    const/4 v2, 0x0

    const/4 v0, 0x3

    new-array v0, v0, [F

    iget-object v1, p0, Lcom/rarepebble/colorpicker/e;->a:[F

    aget v1, v1, v2

    aput v1, v0, v2

    iget-object v1, p0, Lcom/rarepebble/colorpicker/e;->a:[F

    aget v1, v1, v3

    aput v1, v0, v3

    const/4 v1, 0x2

    aput p1, v0, v1

    invoke-static {v0}, Landroid/graphics/Color;->HSVToColor([F)I

    move-result v0

    invoke-static {v0}, Landroid/graphics/Color;->red(I)I

    move-result v1

    int-to-float v1, v1

    const v2, 0x3e59b3d0    # 0.2126f

    mul-float/2addr v1, v2

    invoke-static {v0}, Landroid/graphics/Color;->green(I)I

    move-result v2

    int-to-float v2, v2

    const v3, 0x3f371759    # 0.7152f

    mul-float/2addr v2, v3

    add-float/2addr v1, v2

    invoke-static {v0}, Landroid/graphics/Color;->blue(I)I

    move-result v0

    int-to-float v0, v0

    const v2, 0x3d93dd98    # 0.0722f

    mul-float/2addr v0, v2

    add-float/2addr v0, v1

    const/high16 v1, 0x437f0000    # 255.0f

    div-float/2addr v0, v1

    return v0
.end method

.method public a()I
    .locals 2

    iget v0, p0, Lcom/rarepebble/colorpicker/e;->b:I

    iget-object v1, p0, Lcom/rarepebble/colorpicker/e;->a:[F

    invoke-static {v0, v1}, Landroid/graphics/Color;->HSVToColor(I[F)I

    move-result v0

    return v0
.end method

.method public a(FFLcom/rarepebble/colorpicker/f;)V
    .locals 2

    iget-object v0, p0, Lcom/rarepebble/colorpicker/e;->a:[F

    const/4 v1, 0x0

    aput p1, v0, v1

    iget-object v0, p0, Lcom/rarepebble/colorpicker/e;->a:[F

    const/4 v1, 0x1

    aput p2, v0, v1

    invoke-direct {p0, p3}, Lcom/rarepebble/colorpicker/e;->b(Lcom/rarepebble/colorpicker/f;)V

    return-void
.end method

.method public a(FLcom/rarepebble/colorpicker/f;)V
    .locals 2

    iget-object v0, p0, Lcom/rarepebble/colorpicker/e;->a:[F

    const/4 v1, 0x2

    aput p1, v0, v1

    invoke-direct {p0, p2}, Lcom/rarepebble/colorpicker/e;->b(Lcom/rarepebble/colorpicker/f;)V

    return-void
.end method

.method public a(ILcom/rarepebble/colorpicker/f;)V
    .locals 0

    iput p1, p0, Lcom/rarepebble/colorpicker/e;->b:I

    invoke-direct {p0, p2}, Lcom/rarepebble/colorpicker/e;->b(Lcom/rarepebble/colorpicker/f;)V

    return-void
.end method

.method a(Lcom/rarepebble/colorpicker/f;)V
    .locals 1

    iget-object v0, p0, Lcom/rarepebble/colorpicker/e;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public a([F)V
    .locals 4

    const/4 v3, 0x2

    const/4 v2, 0x1

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/rarepebble/colorpicker/e;->a:[F

    aget v0, v0, v1

    aput v0, p1, v1

    iget-object v0, p0, Lcom/rarepebble/colorpicker/e;->a:[F

    aget v0, v0, v2

    aput v0, p1, v2

    iget-object v0, p0, Lcom/rarepebble/colorpicker/e;->a:[F

    aget v0, v0, v3

    aput v0, p1, v3

    return-void
.end method

.method public b()F
    .locals 2

    iget-object v0, p0, Lcom/rarepebble/colorpicker/e;->a:[F

    const/4 v1, 0x0

    aget v0, v0, v1

    return v0
.end method

.method public b(ILcom/rarepebble/colorpicker/f;)V
    .locals 1

    iget-object v0, p0, Lcom/rarepebble/colorpicker/e;->a:[F

    invoke-static {p1, v0}, Landroid/graphics/Color;->colorToHSV(I[F)V

    invoke-static {p1}, Landroid/graphics/Color;->alpha(I)I

    move-result v0

    iput v0, p0, Lcom/rarepebble/colorpicker/e;->b:I

    invoke-direct {p0, p2}, Lcom/rarepebble/colorpicker/e;->b(Lcom/rarepebble/colorpicker/f;)V

    return-void
.end method

.method public c()F
    .locals 2

    iget-object v0, p0, Lcom/rarepebble/colorpicker/e;->a:[F

    const/4 v1, 0x1

    aget v0, v0, v1

    return v0
.end method

.method public d()F
    .locals 2

    iget-object v0, p0, Lcom/rarepebble/colorpicker/e;->a:[F

    const/4 v1, 0x2

    aget v0, v0, v1

    return v0
.end method

.method public e()I
    .locals 1

    iget v0, p0, Lcom/rarepebble/colorpicker/e;->b:I

    return v0
.end method

.method public f()F
    .locals 2

    iget-object v0, p0, Lcom/rarepebble/colorpicker/e;->a:[F

    const/4 v1, 0x2

    aget v0, v0, v1

    invoke-virtual {p0, v0}, Lcom/rarepebble/colorpicker/e;->a(F)F

    move-result v0

    return v0
.end method
