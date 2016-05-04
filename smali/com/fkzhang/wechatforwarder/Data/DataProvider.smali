.class public Lcom/fkzhang/wechatforwarder/Data/DataProvider;
.super Landroid/content/ContentProvider;


# static fields
.field private static final a:Landroid/content/UriMatcher;


# instance fields
.field private b:Lcom/fkzhang/wechatforwarder/Data/c;

.field private c:Ljava/lang/String;

.field private d:Lcom/fkzhang/wechatforwarder/Data/d;

.field private e:Lcom/fkzhang/wechatforwarder/Data/b;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Landroid/content/UriMatcher;

    const/4 v1, -0x1

    invoke-direct {v0, v1}, Landroid/content/UriMatcher;-><init>(I)V

    sput-object v0, Lcom/fkzhang/wechatforwarder/Data/DataProvider;->a:Landroid/content/UriMatcher;

    sget-object v0, Lcom/fkzhang/wechatforwarder/Data/DataProvider;->a:Landroid/content/UriMatcher;

    const-string v1, "com.fkzhang.wechatforwarder.contentprovider"

    const-string v2, "contact"

    const/16 v3, 0xa

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    sget-object v0, Lcom/fkzhang/wechatforwarder/Data/DataProvider;->a:Landroid/content/UriMatcher;

    const-string v1, "com.fkzhang.wechatforwarder.contentprovider"

    const-string v2, "preference"

    const/16 v3, 0x14

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    sget-object v0, Lcom/fkzhang/wechatforwarder/Data/DataProvider;->a:Landroid/content/UriMatcher;

    const-string v1, "com.fkzhang.wechatforwarder.contentprovider"

    const-string v2, "chatrooms"

    const/16 v3, 0x65

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    sget-object v0, Lcom/fkzhang/wechatforwarder/Data/DataProvider;->a:Landroid/content/UriMatcher;

    const-string v1, "com.fkzhang.wechatforwarder.contentprovider"

    const-string v2, "bitmap/*"

    const/16 v3, 0x46

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    sget-object v0, Lcom/fkzhang/wechatforwarder/Data/DataProvider;->a:Landroid/content/UriMatcher;

    const-string v1, "com.fkzhang.wechatforwarder.contentprovider"

    const-string v2, "autoforwardlist"

    const/16 v3, 0x66

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    sget-object v0, Lcom/fkzhang/wechatforwarder/Data/DataProvider;->a:Landroid/content/UriMatcher;

    const-string v1, "com.fkzhang.wechatforwarder.contentprovider"

    const-string v2, "account"

    const/16 v3, 0x28

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/content/ContentProvider;-><init>()V

    return-void
.end method

