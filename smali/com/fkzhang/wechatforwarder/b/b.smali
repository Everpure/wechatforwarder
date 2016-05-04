.class public Lcom/fkzhang/wechatforwarder/b/b;
.super Ljava/lang/Object;


# instance fields
.field private a:Landroid/content/Context;

.field private b:Ljava/lang/ClassLoader;

.field private final c:Z

.field private final d:Ljava/lang/String;

.field private e:Ljava/io/File;

.field private f:Landroid/content/Context;

.field private g:Ljava/lang/Class;

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/content/Context;Ljava/lang/ClassLoader;Ljava/lang/String;Z)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/fkzhang/wechatforwarder/b/b;->a:Landroid/content/Context;

    iput-object p3, p0, Lcom/fkzhang/wechatforwarder/b/b;->b:Ljava/lang/ClassLoader;

    iput-boolean p5, p0, Lcom/fkzhang/wechatforwarder/b/b;->c:Z

    iput-object p4, p0, Lcom/fkzhang/wechatforwarder/b/b;->d:Ljava/lang/String;

    sget-object v0, Lcom/fkzhang/wechatforwarder/ak;->a:Ljava/lang/String;

    iget-boolean v1, p0, Lcom/fkzhang/wechatforwarder/b/b;->c:Z

    if-eqz v1, :cond_0

    iput-object v0, p0, Lcom/fkzhang/wechatforwarder/b/b;->i:Ljava/lang/String;

    :goto_0
    const/4 v0, 0x2

    :try_start_0
    invoke-virtual {p1, p4, v0}, Landroid/content/Context;->createPackageContext(Ljava/lang/String;I)Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/fkzhang/wechatforwarder/b/b;->f:Landroid/content/Context;

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/b/b;->f:Landroid/content/Context;

    invoke-static {v0}, Lcom/fkzhang/wechatforwarder/e/a;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/fkzhang/wechatforwarder/b/b;->h:Ljava/lang/String;

    new-instance v0, Ljava/io/File;

    invoke-direct {p0}, Lcom/fkzhang/wechatforwarder/b/b;->c()Ljava/io/File;

    move-result-object v1

    iget-object v2, p0, Lcom/fkzhang/wechatforwarder/b/b;->i:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/fkzhang/wechatforwarder/b/b;->e:Ljava/io/File;

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/b/b;->i:Ljava/lang/String;

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/b/b;->e:Ljava/io/File;

    invoke-direct {p0, v0, v1}, Lcom/fkzhang/wechatforwarder/b/b;->a(Ljava/lang/String;Ljava/io/File;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    return-void

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".apk"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/fkzhang/wechatforwarder/b/b;->i:Ljava/lang/String;

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-static {v0}, Lde/robv/android/xposed/XposedBridge;->log(Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;
    .locals 3

    const/4 v0, 0x0

    invoke-direct {p0}, Lcom/fkzhang/wechatforwarder/b/b;->c()Ljava/io/File;

    move-result-object v1

    new-instance v2, Ldalvik/system/DexClassLoader;

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, p2, v1, v0, p3}, Ldalvik/system/DexClassLoader;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/ClassLoader;)V

    :try_start_0
    invoke-virtual {v2, p1}, Ldalvik/system/DexClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    invoke-direct {p0}, Lcom/fkzhang/wechatforwarder/b/b;->b()V

    return-object v0

    :catch_0
    move-exception v1

    invoke-static {v1}, Lde/robv/android/xposed/XposedBridge;->log(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method private a(Ljava/lang/String;Ljava/io/File;)Ljava/lang/String;
    .locals 3

    :try_start_0
    new-instance v0, Ljava/io/BufferedInputStream;

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/b/b;->f:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    invoke-virtual {v0}, Ljava/io/BufferedInputStream;->available()I

    move-result v1

    new-array v1, v1, [B

    invoke-virtual {v0, v1}, Ljava/io/BufferedInputStream;->read([B)I

    invoke-virtual {v0}, Ljava/io/BufferedInputStream;->close()V

    invoke-virtual {p2}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p2}, Ljava/io/File;->createNewFile()Z

    :cond_0
    new-instance v0, Ljava/io/BufferedOutputStream;

    new-instance v2, Ljava/io/FileOutputStream;

    invoke-direct {v2, p2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v0, v2}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    invoke-virtual {v0, v1}, Ljava/io/BufferedOutputStream;->write([B)V

    invoke-virtual {v0}, Ljava/io/BufferedOutputStream;->flush()V

    invoke-virtual {v0}, Ljava/io/BufferedOutputStream;->close()V

    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    invoke-static {v0}, Lde/robv/android/xposed/XposedBridge;->log(Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    goto :goto_0
.end method

.method private b(Ljava/lang/String;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/b/b;->g:Ljava/lang/Class;

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/fkzhang/wechatforwarder/b/b;->a:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const/4 v2, 0x2

    iget-object v3, p0, Lcom/fkzhang/wechatforwarder/b/b;->d:Ljava/lang/String;

    aput-object v3, v1, v2

    const/4 v2, 0x3

    const-string v3, "WechatForwarder (2.1.0) "

    aput-object v3, v1, v2

    const/4 v2, 0x4

    iget-object v3, p0, Lcom/fkzhang/wechatforwarder/b/b;->h:Ljava/lang/String;

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Lde/robv/android/xposed/XposedHelpers;->newInstance(Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method private b()V
    .locals 3

    iget-boolean v0, p0, Lcom/fkzhang/wechatforwarder/b/b;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/b/b;->i:Ljava/lang/String;

    const-string v1, ".apk"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/b/b;->i:Ljava/lang/String;

    :goto_0
    new-instance v1, Ljava/io/File;

    invoke-direct {p0}, Lcom/fkzhang/wechatforwarder/b/b;->c()Ljava/io/File;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    :cond_0
    return-void

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/b/b;->i:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".apk"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method private c()Ljava/io/File;
    .locals 3

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/b/b;->a:Landroid/content/Context;

    const-string v1, "dex"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method private c(Ljava/lang/String;)V
    .locals 2

    :try_start_0
    new-instance v0, La/a/a/a/b;

    invoke-direct {v0, p1}, La/a/a/a/b;-><init>(Ljava/lang/String;)V

    sget-object v1, Lcom/fkzhang/wechatforwarder/ak;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, La/a/a/a/b;->b(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/fkzhang/wechatforwarder/b/b;->c()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, La/a/a/a/b;->a(Ljava/lang/String;)V
    :try_end_0
    .catch La/a/a/c/a; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    invoke-static {v0}, Lde/robv/android/xposed/XposedBridge;->log(Ljava/lang/Throwable;)V

    goto :goto_0
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lcom/fkzhang/wechatforwarder/b/a;
    .locals 2

    new-instance v0, Lcom/fkzhang/wechatforwarder/b/c;

    invoke-direct {p0, p1}, Lcom/fkzhang/wechatforwarder/b/b;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/fkzhang/wechatforwarder/b/c;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public a()V
    .locals 5

    :try_start_0
    iget-boolean v0, p0, Lcom/fkzhang/wechatforwarder/b/b;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/b/b;->e:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/fkzhang/wechatforwarder/b/b;->c(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/b/b;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "hooks.Wrapper.HookWrapper"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/io/File;

    invoke-direct {p0}, Lcom/fkzhang/wechatforwarder/b/b;->c()Ljava/io/File;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lcom/fkzhang/wechatforwarder/b/b;->i:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ".apk"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/fkzhang/wechatforwarder/b/b;->b:Ljava/lang/ClassLoader;

    invoke-direct {p0, v0, v1, v2}, Lcom/fkzhang/wechatforwarder/b/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v0

    iput-object v0, p0, Lcom/fkzhang/wechatforwarder/b/b;->g:Ljava/lang/Class;

    :goto_0
    return-void

    :cond_0
    new-instance v0, Ljava/io/File;

    invoke-direct {p0}, Lcom/fkzhang/wechatforwarder/b/b;->c()Ljava/io/File;

    move-result-object v1

    iget-object v2, p0, Lcom/fkzhang/wechatforwarder/b/b;->i:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/fkzhang/wechatforwarder/b/b;->e:Ljava/io/File;

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/b/b;->i:Ljava/lang/String;

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/b/b;->e:Ljava/io/File;

    invoke-direct {p0, v0, v1}, Lcom/fkzhang/wechatforwarder/b/b;->a(Ljava/lang/String;Ljava/io/File;)Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/b/b;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "hooks.Wrapper.HookWrapper"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/b/b;->e:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/fkzhang/wechatforwarder/b/b;->b:Ljava/lang/ClassLoader;

    invoke-direct {p0, v0, v1, v2}, Lcom/fkzhang/wechatforwarder/b/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v0

    iput-object v0, p0, Lcom/fkzhang/wechatforwarder/b/b;->g:Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-static {v0}, Lde/robv/android/xposed/XposedBridge;->log(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public a(Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lcom/fkzhang/wechatforwarder/b/b;->a:Landroid/content/Context;

    return-void
.end method

.method public a(Ljava/lang/ClassLoader;)V
    .locals 0

    iput-object p1, p0, Lcom/fkzhang/wechatforwarder/b/b;->b:Ljava/lang/ClassLoader;

    return-void
.end method
