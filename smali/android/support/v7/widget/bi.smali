.class Landroid/support/v7/widget/bi;
.super Landroid/support/v7/widget/be;


# static fields
.field private static final b:[I


# instance fields
.field private final c:Landroid/widget/SeekBar;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [I

    const/4 v1, 0x0

    const v2, 0x1010142

    aput v2, v0, v1

    sput-object v0, Landroid/support/v7/widget/bi;->b:[I

    return-void
.end method

.method constructor <init>(Landroid/widget/SeekBar;Landroid/support/v7/widget/ar;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroid/support/v7/widget/be;-><init>(Landroid/widget/ProgressBar;Landroid/support/v7/widget/ar;)V

    iput-object p1, p0, Landroid/support/v7/widget/bi;->c:Landroid/widget/SeekBar;

    return-void
.end method


# virtual methods
.method a(Landroid/util/AttributeSet;I)V
    .locals 3

    const/4 v2, 0x0

    invoke-super {p0, p1, p2}, Landroid/support/v7/widget/be;->a(Landroid/util/AttributeSet;I)V

    iget-object v0, p0, Landroid/support/v7/widget/bi;->c:Landroid/widget/SeekBar;

    invoke-virtual {v0}, Landroid/widget/SeekBar;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Landroid/support/v7/widget/bi;->b:[I

    invoke-static {v0, p1, v1, p2, v2}, Landroid/support/v7/widget/gr;->a(Landroid/content/Context;Landroid/util/AttributeSet;[III)Landroid/support/v7/widget/gr;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/support/v7/widget/gr;->b(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v2, p0, Landroid/support/v7/widget/bi;->c:Landroid/widget/SeekBar;

    invoke-virtual {v2, v1}, Landroid/widget/SeekBar;->setThumb(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    invoke-virtual {v0}, Landroid/support/v7/widget/gr;->a()V

    return-void
.end method
