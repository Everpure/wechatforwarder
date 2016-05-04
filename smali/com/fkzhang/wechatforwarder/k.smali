.class Lcom/fkzhang/wechatforwarder/k;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;


# direct methods
.method constructor <init>(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/fkzhang/wechatforwarder/k;->a:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 8

    const/4 v7, 0x0

    const/4 v2, 0x1

    const v6, 0x7f060023

    const/16 v5, 0x8

    const/4 v3, 0x0

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/k;->a:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-static {v0}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->b(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)Ljava/util/HashMap;

    move-result-object v0

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/k;->a:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-static {v1}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->a(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fkzhang/wechatforwarder/d/g;

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/k;->a:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-static {v1}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->c(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v0}, Lcom/fkzhang/wechatforwarder/d/g;->b()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/fkzhang/wechatforwarder/e/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/k;->a:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    iget-object v4, p0, Lcom/fkzhang/wechatforwarder/k;->a:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-static {v4}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->a(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->b(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;Ljava/lang/String;)I

    move-result v1

    const/4 v4, -0x1

    if-eq v1, v4, :cond_4

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/k;->a:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-static {v0}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->d(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fkzhang/wechatforwarder/d/d;

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/k;->a:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-static {v1}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->e(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/k;->a:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-static {v1}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->a(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)Ljava/lang/String;

    move-result-object v1

    const-string v4, "@chatroom"

    invoke-virtual {v1, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/k;->a:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-virtual {v0}, Lcom/fkzhang/wechatforwarder/d/d;->g()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->c(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;Ljava/lang/String;)Ljava/lang/String;

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/k;->a:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-virtual {v0}, Lcom/fkzhang/wechatforwarder/d/d;->h()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->d(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;Ljava/lang/String;)Ljava/lang/String;

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/k;->a:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-static {v1}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->f(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/k;->a:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-static {v1}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->g(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/k;->a:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-static {v1}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->f(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)Landroid/widget/TextView;

    move-result-object v4

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/k;->a:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-static {v1}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->h(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/k;->a:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-virtual {v1, v6}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_1
    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/k;->a:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-virtual {v0}, Lcom/fkzhang/wechatforwarder/d/d;->a()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->e(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;Ljava/lang/String;)Ljava/lang/String;

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/k;->a:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-virtual {v0}, Lcom/fkzhang/wechatforwarder/d/d;->d()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->f(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;Ljava/lang/String;)Ljava/lang/String;

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/k;->a:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-static {v1}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->i(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/k;->a:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-static {v1}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->j(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)Landroid/widget/TextView;

    move-result-object v1

    iget-object v4, p0, Lcom/fkzhang/wechatforwarder/k;->a:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-static {v4}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->i(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/fkzhang/wechatforwarder/e/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_2
    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/k;->a:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-virtual {v0}, Lcom/fkzhang/wechatforwarder/d/d;->i()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->g(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/k;->a:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-static {v1}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->k(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)Landroid/widget/Switch;

    move-result-object v1

    invoke-virtual {v0}, Lcom/fkzhang/wechatforwarder/d/d;->f()I

    move-result v0

    if-ne v0, v2, :cond_3

    move v0, v2

    :goto_3
    invoke-virtual {v1, v0}, Landroid/widget/Switch;->setChecked(Z)V

    :goto_4
    return-void

    :cond_0
    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/k;->a:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-static {v1}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->h(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/k;->a:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-static {v1}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->f(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/k;->a:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-static {v1}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->g(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/k;->a:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-static {v1}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->j(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setText(I)V

    goto :goto_2

    :cond_3
    move v0, v3

    goto :goto_3

    :cond_4
    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/k;->a:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-static {v1}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->j(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setText(I)V

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/k;->a:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-static {v1, v7}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->e(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;Ljava/lang/String;)Ljava/lang/String;

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/k;->a:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-static {v1, v7}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->f(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;Ljava/lang/String;)Ljava/lang/String;

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/k;->a:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-static {v1}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->e(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)Z

    move-result v1

    if-nez v1, :cond_5

    invoke-virtual {v0}, Lcom/fkzhang/wechatforwarder/d/g;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "@chatroom"

    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/k;->a:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-static {v0}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->f(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/k;->a:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-static {v0}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->g(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/k;->a:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-static {v0}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->f(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(I)V

    goto :goto_4

    :cond_5
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/k;->a:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-static {v0}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->f(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/k;->a:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-static {v0}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->g(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_4
.end method
