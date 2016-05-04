.class Lcom/rarepebble/colorpicker/c;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/text/TextWatcher;
.implements Lcom/rarepebble/colorpicker/f;


# instance fields
.field final synthetic a:Landroid/widget/EditText;

.field final synthetic b:Lcom/rarepebble/colorpicker/e;


# direct methods
.method constructor <init>(Landroid/widget/EditText;Lcom/rarepebble/colorpicker/e;)V
    .locals 0

    iput-object p1, p0, Lcom/rarepebble/colorpicker/c;->a:Landroid/widget/EditText;

    iput-object p2, p0, Lcom/rarepebble/colorpicker/c;->b:Lcom/rarepebble/colorpicker/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a(I)Ljava/lang/String;
    .locals 4

    const/4 v1, 0x1

    const/4 v3, 0x0

    invoke-direct {p0}, Lcom/rarepebble/colorpicker/c;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "%06x"

    new-array v1, v1, [Ljava/lang/Object;

    const v2, 0xffffff

    and-int/2addr v2, p1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const-string v0, "%08x"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method private a()Z
    .locals 2

    iget-object v0, p0, Lcom/rarepebble/colorpicker/c;->a:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getFilters()[Landroid/text/InputFilter;

    move-result-object v0

    invoke-static {}, Lcom/rarepebble/colorpicker/a;->a()[Landroid/text/InputFilter;

    move-result-object v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 0

    return-void
.end method

.method public b(Lcom/rarepebble/colorpicker/e;)V
    .locals 2

    invoke-virtual {p1}, Lcom/rarepebble/colorpicker/e;->a()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/rarepebble/colorpicker/c;->a(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/rarepebble/colorpicker/c;->a:Landroid/widget/EditText;

    invoke-virtual {v1, p0}, Landroid/widget/EditText;->removeTextChangedListener(Landroid/text/TextWatcher;)V

    iget-object v1, p0, Lcom/rarepebble/colorpicker/c;->a:Landroid/widget/EditText;

    invoke-virtual {v1, v0}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/rarepebble/colorpicker/c;->a:Landroid/widget/EditText;

    invoke-virtual {v0, p0}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 4

    :try_start_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    and-long/2addr v0, v2

    long-to-int v0, v0

    invoke-direct {p0}, Lcom/rarepebble/colorpicker/c;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    const/high16 v1, -0x1000000

    or-int/2addr v0, v1

    :cond_0
    iget-object v1, p0, Lcom/rarepebble/colorpicker/c;->b:Lcom/rarepebble/colorpicker/e;

    invoke-virtual {v1, v0, p0}, Lcom/rarepebble/colorpicker/e;->b(ILcom/rarepebble/colorpicker/f;)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    iget-object v0, p0, Lcom/rarepebble/colorpicker/c;->b:Lcom/rarepebble/colorpicker/e;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p0}, Lcom/rarepebble/colorpicker/e;->b(ILcom/rarepebble/colorpicker/f;)V

    goto :goto_0
.end method
