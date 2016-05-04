.class Lcom/fkzhang/wechatforwarder/d;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field final synthetic a:Lcom/fkzhang/wechatforwarder/AutoForwardActivity;


# direct methods
.method constructor <init>(Lcom/fkzhang/wechatforwarder/AutoForwardActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/fkzhang/wechatforwarder/d;->a:Lcom/fkzhang/wechatforwarder/AutoForwardActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 3

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/d;->a:Lcom/fkzhang/wechatforwarder/AutoForwardActivity;

    invoke-static {v0}, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->c(Lcom/fkzhang/wechatforwarder/AutoForwardActivity;)Lcom/fkzhang/wechatforwarder/e/d;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/fkzhang/wechatforwarder/d;->a:Lcom/fkzhang/wechatforwarder/AutoForwardActivity;

    invoke-virtual {v2}, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->j()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "_avatar_enable"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p2}, Lcom/fkzhang/wechatforwarder/e/d;->b(Ljava/lang/String;Z)V

    return-void
.end method
