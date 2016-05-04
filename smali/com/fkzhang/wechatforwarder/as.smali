.class Lcom/fkzhang/wechatforwarder/as;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/widget/RadioGroup$OnCheckedChangeListener;


# instance fields
.field final synthetic a:Lcom/fkzhang/wechatforwarder/MainActivity;


# direct methods
.method constructor <init>(Lcom/fkzhang/wechatforwarder/MainActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/fkzhang/wechatforwarder/as;->a:Lcom/fkzhang/wechatforwarder/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/RadioGroup;I)V
    .locals 3

    packed-switch p2, :pswitch_data_0

    :goto_0
    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/as;->a:Lcom/fkzhang/wechatforwarder/MainActivity;

    invoke-static {v0}, Lcom/fkzhang/wechatforwarder/MainActivity;->a(Lcom/fkzhang/wechatforwarder/MainActivity;)Lcom/fkzhang/wechatforwarder/e/d;

    move-result-object v0

    const-string v1, "watermark_img_place"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/fkzhang/wechatforwarder/e/d;->b(Ljava/lang/String;I)V

    goto :goto_0

    :pswitch_1
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/as;->a:Lcom/fkzhang/wechatforwarder/MainActivity;

    invoke-static {v0}, Lcom/fkzhang/wechatforwarder/MainActivity;->a(Lcom/fkzhang/wechatforwarder/MainActivity;)Lcom/fkzhang/wechatforwarder/e/d;

    move-result-object v0

    const-string v1, "watermark_img_place"

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2}, Lcom/fkzhang/wechatforwarder/e/d;->b(Ljava/lang/String;I)V

    goto :goto_0

    :pswitch_2
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/as;->a:Lcom/fkzhang/wechatforwarder/MainActivity;

    invoke-static {v0}, Lcom/fkzhang/wechatforwarder/MainActivity;->a(Lcom/fkzhang/wechatforwarder/MainActivity;)Lcom/fkzhang/wechatforwarder/e/d;

    move-result-object v0

    const-string v1, "watermark_img_place"

    const/4 v2, 0x3

    invoke-virtual {v0, v1, v2}, Lcom/fkzhang/wechatforwarder/e/d;->b(Ljava/lang/String;I)V

    goto :goto_0

    :pswitch_3
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/as;->a:Lcom/fkzhang/wechatforwarder/MainActivity;

    invoke-static {v0}, Lcom/fkzhang/wechatforwarder/MainActivity;->a(Lcom/fkzhang/wechatforwarder/MainActivity;)Lcom/fkzhang/wechatforwarder/e/d;

    move-result-object v0

    const-string v1, "watermark_img_place"

    const/4 v2, 0x4

    invoke-virtual {v0, v1, v2}, Lcom/fkzhang/wechatforwarder/e/d;->b(Ljava/lang/String;I)V

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x7f0c00ca
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method
