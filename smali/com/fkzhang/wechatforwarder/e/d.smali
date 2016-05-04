.class public Lcom/fkzhang/wechatforwarder/e/d;
.super Ljava/lang/Object;


# instance fields
.field private a:Landroid/content/SharedPreferences;

.field private b:Lde/robv/android/xposed/XSharedPreferences;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/fkzhang/wechatforwarder/e/d;->a:Landroid/content/SharedPreferences;

    iput-object v0, p0, Lcom/fkzhang/wechatforwarder/e/d;->b:Lde/robv/android/xposed/XSharedPreferences;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_preferences"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lcom/fkzhang/wechatforwarder/e/d;->a:Landroid/content/SharedPreferences;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;I)I
    .locals 1

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/e/d;->a:Landroid/content/SharedPreferences;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/e/d;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result p2

    :cond_0
    :goto_0
    return p2

    :cond_1
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/e/d;->b:Lde/robv/android/xposed/XSharedPreferences;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/e/d;->b:Lde/robv/android/xposed/XSharedPreferences;

    invoke-virtual {v0, p1, p2}, Lde/robv/android/xposed/XSharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result p2

    goto :goto_0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/e/d;->a:Landroid/content/SharedPreferences;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/e/d;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    :cond_0
    :goto_0
    return-object p2

    :cond_1
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/e/d;->b:Lde/robv/android/xposed/XSharedPreferences;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/e/d;->b:Lde/robv/android/xposed/XSharedPreferences;

    invoke-virtual {v0, p1, p2}, Lde/robv/android/xposed/XSharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    goto :goto_0
.end method

.method public a(Ljava/lang/String;Z)Z
    .locals 1

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/e/d;->a:Landroid/content/SharedPreferences;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/e/d;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p2

    :cond_0
    :goto_0
    return p2

    :cond_1
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/e/d;->b:Lde/robv/android/xposed/XSharedPreferences;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/e/d;->b:Lde/robv/android/xposed/XSharedPreferences;

    invoke-virtual {v0, p1, p2}, Lde/robv/android/xposed/XSharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p2

    goto :goto_0
.end method

.method public b(Ljava/lang/String;I)V
    .locals 2

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/e/d;->a:Landroid/content/SharedPreferences;

    if-eqz v1, :cond_2

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/e/d;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    :cond_0
    :goto_0
    if-eqz v0, :cond_1

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    :cond_1
    return-void

    :cond_2
    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/e/d;->b:Lde/robv/android/xposed/XSharedPreferences;

    if-eqz v1, :cond_0

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/e/d;->b:Lde/robv/android/xposed/XSharedPreferences;

    invoke-virtual {v0}, Lde/robv/android/xposed/XSharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    goto :goto_0
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/e/d;->a:Landroid/content/SharedPreferences;

    if-eqz v1, :cond_2

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/e/d;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    :cond_0
    :goto_0
    if-eqz v0, :cond_1

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    :cond_1
    return-void

    :cond_2
    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/e/d;->b:Lde/robv/android/xposed/XSharedPreferences;

    if-eqz v1, :cond_0

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/e/d;->b:Lde/robv/android/xposed/XSharedPreferences;

    invoke-virtual {v0}, Lde/robv/android/xposed/XSharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    goto :goto_0
.end method

.method public b(Ljava/lang/String;Z)V
    .locals 2

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/e/d;->a:Landroid/content/SharedPreferences;

    if-eqz v1, :cond_2

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/e/d;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    :cond_0
    :goto_0
    if-eqz v0, :cond_1

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    :cond_1
    return-void

    :cond_2
    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/e/d;->b:Lde/robv/android/xposed/XSharedPreferences;

    if-eqz v1, :cond_0

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/e/d;->b:Lde/robv/android/xposed/XSharedPreferences;

    invoke-virtual {v0}, Lde/robv/android/xposed/XSharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    goto :goto_0
.end method
