.class public La/a/a/e/i;
.super Ljava/lang/Object;


# instance fields
.field private a:J

.field private b:I

.field private c:J

.field private d:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    iget-wide v0, p0, La/a/a/e/i;->c:J

    return-wide v0
.end method

.method public a(I)V
    .locals 0

    iput p1, p0, La/a/a/e/i;->b:I

    return-void
.end method

.method public a(J)V
    .locals 1

    iput-wide p1, p0, La/a/a/e/i;->a:J

    return-void
.end method

.method public b(I)V
    .locals 0

    iput p1, p0, La/a/a/e/i;->d:I

    return-void
.end method

.method public b(J)V
    .locals 1

    iput-wide p1, p0, La/a/a/e/i;->c:J

    return-void
.end method
