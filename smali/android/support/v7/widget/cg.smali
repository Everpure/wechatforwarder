.class public Landroid/support/v7/widget/cg;
.super Landroid/support/v7/widget/ga;


# instance fields
.field private b:Ljava/util/ArrayList;

.field private c:Ljava/util/ArrayList;

.field private d:Ljava/util/ArrayList;

.field private e:Ljava/util/ArrayList;

.field private f:Ljava/util/ArrayList;

.field private g:Ljava/util/ArrayList;

.field private h:Ljava/util/ArrayList;

.field private i:Ljava/util/ArrayList;

.field private j:Ljava/util/ArrayList;

.field private k:Ljava/util/ArrayList;

.field private l:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/support/v7/widget/ga;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v7/widget/cg;->b:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v7/widget/cg;->c:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v7/widget/cg;->d:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v7/widget/cg;->e:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v7/widget/cg;->f:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v7/widget/cg;->g:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v7/widget/cg;->h:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v7/widget/cg;->i:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v7/widget/cg;->j:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v7/widget/cg;->k:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v7/widget/cg;->l:Ljava/util/ArrayList;

    return-void
.end method

.method static synthetic a(Landroid/support/v7/widget/cg;)Ljava/util/ArrayList;
    .locals 1

    iget-object v0, p0, Landroid/support/v7/widget/cg;->g:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic a(Landroid/support/v7/widget/cg;Landroid/support/v7/widget/cp;)V
    .locals 0

    invoke-direct {p0, p1}, Landroid/support/v7/widget/cg;->a(Landroid/support/v7/widget/cp;)V

    return-void
.end method

.method static synthetic a(Landroid/support/v7/widget/cg;Landroid/support/v7/widget/fh;)V
    .locals 0

    invoke-direct {p0, p1}, Landroid/support/v7/widget/cg;->u(Landroid/support/v7/widget/fh;)V

    return-void
.end method

.method static synthetic a(Landroid/support/v7/widget/cg;Landroid/support/v7/widget/fh;IIII)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Landroid/support/v7/widget/cg;->b(Landroid/support/v7/widget/fh;IIII)V

    return-void
.end method

.method private a(Landroid/support/v7/widget/cp;)V
    .locals 6

    const/4 v1, 0x0

    const/4 v4, 0x0

    iget-object v0, p1, Landroid/support/v7/widget/cp;->a:Landroid/support/v7/widget/fh;

    if-nez v0, :cond_3

    move-object v0, v1

    :goto_0
    iget-object v2, p1, Landroid/support/v7/widget/cp;->b:Landroid/support/v7/widget/fh;

    if-eqz v2, :cond_0

    iget-object v1, v2, Landroid/support/v7/widget/fh;->a:Landroid/view/View;

    :cond_0
    if-eqz v0, :cond_1

    invoke-static {v0}, Landroid/support/v4/i/bu;->q(Landroid/view/View;)Landroid/support/v4/i/di;

    move-result-object v0

    invoke-virtual {p0}, Landroid/support/v7/widget/cg;->g()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Landroid/support/v4/i/di;->a(J)Landroid/support/v4/i/di;

    move-result-object v0

    iget-object v2, p0, Landroid/support/v7/widget/cg;->l:Ljava/util/ArrayList;

    iget-object v3, p1, Landroid/support/v7/widget/cp;->a:Landroid/support/v7/widget/fh;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget v2, p1, Landroid/support/v7/widget/cp;->e:I

    iget v3, p1, Landroid/support/v7/widget/cp;->c:I

    sub-int/2addr v2, v3

    int-to-float v2, v2

    invoke-virtual {v0, v2}, Landroid/support/v4/i/di;->b(F)Landroid/support/v4/i/di;

    iget v2, p1, Landroid/support/v7/widget/cp;->f:I

    iget v3, p1, Landroid/support/v7/widget/cp;->d:I

    sub-int/2addr v2, v3

    int-to-float v2, v2

    invoke-virtual {v0, v2}, Landroid/support/v4/i/di;->c(F)Landroid/support/v4/i/di;

    invoke-virtual {v0, v4}, Landroid/support/v4/i/di;->a(F)Landroid/support/v4/i/di;

    move-result-object v2

    new-instance v3, Landroid/support/v7/widget/cn;

    invoke-direct {v3, p0, p1, v0}, Landroid/support/v7/widget/cn;-><init>(Landroid/support/v7/widget/cg;Landroid/support/v7/widget/cp;Landroid/support/v4/i/di;)V

    invoke-virtual {v2, v3}, Landroid/support/v4/i/di;->a(Landroid/support/v4/i/dz;)Landroid/support/v4/i/di;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/i/di;->c()V

    :cond_1
    if-eqz v1, :cond_2

    invoke-static {v1}, Landroid/support/v4/i/bu;->q(Landroid/view/View;)Landroid/support/v4/i/di;

    move-result-object v0

    iget-object v2, p0, Landroid/support/v7/widget/cg;->l:Ljava/util/ArrayList;

    iget-object v3, p1, Landroid/support/v7/widget/cp;->b:Landroid/support/v7/widget/fh;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0, v4}, Landroid/support/v4/i/di;->b(F)Landroid/support/v4/i/di;

    move-result-object v2

    invoke-virtual {v2, v4}, Landroid/support/v4/i/di;->c(F)Landroid/support/v4/i/di;

    move-result-object v2

    invoke-virtual {p0}, Landroid/support/v7/widget/cg;->g()J

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Landroid/support/v4/i/di;->a(J)Landroid/support/v4/i/di;

    move-result-object v2

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-virtual {v2, v3}, Landroid/support/v4/i/di;->a(F)Landroid/support/v4/i/di;

    move-result-object v2

    new-instance v3, Landroid/support/v7/widget/co;

    invoke-direct {v3, p0, p1, v0, v1}, Landroid/support/v7/widget/co;-><init>(Landroid/support/v7/widget/cg;Landroid/support/v7/widget/cp;Landroid/support/v4/i/di;Landroid/view/View;)V

    invoke-virtual {v2, v3}, Landroid/support/v4/i/di;->a(Landroid/support/v4/i/dz;)Landroid/support/v4/i/di;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/i/di;->c()V

    :cond_2
    return-void

    :cond_3
    iget-object v0, v0, Landroid/support/v7/widget/fh;->a:Landroid/view/View;

    goto :goto_0
