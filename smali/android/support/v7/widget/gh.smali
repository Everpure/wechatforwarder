.class public Landroid/support/v7/widget/gh;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;


# instance fields
.field a:I

.field b:I

.field c:I

.field d:[I

.field e:I

.field f:[I

.field g:Ljava/util/List;

.field h:Z

.field i:Z

.field j:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroid/support/v7/widget/gi;

    invoke-direct {v0}, Landroid/support/v7/widget/gi;-><init>()V

    sput-object v0, Landroid/support/v7/widget/gh;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method constructor <init>(Landroid/os/Parcel;)V
    .locals 3

    const/4 v2, 0x0

    const/4 v1, 0x1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroid/support/v7/widget/gh;->a:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroid/support/v7/widget/gh;->b:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroid/support/v7/widget/gh;->c:I

    iget v0, p0, Landroid/support/v7/widget/gh;->c:I

    if-lez v0, :cond_0

    iget v0, p0, Landroid/support/v7/widget/gh;->c:I

    new-array v0, v0, [I

    iput-object v0, p0, Landroid/support/v7/widget/gh;->d:[I

    iget-object v0, p0, Landroid/support/v7/widget/gh;->d:[I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readIntArray([I)V

    :cond_0
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroid/support/v7/widget/gh;->e:I

    iget v0, p0, Landroid/support/v7/widget/gh;->e:I

    if-lez v0, :cond_1

    iget v0, p0, Landroid/support/v7/widget/gh;->e:I

    new-array v0, v0, [I

    iput-object v0, p0, Landroid/support/v7/widget/gh;->f:[I

    iget-object v0, p0, Landroid/support/v7/widget/gh;->f:[I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readIntArray([I)V

    :cond_1
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-ne v0, v1, :cond_2

    move v0, v1

    :goto_0
    iput-boolean v0, p0, Landroid/support/v7/widget/gh;->h:Z

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-ne v0, v1, :cond_3

    move v0, v1

    :goto_1
    iput-boolean v0, p0, Landroid/support/v7/widget/gh;->i:Z

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-ne v0, v1, :cond_4

    :goto_2
    iput-boolean v1, p0, Landroid/support/v7/widget/gh;->j:Z

    const-class v0, Landroid/support/v7/widget/gf;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readArrayList(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/widget/gh;->g:Ljava/util/List;

    return-void

    :cond_2
    move v0, v2

    goto :goto_0

    :cond_3
    move v0, v2

    goto :goto_1

    :cond_4
    move v1, v2

    goto :goto_2
.end method

.method public constructor <init>(Landroid/support/v7/widget/gh;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget v0, p1, Landroid/support/v7/widget/gh;->c:I

    iput v0, p0, Landroid/support/v7/widget/gh;->c:I

    iget v0, p1, Landroid/support/v7/widget/gh;->a:I

    iput v0, p0, Landroid/support/v7/widget/gh;->a:I

    iget v0, p1, Landroid/support/v7/widget/gh;->b:I

    iput v0, p0, Landroid/support/v7/widget/gh;->b:I

    iget-object v0, p1, Landroid/support/v7/widget/gh;->d:[I

    iput-object v0, p0, Landroid/support/v7/widget/gh;->d:[I

    iget v0, p1, Landroid/support/v7/widget/gh;->e:I

    iput v0, p0, Landroid/support/v7/widget/gh;->e:I

    iget-object v0, p1, Landroid/support/v7/widget/gh;->f:[I

    iput-object v0, p0, Landroid/support/v7/widget/gh;->f:[I

    iget-boolean v0, p1, Landroid/support/v7/widget/gh;->h:Z

    iput-boolean v0, p0, Landroid/support/v7/widget/gh;->h:Z

    iget-boolean v0, p1, Landroid/support/v7/widget/gh;->i:Z

    iput-boolean v0, p0, Landroid/support/v7/widget/gh;->i:Z

    iget-boolean v0, p1, Landroid/support/v7/widget/gh;->j:Z

    iput-boolean v0, p0, Landroid/support/v7/widget/gh;->j:Z

    iget-object v0, p1, Landroid/support/v7/widget/gh;->g:Ljava/util/List;

    iput-object v0, p0, Landroid/support/v7/widget/gh;->g:Ljava/util/List;

    return-void
.end method


# virtual methods
.method a()V
    .locals 2

    const/4 v1, 0x0

    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/v7/widget/gh;->d:[I

    iput v1, p0, Landroid/support/v7/widget/gh;->c:I

    iput v1, p0, Landroid/support/v7/widget/gh;->e:I

    iput-object v0, p0, Landroid/support/v7/widget/gh;->f:[I

    iput-object v0, p0, Landroid/support/v7/widget/gh;->g:Ljava/util/List;

    return-void
.end method

.method b()V
    .locals 2

    const/4 v1, -0x1

    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/v7/widget/gh;->d:[I

    const/4 v0, 0x0

    iput v0, p0, Landroid/support/v7/widget/gh;->c:I

    iput v1, p0, Landroid/support/v7/widget/gh;->a:I

    iput v1, p0, Landroid/support/v7/widget/gh;->b:I

    return-void
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    const/4 v1, 0x1

    const/4 v2, 0x0

    iget v0, p0, Landroid/support/v7/widget/gh;->a:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Landroid/support/v7/widget/gh;->b:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Landroid/support/v7/widget/gh;->c:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Landroid/support/v7/widget/gh;->c:I

    if-lez v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/gh;->d:[I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeIntArray([I)V

    :cond_0
    iget v0, p0, Landroid/support/v7/widget/gh;->e:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Landroid/support/v7/widget/gh;->e:I

    if-lez v0, :cond_1

    iget-object v0, p0, Landroid/support/v7/widget/gh;->f:[I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeIntArray([I)V

    :cond_1
    iget-boolean v0, p0, Landroid/support/v7/widget/gh;->h:Z

    if-eqz v0, :cond_2

    move v0, v1

    :goto_0
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Landroid/support/v7/widget/gh;->i:Z

    if-eqz v0, :cond_3

    move v0, v1

    :goto_1
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Landroid/support/v7/widget/gh;->j:Z

    if-eqz v0, :cond_4

    :goto_2
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Landroid/support/v7/widget/gh;->g:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    return-void

    :cond_2
    move v0, v2

    goto :goto_0

    :cond_3
    move v0, v2

    goto :goto_1

    :cond_4
    move v1, v2

    goto :goto_2
.end method
