.class public La/a/a/g/a;
.super Ljava/lang/Object;


# instance fields
.field private a:La/a/a/e/l;


# direct methods
.method public constructor <init>(La/a/a/e/l;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p1, :cond_0

    new-instance v0, La/a/a/c/a;

    const-string v1, "ZipModel is null"

    invoke-direct {v0, v1}, La/a/a/c/a;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iput-object p1, p0, La/a/a/g/a;->a:La/a/a/e/l;

    return-void
.end method

.method private a(Ljava/util/ArrayList;)J
    .locals 8

    const-wide/16 v4, 0x0

    if-nez p1, :cond_0

    new-instance v0, La/a/a/c/a;

    const-string v1, "fileHeaders is null, cannot calculate total work"

    invoke-direct {v0, v1}, La/a/a/c/a;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    const/4 v0, 0x0

    move v1, v0

    move-wide v2, v4

    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lt v1, v0, :cond_1

    return-wide v2

    :cond_1
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/a/a/e/f;

    invoke-virtual {v0}, La/a/a/e/f;->q()La/a/a/e/k;

    move-result-object v6

    if-eqz v6, :cond_2

    invoke-virtual {v0}, La/a/a/e/f;->q()La/a/a/e/k;

    move-result-object v6

    invoke-virtual {v6}, La/a/a/e/k;->b()J

    move-result-wide v6

    cmp-long v6, v6, v4

    if-lez v6, :cond_2

    invoke-virtual {v0}, La/a/a/e/f;->q()La/a/a/e/k;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/e/k;->a()J

    move-result-wide v6

    add-long/2addr v2, v6

    :goto_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, La/a/a/e/f;->d()J

    move-result-wide v6

    add-long/2addr v2, v6

    goto :goto_1
.end method

.method private a(La/a/a/e/f;Ljava/lang/String;La/a/a/e/h;Ljava/lang/String;La/a/a/f/a;)V
    .locals 3

    if-nez p1, :cond_0

    new-instance v0, La/a/a/c/a;

    const-string v1, "fileHeader is null"

    invoke-direct {v0, v1}, La/a/a/c/a;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    :try_start_0
    invoke-virtual {p1}, La/a/a/e/f;->j()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p5, v0}, La/a/a/f/a;->a(Ljava/lang/String;)V

    sget-object v0, La/a/a/h/a;->b:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/StringBuffer;

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    sget-object v1, La/a/a/h/a;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p2

    :cond_1
    invoke-virtual {p1}, La/a/a/e/f;->k()Z
    :try_end_0
    .catch La/a/a/c/a; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3

    move-result v0

    if-eqz v0, :cond_4

    :try_start_1
    invoke-virtual {p1}, La/a/a/e/f;->j()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, La/a/a/h/c;->a(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_3

    :cond_2
    :goto_0
    return-void

    :cond_3
    new-instance v1, Ljava/lang/StringBuffer;

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catch La/a/a/c/a; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_0
    move-exception v0

    :try_start_2
    invoke-virtual {p5, v0}, La/a/a/f/a;->a(Ljava/lang/Throwable;)V

    new-instance v1, La/a/a/c/a;

    invoke-direct {v1, v0}, La/a/a/c/a;-><init>(Ljava/lang/Throwable;)V

    throw v1
    :try_end_2
    .catch La/a/a/c/a; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3

    :catch_1
    move-exception v0

    invoke-virtual {p5, v0}, La/a/a/f/a;->a(Ljava/lang/Throwable;)V

    throw v0

    :cond_4
    :try_start_3
    invoke-direct {p0, p1, p2, p4}, La/a/a/g/a;->a(La/a/a/e/f;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, La/a/a/g/c;

    iget-object v1, p0, La/a/a/g/a;->a:La/a/a/e/l;

    invoke-direct {v0, v1, p1}, La/a/a/g/c;-><init>(La/a/a/e/l;La/a/a/e/f;)V
    :try_end_3
    .catch La/a/a/c/a; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    :try_start_4
    invoke-virtual {v0, p5, p2, p4, p3}, La/a/a/g/c;->a(La/a/a/f/a;Ljava/lang/String;Ljava/lang/String;La/a/a/e/h;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2
    .catch La/a/a/c/a; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_0

    :catch_2
    move-exception v0

    :try_start_5
    invoke-virtual {p5, v0}, La/a/a/f/a;->a(Ljava/lang/Throwable;)V

    new-instance v1, La/a/a/c/a;

    invoke-direct {v1, v0}, La/a/a/c/a;-><init>(Ljava/lang/Throwable;)V

    throw v1
    :try_end_5
    .catch La/a/a/c/a; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    :catch_3
    move-exception v0

    invoke-virtual {p5, v0}, La/a/a/f/a;->a(Ljava/lang/Throwable;)V

    new-instance v1, La/a/a/c/a;

    invoke-direct {v1, v0}, La/a/a/c/a;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method private a(La/a/a/e/f;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    if-eqz p1, :cond_0

    invoke-static {p2}, La/a/a/h/c;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    new-instance v0, La/a/a/c/a;

    const-string v1, "Cannot check output directory structure...one of the parameters was null"

    invoke-direct {v0, v1}, La/a/a/c/a;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-virtual {p1}, La/a/a/e/f;->j()Ljava/lang/String;

    move-result-object v0

    invoke-static {p3}, La/a/a/h/c;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    :goto_0
    invoke-static {p3}, La/a/a/h/c;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    :cond_2
    :goto_1
    return-void

    :cond_3
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    :try_start_0
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->getParent()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    new-instance v1, La/a/a/c/a;

    invoke-direct {v1, v0}, La/a/a/c/a;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :cond_4
    move-object p3, v0

    goto :goto_0
.end method

.method static a(La/a/a/g/a;Ljava/util/ArrayList;La/a/a/e/h;La/a/a/f/a;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, La/a/a/g/a;->a(Ljava/util/ArrayList;La/a/a/e/h;La/a/a/f/a;Ljava/lang/String;)V

    return-void
.end method

.method private a(Ljava/util/ArrayList;La/a/a/e/h;La/a/a/f/a;Ljava/lang/String;)V
    .locals 8

    const/4 v7, 0x0

    move v6, v7

    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lt v6, v0, :cond_0

    :goto_1
    return-void

    :cond_0
    invoke-virtual {p1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/a/a/e/f;

    const/4 v4, 0x0

    move-object v0, p0

    move-object v2, p4

    move-object v3, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, La/a/a/g/a;->a(La/a/a/e/f;Ljava/lang/String;La/a/a/e/h;Ljava/lang/String;La/a/a/f/a;)V

    invoke-virtual {p3}, La/a/a/f/a;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x3

    invoke-virtual {p3, v0}, La/a/a/f/a;->b(I)V

    invoke-virtual {p3, v7}, La/a/a/f/a;->a(I)V

    goto :goto_1

    :cond_1
    add-int/lit8 v0, v6, 0x1

    move v6, v0

    goto :goto_0
.end method


# virtual methods
.method public a(La/a/a/e/h;Ljava/lang/String;La/a/a/f/a;Z)V
    .locals 7

    const/4 v2, 0x1

    iget-object v0, p0, La/a/a/g/a;->a:La/a/a/e/l;

    invoke-virtual {v0}, La/a/a/e/l;->a()La/a/a/e/b;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, La/a/a/e/b;->a()Ljava/util/ArrayList;

    move-result-object v1

    if-nez v1, :cond_1

    :cond_0
    new-instance v0, La/a/a/c/a;

    const-string v1, "invalid central directory in zipModel"

    invoke-direct {v0, v1}, La/a/a/c/a;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-virtual {v0}, La/a/a/e/b;->a()Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {p3, v2}, La/a/a/f/a;->c(I)V

    invoke-direct {p0, v3}, La/a/a/g/a;->a(Ljava/util/ArrayList;)J

    move-result-wide v0

    invoke-virtual {p3, v0, v1}, La/a/a/f/a;->a(J)V

    invoke-virtual {p3, v2}, La/a/a/f/a;->a(I)V

    if-eqz p4, :cond_2

    new-instance v0, La/a/a/g/b;

    const-string v2, "Zip4j"

    move-object v1, p0

    move-object v4, p1

    move-object v5, p3

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, La/a/a/g/b;-><init>(La/a/a/g/a;Ljava/lang/String;Ljava/util/ArrayList;La/a/a/e/h;La/a/a/f/a;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    :goto_0
    return-void

    :cond_2
    invoke-direct {p0, v3, p1, p3, p2}, La/a/a/g/a;->a(Ljava/util/ArrayList;La/a/a/e/h;La/a/a/f/a;Ljava/lang/String;)V

    goto :goto_0
.end method
