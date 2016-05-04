.class public Lcom/fkzhang/wechatforwarder/MainActivity;
.super Landroid/support/v7/a/u;

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field private A:Landroid/graphics/Bitmap;

.field private B:Landroid/widget/Switch;

.field private l:Landroid/view/MenuItem;

.field private m:Lcom/fkzhang/wechatforwarder/e/d;

.field private n:Landroid/widget/TextView;

.field private o:Landroid/widget/EditText;

.field private p:Landroid/widget/Switch;

.field private q:Landroid/net/Uri;

.field private r:Landroid/widget/ImageView;

.field private s:Ljava/io/File;

.field private t:Landroid/view/View;

.field private u:Landroid/widget/TextView;

.field private v:Landroid/widget/EditText;

.field private w:Landroid/widget/TextView;

.field private x:Landroid/widget/EditText;

.field private y:Landroid/widget/ImageView;

.field private z:Landroid/graphics/Bitmap;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/support/v7/a/u;-><init>()V

    return-void
.end method

.method private a(Landroid/net/Uri;)Landroid/graphics/Bitmap;
    .locals 4

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p0}, Lcom/fkzhang/wechatforwarder/MainActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v2

    if-eqz v2, :cond_0

    const/4 v0, 0x0

    const/4 v3, 0x0

    invoke-static {v2, v0, v3}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_0
    move-object v0, v1

    goto :goto_0
.end method

