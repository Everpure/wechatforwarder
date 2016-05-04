.class Lcom/fkzhang/wechatforwarder/n;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/widget/RadioGroup$OnCheckedChangeListener;


# instance fields
.field final synthetic a:Lcom/fkzhang/wechatforwarder/a/c;

.field final synthetic b:Ljava/util/ArrayList;

.field final synthetic c:Ljava/util/ArrayList;

.field final synthetic d:Ljava/util/ArrayList;

.field final synthetic e:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;


# direct methods
.method constructor <init>(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;Lcom/fkzhang/wechatforwarder/a/c;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 0

    iput-object p1, p0, Lcom/fkzhang/wechatforwarder/n;->e:Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    iput-object p2, p0, Lcom/fkzhang/wechatforwarder/n;->a:Lcom/fkzhang/wechatforwarder/a/c;

    iput-object p3, p0, Lcom/fkzhang/wechatforwarder/n;->b:Ljava/util/ArrayList;

    iput-object p4, p0, Lcom/fkzhang/wechatforwarder/n;->c:Ljava/util/ArrayList;

    iput-object p5, p0, Lcom/fkzhang/wechatforwarder/n;->d:Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/RadioGroup;I)V
    .locals 2

    packed-switch p2, :pswitch_data_0

    :goto_0
    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/n;->a:Lcom/fkzhang/wechatforwarder/a/c;

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/n;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Lcom/fkzhang/wechatforwarder/a/c;->a(Ljava/util/ArrayList;)V

    goto :goto_0

    :pswitch_1
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/n;->a:Lcom/fkzhang/wechatforwarder/a/c;

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/n;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Lcom/fkzhang/wechatforwarder/a/c;->a(Ljava/util/ArrayList;)V

    goto :goto_0

    :pswitch_2
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/n;->a:Lcom/fkzhang/wechatforwarder/a/c;

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/n;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Lcom/fkzhang/wechatforwarder/a/c;->a(Ljava/util/ArrayList;)V

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x7f0c00be
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
