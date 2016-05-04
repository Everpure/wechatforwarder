.class Lcom/fkzhang/wechatforwarder/bl;
.super Lde/robv/android/xposed/XC_MethodHook;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

.field final synthetic c:Lcom/fkzhang/wechatforwarder/XposedInit;


# direct methods
.method constructor <init>(Lcom/fkzhang/wechatforwarder/XposedInit;Ljava/lang/String;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V
    .locals 0

    iput-object p1, p0, Lcom/fkzhang/wechatforwarder/bl;->c:Lcom/fkzhang/wechatforwarder/XposedInit;

    iput-object p2, p0, Lcom/fkzhang/wechatforwarder/bl;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/fkzhang/wechatforwarder/bl;->b:Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method


# virtual methods
.method protected beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 5

    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    check-cast v0, Landroid/app/Application;

    invoke-virtual {v0}, Landroid/app/Application;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/bl;->c:Lcom/fkzhang/wechatforwarder/XposedInit;

    iget-object v2, p0, Lcom/fkzhang/wechatforwarder/bl;->a:Ljava/lang/String;

    iget-object v3, p0, Lcom/fkzhang/wechatforwarder/bl;->b:Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    iget-object v3, v3, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->classLoader:Ljava/lang/ClassLoader;

    iget-object v4, p0, Lcom/fkzhang/wechatforwarder/bl;->b:Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    iget-object v4, v4, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->appInfo:Landroid/content/pm/ApplicationInfo;

    iget v4, v4, Landroid/content/pm/ApplicationInfo;->uid:I

    invoke-static {v1, v0, v2, v3, v4}, Lcom/fkzhang/wechatforwarder/XposedInit;->a(Lcom/fkzhang/wechatforwarder/XposedInit;Landroid/content/Context;Ljava/lang/String;Ljava/lang/ClassLoader;I)V

    return-void
.end method
