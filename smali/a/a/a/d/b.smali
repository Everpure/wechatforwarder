.class public La/a/a/d/b;
.super La/a/a/d/c;


# instance fields
.field private a:Ljava/util/zip/Inflater;

.field private b:[B

.field private c:[B

.field private d:La/a/a/g/c;

.field private e:J

.field private f:J


# direct methods
.method public constructor <init>(Ljava/io/RandomAccessFile;JJLa/a/a/g/c;)V
    .locals 2

    const/4 v1, 0x1

    invoke-direct/range {p0 .. p6}, La/a/a/d/c;-><init>(Ljava/io/RandomAccessFile;JJLa/a/a/g/c;)V

    new-array v0, v1, [B

    iput-object v0, p0, La/a/a/d/b;->c:[B

    new-instance v0, Ljava/util/zip/Inflater;

    invoke-direct {v0, v1}, Ljava/util/zip/Inflater;-><init>(Z)V

    iput-object v0, p0, La/a/a/d/b;->a:Ljava/util/zip/Inflater;

    const/16 v0, 0x1000

    new-array v0, v0, [B

    iput-object v0, p0, La/a/a/d/b;->b:[B

    iput-object p6, p0, La/a/a/d/b;->d:La/a/a/g/c;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, La/a/a/d/b;->e:J

    invoke-virtual {p6}, La/a/a/g/c;->d()La/a/a/e/f;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/e/f;->e()J

    move-result-wide v0

    iput-wide v0, p0, La/a/a/d/b;->f:J

    return-void
.end method

.method private c()V
    .locals 4

    const/16 v3, 0x400

    new-array v0, v3, [B

    :cond_0
    const/4 v1, 0x0

    invoke-super {p0, v0, v1, v3}, La/a/a/d/c;->read([BII)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    invoke-virtual {p0}, La/a/a/d/b;->b()V

    return-void
.end method

.method private d()V
    .locals 4

    const/4 v3, 0x0

    iget-object v0, p0, La/a/a/d/b;->b:[B

    iget-object v1, p0, La/a/a/d/b;->b:[B

    array-length v1, v1

    invoke-super {p0, v0, v3, v1}, La/a/a/d/c;->read([BII)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    new-instance v0, Ljava/io/EOFException;

    const-string v1, "Unexpected end of ZLIB input stream"

    invoke-direct {v0, v1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v1, p0, La/a/a/d/b;->a:Ljava/util/zip/Inflater;

    iget-object v2, p0, La/a/a/d/b;->b:[B

    invoke-virtual {v1, v2, v3, v0}, Ljava/util/zip/Inflater;->setInput([BII)V

    return-void
.end method


# virtual methods
.method public a()La/a/a/g/c;
    .locals 1

    invoke-super {p0}, La/a/a/d/c;->a()La/a/a/g/c;

    move-result-object v0

    return-object v0
.end method

.method public available()I
    .locals 1

    iget-object v0, p0, La/a/a/d/b;->a:Ljava/util/zip/Inflater;

    invoke-virtual {v0}, Ljava/util/zip/Inflater;->finished()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public close()V
    .locals 1

    iget-object v0, p0, La/a/a/d/b;->a:Ljava/util/zip/Inflater;

    invoke-virtual {v0}, Ljava/util/zip/Inflater;->end()V

    invoke-super {p0}, La/a/a/d/c;->close()V

    return-void
.end method

.method public read()I
    .locals 4

    const/4 v3, 0x0

    const/4 v0, -0x1

    iget-object v1, p0, La/a/a/d/b;->c:[B

    const/4 v2, 0x1

    invoke-virtual {p0, v1, v3, v2}, La/a/a/d/b;->read([BII)I

    move-result v1

    if-ne v1, v0, :cond_0

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, La/a/a/d/b;->c:[B

    aget-byte v0, v0, v3

    and-int/lit16 v0, v0, 0xff

    goto :goto_0
.end method

.method public read([B)I
    .locals 2

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "input buffer is null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    const/4 v0, 0x0

    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, La/a/a/d/b;->read([BII)I

    move-result v0

    return v0
.end method

.method public read([BII)I
    .locals 6

    const/4 v0, -0x1

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "input buffer is null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    if-ltz p2, :cond_1

    if-ltz p3, :cond_1

    array-length v1, p1

    sub-int/2addr v1, p2

    if-le p3, v1, :cond_2

    :cond_1
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {v0}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw v0

    :cond_2
    if-nez p3, :cond_3

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_3
    :try_start_0
    iget-wide v2, p0, La/a/a/d/b;->e:J

    iget-wide v4, p0, La/a/a/d/b;->f:J

    cmp-long v1, v2, v4

    if-ltz v1, :cond_9

    invoke-direct {p0}, La/a/a/d/b;->c()V
    :try_end_0
    .catch Ljava/util/zip/DataFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    move-object v1, v0

    const-string v0, "Invalid ZLIB data format"

    invoke-virtual {v1}, Ljava/util/zip/DataFormatException;->getMessage()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-virtual {v1}, Ljava/util/zip/DataFormatException;->getMessage()Ljava/lang/String;

    move-result-object v0

    :cond_4
    iget-object v1, p0, La/a/a/d/b;->d:La/a/a/g/c;

    if-eqz v1, :cond_5

    iget-object v1, p0, La/a/a/d/b;->d:La/a/a/g/c;

    invoke-virtual {v1}, La/a/a/g/c;->g()La/a/a/e/g;

    move-result-object v1

    invoke-virtual {v1}, La/a/a/e/g;->h()Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v1, p0, La/a/a/d/b;->d:La/a/a/g/c;

    invoke-virtual {v1}, La/a/a/g/c;->g()La/a/a/e/g;

    move-result-object v1

    invoke-virtual {v1}, La/a/a/e/g;->i()I

    move-result v1

    if-nez v1, :cond_5

    new-instance v1, Ljava/lang/StringBuffer;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    const-string v0, " - Wrong Password?"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_5
    new-instance v1, Ljava/io/IOException;

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_6
    :try_start_1
    iget-object v1, p0, La/a/a/d/b;->a:Ljava/util/zip/Inflater;

    invoke-virtual {v1}, Ljava/util/zip/Inflater;->finished()Z

    move-result v1

    if-nez v1, :cond_7

    iget-object v1, p0, La/a/a/d/b;->a:Ljava/util/zip/Inflater;

    invoke-virtual {v1}, Ljava/util/zip/Inflater;->needsDictionary()Z

    move-result v1

    if-eqz v1, :cond_8

    :cond_7
    invoke-direct {p0}, La/a/a/d/b;->c()V

    goto :goto_0

    :cond_8
    iget-object v1, p0, La/a/a/d/b;->a:Ljava/util/zip/Inflater;

    invoke-virtual {v1}, Ljava/util/zip/Inflater;->needsInput()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-direct {p0}, La/a/a/d/b;->d()V

    :cond_9
    iget-object v1, p0, La/a/a/d/b;->a:Ljava/util/zip/Inflater;

    invoke-virtual {v1, p1, p2, p3}, Ljava/util/zip/Inflater;->inflate([BII)I

    move-result v1

    if-eqz v1, :cond_6

    iget-wide v2, p0, La/a/a/d/b;->e:J

    int-to-long v4, v1

    add-long/2addr v2, v4

    iput-wide v2, p0, La/a/a/d/b;->e:J
    :try_end_1
    .catch Ljava/util/zip/DataFormatException; {:try_start_1 .. :try_end_1} :catch_0

    move v0, v1

    goto :goto_0
.end method

.method public skip(J)J
    .locals 7

    const/4 v2, 0x0

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-gez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "negative skip length"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    const-wide/32 v0, 0x7fffffff

    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int v3, v0

    const/16 v0, 0x200

    new-array v4, v0, [B

    move v1, v2

    :goto_0
    if-lt v1, v3, :cond_2

    :cond_1
    int-to-long v0, v1

    return-wide v0

    :cond_2
    sub-int v0, v3, v1

    array-length v5, v4

    if-le v0, v5, :cond_3

    array-length v0, v4

    :cond_3
    invoke-virtual {p0, v4, v2, v0}, La/a/a/d/b;->read([BII)I

    move-result v0

    const/4 v5, -0x1

    if-eq v0, v5, :cond_1

    add-int/2addr v0, v1

    move v1, v0

    goto :goto_0
.end method
