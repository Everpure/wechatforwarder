.class public La/a/a/g/c;
.super Ljava/lang/Object;


# instance fields
.field private a:La/a/a/e/l;

.field private b:La/a/a/e/f;

.field private c:I

.field private d:La/a/a/e/g;

.field private e:La/a/a/b/b;

.field private f:Ljava/util/zip/CRC32;


# direct methods
.method public constructor <init>(La/a/a/e/l;La/a/a/e/f;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, La/a/a/g/c;->c:I

    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    :cond_0
    new-instance v0, La/a/a/c/a;

    const-string v1, "Invalid parameters passed to StoreUnzip. One or more of the parameters were null"

    invoke-direct {v0, v1}, La/a/a/c/a;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iput-object p1, p0, La/a/a/g/c;->a:La/a/a/e/l;

    iput-object p2, p0, La/a/a/g/c;->b:La/a/a/e/f;

    new-instance v0, Ljava/util/zip/CRC32;

    invoke-direct {v0}, Ljava/util/zip/CRC32;-><init>()V

    iput-object v0, p0, La/a/a/g/c;->f:Ljava/util/zip/CRC32;

    return-void
.end method

.method private a(La/a/a/e/a;)I
    .locals 2

    if-nez p1, :cond_0

    new-instance v0, La/a/a/c/a;

    const-string v1, "unable to determine salt length: AESExtraDataRecord is null"

    invoke-direct {v0, v1}, La/a/a/c/a;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-virtual {p1}, La/a/a/e/a;->a()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    new-instance v0, La/a/a/c/a;

    const-string v1, "unable to determine salt length: invalid aes key strength"

    invoke-direct {v0, v1}, La/a/a/c/a;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    const/16 v0, 0x8

    :goto_0
    return v0

    :pswitch_1
    const/16 v0, 0xc

    goto :goto_0

    :pswitch_2
    const/16 v0, 0x10

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)Ljava/io/FileOutputStream;
    .locals 2

    invoke-static {p1}, La/a/a/h/c;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, La/a/a/c/a;

    const-string v1, "invalid output path"

    invoke-direct {v0, v1}, La/a/a/c/a;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    :try_start_0
    new-instance v0, Ljava/io/File;

    invoke-direct {p0, p1, p2}, La/a/a/g/c;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    :cond_1
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    :cond_2
    new-instance v1, Ljava/io/FileOutputStream;

    invoke-direct {v1, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception v0

    new-instance v1, La/a/a/c/a;

    invoke-direct {v1, v0}, La/a/a/c/a;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method private a(Ljava/lang/String;)Ljava/io/RandomAccessFile;
    .locals 3

    iget-object v0, p0, La/a/a/g/c;->a:La/a/a/e/l;

    if-eqz v0, :cond_0

    iget-object v0, p0, La/a/a/g/c;->a:La/a/a/e/l;

    invoke-virtual {v0}, La/a/a/e/l;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, La/a/a/h/c;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    new-instance v0, La/a/a/c/a;

    const-string v1, "input parameter is null in getFilePointer"

    invoke-direct {v0, v1}, La/a/a/c/a;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :try_start_0
    iget-object v0, p0, La/a/a/g/c;->a:La/a/a/e/l;

    invoke-virtual {v0}, La/a/a/e/l;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-direct {p0}, La/a/a/g/c;->i()Ljava/io/RandomAccessFile;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_2
    new-instance v0, Ljava/io/RandomAccessFile;

    new-instance v1, Ljava/io/File;

    iget-object v2, p0, La/a/a/g/c;->a:La/a/a/e/l;

    invoke-virtual {v2}, La/a/a/e/l;->d()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1, p1}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, La/a/a/c/a;

    invoke-direct {v1, v0}, La/a/a/c/a;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catch_1
    move-exception v0

    new-instance v1, La/a/a/c/a;

    invoke-direct {v1, v0}, La/a/a/c/a;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method private a(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    .locals 3

    if-eqz p1, :cond_0

    :try_start_0
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    if-eqz p2, :cond_1

    :try_start_1
    invoke-virtual {p2}, Ljava/io/OutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3

    :cond_1
    :goto_0
    return-void

    :catch_0
    move-exception v0

    if-eqz v0, :cond_3

    :try_start_2
    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, La/a/a/h/c;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v1

    const-string v2, " - Wrong Password?"

    invoke-virtual {v1, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    if-ltz v1, :cond_3

    new-instance v1, La/a/a/c/a;

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, La/a/a/c/a;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    move-exception v0

    if-eqz p2, :cond_2

    :try_start_3
    invoke-virtual {p2}, Ljava/io/OutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    :cond_2
    :goto_1
    throw v0

    :cond_3
    if-eqz p2, :cond_1

    :try_start_4
    invoke-virtual {p2}, Ljava/io/OutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_0

    :catch_2
    move-exception v1

    goto :goto_1

    :catch_3
    move-exception v0

    goto :goto_0
.end method

.method private a(Ljava/io/RandomAccessFile;)V
    .locals 2

    iget-object v0, p0, La/a/a/g/c;->d:La/a/a/e/g;

    if-nez v0, :cond_0

    new-instance v0, La/a/a/c/a;

    const-string v1, "local file header is null, cannot initialize input stream"

    invoke-direct {v0, v1}, La/a/a/c/a;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    :try_start_0
    invoke-direct {p0, p1}, La/a/a/g/c;->b(Ljava/io/RandomAccessFile;)V
    :try_end_0
    .catch La/a/a/c/a; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    return-void

    :catch_0
    move-exception v0

    throw v0

    :catch_1
    move-exception v0

    new-instance v1, La/a/a/c/a;

    invoke-direct {v1, v0}, La/a/a/c/a;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method private b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    invoke-static {p2}, La/a/a/h/c;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_0
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    const-string v1, "file.separator"

    invoke-static {v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, La/a/a/g/c;->b:La/a/a/e/f;

    invoke-virtual {v0}, La/a/a/e/f;->j()Ljava/lang/String;

    move-result-object p2

    goto :goto_0
.end method

.method private b(Ljava/io/RandomAccessFile;)V
    .locals 4

    iget-object v0, p0, La/a/a/g/c;->d:La/a/a/e/g;

    if-nez v0, :cond_0

    new-instance v0, La/a/a/c/a;

    const-string v1, "local file header is null, cannot init decrypter"

    invoke-direct {v0, v1}, La/a/a/c/a;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, La/a/a/g/c;->d:La/a/a/e/g;

    invoke-virtual {v0}, La/a/a/e/g;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, La/a/a/g/c;->d:La/a/a/e/g;

    invoke-virtual {v0}, La/a/a/e/g;->i()I

    move-result v0

    if-nez v0, :cond_2

    new-instance v0, La/a/a/b/c;

    iget-object v1, p0, La/a/a/g/c;->b:La/a/a/e/f;

    invoke-direct {p0, p1}, La/a/a/g/c;->c(Ljava/io/RandomAccessFile;)[B

    move-result-object v2

    invoke-direct {v0, v1, v2}, La/a/a/b/c;-><init>(La/a/a/e/f;[B)V

    iput-object v0, p0, La/a/a/g/c;->e:La/a/a/b/b;

    :cond_1
    :goto_0
    return-void

    :cond_2
    iget-object v0, p0, La/a/a/g/c;->d:La/a/a/e/g;

    invoke-virtual {v0}, La/a/a/e/g;->i()I

    move-result v0

    const/16 v1, 0x63

    if-ne v0, v1, :cond_3

    new-instance v0, La/a/a/b/a;

    iget-object v1, p0, La/a/a/g/c;->d:La/a/a/e/g;

    invoke-direct {p0, p1}, La/a/a/g/c;->d(Ljava/io/RandomAccessFile;)[B

    move-result-object v2

    invoke-direct {p0, p1}, La/a/a/g/c;->e(Ljava/io/RandomAccessFile;)[B

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, La/a/a/b/a;-><init>(La/a/a/e/g;[B[B)V

    iput-object v0, p0, La/a/a/g/c;->e:La/a/a/b/b;

    goto :goto_0

    :cond_3
    new-instance v0, La/a/a/c/a;

    const-string v1, "unsupported encryption method"

    invoke-direct {v0, v1}, La/a/a/c/a;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private c(Ljava/io/RandomAccessFile;)[B
    .locals 4

    const/16 v0, 0xc

    :try_start_0
    new-array v0, v0, [B

    iget-object v1, p0, La/a/a/g/c;->d:La/a/a/e/g;

    invoke-virtual {v1}, La/a/a/e/g;->g()J

    move-result-wide v2

    invoke-virtual {p1, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V

    const/4 v1, 0x0

    const/16 v2, 0xc

    invoke-virtual {p1, v0, v1, v2}, Ljava/io/RandomAccessFile;->read([BII)I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, La/a/a/c/a;

    invoke-direct {v1, v0}, La/a/a/c/a;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catch_1
    move-exception v0

    new-instance v1, La/a/a/c/a;

    invoke-direct {v1, v0}, La/a/a/c/a;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method private d(Ljava/io/RandomAccessFile;)[B
    .locals 4

    iget-object v0, p0, La/a/a/g/c;->d:La/a/a/e/g;

    invoke-virtual {v0}, La/a/a/e/g;->l()La/a/a/e/a;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    :try_start_0
    iget-object v0, p0, La/a/a/g/c;->d:La/a/a/e/g;

    invoke-virtual {v0}, La/a/a/e/g;->l()La/a/a/e/a;

    move-result-object v0

    invoke-direct {p0, v0}, La/a/a/g/c;->a(La/a/a/e/a;)I

    move-result v0

    new-array v0, v0, [B

    iget-object v1, p0, La/a/a/g/c;->d:La/a/a/e/g;

    invoke-virtual {v1}, La/a/a/e/g;->g()J

    move-result-wide v2

    invoke-virtual {p1, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V

    invoke-virtual {p1, v0}, Ljava/io/RandomAccessFile;->read([B)I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, La/a/a/c/a;

    invoke-direct {v1, v0}, La/a/a/c/a;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method private e(Ljava/io/RandomAccessFile;)[B
    .locals 2

    const/4 v0, 0x2

    :try_start_0
    new-array v0, v0, [B

    invoke-virtual {p1, v0}, Ljava/io/RandomAccessFile;->read([B)I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, La/a/a/c/a;

    invoke-direct {v1, v0}, La/a/a/c/a;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method private h()Z
    .locals 4

    const/4 v1, 0x0

    :try_start_0
    invoke-direct {p0}, La/a/a/g/c;->i()Ljava/io/RandomAccessFile;

    move-result-object v1

    if-nez v1, :cond_0

    new-instance v0, Ljava/io/RandomAccessFile;

    new-instance v2, Ljava/io/File;

    iget-object v3, p0, La/a/a/g/c;->a:La/a/a/e/l;

    invoke-virtual {v3}, La/a/a/e/l;->d()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    const-string v3, "r"

    invoke-direct {v0, v2, v3}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object v1, v0

    :cond_0
    new-instance v0, La/a/a/a/a;

    invoke-direct {v0, v1}, La/a/a/a/a;-><init>(Ljava/io/RandomAccessFile;)V

    iget-object v2, p0, La/a/a/g/c;->b:La/a/a/e/f;

    invoke-virtual {v0, v2}, La/a/a/a/a;->a(La/a/a/e/f;)La/a/a/e/g;

    move-result-object v0

    iput-object v0, p0, La/a/a/g/c;->d:La/a/a/e/g;

    iget-object v0, p0, La/a/a/g/c;->d:La/a/a/e/g;

    if-nez v0, :cond_2

    new-instance v0, La/a/a/c/a;

    const-string v2, "error reading local file header. Is this a valid zip file?"

    invoke-direct {v0, v2}, La/a/a/c/a;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catch_0
    move-exception v0

    :try_start_1
    new-instance v2, La/a/a/c/a;

    invoke-direct {v2, v0}, La/a/a/c/a;-><init>(Ljava/lang/Throwable;)V

    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    if-eqz v1, :cond_1

    :try_start_2
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_5
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_6

    :cond_1
    :goto_0
    throw v0

    :cond_2
    :try_start_3
    iget-object v0, p0, La/a/a/g/c;->d:La/a/a/e/g;

    invoke-virtual {v0}, La/a/a/e/g;->a()I

    move-result v0

    iget-object v2, p0, La/a/a/g/c;->b:La/a/a/e/f;

    invoke-virtual {v2}, La/a/a/e/f;->a()I
    :try_end_3
    .catch Ljava/io/FileNotFoundException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-result v2

    if-eq v0, v2, :cond_4

    if-eqz v1, :cond_3

    :try_start_4
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    :cond_3
    :goto_1
    const/4 v0, 0x0

    :goto_2
    return v0

    :cond_4
    if-eqz v1, :cond_5

    :try_start_5
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_4

    :cond_5
    :goto_3
    const/4 v0, 0x1

    goto :goto_2

    :catch_1
    move-exception v0

    goto :goto_1

    :catch_2
    move-exception v0

    goto :goto_1

    :catch_3
    move-exception v0

    goto :goto_3

    :catch_4
    move-exception v0

    goto :goto_3

    :catch_5
    move-exception v1

    goto :goto_0

    :catch_6
    move-exception v1

    goto :goto_0
.end method

.method private i()Ljava/io/RandomAccessFile;
    .locals 6

    const/4 v4, 0x0

    iget-object v0, p0, La/a/a/g/c;->a:La/a/a/e/l;

    invoke-virtual {v0}, La/a/a/e/l;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, La/a/a/g/c;->b:La/a/a/e/f;

    invoke-virtual {v0}, La/a/a/e/f;->g()I

    move-result v0

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, La/a/a/g/c;->c:I

    iget-object v1, p0, La/a/a/g/c;->a:La/a/a/e/l;

    invoke-virtual {v1}, La/a/a/e/l;->d()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, La/a/a/g/c;->a:La/a/a/e/l;

    invoke-virtual {v2}, La/a/a/e/l;->b()La/a/a/e/d;

    move-result-object v2

    invoke-virtual {v2}, La/a/a/e/d;->a()I

    move-result v2

    if-ne v0, v2, :cond_0

    iget-object v0, p0, La/a/a/g/c;->a:La/a/a/e/l;

    invoke-virtual {v0}, La/a/a/e/l;->d()Ljava/lang/String;

    move-result-object v0

    move-object v1, v0

    :goto_0
    :try_start_0
    new-instance v0, Ljava/io/RandomAccessFile;

    const-string v2, "r"

    invoke-direct {v0, v1, v2}, Ljava/io/RandomAccessFile;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget v1, p0, La/a/a/g/c;->c:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_3

    const/4 v1, 0x4

    new-array v1, v1, [B

    invoke-virtual {v0, v1}, Ljava/io/RandomAccessFile;->read([B)I

    const/4 v2, 0x0

    invoke-static {v1, v2}, La/a/a/h/b;->d([BI)I

    move-result v1

    int-to-long v2, v1

    const-wide/32 v4, 0x8074b50

    cmp-long v1, v2, v4

    if-eqz v1, :cond_3

    new-instance v0, La/a/a/c/a;

    const-string v1, "invalid first part split file signature"

    invoke-direct {v0, v1}, La/a/a/c/a;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    :catch_0
    move-exception v0

    new-instance v1, La/a/a/c/a;

    invoke-direct {v1, v0}, La/a/a/c/a;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :cond_0
    const/16 v2, 0x9

    if-lt v0, v2, :cond_1

    new-instance v2, Ljava/lang/StringBuffer;

    const-string v3, "."

    invoke-virtual {v1, v3}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v1, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    const-string v1, ".z"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v1

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    move-object v1, v0

    goto :goto_0

    :cond_1
    new-instance v2, Ljava/lang/StringBuffer;

    const-string v3, "."

    invoke-virtual {v1, v3}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v1, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    const-string v1, ".z0"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v1

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    move-object v1, v0

    goto :goto_0

    :catch_1
    move-exception v0

    new-instance v1, La/a/a/c/a;

    invoke-direct {v1, v0}, La/a/a/c/a;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :cond_2
    const/4 v0, 0x0

    :cond_3
    return-object v0
.end method


# virtual methods
.method public a()La/a/a/d/d;
    .locals 9

    const-wide/16 v6, 0xc

    const/16 v8, 0x63

    iget-object v0, p0, La/a/a/g/c;->b:La/a/a/e/f;

    if-nez v0, :cond_0

    new-instance v0, La/a/a/c/a;

    const-string v1, "file header is null, cannot get inputstream"

    invoke-direct {v0, v1}, La/a/a/c/a;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    const/4 v1, 0x0

    :try_start_0
    const-string v0, "r"

    invoke-direct {p0, v0}, La/a/a/g/c;->a(Ljava/lang/String;)Ljava/io/RandomAccessFile;

    move-result-object v1

    const-string v0, "local header and file header do not match"

    invoke-direct {p0}, La/a/a/g/c;->h()Z

    move-result v2

    if-nez v2, :cond_2

    new-instance v2, La/a/a/c/a;

    invoke-direct {v2, v0}, La/a/a/c/a;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_0
    .catch La/a/a/c/a; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    :catch_0
    move-exception v0

    if-eqz v1, :cond_1

    :try_start_1
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2

    :cond_1
    :goto_0
    throw v0

    :cond_2
    :try_start_2
    invoke-direct {p0, v1}, La/a/a/g/c;->a(Ljava/io/RandomAccessFile;)V

    iget-object v0, p0, La/a/a/g/c;->d:La/a/a/e/g;

    invoke-virtual {v0}, La/a/a/e/g;->c()J

    move-result-wide v4

    iget-object v0, p0, La/a/a/g/c;->d:La/a/a/e/g;

    invoke-virtual {v0}, La/a/a/e/g;->g()J

    move-result-wide v2

    iget-object v0, p0, La/a/a/g/c;->d:La/a/a/e/g;

    invoke-virtual {v0}, La/a/a/e/g;->h()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, La/a/a/g/c;->d:La/a/a/e/g;

    invoke-virtual {v0}, La/a/a/e/g;->i()I

    move-result v0

    if-ne v0, v8, :cond_7

    iget-object v0, p0, La/a/a/g/c;->e:La/a/a/b/b;

    instance-of v0, v0, La/a/a/b/a;

    if-eqz v0, :cond_6

    iget-object v0, p0, La/a/a/g/c;->e:La/a/a/b/b;

    check-cast v0, La/a/a/b/a;

    invoke-virtual {v0}, La/a/a/b/a;->b()I

    move-result v6

    iget-object v0, p0, La/a/a/g/c;->e:La/a/a/b/b;

    check-cast v0, La/a/a/b/a;

    invoke-virtual {v0}, La/a/a/b/a;->a()I

    move-result v0

    add-int/2addr v0, v6

    add-int/lit8 v0, v0, 0xa

    int-to-long v6, v0

    sub-long/2addr v4, v6

    iget-object v0, p0, La/a/a/g/c;->e:La/a/a/b/b;

    check-cast v0, La/a/a/b/a;

    invoke-virtual {v0}, La/a/a/b/a;->b()I

    move-result v6

    iget-object v0, p0, La/a/a/g/c;->e:La/a/a/b/b;

    check-cast v0, La/a/a/b/a;

    invoke-virtual {v0}, La/a/a/b/a;->a()I

    move-result v0

    add-int/2addr v0, v6

    int-to-long v6, v0

    add-long/2addr v2, v6

    :cond_3
    :goto_1
    iget-object v0, p0, La/a/a/g/c;->b:La/a/a/e/f;

    invoke-virtual {v0}, La/a/a/e/f;->a()I

    move-result v0

    iget-object v6, p0, La/a/a/g/c;->b:La/a/a/e/f;

    invoke-virtual {v6}, La/a/a/e/f;->m()I

    move-result v6

    if-ne v6, v8, :cond_4

    iget-object v0, p0, La/a/a/g/c;->b:La/a/a/e/f;

    invoke-virtual {v0}, La/a/a/e/f;->r()La/a/a/e/a;

    move-result-object v0

    if-eqz v0, :cond_8

    iget-object v0, p0, La/a/a/g/c;->b:La/a/a/e/f;

    invoke-virtual {v0}, La/a/a/e/f;->r()La/a/a/e/a;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/e/a;->b()I

    move-result v0

    :cond_4
    invoke-virtual {v1, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V

    sparse-switch v0, :sswitch_data_0

    new-instance v0, La/a/a/c/a;

    const-string v2, "compression type not supported"

    invoke-direct {v0, v2}, La/a/a/c/a;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_2
    .catch La/a/a/c/a; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    move-exception v0

    if-eqz v1, :cond_5

    :try_start_3
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3

    :cond_5
    :goto_2
    new-instance v1, La/a/a/c/a;

    invoke-direct {v1, v0}, La/a/a/c/a;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :cond_6
    :try_start_4
    new-instance v0, La/a/a/c/a;

    new-instance v2, Ljava/lang/StringBuffer;

    const-string v3, "invalid decryptor when trying to calculate compressed size for AES encrypted file: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, La/a/a/g/c;->b:La/a/a/e/f;

    invoke-virtual {v3}, La/a/a/e/f;->j()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, La/a/a/c/a;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    iget-object v0, p0, La/a/a/g/c;->d:La/a/a/e/g;

    invoke-virtual {v0}, La/a/a/e/g;->i()I

    move-result v0

    if-nez v0, :cond_3

    sub-long/2addr v4, v6

    add-long/2addr v2, v6

    goto :goto_1

    :cond_8
    new-instance v0, La/a/a/c/a;

    new-instance v2, Ljava/lang/StringBuffer;

    const-string v3, "AESExtraDataRecord does not exist for AES encrypted file: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, La/a/a/g/c;->b:La/a/a/e/f;

    invoke-virtual {v3}, La/a/a/e/f;->j()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, La/a/a/c/a;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_0
    new-instance v7, La/a/a/d/d;

    new-instance v0, La/a/a/d/c;

    move-object v6, p0

    invoke-direct/range {v0 .. v6}, La/a/a/d/c;-><init>(Ljava/io/RandomAccessFile;JJLa/a/a/g/c;)V

    invoke-direct {v7, v0}, La/a/a/d/d;-><init>(La/a/a/d/a;)V

    move-object v0, v7

    :goto_3
    return-object v0

    :sswitch_1
    new-instance v7, La/a/a/d/d;

    new-instance v0, La/a/a/d/b;

    move-object v6, p0

    invoke-direct/range {v0 .. v6}, La/a/a/d/b;-><init>(Ljava/io/RandomAccessFile;JJLa/a/a/g/c;)V

    invoke-direct {v7, v0}, La/a/a/d/d;-><init>(La/a/a/d/a;)V
    :try_end_4
    .catch La/a/a/c/a; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    move-object v0, v7

    goto :goto_3

    :catch_2
    move-exception v1

    goto/16 :goto_0

    :catch_3
    move-exception v1

    goto :goto_2

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x8 -> :sswitch_1
    .end sparse-switch
.end method

.method public a(I)V
    .locals 1

    iget-object v0, p0, La/a/a/g/c;->f:Ljava/util/zip/CRC32;

    invoke-virtual {v0, p1}, Ljava/util/zip/CRC32;->update(I)V

    return-void
.end method

.method public a(La/a/a/f/a;Ljava/lang/String;Ljava/lang/String;La/a/a/e/h;)V
    .locals 6

    const/4 v1, 0x0

    iget-object v0, p0, La/a/a/g/c;->a:La/a/a/e/l;

    if-eqz v0, :cond_0

    iget-object v0, p0, La/a/a/g/c;->b:La/a/a/e/f;

    if-eqz v0, :cond_0

    invoke-static {p2}, La/a/a/h/c;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    new-instance v0, La/a/a/c/a;

    const-string v1, "Invalid parameters passed during unzipping file. One or more of the parameters were null"

    invoke-direct {v0, v1}, La/a/a/c/a;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    const/16 v0, 0x1000

    :try_start_0
    new-array v0, v0, [B

    invoke-virtual {p0}, La/a/a/g/c;->a()La/a/a/d/d;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-result-object v2

    :try_start_1
    invoke-direct {p0, p2, p3}, La/a/a/g/c;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/io/FileOutputStream;

    move-result-object v1

    :cond_2
    invoke-virtual {v2, v0}, Ljava/io/InputStream;->read([B)I

    move-result v3

    const/4 v4, -0x1

    if-ne v3, v4, :cond_3

    invoke-direct {p0, v2, v1}, La/a/a/g/c;->a(Ljava/io/InputStream;Ljava/io/OutputStream;)V

    iget-object v0, p0, La/a/a/g/c;->b:La/a/a/e/f;

    new-instance v3, Ljava/io/File;

    invoke-direct {p0, p2, p3}, La/a/a/g/c;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v3, p4}, La/a/a/g/d;->a(La/a/a/e/f;Ljava/io/File;La/a/a/e/h;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-direct {p0, v2, v1}, La/a/a/g/c;->a(Ljava/io/InputStream;Ljava/io/OutputStream;)V

    :goto_0
    return-void

    :cond_3
    const/4 v4, 0x0

    :try_start_2
    invoke-virtual {v1, v0, v4, v3}, Ljava/io/OutputStream;->write([BII)V

    int-to-long v4, v3

    invoke-virtual {p1, v4, v5}, La/a/a/f/a;->b(J)V

    invoke-virtual {p1}, La/a/a/f/a;->d()Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 v0, 0x3

    invoke-virtual {p1, v0}, La/a/a/f/a;->b(I)V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, La/a/a/f/a;->a(I)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-direct {p0, v2, v1}, La/a/a/g/c;->a(Ljava/io/InputStream;Ljava/io/OutputStream;)V

    goto :goto_0

    :catch_0
    move-exception v0

    move-object v2, v1

    :goto_1
    :try_start_3
    new-instance v3, La/a/a/c/a;

    invoke-direct {v3, v0}, La/a/a/c/a;-><init>(Ljava/lang/Throwable;)V

    throw v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_0
    move-exception v0

    :goto_2
    invoke-direct {p0, v2, v1}, La/a/a/g/c;->a(Ljava/io/InputStream;Ljava/io/OutputStream;)V

    throw v0

    :catch_1
    move-exception v0

    move-object v2, v1

    :goto_3
    :try_start_4
    new-instance v3, La/a/a/c/a;

    invoke-direct {v3, v0}, La/a/a/c/a;-><init>(Ljava/lang/Throwable;)V

    throw v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :catchall_1
    move-exception v0

    move-object v2, v1

    goto :goto_2

    :catch_2
    move-exception v0

    goto :goto_3

    :catch_3
    move-exception v0

    goto :goto_1
.end method

.method public a([BII)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, La/a/a/g/c;->f:Ljava/util/zip/CRC32;

    invoke-virtual {v0, p1, p2, p3}, Ljava/util/zip/CRC32;->update([BII)V

    :cond_0
    return-void
.end method

.method public b()V
    .locals 5

    const/16 v4, 0xa

    const/4 v3, 0x0

    iget-object v0, p0, La/a/a/g/c;->b:La/a/a/e/f;

    if-eqz v0, :cond_4

    iget-object v0, p0, La/a/a/g/c;->b:La/a/a/e/f;

    invoke-virtual {v0}, La/a/a/e/f;->m()I

    move-result v0

    const/16 v1, 0x63

    if-ne v0, v1, :cond_2

    iget-object v0, p0, La/a/a/g/c;->e:La/a/a/b/b;

    if-eqz v0, :cond_4

    iget-object v0, p0, La/a/a/g/c;->e:La/a/a/b/b;

    instance-of v0, v0, La/a/a/b/a;

    if-eqz v0, :cond_4

    iget-object v0, p0, La/a/a/g/c;->e:La/a/a/b/b;

    check-cast v0, La/a/a/b/a;

    invoke-virtual {v0}, La/a/a/b/a;->c()[B

    move-result-object v1

    iget-object v0, p0, La/a/a/g/c;->e:La/a/a/b/b;

    check-cast v0, La/a/a/b/a;

    invoke-virtual {v0}, La/a/a/b/a;->d()[B

    move-result-object v0

    new-array v2, v4, [B

    if-eqz v2, :cond_0

    if-nez v0, :cond_1

    :cond_0
    new-instance v0, La/a/a/c/a;

    new-instance v1, Ljava/lang/StringBuffer;

    const-string v2, "CRC (MAC) check failed for "

    invoke-direct {v1, v2}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, La/a/a/g/c;->b:La/a/a/e/f;

    invoke-virtual {v2}, La/a/a/e/f;->j()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, La/a/a/c/a;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static {v1, v3, v2, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v2, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-nez v0, :cond_4

    new-instance v0, La/a/a/c/a;

    new-instance v1, Ljava/lang/StringBuffer;

    const-string v2, "invalid CRC (MAC) for file: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, La/a/a/g/c;->b:La/a/a/e/f;

    invoke-virtual {v2}, La/a/a/e/f;->j()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, La/a/a/c/a;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v0, p0, La/a/a/g/c;->f:Ljava/util/zip/CRC32;

    invoke-virtual {v0}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    iget-object v2, p0, La/a/a/g/c;->b:La/a/a/e/f;

    invoke-virtual {v2}, La/a/a/e/f;->c()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-eqz v0, :cond_4

    new-instance v0, Ljava/lang/StringBuffer;

    const-string v1, "invalid CRC for file: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, La/a/a/g/c;->b:La/a/a/e/f;

    invoke-virtual {v1}, La/a/a/e/f;->j()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, La/a/a/g/c;->d:La/a/a/e/g;

    invoke-virtual {v1}, La/a/a/e/g;->h()Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, La/a/a/g/c;->d:La/a/a/e/g;

    invoke-virtual {v1}, La/a/a/e/g;->i()I

    move-result v1

    if-nez v1, :cond_3

    new-instance v1, Ljava/lang/StringBuffer;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    const-string v0, " - Wrong Password?"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_3
    new-instance v1, La/a/a/c/a;

    invoke-direct {v1, v0}, La/a/a/c/a;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_4
    return-void
.end method

.method public c()Ljava/io/RandomAccessFile;
    .locals 4

    const/4 v3, 0x0

    iget-object v0, p0, La/a/a/g/c;->a:La/a/a/e/l;

    invoke-virtual {v0}, La/a/a/e/l;->d()Ljava/lang/String;

    move-result-object v0

    iget v1, p0, La/a/a/g/c;->c:I

    iget-object v2, p0, La/a/a/g/c;->a:La/a/a/e/l;

    invoke-virtual {v2}, La/a/a/e/l;->b()La/a/a/e/d;

    move-result-object v2

    invoke-virtual {v2}, La/a/a/e/d;->a()I

    move-result v2

    if-ne v1, v2, :cond_0

    iget-object v0, p0, La/a/a/g/c;->a:La/a/a/e/l;

    invoke-virtual {v0}, La/a/a/e/l;->d()Ljava/lang/String;

    move-result-object v0

    :goto_0
    iget v1, p0, La/a/a/g/c;->c:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, La/a/a/g/c;->c:I

    :try_start_0
    invoke-static {v0}, La/a/a/h/c;->d(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    new-instance v1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuffer;

    const-string v3, "zip split file does not exist: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_0
    .catch La/a/a/c/a; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/io/IOException;

    invoke-virtual {v0}, La/a/a/c/a;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_0
    iget v1, p0, La/a/a/g/c;->c:I

    const/16 v2, 0x9

    if-lt v1, v2, :cond_1

    new-instance v1, Ljava/lang/StringBuffer;

    const-string v2, "."

    invoke-virtual {v0, v2}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v0, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    const-string v0, ".z"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, La/a/a/g/c;->c:I

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    new-instance v1, Ljava/lang/StringBuffer;

    const-string v2, "."

    invoke-virtual {v0, v2}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v0, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    const-string v0, ".z0"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, La/a/a/g/c;->c:I

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_2
    new-instance v1, Ljava/io/RandomAccessFile;

    const-string v2, "r"

    invoke-direct {v1, v0, v2}, Ljava/io/RandomAccessFile;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public d()La/a/a/e/f;
    .locals 1

    iget-object v0, p0, La/a/a/g/c;->b:La/a/a/e/f;

    return-object v0
.end method

.method public e()La/a/a/b/b;
    .locals 1

    iget-object v0, p0, La/a/a/g/c;->e:La/a/a/b/b;

    return-object v0
.end method

.method public f()La/a/a/e/l;
    .locals 1

    iget-object v0, p0, La/a/a/g/c;->a:La/a/a/e/l;

    return-object v0
.end method

.method public g()La/a/a/e/g;
    .locals 1

    iget-object v0, p0, La/a/a/g/c;->d:La/a/a/e/g;

    return-object v0
.end method
