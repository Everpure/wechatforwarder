.class final Landroid/support/design/widget/m;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/os/Parcelable$Creator;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Landroid/support/design/widget/l;
    .locals 1

    new-instance v0, Landroid/support/design/widget/l;

    invoke-direct {v0, p1}, Landroid/support/design/widget/l;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public a(I)[Landroid/support/design/widget/l;
    .locals 1

    new-array v0, p1, [Landroid/support/design/widget/l;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, Landroid/support/design/widget/m;->a(Landroid/os/Parcel;)Landroid/support/design/widget/l;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, Landroid/support/design/widget/m;->a(I)[Landroid/support/design/widget/l;

    move-result-object v0

    return-object v0
.end method
