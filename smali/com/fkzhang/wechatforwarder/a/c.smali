.class public Lcom/fkzhang/wechatforwarder/a/c;
.super Landroid/widget/BaseAdapter;


# instance fields
.field private a:Ljava/util/ArrayList;

.field private b:Landroid/app/Activity;

.field private c:Landroid/view/LayoutInflater;

.field private d:Z


# direct methods
.method public constructor <init>(Landroid/app/Activity;Ljava/util/ArrayList;)V
    .locals 1

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    iput-object p2, p0, Lcom/fkzhang/wechatforwarder/a/c;->a:Ljava/util/ArrayList;

    iput-object p1, p0, Lcom/fkzhang/wechatforwarder/a/c;->b:Landroid/app/Activity;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/fkzhang/wechatforwarder/a/c;->d:Z

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/fkzhang/wechatforwarder/a/c;->d:Z

    return-void
.end method

.method public a(Ljava/util/ArrayList;)V
    .locals 0

    iput-object p1, p0, Lcom/fkzhang/wechatforwarder/a/c;->a:Ljava/util/ArrayList;

    invoke-virtual {p0}, Lcom/fkzhang/wechatforwarder/a/c;->notifyDataSetChanged()V

    return-void
.end method

.method public b()Ljava/util/ArrayList;
    .locals 1

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/a/c;->a:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getCount()I
    .locals 1

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/a/c;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/a/c;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/a/c;->c:Landroid/view/LayoutInflater;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/a/c;->b:Landroid/app/Activity;

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    iput-object v0, p0, Lcom/fkzhang/wechatforwarder/a/c;->c:Landroid/view/LayoutInflater;

    :cond_0
    if-nez p2, :cond_1

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/a/c;->c:Landroid/view/LayoutInflater;

    const v1, 0x7f040036

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    :cond_1
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/a/c;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fkzhang/wechatforwarder/c/a;

    const v1, 0x7f0c00bc

    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    invoke-interface {v0}, Lcom/fkzhang/wechatforwarder/c/a;->b()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Lcom/fkzhang/wechatforwarder/c/a;->a()Ljava/lang/String;

    move-result-object v2

    :cond_2
    invoke-static {v2}, Lcom/fkzhang/wechatforwarder/e/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-boolean v2, p0, Lcom/fkzhang/wechatforwarder/a/c;->d:Z

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/fkzhang/wechatforwarder/a/c;->b:Landroid/app/Activity;

    invoke-interface {v0}, Lcom/fkzhang/wechatforwarder/c/a;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0, v1}, Lcom/fkzhang/wechatforwarder/e/c;->a(Landroid/content/Context;Ljava/lang/String;Landroid/widget/TextView;)V

    :cond_3
    return-object p2
.end method
