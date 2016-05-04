.class public Landroid/support/v7/widget/bh;
.super Landroid/widget/SeekBar;


# instance fields
.field private a:Landroid/support/v7/widget/bi;

.field private b:Landroid/support/v7/widget/ar;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    sget v0, Landroid/support/v7/b/b;->seekBarStyle:I

    invoke-direct {p0, p1, p2, v0}, Landroid/support/v7/widget/bh;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/SeekBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    invoke-static {}, Landroid/support/v7/widget/ar;->a()Landroid/support/v7/widget/ar;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/widget/bh;->b:Landroid/support/v7/widget/ar;

    new-instance v0, Landroid/support/v7/widget/bi;

    iget-object v1, p0, Landroid/support/v7/widget/bh;->b:Landroid/support/v7/widget/ar;

    invoke-direct {v0, p0, v1}, Landroid/support/v7/widget/bi;-><init>(Landroid/widget/SeekBar;Landroid/support/v7/widget/ar;)V

    iput-object v0, p0, Landroid/support/v7/widget/bh;->a:Landroid/support/v7/widget/bi;

    iget-object v0, p0, Landroid/support/v7/widget/bh;->a:Landroid/support/v7/widget/bi;

    invoke-virtual {v0, p2, p3}, Landroid/support/v7/widget/bi;->a(Landroid/util/AttributeSet;I)V

    return-void
.end method
