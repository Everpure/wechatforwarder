.class public abstract Landroid/support/v7/widget/eg;
.super Ljava/lang/Object;


# instance fields
.field private final a:Landroid/support/v7/widget/eh;

.field private b:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/support/v7/widget/eh;

    invoke-direct {v0}, Landroid/support/v7/widget/eh;-><init>()V

    iput-object v0, p0, Landroid/support/v7/widget/eg;->a:Landroid/support/v7/widget/eh;

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v7/widget/eg;->b:Z

    return-void
.end method


# virtual methods
.method public abstract a()I
.end method

.method public a(I)I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public abstract a(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/fh;
.end method

.method public a(Landroid/support/v7/widget/RecyclerView;)V
    .locals 0

    return-void
.end method

.method public a(Landroid/support/v7/widget/ei;)V
    .locals 1

    iget-object v0, p0, Landroid/support/v7/widget/eg;->a:Landroid/support/v7/widget/eh;

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/eh;->registerObserver(Ljava/lang/Object;)V

    return-void
.end method

.method public a(Landroid/support/v7/widget/fh;)V
    .locals 0

    return-void
.end method

.method public abstract a(Landroid/support/v7/widget/fh;I)V
.end method

.method public a(Landroid/support/v7/widget/fh;ILjava/util/List;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroid/support/v7/widget/eg;->a(Landroid/support/v7/widget/fh;I)V

    return-void
.end method

.method public b(I)J
    .locals 2

    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public final b(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/fh;
    .locals 1

    const-string v0, "RV CreateView"

    invoke-static {v0}, Landroid/support/v4/f/h;->a(Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Landroid/support/v7/widget/eg;->a(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/fh;

    move-result-object v0

    iput p2, v0, Landroid/support/v7/widget/fh;->e:I

    invoke-static {}, Landroid/support/v4/f/h;->a()V

    return-object v0
.end method

.method public b(Landroid/support/v7/widget/RecyclerView;)V
    .locals 0

    return-void
.end method

.method public b(Landroid/support/v7/widget/ei;)V
    .locals 1

    iget-object v0, p0, Landroid/support/v7/widget/eg;->a:Landroid/support/v7/widget/eh;

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/eh;->unregisterObserver(Ljava/lang/Object;)V

    return-void
.end method

.method public final b(Landroid/support/v7/widget/fh;I)V
    .locals 2

    iput p2, p1, Landroid/support/v7/widget/fh;->b:I

    invoke-virtual {p0}, Landroid/support/v7/widget/eg;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p2}, Landroid/support/v7/widget/eg;->b(I)J

    move-result-wide v0

    iput-wide v0, p1, Landroid/support/v7/widget/fh;->d:J

    :cond_0
    const/4 v0, 0x1

    const/16 v1, 0x207

    invoke-virtual {p1, v0, v1}, Landroid/support/v7/widget/fh;->a(II)V

    const-string v0, "RV OnBindView"

    invoke-static {v0}, Landroid/support/v4/f/h;->a(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/support/v7/widget/fh;->u()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, p1, p2, v0}, Landroid/support/v7/widget/eg;->a(Landroid/support/v7/widget/fh;ILjava/util/List;)V

    invoke-virtual {p1}, Landroid/support/v7/widget/fh;->t()V

    invoke-static {}, Landroid/support/v4/f/h;->a()V

    return-void
.end method

.method public final b()Z
    .locals 1

    iget-boolean v0, p0, Landroid/support/v7/widget/eg;->b:Z

    return v0
.end method

.method public b(Landroid/support/v7/widget/fh;)Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final c()V
    .locals 1

    iget-object v0, p0, Landroid/support/v7/widget/eg;->a:Landroid/support/v7/widget/eh;

    invoke-virtual {v0}, Landroid/support/v7/widget/eh;->a()V

    return-void
.end method

.method public c(Landroid/support/v7/widget/fh;)V
    .locals 0

    return-void
.end method

.method public d(Landroid/support/v7/widget/fh;)V
    .locals 0

    return-void
.end method
