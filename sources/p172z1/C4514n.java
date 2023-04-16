package p172z1;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import p003a2.C0092o;
import p131s2.C4029i;
import p160x1.C4282d;
import p166y1.C4365a;
import p166y1.C4365a.C4367b;

/* renamed from: z1.n */
public abstract class C4514n<A extends C4365a.C4367b, ResultT> {

    /* renamed from: a */
    private final C4282d[] f23015a;

    /* renamed from: b */
    private final boolean f23016b;

    /* renamed from: c */
    private final int f23017c;

    /* renamed from: z1.n$a */
    public static class C4515a<A extends C4365a.C4367b, ResultT> {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public C4510l<A, C4029i<ResultT>> f23018a;

        /* renamed from: b */
        private boolean f23019b = true;

        /* renamed from: c */
        private C4282d[] f23020c;

        /* renamed from: d */
        private int f23021d = 0;

        /* synthetic */ C4515a(C4520p0 p0Var) {
        }

        @RecentlyNonNull
        /* renamed from: a */
        public C4514n<A, ResultT> mo16175a() {
            C0092o.m306b(this.f23018a != null, "execute parameter required");
            return new C4522q0(this, this.f23020c, this.f23019b, this.f23021d);
        }

        @RecentlyNonNull
        /* renamed from: b */
        public C4515a<A, ResultT> mo16176b(@RecentlyNonNull C4510l<A, C4029i<ResultT>> lVar) {
            this.f23018a = lVar;
            return this;
        }

        @RecentlyNonNull
        /* renamed from: c */
        public C4515a<A, ResultT> mo16177c(boolean z) {
            this.f23019b = z;
            return this;
        }

        @RecentlyNonNull
        /* renamed from: d */
        public C4515a<A, ResultT> mo16178d(@RecentlyNonNull C4282d... dVarArr) {
            this.f23020c = dVarArr;
            return this;
        }

        @RecentlyNonNull
        /* renamed from: e */
        public C4515a<A, ResultT> mo16179e(int i) {
            this.f23021d = i;
            return this;
        }
    }

    protected C4514n(C4282d[] dVarArr, boolean z, int i) {
        this.f23015a = dVarArr;
        boolean z2 = false;
        if (dVarArr != null && z) {
            z2 = true;
        }
        this.f23016b = z2;
        this.f23017c = i;
    }

    @RecentlyNonNull
    /* renamed from: a */
    public static <A extends C4365a.C4367b, ResultT> C4515a<A, ResultT> m27370a() {
        return new C4515a<>((C4520p0) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo16171b(@RecentlyNonNull A a, @RecentlyNonNull C4029i<ResultT> iVar);

    /* renamed from: c */
    public boolean mo16172c() {
        return this.f23016b;
    }

    @RecentlyNullable
    /* renamed from: d */
    public final C4282d[] mo16173d() {
        return this.f23015a;
    }

    /* renamed from: e */
    public final int mo16174e() {
        return this.f23017c;
    }
}
