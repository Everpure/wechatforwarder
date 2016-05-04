.class La/a/a/g/b;
.super Ljava/lang/Thread;


# instance fields
.field final a:La/a/a/g/a;

.field private final b:Ljava/util/ArrayList;

.field private final c:La/a/a/e/h;

.field private final d:La/a/a/f/a;

.field private final e:Ljava/lang/String;


# direct methods
.method constructor <init>(La/a/a/g/a;Ljava/lang/String;Ljava/util/ArrayList;La/a/a/e/h;La/a/a/f/a;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p2}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, La/a/a/g/b;->a:La/a/a/g/a;

    iput-object p3, p0, La/a/a/g/b;->b:Ljava/util/ArrayList;

    iput-object p4, p0, La/a/a/g/b;->c:La/a/a/e/h;

    iput-object p5, p0, La/a/a/g/b;->d:La/a/a/f/a;

    iput-object p6, p0, La/a/a/g/b;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    :try_start_0
    iget-object v0, p0, La/a/a/g/b;->a:La/a/a/g/a;

    iget-object v1, p0, La/a/a/g/b;->b:Ljava/util/ArrayList;

    iget-object v2, p0, La/a/a/g/b;->c:La/a/a/e/h;

    iget-object v3, p0, La/a/a/g/b;->d:La/a/a/f/a;

    iget-object v4, p0, La/a/a/g/b;->e:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3, v4}, La/a/a/g/a;->a(La/a/a/g/a;Ljava/util/ArrayList;La/a/a/e/h;La/a/a/f/a;Ljava/lang/String;)V

    iget-object v0, p0, La/a/a/g/b;->d:La/a/a/f/a;

    invoke-virtual {v0}, La/a/a/f/a;->b()V
    :try_end_0
    .catch La/a/a/c/a; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method
