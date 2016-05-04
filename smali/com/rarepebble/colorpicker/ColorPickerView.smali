.class public Lcom/rarepebble/colorpicker/ColorPickerView;
.super Landroid/widget/FrameLayout;


# instance fields
.field private final a:Lcom/rarepebble/colorpicker/AlphaView;

.field private final b:Landroid/widget/EditText;

.field private final c:Lcom/rarepebble/colorpicker/e;

.field private final d:Lcom/rarepebble/colorpicker/SwatchView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/rarepebble/colorpicker/ColorPickerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    new-instance v0, Lcom/rarepebble/colorpicker/e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/rarepebble/colorpicker/e;-><init>(I)V

    iput-object v0, p0, Lcom/rarepebble/colorpicker/ColorPickerView;->c:Lcom/rarepebble/colorpicker/e;

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/rarepebble/colorpicker/j;->picker:I

    invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    sget v0, Lcom/rarepebble/colorpicker/i;->swatchView:I

    invoke-virtual {p0, v0}, Lcom/rarepebble/colorpicker/ColorPickerView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/rarepebble/colorpicker/SwatchView;

    iput-object v0, p0, Lcom/rarepebble/colorpicker/ColorPickerView;->d:Lcom/rarepebble/colorpicker/SwatchView;

    iget-object v0, p0, Lcom/rarepebble/colorpicker/ColorPickerView;->d:Lcom/rarepebble/colorpicker/SwatchView;

    iget-object v1, p0, Lcom/rarepebble/colorpicker/ColorPickerView;->c:Lcom/rarepebble/colorpicker/e;

    invoke-virtual {v0, v1}, Lcom/rarepebble/colorpicker/SwatchView;->a(Lcom/rarepebble/colorpicker/e;)V

    sget v0, Lcom/rarepebble/colorpicker/i;->hueSatView:I

    invoke-virtual {p0, v0}, Lcom/rarepebble/colorpicker/ColorPickerView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/rarepebble/colorpicker/HueSatView;

    iget-object v1, p0, Lcom/rarepebble/colorpicker/ColorPickerView;->c:Lcom/rarepebble/colorpicker/e;

    invoke-virtual {v0, v1}, Lcom/rarepebble/colorpicker/HueSatView;->a(Lcom/rarepebble/colorpicker/e;)V

    sget v0, Lcom/rarepebble/colorpicker/i;->valueView:I

    invoke-virtual {p0, v0}, Lcom/rarepebble/colorpicker/ColorPickerView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/rarepebble/colorpicker/ValueView;

    iget-object v1, p0, Lcom/rarepebble/colorpicker/ColorPickerView;->c:Lcom/rarepebble/colorpicker/e;

    invoke-virtual {v0, v1}, Lcom/rarepebble/colorpicker/ValueView;->a(Lcom/rarepebble/colorpicker/e;)V

    sget v0, Lcom/rarepebble/colorpicker/i;->alphaView:I

    invoke-virtual {p0, v0}, Lcom/rarepebble/colorpicker/ColorPickerView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/rarepebble/colorpicker/AlphaView;

    iput-object v0, p0, Lcom/rarepebble/colorpicker/ColorPickerView;->a:Lcom/rarepebble/colorpicker/AlphaView;

    iget-object v0, p0, Lcom/rarepebble/colorpicker/ColorPickerView;->a:Lcom/rarepebble/colorpicker/AlphaView;

    iget-object v1, p0, Lcom/rarepebble/colorpicker/ColorPickerView;->c:Lcom/rarepebble/colorpicker/e;

    invoke-virtual {v0, v1}, Lcom/rarepebble/colorpicker/AlphaView;->a(Lcom/rarepebble/colorpicker/e;)V

    sget v0, Lcom/rarepebble/colorpicker/i;->hexEdit:I

    invoke-virtual {p0, v0}, Lcom/rarepebble/colorpicker/ColorPickerView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/rarepebble/colorpicker/ColorPickerView;->b:Landroid/widget/EditText;

    iget-object v0, p0, Lcom/rarepebble/colorpicker/ColorPickerView;->b:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/rarepebble/colorpicker/ColorPickerView;->c:Lcom/rarepebble/colorpicker/e;

    invoke-static {v0, v1}, Lcom/rarepebble/colorpicker/a;->a(Landroid/widget/EditText;Lcom/rarepebble/colorpicker/e;)V

    invoke-virtual {p0, p2}, Lcom/rarepebble/colorpicker/ColorPickerView;->a(Landroid/util/AttributeSet;)V

    return-void
.end method


# virtual methods
.method a(Landroid/util/AttributeSet;)V
    .locals 4

    const/4 v3, 0x1

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/rarepebble/colorpicker/ColorPickerView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    sget-object v1, Lcom/rarepebble/colorpicker/k;->ColorPicker:[I

    invoke-virtual {v0, p1, v1, v2, v2}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v0

    sget v1, Lcom/rarepebble/colorpicker/k;->ColorPicker_colorpicker_showAlpha:I

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    invoke-virtual {p0, v1}, Lcom/rarepebble/colorpicker/ColorPickerView;->a(Z)V

    sget v1, Lcom/rarepebble/colorpicker/k;->ColorPicker_colorpicker_showHex:I

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/rarepebble/colorpicker/ColorPickerView;->b(Z)V

    :cond_0
    return-void
.end method

.method public a(Z)V
    .locals 2

    iget-object v1, p0, Lcom/rarepebble/colorpicker/ColorPickerView;->a:Lcom/rarepebble/colorpicker/AlphaView;

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v1, v0}, Lcom/rarepebble/colorpicker/AlphaView;->setVisibility(I)V

    iget-object v0, p0, Lcom/rarepebble/colorpicker/ColorPickerView;->b:Landroid/widget/EditText;

    invoke-static {v0, p1}, Lcom/rarepebble/colorpicker/a;->a(Landroid/widget/EditText;Z)V

    return-void

    :cond_0
    const/16 v0, 0x8

    goto :goto_0
.end method

.method public b(Z)V
    .locals 2

    iget-object v1, p0, Lcom/rarepebble/colorpicker/ColorPickerView;->b:Landroid/widget/EditText;

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v1, v0}, Landroid/widget/EditText;->setVisibility(I)V

    return-void

    :cond_0
    const/16 v0, 0x8

    goto :goto_0
.end method

.method public getColor()I
    .locals 1

    iget-object v0, p0, Lcom/rarepebble/colorpicker/ColorPickerView;->c:Lcom/rarepebble/colorpicker/e;

    invoke-virtual {v0}, Lcom/rarepebble/colorpicker/e;->a()I

    move-result v0

    return v0
.end method

.method public setColor(I)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/rarepebble/colorpicker/ColorPickerView;->setOriginalColor(I)V

    invoke-virtual {p0, p1}, Lcom/rarepebble/colorpicker/ColorPickerView;->setCurrentColor(I)V

    return-void
.end method

.method public setCurrentColor(I)V
    .locals 2

    iget-object v0, p0, Lcom/rarepebble/colorpicker/ColorPickerView;->c:Lcom/rarepebble/colorpicker/e;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/rarepebble/colorpicker/e;->b(ILcom/rarepebble/colorpicker/f;)V

    return-void
.end method

.method public setOriginalColor(I)V
    .locals 1

    iget-object v0, p0, Lcom/rarepebble/colorpicker/ColorPickerView;->d:Lcom/rarepebble/colorpicker/SwatchView;

    invoke-virtual {v0, p1}, Lcom/rarepebble/colorpicker/SwatchView;->setOriginalColor(I)V

    return-void
.end method
