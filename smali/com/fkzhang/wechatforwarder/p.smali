.class Lcom/fkzhang/wechatforwarder/p;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;


# direct methods
.method constructor <init>(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/fkzhang/wechatforwarder/p;->a:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/p;->a:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-static {v0}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->b(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)Ljava/util/HashMap;

    move-result-object v0

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/p;->a:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-static {v1}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->l(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fkzhang/wechatforwarder/d/g;

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/p;->a:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-virtual {v0}, Lcom/fkzhang/wechatforwarder/d/g;->a()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->e(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;Ljava/lang/String;)Ljava/lang/String;

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/p;->a:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-virtual {v0}, Lcom/fkzhang/wechatforwarder/d/g;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->f(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/p;->a:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-static {v0}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->j(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/p;->a:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-static {v1}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->i(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/fkzhang/wechatforwarder/e/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
