.class Landroid/support/v4/i/ag;
.super Ljava/lang/Object;


# direct methods
.method static a(Landroid/view/LayoutInflater;)Landroid/support/v4/i/al;
    .locals 2

    invoke-virtual {p0}, Landroid/view/LayoutInflater;->getFactory()Landroid/view/LayoutInflater$Factory;

    move-result-object v0

    instance-of v1, v0, Landroid/support/v4/i/ah;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/support/v4/i/ah;

    iget-object v0, v0, Landroid/support/v4/i/ah;->a:Landroid/support/v4/i/al;

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static a(Landroid/view/LayoutInflater;Landroid/support/v4/i/al;)V
    .locals 1

    if-eqz p1, :cond_0

    new-instance v0, Landroid/support/v4/i/ah;

    invoke-direct {v0, p1}, Landroid/support/v4/i/ah;-><init>(Landroid/support/v4/i/al;)V

    :goto_0
    invoke-virtual {p0, v0}, Landroid/view/LayoutInflater;->setFactory(Landroid/view/LayoutInflater$Factory;)V

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
