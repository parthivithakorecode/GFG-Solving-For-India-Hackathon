package p089m0;

import android.os.Build;
import androidx.work.C1239b;
import androidx.work.ListenableWorker;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import p141u0.C4108p;

/* renamed from: m0.u */
public abstract class C3664u {

    /* renamed from: a */
    private UUID f21413a;

    /* renamed from: b */
    private C4108p f21414b;

    /* renamed from: c */
    private Set<String> f21415c;

    /* renamed from: m0.u$a */
    public static abstract class C3665a<B extends C3665a<?, ?>, W extends C3664u> {

        /* renamed from: a */
        boolean f21416a = false;

        /* renamed from: b */
        UUID f21417b = UUID.randomUUID();

        /* renamed from: c */
        C4108p f21418c;

        /* renamed from: d */
        Set<String> f21419d = new HashSet();

        /* renamed from: e */
        Class<? extends ListenableWorker> f21420e;

        C3665a(Class<? extends ListenableWorker> cls) {
            this.f21420e = cls;
            this.f21418c = new C4108p(this.f21417b.toString(), cls.getName());
            mo14829a(cls.getName());
        }

        /* renamed from: a */
        public final B mo14829a(String str) {
            this.f21419d.add(str);
            return mo14812d();
        }

        /* renamed from: b */
        public final W mo14830b() {
            W c = mo14811c();
            C3635b bVar = this.f21418c.f22323j;
            int i = Build.VERSION.SDK_INT;
            boolean z = (i >= 24 && bVar.mo14770e()) || bVar.mo14772f() || bVar.mo14773g() || (i >= 23 && bVar.mo14774h());
            if (!this.f21418c.f22330q || !z) {
                this.f21417b = UUID.randomUUID();
                C4108p pVar = new C4108p(this.f21418c);
                this.f21418c = pVar;
                pVar.f22314a = this.f21417b.toString();
                return c;
            }
            throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract W mo14811c();

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract B mo14812d();

        /* renamed from: e */
        public final B mo14831e(C3635b bVar) {
            this.f21418c.f22323j = bVar;
            return mo14812d();
        }

        /* renamed from: f */
        public final B mo14832f(C1239b bVar) {
            this.f21418c.f22318e = bVar;
            return mo14812d();
        }
    }

    protected C3664u(UUID uuid, C4108p pVar, Set<String> set) {
        this.f21413a = uuid;
        this.f21414b = pVar;
        this.f21415c = set;
    }

    /* renamed from: a */
    public String mo14826a() {
        return this.f21413a.toString();
    }

    /* renamed from: b */
    public Set<String> mo14827b() {
        return this.f21415c;
    }

    /* renamed from: c */
    public C4108p mo14828c() {
        return this.f21414b;
    }
}
