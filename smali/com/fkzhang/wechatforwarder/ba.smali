.class Lcom/fkzhang/wechatforwarder/ba;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/fkzhang/wechatforwarder/MainActivity;


# direct methods
.method constructor <init>(Lcom/fkzhang/wechatforwarder/MainActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/fkzhang/wechatforwarder/ba;->a:Lcom/fkzhang/wechatforwarder/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 10

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/ba;->a:Lcom/fkzhang/wechatforwarder/MainActivity;

    invoke-static {v0}, Lcom/fkzhang/wechatforwarder/MainActivity;->f(Lcom/fkzhang/wechatforwarder/MainActivity;)Landroid/graphics/Bitmap;

    move-result-object v0

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/ba;->a:Lcom/fkzhang/wechatforwarder/MainActivity;

    invoke-static {v0}, Lcom/fkzhang/wechatforwarder/MainActivity;->a(Lcom/fkzhang/wechatforwarder/MainActivity;)Lcom/fkzhang/wechatforwarder/e/d;

    move-result-object v0

    const-string v1, "watermark_text_size"

    const/16 v2, 0x32

    invoke-virtual {v0, v1, v2}, Lcom/fkzhang/wechatforwarder/e/d;->a(Ljava/lang/String;I)I

    move-result v7

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/ba;->a:Lcom/fkzhang/wechatforwarder/MainActivity;

    invoke-static {v0}, Lcom/fkzhang/wechatforwarder/MainActivity;->a(Lcom/fkzhang/wechatforwarder/MainActivity;)Lcom/fkzhang/wechatforwarder/e/d;

    move-result-object v0

    const-string v1, "watermark_text_color"

    const v2, -0xff9c

    invoke-virtual {v0, v1, v2}, Lcom/fkzhang/wechatforwarder/e/d;->a(Ljava/lang/String;I)I

    move-result v3

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/ba;->a:Lcom/fkzhang/wechatforwarder/MainActivity;

    invoke-static {v0}, Lcom/fkzhang/wechatforwarder/MainActivity;->a(Lcom/fkzhang/wechatforwarder/MainActivity;)Lcom/fkzhang/wechatforwarder/e/d;

    move-result-object v0

    const-string v1, "img_watermark_text"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Lcom/fkzhang/wechatforwarder/e/d;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/ba;->a:Lcom/fkzhang/wechatforwarder/MainActivity;

    invoke-static {v0}, Lcom/fkzhang/wechatforwarder/MainActivity;->a(Lcom/fkzhang/wechatforwarder/MainActivity;)Lcom/fkzhang/wechatforwarder/e/d;

    move-result-object v0

    const-string v1, "watermark_text_place"

    const/4 v4, 0x1

    invoke-virtual {v0, v1, v4}, Lcom/fkzhang/wechatforwarder/e/d;->a(Ljava/lang/String;I)I

    move-result v6

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/ba;->a:Lcom/fkzhang/wechatforwarder/MainActivity;

    invoke-static {v0}, Lcom/fkzhang/wechatforwarder/MainActivity;->a(Lcom/fkzhang/wechatforwarder/MainActivity;)Lcom/fkzhang/wechatforwarder/e/d;

    move-result-object v0

    const-string v1, "watermark_img_place"

    const/4 v4, 0x4

    invoke-virtual {v0, v1, v4}, Lcom/fkzhang/wechatforwarder/e/d;->a(Ljava/lang/String;I)I

    move-result v5

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/ba;->a:Lcom/fkzhang/wechatforwarder/MainActivity;

    invoke-static {v0}, Lcom/fkzhang/wechatforwarder/MainActivity;->a(Lcom/fkzhang/wechatforwarder/MainActivity;)Lcom/fkzhang/wechatforwarder/e/d;

    move-result-object v0

    const-string v1, "watermark_img_alpha"

    const/16 v4, 0x64

    invoke-virtual {v0, v1, v4}, Lcom/fkzhang/wechatforwarder/e/d;->a(Ljava/lang/String;I)I

    move-result v4

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/ba;->a:Lcom/fkzhang/wechatforwarder/MainActivity;

    invoke-static {v0}, Lcom/fkzhang/wechatforwarder/MainActivity;->g(Lcom/fkzhang/wechatforwarder/MainActivity;)Landroid/graphics/Bitmap;

    move-result-object v1

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/ba;->a:Lcom/fkzhang/wechatforwarder/MainActivity;

    invoke-static {v0}, Lcom/fkzhang/wechatforwarder/MainActivity;->a(Lcom/fkzhang/wechatforwarder/MainActivity;)Lcom/fkzhang/wechatforwarder/e/d;

    move-result-object v0

    const-string v8, "disable_contentprovider"

    const/4 v9, 0x0

    invoke-virtual {v0, v8, v9}, Lcom/fkzhang/wechatforwarder/e/d;->a(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    :cond_1
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/ba;->a:Lcom/fkzhang/wechatforwarder/MainActivity;

    invoke-static {v0}, Lcom/fkzhang/wechatforwarder/MainActivity;->f(Lcom/fkzhang/wechatforwarder/MainActivity;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-static/range {v0 .. v7}, Lcom/fkzhang/wechatforwarder/e/c;->a(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Ljava/lang/String;IIIII)Landroid/graphics/Bitmap;

    move-result-object v0

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/ba;->a:Lcom/fkzhang/wechatforwarder/MainActivity;

    invoke-static {v1}, Lcom/fkzhang/wechatforwarder/MainActivity;->h(Lcom/fkzhang/wechatforwarder/MainActivity;)Landroid/widget/ImageView;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_0
.end method