.end method

.method private a(Ljava/util/List;Landroid/support/v7/widget/fh;)V
    .locals 3

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_0
    if-ltz v1, :cond_1

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/cp;

    invoke-direct {p0, v0, p2}, Landroid/support/v7/widget/cg;->a(Landroid/support/v7/widget/cp;Landroid/support/v7/widget/fh;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, v0, Landroid/support/v7/widget/cp;->a:Landroid/support/v7/widget/fh;

    if-nez v2, :cond_0

    iget-object v2, v0, Landroid/support/v7/widget/cp;->b:Landroid/support/v7/widget/fh;

    if-nez v2, :cond_0

    invoke-interface {p1, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_0

    :cond_1
    return-void
.end method

.method private a(Landroid/support/v7/widget/cp;Landroid/support/v7/widget/fh;)Z
    .locals 5

    const/4 v3, 0x0

    const/4 v1, 0x1

    const/4 v0, 0x0

    const/4 v4, 0x0

    iget-object v2, p1, Landroid/support/v7/widget/cp;->b:Landroid/support/v7/widget/fh;

    if-ne v2, p2, :cond_1

    iput-object v3, p1, Landroid/support/v7/widget/cp;->b:Landroid/support/v7/widget/fh;

    :goto_0
    iget-object v2, p2, Landroid/support/v7/widget/fh;->a:Landroid/view/View;

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v2, v3}, Landroid/support/v4/i/bu;->c(Landroid/view/View;F)V

    iget-object v2, p2, Landroid/support/v7/widget/fh;->a:Landroid/view/View;

    invoke-static {v2, v4}, Landroid/support/v4/i/bu;->a(Landroid/view/View;F)V

    iget-object v2, p2, Landroid/support/v7/widget/fh;->a:Landroid/view/View;

    invoke-static {v2, v4}, Landroid/support/v4/i/bu;->b(Landroid/view/View;F)V

    invoke-virtual {p0, p2, v0}, Landroid/support/v7/widget/cg;->a(Landroid/support/v7/widget/fh;Z)V

    move v0, v1

    :cond_0
    return v0

    :cond_1
    iget-object v2, p1, Landroid/support/v7/widget/cp;->a:Landroid/support/v7/widget/fh;

    if-ne v2, p2, :cond_0

    iput-object v3, p1, Landroid/support/v7/widget/cp;->a:Landroid/support/v7/widget/fh;

    move v0, v1

    goto :goto_0
.end method

.method static synthetic b(Landroid/support/v7/widget/cg;)Ljava/util/ArrayList;
    .locals 1

    iget-object v0, p0, Landroid/support/v7/widget/cg;->h:Ljava/util/ArrayList;

    return-object v0
.end method

.method private b(Landroid/support/v7/widget/cp;)V
    .locals 1

    iget-object v0, p1, Landroid/support/v7/widget/cp;->a:Landroid/support/v7/widget/fh;

    if-eqz v0, :cond_0

    iget-object v0, p1, Landroid/support/v7/widget/cp;->a:Landroid/support/v7/widget/fh;

    invoke-direct {p0, p1, v0}, Landroid/support/v7/widget/cg;->a(Landroid/support/v7/widget/cp;Landroid/support/v7/widget/fh;)Z

    :cond_0
    iget-object v0, p1, Landroid/support/v7/widget/cp;->b:Landroid/support/v7/widget/fh;

    if-eqz v0, :cond_1

    iget-object v0, p1, Landroid/support/v7/widget/cp;->b:Landroid/support/v7/widget/fh;

    invoke-direct {p0, p1, v0}, Landroid/support/v7/widget/cg;->a(Landroid/support/v7/widget/cp;Landroid/support/v7/widget/fh;)Z

    :cond_1
    return-void
.end method

.method private b(Landroid/support/v7/widget/fh;IIII)V
    .locals 7

    const/4 v2, 0x0

    iget-object v0, p1, Landroid/support/v7/widget/fh;->a:Landroid/view/View;

    sub-int v3, p4, p2

    sub-int v4, p5, p3

    if-eqz v3, :cond_0

    invoke-static {v0}, Landroid/support/v4/i/bu;->q(Landroid/view/View;)Landroid/support/v4/i/di;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/support/v4/i/di;->b(F)Landroid/support/v4/i/di;

    :cond_0
    if-eqz v4, :cond_1

    invoke-static {v0}, Landroid/support/v4/i/bu;->q(Landroid/view/View;)Landroid/support/v4/i/di;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/support/v4/i/di;->c(F)Landroid/support/v4/i/di;

    :cond_1
    invoke-static {v0}, Landroid/support/v4/i/bu;->q(Landroid/view/View;)Landroid/support/v4/i/di;

    move-result-object v5

    iget-object v0, p0, Landroid/support/v7/widget/cg;->j:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Landroid/support/v7/widget/cg;->d()J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Landroid/support/v4/i/di;->a(J)Landroid/support/v4/i/di;

    move-result-object v6

    new-instance v0, Landroid/support/v7/widget/cm;

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v5}, Landroid/support/v7/widget/cm;-><init>(Landroid/support/v7/widget/cg;Landroid/support/v7/widget/fh;IILandroid/support/v4/i/di;)V

    invoke-virtual {v6, v0}, Landroid/support/v4/i/di;->a(Landroid/support/v4/i/dz;)Landroid/support/v4/i/di;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/i/di;->c()V

    return-void
