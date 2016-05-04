.class public La/a/a/a/b;
.super Ljava/lang/Object;


# instance fields
.field private a:Ljava/lang/String;

.field private b:I

.field private c:La/a/a/e/l;

.field private d:La/a/a/f/a;

.field private e:Z

.field private f:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/io/File;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p1, :cond_0

    new-instance v0, La/a/a/c/a;

    const-string v1, "Input zip file parameter is not null"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, La/a/a/c/a;-><init>(Ljava/lang/String;I)V

    throw v0

    :cond_0
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, La/a/a/a/b;->a:Ljava/lang/String;

    const/4 v0, 0x2

    iput v0, p0, La/a/a/a/b;->b:I

    new-instance v0, La/a/a/f/a;

    invoke-direct {v0}, La/a/a/f/a;-><init>()V

    iput-object v0, p0, La/a/a/a/b;->d:La/a/a/f/a;

    const/4 v0, 0x0

    iput-boolean v0, p0, La/a/a/a/b;->e:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, La/a/a/a/b;-><init>(Ljava/io/File;)V

    return-void
.end method

.method private a()V
    .locals 4

    iget-object v0, p0, La/a/a/a/b;->a:Ljava/lang/String;

    invoke-static {v0}, La/a/a/h/c;->d(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, La/a/a/c/a;

    const-string v1, "zip file does not exist"

    invoke-direct {v0, v1}, La/a/a/c/a;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, La/a/a/a/b;->a:Ljava/lang/String;

    invoke-static {v0}, La/a/a/h/c;->c(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, La/a/a/c/a;

    const-string v1, "no read access for the input zip file"

    invoke-direct {v0, v1}, La/a/a/c/a;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget v0, p0, La/a/a/a/b;->b:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    new-instance v0, La/a/a/c/a;

    const-string v1, "Invalid mode"

    invoke-direct {v0, v1}, La/a/a/c/a;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    const/4 v2, 0x0

    :try_start_0
    new-instance v1, Ljava/io/RandomAccessFile;

    new-instance v0, Ljava/io/File;

    iget-object v3, p0, La/a/a/a/b;->a:Ljava/lang/String;

    invoke-direct {v0, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    const-string v3, "r"

    invoke-direct {v1, v0, v3}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v0, p0, La/a/a/a/b;->c:La/a/a/e/l;

    if-nez v0, :cond_3

    new-instance v0, La/a/a/a/a;

    invoke-direct {v0, v1}, La/a/a/a/a;-><init>(Ljava/io/RandomAccessFile;)V

    iget-object v2, p0, La/a/a/a/b;->f:Ljava/lang/String;

    invoke-virtual {v0, v2}, La/a/a/a/a;->a(Ljava/lang/String;)La/a/a/e/l;

    move-result-object v0

    iput-object v0, p0, La/a/a/a/b;->c:La/a/a/e/l;

    iget-object v0, p0, La/a/a/a/b;->c:La/a/a/e/l;

    if-eqz v0, :cond_3

    iget-object v0, p0, La/a/a/a/b;->c:La/a/a/e/l;

    iget-object v2, p0, La/a/a/a/b;->a:Ljava/lang/String;

    invoke-virtual {v0, v2}, La/a/a/e/l;->a(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_3
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_3
    if-eqz v1, :cond_4

    :try_start_2
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    :cond_4
    :goto_0
    return-void

    :catch_0
    move-exception v0

    move-object v1, v2

    :goto_1
    :try_start_3
    new-instance v2, La/a/a/c/a;

    invoke-direct {v2, v0}, La/a/a/c/a;-><init>(Ljava/lang/Throwable;)V

    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_0
    move-exception v0

    :goto_2
    if-eqz v1, :cond_5

    :try_start_4
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    :cond_5
    :goto_3
    throw v0

    :catch_1
    move-exception v1

    goto :goto_3

    :catch_2
    move-exception v0

    goto :goto_0

    :catchall_1
    move-exception v0

    move-object v1, v2

    goto :goto_2

    :catch_3
    move-exception v0

    goto :goto_1
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, La/a/a/a/b;->a(Ljava/lang/String;La/a/a/e/h;)V

    return-void
.end method

.method public a(Ljava/lang/String;La/a/a/e/h;)V
    .locals 3

    invoke-static {p1}, La/a/a/h/c;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, La/a/a/c/a;

    const-string v1, "output path is null or invalid"

    invoke-direct {v0, v1}, La/a/a/c/a;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-static {p1}, La/a/a/h/c;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, La/a/a/c/a;

    const-string v1, "invalid output path"

    invoke-direct {v0, v1}, La/a/a/c/a;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, p0, La/a/a/a/b;->c:La/a/a/e/l;

    if-nez v0, :cond_2

    invoke-direct {p0}, La/a/a/a/b;->a()V

    :cond_2
    iget-object v0, p0, La/a/a/a/b;->c:La/a/a/e/l;

    if-nez v0, :cond_3

    new-instance v0, La/a/a/c/a;

    const-string v1, "Internal error occurred when extracting zip file"

    invoke-direct {v0, v1}, La/a/a/c/a;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    iget-object v0, p0, La/a/a/a/b;->d:La/a/a/f/a;

    invoke-virtual {v0}, La/a/a/f/a;->a()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    new-instance v0, La/a/a/c/a;

    const-string v1, "invalid operation - Zip4j is in busy state"

    invoke-direct {v0, v1}, La/a/a/c/a;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    new-instance v0, La/a/a/g/a;

    iget-object v1, p0, La/a/a/a/b;->c:La/a/a/e/l;

    invoke-direct {v0, v1}, La/a/a/g/a;-><init>(La/a/a/e/l;)V

    iget-object v1, p0, La/a/a/a/b;->d:La/a/a/f/a;

    iget-boolean v2, p0, La/a/a/a/b;->e:Z

    invoke-virtual {v0, p2, p1, v1, v2}, La/a/a/g/a;->a(La/a/a/e/h;Ljava/lang/String;La/a/a/f/a;Z)V

    return-void
.end method

.method public a([C)V
    .locals 2

    iget-object v0, p0, La/a/a/a/b;->c:La/a/a/e/l;

    if-nez v0, :cond_0

    invoke-direct {p0}, La/a/a/a/b;->a()V

    iget-object v0, p0, La/a/a/a/b;->c:La/a/a/e/l;

    if-nez v0, :cond_0

    new-instance v0, La/a/a/c/a;

    const-string v1, "Zip Model is null"

    invoke-direct {v0, v1}, La/a/a/c/a;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, La/a/a/a/b;->c:La/a/a/e/l;

    invoke-virtual {v0}, La/a/a/e/l;->a()La/a/a/e/b;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, La/a/a/a/b;->c:La/a/a/e/l;

    invoke-virtual {v0}, La/a/a/e/l;->a()La/a/a/e/b;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/e/b;->a()Ljava/util/ArrayList;

    move-result-object v0

    if-nez v0, :cond_2

    :cond_1
    new-instance v0, La/a/a/c/a;

    const-string v1, "invalid zip file"

    invoke-direct {v0, v1}, La/a/a/c/a;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, La/a/a/a/b;->c:La/a/a/e/l;

    invoke-virtual {v0}, La/a/a/e/l;->a()La/a/a/e/b;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/e/b;->a()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lt v1, v0, :cond_3

    return-void

    :cond_3
    iget-object v0, p0, La/a/a/a/b;->c:La/a/a/e/l;

    invoke-virtual {v0}, La/a/a/e/l;->a()La/a/a/e/b;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/e/b;->a()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_4

    iget-object v0, p0, La/a/a/a/b;->c:La/a/a/e/l;

    invoke-virtual {v0}, La/a/a/e/l;->a()La/a/a/e/b;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/e/b;->a()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/a/a/e/f;

    invoke-virtual {v0}, La/a/a/e/f;->l()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, La/a/a/a/b;->c:La/a/a/e/l;

    invoke-virtual {v0}, La/a/a/e/l;->a()La/a/a/e/b;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/e/b;->a()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/a/a/e/f;

    invoke-virtual {v0, p1}, La/a/a/e/f;->a([C)V

    :cond_4
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0
.end method

.method public b(Ljava/lang/String;)V
    .locals 1

    invoke-static {p1}, La/a/a/h/c;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    invoke-virtual {p0, v0}, La/a/a/a/b;->a([C)V

    return-void
.end method
