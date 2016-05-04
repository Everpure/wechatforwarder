.class abstract Landroid/support/design/widget/ap;
.super Ljava/lang/Object;


# static fields
.field static final h:[I

.field static final i:[I

.field static final j:[I


# instance fields
.field private final a:Landroid/graphics/Rect;

.field b:Landroid/graphics/drawable/Drawable;

.field c:Landroid/graphics/drawable/Drawable;

.field d:Landroid/support/design/widget/o;

.field e:Landroid/graphics/drawable/Drawable;

.field f:F

.field g:F

.field final k:Landroid/support/design/widget/cw;

.field final l:Landroid/support/design/widget/ay;

.field private m:Landroid/view/ViewTreeObserver$OnPreDrawListener;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v1, 0x2

    new-array v0, v1, [I

    fill-array-data v0, :array_0

    sput-object v0, Landroid/support/design/widget/ap;->h:[I

    new-array v0, v1, [I

    fill-array-data v0, :array_1

    sput-object v0, Landroid/support/design/widget/ap;->i:[I

    const/4 v0, 0x0

    new-array v0, v0, [I

    sput-object v0, Landroid/support/design/widget/ap;->j:[I

    return-void

    nop

    :array_0
    .array-data 4
        0x10100a7
        0x101009e
    .end array-data

    :array_1
    .array-data 4
        0x101009c
        0x101009e
    .end array-data
.end method

.method constructor <init>(Landroid/support/design/widget/cw;Landroid/support/design/widget/ay;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Landroid/support/design/widget/ap;->a:Landroid/graphics/Rect;

    iput-object p1, p0, Landroid/support/design/widget/ap;->k:Landroid/support/design/widget/cw;

    iput-object p2, p0, Landroid/support/design/widget/ap;->l:Landroid/support/design/widget/ay;

    return-void
.end method

.method private l()V
    .locals 1

    iget-object v0, p0, Landroid/support/design/widget/ap;->m:Landroid/view/ViewTreeObserver$OnPreDrawListener;

    if-nez v0, :cond_0

    new-instance v0, Landroid/support/design/widget/aq;

    invoke-direct {v0, p0}, Landroid/support/design/widget/aq;-><init>(Landroid/support/design/widget/ap;)V

    iput-object v0, p0, Landroid/support/design/widget/ap;->m:Landroid/view/ViewTreeObserver$OnPreDrawListener;

    :cond_0
    return-void
.end method


# virtual methods
.method abstract a()F
.end method

.method a(ILandroid/content/res/ColorStateList;)Landroid/support/design/widget/o;
    .locals 6

    iget-object v0, p0, Landroid/support/design/widget/ap;->k:Landroid/support/design/widget/cw;

    invoke-virtual {v0}, Landroid/support/design/widget/cw;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {p0}, Landroid/support/design/widget/ap;->j()Landroid/support/design/widget/o;

    move-result-object v1

    sget v2, Landroid/support/design/d;->design_fab_stroke_top_outer_color:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    sget v3, Landroid/support/design/d;->design_fab_stroke_top_inner_color:I

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    sget v4, Landroid/support/design/d;->design_fab_stroke_end_inner_color:I

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    sget v5, Landroid/support/design/d;->design_fab_stroke_end_outer_color:I

    invoke-virtual {v0, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v1, v2, v3, v4, v0}, Landroid/support/design/widget/o;->a(IIII)V

    int-to-float v0, p1

    invoke-virtual {v1, v0}, Landroid/support/design/widget/o;->a(F)V

    invoke-virtual {v1, p2}, Landroid/support/design/widget/o;->a(Landroid/content/res/ColorStateList;)V

    return-object v1
.end method

.method abstract a(F)V
.end method

.method abstract a(I)V
.end method

.method abstract a(Landroid/content/res/ColorStateList;)V
.end method

.method abstract a(Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;II)V
.end method

.method abstract a(Landroid/graphics/PorterDuff$Mode;)V
.end method

.method abstract a(Landroid/graphics/Rect;)V
.end method

.method abstract a(Landroid/support/design/widget/ar;Z)V
.end method

.method abstract a([I)V
.end method

.method abstract b()V
.end method

.method abstract b(F)V
.end method

.method b(Landroid/graphics/Rect;)V
    .locals 0

    return-void
.end method

.method abstract b(Landroid/support/design/widget/ar;Z)V
.end method

.method abstract c()V
.end method

.method final c(F)V
    .locals 1

    iget v0, p0, Landroid/support/design/widget/ap;->f:F

    cmpl-float v0, v0, p1

    if-eqz v0, :cond_0

    iput p1, p0, Landroid/support/design/widget/ap;->f:F

    invoke-virtual {p0, p1}, Landroid/support/design/widget/ap;->a(F)V

    :cond_0
    return-void
.end method

.method final d(F)V
    .locals 1

    iget v0, p0, Landroid/support/design/widget/ap;->g:F

    cmpl-float v0, v0, p1

    if-eqz v0, :cond_0

    iput p1, p0, Landroid/support/design/widget/ap;->g:F

    invoke-virtual {p0, p1}, Landroid/support/design/widget/ap;->b(F)V

    :cond_0
    return-void
.end method

.method d()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method e()V
    .locals 0

    return-void
.end method

.method final f()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Landroid/support/design/widget/ap;->e:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method final g()V
    .locals 5

    iget-object v0, p0, Landroid/support/design/widget/ap;->a:Landroid/graphics/Rect;

    invoke-virtual {p0, v0}, Landroid/support/design/widget/ap;->a(Landroid/graphics/Rect;)V

    invoke-virtual {p0, v0}, Landroid/support/design/widget/ap;->b(Landroid/graphics/Rect;)V

    iget-object v1, p0, Landroid/support/design/widget/ap;->l:Landroid/support/design/widget/ay;

    iget v2, v0, Landroid/graphics/Rect;->left:I

    iget v3, v0, Landroid/graphics/Rect;->top:I

    iget v4, v0, Landroid/graphics/Rect;->right:I

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    invoke-interface {v1, v2, v3, v4, v0}, Landroid/support/design/widget/ay;->a(IIII)V

    return-void
.end method

.method h()V
    .locals 2

    invoke-virtual {p0}, Landroid/support/design/widget/ap;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Landroid/support/design/widget/ap;->l()V

    iget-object v0, p0, Landroid/support/design/widget/ap;->k:Landroid/support/design/widget/cw;

    invoke-virtual {v0}, Landroid/support/design/widget/cw;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Landroid/support/design/widget/ap;->m:Landroid/view/ViewTreeObserver$OnPreDrawListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    :cond_0
    return-void
.end method

.method i()V
    .locals 2

    iget-object v0, p0, Landroid/support/design/widget/ap;->m:Landroid/view/ViewTreeObserver$OnPreDrawListener;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/design/widget/ap;->k:Landroid/support/design/widget/cw;

    invoke-virtual {v0}, Landroid/support/design/widget/cw;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Landroid/support/design/widget/ap;->m:Landroid/view/ViewTreeObserver$OnPreDrawListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/design/widget/ap;->m:Landroid/view/ViewTreeObserver$OnPreDrawListener;

    :cond_0
    return-void
.end method

.method j()Landroid/support/design/widget/o;
    .locals 1

    new-instance v0, Landroid/support/design/widget/o;

    invoke-direct {v0}, Landroid/support/design/widget/o;-><init>()V

    return-object v0
.end method

.method k()Landroid/graphics/drawable/GradientDrawable;
    .locals 2

    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    return-object v0
.end method
