.class public Lcom/fkzhang/wechatforwarder/b/d;
.super Ljava/lang/Object;


# static fields
.field public static a:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/16 v0, 0xc

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "6.3.16"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "6.3.15"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "6.3.13"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-string v2, "6.3.11"

    aput-object v2, v0, v1

    const/4 v1, 0x4

    const-string v2, "6.3.9"

    aput-object v2, v0, v1

    const/4 v1, 0x5

    const-string v2, "6.3.8"

    aput-object v2, v0, v1

    const/4 v1, 0x6

    const-string v2, "6.3.7"

    aput-object v2, v0, v1

    const/4 v1, 0x7

    const-string v2, "6.3.5"

    aput-object v2, v0, v1

    const/16 v1, 0x8

    const-string v2, "6.3.0"

    aput-object v2, v0, v1

    const/16 v1, 0x9

    const-string v2, "6.2.5"

    aput-object v2, v0, v1

    const/16 v1, 0xa

    const-string v2, "6.2.4"

    aput-object v2, v0, v1

    const/16 v1, 0xb

    const-string v2, "6.0.0"

    aput-object v2, v0, v1

    sput-object v0, Lcom/fkzhang/wechatforwarder/b/d;->a:[Ljava/lang/String;

    return-void
.end method

.method public static a(Ljava/lang/String;)Z
    .locals 5

    const/4 v0, 0x0

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    sget-object v2, Lcom/fkzhang/wechatforwarder/b/d;->a:[Ljava/lang/String;

    array-length v3, v2

    move v1, v0

    :goto_1
    if-ge v1, v3, :cond_0

    aget-object v4, v2, v1

    invoke-virtual {p0, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1
.end method
