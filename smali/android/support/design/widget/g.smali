.class final Landroid/support/design/widget/g;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/support/v4/f/e;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Landroid/support/design/widget/f;
    .locals 1

    new-instance v0, Landroid/support/design/widget/f;

    invoke-direct {v0, p1, p2}, Landroid/support/design/widget/f;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0
.end method

.method public a(I)[Landroid/support/design/widget/f;
    .locals 1

    new-array v0, p1, [Landroid/support/design/widget/f;

    return-object v0
.end method

.method public synthetic b(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1, p2}, Landroid/support/design/widget/g;->a(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Landroid/support/design/widget/f;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b(I)[Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, Landroid/support/design/widget/g;->a(I)[Landroid/support/design/widget/f;

    move-result-object v0

    return-object v0
.end method
