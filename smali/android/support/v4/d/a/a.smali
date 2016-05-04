.class public final Landroid/support/v4/d/a/a;
.super Ljava/lang/Object;


# static fields
.field static final a:Landroid/support/v4/d/a/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    new-instance v0, Landroid/support/v4/d/a/i;

    invoke-direct {v0}, Landroid/support/v4/d/a/i;-><init>()V

    sput-object v0, Landroid/support/v4/d/a/a;->a:Landroid/support/v4/d/a/c;

    :goto_0
    return-void

    :cond_0
    const/16 v1, 0x15

    if-lt v0, v1, :cond_1

    new-instance v0, Landroid/support/v4/d/a/h;

    invoke-direct {v0}, Landroid/support/v4/d/a/h;-><init>()V

    sput-object v0, Landroid/support/v4/d/a/a;->a:Landroid/support/v4/d/a/c;

    goto :goto_0

    :cond_1
    const/16 v1, 0x13

    if-lt v0, v1, :cond_2

    new-instance v0, Landroid/support/v4/d/a/g;

    invoke-direct {v0}, Landroid/support/v4/d/a/g;-><init>()V

    sput-object v0, Landroid/support/v4/d/a/a;->a:Landroid/support/v4/d/a/c;

    goto :goto_0

    :cond_2
    const/16 v1, 0x11

    if-lt v0, v1, :cond_3

    new-instance v0, Landroid/support/v4/d/a/f;

    invoke-direct {v0}, Landroid/support/v4/d/a/f;-><init>()V

    sput-object v0, Landroid/support/v4/d/a/a;->a:Landroid/support/v4/d/a/c;

    goto :goto_0

    :cond_3
    const/16 v1, 0xb

    if-lt v0, v1, :cond_4

    new-instance v0, Landroid/support/v4/d/a/e;

    invoke-direct {v0}, Landroid/support/v4/d/a/e;-><init>()V

    sput-object v0, Landroid/support/v4/d/a/a;->a:Landroid/support/v4/d/a/c;

    goto :goto_0

    :cond_4
    const/4 v1, 0x5

    if-lt v0, v1, :cond_5

    new-instance v0, Landroid/support/v4/d/a/d;

    invoke-direct {v0}, Landroid/support/v4/d/a/d;-><init>()V

    sput-object v0, Landroid/support/v4/d/a/a;->a:Landroid/support/v4/d/a/c;

    goto :goto_0

    :cond_5
    new-instance v0, Landroid/support/v4/d/a/b;

    invoke-direct {v0}, Landroid/support/v4/d/a/b;-><init>()V

    sput-object v0, Landroid/support/v4/d/a/a;->a:Landroid/support/v4/d/a/c;

    goto :goto_0
.end method

