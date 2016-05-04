.class Lcom/fkzhang/wechatforwarder/az;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/rarepebble/colorpicker/ColorPickerView;

.field final synthetic b:Lcom/fkzhang/wechatforwarder/MainActivity;


# direct methods
.method constructor <init>(Lcom/fkzhang/wechatforwarder/MainActivity;Lcom/rarepebble/colorpicker/ColorPickerView;)V
    .locals 0

    iput-object p1, p0, Lcom/fkzhang/wechatforwarder/az;->b:Lcom/fkzhang/wechatforwarder/MainActivity;

    iput-object p2, p0, Lcom/fkzhang/wechatforwarder/az;->a:Lcom/rarepebble/colorpicker/ColorPickerView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/az;->b:Lcom/fkzhang/wechatforwarder/MainActivity;

    invoke-static {v0}, Lcom/fkzhang/wechatforwarder/MainActivity;->a(Lcom/fkzhang/wechatforwarder/MainActivity;)Lcom/fkzhang/wechatforwarder/e/d;

    move-result-object v0

    const-string v1, "watermark_text_color"

    iget-object v2, p0, Lcom/fkzhang/wechatforwarder/az;->a:Lcom/rarepebble/colorpicker/ColorPickerView;

    invoke-virtual {v2}, Lcom/rarepebble/colorpicker/ColorPickerView;->getColor()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/fkzhang/wechatforwarder/e/d;->b(Ljava/lang/String;I)V

    return-void
.end method
