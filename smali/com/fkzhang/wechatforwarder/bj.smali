.class Lcom/fkzhang/wechatforwarder/bj;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/widget/AdapterView$OnItemLongClickListener;


# instance fields
.field final synthetic a:Landroid/app/Activity;

.field final synthetic b:Lcom/fkzhang/wechatforwarder/SupportActivity;


# direct methods
.method constructor <init>(Lcom/fkzhang/wechatforwarder/SupportActivity;Landroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, Lcom/fkzhang/wechatforwarder/bj;->b:Lcom/fkzhang/wechatforwarder/SupportActivity;

    iput-object p2, p0, Lcom/fkzhang/wechatforwarder/bj;->a:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemLongClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)Z
    .locals 2

    packed-switch p3, :pswitch_data_0

    :goto_0
    const/4 v0, 0x1

    return v0

    :pswitch_0
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/bj;->a:Landroid/app/Activity;

    const-string v1, "http://pan.baidu.com/s/1hrxzvCS"

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/fkzhang/wechatforwarder/e/a;->a(Landroid/app/Activity;Landroid/net/Uri;)V

    goto :goto_0

    :pswitch_1
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/bj;->a:Landroid/app/Activity;

    const-string v1, "http://pan.baidu.com/s/1dDSxCPj"

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/fkzhang/wechatforwarder/e/a;->a(Landroid/app/Activity;Landroid/net/Uri;)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
