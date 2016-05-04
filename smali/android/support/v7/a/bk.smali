.class public Landroid/support/v7/a/bk;
.super Landroid/support/v7/view/b;

# interfaces
.implements Landroid/support/v7/view/menu/j;


# instance fields
.field final synthetic a:Landroid/support/v7/a/bg;

.field private final b:Landroid/content/Context;

.field private final c:Landroid/support/v7/view/menu/i;

.field private d:Landroid/support/v7/view/c;

.field private e:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>(Landroid/support/v7/a/bg;Landroid/content/Context;Landroid/support/v7/view/c;)V
    .locals 2

    iput-object p1, p0, Landroid/support/v7/a/bk;->a:Landroid/support/v7/a/bg;

    invoke-direct {p0}, Landroid/support/v7/view/b;-><init>()V

    iput-object p2, p0, Landroid/support/v7/a/bk;->b:Landroid/content/Context;

    iput-object p3, p0, Landroid/support/v7/a/bk;->d:Landroid/support/v7/view/c;

    new-instance v0, Landroid/support/v7/view/menu/i;

    invoke-direct {v0, p2}, Landroid/support/v7/view/menu/i;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/v7/view/menu/i;->a(I)Landroid/support/v7/view/menu/i;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/a/bk;->c:Landroid/support/v7/view/menu/i;

    iget-object v0, p0, Landroid/support/v7/a/bk;->c:Landroid/support/v7/view/menu/i;

    invoke-virtual {v0, p0}, Landroid/support/v7/view/menu/i;->a(Landroid/support/v7/view/menu/j;)V

    return-void
.end method


