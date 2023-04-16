package p066io.flutter.plugins.googlemobileads;

import android.content.Context;
import p002a1.C0024h;

/* renamed from: io.flutter.plugins.googlemobileads.m */
class C3069m {

    /* renamed from: a */
    final C0024h f20155a;

    /* renamed from: b */
    final int f20156b;

    /* renamed from: c */
    final int f20157c;

    /* renamed from: io.flutter.plugins.googlemobileads.m$a */
    static class C3070a {
        C3070a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0024h mo13875a(Context context, int i) {
            return C0024h.m56a(context, i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C0024h mo13876b(Context context, int i) {
            return C0024h.m57b(context, i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C0024h mo13877c(int i, int i2) {
            return C0024h.m58e(i, i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C0024h mo13878d(Context context, int i) {
            return C0024h.m59f(context, i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C0024h mo13879e(Context context, int i) {
            return C0024h.m60g(context, i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public C0024h mo13880f(Context context, int i) {
            return C0024h.m61h(context, i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public C0024h mo13881g(Context context, int i) {
            return C0024h.m62i(context, i);
        }
    }

    /* renamed from: io.flutter.plugins.googlemobileads.m$b */
    static class C3071b extends C3069m {

        /* renamed from: d */
        final String f20158d;

        C3071b(Context context, C3070a aVar, String str, int i) {
            super(m23558b(context, aVar, str, i));
            this.f20158d = str;
        }

        /* renamed from: b */
        private static C0024h m23558b(Context context, C3070a aVar, String str, int i) {
            if (str == null) {
                return aVar.mo13875a(context, i);
            }
            if (str.equals("portrait")) {
                return aVar.mo13880f(context, i);
            }
            if (str.equals("landscape")) {
                return aVar.mo13878d(context, i);
            }
            throw new IllegalArgumentException("Unexpected value for orientation: " + str);
        }
    }

    /* renamed from: io.flutter.plugins.googlemobileads.m$c */
    static class C3072c extends C3069m {
        C3072c() {
            super(C0024h.f32p);
        }
    }

    /* renamed from: io.flutter.plugins.googlemobileads.m$d */
    static class C3073d extends C3069m {

        /* renamed from: d */
        final Integer f20159d;

        /* renamed from: e */
        final Integer f20160e;

        C3073d(C3070a aVar, Context context, int i, Integer num, Integer num2) {
            super(m23559b(aVar, context, i, num, num2));
            this.f20159d = num;
            this.f20160e = num2;
        }

        /* renamed from: b */
        private static C0024h m23559b(C3070a aVar, Context context, int i, Integer num, Integer num2) {
            return num != null ? num.intValue() == 0 ? aVar.mo13881g(context, i) : aVar.mo13879e(context, i) : num2 != null ? aVar.mo13877c(i, num2.intValue()) : aVar.mo13876b(context, i);
        }
    }

    /* renamed from: io.flutter.plugins.googlemobileads.m$e */
    static class C3074e extends C3069m {
        C3074e() {
            super(C0024h.f31o);
        }
    }

    C3069m(int i, int i2) {
        this(new C0024h(i, i2));
    }

    C3069m(C0024h hVar) {
        this.f20155a = hVar;
        this.f20156b = hVar.mo60j();
        this.f20157c = hVar.mo56c();
    }

    /* renamed from: a */
    public C0024h mo13872a() {
        return this.f20155a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3069m)) {
            return false;
        }
        C3069m mVar = (C3069m) obj;
        if (this.f20156b != mVar.f20156b) {
            return false;
        }
        return this.f20157c == mVar.f20157c;
    }

    public int hashCode() {
        return (this.f20156b * 31) + this.f20157c;
    }
}
