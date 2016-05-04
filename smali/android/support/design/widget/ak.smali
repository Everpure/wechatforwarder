.class Landroid/support/design/widget/ak;
.super Landroid/support/design/widget/aj;


# instance fields
.field final synthetic b:Landroid/support/design/widget/ag;


# direct methods
.method private constructor <init>(Landroid/support/design/widget/ag;)V
    .locals 1

    iput-object p1, p0, Landroid/support/design/widget/ak;->b:Landroid/support/design/widget/ag;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Landroid/support/design/widget/aj;-><init>(Landroid/support/design/widget/ag;Landroid/support/design/widget/ah;)V

    return-void
.end method

.method synthetic constructor <init>(Landroid/support/design/widget/ag;Landroid/support/design/widget/ah;)V
    .locals 0

    invoke-direct {p0, p1}, Landroid/support/design/widget/ak;-><init>(Landroid/support/design/widget/ag;)V

    return-void
.end method


# virtual methods
.method protected a()F
    .locals 2

    iget-object v0, p0, Landroid/support/design/widget/ak;->b:Landroid/support/design/widget/ag;

    iget v0, v0, Landroid/support/design/widget/ag;->f:F

    iget-object v1, p0, Landroid/support/design/widget/ak;->b:Landroid/support/design/widget/ag;

    iget v1, v1, Landroid/support/design/widget/ag;->g:F

    add-float/2addr v0, v1

    return v0
.end method
