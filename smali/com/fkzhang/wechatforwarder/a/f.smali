.class Lcom/fkzhang/wechatforwarder/a/f;
.super Landroid/widget/Filter;


# instance fields
.field final synthetic a:Lcom/fkzhang/wechatforwarder/a/d;


# direct methods
.method constructor <init>(Lcom/fkzhang/wechatforwarder/a/d;)V
    .locals 0

    iput-object p1, p0, Lcom/fkzhang/wechatforwarder/a/f;->a:Lcom/fkzhang/wechatforwarder/a/d;

    invoke-direct {p0}, Landroid/widget/Filter;-><init>()V

    return-void
.end method


# virtual methods
.method protected performFiltering(Ljava/lang/CharSequence;)Landroid/widget/Filter$FilterResults;
    .locals 6

    new-instance v1, Landroid/widget/Filter$FilterResults;

    invoke-direct {v1}, Landroid/widget/Filter$FilterResults;-><init>()V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/a/f;->a:Lcom/fkzhang/wechatforwarder/a/d;

    invoke-static {v0}, Lcom/fkzhang/wechatforwarder/a/d;->b(Lcom/fkzhang/wechatforwarder/a/d;)Ljava/util/ArrayList;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/a/f;->a:Lcom/fkzhang/wechatforwarder/a/d;

    iget-object v3, p0, Lcom/fkzhang/wechatforwarder/a/f;->a:Lcom/fkzhang/wechatforwarder/a/d;

    invoke-static {v3}, Lcom/fkzhang/wechatforwarder/a/d;->c(Lcom/fkzhang/wechatforwarder/a/d;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-static {v0, v3}, Lcom/fkzhang/wechatforwarder/a/d;->a(Lcom/fkzhang/wechatforwarder/a/d;Ljava/util/ArrayList;)Ljava/util/ArrayList;

    :cond_0
    if-eqz p1, :cond_3

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/a/f;->a:Lcom/fkzhang/wechatforwarder/a/d;

    invoke-static {v0}, Lcom/fkzhang/wechatforwarder/a/d;->b(Lcom/fkzhang/wechatforwarder/a/d;)Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/a/f;->a:Lcom/fkzhang/wechatforwarder/a/d;

    invoke-static {v0}, Lcom/fkzhang/wechatforwarder/a/d;->b(Lcom/fkzhang/wechatforwarder/a/d;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_2

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/a/f;->a:Lcom/fkzhang/wechatforwarder/a/d;

    invoke-static {v0}, Lcom/fkzhang/wechatforwarder/a/d;->b(Lcom/fkzhang/wechatforwarder/a/d;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fkzhang/wechatforwarder/c/a;

    invoke-interface {v0}, Lcom/fkzhang/wechatforwarder/c/a;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v4

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    iput-object v2, v1, Landroid/widget/Filter$FilterResults;->values:Ljava/lang/Object;

    :cond_3
    return-object v1
.end method

.method protected publishResults(Ljava/lang/CharSequence;Landroid/widget/Filter$FilterResults;)V
    .locals 3

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/a/f;->a:Lcom/fkzhang/wechatforwarder/a/d;

    iget-object v0, p2, Landroid/widget/Filter$FilterResults;->values:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-static {v1, v0}, Lcom/fkzhang/wechatforwarder/a/d;->b(Lcom/fkzhang/wechatforwarder/a/d;Ljava/util/ArrayList;)Ljava/util/ArrayList;

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/a/f;->a:Lcom/fkzhang/wechatforwarder/a/d;

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/a/f;->a:Lcom/fkzhang/wechatforwarder/a/d;

    invoke-static {v1}, Lcom/fkzhang/wechatforwarder/a/d;->c(Lcom/fkzhang/wechatforwarder/a/d;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    new-array v1, v1, [Z

    invoke-static {v0, v1}, Lcom/fkzhang/wechatforwarder/a/d;->a(Lcom/fkzhang/wechatforwarder/a/d;[Z)[Z

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/a/f;->a:Lcom/fkzhang/wechatforwarder/a/d;

    invoke-static {v0}, Lcom/fkzhang/wechatforwarder/a/d;->c(Lcom/fkzhang/wechatforwarder/a/d;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/a/f;->a:Lcom/fkzhang/wechatforwarder/a/d;

    invoke-static {v0}, Lcom/fkzhang/wechatforwarder/a/d;->d(Lcom/fkzhang/wechatforwarder/a/d;)Ljava/util/HashSet;

    move-result-object v2

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/a/f;->a:Lcom/fkzhang/wechatforwarder/a/d;

    invoke-static {v0}, Lcom/fkzhang/wechatforwarder/a/d;->c(Lcom/fkzhang/wechatforwarder/a/d;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fkzhang/wechatforwarder/c/a;

    invoke-interface {v0}, Lcom/fkzhang/wechatforwarder/c/a;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/a/f;->a:Lcom/fkzhang/wechatforwarder/a/d;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/fkzhang/wechatforwarder/a/d;->a(IZ)V

    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/a/f;->a:Lcom/fkzhang/wechatforwarder/a/d;

    invoke-virtual {v0}, Lcom/fkzhang/wechatforwarder/a/d;->notifyDataSetChanged()V

    return-void
.end method
