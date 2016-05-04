.class Lcom/fkzhang/wechatforwarder/q;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field final synthetic a:Lcom/fkzhang/wechatforwarder/a/d;

.field final synthetic b:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;


# direct methods
.method constructor <init>(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;Lcom/fkzhang/wechatforwarder/a/d;)V
    .locals 0

    iput-object p1, p0, Lcom/fkzhang/wechatforwarder/q;->b:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    iput-object p2, p0, Lcom/fkzhang/wechatforwarder/q;->a:Lcom/fkzhang/wechatforwarder/a/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 1

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/q;->a:Lcom/fkzhang/wechatforwarder/a/d;

    invoke-virtual {v0, p3}, Lcom/fkzhang/wechatforwarder/a/d;->b(I)V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/q;->a:Lcom/fkzhang/wechatforwarder/a/d;

    invoke-virtual {v0}, Lcom/fkzhang/wechatforwarder/a/d;->notifyDataSetChanged()V

    return-void
.end method
