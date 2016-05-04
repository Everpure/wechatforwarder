.class Landroid/support/v7/widget/dn;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Landroid/support/v7/widget/dl;


# direct methods
.method private constructor <init>(Landroid/support/v7/widget/dl;)V
    .locals 0

    iput-object p1, p0, Landroid/support/v7/widget/dn;->a:Landroid/support/v7/widget/dl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Landroid/support/v7/widget/dl;Landroid/support/v7/widget/dh;)V
    .locals 0

    invoke-direct {p0, p1}, Landroid/support/v7/widget/dn;-><init>(Landroid/support/v7/widget/dl;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Landroid/support/v7/widget/dn;->a:Landroid/support/v7/widget/dl;

    invoke-static {v0}, Landroid/support/v7/widget/dl;->b(Landroid/support/v7/widget/dl;)V

    return-void
.end method
