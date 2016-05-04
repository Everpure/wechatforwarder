.class public Lcom/fkzhang/wechatforwarder/a/d;
.super Landroid/widget/BaseAdapter;

# interfaces
.implements Landroid/widget/Filterable;


# instance fields
.field private a:Ljava/util/HashSet;

.field private b:Z

.field private c:Ljava/util/ArrayList;

.field private d:Landroid/view/LayoutInflater;

.field private e:Landroid/app/Activity;

.field private f:Lcom/fkzhang/wechatforwarder/a/g;

.field private g:[Z

.field private h:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Ljava/util/ArrayList;)V
    .locals 1

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    iput-object p2, p0, Lcom/fkzhang/wechatforwarder/a/d;->c:Ljava/util/ArrayList;

    iput-object p1, p0, Lcom/fkzhang/wechatforwarder/a/d;->e:Landroid/app/Activity;

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/a/d;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v0, v0, [Z

    iput-object v0, p0, Lcom/fkzhang/wechatforwarder/a/d;->g:[Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/fkzhang/wechatforwarder/a/d;->b:Z

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/fkzhang/wechatforwarder/a/d;->a:Ljava/util/HashSet;

    return-void
.end method

.method static synthetic a(Lcom/fkzhang/wechatforwarder/a/d;)Lcom/fkzhang/wechatforwarder/a/g;
    .locals 1

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/a/d;->f:Lcom/fkzhang/wechatforwarder/a/g;

    return-object v0
.end method

.method static synthetic a(Lcom/fkzhang/wechatforwarder/a/d;Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 0

    iput-object p1, p0, Lcom/fkzhang/wechatforwarder/a/d;->h:Ljava/util/ArrayList;

    return-object p1
.end method

.method static synthetic a(Lcom/fkzhang/wechatforwarder/a/d;[Z)[Z
    .locals 0

    iput-object p1, p0, Lcom/fkzhang/wechatforwarder/a/d;->g:[Z

    return-object p1
.end method

.method static synthetic b(Lcom/fkzhang/wechatforwarder/a/d;)Ljava/util/ArrayList;
    .locals 1

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/a/d;->h:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic b(Lcom/fkzhang/wechatforwarder/a/d;Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 0

    iput-object p1, p0, Lcom/fkzhang/wechatforwarder/a/d;->c:Ljava/util/ArrayList;

    return-object p1
.end method

.method static synthetic c(Lcom/fkzhang/wechatforwarder/a/d;)Ljava/util/ArrayList;
    .locals 1

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/a/d;->c:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic d(Lcom/fkzhang/wechatforwarder/a/d;)Ljava/util/HashSet;
    .locals 1

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/a/d;->a:Ljava/util/HashSet;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/fkzhang/wechatforwarder/a/d;->b:Z

    return-void
.end method

.method public a(IZ)V
    .locals 2

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/a/d;->g:[Z

    aput-boolean p2, v0, p1

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/a/d;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fkzhang/wechatforwarder/c/a;

    if-eqz p2, :cond_0

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/a/d;->a:Ljava/util/HashSet;

    invoke-interface {v0}, Lcom/fkzhang/wechatforwarder/c/a;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :goto_0
    return-void

    :cond_0
    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/a/d;->a:Ljava/util/HashSet;

    invoke-interface {v0}, Lcom/fkzhang/wechatforwarder/c/a;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method public a(Ljava/util/ArrayList;)V
    .locals 4

    const/4 v2, 0x0

    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/a/d;->g:[Z

    if-eqz v0, :cond_1

    move v1, v2

    :goto_0
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/a/d;->g:[Z

    array-length v0, v0

    if-ge v1, v0, :cond_1

    invoke-virtual {p0, v1}, Lcom/fkzhang/wechatforwarder/a/d;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/a/d;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fkzhang/wechatforwarder/c/a;

    invoke-interface {v0}, Lcom/fkzhang/wechatforwarder/c/a;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/fkzhang/wechatforwarder/a/d;->a:Ljava/util/HashSet;

    iput-object p1, p0, Lcom/fkzhang/wechatforwarder/a/d;->c:Ljava/util/ArrayList;

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/a/d;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v0, v0, [Z

    iput-object v0, p0, Lcom/fkzhang/wechatforwarder/a/d;->g:[Z

    :goto_1
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/a/d;->g:[Z

    array-length v0, v0

    if-ge v2, v0, :cond_3

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/a/d;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fkzhang/wechatforwarder/c/a;

    invoke-interface {v0}, Lcom/fkzhang/wechatforwarder/c/a;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    invoke-virtual {p0, v2, v0}, Lcom/fkzhang/wechatforwarder/a/d;->a(IZ)V

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, Lcom/fkzhang/wechatforwarder/a/d;->notifyDataSetChanged()V

    return-void
.end method

.method public a(I)Z
    .locals 1

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/a/d;->g:[Z

    aget-boolean v0, v0, p1

    return v0
.end method

.method public b()Ljava/util/ArrayList;
    .locals 3

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v0, 0x0

    :goto_0
    iget-object v2, p0, Lcom/fkzhang/wechatforwarder/a/d;->g:[Z

    array-length v2, v2

    if-ge v0, v2, :cond_1

    invoke-virtual {p0, v0}, Lcom/fkzhang/wechatforwarder/a/d;->a(I)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/fkzhang/wechatforwarder/a/d;->c:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method public b(I)V
    .locals 1

    invoke-virtual {p0, p1}, Lcom/fkzhang/wechatforwarder/a/d;->a(I)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {p0, p1, v0}, Lcom/fkzhang/wechatforwarder/a/d;->a(IZ)V

    invoke-virtual {p0}, Lcom/fkzhang/wechatforwarder/a/d;->notifyDataSetChanged()V

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public c()Z
    .locals 5

    const/4 v0, 0x0

    iget-object v2, p0, Lcom/fkzhang/wechatforwarder/a/d;->g:[Z

    array-length v3, v2

    move v1, v0

    :goto_0
    if-ge v1, v3, :cond_0

    aget-boolean v4, v2, v1

    if-eqz v4, :cond_1

    const/4 v0, 0x1

    :cond_0
    return v0

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0
.end method

.method public getCount()I
    .locals 1

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/a/d;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public getFilter()Landroid/widget/Filter;
    .locals 1

    new-instance v0, Lcom/fkzhang/wechatforwarder/a/f;

    invoke-direct {v0, p0}, Lcom/fkzhang/wechatforwarder/a/f;-><init>(Lcom/fkzhang/wechatforwarder/a/d;)V

    return-object v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/a/d;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/a/d;->d:Landroid/view/LayoutInflater;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/a/d;->e:Landroid/app/Activity;

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    iput-object v0, p0, Lcom/fkzhang/wechatforwarder/a/d;->d:Landroid/view/LayoutInflater;

    :cond_0
    if-nez p2, :cond_3

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/a/d;->d:Landroid/view/LayoutInflater;

    const v1, 0x7f040037

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    new-instance v1, Lcom/fkzhang/wechatforwarder/a/h;

    invoke-direct {v1, v2}, Lcom/fkzhang/wechatforwarder/a/h;-><init>(Lcom/fkzhang/wechatforwarder/a/e;)V

    const v0, 0x7f0c00bc

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lcom/fkzhang/wechatforwarder/a/h;->a:Landroid/widget/TextView;

    const v0, 0x7f0c0052

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, v1, Lcom/fkzhang/wechatforwarder/a/h;->b:Landroid/widget/CheckBox;

    invoke-virtual {p2, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    :goto_0
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/a/d;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fkzhang/wechatforwarder/c/a;

    invoke-interface {v0}, Lcom/fkzhang/wechatforwarder/c/a;->b()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Lcom/fkzhang/wechatforwarder/c/a;->a()Ljava/lang/String;

    move-result-object v2

    :cond_1
    iget-object v3, v1, Lcom/fkzhang/wechatforwarder/a/h;->a:Landroid/widget/TextView;

    invoke-static {v2}, Lcom/fkzhang/wechatforwarder/e/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-boolean v2, p0, Lcom/fkzhang/wechatforwarder/a/d;->b:Z

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/fkzhang/wechatforwarder/a/d;->e:Landroid/app/Activity;

    invoke-interface {v0}, Lcom/fkzhang/wechatforwarder/c/a;->a()Ljava/lang/String;

    move-result-object v0

    iget-object v3, v1, Lcom/fkzhang/wechatforwarder/a/h;->a:Landroid/widget/TextView;

    invoke-static {v2, v0, v3}, Lcom/fkzhang/wechatforwarder/e/c;->a(Landroid/content/Context;Ljava/lang/String;Landroid/widget/TextView;)V

    :cond_2
    iget-object v0, v1, Lcom/fkzhang/wechatforwarder/a/h;->b:Landroid/widget/CheckBox;

    invoke-virtual {p0, p1}, Lcom/fkzhang/wechatforwarder/a/d;->a(I)Z

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/CheckBox;->setChecked(Z)V

    iget-object v0, v1, Lcom/fkzhang/wechatforwarder/a/h;->b:Landroid/widget/CheckBox;

    new-instance v1, Lcom/fkzhang/wechatforwarder/a/e;

    invoke-direct {v1, p0, p1}, Lcom/fkzhang/wechatforwarder/a/e;-><init>(Lcom/fkzhang/wechatforwarder/a/d;I)V

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-object p2

    :cond_3
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fkzhang/wechatforwarder/a/h;

    move-object v1, v0

    goto :goto_0
.end method
