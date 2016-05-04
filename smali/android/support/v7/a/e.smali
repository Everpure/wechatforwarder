.class Landroid/support/v7/a/e;
.super Ljava/lang/Object;


# instance fields
.field private A:Landroid/widget/TextView;

.field private B:Landroid/widget/TextView;

.field private C:Landroid/view/View;

.field private D:Landroid/widget/ListAdapter;

.field private E:I

.field private F:I

.field private G:I

.field private H:I

.field private I:I

.field private J:I

.field private K:I

.field private L:I

.field private M:Landroid/os/Handler;

.field private final N:Landroid/view/View$OnClickListener;

.field private final a:Landroid/content/Context;

.field private final b:Landroid/support/v7/a/as;

.field private final c:Landroid/view/Window;

.field private d:Ljava/lang/CharSequence;

.field private e:Ljava/lang/CharSequence;

.field private f:Landroid/widget/ListView;

.field private g:Landroid/view/View;

.field private h:I

.field private i:I

.field private j:I

.field private k:I

.field private l:I

.field private m:Z

.field private n:Landroid/widget/Button;

.field private o:Ljava/lang/CharSequence;

.field private p:Landroid/os/Message;

.field private q:Landroid/widget/Button;

.field private r:Ljava/lang/CharSequence;

.field private s:Landroid/os/Message;

.field private t:Landroid/widget/Button;

.field private u:Ljava/lang/CharSequence;

.field private v:Landroid/os/Message;

.field private w:Landroid/support/v4/widget/NestedScrollView;

.field private x:I

.field private y:Landroid/graphics/drawable/Drawable;

