.class Lcom/yalantis/ucrop/a/d;
.super Landroid/os/AsyncTask;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Landroid/net/Uri;

.field private final c:I

.field private final d:I

.field private final e:Lcom/yalantis/ucrop/a/b;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/net/Uri;IILcom/yalantis/ucrop/a/b;)V
    .locals 0

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    iput-object p1, p0, Lcom/yalantis/ucrop/a/d;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/yalantis/ucrop/a/d;->b:Landroid/net/Uri;

    iput p3, p0, Lcom/yalantis/ucrop/a/d;->c:I

    iput p4, p0, Lcom/yalantis/ucrop/a/d;->d:I

    iput-object p5, p0, Lcom/yalantis/ucrop/a/d;->e:Lcom/yalantis/ucrop/a/b;

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)Lcom/yalantis/ucrop/a/c;
    .locals 10

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v3, 0x0

    iget-object v2, p0, Lcom/yalantis/ucrop/a/d;->b:Landroid/net/Uri;

    if-nez v2, :cond_0

    new-instance v0, Lcom/yalantis/ucrop/a/c;

    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "Uri cannot be null"

    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v3, v1}, Lcom/yalantis/ucrop/a/c;-><init>(Landroid/graphics/Bitmap;Ljava/lang/Exception;)V

    :goto_0
    return-object v0

    :cond_0
    :try_start_0
    iget-object v2, p0, Lcom/yalantis/ucrop/a/d;->a:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    iget-object v4, p0, Lcom/yalantis/ucrop/a/d;->b:Landroid/net/Uri;

    const-string v5, "r"

    invoke-virtual {v2, v4, v5}, Landroid/content/ContentResolver;->openFileDescriptor(Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object v5

    new-instance v6, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v6}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    iput-boolean v1, v6, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    invoke-static {v5, v3, v6}, Landroid/graphics/BitmapFactory;->decodeFileDescriptor(Ljava/io/FileDescriptor;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    iget v2, p0, Lcom/yalantis/ucrop/a/d;->c:I

    iget v7, p0, Lcom/yalantis/ucrop/a/d;->d:I

    invoke-static {v6, v2, v7}, Lcom/yalantis/ucrop/a/a;->a(Landroid/graphics/BitmapFactory$Options;II)I

    move-result v2

    iput v2, v6, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    iput-boolean v0, v6, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    move-object v2, v3

    :goto_1
    if-nez v0, :cond_2

    const/4 v7, 0x0

    :try_start_1
    invoke-static {v5, v7, v6}, Landroid/graphics/BitmapFactory;->decodeFileDescriptor(Ljava/io/FileDescriptor;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    move-object v2, v0

    move v0, v1

    goto :goto_1

    :catch_0
    move-exception v0

    move-object v1, v0

    new-instance v0, Lcom/yalantis/ucrop/a/c;

    invoke-direct {v0, v3, v1}, Lcom/yalantis/ucrop/a/c;-><init>(Landroid/graphics/Bitmap;Ljava/lang/Exception;)V

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/yalantis/ucrop/a/c;

    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "ParcelFileDescriptor was null for given Uri"

    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v3, v1}, Lcom/yalantis/ucrop/a/c;-><init>(Landroid/graphics/Bitmap;Ljava/lang/Exception;)V

    goto :goto_0

    :catch_1
    move-exception v7

    const-string v8, "BitmapLoadUtils"

    const-string v9, "doInBackground: BitmapFactory.decodeFileDescriptor: "

    invoke-static {v8, v9, v7}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iget v7, v6, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    add-int/lit8 v7, v7, 0x1

    iput v7, v6, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    goto :goto_1

    :cond_2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x10

    if-lt v0, v5, :cond_3

    invoke-static {v4}, Lcom/yalantis/ucrop/a/a;->a(Ljava/io/Closeable;)V

    :cond_3
    iget-object v0, p0, Lcom/yalantis/ucrop/a/d;->a:Landroid/content/Context;

    iget-object v4, p0, Lcom/yalantis/ucrop/a/d;->b:Landroid/net/Uri;

    invoke-static {v0, v4}, Lcom/yalantis/ucrop/a/a;->a(Landroid/content/Context;Landroid/net/Uri;)I

    move-result v0

    invoke-static {v0}, Lcom/yalantis/ucrop/a/a;->a(I)I

    move-result v4

    invoke-static {v0}, Lcom/yalantis/ucrop/a/a;->b(I)I

    move-result v0

    new-instance v5, Landroid/graphics/Matrix;

    invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V

    if-eqz v4, :cond_4

    int-to-float v4, v4

    invoke-virtual {v5, v4}, Landroid/graphics/Matrix;->preRotate(F)Z

    :cond_4
    if-eq v0, v1, :cond_5

    int-to-float v0, v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v5, v0, v1}, Landroid/graphics/Matrix;->postScale(FF)Z

    :cond_5
    invoke-virtual {v5}, Landroid/graphics/Matrix;->isIdentity()Z

    move-result v0

    if-nez v0, :cond_6

    new-instance v0, Lcom/yalantis/ucrop/a/c;

    invoke-static {v2, v5}, Lcom/yalantis/ucrop/a/a;->a(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-direct {v0, v1, v3}, Lcom/yalantis/ucrop/a/c;-><init>(Landroid/graphics/Bitmap;Ljava/lang/Exception;)V

    goto/16 :goto_0

    :cond_6
    new-instance v0, Lcom/yalantis/ucrop/a/c;

    invoke-direct {v0, v2, v3}, Lcom/yalantis/ucrop/a/c;-><init>(Landroid/graphics/Bitmap;Ljava/lang/Exception;)V

    goto/16 :goto_0
.end method

.method protected a(Lcom/yalantis/ucrop/a/c;)V
    .locals 2

    iget-object v0, p1, Lcom/yalantis/ucrop/a/c;->b:Ljava/lang/Exception;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/yalantis/ucrop/a/d;->e:Lcom/yalantis/ucrop/a/b;

    iget-object v1, p1, Lcom/yalantis/ucrop/a/c;->a:Landroid/graphics/Bitmap;

    invoke-interface {v0, v1}, Lcom/yalantis/ucrop/a/b;->a(Landroid/graphics/Bitmap;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/yalantis/ucrop/a/d;->e:Lcom/yalantis/ucrop/a/b;

    iget-object v1, p1, Lcom/yalantis/ucrop/a/c;->b:Ljava/lang/Exception;

    invoke-interface {v0, v1}, Lcom/yalantis/ucrop/a/b;->a(Ljava/lang/Exception;)V

    goto :goto_0
.end method

.method protected synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/yalantis/ucrop/a/d;->a([Ljava/lang/Void;)Lcom/yalantis/ucrop/a/c;

    move-result-object v0

    return-object v0
.end method

.method protected synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/yalantis/ucrop/a/c;

    invoke-virtual {p0, p1}, Lcom/yalantis/ucrop/a/d;->a(Lcom/yalantis/ucrop/a/c;)V

    return-void
.end method
