.class public Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;
.super Landroid/support/v7/a/u;


# instance fields
.field private A:Landroid/widget/TextView;

.field private B:Ljava/lang/String;

.field private C:Ljava/lang/String;

.field private D:Ljava/lang/String;

.field private E:Landroid/widget/CheckBox;

.field private F:Landroid/widget/CheckBox;

.field private G:Landroid/widget/CheckBox;

.field private H:Landroid/widget/CheckBox;

.field private I:Landroid/widget/CheckBox;

.field private J:Landroid/widget/CheckBox;

.field private K:Lcom/fkzhang/wechatforwarder/d/h;

.field private L:Ljava/util/ArrayList;

.field private M:Ljava/util/HashMap;

.field private N:Ljava/lang/String;

.field private O:Ljava/lang/String;

.field private P:Z

.field private Q:Lcom/fkzhang/wechatforwarder/e/d;

.field private l:Lcom/fkzhang/wechatforwarder/d/c;

.field private m:Lcom/fkzhang/wechatforwarder/d/f;

.field private n:Lcom/fkzhang/wechatforwarder/d/b;

.field private o:Ljava/util/HashMap;

.field private p:Ljava/util/HashMap;

.field private q:Ljava/util/ArrayList;

.field private r:Ljava/lang/String;

.field private s:Landroid/support/v7/widget/RecyclerView;

.field private t:Ljava/util/ArrayList;

.field private u:Ljava/util/ArrayList;

.field private v:Lcom/fkzhang/wechatforwarder/a/a;

.field private w:Landroid/widget/Switch;

.field private x:Landroid/widget/TextView;

.field private y:Landroid/widget/TextView;

