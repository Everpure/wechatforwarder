.class Landroid/support/v7/widget/fj;
.super Landroid/support/v4/i/a;


# instance fields
.field final synthetic b:Landroid/support/v7/widget/fi;


# direct methods
.method constructor <init>(Landroid/support/v7/widget/fi;)V
    .locals 0

    iput-object p1, p0, Landroid/support/v7/widget/fj;->b:Landroid/support/v7/widget/fi;

    invoke-direct {p0}, Landroid/support/v4/i/a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;Landroid/support/v4/i/a/g;)V
    .locals 1

    invoke-super {p0, p1, p2}, Landroid/support/v4/i/a;->a(Landroid/view/View;Landroid/support/v4/i/a/g;)V

    iget-object v0, p0, Landroid/support/v7/widget/fj;->b:Landroid/support/v7/widget/fi;

    invoke-static {v0}, Landroid/support/v7/widget/fi;->a(Landroid/support/v7/widget/fi;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/fj;->b:Landroid/support/v7/widget/fi;

    iget-object v0, v0, Landroid/support/v7/widget/fi;->b:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->getLayoutManager()Landroid/support/v7/widget/eq;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/fj;->b:Landroid/support/v7/widget/fi;

    iget-object v0, v0, Landroid/support/v7/widget/fi;->b:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->getLayoutManager()Landroid/support/v7/widget/eq;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Landroid/support/v7/widget/eq;->a(Landroid/view/View;Landroid/support/v4/i/a/g;)V

    :cond_0
    return-void
.end method

.method public a(Landroid/view/View;ILandroid/os/Bundle;)Z
    .locals 1

    invoke-super {p0, p1, p2, p3}, Landroid/support/v4/i/a;->a(Landroid/view/View;ILandroid/os/Bundle;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/fj;->b:Landroid/support/v7/widget/fi;

    invoke-static {v0}, Landroid/support/v7/widget/fi;->a(Landroid/support/v7/widget/fi;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Landroid/support/v7/widget/fj;->b:Landroid/support/v7/widget/fi;

    iget-object v0, v0, Landroid/support/v7/widget/fi;->b:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->getLayoutManager()Landroid/support/v7/widget/eq;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroid/support/v7/widget/fj;->b:Landroid/support/v7/widget/fi;

    iget-object v0, v0, Landroid/support/v7/widget/fi;->b:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->getLayoutManager()Landroid/support/v7/widget/eq;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Landroid/support/v7/widget/eq;->a(Landroid/view/View;ILandroid/os/Bundle;)Z

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method
