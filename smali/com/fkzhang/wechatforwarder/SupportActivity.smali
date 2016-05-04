.class public Lcom/fkzhang/wechatforwarder/SupportActivity;
.super Landroid/support/v7/a/u;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/support/v7/a/u;-><init>()V

    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 5

    invoke-super {p0, p1}, Landroid/support/v7/a/u;->onCreate(Landroid/os/Bundle;)V

    const v0, 0x7f04001c

    invoke-virtual {p0, v0}, Lcom/fkzhang/wechatforwarder/SupportActivity;->setContentView(I)V

    const v0, 0x7f0c0086

    invoke-virtual {p0, v0}, Lcom/fkzhang/wechatforwarder/SupportActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f06006f

    invoke-virtual {p0, v1}, Lcom/fkzhang/wechatforwarder/SupportActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v0, 0x7f0c00a6

    invoke-virtual {p0, v0}, Lcom/fkzhang/wechatforwarder/SupportActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f060024

    invoke-virtual {p0, v1}, Lcom/fkzhang/wechatforwarder/SupportActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    new-instance v1, Lcom/fkzhang/wechatforwarder/bi;

    invoke-direct {v1, p0, p0}, Lcom/fkzhang/wechatforwarder/bi;-><init>(Lcom/fkzhang/wechatforwarder/SupportActivity;Landroid/app/Activity;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f0c00a7

    invoke-virtual {p0, v0}, Lcom/fkzhang/wechatforwarder/SupportActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const v2, 0x7f06008d

    invoke-virtual {p0, v2}, Lcom/fkzhang/wechatforwarder/SupportActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v2, 0x7f060018

    invoke-virtual {p0, v2}, Lcom/fkzhang/wechatforwarder/SupportActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v2, 0x7f060092

    invoke-virtual {p0, v2}, Lcom/fkzhang/wechatforwarder/SupportActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v2, Landroid/widget/ArrayAdapter;

    const v3, 0x1090003

    const v4, 0x1020014

    invoke-direct {v2, p0, v3, v4, v1}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;IILjava/util/List;)V

    invoke-virtual {v0, v2}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    new-instance v1, Lcom/fkzhang/wechatforwarder/bj;

    invoke-direct {v1, p0, p0}, Lcom/fkzhang/wechatforwarder/bj;-><init>(Lcom/fkzhang/wechatforwarder/SupportActivity;Landroid/app/Activity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemLongClickListener(Landroid/widget/AdapterView$OnItemLongClickListener;)V

    new-instance v1, Lcom/fkzhang/wechatforwarder/bk;

    invoke-direct {v1, p0, p0}, Lcom/fkzhang/wechatforwarder/bk;-><init>(Lcom/fkzhang/wechatforwarder/SupportActivity;Landroid/app/Activity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    return-void
.end method
