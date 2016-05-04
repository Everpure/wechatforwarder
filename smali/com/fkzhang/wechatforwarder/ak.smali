.class public final Lcom/fkzhang/wechatforwarder/ak;
.super Ljava/lang/Object;


# static fields
.field public static final a:Ljava/lang/String;

.field public static final b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/fkzhang/wechatforwarder/al;

    invoke-direct {v0}, Lcom/fkzhang/wechatforwarder/al;-><init>()V

    invoke-virtual {v0}, Lcom/fkzhang/wechatforwarder/al;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/fkzhang/wechatforwarder/ak;->a:Ljava/lang/String;

    new-instance v0, Lcom/fkzhang/wechatforwarder/am;

    invoke-direct {v0}, Lcom/fkzhang/wechatforwarder/am;-><init>()V

    invoke-virtual {v0}, Lcom/fkzhang/wechatforwarder/am;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/fkzhang/wechatforwarder/ak;->b:Ljava/lang/String;

    return-void
.end method