# virtual methods
.method public a()Landroid/view/MenuInflater;
    .locals 2

    new-instance v0, Landroid/support/v7/view/i;

    iget-object v1, p0, Landroid/support/v7/a/bk;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/support/v7/view/i;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public a(I)V
    .locals 1

    iget-object v0, p0, Landroid/support/v7/a/bk;->a:Landroid/support/v7/a/bg;

    invoke-static {v0}, Landroid/support/v7/a/bg;->i(Landroid/support/v7/a/bg;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/support/v7/a/bk;->b(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public a(Landroid/support/v7/view/menu/i;)V
    .locals 1

    iget-object v0, p0, Landroid/support/v7/a/bk;->d:Landroid/support/v7/view/c;

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    invoke-virtual {p0}, Landroid/support/v7/a/bk;->d()V

    iget-object v0, p0, Landroid/support/v7/a/bk;->a:Landroid/support/v7/a/bg;

    invoke-static {v0}, Landroid/support/v7/a/bg;->g(Landroid/support/v7/a/bg;)Landroid/support/v7/widget/ActionBarContextView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/widget/ActionBarContextView;->a()Z

    goto :goto_0
.end method

.method public a(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Landroid/support/v7/a/bk;->a:Landroid/support/v7/a/bg;

    invoke-static {v0}, Landroid/support/v7/a/bg;->g(Landroid/support/v7/a/bg;)Landroid/support/v7/widget/ActionBarContextView;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/ActionBarContextView;->setCustomView(Landroid/view/View;)V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Landroid/support/v7/a/bk;->e:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public a(Ljava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, Landroid/support/v7/a/bk;->a:Landroid/support/v7/a/bg;

    invoke-static {v0}, Landroid/support/v7/a/bg;->g(Landroid/support/v7/a/bg;)Landroid/support/v7/widget/ActionBarContextView;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/ActionBarContextView;->setSubtitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public a(Z)V
    .locals 1

    invoke-super {p0, p1}, Landroid/support/v7/view/b;->a(Z)V

    iget-object v0, p0, Landroid/support/v7/a/bk;->a:Landroid/support/v7/a/bg;

    invoke-static {v0}, Landroid/support/v7/a/bg;->g(Landroid/support/v7/a/bg;)Landroid/support/v7/widget/ActionBarContextView;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/ActionBarContextView;->setTitleOptional(Z)V

    return-void
.end method

.method public a(Landroid/support/v7/view/menu/i;Landroid/view/MenuItem;)Z
    .locals 1

    iget-object v0, p0, Landroid/support/v7/a/bk;->d:Landroid/support/v7/view/c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/a/bk;->d:Landroid/support/v7/view/c;

    invoke-interface {v0, p0, p2}, Landroid/support/v7/view/c;->a(Landroid/support/v7/view/b;Landroid/view/MenuItem;)Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b()Landroid/view/Menu;
    .locals 1

    iget-object v0, p0, Landroid/support/v7/a/bk;->c:Landroid/support/v7/view/menu/i;

    return-object v0
.end method

.method public b(I)V
    .locals 1

    iget-object v0, p0, Landroid/support/v7/a/bk;->a:Landroid/support/v7/a/bg;

    invoke-static {v0}, Landroid/support/v7/a/bg;->i(Landroid/support/v7/a/bg;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/support/v7/a/bk;->a(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public b(Ljava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, Landroid/support/v7/a/bk;->a:Landroid/support/v7/a/bg;

    invoke-static {v0}, Landroid/support/v7/a/bg;->g(Landroid/support/v7/a/bg;)Landroid/support/v7/widget/ActionBarContextView;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/ActionBarContextView;->setTitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public c()V
    .locals 4

    const/4 v3, 0x0

    const/4 v2, 0x0

    iget-object v0, p0, Landroid/support/v7/a/bk;->a:Landroid/support/v7/a/bg;

    iget-object v0, v0, Landroid/support/v7/a/bg;->a:Landroid/support/v7/a/bk;

    if-eq v0, p0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Landroid/support/v7/a/bk;->a:Landroid/support/v7/a/bg;

    invoke-static {v0}, Landroid/support/v7/a/bg;->e(Landroid/support/v7/a/bg;)Z

    move-result v0

    iget-object v1, p0, Landroid/support/v7/a/bk;->a:Landroid/support/v7/a/bg;

    invoke-static {v1}, Landroid/support/v7/a/bg;->f(Landroid/support/v7/a/bg;)Z

    move-result v1

    invoke-static {v0, v1, v2}, Landroid/support/v7/a/bg;->a(ZZZ)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Landroid/support/v7/a/bk;->a:Landroid/support/v7/a/bg;

    iput-object p0, v0, Landroid/support/v7/a/bg;->b:Landroid/support/v7/view/b;

    iget-object v0, p0, Landroid/support/v7/a/bk;->a:Landroid/support/v7/a/bg;

    iget-object v1, p0, Landroid/support/v7/a/bk;->d:Landroid/support/v7/view/c;

    iput-object v1, v0, Landroid/support/v7/a/bg;->c:Landroid/support/v7/view/c;

    :goto_1
    iput-object v3, p0, Landroid/support/v7/a/bk;->d:Landroid/support/v7/view/c;

    iget-object v0, p0, Landroid/support/v7/a/bk;->a:Landroid/support/v7/a/bg;

    invoke-virtual {v0, v2}, Landroid/support/v7/a/bg;->k(Z)V

    iget-object v0, p0, Landroid/support/v7/a/bk;->a:Landroid/support/v7/a/bg;

    invoke-static {v0}, Landroid/support/v7/a/bg;->g(Landroid/support/v7/a/bg;)Landroid/support/v7/widget/ActionBarContextView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/widget/ActionBarContextView;->b()V

    iget-object v0, p0, Landroid/support/v7/a/bk;->a:Landroid/support/v7/a/bg;

    invoke-static {v0}, Landroid/support/v7/a/bg;->h(Landroid/support/v7/a/bg;)Landroid/support/v7/widget/cf;

    move-result-object v0

    invoke-interface {v0}, Landroid/support/v7/widget/cf;->a()Landroid/view/ViewGroup;

    move-result-object v0

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->sendAccessibilityEvent(I)V

    iget-object v0, p0, Landroid/support/v7/a/bk;->a:Landroid/support/v7/a/bg;

    invoke-static {v0}, Landroid/support/v7/a/bg;->d(Landroid/support/v7/a/bg;)Landroid/support/v7/widget/ActionBarOverlayLayout;

    move-result-object v0

    iget-object v1, p0, Landroid/support/v7/a/bk;->a:Landroid/support/v7/a/bg;

    iget-boolean v1, v1, Landroid/support/v7/a/bg;->d:Z

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/ActionBarOverlayLayout;->setHideOnContentScrollEnabled(Z)V

    iget-object v0, p0, Landroid/support/v7/a/bk;->a:Landroid/support/v7/a/bg;

    iput-object v3, v0, Landroid/support/v7/a/bg;->a:Landroid/support/v7/a/bk;

    goto :goto_0

    :cond_1
    iget-object v0, p0, Landroid/support/v7/a/bk;->d:Landroid/support/v7/view/c;

    invoke-interface {v0, p0}, Landroid/support/v7/view/c;->a(Landroid/support/v7/view/b;)V

    goto :goto_1
.end method

.method public d()V
    .locals 2

    iget-object v0, p0, Landroid/support/v7/a/bk;->a:Landroid/support/v7/a/bg;

    iget-object v0, v0, Landroid/support/v7/a/bg;->a:Landroid/support/v7/a/bk;

    if-eq v0, p0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Landroid/support/v7/a/bk;->c:Landroid/support/v7/view/menu/i;

    invoke-virtual {v0}, Landroid/support/v7/view/menu/i;->g()V

    :try_start_0
    iget-object v0, p0, Landroid/support/v7/a/bk;->d:Landroid/support/v7/view/c;

    iget-object v1, p0, Landroid/support/v7/a/bk;->c:Landroid/support/v7/view/menu/i;

    invoke-interface {v0, p0, v1}, Landroid/support/v7/view/c;->b(Landroid/support/v7/view/b;Landroid/view/Menu;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Landroid/support/v7/a/bk;->c:Landroid/support/v7/view/menu/i;

    invoke-virtual {v0}, Landroid/support/v7/view/menu/i;->h()V

    goto :goto_0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Landroid/support/v7/a/bk;->c:Landroid/support/v7/view/menu/i;

    invoke-virtual {v1}, Landroid/support/v7/view/menu/i;->h()V

    throw v0
.end method

.method public e()Z
    .locals 2

    iget-object v0, p0, Landroid/support/v7/a/bk;->c:Landroid/support/v7/view/menu/i;

    invoke-virtual {v0}, Landroid/support/v7/view/menu/i;->g()V

    :try_start_0
    iget-object v0, p0, Landroid/support/v7/a/bk;->d:Landroid/support/v7/view/c;

    iget-object v1, p0, Landroid/support/v7/a/bk;->c:Landroid/support/v7/view/menu/i;

    invoke-interface {v0, p0, v1}, Landroid/support/v7/view/c;->a(Landroid/support/v7/view/b;Landroid/view/Menu;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    iget-object v1, p0, Landroid/support/v7/a/bk;->c:Landroid/support/v7/view/menu/i;

    invoke-virtual {v1}, Landroid/support/v7/view/menu/i;->h()V

    return v0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Landroid/support/v7/a/bk;->c:Landroid/support/v7/view/menu/i;

    invoke-virtual {v1}, Landroid/support/v7/view/menu/i;->h()V

    throw v0
.end method

.method public f()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Landroid/support/v7/a/bk;->a:Landroid/support/v7/a/bg;

    invoke-static {v0}, Landroid/support/v7/a/bg;->g(Landroid/support/v7/a/bg;)Landroid/support/v7/widget/ActionBarContextView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/widget/ActionBarContextView;->getTitle()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public g()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Landroid/support/v7/a/bk;->a:Landroid/support/v7/a/bg;

    invoke-static {v0}, Landroid/support/v7/a/bg;->g(Landroid/support/v7/a/bg;)Landroid/support/v7/widget/ActionBarContextView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/widget/ActionBarContextView;->getSubtitle()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public h()Z
    .locals 1

    iget-object v0, p0, Landroid/support/v7/a/bk;->a:Landroid/support/v7/a/bg;

    invoke-static {v0}, Landroid/support/v7/a/bg;->g(Landroid/support/v7/a/bg;)Landroid/support/v7/widget/ActionBarContextView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/widget/ActionBarContextView;->d()Z

    move-result v0

    return v0
.end method

.method public i()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Landroid/support/v7/a/bk;->e:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/a/bk;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
