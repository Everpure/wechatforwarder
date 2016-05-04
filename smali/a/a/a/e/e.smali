.class public La/a/a/e/e;
.super Ljava/lang/Object;


# instance fields
.field private a:J

.field private b:I

.field private c:[B


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    iget-wide v0, p0, La/a/a/e/e;->a:J

    return-wide v0
.end method

.method public a(I)V
    .locals 0

    iput p1, p0, La/a/a/e/e;->b:I

    return-void
.end method

.method public a(J)V
    .locals 1

    iput-wide p1, p0, La/a/a/e/e;->a:J

    return-void
.end method

.method public a([B)V
    .locals 0

    iput-object p1, p0, La/a/a/e/e;->c:[B

    return-void
.end method

.method public b()I
    .locals 1

    iget v0, p0, La/a/a/e/e;->b:I

    return v0
.end method

.method public c()[B
    .locals 1

    iget-object v0, p0, La/a/a/e/e;->c:[B

    return-object v0
.end method
