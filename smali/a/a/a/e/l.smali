.class public La/a/a/e/l;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field private a:La/a/a/e/b;

.field private b:La/a/a/e/d;

.field private c:La/a/a/e/i;

.field private d:La/a/a/e/j;

.field private e:Z

.field private f:J

.field private g:Ljava/lang/String;

.field private h:Z

.field private i:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    iput-wide v0, p0, La/a/a/e/l;->f:J

    return-void
.end method


# virtual methods
.method public a()La/a/a/e/b;
    .locals 1

    iget-object v0, p0, La/a/a/e/l;->a:La/a/a/e/b;

    return-object v0
.end method

.method public a(La/a/a/e/b;)V
    .locals 0

    iput-object p1, p0, La/a/a/e/l;->a:La/a/a/e/b;

    return-void
.end method

.method public a(La/a/a/e/d;)V
    .locals 0

    iput-object p1, p0, La/a/a/e/l;->b:La/a/a/e/d;

    return-void
.end method

.method public a(La/a/a/e/i;)V
    .locals 0

    iput-object p1, p0, La/a/a/e/l;->c:La/a/a/e/i;

    return-void
.end method

.method public a(La/a/a/e/j;)V
    .locals 0

    iput-object p1, p0, La/a/a/e/l;->d:La/a/a/e/j;

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, La/a/a/e/l;->g:Ljava/lang/String;

    return-void
.end method

.method public a(Z)V
    .locals 0

    iput-boolean p1, p0, La/a/a/e/l;->e:Z

    return-void
.end method

.method public b()La/a/a/e/d;
    .locals 1

    iget-object v0, p0, La/a/a/e/l;->b:La/a/a/e/d;

    return-object v0
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, La/a/a/e/l;->i:Ljava/lang/String;

    return-void
.end method

.method public b(Z)V
    .locals 0

    iput-boolean p1, p0, La/a/a/e/l;->h:Z

    return-void
.end method

.method public c()Z
    .locals 1

    iget-boolean v0, p0, La/a/a/e/l;->e:Z

    return v0
.end method

.method public clone()Ljava/lang/Object;
    .locals 1

    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, La/a/a/e/l;->g:Ljava/lang/String;

    return-object v0
.end method

.method public e()La/a/a/e/i;
    .locals 1

    iget-object v0, p0, La/a/a/e/l;->c:La/a/a/e/i;

    return-object v0
.end method

.method public f()La/a/a/e/j;
    .locals 1

    iget-object v0, p0, La/a/a/e/l;->d:La/a/a/e/j;

    return-object v0
.end method

.method public g()Z
    .locals 1

    iget-boolean v0, p0, La/a/a/e/l;->h:Z

    return v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, La/a/a/e/l;->i:Ljava/lang/String;

    return-object v0
.end method
