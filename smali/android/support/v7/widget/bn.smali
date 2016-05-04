.class Landroid/support/v7/widget/bn;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field final synthetic a:Landroid/support/v7/widget/bj;

.field final synthetic b:Landroid/support/v7/widget/bm;


# direct methods
.method constructor <init>(Landroid/support/v7/widget/bm;Landroid/support/v7/widget/bj;)V
    .locals 0

    iput-object p1, p0, Landroid/support/v7/widget/bn;->b:Landroid/support/v7/widget/bm;

    iput-object p2, p0, Landroid/support/v7/widget/bn;->a:Landroid/support/v7/widget/bj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 4

    iget-object v0, p0, Landroid/support/v7/widget/bn;->b:Landroid/support/v7/widget/bm;

    iget-object v0, v0, Landroid/support/v7/widget/bm;->a:Landroid/support/v7/widget/bj;

    invoke-virtual {v0, p3}, Landroid/support/v7/widget/bj;->setSelection(I)V

    iget-object v0, p0, Landroid/support/v7/widget/bn;->b:Landroid/support/v7/widget/bm;

    iget-object v0, v0, Landroid/support/v7/widget/bm;->a:Landroid/support/v7/widget/bj;

    invoke-virtual {v0}, Landroid/support/v7/widget/bj;->getOnItemClickListener()Landroid/widget/AdapterView$OnItemClickListener;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/bn;->b:Landroid/support/v7/widget/bm;

    iget-object v0, v0, Landroid/support/v7/widget/bm;->a:Landroid/support/v7/widget/bj;

    iget-object v1, p0, Landroid/support/v7/widget/bn;->b:Landroid/support/v7/widget/bm;

    invoke-static {v1}, Landroid/support/v7/widget/bm;->a(Landroid/support/v7/widget/bm;)Landroid/widget/ListAdapter;

    move-result-object v1

    invoke-interface {v1, p3}, Landroid/widget/ListAdapter;->getItemId(I)J

    move-result-wide v2

    invoke-virtual {v0, p2, p3, v2, v3}, Landroid/support/v7/widget/bj;->performItemClick(Landroid/view/View;IJ)Z

    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/bn;->b:Landroid/support/v7/widget/bm;

    invoke-virtual {v0}, Landroid/support/v7/widget/bm;->i()V

    return-void
.end method
