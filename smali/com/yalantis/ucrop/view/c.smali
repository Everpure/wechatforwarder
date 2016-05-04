.class Lcom/yalantis/ucrop/view/c;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final a:Ljava/lang/ref/WeakReference;

.field private final b:J

.field private final c:J

.field private final d:F

.field private final e:F

.field private final f:F

.field private final g:F

.field private final h:F

.field private final i:F

.field private final j:Z


# direct methods
.method public constructor <init>(Lcom/yalantis/ucrop/view/a;JFFFFFFZ)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/yalantis/ucrop/view/c;->a:Ljava/lang/ref/WeakReference;

    iput-wide p2, p0, Lcom/yalantis/ucrop/view/c;->b:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/yalantis/ucrop/view/c;->c:J

    iput p4, p0, Lcom/yalantis/ucrop/view/c;->d:F

    iput p5, p0, Lcom/yalantis/ucrop/view/c;->e:F

    iput p6, p0, Lcom/yalantis/ucrop/view/c;->f:F

    iput p7, p0, Lcom/yalantis/ucrop/view/c;->g:F

    iput p8, p0, Lcom/yalantis/ucrop/view/c;->h:F

    iput p9, p0, Lcom/yalantis/ucrop/view/c;->i:F

    iput-boolean p10, p0, Lcom/yalantis/ucrop/view/c;->j:Z

    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    const/4 v8, 0x0

    iget-object v0, p0, Lcom/yalantis/ucrop/view/c;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/yalantis/ucrop/view/a;

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/yalantis/ucrop/view/c;->b:J

    iget-wide v6, p0, Lcom/yalantis/ucrop/view/c;->c:J

    sub-long/2addr v2, v6

    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    long-to-float v1, v2

    iget v2, p0, Lcom/yalantis/ucrop/view/c;->f:F

    iget-wide v4, p0, Lcom/yalantis/ucrop/view/c;->b:J

    long-to-float v3, v4

    invoke-static {v1, v8, v2, v3}, Lcom/yalantis/ucrop/a/e;->a(FFFF)F

    move-result v2

    iget v3, p0, Lcom/yalantis/ucrop/view/c;->g:F

    iget-wide v4, p0, Lcom/yalantis/ucrop/view/c;->b:J

    long-to-float v4, v4

    invoke-static {v1, v8, v3, v4}, Lcom/yalantis/ucrop/a/e;->a(FFFF)F

    move-result v3

    iget v4, p0, Lcom/yalantis/ucrop/view/c;->i:F

    iget-wide v6, p0, Lcom/yalantis/ucrop/view/c;->b:J

    long-to-float v5, v6

    invoke-static {v1, v8, v4, v5}, Lcom/yalantis/ucrop/a/e;->b(FFFF)F

    move-result v4

    iget-wide v6, p0, Lcom/yalantis/ucrop/view/c;->b:J

    long-to-float v5, v6

    cmpg-float v1, v1, v5

    if-gez v1, :cond_0

    iget-object v1, v0, Lcom/yalantis/ucrop/view/a;->b:[F

    const/4 v5, 0x0

    aget v1, v1, v5

    iget v5, p0, Lcom/yalantis/ucrop/view/c;->d:F

    sub-float/2addr v1, v5

    sub-float v1, v2, v1

    iget-object v2, v0, Lcom/yalantis/ucrop/view/a;->b:[F

    const/4 v5, 0x1

    aget v2, v2, v5

    iget v5, p0, Lcom/yalantis/ucrop/view/c;->e:F

    sub-float/2addr v2, v5

    sub-float v2, v3, v2

    invoke-virtual {v0, v1, v2}, Lcom/yalantis/ucrop/view/a;->a(FF)V

    iget-boolean v1, p0, Lcom/yalantis/ucrop/view/c;->j:Z

    if-nez v1, :cond_2

    iget v1, p0, Lcom/yalantis/ucrop/view/c;->h:F

    add-float/2addr v1, v4

    invoke-static {v0}, Lcom/yalantis/ucrop/view/a;->a(Lcom/yalantis/ucrop/view/a;)Landroid/graphics/RectF;

    move-result-object v2

    invoke-virtual {v2}, Landroid/graphics/RectF;->centerX()F

    move-result v2

    invoke-static {v0}, Lcom/yalantis/ucrop/view/a;->a(Lcom/yalantis/ucrop/view/a;)Landroid/graphics/RectF;

    move-result-object v3

    invoke-virtual {v3}, Landroid/graphics/RectF;->centerY()F

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/yalantis/ucrop/view/a;->b(FFF)V

    :cond_2
    invoke-virtual {v0}, Lcom/yalantis/ucrop/view/a;->e()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0, p0}, Lcom/yalantis/ucrop/view/a;->post(Ljava/lang/Runnable;)Z

    goto :goto_0
.end method
