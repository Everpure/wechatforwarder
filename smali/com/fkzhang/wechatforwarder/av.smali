.class Lcom/fkzhang/wechatforwarder/av;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# instance fields
.field final synthetic a:Lcom/fkzhang/wechatforwarder/MainActivity;


# direct methods
.method constructor <init>(Lcom/fkzhang/wechatforwarder/MainActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/fkzhang/wechatforwarder/av;->a:Lcom/fkzhang/wechatforwarder/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 4

    int-to-double v0, p2

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    div-double/2addr v0, v2

    const-wide v2, 0x406fc00000000000L    # 254.0

    mul-double/2addr v0, v2

    double-to-int v0, v0

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/av;->a:Lcom/fkzhang/wechatforwarder/MainActivity;

    invoke-static {v1}, Lcom/fkzhang/wechatforwarder/MainActivity;->a(Lcom/fkzhang/wechatforwarder/MainActivity;)Lcom/fkzhang/wechatforwarder/e/d;

    move-result-object v1

    const-string v2, "watermark_img_alpha"

    invoke-virtual {v1, v2, v0}, Lcom/fkzhang/wechatforwarder/e/d;->b(Ljava/lang/String;I)V

    return-void
.end method

.method public onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    return-void
.end method

.method public onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    return-void
.end method
