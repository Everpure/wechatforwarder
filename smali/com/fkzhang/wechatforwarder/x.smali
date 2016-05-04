.class Lcom/fkzhang/wechatforwarder/x;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/fkzhang/wechatforwarder/a/d;

.field final synthetic b:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;


# direct methods
.method constructor <init>(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;Lcom/fkzhang/wechatforwarder/a/d;)V
    .locals 0

    iput-object p1, p0, Lcom/fkzhang/wechatforwarder/x;->b:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    iput-object p2, p0, Lcom/fkzhang/wechatforwarder/x;->a:Lcom/fkzhang/wechatforwarder/a/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 6

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/x;->a:Lcom/fkzhang/wechatforwarder/a/d;

    invoke-virtual {v0}, Lcom/fkzhang/wechatforwarder/a/d;->c()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/x;->b:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-static {v0, v1}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->e(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/x;->b:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-static {v0, v1}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->f(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/x;->b:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-static {v0}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->j(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f060023

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    :goto_0
    return-void

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/x;->a:Lcom/fkzhang/wechatforwarder/a/d;

    invoke-virtual {v0}, Lcom/fkzhang/wechatforwarder/a/d;->b()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fkzhang/wechatforwarder/c/a;

    invoke-interface {v0}, Lcom/fkzhang/wechatforwarder/c/a;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ","

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v0}, Lcom/fkzhang/wechatforwarder/c/a;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, ","

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    const-string v0, ","

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->lastIndexOf(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;

    const-string v0, ","

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->lastIndexOf(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/x;->b:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->e(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/x;->b:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->f(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/x;->b:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-static {v0}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->j(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/x;->b:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-static {v1}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->i(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/fkzhang/wechatforwarder/e/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method
