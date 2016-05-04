.class Landroid/support/v7/widget/dp;
.super Landroid/database/DataSetObserver;


# instance fields
.field final synthetic a:Landroid/support/v7/widget/dg;


# direct methods
.method private constructor <init>(Landroid/support/v7/widget/dg;)V
    .locals 0

    iput-object p1, p0, Landroid/support/v7/widget/dp;->a:Landroid/support/v7/widget/dg;

    invoke-direct {p0}, Landroid/database/DataSetObserver;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Landroid/support/v7/widget/dg;Landroid/support/v7/widget/dh;)V
    .locals 0

    invoke-direct {p0, p1}, Landroid/support/v7/widget/dp;-><init>(Landroid/support/v7/widget/dg;)V

    return-void
.end method


# virtual methods
.method public onChanged()V
    .locals 1

    iget-object v0, p0, Landroid/support/v7/widget/dp;->a:Landroid/support/v7/widget/dg;

    invoke-virtual {v0}, Landroid/support/v7/widget/dg;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/dp;->a:Landroid/support/v7/widget/dg;

    invoke-virtual {v0}, Landroid/support/v7/widget/dg;->c()V

    :cond_0
    return-void
.end method

.method public onInvalidated()V
    .locals 1

    iget-object v0, p0, Landroid/support/v7/widget/dp;->a:Landroid/support/v7/widget/dg;

    invoke-virtual {v0}, Landroid/support/v7/widget/dg;->i()V

    return-void
.end method
