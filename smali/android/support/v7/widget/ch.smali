.class Landroid/support/v7/widget/ch;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/util/ArrayList;

.field final synthetic b:Landroid/support/v7/widget/cg;


# direct methods
.method constructor <init>(Landroid/support/v7/widget/cg;Ljava/util/ArrayList;)V
    .locals 0

    iput-object p1, p0, Landroid/support/v7/widget/ch;->b:Landroid/support/v7/widget/cg;

    iput-object p2, p0, Landroid/support/v7/widget/ch;->a:Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    iget-object v0, p0, Landroid/support/v7/widget/ch;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/support/v7/widget/cq;

    iget-object v0, p0, Landroid/support/v7/widget/ch;->b:Landroid/support/v7/widget/cg;

    iget-object v1, v5, Landroid/support/v7/widget/cq;->a:Landroid/support/v7/widget/fh;

    iget v2, v5, Landroid/support/v7/widget/cq;->b:I

    iget v3, v5, Landroid/support/v7/widget/cq;->c:I

    iget v4, v5, Landroid/support/v7/widget/cq;->d:I

    iget v5, v5, Landroid/support/v7/widget/cq;->e:I

    invoke-static/range {v0 .. v5}, Landroid/support/v7/widget/cg;->a(Landroid/support/v7/widget/cg;Landroid/support/v7/widget/fh;IIII)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/ch;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Landroid/support/v7/widget/ch;->b:Landroid/support/v7/widget/cg;

    invoke-static {v0}, Landroid/support/v7/widget/cg;->a(Landroid/support/v7/widget/cg;)Ljava/util/ArrayList;

    move-result-object v0

    iget-object v1, p0, Landroid/support/v7/widget/ch;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method
