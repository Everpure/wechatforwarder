.class Lcom/fkzhang/wechatforwarder/g;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field final synthetic a:Lcom/fkzhang/wechatforwarder/AutoForwardActivity;


# direct methods
.method constructor <init>(Lcom/fkzhang/wechatforwarder/AutoForwardActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/fkzhang/wechatforwarder/g;->a:Lcom/fkzhang/wechatforwarder/AutoForwardActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 4

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/g;->a:Lcom/fkzhang/wechatforwarder/AutoForwardActivity;

    invoke-static {v1}, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->c(Lcom/fkzhang/wechatforwarder/AutoForwardActivity;)Lcom/fkzhang/wechatforwarder/e/d;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/fkzhang/wechatforwarder/g;->a:Lcom/fkzhang/wechatforwarder/AutoForwardActivity;

    invoke-virtual {v3}, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->j()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "_resend_max"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Lcom/fkzhang/wechatforwarder/e/d;->b(Ljava/lang/String;I)V

    return-void

    :cond_0
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    goto :goto_0
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method
