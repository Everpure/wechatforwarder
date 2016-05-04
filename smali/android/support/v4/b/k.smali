.class Landroid/support/v4/b/k;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/support/v4/b/ax;


# instance fields
.field final synthetic a:Landroid/support/v4/b/t;

.field final synthetic b:Landroid/support/v4/b/j;


# direct methods
.method constructor <init>(Landroid/support/v4/b/j;Landroid/support/v4/b/t;)V
    .locals 0

    iput-object p1, p0, Landroid/support/v4/b/k;->b:Landroid/support/v4/b/j;

    iput-object p2, p0, Landroid/support/v4/b/k;->a:Landroid/support/v4/b/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Landroid/support/v4/b/k;->a:Landroid/support/v4/b/t;

    invoke-virtual {v0}, Landroid/support/v4/b/t;->g()Landroid/view/View;

    move-result-object v0

    return-object v0
.end method
