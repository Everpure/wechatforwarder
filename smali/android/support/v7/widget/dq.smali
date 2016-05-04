.class Landroid/support/v7/widget/dq;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/widget/AbsListView$OnScrollListener;


# instance fields
.field final synthetic a:Landroid/support/v7/widget/dg;


# direct methods
.method private constructor <init>(Landroid/support/v7/widget/dg;)V
    .locals 0

    iput-object p1, p0, Landroid/support/v7/widget/dq;->a:Landroid/support/v7/widget/dg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Landroid/support/v7/widget/dg;Landroid/support/v7/widget/dh;)V
    .locals 0

    invoke-direct {p0, p1}, Landroid/support/v7/widget/dq;-><init>(Landroid/support/v7/widget/dg;)V

    return-void
.end method


# virtual methods
.method public onScroll(Landroid/widget/AbsListView;III)V
    .locals 0

    return-void
.end method

.method public onScrollStateChanged(Landroid/widget/AbsListView;I)V
    .locals 2

    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/dq;->a:Landroid/support/v7/widget/dg;

    invoke-virtual {v0}, Landroid/support/v7/widget/dg;->l()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/dq;->a:Landroid/support/v7/widget/dg;

    invoke-static {v0}, Landroid/support/v7/widget/dg;->b(Landroid/support/v7/widget/dg;)Landroid/widget/PopupWindow;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/dq;->a:Landroid/support/v7/widget/dg;

    invoke-static {v0}, Landroid/support/v7/widget/dg;->d(Landroid/support/v7/widget/dg;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Landroid/support/v7/widget/dq;->a:Landroid/support/v7/widget/dg;

    invoke-static {v1}, Landroid/support/v7/widget/dg;->c(Landroid/support/v7/widget/dg;)Landroid/support/v7/widget/ds;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v0, p0, Landroid/support/v7/widget/dq;->a:Landroid/support/v7/widget/dg;

    invoke-static {v0}, Landroid/support/v7/widget/dg;->c(Landroid/support/v7/widget/dg;)Landroid/support/v7/widget/ds;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/widget/ds;->run()V

    :cond_0
    return-void
.end method
