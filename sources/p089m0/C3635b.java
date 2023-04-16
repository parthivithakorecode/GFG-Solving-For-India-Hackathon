package p089m0;

import android.os.Build;

/* renamed from: m0.b */
public final class C3635b {

    /* renamed from: i */
    public static final C3635b f21361i = new C3636a().mo14785a();

    /* renamed from: a */
    private C3648k f21362a = C3648k.NOT_REQUIRED;

    /* renamed from: b */
    private boolean f21363b;

    /* renamed from: c */
    private boolean f21364c;

    /* renamed from: d */
    private boolean f21365d;

    /* renamed from: e */
    private boolean f21366e;

    /* renamed from: f */
    private long f21367f = -1;

    /* renamed from: g */
    private long f21368g = -1;

    /* renamed from: h */
    private C3637c f21369h = new C3637c();

    /* renamed from: m0.b$a */
    public static final class C3636a {

        /* renamed from: a */
        boolean f21370a = false;

        /* renamed from: b */
        boolean f21371b = false;

        /* renamed from: c */
        C3648k f21372c = C3648k.NOT_REQUIRED;

        /* renamed from: d */
        boolean f21373d = false;

        /* renamed from: e */
        boolean f21374e = false;

        /* renamed from: f */
        long f21375f = -1;

        /* renamed from: g */
        long f21376g = -1;

        /* renamed from: h */
        C3637c f21377h = new C3637c();

        /* renamed from: a */
        public C3635b mo14785a() {
            return new C3635b(this);
        }

        /* renamed from: b */
        public C3636a mo14786b(C3648k kVar) {
            this.f21372c = kVar;
            return this;
        }
    }

    public C3635b() {
    }

    C3635b(C3636a aVar) {
        this.f21363b = aVar.f21370a;
        int i = Build.VERSION.SDK_INT;
        this.f21364c = i >= 23 && aVar.f21371b;
        this.f21362a = aVar.f21372c;
        this.f21365d = aVar.f21373d;
        this.f21366e = aVar.f21374e;
        if (i >= 24) {
            this.f21369h = aVar.f21377h;
            this.f21367f = aVar.f21375f;
            this.f21368g = aVar.f21376g;
        }
    }

    public C3635b(C3635b bVar) {
        this.f21363b = bVar.f21363b;
        this.f21364c = bVar.f21364c;
        this.f21362a = bVar.f21362a;
        this.f21365d = bVar.f21365d;
        this.f21366e = bVar.f21366e;
        this.f21369h = bVar.f21369h;
    }

    /* renamed from: a */
    public C3637c mo14766a() {
        return this.f21369h;
    }

    /* renamed from: b */
    public C3648k mo14767b() {
        return this.f21362a;
    }

    /* renamed from: c */
    public long mo14768c() {
        return this.f21367f;
    }

    /* renamed from: d */
    public long mo14769d() {
        return this.f21368g;
    }

    /* renamed from: e */
    public boolean mo14770e() {
        return this.f21369h.mo14789c() > 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3635b.class != obj.getClass()) {
            return false;
        }
        C3635b bVar = (C3635b) obj;
        if (this.f21363b == bVar.f21363b && this.f21364c == bVar.f21364c && this.f21365d == bVar.f21365d && this.f21366e == bVar.f21366e && this.f21367f == bVar.f21367f && this.f21368g == bVar.f21368g && this.f21362a == bVar.f21362a) {
            return this.f21369h.equals(bVar.f21369h);
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo14772f() {
        return this.f21365d;
    }

    /* renamed from: g */
    public boolean mo14773g() {
        return this.f21363b;
    }

    /* renamed from: h */
    public boolean mo14774h() {
        return this.f21364c;
    }

    public int hashCode() {
        long j = this.f21367f;
        long j2 = this.f21368g;
        return (((((((((((((this.f21362a.hashCode() * 31) + (this.f21363b ? 1 : 0)) * 31) + (this.f21364c ? 1 : 0)) * 31) + (this.f21365d ? 1 : 0)) * 31) + (this.f21366e ? 1 : 0)) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f21369h.hashCode();
    }

    /* renamed from: i */
    public boolean mo14776i() {
        return this.f21366e;
    }

    /* renamed from: j */
    public void mo14777j(C3637c cVar) {
        this.f21369h = cVar;
    }

    /* renamed from: k */
    public void mo14778k(C3648k kVar) {
        this.f21362a = kVar;
    }

    /* renamed from: l */
    public void mo14779l(boolean z) {
        this.f21365d = z;
    }

    /* renamed from: m */
    public void mo14780m(boolean z) {
        this.f21363b = z;
    }

    /* renamed from: n */
    public void mo14781n(boolean z) {
        this.f21364c = z;
    }

    /* renamed from: o */
    public void mo14782o(boolean z) {
        this.f21366e = z;
    }

    /* renamed from: p */
    public void mo14783p(long j) {
        this.f21367f = j;
    }

    /* renamed from: q */
    public void mo14784q(long j) {
        this.f21368g = j;
    }
}
