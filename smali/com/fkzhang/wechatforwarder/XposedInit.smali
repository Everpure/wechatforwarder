.class public Lcom/fkzhang/wechatforwarder/XposedInit;
.super Ljava/lang/Object;

# interfaces
.implements Lde/robv/android/xposed/IXposedHookLoadPackage;


# instance fields
.field private a:Landroid/util/SparseArray;

.field private b:Lcom/fkzhang/wechatforwarder/b/b;

.field private c:Landroid/content/Context;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a(Lcom/fkzhang/wechatforwarder/b/b;Ljava/lang/String;Ljava/lang/String;I)Lcom/fkzhang/wechatforwarder/b/a;
    .locals 2

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/XposedInit;->a:Landroid/util/SparseArray;

    if-nez v0, :cond_0

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lcom/fkzhang/wechatforwarder/XposedInit;->a:Landroid/util/SparseArray;

    :cond_0
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/XposedInit;->a:Landroid/util/SparseArray;

    invoke-virtual {v0, p4}, Landroid/util/SparseArray;->indexOfKey(I)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/XposedInit;->a:Landroid/util/SparseArray;

    invoke-virtual {v0, p4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fkzhang/wechatforwarder/b/a;

    :goto_0
    return-object v0

    :cond_1
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "com.tencent.mm4"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/XposedInit;->a:Landroid/util/SparseArray;

    const-string v1, "6.3.5"

    invoke-virtual {p1, v1}, Lcom/fkzhang/wechatforwarder/b/b;->a(Ljava/lang/String;)Lcom/fkzhang/wechatforwarder/b/a;

    move-result-object v1

    invoke-virtual {v0, p4, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    :cond_2
    const-string v0, "9.0"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "6.3.9"

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/XposedInit;->a:Landroid/util/SparseArray;

    invoke-virtual {p1, v0}, Lcom/fkzhang/wechatforwarder/b/b;->a(Ljava/lang/String;)Lcom/fkzhang/wechatforwarder/b/a;

    move-result-object v0

    invoke-virtual {v1, p4, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    :goto_1
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/XposedInit;->a:Landroid/util/SparseArray;

    invoke-virtual {v0, p4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fkzhang/wechatforwarder/b/a;

    goto :goto_0

    :cond_3
    invoke-static {p3}, Lcom/fkzhang/wechatforwarder/b/d;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/XposedInit;->a:Landroid/util/SparseArray;

    invoke-virtual {p1, p3}, Lcom/fkzhang/wechatforwarder/b/b;->a(Ljava/lang/String;)Lcom/fkzhang/wechatforwarder/b/a;

    move-result-object v1

    invoke-virtual {v0, p4, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto :goto_1

    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "WechatForwarder (2.1.0)  (2.1.0): wechat version "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " not supported!"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lde/robv/android/xposed/XposedBridge;->log(Ljava/lang/String;)V

    const/4 v0, 0x0

    goto :goto_0
.end method

.method private a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/ClassLoader;I)V
    .locals 7

    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p2, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    iget-object v6, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/XposedInit;->b:Lcom/fkzhang/wechatforwarder/b/b;

    if-nez v0, :cond_0

    new-instance v0, Lcom/fkzhang/wechatforwarder/b/b;

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/XposedInit;->c:Landroid/content/Context;

    const-string v4, "com.fkzhang.wechatforwarder"

    const/4 v5, 0x1

    move-object v2, p1

    invoke-direct/range {v0 .. v5}, Lcom/fkzhang/wechatforwarder/b/b;-><init>(Landroid/content/Context;Landroid/content/Context;Ljava/lang/ClassLoader;Ljava/lang/String;Z)V

    iput-object v0, p0, Lcom/fkzhang/wechatforwarder/XposedInit;->b:Lcom/fkzhang/wechatforwarder/b/b;

    :cond_0
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/XposedInit;->b:Lcom/fkzhang/wechatforwarder/b/b;

    invoke-virtual {v0, v3}, Lcom/fkzhang/wechatforwarder/b/b;->a(Ljava/lang/ClassLoader;)V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/XposedInit;->b:Lcom/fkzhang/wechatforwarder/b/b;

    invoke-virtual {v0, p1}, Lcom/fkzhang/wechatforwarder/b/b;->a(Landroid/content/Context;)V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/XposedInit;->b:Lcom/fkzhang/wechatforwarder/b/b;

    invoke-virtual {v0}, Lcom/fkzhang/wechatforwarder/b/b;->a()V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/XposedInit;->b:Lcom/fkzhang/wechatforwarder/b/b;

    invoke-direct {p0, v0, p2, v6, p4}, Lcom/fkzhang/wechatforwarder/XposedInit;->a(Lcom/fkzhang/wechatforwarder/b/b;Ljava/lang/String;Ljava/lang/String;I)Lcom/fkzhang/wechatforwarder/b/a;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0, p3}, Lcom/fkzhang/wechatforwarder/b/a;->a(Ljava/lang/ClassLoader;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    :goto_0
    return-void

    :catch_0
    move-exception v0

    invoke-static {v0}, Lde/robv/android/xposed/XposedBridge;->log(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method static synthetic a(Lcom/fkzhang/wechatforwarder/XposedInit;Landroid/content/Context;Ljava/lang/String;Ljava/lang/ClassLoader;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/fkzhang/wechatforwarder/XposedInit;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/ClassLoader;I)V

    return-void
.end method


# virtual methods
.method public handleLoadPackage(Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V
    .locals 7

    iget-object v1, p1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->packageName:Ljava/lang/String;

    const-string v0, "com.tencen"

    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "mm"

    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    :try_start_0
    const-string v0, "android.app.ActivityThread"

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lde/robv/android/xposed/XposedHelpers;->findClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v0

    const-string v2, "currentActivityThread"

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v0, v2, v3}, Lde/robv/android/xposed/XposedHelpers;->callStaticMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v2, "getSystemContext"

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v0, v2, v3}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iput-object v0, p0, Lcom/fkzhang/wechatforwarder/XposedInit;->c:Landroid/content/Context;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ".app.MMApplication"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->classLoader:Ljava/lang/ClassLoader;

    const-string v3, "onCreate"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    new-instance v6, Lcom/fkzhang/wechatforwarder/bl;

    invoke-direct {v6, p0, v1, p1}, Lcom/fkzhang/wechatforwarder/bl;-><init>(Lcom/fkzhang/wechatforwarder/XposedInit;Ljava/lang/String;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V

    aput-object v6, v4, v5

    invoke-static {v0, v2, v3, v4}, Lde/robv/android/xposed/XposedHelpers;->findAndHookMethod(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-static {v0}, Lde/robv/android/xposed/XposedBridge;->log(Ljava/lang/Throwable;)V

    goto :goto_0
.end method
