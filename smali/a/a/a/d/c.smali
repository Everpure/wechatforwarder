.class public La/a/a/d/c;
.super La/a/a/d/a;


# instance fields
.field private a:Ljava/io/RandomAccessFile;

.field private b:J

.field private c:J

.field private d:La/a/a/g/c;

.field private e:La/a/a/b/b;

.field private f:[B

.field private g:[B

.field private h:I

.field private i:Z

.field private j:I


# direct methods
.method public constructor <init>(Ljava/io/RandomAccessFile;JJLa/a/a/g/c;)V
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-direct {p0}, La/a/a/d/a;-><init>()V

    new-array v2, v0, [B

    iput-object v2, p0, La/a/a/d/c;->f:[B

    const/16 v2, 0x10

    new-array v2, v2, [B

    iput-object v2, p0, La/a/a/d/c;->g:[B

    iput v1, p0, La/a/a/d/c;->h:I

    iput-boolean v1, p0, La/a/a/d/c;->i:Z

    const/4 v2, -0x1

    iput v2, p0, La/a/a/d/c;->j:I

    iput-object p1, p0, La/a/a/d/c;->a:Ljava/io/RandomAccessFile;

    iput-object p6, p0, La/a/a/d/c;->d:La/a/a/g/c;

    invoke-virtual {p6}, La/a/a/g/c;->e()La/a/a/b/b;

    move-result-object v2

    iput-object v2, p0, La/a/a/d/c;->e:La/a/a/b/b;

    const-wide/16 v2, 0x0

    iput-wide v2, p0, La/a/a/d/c;->b:J

    iput-wide p4, p0, La/a/a/d/c;->c:J

    invoke-virtual {p6}, La/a/a/g/c;->d()La/a/a/e/f;

    move-result-object v2

    invoke-virtual {v2}, La/a/a/e/f;->l()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p6}, La/a/a/g/c;->d()La/a/a/e/f;

    move-result-object v2

    invoke-virtual {v2}, La/a/a/e/f;->m()I

    move-result v2

    const/16 v3, 0x63

    if-ne v2, v3, :cond_0

    :goto_0
    iput-boolean v0, p0, La/a/a/d/c;->i:Z

    return-void

    :cond_0
    move v0, v1

    goto :goto_0
.end method


# virtual methods
.method public a()La/a/a/g/c;
    .locals 1

    iget-object v0, p0, La/a/a/d/c;->d:La/a/a/g/c;

    return-object v0
.end method

.method public available()I
    .locals 4

    iget-wide v0, p0, La/a/a/d/c;->c:J

    iget-wide v2, p0, La/a/a/d/c;->b:J

    sub-long/2addr v0, v2

    const-wide/32 v2, 0x7fffffff

    cmp-long v2, v0, v2

    if-lez v2, :cond_0

    const v0, 0x7fffffff

    :goto_0
    return v0

    :cond_0
    long-to-int v0, v0

    goto :goto_0
.end method

.method protected b()V
    .locals 4

    const/16 v2, 0xa

    iget-boolean v0, p0, La/a/a/d/c;->i:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, La/a/a/d/c;->e:La/a/a/b/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, La/a/a/d/c;->e:La/a/a/b/b;

    instance-of v0, v0, La/a/a/b/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, La/a/a/d/c;->e:La/a/a/b/b;

    check-cast v0, La/a/a/b/a;

    invoke-virtual {v0}, La/a/a/b/a;->d()[B

    move-result-object v0

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    new-array v1, v2, [B

    iget-object v0, p0, La/a/a/d/c;->a:Ljava/io/RandomAccessFile;

    invoke-virtual {v0, v1}, Ljava/io/RandomAccessFile;->read([B)I

    move-result v0

    if-eq v0, v2, :cond_2

    iget-object v2, p0, La/a/a/d/c;->d:La/a/a/g/c;

    invoke-virtual {v2}, La/a/a/g/c;->f()La/a/a/e/l;

    move-result-object v2

    invoke-virtual {v2}, La/a/a/e/l;->c()Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, La/a/a/d/c;->a:Ljava/io/RandomAccessFile;

    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->close()V

    iget-object v2, p0, La/a/a/d/c;->d:La/a/a/g/c;

    invoke-virtual {v2}, La/a/a/g/c;->c()Ljava/io/RandomAccessFile;

    move-result-object v2

    iput-object v2, p0, La/a/a/d/c;->a:Ljava/io/RandomAccessFile;

    iget-object v2, p0, La/a/a/d/c;->a:Ljava/io/RandomAccessFile;

    rsub-int/lit8 v3, v0, 0xa

    invoke-virtual {v2, v1, v0, v3}, Ljava/io/RandomAccessFile;->read([BII)I

    move-result v2

    add-int/2addr v0, v2

    :cond_2
    iget-object v0, p0, La/a/a/d/c;->d:La/a/a/g/c;

    invoke-virtual {v0}, La/a/a/g/c;->e()La/a/a/b/b;

    move-result-object v0

    check-cast v0, La/a/a/b/a;

    invoke-virtual {v0, v1}, La/a/a/b/a;->a([B)V

    goto :goto_0

    :cond_3
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Error occured while reading stored AES authentication bytes"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public close()V
    .locals 1

    iget-object v0, p0, La/a/a/d/c;->a:Ljava/io/RandomAccessFile;

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->close()V

    return-void
.end method

.method public read()I
    .locals 7

    const/4 v6, 0x0

    const/4 v0, -0x1

    iget-wide v2, p0, La/a/a/d/c;->b:J

    iget-wide v4, p0, La/a/a/d/c;->c:J

    cmp-long v1, v2, v4

    if-ltz v1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    iget-boolean v1, p0, La/a/a/d/c;->i:Z

    if-eqz v1, :cond_4

    iget v1, p0, La/a/a/d/c;->h:I

    if-eqz v1, :cond_2

    iget v1, p0, La/a/a/d/c;->h:I

    const/16 v2, 0x10

    if-ne v1, v2, :cond_3

    :cond_2
    iget-object v1, p0, La/a/a/d/c;->g:[B

    invoke-virtual {p0, v1}, La/a/a/d/c;->read([B)I

    move-result v1

    if-eq v1, v0, :cond_0

    iput v6, p0, La/a/a/d/c;->h:I

    :cond_3
    iget-object v0, p0, La/a/a/d/c;->g:[B

    iget v1, p0, La/a/a/d/c;->h:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, La/a/a/d/c;->h:I

    aget-byte v0, v0, v1

    and-int/lit16 v0, v0, 0xff

    goto :goto_0

    :cond_4
    iget-object v1, p0, La/a/a/d/c;->f:[B

    const/4 v2, 0x1

    invoke-virtual {p0, v1, v6, v2}, La/a/a/d/c;->read([BII)I

    move-result v1

    if-eq v1, v0, :cond_0

    iget-object v0, p0, La/a/a/d/c;->f:[B

    aget-byte v0, v0, v6

    and-int/lit16 v0, v0, 0xff

    goto :goto_0
.end method

.method public read([B)I
    .locals 2

    const/4 v0, 0x0

    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, La/a/a/d/c;->read([BII)I

    move-result v0

    return v0
.end method

.method public read([BII)I
    .locals 6

    int-to-long v0, p3

    iget-wide v2, p0, La/a/a/d/c;->c:J

    iget-wide v4, p0, La/a/a/d/c;->b:J

    sub-long/2addr v2, v4

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    iget-wide v0, p0, La/a/a/d/c;->c:J

    iget-wide v2, p0, La/a/a/d/c;->b:J

    sub-long/2addr v0, v2

    long-to-int p3, v0

    if-nez p3, :cond_0

    invoke-virtual {p0}, La/a/a/d/c;->b()V

    const/4 v0, -0x1

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, La/a/a/d/c;->d:La/a/a/g/c;

    invoke-virtual {v0}, La/a/a/g/c;->e()La/a/a/b/b;

    move-result-object v0

    instance-of v0, v0, La/a/a/b/a;

    if-eqz v0, :cond_1

    iget-wide v0, p0, La/a/a/d/c;->b:J

    int-to-long v2, p3

    add-long/2addr v0, v2

    iget-wide v2, p0, La/a/a/d/c;->c:J

    cmp-long v0, v0, v2

    if-gez v0, :cond_1

    rem-int/lit8 v0, p3, 0x10

    if-eqz v0, :cond_1

    rem-int/lit8 v0, p3, 0x10

    sub-int/2addr p3, v0

    :cond_1
    iget-object v1, p0, La/a/a/d/c;->a:Ljava/io/RandomAccessFile;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, La/a/a/d/c;->a:Ljava/io/RandomAccessFile;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/RandomAccessFile;->read([BII)I

    move-result v0

    iput v0, p0, La/a/a/d/c;->j:I

    iget v0, p0, La/a/a/d/c;->j:I

    if-ge v0, p3, :cond_3

    iget-object v0, p0, La/a/a/d/c;->d:La/a/a/g/c;

    invoke-virtual {v0}, La/a/a/g/c;->f()La/a/a/e/l;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/e/l;->c()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, La/a/a/d/c;->a:Ljava/io/RandomAccessFile;

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->close()V

    iget-object v0, p0, La/a/a/d/c;->d:La/a/a/g/c;

    invoke-virtual {v0}, La/a/a/g/c;->c()Ljava/io/RandomAccessFile;

    move-result-object v0

    iput-object v0, p0, La/a/a/d/c;->a:Ljava/io/RandomAccessFile;

    iget v0, p0, La/a/a/d/c;->j:I

    if-gez v0, :cond_2

    const/4 v0, 0x0

    iput v0, p0, La/a/a/d/c;->j:I

    :cond_2
    iget-object v0, p0, La/a/a/d/c;->a:Ljava/io/RandomAccessFile;

    iget v2, p0, La/a/a/d/c;->j:I

    iget v3, p0, La/a/a/d/c;->j:I

    sub-int v3, p3, v3

    invoke-virtual {v0, p1, v2, v3}, Ljava/io/RandomAccessFile;->read([BII)I

    move-result v0

    if-lez v0, :cond_3

    iget v2, p0, La/a/a/d/c;->j:I

    add-int/2addr v0, v2

    iput v0, p0, La/a/a/d/c;->j:I

    :cond_3
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget v0, p0, La/a/a/d/c;->j:I

    if-lez v0, :cond_5

    iget-object v0, p0, La/a/a/d/c;->e:La/a/a/b/b;

    if-eqz v0, :cond_4

    :try_start_1
    iget-object v0, p0, La/a/a/d/c;->e:La/a/a/b/b;

    iget v1, p0, La/a/a/d/c;->j:I

    invoke-interface {v0, p1, p2, v1}, La/a/a/b/b;->a([BII)I
    :try_end_1
    .catch La/a/a/c/a; {:try_start_1 .. :try_end_1} :catch_0

    :cond_4
    iget-wide v0, p0, La/a/a/d/c;->b:J

    iget v2, p0, La/a/a/d/c;->j:I

    int-to-long v2, v2

    add-long/2addr v0, v2

    iput-wide v0, p0, La/a/a/d/c;->b:J

    :cond_5
    iget-wide v0, p0, La/a/a/d/c;->b:J

    iget-wide v2, p0, La/a/a/d/c;->c:J

    cmp-long v0, v0, v2

    if-ltz v0, :cond_6

    invoke-virtual {p0}, La/a/a/d/c;->b()V

    :cond_6
    iget v0, p0, La/a/a/d/c;->j:I

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/io/IOException;

    invoke-virtual {v0}, La/a/a/c/a;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public skip(J)J
    .locals 5

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-gez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    :cond_0
    iget-wide v0, p0, La/a/a/d/c;->c:J

    iget-wide v2, p0, La/a/a/d/c;->b:J

    sub-long/2addr v0, v2

    cmp-long v0, p1, v0

    if-lez v0, :cond_1

    iget-wide v0, p0, La/a/a/d/c;->c:J

    iget-wide v2, p0, La/a/a/d/c;->b:J

    sub-long p1, v0, v2

    :cond_1
    iget-wide v0, p0, La/a/a/d/c;->b:J

    add-long/2addr v0, p1

    iput-wide v0, p0, La/a/a/d/c;->b:J

    return-wide p1
.end method
