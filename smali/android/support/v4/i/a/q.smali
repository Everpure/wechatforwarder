.class public Landroid/support/v4/i/a/q;
.super Ljava/lang/Object;


# instance fields
.field final a:Ljava/lang/Object;


# direct methods
.method private constructor <init>(Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroid/support/v4/i/a/q;->a:Ljava/lang/Object;

    return-void
.end method

.method public static a(IIZI)Landroid/support/v4/i/a/q;
    .locals 2

    new-instance v0, Landroid/support/v4/i/a/q;

    invoke-static {}, Landroid/support/v4/i/a/g;->r()Landroid/support/v4/i/a/k;

    move-result-object v1

    invoke-interface {v1, p0, p1, p2, p3}, Landroid/support/v4/i/a/k;->a(IIZI)Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/support/v4/i/a/q;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method
