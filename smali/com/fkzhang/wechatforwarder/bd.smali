.class Lcom/fkzhang/wechatforwarder/bd;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field final synthetic a:Landroid/widget/TextView;

.field final synthetic b:Lcom/fkzhang/wechatforwarder/MainActivity;


# direct methods
.method constructor <init>(Lcom/fkzhang/wechatforwarder/MainActivity;Landroid/widget/TextView;)V
    .locals 0

    iput-object p1, p0, Lcom/fkzhang/wechatforwarder/bd;->b:Lcom/fkzhang/wechatforwarder/MainActivity;

    iput-object p2, p0, Lcom/fkzhang/wechatforwarder/bd;->a:Landroid/widget/TextView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLongClick(Landroid/view/View;)Z
    .locals 3

    const/4 v2, 0x1

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/bd;->b:Lcom/fkzhang/wechatforwarder/MainActivity;

    invoke-static {v0}, Lcom/fkzhang/wechatforwarder/MainActivity;->a(Lcom/fkzhang/wechatforwarder/MainActivity;)Lcom/fkzhang/wechatforwarder/e/d;

    move-result-object v0

    const-string v1, "disable_xposed_check"

    invoke-virtual {v0, v1, v2}, Lcom/fkzhang/wechatforwarder/e/d;->b(Ljava/lang/String;Z)V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/bd;->a:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    return v2
.end method
