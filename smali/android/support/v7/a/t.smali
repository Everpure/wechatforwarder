.class public Landroid/support/v7/a/t;
.super Ljava/lang/Object;


# instance fields
.field private final a:Landroid/support/v7/a/k;

.field private b:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Landroid/support/v7/a/s;->a(Landroid/content/Context;I)I

    move-result v0

    invoke-direct {p0, p1, v0}, Landroid/support/v7/a/t;-><init>(Landroid/content/Context;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/support/v7/a/k;

    new-instance v1, Landroid/view/ContextThemeWrapper;

    invoke-static {p1, p2}, Landroid/support/v7/a/s;->a(Landroid/content/Context;I)I

    move-result v2

    invoke-direct {v1, p1, v2}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    invoke-direct {v0, v1}, Landroid/support/v7/a/k;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Landroid/support/v7/a/t;->a:Landroid/support/v7/a/k;

    iput p2, p0, Landroid/support/v7/a/t;->b:I

    return-void
.end method


# virtual methods
.method public a()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Landroid/support/v7/a/t;->a:Landroid/support/v7/a/k;

    iget-object v0, v0, Landroid/support/v7/a/k;->a:Landroid/content/Context;

    return-object v0
.end method

.method public a(I)Landroid/support/v7/a/t;
    .locals 2

    iget-object v0, p0, Landroid/support/v7/a/t;->a:Landroid/support/v7/a/k;

    iget-object v1, p0, Landroid/support/v7/a/t;->a:Landroid/support/v7/a/k;

    iget-object v1, v1, Landroid/support/v7/a/k;->a:Landroid/content/Context;

    invoke-virtual {v1, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object v1

    iput-object v1, v0, Landroid/support/v7/a/k;->f:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public a(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/a/t;
    .locals 2

    iget-object v0, p0, Landroid/support/v7/a/t;->a:Landroid/support/v7/a/k;

    iget-object v1, p0, Landroid/support/v7/a/t;->a:Landroid/support/v7/a/k;

    iget-object v1, v1, Landroid/support/v7/a/k;->a:Landroid/content/Context;

    invoke-virtual {v1, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object v1

    iput-object v1, v0, Landroid/support/v7/a/k;->i:Ljava/lang/CharSequence;

    iget-object v0, p0, Landroid/support/v7/a/t;->a:Landroid/support/v7/a/k;

    iput-object p2, v0, Landroid/support/v7/a/k;->j:Landroid/content/DialogInterface$OnClickListener;

    return-object p0
.end method

.method public a(Landroid/content/DialogInterface$OnKeyListener;)Landroid/support/v7/a/t;
    .locals 1

    iget-object v0, p0, Landroid/support/v7/a/t;->a:Landroid/support/v7/a/k;

    iput-object p1, v0, Landroid/support/v7/a/k;->r:Landroid/content/DialogInterface$OnKeyListener;

    return-object p0
.end method

.method public a(Landroid/graphics/drawable/Drawable;)Landroid/support/v7/a/t;
    .locals 1

    iget-object v0, p0, Landroid/support/v7/a/t;->a:Landroid/support/v7/a/k;

    iput-object p1, v0, Landroid/support/v7/a/k;->d:Landroid/graphics/drawable/Drawable;

    return-object p0
.end method

.method public a(Landroid/view/View;)Landroid/support/v7/a/t;
    .locals 1

    iget-object v0, p0, Landroid/support/v7/a/t;->a:Landroid/support/v7/a/k;

    iput-object p1, v0, Landroid/support/v7/a/k;->g:Landroid/view/View;

    return-object p0
.end method

.method public a(Landroid/widget/ListAdapter;Landroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/a/t;
    .locals 1

    iget-object v0, p0, Landroid/support/v7/a/t;->a:Landroid/support/v7/a/k;

    iput-object p1, v0, Landroid/support/v7/a/k;->t:Landroid/widget/ListAdapter;

    iget-object v0, p0, Landroid/support/v7/a/t;->a:Landroid/support/v7/a/k;

    iput-object p2, v0, Landroid/support/v7/a/k;->u:Landroid/content/DialogInterface$OnClickListener;

    return-object p0
.end method

.method public a(Ljava/lang/CharSequence;)Landroid/support/v7/a/t;
    .locals 1

    iget-object v0, p0, Landroid/support/v7/a/t;->a:Landroid/support/v7/a/k;

    iput-object p1, v0, Landroid/support/v7/a/k;->f:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public b()Landroid/support/v7/a/s;
    .locals 4

    new-instance v0, Landroid/support/v7/a/s;

    iget-object v1, p0, Landroid/support/v7/a/t;->a:Landroid/support/v7/a/k;

    iget-object v1, v1, Landroid/support/v7/a/k;->a:Landroid/content/Context;

    iget v2, p0, Landroid/support/v7/a/t;->b:I

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Landroid/support/v7/a/s;-><init>(Landroid/content/Context;IZ)V

    iget-object v1, p0, Landroid/support/v7/a/t;->a:Landroid/support/v7/a/k;

    invoke-static {v0}, Landroid/support/v7/a/s;->a(Landroid/support/v7/a/s;)Landroid/support/v7/a/e;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/support/v7/a/k;->a(Landroid/support/v7/a/e;)V

    iget-object v1, p0, Landroid/support/v7/a/t;->a:Landroid/support/v7/a/k;

    iget-boolean v1, v1, Landroid/support/v7/a/k;->o:Z

    invoke-virtual {v0, v1}, Landroid/support/v7/a/s;->setCancelable(Z)V

    iget-object v1, p0, Landroid/support/v7/a/t;->a:Landroid/support/v7/a/k;

    iget-boolean v1, v1, Landroid/support/v7/a/k;->o:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/v7/a/s;->setCanceledOnTouchOutside(Z)V

    :cond_0
    iget-object v1, p0, Landroid/support/v7/a/t;->a:Landroid/support/v7/a/k;

    iget-object v1, v1, Landroid/support/v7/a/k;->p:Landroid/content/DialogInterface$OnCancelListener;

    invoke-virtual {v0, v1}, Landroid/support/v7/a/s;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    iget-object v1, p0, Landroid/support/v7/a/t;->a:Landroid/support/v7/a/k;

    iget-object v1, v1, Landroid/support/v7/a/k;->q:Landroid/content/DialogInterface$OnDismissListener;

    invoke-virtual {v0, v1}, Landroid/support/v7/a/s;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    iget-object v1, p0, Landroid/support/v7/a/t;->a:Landroid/support/v7/a/k;

    iget-object v1, v1, Landroid/support/v7/a/k;->r:Landroid/content/DialogInterface$OnKeyListener;

    if-eqz v1, :cond_1

    iget-object v1, p0, Landroid/support/v7/a/t;->a:Landroid/support/v7/a/k;

    iget-object v1, v1, Landroid/support/v7/a/k;->r:Landroid/content/DialogInterface$OnKeyListener;

    invoke-virtual {v0, v1}, Landroid/support/v7/a/s;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    :cond_1
    return-object v0
.end method

.method public b(I)Landroid/support/v7/a/t;
    .locals 2

    iget-object v0, p0, Landroid/support/v7/a/t;->a:Landroid/support/v7/a/k;

    iget-object v1, p0, Landroid/support/v7/a/t;->a:Landroid/support/v7/a/k;

    iget-object v1, v1, Landroid/support/v7/a/k;->a:Landroid/content/Context;

    invoke-virtual {v1, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object v1

    iput-object v1, v0, Landroid/support/v7/a/k;->h:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public b(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/a/t;
    .locals 2

    iget-object v0, p0, Landroid/support/v7/a/t;->a:Landroid/support/v7/a/k;

    iget-object v1, p0, Landroid/support/v7/a/t;->a:Landroid/support/v7/a/k;

    iget-object v1, v1, Landroid/support/v7/a/k;->a:Landroid/content/Context;

    invoke-virtual {v1, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object v1

    iput-object v1, v0, Landroid/support/v7/a/k;->k:Ljava/lang/CharSequence;

    iget-object v0, p0, Landroid/support/v7/a/t;->a:Landroid/support/v7/a/k;

    iput-object p2, v0, Landroid/support/v7/a/k;->l:Landroid/content/DialogInterface$OnClickListener;

    return-object p0
.end method

.method public b(Landroid/view/View;)Landroid/support/v7/a/t;
    .locals 2

    const/4 v1, 0x0

    iget-object v0, p0, Landroid/support/v7/a/t;->a:Landroid/support/v7/a/k;

    iput-object p1, v0, Landroid/support/v7/a/k;->w:Landroid/view/View;

    iget-object v0, p0, Landroid/support/v7/a/t;->a:Landroid/support/v7/a/k;

    iput v1, v0, Landroid/support/v7/a/k;->v:I

    iget-object v0, p0, Landroid/support/v7/a/t;->a:Landroid/support/v7/a/k;

    iput-boolean v1, v0, Landroid/support/v7/a/k;->B:Z

    return-object p0
.end method
