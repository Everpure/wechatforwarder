.class Lcom/fkzhang/wechatforwarder/ac;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;


# direct methods
.method constructor <init>(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/fkzhang/wechatforwarder/ac;->a:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 12

    const/4 v10, 0x0

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/ac;->a:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-static {v0}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->a(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/ac;->a:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-static {v0}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->q(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/ac;->a:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-static {v0}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->e(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)Z

    move-result v0

    if-eqz v0, :cond_3

    move v0, v10

    :goto_1
    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/ac;->a:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-static {v1}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->e(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)Z

    move-result v1

    if-nez v1, :cond_5

    const/4 v1, -0x1

    if-ne v0, v1, :cond_5

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/ac;->a:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-static {v0}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->l(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/ac;->a:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-static {v0}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->a(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "@chatroom"

    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/ac;->a:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-static {v0}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->r(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)Ljava/util/HashMap;

    move-result-object v0

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/ac;->a:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-static {v1}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->a(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fkzhang/wechatforwarder/d/e;

    invoke-virtual {v0}, Lcom/fkzhang/wechatforwarder/d/e;->b()Ljava/lang/String;

    move-result-object v4

    :goto_2
    new-instance v0, Lcom/fkzhang/wechatforwarder/d/d;

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/ac;->a:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-virtual {v1}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->j()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/fkzhang/wechatforwarder/ac;->a:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-static {v2}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->a(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/fkzhang/wechatforwarder/ac;->a:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-static {v3}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->l(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)Ljava/lang/String;

    move-result-object v3

    iget-object v5, p0, Lcom/fkzhang/wechatforwarder/ac;->a:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-static {v5}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->i(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)Ljava/lang/String;

    move-result-object v5

    iget-object v6, p0, Lcom/fkzhang/wechatforwarder/ac;->a:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-static {v6}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->s(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)Ljava/util/HashMap;

    move-result-object v6

    iget-object v7, p0, Lcom/fkzhang/wechatforwarder/ac;->a:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-virtual {v7}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->j()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/fkzhang/wechatforwarder/d/a;

    invoke-virtual {v6}, Lcom/fkzhang/wechatforwarder/d/a;->b()Ljava/lang/String;

    move-result-object v6

    iget-object v7, p0, Lcom/fkzhang/wechatforwarder/ac;->a:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-static {v7}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->t(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)Ljava/lang/String;

    move-result-object v7

    iget-object v8, p0, Lcom/fkzhang/wechatforwarder/ac;->a:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-static {v8}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->h(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)Ljava/lang/String;

    move-result-object v8

    iget-object v11, p0, Lcom/fkzhang/wechatforwarder/ac;->a:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-static {v11}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->k(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)Landroid/widget/Switch;

    move-result-object v11

    invoke-virtual {v11}, Landroid/widget/Switch;->isChecked()Z

    move-result v11

    if-eqz v11, :cond_2

    const/4 v10, 0x1

    :cond_2
    invoke-direct/range {v0 .. v10}, Lcom/fkzhang/wechatforwarder/d/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/ac;->a:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-static {v1, v0}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->a(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;Lcom/fkzhang/wechatforwarder/d/d;)V

    goto/16 :goto_0

    :cond_3
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/ac;->a:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/ac;->a:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-static {v1}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->a(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->b(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;Ljava/lang/String;)I

    move-result v0

    goto/16 :goto_1

    :cond_4
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/ac;->a:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-static {v0}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->b(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)Ljava/util/HashMap;

    move-result-object v0

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/ac;->a:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-static {v1}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->a(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fkzhang/wechatforwarder/d/g;

    invoke-virtual {v0}, Lcom/fkzhang/wechatforwarder/d/g;->b()Ljava/lang/String;

    move-result-object v4

    goto :goto_2

    :cond_5
    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/ac;->a:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-static {v1}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->e(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)Z

    move-result v1

    if-nez v1, :cond_6

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/ac;->a:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-static {v1}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->l(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_6

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/ac;->a:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-static {v1, v0}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->a(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;I)V

    goto/16 :goto_0

    :cond_6
    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/ac;->a:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-static {v1, v0}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->c(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;I)V

    goto/16 :goto_0
.end method
