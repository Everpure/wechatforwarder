.class Lcom/fkzhang/wechatforwarder/aa;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;


# direct methods
.method constructor <init>(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/fkzhang/wechatforwarder/aa;->a:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/aa;->a:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-static {v0}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->e(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/aa;->a:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-static {v0}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->o(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/aa;->a:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-static {v0}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->p(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)V

    goto :goto_0
.end method
