.class public La/a/a/e/a;
.super Ljava/lang/Object;


# instance fields
.field private a:J

.field private b:I

.field private c:I

.field private d:Ljava/lang/String;

.field private e:I

.field private f:I


# direct methods
.method public constructor <init>()V
    .locals 3

    const/4 v2, -0x1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    iput-wide v0, p0, La/a/a/e/a;->a:J

    iput v2, p0, La/a/a/e/a;->b:I

    iput v2, p0, La/a/a/e/a;->c:I

    const/4 v0, 0x0

    iput-object v0, p0, La/a/a/e/a;->d:Ljava/lang/String;

    iput v2, p0, La/a/a/e/a;->e:I

    iput v2, p0, La/a/a/e/a;->f:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, La/a/a/e/a;->e:I

    return v0
.end method

.method public a(I)V
    .locals 0

    iput p1, p0, La/a/a/e/a;->b:I

    return-void
.end method

.method public a(J)V
    .locals 1

    iput-wide p1, p0, La/a/a/e/a;->a:J

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, La/a/a/e/a;->d:Ljava/lang/String;

    return-void
.end method

.method public b()I
    .locals 1

    iget v0, p0, La/a/a/e/a;->f:I

    return v0
.end method

.method public b(I)V
    .locals 0

    iput p1, p0, La/a/a/e/a;->c:I

    return-void
.end method

.method public c(I)V
    .locals 0

    iput p1, p0, La/a/a/e/a;->e:I

    return-void
.end method

.method public d(I)V
    .locals 0

    iput p1, p0, La/a/a/e/a;->f:I

    return-void
.end method
