.class Landroid/support/v7/a/ag;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/support/v4/i/bm;


# instance fields
.field final synthetic a:Landroid/support/v7/a/ae;


# direct methods
.method constructor <init>(Landroid/support/v7/a/ae;)V
    .locals 0

    iput-object p1, p0, Landroid/support/v7/a/ag;->a:Landroid/support/v7/a/ae;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;Landroid/support/v4/i/ec;)Landroid/support/v4/i/ec;
    .locals 4

    invoke-virtual {p2}, Landroid/support/v4/i/ec;->b()I

    move-result v0

    iget-object v1, p0, Landroid/support/v7/a/ag;->a:Landroid/support/v7/a/ae;

    invoke-static {v1, v0}, Landroid/support/v7/a/ae;->c(Landroid/support/v7/a/ae;I)I

    move-result v1

    if-eq v0, v1, :cond_0

    invoke-virtual {p2}, Landroid/support/v4/i/ec;->a()I

    move-result v0

    invoke-virtual {p2}, Landroid/support/v4/i/ec;->c()I

    move-result v2

    invoke-virtual {p2}, Landroid/support/v4/i/ec;->d()I

    move-result v3

    invoke-virtual {p2, v0, v1, v2, v3}, Landroid/support/v4/i/ec;->a(IIII)Landroid/support/v4/i/ec;

    move-result-object p2

    :cond_0
    invoke-static {p1, p2}, Landroid/support/v4/i/bu;->a(Landroid/view/View;Landroid/support/v4/i/ec;)Landroid/support/v4/i/ec;

    move-result-object v0

    return-object v0
.end method
