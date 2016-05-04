.class Lcom/fkzhang/wechatforwarder/bg;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field final synthetic a:Lcom/fkzhang/wechatforwarder/MainActivity;


# direct methods
.method constructor <init>(Lcom/fkzhang/wechatforwarder/MainActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/fkzhang/wechatforwarder/bg;->a:Lcom/fkzhang/wechatforwarder/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLongClick(Landroid/view/View;)Z
    .locals 2

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/bg;->a:Lcom/fkzhang/wechatforwarder/MainActivity;

    invoke-static {v0}, Lcom/fkzhang/wechatforwarder/MainActivity;->c(Lcom/fkzhang/wechatforwarder/MainActivity;)Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/bg;->a:Lcom/fkzhang/wechatforwarder/MainActivity;

    invoke-static {v0}, Lcom/fkzhang/wechatforwarder/MainActivity;->c(Lcom/fkzhang/wechatforwarder/MainActivity;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/bg;->a:Lcom/fkzhang/wechatforwarder/MainActivity;

    invoke-static {v0}, Lcom/fkzhang/wechatforwarder/MainActivity;->c(Lcom/fkzhang/wechatforwarder/MainActivity;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    :cond_0
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/bg;->a:Lcom/fkzhang/wechatforwarder/MainActivity;

    invoke-static {v0}, Lcom/fkzhang/wechatforwarder/MainActivity;->d(Lcom/fkzhang/wechatforwarder/MainActivity;)Landroid/widget/ImageView;

    move-result-object v0

    const v1, 0x106000d

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/bg;->a:Lcom/fkzhang/wechatforwarder/MainActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/fkzhang/wechatforwarder/MainActivity;->a(Lcom/fkzhang/wechatforwarder/MainActivity;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    const/4 v0, 0x1

    return v0
.end method
