.class public Lcom/fkzhang/wechatforwarder/d/g;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/fkzhang/wechatforwarder/c/a;


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/fkzhang/wechatforwarder/d/g;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/fkzhang/wechatforwarder/d/g;->b:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/fkzhang/wechatforwarder/d/g;->c:Ljava/lang/String;

    iput-object p2, p0, Lcom/fkzhang/wechatforwarder/d/g;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/fkzhang/wechatforwarder/d/g;->b:Ljava/lang/String;

    iput p4, p0, Lcom/fkzhang/wechatforwarder/d/g;->d:I

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/d/g;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/d/g;->b:Ljava/lang/String;

    return-object v0
.end method
