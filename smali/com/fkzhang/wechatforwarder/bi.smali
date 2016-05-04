.class Lcom/fkzhang/wechatforwarder/bi;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Landroid/app/Activity;

.field final synthetic b:Lcom/fkzhang/wechatforwarder/SupportActivity;


# direct methods
.method constructor <init>(Lcom/fkzhang/wechatforwarder/SupportActivity;Landroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, Lcom/fkzhang/wechatforwarder/bi;->b:Lcom/fkzhang/wechatforwarder/SupportActivity;

    iput-object p2, p0, Lcom/fkzhang/wechatforwarder/bi;->a:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/bi;->a:Landroid/app/Activity;

    const-string v1, "http://pan.baidu.com/s/1kUqL2Vt"

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/fkzhang/wechatforwarder/e/a;->a(Landroid/app/Activity;Landroid/net/Uri;)V

    return-void
.end method
