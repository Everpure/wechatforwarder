.class final Lcom/fkzhang/wechatforwarder/al;
.super Ljava/lang/Object;


# instance fields
.field a:I


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 3

    const/4 v0, 0x7

    new-array v0, v0, [B

    const v1, -0x2e6ab508

    iput v1, p0, Lcom/fkzhang/wechatforwarder/al;->a:I

    const/4 v1, 0x0

    iget v2, p0, Lcom/fkzhang/wechatforwarder/al;->a:I

    ushr-int/lit8 v2, v2, 0x5

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    const v1, 0x30c86466

    iput v1, p0, Lcom/fkzhang/wechatforwarder/al;->a:I

    const/4 v1, 0x1

    iget v2, p0, Lcom/fkzhang/wechatforwarder/al;->a:I

    ushr-int/lit8 v2, v2, 0x4

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    const v1, -0x56f918c7

    iput v1, p0, Lcom/fkzhang/wechatforwarder/al;->a:I

    const/4 v1, 0x2

    iget v2, p0, Lcom/fkzhang/wechatforwarder/al;->a:I

    ushr-int/lit8 v2, v2, 0x15

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    const v1, 0x5237c2b9

    iput v1, p0, Lcom/fkzhang/wechatforwarder/al;->a:I

    const/4 v1, 0x3

    iget v2, p0, Lcom/fkzhang/wechatforwarder/al;->a:I

    ushr-int/lit8 v2, v2, 0xf

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    const v1, -0x144485e7

    iput v1, p0, Lcom/fkzhang/wechatforwarder/al;->a:I

    const/4 v1, 0x4

    iget v2, p0, Lcom/fkzhang/wechatforwarder/al;->a:I

    ushr-int/lit8 v2, v2, 0xb

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    const v1, 0xb86535d

    iput v1, p0, Lcom/fkzhang/wechatforwarder/al;->a:I

    const/4 v1, 0x5

    iget v2, p0, Lcom/fkzhang/wechatforwarder/al;->a:I

    ushr-int/lit8 v2, v2, 0x3

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    const v1, -0x219c6287

    iput v1, p0, Lcom/fkzhang/wechatforwarder/al;->a:I

    const/4 v1, 0x6

    iget v2, p0, Lcom/fkzhang/wechatforwarder/al;->a:I

    ushr-int/lit8 v2, v2, 0xb

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v0}, Ljava/lang/String;-><init>([B)V

    return-object v1
.end method
