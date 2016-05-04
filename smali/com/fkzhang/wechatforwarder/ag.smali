.class Lcom/fkzhang/wechatforwarder/ag;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field final synthetic a:Landroid/widget/TextView;

.field final synthetic b:Lcom/fkzhang/wechatforwarder/a/c;

.field final synthetic c:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;


# direct methods
.method constructor <init>(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;Landroid/widget/TextView;Lcom/fkzhang/wechatforwarder/a/c;)V
    .locals 0

    iput-object p1, p0, Lcom/fkzhang/wechatforwarder/ag;->c:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    iput-object p2, p0, Lcom/fkzhang/wechatforwarder/ag;->a:Landroid/widget/TextView;

    iput-object p3, p0, Lcom/fkzhang/wechatforwarder/ag;->b:Lcom/fkzhang/wechatforwarder/a/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 5

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/ag;->a:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/ag;->c:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    const v2, 0x7f060063

    invoke-virtual {v0, v2}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v0, 0x1

    new-array v3, v0, [Ljava/lang/Object;

    const/4 v4, 0x0

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/ag;->b:Lcom/fkzhang/wechatforwarder/a/c;

    invoke-virtual {v0}, Lcom/fkzhang/wechatforwarder/a/c;->b()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fkzhang/wechatforwarder/c/a;

    invoke-interface {v0}, Lcom/fkzhang/wechatforwarder/c/a;->b()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v3, v4

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/fkzhang/wechatforwarder/e/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/ag;->c:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/ag;->b:Lcom/fkzhang/wechatforwarder/a/c;

    invoke-virtual {v0}, Lcom/fkzhang/wechatforwarder/a/c;->b()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fkzhang/wechatforwarder/c/a;

    invoke-interface {v0}, Lcom/fkzhang/wechatforwarder/c/a;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->a(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;Ljava/lang/String;)Ljava/lang/String;

    return-void
.end method
