.class Landroid/support/v7/widget/ci;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/util/ArrayList;

.field final synthetic b:Landroid/support/v7/widget/cg;


# direct methods
.method constructor <init>(Landroid/support/v7/widget/cg;Ljava/util/ArrayList;)V
    .locals 0

    iput-object p1, p0, Landroid/support/v7/widget/ci;->b:Landroid/support/v7/widget/cg;

    iput-object p2, p0, Landroid/support/v7/widget/ci;->a:Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Landroid/support/v7/widget/ci;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/cp;

    iget-object v2, p0, Landroid/support/v7/widget/ci;->b:Landroid/support/v7/widget/cg;

    invoke-static {v2, v0}, Landroid/support/v7/widget/cg;->a(Landroid/support/v7/widget/cg;Landroid/support/v7/widget/cp;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/ci;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Landroid/support/v7/widget/ci;->b:Landroid/support/v7/widget/cg;

    invoke-static {v0}, Landroid/support/v7/widget/cg;->b(Landroid/support/v7/widget/cg;)Ljava/util/ArrayList;

    move-result-object v0

    iget-object v1, p0, Landroid/support/v7/widget/ci;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method
