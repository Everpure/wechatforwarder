.class Landroid/support/design/widget/au;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Landroid/support/design/widget/at;

.field private final b:Landroid/support/design/widget/CoordinatorLayout;

.field private final c:Landroid/view/View;


# direct methods
.method constructor <init>(Landroid/support/design/widget/at;Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Landroid/support/design/widget/au;->a:Landroid/support/design/widget/at;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Landroid/support/design/widget/au;->b:Landroid/support/design/widget/CoordinatorLayout;

    iput-object p3, p0, Landroid/support/design/widget/au;->c:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Landroid/support/design/widget/au;->c:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/design/widget/au;->a:Landroid/support/design/widget/at;

    invoke-static {v0}, Landroid/support/design/widget/at;->a(Landroid/support/design/widget/at;)Landroid/support/v4/widget/at;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/design/widget/au;->a:Landroid/support/design/widget/at;

    invoke-static {v0}, Landroid/support/design/widget/at;->a(Landroid/support/design/widget/at;)Landroid/support/v4/widget/at;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/widget/at;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroid/support/design/widget/au;->a:Landroid/support/design/widget/at;

    iget-object v1, p0, Landroid/support/design/widget/au;->b:Landroid/support/design/widget/CoordinatorLayout;

    iget-object v2, p0, Landroid/support/design/widget/au;->c:Landroid/view/View;

    iget-object v3, p0, Landroid/support/design/widget/au;->a:Landroid/support/design/widget/at;

    invoke-static {v3}, Landroid/support/design/widget/at;->a(Landroid/support/design/widget/at;)Landroid/support/v4/widget/at;

    move-result-object v3

    invoke-virtual {v3}, Landroid/support/v4/widget/at;->c()I

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Landroid/support/design/widget/at;->a_(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;I)I

    iget-object v0, p0, Landroid/support/design/widget/au;->c:Landroid/view/View;

    invoke-static {v0, p0}, Landroid/support/v4/i/bu;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Landroid/support/design/widget/au;->a:Landroid/support/design/widget/at;

    iget-object v1, p0, Landroid/support/design/widget/au;->b:Landroid/support/design/widget/CoordinatorLayout;

    iget-object v2, p0, Landroid/support/design/widget/au;->c:Landroid/view/View;

    invoke-virtual {v0, v1, v2}, Landroid/support/design/widget/at;->a(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;)V

    goto :goto_0
.end method