.method public static a(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    sget-object v0, Landroid/support/v4/d/a/a;->a:Landroid/support/v4/d/a/c;

    invoke-interface {v0, p0}, Landroid/support/v4/d/a/c;->a(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public static a(Landroid/graphics/drawable/Drawable;FF)V
    .locals 1

    sget-object v0, Landroid/support/v4/d/a/a;->a:Landroid/support/v4/d/a/c;

    invoke-interface {v0, p0, p1, p2}, Landroid/support/v4/d/a/c;->a(Landroid/graphics/drawable/Drawable;FF)V

    return-void
.end method

.method public static a(Landroid/graphics/drawable/Drawable;I)V
    .locals 1

    sget-object v0, Landroid/support/v4/d/a/a;->a:Landroid/support/v4/d/a/c;

    invoke-interface {v0, p0, p1}, Landroid/support/v4/d/a/c;->a(Landroid/graphics/drawable/Drawable;I)V

    return-void
.end method

.method public static a(Landroid/graphics/drawable/Drawable;IIII)V
    .locals 6

    sget-object v0, Landroid/support/v4/d/a/a;->a:Landroid/support/v4/d/a/c;

    move-object v1, p0

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-interface/range {v0 .. v5}, Landroid/support/v4/d/a/c;->a(Landroid/graphics/drawable/Drawable;IIII)V

    return-void
.end method

.method public static a(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V
    .locals 1

    sget-object v0, Landroid/support/v4/d/a/a;->a:Landroid/support/v4/d/a/c;

    invoke-interface {v0, p0, p1}, Landroid/support/v4/d/a/c;->a(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public static a(Landroid/graphics/drawable/Drawable;Landroid/content/res/Resources$Theme;)V
    .locals 1

    sget-object v0, Landroid/support/v4/d/a/a;->a:Landroid/support/v4/d/a/c;

    invoke-interface {v0, p0, p1}, Landroid/support/v4/d/a/c;->a(Landroid/graphics/drawable/Drawable;Landroid/content/res/Resources$Theme;)V

    return-void
.end method

.method public static a(Landroid/graphics/drawable/Drawable;Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V
    .locals 6

    sget-object v0, Landroid/support/v4/d/a/a;->a:Landroid/support/v4/d/a/c;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-interface/range {v0 .. v5}, Landroid/support/v4/d/a/c;->a(Landroid/graphics/drawable/Drawable;Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V

    return-void
.end method

.method public static a(Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    sget-object v0, Landroid/support/v4/d/a/a;->a:Landroid/support/v4/d/a/c;

    invoke-interface {v0, p0, p1}, Landroid/support/v4/d/a/c;->a(Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V

    return-void
.end method

.method public static a(Landroid/graphics/drawable/Drawable;Z)V
    .locals 1

    sget-object v0, Landroid/support/v4/d/a/a;->a:Landroid/support/v4/d/a/c;

    invoke-interface {v0, p0, p1}, Landroid/support/v4/d/a/c;->a(Landroid/graphics/drawable/Drawable;Z)V

    return-void
.end method

.method public static b(Landroid/graphics/drawable/Drawable;I)V
    .locals 1

    sget-object v0, Landroid/support/v4/d/a/a;->a:Landroid/support/v4/d/a/c;

    invoke-interface {v0, p0, p1}, Landroid/support/v4/d/a/c;->b(Landroid/graphics/drawable/Drawable;I)V

    return-void
.end method

.method public static b(Landroid/graphics/drawable/Drawable;)Z
    .locals 1

    sget-object v0, Landroid/support/v4/d/a/a;->a:Landroid/support/v4/d/a/c;

    invoke-interface {v0, p0}, Landroid/support/v4/d/a/c;->b(Landroid/graphics/drawable/Drawable;)Z

    move-result v0

    return v0
.end method

.method public static c(Landroid/graphics/drawable/Drawable;)I
    .locals 1

    sget-object v0, Landroid/support/v4/d/a/a;->a:Landroid/support/v4/d/a/c;

    invoke-interface {v0, p0}, Landroid/support/v4/d/a/c;->e(Landroid/graphics/drawable/Drawable;)I

    move-result v0

    return v0
.end method

.method public static d(Landroid/graphics/drawable/Drawable;)Z
    .locals 1

    sget-object v0, Landroid/support/v4/d/a/a;->a:Landroid/support/v4/d/a/c;

    invoke-interface {v0, p0}, Landroid/support/v4/d/a/c;->f(Landroid/graphics/drawable/Drawable;)Z

    move-result v0

    return v0
.end method

.method public static e(Landroid/graphics/drawable/Drawable;)Landroid/graphics/ColorFilter;
    .locals 1

    sget-object v0, Landroid/support/v4/d/a/a;->a:Landroid/support/v4/d/a/c;

    invoke-interface {v0, p0}, Landroid/support/v4/d/a/c;->g(Landroid/graphics/drawable/Drawable;)Landroid/graphics/ColorFilter;

    move-result-object v0

    return-object v0
.end method

.method public static f(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
    .locals 1

    sget-object v0, Landroid/support/v4/d/a/a;->a:Landroid/support/v4/d/a/c;

    invoke-interface {v0, p0}, Landroid/support/v4/d/a/c;->c(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method public static g(Landroid/graphics/drawable/Drawable;)I
    .locals 1

    sget-object v0, Landroid/support/v4/d/a/a;->a:Landroid/support/v4/d/a/c;

    invoke-interface {v0, p0}, Landroid/support/v4/d/a/c;->d(Landroid/graphics/drawable/Drawable;)I

    move-result v0

    return v0
.end method
