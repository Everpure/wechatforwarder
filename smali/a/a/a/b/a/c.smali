.class public La/a/a/b/a/c;
.super Ljava/lang/Object;


# instance fields
.field protected a:[B

.field protected b:I

.field protected c:Ljava/lang/String;

.field protected d:Ljava/lang/String;

.field protected e:[B


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, La/a/a/b/a/c;->c:Ljava/lang/String;

    const-string v0, "UTF-8"

    iput-object v0, p0, La/a/a/b/a/c;->d:Ljava/lang/String;

    iput-object v1, p0, La/a/a/b/a/c;->a:[B

    const/16 v0, 0x3e8

    iput v0, p0, La/a/a/b/a/c;->b:I

    iput-object v1, p0, La/a/a/b/a/c;->e:[B

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;[BI)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/a/a/b/a/c;->c:Ljava/lang/String;

    iput-object p2, p0, La/a/a/b/a/c;->d:Ljava/lang/String;

    iput-object p3, p0, La/a/a/b/a/c;->a:[B

    iput p4, p0, La/a/a/b/a/c;->b:I

    const/4 v0, 0x0

    iput-object v0, p0, La/a/a/b/a/c;->e:[B

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, La/a/a/b/a/c;->b:I

    return v0
.end method

.method public b()[B
    .locals 1

    iget-object v0, p0, La/a/a/b/a/c;->a:[B

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, La/a/a/b/a/c;->c:Ljava/lang/String;

    return-object v0
.end method
