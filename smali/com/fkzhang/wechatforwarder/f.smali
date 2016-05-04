.class Lcom/fkzhang/wechatforwarder/f;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field final synthetic a:Lcom/fkzhang/wechatforwarder/AutoForwardActivity;


# direct methods
.method constructor <init>(Lcom/fkzhang/wechatforwarder/AutoForwardActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/fkzhang/wechatforwarder/f;->a:Lcom/fkzhang/wechatforwarder/AutoForwardActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 5

    const/16 v4, 0x8

    const/4 v3, 0x0

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/f;->a:Lcom/fkzhang/wechatforwarder/AutoForwardActivity;

    invoke-static {v0}, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->c(Lcom/fkzhang/wechatforwarder/AutoForwardActivity;)Lcom/fkzhang/wechatforwarder/e/d;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/fkzhang/wechatforwarder/f;->a:Lcom/fkzhang/wechatforwarder/AutoForwardActivity;

    invoke-virtual {v2}, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->j()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "_resend_enable"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p2}, Lcom/fkzhang/wechatforwarder/e/d;->b(Ljava/lang/String;Z)V

    if-eqz p2, :cond_0

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/f;->a:Lcom/fkzhang/wechatforwarder/AutoForwardActivity;

    invoke-static {v0}, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->g(Lcom/fkzhang/wechatforwarder/AutoForwardActivity;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/f;->a:Lcom/fkzhang/wechatforwarder/AutoForwardActivity;

    invoke-static {v0}, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->h(Lcom/fkzhang/wechatforwarder/AutoForwardActivity;)Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/widget/EditText;->setVisibility(I)V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/f;->a:Lcom/fkzhang/wechatforwarder/AutoForwardActivity;

    invoke-static {v0}, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->i(Lcom/fkzhang/wechatforwarder/AutoForwardActivity;)Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/widget/EditText;->setVisibility(I)V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/f;->a:Lcom/fkzhang/wechatforwarder/AutoForwardActivity;

    invoke-static {v0}, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->j(Lcom/fkzhang/wechatforwarder/AutoForwardActivity;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/f;->a:Lcom/fkzhang/wechatforwarder/AutoForwardActivity;

    invoke-static {v0}, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->g(Lcom/fkzhang/wechatforwarder/AutoForwardActivity;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/f;->a:Lcom/fkzhang/wechatforwarder/AutoForwardActivity;

    invoke-static {v0}, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->h(Lcom/fkzhang/wechatforwarder/AutoForwardActivity;)Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/widget/EditText;->setVisibility(I)V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/f;->a:Lcom/fkzhang/wechatforwarder/AutoForwardActivity;

    invoke-static {v0}, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->i(Lcom/fkzhang/wechatforwarder/AutoForwardActivity;)Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/widget/EditText;->setVisibility(I)V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/f;->a:Lcom/fkzhang/wechatforwarder/AutoForwardActivity;

    invoke-static {v0}, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->j(Lcom/fkzhang/wechatforwarder/AutoForwardActivity;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0
.end method