.method static synthetic a(Lcom/fkzhang/wechatforwarder/MainActivity;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 0

    iput-object p1, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->A:Landroid/graphics/Bitmap;

    return-object p1
.end method

.method static synthetic a(Lcom/fkzhang/wechatforwarder/MainActivity;)Lcom/fkzhang/wechatforwarder/e/d;
    .locals 1

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->m:Lcom/fkzhang/wechatforwarder/e/d;

    return-object v0
.end method

.method private a(I)V
    .locals 2

    :try_start_0
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "image/*"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "android.intent.action.GET_CONTENT"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "android.intent.category.OPENABLE"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    const v1, 0x7f06005f

    invoke-virtual {p0, v1}, Lcom/fkzhang/wechatforwarder/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lcom/fkzhang/wechatforwarder/MainActivity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_0
.end method

.method static synthetic a(Lcom/fkzhang/wechatforwarder/MainActivity;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/fkzhang/wechatforwarder/MainActivity;->a(I)V

    return-void
.end method

.method static synthetic a(Lcom/fkzhang/wechatforwarder/MainActivity;Ljava/lang/Class;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/fkzhang/wechatforwarder/MainActivity;->a(Ljava/lang/Class;)V

    return-void
.end method

.method private a(Ljava/lang/Class;)V
    .locals 1

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0, p0, p1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/fkzhang/wechatforwarder/MainActivity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method static synthetic b(Lcom/fkzhang/wechatforwarder/MainActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/fkzhang/wechatforwarder/MainActivity;->n()V

    return-void
.end method

.method private b(Z)V
    .locals 4

    const/4 v1, 0x1

    invoke-virtual {p0}, Lcom/fkzhang/wechatforwarder/MainActivity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    if-eqz p1, :cond_0

    move v0, v1

    :goto_0
    invoke-direct {p0}, Lcom/fkzhang/wechatforwarder/MainActivity;->l()Landroid/content/ComponentName;

    move-result-object v3

    invoke-virtual {v2, v3, v0, v1}, Landroid/content/pm/PackageManager;->setComponentEnabledSetting(Landroid/content/ComponentName;II)V

    return-void

    :cond_0
    const/4 v0, 0x2

    goto :goto_0
.end method

.method static synthetic c(Lcom/fkzhang/wechatforwarder/MainActivity;)Ljava/io/File;
    .locals 1

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->s:Ljava/io/File;

    return-object v0
.end method

.method static synthetic d(Lcom/fkzhang/wechatforwarder/MainActivity;)Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->r:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic e(Lcom/fkzhang/wechatforwarder/MainActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/fkzhang/wechatforwarder/MainActivity;->o()V

    return-void
.end method

.method static synthetic f(Lcom/fkzhang/wechatforwarder/MainActivity;)Landroid/graphics/Bitmap;
    .locals 1

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->z:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method static synthetic g(Lcom/fkzhang/wechatforwarder/MainActivity;)Landroid/graphics/Bitmap;
    .locals 1

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->A:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method static synthetic h(Lcom/fkzhang/wechatforwarder/MainActivity;)Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->y:Landroid/widget/ImageView;

    return-object v0
.end method

.method private k()V
    .locals 2

    invoke-direct {p0}, Lcom/fkzhang/wechatforwarder/MainActivity;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->l:Landroid/view/MenuItem;

    const v1, 0x7f060048

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setTitle(I)Landroid/view/MenuItem;

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->l:Landroid/view/MenuItem;

    const v1, 0x7f060069

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setTitle(I)Landroid/view/MenuItem;

    goto :goto_0
.end method

.method private l()Landroid/content/ComponentName;
    .locals 2

    new-instance v0, Landroid/content/ComponentName;

    const-string v1, "com.fkzhang.wechatforwarder.MainActivity-Alias"

    invoke-direct {v0, p0, v1}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    return-object v0
.end method

.method private m()Z
    .locals 3

    const/4 v0, 0x1

    invoke-virtual {p0}, Lcom/fkzhang/wechatforwarder/MainActivity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-direct {p0}, Lcom/fkzhang/wechatforwarder/MainActivity;->l()Landroid/content/ComponentName;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/content/pm/PackageManager;->getComponentEnabledSetting(Landroid/content/ComponentName;)I

    move-result v1

    if-ne v1, v0, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private n()V
    .locals 13

    const/16 v12, 0x8

    const/4 v11, 0x1

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->q:Landroid/net/Uri;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/fkzhang/wechatforwarder/MainActivity;->getCacheDir()Ljava/io/File;

    move-result-object v0

    new-instance v1, Ljava/io/File;

    const-string v2, "watermark_img.png"

    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->s:Ljava/io/File;

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->s:Ljava/io/File;

    invoke-static {v0}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->q:Landroid/net/Uri;

    :cond_0
    new-instance v7, Landroid/support/v7/a/t;

    invoke-direct {v7, p0}, Landroid/support/v7/a/t;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0}, Lcom/fkzhang/wechatforwarder/MainActivity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f040033

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v8

    const v0, 0x7f0c00cf

    invoke-virtual {v8, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    const v1, 0x7f0c00c4

    invoke-virtual {v8, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    const v2, 0x7f0c00c5

    invoke-virtual {v8, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    iput-object v2, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->r:Landroid/widget/ImageView;

    iget-object v2, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->r:Landroid/widget/ImageView;

    new-instance v3, Lcom/fkzhang/wechatforwarder/bg;

    invoke-direct {v3, p0}, Lcom/fkzhang/wechatforwarder/bg;-><init>(Lcom/fkzhang/wechatforwarder/MainActivity;)V

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    const v2, 0x7f0c00db

    invoke-virtual {v8, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    iput-object v2, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->y:Landroid/widget/ImageView;

    iget-object v2, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->s:Ljava/io/File;

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->s:Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->q:Landroid/net/Uri;

    invoke-direct {p0, v2}, Lcom/fkzhang/wechatforwarder/MainActivity;->a(Landroid/net/Uri;)Landroid/graphics/Bitmap;

    move-result-object v2

    iput-object v2, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->A:Landroid/graphics/Bitmap;

    iget-object v2, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->r:Landroid/widget/ImageView;

    iget-object v3, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->q:Landroid/net/Uri;

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageURI(Landroid/net/Uri;)V

    :cond_1
    iget-object v2, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->m:Lcom/fkzhang/wechatforwarder/e/d;

    const-string v3, "img_watermark_text"

    const-string v4, ""

    invoke-virtual {v2, v3, v4}, Lcom/fkzhang/wechatforwarder/e/d;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    new-instance v2, Lcom/fkzhang/wechatforwarder/bh;

    invoke-direct {v2, p0}, Lcom/fkzhang/wechatforwarder/bh;-><init>(Lcom/fkzhang/wechatforwarder/MainActivity;)V

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    new-instance v0, Lcom/fkzhang/wechatforwarder/ao;

    invoke-direct {v0, p0}, Lcom/fkzhang/wechatforwarder/ao;-><init>(Lcom/fkzhang/wechatforwarder/MainActivity;)V

    invoke-virtual {v1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f0c00d9

    invoke-virtual {v8, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v2, Lcom/fkzhang/wechatforwarder/ap;

    invoke-direct {v2, p0}, Lcom/fkzhang/wechatforwarder/ap;-><init>(Lcom/fkzhang/wechatforwarder/MainActivity;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f0c00da

    invoke-virtual {v8, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v2, Lcom/fkzhang/wechatforwarder/aq;

    invoke-direct {v2, p0}, Lcom/fkzhang/wechatforwarder/aq;-><init>(Lcom/fkzhang/wechatforwarder/MainActivity;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f0c00d0

    invoke-virtual {v8, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iget-object v2, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->m:Lcom/fkzhang/wechatforwarder/e/d;

    const-string v3, "watermark_text_size"

    const/16 v4, 0x32

    invoke-virtual {v2, v3, v4}, Lcom/fkzhang/wechatforwarder/e/d;->a(Ljava/lang/String;I)I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    new-instance v2, Lcom/fkzhang/wechatforwarder/ar;

    invoke-direct {v2, p0}, Lcom/fkzhang/wechatforwarder/ar;-><init>(Lcom/fkzhang/wechatforwarder/MainActivity;)V

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    const v0, 0x7f0c00c9

    invoke-virtual {v8, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioGroup;

    const v2, 0x7f0c00ca

    invoke-virtual {v8, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/RadioButton;

    const v3, 0x7f0c00cb

    invoke-virtual {v8, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/RadioButton;

    const v4, 0x7f0c00cc

    invoke-virtual {v8, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/RadioButton;

    const v5, 0x7f0c00cd

    invoke-virtual {v8, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/RadioButton;

    iget-object v6, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->m:Lcom/fkzhang/wechatforwarder/e/d;

    const-string v9, "watermark_img_place"

    const/4 v10, 0x4

    invoke-virtual {v6, v9, v10}, Lcom/fkzhang/wechatforwarder/e/d;->a(Ljava/lang/String;I)I

    move-result v6

    packed-switch v6, :pswitch_data_0

    :goto_0
    new-instance v2, Lcom/fkzhang/wechatforwarder/as;

    invoke-direct {v2, p0}, Lcom/fkzhang/wechatforwarder/as;-><init>(Lcom/fkzhang/wechatforwarder/MainActivity;)V

    invoke-virtual {v0, v2}, Landroid/widget/RadioGroup;->setOnCheckedChangeListener(Landroid/widget/RadioGroup$OnCheckedChangeListener;)V

    const v2, 0x7f0c00d4

    invoke-virtual {v8, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/RadioGroup;

    const v3, 0x7f0c00d5

    invoke-virtual {v8, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/RadioButton;

    const v4, 0x7f0c00d6

    invoke-virtual {v8, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/RadioButton;

    const v5, 0x7f0c00d7

    invoke-virtual {v8, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/RadioButton;

    const v6, 0x7f0c00d8

    invoke-virtual {v8, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/RadioButton;

    iget-object v9, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->m:Lcom/fkzhang/wechatforwarder/e/d;

    const-string v10, "watermark_text_place"

    invoke-virtual {v9, v10, v11}, Lcom/fkzhang/wechatforwarder/e/d;->a(Ljava/lang/String;I)I

    move-result v9

    packed-switch v9, :pswitch_data_1

    :goto_1
    new-instance v3, Lcom/fkzhang/wechatforwarder/at;

    invoke-direct {v3, p0}, Lcom/fkzhang/wechatforwarder/at;-><init>(Lcom/fkzhang/wechatforwarder/MainActivity;)V

    invoke-virtual {v2, v3}, Landroid/widget/RadioGroup;->setOnCheckedChangeListener(Landroid/widget/RadioGroup$OnCheckedChangeListener;)V

    const v2, 0x7f0c00d2

    invoke-virtual {v8, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    new-instance v3, Lcom/fkzhang/wechatforwarder/au;

    invoke-direct {v3, p0}, Lcom/fkzhang/wechatforwarder/au;-><init>(Lcom/fkzhang/wechatforwarder/MainActivity;)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v2, 0x7f0c00c7

    invoke-virtual {v8, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/SeekBar;

    iget-object v3, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->m:Lcom/fkzhang/wechatforwarder/e/d;

    const-string v4, "watermark_img_alpha"

    const/16 v5, 0x64

    invoke-virtual {v3, v4, v5}, Lcom/fkzhang/wechatforwarder/e/d;->a(Ljava/lang/String;I)I

    move-result v3

    int-to-double v4, v3

    const-wide v10, 0x406fc00000000000L    # 254.0

    div-double/2addr v4, v10

    const-wide/high16 v10, 0x4059000000000000L    # 100.0

    mul-double/2addr v4, v10

    double-to-int v3, v4

    invoke-virtual {v2, v3}, Landroid/widget/SeekBar;->setProgress(I)V

    new-instance v3, Lcom/fkzhang/wechatforwarder/av;

    invoke-direct {v3, p0}, Lcom/fkzhang/wechatforwarder/av;-><init>(Lcom/fkzhang/wechatforwarder/MainActivity;)V

    invoke-virtual {v2, v3}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    iget-object v3, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->m:Lcom/fkzhang/wechatforwarder/e/d;

    const-string v4, "disable_contentprovider"

    const/4 v5, 0x0

    invoke-virtual {v3, v4, v5}, Lcom/fkzhang/wechatforwarder/e/d;->a(Ljava/lang/String;Z)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v1, v12}, Landroid/widget/Button;->setVisibility(I)V

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->r:Landroid/widget/ImageView;

    invoke-virtual {v1, v12}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-virtual {v2, v12}, Landroid/widget/SeekBar;->setVisibility(I)V

    invoke-virtual {v0, v12}, Landroid/widget/RadioGroup;->setVisibility(I)V

    const v0, 0x7f0c00c3

    invoke-virtual {v8, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v12}, Landroid/view/View;->setVisibility(I)V

    const v0, 0x7f0c00c6

    invoke-virtual {v8, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v12}, Landroid/view/View;->setVisibility(I)V

    const v0, 0x7f0c00c8

    invoke-virtual {v8, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v12}, Landroid/view/View;->setVisibility(I)V

    :cond_2
    invoke-virtual {v7, v8}, Landroid/support/v7/a/t;->b(Landroid/view/View;)Landroid/support/v7/a/t;

    move-result-object v0

    const v1, 0x7f060067

    invoke-virtual {v0, v1}, Landroid/support/v7/a/t;->a(I)Landroid/support/v7/a/t;

    move-result-object v0

    const v1, 0x104000a

    new-instance v2, Lcom/fkzhang/wechatforwarder/aw;

    invoke-direct {v2, p0}, Lcom/fkzhang/wechatforwarder/aw;-><init>(Lcom/fkzhang/wechatforwarder/MainActivity;)V

    invoke-virtual {v0, v1, v2}, Landroid/support/v7/a/t;->a(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/a/t;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/a/t;->b()Landroid/support/v7/a/s;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/a/s;->show()V

    return-void

    :pswitch_0
    invoke-virtual {v2, v11}, Landroid/widget/RadioButton;->setChecked(Z)V

    goto/16 :goto_0

    :pswitch_1
    invoke-virtual {v3, v11}, Landroid/widget/RadioButton;->setChecked(Z)V

    goto/16 :goto_0

    :pswitch_2
    invoke-virtual {v4, v11}, Landroid/widget/RadioButton;->setChecked(Z)V

    goto/16 :goto_0

    :pswitch_3
    invoke-virtual {v5, v11}, Landroid/widget/RadioButton;->setChecked(Z)V

    goto/16 :goto_0

    :pswitch_4
    invoke-virtual {v3, v11}, Landroid/widget/RadioButton;->setChecked(Z)V

    goto/16 :goto_1

    :pswitch_5
    invoke-virtual {v4, v11}, Landroid/widget/RadioButton;->setChecked(Z)V

    goto/16 :goto_1

    :pswitch_6
    invoke-virtual {v5, v11}, Landroid/widget/RadioButton;->setChecked(Z)V

    goto/16 :goto_1

    :pswitch_7
    invoke-virtual {v6, v11}, Landroid/widget/RadioButton;->setChecked(Z)V

    goto/16 :goto_1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
    .end packed-switch
.end method

.method private o()V
    .locals 2

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v1, Lcom/fkzhang/wechatforwarder/ba;

    invoke-direct {v1, p0}, Lcom/fkzhang/wechatforwarder/ba;-><init>(Lcom/fkzhang/wechatforwarder/MainActivity;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method


# virtual methods
.method protected j()V
    .locals 6

    new-instance v1, Landroid/support/v7/a/t;

    invoke-direct {v1, p0}, Landroid/support/v7/a/t;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0}, Lcom/fkzhang/wechatforwarder/MainActivity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    const v2, 0x7f040031

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    const v0, 0x7f0c00bb

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/rarepebble/colorpicker/ColorPickerView;

    iget-object v3, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->m:Lcom/fkzhang/wechatforwarder/e/d;

    const-string v4, "watermark_text_color"

    const v5, -0xff9c

    invoke-virtual {v3, v4, v5}, Lcom/fkzhang/wechatforwarder/e/d;->a(Ljava/lang/String;I)I

    move-result v3

    invoke-virtual {v0, v3}, Lcom/rarepebble/colorpicker/ColorPickerView;->setColor(I)V

    invoke-virtual {v1, v2}, Landroid/support/v7/a/t;->b(Landroid/view/View;)Landroid/support/v7/a/t;

    move-result-object v1

    const v2, 0x7f060066

    invoke-virtual {v1, v2}, Landroid/support/v7/a/t;->a(I)Landroid/support/v7/a/t;

    move-result-object v1

    const v2, 0x104000a

    new-instance v3, Lcom/fkzhang/wechatforwarder/az;

    invoke-direct {v3, p0, v0}, Lcom/fkzhang/wechatforwarder/az;-><init>(Lcom/fkzhang/wechatforwarder/MainActivity;Lcom/rarepebble/colorpicker/ColorPickerView;)V

    invoke-virtual {v1, v2, v3}, Landroid/support/v7/a/t;->a(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/a/t;

    move-result-object v0

    const/high16 v1, 0x1040000

    new-instance v2, Lcom/fkzhang/wechatforwarder/ax;

    invoke-direct {v2, p0}, Lcom/fkzhang/wechatforwarder/ax;-><init>(Lcom/fkzhang/wechatforwarder/MainActivity;)V

    invoke-virtual {v0, v1, v2}, Landroid/support/v7/a/t;->b(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/a/t;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/a/t;->b()Landroid/support/v7/a/s;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/a/s;->show()V

    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 3

    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    sparse-switch p1, :sswitch_data_0

    :cond_0
    :goto_0
    return-void

    :sswitch_0
    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->q:Landroid/net/Uri;

    invoke-static {v0, v1}, Lcom/yalantis/ucrop/k;->a(Landroid/net/Uri;Landroid/net/Uri;)Lcom/yalantis/ucrop/k;

    move-result-object v0

    new-instance v1, Lcom/yalantis/ucrop/l;

    invoke-direct {v1}, Lcom/yalantis/ucrop/l;-><init>()V

    sget-object v2, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    invoke-virtual {v1, v2}, Lcom/yalantis/ucrop/l;->a(Landroid/graphics/Bitmap$CompressFormat;)V

    const/16 v2, 0x64

    invoke-virtual {v1, v2}, Lcom/yalantis/ucrop/l;->a(I)V

    invoke-virtual {v0, v1}, Lcom/yalantis/ucrop/k;->a(Lcom/yalantis/ucrop/l;)Lcom/yalantis/ucrop/k;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/yalantis/ucrop/k;->a(Landroid/app/Activity;)V

    goto :goto_0

    :sswitch_1
    invoke-static {p3}, Lcom/yalantis/ucrop/k;->a(Landroid/content/Intent;)Landroid/net/Uri;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->q:Landroid/net/Uri;

    invoke-direct {p0, v0}, Lcom/fkzhang/wechatforwarder/MainActivity;->a(Landroid/net/Uri;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->A:Landroid/graphics/Bitmap;

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->r:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->A:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    invoke-direct {p0}, Lcom/fkzhang/wechatforwarder/MainActivity;->o()V

    goto :goto_0

    :sswitch_2
    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/fkzhang/wechatforwarder/MainActivity;->a(Landroid/net/Uri;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->z:Landroid/graphics/Bitmap;

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->z:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->y:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->z:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    invoke-direct {p0}, Lcom/fkzhang/wechatforwarder/MainActivity;->o()V

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_2
        0x45 -> :sswitch_1
    .end sparse-switch
.end method

.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 4

    const/16 v3, 0x8

    const/4 v2, 0x0

    invoke-virtual {p1}, Landroid/widget/CompoundButton;->getId()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    :goto_0
    :pswitch_0
    return-void

    :pswitch_1
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->m:Lcom/fkzhang/wechatforwarder/e/d;

    const-string v1, "sight_duration_change_enable"

    invoke-virtual {v0, v1, p2}, Lcom/fkzhang/wechatforwarder/e/d;->b(Ljava/lang/String;Z)V

    if-eqz p2, :cond_0

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->n:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->o:Landroid/widget/EditText;

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->setVisibility(I)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->n:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->o:Landroid/widget/EditText;

    invoke-virtual {v0, v3}, Landroid/widget/EditText;->setVisibility(I)V

    goto :goto_0

    :pswitch_2
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->m:Lcom/fkzhang/wechatforwarder/e/d;

    const-string v1, "chat_forward_enable"

    invoke-virtual {v0, v1, p2}, Lcom/fkzhang/wechatforwarder/e/d;->b(Ljava/lang/String;Z)V

    goto :goto_0

    :pswitch_3
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->m:Lcom/fkzhang/wechatforwarder/e/d;

    const-string v1, "multi_image_forward_enable"

    invoke-virtual {v0, v1, p2}, Lcom/fkzhang/wechatforwarder/e/d;->b(Ljava/lang/String;Z)V

    goto :goto_0

    :pswitch_4
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->m:Lcom/fkzhang/wechatforwarder/e/d;

    const-string v1, "multi_voice_forward_enable"

    invoke-virtual {v0, v1, p2}, Lcom/fkzhang/wechatforwarder/e/d;->b(Ljava/lang/String;Z)V

    goto :goto_0

    :pswitch_5
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->m:Lcom/fkzhang/wechatforwarder/e/d;

    const-string v1, "sns_forward_enable"

    invoke-virtual {v0, v1, p2}, Lcom/fkzhang/wechatforwarder/e/d;->b(Ljava/lang/String;Z)V

    goto :goto_0

    :pswitch_6
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->m:Lcom/fkzhang/wechatforwarder/e/d;

    const-string v1, "voice_forward_enable"

    invoke-virtual {v0, v1, p2}, Lcom/fkzhang/wechatforwarder/e/d;->b(Ljava/lang/String;Z)V

    goto :goto_0

    :pswitch_7
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->m:Lcom/fkzhang/wechatforwarder/e/d;

    const-string v1, "favorite_forward_enable"

    invoke-virtual {v0, v1, p2}, Lcom/fkzhang/wechatforwarder/e/d;->b(Ljava/lang/String;Z)V

    goto :goto_0

    :pswitch_8
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->m:Lcom/fkzhang/wechatforwarder/e/d;

    const-string v1, "record_forward_enable"

    invoke-virtual {v0, v1, p2}, Lcom/fkzhang/wechatforwarder/e/d;->b(Ljava/lang/String;Z)V

    goto :goto_0

    :pswitch_9
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->m:Lcom/fkzhang/wechatforwarder/e/d;

    const-string v1, "friendcard_forward_enable"

    invoke-virtual {v0, v1, p2}, Lcom/fkzhang/wechatforwarder/e/d;->b(Ljava/lang/String;Z)V

    goto :goto_0

    :pswitch_a
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->m:Lcom/fkzhang/wechatforwarder/e/d;

    const-string v1, "img_autodownload_enable"

    invoke-virtual {v0, v1, p2}, Lcom/fkzhang/wechatforwarder/e/d;->b(Ljava/lang/String;Z)V

    if-eqz p2, :cond_1

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->p:Landroid/widget/Switch;

    invoke-virtual {v0, v2}, Landroid/widget/Switch;->setVisibility(I)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->p:Landroid/widget/Switch;

    invoke-virtual {v0, v3}, Landroid/widget/Switch;->setVisibility(I)V

    goto :goto_0

    :pswitch_b
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->m:Lcom/fkzhang/wechatforwarder/e/d;

    const-string v1, "show_img_progress"

    invoke-virtual {v0, v1, p2}, Lcom/fkzhang/wechatforwarder/e/d;->b(Ljava/lang/String;Z)V

    goto :goto_0

    :pswitch_c
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->m:Lcom/fkzhang/wechatforwarder/e/d;

    const-string v1, "img_to_friend_forward_enable"

    invoke-virtual {v0, v1, p2}, Lcom/fkzhang/wechatforwarder/e/d;->b(Ljava/lang/String;Z)V

    goto/16 :goto_0

    :pswitch_d
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->m:Lcom/fkzhang/wechatforwarder/e/d;

    const-string v1, "add_img_watermark"

    invoke-virtual {v0, v1, p2}, Lcom/fkzhang/wechatforwarder/e/d;->b(Ljava/lang/String;Z)V

    if-eqz p2, :cond_2

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->t:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_0

    :cond_2
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->t:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_0

    :pswitch_e
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->m:Lcom/fkzhang/wechatforwarder/e/d;

    const-string v1, "broadcast_forward_enable"

    invoke-virtual {v0, v1, p2}, Lcom/fkzhang/wechatforwarder/e/d;->b(Ljava/lang/String;Z)V

    goto/16 :goto_0

    :pswitch_f
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->m:Lcom/fkzhang/wechatforwarder/e/d;

    const-string v1, "multi_broadcast_forward_enable"

    invoke-virtual {v0, v1, p2}, Lcom/fkzhang/wechatforwarder/e/d;->b(Ljava/lang/String;Z)V

    goto/16 :goto_0

    :pswitch_10
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->m:Lcom/fkzhang/wechatforwarder/e/d;

    const-string v1, "voice_duration_change_enable"

    invoke-virtual {v0, v1, p2}, Lcom/fkzhang/wechatforwarder/e/d;->b(Ljava/lang/String;Z)V

    if-eqz p2, :cond_3

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->u:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->v:Landroid/widget/EditText;

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->setVisibility(I)V

    goto/16 :goto_0

    :cond_3
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->u:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->v:Landroid/widget/EditText;

    invoke-virtual {v0, v3}, Landroid/widget/EditText;->setVisibility(I)V

    goto/16 :goto_0

    :pswitch_11
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->m:Lcom/fkzhang/wechatforwarder/e/d;

    const-string v1, "voice_wrong_length_enable"

    invoke-virtual {v0, v1, p2}, Lcom/fkzhang/wechatforwarder/e/d;->b(Ljava/lang/String;Z)V

    if-eqz p2, :cond_4

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->w:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->x:Landroid/widget/EditText;

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->setVisibility(I)V

    goto/16 :goto_0

    :cond_4
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->w:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->x:Landroid/widget/EditText;

    invoke-virtual {v0, v3}, Landroid/widget/EditText;->setVisibility(I)V

    goto/16 :goto_0

    :pswitch_12
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->m:Lcom/fkzhang/wechatforwarder/e/d;

    const-string v1, "disable_contentprovider"

    invoke-virtual {v0, v1, p2}, Lcom/fkzhang/wechatforwarder/e/d;->b(Ljava/lang/String;Z)V

    const v0, 0x7f060059

    invoke-virtual {p0, v0}, Lcom/fkzhang/wechatforwarder/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/fkzhang/wechatforwarder/e/a;->a(Landroid/app/Activity;Ljava/lang/String;)V

    goto/16 :goto_0

    :pswitch_13
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->m:Lcom/fkzhang/wechatforwarder/e/d;

    const-string v1, "selective_copy_enable"

    invoke-virtual {v0, v1, p2}, Lcom/fkzhang/wechatforwarder/e/d;->b(Ljava/lang/String;Z)V

    goto/16 :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x7f0c0088
        :pswitch_2
        :pswitch_5
        :pswitch_3
        :pswitch_8
        :pswitch_a
        :pswitch_b
        :pswitch_d
        :pswitch_0
        :pswitch_0
        :pswitch_6
        :pswitch_4
        :pswitch_9
        :pswitch_c
        :pswitch_e
        :pswitch_f
        :pswitch_0
        :pswitch_7
        :pswitch_0
        :pswitch_12
        :pswitch_13
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_10
        :pswitch_0
        :pswitch_0
        :pswitch_11
    .end packed-switch
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 9

    const v8, 0x7f0c0082

    const-wide v6, 0x408f400000000000L    # 1000.0

    const/16 v5, 0x8

    const/4 v4, 0x0

    invoke-super {p0, p1}, Landroid/support/v7/a/u;->onCreate(Landroid/os/Bundle;)V

    const v0, 0x7f04001b

    invoke-virtual {p0, v0}, Lcom/fkzhang/wechatforwarder/MainActivity;->setContentView(I)V

    const v0, 0x7f0c0069

    invoke-virtual {p0, v0}, Lcom/fkzhang/wechatforwarder/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/Toolbar;

    invoke-virtual {p0, v0}, Lcom/fkzhang/wechatforwarder/MainActivity;->a(Landroid/support/v7/widget/Toolbar;)V

    new-instance v0, Lcom/fkzhang/wechatforwarder/e/d;

    const-string v1, "com.fkzhang.wechatforwarder"

    invoke-direct {v0, p0, v1}, Lcom/fkzhang/wechatforwarder/e/d;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->m:Lcom/fkzhang/wechatforwarder/e/d;

    const v0, 0x7f0c009d

    invoke-virtual {p0, v0}, Lcom/fkzhang/wechatforwarder/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Switch;

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->m:Lcom/fkzhang/wechatforwarder/e/d;

    const-string v2, "sight_duration_change_enable"

    invoke-virtual {v1, v2, v4}, Lcom/fkzhang/wechatforwarder/e/d;->a(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setChecked(Z)V

    invoke-virtual {v0, p0}, Landroid/widget/Switch;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    const v0, 0x7f0c009f

    invoke-virtual {p0, v0}, Lcom/fkzhang/wechatforwarder/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->n:Landroid/widget/TextView;

    const v0, 0x7f0c009e

    invoke-virtual {p0, v0}, Lcom/fkzhang/wechatforwarder/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->o:Landroid/widget/EditText;

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->m:Lcom/fkzhang/wechatforwarder/e/d;

    const-string v1, "sight_duration"

    const/16 v2, 0x1964

    invoke-virtual {v0, v1, v2}, Lcom/fkzhang/wechatforwarder/e/d;->a(Ljava/lang/String;I)I

    move-result v0

    int-to-double v0, v0

    div-double/2addr v0, v6

    iget-object v2, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->o:Landroid/widget/EditText;

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->o:Landroid/widget/EditText;

    new-instance v1, Lcom/fkzhang/wechatforwarder/an;

    invoke-direct {v1, p0}, Lcom/fkzhang/wechatforwarder/an;-><init>(Lcom/fkzhang/wechatforwarder/MainActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->m:Lcom/fkzhang/wechatforwarder/e/d;

    const-string v1, "sight_duration_change_enable"

    invoke-virtual {v0, v1, v4}, Lcom/fkzhang/wechatforwarder/e/d;->a(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->n:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->o:Landroid/widget/EditText;

    invoke-virtual {v0, v5}, Landroid/widget/EditText;->setVisibility(I)V

    :cond_0
    const v0, 0x7f0c00a0

    invoke-virtual {p0, v0}, Lcom/fkzhang/wechatforwarder/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Switch;

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->m:Lcom/fkzhang/wechatforwarder/e/d;

    const-string v2, "voice_duration_change_enable"

    invoke-virtual {v1, v2, v4}, Lcom/fkzhang/wechatforwarder/e/d;->a(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setChecked(Z)V

    invoke-virtual {v0, p0}, Landroid/widget/Switch;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    const v0, 0x7f0c00a2

    invoke-virtual {p0, v0}, Lcom/fkzhang/wechatforwarder/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->u:Landroid/widget/TextView;

    const v0, 0x7f0c00a1

    invoke-virtual {p0, v0}, Lcom/fkzhang/wechatforwarder/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->v:Landroid/widget/EditText;

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->m:Lcom/fkzhang/wechatforwarder/e/d;

    const-string v1, "voice_duration"

    const v2, 0xea60

    invoke-virtual {v0, v1, v2}, Lcom/fkzhang/wechatforwarder/e/d;->a(Ljava/lang/String;I)I

    move-result v0

    int-to-double v0, v0

    div-double/2addr v0, v6

    iget-object v2, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->v:Landroid/widget/EditText;

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->v:Landroid/widget/EditText;

    new-instance v1, Lcom/fkzhang/wechatforwarder/ay;

    invoke-direct {v1, p0}, Lcom/fkzhang/wechatforwarder/ay;-><init>(Lcom/fkzhang/wechatforwarder/MainActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->m:Lcom/fkzhang/wechatforwarder/e/d;

    const-string v1, "voice_duration_change_enable"

    invoke-virtual {v0, v1, v4}, Lcom/fkzhang/wechatforwarder/e/d;->a(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->u:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->v:Landroid/widget/EditText;

    invoke-virtual {v0, v5}, Landroid/widget/EditText;->setVisibility(I)V

    :cond_1
    const v0, 0x7f0c00a3

    invoke-virtual {p0, v0}, Lcom/fkzhang/wechatforwarder/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Switch;

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->m:Lcom/fkzhang/wechatforwarder/e/d;

    const-string v2, "voice_wrong_length_enable"

    invoke-virtual {v1, v2, v4}, Lcom/fkzhang/wechatforwarder/e/d;->a(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setChecked(Z)V

    invoke-virtual {v0, p0}, Landroid/widget/Switch;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    const v0, 0x7f0c00a5

    invoke-virtual {p0, v0}, Lcom/fkzhang/wechatforwarder/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->w:Landroid/widget/TextView;

    const v0, 0x7f0c00a4

    invoke-virtual {p0, v0}, Lcom/fkzhang/wechatforwarder/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->x:Landroid/widget/EditText;

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->m:Lcom/fkzhang/wechatforwarder/e/d;

    const-string v1, "voice_length"

    const/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2}, Lcom/fkzhang/wechatforwarder/e/d;->a(Ljava/lang/String;I)I

    move-result v0

    div-int/lit16 v0, v0, 0x3e8

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->x:Landroid/widget/EditText;

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->x:Landroid/widget/EditText;

    new-instance v1, Lcom/fkzhang/wechatforwarder/bb;

    invoke-direct {v1, p0}, Lcom/fkzhang/wechatforwarder/bb;-><init>(Lcom/fkzhang/wechatforwarder/MainActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->m:Lcom/fkzhang/wechatforwarder/e/d;

    const-string v1, "voice_wrong_length_enable"

    invoke-virtual {v0, v1, v4}, Lcom/fkzhang/wechatforwarder/e/d;->a(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->x:Landroid/widget/EditText;

    invoke-virtual {v0, v5}, Landroid/widget/EditText;->setVisibility(I)V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->w:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    :cond_2
    const v0, 0x7f0c0088

    invoke-virtual {p0, v0}, Lcom/fkzhang/wechatforwarder/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Switch;

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->m:Lcom/fkzhang/wechatforwarder/e/d;

    const-string v2, "chat_forward_enable"

    invoke-virtual {v1, v2, v4}, Lcom/fkzhang/wechatforwarder/e/d;->a(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setChecked(Z)V

    invoke-virtual {v0, p0}, Landroid/widget/Switch;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    const v0, 0x7f0c008a

    invoke-virtual {p0, v0}, Lcom/fkzhang/wechatforwarder/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Switch;

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->m:Lcom/fkzhang/wechatforwarder/e/d;

    const-string v2, "multi_image_forward_enable"

    invoke-virtual {v1, v2, v4}, Lcom/fkzhang/wechatforwarder/e/d;->a(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setChecked(Z)V

    invoke-virtual {v0, p0}, Landroid/widget/Switch;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    const v0, 0x7f0c0092

    invoke-virtual {p0, v0}, Lcom/fkzhang/wechatforwarder/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Switch;

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->m:Lcom/fkzhang/wechatforwarder/e/d;

    const-string v2, "multi_voice_forward_enable"

    invoke-virtual {v1, v2, v4}, Lcom/fkzhang/wechatforwarder/e/d;->a(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setChecked(Z)V

    invoke-virtual {v0, p0}, Landroid/widget/Switch;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    const v0, 0x7f0c0089

    invoke-virtual {p0, v0}, Lcom/fkzhang/wechatforwarder/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Switch;

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->m:Lcom/fkzhang/wechatforwarder/e/d;

    const-string v2, "sns_forward_enable"

    invoke-virtual {v1, v2, v4}, Lcom/fkzhang/wechatforwarder/e/d;->a(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setChecked(Z)V

    invoke-virtual {v0, p0}, Landroid/widget/Switch;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    const v0, 0x7f0c0091

    invoke-virtual {p0, v0}, Lcom/fkzhang/wechatforwarder/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Switch;

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->m:Lcom/fkzhang/wechatforwarder/e/d;

    const-string v2, "voice_forward_enable"

    invoke-virtual {v1, v2, v4}, Lcom/fkzhang/wechatforwarder/e/d;->a(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setChecked(Z)V

    invoke-virtual {v0, p0}, Landroid/widget/Switch;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    const v0, 0x7f0c0098

    invoke-virtual {p0, v0}, Lcom/fkzhang/wechatforwarder/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Switch;

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->m:Lcom/fkzhang/wechatforwarder/e/d;

    const-string v2, "favorite_forward_enable"

    invoke-virtual {v1, v2, v4}, Lcom/fkzhang/wechatforwarder/e/d;->a(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setChecked(Z)V

    invoke-virtual {v0, p0}, Landroid/widget/Switch;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    const v0, 0x7f0c008b

    invoke-virtual {p0, v0}, Lcom/fkzhang/wechatforwarder/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Switch;

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->m:Lcom/fkzhang/wechatforwarder/e/d;

    const-string v2, "record_forward_enable"

    invoke-virtual {v1, v2, v4}, Lcom/fkzhang/wechatforwarder/e/d;->a(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setChecked(Z)V

    invoke-virtual {v0, p0}, Landroid/widget/Switch;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    const v0, 0x7f0c0093

    invoke-virtual {p0, v0}, Lcom/fkzhang/wechatforwarder/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Switch;

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->m:Lcom/fkzhang/wechatforwarder/e/d;

    const-string v2, "friendcard_forward_enable"

    invoke-virtual {v1, v2, v4}, Lcom/fkzhang/wechatforwarder/e/d;->a(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setChecked(Z)V

    invoke-virtual {v0, p0}, Landroid/widget/Switch;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    const v0, 0x7f0c008c

    invoke-virtual {p0, v0}, Lcom/fkzhang/wechatforwarder/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Switch;

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->m:Lcom/fkzhang/wechatforwarder/e/d;

    const-string v2, "img_autodownload_enable"

    invoke-virtual {v1, v2, v4}, Lcom/fkzhang/wechatforwarder/e/d;->a(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setChecked(Z)V

    invoke-virtual {v0, p0}, Landroid/widget/Switch;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    const v0, 0x7f0c0094

    invoke-virtual {p0, v0}, Lcom/fkzhang/wechatforwarder/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Switch;

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->m:Lcom/fkzhang/wechatforwarder/e/d;

    const-string v2, "img_to_friend_forward_enable"

    invoke-virtual {v1, v2, v4}, Lcom/fkzhang/wechatforwarder/e/d;->a(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setChecked(Z)V

    invoke-virtual {v0, p0}, Landroid/widget/Switch;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    const v0, 0x7f0c008e

    invoke-virtual {p0, v0}, Lcom/fkzhang/wechatforwarder/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Switch;

    iput-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->B:Landroid/widget/Switch;

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->B:Landroid/widget/Switch;

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->m:Lcom/fkzhang/wechatforwarder/e/d;

    const-string v2, "add_img_watermark"

    invoke-virtual {v1, v2, v4}, Lcom/fkzhang/wechatforwarder/e/d;->a(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setChecked(Z)V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->B:Landroid/widget/Switch;

    invoke-virtual {v0, p0}, Landroid/widget/Switch;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    const v0, 0x7f0c0095

    invoke-virtual {p0, v0}, Lcom/fkzhang/wechatforwarder/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Switch;

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->m:Lcom/fkzhang/wechatforwarder/e/d;

    const-string v2, "broadcast_forward_enable"

    invoke-virtual {v1, v2, v4}, Lcom/fkzhang/wechatforwarder/e/d;->a(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setChecked(Z)V

    invoke-virtual {v0, p0}, Landroid/widget/Switch;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    const v0, 0x7f0c0096

    invoke-virtual {p0, v0}, Lcom/fkzhang/wechatforwarder/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Switch;

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->m:Lcom/fkzhang/wechatforwarder/e/d;

    const-string v2, "multi_broadcast_forward_enable"

    invoke-virtual {v1, v2, v4}, Lcom/fkzhang/wechatforwarder/e/d;->a(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setChecked(Z)V

    invoke-virtual {v0, p0}, Landroid/widget/Switch;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    const v0, 0x7f0c009a

    invoke-virtual {p0, v0}, Lcom/fkzhang/wechatforwarder/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Switch;

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->m:Lcom/fkzhang/wechatforwarder/e/d;

    const-string v2, "disable_contentprovider"

    invoke-virtual {v1, v2, v4}, Lcom/fkzhang/wechatforwarder/e/d;->a(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setChecked(Z)V

    invoke-virtual {v0, p0}, Landroid/widget/Switch;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    const v0, 0x7f0c009b

    invoke-virtual {p0, v0}, Lcom/fkzhang/wechatforwarder/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Switch;

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->m:Lcom/fkzhang/wechatforwarder/e/d;

    const-string v2, "selective_copy_enable"

    invoke-virtual {v1, v2, v4}, Lcom/fkzhang/wechatforwarder/e/d;->a(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setChecked(Z)V

    invoke-virtual {v0, p0}, Landroid/widget/Switch;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    const v0, 0x7f0c008d

    invoke-virtual {p0, v0}, Lcom/fkzhang/wechatforwarder/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Switch;

    iput-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->p:Landroid/widget/Switch;

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->p:Landroid/widget/Switch;

    iget-object v1, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->m:Lcom/fkzhang/wechatforwarder/e/d;

    const-string v2, "show_img_progress"

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Lcom/fkzhang/wechatforwarder/e/d;->a(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setChecked(Z)V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->p:Landroid/widget/Switch;

    invoke-virtual {v0, p0}, Landroid/widget/Switch;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->m:Lcom/fkzhang/wechatforwarder/e/d;

    const-string v1, "img_autodownload_enable"

    invoke-virtual {v0, v1, v4}, Lcom/fkzhang/wechatforwarder/e/d;->a(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->p:Landroid/widget/Switch;

    invoke-virtual {v0, v4}, Landroid/widget/Switch;->setVisibility(I)V

    :goto_0
    const v0, 0x7f0c008f

    invoke-virtual {p0, v0}, Lcom/fkzhang/wechatforwarder/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->t:Landroid/view/View;

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->m:Lcom/fkzhang/wechatforwarder/e/d;

    const-string v1, "add_img_watermark"

    invoke-virtual {v0, v1, v4}, Lcom/fkzhang/wechatforwarder/e/d;->a(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->t:Landroid/view/View;

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    :goto_1
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->t:Landroid/view/View;

    new-instance v1, Lcom/fkzhang/wechatforwarder/bc;

    invoke-direct {v1, p0}, Lcom/fkzhang/wechatforwarder/bc;-><init>(Lcom/fkzhang/wechatforwarder/MainActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->m:Lcom/fkzhang/wechatforwarder/e/d;

    const-string v1, "disable_xposed_check"

    invoke-virtual {v0, v1, v4}, Lcom/fkzhang/wechatforwarder/e/d;->a(Ljava/lang/String;Z)Z

    move-result v0

    invoke-static {p0, v0}, Lcom/fkzhang/wechatforwarder/e/a;->a(Landroid/app/Activity;Z)V

    const v0, 0x7f0c0084

    invoke-virtual {p0, v0}, Lcom/fkzhang/wechatforwarder/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    new-instance v1, Lcom/fkzhang/wechatforwarder/bd;

    invoke-direct {v1, p0, v0}, Lcom/fkzhang/wechatforwarder/bd;-><init>(Lcom/fkzhang/wechatforwarder/MainActivity;Landroid/widget/TextView;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    const v0, 0x7f0c0086

    invoke-virtual {p0, v0}, Lcom/fkzhang/wechatforwarder/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/fkzhang/wechatforwarder/be;

    invoke-direct {v1, p0}, Lcom/fkzhang/wechatforwarder/be;-><init>(Lcom/fkzhang/wechatforwarder/MainActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p0, v8}, Lcom/fkzhang/wechatforwarder/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0, v8}, Lcom/fkzhang/wechatforwarder/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/fkzhang/wechatforwarder/bf;

    invoke-direct {v1, p0}, Lcom/fkzhang/wechatforwarder/bf;-><init>(Lcom/fkzhang/wechatforwarder/MainActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->m:Lcom/fkzhang/wechatforwarder/e/d;

    const-string v1, "forward_chat_to_sns"

    const v2, 0x7f06003e

    invoke-virtual {p0, v2}, Lcom/fkzhang/wechatforwarder/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/fkzhang/wechatforwarder/e/d;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->m:Lcom/fkzhang/wechatforwarder/e/d;

    const-string v1, "forward"

    const v2, 0x7f06003d

    invoke-virtual {p0, v2}, Lcom/fkzhang/wechatforwarder/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/fkzhang/wechatforwarder/e/d;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->m:Lcom/fkzhang/wechatforwarder/e/d;

    const-string v1, "share"

    const v2, 0x7f060068

    invoke-virtual {p0, v2}, Lcom/fkzhang/wechatforwarder/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/fkzhang/wechatforwarder/e/d;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->m:Lcom/fkzhang/wechatforwarder/e/d;

    const-string v1, "forward_images_to_sns"

    const v2, 0x7f06003f

    invoke-virtual {p0, v2}, Lcom/fkzhang/wechatforwarder/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/fkzhang/wechatforwarder/e/d;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->m:Lcom/fkzhang/wechatforwarder/e/d;

    const-string v1, "forward_voices_to_friend"

    const v2, 0x7f060044

    invoke-virtual {p0, v2}, Lcom/fkzhang/wechatforwarder/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/fkzhang/wechatforwarder/e/d;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->m:Lcom/fkzhang/wechatforwarder/e/d;

    const-string v1, "sns_forward_not_supported"

    const v2, 0x7f06006c

    invoke-virtual {p0, v2}, Lcom/fkzhang/wechatforwarder/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/fkzhang/wechatforwarder/e/d;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->m:Lcom/fkzhang/wechatforwarder/e/d;

    const-string v1, "sns_share_not_supported"

    const v2, 0x7f06006d

    invoke-virtual {p0, v2}, Lcom/fkzhang/wechatforwarder/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/fkzhang/wechatforwarder/e/d;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->m:Lcom/fkzhang/wechatforwarder/e/d;

    const-string v1, "voice_forward_success"

    const v2, 0x7f060085

    invoke-virtual {p0, v2}, Lcom/fkzhang/wechatforwarder/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/fkzhang/wechatforwarder/e/d;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->m:Lcom/fkzhang/wechatforwarder/e/d;

    const-string v1, "loading_img"

    const v2, 0x7f060051

    invoke-virtual {p0, v2}, Lcom/fkzhang/wechatforwarder/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/fkzhang/wechatforwarder/e/d;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->m:Lcom/fkzhang/wechatforwarder/e/d;

    const-string v1, "loading_video"

    const v2, 0x7f060052

    invoke-virtual {p0, v2}, Lcom/fkzhang/wechatforwarder/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/fkzhang/wechatforwarder/e/d;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->m:Lcom/fkzhang/wechatforwarder/e/d;

    const-string v1, "img_null"

    const v2, 0x7f06004a

    invoke-virtual {p0, v2}, Lcom/fkzhang/wechatforwarder/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/fkzhang/wechatforwarder/e/d;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->m:Lcom/fkzhang/wechatforwarder/e/d;

    const-string v1, "forward_img_to_friends"

    const v2, 0x7f060040

    invoke-virtual {p0, v2}, Lcom/fkzhang/wechatforwarder/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/fkzhang/wechatforwarder/e/d;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->m:Lcom/fkzhang/wechatforwarder/e/d;

    const-string v1, "video_too_large"

    const v2, 0x7f060082

    invoke-virtual {p0, v2}, Lcom/fkzhang/wechatforwarder/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/fkzhang/wechatforwarder/e/d;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->m:Lcom/fkzhang/wechatforwarder/e/d;

    const-string v1, "mass_send"

    const v2, 0x7f060053

    invoke-virtual {p0, v2}, Lcom/fkzhang/wechatforwarder/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/fkzhang/wechatforwarder/e/d;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->m:Lcom/fkzhang/wechatforwarder/e/d;

    const-string v1, "voice_time_left"

    const v2, 0x7f060087

    invoke-virtual {p0, v2}, Lcom/fkzhang/wechatforwarder/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/fkzhang/wechatforwarder/e/d;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->m:Lcom/fkzhang/wechatforwarder/e/d;

    const-string v1, "selective_copy"

    const v2, 0x7f060064

    invoke-virtual {p0, v2}, Lcom/fkzhang/wechatforwarder/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/fkzhang/wechatforwarder/e/d;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_3
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->p:Landroid/widget/Switch;

    invoke-virtual {v0, v5}, Landroid/widget/Switch;->setVisibility(I)V

    goto/16 :goto_0

    :cond_4
    iget-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->t:Landroid/view/View;

    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_1
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    invoke-virtual {p0}, Lcom/fkzhang/wechatforwarder/MainActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    const/high16 v1, 0x7f0d0000

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    const v0, 0x7f0c010d

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    iput-object v0, p0, Lcom/fkzhang/wechatforwarder/MainActivity;->l:Landroid/view/MenuItem;

    invoke-direct {p0}, Lcom/fkzhang/wechatforwarder/MainActivity;->k()V

    const/4 v0, 0x1

    return v0
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 1

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    :goto_0
    invoke-super {p0, p1}, Landroid/support/v7/a/u;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    return v0

    :pswitch_0
    invoke-direct {p0}, Lcom/fkzhang/wechatforwarder/MainActivity;->m()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_1
    invoke-direct {p0, v0}, Lcom/fkzhang/wechatforwarder/MainActivity;->b(Z)V

    invoke-direct {p0}, Lcom/fkzhang/wechatforwarder/MainActivity;->k()V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :pswitch_data_0
    .packed-switch 0x7f0c010d
        :pswitch_0
    .end packed-switch
.end method
