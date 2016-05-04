.class Landroid/support/v7/a/ao;
.super Landroid/support/v4/i/ea;


# instance fields
.field final synthetic a:Landroid/support/v7/a/an;


# direct methods
.method constructor <init>(Landroid/support/v7/a/an;)V
    .locals 0

    iput-object p1, p0, Landroid/support/v7/a/ao;->a:Landroid/support/v7/a/an;

    invoke-direct {p0}, Landroid/support/v4/i/ea;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/view/View;)V
    .locals 3

    const/4 v2, 0x0

    iget-object v0, p0, Landroid/support/v7/a/ao;->a:Landroid/support/v7/a/an;

    iget-object v0, v0, Landroid/support/v7/a/an;->a:Landroid/support/v7/a/ae;

    iget-object v0, v0, Landroid/support/v7/a/ae;->n:Landroid/support/v7/widget/ActionBarContextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/ActionBarContextView;->setVisibility(I)V

    iget-object v0, p0, Landroid/support/v7/a/ao;->a:Landroid/support/v7/a/an;

    iget-object v0, v0, Landroid/support/v7/a/an;->a:Landroid/support/v7/a/ae;

    iget-object v0, v0, Landroid/support/v7/a/ae;->o:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroid/support/v7/a/ao;->a:Landroid/support/v7/a/an;

    iget-object v0, v0, Landroid/support/v7/a/an;->a:Landroid/support/v7/a/ae;

    iget-object v0, v0, Landroid/support/v7/a/ae;->o:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_0
    :goto_0
    iget-object v0, p0, Landroid/support/v7/a/ao;->a:Landroid/support/v7/a/an;

    iget-object v0, v0, Landroid/support/v7/a/an;->a:Landroid/support/v7/a/ae;

    iget-object v0, v0, Landroid/support/v7/a/ae;->n:Landroid/support/v7/widget/ActionBarContextView;

    invoke-virtual {v0}, Landroid/support/v7/widget/ActionBarContextView;->removeAllViews()V

    iget-object v0, p0, Landroid/support/v7/a/ao;->a:Landroid/support/v7/a/an;

    iget-object v0, v0, Landroid/support/v7/a/an;->a:Landroid/support/v7/a/ae;

    iget-object v0, v0, Landroid/support/v7/a/ae;->q:Landroid/support/v4/i/di;

    invoke-virtual {v0, v2}, Landroid/support/v4/i/di;->a(Landroid/support/v4/i/dz;)Landroid/support/v4/i/di;

    iget-object v0, p0, Landroid/support/v7/a/ao;->a:Landroid/support/v7/a/an;

    iget-object v0, v0, Landroid/support/v7/a/an;->a:Landroid/support/v7/a/ae;

    iput-object v2, v0, Landroid/support/v7/a/ae;->q:Landroid/support/v4/i/di;

    return-void

    :cond_1
    iget-object v0, p0, Landroid/support/v7/a/ao;->a:Landroid/support/v7/a/an;

    iget-object v0, v0, Landroid/support/v7/a/an;->a:Landroid/support/v7/a/ae;

    iget-object v0, v0, Landroid/support/v7/a/ae;->n:Landroid/support/v7/widget/ActionBarContextView;

    invoke-virtual {v0}, Landroid/support/v7/widget/ActionBarContextView;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v0, v0, Landroid/view/View;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/a/ao;->a:Landroid/support/v7/a/an;

    iget-object v0, v0, Landroid/support/v7/a/an;->a:Landroid/support/v7/a/ae;

    iget-object v0, v0, Landroid/support/v7/a/ae;->n:Landroid/support/v7/widget/ActionBarContextView;

    invoke-virtual {v0}, Landroid/support/v7/widget/ActionBarContextView;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-static {v0}, Landroid/support/v4/i/bu;->s(Landroid/view/View;)V

    goto :goto_0
.end method
