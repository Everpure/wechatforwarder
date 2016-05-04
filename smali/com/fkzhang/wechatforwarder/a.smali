.class Lcom/fkzhang/wechatforwarder/a;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;


# instance fields
.field final synthetic a:Lcom/fkzhang/wechatforwarder/AutoForwardActivity;


# direct methods
.method constructor <init>(Lcom/fkzhang/wechatforwarder/AutoForwardActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/fkzhang/wechatforwarder/a;->a:Lcom/fkzhang/wechatforwarder/AutoForwardActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 2

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/a;->a:Lcom/fkzhang/wechatforwarder/AutoForwardActivity;

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/a;->a:Lcom/fkzhang/wechatforwarder/AutoForwardActivity;

    invoke-static {v0}, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->a(Lcom/fkzhang/wechatforwarder/AutoForwardActivity;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fkzhang/wechatforwarder/d/a;

    invoke-virtual {v0}, Lcom/fkzhang/wechatforwarder/d/a;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/a;->a:Lcom/fkzhang/wechatforwarder/AutoForwardActivity;

    invoke-static {v0}, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->b(Lcom/fkzhang/wechatforwarder/AutoForwardActivity;)V

    return-void
.end method

.method public onNothingSelected(Landroid/widget/AdapterView;)V
    .locals 0

    return-void
.end method
