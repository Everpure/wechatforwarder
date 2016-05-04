.class public Lcom/fkzhang/wechatforwarder/AutoForwardActivity;
.super Landroid/support/v7/a/u;


# instance fields
.field private A:Landroid/widget/Button;

.field private l:Lcom/fkzhang/wechatforwarder/d/b;

.field private m:Ljava/util/ArrayList;

.field private n:Ljava/lang/String;

.field private o:Landroid/widget/Switch;

.field private p:Landroid/widget/Switch;

.field private q:Landroid/widget/Switch;

.field private r:Landroid/widget/EditText;

.field private s:Z

.field private t:Landroid/widget/Switch;

.field private u:Landroid/widget/TextView;

.field private v:Landroid/widget/EditText;

.field private w:Landroid/widget/TextView;

.field private x:Landroid/widget/TextView;

.field private y:Landroid/widget/EditText;

.field private z:Lcom/fkzhang/wechatforwarder/e/d;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/support/v7/a/u;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/fkzhang/wechatforwarder/AutoForwardActivity;)Ljava/util/ArrayList;
    .locals 1

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->m:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic b(Lcom/fkzhang/wechatforwarder/AutoForwardActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->l()V

    return-void
.end method

.method static synthetic c(Lcom/fkzhang/wechatforwarder/AutoForwardActivity;)Lcom/fkzhang/wechatforwarder/e/d;
    .locals 1

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->z:Lcom/fkzhang/wechatforwarder/e/d;

    return-object v0
.end method

.method static synthetic d(Lcom/fkzhang/wechatforwarder/AutoForwardActivity;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->s:Z

    return v0
.end method

.method static synthetic e(Lcom/fkzhang/wechatforwarder/AutoForwardActivity;)Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->w:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic f(Lcom/fkzhang/wechatforwarder/AutoForwardActivity;)Landroid/widget/EditText;
    .locals 1

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->r:Landroid/widget/EditText;

    return-object v0
.end method

.method static synthetic g(Lcom/fkzhang/wechatforwarder/AutoForwardActivity;)Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->u:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic h(Lcom/fkzhang/wechatforwarder/AutoForwardActivity;)Landroid/widget/EditText;
    .locals 1

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->v:Landroid/widget/EditText;

    return-object v0
.end method

.method static synthetic i(Lcom/fkzhang/wechatforwarder/AutoForwardActivity;)Landroid/widget/EditText;
    .locals 1

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->y:Landroid/widget/EditText;

    return-object v0
.end method

.method static synthetic j(Lcom/fkzhang/wechatforwarder/AutoForwardActivity;)Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->x:Landroid/widget/TextView;

    return-object v0
.end method

.method private k()V
    .locals 5

    const/4 v3, 0x0

    const v0, 0x7f0c0077

    invoke-virtual {p0, v0}, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Spinner;

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->l:Lcom/fkzhang/wechatforwarder/d/b;

    invoke-virtual {v1}, Lcom/fkzhang/wechatforwarder/d/b;->a()Ljava/util/ArrayList;

    move-result-object v1

    iput-object v1, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->m:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->m:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->z:Lcom/fkzhang/wechatforwarder/e/d;

    const-string v1, "disable_contentprovider"

    invoke-virtual {v0, v1, v3}, Lcom/fkzhang/wechatforwarder/e/d;->a(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const v0, 0x7f06002b

    invoke-virtual {p0, v0}, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-static {p0, v0}, Lcom/fkzhang/wechatforwarder/e/a;->a(Landroid/app/Activity;Ljava/lang/String;)V

    :goto_1
    return-void

    :cond_0
    const v0, 0x7f06005a

    invoke-virtual {p0, v0}, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    move v2, v3

    :goto_2
    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->m:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v2, v1, :cond_2

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->m:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/fkzhang/wechatforwarder/d/a;

    invoke-virtual {v1}, Lcom/fkzhang/wechatforwarder/d/a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v2, 0x1

    move v2, v1

    goto :goto_2

    :cond_2
    new-instance v1, Landroid/widget/ArrayAdapter;

    const v2, 0x7f040044

    invoke-direct {v1, p0, v2, v4}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    const v2, 0x1090009

    invoke-virtual {v1, v2}, Landroid/widget/ArrayAdapter;->setDropDownViewResource(I)V

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    invoke-virtual {v0, v3, v3}, Landroid/widget/Spinner;->setSelection(IZ)V

    new-instance v1, Lcom/fkzhang/wechatforwarder/a;

    invoke-direct {v1, p0}, Lcom/fkzhang/wechatforwarder/a;-><init>(Lcom/fkzhang/wechatforwarder/AutoForwardActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->m:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->m:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fkzhang/wechatforwarder/d/a;

    invoke-virtual {v0}, Lcom/fkzhang/wechatforwarder/d/a;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->a(Ljava/lang/String;)V

    :cond_3
    const v0, 0x7f0c007a

    invoke-virtual {p0, v0}, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Switch;

    iput-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->o:Landroid/widget/Switch;

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->o:Landroid/widget/Switch;

    new-instance v1, Lcom/fkzhang/wechatforwarder/b;

    invoke-direct {v1, p0}, Lcom/fkzhang/wechatforwarder/b;-><init>(Lcom/fkzhang/wechatforwarder/AutoForwardActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    const v0, 0x7f0c0078

    invoke-virtual {p0, v0}, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Switch;

    iput-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->p:Landroid/widget/Switch;

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->p:Landroid/widget/Switch;

    new-instance v1, Lcom/fkzhang/wechatforwarder/c;

    invoke-direct {v1, p0}, Lcom/fkzhang/wechatforwarder/c;-><init>(Lcom/fkzhang/wechatforwarder/AutoForwardActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    const v0, 0x7f0c0079

    invoke-virtual {p0, v0}, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Switch;

    iput-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->q:Landroid/widget/Switch;

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->q:Landroid/widget/Switch;

    new-instance v1, Lcom/fkzhang/wechatforwarder/d;

    invoke-direct {v1, p0}, Lcom/fkzhang/wechatforwarder/d;-><init>(Lcom/fkzhang/wechatforwarder/AutoForwardActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    const v0, 0x7f0c007b

    invoke-virtual {p0, v0}, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->r:Landroid/widget/EditText;

    const v0, 0x7f0c007c

    invoke-virtual {p0, v0}, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->w:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->r:Landroid/widget/EditText;

    new-instance v1, Lcom/fkzhang/wechatforwarder/e;

    invoke-direct {v1, p0}, Lcom/fkzhang/wechatforwarder/e;-><init>(Lcom/fkzhang/wechatforwarder/AutoForwardActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    const v0, 0x7f0c007d

    invoke-virtual {p0, v0}, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Switch;

    iput-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->t:Landroid/widget/Switch;

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->t:Landroid/widget/Switch;

    new-instance v1, Lcom/fkzhang/wechatforwarder/f;

    invoke-direct {v1, p0}, Lcom/fkzhang/wechatforwarder/f;-><init>(Lcom/fkzhang/wechatforwarder/AutoForwardActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    const v0, 0x7f0c0081

    invoke-virtual {p0, v0}, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->x:Landroid/widget/TextView;

    const v0, 0x7f0c0080

    invoke-virtual {p0, v0}, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->y:Landroid/widget/EditText;

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->y:Landroid/widget/EditText;

    new-instance v1, Lcom/fkzhang/wechatforwarder/g;

    invoke-direct {v1, p0}, Lcom/fkzhang/wechatforwarder/g;-><init>(Lcom/fkzhang/wechatforwarder/AutoForwardActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    const v0, 0x7f0c007f

    invoke-virtual {p0, v0}, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->u:Landroid/widget/TextView;

    const v0, 0x7f0c007e

    invoke-virtual {p0, v0}, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->v:Landroid/widget/EditText;

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->v:Landroid/widget/EditText;

    new-instance v1, Lcom/fkzhang/wechatforwarder/h;

    invoke-direct {v1, p0}, Lcom/fkzhang/wechatforwarder/h;-><init>(Lcom/fkzhang/wechatforwarder/AutoForwardActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    const v0, 0x7f0c0082

    invoke-virtual {p0, v0}, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->A:Landroid/widget/Button;

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->A:Landroid/widget/Button;

    new-instance v1, Lcom/fkzhang/wechatforwarder/i;

    invoke-direct {v1, p0}, Lcom/fkzhang/wechatforwarder/i;-><init>(Lcom/fkzhang/wechatforwarder/AutoForwardActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-direct {p0}, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->l()V

    goto/16 :goto_1
.end method

.method static synthetic k(Lcom/fkzhang/wechatforwarder/AutoForwardActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->m()V

    return-void
.end method

.method private l()V
    .locals 10

    const/16 v9, 0x1388

    const/4 v8, 0x1

    const-wide v6, 0x408f400000000000L    # 1000.0

    const/4 v5, 0x0

    const/16 v4, 0x8

    invoke-virtual {p0}, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->j()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->o:Landroid/widget/Switch;

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->z:Lcom/fkzhang/wechatforwarder/e/d;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->j()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "_autoforward_enable"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v5}, Lcom/fkzhang/wechatforwarder/e/d;->a(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setChecked(Z)V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->p:Landroid/widget/Switch;

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->z:Lcom/fkzhang/wechatforwarder/e/d;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->j()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "_auto_scan_contacts_enable"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v8}, Lcom/fkzhang/wechatforwarder/e/d;->a(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setChecked(Z)V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->t:Landroid/widget/Switch;

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->z:Lcom/fkzhang/wechatforwarder/e/d;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->j()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "_resend_enable"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v5}, Lcom/fkzhang/wechatforwarder/e/d;->a(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setChecked(Z)V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->q:Landroid/widget/Switch;

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->z:Lcom/fkzhang/wechatforwarder/e/d;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->j()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "_avatar_enable"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v8}, Lcom/fkzhang/wechatforwarder/e/d;->a(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setChecked(Z)V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->r:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->z:Lcom/fkzhang/wechatforwarder/e/d;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->j()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "_autoforward_delay"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v9}, Lcom/fkzhang/wechatforwarder/e/d;->a(Ljava/lang/String;I)I

    move-result v1

    int-to-double v2, v1

    div-double/2addr v2, v6

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->v:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->z:Lcom/fkzhang/wechatforwarder/e/d;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->j()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "_resend_delay"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v9}, Lcom/fkzhang/wechatforwarder/e/d;->a(Ljava/lang/String;I)I

    move-result v1

    int-to-double v2, v1

    div-double/2addr v2, v6

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->y:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->z:Lcom/fkzhang/wechatforwarder/e/d;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->j()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "_resend_max"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x5

    invoke-virtual {v1, v2, v3}, Lcom/fkzhang/wechatforwarder/e/d;->a(Ljava/lang/String;I)I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->z:Lcom/fkzhang/wechatforwarder/e/d;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->j()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "_resend_enable"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v5}, Lcom/fkzhang/wechatforwarder/e/d;->a(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->u:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->v:Landroid/widget/EditText;

    invoke-virtual {v0, v5}, Landroid/widget/EditText;->setVisibility(I)V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->y:Landroid/widget/EditText;

    invoke-virtual {v0, v5}, Landroid/widget/EditText;->setVisibility(I)V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->x:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    :goto_1
    iget-boolean v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->s:Z

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->z:Lcom/fkzhang/wechatforwarder/e/d;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->j()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "_autoforward_enable"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v5}, Lcom/fkzhang/wechatforwarder/e/d;->a(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->w:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->r:Landroid/widget/EditText;

    invoke-virtual {v0, v5}, Landroid/widget/EditText;->setVisibility(I)V

    :goto_2
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->z:Lcom/fkzhang/wechatforwarder/e/d;

    const-string v1, "disable_contentprovider"

    invoke-virtual {v0, v1, v5}, Lcom/fkzhang/wechatforwarder/e/d;->a(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->o:Landroid/widget/Switch;

    invoke-virtual {v0, v4}, Landroid/widget/Switch;->setVisibility(I)V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->p:Landroid/widget/Switch;

    invoke-virtual {v0, v4}, Landroid/widget/Switch;->setVisibility(I)V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->q:Landroid/widget/Switch;

    invoke-virtual {v0, v4}, Landroid/widget/Switch;->setVisibility(I)V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->w:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->r:Landroid/widget/EditText;

    invoke-virtual {v0, v4}, Landroid/widget/EditText;->setVisibility(I)V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->A:Landroid/widget/Button;

    invoke-virtual {v0, v4}, Landroid/widget/Button;->setVisibility(I)V

    goto/16 :goto_0

    :cond_2
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->u:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->v:Landroid/widget/EditText;

    invoke-virtual {v0, v4}, Landroid/widget/EditText;->setVisibility(I)V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->y:Landroid/widget/EditText;

    invoke-virtual {v0, v4}, Landroid/widget/EditText;->setVisibility(I)V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->x:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->w:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->r:Landroid/widget/EditText;

    invoke-virtual {v0, v4}, Landroid/widget/EditText;->setVisibility(I)V

    goto :goto_2

    :cond_4
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->w:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->r:Landroid/widget/EditText;

    invoke-virtual {v0, v4}, Landroid/widget/EditText;->setVisibility(I)V

    goto :goto_2
.end method

.method private m()V
    .locals 3

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/fkzhang/wechatforwarder/AutoForwardListActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "account"

    invoke-virtual {p0}, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->j()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0, v0}, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->n:Ljava/lang/String;

    return-void
.end method

.method public j()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->n:Ljava/lang/String;

    return-object v0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Landroid/support/v7/a/u;->onCreate(Landroid/os/Bundle;)V

    const v0, 0x7f040019

    invoke-virtual {p0, v0}, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->setContentView(I)V

    const v0, 0x7f0c0069

    invoke-virtual {p0, v0}, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/Toolbar;

    invoke-virtual {p0, v0}, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->a(Landroid/support/v7/widget/Toolbar;)V

    new-instance v0, Lcom/fkzhang/wechatforwarder/Data/a;

    const-string v1, "com.fkzhang.wechatforwarder"

    invoke-direct {v0, v1}, Lcom/fkzhang/wechatforwarder/Data/a;-><init>(Ljava/lang/String;)V

    new-instance v1, Lcom/fkzhang/wechatforwarder/d/b;

    invoke-virtual {v0}, Lcom/fkzhang/wechatforwarder/Data/a;->c()Landroid/net/Uri;

    move-result-object v0

    invoke-direct {v1, p0, v0}, Lcom/fkzhang/wechatforwarder/d/b;-><init>(Landroid/content/Context;Landroid/net/Uri;)V

    iput-object v1, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->l:Lcom/fkzhang/wechatforwarder/d/b;

    new-instance v0, Lcom/fkzhang/wechatforwarder/e/d;

    const-string v1, "com.fkzhang.wechatforwarder"

    invoke-direct {v0, p0, v1}, Lcom/fkzhang/wechatforwarder/e/d;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->z:Lcom/fkzhang/wechatforwarder/e/d;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->s:Z

    invoke-direct {p0}, Lcom/fkzhang/wechatforwarder/AutoForwardActivity;->k()V

    return-void
.end method
