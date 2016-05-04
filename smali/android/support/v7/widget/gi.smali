.class final Landroid/support/v7/widget/gi;
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
.method public a(Landroid/os/Parcel;)Landroid/support/v7/widget/gh;
    .locals 1

    new-instance v0, Landroid/support/v7/widget/gh;

    invoke-direct {v0, p1}, Landroid/support/v7/widget/gh;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public a(I)[Landroid/support/v7/widget/gh;
    .locals 1

    new-array v0, p1, [Landroid/support/v7/widget/gh;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, Landroid/support/v7/widget/gi;->a(Landroid/os/Parcel;)Landroid/support/v7/widget/gh;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, Landroid/support/v7/widget/gi;->a(I)[Landroid/support/v7/widget/gh;

    move-result-object v0

    return-object v0
.end method