.end method

.method static synthetic c(Landroid/support/v7/widget/cg;)Ljava/util/ArrayList;
    .locals 1

    iget-object v0, p0, Landroid/support/v7/widget/cg;->f:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic d(Landroid/support/v7/widget/cg;)Ljava/util/ArrayList;
    .locals 1

    iget-object v0, p0, Landroid/support/v7/widget/cg;->k:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic e(Landroid/support/v7/widget/cg;)V
    .locals 0

    invoke-direct {p0}, Landroid/support/v7/widget/cg;->j()V

    return-void
.end method

.method static synthetic f(Landroid/support/v7/widget/cg;)Ljava/util/ArrayList;
    .locals 1

    iget-object v0, p0, Landroid/support/v7/widget/cg;->i:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic g(Landroid/support/v7/widget/cg;)Ljava/util/ArrayList;
    .locals 1

    iget-object v0, p0, Landroid/support/v7/widget/cg;->j:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic h(Landroid/support/v7/widget/cg;)Ljava/util/ArrayList;
    .locals 1

    iget-object v0, p0, Landroid/support/v7/widget/cg;->l:Ljava/util/ArrayList;

    return-object v0
.end method

.method private j()V
    .locals 1

    invoke-virtual {p0}, Landroid/support/v7/widget/cg;->b()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/support/v7/widget/cg;->h()V

    :cond_0
    return-void
.end method

.method private t(Landroid/support/v7/widget/fh;)V
    .locals 4

    iget-object v0, p1, Landroid/support/v7/widget/fh;->a:Landroid/view/View;

    invoke-static {v0}, Landroid/support/v4/i/bu;->q(Landroid/view/View;)Landroid/support/v4/i/di;

    move-result-object v0

    iget-object v1, p0, Landroid/support/v7/widget/cg;->k:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Landroid/support/v7/widget/cg;->f()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Landroid/support/v4/i/di;->a(J)Landroid/support/v4/i/di;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/support/v4/i/di;->a(F)Landroid/support/v4/i/di;

    move-result-object v1

    new-instance v2, Landroid/support/v7/widget/ck;

    invoke-direct {v2, p0, p1, v0}, Landroid/support/v7/widget/ck;-><init>(Landroid/support/v7/widget/cg;Landroid/support/v7/widget/fh;Landroid/support/v4/i/di;)V

    invoke-virtual {v1, v2}, Landroid/support/v4/i/di;->a(Landroid/support/v4/i/dz;)Landroid/support/v4/i/di;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/i/di;->c()V

    return-void
.end method

.method private u(Landroid/support/v7/widget/fh;)V
    .locals 4

    iget-object v0, p1, Landroid/support/v7/widget/fh;->a:Landroid/view/View;

    invoke-static {v0}, Landroid/support/v4/i/bu;->q(Landroid/view/View;)Landroid/support/v4/i/di;

    move-result-object v0

    iget-object v1, p0, Landroid/support/v7/widget/cg;->i:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/support/v4/i/di;->a(F)Landroid/support/v4/i/di;

    move-result-object v1

    invoke-virtual {p0}, Landroid/support/v7/widget/cg;->e()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Landroid/support/v4/i/di;->a(J)Landroid/support/v4/i/di;

    move-result-object v1

    new-instance v2, Landroid/support/v7/widget/cl;

    invoke-direct {v2, p0, p1, v0}, Landroid/support/v7/widget/cl;-><init>(Landroid/support/v7/widget/cg;Landroid/support/v7/widget/fh;Landroid/support/v4/i/di;)V

    invoke-virtual {v1, v2}, Landroid/support/v4/i/di;->a(Landroid/support/v4/i/dz;)Landroid/support/v4/i/di;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/i/di;->c()V

    return-void