.method private a()Ljava/io/File;
    .locals 1

    invoke-virtual {p0}, Lcom/fkzhang/wechatforwarder/Data/DataProvider;->getContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {v0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v0

    goto :goto_0
.end method

.method private a(Landroid/net/Uri;)V
    .locals 2

    invoke-virtual {p0}, Lcom/fkzhang/wechatforwarder/Data/DataProvider;->getContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/content/ContentResolver;->notifyChange(Landroid/net/Uri;Landroid/database/ContentObserver;)V

    goto :goto_0
.end method


# virtual methods
.method public delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 4

    const/4 v0, -0x1

    sget-object v1, Lcom/fkzhang/wechatforwarder/Data/DataProvider;->a:Landroid/content/UriMatcher;

    invoke-virtual {v1, p1}, Landroid/content/UriMatcher;->match(Landroid/net/Uri;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    :cond_0
    :goto_0
    return v0

    :sswitch_0
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/Data/DataProvider;->b:Lcom/fkzhang/wechatforwarder/Data/c;

    invoke-virtual {v0}, Lcom/fkzhang/wechatforwarder/Data/c;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const-string v1, "CONTACTS"

    invoke-virtual {v0, v1, p2, p3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    :goto_1
    invoke-direct {p0, p1}, Lcom/fkzhang/wechatforwarder/Data/DataProvider;->a(Landroid/net/Uri;)V

    goto :goto_0

    :sswitch_1
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/Data/DataProvider;->b:Lcom/fkzhang/wechatforwarder/Data/c;

    invoke-virtual {v0}, Lcom/fkzhang/wechatforwarder/Data/c;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const-string v1, "ACCOUNTS"

    invoke-virtual {v0, v1, p2, p3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    goto :goto_1

    :sswitch_2
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/Data/DataProvider;->d:Lcom/fkzhang/wechatforwarder/Data/d;

    invoke-virtual {v0}, Lcom/fkzhang/wechatforwarder/Data/d;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const-string v1, "PREFERENCES"

    invoke-virtual {v0, v1, p2, p3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    goto :goto_1

    :sswitch_3
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/Data/DataProvider;->b:Lcom/fkzhang/wechatforwarder/Data/c;

    invoke-virtual {v0}, Lcom/fkzhang/wechatforwarder/Data/c;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const-string v1, "CHATROOMS"

    invoke-virtual {v0, v1, p2, p3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    goto :goto_1

    :sswitch_4
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/Data/DataProvider;->e:Lcom/fkzhang/wechatforwarder/Data/b;

    invoke-virtual {v0}, Lcom/fkzhang/wechatforwarder/Data/b;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const-string v1, "AUTOFORWARDLIST"

    invoke-virtual {v0, v1, p2, p3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    goto :goto_1

    :sswitch_5
    new-instance v1, Ljava/io/File;

    invoke-direct {p0}, Lcom/fkzhang/wechatforwarder/Data/DataProvider;->a()Ljava/io/File;

    move-result-object v2

    invoke-virtual {p1}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        0xa -> :sswitch_0
        0x14 -> :sswitch_2
        0x28 -> :sswitch_1
        0x46 -> :sswitch_5
        0x65 -> :sswitch_3
        0x66 -> :sswitch_4
    .end sparse-switch
.end method

.method public getType(Landroid/net/Uri;)Ljava/lang/String;
    .locals 2

    sget-object v0, Lcom/fkzhang/wechatforwarder/Data/DataProvider;->a:Landroid/content/UriMatcher;

    invoke-virtual {v0, p1}, Landroid/content/UriMatcher;->match(Landroid/net/Uri;)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :sswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "vnd.android.cursor.dir/vnd."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/Data/DataProvider;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".contentprovider.contact"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :sswitch_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "vnd.android.cursor.dir/vnd."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/Data/DataProvider;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".contentprovider.account"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :sswitch_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "vnd.android.cursor.item/vnd."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/Data/DataProvider;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".contentprovider.preference"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :sswitch_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "vnd.android.cursor.item/vnd."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/Data/DataProvider;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".contentprovider.chatrooms"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :sswitch_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "vnd.android.cursor.item/vnd."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/Data/DataProvider;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".contentprovider.autoforwardlist"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    :sswitch_5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "vnd.android.cursor.item/vnd.com."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/Data/DataProvider;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".contentprovider.bitmap"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0xa -> :sswitch_0
        0x14 -> :sswitch_2
        0x28 -> :sswitch_1
        0x46 -> :sswitch_5
        0x65 -> :sswitch_3
        0x66 -> :sswitch_4
    .end sparse-switch
.end method

.method public insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    .locals 4

    const/4 v0, 0x0

    sget-object v1, Lcom/fkzhang/wechatforwarder/Data/DataProvider;->a:Landroid/content/UriMatcher;

    invoke-virtual {v1, p1}, Landroid/content/UriMatcher;->match(Landroid/net/Uri;)I

    move-result v1

    const-string v2, ""

    sparse-switch v1, :sswitch_data_0

    :goto_0
    return-object v0

    :sswitch_0
    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/Data/DataProvider;->b:Lcom/fkzhang/wechatforwarder/Data/c;

    invoke-virtual {v1}, Lcom/fkzhang/wechatforwarder/Data/c;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    const-string v2, "CONTACTS"

    invoke-virtual {v1, v2, v0, p2}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    move-result-wide v2

    const-string v0, "contact"

    :goto_1
    invoke-direct {p0, p1}, Lcom/fkzhang/wechatforwarder/Data/DataProvider;->a(Landroid/net/Uri;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    goto :goto_0

    :sswitch_1
    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/Data/DataProvider;->b:Lcom/fkzhang/wechatforwarder/Data/c;

    invoke-virtual {v1}, Lcom/fkzhang/wechatforwarder/Data/c;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    const-string v2, "ACCOUNTS"

    invoke-virtual {v1, v2, v0, p2}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    move-result-wide v2

    const-string v0, "account"

    goto :goto_1

    :sswitch_2
    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/Data/DataProvider;->d:Lcom/fkzhang/wechatforwarder/Data/d;

    invoke-virtual {v1}, Lcom/fkzhang/wechatforwarder/Data/d;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    const-string v2, "PREFERENCES"

    invoke-virtual {v1, v2, v0, p2}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    move-result-wide v2

    const-string v0, "preference"

    goto :goto_1

    :sswitch_3
    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/Data/DataProvider;->b:Lcom/fkzhang/wechatforwarder/Data/c;

    invoke-virtual {v1}, Lcom/fkzhang/wechatforwarder/Data/c;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    const-string v2, "CHATROOMS"

    invoke-virtual {v1, v2, v0, p2}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    move-result-wide v2

    const-string v0, "chatrooms"

    goto :goto_1

    :sswitch_4
    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/Data/DataProvider;->e:Lcom/fkzhang/wechatforwarder/Data/b;

    invoke-virtual {v1}, Lcom/fkzhang/wechatforwarder/Data/b;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    const-string v2, "AUTOFORWARDLIST"

    invoke-virtual {v1, v2, v0, p2}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    move-result-wide v2

    const-string v0, "autoforwardlist"

    goto :goto_1

    :sswitch_data_0
    .sparse-switch
        0xa -> :sswitch_0
        0x14 -> :sswitch_2
        0x28 -> :sswitch_1
        0x65 -> :sswitch_3
        0x66 -> :sswitch_4
    .end sparse-switch
.end method

.method public onCreate()Z
    .locals 2

    new-instance v0, Lcom/fkzhang/wechatforwarder/Data/c;

    invoke-virtual {p0}, Lcom/fkzhang/wechatforwarder/Data/DataProvider;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/fkzhang/wechatforwarder/Data/c;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/fkzhang/wechatforwarder/Data/DataProvider;->b:Lcom/fkzhang/wechatforwarder/Data/c;

    new-instance v0, Lcom/fkzhang/wechatforwarder/Data/d;

    invoke-virtual {p0}, Lcom/fkzhang/wechatforwarder/Data/DataProvider;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/fkzhang/wechatforwarder/Data/d;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/fkzhang/wechatforwarder/Data/DataProvider;->d:Lcom/fkzhang/wechatforwarder/Data/d;

    new-instance v0, Lcom/fkzhang/wechatforwarder/Data/b;

    invoke-virtual {p0}, Lcom/fkzhang/wechatforwarder/Data/DataProvider;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/fkzhang/wechatforwarder/Data/b;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/fkzhang/wechatforwarder/Data/DataProvider;->e:Lcom/fkzhang/wechatforwarder/Data/b;

    const-string v0, "com.fkzhang.wechatforwarder"

    iput-object v0, p0, Lcom/fkzhang/wechatforwarder/Data/DataProvider;->c:Ljava/lang/String;

    const/4 v0, 0x0

    return v0
.end method

.method public openFile(Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;
    .locals 4

    const/4 v1, 0x0

    sget-object v0, Lcom/fkzhang/wechatforwarder/Data/DataProvider;->a:Landroid/content/UriMatcher;

    invoke-virtual {v0, p1}, Landroid/content/UriMatcher;->match(Landroid/net/Uri;)I

    move-result v0

    const/16 v2, 0x46

    if-eq v0, v2, :cond_0

    move-object v0, v1

    :goto_0
    return-object v0

    :cond_0
    new-instance v2, Ljava/io/File;

    invoke-direct {p0}, Lcom/fkzhang/wechatforwarder/Data/DataProvider;->a()Ljava/io/File;

    move-result-object v0

    invoke-virtual {p1}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v0, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    const/4 v0, 0x0

    const-string v3, "w"

    invoke-virtual {p2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/high16 v0, 0x20000000

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v3

    if-nez v3, :cond_1

    :try_start_0
    invoke-virtual {v2}, Ljava/io/File;->createNewFile()Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    :goto_1
    const-string v3, "r"

    invoke-virtual {p2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v3

    if-nez v3, :cond_2

    move-object v0, v1

    goto :goto_0

    :catch_0
    move-exception v3

    invoke-virtual {v3}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_1

    :cond_2
    const/high16 v1, 0x10000000

    or-int/2addr v0, v1

    :cond_3
    const-string v1, "+"

    invoke-virtual {p2, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_4

    const/high16 v1, 0x2000000

    or-int/2addr v0, v1

    :cond_4
    invoke-static {v2, v0}, Landroid/os/ParcelFileDescriptor;->open(Ljava/io/File;I)Landroid/os/ParcelFileDescriptor;

    move-result-object v0

    goto :goto_0
.end method

.method public query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    .locals 8

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v5, 0x0

    new-instance v0, Landroid/database/sqlite/SQLiteQueryBuilder;

    invoke-direct {v0}, Landroid/database/sqlite/SQLiteQueryBuilder;-><init>()V

    sget-object v3, Lcom/fkzhang/wechatforwarder/Data/DataProvider;->a:Landroid/content/UriMatcher;

    invoke-virtual {v3, p1}, Landroid/content/UriMatcher;->match(Landroid/net/Uri;)I

    move-result v3

    sparse-switch v3, :sswitch_data_0

    :cond_0
    :goto_0
    return-object v5

    :sswitch_0
    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/Data/DataProvider;->b:Lcom/fkzhang/wechatforwarder/Data/c;

    invoke-virtual {v1}, Lcom/fkzhang/wechatforwarder/Data/c;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    const-string v2, "CONTACTS"

    invoke-virtual {v0, v2}, Landroid/database/sqlite/SQLiteQueryBuilder;->setTables(Ljava/lang/String;)V

    :goto_1
    if-eqz v1, :cond_0

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v6, v5

    move-object v7, p5

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteQueryBuilder;->query(Landroid/database/sqlite/SQLiteDatabase;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v5

    invoke-virtual {p0}, Lcom/fkzhang/wechatforwarder/Data/DataProvider;->getContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    invoke-interface {v5, v0, p1}, Landroid/database/Cursor;->setNotificationUri(Landroid/content/ContentResolver;Landroid/net/Uri;)V

    goto :goto_0

    :sswitch_1
    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/Data/DataProvider;->b:Lcom/fkzhang/wechatforwarder/Data/c;

    invoke-virtual {v1}, Lcom/fkzhang/wechatforwarder/Data/c;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    const-string v2, "ACCOUNTS"

    invoke-virtual {v0, v2}, Landroid/database/sqlite/SQLiteQueryBuilder;->setTables(Ljava/lang/String;)V

    goto :goto_1

    :sswitch_2
    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/Data/DataProvider;->d:Lcom/fkzhang/wechatforwarder/Data/d;

    invoke-virtual {v1}, Lcom/fkzhang/wechatforwarder/Data/d;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    const-string v2, "PREFERENCES"

    invoke-virtual {v0, v2}, Landroid/database/sqlite/SQLiteQueryBuilder;->setTables(Ljava/lang/String;)V

    goto :goto_1

    :sswitch_3
    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/Data/DataProvider;->b:Lcom/fkzhang/wechatforwarder/Data/c;

    invoke-virtual {v1}, Lcom/fkzhang/wechatforwarder/Data/c;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    const-string v2, "CHATROOMS"

    invoke-virtual {v0, v2}, Landroid/database/sqlite/SQLiteQueryBuilder;->setTables(Ljava/lang/String;)V

    goto :goto_1

    :sswitch_4
    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/Data/DataProvider;->e:Lcom/fkzhang/wechatforwarder/Data/b;

    invoke-virtual {v1}, Lcom/fkzhang/wechatforwarder/Data/b;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    const-string v2, "AUTOFORWARDLIST"

    invoke-virtual {v0, v2}, Landroid/database/sqlite/SQLiteQueryBuilder;->setTables(Ljava/lang/String;)V

    goto :goto_1

    :sswitch_5
    new-instance v5, Landroid/database/MatrixCursor;

    new-array v0, v1, [Ljava/lang/String;

    const-string v3, "exist"

    aput-object v3, v0, v2

    invoke-direct {v5, v0}, Landroid/database/MatrixCursor;-><init>([Ljava/lang/String;)V

    new-instance v0, Ljava/io/File;

    invoke-direct {p0}, Lcom/fkzhang/wechatforwarder/Data/DataProvider;->a()Ljava/io/File;

    move-result-object v3

    invoke-virtual {p1}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v3, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v5}, Landroid/database/MatrixCursor;->newRow()Landroid/database/MatrixCursor$RowBuilder;

    move-result-object v3

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1

    move v0, v1

    :goto_2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/database/MatrixCursor$RowBuilder;->add(Ljava/lang/Object;)Landroid/database/MatrixCursor$RowBuilder;

    goto :goto_0

    :cond_1
    move v0, v2

    goto :goto_2

    nop

    :sswitch_data_0
    .sparse-switch
        0xa -> :sswitch_0
        0x14 -> :sswitch_2
        0x28 -> :sswitch_1
        0x46 -> :sswitch_5
        0x65 -> :sswitch_3
        0x66 -> :sswitch_4
    .end sparse-switch
.end method

.method public update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 2

    sget-object v0, Lcom/fkzhang/wechatforwarder/Data/DataProvider;->a:Landroid/content/UriMatcher;

    invoke-virtual {v0, p1}, Landroid/content/UriMatcher;->match(Landroid/net/Uri;)I

    move-result v1

    const/4 v0, 0x0

    sparse-switch v1, :sswitch_data_0

    :goto_0
    invoke-direct {p0, p1}, Lcom/fkzhang/wechatforwarder/Data/DataProvider;->a(Landroid/net/Uri;)V

    return v0

    :sswitch_0
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/Data/DataProvider;->b:Lcom/fkzhang/wechatforwarder/Data/c;

    invoke-virtual {v0}, Lcom/fkzhang/wechatforwarder/Data/c;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const-string v1, "CONTACTS"

    invoke-virtual {v0, v1, p2, p3, p4}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    goto :goto_0

    :sswitch_1
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/Data/DataProvider;->b:Lcom/fkzhang/wechatforwarder/Data/c;

    invoke-virtual {v0}, Lcom/fkzhang/wechatforwarder/Data/c;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const-string v1, "ACCOUNTS"

    invoke-virtual {v0, v1, p2, p3, p4}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    goto :goto_0

    :sswitch_2
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/Data/DataProvider;->d:Lcom/fkzhang/wechatforwarder/Data/d;

    invoke-virtual {v0}, Lcom/fkzhang/wechatforwarder/Data/d;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const-string v1, "PREFERENCES"

    invoke-virtual {v0, v1, p2, p3, p4}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    goto :goto_0

    :sswitch_3
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/Data/DataProvider;->b:Lcom/fkzhang/wechatforwarder/Data/c;

    invoke-virtual {v0}, Lcom/fkzhang/wechatforwarder/Data/c;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const-string v1, "CHATROOMS"

    invoke-virtual {v0, v1, p2, p3, p4}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    goto :goto_0

    :sswitch_4
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/Data/DataProvider;->e:Lcom/fkzhang/wechatforwarder/Data/b;

    invoke-virtual {v0}, Lcom/fkzhang/wechatforwarder/Data/b;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const-string v1, "AUTOFORWARDLIST"

    invoke-virtual {v0, v1, p2, p3, p4}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    goto :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0xa -> :sswitch_0
        0x14 -> :sswitch_2
        0x28 -> :sswitch_1
        0x65 -> :sswitch_3
        0x66 -> :sswitch_4
    .end sparse-switch
.end method
