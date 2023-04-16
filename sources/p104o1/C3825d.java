package p104o1;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import p002a1.C0042x;

/* renamed from: o1.d */
public final class C3825d {

    /* renamed from: a */
    private final boolean f21811a;

    /* renamed from: b */
    private final int f21812b;

    /* renamed from: c */
    private final boolean f21813c;

    /* renamed from: d */
    private final int f21814d;

    /* renamed from: e */
    private final C0042x f21815e;

    /* renamed from: f */
    private final boolean f21816f;

    /* renamed from: o1.d$a */
    public static final class C3826a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public boolean f21817a = false;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public int f21818b = 0;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public boolean f21819c = false;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public C0042x f21820d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public int f21821e = 1;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public boolean f21822f = false;

        @RecentlyNonNull
        /* renamed from: a */
        public C3825d mo15212a() {
            return new C3825d(this, (C3828f) null);
        }

        @RecentlyNonNull
        /* renamed from: b */
        public C3826a mo15213b(int i) {
            this.f21821e = i;
            return this;
        }

        @RecentlyNonNull
        /* renamed from: c */
        public C3826a mo15214c(int i) {
            this.f21818b = i;
            return this;
        }

        @RecentlyNonNull
        /* renamed from: d */
        public C3826a mo15215d(boolean z) {
            this.f21822f = z;
            return this;
        }

        @RecentlyNonNull
        /* renamed from: e */
        public C3826a mo15216e(boolean z) {
            this.f21819c = z;
            return this;
        }

        @RecentlyNonNull
        /* renamed from: f */
        public C3826a mo15217f(boolean z) {
            this.f21817a = z;
            return this;
        }

        @RecentlyNonNull
        /* renamed from: g */
        public C3826a mo15218g(@RecentlyNonNull C0042x xVar) {
            this.f21820d = xVar;
            return this;
        }
    }

    /* synthetic */ C3825d(C3826a aVar, C3828f fVar) {
        this.f21811a = aVar.f21817a;
        this.f21812b = aVar.f21818b;
        this.f21813c = aVar.f21819c;
        this.f21814d = aVar.f21821e;
        this.f21815e = aVar.f21820d;
        this.f21816f = aVar.f21822f;
    }

    /* renamed from: a */
    public int mo15206a() {
        return this.f21814d;
    }

    /* renamed from: b */
    public int mo15207b() {
        return this.f21812b;
    }

    @RecentlyNullable
    /* renamed from: c */
    public C0042x mo15208c() {
        return this.f21815e;
    }

    /* renamed from: d */
    public boolean mo15209d() {
        return this.f21813c;
    }

    /* renamed from: e */
    public boolean mo15210e() {
        return this.f21811a;
    }

    /* renamed from: f */
    public final boolean mo15211f() {
        return this.f21816f;
    }
}
