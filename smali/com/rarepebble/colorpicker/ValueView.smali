.class public Lcom/rarepebble/colorpicker/ValueView;
.super Lcom/rarepebble/colorpicker/m;

# interfaces
.implements Lcom/rarepebble/colorpicker/f;


# instance fields
.field private a:Lcom/rarepebble/colorpicker/e;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/rarepebble/colorpicker/ValueView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    invoke-direct {p0, p1, p2}, Lcom/rarepebble/colorpicker/m;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    new-instance v0, Lcom/rarepebble/colorpicker/e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/rarepebble/colorpicker/e;-><init>(I)V

    iput-object v0, p0, Lcom/rarepebble/colorpicker/ValueView;->a:Lcom/rarepebble/colorpicker/e;

    return-void
.end method


# virtual methods
.method protected a(II)Landroid/graphics/Bitmap;
    .locals 10

    const/4 v2, 0x0

    const/4 v1, 0x1

    if-le p1, p2, :cond_0

    move v0, v1

    :goto_0
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result v4

    new-array v5, v4, [I

    const/4 v3, 0x3

    new-array v6, v3, [F

    fill-array-data v6, :array_0

    iget-object v3, p0, Lcom/rarepebble/colorpicker/ValueView;->a:Lcom/rarepebble/colorpicker/e;

    invoke-virtual {v3, v6}, Lcom/rarepebble/colorpicker/e;->a([F)V

    move v3, v2

    :goto_1
    if-ge v3, v4, :cond_2

    const/4 v7, 0x2

    if-eqz v0, :cond_1

    int-to-float v2, v3

    int-to-float v8, v4

    div-float/2addr v2, v8

    :goto_2
    aput v2, v6, v7

    invoke-static {v6}, Landroid/graphics/Color;->HSVToColor([F)I

    move-result v2

    aput v2, v5, v3

    add-int/lit8 v2, v3, 0x1

    move v3, v2

    goto :goto_1

    :cond_0
    move v0, v2

    goto :goto_0

    :cond_1
    const/high16 v2, 0x3f800000    # 1.0f

    int-to-float v8, v3

    int-to-float v9, v4

    div-float/2addr v8, v9

    sub-float/2addr v2, v8

    goto :goto_2

    :cond_2
    if-eqz v0, :cond_3

    :goto_3
    if-eqz v0, :cond_4

    :goto_4
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v5, p1, v1, v0}, Landroid/graphics/Bitmap;->createBitmap([IIILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0

    :cond_3
    move p1, v1

    goto :goto_3

    :cond_4
    move v1, p2

    goto :goto_4

    nop

    :array_0
    .array-data 4
        0x0
        0x0
        0x0
    .end array-data
.end method

.method protected a(F)V
    .locals 1

    iget-object v0, p0, Lcom/rarepebble/colorpicker/ValueView;->a:Lcom/rarepebble/colorpicker/e;

    invoke-virtual {v0, p1, p0}, Lcom/rarepebble/colorpicker/e;->a(FLcom/rarepebble/colorpicker/f;)V

    return-void
.end method

.method public a(Lcom/rarepebble/colorpicker/e;)V
    .locals 0

    iput-object p1, p0, Lcom/rarepebble/colorpicker/ValueView;->a:Lcom/rarepebble/colorpicker/e;

    invoke-virtual {p1, p0}, Lcom/rarepebble/colorpicker/e;->a(Lcom/rarepebble/colorpicker/f;)V

    return-void
.end method

.method protected b(F)I
    .locals 2

    iget-object v0, p0, Lcom/rarepebble/colorpicker/ValueView;->a:Lcom/rarepebble/colorpicker/e;

    invoke-virtual {v0}, Lcom/rarepebble/colorpicker/e;->f()F

    move-result v0

    mul-float/2addr v0, p1

    const/high16 v1, 0x3f000000    # 0.5f

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    const/high16 v0, -0x1000000

    :goto_0
    return v0

    :cond_0
    const/4 v0, -0x1

    goto :goto_0
.end method

.method public b(Lcom/rarepebble/colorpicker/e;)V
    .locals 1

    iget-object v0, p0, Lcom/rarepebble/colorpicker/ValueView;->a:Lcom/rarepebble/colorpicker/e;

    invoke-virtual {v0}, Lcom/rarepebble/colorpicker/e;->d()F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/rarepebble/colorpicker/ValueView;->setPos(F)V

    invoke-virtual {p0}, Lcom/rarepebble/colorpicker/ValueView;->a()V

    invoke-virtual {p0}, Lcom/rarepebble/colorpicker/ValueView;->invalidate()V

    return-void
.end method
