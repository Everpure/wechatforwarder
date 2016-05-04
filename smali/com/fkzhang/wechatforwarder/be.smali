.class Lcom/fkzhang/wechatforwarder/be;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/fkzhang/wechatforwarder/MainActivity;


# direct methods
.method constructor <init>(Lcom/fkzhang/wechatforwarder/MainActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/fkzhang/wechatforwarder/be;->a:Lcom/fkzhang/wechatforwarder/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/be;->a:Lcom/fkzhang/wechatforwarder/MainActivity;

    const-class v1, Lcom/fkzhang/wechatforwarder/SupportActivity;

    invoke-static {v0, v1}, Lcom/fkzhang/wechatforwarder/MainActivity;->a(Lcom/fkzhang/wechatforwarder/MainActivity;Ljava/lang/Class;)V

    return-void
.end method
