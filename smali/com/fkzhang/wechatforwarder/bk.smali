.class Lcom/fkzhang/wechatforwarder/bk;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field final synthetic a:Landroid/app/Activity;

.field final synthetic b:Lcom/fkzhang/wechatforwarder/SupportActivity;


# direct methods
.method constructor <init>(Lcom/fkzhang/wechatforwarder/SupportActivity;Landroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, Lcom/fkzhang/wechatforwarder/bk;->b:Lcom/fkzhang/wechatforwarder/SupportActivity;

    iput-object p2, p0, Lcom/fkzhang/wechatforwarder/bk;->a:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 5

    const/4 v4, 0x1

    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    const/high16 v0, 0x10000000

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/bk;->a:Landroid/app/Activity;

    iget-object v2, p0, Lcom/fkzhang/wechatforwarder/bk;->b:Lcom/fkzhang/wechatforwarder/SupportActivity;

    const v3, 0x7f06004f

    invoke-virtual {v2, v3}, Lcom/fkzhang/wechatforwarder/SupportActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2, v4}, Lcom/fkzhang/wechatforwarder/e/a;->a(Landroid/app/Activity;Ljava/lang/String;I)V

    packed-switch p3, :pswitch_data_0

    :goto_0
    return-void

    :pswitch_0
    const-string v0, "com.tencent.mm"

    const-string v2, "com.tencent.mm.ui.LauncherUI"

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v0, "fkzhang"

    invoke-virtual {v1, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    :try_start_0
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/bk;->b:Lcom/fkzhang/wechatforwarder/SupportActivity;

    invoke-virtual {v0, v1}, Lcom/fkzhang/wechatforwarder/SupportActivity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0

    :pswitch_1
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/bk;->a:Landroid/app/Activity;

    const-string v2, "clipboard"

    invoke-virtual {v0, v2}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/ClipboardManager;

    const-string v2, "#\u5431\u53e3\u4ee4#L4nvxp69Ix"

    const-string v3, "text"

    invoke-static {v3, v2}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    const-string v0, "com.eg.android.AlipayGphone"

    const-string v2, "com.alipay.mobile.quinox.LauncherActivity"

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :try_start_1
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/bk;->b:Lcom/fkzhang/wechatforwarder/SupportActivity;

    invoke-virtual {v0, v1}, Lcom/fkzhang/wechatforwarder/SupportActivity;->startActivity(Landroid/content/Intent;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_0

    :pswitch_2
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/bk;->a:Landroid/app/Activity;

    const-string v1, "https://www.paypal.me/fkzhang"

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/fkzhang/wechatforwarder/e/a;->a(Landroid/app/Activity;Landroid/net/Uri;)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
