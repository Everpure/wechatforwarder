.class public Lcom/fkzhang/wechatforwarder/a/b;
.super Landroid/support/v7/widget/fh;

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public l:Landroid/widget/TextView;

.field public m:Landroid/widget/TextView;

.field public n:Landroid/widget/TextView;

.field public o:Landroid/widget/TextView;

.field public p:Landroid/support/v7/widget/CardView;

.field private q:Lcom/fkzhang/wechatforwarder/c/b;

.field private r:Lcom/fkzhang/wechatforwarder/c/c;


# direct methods
.method public constructor <init>(Landroid/view/View;Lcom/fkzhang/wechatforwarder/c/b;Lcom/fkzhang/wechatforwarder/c/c;)V
    .locals 1

    invoke-direct {p0, p1}, Landroid/support/v7/widget/fh;-><init>(Landroid/view/View;)V

    const v0, 0x7f0c006b

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/CardView;

    iput-object v0, p0, Lcom/fkzhang/wechatforwarder/a/b;->p:Landroid/support/v7/widget/CardView;

    const v0, 0x7f0c006f

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fkzhang/wechatforwarder/a/b;->o:Landroid/widget/TextView;

    const v0, 0x7f0c0071

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fkzhang/wechatforwarder/a/b;->n:Landroid/widget/TextView;

    const v0, 0x7f0c006d

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fkzhang/wechatforwarder/a/b;->m:Landroid/widget/TextView;

    const v0, 0x7f0c0073

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fkzhang/wechatforwarder/a/b;->l:Landroid/widget/TextView;

    iput-object p2, p0, Lcom/fkzhang/wechatforwarder/a/b;->q:Lcom/fkzhang/wechatforwarder/c/b;

    iput-object p3, p0, Lcom/fkzhang/wechatforwarder/a/b;->r:Lcom/fkzhang/wechatforwarder/c/c;

    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p1, p0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/a/b;->q:Lcom/fkzhang/wechatforwarder/c/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/a/b;->q:Lcom/fkzhang/wechatforwarder/c/b;

    invoke-virtual {p0}, Lcom/fkzhang/wechatforwarder/a/b;->e()I

    move-result v1

    invoke-interface {v0, p1, v1}, Lcom/fkzhang/wechatforwarder/c/b;->a(Landroid/view/View;I)V

    :cond_0
    return-void
.end method

.method public onLongClick(Landroid/view/View;)Z
    .locals 2

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/a/b;->r:Lcom/fkzhang/wechatforwarder/c/c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/a/b;->r:Lcom/fkzhang/wechatforwarder/c/c;

    invoke-virtual {p0}, Lcom/fkzhang/wechatforwarder/a/b;->e()I

    move-result v1

    invoke-interface {v0, p1, v1}, Lcom/fkzhang/wechatforwarder/c/c;->a(Landroid/view/View;I)V

    :cond_0
    const/4 v0, 0x1

    return v0
.end method
