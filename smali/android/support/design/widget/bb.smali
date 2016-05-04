.class Landroid/support/design/widget/bb;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/support/design/widget/bu;


# instance fields
.field final synthetic a:Landroid/support/design/widget/Snackbar;


# direct methods
.method constructor <init>(Landroid/support/design/widget/Snackbar;)V
    .locals 0

    iput-object p1, p0, Landroid/support/design/widget/bb;->a:Landroid/support/design/widget/Snackbar;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 2

    packed-switch p1, :pswitch_data_0

    :goto_0
    return-void

    :pswitch_0
    invoke-static {}, Landroid/support/design/widget/bm;->a()Landroid/support/design/widget/bm;

    move-result-object v0

    iget-object v1, p0, Landroid/support/design/widget/bb;->a:Landroid/support/design/widget/Snackbar;

    invoke-static {v1}, Landroid/support/design/widget/Snackbar;->a(Landroid/support/design/widget/Snackbar;)Landroid/support/design/widget/bo;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/design/widget/bm;->c(Landroid/support/design/widget/bo;)V

    goto :goto_0

    :pswitch_1
    invoke-static {}, Landroid/support/design/widget/bm;->a()Landroid/support/design/widget/bm;

    move-result-object v0

    iget-object v1, p0, Landroid/support/design/widget/bb;->a:Landroid/support/design/widget/Snackbar;

    invoke-static {v1}, Landroid/support/design/widget/Snackbar;->a(Landroid/support/design/widget/Snackbar;)Landroid/support/design/widget/bo;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/design/widget/bm;->d(Landroid/support/design/widget/bo;)V

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public a(Landroid/view/View;)V
    .locals 2

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Landroid/support/design/widget/bb;->a:Landroid/support/design/widget/Snackbar;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/support/design/widget/Snackbar;->a(Landroid/support/design/widget/Snackbar;I)V

    return-void
.end method
