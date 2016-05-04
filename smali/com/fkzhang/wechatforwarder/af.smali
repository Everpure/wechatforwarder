.class Lcom/fkzhang/wechatforwarder/af;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;


# direct methods
.method constructor <init>(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;I)V
    .locals 0

    iput-object p1, p0, Lcom/fkzhang/wechatforwarder/af;->b:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    iput p2, p0, Lcom/fkzhang/wechatforwarder/af;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/af;->b:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    iget v1, p0, Lcom/fkzhang/wechatforwarder/af;->a:I

    invoke-static {v0, v1}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->b(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;I)V

    return-void
.end method
