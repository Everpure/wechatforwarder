.class public La/a/a/b/a/b;
.super Ljava/lang/Object;


# instance fields
.field protected a:La/a/a/b/a/c;

.field protected b:La/a/a/b/a/d;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, La/a/a/b/a/b;->a:La/a/a/b/a/c;

    iput-object v0, p0, La/a/a/b/a/b;->b:La/a/a/b/a/d;

    return-void
.end method

.method public constructor <init>(La/a/a/b/a/c;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/a/a/b/a/b;->a:La/a/a/b/a/c;

    const/4 v0, 0x0

    iput-object v0, p0, La/a/a/b/a/b;->b:La/a/a/b/a/d;

    return-void
.end method


# virtual methods
.method protected a(II)I
    .locals 2

    const/4 v0, 0x0

    rem-int v1, p1, p2

    if-lez v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    div-int v1, p1, p2

    add-int/2addr v0, v1

    return v0
.end method

.method protected a([B)V
    .locals 2

    iget-object v0, p0, La/a/a/b/a/b;->b:La/a/a/b/a/d;

    if-nez v0, :cond_0

    new-instance v0, La/a/a/b/a/a;

    iget-object v1, p0, La/a/a/b/a/b;->a:La/a/a/b/a/c;

    invoke-virtual {v1}, La/a/a/b/a/c;->c()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, La/a/a/b/a/a;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, La/a/a/b/a/b;->b:La/a/a/b/a/d;

    :cond_0
    iget-object v0, p0, La/a/a/b/a/b;->b:La/a/a/b/a/d;

    invoke-interface {v0, p1}, La/a/a/b/a/d;->b([B)V

    return-void
.end method

.method protected a([BII)V
    .locals 2

    add-int/lit8 v0, p2, 0x0

    const/high16 v1, 0x1000000

    div-int v1, p3, v1

    int-to-byte v1, v1

    aput-byte v1, p1, v0

    add-int/lit8 v0, p2, 0x1

    const/high16 v1, 0x10000

    div-int v1, p3, v1

    int-to-byte v1, v1

    aput-byte v1, p1, v0

    add-int/lit8 v0, p2, 0x2

    div-int/lit16 v1, p3, 0x100

    int-to-byte v1, v1

    aput-byte v1, p1, v0

    add-int/lit8 v0, p2, 0x3

    int-to-byte v1, p3

    aput-byte v1, p1, v0

    return-void
.end method

.method protected a([BILa/a/a/b/a/d;[BII)V
    .locals 5

    const/4 v1, 0x0

    invoke-interface {p3}, La/a/a/b/a/d;->b()I

    move-result v3

    new-array v4, v3, [B

    array-length v0, p4

    add-int/lit8 v0, v0, 0x4

    new-array v0, v0, [B

    array-length v2, p4

    invoke-static {p4, v1, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length v2, p4

    invoke-virtual {p0, v0, v2, p6}, La/a/a/b/a/b;->a([BII)V

    move-object v2, v0

    move v0, v1

    :goto_0
    if-lt v0, p5, :cond_0

    invoke-static {v4, v1, p1, p2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void

    :cond_0
    invoke-interface {p3, v2}, La/a/a/b/a/d;->a([B)[B

    move-result-object v2

    invoke-virtual {p0, v4, v2}, La/a/a/b/a/b;->a([B[B)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method protected a([B[B)V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    array-length v1, p1

    if-lt v0, v1, :cond_0

    return-void

    :cond_0
    aget-byte v1, p1, v0

    aget-byte v2, p2, v0

    xor-int/2addr v1, v2

    int-to-byte v1, v1

    aput-byte v1, p1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method protected a(La/a/a/b/a/d;[BII)[B
    .locals 11

    const/4 v7, 0x0

    if-nez p2, :cond_2

    new-array v4, v7, [B

    :goto_0
    invoke-interface {p1}, La/a/a/b/a/d;->b()I

    move-result v8

    invoke-virtual {p0, p4, v8}, La/a/a/b/a/b;->a(II)I

    move-result v9

    add-int/lit8 v0, v9, -0x1

    mul-int/2addr v0, v8

    sub-int v10, p4, v0

    mul-int v0, v9, v8

    new-array v1, v0, [B

    const/4 v6, 0x1

    move v2, v7

    :goto_1
    if-le v6, v9, :cond_1

    if-ge v10, v8, :cond_0

    new-array v0, p4, [B

    invoke-static {v1, v7, v0, v7, p4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v1, v0

    :cond_0
    return-object v1

    :cond_1
    move-object v0, p0

    move-object v3, p1

    move v5, p3

    invoke-virtual/range {v0 .. v6}, La/a/a/b/a/b;->a([BILa/a/a/b/a/d;[BII)V

    add-int/2addr v2, v8

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_2
    move-object v4, p2

    goto :goto_0
.end method

.method public a([CI)[B
    .locals 3

    const/4 v1, 0x0

    move-object v0, v1

    check-cast v0, [B

    check-cast v1, [B

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    :cond_0
    invoke-static {p1}, La/a/a/h/b;->a([C)[B

    move-result-object v0

    invoke-virtual {p0, v0}, La/a/a/b/a/b;->a([B)V

    if-nez p2, :cond_1

    iget-object v0, p0, La/a/a/b/a/b;->b:La/a/a/b/a/d;

    invoke-interface {v0}, La/a/a/b/a/d;->b()I

    move-result p2

    :cond_1
    iget-object v0, p0, La/a/a/b/a/b;->b:La/a/a/b/a/d;

    iget-object v1, p0, La/a/a/b/a/b;->a:La/a/a/b/a/c;

    invoke-virtual {v1}, La/a/a/b/a/c;->b()[B

    move-result-object v1

    iget-object v2, p0, La/a/a/b/a/b;->a:La/a/a/b/a/c;

    invoke-virtual {v2}, La/a/a/b/a/c;->a()I

    move-result v2

    invoke-virtual {p0, v0, v1, v2, p2}, La/a/a/b/a/b;->a(La/a/a/b/a/d;[BII)[B

    move-result-object v0

    return-object v0
.end method
