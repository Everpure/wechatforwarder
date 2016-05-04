.class Landroid/support/v7/a/ae;
.super Landroid/support/v7/a/x;

# interfaces
.implements Landroid/support/v4/i/al;
.implements Landroid/support/v7/view/menu/j;


# instance fields
.field private A:Z

.field private B:[Landroid/support/v7/a/aq;

.field private C:Landroid/support/v7/a/aq;

.field private D:Z

.field private E:Z

.field private F:I

.field private final G:Ljava/lang/Runnable;

.field private H:Z

.field private I:Landroid/graphics/Rect;

.field private J:Landroid/graphics/Rect;

.field private K:Landroid/support/v7/a/at;

.field m:Landroid/support/v7/view/b;

.field n:Landroid/support/v7/widget/ActionBarContextView;

.field o:Landroid/widget/PopupWindow;

.field p:Ljava/lang/Runnable;

.field q:Landroid/support/v4/i/di;

.field private r:Landroid/support/v7/widget/ce;

.field private s:Landroid/support/v7/a/am;

.field private t:Landroid/support/v7/a/ar;

.field private u:Z

.field private v:Landroid/view/ViewGroup;

.field private w:Landroid/widget/TextView;

.field private x:Landroid/view/View;

.field private y:Z

.field private z:Z


# direct methods
.method constructor <init>(Landroid/content/Context;Landroid/view/Window;Landroid/support/v7/a/v;)V
    .locals 1

    invoke-direct {p0, p1, p2, p3}, Landroid/support/v7/a/x;-><init>(Landroid/content/Context;Landroid/view/Window;Landroid/support/v7/a/v;)V

    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/v7/a/ae;->q:Landroid/support/v4/i/di;

    new-instance v0, Landroid/support/v7/a/af;

    invoke-direct {v0, p0}, Landroid/support/v7/a/af;-><init>(Landroid/support/v7/a/ae;)V

    iput-object v0, p0, Landroid/support/v7/a/ae;->G:Ljava/lang/Runnable;

    return-void
.end method

.method static synthetic a(Landroid/support/v7/a/ae;)I
    .locals 1

    iget v0, p0, Landroid/support/v7/a/ae;->F:I

    return v0
.end method

.method private a(IZ)Landroid/support/v7/a/aq;
    .locals 4

    const/4 v3, 0x0

    iget-object v0, p0, Landroid/support/v7/a/ae;->B:[Landroid/support/v7/a/aq;

    if-eqz v0, :cond_0

    array-length v1, v0

    if-gt v1, p1, :cond_2

    :cond_0
    add-int/lit8 v1, p1, 0x1

    new-array v1, v1, [Landroid/support/v7/a/aq;

    if-eqz v0, :cond_1

    array-length v2, v0

    invoke-static {v0, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_1
    iput-object v1, p0, Landroid/support/v7/a/ae;->B:[Landroid/support/v7/a/aq;

    move-object v0, v1

    :cond_2
    aget-object v1, v0, p1

    if-nez v1, :cond_3

    new-instance v1, Landroid/support/v7/a/aq;

    invoke-direct {v1, p1}, Landroid/support/v7/a/aq;-><init>(I)V

    aput-object v1, v0, p1

    move-object v0, v1

    :goto_0
    return-object v0

    :cond_3
    move-object v0, v1

    goto :goto_0
.end method

.method static synthetic a(Landroid/support/v7/a/ae;Landroid/view/Menu;)Landroid/support/v7/a/aq;
    .locals 1

    invoke-direct {p0, p1}, Landroid/support/v7/a/ae;->a(Landroid/view/Menu;)Landroid/support/v7/a/aq;

    move-result-object v0

    return-object v0
.end method

.method private a(Landroid/view/Menu;)Landroid/support/v7/a/aq;
    .locals 5

    const/4 v1, 0x0

    iget-object v3, p0, Landroid/support/v7/a/ae;->B:[Landroid/support/v7/a/aq;

    if-eqz v3, :cond_0

    array-length v0, v3

    :goto_0
    move v2, v1

    :goto_1
    if-ge v2, v0, :cond_2

    aget-object v1, v3, v2

    if-eqz v1, :cond_1

    iget-object v4, v1, Landroid/support/v7/a/aq;->j:Landroid/support/v7/view/menu/i;

    if-ne v4, p1, :cond_1

    move-object v0, v1

    :goto_2
    return-object v0

    :cond_0
    move v0, v1

    goto :goto_0

    :cond_1
    add-int/lit8 v1, v2, 0x1

    move v2, v1

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    goto :goto_2
.end method

.method private a(ILandroid/support/v7/a/aq;Landroid/view/Menu;)V
    .locals 1

    if-nez p3, :cond_1

    if-nez p2, :cond_0

    if-ltz p1, :cond_0

    iget-object v0, p0, Landroid/support/v7/a/ae;->B:[Landroid/support/v7/a/aq;

    array-length v0, v0

    if-ge p1, v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/a/ae;->B:[Landroid/support/v7/a/aq;

    aget-object p2, v0, p1

    :cond_0
    if-eqz p2, :cond_1

    iget-object p3, p2, Landroid/support/v7/a/aq;->j:Landroid/support/v7/view/menu/i;

    :cond_1
    if-eqz p2, :cond_3

    iget-boolean v0, p2, Landroid/support/v7/a/aq;->o:Z

    if-nez v0, :cond_3

    :cond_2
    :goto_0
    return-void

    :cond_3
    invoke-virtual {p0}, Landroid/support/v7/a/ae;->n()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Landroid/support/v7/a/ae;->c:Landroid/view/Window$Callback;

    invoke-interface {v0, p1, p3}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    goto :goto_0
.end method

.method static synthetic a(Landroid/support/v7/a/ae;I)V
    .locals 0

    invoke-direct {p0, p1}, Landroid/support/v7/a/ae;->f(I)V

    return-void
.end method

.method static synthetic a(Landroid/support/v7/a/ae;ILandroid/support/v7/a/aq;Landroid/view/Menu;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroid/support/v7/a/ae;->a(ILandroid/support/v7/a/aq;Landroid/view/Menu;)V

    return-void
.end method

.method static synthetic a(Landroid/support/v7/a/ae;Landroid/support/v7/a/aq;Z)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroid/support/v7/a/ae;->a(Landroid/support/v7/a/aq;Z)V

    return-void
.end method

.method static synthetic a(Landroid/support/v7/a/ae;Landroid/support/v7/view/menu/i;)V
    .locals 0

    invoke-direct {p0, p1}, Landroid/support/v7/a/ae;->b(Landroid/support/v7/view/menu/i;)V

    return-void
.end method

.method private a(Landroid/support/v7/a/aq;Landroid/view/KeyEvent;)V
    .locals 10

    const/4 v1, -0x1

    const/4 v3, 0x0

    const/4 v9, 0x1

    const/4 v2, -0x2

    iget-boolean v0, p1, Landroid/support/v7/a/aq;->o:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/support/v7/a/ae;->n()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget v0, p1, Landroid/support/v7/a/aq;->a:I

    if-nez v0, :cond_2

    iget-object v4, p0, Landroid/support/v7/a/ae;->a:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit8 v0, v0, 0xf

    const/4 v5, 0x4

    if-ne v0, v5, :cond_3

    move v0, v9

    :goto_1
    invoke-virtual {v4}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v4

    iget v4, v4, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    const/16 v5, 0xb

    if-lt v4, v5, :cond_4

    move v4, v9

    :goto_2
    if-eqz v0, :cond_2

    if-nez v4, :cond_0

    :cond_2
    invoke-virtual {p0}, Landroid/support/v7/a/ae;->o()Landroid/view/Window$Callback;

    move-result-object v0

    if-eqz v0, :cond_5

    iget v4, p1, Landroid/support/v7/a/aq;->a:I

    iget-object v5, p1, Landroid/support/v7/a/aq;->j:Landroid/support/v7/view/menu/i;

    invoke-interface {v0, v4, v5}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    move-result v0

    if-nez v0, :cond_5

    invoke-direct {p0, p1, v9}, Landroid/support/v7/a/ae;->a(Landroid/support/v7/a/aq;Z)V

    goto :goto_0

    :cond_3
    move v0, v3

    goto :goto_1

    :cond_4
    move v4, v3

    goto :goto_2

    :cond_5
    iget-object v0, p0, Landroid/support/v7/a/ae;->a:Landroid/content/Context;

    const-string v4, "window"

    invoke-virtual {v0, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/view/WindowManager;

    if-eqz v8, :cond_0

    invoke-direct {p0, p1, p2}, Landroid/support/v7/a/ae;->b(Landroid/support/v7/a/aq;Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p1, Landroid/support/v7/a/aq;->g:Landroid/view/ViewGroup;

    if-eqz v0, :cond_6

    iget-boolean v0, p1, Landroid/support/v7/a/aq;->q:Z

    if-eqz v0, :cond_c

    :cond_6
    iget-object v0, p1, Landroid/support/v7/a/aq;->g:Landroid/view/ViewGroup;

    if-nez v0, :cond_b

    invoke-direct {p0, p1}, Landroid/support/v7/a/ae;->a(Landroid/support/v7/a/aq;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p1, Landroid/support/v7/a/aq;->g:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    :cond_7
    :goto_3
    invoke-direct {p0, p1}, Landroid/support/v7/a/ae;->c(Landroid/support/v7/a/aq;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/support/v7/a/aq;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p1, Landroid/support/v7/a/aq;->h:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    if-nez v0, :cond_e

    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v0, v2, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    move-object v1, v0

    :goto_4
    iget v0, p1, Landroid/support/v7/a/aq;->b:I

    iget-object v4, p1, Landroid/support/v7/a/aq;->g:Landroid/view/ViewGroup;

    invoke-virtual {v4, v0}, Landroid/view/ViewGroup;->setBackgroundResource(I)V

    iget-object v0, p1, Landroid/support/v7/a/aq;->h:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_8

    instance-of v4, v0, Landroid/view/ViewGroup;

    if-eqz v4, :cond_8

    check-cast v0, Landroid/view/ViewGroup;

    iget-object v4, p1, Landroid/support/v7/a/aq;->h:Landroid/view/View;

    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_8
    iget-object v0, p1, Landroid/support/v7/a/aq;->g:Landroid/view/ViewGroup;

    iget-object v4, p1, Landroid/support/v7/a/aq;->h:Landroid/view/View;

    invoke-virtual {v0, v4, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p1, Landroid/support/v7/a/aq;->h:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->hasFocus()Z

    move-result v0

    if-nez v0, :cond_9

    iget-object v0, p1, Landroid/support/v7/a/aq;->h:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    :cond_9
    move v1, v2

    :cond_a
    :goto_5
    iput-boolean v3, p1, Landroid/support/v7/a/aq;->n:Z

    new-instance v0, Landroid/view/WindowManager$LayoutParams;

    iget v3, p1, Landroid/support/v7/a/aq;->d:I

    iget v4, p1, Landroid/support/v7/a/aq;->e:I

    const/16 v5, 0x3ea

    const/high16 v6, 0x820000

    const/4 v7, -0x3

    invoke-direct/range {v0 .. v7}, Landroid/view/WindowManager$LayoutParams;-><init>(IIIIIII)V

    iget v1, p1, Landroid/support/v7/a/aq;->c:I

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->gravity:I

    iget v1, p1, Landroid/support/v7/a/aq;->f:I

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->windowAnimations:I

    iget-object v1, p1, Landroid/support/v7/a/aq;->g:Landroid/view/ViewGroup;

    invoke-interface {v8, v1, v0}, Landroid/view/WindowManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iput-boolean v9, p1, Landroid/support/v7/a/aq;->o:Z

    goto/16 :goto_0

    :cond_b
    iget-boolean v0, p1, Landroid/support/v7/a/aq;->q:Z

    if-eqz v0, :cond_7

    iget-object v0, p1, Landroid/support/v7/a/aq;->g:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-lez v0, :cond_7

    iget-object v0, p1, Landroid/support/v7/a/aq;->g:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    goto :goto_3

    :cond_c
    iget-object v0, p1, Landroid/support/v7/a/aq;->i:Landroid/view/View;

    if-eqz v0, :cond_d

    iget-object v0, p1, Landroid/support/v7/a/aq;->i:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    if-eqz v0, :cond_d

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    if-eq v0, v1, :cond_a

    :cond_d
    move v1, v2

    goto :goto_5

    :cond_e
    move-object v1, v0

    goto :goto_4
.end method

.method private a(Landroid/support/v7/a/aq;Z)V
    .locals 4

    const/4 v3, 0x0

    const/4 v2, 0x0

    if-eqz p2, :cond_1

    iget v0, p1, Landroid/support/v7/a/aq;->a:I

    if-nez v0, :cond_1

    iget-object v0, p0, Landroid/support/v7/a/ae;->r:Landroid/support/v7/widget/ce;

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroid/support/v7/a/ae;->r:Landroid/support/v7/widget/ce;

    invoke-interface {v0}, Landroid/support/v7/widget/ce;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p1, Landroid/support/v7/a/aq;->j:Landroid/support/v7/view/menu/i;

    invoke-direct {p0, v0}, Landroid/support/v7/a/ae;->b(Landroid/support/v7/view/menu/i;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Landroid/support/v7/a/ae;->a:Landroid/content/Context;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    if-eqz v0, :cond_2

    iget-boolean v1, p1, Landroid/support/v7/a/aq;->o:Z

    if-eqz v1, :cond_2

    iget-object v1, p1, Landroid/support/v7/a/aq;->g:Landroid/view/ViewGroup;

    if-eqz v1, :cond_2

    iget-object v1, p1, Landroid/support/v7/a/aq;->g:Landroid/view/ViewGroup;

    invoke-interface {v0, v1}, Landroid/view/WindowManager;->removeView(Landroid/view/View;)V

    if-eqz p2, :cond_2

    iget v0, p1, Landroid/support/v7/a/aq;->a:I

    invoke-direct {p0, v0, p1, v3}, Landroid/support/v7/a/ae;->a(ILandroid/support/v7/a/aq;Landroid/view/Menu;)V

    :cond_2
    iput-boolean v2, p1, Landroid/support/v7/a/aq;->m:Z

    iput-boolean v2, p1, Landroid/support/v7/a/aq;->n:Z

    iput-boolean v2, p1, Landroid/support/v7/a/aq;->o:Z

    iput-object v3, p1, Landroid/support/v7/a/aq;->h:Landroid/view/View;

    const/4 v0, 0x1

    iput-boolean v0, p1, Landroid/support/v7/a/aq;->q:Z

    iget-object v0, p0, Landroid/support/v7/a/ae;->C:Landroid/support/v7/a/aq;

    if-ne v0, p1, :cond_0

    iput-object v3, p0, Landroid/support/v7/a/ae;->C:Landroid/support/v7/a/aq;

    goto :goto_0
.end method

.method private a(Landroid/support/v7/view/menu/i;Z)V
    .locals 6

    const/16 v5, 0x6c

    const/4 v3, 0x1

    const/4 v4, 0x0

    iget-object v0, p0, Landroid/support/v7/a/ae;->r:Landroid/support/v7/widget/ce;

    if-eqz v0, :cond_5

    iget-object v0, p0, Landroid/support/v7/a/ae;->r:Landroid/support/v7/widget/ce;

    invoke-interface {v0}, Landroid/support/v7/widget/ce;->d()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Landroid/support/v7/a/ae;->a:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v4/i/ct;->b(Landroid/view/ViewConfiguration;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/a/ae;->r:Landroid/support/v7/widget/ce;

    invoke-interface {v0}, Landroid/support/v7/widget/ce;->f()Z

    move-result v0

    if-eqz v0, :cond_5

    :cond_0
    invoke-virtual {p0}, Landroid/support/v7/a/ae;->o()Landroid/view/Window$Callback;

    move-result-object v0

    iget-object v1, p0, Landroid/support/v7/a/ae;->r:Landroid/support/v7/widget/ce;

    invoke-interface {v1}, Landroid/support/v7/widget/ce;->e()Z

    move-result v1

    if-eqz v1, :cond_1

    if-nez p2, :cond_4

    :cond_1
    if-eqz v0, :cond_3

    invoke-virtual {p0}, Landroid/support/v7/a/ae;->n()Z

    move-result v1

    if-nez v1, :cond_3

    iget-boolean v1, p0, Landroid/support/v7/a/ae;->E:Z

    if-eqz v1, :cond_2

    iget v1, p0, Landroid/support/v7/a/ae;->F:I

    and-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_2

    iget-object v1, p0, Landroid/support/v7/a/ae;->b:Landroid/view/Window;

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    iget-object v2, p0, Landroid/support/v7/a/ae;->G:Ljava/lang/Runnable;

    invoke-virtual {v1, v2}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v1, p0, Landroid/support/v7/a/ae;->G:Ljava/lang/Runnable;

    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    :cond_2
    invoke-direct {p0, v4, v3}, Landroid/support/v7/a/ae;->a(IZ)Landroid/support/v7/a/aq;

    move-result-object v1

    iget-object v2, v1, Landroid/support/v7/a/aq;->j:Landroid/support/v7/view/menu/i;

    if-eqz v2, :cond_3

    iget-boolean v2, v1, Landroid/support/v7/a/aq;->r:Z

    if-nez v2, :cond_3

    iget-object v2, v1, Landroid/support/v7/a/aq;->i:Landroid/view/View;

    iget-object v3, v1, Landroid/support/v7/a/aq;->j:Landroid/support/v7/view/menu/i;

    invoke-interface {v0, v4, v2, v3}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v1, v1, Landroid/support/v7/a/aq;->j:Landroid/support/v7/view/menu/i;

    invoke-interface {v0, v5, v1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    iget-object v0, p0, Landroid/support/v7/a/ae;->r:Landroid/support/v7/widget/ce;

    invoke-interface {v0}, Landroid/support/v7/widget/ce;->g()Z

    :cond_3
    :goto_0
    return-void

    :cond_4
    iget-object v1, p0, Landroid/support/v7/a/ae;->r:Landroid/support/v7/widget/ce;

    invoke-interface {v1}, Landroid/support/v7/widget/ce;->h()Z

    invoke-virtual {p0}, Landroid/support/v7/a/ae;->n()Z

    move-result v1

    if-nez v1, :cond_3

    invoke-direct {p0, v4, v3}, Landroid/support/v7/a/ae;->a(IZ)Landroid/support/v7/a/aq;

    move-result-object v1

    iget-object v1, v1, Landroid/support/v7/a/aq;->j:Landroid/support/v7/view/menu/i;

    invoke-interface {v0, v5, v1}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    goto :goto_0

    :cond_5
    invoke-direct {p0, v4, v3}, Landroid/support/v7/a/ae;->a(IZ)Landroid/support/v7/a/aq;

    move-result-object v0

    iput-boolean v3, v0, Landroid/support/v7/a/aq;->q:Z

    invoke-direct {p0, v0, v4}, Landroid/support/v7/a/ae;->a(Landroid/support/v7/a/aq;Z)V

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Landroid/support/v7/a/ae;->a(Landroid/support/v7/a/aq;Landroid/view/KeyEvent;)V

    goto :goto_0
.end method

.method static synthetic a(Landroid/support/v7/a/ae;Z)Z
    .locals 0

    iput-boolean p1, p0, Landroid/support/v7/a/ae;->E:Z

    return p1
.end method

.method private a(Landroid/support/v7/a/aq;)Z
    .locals 2

    invoke-virtual {p0}, Landroid/support/v7/a/ae;->l()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/support/v7/a/aq;->a(Landroid/content/Context;)V

    new-instance v0, Landroid/support/v7/a/ap;

    iget-object v1, p1, Landroid/support/v7/a/aq;->l:Landroid/content/Context;

    invoke-direct {v0, p0, v1}, Landroid/support/v7/a/ap;-><init>(Landroid/support/v7/a/ae;Landroid/content/Context;)V

    iput-object v0, p1, Landroid/support/v7/a/aq;->g:Landroid/view/ViewGroup;

    const/16 v0, 0x51

    iput v0, p1, Landroid/support/v7/a/aq;->c:I

    const/4 v0, 0x1

    return v0
.end method

.method private a(Landroid/support/v7/a/aq;ILandroid/view/KeyEvent;I)Z
    .locals 2

    const/4 v0, 0x0

    invoke-virtual {p3}, Landroid/view/KeyEvent;->isSystem()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    iget-boolean v1, p1, Landroid/support/v7/a/aq;->m:Z

    if-nez v1, :cond_2

    invoke-direct {p0, p1, p3}, Landroid/support/v7/a/ae;->b(Landroid/support/v7/a/aq;Landroid/view/KeyEvent;)Z

    move-result v1

    if-eqz v1, :cond_3

    :cond_2
    iget-object v1, p1, Landroid/support/v7/a/aq;->j:Landroid/support/v7/view/menu/i;

    if-eqz v1, :cond_3

    iget-object v0, p1, Landroid/support/v7/a/aq;->j:Landroid/support/v7/view/menu/i;

    invoke-virtual {v0, p2, p3, p4}, Landroid/support/v7/view/menu/i;->performShortcut(ILandroid/view/KeyEvent;I)Z

    move-result v0

    :cond_3
    if-eqz v0, :cond_0

    and-int/lit8 v1, p4, 0x1

    if-nez v1, :cond_0

    iget-object v1, p0, Landroid/support/v7/a/ae;->r:Landroid/support/v7/widget/ce;

    if-nez v1, :cond_0

    const/4 v1, 0x1

    invoke-direct {p0, p1, v1}, Landroid/support/v7/a/ae;->a(Landroid/support/v7/a/aq;Z)V

    goto :goto_0
.end method

.method private a(Landroid/view/ViewParent;)Z
    .locals 4

    const/4 v2, 0x0

    if-nez p1, :cond_0

    move v0, v2

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Landroid/support/v7/a/ae;->b:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v3

    move-object v1, p1

    :goto_1
    if-nez v1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    if-eq v1, v3, :cond_2

    instance-of v0, v1, Landroid/view/View;

    if-eqz v0, :cond_2

    move-object v0, v1

    check-cast v0, Landroid/view/View;

    invoke-static {v0}, Landroid/support/v4/i/bu;->C(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    move v0, v2

    goto :goto_0

    :cond_3
    invoke-interface {v1}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    goto :goto_1
.end method

.method static synthetic b(Landroid/support/v7/a/ae;I)I
    .locals 0

    iput p1, p0, Landroid/support/v7/a/ae;->F:I

    return p1
.end method

.method static synthetic b(Landroid/support/v7/a/ae;)V
    .locals 0

    invoke-direct {p0}, Landroid/support/v7/a/ae;->w()V

    return-void
.end method

.method private b(Landroid/support/v7/view/menu/i;)V
    .locals 2

    iget-boolean v0, p0, Landroid/support/v7/a/ae;->A:Z

    if-eqz v0, :cond_0

    :goto_0
    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v7/a/ae;->A:Z

    iget-object v0, p0, Landroid/support/v7/a/ae;->r:Landroid/support/v7/widget/ce;

    invoke-interface {v0}, Landroid/support/v7/widget/ce;->j()V

    invoke-virtual {p0}, Landroid/support/v7/a/ae;->o()Landroid/view/Window$Callback;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroid/support/v7/a/ae;->n()Z

    move-result v1

    if-nez v1, :cond_1

    const/16 v1, 0x6c

    invoke-interface {v0, v1, p1}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v7/a/ae;->A:Z

    goto :goto_0
.end method

.method private b(Landroid/support/v7/a/aq;)Z
    .locals 6

    const/4 v5, 0x1

    iget-object v1, p0, Landroid/support/v7/a/ae;->a:Landroid/content/Context;

    iget v0, p1, Landroid/support/v7/a/aq;->a:I

    if-eqz v0, :cond_0

    iget v0, p1, Landroid/support/v7/a/aq;->a:I

    const/16 v2, 0x6c

    if-ne v0, v2, :cond_4

    :cond_0
    iget-object v0, p0, Landroid/support/v7/a/ae;->r:Landroid/support/v7/widget/ce;

    if-eqz v0, :cond_4

    new-instance v2, Landroid/util/TypedValue;

    invoke-direct {v2}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v3

    sget v0, Landroid/support/v7/b/b;->actionBarTheme:I

    invoke-virtual {v3, v0, v2, v5}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    const/4 v0, 0x0

    iget v4, v2, Landroid/util/TypedValue;->resourceId:I

    if-eqz v4, :cond_3

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    iget v4, v2, Landroid/util/TypedValue;->resourceId:I

    invoke-virtual {v0, v4, v5}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    sget v4, Landroid/support/v7/b/b;->actionBarWidgetTheme:I

    invoke-virtual {v0, v4, v2, v5}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    :goto_0
    iget v4, v2, Landroid/util/TypedValue;->resourceId:I

    if-eqz v4, :cond_2

    if-nez v0, :cond_1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    :cond_1
    iget v2, v2, Landroid/util/TypedValue;->resourceId:I

    invoke-virtual {v0, v2, v5}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    :cond_2
    move-object v2, v0

    if-eqz v2, :cond_4

    new-instance v0, Landroid/support/v7/view/e;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3}, Landroid/support/v7/view/e;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    :goto_1
    new-instance v1, Landroid/support/v7/view/menu/i;

    invoke-direct {v1, v0}, Landroid/support/v7/view/menu/i;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, p0}, Landroid/support/v7/view/menu/i;->a(Landroid/support/v7/view/menu/j;)V

    invoke-virtual {p1, v1}, Landroid/support/v7/a/aq;->a(Landroid/support/v7/view/menu/i;)V

    return v5

    :cond_3
    sget v4, Landroid/support/v7/b/b;->actionBarWidgetTheme:I

    invoke-virtual {v3, v4, v2, v5}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    goto :goto_0

    :cond_4
    move-object v0, v1

    goto :goto_1
.end method

.method private b(Landroid/support/v7/a/aq;Landroid/view/KeyEvent;)Z
    .locals 8

    const/4 v7, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {p0}, Landroid/support/v7/a/ae;->n()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    return v2

    :cond_1
    iget-boolean v0, p1, Landroid/support/v7/a/aq;->m:Z

    if-eqz v0, :cond_2

    move v2, v1

    goto :goto_0

    :cond_2
    iget-object v0, p0, Landroid/support/v7/a/ae;->C:Landroid/support/v7/a/aq;

    if-eqz v0, :cond_3

    iget-object v0, p0, Landroid/support/v7/a/ae;->C:Landroid/support/v7/a/aq;

    if-eq v0, p1, :cond_3

    iget-object v0, p0, Landroid/support/v7/a/ae;->C:Landroid/support/v7/a/aq;

    invoke-direct {p0, v0, v2}, Landroid/support/v7/a/ae;->a(Landroid/support/v7/a/aq;Z)V

    :cond_3
    invoke-virtual {p0}, Landroid/support/v7/a/ae;->o()Landroid/view/Window$Callback;

    move-result-object v3

    if-eqz v3, :cond_4

    iget v0, p1, Landroid/support/v7/a/aq;->a:I

    invoke-interface {v3, v0}, Landroid/view/Window$Callback;->onCreatePanelView(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p1, Landroid/support/v7/a/aq;->i:Landroid/view/View;

    :cond_4
    iget v0, p1, Landroid/support/v7/a/aq;->a:I

    if-eqz v0, :cond_5

    iget v0, p1, Landroid/support/v7/a/aq;->a:I

    const/16 v4, 0x6c

    if-ne v0, v4, :cond_c

    :cond_5
    move v0, v1

    :goto_1
    if-eqz v0, :cond_6

    iget-object v4, p0, Landroid/support/v7/a/ae;->r:Landroid/support/v7/widget/ce;

    if-eqz v4, :cond_6

    iget-object v4, p0, Landroid/support/v7/a/ae;->r:Landroid/support/v7/widget/ce;

    invoke-interface {v4}, Landroid/support/v7/widget/ce;->i()V

    :cond_6
    iget-object v4, p1, Landroid/support/v7/a/aq;->i:Landroid/view/View;

    if-nez v4, :cond_12

    if-eqz v0, :cond_7

    invoke-virtual {p0}, Landroid/support/v7/a/ae;->k()Landroid/support/v7/a/a;

    move-result-object v4

    instance-of v4, v4, Landroid/support/v7/a/av;

    if-nez v4, :cond_12

    :cond_7
    iget-object v4, p1, Landroid/support/v7/a/aq;->j:Landroid/support/v7/view/menu/i;

    if-eqz v4, :cond_8

    iget-boolean v4, p1, Landroid/support/v7/a/aq;->r:Z

    if-eqz v4, :cond_e

    :cond_8
    iget-object v4, p1, Landroid/support/v7/a/aq;->j:Landroid/support/v7/view/menu/i;

    if-nez v4, :cond_9

    invoke-direct {p0, p1}, Landroid/support/v7/a/ae;->b(Landroid/support/v7/a/aq;)Z

    move-result v4

    if-eqz v4, :cond_0

    iget-object v4, p1, Landroid/support/v7/a/aq;->j:Landroid/support/v7/view/menu/i;

    if-eqz v4, :cond_0

    :cond_9
    if-eqz v0, :cond_b

    iget-object v4, p0, Landroid/support/v7/a/ae;->r:Landroid/support/v7/widget/ce;

    if-eqz v4, :cond_b

    iget-object v4, p0, Landroid/support/v7/a/ae;->s:Landroid/support/v7/a/am;

    if-nez v4, :cond_a

    new-instance v4, Landroid/support/v7/a/am;

    invoke-direct {v4, p0, v7}, Landroid/support/v7/a/am;-><init>(Landroid/support/v7/a/ae;Landroid/support/v7/a/af;)V

    iput-object v4, p0, Landroid/support/v7/a/ae;->s:Landroid/support/v7/a/am;

    :cond_a
    iget-object v4, p0, Landroid/support/v7/a/ae;->r:Landroid/support/v7/widget/ce;

    iget-object v5, p1, Landroid/support/v7/a/aq;->j:Landroid/support/v7/view/menu/i;

    iget-object v6, p0, Landroid/support/v7/a/ae;->s:Landroid/support/v7/a/am;

    invoke-interface {v4, v5, v6}, Landroid/support/v7/widget/ce;->a(Landroid/view/Menu;Landroid/support/v7/view/menu/y;)V

    :cond_b
    iget-object v4, p1, Landroid/support/v7/a/aq;->j:Landroid/support/v7/view/menu/i;

    invoke-virtual {v4}, Landroid/support/v7/view/menu/i;->g()V

    iget v4, p1, Landroid/support/v7/a/aq;->a:I

    iget-object v5, p1, Landroid/support/v7/a/aq;->j:Landroid/support/v7/view/menu/i;

    invoke-interface {v3, v4, v5}, Landroid/view/Window$Callback;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    move-result v4

    if-nez v4, :cond_d

    invoke-virtual {p1, v7}, Landroid/support/v7/a/aq;->a(Landroid/support/v7/view/menu/i;)V

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/a/ae;->r:Landroid/support/v7/widget/ce;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/a/ae;->r:Landroid/support/v7/widget/ce;

    iget-object v1, p0, Landroid/support/v7/a/ae;->s:Landroid/support/v7/a/am;

    invoke-interface {v0, v7, v1}, Landroid/support/v7/widget/ce;->a(Landroid/view/Menu;Landroid/support/v7/view/menu/y;)V

    goto/16 :goto_0

    :cond_c
    move v0, v2

    goto :goto_1

    :cond_d
    iput-boolean v2, p1, Landroid/support/v7/a/aq;->r:Z

    :cond_e
    iget-object v4, p1, Landroid/support/v7/a/aq;->j:Landroid/support/v7/view/menu/i;

    invoke-virtual {v4}, Landroid/support/v7/view/menu/i;->g()V

    iget-object v4, p1, Landroid/support/v7/a/aq;->s:Landroid/os/Bundle;

    if-eqz v4, :cond_f

    iget-object v4, p1, Landroid/support/v7/a/aq;->j:Landroid/support/v7/view/menu/i;

    iget-object v5, p1, Landroid/support/v7/a/aq;->s:Landroid/os/Bundle;

    invoke-virtual {v4, v5}, Landroid/support/v7/view/menu/i;->b(Landroid/os/Bundle;)V

    iput-object v7, p1, Landroid/support/v7/a/aq;->s:Landroid/os/Bundle;

    :cond_f
    iget-object v4, p1, Landroid/support/v7/a/aq;->i:Landroid/view/View;

    iget-object v5, p1, Landroid/support/v7/a/aq;->j:Landroid/support/v7/view/menu/i;

    invoke-interface {v3, v2, v4, v5}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result v3

    if-nez v3, :cond_11

    if-eqz v0, :cond_10

    iget-object v0, p0, Landroid/support/v7/a/ae;->r:Landroid/support/v7/widget/ce;

    if-eqz v0, :cond_10

    iget-object v0, p0, Landroid/support/v7/a/ae;->r:Landroid/support/v7/widget/ce;

    iget-object v1, p0, Landroid/support/v7/a/ae;->s:Landroid/support/v7/a/am;

    invoke-interface {v0, v7, v1}, Landroid/support/v7/widget/ce;->a(Landroid/view/Menu;Landroid/support/v7/view/menu/y;)V

    :cond_10
    iget-object v0, p1, Landroid/support/v7/a/aq;->j:Landroid/support/v7/view/menu/i;

    invoke-virtual {v0}, Landroid/support/v7/view/menu/i;->h()V

    goto/16 :goto_0

    :cond_11
    if-eqz p2, :cond_13

    invoke-virtual {p2}, Landroid/view/KeyEvent;->getDeviceId()I

    move-result v0

    :goto_2
    invoke-static {v0}, Landroid/view/KeyCharacterMap;->load(I)Landroid/view/KeyCharacterMap;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/KeyCharacterMap;->getKeyboardType()I

    move-result v0

    if-eq v0, v1, :cond_14

    move v0, v1

    :goto_3
    iput-boolean v0, p1, Landroid/support/v7/a/aq;->p:Z

    iget-object v0, p1, Landroid/support/v7/a/aq;->j:Landroid/support/v7/view/menu/i;

    iget-boolean v3, p1, Landroid/support/v7/a/aq;->p:Z

    invoke-virtual {v0, v3}, Landroid/support/v7/view/menu/i;->setQwertyMode(Z)V

    iget-object v0, p1, Landroid/support/v7/a/aq;->j:Landroid/support/v7/view/menu/i;

    invoke-virtual {v0}, Landroid/support/v7/view/menu/i;->h()V

    :cond_12
    iput-boolean v1, p1, Landroid/support/v7/a/aq;->m:Z

    iput-boolean v2, p1, Landroid/support/v7/a/aq;->n:Z

    iput-object p1, p0, Landroid/support/v7/a/ae;->C:Landroid/support/v7/a/aq;

    move v2, v1

    goto/16 :goto_0

    :cond_13
    const/4 v0, -0x1

    goto :goto_2

    :cond_14
    move v0, v2

    goto :goto_3
.end method

.method static synthetic c(Landroid/support/v7/a/ae;I)I
    .locals 1

    invoke-direct {p0, p1}, Landroid/support/v7/a/ae;->g(I)I

    move-result v0

    return v0
.end method

.method static synthetic c(Landroid/support/v7/a/ae;)V
    .locals 0

    invoke-direct {p0}, Landroid/support/v7/a/ae;->u()V

    return-void
.end method

.method private c(Landroid/support/v7/a/aq;)Z
    .locals 4

    const/4 v1, 0x1

    const/4 v2, 0x0

    iget-object v0, p1, Landroid/support/v7/a/aq;->i:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-object v0, p1, Landroid/support/v7/a/aq;->i:Landroid/view/View;

    iput-object v0, p1, Landroid/support/v7/a/aq;->h:Landroid/view/View;

    :goto_0
    return v1

    :cond_0
    iget-object v0, p1, Landroid/support/v7/a/aq;->j:Landroid/support/v7/view/menu/i;

    if-nez v0, :cond_1

    move v1, v2

    goto :goto_0

    :cond_1
    iget-object v0, p0, Landroid/support/v7/a/ae;->t:Landroid/support/v7/a/ar;

    if-nez v0, :cond_2

    new-instance v0, Landroid/support/v7/a/ar;

    const/4 v3, 0x0

    invoke-direct {v0, p0, v3}, Landroid/support/v7/a/ar;-><init>(Landroid/support/v7/a/ae;Landroid/support/v7/a/af;)V

    iput-object v0, p0, Landroid/support/v7/a/ae;->t:Landroid/support/v7/a/ar;

    :cond_2
    iget-object v0, p0, Landroid/support/v7/a/ae;->t:Landroid/support/v7/a/ar;

    invoke-virtual {p1, v0}, Landroid/support/v7/a/aq;->a(Landroid/support/v7/view/menu/y;)Landroid/support/v7/view/menu/z;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    iput-object v0, p1, Landroid/support/v7/a/aq;->h:Landroid/view/View;

    iget-object v0, p1, Landroid/support/v7/a/aq;->h:Landroid/view/View;

    if-eqz v0, :cond_3

    move v0, v1

    :goto_1
    move v1, v0

    goto :goto_0

    :cond_3
    move v0, v2

    goto :goto_1
.end method

.method private d(I)V
    .locals 2

    const/4 v1, 0x1

    invoke-direct {p0, p1, v1}, Landroid/support/v7/a/ae;->a(IZ)Landroid/support/v7/a/aq;

    move-result-object v0

    invoke-direct {p0, v0, v1}, Landroid/support/v7/a/ae;->a(Landroid/support/v7/a/aq;Z)V

    return-void
.end method

.method static synthetic d(Landroid/support/v7/a/ae;I)V
    .locals 0

    invoke-direct {p0, p1}, Landroid/support/v7/a/ae;->d(I)V

    return-void
.end method

.method private d(ILandroid/view/KeyEvent;)Z
    .locals 2

    invoke-virtual {p2}, Landroid/view/KeyEvent;->getRepeatCount()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Landroid/support/v7/a/ae;->a(IZ)Landroid/support/v7/a/aq;

    move-result-object v0

    iget-boolean v1, v0, Landroid/support/v7/a/aq;->o:Z

    if-nez v1, :cond_0

    invoke-direct {p0, v0, p2}, Landroid/support/v7/a/ae;->b(Landroid/support/v7/a/aq;Landroid/view/KeyEvent;)Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private e(I)V
    .locals 3

    const/4 v2, 0x1

    iget v0, p0, Landroid/support/v7/a/ae;->F:I

    shl-int v1, v2, p1

    or-int/2addr v0, v1

    iput v0, p0, Landroid/support/v7/a/ae;->F:I

    iget-boolean v0, p0, Landroid/support/v7/a/ae;->E:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/a/ae;->b:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Landroid/support/v7/a/ae;->G:Ljava/lang/Runnable;

    invoke-static {v0, v1}, Landroid/support/v4/i/bu;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    iput-boolean v2, p0, Landroid/support/v7/a/ae;->E:Z

    :cond_0
    return-void
.end method

.method private e(ILandroid/view/KeyEvent;)Z
    .locals 4

    const/4 v2, 0x1

    const/4 v1, 0x0

    iget-object v0, p0, Landroid/support/v7/a/ae;->m:Landroid/support/v7/view/b;

    if-eqz v0, :cond_0

    move v0, v1

    :goto_0
    return v0

    :cond_0
    invoke-direct {p0, p1, v2}, Landroid/support/v7/a/ae;->a(IZ)Landroid/support/v7/a/aq;

    move-result-object v3

    if-nez p1, :cond_3

    iget-object v0, p0, Landroid/support/v7/a/ae;->r:Landroid/support/v7/widget/ce;

    if-eqz v0, :cond_3

    iget-object v0, p0, Landroid/support/v7/a/ae;->r:Landroid/support/v7/widget/ce;

    invoke-interface {v0}, Landroid/support/v7/widget/ce;->d()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Landroid/support/v7/a/ae;->a:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v4/i/ct;->b(Landroid/view/ViewConfiguration;)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Landroid/support/v7/a/ae;->r:Landroid/support/v7/widget/ce;

    invoke-interface {v0}, Landroid/support/v7/widget/ce;->e()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, Landroid/support/v7/a/ae;->n()Z

    move-result v0

    if-nez v0, :cond_7

    invoke-direct {p0, v3, p2}, Landroid/support/v7/a/ae;->b(Landroid/support/v7/a/aq;Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, p0, Landroid/support/v7/a/ae;->r:Landroid/support/v7/widget/ce;

    invoke-interface {v0}, Landroid/support/v7/widget/ce;->g()Z

    move-result v2

    :goto_1
    if-eqz v2, :cond_1

    iget-object v0, p0, Landroid/support/v7/a/ae;->a:Landroid/content/Context;

    const-string v3, "audio"

    invoke-virtual {v0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/AudioManager;

    if-eqz v0, :cond_6

    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->playSoundEffect(I)V

    :cond_1
    :goto_2
    move v0, v2

    goto :goto_0

    :cond_2
    iget-object v0, p0, Landroid/support/v7/a/ae;->r:Landroid/support/v7/widget/ce;

    invoke-interface {v0}, Landroid/support/v7/widget/ce;->h()Z

    move-result v2

    goto :goto_1

    :cond_3
    iget-boolean v0, v3, Landroid/support/v7/a/aq;->o:Z

    if-nez v0, :cond_4

    iget-boolean v0, v3, Landroid/support/v7/a/aq;->n:Z

    if-eqz v0, :cond_5

    :cond_4
    iget-boolean v0, v3, Landroid/support/v7/a/aq;->o:Z

    invoke-direct {p0, v3, v2}, Landroid/support/v7/a/ae;->a(Landroid/support/v7/a/aq;Z)V

    move v2, v0

    goto :goto_1

    :cond_5
    iget-boolean v0, v3, Landroid/support/v7/a/aq;->m:Z

    if-eqz v0, :cond_7

    iget-boolean v0, v3, Landroid/support/v7/a/aq;->r:Z

    if-eqz v0, :cond_8

    iput-boolean v1, v3, Landroid/support/v7/a/aq;->m:Z

    invoke-direct {p0, v3, p2}, Landroid/support/v7/a/ae;->b(Landroid/support/v7/a/aq;Landroid/view/KeyEvent;)Z

    move-result v0

    :goto_3
    if-eqz v0, :cond_7

    invoke-direct {p0, v3, p2}, Landroid/support/v7/a/ae;->a(Landroid/support/v7/a/aq;Landroid/view/KeyEvent;)V

    goto :goto_1

    :cond_6
    const-string v0, "AppCompatDelegate"

    const-string v1, "Couldn\'t get audio manager"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    :cond_7
    move v2, v1

    goto :goto_1

    :cond_8
    move v0, v2

    goto :goto_3
.end method

.method private f(I)V
    .locals 5

    const/4 v4, 0x1

    const/4 v3, 0x0

    invoke-direct {p0, p1, v4}, Landroid/support/v7/a/ae;->a(IZ)Landroid/support/v7/a/aq;

    move-result-object v0

    iget-object v1, v0, Landroid/support/v7/a/aq;->j:Landroid/support/v7/view/menu/i;

    if-eqz v1, :cond_1

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    iget-object v2, v0, Landroid/support/v7/a/aq;->j:Landroid/support/v7/view/menu/i;

    invoke-virtual {v2, v1}, Landroid/support/v7/view/menu/i;->a(Landroid/os/Bundle;)V

    invoke-virtual {v1}, Landroid/os/Bundle;->size()I

    move-result v2

    if-lez v2, :cond_0

    iput-object v1, v0, Landroid/support/v7/a/aq;->s:Landroid/os/Bundle;

    :cond_0
    iget-object v1, v0, Landroid/support/v7/a/aq;->j:Landroid/support/v7/view/menu/i;

    invoke-virtual {v1}, Landroid/support/v7/view/menu/i;->g()V

    iget-object v1, v0, Landroid/support/v7/a/aq;->j:Landroid/support/v7/view/menu/i;

    invoke-virtual {v1}, Landroid/support/v7/view/menu/i;->clear()V

    :cond_1
    iput-boolean v4, v0, Landroid/support/v7/a/aq;->r:Z

    iput-boolean v4, v0, Landroid/support/v7/a/aq;->q:Z

    const/16 v0, 0x6c

    if-eq p1, v0, :cond_2

    if-nez p1, :cond_3

    :cond_2
    iget-object v0, p0, Landroid/support/v7/a/ae;->r:Landroid/support/v7/widget/ce;

    if-eqz v0, :cond_3

    invoke-direct {p0, v3, v3}, Landroid/support/v7/a/ae;->a(IZ)Landroid/support/v7/a/aq;

    move-result-object v0

    if-eqz v0, :cond_3

    iput-boolean v3, v0, Landroid/support/v7/a/aq;->m:Z

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Landroid/support/v7/a/ae;->b(Landroid/support/v7/a/aq;Landroid/view/KeyEvent;)Z

    :cond_3
    return-void
.end method

.method private g(I)I
    .locals 8

    const/4 v6, -0x1

    const/4 v3, 0x1

    const/4 v2, 0x0

    iget-object v0, p0, Landroid/support/v7/a/ae;->n:Landroid/support/v7/widget/ActionBarContextView;

    if-eqz v0, :cond_c

    iget-object v0, p0, Landroid/support/v7/a/ae;->n:Landroid/support/v7/widget/ActionBarContextView;

    invoke-virtual {v0}, Landroid/support/v7/widget/ActionBarContextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    instance-of v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v0, :cond_c

    iget-object v0, p0, Landroid/support/v7/a/ae;->n:Landroid/support/v7/widget/ActionBarContextView;

    invoke-virtual {v0}, Landroid/support/v7/widget/ActionBarContextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    iget-object v1, p0, Landroid/support/v7/a/ae;->n:Landroid/support/v7/widget/ActionBarContextView;

    invoke-virtual {v1}, Landroid/support/v7/widget/ActionBarContextView;->isShown()Z

    move-result v1

    if-eqz v1, :cond_8

    iget-object v1, p0, Landroid/support/v7/a/ae;->I:Landroid/graphics/Rect;

    if-nez v1, :cond_0

    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    iput-object v1, p0, Landroid/support/v7/a/ae;->I:Landroid/graphics/Rect;

    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    iput-object v1, p0, Landroid/support/v7/a/ae;->J:Landroid/graphics/Rect;

    :cond_0
    iget-object v1, p0, Landroid/support/v7/a/ae;->I:Landroid/graphics/Rect;

    iget-object v4, p0, Landroid/support/v7/a/ae;->J:Landroid/graphics/Rect;

    invoke-virtual {v1, v2, p1, v2, v2}, Landroid/graphics/Rect;->set(IIII)V

    iget-object v5, p0, Landroid/support/v7/a/ae;->v:Landroid/view/ViewGroup;

    invoke-static {v5, v1, v4}, Landroid/support/v7/widget/hh;->a(Landroid/view/View;Landroid/graphics/Rect;Landroid/graphics/Rect;)V

    iget v1, v4, Landroid/graphics/Rect;->top:I

    if-nez v1, :cond_4

    move v1, p1

    :goto_0
    iget v4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    if-eq v4, v1, :cond_b

    iput p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget-object v1, p0, Landroid/support/v7/a/ae;->x:Landroid/view/View;

    if-nez v1, :cond_5

    new-instance v1, Landroid/view/View;

    iget-object v4, p0, Landroid/support/v7/a/ae;->a:Landroid/content/Context;

    invoke-direct {v1, v4}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Landroid/support/v7/a/ae;->x:Landroid/view/View;

    iget-object v1, p0, Landroid/support/v7/a/ae;->x:Landroid/view/View;

    iget-object v4, p0, Landroid/support/v7/a/ae;->a:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Landroid/support/v7/b/d;->abc_input_method_navigation_guard:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v1, v4}, Landroid/view/View;->setBackgroundColor(I)V

    iget-object v1, p0, Landroid/support/v7/a/ae;->v:Landroid/view/ViewGroup;

    iget-object v4, p0, Landroid/support/v7/a/ae;->x:Landroid/view/View;

    new-instance v5, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v5, v6, p1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v1, v4, v6, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    move v1, v3

    :goto_1
    iget-object v4, p0, Landroid/support/v7/a/ae;->x:Landroid/view/View;

    if-eqz v4, :cond_7

    :goto_2
    iget-boolean v4, p0, Landroid/support/v7/a/ae;->j:Z

    if-nez v4, :cond_1

    if-eqz v3, :cond_1

    move p1, v2

    :cond_1
    move v7, v1

    move v1, v3

    move v3, v7

    :goto_3
    if-eqz v3, :cond_2

    iget-object v3, p0, Landroid/support/v7/a/ae;->n:Landroid/support/v7/widget/ActionBarContextView;

    invoke-virtual {v3, v0}, Landroid/support/v7/widget/ActionBarContextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_2
    move v0, v1

    :goto_4
    iget-object v1, p0, Landroid/support/v7/a/ae;->x:Landroid/view/View;

    if-eqz v1, :cond_3

    iget-object v1, p0, Landroid/support/v7/a/ae;->x:Landroid/view/View;

    if-eqz v0, :cond_9

    :goto_5
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    :cond_3
    return p1

    :cond_4
    move v1, v2

    goto :goto_0

    :cond_5
    iget-object v1, p0, Landroid/support/v7/a/ae;->x:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    iget v4, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    if-eq v4, p1, :cond_6

    iput p1, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    iget-object v4, p0, Landroid/support/v7/a/ae;->x:Landroid/view/View;

    invoke-virtual {v4, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_6
    move v1, v3

    goto :goto_1

    :cond_7
    move v3, v2

    goto :goto_2

    :cond_8
    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    if-eqz v1, :cond_a

    iput v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    move v1, v2

    goto :goto_3

    :cond_9
    const/16 v2, 0x8

    goto :goto_5

    :cond_a
    move v3, v2

    move v1, v2

    goto :goto_3

    :cond_b
    move v1, v2

    goto :goto_1

    :cond_c
    move v0, v2

    goto :goto_4
.end method

.method private h(I)I
    .locals 2

    const/16 v0, 0x8

    if-ne p1, v0, :cond_1

    const-string v0, "AppCompatDelegate"

    const-string v1, "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature."

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const/16 p1, 0x6c

    :cond_0
    :goto_0
    return p1

    :cond_1
    const/16 v0, 0x9

    if-ne p1, v0, :cond_0

    const-string v0, "AppCompatDelegate"

    const-string v1, "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature."

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const/16 p1, 0x6d

    goto :goto_0
.end method

.method private r()V
    .locals 3

    const/4 v2, 0x0

    iget-boolean v0, p0, Landroid/support/v7/a/ae;->u:Z

    if-nez v0, :cond_2

    invoke-direct {p0}, Landroid/support/v7/a/ae;->s()Landroid/view/ViewGroup;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/a/ae;->v:Landroid/view/ViewGroup;

    invoke-virtual {p0}, Landroid/support/v7/a/ae;->p()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p0, v0}, Landroid/support/v7/a/ae;->b(Ljava/lang/CharSequence;)V

    :cond_0
    invoke-direct {p0}, Landroid/support/v7/a/ae;->t()V

    iget-object v0, p0, Landroid/support/v7/a/ae;->v:Landroid/view/ViewGroup;

    invoke-virtual {p0, v0}, Landroid/support/v7/a/ae;->a(Landroid/view/ViewGroup;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v7/a/ae;->u:Z

    invoke-direct {p0, v2, v2}, Landroid/support/v7/a/ae;->a(IZ)Landroid/support/v7/a/aq;

    move-result-object v0

    invoke-virtual {p0}, Landroid/support/v7/a/ae;->n()Z

    move-result v1

    if-nez v1, :cond_2

    if-eqz v0, :cond_1

    iget-object v0, v0, Landroid/support/v7/a/aq;->j:Landroid/support/v7/view/menu/i;

    if-nez v0, :cond_2

    :cond_1
    const/16 v0, 0x6c

    invoke-direct {p0, v0}, Landroid/support/v7/a/ae;->e(I)V

    :cond_2
    return-void
.end method

.method private s()Landroid/view/ViewGroup;
    .locals 8

    const v7, 0x1020002

    const/16 v6, 0x6d

    const/4 v4, 0x1

    const/4 v3, 0x0

    const/4 v5, 0x0

    iget-object v0, p0, Landroid/support/v7/a/ae;->a:Landroid/content/Context;

    sget-object v1, Landroid/support/v7/b/l;->AppCompatTheme:[I

    invoke-virtual {v0, v1}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v0

    sget v1, Landroid/support/v7/b/l;->AppCompatTheme_windowActionBar:I

    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "You need to use a Theme.AppCompat theme (or descendant) with this activity."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    sget v1, Landroid/support/v7/b/l;->AppCompatTheme_windowNoTitle:I

    invoke-virtual {v0, v1, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {p0, v4}, Landroid/support/v7/a/ae;->c(I)Z

    :cond_1
    :goto_0
    sget v1, Landroid/support/v7/b/l;->AppCompatTheme_windowActionBarOverlay:I

    invoke-virtual {v0, v1, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0, v6}, Landroid/support/v7/a/ae;->c(I)Z

    :cond_2
    sget v1, Landroid/support/v7/b/l;->AppCompatTheme_windowActionModeOverlay:I

    invoke-virtual {v0, v1, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    if-eqz v1, :cond_3

    const/16 v1, 0xa

    invoke-virtual {p0, v1}, Landroid/support/v7/a/ae;->c(I)Z

    :cond_3
    sget v1, Landroid/support/v7/b/l;->AppCompatTheme_android_windowIsFloating:I

    invoke-virtual {v0, v1, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p0, Landroid/support/v7/a/ae;->k:Z

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    iget-object v0, p0, Landroid/support/v7/a/ae;->a:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iget-boolean v1, p0, Landroid/support/v7/a/ae;->l:Z

    if-nez v1, :cond_a

    iget-boolean v1, p0, Landroid/support/v7/a/ae;->k:Z

    if-eqz v1, :cond_5

    sget v1, Landroid/support/v7/b/i;->abc_dialog_title_material:I

    invoke-virtual {v0, v1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-boolean v5, p0, Landroid/support/v7/a/ae;->i:Z

    iput-boolean v5, p0, Landroid/support/v7/a/ae;->h:Z

    move-object v2, v0

    :goto_1
    if-nez v2, :cond_d

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AppCompat does not support the current theme features: { windowActionBar: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-boolean v2, p0, Landroid/support/v7/a/ae;->h:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", windowActionBarOverlay: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-boolean v2, p0, Landroid/support/v7/a/ae;->i:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", android:windowIsFloating: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-boolean v2, p0, Landroid/support/v7/a/ae;->k:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", windowActionModeOverlay: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-boolean v2, p0, Landroid/support/v7/a/ae;->j:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", windowNoTitle: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-boolean v2, p0, Landroid/support/v7/a/ae;->l:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " }"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    sget v1, Landroid/support/v7/b/l;->AppCompatTheme_windowActionBar:I

    invoke-virtual {v0, v1, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v1, 0x6c

    invoke-virtual {p0, v1}, Landroid/support/v7/a/ae;->c(I)Z

    goto/16 :goto_0

    :cond_5
    iget-boolean v0, p0, Landroid/support/v7/a/ae;->h:Z

    if-eqz v0, :cond_11

    new-instance v1, Landroid/util/TypedValue;

    invoke-direct {v1}, Landroid/util/TypedValue;-><init>()V

    iget-object v0, p0, Landroid/support/v7/a/ae;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    sget v2, Landroid/support/v7/b/b;->actionBarTheme:I

    invoke-virtual {v0, v2, v1, v4}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget v0, v1, Landroid/util/TypedValue;->resourceId:I

    if-eqz v0, :cond_9

    new-instance v0, Landroid/support/v7/view/e;

    iget-object v2, p0, Landroid/support/v7/a/ae;->a:Landroid/content/Context;

    iget v1, v1, Landroid/util/TypedValue;->resourceId:I

    invoke-direct {v0, v2, v1}, Landroid/support/v7/view/e;-><init>(Landroid/content/Context;I)V

    :goto_2
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Landroid/support/v7/b/i;->abc_screen_toolbar:I

    invoke-virtual {v0, v1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    sget v1, Landroid/support/v7/b/g;->decor_content_parent:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/support/v7/widget/ce;

    iput-object v1, p0, Landroid/support/v7/a/ae;->r:Landroid/support/v7/widget/ce;

    iget-object v1, p0, Landroid/support/v7/a/ae;->r:Landroid/support/v7/widget/ce;

    invoke-virtual {p0}, Landroid/support/v7/a/ae;->o()Landroid/view/Window$Callback;

    move-result-object v2

    invoke-interface {v1, v2}, Landroid/support/v7/widget/ce;->setWindowCallback(Landroid/view/Window$Callback;)V

    iget-boolean v1, p0, Landroid/support/v7/a/ae;->i:Z

    if-eqz v1, :cond_6

    iget-object v1, p0, Landroid/support/v7/a/ae;->r:Landroid/support/v7/widget/ce;

    invoke-interface {v1, v6}, Landroid/support/v7/widget/ce;->a(I)V

    :cond_6
    iget-boolean v1, p0, Landroid/support/v7/a/ae;->y:Z

    if-eqz v1, :cond_7

    iget-object v1, p0, Landroid/support/v7/a/ae;->r:Landroid/support/v7/widget/ce;

    const/4 v2, 0x2

    invoke-interface {v1, v2}, Landroid/support/v7/widget/ce;->a(I)V

    :cond_7
    iget-boolean v1, p0, Landroid/support/v7/a/ae;->z:Z

    if-eqz v1, :cond_8

    iget-object v1, p0, Landroid/support/v7/a/ae;->r:Landroid/support/v7/widget/ce;

    const/4 v2, 0x5

    invoke-interface {v1, v2}, Landroid/support/v7/widget/ce;->a(I)V

    :cond_8
    move-object v2, v0

    goto/16 :goto_1

    :cond_9
    iget-object v0, p0, Landroid/support/v7/a/ae;->a:Landroid/content/Context;

    goto :goto_2

    :cond_a
    iget-boolean v1, p0, Landroid/support/v7/a/ae;->j:Z

    if-eqz v1, :cond_b

    sget v1, Landroid/support/v7/b/i;->abc_screen_simple_overlay_action_mode:I

    invoke-virtual {v0, v1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    move-object v1, v0

    :goto_3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x15

    if-lt v0, v2, :cond_c

    new-instance v0, Landroid/support/v7/a/ag;

    invoke-direct {v0, p0}, Landroid/support/v7/a/ag;-><init>(Landroid/support/v7/a/ae;)V

    invoke-static {v1, v0}, Landroid/support/v4/i/bu;->a(Landroid/view/View;Landroid/support/v4/i/bm;)V

    move-object v2, v1

    goto/16 :goto_1

    :cond_b
    sget v1, Landroid/support/v7/b/i;->abc_screen_simple:I

    invoke-virtual {v0, v1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    move-object v1, v0

    goto :goto_3

    :cond_c
    move-object v0, v1

    check-cast v0, Landroid/support/v7/widget/ct;

    new-instance v2, Landroid/support/v7/a/ah;

    invoke-direct {v2, p0}, Landroid/support/v7/a/ah;-><init>(Landroid/support/v7/a/ae;)V

    invoke-interface {v0, v2}, Landroid/support/v7/widget/ct;->setOnFitSystemWindowsListener(Landroid/support/v7/widget/cu;)V

    move-object v2, v1

    goto/16 :goto_1

    :cond_d
    iget-object v0, p0, Landroid/support/v7/a/ae;->r:Landroid/support/v7/widget/ce;

    if-nez v0, :cond_e

    sget v0, Landroid/support/v7/b/g;->title:I

    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Landroid/support/v7/a/ae;->w:Landroid/widget/TextView;

    :cond_e
    invoke-static {v2}, Landroid/support/v7/widget/hh;->b(Landroid/view/View;)V

    iget-object v0, p0, Landroid/support/v7/a/ae;->b:Landroid/view/Window;

    invoke-virtual {v0, v7}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    sget v1, Landroid/support/v7/b/g;->action_bar_activity_content:I

    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/support/v7/widget/ContentFrameLayout;

    :goto_4
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v4

    if-lez v4, :cond_f

    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->removeViewAt(I)V

    invoke-virtual {v1, v4}, Landroid/support/v7/widget/ContentFrameLayout;->addView(Landroid/view/View;)V

    goto :goto_4

    :cond_f
    iget-object v4, p0, Landroid/support/v7/a/ae;->b:Landroid/view/Window;

    invoke-virtual {v4, v2}, Landroid/view/Window;->setContentView(Landroid/view/View;)V

    const/4 v4, -0x1

    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->setId(I)V

    invoke-virtual {v1, v7}, Landroid/support/v7/widget/ContentFrameLayout;->setId(I)V

    instance-of v4, v0, Landroid/widget/FrameLayout;

    if-eqz v4, :cond_10

    check-cast v0, Landroid/widget/FrameLayout;

    invoke-virtual {v0, v3}, Landroid/widget/FrameLayout;->setForeground(Landroid/graphics/drawable/Drawable;)V

    :cond_10
    new-instance v0, Landroid/support/v7/a/ai;

    invoke-direct {v0, p0}, Landroid/support/v7/a/ai;-><init>(Landroid/support/v7/a/ae;)V

    invoke-virtual {v1, v0}, Landroid/support/v7/widget/ContentFrameLayout;->setAttachListener(Landroid/support/v7/widget/cd;)V

    return-object v2

    :cond_11
    move-object v2, v3

    goto/16 :goto_1
.end method

.method private t()V
    .locals 5

    iget-object v0, p0, Landroid/support/v7/a/ae;->v:Landroid/view/ViewGroup;

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/ContentFrameLayout;

    iget-object v1, p0, Landroid/support/v7/a/ae;->b:Landroid/view/Window;

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getPaddingLeft()I

    move-result v2

    invoke-virtual {v1}, Landroid/view/View;->getPaddingTop()I

    move-result v3

    invoke-virtual {v1}, Landroid/view/View;->getPaddingRight()I

    move-result v4

    invoke-virtual {v1}, Landroid/view/View;->getPaddingBottom()I

    move-result v1

    invoke-virtual {v0, v2, v3, v4, v1}, Landroid/support/v7/widget/ContentFrameLayout;->a(IIII)V

    iget-object v1, p0, Landroid/support/v7/a/ae;->a:Landroid/content/Context;

    sget-object v2, Landroid/support/v7/b/l;->AppCompatTheme:[I

    invoke-virtual {v1, v2}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v1

    sget v2, Landroid/support/v7/b/l;->AppCompatTheme_windowMinWidthMajor:I

    invoke-virtual {v0}, Landroid/support/v7/widget/ContentFrameLayout;->getMinWidthMajor()Landroid/util/TypedValue;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    sget v2, Landroid/support/v7/b/l;->AppCompatTheme_windowMinWidthMinor:I

    invoke-virtual {v0}, Landroid/support/v7/widget/ContentFrameLayout;->getMinWidthMinor()Landroid/util/TypedValue;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    sget v2, Landroid/support/v7/b/l;->AppCompatTheme_windowFixedWidthMajor:I

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v2

    if-eqz v2, :cond_0

    sget v2, Landroid/support/v7/b/l;->AppCompatTheme_windowFixedWidthMajor:I

    invoke-virtual {v0}, Landroid/support/v7/widget/ContentFrameLayout;->getFixedWidthMajor()Landroid/util/TypedValue;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    :cond_0
    sget v2, Landroid/support/v7/b/l;->AppCompatTheme_windowFixedWidthMinor:I

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v2

    if-eqz v2, :cond_1

    sget v2, Landroid/support/v7/b/l;->AppCompatTheme_windowFixedWidthMinor:I

    invoke-virtual {v0}, Landroid/support/v7/widget/ContentFrameLayout;->getFixedWidthMinor()Landroid/util/TypedValue;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    :cond_1
    sget v2, Landroid/support/v7/b/l;->AppCompatTheme_windowFixedHeightMajor:I

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v2

    if-eqz v2, :cond_2

    sget v2, Landroid/support/v7/b/l;->AppCompatTheme_windowFixedHeightMajor:I

    invoke-virtual {v0}, Landroid/support/v7/widget/ContentFrameLayout;->getFixedHeightMajor()Landroid/util/TypedValue;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    :cond_2
    sget v2, Landroid/support/v7/b/l;->AppCompatTheme_windowFixedHeightMinor:I

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v2

    if-eqz v2, :cond_3

    sget v2, Landroid/support/v7/b/l;->AppCompatTheme_windowFixedHeightMinor:I

    invoke-virtual {v0}, Landroid/support/v7/widget/ContentFrameLayout;->getFixedHeightMinor()Landroid/util/TypedValue;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    :cond_3
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    invoke-virtual {v0}, Landroid/support/v7/widget/ContentFrameLayout;->requestLayout()V

    return-void
.end method

.method private u()V
    .locals 1

    iget-object v0, p0, Landroid/support/v7/a/ae;->q:Landroid/support/v4/i/di;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/a/ae;->q:Landroid/support/v4/i/di;

    invoke-virtual {v0}, Landroid/support/v4/i/di;->b()V

    :cond_0
    return-void
.end method

.method private v()V
    .locals 2

    iget-boolean v0, p0, Landroid/support/v7/a/ae;->u:Z

    if-eqz v0, :cond_0

    new-instance v0, Landroid/util/AndroidRuntimeException;

    const-string v1, "Window feature must be requested before adding content"

    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    return-void
.end method

.method private w()V
    .locals 3

    const/4 v2, 0x0

    iget-object v0, p0, Landroid/support/v7/a/ae;->r:Landroid/support/v7/widget/ce;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/a/ae;->r:Landroid/support/v7/widget/ce;

    invoke-interface {v0}, Landroid/support/v7/widget/ce;->j()V

    :cond_0
    iget-object v0, p0, Landroid/support/v7/a/ae;->o:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroid/support/v7/a/ae;->b:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Landroid/support/v7/a/ae;->p:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v0, p0, Landroid/support/v7/a/ae;->o:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_1

    :try_start_0
    iget-object v0, p0, Landroid/support/v7/a/ae;->o:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/v7/a/ae;->o:Landroid/widget/PopupWindow;

    :cond_2
    invoke-direct {p0}, Landroid/support/v7/a/ae;->u()V

    invoke-direct {p0, v2, v2}, Landroid/support/v7/a/ae;->a(IZ)Landroid/support/v7/a/aq;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v1, v0, Landroid/support/v7/a/aq;->j:Landroid/support/v7/view/menu/i;

    if-eqz v1, :cond_3

    iget-object v0, v0, Landroid/support/v7/a/aq;->j:Landroid/support/v7/view/menu/i;

    invoke-virtual {v0}, Landroid/support/v7/view/menu/i;->close()V

    :cond_3
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method


# virtual methods
.method a(Landroid/support/v7/view/c;)Landroid/support/v7/view/b;
    .locals 8

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v1, 0x1

    invoke-direct {p0}, Landroid/support/v7/a/ae;->u()V

    iget-object v0, p0, Landroid/support/v7/a/ae;->m:Landroid/support/v7/view/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/a/ae;->m:Landroid/support/v7/view/b;

    invoke-virtual {v0}, Landroid/support/v7/view/b;->c()V

    :cond_0
    new-instance v4, Landroid/support/v7/a/an;

    invoke-direct {v4, p0, p1}, Landroid/support/v7/a/an;-><init>(Landroid/support/v7/a/ae;Landroid/support/v7/view/c;)V

    iget-object v0, p0, Landroid/support/v7/a/ae;->e:Landroid/support/v7/a/v;

    if-eqz v0, :cond_9

    invoke-virtual {p0}, Landroid/support/v7/a/ae;->n()Z

    move-result v0

    if-nez v0, :cond_9

    :try_start_0
    iget-object v0, p0, Landroid/support/v7/a/ae;->e:Landroid/support/v7/a/v;

    invoke-interface {v0, v4}, Landroid/support/v7/a/v;->a(Landroid/support/v7/view/c;)Landroid/support/v7/view/b;
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_3

    iput-object v0, p0, Landroid/support/v7/a/ae;->m:Landroid/support/v7/view/b;

    :cond_1
    :goto_1
    iget-object v0, p0, Landroid/support/v7/a/ae;->m:Landroid/support/v7/view/b;

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroid/support/v7/a/ae;->e:Landroid/support/v7/a/v;

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroid/support/v7/a/ae;->e:Landroid/support/v7/a/v;

    iget-object v1, p0, Landroid/support/v7/a/ae;->m:Landroid/support/v7/view/b;

    invoke-interface {v0, v1}, Landroid/support/v7/a/v;->a(Landroid/support/v7/view/b;)V

    :cond_2
    iget-object v0, p0, Landroid/support/v7/a/ae;->m:Landroid/support/v7/view/b;

    return-object v0

    :catch_0
    move-exception v0

    move-object v0, v3

    goto :goto_0

    :cond_3
    iget-object v0, p0, Landroid/support/v7/a/ae;->n:Landroid/support/v7/widget/ActionBarContextView;

    if-nez v0, :cond_4

    iget-boolean v0, p0, Landroid/support/v7/a/ae;->k:Z

    if-eqz v0, :cond_6

    new-instance v5, Landroid/util/TypedValue;

    invoke-direct {v5}, Landroid/util/TypedValue;-><init>()V

    iget-object v0, p0, Landroid/support/v7/a/ae;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    sget v6, Landroid/support/v7/b/b;->actionBarTheme:I

    invoke-virtual {v0, v6, v5, v1}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget v6, v5, Landroid/util/TypedValue;->resourceId:I

    if-eqz v6, :cond_5

    iget-object v6, p0, Landroid/support/v7/a/ae;->a:Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    move-result-object v6

    invoke-virtual {v6, v0}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    iget v0, v5, Landroid/util/TypedValue;->resourceId:I

    invoke-virtual {v6, v0, v1}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    new-instance v0, Landroid/support/v7/view/e;

    iget-object v7, p0, Landroid/support/v7/a/ae;->a:Landroid/content/Context;

    invoke-direct {v0, v7, v2}, Landroid/support/v7/view/e;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v7

    invoke-virtual {v7, v6}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    :goto_2
    new-instance v6, Landroid/support/v7/widget/ActionBarContextView;

    invoke-direct {v6, v0}, Landroid/support/v7/widget/ActionBarContextView;-><init>(Landroid/content/Context;)V

    iput-object v6, p0, Landroid/support/v7/a/ae;->n:Landroid/support/v7/widget/ActionBarContextView;

    new-instance v6, Landroid/widget/PopupWindow;

    sget v7, Landroid/support/v7/b/b;->actionModePopupWindowStyle:I

    invoke-direct {v6, v0, v3, v7}, Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    iput-object v6, p0, Landroid/support/v7/a/ae;->o:Landroid/widget/PopupWindow;

    iget-object v6, p0, Landroid/support/v7/a/ae;->o:Landroid/widget/PopupWindow;

    const/4 v7, 0x2

    invoke-static {v6, v7}, Landroid/support/v4/widget/ah;->a(Landroid/widget/PopupWindow;I)V

    iget-object v6, p0, Landroid/support/v7/a/ae;->o:Landroid/widget/PopupWindow;

    iget-object v7, p0, Landroid/support/v7/a/ae;->n:Landroid/support/v7/widget/ActionBarContextView;

    invoke-virtual {v6, v7}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    iget-object v6, p0, Landroid/support/v7/a/ae;->o:Landroid/widget/PopupWindow;

    const/4 v7, -0x1

    invoke-virtual {v6, v7}, Landroid/widget/PopupWindow;->setWidth(I)V

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v6

    sget v7, Landroid/support/v7/b/b;->actionBarSize:I

    invoke-virtual {v6, v7, v5, v1}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget v5, v5, Landroid/util/TypedValue;->data:I

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    invoke-static {v5, v0}, Landroid/util/TypedValue;->complexToDimensionPixelSize(ILandroid/util/DisplayMetrics;)I

    move-result v0

    iget-object v5, p0, Landroid/support/v7/a/ae;->n:Landroid/support/v7/widget/ActionBarContextView;

    invoke-virtual {v5, v0}, Landroid/support/v7/widget/ActionBarContextView;->setContentHeight(I)V

    iget-object v0, p0, Landroid/support/v7/a/ae;->o:Landroid/widget/PopupWindow;

    const/4 v5, -0x2

    invoke-virtual {v0, v5}, Landroid/widget/PopupWindow;->setHeight(I)V

    new-instance v0, Landroid/support/v7/a/aj;

    invoke-direct {v0, p0}, Landroid/support/v7/a/aj;-><init>(Landroid/support/v7/a/ae;)V

    iput-object v0, p0, Landroid/support/v7/a/ae;->p:Ljava/lang/Runnable;

    :cond_4
    :goto_3
    iget-object v0, p0, Landroid/support/v7/a/ae;->n:Landroid/support/v7/widget/ActionBarContextView;

    if-eqz v0, :cond_1

    invoke-direct {p0}, Landroid/support/v7/a/ae;->u()V

    iget-object v0, p0, Landroid/support/v7/a/ae;->n:Landroid/support/v7/widget/ActionBarContextView;

    invoke-virtual {v0}, Landroid/support/v7/widget/ActionBarContextView;->c()V

    new-instance v5, Landroid/support/v7/view/f;

    iget-object v0, p0, Landroid/support/v7/a/ae;->n:Landroid/support/v7/widget/ActionBarContextView;

    invoke-virtual {v0}, Landroid/support/v7/widget/ActionBarContextView;->getContext()Landroid/content/Context;

    move-result-object v6

    iget-object v7, p0, Landroid/support/v7/a/ae;->n:Landroid/support/v7/widget/ActionBarContextView;

    iget-object v0, p0, Landroid/support/v7/a/ae;->o:Landroid/widget/PopupWindow;

    if-nez v0, :cond_7

    move v0, v1

    :goto_4
    invoke-direct {v5, v6, v7, v4, v0}, Landroid/support/v7/view/f;-><init>(Landroid/content/Context;Landroid/support/v7/widget/ActionBarContextView;Landroid/support/v7/view/c;Z)V

    invoke-virtual {v5}, Landroid/support/v7/view/b;->b()Landroid/view/Menu;

    move-result-object v0

    invoke-interface {p1, v5, v0}, Landroid/support/v7/view/c;->a(Landroid/support/v7/view/b;Landroid/view/Menu;)Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {v5}, Landroid/support/v7/view/b;->d()V

    iget-object v0, p0, Landroid/support/v7/a/ae;->n:Landroid/support/v7/widget/ActionBarContextView;

    invoke-virtual {v0, v5}, Landroid/support/v7/widget/ActionBarContextView;->a(Landroid/support/v7/view/b;)V

    iput-object v5, p0, Landroid/support/v7/a/ae;->m:Landroid/support/v7/view/b;

    iget-object v0, p0, Landroid/support/v7/a/ae;->n:Landroid/support/v7/widget/ActionBarContextView;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/support/v4/i/bu;->c(Landroid/view/View;F)V

    iget-object v0, p0, Landroid/support/v7/a/ae;->n:Landroid/support/v7/widget/ActionBarContextView;

    invoke-static {v0}, Landroid/support/v4/i/bu;->q(Landroid/view/View;)Landroid/support/v4/i/di;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/support/v4/i/di;->a(F)Landroid/support/v4/i/di;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/a/ae;->q:Landroid/support/v4/i/di;

    iget-object v0, p0, Landroid/support/v7/a/ae;->q:Landroid/support/v4/i/di;

    new-instance v1, Landroid/support/v7/a/al;

    invoke-direct {v1, p0}, Landroid/support/v7/a/al;-><init>(Landroid/support/v7/a/ae;)V

    invoke-virtual {v0, v1}, Landroid/support/v4/i/di;->a(Landroid/support/v4/i/dz;)Landroid/support/v4/i/di;

    iget-object v0, p0, Landroid/support/v7/a/ae;->o:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroid/support/v7/a/ae;->b:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Landroid/support/v7/a/ae;->p:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    goto/16 :goto_1

    :cond_5
    iget-object v0, p0, Landroid/support/v7/a/ae;->a:Landroid/content/Context;

    goto/16 :goto_2

    :cond_6
    iget-object v0, p0, Landroid/support/v7/a/ae;->v:Landroid/view/ViewGroup;

    sget v5, Landroid/support/v7/b/g;->action_mode_bar_stub:I

    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/ViewStubCompat;

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Landroid/support/v7/a/ae;->l()Landroid/content/Context;

    move-result-object v5

    invoke-static {v5}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v5

    invoke-virtual {v0, v5}, Landroid/support/v7/widget/ViewStubCompat;->setLayoutInflater(Landroid/view/LayoutInflater;)V

    invoke-virtual {v0}, Landroid/support/v7/widget/ViewStubCompat;->a()Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/ActionBarContextView;

    iput-object v0, p0, Landroid/support/v7/a/ae;->n:Landroid/support/v7/widget/ActionBarContextView;

    goto/16 :goto_3

    :cond_7
    move v0, v2

    goto :goto_4

    :cond_8
    iput-object v3, p0, Landroid/support/v7/a/ae;->m:Landroid/support/v7/view/b;

    goto/16 :goto_1

    :cond_9
    move-object v0, v3

    goto/16 :goto_0
.end method

.method public a(I)Landroid/view/View;
    .locals 1

    invoke-direct {p0}, Landroid/support/v7/a/ae;->r()V

    iget-object v0, p0, Landroid/support/v7/a/ae;->b:Landroid/view/Window;

    invoke-virtual {v0, p1}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public final a(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    invoke-virtual {p0, p1, p2, p3, p4}, Landroid/support/v7/a/ae;->b(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Landroid/support/v7/a/ae;->c(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    goto :goto_0
.end method

.method a(ILandroid/view/Menu;)V
    .locals 3

    const/4 v2, 0x0

    const/16 v0, 0x6c

    if-ne p1, v0, :cond_1

    invoke-virtual {p0}, Landroid/support/v7/a/ae;->a()Landroid/support/v7/a/a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, v2}, Landroid/support/v7/a/a;->f(Z)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    if-nez p1, :cond_0

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Landroid/support/v7/a/ae;->a(IZ)Landroid/support/v7/a/aq;

    move-result-object v0

    iget-boolean v1, v0, Landroid/support/v7/a/aq;->o:Z

    if-eqz v1, :cond_0

    invoke-direct {p0, v0, v2}, Landroid/support/v7/a/ae;->a(Landroid/support/v7/a/aq;Z)V

    goto :goto_0
.end method

.method public a(Landroid/content/res/Configuration;)V
    .locals 1

    iget-boolean v0, p0, Landroid/support/v7/a/ae;->h:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Landroid/support/v7/a/ae;->u:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/support/v7/a/ae;->a()Landroid/support/v7/a/a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/support/v7/a/a;->a(Landroid/content/res/Configuration;)V

    :cond_0
    return-void
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 2

    const/4 v1, 0x1

    iget-object v0, p0, Landroid/support/v7/a/ae;->c:Landroid/view/Window$Callback;

    instance-of v0, v0, Landroid/app/Activity;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/a/ae;->c:Landroid/view/Window$Callback;

    check-cast v0, Landroid/app/Activity;

    invoke-static {v0}, Landroid/support/v4/b/bc;->b(Landroid/app/Activity;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/support/v7/a/ae;->k()Landroid/support/v7/a/a;

    move-result-object v0

    if-nez v0, :cond_1

    iput-boolean v1, p0, Landroid/support/v7/a/ae;->H:Z

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-virtual {v0, v1}, Landroid/support/v7/a/a;->d(Z)V

    goto :goto_0
.end method

.method public a(Landroid/support/v7/view/menu/i;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Landroid/support/v7/a/ae;->a(Landroid/support/v7/view/menu/i;Z)V

    return-void
.end method

.method public a(Landroid/support/v7/widget/Toolbar;)V
    .locals 3

    const/4 v2, 0x0

    iget-object v0, p0, Landroid/support/v7/a/ae;->c:Landroid/view/Window$Callback;

    instance-of v0, v0, Landroid/app/Activity;

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    invoke-virtual {p0}, Landroid/support/v7/a/ae;->a()Landroid/support/v7/a/a;

    move-result-object v0

    instance-of v1, v0, Landroid/support/v7/a/bg;

    if-eqz v1, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iput-object v2, p0, Landroid/support/v7/a/ae;->g:Landroid/view/MenuInflater;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/support/v7/a/a;->h()V

    :cond_2
    if-eqz p1, :cond_3

    new-instance v1, Landroid/support/v7/a/av;

    iget-object v0, p0, Landroid/support/v7/a/ae;->a:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getTitle()Ljava/lang/CharSequence;

    move-result-object v0

    iget-object v2, p0, Landroid/support/v7/a/ae;->d:Landroid/view/Window$Callback;

    invoke-direct {v1, p1, v0, v2}, Landroid/support/v7/a/av;-><init>(Landroid/support/v7/widget/Toolbar;Ljava/lang/CharSequence;Landroid/view/Window$Callback;)V

    iput-object v1, p0, Landroid/support/v7/a/ae;->f:Landroid/support/v7/a/a;

    iget-object v0, p0, Landroid/support/v7/a/ae;->b:Landroid/view/Window;

    invoke-virtual {v1}, Landroid/support/v7/a/av;->i()Landroid/view/Window$Callback;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/Window;->setCallback(Landroid/view/Window$Callback;)V

    :goto_1
    invoke-virtual {p0}, Landroid/support/v7/a/ae;->e()V

    goto :goto_0

    :cond_3
    iput-object v2, p0, Landroid/support/v7/a/ae;->f:Landroid/support/v7/a/a;

    iget-object v0, p0, Landroid/support/v7/a/ae;->b:Landroid/view/Window;

    iget-object v1, p0, Landroid/support/v7/a/ae;->d:Landroid/view/Window$Callback;

    invoke-virtual {v0, v1}, Landroid/view/Window;->setCallback(Landroid/view/Window$Callback;)V

    goto :goto_1
.end method

.method public a(Landroid/view/View;)V
    .locals 2

    invoke-direct {p0}, Landroid/support/v7/a/ae;->r()V

    iget-object v0, p0, Landroid/support/v7/a/ae;->v:Landroid/view/ViewGroup;

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v0, p0, Landroid/support/v7/a/ae;->c:Landroid/view/Window$Callback;

    invoke-interface {v0}, Landroid/view/Window$Callback;->onContentChanged()V

    return-void
.end method

.method public a(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 2

    invoke-direct {p0}, Landroid/support/v7/a/ae;->r()V

    iget-object v0, p0, Landroid/support/v7/a/ae;->v:Landroid/view/ViewGroup;

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    invoke-virtual {v0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Landroid/support/v7/a/ae;->c:Landroid/view/Window$Callback;

    invoke-interface {v0}, Landroid/view/Window$Callback;->onContentChanged()V

    return-void
.end method

.method a(Landroid/view/ViewGroup;)V
    .locals 0

    return-void
.end method

.method a(ILandroid/view/KeyEvent;)Z
    .locals 4

    const/4 v1, 0x0

    const/4 v0, 0x1

    invoke-virtual {p0}, Landroid/support/v7/a/ae;->a()Landroid/support/v7/a/a;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2, p1, p2}, Landroid/support/v7/a/a;->a(ILandroid/view/KeyEvent;)Z

    move-result v2

    if-eqz v2, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    iget-object v2, p0, Landroid/support/v7/a/ae;->C:Landroid/support/v7/a/aq;

    if-eqz v2, :cond_2

    iget-object v2, p0, Landroid/support/v7/a/ae;->C:Landroid/support/v7/a/aq;

    invoke-virtual {p2}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v3

    invoke-direct {p0, v2, v3, p2, v0}, Landroid/support/v7/a/ae;->a(Landroid/support/v7/a/aq;ILandroid/view/KeyEvent;I)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v1, p0, Landroid/support/v7/a/ae;->C:Landroid/support/v7/a/aq;

    if-eqz v1, :cond_0

    iget-object v1, p0, Landroid/support/v7/a/ae;->C:Landroid/support/v7/a/aq;

    iput-boolean v0, v1, Landroid/support/v7/a/aq;->n:Z

    goto :goto_0

    :cond_2
    iget-object v2, p0, Landroid/support/v7/a/ae;->C:Landroid/support/v7/a/aq;

    if-nez v2, :cond_3

    invoke-direct {p0, v1, v0}, Landroid/support/v7/a/ae;->a(IZ)Landroid/support/v7/a/aq;

    move-result-object v2

    invoke-direct {p0, v2, p2}, Landroid/support/v7/a/ae;->b(Landroid/support/v7/a/aq;Landroid/view/KeyEvent;)Z

    invoke-virtual {p2}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v3

    invoke-direct {p0, v2, v3, p2, v0}, Landroid/support/v7/a/ae;->a(Landroid/support/v7/a/aq;ILandroid/view/KeyEvent;I)Z

    move-result v3

    iput-boolean v1, v2, Landroid/support/v7/a/aq;->m:Z

    if-nez v3, :cond_0

    :cond_3
    move v0, v1

    goto :goto_0
.end method

.method public a(Landroid/support/v7/view/menu/i;Landroid/view/MenuItem;)Z
    .locals 2

    invoke-virtual {p0}, Landroid/support/v7/a/ae;->o()Landroid/view/Window$Callback;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/support/v7/a/ae;->n()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p1}, Landroid/support/v7/view/menu/i;->p()Landroid/support/v7/view/menu/i;

    move-result-object v1

    invoke-direct {p0, v1}, Landroid/support/v7/a/ae;->a(Landroid/view/Menu;)Landroid/support/v7/a/aq;

    move-result-object v1

    if-eqz v1, :cond_0

    iget v1, v1, Landroid/support/v7/a/aq;->a:I

    invoke-interface {v0, v1, p2}, Landroid/view/Window$Callback;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method a(Landroid/view/KeyEvent;)Z
    .locals 3

    const/4 v0, 0x1

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v1

    const/16 v2, 0x52

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Landroid/support/v7/a/ae;->c:Landroid/view/Window$Callback;

    invoke-interface {v1, p1}, Landroid/view/Window$Callback;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result v1

    if-eqz v1, :cond_0

    :goto_0
    return v0

    :cond_0
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v1

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v2

    if-nez v2, :cond_1

    :goto_1
    if-eqz v0, :cond_2

    invoke-virtual {p0, v1, p1}, Landroid/support/v7/a/ae;->c(ILandroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    :cond_2
    invoke-virtual {p0, v1, p1}, Landroid/support/v7/a/ae;->b(ILandroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_0
.end method

.method public b(Landroid/support/v7/view/c;)Landroid/support/v7/view/b;
    .locals 3

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "ActionMode callback can not be null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Landroid/support/v7/a/ae;->m:Landroid/support/v7/view/b;

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroid/support/v7/a/ae;->m:Landroid/support/v7/view/b;

    invoke-virtual {v0}, Landroid/support/v7/view/b;->c()V

    :cond_1
    new-instance v0, Landroid/support/v7/a/an;

    invoke-direct {v0, p0, p1}, Landroid/support/v7/a/an;-><init>(Landroid/support/v7/a/ae;Landroid/support/v7/view/c;)V

    invoke-virtual {p0}, Landroid/support/v7/a/ae;->a()Landroid/support/v7/a/a;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1, v0}, Landroid/support/v7/a/a;->a(Landroid/support/v7/view/c;)Landroid/support/v7/view/b;

    move-result-object v1

    iput-object v1, p0, Landroid/support/v7/a/ae;->m:Landroid/support/v7/view/b;

    iget-object v1, p0, Landroid/support/v7/a/ae;->m:Landroid/support/v7/view/b;

    if-eqz v1, :cond_2

    iget-object v1, p0, Landroid/support/v7/a/ae;->e:Landroid/support/v7/a/v;

    if-eqz v1, :cond_2

    iget-object v1, p0, Landroid/support/v7/a/ae;->e:Landroid/support/v7/a/v;

    iget-object v2, p0, Landroid/support/v7/a/ae;->m:Landroid/support/v7/view/b;

    invoke-interface {v1, v2}, Landroid/support/v7/a/v;->a(Landroid/support/v7/view/b;)V

    :cond_2
    iget-object v1, p0, Landroid/support/v7/a/ae;->m:Landroid/support/v7/view/b;

    if-nez v1, :cond_3

    invoke-virtual {p0, v0}, Landroid/support/v7/a/ae;->a(Landroid/support/v7/view/c;)Landroid/support/v7/view/b;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/a/ae;->m:Landroid/support/v7/view/b;

    :cond_3
    iget-object v0, p0, Landroid/support/v7/a/ae;->m:Landroid/support/v7/view/b;

    return-object v0
.end method

.method b(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    iget-object v0, p0, Landroid/support/v7/a/ae;->c:Landroid/view/Window$Callback;

    instance-of v0, v0, Landroid/view/LayoutInflater$Factory;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/a/ae;->c:Landroid/view/Window$Callback;

    check-cast v0, Landroid/view/LayoutInflater$Factory;

    invoke-interface {v0, p2, p3, p4}, Landroid/view/LayoutInflater$Factory;->onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b(I)V
    .locals 2

    invoke-direct {p0}, Landroid/support/v7/a/ae;->r()V

    iget-object v0, p0, Landroid/support/v7/a/ae;->v:Landroid/view/ViewGroup;

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    iget-object v1, p0, Landroid/support/v7/a/ae;->a:Landroid/content/Context;

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    invoke-virtual {v1, p1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    iget-object v0, p0, Landroid/support/v7/a/ae;->c:Landroid/view/Window$Callback;

    invoke-interface {v0}, Landroid/view/Window$Callback;->onContentChanged()V

    return-void
.end method

.method public b(Landroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0}, Landroid/support/v7/a/ae;->r()V

    return-void
.end method

.method public b(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 2

    invoke-direct {p0}, Landroid/support/v7/a/ae;->r()V

    iget-object v0, p0, Landroid/support/v7/a/ae;->v:Landroid/view/ViewGroup;

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Landroid/support/v7/a/ae;->c:Landroid/view/Window$Callback;

    invoke-interface {v0}, Landroid/view/Window$Callback;->onContentChanged()V

    return-void
.end method

.method b(Ljava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, Landroid/support/v7/a/ae;->r:Landroid/support/v7/widget/ce;

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroid/support/v7/a/ae;->r:Landroid/support/v7/widget/ce;

    invoke-interface {v0, p1}, Landroid/support/v7/widget/ce;->setWindowTitle(Ljava/lang/CharSequence;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-virtual {p0}, Landroid/support/v7/a/ae;->k()Landroid/support/v7/a/a;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Landroid/support/v7/a/ae;->k()Landroid/support/v7/a/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/support/v7/a/a;->a(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Landroid/support/v7/a/ae;->w:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/a/ae;->w:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method

.method b(ILandroid/view/KeyEvent;)Z
    .locals 5

    const/4 v0, 0x1

    const/4 v1, 0x0

    sparse-switch p1, :sswitch_data_0

    :cond_0
    move v0, v1

    :cond_1
    :goto_0
    return v0

    :sswitch_0
    invoke-direct {p0, v1, p2}, Landroid/support/v7/a/ae;->e(ILandroid/view/KeyEvent;)Z

    goto :goto_0

    :sswitch_1
    iget-boolean v2, p0, Landroid/support/v7/a/ae;->D:Z

    iput-boolean v1, p0, Landroid/support/v7/a/ae;->D:Z

    invoke-direct {p0, v1, v1}, Landroid/support/v7/a/ae;->a(IZ)Landroid/support/v7/a/aq;

    move-result-object v3

    if-eqz v3, :cond_2

    iget-boolean v4, v3, Landroid/support/v7/a/aq;->o:Z

    if-eqz v4, :cond_2

    if-nez v2, :cond_1

    invoke-direct {p0, v3, v0}, Landroid/support/v7/a/ae;->a(Landroid/support/v7/a/aq;Z)V

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Landroid/support/v7/a/ae;->q()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        0x4 -> :sswitch_1
        0x52 -> :sswitch_0
    .end sparse-switch
.end method

.method b(ILandroid/view/Menu;)Z
    .locals 2

    const/4 v0, 0x1

    const/16 v1, 0x6c

    if-ne p1, v1, :cond_1

    invoke-virtual {p0}, Landroid/support/v7/a/ae;->a()Landroid/support/v7/a/a;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1, v0}, Landroid/support/v7/a/a;->f(Z)V

    :cond_0
    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public c(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 9

    const/4 v1, 0x0

    const/4 v7, 0x1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x15

    if-ge v0, v2, :cond_1

    move v6, v7

    :goto_0
    iget-object v0, p0, Landroid/support/v7/a/ae;->K:Landroid/support/v7/a/at;

    if-nez v0, :cond_0

    new-instance v0, Landroid/support/v7/a/at;

    invoke-direct {v0}, Landroid/support/v7/a/at;-><init>()V

    iput-object v0, p0, Landroid/support/v7/a/ae;->K:Landroid/support/v7/a/at;

    :cond_0
    if-eqz v6, :cond_2

    move-object v0, p1

    check-cast v0, Landroid/view/ViewParent;

    invoke-direct {p0, v0}, Landroid/support/v7/a/ae;->a(Landroid/view/ViewParent;)Z

    move-result v0

    if-eqz v0, :cond_2

    move v5, v7

    :goto_1
    iget-object v0, p0, Landroid/support/v7/a/ae;->K:Landroid/support/v7/a/at;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v8, v6

    invoke-virtual/range {v0 .. v8}, Landroid/support/v7/a/at;->a(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;ZZZZ)Landroid/view/View;

    move-result-object v0

    return-object v0

    :cond_1
    move v6, v1

    goto :goto_0

    :cond_2
    move v5, v1

    goto :goto_1
.end method

.method public c()V
    .locals 2

    invoke-virtual {p0}, Landroid/support/v7/a/ae;->a()Landroid/support/v7/a/a;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/a/a;->e(Z)V

    :cond_0
    return-void
.end method

.method public c(I)Z
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, p1}, Landroid/support/v7/a/ae;->h(I)I

    move-result v2

    iget-boolean v3, p0, Landroid/support/v7/a/ae;->l:Z

    if-eqz v3, :cond_0

    const/16 v3, 0x6c

    if-ne v2, v3, :cond_0

    :goto_0
    return v0

    :cond_0
    iget-boolean v3, p0, Landroid/support/v7/a/ae;->h:Z

    if-eqz v3, :cond_1

    if-ne v2, v1, :cond_1

    iput-boolean v0, p0, Landroid/support/v7/a/ae;->h:Z

    :cond_1
    sparse-switch v2, :sswitch_data_0

    iget-object v0, p0, Landroid/support/v7/a/ae;->b:Landroid/view/Window;

    invoke-virtual {v0, v2}, Landroid/view/Window;->requestFeature(I)Z

    move-result v0

    goto :goto_0

    :sswitch_0
    invoke-direct {p0}, Landroid/support/v7/a/ae;->v()V

    iput-boolean v1, p0, Landroid/support/v7/a/ae;->h:Z

    move v0, v1

    goto :goto_0

    :sswitch_1
    invoke-direct {p0}, Landroid/support/v7/a/ae;->v()V

    iput-boolean v1, p0, Landroid/support/v7/a/ae;->i:Z

    move v0, v1

    goto :goto_0

    :sswitch_2
    invoke-direct {p0}, Landroid/support/v7/a/ae;->v()V

    iput-boolean v1, p0, Landroid/support/v7/a/ae;->j:Z

    move v0, v1

    goto :goto_0

    :sswitch_3
    invoke-direct {p0}, Landroid/support/v7/a/ae;->v()V

    iput-boolean v1, p0, Landroid/support/v7/a/ae;->y:Z

    move v0, v1

    goto :goto_0

    :sswitch_4
    invoke-direct {p0}, Landroid/support/v7/a/ae;->v()V

    iput-boolean v1, p0, Landroid/support/v7/a/ae;->z:Z

    move v0, v1

    goto :goto_0

    :sswitch_5
    invoke-direct {p0}, Landroid/support/v7/a/ae;->v()V

    iput-boolean v1, p0, Landroid/support/v7/a/ae;->l:Z

    move v0, v1

    goto :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_5
        0x2 -> :sswitch_3
        0x5 -> :sswitch_4
        0xa -> :sswitch_2
        0x6c -> :sswitch_0
        0x6d -> :sswitch_1
    .end sparse-switch
.end method

.method c(ILandroid/view/KeyEvent;)Z
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    sparse-switch p1, :sswitch_data_0

    :goto_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0xb

    if-ge v0, v2, :cond_0

    invoke-virtual {p0, p1, p2}, Landroid/support/v7/a/ae;->a(ILandroid/view/KeyEvent;)Z

    :cond_0
    move v0, v1

    :goto_1
    return v0

    :sswitch_0
    invoke-direct {p0, v1, p2}, Landroid/support/v7/a/ae;->d(ILandroid/view/KeyEvent;)Z

    goto :goto_1

    :sswitch_1
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getFlags()I

    move-result v2

    and-int/lit16 v2, v2, 0x80

    if-eqz v2, :cond_1

    :goto_2
    iput-boolean v0, p0, Landroid/support/v7/a/ae;->D:Z

    goto :goto_0

    :cond_1
    move v0, v1

    goto :goto_2

    nop

    :sswitch_data_0
    .sparse-switch
        0x4 -> :sswitch_1
        0x52 -> :sswitch_0
    .end sparse-switch
.end method

.method public d()V
    .locals 2

    invoke-virtual {p0}, Landroid/support/v7/a/ae;->a()Landroid/support/v7/a/a;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/v7/a/a;->e(Z)V

    :cond_0
    return-void
.end method

.method public e()V
    .locals 1

    invoke-virtual {p0}, Landroid/support/v7/a/ae;->a()Landroid/support/v7/a/a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/support/v7/a/a;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_0
    return-void

    :cond_0
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Landroid/support/v7/a/ae;->e(I)V

    goto :goto_0
.end method

.method public f()V
    .locals 1

    invoke-super {p0}, Landroid/support/v7/a/x;->f()V

    iget-object v0, p0, Landroid/support/v7/a/ae;->f:Landroid/support/v7/a/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/a/ae;->f:Landroid/support/v7/a/a;

    invoke-virtual {v0}, Landroid/support/v7/a/a;->h()V

    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/v7/a/ae;->f:Landroid/support/v7/a/a;

    :cond_0
    return-void
.end method

.method public g()V
    .locals 2

    iget-object v0, p0, Landroid/support/v7/a/ae;->a:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/LayoutInflater;->getFactory()Landroid/view/LayoutInflater$Factory;

    move-result-object v1

    if-nez v1, :cond_1

    invoke-static {v0, p0}, Landroid/support/v4/i/ab;->a(Landroid/view/LayoutInflater;Landroid/support/v4/i/al;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-static {v0}, Landroid/support/v4/i/ab;->a(Landroid/view/LayoutInflater;)Landroid/support/v4/i/al;

    move-result-object v0

    instance-of v0, v0, Landroid/support/v7/a/ae;

    if-nez v0, :cond_0

    const-string v0, "AppCompatDelegate"

    const-string v1, "The Activity\'s LayoutInflater already has a Factory installed so we can not install AppCompat\'s"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method public j()V
    .locals 3

    invoke-direct {p0}, Landroid/support/v7/a/ae;->r()V

    iget-boolean v0, p0, Landroid/support/v7/a/ae;->h:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/a/ae;->f:Landroid/support/v7/a/a;

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Landroid/support/v7/a/ae;->c:Landroid/view/Window$Callback;

    instance-of v0, v0, Landroid/app/Activity;

    if-eqz v0, :cond_3

    new-instance v1, Landroid/support/v7/a/bg;

    iget-object v0, p0, Landroid/support/v7/a/ae;->c:Landroid/view/Window$Callback;

    check-cast v0, Landroid/app/Activity;

    iget-boolean v2, p0, Landroid/support/v7/a/ae;->i:Z

    invoke-direct {v1, v0, v2}, Landroid/support/v7/a/bg;-><init>(Landroid/app/Activity;Z)V

    iput-object v1, p0, Landroid/support/v7/a/ae;->f:Landroid/support/v7/a/a;

    :cond_2
    :goto_1
    iget-object v0, p0, Landroid/support/v7/a/ae;->f:Landroid/support/v7/a/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/a/ae;->f:Landroid/support/v7/a/a;

    iget-boolean v1, p0, Landroid/support/v7/a/ae;->H:Z

    invoke-virtual {v0, v1}, Landroid/support/v7/a/a;->d(Z)V

    goto :goto_0

    :cond_3
    iget-object v0, p0, Landroid/support/v7/a/ae;->c:Landroid/view/Window$Callback;

    instance-of v0, v0, Landroid/app/Dialog;

    if-eqz v0, :cond_2

    new-instance v1, Landroid/support/v7/a/bg;

    iget-object v0, p0, Landroid/support/v7/a/ae;->c:Landroid/view/Window$Callback;

    check-cast v0, Landroid/app/Dialog;

    invoke-direct {v1, v0}, Landroid/support/v7/a/bg;-><init>(Landroid/app/Dialog;)V

    iput-object v1, p0, Landroid/support/v7/a/ae;->f:Landroid/support/v7/a/a;

    goto :goto_1
.end method

.method q()Z
    .locals 2

    const/4 v0, 0x1

    iget-object v1, p0, Landroid/support/v7/a/ae;->m:Landroid/support/v7/view/b;

    if-eqz v1, :cond_1

    iget-object v1, p0, Landroid/support/v7/a/ae;->m:Landroid/support/v7/view/b;

    invoke-virtual {v1}, Landroid/support/v7/view/b;->c()V

    :cond_0
    :goto_0
    return v0

    :cond_1
    invoke-virtual {p0}, Landroid/support/v7/a/ae;->a()Landroid/support/v7/a/a;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Landroid/support/v7/a/a;->f()Z

    move-result v1

    if-nez v1, :cond_0

    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method
