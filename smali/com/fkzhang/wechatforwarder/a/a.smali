.class public Lcom/fkzhang/wechatforwarder/a/a;
.super Landroid/support/v7/widget/eg;


# instance fields
.field private final a:Landroid/app/Activity;

.field private b:Lcom/fkzhang/wechatforwarder/c/b;

.field private c:Lcom/fkzhang/wechatforwarder/c/c;

.field private d:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Ljava/util/ArrayList;)V
    .locals 0

    invoke-direct {p0}, Landroid/support/v7/widget/eg;-><init>()V

    iput-object p2, p0, Lcom/fkzhang/wechatforwarder/a/a;->d:Ljava/util/ArrayList;

    iput-object p1, p0, Lcom/fkzhang/wechatforwarder/a/a;->a:Landroid/app/Activity;

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/a/a;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public synthetic a(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/fh;
    .locals 1

    invoke-virtual {p0, p1, p2}, Lcom/fkzhang/wechatforwarder/a/a;->c(Landroid/view/ViewGroup;I)Lcom/fkzhang/wechatforwarder/a/b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a(Landroid/support/v7/widget/fh;I)V
    .locals 0

    check-cast p1, Lcom/fkzhang/wechatforwarder/a/b;

    invoke-virtual {p0, p1, p2}, Lcom/fkzhang/wechatforwarder/a/a;->a(Lcom/fkzhang/wechatforwarder/a/b;I)V

    return-void
.end method

.method public a(Lcom/fkzhang/wechatforwarder/a/b;I)V
    .locals 6

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/a/a;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fkzhang/wechatforwarder/d/d;

    iget-object v1, p1, Lcom/fkzhang/wechatforwarder/a/b;->m:Landroid/widget/TextView;

    invoke-virtual {v0}, Lcom/fkzhang/wechatforwarder/d/d;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v0}, Lcom/fkzhang/wechatforwarder/d/d;->h()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/fkzhang/wechatforwarder/d/d;->c()Ljava/lang/String;

    move-result-object v1

    :goto_0
    iget-object v2, p1, Lcom/fkzhang/wechatforwarder/a/b;->o:Landroid/widget/TextView;

    invoke-static {v1}, Lcom/fkzhang/wechatforwarder/e/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p1, Lcom/fkzhang/wechatforwarder/a/b;->n:Landroid/widget/TextView;

    invoke-virtual {v0}, Lcom/fkzhang/wechatforwarder/d/d;->d()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/fkzhang/wechatforwarder/e/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v0}, Lcom/fkzhang/wechatforwarder/d/d;->f()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    iget-object v1, p1, Lcom/fkzhang/wechatforwarder/a/b;->p:Landroid/support/v7/widget/CardView;

    const v2, -0x1f070801

    invoke-virtual {v1, v2}, Landroid/support/v7/widget/CardView;->setCardBackgroundColor(I)V

    :cond_0
    invoke-virtual {v0}, Lcom/fkzhang/wechatforwarder/d/d;->i()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_2

    :goto_1
    return-void

    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Lcom/fkzhang/wechatforwarder/d/d;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "|"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Lcom/fkzhang/wechatforwarder/d/d;->h()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_2
    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    array-length v3, v1

    const/4 v0, 0x0

    :goto_2
    if-ge v0, v3, :cond_3

    aget-object v4, v1, v0

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    packed-switch v4, :pswitch_data_0

    :goto_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :pswitch_0
    iget-object v4, p0, Lcom/fkzhang/wechatforwarder/a/a;->a:Landroid/app/Activity;

    const v5, 0x7f060073

    invoke-virtual {v4, v5}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ","

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :pswitch_1
    iget-object v4, p0, Lcom/fkzhang/wechatforwarder/a/a;->a:Landroid/app/Activity;

    const v5, 0x7f060049

    invoke-virtual {v4, v5}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ","

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :pswitch_2
    iget-object v4, p0, Lcom/fkzhang/wechatforwarder/a/a;->a:Landroid/app/Activity;

    const v5, 0x7f060083

    invoke-virtual {v4, v5}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ","

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :pswitch_3
    iget-object v4, p0, Lcom/fkzhang/wechatforwarder/a/a;->a:Landroid/app/Activity;

    const v5, 0x7f060081

    invoke-virtual {v4, v5}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ","

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :pswitch_4
    iget-object v4, p0, Lcom/fkzhang/wechatforwarder/a/a;->a:Landroid/app/Activity;

    const v5, 0x7f06001b

    invoke-virtual {v4, v5}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ","

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :pswitch_5
    iget-object v4, p0, Lcom/fkzhang/wechatforwarder/a/a;->a:Landroid/app/Activity;

    const v5, 0x7f060045

    invoke-virtual {v4, v5}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ","

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :cond_3
    iget-object v0, p1, Lcom/fkzhang/wechatforwarder/a/b;->l:Landroid/widget/TextView;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method public a(Lcom/fkzhang/wechatforwarder/c/b;)V
    .locals 0

    iput-object p1, p0, Lcom/fkzhang/wechatforwarder/a/a;->b:Lcom/fkzhang/wechatforwarder/c/b;

    return-void
.end method

.method public a(Lcom/fkzhang/wechatforwarder/c/c;)V
    .locals 0

    iput-object p1, p0, Lcom/fkzhang/wechatforwarder/a/a;->c:Lcom/fkzhang/wechatforwarder/c/c;

    return-void
.end method

.method public c(Landroid/view/ViewGroup;I)Lcom/fkzhang/wechatforwarder/a/b;
    .locals 4

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f04001d

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/fkzhang/wechatforwarder/a/b;

    iget-object v2, p0, Lcom/fkzhang/wechatforwarder/a/a;->b:Lcom/fkzhang/wechatforwarder/c/b;

    iget-object v3, p0, Lcom/fkzhang/wechatforwarder/a/a;->c:Lcom/fkzhang/wechatforwarder/c/c;

    invoke-direct {v1, v0, v2, v3}, Lcom/fkzhang/wechatforwarder/a/b;-><init>(Landroid/view/View;Lcom/fkzhang/wechatforwarder/c/b;Lcom/fkzhang/wechatforwarder/c/c;)V

    return-object v1
.end method
