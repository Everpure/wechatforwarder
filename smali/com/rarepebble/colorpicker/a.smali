.class Lcom/rarepebble/colorpicker/a;
.super Ljava/lang/Object;


# static fields
.field private static a:[Landroid/text/InputFilter;

.field private static b:[Landroid/text/InputFilter;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const/4 v4, 0x1

    const/4 v3, 0x0

    new-array v0, v4, [Landroid/text/InputFilter;

    new-instance v1, Lcom/rarepebble/colorpicker/d;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/rarepebble/colorpicker/d;-><init>(Lcom/rarepebble/colorpicker/b;)V

    aput-object v1, v0, v3

    sput-object v0, Lcom/rarepebble/colorpicker/a;->a:[Landroid/text/InputFilter;

    new-array v0, v4, [Landroid/text/InputFilter;

    new-instance v1, Landroid/text/InputFilter$LengthFilter;

    const/16 v2, 0x8

    invoke-direct {v1, v2}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    aput-object v1, v0, v3

    sput-object v0, Lcom/rarepebble/colorpicker/a;->b:[Landroid/text/InputFilter;

    return-void
.end method

.method public static a(Landroid/widget/EditText;Lcom/rarepebble/colorpicker/e;)V
    .locals 1

    new-instance v0, Lcom/rarepebble/colorpicker/c;

    invoke-direct {v0, p0, p1}, Lcom/rarepebble/colorpicker/c;-><init>(Landroid/widget/EditText;Lcom/rarepebble/colorpicker/e;)V

    invoke-virtual {p0, v0}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    invoke-virtual {p1, v0}, Lcom/rarepebble/colorpicker/e;->a(Lcom/rarepebble/colorpicker/f;)V

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lcom/rarepebble/colorpicker/a;->a(Landroid/widget/EditText;Z)V

    return-void
.end method

.method public static a(Landroid/widget/EditText;Z)V
    .locals 1

    if-eqz p1, :cond_0

    sget-object v0, Lcom/rarepebble/colorpicker/a;->b:[Landroid/text/InputFilter;

    :goto_0
    invoke-virtual {p0, v0}, Landroid/widget/EditText;->setFilters([Landroid/text/InputFilter;)V

    invoke-virtual {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_0
    sget-object v0, Lcom/rarepebble/colorpicker/a;->a:[Landroid/text/InputFilter;

    goto :goto_0
.end method

.method static synthetic a()[Landroid/text/InputFilter;
    .locals 1

    sget-object v0, Lcom/rarepebble/colorpicker/a;->a:[Landroid/text/InputFilter;

    return-object v0
.end method
