.class Lcom/fkzhang/wechatforwarder/a/e;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/fkzhang/wechatforwarder/a/d;


# direct methods
.method constructor <init>(Lcom/fkzhang/wechatforwarder/a/d;I)V
    .locals 0

    iput-object p1, p0, Lcom/fkzhang/wechatforwarder/a/e;->b:Lcom/fkzhang/wechatforwarder/a/d;

    iput p2, p0, Lcom/fkzhang/wechatforwarder/a/e;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    check-cast p1, Landroid/widget/CheckBox;

    invoke-virtual {p1}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v0

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/a/e;->b:Lcom/fkzhang/wechatforwarder/a/d;

    invoke-static {v1}, Lcom/fkzhang/wechatforwarder/a/d;->a(Lcom/fkzhang/wechatforwarder/a/d;)Lcom/fkzhang/wechatforwarder/a/g;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/a/e;->b:Lcom/fkzhang/wechatforwarder/a/d;

    invoke-static {v1}, Lcom/fkzhang/wechatforwarder/a/d;->a(Lcom/fkzhang/wechatforwarder/a/d;)Lcom/fkzhang/wechatforwarder/a/g;

    move-result-object v1

    iget v2, p0, Lcom/fkzhang/wechatforwarder/a/e;->a:I

    invoke-interface {v1, v2, v0}, Lcom/fkzhang/wechatforwarder/a/g;->a(IZ)V

    :cond_0
    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/a/e;->b:Lcom/fkzhang/wechatforwarder/a/d;

    iget v2, p0, Lcom/fkzhang/wechatforwarder/a/e;->a:I

    invoke-virtual {v1, v2, v0}, Lcom/fkzhang/wechatforwarder/a/d;->a(IZ)V

    return-void
.end method
