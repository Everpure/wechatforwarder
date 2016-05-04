.class public Landroid/support/v7/widget/b;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/support/v4/i/dz;


# instance fields
.field a:I

.field final synthetic b:Landroid/support/v7/widget/a;

.field private c:Z


# direct methods
.method protected constructor <init>(Landroid/support/v7/widget/a;)V
    .locals 1

    iput-object p1, p0, Landroid/support/v7/widget/b;->b:Landroid/support/v7/widget/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v7/widget/b;->c:Z

    return-void
.end method


# virtual methods
.method public a(Landroid/support/v4/i/di;I)Landroid/support/v7/widget/b;
    .locals 1

    iget-object v0, p0, Landroid/support/v7/widget/b;->b:Landroid/support/v7/widget/a;

    iput-object p1, v0, Landroid/support/v7/widget/a;->f:Landroid/support/v4/i/di;

    iput p2, p0, Landroid/support/v7/widget/b;->a:I

    return-object p0
.end method

.method public a(Landroid/view/View;)V
    .locals 2

    const/4 v1, 0x0

    iget-object v0, p0, Landroid/support/v7/widget/b;->b:Landroid/support/v7/widget/a;

    invoke-static {v0, v1}, Landroid/support/v7/widget/a;->a(Landroid/support/v7/widget/a;I)V

    iput-boolean v1, p0, Landroid/support/v7/widget/b;->c:Z

    return-void
.end method

.method public b(Landroid/view/View;)V
    .locals 2

    iget-boolean v0, p0, Landroid/support/v7/widget/b;->c:Z

    if-eqz v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/b;->b:Landroid/support/v7/widget/a;

    const/4 v1, 0x0

    iput-object v1, v0, Landroid/support/v7/widget/a;->f:Landroid/support/v4/i/di;

    iget-object v0, p0, Landroid/support/v7/widget/b;->b:Landroid/support/v7/widget/a;

    iget v1, p0, Landroid/support/v7/widget/b;->a:I

    invoke-static {v0, v1}, Landroid/support/v7/widget/a;->b(Landroid/support/v7/widget/a;I)V

    goto :goto_0
.end method

.method public c(Landroid/view/View;)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v7/widget/b;->c:Z

    return-void
.end method