.end method

.method private v(Landroid/support/v7/widget/fh;)V
    .locals 1

    iget-object v0, p1, Landroid/support/v7/widget/fh;->a:Landroid/view/View;

    invoke-static {v0}, Landroid/support/v4/a/a;->a(Landroid/view/View;)V

    invoke-virtual {p0, p1}, Landroid/support/v7/widget/cg;->c(Landroid/support/v7/widget/fh;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 13

    const-wide/16 v6, 0x0

    const/4 v0, 0x1

    const/4 v2, 0x0

    iget-object v1, p0, Landroid/support/v7/widget/cg;->b:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    move v1, v0

    :goto_0
    iget-object v3, p0, Landroid/support/v7/widget/cg;->d:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_2

    move v3, v0

    :goto_1
    iget-object v4, p0, Landroid/support/v7/widget/cg;->e:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_3

    move v4, v0

    :goto_2
    iget-object v5, p0, Landroid/support/v7/widget/cg;->c:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_4

    move v5, v0

    :goto_3
    if-nez v1, :cond_5

    if-nez v3, :cond_5

    if-nez v5, :cond_5

    if-nez v4, :cond_5

    :cond_0
    :goto_4
    return-void

    :cond_1
    move v1, v2

    goto :goto_0

    :cond_2
    move v3, v2

    goto :goto_1

    :cond_3
    move v4, v2

    goto :goto_2

    :cond_4
    move v5, v2

    goto :goto_3

    :cond_5
    iget-object v0, p0, Landroid/support/v7/widget/cg;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_5
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/fh;

    invoke-direct {p0, v0}, Landroid/support/v7/widget/cg;->t(Landroid/support/v7/widget/fh;)V

    goto :goto_5

    :cond_6
    iget-object v0, p0, Landroid/support/v7/widget/cg;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    if-eqz v3, :cond_7

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v8, p0, Landroid/support/v7/widget/cg;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v8, p0, Landroid/support/v7/widget/cg;->g:Ljava/util/ArrayList;

    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v8, p0, Landroid/support/v7/widget/cg;->d:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->clear()V

    new-instance v8, Landroid/support/v7/widget/ch;

    invoke-direct {v8, p0, v0}, Landroid/support/v7/widget/ch;-><init>(Landroid/support/v7/widget/cg;Ljava/util/ArrayList;)V

    if-eqz v1, :cond_a

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/cq;

    iget-object v0, v0, Landroid/support/v7/widget/cq;->a:Landroid/support/v7/widget/fh;

    iget-object v0, v0, Landroid/support/v7/widget/fh;->a:Landroid/view/View;

    invoke-virtual {p0}, Landroid/support/v7/widget/cg;->f()J

    move-result-wide v10

    invoke-static {v0, v8, v10, v11}, Landroid/support/v4/i/bu;->a(Landroid/view/View;Ljava/lang/Runnable;J)V

    :cond_7
    :goto_6
    if-eqz v4, :cond_8

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v8, p0, Landroid/support/v7/widget/cg;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v8, p0, Landroid/support/v7/widget/cg;->h:Ljava/util/ArrayList;

    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v8, p0, Landroid/support/v7/widget/cg;->e:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->clear()V

    new-instance v8, Landroid/support/v7/widget/ci;

    invoke-direct {v8, p0, v0}, Landroid/support/v7/widget/ci;-><init>(Landroid/support/v7/widget/cg;Ljava/util/ArrayList;)V

    if-eqz v1, :cond_b

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/cp;

    iget-object v0, v0, Landroid/support/v7/widget/cp;->a:Landroid/support/v7/widget/fh;

    iget-object v0, v0, Landroid/support/v7/widget/fh;->a:Landroid/view/View;

    invoke-virtual {p0}, Landroid/support/v7/widget/cg;->f()J

    move-result-wide v10

    invoke-static {v0, v8, v10, v11}, Landroid/support/v4/i/bu;->a(Landroid/view/View;Ljava/lang/Runnable;J)V

    :cond_8
    :goto_7
    if-eqz v5, :cond_0

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, p0, Landroid/support/v7/widget/cg;->c:Ljava/util/ArrayList;

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v0, p0, Landroid/support/v7/widget/cg;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Landroid/support/v7/widget/cg;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    new-instance v12, Landroid/support/v7/widget/cj;

    invoke-direct {v12, p0, v5}, Landroid/support/v7/widget/cj;-><init>(Landroid/support/v7/widget/cg;Ljava/util/ArrayList;)V

    if-nez v1, :cond_9

    if-nez v3, :cond_9

    if-eqz v4, :cond_f

    :cond_9
    if-eqz v1, :cond_c

    invoke-virtual {p0}, Landroid/support/v7/widget/cg;->f()J

    move-result-wide v0

    move-wide v10, v0

    :goto_8
    if-eqz v3, :cond_d

    invoke-virtual {p0}, Landroid/support/v7/widget/cg;->d()J

    move-result-wide v0

    move-wide v8, v0

    :goto_9
    if-eqz v4, :cond_e

    invoke-virtual {p0}, Landroid/support/v7/widget/cg;->g()J

    move-result-wide v0

    :goto_a
    invoke-static {v8, v9, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    add-long v6, v10, v0

    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/fh;

    iget-object v0, v0, Landroid/support/v7/widget/fh;->a:Landroid/view/View;

    invoke-static {v0, v12, v6, v7}, Landroid/support/v4/i/bu;->a(Landroid/view/View;Ljava/lang/Runnable;J)V

    goto/16 :goto_4

    :cond_a
    invoke-interface {v8}, Ljava/lang/Runnable;->run()V

    goto :goto_6

    :cond_b
    invoke-interface {v8}, Ljava/lang/Runnable;->run()V

    goto :goto_7

    :cond_c
    move-wide v10, v6

    goto :goto_8

    :cond_d
    move-wide v8, v6

    goto :goto_9

    :cond_e
    move-wide v0, v6

    goto :goto_a

    :cond_f
    invoke-interface {v12}, Ljava/lang/Runnable;->run()V

    goto/16 :goto_4
.end method

.method a(Ljava/util/List;)V
    .locals 2

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_0
    if-ltz v1, :cond_0

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/fh;

    iget-object v0, v0, Landroid/support/v7/widget/fh;->a:Landroid/view/View;

    invoke-static {v0}, Landroid/support/v4/i/bu;->q(Landroid/view/View;)Landroid/support/v4/i/di;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/i/di;->b()V

    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_0

    :cond_0
    return-void
.end method

.method public a(Landroid/support/v7/widget/fh;)Z
    .locals 1

    invoke-direct {p0, p1}, Landroid/support/v7/widget/cg;->v(Landroid/support/v7/widget/fh;)V

    iget-object v0, p0, Landroid/support/v7/widget/cg;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v0, 0x1

    return v0
.end method

.method public a(Landroid/support/v7/widget/fh;IIII)Z
    .locals 8

    iget-object v0, p1, Landroid/support/v7/widget/fh;->a:Landroid/view/View;

    int-to-float v1, p2

    iget-object v2, p1, Landroid/support/v7/widget/fh;->a:Landroid/view/View;

    invoke-static {v2}, Landroid/support/v4/i/bu;->m(Landroid/view/View;)F

    move-result v2

    add-float/2addr v1, v2

    float-to-int v2, v1

    int-to-float v1, p3

    iget-object v3, p1, Landroid/support/v7/widget/fh;->a:Landroid/view/View;

    invoke-static {v3}, Landroid/support/v4/i/bu;->n(Landroid/view/View;)F

    move-result v3

    add-float/2addr v1, v3

    float-to-int v3, v1

    invoke-direct {p0, p1}, Landroid/support/v7/widget/cg;->v(Landroid/support/v7/widget/fh;)V

    sub-int v1, p4, v2

    sub-int v4, p5, v3

    if-nez v1, :cond_0

    if-nez v4, :cond_0

    invoke-virtual {p0, p1}, Landroid/support/v7/widget/cg;->i(Landroid/support/v7/widget/fh;)V

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    if-eqz v1, :cond_1

    neg-int v1, v1

    int-to-float v1, v1

    invoke-static {v0, v1}, Landroid/support/v4/i/bu;->a(Landroid/view/View;F)V

    :cond_1
    if-eqz v4, :cond_2

    neg-int v1, v4

    int-to-float v1, v1

    invoke-static {v0, v1}, Landroid/support/v4/i/bu;->b(Landroid/view/View;F)V

    :cond_2
    iget-object v7, p0, Landroid/support/v7/widget/cg;->d:Ljava/util/ArrayList;

    new-instance v0, Landroid/support/v7/widget/cq;

    const/4 v6, 0x0

    move-object v1, p1

    move v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v6}, Landroid/support/v7/widget/cq;-><init>(Landroid/support/v7/widget/fh;IIIILandroid/support/v7/widget/ch;)V

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v0, 0x1

    goto :goto_0
.end method

.method public a(Landroid/support/v7/widget/fh;Landroid/support/v7/widget/fh;IIII)Z
    .locals 9

    if-ne p1, p2, :cond_0

    move-object v0, p0

    move-object v1, p1

    move v2, p3

    move v3, p4

    move v4, p5

    move v5, p6

    invoke-virtual/range {v0 .. v5}, Landroid/support/v7/widget/cg;->a(Landroid/support/v7/widget/fh;IIII)Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    iget-object v0, p1, Landroid/support/v7/widget/fh;->a:Landroid/view/View;

    invoke-static {v0}, Landroid/support/v4/i/bu;->m(Landroid/view/View;)F

    move-result v0

    iget-object v1, p1, Landroid/support/v7/widget/fh;->a:Landroid/view/View;

    invoke-static {v1}, Landroid/support/v4/i/bu;->n(Landroid/view/View;)F

    move-result v1

    iget-object v2, p1, Landroid/support/v7/widget/fh;->a:Landroid/view/View;

    invoke-static {v2}, Landroid/support/v4/i/bu;->f(Landroid/view/View;)F

    move-result v2

    invoke-direct {p0, p1}, Landroid/support/v7/widget/cg;->v(Landroid/support/v7/widget/fh;)V

    sub-int v3, p5, p3

    int-to-float v3, v3

    sub-float/2addr v3, v0

    float-to-int v3, v3

    sub-int v4, p6, p4

    int-to-float v4, v4

    sub-float/2addr v4, v1

    float-to-int v4, v4

    iget-object v5, p1, Landroid/support/v7/widget/fh;->a:Landroid/view/View;

    invoke-static {v5, v0}, Landroid/support/v4/i/bu;->a(Landroid/view/View;F)V

    iget-object v0, p1, Landroid/support/v7/widget/fh;->a:Landroid/view/View;

    invoke-static {v0, v1}, Landroid/support/v4/i/bu;->b(Landroid/view/View;F)V

    iget-object v0, p1, Landroid/support/v7/widget/fh;->a:Landroid/view/View;

    invoke-static {v0, v2}, Landroid/support/v4/i/bu;->c(Landroid/view/View;F)V

    if-eqz p2, :cond_1

    invoke-direct {p0, p2}, Landroid/support/v7/widget/cg;->v(Landroid/support/v7/widget/fh;)V

    iget-object v0, p2, Landroid/support/v7/widget/fh;->a:Landroid/view/View;

    neg-int v1, v3

    int-to-float v1, v1

    invoke-static {v0, v1}, Landroid/support/v4/i/bu;->a(Landroid/view/View;F)V

    iget-object v0, p2, Landroid/support/v7/widget/fh;->a:Landroid/view/View;

    neg-int v1, v4

    int-to-float v1, v1

    invoke-static {v0, v1}, Landroid/support/v4/i/bu;->b(Landroid/view/View;F)V

    iget-object v0, p2, Landroid/support/v7/widget/fh;->a:Landroid/view/View;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/support/v4/i/bu;->c(Landroid/view/View;F)V

    :cond_1
    iget-object v8, p0, Landroid/support/v7/widget/cg;->e:Ljava/util/ArrayList;

    new-instance v0, Landroid/support/v7/widget/cp;

    const/4 v7, 0x0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move v6, p6

    invoke-direct/range {v0 .. v7}, Landroid/support/v7/widget/cp;-><init>(Landroid/support/v7/widget/fh;Landroid/support/v7/widget/fh;IIIILandroid/support/v7/widget/ch;)V

    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v0, 0x1

    goto :goto_0
.end method

.method public a(Landroid/support/v7/widget/fh;Ljava/util/List;)Z
    .locals 1

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-super {p0, p1, p2}, Landroid/support/v7/widget/ga;->a(Landroid/support/v7/widget/fh;Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b()Z
    .locals 1

    iget-object v0, p0, Landroid/support/v7/widget/cg;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/cg;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/cg;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/cg;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/cg;->j:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/cg;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/cg;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/cg;->l:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/cg;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/cg;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/cg;->h:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b(Landroid/support/v7/widget/fh;)Z
    .locals 2

    invoke-direct {p0, p1}, Landroid/support/v7/widget/cg;->v(Landroid/support/v7/widget/fh;)V

    iget-object v0, p1, Landroid/support/v7/widget/fh;->a:Landroid/view/View;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/support/v4/i/bu;->c(Landroid/view/View;F)V

    iget-object v0, p0, Landroid/support/v7/widget/cg;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v0, 0x1

    return v0
.end method

.method public c()V
    .locals 7

    const/high16 v6, 0x3f800000    # 1.0f

    const/4 v5, 0x0

    iget-object v0, p0, Landroid/support/v7/widget/cg;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_0
    if-ltz v1, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/cg;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/cq;

    iget-object v2, v0, Landroid/support/v7/widget/cq;->a:Landroid/support/v7/widget/fh;

    iget-object v2, v2, Landroid/support/v7/widget/fh;->a:Landroid/view/View;

    invoke-static {v2, v5}, Landroid/support/v4/i/bu;->b(Landroid/view/View;F)V

    invoke-static {v2, v5}, Landroid/support/v4/i/bu;->a(Landroid/view/View;F)V

    iget-object v0, v0, Landroid/support/v7/widget/cq;->a:Landroid/support/v7/widget/fh;

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/cg;->i(Landroid/support/v7/widget/fh;)V

    iget-object v0, p0, Landroid/support/v7/widget/cg;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/cg;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_1
    if-ltz v1, :cond_1

    iget-object v0, p0, Landroid/support/v7/widget/cg;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/fh;

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/cg;->h(Landroid/support/v7/widget/fh;)V

    iget-object v0, p0, Landroid/support/v7/widget/cg;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_1

    :cond_1
    iget-object v0, p0, Landroid/support/v7/widget/cg;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_2
    if-ltz v1, :cond_2

    iget-object v0, p0, Landroid/support/v7/widget/cg;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/fh;

    iget-object v2, v0, Landroid/support/v7/widget/fh;->a:Landroid/view/View;

    invoke-static {v2, v6}, Landroid/support/v4/i/bu;->c(Landroid/view/View;F)V

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/cg;->j(Landroid/support/v7/widget/fh;)V

    iget-object v0, p0, Landroid/support/v7/widget/cg;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_2

    :cond_2
    iget-object v0, p0, Landroid/support/v7/widget/cg;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_3
    if-ltz v1, :cond_3

    iget-object v0, p0, Landroid/support/v7/widget/cg;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/cp;

    invoke-direct {p0, v0}, Landroid/support/v7/widget/cg;->b(Landroid/support/v7/widget/cp;)V

    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_3

    :cond_3
    iget-object v0, p0, Landroid/support/v7/widget/cg;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    invoke-virtual {p0}, Landroid/support/v7/widget/cg;->b()Z

    move-result v0

    if-nez v0, :cond_4

    :goto_4
    return-void

    :cond_4
    iget-object v0, p0, Landroid/support/v7/widget/cg;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v3, v0

    :goto_5
    if-ltz v3, :cond_7

    iget-object v0, p0, Landroid/support/v7/widget/cg;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    move v2, v1

    :goto_6
    if-ltz v2, :cond_6

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/support/v7/widget/cq;

    iget-object v4, v1, Landroid/support/v7/widget/cq;->a:Landroid/support/v7/widget/fh;

    iget-object v4, v4, Landroid/support/v7/widget/fh;->a:Landroid/view/View;

    invoke-static {v4, v5}, Landroid/support/v4/i/bu;->b(Landroid/view/View;F)V

    invoke-static {v4, v5}, Landroid/support/v4/i/bu;->a(Landroid/view/View;F)V

    iget-object v1, v1, Landroid/support/v7/widget/cq;->a:Landroid/support/v7/widget/fh;

    invoke-virtual {p0, v1}, Landroid/support/v7/widget/cg;->i(Landroid/support/v7/widget/fh;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v1, p0, Landroid/support/v7/widget/cg;->g:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_5
    add-int/lit8 v1, v2, -0x1

    move v2, v1

    goto :goto_6

    :cond_6
    add-int/lit8 v0, v3, -0x1

    move v3, v0

    goto :goto_5

    :cond_7
    iget-object v0, p0, Landroid/support/v7/widget/cg;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v3, v0

    :goto_7
    if-ltz v3, :cond_a

    iget-object v0, p0, Landroid/support/v7/widget/cg;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    move v2, v1

    :goto_8
    if-ltz v2, :cond_9

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/support/v7/widget/fh;

    iget-object v4, v1, Landroid/support/v7/widget/fh;->a:Landroid/view/View;

    invoke-static {v4, v6}, Landroid/support/v4/i/bu;->c(Landroid/view/View;F)V

    invoke-virtual {p0, v1}, Landroid/support/v7/widget/cg;->j(Landroid/support/v7/widget/fh;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_8

    iget-object v1, p0, Landroid/support/v7/widget/cg;->f:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_8
    add-int/lit8 v1, v2, -0x1

    move v2, v1

    goto :goto_8

    :cond_9
    add-int/lit8 v0, v3, -0x1

    move v3, v0

    goto :goto_7

    :cond_a
    iget-object v0, p0, Landroid/support/v7/widget/cg;->h:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v3, v0

    :goto_9
    if-ltz v3, :cond_d

    iget-object v0, p0, Landroid/support/v7/widget/cg;->h:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    move v2, v1

    :goto_a
    if-ltz v2, :cond_c

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/support/v7/widget/cp;

    invoke-direct {p0, v1}, Landroid/support/v7/widget/cg;->b(Landroid/support/v7/widget/cp;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_b

    iget-object v1, p0, Landroid/support/v7/widget/cg;->h:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_b
    add-int/lit8 v1, v2, -0x1

    move v2, v1

    goto :goto_a

    :cond_c
    add-int/lit8 v0, v3, -0x1

    move v3, v0

    goto :goto_9

    :cond_d
    iget-object v0, p0, Landroid/support/v7/widget/cg;->k:Ljava/util/ArrayList;

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/cg;->a(Ljava/util/List;)V

    iget-object v0, p0, Landroid/support/v7/widget/cg;->j:Ljava/util/ArrayList;

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/cg;->a(Ljava/util/List;)V

    iget-object v0, p0, Landroid/support/v7/widget/cg;->i:Ljava/util/ArrayList;

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/cg;->a(Ljava/util/List;)V

    iget-object v0, p0, Landroid/support/v7/widget/cg;->l:Ljava/util/ArrayList;

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/cg;->a(Ljava/util/List;)V

    invoke-virtual {p0}, Landroid/support/v7/widget/cg;->h()V

    goto/16 :goto_4
.end method

.method public c(Landroid/support/v7/widget/fh;)V
    .locals 7

    const/high16 v6, 0x3f800000    # 1.0f

    const/4 v5, 0x0

    iget-object v4, p1, Landroid/support/v7/widget/fh;->a:Landroid/view/View;

    invoke-static {v4}, Landroid/support/v4/i/bu;->q(Landroid/view/View;)Landroid/support/v4/i/di;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/i/di;->b()V

    iget-object v0, p0, Landroid/support/v7/widget/cg;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_0
    if-ltz v1, :cond_1

    iget-object v0, p0, Landroid/support/v7/widget/cg;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/cq;

    iget-object v0, v0, Landroid/support/v7/widget/cq;->a:Landroid/support/v7/widget/fh;

    if-ne v0, p1, :cond_0

    invoke-static {v4, v5}, Landroid/support/v4/i/bu;->b(Landroid/view/View;F)V

    invoke-static {v4, v5}, Landroid/support/v4/i/bu;->a(Landroid/view/View;F)V

    invoke-virtual {p0, p1}, Landroid/support/v7/widget/cg;->i(Landroid/support/v7/widget/fh;)V

    iget-object v0, p0, Landroid/support/v7/widget/cg;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    :cond_0
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Landroid/support/v7/widget/cg;->e:Ljava/util/ArrayList;

    invoke-direct {p0, v0, p1}, Landroid/support/v7/widget/cg;->a(Ljava/util/List;Landroid/support/v7/widget/fh;)V

    iget-object v0, p0, Landroid/support/v7/widget/cg;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {v4, v6}, Landroid/support/v4/i/bu;->c(Landroid/view/View;F)V

    invoke-virtual {p0, p1}, Landroid/support/v7/widget/cg;->h(Landroid/support/v7/widget/fh;)V

    :cond_2
    iget-object v0, p0, Landroid/support/v7/widget/cg;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {v4, v6}, Landroid/support/v4/i/bu;->c(Landroid/view/View;F)V

    invoke-virtual {p0, p1}, Landroid/support/v7/widget/cg;->j(Landroid/support/v7/widget/fh;)V

    :cond_3
    iget-object v0, p0, Landroid/support/v7/widget/cg;->h:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_1
    if-ltz v1, :cond_5

    iget-object v0, p0, Landroid/support/v7/widget/cg;->h:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-direct {p0, v0, p1}, Landroid/support/v7/widget/cg;->a(Ljava/util/List;Landroid/support/v7/widget/fh;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Landroid/support/v7/widget/cg;->h:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    :cond_4
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_1

    :cond_5
    iget-object v0, p0, Landroid/support/v7/widget/cg;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v3, v0

    :goto_2
    if-ltz v3, :cond_8

    iget-object v0, p0, Landroid/support/v7/widget/cg;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    move v2, v1

    :goto_3
    if-ltz v2, :cond_6

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/support/v7/widget/cq;

    iget-object v1, v1, Landroid/support/v7/widget/cq;->a:Landroid/support/v7/widget/fh;

    if-ne v1, p1, :cond_7

    invoke-static {v4, v5}, Landroid/support/v4/i/bu;->b(Landroid/view/View;F)V

    invoke-static {v4, v5}, Landroid/support/v4/i/bu;->a(Landroid/view/View;F)V

    invoke-virtual {p0, p1}, Landroid/support/v7/widget/cg;->i(Landroid/support/v7/widget/fh;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Landroid/support/v7/widget/cg;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    :cond_6
    add-int/lit8 v0, v3, -0x1

    move v3, v0

    goto :goto_2

    :cond_7
    add-int/lit8 v1, v2, -0x1

    move v2, v1

    goto :goto_3

    :cond_8
    iget-object v0, p0, Landroid/support/v7/widget/cg;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_4
    if-ltz v1, :cond_a

    iget-object v0, p0, Landroid/support/v7/widget/cg;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-static {v4, v6}, Landroid/support/v4/i/bu;->c(Landroid/view/View;F)V

    invoke-virtual {p0, p1}, Landroid/support/v7/widget/cg;->j(Landroid/support/v7/widget/fh;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_9

    iget-object v0, p0, Landroid/support/v7/widget/cg;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    :cond_9
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_4

    :cond_a
    iget-object v0, p0, Landroid/support/v7/widget/cg;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    :cond_b
    iget-object v0, p0, Landroid/support/v7/widget/cg;->i:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    :cond_c
    iget-object v0, p0, Landroid/support/v7/widget/cg;->l:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    :cond_d
    iget-object v0, p0, Landroid/support/v7/widget/cg;->j:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    :cond_e
    invoke-direct {p0}, Landroid/support/v7/widget/cg;->j()V

    return-void
.end method
