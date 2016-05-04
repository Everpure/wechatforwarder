.class public Landroid/support/v7/widget/ew;
.super Ljava/lang/Object;


# instance fields
.field private a:Landroid/util/SparseArray;

.field private b:Landroid/util/SparseIntArray;

.field private c:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Landroid/support/v7/widget/ew;->a:Landroid/util/SparseArray;

    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    iput-object v0, p0, Landroid/support/v7/widget/ew;->b:Landroid/util/SparseIntArray;

    const/4 v0, 0x0

    iput v0, p0, Landroid/support/v7/widget/ew;->c:I

    return-void
.end method

.method private b(I)Ljava/util/ArrayList;
    .locals 3

    iget-object v0, p0, Landroid/support/v7/widget/ew;->a:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Landroid/support/v7/widget/ew;->a:Landroid/util/SparseArray;

    invoke-virtual {v1, p1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    iget-object v1, p0, Landroid/support/v7/widget/ew;->b:Landroid/util/SparseIntArray;

    invoke-virtual {v1, p1}, Landroid/util/SparseIntArray;->indexOfKey(I)I

    move-result v1

    if-gez v1, :cond_0

    iget-object v1, p0, Landroid/support/v7/widget/ew;->b:Landroid/util/SparseIntArray;

    const/4 v2, 0x5

    invoke-virtual {v1, p1, v2}, Landroid/util/SparseIntArray;->put(II)V

    :cond_0
    return-object v0
.end method


# virtual methods
.method public a(I)Landroid/support/v7/widget/fh;
    .locals 3

    iget-object v0, p0, Landroid/support/v7/widget/ew;->a:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v2, v1, -0x1

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/support/v7/widget/fh;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    :goto_0
    return-object v1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0
.end method

.method public a()V
    .locals 1

    iget-object v0, p0, Landroid/support/v7/widget/ew;->a:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    return-void
.end method

.method a(Landroid/support/v7/widget/eg;)V
    .locals 1

    iget v0, p0, Landroid/support/v7/widget/ew;->c:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Landroid/support/v7/widget/ew;->c:I

    return-void
.end method

.method a(Landroid/support/v7/widget/eg;Landroid/support/v7/widget/eg;Z)V
    .locals 1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroid/support/v7/widget/ew;->b()V

    :cond_0
    if-nez p3, :cond_1

    iget v0, p0, Landroid/support/v7/widget/ew;->c:I

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroid/support/v7/widget/ew;->a()V

    :cond_1
    if-eqz p2, :cond_2

    invoke-virtual {p0, p2}, Landroid/support/v7/widget/ew;->a(Landroid/support/v7/widget/eg;)V

    :cond_2
    return-void
.end method

.method public a(Landroid/support/v7/widget/fh;)V
    .locals 3

    invoke-virtual {p1}, Landroid/support/v7/widget/fh;->h()I

    move-result v0

    invoke-direct {p0, v0}, Landroid/support/v7/widget/ew;->b(I)Ljava/util/ArrayList;

    move-result-object v1

    iget-object v2, p0, Landroid/support/v7/widget/ew;->b:Landroid/util/SparseIntArray;

    invoke-virtual {v2, v0}, Landroid/util/SparseIntArray;->get(I)I

    move-result v0

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-gt v0, v2, :cond_0

    :goto_0
    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/support/v7/widget/fh;->v()V

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method b()V
    .locals 1

    iget v0, p0, Landroid/support/v7/widget/ew;->c:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Landroid/support/v7/widget/ew;->c:I

    return-void
.end method
