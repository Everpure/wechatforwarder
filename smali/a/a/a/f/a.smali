.class public La/a/a/f/a;
.super Ljava/lang/Object;


# instance fields
.field private a:I

.field private b:J

.field private c:J

.field private d:I

.field private e:I

.field private f:Ljava/lang/String;

.field private g:I

.field private h:Ljava/lang/Throwable;

.field private i:Z

.field private j:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0}, La/a/a/f/a;->c()V

    const/4 v0, 0x0

    iput v0, p0, La/a/a/f/a;->d:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, La/a/a/f/a;->a:I

    return v0
.end method

.method public a(I)V
    .locals 0

    iput p1, p0, La/a/a/f/a;->a:I

    return-void
.end method

.method public a(J)V
    .locals 1

    iput-wide p1, p0, La/a/a/f/a;->b:J

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, La/a/a/f/a;->f:Ljava/lang/String;

    return-void
.end method

.method public a(Ljava/lang/Throwable;)V
    .locals 1

    invoke-virtual {p0}, La/a/a/f/a;->c()V

    const/4 v0, 0x2

    iput v0, p0, La/a/a/f/a;->g:I

    iput-object p1, p0, La/a/a/f/a;->h:Ljava/lang/Throwable;

    return-void
.end method

.method public b()V
    .locals 1

    invoke-virtual {p0}, La/a/a/f/a;->c()V

    const/4 v0, 0x0

    iput v0, p0, La/a/a/f/a;->g:I

    return-void
.end method

.method public b(I)V
    .locals 0

    iput p1, p0, La/a/a/f/a;->g:I

    return-void
.end method

.method public b(J)V
    .locals 5

    const/16 v4, 0x64

    iget-wide v0, p0, La/a/a/f/a;->c:J

    add-long/2addr v0, p1

    iput-wide v0, p0, La/a/a/f/a;->c:J

    iget-wide v0, p0, La/a/a/f/a;->b:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    iget-wide v0, p0, La/a/a/f/a;->c:J

    const-wide/16 v2, 0x64

    mul-long/2addr v0, v2

    iget-wide v2, p0, La/a/a/f/a;->b:J

    div-long/2addr v0, v2

    long-to-int v0, v0

    iput v0, p0, La/a/a/f/a;->d:I

    iget v0, p0, La/a/a/f/a;->d:I

    if-le v0, v4, :cond_0

    iput v4, p0, La/a/a/f/a;->d:I

    :cond_0
    :goto_0
    iget-boolean v0, p0, La/a/a/f/a;->j:Z

    if-nez v0, :cond_1

    return-void

    :cond_1
    const-wide/16 v0, 0x96

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public c()V
    .locals 4

    const-wide/16 v2, 0x0

    const/4 v1, 0x0

    const/4 v0, -0x1

    iput v0, p0, La/a/a/f/a;->e:I

    iput v1, p0, La/a/a/f/a;->a:I

    const/4 v0, 0x0

    iput-object v0, p0, La/a/a/f/a;->f:Ljava/lang/String;

    iput-wide v2, p0, La/a/a/f/a;->b:J

    iput-wide v2, p0, La/a/a/f/a;->c:J

    iput v1, p0, La/a/a/f/a;->d:I

    return-void
.end method

.method public c(I)V
    .locals 0

    iput p1, p0, La/a/a/f/a;->e:I

    return-void
.end method

.method public d()Z
    .locals 1

    iget-boolean v0, p0, La/a/a/f/a;->i:Z

    return v0
.end method