.field private z:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/support/v7/a/as;Landroid/view/Window;)V
    .locals 4

    const/4 v3, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean v3, p0, Landroid/support/v7/a/e;->m:Z

    iput v3, p0, Landroid/support/v7/a/e;->x:I

    const/4 v0, -0x1

    iput v0, p0, Landroid/support/v7/a/e;->E:I

    iput v3, p0, Landroid/support/v7/a/e;->L:I

    new-instance v0, Landroid/support/v7/a/f;

    invoke-direct {v0, p0}, Landroid/support/v7/a/f;-><init>(Landroid/support/v7/a/e;)V

    iput-object v0, p0, Landroid/support/v7/a/e;->N:Landroid/view/View$OnClickListener;

    iput-object p1, p0, Landroid/support/v7/a/e;->a:Landroid/content/Context;

    iput-object p2, p0, Landroid/support/v7/a/e;->b:Landroid/support/v7/a/as;

    iput-object p3, p0, Landroid/support/v7/a/e;->c:Landroid/view/Window;

    new-instance v0, Landroid/support/v7/a/q;

    invoke-direct {v0, p2}, Landroid/support/v7/a/q;-><init>(Landroid/content/DialogInterface;)V

    iput-object v0, p0, Landroid/support/v7/a/e;->M:Landroid/os/Handler;

    const/4 v0, 0x0

    sget-object v1, Landroid/support/v7/b/l;->AlertDialog:[I

    sget v2, Landroid/support/v7/b/b;->alertDialogStyle:I

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v0

    sget v1, Landroid/support/v7/b/l;->AlertDialog_android_layout:I

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    iput v1, p0, Landroid/support/v7/a/e;->F:I

    sget v1, Landroid/support/v7/b/l;->AlertDialog_buttonPanelSideLayout:I

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    iput v1, p0, Landroid/support/v7/a/e;->G:I

    sget v1, Landroid/support/v7/b/l;->AlertDialog_listLayout:I

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    iput v1, p0, Landroid/support/v7/a/e;->H:I

    sget v1, Landroid/support/v7/b/l;->AlertDialog_multiChoiceItemLayout:I

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    iput v1, p0, Landroid/support/v7/a/e;->I:I

    sget v1, Landroid/support/v7/b/l;->AlertDialog_singleChoiceItemLayout:I

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    iput v1, p0, Landroid/support/v7/a/e;->J:I

    sget v1, Landroid/support/v7/b/l;->AlertDialog_listItemLayout:I

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    iput v1, p0, Landroid/support/v7/a/e;->K:I

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method static synthetic a(Landroid/support/v7/a/e;I)I
    .locals 0

    iput p1, p0, Landroid/support/v7/a/e;->E:I

    return p1
.end method

.method private a(Landroid/view/View;Landroid/view/View;)Landroid/view/ViewGroup;
    .locals 2

    if-nez p1, :cond_0

    instance-of v0, p2, Landroid/view/ViewStub;

    if-eqz v0, :cond_3

    check-cast p2, Landroid/view/ViewStub;

    invoke-virtual {p2}, Landroid/view/ViewStub;->inflate()Landroid/view/View;

    move-result-object v0

    :goto_0
    check-cast v0, Landroid/view/ViewGroup;

    :goto_1
    return-object v0

    :cond_0
    if-eqz p2, :cond_1

    invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v1, v0, Landroid/view/ViewGroup;

    if-eqz v1, :cond_1

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0, p2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_1
    instance-of v0, p1, Landroid/view/ViewStub;

    if-eqz v0, :cond_2

    check-cast p1, Landroid/view/ViewStub;

    invoke-virtual {p1}, Landroid/view/ViewStub;->inflate()Landroid/view/View;

    move-result-object v0

    :goto_2
    check-cast v0, Landroid/view/ViewGroup;

    goto :goto_1

    :cond_2
    move-object v0, p1

    goto :goto_2

    :cond_3
    move-object v0, p2

    goto :goto_0
.end method

.method static synthetic a(Landroid/support/v7/a/e;)Landroid/widget/Button;
    .locals 1

    iget-object v0, p0, Landroid/support/v7/a/e;->n:Landroid/widget/Button;

    return-object v0
.end method

.method static synthetic a(Landroid/support/v7/a/e;Landroid/widget/ListAdapter;)Landroid/widget/ListAdapter;
    .locals 0

    iput-object p1, p0, Landroid/support/v7/a/e;->D:Landroid/widget/ListAdapter;

    return-object p1
.end method

.method static synthetic a(Landroid/support/v7/a/e;Landroid/widget/ListView;)Landroid/widget/ListView;
    .locals 0

    iput-object p1, p0, Landroid/support/v7/a/e;->f:Landroid/widget/ListView;

    return-object p1
.end method

.method static synthetic a(Landroid/view/View;Landroid/view/View;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Landroid/support/v7/a/e;->b(Landroid/view/View;Landroid/view/View;Landroid/view/View;)V

    return-void
.end method

.method private a(Landroid/view/ViewGroup;)V
    .locals 5

    const/high16 v4, 0x20000

    const/4 v0, 0x0

    const/4 v3, -0x1

    iget-object v1, p0, Landroid/support/v7/a/e;->g:Landroid/view/View;

    if-eqz v1, :cond_5

    iget-object v1, p0, Landroid/support/v7/a/e;->g:Landroid/view/View;

    :goto_0
    if-eqz v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    if-eqz v0, :cond_1

    invoke-static {v1}, Landroid/support/v7/a/e;->a(Landroid/view/View;)Z

    move-result v2

    if-nez v2, :cond_2

    :cond_1
    iget-object v2, p0, Landroid/support/v7/a/e;->c:Landroid/view/Window;

    invoke-virtual {v2, v4, v4}, Landroid/view/Window;->setFlags(II)V

    :cond_2
    if-eqz v0, :cond_7

    iget-object v0, p0, Landroid/support/v7/a/e;->c:Landroid/view/Window;

    sget v2, Landroid/support/v7/b/g;->custom:I

    invoke-virtual {v0, v2}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    new-instance v2, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v2, v3, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1, v2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-boolean v1, p0, Landroid/support/v7/a/e;->m:Z

    if-eqz v1, :cond_3

    iget v1, p0, Landroid/support/v7/a/e;->i:I

    iget v2, p0, Landroid/support/v7/a/e;->j:I

    iget v3, p0, Landroid/support/v7/a/e;->k:I

    iget v4, p0, Landroid/support/v7/a/e;->l:I

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/FrameLayout;->setPadding(IIII)V

    :cond_3
    iget-object v0, p0, Landroid/support/v7/a/e;->f:Landroid/widget/ListView;

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, 0x0

    iput v1, v0, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    :cond_4
    :goto_1
    return-void

    :cond_5
    iget v1, p0, Landroid/support/v7/a/e;->h:I

    if-eqz v1, :cond_6

    iget-object v1, p0, Landroid/support/v7/a/e;->a:Landroid/content/Context;

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    iget v2, p0, Landroid/support/v7/a/e;->h:I

    invoke-virtual {v1, v2, p1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    goto :goto_0

    :cond_6
    const/4 v1, 0x0

    goto :goto_0

    :cond_7
    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setVisibility(I)V

    goto :goto_1
.end method

.method private a(Landroid/view/ViewGroup;Landroid/view/View;II)V
    .locals 5

    const/4 v0, 0x0

    iget-object v1, p0, Landroid/support/v7/a/e;->c:Landroid/view/Window;

    sget v2, Landroid/support/v7/b/g;->scrollIndicatorUp:I

    invoke-virtual {v1, v2}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v2

    iget-object v1, p0, Landroid/support/v7/a/e;->c:Landroid/view/Window;

    sget v3, Landroid/support/v7/b/g;->scrollIndicatorDown:I

    invoke-virtual {v1, v3}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v1

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x17

    if-lt v3, v4, :cond_2

    invoke-static {p2, p3, p4}, Landroid/support/v4/i/bu;->a(Landroid/view/View;II)V

    if-eqz v2, :cond_0

    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_0
    if-eqz v1, :cond_1

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_1
    :goto_0
    return-void

    :cond_2
    if-eqz v2, :cond_3

    and-int/lit8 v3, p3, 0x1

    if-nez v3, :cond_3

    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    move-object v2, v0

    :cond_3
    if-eqz v1, :cond_8

    and-int/lit8 v3, p3, 0x2

    if-nez v3, :cond_8

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :goto_1
    if-nez v2, :cond_4

    if-eqz v0, :cond_1

    :cond_4
    iget-object v1, p0, Landroid/support/v7/a/e;->e:Ljava/lang/CharSequence;

    if-eqz v1, :cond_5

    iget-object v1, p0, Landroid/support/v7/a/e;->w:Landroid/support/v4/widget/NestedScrollView;

    new-instance v3, Landroid/support/v7/a/g;

    invoke-direct {v3, p0, v2, v0}, Landroid/support/v7/a/g;-><init>(Landroid/support/v7/a/e;Landroid/view/View;Landroid/view/View;)V

    invoke-virtual {v1, v3}, Landroid/support/v4/widget/NestedScrollView;->setOnScrollChangeListener(Landroid/support/v4/widget/ae;)V

    iget-object v1, p0, Landroid/support/v7/a/e;->w:Landroid/support/v4/widget/NestedScrollView;

    new-instance v3, Landroid/support/v7/a/h;

    invoke-direct {v3, p0, v2, v0}, Landroid/support/v7/a/h;-><init>(Landroid/support/v7/a/e;Landroid/view/View;Landroid/view/View;)V

    invoke-virtual {v1, v3}, Landroid/support/v4/widget/NestedScrollView;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_5
    iget-object v1, p0, Landroid/support/v7/a/e;->f:Landroid/widget/ListView;

    if-eqz v1, :cond_6

    iget-object v1, p0, Landroid/support/v7/a/e;->f:Landroid/widget/ListView;

    new-instance v3, Landroid/support/v7/a/i;

    invoke-direct {v3, p0, v2, v0}, Landroid/support/v7/a/i;-><init>(Landroid/support/v7/a/e;Landroid/view/View;Landroid/view/View;)V

    invoke-virtual {v1, v3}, Landroid/widget/ListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    iget-object v1, p0, Landroid/support/v7/a/e;->f:Landroid/widget/ListView;

    new-instance v3, Landroid/support/v7/a/j;

    invoke-direct {v3, p0, v2, v0}, Landroid/support/v7/a/j;-><init>(Landroid/support/v7/a/e;Landroid/view/View;Landroid/view/View;)V

    invoke-virtual {v1, v3}, Landroid/widget/ListView;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_6
    if-eqz v2, :cond_7

    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_7
    if-eqz v0, :cond_1

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    goto :goto_0

    :cond_8
    move-object v0, v1

    goto :goto_1
.end method

.method static a(Landroid/view/View;)Z
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0}, Landroid/view/View;->onCheckIsTextEditor()Z

    move-result v2

    if-eqz v2, :cond_0

    :goto_0
    return v0

    :cond_0
    instance-of v2, p0, Landroid/view/ViewGroup;

    if-nez v2, :cond_1

    move v0, v1

    goto :goto_0

    :cond_1
    check-cast p0, Landroid/view/ViewGroup;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    :cond_2
    if-lez v2, :cond_3

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    invoke-static {v3}, Landroid/support/v7/a/e;->a(Landroid/view/View;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_0

    :cond_3
    move v0, v1

    goto :goto_0
.end method

.method private b()I
    .locals 2

    iget v0, p0, Landroid/support/v7/a/e;->G:I

    if-nez v0, :cond_0

    iget v0, p0, Landroid/support/v7/a/e;->F:I

    :goto_0
    return v0

    :cond_0
    iget v0, p0, Landroid/support/v7/a/e;->L:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    iget v0, p0, Landroid/support/v7/a/e;->G:I

    goto :goto_0

    :cond_1
    iget v0, p0, Landroid/support/v7/a/e;->F:I

    goto :goto_0
.end method

.method static synthetic b(Landroid/support/v7/a/e;)Landroid/os/Message;
    .locals 1

    iget-object v0, p0, Landroid/support/v7/a/e;->p:Landroid/os/Message;

    return-object v0
.end method

.method private static b(Landroid/view/View;Landroid/view/View;Landroid/view/View;)V
    .locals 3

    const/4 v2, 0x4

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    const/4 v0, -0x1

    invoke-static {p0, v0}, Landroid/support/v4/i/bu;->b(Landroid/view/View;I)Z

    move-result v0

    if-eqz v0, :cond_2

    move v0, v1

    :goto_0
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    if-eqz p2, :cond_1

    const/4 v0, 0x1

    invoke-static {p0, v0}, Landroid/support/v4/i/bu;->b(Landroid/view/View;I)Z

    move-result v0

    if-eqz v0, :cond_3

    :goto_1
    invoke-virtual {p2, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    return-void

    :cond_2
    move v0, v2

    goto :goto_0

    :cond_3
    move v1, v2

    goto :goto_1
.end method

.method private b(Landroid/view/ViewGroup;)V
    .locals 6

    const/4 v1, 0x0

    const/16 v5, 0x8

    iget-object v0, p0, Landroid/support/v7/a/e;->C:Landroid/view/View;

    if-eqz v0, :cond_0

    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    const/4 v2, -0x1

    const/4 v3, -0x2

    invoke-direct {v0, v2, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    iget-object v2, p0, Landroid/support/v7/a/e;->C:Landroid/view/View;

    invoke-virtual {p1, v2, v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Landroid/support/v7/a/e;->c:Landroid/view/Window;

    sget v1, Landroid/support/v7/b/g;->title_template:I

    invoke-virtual {v0, v1}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Landroid/support/v7/a/e;->c:Landroid/view/Window;

    const v2, 0x1020006

    invoke-virtual {v0, v2}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Landroid/support/v7/a/e;->z:Landroid/widget/ImageView;

    iget-object v0, p0, Landroid/support/v7/a/e;->d:Ljava/lang/CharSequence;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    :goto_1
    if-eqz v0, :cond_4

    iget-object v0, p0, Landroid/support/v7/a/e;->c:Landroid/view/Window;

    sget v1, Landroid/support/v7/b/g;->alertTitle:I

    invoke-virtual {v0, v1}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Landroid/support/v7/a/e;->A:Landroid/widget/TextView;

    iget-object v0, p0, Landroid/support/v7/a/e;->A:Landroid/widget/TextView;

    iget-object v1, p0, Landroid/support/v7/a/e;->d:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget v0, p0, Landroid/support/v7/a/e;->x:I

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroid/support/v7/a/e;->z:Landroid/widget/ImageView;

    iget v1, p0, Landroid/support/v7/a/e;->x:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    :cond_1
    move v0, v1

    goto :goto_1

    :cond_2
    iget-object v0, p0, Landroid/support/v7/a/e;->y:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_3

    iget-object v0, p0, Landroid/support/v7/a/e;->z:Landroid/widget/ImageView;

    iget-object v1, p0, Landroid/support/v7/a/e;->y:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    :cond_3
    iget-object v0, p0, Landroid/support/v7/a/e;->A:Landroid/widget/TextView;

    iget-object v1, p0, Landroid/support/v7/a/e;->z:Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/widget/ImageView;->getPaddingLeft()I

    move-result v1

    iget-object v2, p0, Landroid/support/v7/a/e;->z:Landroid/widget/ImageView;

    invoke-virtual {v2}, Landroid/widget/ImageView;->getPaddingTop()I

    move-result v2

    iget-object v3, p0, Landroid/support/v7/a/e;->z:Landroid/widget/ImageView;

    invoke-virtual {v3}, Landroid/widget/ImageView;->getPaddingRight()I

    move-result v3

    iget-object v4, p0, Landroid/support/v7/a/e;->z:Landroid/widget/ImageView;

    invoke-virtual {v4}, Landroid/widget/ImageView;->getPaddingBottom()I

    move-result v4

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    iget-object v0, p0, Landroid/support/v7/a/e;->z:Landroid/widget/ImageView;

    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    :cond_4
    iget-object v0, p0, Landroid/support/v7/a/e;->c:Landroid/view/Window;

    sget v1, Landroid/support/v7/b/g;->title_template:I

    invoke-virtual {v0, v1}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Landroid/support/v7/a/e;->z:Landroid/widget/ImageView;

    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-virtual {p1, v5}, Landroid/view/ViewGroup;->setVisibility(I)V

    goto :goto_0
.end method

.method static synthetic c(Landroid/support/v7/a/e;)Landroid/widget/Button;
    .locals 1

    iget-object v0, p0, Landroid/support/v7/a/e;->q:Landroid/widget/Button;

    return-object v0
.end method

.method private c()V
    .locals 10

    const/16 v9, 0x8

    const/4 v3, 0x1

    const/4 v1, 0x0

    iget-object v0, p0, Landroid/support/v7/a/e;->c:Landroid/view/Window;

    sget v2, Landroid/support/v7/b/g;->parentPanel:I

    invoke-virtual {v0, v2}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v0

    sget v2, Landroid/support/v7/b/g;->topPanel:I

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    sget v4, Landroid/support/v7/b/g;->contentPanel:I

    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    sget v5, Landroid/support/v7/b/g;->buttonPanel:I

    invoke-virtual {v0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    sget v6, Landroid/support/v7/b/g;->customPanel:I

    invoke-virtual {v0, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-direct {p0, v0}, Landroid/support/v7/a/e;->a(Landroid/view/ViewGroup;)V

    sget v6, Landroid/support/v7/b/g;->topPanel:I

    invoke-virtual {v0, v6}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v6

    sget v7, Landroid/support/v7/b/g;->contentPanel:I

    invoke-virtual {v0, v7}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v7

    sget v8, Landroid/support/v7/b/g;->buttonPanel:I

    invoke-virtual {v0, v8}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v8

    invoke-direct {p0, v6, v2}, Landroid/support/v7/a/e;->a(Landroid/view/View;Landroid/view/View;)Landroid/view/ViewGroup;

    move-result-object v2

    invoke-direct {p0, v7, v4}, Landroid/support/v7/a/e;->a(Landroid/view/View;Landroid/view/View;)Landroid/view/ViewGroup;

    move-result-object v6

    invoke-direct {p0, v8, v5}, Landroid/support/v7/a/e;->a(Landroid/view/View;Landroid/view/View;)Landroid/view/ViewGroup;

    move-result-object v4

    invoke-direct {p0, v6}, Landroid/support/v7/a/e;->c(Landroid/view/ViewGroup;)V

    invoke-direct {p0, v4}, Landroid/support/v7/a/e;->d(Landroid/view/ViewGroup;)V

    invoke-direct {p0, v2}, Landroid/support/v7/a/e;->b(Landroid/view/ViewGroup;)V

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getVisibility()I

    move-result v0

    if-eq v0, v9, :cond_4

    move v0, v3

    :goto_0
    if-eqz v2, :cond_5

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getVisibility()I

    move-result v2

    if-eq v2, v9, :cond_5

    move v2, v3

    :goto_1
    if-eqz v4, :cond_6

    invoke-virtual {v4}, Landroid/view/ViewGroup;->getVisibility()I

    move-result v4

    if-eq v4, v9, :cond_6

    move v5, v3

    :goto_2
    if-nez v5, :cond_0

    if-eqz v6, :cond_0

    sget v4, Landroid/support/v7/b/g;->textSpacerNoButtons:I

    invoke-virtual {v6, v4}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-virtual {v4, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    if-eqz v2, :cond_1

    iget-object v4, p0, Landroid/support/v7/a/e;->w:Landroid/support/v4/widget/NestedScrollView;

    if-eqz v4, :cond_1

    iget-object v4, p0, Landroid/support/v7/a/e;->w:Landroid/support/v4/widget/NestedScrollView;

    invoke-virtual {v4, v3}, Landroid/support/v4/widget/NestedScrollView;->setClipToPadding(Z)V

    :cond_1
    if-nez v0, :cond_2

    iget-object v0, p0, Landroid/support/v7/a/e;->f:Landroid/widget/ListView;

    if-eqz v0, :cond_7

    iget-object v0, p0, Landroid/support/v7/a/e;->f:Landroid/widget/ListView;

    move-object v4, v0

    :goto_3
    if-eqz v4, :cond_2

    if-eqz v2, :cond_8

    move v2, v3

    :goto_4
    if-eqz v5, :cond_9

    const/4 v0, 0x2

    :goto_5
    or-int/2addr v0, v2

    const/4 v1, 0x3

    invoke-direct {p0, v6, v4, v0, v1}, Landroid/support/v7/a/e;->a(Landroid/view/ViewGroup;Landroid/view/View;II)V

    :cond_2
    iget-object v0, p0, Landroid/support/v7/a/e;->f:Landroid/widget/ListView;

    if-eqz v0, :cond_3

    iget-object v1, p0, Landroid/support/v7/a/e;->D:Landroid/widget/ListAdapter;

    if-eqz v1, :cond_3

    iget-object v1, p0, Landroid/support/v7/a/e;->D:Landroid/widget/ListAdapter;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    iget v1, p0, Landroid/support/v7/a/e;->E:I

    const/4 v2, -0x1

    if-le v1, v2, :cond_3

    invoke-virtual {v0, v1, v3}, Landroid/widget/ListView;->setItemChecked(IZ)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setSelection(I)V

    :cond_3
    return-void

    :cond_4
    move v0, v1

    goto :goto_0

    :cond_5
    move v2, v1

    goto :goto_1

    :cond_6
    move v5, v1

    goto :goto_2

    :cond_7
    iget-object v0, p0, Landroid/support/v7/a/e;->w:Landroid/support/v4/widget/NestedScrollView;

    move-object v4, v0

    goto :goto_3

    :cond_8
    move v2, v1

    goto :goto_4

    :cond_9
    move v0, v1

    goto :goto_5
.end method

.method private c(Landroid/view/ViewGroup;)V
    .locals 5

    const/16 v3, 0x8

    const/4 v2, 0x0

    const/4 v4, -0x1

    iget-object v0, p0, Landroid/support/v7/a/e;->c:Landroid/view/Window;

    sget v1, Landroid/support/v7/b/g;->scrollView:I

    invoke-virtual {v0, v1}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v4/widget/NestedScrollView;

    iput-object v0, p0, Landroid/support/v7/a/e;->w:Landroid/support/v4/widget/NestedScrollView;

    iget-object v0, p0, Landroid/support/v7/a/e;->w:Landroid/support/v4/widget/NestedScrollView;

    invoke-virtual {v0, v2}, Landroid/support/v4/widget/NestedScrollView;->setFocusable(Z)V

    iget-object v0, p0, Landroid/support/v7/a/e;->w:Landroid/support/v4/widget/NestedScrollView;

    invoke-virtual {v0, v2}, Landroid/support/v4/widget/NestedScrollView;->setNestedScrollingEnabled(Z)V

    const v0, 0x102000b

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Landroid/support/v7/a/e;->B:Landroid/widget/TextView;

    iget-object v0, p0, Landroid/support/v7/a/e;->B:Landroid/widget/TextView;

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Landroid/support/v7/a/e;->e:Ljava/lang/CharSequence;

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroid/support/v7/a/e;->B:Landroid/widget/TextView;

    iget-object v1, p0, Landroid/support/v7/a/e;->e:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Landroid/support/v7/a/e;->B:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, p0, Landroid/support/v7/a/e;->w:Landroid/support/v4/widget/NestedScrollView;

    iget-object v1, p0, Landroid/support/v7/a/e;->B:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/support/v4/widget/NestedScrollView;->removeView(Landroid/view/View;)V

    iget-object v0, p0, Landroid/support/v7/a/e;->f:Landroid/widget/ListView;

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroid/support/v7/a/e;->w:Landroid/support/v4/widget/NestedScrollView;

    invoke-virtual {v0}, Landroid/support/v4/widget/NestedScrollView;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iget-object v1, p0, Landroid/support/v7/a/e;->w:Landroid/support/v4/widget/NestedScrollView;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeViewAt(I)V

    iget-object v2, p0, Landroid/support/v7/a/e;->f:Landroid/widget/ListView;

    new-instance v3, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v3, v4, v4}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v2, v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0

    :cond_2
    invoke-virtual {p1, v3}, Landroid/view/ViewGroup;->setVisibility(I)V

    goto :goto_0
.end method

.method static synthetic d(Landroid/support/v7/a/e;)Landroid/os/Message;
    .locals 1

    iget-object v0, p0, Landroid/support/v7/a/e;->s:Landroid/os/Message;

    return-object v0
.end method

.method private d(Landroid/view/ViewGroup;)V
    .locals 8

    const/4 v3, 0x1

    const/16 v7, 0x8

    const/4 v2, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x4

    const v0, 0x1020019

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Landroid/support/v7/a/e;->n:Landroid/widget/Button;

    iget-object v0, p0, Landroid/support/v7/a/e;->n:Landroid/widget/Button;

    iget-object v1, p0, Landroid/support/v7/a/e;->N:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Landroid/support/v7/a/e;->o:Ljava/lang/CharSequence;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroid/support/v7/a/e;->n:Landroid/widget/Button;

    invoke-virtual {v0, v7}, Landroid/widget/Button;->setVisibility(I)V

    move v1, v2

    :goto_0
    const v0, 0x102001a

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Landroid/support/v7/a/e;->q:Landroid/widget/Button;

    iget-object v0, p0, Landroid/support/v7/a/e;->q:Landroid/widget/Button;

    iget-object v6, p0, Landroid/support/v7/a/e;->N:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v6}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Landroid/support/v7/a/e;->r:Ljava/lang/CharSequence;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroid/support/v7/a/e;->q:Landroid/widget/Button;

    invoke-virtual {v0, v7}, Landroid/widget/Button;->setVisibility(I)V

    :goto_1
    const v0, 0x102001b

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Landroid/support/v7/a/e;->t:Landroid/widget/Button;

    iget-object v0, p0, Landroid/support/v7/a/e;->t:Landroid/widget/Button;

    iget-object v4, p0, Landroid/support/v7/a/e;->N:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v4}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Landroid/support/v7/a/e;->u:Ljava/lang/CharSequence;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Landroid/support/v7/a/e;->t:Landroid/widget/Button;

    invoke-virtual {v0, v7}, Landroid/widget/Button;->setVisibility(I)V

    :goto_2
    if-eqz v1, :cond_4

    :goto_3
    if-nez v3, :cond_0

    invoke-virtual {p1, v7}, Landroid/view/ViewGroup;->setVisibility(I)V

    :cond_0
    return-void

    :cond_1
    iget-object v0, p0, Landroid/support/v7/a/e;->n:Landroid/widget/Button;

    iget-object v1, p0, Landroid/support/v7/a/e;->o:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Landroid/support/v7/a/e;->n:Landroid/widget/Button;

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setVisibility(I)V

    move v1, v3

    goto :goto_0

    :cond_2
    iget-object v0, p0, Landroid/support/v7/a/e;->q:Landroid/widget/Button;

    iget-object v6, p0, Landroid/support/v7/a/e;->r:Ljava/lang/CharSequence;

    invoke-virtual {v0, v6}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Landroid/support/v7/a/e;->q:Landroid/widget/Button;

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setVisibility(I)V

    or-int/2addr v1, v4

    goto :goto_1

    :cond_3
    iget-object v0, p0, Landroid/support/v7/a/e;->t:Landroid/widget/Button;

    iget-object v4, p0, Landroid/support/v7/a/e;->u:Ljava/lang/CharSequence;

    invoke-virtual {v0, v4}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Landroid/support/v7/a/e;->t:Landroid/widget/Button;

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setVisibility(I)V

    or-int/2addr v1, v5

    goto :goto_2

    :cond_4
    move v3, v2

    goto :goto_3
.end method

.method static synthetic e(Landroid/support/v7/a/e;)Landroid/widget/Button;
    .locals 1

    iget-object v0, p0, Landroid/support/v7/a/e;->t:Landroid/widget/Button;

    return-object v0
.end method

.method static synthetic f(Landroid/support/v7/a/e;)Landroid/os/Message;
    .locals 1

    iget-object v0, p0, Landroid/support/v7/a/e;->v:Landroid/os/Message;

    return-object v0
.end method

.method static synthetic g(Landroid/support/v7/a/e;)Landroid/support/v7/a/as;
    .locals 1

    iget-object v0, p0, Landroid/support/v7/a/e;->b:Landroid/support/v7/a/as;

    return-object v0
.end method

.method static synthetic h(Landroid/support/v7/a/e;)Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Landroid/support/v7/a/e;->M:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic i(Landroid/support/v7/a/e;)Landroid/support/v4/widget/NestedScrollView;
    .locals 1

    iget-object v0, p0, Landroid/support/v7/a/e;->w:Landroid/support/v4/widget/NestedScrollView;

    return-object v0
.end method

.method static synthetic j(Landroid/support/v7/a/e;)Landroid/widget/ListView;
    .locals 1

    iget-object v0, p0, Landroid/support/v7/a/e;->f:Landroid/widget/ListView;

    return-object v0
.end method

.method static synthetic k(Landroid/support/v7/a/e;)I
    .locals 1

    iget v0, p0, Landroid/support/v7/a/e;->H:I

    return v0
.end method

.method static synthetic l(Landroid/support/v7/a/e;)I
    .locals 1

    iget v0, p0, Landroid/support/v7/a/e;->I:I

    return v0
.end method

.method static synthetic m(Landroid/support/v7/a/e;)I
    .locals 1

    iget v0, p0, Landroid/support/v7/a/e;->J:I

    return v0
.end method

.method static synthetic n(Landroid/support/v7/a/e;)I
    .locals 1

    iget v0, p0, Landroid/support/v7/a/e;->K:I

    return v0
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Landroid/support/v7/a/e;->b:Landroid/support/v7/a/as;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/v7/a/as;->a(I)Z

    invoke-direct {p0}, Landroid/support/v7/a/e;->b()I

    move-result v0

    iget-object v1, p0, Landroid/support/v7/a/e;->b:Landroid/support/v7/a/as;

    invoke-virtual {v1, v0}, Landroid/support/v7/a/as;->setContentView(I)V

    invoke-direct {p0}, Landroid/support/v7/a/e;->c()V

    return-void
.end method

.method public a(I)V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/v7/a/e;->g:Landroid/view/View;

    iput p1, p0, Landroid/support/v7/a/e;->h:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v7/a/e;->m:Z

    return-void
.end method

.method public a(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;Landroid/os/Message;)V
    .locals 2

    if-nez p4, :cond_0

    if-eqz p3, :cond_0

    iget-object v0, p0, Landroid/support/v7/a/e;->M:Landroid/os/Handler;

    invoke-virtual {v0, p1, p3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p4

    :cond_0
    packed-switch p1, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Button does not exist"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iput-object p2, p0, Landroid/support/v7/a/e;->o:Ljava/lang/CharSequence;

    iput-object p4, p0, Landroid/support/v7/a/e;->p:Landroid/os/Message;

    :goto_0
    return-void

    :pswitch_1
    iput-object p2, p0, Landroid/support/v7/a/e;->r:Ljava/lang/CharSequence;

    iput-object p4, p0, Landroid/support/v7/a/e;->s:Landroid/os/Message;

    goto :goto_0

    :pswitch_2
    iput-object p2, p0, Landroid/support/v7/a/e;->u:Ljava/lang/CharSequence;

    iput-object p4, p0, Landroid/support/v7/a/e;->v:Landroid/os/Message;

    goto :goto_0

    :pswitch_data_0
    .packed-switch -0x3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public a(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    const/4 v1, 0x0

    iput-object p1, p0, Landroid/support/v7/a/e;->y:Landroid/graphics/drawable/Drawable;

    iput v1, p0, Landroid/support/v7/a/e;->x:I

    iget-object v0, p0, Landroid/support/v7/a/e;->z:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_1

    iget-object v0, p0, Landroid/support/v7/a/e;->z:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, p0, Landroid/support/v7/a/e;->z:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Landroid/support/v7/a/e;->z:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0
.end method

.method public a(Landroid/view/View;IIII)V
    .locals 1

    iput-object p1, p0, Landroid/support/v7/a/e;->g:Landroid/view/View;

    const/4 v0, 0x0

    iput v0, p0, Landroid/support/v7/a/e;->h:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v7/a/e;->m:Z

    iput p2, p0, Landroid/support/v7/a/e;->i:I

    iput p3, p0, Landroid/support/v7/a/e;->j:I

    iput p4, p0, Landroid/support/v7/a/e;->k:I

    iput p5, p0, Landroid/support/v7/a/e;->l:I

    return-void
.end method

.method public a(Ljava/lang/CharSequence;)V
    .locals 1

    iput-object p1, p0, Landroid/support/v7/a/e;->d:Ljava/lang/CharSequence;

    iget-object v0, p0, Landroid/support/v7/a/e;->A:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/a/e;->A:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public a(ILandroid/view/KeyEvent;)Z
    .locals 1

    iget-object v0, p0, Landroid/support/v7/a/e;->w:Landroid/support/v4/widget/NestedScrollView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/a/e;->w:Landroid/support/v4/widget/NestedScrollView;

    invoke-virtual {v0, p2}, Landroid/support/v4/widget/NestedScrollView;->a(Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b(I)V
    .locals 2

    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/v7/a/e;->y:Landroid/graphics/drawable/Drawable;

    iput p1, p0, Landroid/support/v7/a/e;->x:I

    iget-object v0, p0, Landroid/support/v7/a/e;->z:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_1

    iget-object v0, p0, Landroid/support/v7/a/e;->z:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, p0, Landroid/support/v7/a/e;->z:Landroid/widget/ImageView;

    iget v1, p0, Landroid/support/v7/a/e;->x:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Landroid/support/v7/a/e;->z:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0
.end method

.method public b(Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Landroid/support/v7/a/e;->C:Landroid/view/View;

    return-void
.end method

.method public b(Ljava/lang/CharSequence;)V
    .locals 1

    iput-object p1, p0, Landroid/support/v7/a/e;->e:Ljava/lang/CharSequence;

    iget-object v0, p0, Landroid/support/v7/a/e;->B:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/a/e;->B:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public b(ILandroid/view/KeyEvent;)Z
    .locals 1

    iget-object v0, p0, Landroid/support/v7/a/e;->w:Landroid/support/v4/widget/NestedScrollView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/a/e;->w:Landroid/support/v4/widget/NestedScrollView;

    invoke-virtual {v0, p2}, Landroid/support/v4/widget/NestedScrollView;->a(Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public c(I)I
    .locals 3

    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    iget-object v1, p0, Landroid/support/v7/a/e;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, p1, v0, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget v0, v0, Landroid/util/TypedValue;->resourceId:I

    return v0
.end method

.method public c(Landroid/view/View;)V
    .locals 1

    const/4 v0, 0x0

    iput-object p1, p0, Landroid/support/v7/a/e;->g:Landroid/view/View;

    iput v0, p0, Landroid/support/v7/a/e;->h:I

    iput-boolean v0, p0, Landroid/support/v7/a/e;->m:Z

    return-void
.end method
