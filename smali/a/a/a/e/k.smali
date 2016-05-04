.class public La/a/a/e/k;
.super Ljava/lang/Object;


# instance fields
.field private a:J

.field private b:J

.field private c:J

.field private d:I


# direct methods
.method public constructor <init>()V
    .locals 2

    const-wide/16 v0, -0x1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide v0, p0, La/a/a/e/k;->a:J

    iput-wide v0, p0, La/a/a/e/k;->b:J

    iput-wide v0, p0, La/a/a/e/k;->c:J

    const/4 v0, -0x1

    iput v0, p0, La/a/a/e/k;->d:I

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    iget-wide v0, p0, La/a/a/e/k;->a:J

    return-wide v0
.end method

.method public a(I)V
    .locals 0

    iput p1, p0, La/a/a/e/k;->d:I

    return-void
.end method

.method public a(J)V
    .locals 1

    iput-wide p1, p0, La/a/a/e/k;->a:J

    return-void
.end method

.method public b()J
    .locals 2

    iget-wide v0, p0, La/a/a/e/k;->b:J

    return-wide v0
.end method

.method public b(J)V
    .locals 1

    iput-wide p1, p0, La/a/a/e/k;->b:J

    return-void
.end method

.method public c()J
    .locals 2

    iget-wide v0, p0, La/a/a/e/k;->c:J

    return-wide v0
.end method

.method public c(J)V
    .locals 1

    iput-wide p1, p0, La/a/a/e/k;->c:J

    return-void
.end method

.method public d()I
    .locals 1

    iget v0, p0, La/a/a/e/k;->d:I

    return v0
.end method