.field private z:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/support/v7/a/u;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->C:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic a(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->C:Ljava/lang/String;

    return-object p1
.end method

.method private a(I)V
    .locals 2

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->u:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fkzhang/wechatforwarder/d/d;

    invoke-virtual {v0}, Lcom/fkzhang/wechatforwarder/d/d;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->l:Lcom/fkzhang/wechatforwarder/d/c;

    invoke-virtual {v1, v0}, Lcom/fkzhang/wechatforwarder/d/c;->b(Lcom/fkzhang/wechatforwarder/d/d;)V

    :cond_0
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->u:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->v:Lcom/fkzhang/wechatforwarder/a/a;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->v:Lcom/fkzhang/wechatforwarder/a/a;

    invoke-virtual {v0}, Lcom/fkzhang/wechatforwarder/a/a;->c()V

    :cond_1
    return-void
.end method

.method private a(II)V
    .locals 10

    const/4 v1, 0x1

    const v9, 0x7f060023

    const/16 v8, 0x8

    const/4 v2, 0x0

    const/4 v7, 0x0

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->n:Lcom/fkzhang/wechatforwarder/d/b;

    invoke-virtual {v0}, Lcom/fkzhang/wechatforwarder/d/b;->a()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->q:Ljava/util/ArrayList;

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const v0, 0x7f06005a

    invoke-virtual {p0, v0}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/fkzhang/wechatforwarder/e/a;->a(Landroid/app/Activity;Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    const v3, 0x7f040030

    invoke-virtual {v0, v3, v7}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    const v0, 0x7f0c006f

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->x:Landroid/widget/TextView;

    const v0, 0x7f0c0071

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->y:Landroid/widget/TextView;

    const v0, 0x7f0c00b3

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->z:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->z:Landroid/widget/TextView;

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setVisibility(I)V

    const v0, 0x7f0c00b2

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->A:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->A:Landroid/widget/TextView;

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setVisibility(I)V

    const v0, 0x7f0c00b1

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Switch;

    iput-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->w:Landroid/widget/Switch;

    const v0, 0x7f0c00b5

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->E:Landroid/widget/CheckBox;

    const v0, 0x7f0c00b6

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->F:Landroid/widget/CheckBox;

    const v0, 0x7f0c00b7

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->G:Landroid/widget/CheckBox;

    const v0, 0x7f0c00b8

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->H:Landroid/widget/CheckBox;

    const v0, 0x7f0c00b9

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->I:Landroid/widget/CheckBox;

    const v0, 0x7f0c00ba

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->J:Landroid/widget/CheckBox;

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->p:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fkzhang/wechatforwarder/d/a;

    iget-object v5, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->p:Ljava/util/HashMap;

    invoke-virtual {v0}, Lcom/fkzhang/wechatforwarder/d/a;->a()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_1
    iput-object v7, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->B:Ljava/lang/String;

    iput-object v7, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->C:Ljava/lang/String;

    iput-object v7, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->D:Ljava/lang/String;

    iput-object v7, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->N:Ljava/lang/String;

    iput-object v7, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->O:Ljava/lang/String;

    const/4 v0, -0x1

    if-eq p2, v0, :cond_5

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->u:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fkzhang/wechatforwarder/d/d;

    iget-object v4, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->x:Landroid/widget/TextView;

    invoke-virtual {v0}, Lcom/fkzhang/wechatforwarder/d/d;->c()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/fkzhang/wechatforwarder/e/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v0}, Lcom/fkzhang/wechatforwarder/d/d;->h()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_2

    iget-object v4, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->z:Landroid/widget/TextView;

    invoke-virtual {v4, v2}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v4, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->A:Landroid/widget/TextView;

    invoke-virtual {v4, v2}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v4, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->z:Landroid/widget/TextView;

    invoke-virtual {v0}, Lcom/fkzhang/wechatforwarder/d/d;->h()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/fkzhang/wechatforwarder/e/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v0}, Lcom/fkzhang/wechatforwarder/d/d;->g()Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->B:Ljava/lang/String;

    invoke-virtual {v0}, Lcom/fkzhang/wechatforwarder/d/d;->h()Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->O:Ljava/lang/String;

    :cond_2
    iget-object v4, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->y:Landroid/widget/TextView;

    invoke-virtual {v0}, Lcom/fkzhang/wechatforwarder/d/d;->d()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/fkzhang/wechatforwarder/e/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v0}, Lcom/fkzhang/wechatforwarder/d/d;->b()Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->C:Ljava/lang/String;

    invoke-virtual {v0}, Lcom/fkzhang/wechatforwarder/d/d;->a()Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->D:Ljava/lang/String;

    invoke-virtual {v0}, Lcom/fkzhang/wechatforwarder/d/d;->d()Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->N:Ljava/lang/String;

    iget-boolean v4, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->P:Z

    if-nez v4, :cond_3

    iget-object v4, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->C:Ljava/lang/String;

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_3

    iget-object v4, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->C:Ljava/lang/String;

    const-string v5, "@chatroom"

    invoke-virtual {v4, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_3

    iget-object v4, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->B:Ljava/lang/String;

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_3

    iget-object v4, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->z:Landroid/widget/TextView;

    invoke-virtual {v4, v2}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v4, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->A:Landroid/widget/TextView;

    invoke-virtual {v4, v2}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v4, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->z:Landroid/widget/TextView;

    invoke-virtual {v4, v9}, Landroid/widget/TextView;->setText(I)V

    :cond_3
    iget-boolean v4, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->P:Z

    if-nez v4, :cond_4

    iget-object v4, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->w:Landroid/widget/Switch;

    invoke-virtual {v0}, Lcom/fkzhang/wechatforwarder/d/d;->f()I

    move-result v5

    if-ne v5, v1, :cond_9

    :goto_2
    invoke-virtual {v4, v1}, Landroid/widget/Switch;->setChecked(Z)V

    :cond_4
    invoke-virtual {v0}, Lcom/fkzhang/wechatforwarder/d/d;->i()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->c(Ljava/lang/String;)V

    :cond_5
    iget-boolean v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->P:Z

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->w:Landroid/widget/Switch;

    invoke-virtual {v0, v8}, Landroid/widget/Switch;->setVisibility(I)V

    :cond_6
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->C:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->x:Landroid/widget/TextView;

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setText(I)V

    :cond_7
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->D:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->y:Landroid/widget/TextView;

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setText(I)V

    :cond_8
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->z:Landroid/widget/TextView;

    new-instance v1, Lcom/fkzhang/wechatforwarder/y;

    invoke-direct {v1, p0}, Lcom/fkzhang/wechatforwarder/y;-><init>(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->x:Landroid/widget/TextView;

    new-instance v1, Lcom/fkzhang/wechatforwarder/z;

    invoke-direct {v1, p0}, Lcom/fkzhang/wechatforwarder/z;-><init>(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->y:Landroid/widget/TextView;

    new-instance v1, Lcom/fkzhang/wechatforwarder/aa;

    invoke-direct {v1, p0}, Lcom/fkzhang/wechatforwarder/aa;-><init>(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance v0, Landroid/support/v7/a/t;

    invoke-direct {v0, p0}, Landroid/support/v7/a/t;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v3}, Landroid/support/v7/a/t;->b(Landroid/view/View;)Landroid/support/v7/a/t;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/support/v7/a/t;->a(I)Landroid/support/v7/a/t;

    move-result-object v0

    const v1, 0x1040013

    new-instance v2, Lcom/fkzhang/wechatforwarder/ac;

    invoke-direct {v2, p0}, Lcom/fkzhang/wechatforwarder/ac;-><init>(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)V

    invoke-virtual {v0, v1, v2}, Landroid/support/v7/a/t;->a(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/a/t;

    move-result-object v0

    const v1, 0x1040009

    new-instance v2, Lcom/fkzhang/wechatforwarder/ab;

    invoke-direct {v2, p0}, Lcom/fkzhang/wechatforwarder/ab;-><init>(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)V

    invoke-virtual {v0, v1, v2}, Landroid/support/v7/a/t;->b(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/a/t;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/a/t;->b()Landroid/support/v7/a/s;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/a/s;->show()V

    goto/16 :goto_0

    :cond_9
    move v1, v2

    goto :goto_2
.end method

.method static synthetic a(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->b(I)V

    return-void
.end method

.method static synthetic a(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->a(II)V

    return-void
.end method

.method static synthetic a(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;Lcom/fkzhang/wechatforwarder/d/d;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->a(Lcom/fkzhang/wechatforwarder/d/d;)V

    return-void
.end method

.method private a(Lcom/fkzhang/wechatforwarder/d/d;)V
    .locals 1

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->u:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1}, Lcom/fkzhang/wechatforwarder/d/d;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->l:Lcom/fkzhang/wechatforwarder/d/c;

    invoke-virtual {v0, p1}, Lcom/fkzhang/wechatforwarder/d/c;->c(Lcom/fkzhang/wechatforwarder/d/d;)V

    :cond_0
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->v:Lcom/fkzhang/wechatforwarder/a/a;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->v:Lcom/fkzhang/wechatforwarder/a/a;

    invoke-virtual {v0}, Lcom/fkzhang/wechatforwarder/a/a;->c()V

    :cond_1
    return-void
.end method

.method static synthetic b(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;Ljava/lang/String;)I
    .locals 1

    invoke-direct {p0, p1}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->b(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method private b(Ljava/lang/String;)I
    .locals 3

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->u:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->u:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fkzhang/wechatforwarder/d/d;

    invoke-virtual {v0}, Lcom/fkzhang/wechatforwarder/d/d;->b()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v0}, Lcom/fkzhang/wechatforwarder/d/d;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_1
    return v1

    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_1
    const/4 v1, -0x1

    goto :goto_1
.end method

.method static synthetic b(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)Ljava/util/HashMap;
    .locals 1

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->M:Ljava/util/HashMap;

    return-object v0
.end method

.method private b(I)V
    .locals 3

    new-instance v0, Landroid/support/v7/a/t;

    invoke-direct {v0, p0}, Landroid/support/v7/a/t;-><init>(Landroid/content/Context;)V

    const v1, 0x7f060028

    invoke-virtual {v0, v1}, Landroid/support/v7/a/t;->a(I)Landroid/support/v7/a/t;

    move-result-object v0

    const v1, 0x7f060029

    invoke-virtual {v0, v1}, Landroid/support/v7/a/t;->b(I)Landroid/support/v7/a/t;

    move-result-object v0

    const v1, 0x1040013

    new-instance v2, Lcom/fkzhang/wechatforwarder/af;

    invoke-direct {v2, p0, p1}, Lcom/fkzhang/wechatforwarder/af;-><init>(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;I)V

    invoke-virtual {v0, v1, v2}, Landroid/support/v7/a/t;->a(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/a/t;

    move-result-object v0

    const v1, 0x1040009

    new-instance v2, Lcom/fkzhang/wechatforwarder/ae;

    invoke-direct {v2, p0}, Lcom/fkzhang/wechatforwarder/ae;-><init>(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)V

    invoke-virtual {v0, v1, v2}, Landroid/support/v7/a/t;->b(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/a/t;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/a/t;->b()Landroid/support/v7/a/s;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/a/s;->show()V

    return-void
.end method

.method static synthetic b(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->a(I)V

    return-void
.end method

.method static synthetic c(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->x:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic c(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->B:Ljava/lang/String;

    return-object p1
.end method

.method private c(I)V
    .locals 4

    const/4 v2, 0x1

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->u:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fkzhang/wechatforwarder/d/d;

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->C:Ljava/lang/String;

    const-string v3, "@chatroom"

    invoke-virtual {v1, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->o:Ljava/util/HashMap;

    iget-object v3, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->C:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/fkzhang/wechatforwarder/d/e;

    invoke-virtual {v1}, Lcom/fkzhang/wechatforwarder/d/e;->b()Ljava/lang/String;

    move-result-object v1

    :goto_0
    iget-object v3, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->C:Ljava/lang/String;

    invoke-virtual {v0, v3}, Lcom/fkzhang/wechatforwarder/d/d;->b(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/fkzhang/wechatforwarder/d/d;->c(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->D:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/fkzhang/wechatforwarder/d/d;->a(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->N:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/fkzhang/wechatforwarder/d/d;->d(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->B:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/fkzhang/wechatforwarder/d/d;->e(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->O:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/fkzhang/wechatforwarder/d/d;->f(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->r()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fkzhang/wechatforwarder/d/d;->g(Ljava/lang/String;)V

    iget-boolean v1, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->P:Z

    if-eqz v1, :cond_1

    invoke-virtual {v0, v2}, Lcom/fkzhang/wechatforwarder/d/d;->a(I)V

    :goto_1
    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->l:Lcom/fkzhang/wechatforwarder/d/c;

    invoke-virtual {v1, v0}, Lcom/fkzhang/wechatforwarder/d/c;->a(Lcom/fkzhang/wechatforwarder/d/d;)V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->v:Lcom/fkzhang/wechatforwarder/a/a;

    invoke-virtual {v0}, Lcom/fkzhang/wechatforwarder/a/a;->c()V

    return-void

    :cond_0
    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->M:Ljava/util/HashMap;

    iget-object v3, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->C:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/fkzhang/wechatforwarder/d/g;

    invoke-virtual {v1}, Lcom/fkzhang/wechatforwarder/d/g;->b()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->w:Landroid/widget/Switch;

    invoke-virtual {v1}, Landroid/widget/Switch;->isChecked()Z

    move-result v1

    if-eqz v1, :cond_2

    move v1, v2

    :goto_2
    invoke-virtual {v0, v1}, Lcom/fkzhang/wechatforwarder/d/d;->a(I)V

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    goto :goto_2
.end method

.method static synthetic c(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->c(I)V

    return-void
.end method

.method private c(Ljava/lang/String;)V
    .locals 5

    const/4 v4, 0x1

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->E:Landroid/widget/CheckBox;

    invoke-virtual {v1, v0}, Landroid/widget/CheckBox;->setChecked(Z)V

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->F:Landroid/widget/CheckBox;

    invoke-virtual {v1, v0}, Landroid/widget/CheckBox;->setChecked(Z)V

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->H:Landroid/widget/CheckBox;

    invoke-virtual {v1, v0}, Landroid/widget/CheckBox;->setChecked(Z)V

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->G:Landroid/widget/CheckBox;

    invoke-virtual {v1, v0}, Landroid/widget/CheckBox;->setChecked(Z)V

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->I:Landroid/widget/CheckBox;

    invoke-virtual {v1, v0}, Landroid/widget/CheckBox;->setChecked(Z)V

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->J:Landroid/widget/CheckBox;

    invoke-virtual {v1, v0}, Landroid/widget/CheckBox;->setChecked(Z)V

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    return-void

    :cond_1
    const-string v1, ","

    invoke-virtual {p1, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    array-length v2, v1

    :goto_0
    if-ge v0, v2, :cond_0

    aget-object v3, v1, v0

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    packed-switch v3, :pswitch_data_0

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :pswitch_0
    iget-object v3, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->E:Landroid/widget/CheckBox;

    invoke-virtual {v3, v4}, Landroid/widget/CheckBox;->setChecked(Z)V

    goto :goto_1

    :pswitch_1
    iget-object v3, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->F:Landroid/widget/CheckBox;

    invoke-virtual {v3, v4}, Landroid/widget/CheckBox;->setChecked(Z)V

    goto :goto_1

    :pswitch_2
    iget-object v3, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->H:Landroid/widget/CheckBox;

    invoke-virtual {v3, v4}, Landroid/widget/CheckBox;->setChecked(Z)V

    goto :goto_1

    :pswitch_3
    iget-object v3, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->G:Landroid/widget/CheckBox;

    invoke-virtual {v3, v4}, Landroid/widget/CheckBox;->setChecked(Z)V

    goto :goto_1

    :pswitch_4
    iget-object v3, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->I:Landroid/widget/CheckBox;

    invoke-virtual {v3, v4}, Landroid/widget/CheckBox;->setChecked(Z)V

    goto :goto_1

    :pswitch_5
    iget-object v3, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->J:Landroid/widget/CheckBox;

    invoke-virtual {v3, v4}, Landroid/widget/CheckBox;->setChecked(Z)V

    goto :goto_1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method static synthetic d(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->O:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic d(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)Ljava/util/ArrayList;
    .locals 1

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->u:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic e(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->D:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic e(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->P:Z

    return v0
.end method

.method static synthetic f(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->z:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic f(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->N:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic g(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->A:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic g(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->c(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic h(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->O:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic i(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->N:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic j(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->y:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic k(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)Landroid/widget/Switch;
    .locals 1

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->w:Landroid/widget/Switch;

    return-object v0
.end method

.method private k()V
    .locals 2

    const v0, 0x7f0c0083

    invoke-virtual {p0, v0}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->s:Landroid/support/v7/widget/RecyclerView;

    new-instance v0, Landroid/support/v7/widget/LinearLayoutManager;

    invoke-direct {v0, p0}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->s:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v1, v0}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/eq;)V

    invoke-direct {p0}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->m()V

    return-void
.end method

.method static synthetic l(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->D:Ljava/lang/String;

    return-object v0
.end method

.method private l()V
    .locals 11

    const/4 v2, 0x0

    iget-boolean v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->P:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->j()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->u:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->p:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fkzhang/wechatforwarder/d/a;

    iget-object v3, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->p:Ljava/util/HashMap;

    invoke-virtual {v0}, Lcom/fkzhang/wechatforwarder/d/a;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/fkzhang/wechatforwarder/d/d;

    invoke-virtual {p0}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->j()Ljava/lang/String;

    move-result-object v1

    iget-object v3, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->p:Ljava/util/HashMap;

    invoke-virtual {p0}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->j()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/fkzhang/wechatforwarder/d/a;

    invoke-virtual {v3}, Lcom/fkzhang/wechatforwarder/d/a;->b()Ljava/lang/String;

    move-result-object v6

    const/4 v10, 0x1

    move-object v3, v2

    move-object v4, v2

    move-object v5, v2

    move-object v7, v2

    move-object v8, v2

    move-object v9, v2

    invoke-direct/range {v0 .. v10}, Lcom/fkzhang/wechatforwarder/d/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-direct {p0, v0}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->a(Lcom/fkzhang/wechatforwarder/d/d;)V

    :cond_1
    return-void
.end method

.method private m()V
    .locals 9

    const/4 v8, 0x0

    const/4 v1, 0x1

    const/4 v7, 0x0

    const/4 v6, -0x1

    invoke-virtual {p0}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->j()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->l:Lcom/fkzhang/wechatforwarder/d/c;

    invoke-virtual {v0, v2}, Lcom/fkzhang/wechatforwarder/d/c;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->K:Lcom/fkzhang/wechatforwarder/d/h;

    invoke-virtual {v0, v2}, Lcom/fkzhang/wechatforwarder/d/h;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->K:Lcom/fkzhang/wechatforwarder/d/h;

    invoke-virtual {v0}, Lcom/fkzhang/wechatforwarder/d/h;->a()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->L:Ljava/util/ArrayList;

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->M:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->L:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fkzhang/wechatforwarder/d/g;

    iget-object v4, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->M:Ljava/util/HashMap;

    invoke-virtual {v0}, Lcom/fkzhang/wechatforwarder/d/g;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->o:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->m:Lcom/fkzhang/wechatforwarder/d/f;

    invoke-virtual {v0, v2}, Lcom/fkzhang/wechatforwarder/d/f;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->m:Lcom/fkzhang/wechatforwarder/d/f;

    invoke-virtual {v0}, Lcom/fkzhang/wechatforwarder/d/f;->a()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->t:Ljava/util/ArrayList;

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->t:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fkzhang/wechatforwarder/d/e;

    iget-object v3, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->o:Ljava/util/HashMap;

    invoke-virtual {v0}, Lcom/fkzhang/wechatforwarder/d/e;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_2
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->l:Lcom/fkzhang/wechatforwarder/d/c;

    invoke-virtual {v0}, Lcom/fkzhang/wechatforwarder/d/c;->a()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->u:Ljava/util/ArrayList;

    iget-boolean v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->P:Z

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->u:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-le v0, v1, :cond_3

    move v0, v1

    :goto_3
    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->u:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_3

    invoke-direct {p0, v0}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->a(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_3
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->u:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fkzhang/wechatforwarder/d/d;

    invoke-virtual {v0}, Lcom/fkzhang/wechatforwarder/d/d;->a()Ljava/lang/String;

    move-result-object v2

    const-string v3, ","

    invoke-virtual {v2, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v2

    if-eq v2, v6, :cond_4

    invoke-virtual {v0}, Lcom/fkzhang/wechatforwarder/d/d;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v7, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/fkzhang/wechatforwarder/d/d;->a(Ljava/lang/String;)V

    :cond_4
    invoke-virtual {v0}, Lcom/fkzhang/wechatforwarder/d/d;->d()Ljava/lang/String;

    move-result-object v2

    const-string v3, ","

    invoke-virtual {v2, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v2

    if-eq v2, v6, :cond_5

    invoke-virtual {v0}, Lcom/fkzhang/wechatforwarder/d/d;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v7, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/fkzhang/wechatforwarder/d/d;->d(Ljava/lang/String;)V

    :cond_5
    invoke-virtual {v0, v8}, Lcom/fkzhang/wechatforwarder/d/d;->e(Ljava/lang/String;)V

    invoke-virtual {v0, v8}, Lcom/fkzhang/wechatforwarder/d/d;->f(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->l:Lcom/fkzhang/wechatforwarder/d/c;

    invoke-virtual {v2, v0}, Lcom/fkzhang/wechatforwarder/d/c;->a(Lcom/fkzhang/wechatforwarder/d/d;)V

    goto :goto_4

    :cond_6
    new-instance v0, Lcom/fkzhang/wechatforwarder/a/a;

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->u:Ljava/util/ArrayList;

    invoke-direct {v0, p0, v1}, Lcom/fkzhang/wechatforwarder/a/a;-><init>(Landroid/app/Activity;Ljava/util/ArrayList;)V

    iput-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->v:Lcom/fkzhang/wechatforwarder/a/a;

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->v:Lcom/fkzhang/wechatforwarder/a/a;

    new-instance v1, Lcom/fkzhang/wechatforwarder/u;

    invoke-direct {v1, p0}, Lcom/fkzhang/wechatforwarder/u;-><init>(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)V

    invoke-virtual {v0, v1}, Lcom/fkzhang/wechatforwarder/a/a;->a(Lcom/fkzhang/wechatforwarder/c/b;)V

    iget-boolean v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->P:Z

    if-nez v0, :cond_7

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->v:Lcom/fkzhang/wechatforwarder/a/a;

    new-instance v1, Lcom/fkzhang/wechatforwarder/ad;

    invoke-direct {v1, p0}, Lcom/fkzhang/wechatforwarder/ad;-><init>(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)V

    invoke-virtual {v0, v1}, Lcom/fkzhang/wechatforwarder/a/a;->a(Lcom/fkzhang/wechatforwarder/c/c;)V

    :cond_7
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->v:Lcom/fkzhang/wechatforwarder/a/a;

    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->s:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->v:Lcom/fkzhang/wechatforwarder/a/a;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/eg;)V

    :cond_8
    invoke-direct {p0}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->l()V

    goto/16 :goto_0
.end method

.method static synthetic m(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->p()V

    return-void
.end method

.method private n()V
    .locals 11

    const/4 v10, 0x1

    invoke-virtual {p0}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->j()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_0
    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f040032

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v7

    const v0, 0x7f0c00c2

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    const v1, 0x7f0c00bc

    invoke-virtual {v7, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iget-object v2, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->L:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/fkzhang/wechatforwarder/d/g;

    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2}, Lcom/fkzhang/wechatforwarder/d/g;->a()Ljava/lang/String;

    move-result-object v8

    const-string v9, "@chatroom"

    invoke-virtual {v8, v9}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_1

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    iget-object v8, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->C:Ljava/lang/String;

    new-instance v2, Lcom/fkzhang/wechatforwarder/a/c;

    invoke-direct {v2, p0, v5}, Lcom/fkzhang/wechatforwarder/a/c;-><init>(Landroid/app/Activity;Ljava/util/ArrayList;)V

    invoke-direct {p0}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->s()Z

    move-result v6

    if-nez v6, :cond_3

    invoke-virtual {v2}, Lcom/fkzhang/wechatforwarder/a/c;->a()V

    :cond_3
    invoke-virtual {v0, v2}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    new-instance v6, Lcom/fkzhang/wechatforwarder/ag;

    invoke-direct {v6, p0, v1, v2}, Lcom/fkzhang/wechatforwarder/ag;-><init>(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;Landroid/widget/TextView;Lcom/fkzhang/wechatforwarder/a/c;)V

    invoke-virtual {v0, v6}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    const v1, 0x7f0c00c1

    invoke-virtual {v7, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/SearchView;

    const/4 v6, 0x0

    invoke-virtual {v1, v6}, Landroid/widget/SearchView;->setIconifiedByDefault(Z)V

    invoke-virtual {v1, v10}, Landroid/widget/SearchView;->setSubmitButtonEnabled(Z)V

    const v6, 0x7f06005d

    invoke-virtual {p0, v6}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Landroid/widget/SearchView;->setQueryHint(Ljava/lang/CharSequence;)V

    invoke-virtual {v0, v10}, Landroid/widget/ListView;->setTextFilterEnabled(Z)V

    new-instance v6, Lcom/fkzhang/wechatforwarder/ah;

    invoke-direct {v6, p0, v0}, Lcom/fkzhang/wechatforwarder/ah;-><init>(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;Landroid/widget/ListView;)V

    invoke-virtual {v1, v6}, Landroid/widget/SearchView;->setOnQueryTextListener(Landroid/widget/SearchView$OnQueryTextListener;)V

    const v0, 0x7f0c00bd

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/RadioGroup;

    new-instance v0, Lcom/fkzhang/wechatforwarder/ai;

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/fkzhang/wechatforwarder/ai;-><init>(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;Lcom/fkzhang/wechatforwarder/a/c;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    invoke-virtual {v6, v0}, Landroid/widget/RadioGroup;->setOnCheckedChangeListener(Landroid/widget/RadioGroup$OnCheckedChangeListener;)V

    new-instance v0, Landroid/support/v7/a/t;

    invoke-direct {v0, p0}, Landroid/support/v7/a/t;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v7}, Landroid/support/v7/a/t;->b(Landroid/view/View;)Landroid/support/v7/a/t;

    move-result-object v0

    const v1, 0x7f060061

    invoke-virtual {v0, v1}, Landroid/support/v7/a/t;->a(I)Landroid/support/v7/a/t;

    move-result-object v0

    const v1, 0x1040013

    new-instance v2, Lcom/fkzhang/wechatforwarder/k;

    invoke-direct {v2, p0}, Lcom/fkzhang/wechatforwarder/k;-><init>(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)V

    invoke-virtual {v0, v1, v2}, Landroid/support/v7/a/t;->a(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/a/t;

    move-result-object v0

    const v1, 0x1040009

    new-instance v2, Lcom/fkzhang/wechatforwarder/aj;

    invoke-direct {v2, p0, v8}, Lcom/fkzhang/wechatforwarder/aj;-><init>(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Landroid/support/v7/a/t;->b(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/a/t;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/a/t;->b()Landroid/support/v7/a/s;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/a/s;->show()V

    goto/16 :goto_0
.end method

.method static synthetic n(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->n()V

    return-void
.end method

.method private o()V
    .locals 11

    const/4 v10, 0x1

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->C:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->j()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const v0, 0x7f06005c

    invoke-virtual {p0, v0}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/fkzhang/wechatforwarder/e/a;->a(Landroid/app/Activity;Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_1
    invoke-virtual {p0}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f040032

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v7

    const v0, 0x7f0c00c2

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    const v1, 0x7f0c00bc

    invoke-virtual {v7, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iget-object v2, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->L:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_2
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/fkzhang/wechatforwarder/d/g;

    invoke-virtual {v2}, Lcom/fkzhang/wechatforwarder/d/g;->a()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p0}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->j()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_2

    invoke-virtual {v2}, Lcom/fkzhang/wechatforwarder/d/g;->a()Ljava/lang/String;

    move-result-object v8

    iget-object v9, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->C:Ljava/lang/String;

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_2

    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2}, Lcom/fkzhang/wechatforwarder/d/g;->a()Ljava/lang/String;

    move-result-object v8

    const-string v9, "@chatroom"

    invoke-virtual {v8, v9}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    iget-object v8, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->D:Ljava/lang/String;

    new-instance v2, Lcom/fkzhang/wechatforwarder/a/c;

    invoke-direct {v2, p0, v5}, Lcom/fkzhang/wechatforwarder/a/c;-><init>(Landroid/app/Activity;Ljava/util/ArrayList;)V

    invoke-direct {p0}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->s()Z

    move-result v6

    if-nez v6, :cond_5

    invoke-virtual {v2}, Lcom/fkzhang/wechatforwarder/a/c;->a()V

    :cond_5
    invoke-virtual {v0, v2}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    new-instance v6, Lcom/fkzhang/wechatforwarder/l;

    invoke-direct {v6, p0, v1, v2}, Lcom/fkzhang/wechatforwarder/l;-><init>(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;Landroid/widget/TextView;Lcom/fkzhang/wechatforwarder/a/c;)V

    invoke-virtual {v0, v6}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    const v1, 0x7f0c00c1

    invoke-virtual {v7, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/SearchView;

    const/4 v6, 0x0

    invoke-virtual {v1, v6}, Landroid/widget/SearchView;->setIconifiedByDefault(Z)V

    invoke-virtual {v1, v10}, Landroid/widget/SearchView;->setSubmitButtonEnabled(Z)V

    const v6, 0x7f06005d

    invoke-virtual {p0, v6}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Landroid/widget/SearchView;->setQueryHint(Ljava/lang/CharSequence;)V

    invoke-virtual {v0, v10}, Landroid/widget/ListView;->setTextFilterEnabled(Z)V

    new-instance v6, Lcom/fkzhang/wechatforwarder/m;

    invoke-direct {v6, p0, v0}, Lcom/fkzhang/wechatforwarder/m;-><init>(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;Landroid/widget/ListView;)V

    invoke-virtual {v1, v6}, Landroid/widget/SearchView;->setOnQueryTextListener(Landroid/widget/SearchView$OnQueryTextListener;)V

    const v0, 0x7f0c00bd

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/RadioGroup;

    new-instance v0, Lcom/fkzhang/wechatforwarder/n;

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/fkzhang/wechatforwarder/n;-><init>(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;Lcom/fkzhang/wechatforwarder/a/c;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    invoke-virtual {v6, v0}, Landroid/widget/RadioGroup;->setOnCheckedChangeListener(Landroid/widget/RadioGroup$OnCheckedChangeListener;)V

    new-instance v0, Landroid/support/v7/a/t;

    invoke-direct {v0, p0}, Landroid/support/v7/a/t;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v7}, Landroid/support/v7/a/t;->b(Landroid/view/View;)Landroid/support/v7/a/t;

    move-result-object v0

    const v1, 0x7f060062

    invoke-virtual {v0, v1}, Landroid/support/v7/a/t;->a(I)Landroid/support/v7/a/t;

    move-result-object v0

    const v1, 0x1040013

    new-instance v2, Lcom/fkzhang/wechatforwarder/p;

    invoke-direct {v2, p0}, Lcom/fkzhang/wechatforwarder/p;-><init>(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)V

    invoke-virtual {v0, v1, v2}, Landroid/support/v7/a/t;->a(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/a/t;

    move-result-object v0

    const v1, 0x1040009

    new-instance v2, Lcom/fkzhang/wechatforwarder/o;

    invoke-direct {v2, p0, v8}, Lcom/fkzhang/wechatforwarder/o;-><init>(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Landroid/support/v7/a/t;->b(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/a/t;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/a/t;->b()Landroid/support/v7/a/s;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/a/s;->show()V

    goto/16 :goto_0
.end method

.method static synthetic o(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->o()V

    return-void
.end method

.method private p()V
    .locals 10

    const/4 v2, 0x0

    const/16 v4, 0x8

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->C:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->j()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const v0, 0x7f06005c

    invoke-virtual {p0, v0}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/fkzhang/wechatforwarder/e/a;->a(Landroid/app/Activity;Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_1
    invoke-virtual {p0}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f040032

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    const v0, 0x7f0c00c2

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    const v1, 0x7f0c00bc

    invoke-virtual {v3, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setVisibility(I)V

    const v1, 0x7f0c00c1

    invoke-virtual {v3, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    const v1, 0x7f0c00bd

    invoke-virtual {v3, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->o:Ljava/util/HashMap;

    iget-object v4, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->C:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/fkzhang/wechatforwarder/d/e;

    invoke-virtual {v1}, Lcom/fkzhang/wechatforwarder/d/e;->d()Ljava/lang/String;

    move-result-object v4

    const-string v5, ";"

    invoke-virtual {v4, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lcom/fkzhang/wechatforwarder/d/e;->c()Ljava/lang/String;

    move-result-object v1

    const-string v5, ";"

    invoke-virtual {v1, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->p:Ljava/util/HashMap;

    invoke-virtual {p0}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->j()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v1, v2

    :goto_1
    array-length v7, v4

    if-ge v1, v7, :cond_2

    new-instance v7, Lcom/fkzhang/wechatforwarder/d/g;

    aget-object v8, v5, v1

    aget-object v9, v4, v1

    invoke-direct {v7, v8, v9}, Lcom/fkzhang/wechatforwarder/d/g;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    new-instance v4, Lcom/fkzhang/wechatforwarder/a/d;

    invoke-direct {v4, p0, v6}, Lcom/fkzhang/wechatforwarder/a/d;-><init>(Landroid/app/Activity;Ljava/util/ArrayList;)V

    invoke-direct {p0}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->s()Z

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {v4}, Lcom/fkzhang/wechatforwarder/a/d;->a()V

    :cond_3
    invoke-virtual {v0, v4}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->B:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_6

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->B:Ljava/lang/String;

    const-string v5, ";"

    invoke-virtual {v1, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    new-instance v5, Ljava/util/HashSet;

    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    invoke-static {v5, v1}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    :goto_2
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v2, v1, :cond_5

    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/fkzhang/wechatforwarder/c/a;

    invoke-interface {v1}, Lcom/fkzhang/wechatforwarder/c/a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    const/4 v1, 0x1

    invoke-virtual {v4, v2, v1}, Lcom/fkzhang/wechatforwarder/a/d;->a(IZ)V

    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_5
    invoke-virtual {v4}, Lcom/fkzhang/wechatforwarder/a/d;->notifyDataSetChanged()V

    :cond_6
    new-instance v1, Lcom/fkzhang/wechatforwarder/q;

    invoke-direct {v1, p0, v4}, Lcom/fkzhang/wechatforwarder/q;-><init>(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;Lcom/fkzhang/wechatforwarder/a/d;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    new-instance v0, Landroid/support/v7/a/t;

    invoke-direct {v0, p0}, Landroid/support/v7/a/t;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v3}, Landroid/support/v7/a/t;->b(Landroid/view/View;)Landroid/support/v7/a/t;

    move-result-object v0

    const v1, 0x7f060061

    invoke-virtual {v0, v1}, Landroid/support/v7/a/t;->a(I)Landroid/support/v7/a/t;

    move-result-object v0

    const v1, 0x1040013

    new-instance v2, Lcom/fkzhang/wechatforwarder/s;

    invoke-direct {v2, p0, v4}, Lcom/fkzhang/wechatforwarder/s;-><init>(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;Lcom/fkzhang/wechatforwarder/a/d;)V

    invoke-virtual {v0, v1, v2}, Landroid/support/v7/a/t;->a(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/a/t;

    move-result-object v0

    const v1, 0x1040009

    new-instance v2, Lcom/fkzhang/wechatforwarder/r;

    invoke-direct {v2, p0}, Lcom/fkzhang/wechatforwarder/r;-><init>(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)V

    invoke-virtual {v0, v1, v2}, Landroid/support/v7/a/t;->b(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/a/t;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/a/t;->b()Landroid/support/v7/a/s;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/a/s;->show()V

    goto/16 :goto_0
.end method

.method static synthetic p(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->q()V

    return-void
.end method

.method static synthetic q(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)Ljava/lang/String;
    .locals 1

    invoke-direct {p0}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->r()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private q()V
    .locals 10

    const/16 v3, 0x8

    const/4 v9, 0x1

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->C:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->j()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const v0, 0x7f06005c

    invoke-virtual {p0, v0}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/fkzhang/wechatforwarder/e/a;->a(Landroid/app/Activity;Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_1
    invoke-virtual {p0}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f040032

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v7

    const v0, 0x7f0c00c2

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    invoke-virtual {v0, v9}, Landroid/widget/ListView;->setTextFilterEnabled(Z)V

    const v1, 0x7f0c00bc

    invoke-virtual {v7, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setVisibility(I)V

    const v1, 0x7f0c00c1

    invoke-virtual {v7, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->L:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/fkzhang/wechatforwarder/d/g;

    invoke-virtual {v1}, Lcom/fkzhang/wechatforwarder/d/g;->a()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->j()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_2

    invoke-virtual {v1}, Lcom/fkzhang/wechatforwarder/d/g;->a()Ljava/lang/String;

    move-result-object v6

    iget-object v8, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->C:Ljava/lang/String;

    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_2

    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1}, Lcom/fkzhang/wechatforwarder/d/g;->a()Ljava/lang/String;

    move-result-object v6

    const-string v8, "@chatroom"

    invoke-virtual {v6, v8}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    new-instance v2, Lcom/fkzhang/wechatforwarder/a/d;

    invoke-direct {v2, p0, v5}, Lcom/fkzhang/wechatforwarder/a/d;-><init>(Landroid/app/Activity;Ljava/util/ArrayList;)V

    invoke-direct {p0}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->s()Z

    move-result v1

    if-nez v1, :cond_5

    invoke-virtual {v2}, Lcom/fkzhang/wechatforwarder/a/d;->a()V

    :cond_5
    invoke-virtual {v0, v2}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->D:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_8

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->D:Ljava/lang/String;

    const-string v6, ","

    invoke-virtual {v1, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    new-instance v8, Ljava/util/HashSet;

    invoke-direct {v8}, Ljava/util/HashSet;-><init>()V

    invoke-static {v8, v1}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    const/4 v1, 0x0

    move v6, v1

    :goto_2
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v6, v1, :cond_7

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/fkzhang/wechatforwarder/c/a;

    invoke-interface {v1}, Lcom/fkzhang/wechatforwarder/c/a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-virtual {v2, v6, v9}, Lcom/fkzhang/wechatforwarder/a/d;->a(IZ)V

    :cond_6
    add-int/lit8 v1, v6, 0x1

    move v6, v1

    goto :goto_2

    :cond_7
    invoke-virtual {v2}, Lcom/fkzhang/wechatforwarder/a/d;->notifyDataSetChanged()V

    :cond_8
    new-instance v1, Lcom/fkzhang/wechatforwarder/t;

    invoke-direct {v1, p0, v2}, Lcom/fkzhang/wechatforwarder/t;-><init>(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;Lcom/fkzhang/wechatforwarder/a/d;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    const v0, 0x7f0c00bd

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/RadioGroup;

    new-instance v0, Lcom/fkzhang/wechatforwarder/v;

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/fkzhang/wechatforwarder/v;-><init>(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;Lcom/fkzhang/wechatforwarder/a/d;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    invoke-virtual {v6, v0}, Landroid/widget/RadioGroup;->setOnCheckedChangeListener(Landroid/widget/RadioGroup$OnCheckedChangeListener;)V

    new-instance v0, Landroid/support/v7/a/t;

    invoke-direct {v0, p0}, Landroid/support/v7/a/t;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v7}, Landroid/support/v7/a/t;->b(Landroid/view/View;)Landroid/support/v7/a/t;

    move-result-object v0

    const v1, 0x7f060062

    invoke-virtual {v0, v1}, Landroid/support/v7/a/t;->a(I)Landroid/support/v7/a/t;

    move-result-object v0

    const v1, 0x1040013

    new-instance v3, Lcom/fkzhang/wechatforwarder/x;

    invoke-direct {v3, p0, v2}, Lcom/fkzhang/wechatforwarder/x;-><init>(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;Lcom/fkzhang/wechatforwarder/a/d;)V

    invoke-virtual {v0, v1, v3}, Landroid/support/v7/a/t;->a(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/a/t;

    move-result-object v0

    const v1, 0x1040009

    new-instance v2, Lcom/fkzhang/wechatforwarder/w;

    invoke-direct {v2, p0}, Lcom/fkzhang/wechatforwarder/w;-><init>(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)V

    invoke-virtual {v0, v1, v2}, Landroid/support/v7/a/t;->b(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/a/t;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/a/t;->b()Landroid/support/v7/a/s;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/a/s;->show()V

    goto/16 :goto_0
.end method

.method private r()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->E:Landroid/widget/CheckBox;

    invoke-virtual {v1}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "0,"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->F:Landroid/widget/CheckBox;

    invoke-virtual {v1}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "1,"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->H:Landroid/widget/CheckBox;

    invoke-virtual {v1}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, "2,"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->G:Landroid/widget/CheckBox;

    invoke-virtual {v1}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v1

    if-eqz v1, :cond_3

    const-string v1, "3,"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->I:Landroid/widget/CheckBox;

    invoke-virtual {v1}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v1

    if-eqz v1, :cond_4

    const-string v1, "4,"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_4
    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->J:Landroid/widget/CheckBox;

    invoke-virtual {v1}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v1

    if-eqz v1, :cond_5

    const-string v1, "5,"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_5
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic r(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)Ljava/util/HashMap;
    .locals 1

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->o:Ljava/util/HashMap;

    return-object v0
.end method

.method static synthetic s(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)Ljava/util/HashMap;
    .locals 1

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->p:Ljava/util/HashMap;

    return-object v0
.end method

.method private s()Z
    .locals 3

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->Q:Lcom/fkzhang/wechatforwarder/e/d;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->j()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "_avatar_enable"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/fkzhang/wechatforwarder/e/d;->a(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method static synthetic t(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->B:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->r:Ljava/lang/String;

    return-void
.end method

.method public j()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->r:Ljava/lang/String;

    return-object v0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3

    invoke-super {p0, p1}, Landroid/support/v7/a/u;->onCreate(Landroid/os/Bundle;)V

    const v0, 0x7f04001a

    invoke-virtual {p0, v0}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->setContentView(I)V

    const v0, 0x7f0c0069

    invoke-virtual {p0, v0}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/Toolbar;

    invoke-virtual {p0, v0}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->a(Landroid/support/v7/widget/Toolbar;)V

    new-instance v0, Lcom/fkzhang/wechatforwarder/Data/a;

    const-string v1, "com.fkzhang.wechatforwarder"

    invoke-direct {v0, v1}, Lcom/fkzhang/wechatforwarder/Data/a;-><init>(Ljava/lang/String;)V

    new-instance v1, Lcom/fkzhang/wechatforwarder/d/c;

    invoke-virtual {v0}, Lcom/fkzhang/wechatforwarder/Data/a;->d()Landroid/net/Uri;

    move-result-object v2

    invoke-direct {v1, p0, v2}, Lcom/fkzhang/wechatforwarder/d/c;-><init>(Landroid/content/Context;Landroid/net/Uri;)V

    iput-object v1, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->l:Lcom/fkzhang/wechatforwarder/d/c;

    new-instance v1, Lcom/fkzhang/wechatforwarder/d/f;

    invoke-virtual {v0}, Lcom/fkzhang/wechatforwarder/Data/a;->b()Landroid/net/Uri;

    move-result-object v2

    invoke-direct {v1, p0, v2}, Lcom/fkzhang/wechatforwarder/d/f;-><init>(Landroid/content/Context;Landroid/net/Uri;)V

    iput-object v1, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->m:Lcom/fkzhang/wechatforwarder/d/f;

    new-instance v1, Lcom/fkzhang/wechatforwarder/d/b;

    invoke-virtual {v0}, Lcom/fkzhang/wechatforwarder/Data/a;->c()Landroid/net/Uri;

    move-result-object v2

    invoke-direct {v1, p0, v2}, Lcom/fkzhang/wechatforwarder/d/b;-><init>(Landroid/content/Context;Landroid/net/Uri;)V

    iput-object v1, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->n:Lcom/fkzhang/wechatforwarder/d/b;

    new-instance v1, Lcom/fkzhang/wechatforwarder/d/h;

    invoke-virtual {v0}, Lcom/fkzhang/wechatforwarder/Data/a;->a()Landroid/net/Uri;

    move-result-object v0

    invoke-direct {v1, p0, v0}, Lcom/fkzhang/wechatforwarder/d/h;-><init>(Landroid/content/Context;Landroid/net/Uri;)V

    iput-object v1, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->K:Lcom/fkzhang/wechatforwarder/d/h;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->o:Ljava/util/HashMap;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->p:Ljava/util/HashMap;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->M:Ljava/util/HashMap;

    new-instance v0, Lcom/fkzhang/wechatforwarder/e/d;

    const-string v1, "com.fkzhang.wechatforwarder"

    invoke-direct {v0, p0, v1}, Lcom/fkzhang/wechatforwarder/e/d;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->Q:Lcom/fkzhang/wechatforwarder/e/d;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->P:Z

    invoke-virtual {p0}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "account"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->a(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->k()V

    const v0, 0x7f0c006a

    invoke-virtual {p0, v0}, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/design/widget/FloatingActionButton;

    iget-boolean v1, p0, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;->P:Z

    if-eqz v1, :cond_0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/support/design/widget/FloatingActionButton;->setVisibility(I)V

    :goto_0
    return-void

    :cond_0
    new-instance v1, Lcom/fkzhang/wechatforwarder/j;

    invoke-direct {v1, p0}, Lcom/fkzhang/wechatforwarder/j;-><init>(Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;)V

    invoke-virtual {v0, v1}, Landroid/support/design/widget/FloatingActionButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0
.end method
