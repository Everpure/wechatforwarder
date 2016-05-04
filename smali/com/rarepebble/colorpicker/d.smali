.class Lcom/rarepebble/colorpicker/d;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/text/InputFilter;


# instance fields
.field private final a:Landroid/text/InputFilter;


# direct methods
.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/text/InputFilter$LengthFilter;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    iput-object v0, p0, Lcom/rarepebble/colorpicker/d;->a:Landroid/text/InputFilter;

    return-void
.end method

.method synthetic constructor <init>(Lcom/rarepebble/colorpicker/b;)V
    .locals 0

    invoke-direct {p0}, Lcom/rarepebble/colorpicker/d;-><init>()V

    return-void
.end method


# virtual methods
.method public filter(Ljava/lang/CharSequence;IILandroid/text/Spanned;II)Ljava/lang/CharSequence;
    .locals 7

    const/16 v2, 0x8

    sub-int v0, p3, p2

    sub-int v1, p6, p5

    if-ne v0, v2, :cond_0

    invoke-interface {p4}, Landroid/text/Spanned;->length()I

    move-result v0

    if-ne v1, v0, :cond_0

    const/4 v0, 0x2

    invoke-interface {p1, v0, v2}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/rarepebble/colorpicker/d;->a:Landroid/text/InputFilter;

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    move v5, p5

    move v6, p6

    invoke-interface/range {v0 .. v6}, Landroid/text/InputFilter;->filter(Ljava/lang/CharSequence;IILandroid/text/Spanned;II)Ljava/lang/CharSequence;

    move-result-object v0

    goto :goto_0
.end method
