package p089m0;

import android.os.Build;
import androidx.work.ListenableWorker;
import androidx.work.OverwritingInputMerger;
import p089m0.C3664u;

/* renamed from: m0.l */
public final class C3649l extends C3664u {

    /* renamed from: m0.l$a */
    public static final class C3650a extends C3664u.C3665a<C3650a, C3649l> {
        public C3650a(Class<? extends ListenableWorker> cls) {
            super(cls);
            this.f21418c.f22317d = OverwritingInputMerger.class.getName();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public C3649l mo14811c() {
            if (!this.f21416a || Build.VERSION.SDK_INT < 23 || !this.f21418c.f22323j.mo14774h()) {
                return new C3649l(this);
            }
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public C3650a mo14812d() {
            return this;
        }
    }

    C3649l(C3650a aVar) {
        super(aVar.f21417b, aVar.f21418c, aVar.f21419d);
    }

    /* renamed from: d */
    public static C3649l m25242d(Class<? extends ListenableWorker> cls) {
        return (C3649l) new C3650a(cls).mo14830b();
    }
}
