.class Landroid/support/v7/a/n;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field final synthetic a:Landroid/support/v7/a/e;

.field final synthetic b:Landroid/support/v7/a/k;


# direct methods
.method constructor <init>(Landroid/support/v7/a/k;Landroid/support/v7/a/e;)V
    .locals 0

    iput-object p1, p0, Landroid/support/v7/a/n;->b:Landroid/support/v7/a/k;

    iput-object p2, p0, Landroid/support/v7/a/n;->a:Landroid/support/v7/a/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 2

    iget-object v0, p0, Landroid/support/v7/a/n;->b:Landroid/support/v7/a/k;

    iget-object v0, v0, Landroid/support/v7/a/k;->u:Landroid/content/DialogInterface$OnClickListener;

    iget-object v1, p0, Landroid/support/v7/a/n;->a:Landroid/support/v7/a/e;

    invoke-static {v1}, Landroid/support/v7/a/e;->g(Landroid/support/v7/a/e;)Landroid/support/v7/a/as;

    move-result-object v1

    invoke-interface {v0, v1, p3}, Landroid/content/DialogInterface$OnClickListener;->onClick(Landroid/content/DialogInterface;I)V

    iget-object v0, p0, Landroid/support/v7/a/n;->b:Landroid/support/v7/a/k;

    iget-boolean v0, v0, Landroid/support/v7/a/k;->E:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/a/n;->a:Landroid/support/v7/a/e;

    invoke-static {v0}, Landroid/support/v7/a/e;->g(Landroid/support/v7/a/e;)Landroid/support/v7/a/as;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/a/as;->dismiss()V

    :cond_0
    return-void
.end method
