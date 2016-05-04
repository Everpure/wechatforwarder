.class Landroid/support/design/widget/ad;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/support/design/widget/bz;


# instance fields
.field final synthetic a:Landroid/support/design/widget/FloatingActionButton;

.field final synthetic b:Landroid/support/design/widget/FloatingActionButton$Behavior;


# direct methods
.method constructor <init>(Landroid/support/design/widget/FloatingActionButton$Behavior;Landroid/support/design/widget/FloatingActionButton;)V
    .locals 0

    iput-object p1, p0, Landroid/support/design/widget/ad;->b:Landroid/support/design/widget/FloatingActionButton$Behavior;

    iput-object p2, p0, Landroid/support/design/widget/ad;->a:Landroid/support/design/widget/FloatingActionButton;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/support/design/widget/bx;)V
    .locals 2

    iget-object v0, p0, Landroid/support/design/widget/ad;->a:Landroid/support/design/widget/FloatingActionButton;

    invoke-virtual {p1}, Landroid/support/design/widget/bx;->d()F

    move-result v1

    invoke-static {v0, v1}, Landroid/support/v4/i/bu;->b(Landroid/view/View;F)V

    return-void
.end method
