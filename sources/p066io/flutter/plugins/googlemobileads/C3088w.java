package p066io.flutter.plugins.googlemobileads;

import android.util.Log;
import java.util.Map;
import p066io.flutter.plugin.platform.C3007f;
import p066io.flutter.plugins.googlemobileads.C3052g0;
import p104o1.C3821c;
import p104o1.C3825d;
import p104o1.C3827e;

/* renamed from: io.flutter.plugins.googlemobileads.w */
class C3088w extends C3042e {

    /* renamed from: b */
    private final C3028a f20195b;

    /* renamed from: c */
    private final String f20196c;

    /* renamed from: d */
    private final C3052g0.C3055c f20197d;

    /* renamed from: e */
    private final C3056h f20198e;

    /* renamed from: f */
    private C3067l f20199f;

    /* renamed from: g */
    private C3059i f20200g;

    /* renamed from: h */
    private Map<String, Object> f20201h;

    /* renamed from: i */
    private C3827e f20202i;

    /* renamed from: j */
    private final C3092z f20203j;

    /* renamed from: io.flutter.plugins.googlemobileads.w$a */
    static class C3089a {

        /* renamed from: a */
        private C3028a f20204a;

        /* renamed from: b */
        private String f20205b;

        /* renamed from: c */
        private C3052g0.C3055c f20206c;

        /* renamed from: d */
        private C3067l f20207d;

        /* renamed from: e */
        private C3059i f20208e;

        /* renamed from: f */
        private Map<String, Object> f20209f;

        /* renamed from: g */
        private Integer f20210g;

        /* renamed from: h */
        private C3092z f20211h;

        /* renamed from: i */
        private C3056h f20212i;

        C3089a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C3088w mo13902a() {
            if (this.f20204a == null) {
                throw new IllegalStateException("AdInstanceManager cannot not be null.");
            } else if (this.f20205b == null) {
                throw new IllegalStateException("AdUnitId cannot not be null.");
            } else if (this.f20206c != null) {
                C3067l lVar = this.f20207d;
                if (lVar == null && this.f20208e == null) {
                    throw new IllegalStateException("adRequest or addManagerRequest must be non-null.");
                } else if (lVar == null) {
                    return new C3088w(this.f20210g.intValue(), this.f20204a, this.f20205b, this.f20206c, this.f20208e, this.f20212i, this.f20209f, this.f20211h);
                } else {
                    return new C3088w(this.f20210g.intValue(), this.f20204a, this.f20205b, this.f20206c, this.f20207d, this.f20212i, this.f20209f, this.f20211h);
                }
            } else {
                throw new IllegalStateException("NativeAdFactory cannot not be null.");
            }
        }

        /* renamed from: b */
        public C3089a mo13903b(C3052g0.C3055c cVar) {
            this.f20206c = cVar;
            return this;
        }

        /* renamed from: c */
        public C3089a mo13904c(C3059i iVar) {
            this.f20208e = iVar;
            return this;
        }

        /* renamed from: d */
        public C3089a mo13905d(String str) {
            this.f20205b = str;
            return this;
        }

        /* renamed from: e */
        public C3089a mo13906e(Map<String, Object> map) {
            this.f20209f = map;
            return this;
        }

        /* renamed from: f */
        public C3089a mo13907f(C3056h hVar) {
            this.f20212i = hVar;
            return this;
        }

        /* renamed from: g */
        public C3089a mo13908g(int i) {
            this.f20210g = Integer.valueOf(i);
            return this;
        }

        /* renamed from: h */
        public C3089a mo13909h(C3028a aVar) {
            this.f20204a = aVar;
            return this;
        }

        /* renamed from: i */
        public C3089a mo13910i(C3092z zVar) {
            this.f20211h = zVar;
            return this;
        }

        /* renamed from: j */
        public C3089a mo13911j(C3067l lVar) {
            this.f20207d = lVar;
            return this;
        }
    }

    protected C3088w(int i, C3028a aVar, String str, C3052g0.C3055c cVar, C3059i iVar, C3056h hVar, Map<String, Object> map, C3092z zVar) {
        super(i);
        this.f20195b = aVar;
        this.f20196c = str;
        this.f20197d = cVar;
        this.f20200g = iVar;
        this.f20198e = hVar;
        this.f20201h = map;
        this.f20203j = zVar;
    }

    protected C3088w(int i, C3028a aVar, String str, C3052g0.C3055c cVar, C3067l lVar, C3056h hVar, Map<String, Object> map, C3092z zVar) {
        super(i);
        this.f20195b = aVar;
        this.f20196c = str;
        this.f20197d = cVar;
        this.f20199f = lVar;
        this.f20198e = hVar;
        this.f20201h = map;
        this.f20203j = zVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo13771b() {
        C3827e eVar = this.f20202i;
        if (eVar != null) {
            eVar.mo15219a();
            this.f20202i = null;
        }
    }

    /* renamed from: c */
    public C3007f mo13784c() {
        C3827e eVar = this.f20202i;
        if (eVar == null) {
            return null;
        }
        return new C3033b0(eVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo13900d() {
        C3091y yVar = new C3091y(this);
        C3090x xVar = new C3090x(this.f20081a, this.f20195b);
        C3092z zVar = this.f20203j;
        C3825d a = zVar == null ? new C3825d.C3826a().mo15212a() : zVar.mo13913a();
        C3067l lVar = this.f20199f;
        if (lVar != null) {
            C3056h hVar = this.f20198e;
            String str = this.f20196c;
            hVar.mo13825h(str, yVar, a, xVar, lVar.mo13847b(str));
            return;
        }
        C3059i iVar = this.f20200g;
        if (iVar != null) {
            this.f20198e.mo13820c(this.f20196c, yVar, a, xVar, iVar.mo13830k(this.f20196c));
        } else {
            Log.e("FlutterNativeAd", "A null or invalid ad request was provided.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo13901e(C3821c cVar) {
        this.f20202i = this.f20197d.mo13817a(cVar, this.f20201h);
        cVar.mo8142b(new C3030a0(this.f20195b, this));
        this.f20195b.mo13753m(this.f20081a, cVar.mo8141a());
    }
}
