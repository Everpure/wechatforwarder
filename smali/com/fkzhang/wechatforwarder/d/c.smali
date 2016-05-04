.class public Lcom/fkzhang/wechatforwarder/d/c;
.super Ljava/lang/Object;


# instance fields
.field private a:Landroid/content/Context;

.field private b:[Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Landroid/net/Uri;

.field private e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/net/Uri;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0xb

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "_ID"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "ACCOUNT"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "USERNAME"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-string v2, "NICKNAME"

    aput-object v2, v0, v1

    const/4 v1, 0x4

    const-string v2, "TARGETS"

    aput-object v2, v0, v1

    const/4 v1, 0x5

    const-string v2, "TARGETSNICK"

    aput-object v2, v0, v1

    const/4 v1, 0x6

    const-string v2, "ACCOUNTNICK"

    aput-object v2, v0, v1

    const/4 v1, 0x7

    const-string v2, "CHATMEMBER"

    aput-object v2, v0, v1

    const/16 v1, 0x8

    const-string v2, "CHATMEMBERNICK"

    aput-object v2, v0, v1

    const/16 v1, 0x9

    const-string v2, "TYPES"

    aput-object v2, v0, v1

    const/16 v1, 0xa

    const-string v2, "ENABLE"

    aput-object v2, v0, v1

    iput-object v0, p0, Lcom/fkzhang/wechatforwarder/d/c;->b:[Ljava/lang/String;

    const-string v0, "ACCOUNT = ? AND USERNAME = ?"

    iput-object v0, p0, Lcom/fkzhang/wechatforwarder/d/c;->c:Ljava/lang/String;

    iput-object p1, p0, Lcom/fkzhang/wechatforwarder/d/c;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/fkzhang/wechatforwarder/d/c;->d:Landroid/net/Uri;

    return-void
.end method

.method private a(Landroid/database/Cursor;)Lcom/fkzhang/wechatforwarder/d/d;
    .locals 11

    const-string v0, "ACCOUNT"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v0, "USERNAME"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    const-string v0, "NICKNAME"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    const-string v0, "TARGETSNICK"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    const-string v0, "TARGETS"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    const-string v0, "ACCOUNTNICK"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    const-string v0, "CHATMEMBER"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    const-string v0, "CHATMEMBERNICK"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v8

    const-string v0, "TYPES"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v9

    const-string v0, "ENABLE"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v10

    new-instance v0, Lcom/fkzhang/wechatforwarder/d/d;

    invoke-direct/range {v0 .. v10}, Lcom/fkzhang/wechatforwarder/d/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    return-object v0
.end method

.method private a(Ljava/lang/Integer;)V
    .locals 6

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/d/c;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/d/c;->d:Landroid/net/Uri;

    const-string v2, "ACCOUNT=? AND _ID=?"

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/String;

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/fkzhang/wechatforwarder/d/c;->e:Ljava/lang/String;

    aput-object v5, v3, v4

    const/4 v4, 0x1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I

    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 2

    invoke-direct {p0, p1}, Lcom/fkzhang/wechatforwarder/d/c;->b(Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-direct/range {p0 .. p9}, Lcom/fkzhang/wechatforwarder/d/c;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    :goto_0
    return-void

    :cond_0
    invoke-interface {v0}, Landroid/database/Cursor;->getCount()I

    move-result v1

    if-lez v1, :cond_1

    invoke-direct/range {p0 .. p9}, Lcom/fkzhang/wechatforwarder/d/c;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    :goto_1
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    goto :goto_0

    :cond_1
    invoke-direct/range {p0 .. p9}, Lcom/fkzhang/wechatforwarder/d/c;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    goto :goto_1
.end method

.method private b()Landroid/database/Cursor;
    .locals 7

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/d/c;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/d/c;->d:Landroid/net/Uri;

    iget-object v2, p0, Lcom/fkzhang/wechatforwarder/d/c;->b:[Ljava/lang/String;

    const-string v3, "ACCOUNT = ?"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/String;

    const/4 v5, 0x0

    iget-object v6, p0, Lcom/fkzhang/wechatforwarder/d/c;->e:Ljava/lang/String;

    aput-object v6, v4, v5

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    return-object v0
.end method

.method private b(Ljava/lang/String;)Landroid/database/Cursor;
    .locals 7

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/d/c;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/d/c;->d:Landroid/net/Uri;

    iget-object v2, p0, Lcom/fkzhang/wechatforwarder/d/c;->b:[Ljava/lang/String;

    iget-object v3, p0, Lcom/fkzhang/wechatforwarder/d/c;->c:Ljava/lang/String;

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/String;

    const/4 v5, 0x0

    iget-object v6, p0, Lcom/fkzhang/wechatforwarder/d/c;->e:Ljava/lang/String;

    aput-object v6, v4, v5

    const/4 v5, 0x1

    aput-object p1, v4, v5

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    return-object v0
.end method

.method private b(Landroid/database/Cursor;)Ljava/util/ArrayList;
    .locals 5

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    if-nez p1, :cond_0

    move-object v0, v1

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v3

    if-eqz v3, :cond_2

    :cond_1
    invoke-direct {p0, p1}, Lcom/fkzhang/wechatforwarder/d/c;->a(Landroid/database/Cursor;)Lcom/fkzhang/wechatforwarder/d/d;

    move-result-object v3

    invoke-virtual {v3}, Lcom/fkzhang/wechatforwarder/d/d;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    const-string v4, "_ID"

    invoke-interface {p1, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    invoke-interface {p1, v4}, Landroid/database/Cursor;->getInt(I)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_1
    invoke-virtual {v3}, Lcom/fkzhang/wechatforwarder/d/d;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v3

    if-nez v3, :cond_1

    :cond_2
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-direct {p0, v0}, Lcom/fkzhang/wechatforwarder/d/c;->a(Ljava/lang/Integer;)V

    goto :goto_2

    :cond_3
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    move-object v0, v1

    goto :goto_0
.end method

.method private b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 3

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/d/c;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/d/c;->d:Landroid/net/Uri;

    invoke-direct/range {p0 .. p9}, Lcom/fkzhang/wechatforwarder/d/c;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Landroid/content/ContentValues;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;

    return-void
.end method

.method private c(Ljava/lang/String;)V
    .locals 6

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/d/c;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/d/c;->d:Landroid/net/Uri;

    iget-object v2, p0, Lcom/fkzhang/wechatforwarder/d/c;->c:Ljava/lang/String;

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/String;

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/fkzhang/wechatforwarder/d/c;->e:Ljava/lang/String;

    aput-object v5, v3, v4

    const/4 v4, 0x1

    aput-object p1, v3, v4

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I

    return-void
.end method

.method private c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 7

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/d/c;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/d/c;->d:Landroid/net/Uri;

    invoke-direct/range {p0 .. p9}, Lcom/fkzhang/wechatforwarder/d/c;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Landroid/content/ContentValues;

    move-result-object v2

    iget-object v3, p0, Lcom/fkzhang/wechatforwarder/d/c;->c:Ljava/lang/String;

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/String;

    const/4 v5, 0x0

    iget-object v6, p0, Lcom/fkzhang/wechatforwarder/d/c;->e:Ljava/lang/String;

    aput-object v6, v4, v5

    const/4 v5, 0x1

    aput-object p1, v4, v5

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/content/ContentResolver;->update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    return-void
.end method

.method private d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Landroid/content/ContentValues;
    .locals 3

    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    const-string v1, "ACCOUNT"

    iget-object v2, p0, Lcom/fkzhang/wechatforwarder/d/c;->e:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "USERNAME"

    invoke-virtual {v0, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "NICKNAME"

    invoke-virtual {v0, v1, p3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "TARGETSNICK"

    invoke-virtual {v0, v1, p4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "TARGETS"

    invoke-virtual {v0, v1, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "ACCOUNTNICK"

    invoke-virtual {v0, v1, p5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "CHATMEMBER"

    invoke-virtual {v0, v1, p6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "CHATMEMBERNICK"

    invoke-virtual {v0, v1, p7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "TYPES"

    invoke-virtual {v0, v1, p8}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "ENABLE"

    invoke-static {p9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    return-object v0
.end method


# virtual methods
.method public a()Ljava/util/ArrayList;
    .locals 1

    invoke-direct {p0}, Lcom/fkzhang/wechatforwarder/d/c;->b()Landroid/database/Cursor;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/fkzhang/wechatforwarder/d/c;->b(Landroid/database/Cursor;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/fkzhang/wechatforwarder/d/d;)V
    .locals 10

    invoke-virtual {p1}, Lcom/fkzhang/wechatforwarder/d/d;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/fkzhang/wechatforwarder/d/d;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/fkzhang/wechatforwarder/d/d;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/fkzhang/wechatforwarder/d/d;->d()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lcom/fkzhang/wechatforwarder/d/d;->e()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lcom/fkzhang/wechatforwarder/d/d;->g()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, Lcom/fkzhang/wechatforwarder/d/d;->h()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1}, Lcom/fkzhang/wechatforwarder/d/d;->i()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p1}, Lcom/fkzhang/wechatforwarder/d/d;->f()I

    move-result v9

    move-object v0, p0

    invoke-direct/range {v0 .. v9}, Lcom/fkzhang/wechatforwarder/d/c;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/fkzhang/wechatforwarder/d/c;->e:Ljava/lang/String;

    return-void
.end method

.method public b(Lcom/fkzhang/wechatforwarder/d/d;)V
    .locals 1

    invoke-virtual {p1}, Lcom/fkzhang/wechatforwarder/d/d;->b()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/fkzhang/wechatforwarder/d/c;->c(Ljava/lang/String;)V

    return-void
.end method

.method public c(Lcom/fkzhang/wechatforwarder/d/d;)V
    .locals 10

    invoke-virtual {p1}, Lcom/fkzhang/wechatforwarder/d/d;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/fkzhang/wechatforwarder/d/d;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/fkzhang/wechatforwarder/d/d;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/fkzhang/wechatforwarder/d/d;->d()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lcom/fkzhang/wechatforwarder/d/d;->e()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lcom/fkzhang/wechatforwarder/d/d;->g()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, Lcom/fkzhang/wechatforwarder/d/d;->h()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1}, Lcom/fkzhang/wechatforwarder/d/d;->i()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p1}, Lcom/fkzhang/wechatforwarder/d/d;->f()I

    move-result v9

    move-object v0, p0

    invoke-direct/range {v0 .. v9}, Lcom/fkzhang/wechatforwarder/d/c;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method
