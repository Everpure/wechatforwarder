.class public Landroid/support/v4/b/ab;
.super Ljava/lang/Object;


# instance fields
.field private final a:Landroid/support/v4/b/ac;


# direct methods
.method private constructor <init>(Landroid/support/v4/b/ac;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroid/support/v4/b/ab;->a:Landroid/support/v4/b/ac;

    return-void
.end method

.method public static final a(Landroid/support/v4/b/ac;)Landroid/support/v4/b/ab;
    .locals 1

    new-instance v0, Landroid/support/v4/b/ab;

    invoke-direct {v0, p0}, Landroid/support/v4/b/ab;-><init>(Landroid/support/v4/b/ac;)V

    return-object v0
.end method


# virtual methods
.method public a()Landroid/support/v4/b/ad;
    .locals 1

    iget-object v0, p0, Landroid/support/v4/b/ab;->a:Landroid/support/v4/b/ac;

    invoke-virtual {v0}, Landroid/support/v4/b/ac;->i()Landroid/support/v4/b/af;

    move-result-object v0

    return-object v0
.end method

.method a(Ljava/lang/String;)Landroid/support/v4/b/t;
    .locals 1

    iget-object v0, p0, Landroid/support/v4/b/ab;->a:Landroid/support/v4/b/ac;

    iget-object v0, v0, Landroid/support/v4/b/ac;->d:Landroid/support/v4/b/af;

    invoke-virtual {v0, p1}, Landroid/support/v4/b/af;->b(Ljava/lang/String;)Landroid/support/v4/b/t;

    move-result-object v0

    return-object v0
.end method

.method public a(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    iget-object v0, p0, Landroid/support/v4/b/ab;->a:Landroid/support/v4/b/ac;

    iget-object v0, v0, Landroid/support/v4/b/ac;->d:Landroid/support/v4/b/af;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/support/v4/b/af;->a(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/util/List;)Ljava/util/List;
    .locals 1

    iget-object v0, p0, Landroid/support/v4/b/ab;->a:Landroid/support/v4/b/ac;

    iget-object v0, v0, Landroid/support/v4/b/ac;->d:Landroid/support/v4/b/af;

    iget-object v0, v0, Landroid/support/v4/b/af;->f:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    :goto_0
    return-object p1

    :cond_0
    if-nez p1, :cond_1

    new-instance p1, Ljava/util/ArrayList;

    invoke-virtual {p0}, Landroid/support/v4/b/ab;->b()I

    move-result v0

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    :cond_1
    iget-object v0, p0, Landroid/support/v4/b/ab;->a:Landroid/support/v4/b/ac;

    iget-object v0, v0, Landroid/support/v4/b/ac;->d:Landroid/support/v4/b/af;

    iget-object v0, v0, Landroid/support/v4/b/af;->f:Ljava/util/ArrayList;

    invoke-interface {p1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_0
.end method

.method public a(Landroid/content/res/Configuration;)V
    .locals 1

    iget-object v0, p0, Landroid/support/v4/b/ab;->a:Landroid/support/v4/b/ac;

    iget-object v0, v0, Landroid/support/v4/b/ac;->d:Landroid/support/v4/b/af;

    invoke-virtual {v0, p1}, Landroid/support/v4/b/af;->a(Landroid/content/res/Configuration;)V

    return-void
.end method

.method public a(Landroid/os/Parcelable;Ljava/util/List;)V
    .locals 1

    iget-object v0, p0, Landroid/support/v4/b/ab;->a:Landroid/support/v4/b/ac;

    iget-object v0, v0, Landroid/support/v4/b/ac;->d:Landroid/support/v4/b/af;

    invoke-virtual {v0, p1, p2}, Landroid/support/v4/b/af;->a(Landroid/os/Parcelable;Ljava/util/List;)V

    return-void
.end method

.method public a(Landroid/support/v4/b/t;)V
    .locals 3

    iget-object v0, p0, Landroid/support/v4/b/ab;->a:Landroid/support/v4/b/ac;

    iget-object v0, v0, Landroid/support/v4/b/ac;->d:Landroid/support/v4/b/af;

    iget-object v1, p0, Landroid/support/v4/b/ab;->a:Landroid/support/v4/b/ac;

    iget-object v2, p0, Landroid/support/v4/b/ab;->a:Landroid/support/v4/b/ac;

    invoke-virtual {v0, v1, v2, p1}, Landroid/support/v4/b/af;->a(Landroid/support/v4/b/ac;Landroid/support/v4/b/aa;Landroid/support/v4/b/t;)V

    return-void
.end method

.method public a(Landroid/support/v4/h/q;)V
    .locals 1

    iget-object v0, p0, Landroid/support/v4/b/ab;->a:Landroid/support/v4/b/ac;

    invoke-virtual {v0, p1}, Landroid/support/v4/b/ac;->a(Landroid/support/v4/h/q;)V

    return-void
.end method

.method public a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Landroid/support/v4/b/ab;->a:Landroid/support/v4/b/ac;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/support/v4/b/ac;->b(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    return-void
.end method

.method public a(Z)V
    .locals 1

    iget-object v0, p0, Landroid/support/v4/b/ab;->a:Landroid/support/v4/b/ac;

    invoke-virtual {v0, p1}, Landroid/support/v4/b/ac;->a(Z)V

    return-void
.end method

.method public a(Landroid/view/Menu;)Z
    .locals 1

    iget-object v0, p0, Landroid/support/v4/b/ab;->a:Landroid/support/v4/b/ac;

    iget-object v0, v0, Landroid/support/v4/b/ac;->d:Landroid/support/v4/b/af;

    invoke-virtual {v0, p1}, Landroid/support/v4/b/af;->a(Landroid/view/Menu;)Z

    move-result v0

    return v0
.end method

.method public a(Landroid/view/Menu;Landroid/view/MenuInflater;)Z
    .locals 1

    iget-object v0, p0, Landroid/support/v4/b/ab;->a:Landroid/support/v4/b/ac;

    iget-object v0, v0, Landroid/support/v4/b/ac;->d:Landroid/support/v4/b/af;

    invoke-virtual {v0, p1, p2}, Landroid/support/v4/b/af;->a(Landroid/view/Menu;Landroid/view/MenuInflater;)Z

    move-result v0

    return v0
.end method

.method public a(Landroid/view/MenuItem;)Z
    .locals 1

    iget-object v0, p0, Landroid/support/v4/b/ab;->a:Landroid/support/v4/b/ac;

    iget-object v0, v0, Landroid/support/v4/b/ac;->d:Landroid/support/v4/b/af;

    invoke-virtual {v0, p1}, Landroid/support/v4/b/af;->a(Landroid/view/MenuItem;)Z

    move-result v0

    return v0
.end method

.method public b()I
    .locals 1

    iget-object v0, p0, Landroid/support/v4/b/ab;->a:Landroid/support/v4/b/ac;

    iget-object v0, v0, Landroid/support/v4/b/ac;->d:Landroid/support/v4/b/af;

    iget-object v0, v0, Landroid/support/v4/b/af;->f:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    goto :goto_0
.end method

.method public b(Landroid/view/Menu;)V
    .locals 1

    iget-object v0, p0, Landroid/support/v4/b/ab;->a:Landroid/support/v4/b/ac;

    iget-object v0, v0, Landroid/support/v4/b/ac;->d:Landroid/support/v4/b/af;

    invoke-virtual {v0, p1}, Landroid/support/v4/b/af;->b(Landroid/view/Menu;)V

    return-void
.end method

.method public b(Landroid/view/MenuItem;)Z
    .locals 1

    iget-object v0, p0, Landroid/support/v4/b/ab;->a:Landroid/support/v4/b/ac;

    iget-object v0, v0, Landroid/support/v4/b/ac;->d:Landroid/support/v4/b/af;

    invoke-virtual {v0, p1}, Landroid/support/v4/b/af;->b(Landroid/view/MenuItem;)Z

    move-result v0

    return v0
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Landroid/support/v4/b/ab;->a:Landroid/support/v4/b/ac;

    iget-object v0, v0, Landroid/support/v4/b/ac;->d:Landroid/support/v4/b/af;

    invoke-virtual {v0}, Landroid/support/v4/b/af;->h()V

    return-void
.end method

.method public d()Landroid/os/Parcelable;
    .locals 1

    iget-object v0, p0, Landroid/support/v4/b/ab;->a:Landroid/support/v4/b/ac;

    iget-object v0, v0, Landroid/support/v4/b/ac;->d:Landroid/support/v4/b/af;

    invoke-virtual {v0}, Landroid/support/v4/b/af;->g()Landroid/os/Parcelable;

    move-result-object v0

    return-object v0
.end method

.method public e()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Landroid/support/v4/b/ab;->a:Landroid/support/v4/b/ac;

    iget-object v0, v0, Landroid/support/v4/b/ac;->d:Landroid/support/v4/b/af;

    invoke-virtual {v0}, Landroid/support/v4/b/af;->f()Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public f()V
    .locals 1

    iget-object v0, p0, Landroid/support/v4/b/ab;->a:Landroid/support/v4/b/ac;

    iget-object v0, v0, Landroid/support/v4/b/ac;->d:Landroid/support/v4/b/af;

    invoke-virtual {v0}, Landroid/support/v4/b/af;->i()V

    return-void
.end method

.method public g()V
    .locals 1

    iget-object v0, p0, Landroid/support/v4/b/ab;->a:Landroid/support/v4/b/ac;

    iget-object v0, v0, Landroid/support/v4/b/ac;->d:Landroid/support/v4/b/af;

    invoke-virtual {v0}, Landroid/support/v4/b/af;->j()V

    return-void
.end method

.method public h()V
    .locals 1

    iget-object v0, p0, Landroid/support/v4/b/ab;->a:Landroid/support/v4/b/ac;

    iget-object v0, v0, Landroid/support/v4/b/ac;->d:Landroid/support/v4/b/af;

    invoke-virtual {v0}, Landroid/support/v4/b/af;->k()V

    return-void
.end method

.method public i()V
    .locals 1

    iget-object v0, p0, Landroid/support/v4/b/ab;->a:Landroid/support/v4/b/ac;

    iget-object v0, v0, Landroid/support/v4/b/ac;->d:Landroid/support/v4/b/af;

    invoke-virtual {v0}, Landroid/support/v4/b/af;->l()V

    return-void
.end method

.method public j()V
    .locals 1

    iget-object v0, p0, Landroid/support/v4/b/ab;->a:Landroid/support/v4/b/ac;

    iget-object v0, v0, Landroid/support/v4/b/ac;->d:Landroid/support/v4/b/af;

    invoke-virtual {v0}, Landroid/support/v4/b/af;->m()V

    return-void
.end method

.method public k()V
    .locals 1

    iget-object v0, p0, Landroid/support/v4/b/ab;->a:Landroid/support/v4/b/ac;

    iget-object v0, v0, Landroid/support/v4/b/ac;->d:Landroid/support/v4/b/af;

    invoke-virtual {v0}, Landroid/support/v4/b/af;->n()V

    return-void
.end method

.method public l()V
    .locals 1

    iget-object v0, p0, Landroid/support/v4/b/ab;->a:Landroid/support/v4/b/ac;

    iget-object v0, v0, Landroid/support/v4/b/ac;->d:Landroid/support/v4/b/af;

    invoke-virtual {v0}, Landroid/support/v4/b/af;->o()V

    return-void
.end method

.method public m()V
    .locals 1

    iget-object v0, p0, Landroid/support/v4/b/ab;->a:Landroid/support/v4/b/ac;

    iget-object v0, v0, Landroid/support/v4/b/ac;->d:Landroid/support/v4/b/af;

    invoke-virtual {v0}, Landroid/support/v4/b/af;->q()V

    return-void
.end method

.method public n()V
    .locals 1

    iget-object v0, p0, Landroid/support/v4/b/ab;->a:Landroid/support/v4/b/ac;

    iget-object v0, v0, Landroid/support/v4/b/ac;->d:Landroid/support/v4/b/af;

    invoke-virtual {v0}, Landroid/support/v4/b/af;->r()V

    return-void
.end method

.method public o()Z
    .locals 1

    iget-object v0, p0, Landroid/support/v4/b/ab;->a:Landroid/support/v4/b/ac;

    iget-object v0, v0, Landroid/support/v4/b/ac;->d:Landroid/support/v4/b/af;

    invoke-virtual {v0}, Landroid/support/v4/b/af;->d()Z

    move-result v0

    return v0
.end method

.method public p()V
    .locals 1

    iget-object v0, p0, Landroid/support/v4/b/ab;->a:Landroid/support/v4/b/ac;

    invoke-virtual {v0}, Landroid/support/v4/b/ac;->k()V

    return-void
.end method

.method public q()V
    .locals 1

    iget-object v0, p0, Landroid/support/v4/b/ab;->a:Landroid/support/v4/b/ac;

    invoke-virtual {v0}, Landroid/support/v4/b/ac;->l()V

    return-void
.end method

.method public r()V
    .locals 1

    iget-object v0, p0, Landroid/support/v4/b/ab;->a:Landroid/support/v4/b/ac;

    invoke-virtual {v0}, Landroid/support/v4/b/ac;->m()V

    return-void
.end method

.method public s()Landroid/support/v4/h/q;
    .locals 1

    iget-object v0, p0, Landroid/support/v4/b/ab;->a:Landroid/support/v4/b/ac;

    invoke-virtual {v0}, Landroid/support/v4/b/ac;->n()Landroid/support/v4/h/q;

    move-result-object v0

    return-object v0
.end method
