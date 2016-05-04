.class Landroid/support/v7/widget/he;
.super Ljava/lang/Object;


# static fields
.field static d:Landroid/support/v4/h/o;


# instance fields
.field a:I

.field b:Landroid/support/v7/widget/en;

.field c:Landroid/support/v7/widget/en;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroid/support/v4/h/p;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Landroid/support/v4/h/p;-><init>(I)V

    sput-object v0, Landroid/support/v7/widget/he;->d:Landroid/support/v4/h/o;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static a()Landroid/support/v7/widget/he;
    .locals 1

    sget-object v0, Landroid/support/v7/widget/he;->d:Landroid/support/v4/h/o;

    invoke-interface {v0}, Landroid/support/v4/h/o;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/he;

    if-nez v0, :cond_0

    new-instance v0, Landroid/support/v7/widget/he;

    invoke-direct {v0}, Landroid/support/v7/widget/he;-><init>()V

    :cond_0
    return-object v0
.end method

.method static a(Landroid/support/v7/widget/he;)V
    .locals 2

    const/4 v1, 0x0

    const/4 v0, 0x0

    iput v0, p0, Landroid/support/v7/widget/he;->a:I

    iput-object v1, p0, Landroid/support/v7/widget/he;->b:Landroid/support/v7/widget/en;

    iput-object v1, p0, Landroid/support/v7/widget/he;->c:Landroid/support/v7/widget/en;

    sget-object v0, Landroid/support/v7/widget/he;->d:Landroid/support/v4/h/o;

    invoke-interface {v0, p0}, Landroid/support/v4/h/o;->a(Ljava/lang/Object;)Z

    return-void
.end method

.method static b()V
    .locals 1

    :cond_0
    sget-object v0, Landroid/support/v7/widget/he;->d:Landroid/support/v4/h/o;

    invoke-interface {v0}, Landroid/support/v4/h/o;->a()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    return-void
.end method
