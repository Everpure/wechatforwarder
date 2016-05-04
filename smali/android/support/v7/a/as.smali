.class public Landroid/support/v7/a/as;
.super Landroid/app/Dialog;

# interfaces
.implements Landroid/support/v7/a/v;


# instance fields
.field private a:Landroid/support/v7/a/w;


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 2

    invoke-static {p1, p2}, Landroid/support/v7/a/as;->a(Landroid/content/Context;I)I

    move-result v0

    invoke-direct {p0, p1, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    invoke-virtual {p0}, Landroid/support/v7/a/as;->a()Landroid/support/v7/a/w;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/a/w;->a(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroid/support/v7/a/as;->a()Landroid/support/v7/a/w;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/a/w;->h()Z

    return-void
.end method

.method private static a(Landroid/content/Context;I)I
    .locals 4

    if-nez p1, :cond_0

    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    sget v2, Landroid/support/v7/b/b;->dialogTheme:I

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v0, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget p1, v0, Landroid/util/TypedValue;->resourceId:I

    :cond_0
    return p1
.end method


# virtual methods
.method public a()Landroid/support/v7/a/w;
    .locals 1

    iget-object v0, p0, Landroid/support/v7/a/as;->a:Landroid/support/v7/a/w;

    if-nez v0, :cond_0

    invoke-static {p0, p0}, Landroid/support/v7/a/w;->a(Landroid/app/Dialog;Landroid/support/v7/a/v;)Landroid/support/v7/a/w;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/a/as;->a:Landroid/support/v7/a/w;

    :cond_0
    iget-object v0, p0, Landroid/support/v7/a/as;->a:Landroid/support/v7/a/w;

    return-object v0
.end method

.method public a(Landroid/support/v7/view/c;)Landroid/support/v7/view/b;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public a(Landroid/support/v7/view/b;)V
    .locals 0

    return-void
.end method

.method public a(I)Z
    .locals 1

    invoke-virtual {p0}, Landroid/support/v7/a/as;->a()Landroid/support/v7/a/w;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/support/v7/a/w;->c(I)Z

    move-result v0

    return v0
.end method

.method public addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    invoke-virtual {p0}, Landroid/support/v7/a/as;->a()Landroid/support/v7/a/w;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Landroid/support/v7/a/w;->b(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public b(Landroid/support/v7/view/b;)V
    .locals 0

    return-void
.end method

.method public findViewById(I)Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Landroid/support/v7/a/as;->a()Landroid/support/v7/a/w;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/support/v7/a/w;->a(I)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public invalidateOptionsMenu()V
    .locals 1

    invoke-virtual {p0}, Landroid/support/v7/a/as;->a()Landroid/support/v7/a/w;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/a/w;->e()V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1

    invoke-virtual {p0}, Landroid/support/v7/a/as;->a()Landroid/support/v7/a/w;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/a/w;->g()V

    invoke-super {p0, p1}, Landroid/app/Dialog;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroid/support/v7/a/as;->a()Landroid/support/v7/a/w;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/support/v7/a/w;->a(Landroid/os/Bundle;)V

    return-void
.end method

.method protected onStop()V
    .locals 1

    invoke-super {p0}, Landroid/app/Dialog;->onStop()V

    invoke-virtual {p0}, Landroid/support/v7/a/as;->a()Landroid/support/v7/a/w;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/a/w;->c()V

    return-void
.end method

.method public setContentView(I)V
    .locals 1

    invoke-virtual {p0}, Landroid/support/v7/a/as;->a()Landroid/support/v7/a/w;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/support/v7/a/w;->b(I)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 1

    invoke-virtual {p0}, Landroid/support/v7/a/as;->a()Landroid/support/v7/a/w;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/support/v7/a/w;->a(Landroid/view/View;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    invoke-virtual {p0}, Landroid/support/v7/a/as;->a()Landroid/support/v7/a/w;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Landroid/support/v7/a/w;->a(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public setTitle(I)V
    .locals 2

    invoke-super {p0, p1}, Landroid/app/Dialog;->setTitle(I)V

    invoke-virtual {p0}, Landroid/support/v7/a/as;->a()Landroid/support/v7/a/w;

    move-result-object v0

    invoke-virtual {p0}, Landroid/support/v7/a/as;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v7/a/w;->a(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setTitle(Ljava/lang/CharSequence;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/app/Dialog;->setTitle(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Landroid/support/v7/a/as;->a()Landroid/support/v7/a/w;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/support/v7/a/w;->a(Ljava/lang/CharSequence;)V

    return-void
.end method
