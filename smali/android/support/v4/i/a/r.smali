.class public Landroid/support/v4/i/a/r;
.super Ljava/lang/Object;


# instance fields
.field private final a:Ljava/lang/Object;


# direct methods
.method private constructor <init>(Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroid/support/v4/i/a/r;->a:Ljava/lang/Object;

    return-void
.end method

.method public static a(IIIIZZ)Landroid/support/v4/i/a/r;
    .locals 8

    new-instance v7, Landroid/support/v4/i/a/r;

    invoke-static {}, Landroid/support/v4/i/a/g;->r()Landroid/support/v4/i/a/k;

    move-result-object v0

    move v1, p0

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    invoke-interface/range {v0 .. v6}, Landroid/support/v4/i/a/k;->a(IIIIZZ)Ljava/lang/Object;

    move-result-object v0

    invoke-direct {v7, v0}, Landroid/support/v4/i/a/r;-><init>(Ljava/lang/Object;)V

    return-object v7
.end method

.method static synthetic a(Landroid/support/v4/i/a/r;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Landroid/support/v4/i/a/r;->a:Ljava/lang/Object;

    return-object v0
.end method
