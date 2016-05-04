.class public La/a/a/a/a;
.super Ljava/lang/Object;


# instance fields
.field private a:Ljava/io/RandomAccessFile;

.field private b:La/a/a/e/l;


# direct methods
.method public constructor <init>(Ljava/io/RandomAccessFile;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, La/a/a/a/a;->a:Ljava/io/RandomAccessFile;

    iput-object p1, p0, La/a/a/a/a;->a:Ljava/io/RandomAccessFile;

    return-void
.end method

.method private a(Ljava/util/ArrayList;)La/a/a/e/a;
    .locals 10

    const-wide/32 v8, 0x9901

    const/4 v3, 0x0

    const/4 v6, 0x2

    const/4 v2, 0x0

    if-nez p1, :cond_0

    move-object v0, v3

    :goto_0
    return-object v0

    :cond_0
    move v1, v2

    :goto_1
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lt v1, v0, :cond_1

    move-object v0, v3

    goto :goto_0

    :cond_1
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/a/a/e/e;

    if-nez v0, :cond_3

    :cond_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    :cond_3
    invoke-virtual {v0}, La/a/a/e/e;->a()J

    move-result-wide v4

    cmp-long v4, v4, v8

    if-nez v4, :cond_2

    invoke-virtual {v0}, La/a/a/e/e;->c()[B

    move-result-object v1

    if-nez v1, :cond_4

    new-instance v0, La/a/a/c/a;

    const-string v1, "corrput AES extra data records"

    invoke-direct {v0, v1}, La/a/a/c/a;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    new-instance v1, La/a/a/e/a;

    invoke-direct {v1}, La/a/a/e/a;-><init>()V

    invoke-virtual {v1, v8, v9}, La/a/a/e/a;->a(J)V

    invoke-virtual {v0}, La/a/a/e/e;->b()I

    move-result v3

    invoke-virtual {v1, v3}, La/a/a/e/a;->a(I)V

    invoke-virtual {v0}, La/a/a/e/e;->c()[B

    move-result-object v0

    invoke-static {v0, v2}, La/a/a/h/b;->b([BI)I

    move-result v3

    invoke-virtual {v1, v3}, La/a/a/e/a;->b(I)V

    new-array v3, v6, [B

    invoke-static {v0, v6, v3, v2, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, v3}, Ljava/lang/String;-><init>([B)V

    invoke-virtual {v1, v2}, La/a/a/e/a;->a(Ljava/lang/String;)V

    const/4 v2, 0x4

    aget-byte v2, v0, v2

    and-int/lit16 v2, v2, 0xff

    invoke-virtual {v1, v2}, La/a/a/e/a;->c(I)V

    const/4 v2, 0x5

    invoke-static {v0, v2}, La/a/a/h/b;->b([BI)I

    move-result v0

    invoke-virtual {v1, v0}, La/a/a/e/a;->d(I)V

    move-object v0, v1

    goto :goto_0
.end method

.method private a()La/a/a/e/d;
    .locals 12

    const-wide/32 v10, 0x6054b50

    const/4 v8, 0x4

    const/4 v0, 0x0

    iget-object v1, p0, La/a/a/a/a;->a:Ljava/io/RandomAccessFile;

    if-nez v1, :cond_0

    new-instance v0, La/a/a/c/a;

    const-string v1, "random access file was null"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, La/a/a/c/a;-><init>(Ljava/lang/String;I)V

    throw v0

    :cond_0
    const/4 v1, 0x4

    :try_start_0
    new-array v1, v1, [B

    iget-object v2, p0, La/a/a/a/a;->a:Ljava/io/RandomAccessFile;

    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->length()J

    move-result-wide v2

    const-wide/16 v4, 0x16

    sub-long/2addr v2, v4

    new-instance v6, La/a/a/e/d;

    invoke-direct {v6}, La/a/a/e/d;-><init>()V

    :goto_0
    iget-object v7, p0, La/a/a/a/a;->a:Ljava/io/RandomAccessFile;

    const-wide/16 v4, 0x1

    sub-long v4, v2, v4

    invoke-virtual {v7, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V

    add-int/lit8 v0, v0, 0x1

    iget-object v2, p0, La/a/a/a/a;->a:Ljava/io/RandomAccessFile;

    invoke-static {v2, v1}, La/a/a/h/b;->a(Ljava/io/DataInput;[B)I

    move-result v2

    int-to-long v2, v2

    cmp-long v2, v2, v10

    if-eqz v2, :cond_1

    const/16 v2, 0xbb8

    if-le v0, v2, :cond_5

    :cond_1
    const/4 v0, 0x0

    invoke-static {v1, v0}, La/a/a/h/b;->d([BI)I

    move-result v0

    int-to-long v0, v0

    cmp-long v0, v0, v10

    if-eqz v0, :cond_2

    new-instance v0, La/a/a/c/a;

    const-string v1, "zip headers not found. probably not a zip file"

    invoke-direct {v0, v1}, La/a/a/c/a;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v0

    new-instance v1, La/a/a/c/a;

    const-string v2, "Probably not a zip file or a corrupted zip file"

    invoke-direct {v1, v2, v0, v8}, La/a/a/c/a;-><init>(Ljava/lang/String;Ljava/lang/Throwable;I)V

    throw v1

    :cond_2
    const/4 v0, 0x4

    :try_start_1
    new-array v0, v0, [B

    const/4 v1, 0x2

    new-array v1, v1, [B

    const-wide/32 v2, 0x6054b50

    invoke-virtual {v6, v2, v3}, La/a/a/e/d;->a(J)V

    iget-object v2, p0, La/a/a/a/a;->a:Ljava/io/RandomAccessFile;

    invoke-direct {p0, v2, v1}, La/a/a/a/a;->a(Ljava/io/RandomAccessFile;[B)[B

    const/4 v2, 0x0

    invoke-static {v1, v2}, La/a/a/h/b;->b([BI)I

    move-result v2

    invoke-virtual {v6, v2}, La/a/a/e/d;->a(I)V

    iget-object v2, p0, La/a/a/a/a;->a:Ljava/io/RandomAccessFile;

    invoke-direct {p0, v2, v1}, La/a/a/a/a;->a(Ljava/io/RandomAccessFile;[B)[B

    const/4 v2, 0x0

    invoke-static {v1, v2}, La/a/a/h/b;->b([BI)I

    move-result v2

    invoke-virtual {v6, v2}, La/a/a/e/d;->b(I)V

    iget-object v2, p0, La/a/a/a/a;->a:Ljava/io/RandomAccessFile;

    invoke-direct {p0, v2, v1}, La/a/a/a/a;->a(Ljava/io/RandomAccessFile;[B)[B

    const/4 v2, 0x0

    invoke-static {v1, v2}, La/a/a/h/b;->b([BI)I

    move-result v2

    invoke-virtual {v6, v2}, La/a/a/e/d;->c(I)V

    iget-object v2, p0, La/a/a/a/a;->a:Ljava/io/RandomAccessFile;

    invoke-direct {p0, v2, v1}, La/a/a/a/a;->a(Ljava/io/RandomAccessFile;[B)[B

    const/4 v2, 0x0

    invoke-static {v1, v2}, La/a/a/h/b;->b([BI)I

    move-result v2

    invoke-virtual {v6, v2}, La/a/a/e/d;->d(I)V

    iget-object v2, p0, La/a/a/a/a;->a:Ljava/io/RandomAccessFile;

    invoke-direct {p0, v2, v0}, La/a/a/a/a;->a(Ljava/io/RandomAccessFile;[B)[B

    const/4 v2, 0x0

    invoke-static {v0, v2}, La/a/a/h/b;->d([BI)I

    move-result v2

    invoke-virtual {v6, v2}, La/a/a/e/d;->e(I)V

    iget-object v2, p0, La/a/a/a/a;->a:Ljava/io/RandomAccessFile;

    invoke-direct {p0, v2, v0}, La/a/a/a/a;->a(Ljava/io/RandomAccessFile;[B)[B

    invoke-direct {p0, v0}, La/a/a/a/a;->a([B)[B

    move-result-object v0

    const/4 v2, 0x0

    invoke-static {v0, v2}, La/a/a/h/b;->a([BI)J

    move-result-wide v2

    invoke-virtual {v6, v2, v3}, La/a/a/e/d;->b(J)V

    iget-object v0, p0, La/a/a/a/a;->a:Ljava/io/RandomAccessFile;

    invoke-direct {p0, v0, v1}, La/a/a/a/a;->a(Ljava/io/RandomAccessFile;[B)[B

    const/4 v0, 0x0

    invoke-static {v1, v0}, La/a/a/h/b;->b([BI)I

    move-result v0

    invoke-virtual {v6, v0}, La/a/a/e/d;->f(I)V

    if-lez v0, :cond_3

    new-array v0, v0, [B

    iget-object v1, p0, La/a/a/a/a;->a:Ljava/io/RandomAccessFile;

    invoke-direct {p0, v1, v0}, La/a/a/a/a;->a(Ljava/io/RandomAccessFile;[B)[B

    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v0}, Ljava/lang/String;-><init>([B)V

    invoke-virtual {v6, v1}, La/a/a/e/d;->a(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, La/a/a/e/d;->a([B)V

    :goto_1
    invoke-virtual {v6}, La/a/a/e/d;->a()I

    move-result v0

    if-lez v0, :cond_4

    iget-object v0, p0, La/a/a/a/a;->b:La/a/a/e/l;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, La/a/a/e/l;->a(Z)V

    :goto_2
    return-object v6

    :cond_3
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, La/a/a/e/d;->a(Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    iget-object v0, p0, La/a/a/a/a;->b:La/a/a/e/l;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, La/a/a/e/l;->a(Z)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :cond_5
    move-wide v2, v4

    goto/16 :goto_0
.end method

.method private a(Ljava/util/ArrayList;JJJI)La/a/a/e/k;
    .locals 12

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lt v1, v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    :goto_1
    return-object v0

    :cond_1
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/a/a/e/e;

    if-nez v0, :cond_3

    :cond_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_3
    invoke-virtual {v0}, La/a/a/e/e;->a()J

    move-result-wide v2

    const-wide/16 v4, 0x1

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    new-instance v1, La/a/a/e/k;

    invoke-direct {v1}, La/a/a/e/k;-><init>()V

    invoke-virtual {v0}, La/a/a/e/e;->c()[B

    move-result-object v4

    invoke-virtual {v0}, La/a/a/e/e;->b()I

    move-result v2

    if-lez v2, :cond_0

    const/16 v2, 0x8

    new-array v5, v2, [B

    const/4 v2, 0x4

    new-array v6, v2, [B

    const/4 v3, 0x0

    const/4 v2, 0x0

    const-wide/32 v8, 0xffff

    and-long/2addr v8, p2

    const-wide/32 v10, 0xffff

    cmp-long v7, v8, v10

    if-nez v7, :cond_4

    invoke-virtual {v0}, La/a/a/e/e;->b()I

    move-result v7

    if-ge v3, v7, :cond_4

    const/4 v2, 0x0

    const/16 v7, 0x8

    invoke-static {v4, v3, v5, v2, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/4 v2, 0x0

    invoke-static {v5, v2}, La/a/a/h/b;->a([BI)J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, La/a/a/e/k;->b(J)V

    const/16 v3, 0x8

    const/4 v2, 0x1

    :cond_4
    const-wide/32 v8, 0xffff

    and-long v8, v8, p4

    const-wide/32 v10, 0xffff

    cmp-long v7, v8, v10

    if-nez v7, :cond_5

    invoke-virtual {v0}, La/a/a/e/e;->b()I

    move-result v7

    if-ge v3, v7, :cond_5

    const/4 v2, 0x0

    const/16 v7, 0x8

    invoke-static {v4, v3, v5, v2, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/4 v2, 0x0

    invoke-static {v5, v2}, La/a/a/h/b;->a([BI)J

    move-result-wide v8

    invoke-virtual {v1, v8, v9}, La/a/a/e/k;->a(J)V

    add-int/lit8 v3, v3, 0x8

    const/4 v2, 0x1

    :cond_5
    const-wide/32 v8, 0xffff

    and-long v8, v8, p6

    const-wide/32 v10, 0xffff

    cmp-long v7, v8, v10

    if-nez v7, :cond_6

    invoke-virtual {v0}, La/a/a/e/e;->b()I

    move-result v7

    if-ge v3, v7, :cond_6

    const/4 v2, 0x0

    const/16 v7, 0x8

    invoke-static {v4, v3, v5, v2, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/4 v2, 0x0

    invoke-static {v5, v2}, La/a/a/h/b;->a([BI)J

    move-result-wide v8

    invoke-virtual {v1, v8, v9}, La/a/a/e/k;->c(J)V

    add-int/lit8 v3, v3, 0x8

    const/4 v2, 0x1

    :cond_6
    const v5, 0xffff

    and-int v5, v5, p8

    const v7, 0xffff

    if-ne v5, v7, :cond_7

    invoke-virtual {v0}, La/a/a/e/e;->b()I

    move-result v0

    if-ge v3, v0, :cond_7

    const/4 v0, 0x0

    const/4 v2, 0x4

    invoke-static {v4, v3, v6, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/4 v0, 0x0

    invoke-static {v6, v0}, La/a/a/h/b;->d([BI)I

    move-result v0

    invoke-virtual {v1, v0}, La/a/a/e/k;->a(I)V

    add-int/lit8 v0, v3, 0x8

    const/4 v0, 0x1

    :goto_2
    if-eqz v0, :cond_0

    move-object v0, v1

    goto/16 :goto_1

    :cond_7
    move v0, v2

    goto :goto_2
.end method

.method private a(I)Ljava/util/ArrayList;
    .locals 8

    const/4 v0, 0x0

    const/4 v2, 0x0

    if-gtz p1, :cond_1

    :cond_0
    :goto_0
    return-object v0

    :cond_1
    :try_start_0
    new-array v3, p1, [B

    iget-object v1, p0, La/a/a/a/a;->a:Ljava/io/RandomAccessFile;

    invoke-virtual {v1, v3}, Ljava/io/RandomAccessFile;->read([B)I

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    :goto_1
    if-lt v2, p1, :cond_3

    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lez v2, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_3
    new-instance v4, La/a/a/e/e;

    invoke-direct {v4}, La/a/a/e/e;-><init>()V

    invoke-static {v3, v2}, La/a/a/h/b;->b([BI)I

    move-result v5

    int-to-long v6, v5

    invoke-virtual {v4, v6, v7}, La/a/a/e/e;->a(J)V

    add-int/lit8 v5, v2, 0x2

    invoke-static {v3, v5}, La/a/a/h/b;->b([BI)I

    move-result v2

    add-int/lit8 v6, v2, 0x2

    if-le v6, p1, :cond_4

    invoke-static {v3, v5}, La/a/a/h/b;->c([BI)S

    move-result v2

    add-int/lit8 v6, v2, 0x2

    if-gt v6, p1, :cond_2

    :cond_4
    invoke-virtual {v4, v2}, La/a/a/e/e;->a(I)V

    add-int/lit8 v5, v5, 0x2

    if-lez v2, :cond_5

    new-array v6, v2, [B

    const/4 v7, 0x0

    invoke-static {v3, v5, v6, v7, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-virtual {v4, v6}, La/a/a/e/e;->a([B)V

    :cond_5
    add-int/2addr v2, v5

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    new-instance v1, La/a/a/c/a;

    invoke-direct {v1, v0}, La/a/a/c/a;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method private a(La/a/a/e/g;)V
    .locals 2

    iget-object v0, p0, La/a/a/a/a;->a:Ljava/io/RandomAccessFile;

    if-nez v0, :cond_0

    new-instance v0, La/a/a/c/a;

    const-string v1, "invalid file handler when trying to read extra data record"

    invoke-direct {v0, v1}, La/a/a/c/a;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    if-nez p1, :cond_1

    new-instance v0, La/a/a/c/a;

    const-string v1, "file header is null"

    invoke-direct {v0, v1}, La/a/a/c/a;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-virtual {p1}, La/a/a/e/g;->e()I

    move-result v0

    if-gtz v0, :cond_2

    :goto_0
    return-void

    :cond_2
    invoke-direct {p0, v0}, La/a/a/a/a;->a(I)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {p1, v0}, La/a/a/e/g;->a(Ljava/util/ArrayList;)V

    goto :goto_0
.end method

.method private a(Ljava/io/RandomAccessFile;[B)[B
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    array-length v1, p2

    invoke-virtual {p1, p2, v0, v1}, Ljava/io/RandomAccessFile;->read([BII)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return-object p2

    :cond_0
    new-instance v0, La/a/a/c/a;

    const-string v1, "unexpected end of file when reading short buff"

    invoke-direct {v0, v1}, La/a/a/c/a;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v0

    new-instance v1, La/a/a/c/a;

    const-string v2, "IOException when reading short buff"

    invoke-direct {v1, v2, v0}, La/a/a/c/a;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method private a([B)[B
    .locals 6

    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    if-nez p1, :cond_0

    new-instance v0, La/a/a/c/a;

    const-string v1, "input parameter is null, cannot expand to 8 bytes"

    invoke-direct {v0, v1}, La/a/a/c/a;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    array-length v0, p1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    new-instance v0, La/a/a/c/a;

    const-string v1, "invalid byte length, cannot expand to 8 bytes"

    invoke-direct {v0, v1}, La/a/a/c/a;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    const/16 v0, 0x8

    new-array v0, v0, [B

    aget-byte v1, p1, v2

    aput-byte v1, v0, v2

    aget-byte v1, p1, v3

    aput-byte v1, v0, v3

    aget-byte v1, p1, v4

    aput-byte v1, v0, v4

    aget-byte v1, p1, v5

    aput-byte v1, v0, v5

    return-object v0
.end method

.method private b()La/a/a/e/b;
    .locals 14

    iget-object v0, p0, La/a/a/a/a;->a:Ljava/io/RandomAccessFile;

    if-nez v0, :cond_0

    new-instance v0, La/a/a/c/a;

    const-string v1, "random access file was null"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, La/a/a/c/a;-><init>(Ljava/lang/String;I)V

    throw v0

    :cond_0
    iget-object v0, p0, La/a/a/a/a;->b:La/a/a/e/l;

    invoke-virtual {v0}, La/a/a/e/l;->b()La/a/a/e/d;

    move-result-object v0

    if-nez v0, :cond_1

    new-instance v0, La/a/a/c/a;

    const-string v1, "EndCentralRecord was null, maybe a corrupt zip file"

    invoke-direct {v0, v1}, La/a/a/c/a;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :try_start_0
    new-instance v1, La/a/a/e/b;

    invoke-direct {v1}, La/a/a/e/b;-><init>()V

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, p0, La/a/a/a/a;->b:La/a/a/e/l;

    invoke-virtual {v0}, La/a/a/e/l;->b()La/a/a/e/d;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/e/d;->c()J

    move-result-wide v2

    invoke-virtual {v0}, La/a/a/e/d;->b()I

    move-result v0

    iget-object v4, p0, La/a/a/a/a;->b:La/a/a/e/l;

    invoke-virtual {v4}, La/a/a/e/l;->g()Z

    move-result v4

    if-eqz v4, :cond_f

    iget-object v0, p0, La/a/a/a/a;->b:La/a/a/e/l;

    invoke-virtual {v0}, La/a/a/e/l;->f()La/a/a/e/j;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/e/j;->d()J

    move-result-wide v2

    iget-object v0, p0, La/a/a/a/a;->b:La/a/a/e/l;

    invoke-virtual {v0}, La/a/a/e/l;->f()La/a/a/e/j;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/e/j;->c()J

    move-result-wide v4

    long-to-int v0, v4

    move-wide v4, v2

    move v3, v0

    :goto_0
    iget-object v0, p0, La/a/a/a/a;->a:Ljava/io/RandomAccessFile;

    invoke-virtual {v0, v4, v5}, Ljava/io/RandomAccessFile;->seek(J)V

    const/4 v0, 0x4

    new-array v4, v0, [B

    const/4 v0, 0x2

    new-array v5, v0, [B

    const/16 v0, 0x8

    new-array v0, v0, [B

    const/4 v0, 0x0

    move v2, v0

    :goto_1
    if-lt v2, v3, :cond_2

    invoke-virtual {v1, v6}, La/a/a/e/b;->a(Ljava/util/ArrayList;)V

    new-instance v0, La/a/a/e/c;

    invoke-direct {v0}, La/a/a/e/c;-><init>()V

    iget-object v2, p0, La/a/a/a/a;->a:Ljava/io/RandomAccessFile;

    invoke-direct {p0, v2, v4}, La/a/a/a/a;->a(Ljava/io/RandomAccessFile;[B)[B

    const/4 v2, 0x0

    invoke-static {v4, v2}, La/a/a/h/b;->d([BI)I

    move-result v2

    int-to-long v6, v2

    const-wide/32 v8, 0x5054b50

    cmp-long v3, v6, v8

    if-eqz v3, :cond_d

    move-object v0, v1

    :goto_2
    return-object v0

    :cond_2
    new-instance v7, La/a/a/e/f;

    invoke-direct {v7}, La/a/a/e/f;-><init>()V

    iget-object v0, p0, La/a/a/a/a;->a:Ljava/io/RandomAccessFile;

    invoke-direct {p0, v0, v4}, La/a/a/a/a;->a(Ljava/io/RandomAccessFile;[B)[B

    const/4 v0, 0x0

    invoke-static {v4, v0}, La/a/a/h/b;->d([BI)I

    move-result v0

    int-to-long v8, v0

    const-wide/32 v10, 0x2014b50    # 1.6619997E-316

    cmp-long v8, v8, v10

    if-eqz v8, :cond_3

    new-instance v0, La/a/a/c/a;

    new-instance v1, Ljava/lang/StringBuffer;

    const-string v3, "Expected central directory entry not found (#"

    invoke-direct {v1, v3}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v1

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, La/a/a/c/a;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v0

    new-instance v1, La/a/a/c/a;

    invoke-direct {v1, v0}, La/a/a/c/a;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :cond_3
    :try_start_1
    invoke-virtual {v7, v0}, La/a/a/e/f;->a(I)V

    iget-object v0, p0, La/a/a/a/a;->a:Ljava/io/RandomAccessFile;

    invoke-direct {p0, v0, v5}, La/a/a/a/a;->a(Ljava/io/RandomAccessFile;[B)[B

    const/4 v0, 0x0

    invoke-static {v5, v0}, La/a/a/h/b;->b([BI)I

    move-result v0

    invoke-virtual {v7, v0}, La/a/a/e/f;->b(I)V

    iget-object v0, p0, La/a/a/a/a;->a:Ljava/io/RandomAccessFile;

    invoke-direct {p0, v0, v5}, La/a/a/a/a;->a(Ljava/io/RandomAccessFile;[B)[B

    const/4 v0, 0x0

    invoke-static {v5, v0}, La/a/a/h/b;->b([BI)I

    move-result v0

    invoke-virtual {v7, v0}, La/a/a/e/f;->c(I)V

    iget-object v0, p0, La/a/a/a/a;->a:Ljava/io/RandomAccessFile;

    invoke-direct {p0, v0, v5}, La/a/a/a/a;->a(Ljava/io/RandomAccessFile;[B)[B

    const/4 v0, 0x0

    invoke-static {v5, v0}, La/a/a/h/b;->b([BI)I

    move-result v0

    and-int/lit16 v0, v0, 0x800

    if-eqz v0, :cond_5

    const/4 v0, 0x1

    :goto_3
    invoke-virtual {v7, v0}, La/a/a/e/f;->d(Z)V

    const/4 v0, 0x0

    aget-byte v8, v5, v0

    and-int/lit8 v0, v8, 0x1

    if-eqz v0, :cond_4

    const/4 v0, 0x1

    invoke-virtual {v7, v0}, La/a/a/e/f;->b(Z)V

    :cond_4
    invoke-virtual {v5}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    invoke-virtual {v7, v0}, La/a/a/e/f;->a([B)V

    shr-int/lit8 v0, v8, 0x3

    const/4 v8, 0x1

    if-ne v0, v8, :cond_6

    const/4 v0, 0x1

    :goto_4
    invoke-virtual {v7, v0}, La/a/a/e/f;->c(Z)V

    iget-object v0, p0, La/a/a/a/a;->a:Ljava/io/RandomAccessFile;

    invoke-direct {p0, v0, v5}, La/a/a/a/a;->a(Ljava/io/RandomAccessFile;[B)[B

    const/4 v0, 0x0

    invoke-static {v5, v0}, La/a/a/h/b;->b([BI)I

    move-result v0

    invoke-virtual {v7, v0}, La/a/a/e/f;->d(I)V

    iget-object v0, p0, La/a/a/a/a;->a:Ljava/io/RandomAccessFile;

    invoke-direct {p0, v0, v4}, La/a/a/a/a;->a(Ljava/io/RandomAccessFile;[B)[B

    const/4 v0, 0x0

    invoke-static {v4, v0}, La/a/a/h/b;->d([BI)I

    move-result v0

    invoke-virtual {v7, v0}, La/a/a/e/f;->e(I)V

    iget-object v0, p0, La/a/a/a/a;->a:Ljava/io/RandomAccessFile;

    invoke-direct {p0, v0, v4}, La/a/a/a/a;->a(Ljava/io/RandomAccessFile;[B)[B

    const/4 v0, 0x0

    invoke-static {v4, v0}, La/a/a/h/b;->d([BI)I

    move-result v0

    int-to-long v8, v0

    invoke-virtual {v7, v8, v9}, La/a/a/e/f;->a(J)V

    invoke-virtual {v4}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    invoke-virtual {v7, v0}, La/a/a/e/f;->d([B)V

    iget-object v0, p0, La/a/a/a/a;->a:Ljava/io/RandomAccessFile;

    invoke-direct {p0, v0, v4}, La/a/a/a/a;->a(Ljava/io/RandomAccessFile;[B)[B

    invoke-direct {p0, v4}, La/a/a/a/a;->a([B)[B

    move-result-object v0

    const/4 v8, 0x0

    invoke-static {v0, v8}, La/a/a/h/b;->a([BI)J

    move-result-wide v8

    invoke-virtual {v7, v8, v9}, La/a/a/e/f;->b(J)V

    iget-object v0, p0, La/a/a/a/a;->a:Ljava/io/RandomAccessFile;

    invoke-direct {p0, v0, v4}, La/a/a/a/a;->a(Ljava/io/RandomAccessFile;[B)[B

    invoke-direct {p0, v4}, La/a/a/a/a;->a([B)[B

    move-result-object v0

    const/4 v8, 0x0

    invoke-static {v0, v8}, La/a/a/h/b;->a([BI)J

    move-result-wide v8

    invoke-virtual {v7, v8, v9}, La/a/a/e/f;->c(J)V

    iget-object v0, p0, La/a/a/a/a;->a:Ljava/io/RandomAccessFile;

    invoke-direct {p0, v0, v5}, La/a/a/a/a;->a(Ljava/io/RandomAccessFile;[B)[B

    const/4 v0, 0x0

    invoke-static {v5, v0}, La/a/a/h/b;->b([BI)I

    move-result v8

    invoke-virtual {v7, v8}, La/a/a/e/f;->f(I)V

    iget-object v0, p0, La/a/a/a/a;->a:Ljava/io/RandomAccessFile;

    invoke-direct {p0, v0, v5}, La/a/a/a/a;->a(Ljava/io/RandomAccessFile;[B)[B

    const/4 v0, 0x0

    invoke-static {v5, v0}, La/a/a/h/b;->b([BI)I

    move-result v0

    invoke-virtual {v7, v0}, La/a/a/e/f;->g(I)V

    iget-object v0, p0, La/a/a/a/a;->a:Ljava/io/RandomAccessFile;

    invoke-direct {p0, v0, v5}, La/a/a/a/a;->a(Ljava/io/RandomAccessFile;[B)[B

    const/4 v0, 0x0

    invoke-static {v5, v0}, La/a/a/h/b;->b([BI)I

    move-result v9

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([B)V

    invoke-virtual {v7, v0}, La/a/a/e/f;->b(Ljava/lang/String;)V

    iget-object v0, p0, La/a/a/a/a;->a:Ljava/io/RandomAccessFile;

    invoke-direct {p0, v0, v5}, La/a/a/a/a;->a(Ljava/io/RandomAccessFile;[B)[B

    const/4 v0, 0x0

    invoke-static {v5, v0}, La/a/a/h/b;->b([BI)I

    move-result v0

    invoke-virtual {v7, v0}, La/a/a/e/f;->h(I)V

    iget-object v0, p0, La/a/a/a/a;->a:Ljava/io/RandomAccessFile;

    invoke-direct {p0, v0, v5}, La/a/a/a/a;->a(Ljava/io/RandomAccessFile;[B)[B

    invoke-virtual {v5}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    invoke-virtual {v7, v0}, La/a/a/e/f;->b([B)V

    iget-object v0, p0, La/a/a/a/a;->a:Ljava/io/RandomAccessFile;

    invoke-direct {p0, v0, v4}, La/a/a/a/a;->a(Ljava/io/RandomAccessFile;[B)[B

    invoke-virtual {v4}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    invoke-virtual {v7, v0}, La/a/a/e/f;->c([B)V

    iget-object v0, p0, La/a/a/a/a;->a:Ljava/io/RandomAccessFile;

    invoke-direct {p0, v0, v4}, La/a/a/a/a;->a(Ljava/io/RandomAccessFile;[B)[B

    invoke-direct {p0, v4}, La/a/a/a/a;->a([B)[B

    move-result-object v0

    const/4 v10, 0x0

    invoke-static {v0, v10}, La/a/a/h/b;->a([BI)J

    move-result-wide v10

    const-wide v12, 0xffffffffL

    and-long/2addr v10, v12

    invoke-virtual {v7, v10, v11}, La/a/a/e/f;->d(J)V

    if-lez v8, :cond_c

    new-array v8, v8, [B

    iget-object v0, p0, La/a/a/a/a;->a:Ljava/io/RandomAccessFile;

    invoke-direct {p0, v0, v8}, La/a/a/a/a;->a(Ljava/io/RandomAccessFile;[B)[B

    iget-object v0, p0, La/a/a/a/a;->b:La/a/a/e/l;

    invoke-virtual {v0}, La/a/a/e/l;->h()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, La/a/a/h/c;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    new-instance v0, Ljava/lang/String;

    iget-object v10, p0, La/a/a/a/a;->b:La/a/a/e/l;

    invoke-virtual {v10}, La/a/a/e/l;->h()Ljava/lang/String;

    move-result-object v10

    invoke-direct {v0, v8, v10}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    :goto_5
    if-nez v0, :cond_8

    new-instance v0, La/a/a/c/a;

    const-string v1, "fileName is null when reading central directory"

    invoke-direct {v0, v1}, La/a/a/c/a;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    const/4 v0, 0x0

    goto/16 :goto_3

    :cond_6
    const/4 v0, 0x0

    goto/16 :goto_4

    :cond_7
    invoke-virtual {v7}, La/a/a/e/f;->s()Z

    move-result v0

    invoke-static {v8, v0}, La/a/a/h/c;->a([BZ)Ljava/lang/String;

    move-result-object v0

    goto :goto_5

    :cond_8
    new-instance v8, Ljava/lang/StringBuffer;

    const-string v10, ":"

    invoke-direct {v8, v10}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    const-string v10, "file.separator"

    invoke-static {v10}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v10}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v8}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v8

    if-ltz v8, :cond_9

    new-instance v8, Ljava/lang/StringBuffer;

    const-string v10, ":"

    invoke-direct {v8, v10}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    const-string v10, "file.separator"

    invoke-static {v10}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v10}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v8}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v8

    add-int/lit8 v8, v8, 0x2

    invoke-virtual {v0, v8}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    :cond_9
    invoke-virtual {v7, v0}, La/a/a/e/f;->a(Ljava/lang/String;)V

    const-string v8, "/"

    invoke-virtual {v0, v8}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_b

    const-string v8, "\\"

    invoke-virtual {v0, v8}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_b

    const/4 v0, 0x0

    :goto_6
    invoke-virtual {v7, v0}, La/a/a/e/f;->a(Z)V

    :goto_7
    invoke-direct {p0, v7}, La/a/a/a/a;->b(La/a/a/e/f;)V

    invoke-direct {p0, v7}, La/a/a/a/a;->c(La/a/a/e/f;)V

    invoke-direct {p0, v7}, La/a/a/a/a;->d(La/a/a/e/f;)V

    if-lez v9, :cond_a

    new-array v0, v9, [B

    iget-object v8, p0, La/a/a/a/a;->a:Ljava/io/RandomAccessFile;

    invoke-direct {p0, v8, v0}, La/a/a/a/a;->a(Ljava/io/RandomAccessFile;[B)[B

    new-instance v8, Ljava/lang/String;

    invoke-direct {v8, v0}, Ljava/lang/String;-><init>([B)V

    invoke-virtual {v7, v8}, La/a/a/e/f;->b(Ljava/lang/String;)V

    :cond_a
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto/16 :goto_1

    :cond_b
    const/4 v0, 0x1

    goto :goto_6

    :cond_c
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, La/a/a/e/f;->a(Ljava/lang/String;)V

    goto :goto_7

    :cond_d
    invoke-virtual {v0, v2}, La/a/a/e/c;->a(I)V

    iget-object v2, p0, La/a/a/a/a;->a:Ljava/io/RandomAccessFile;

    invoke-direct {p0, v2, v5}, La/a/a/a/a;->a(Ljava/io/RandomAccessFile;[B)[B

    const/4 v2, 0x0

    invoke-static {v5, v2}, La/a/a/h/b;->b([BI)I

    move-result v2

    invoke-virtual {v0, v2}, La/a/a/e/c;->b(I)V

    if-lez v2, :cond_e

    new-array v2, v2, [B

    iget-object v3, p0, La/a/a/a/a;->a:Ljava/io/RandomAccessFile;

    invoke-direct {p0, v3, v2}, La/a/a/a/a;->a(Ljava/io/RandomAccessFile;[B)[B

    new-instance v3, Ljava/lang/String;

    invoke-direct {v3, v2}, Ljava/lang/String;-><init>([B)V

    invoke-virtual {v0, v3}, La/a/a/e/c;->a(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    :cond_e
    move-object v0, v1

    goto/16 :goto_2

    :cond_f
    move-wide v4, v2

    move v3, v0

    goto/16 :goto_0
.end method

.method private b(La/a/a/e/f;)V
    .locals 2

    iget-object v0, p0, La/a/a/a/a;->a:Ljava/io/RandomAccessFile;

    if-nez v0, :cond_0

    new-instance v0, La/a/a/c/a;

    const-string v1, "invalid file handler when trying to read extra data record"

    invoke-direct {v0, v1}, La/a/a/c/a;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    if-nez p1, :cond_1

    new-instance v0, La/a/a/c/a;

    const-string v1, "file header is null"

    invoke-direct {v0, v1}, La/a/a/c/a;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-virtual {p1}, La/a/a/e/f;->f()I

    move-result v0

    if-gtz v0, :cond_2

    :goto_0
    return-void

    :cond_2
    invoke-direct {p0, v0}, La/a/a/a/a;->a(I)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {p1, v0}, La/a/a/e/f;->a(Ljava/util/ArrayList;)V

    goto :goto_0
.end method

.method private b(La/a/a/e/g;)V
    .locals 9

    const-wide/16 v6, -0x1

    if-nez p1, :cond_0

    new-instance v0, La/a/a/c/a;

    const-string v1, "file header is null in reading Zip64 Extended Info"

    invoke-direct {v0, v1}, La/a/a/c/a;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-virtual {p1}, La/a/a/e/g;->k()Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, La/a/a/e/g;->k()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_2

    :cond_1
    :goto_0
    return-void

    :cond_2
    invoke-virtual {p1}, La/a/a/e/g;->k()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {p1}, La/a/a/e/g;->d()J

    move-result-wide v2

    invoke-virtual {p1}, La/a/a/e/g;->c()J

    move-result-wide v4

    const/4 v8, -0x1

    move-object v0, p0

    invoke-direct/range {v0 .. v8}, La/a/a/a/a;->a(Ljava/util/ArrayList;JJJI)La/a/a/e/k;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1, v0}, La/a/a/e/g;->a(La/a/a/e/k;)V

    invoke-virtual {v0}, La/a/a/e/k;->b()J

    move-result-wide v2

    cmp-long v1, v2, v6

    if-eqz v1, :cond_3

    invoke-virtual {v0}, La/a/a/e/k;->b()J

    move-result-wide v2

    invoke-virtual {p1, v2, v3}, La/a/a/e/g;->c(J)V

    :cond_3
    invoke-virtual {v0}, La/a/a/e/k;->a()J

    move-result-wide v2

    cmp-long v1, v2, v6

    if-eqz v1, :cond_1

    invoke-virtual {v0}, La/a/a/e/k;->a()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, La/a/a/e/g;->b(J)V

    goto :goto_0
.end method

.method private c()La/a/a/e/i;
    .locals 8

    iget-object v0, p0, La/a/a/a/a;->a:Ljava/io/RandomAccessFile;

    if-nez v0, :cond_0

    new-instance v0, La/a/a/c/a;

    const-string v1, "invalid file handler when trying to read Zip64EndCentralDirLocator"

    invoke-direct {v0, v1}, La/a/a/c/a;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    :try_start_0
    new-instance v0, La/a/a/e/i;

    invoke-direct {v0}, La/a/a/e/i;-><init>()V

    invoke-direct {p0}, La/a/a/a/a;->e()V

    const/4 v1, 0x4

    new-array v1, v1, [B

    const/16 v2, 0x8

    new-array v2, v2, [B

    iget-object v3, p0, La/a/a/a/a;->a:Ljava/io/RandomAccessFile;

    invoke-direct {p0, v3, v1}, La/a/a/a/a;->a(Ljava/io/RandomAccessFile;[B)[B

    const/4 v3, 0x0

    invoke-static {v1, v3}, La/a/a/h/b;->d([BI)I

    move-result v3

    int-to-long v4, v3

    const-wide/32 v6, 0x7064b50

    cmp-long v4, v4, v6

    if-nez v4, :cond_1

    iget-object v4, p0, La/a/a/a/a;->b:La/a/a/e/l;

    const/4 v5, 0x1

    invoke-virtual {v4, v5}, La/a/a/e/l;->b(Z)V

    int-to-long v4, v3

    invoke-virtual {v0, v4, v5}, La/a/a/e/i;->a(J)V

    iget-object v3, p0, La/a/a/a/a;->a:Ljava/io/RandomAccessFile;

    invoke-direct {p0, v3, v1}, La/a/a/a/a;->a(Ljava/io/RandomAccessFile;[B)[B

    const/4 v3, 0x0

    invoke-static {v1, v3}, La/a/a/h/b;->d([BI)I

    move-result v3

    invoke-virtual {v0, v3}, La/a/a/e/i;->a(I)V

    iget-object v3, p0, La/a/a/a/a;->a:Ljava/io/RandomAccessFile;

    invoke-direct {p0, v3, v2}, La/a/a/a/a;->a(Ljava/io/RandomAccessFile;[B)[B

    const/4 v3, 0x0

    invoke-static {v2, v3}, La/a/a/h/b;->a([BI)J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, La/a/a/e/i;->b(J)V

    iget-object v2, p0, La/a/a/a/a;->a:Ljava/io/RandomAccessFile;

    invoke-direct {p0, v2, v1}, La/a/a/a/a;->a(Ljava/io/RandomAccessFile;[B)[B

    const/4 v2, 0x0

    invoke-static {v1, v2}, La/a/a/h/b;->d([BI)I

    move-result v1

    invoke-virtual {v0, v1}, La/a/a/e/i;->b(I)V

    :goto_0
    return-object v0

    :cond_1
    iget-object v0, p0, La/a/a/a/a;->b:La/a/a/e/l;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, La/a/a/e/l;->b(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, La/a/a/c/a;

    invoke-direct {v1, v0}, La/a/a/c/a;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method private c(La/a/a/e/f;)V
    .locals 12

    const-wide/16 v10, -0x1

    if-nez p1, :cond_0

    new-instance v0, La/a/a/c/a;

    const-string v1, "file header is null in reading Zip64 Extended Info"

    invoke-direct {v0, v1}, La/a/a/c/a;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-virtual {p1}, La/a/a/e/f;->p()Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, La/a/a/e/f;->p()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_2

    :cond_1
    :goto_0
    return-void

    :cond_2
    invoke-virtual {p1}, La/a/a/e/f;->p()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {p1}, La/a/a/e/f;->e()J

    move-result-wide v2

    invoke-virtual {p1}, La/a/a/e/f;->d()J

    move-result-wide v4

    invoke-virtual {p1}, La/a/a/e/f;->i()J

    move-result-wide v6

    invoke-virtual {p1}, La/a/a/e/f;->g()I

    move-result v8

    move-object v0, p0

    invoke-direct/range {v0 .. v8}, La/a/a/a/a;->a(Ljava/util/ArrayList;JJJI)La/a/a/e/k;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1, v0}, La/a/a/e/f;->a(La/a/a/e/k;)V

    invoke-virtual {v0}, La/a/a/e/k;->b()J

    move-result-wide v2

    cmp-long v1, v2, v10

    if-eqz v1, :cond_3

    invoke-virtual {v0}, La/a/a/e/k;->b()J

    move-result-wide v2

    invoke-virtual {p1, v2, v3}, La/a/a/e/f;->c(J)V

    :cond_3
    invoke-virtual {v0}, La/a/a/e/k;->a()J

    move-result-wide v2

    cmp-long v1, v2, v10

    if-eqz v1, :cond_4

    invoke-virtual {v0}, La/a/a/e/k;->a()J

    move-result-wide v2

    invoke-virtual {p1, v2, v3}, La/a/a/e/f;->b(J)V

    :cond_4
    invoke-virtual {v0}, La/a/a/e/k;->c()J

    move-result-wide v2

    cmp-long v1, v2, v10

    if-eqz v1, :cond_5

    invoke-virtual {v0}, La/a/a/e/k;->c()J

    move-result-wide v2

    invoke-virtual {p1, v2, v3}, La/a/a/e/f;->d(J)V

    :cond_5
    invoke-virtual {v0}, La/a/a/e/k;->d()I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_1

    invoke-virtual {v0}, La/a/a/e/k;->d()I

    move-result v0

    invoke-virtual {p1, v0}, La/a/a/e/f;->h(I)V

    goto :goto_0
.end method

.method private c(La/a/a/e/g;)V
    .locals 2

    if-nez p1, :cond_0

    new-instance v0, La/a/a/c/a;

    const-string v1, "file header is null in reading Zip64 Extended Info"

    invoke-direct {v0, v1}, La/a/a/c/a;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-virtual {p1}, La/a/a/e/g;->k()Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, La/a/a/e/g;->k()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_2

    :cond_1
    :goto_0
    return-void

    :cond_2
    invoke-virtual {p1}, La/a/a/e/g;->k()Ljava/util/ArrayList;

    move-result-object v0

    invoke-direct {p0, v0}, La/a/a/a/a;->a(Ljava/util/ArrayList;)La/a/a/e/a;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1, v0}, La/a/a/e/g;->a(La/a/a/e/a;)V

    const/16 v0, 0x63

    invoke-virtual {p1, v0}, La/a/a/e/g;->g(I)V

    goto :goto_0
.end method

.method private d()La/a/a/e/j;
    .locals 12

    const-wide/16 v10, 0x0

    iget-object v0, p0, La/a/a/a/a;->b:La/a/a/e/l;

    invoke-virtual {v0}, La/a/a/e/l;->e()La/a/a/e/i;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, La/a/a/c/a;

    const-string v1, "invalid zip64 end of central directory locator"

    invoke-direct {v0, v1}, La/a/a/c/a;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, La/a/a/a/a;->b:La/a/a/e/l;

    invoke-virtual {v0}, La/a/a/e/l;->e()La/a/a/e/i;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/e/i;->a()J

    move-result-wide v0

    cmp-long v2, v0, v10

    if-gez v2, :cond_1

    new-instance v0, La/a/a/c/a;

    const-string v1, "invalid offset for start of end of central directory record"

    invoke-direct {v0, v1}, La/a/a/c/a;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :try_start_0
    iget-object v2, p0, La/a/a/a/a;->a:Ljava/io/RandomAccessFile;

    invoke-virtual {v2, v0, v1}, Ljava/io/RandomAccessFile;->seek(J)V

    new-instance v0, La/a/a/e/j;

    invoke-direct {v0}, La/a/a/e/j;-><init>()V

    const/4 v1, 0x2

    new-array v1, v1, [B

    const/4 v2, 0x4

    new-array v2, v2, [B

    const/16 v3, 0x8

    new-array v3, v3, [B

    iget-object v4, p0, La/a/a/a/a;->a:Ljava/io/RandomAccessFile;

    invoke-direct {p0, v4, v2}, La/a/a/a/a;->a(Ljava/io/RandomAccessFile;[B)[B

    const/4 v4, 0x0

    invoke-static {v2, v4}, La/a/a/h/b;->d([BI)I

    move-result v4

    int-to-long v6, v4

    const-wide/32 v8, 0x6064b50

    cmp-long v5, v6, v8

    if-eqz v5, :cond_2

    new-instance v0, La/a/a/c/a;

    const-string v1, "invalid signature for zip64 end of central directory record"

    invoke-direct {v0, v1}, La/a/a/c/a;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v0

    new-instance v1, La/a/a/c/a;

    invoke-direct {v1, v0}, La/a/a/c/a;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :cond_2
    int-to-long v4, v4

    :try_start_1
    invoke-virtual {v0, v4, v5}, La/a/a/e/j;->a(J)V

    iget-object v4, p0, La/a/a/a/a;->a:Ljava/io/RandomAccessFile;

    invoke-direct {p0, v4, v3}, La/a/a/a/a;->a(Ljava/io/RandomAccessFile;[B)[B

    const/4 v4, 0x0

    invoke-static {v3, v4}, La/a/a/h/b;->a([BI)J

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, La/a/a/e/j;->b(J)V

    iget-object v4, p0, La/a/a/a/a;->a:Ljava/io/RandomAccessFile;

    invoke-direct {p0, v4, v1}, La/a/a/a/a;->a(Ljava/io/RandomAccessFile;[B)[B

    const/4 v4, 0x0

    invoke-static {v1, v4}, La/a/a/h/b;->b([BI)I

    move-result v4

    invoke-virtual {v0, v4}, La/a/a/e/j;->a(I)V

    iget-object v4, p0, La/a/a/a/a;->a:Ljava/io/RandomAccessFile;

    invoke-direct {p0, v4, v1}, La/a/a/a/a;->a(Ljava/io/RandomAccessFile;[B)[B

    const/4 v4, 0x0

    invoke-static {v1, v4}, La/a/a/h/b;->b([BI)I

    move-result v1

    invoke-virtual {v0, v1}, La/a/a/e/j;->b(I)V

    iget-object v1, p0, La/a/a/a/a;->a:Ljava/io/RandomAccessFile;

    invoke-direct {p0, v1, v2}, La/a/a/a/a;->a(Ljava/io/RandomAccessFile;[B)[B

    const/4 v1, 0x0

    invoke-static {v2, v1}, La/a/a/h/b;->d([BI)I

    move-result v1

    invoke-virtual {v0, v1}, La/a/a/e/j;->c(I)V

    iget-object v1, p0, La/a/a/a/a;->a:Ljava/io/RandomAccessFile;

    invoke-direct {p0, v1, v2}, La/a/a/a/a;->a(Ljava/io/RandomAccessFile;[B)[B

    const/4 v1, 0x0

    invoke-static {v2, v1}, La/a/a/h/b;->d([BI)I

    move-result v1

    invoke-virtual {v0, v1}, La/a/a/e/j;->d(I)V

    iget-object v1, p0, La/a/a/a/a;->a:Ljava/io/RandomAccessFile;

    invoke-direct {p0, v1, v3}, La/a/a/a/a;->a(Ljava/io/RandomAccessFile;[B)[B

    const/4 v1, 0x0

    invoke-static {v3, v1}, La/a/a/h/b;->a([BI)J

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, La/a/a/e/j;->c(J)V

    iget-object v1, p0, La/a/a/a/a;->a:Ljava/io/RandomAccessFile;

    invoke-direct {p0, v1, v3}, La/a/a/a/a;->a(Ljava/io/RandomAccessFile;[B)[B

    const/4 v1, 0x0

    invoke-static {v3, v1}, La/a/a/h/b;->a([BI)J

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, La/a/a/e/j;->d(J)V

    iget-object v1, p0, La/a/a/a/a;->a:Ljava/io/RandomAccessFile;

    invoke-direct {p0, v1, v3}, La/a/a/a/a;->a(Ljava/io/RandomAccessFile;[B)[B

    const/4 v1, 0x0

    invoke-static {v3, v1}, La/a/a/h/b;->a([BI)J

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, La/a/a/e/j;->e(J)V

    iget-object v1, p0, La/a/a/a/a;->a:Ljava/io/RandomAccessFile;

    invoke-direct {p0, v1, v3}, La/a/a/a/a;->a(Ljava/io/RandomAccessFile;[B)[B

    const/4 v1, 0x0

    invoke-static {v3, v1}, La/a/a/h/b;->a([BI)J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, La/a/a/e/j;->f(J)V

    invoke-virtual {v0}, La/a/a/e/j;->a()J

    move-result-wide v2

    const-wide/16 v4, 0x2c

    sub-long/2addr v2, v4

    cmp-long v1, v2, v10

    if-lez v1, :cond_3

    long-to-int v1, v2

    new-array v1, v1, [B

    iget-object v2, p0, La/a/a/a/a;->a:Ljava/io/RandomAccessFile;

    invoke-direct {p0, v2, v1}, La/a/a/a/a;->a(Ljava/io/RandomAccessFile;[B)[B

    invoke-virtual {v0, v1}, La/a/a/e/j;->a([B)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    :cond_3
    return-object v0
.end method

.method private d(La/a/a/e/f;)V
    .locals 2

    if-nez p1, :cond_0

    new-instance v0, La/a/a/c/a;

    const-string v1, "file header is null in reading Zip64 Extended Info"

    invoke-direct {v0, v1}, La/a/a/c/a;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-virtual {p1}, La/a/a/e/f;->p()Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, La/a/a/e/f;->p()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_2

    :cond_1
    :goto_0
    return-void

    :cond_2
    invoke-virtual {p1}, La/a/a/e/f;->p()Ljava/util/ArrayList;

    move-result-object v0

    invoke-direct {p0, v0}, La/a/a/a/a;->a(Ljava/util/ArrayList;)La/a/a/e/a;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1, v0}, La/a/a/e/f;->a(La/a/a/e/a;)V

    const/16 v0, 0x63

    invoke-virtual {p1, v0}, La/a/a/e/f;->i(I)V

    goto :goto_0
.end method

.method private e()V
    .locals 10

    const-wide/16 v8, 0x4

    const/4 v0, 0x4

    :try_start_0
    new-array v4, v0, [B

    iget-object v0, p0, La/a/a/a/a;->a:Ljava/io/RandomAccessFile;

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->length()J

    move-result-wide v0

    const-wide/16 v2, 0x16

    sub-long/2addr v0, v2

    :goto_0
    iget-object v5, p0, La/a/a/a/a;->a:Ljava/io/RandomAccessFile;

    const-wide/16 v2, 0x1

    sub-long v2, v0, v2

    invoke-virtual {v5, v0, v1}, Ljava/io/RandomAccessFile;->seek(J)V

    iget-object v0, p0, La/a/a/a/a;->a:Ljava/io/RandomAccessFile;

    invoke-static {v0, v4}, La/a/a/h/b;->a(Ljava/io/DataInput;[B)I

    move-result v0

    int-to-long v0, v0

    const-wide/32 v6, 0x6054b50

    cmp-long v0, v0, v6

    if-nez v0, :cond_0

    iget-object v0, p0, La/a/a/a/a;->a:Ljava/io/RandomAccessFile;

    iget-object v1, p0, La/a/a/a/a;->a:Ljava/io/RandomAccessFile;

    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->getFilePointer()J

    move-result-wide v2

    sub-long/2addr v2, v8

    sub-long/2addr v2, v8

    const-wide/16 v4, 0x8

    sub-long/2addr v2, v4

    sub-long/2addr v2, v8

    sub-long/2addr v2, v8

    invoke-virtual {v0, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, La/a/a/c/a;

    invoke-direct {v1, v0}, La/a/a/c/a;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :cond_0
    move-wide v0, v2

    goto :goto_0
.end method


# virtual methods
.method public a(La/a/a/e/f;)La/a/a/e/g;
    .locals 10

    if-eqz p1, :cond_0

    iget-object v0, p0, La/a/a/a/a;->a:Ljava/io/RandomAccessFile;

    if-nez v0, :cond_1

    :cond_0
    new-instance v0, La/a/a/c/a;

    const-string v1, "invalid read parameters for local header"

    invoke-direct {v0, v1}, La/a/a/c/a;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-virtual {p1}, La/a/a/e/f;->i()J

    move-result-wide v0

    invoke-virtual {p1}, La/a/a/e/f;->q()La/a/a/e/k;

    move-result-object v2

    if-eqz v2, :cond_10

    invoke-virtual {p1}, La/a/a/e/f;->q()La/a/a/e/k;

    move-result-object v2

    invoke-virtual {v2}, La/a/a/e/k;->c()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    if-lez v2, :cond_10

    invoke-virtual {p1}, La/a/a/e/f;->i()J

    move-result-wide v0

    move-wide v2, v0

    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v0, v2, v0

    if-gez v0, :cond_2

    new-instance v0, La/a/a/c/a;

    const-string v1, "invalid local header offset"

    invoke-direct {v0, v1}, La/a/a/c/a;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :try_start_0
    iget-object v0, p0, La/a/a/a/a;->a:Ljava/io/RandomAccessFile;

    invoke-virtual {v0, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V

    new-instance v1, La/a/a/e/g;

    invoke-direct {v1}, La/a/a/e/g;-><init>()V

    const/4 v0, 0x2

    new-array v4, v0, [B

    const/4 v0, 0x4

    new-array v5, v0, [B

    const/16 v0, 0x8

    new-array v0, v0, [B

    iget-object v0, p0, La/a/a/a/a;->a:Ljava/io/RandomAccessFile;

    invoke-direct {p0, v0, v5}, La/a/a/a/a;->a(Ljava/io/RandomAccessFile;[B)[B

    const/4 v0, 0x0

    invoke-static {v5, v0}, La/a/a/h/b;->d([BI)I

    move-result v0

    int-to-long v6, v0

    const-wide/32 v8, 0x4034b50

    cmp-long v6, v6, v8

    if-eqz v6, :cond_3

    new-instance v0, La/a/a/c/a;

    new-instance v1, Ljava/lang/StringBuffer;

    const-string v2, "invalid local header signature for file: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, La/a/a/e/f;->j()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, La/a/a/c/a;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v0

    new-instance v1, La/a/a/c/a;

    invoke-direct {v1, v0}, La/a/a/c/a;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :cond_3
    :try_start_1
    invoke-virtual {v1, v0}, La/a/a/e/g;->a(I)V

    iget-object v0, p0, La/a/a/a/a;->a:Ljava/io/RandomAccessFile;

    invoke-direct {p0, v0, v4}, La/a/a/a/a;->a(Ljava/io/RandomAccessFile;[B)[B

    const/4 v0, 0x0

    invoke-static {v4, v0}, La/a/a/h/b;->b([BI)I

    move-result v0

    invoke-virtual {v1, v0}, La/a/a/e/g;->b(I)V

    iget-object v0, p0, La/a/a/a/a;->a:Ljava/io/RandomAccessFile;

    invoke-direct {p0, v0, v4}, La/a/a/a/a;->a(Ljava/io/RandomAccessFile;[B)[B

    const/4 v0, 0x0

    invoke-static {v4, v0}, La/a/a/h/b;->b([BI)I

    move-result v0

    and-int/lit16 v0, v0, 0x800

    if-eqz v0, :cond_6

    const/4 v0, 0x1

    :goto_1
    invoke-virtual {v1, v0}, La/a/a/e/g;->c(Z)V

    const/4 v0, 0x0

    aget-byte v6, v4, v0

    and-int/lit8 v0, v6, 0x1

    if-eqz v0, :cond_4

    const/4 v0, 0x1

    invoke-virtual {v1, v0}, La/a/a/e/g;->a(Z)V

    :cond_4
    invoke-virtual {v1, v4}, La/a/a/e/g;->a([B)V

    invoke-static {v6}, Ljava/lang/Integer;->toBinaryString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v7

    const/4 v8, 0x4

    if-lt v7, v8, :cond_5

    const/4 v7, 0x3

    invoke-virtual {v0, v7}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v7, 0x31

    if-ne v0, v7, :cond_7

    const/4 v0, 0x1

    :goto_2
    invoke-virtual {v1, v0}, La/a/a/e/g;->b(Z)V

    :cond_5
    iget-object v0, p0, La/a/a/a/a;->a:Ljava/io/RandomAccessFile;

    invoke-direct {p0, v0, v4}, La/a/a/a/a;->a(Ljava/io/RandomAccessFile;[B)[B

    const/4 v0, 0x0

    invoke-static {v4, v0}, La/a/a/h/b;->b([BI)I

    move-result v0

    invoke-virtual {v1, v0}, La/a/a/e/g;->c(I)V

    iget-object v0, p0, La/a/a/a/a;->a:Ljava/io/RandomAccessFile;

    invoke-direct {p0, v0, v5}, La/a/a/a/a;->a(Ljava/io/RandomAccessFile;[B)[B

    const/4 v0, 0x0

    invoke-static {v5, v0}, La/a/a/h/b;->d([BI)I

    move-result v0

    invoke-virtual {v1, v0}, La/a/a/e/g;->d(I)V

    iget-object v0, p0, La/a/a/a/a;->a:Ljava/io/RandomAccessFile;

    invoke-direct {p0, v0, v5}, La/a/a/a/a;->a(Ljava/io/RandomAccessFile;[B)[B

    const/4 v0, 0x0

    invoke-static {v5, v0}, La/a/a/h/b;->d([BI)I

    move-result v0

    int-to-long v8, v0

    invoke-virtual {v1, v8, v9}, La/a/a/e/g;->a(J)V

    invoke-virtual {v5}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    invoke-virtual {v1, v0}, La/a/a/e/g;->b([B)V

    iget-object v0, p0, La/a/a/a/a;->a:Ljava/io/RandomAccessFile;

    invoke-direct {p0, v0, v5}, La/a/a/a/a;->a(Ljava/io/RandomAccessFile;[B)[B

    invoke-direct {p0, v5}, La/a/a/a/a;->a([B)[B

    move-result-object v0

    const/4 v7, 0x0

    invoke-static {v0, v7}, La/a/a/h/b;->a([BI)J

    move-result-wide v8

    invoke-virtual {v1, v8, v9}, La/a/a/e/g;->b(J)V

    iget-object v0, p0, La/a/a/a/a;->a:Ljava/io/RandomAccessFile;

    invoke-direct {p0, v0, v5}, La/a/a/a/a;->a(Ljava/io/RandomAccessFile;[B)[B

    invoke-direct {p0, v5}, La/a/a/a/a;->a([B)[B

    move-result-object v0

    const/4 v5, 0x0

    invoke-static {v0, v5}, La/a/a/h/b;->a([BI)J

    move-result-wide v8

    invoke-virtual {v1, v8, v9}, La/a/a/e/g;->c(J)V

    iget-object v0, p0, La/a/a/a/a;->a:Ljava/io/RandomAccessFile;

    invoke-direct {p0, v0, v4}, La/a/a/a/a;->a(Ljava/io/RandomAccessFile;[B)[B

    const/4 v0, 0x0

    invoke-static {v4, v0}, La/a/a/h/b;->b([BI)I

    move-result v5

    invoke-virtual {v1, v5}, La/a/a/e/g;->e(I)V

    iget-object v0, p0, La/a/a/a/a;->a:Ljava/io/RandomAccessFile;

    invoke-direct {p0, v0, v4}, La/a/a/a/a;->a(Ljava/io/RandomAccessFile;[B)[B

    const/4 v0, 0x0

    invoke-static {v4, v0}, La/a/a/h/b;->b([BI)I

    move-result v4

    invoke-virtual {v1, v4}, La/a/a/e/g;->f(I)V

    const/16 v0, 0x1e

    if-lez v5, :cond_e

    new-array v0, v5, [B

    iget-object v7, p0, La/a/a/a/a;->a:Ljava/io/RandomAccessFile;

    invoke-direct {p0, v7, v0}, La/a/a/a/a;->a(Ljava/io/RandomAccessFile;[B)[B

    invoke-virtual {v1}, La/a/a/e/g;->m()Z

    move-result v7

    invoke-static {v0, v7}, La/a/a/h/c;->a([BZ)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_8

    new-instance v0, La/a/a/c/a;

    const-string v1, "file name is null, cannot assign file name to local file header"

    invoke-direct {v0, v1}, La/a/a/c/a;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    const/4 v0, 0x0

    goto/16 :goto_1

    :cond_7
    const/4 v0, 0x0

    goto/16 :goto_2

    :cond_8
    new-instance v7, Ljava/lang/StringBuffer;

    const-string v8, ":"

    invoke-direct {v7, v8}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    const-string v8, "file.separator"

    invoke-static {v8}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0, v7}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v7

    if-ltz v7, :cond_9

    new-instance v7, Ljava/lang/StringBuffer;

    const-string v8, ":"

    invoke-direct {v7, v8}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    const-string v8, "file.separator"

    invoke-static {v8}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0, v7}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v7

    add-int/lit8 v7, v7, 0x2

    invoke-virtual {v0, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    :cond_9
    invoke-virtual {v1, v0}, La/a/a/e/g;->a(Ljava/lang/String;)V

    add-int/lit8 v0, v5, 0x1e

    :goto_3
    invoke-direct {p0, v1}, La/a/a/a/a;->a(La/a/a/e/g;)V

    add-int/2addr v0, v4

    int-to-long v4, v0

    add-long/2addr v2, v4

    invoke-virtual {v1, v2, v3}, La/a/a/e/g;->d(J)V

    invoke-virtual {p1}, La/a/a/e/f;->n()[C

    move-result-object v0

    invoke-virtual {v1, v0}, La/a/a/e/g;->a([C)V

    invoke-direct {p0, v1}, La/a/a/a/a;->b(La/a/a/e/g;)V

    invoke-direct {p0, v1}, La/a/a/a/a;->c(La/a/a/e/g;)V

    invoke-virtual {v1}, La/a/a/e/g;->h()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-virtual {v1}, La/a/a/e/g;->i()I

    move-result v0

    const/16 v2, 0x63

    if-eq v0, v2, :cond_a

    and-int/lit8 v0, v6, 0x40

    const/16 v2, 0x40

    if-ne v0, v2, :cond_f

    const/4 v0, 0x1

    invoke-virtual {v1, v0}, La/a/a/e/g;->g(I)V

    :cond_a
    :goto_4
    invoke-virtual {v1}, La/a/a/e/g;->b()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-gtz v0, :cond_b

    invoke-virtual {p1}, La/a/a/e/f;->c()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, La/a/a/e/g;->a(J)V

    invoke-virtual {p1}, La/a/a/e/f;->o()[B

    move-result-object v0

    invoke-virtual {v1, v0}, La/a/a/e/g;->b([B)V

    :cond_b
    invoke-virtual {v1}, La/a/a/e/g;->c()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-gtz v0, :cond_c

    invoke-virtual {p1}, La/a/a/e/f;->d()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, La/a/a/e/g;->b(J)V

    :cond_c
    invoke-virtual {v1}, La/a/a/e/g;->d()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-gtz v0, :cond_d

    invoke-virtual {p1}, La/a/a/e/f;->e()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, La/a/a/e/g;->c(J)V

    :cond_d
    return-object v1

    :cond_e
    const/4 v5, 0x0

    invoke-virtual {v1, v5}, La/a/a/e/g;->a(Ljava/lang/String;)V

    goto :goto_3

    :cond_f
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, La/a/a/e/g;->g(I)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_4

    :cond_10
    move-wide v2, v0

    goto/16 :goto_0
.end method

.method public a(Ljava/lang/String;)La/a/a/e/l;
    .locals 2

    new-instance v0, La/a/a/e/l;

    invoke-direct {v0}, La/a/a/e/l;-><init>()V

    iput-object v0, p0, La/a/a/a/a;->b:La/a/a/e/l;

    iget-object v0, p0, La/a/a/a/a;->b:La/a/a/e/l;

    invoke-virtual {v0, p1}, La/a/a/e/l;->b(Ljava/lang/String;)V

    iget-object v0, p0, La/a/a/a/a;->b:La/a/a/e/l;

    invoke-direct {p0}, La/a/a/a/a;->a()La/a/a/e/d;

    move-result-object v1

    invoke-virtual {v0, v1}, La/a/a/e/l;->a(La/a/a/e/d;)V

    iget-object v0, p0, La/a/a/a/a;->b:La/a/a/e/l;

    invoke-direct {p0}, La/a/a/a/a;->c()La/a/a/e/i;

    move-result-object v1

    invoke-virtual {v0, v1}, La/a/a/e/l;->a(La/a/a/e/i;)V

    iget-object v0, p0, La/a/a/a/a;->b:La/a/a/e/l;

    invoke-virtual {v0}, La/a/a/e/l;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, La/a/a/a/a;->b:La/a/a/e/l;

    invoke-direct {p0}, La/a/a/a/a;->d()La/a/a/e/j;

    move-result-object v1

    invoke-virtual {v0, v1}, La/a/a/e/l;->a(La/a/a/e/j;)V

    iget-object v0, p0, La/a/a/a/a;->b:La/a/a/e/l;

    invoke-virtual {v0}, La/a/a/e/l;->f()La/a/a/e/j;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, La/a/a/a/a;->b:La/a/a/e/l;

    invoke-virtual {v0}, La/a/a/e/l;->f()La/a/a/e/j;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/e/j;->b()I

    move-result v0

    if-lez v0, :cond_1

    iget-object v0, p0, La/a/a/a/a;->b:La/a/a/e/l;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, La/a/a/e/l;->a(Z)V

    :cond_0
    :goto_0
    iget-object v0, p0, La/a/a/a/a;->b:La/a/a/e/l;

    invoke-direct {p0}, La/a/a/a/a;->b()La/a/a/e/b;

    move-result-object v1

    invoke-virtual {v0, v1}, La/a/a/e/l;->a(La/a/a/e/b;)V

    iget-object v0, p0, La/a/a/a/a;->b:La/a/a/e/l;

    return-object v0

    :cond_1
    iget-object v0, p0, La/a/a/a/a;->b:La/a/a/e/l;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, La/a/a/e/l;->a(Z)V

    goto :goto_0
.end method
