package p174z3;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p005a4.C0144j;
import p005a4.C0145k;
import p005a4.C0159s;
import p099n3.C3768b;
import p106o3.C3832a;

/* renamed from: z3.k */
public class C4572k {

    /* renamed from: a */
    private final C0145k f23147a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C4580g f23148b;

    /* renamed from: c */
    private final C0145k.C0149c f23149c;

    /* renamed from: z3.k$a */
    class C4573a implements C0145k.C0149c {
        C4573a() {
        }

        /* renamed from: b */
        private void m27548b(C0144j jVar, C0145k.C0150d dVar) {
            try {
                C4572k.this.f23148b.mo13725g(((Integer) jVar.mo333b()).intValue());
                dVar.mo338a((Object) null);
            } catch (IllegalStateException e) {
                dVar.mo339b("error", C4572k.m27544c(e), (Object) null);
            }
        }

        /* renamed from: c */
        private void m27549c(C0144j jVar, C0145k.C0150d dVar) {
            C0145k.C0150d dVar2 = dVar;
            Map map = (Map) jVar.mo333b();
            boolean z = true;
            boolean z2 = map.containsKey("hybrid") && ((Boolean) map.get("hybrid")).booleanValue();
            ByteBuffer wrap = map.containsKey("params") ? ByteBuffer.wrap((byte[]) map.get("params")) : null;
            if (z2) {
                try {
                    C4572k.this.f23148b.mo13719a(new C4576d(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), 0.0d, 0.0d, 0.0d, 0.0d, ((Integer) map.get("direction")).intValue(), C4576d.C4577a.HYBRID_ONLY, wrap));
                } catch (IllegalStateException e) {
                    dVar2.mo339b("error", C4572k.m27544c(e), (Object) null);
                    return;
                }
            } else {
                if (!map.containsKey("hybridFallback") || !((Boolean) map.get("hybridFallback")).booleanValue()) {
                    z = false;
                }
                C4576d.C4577a aVar = z ? C4576d.C4577a.TEXTURE_WITH_HYBRID_FALLBACK : C4576d.C4577a.TEXTURE_WITH_VIRTUAL_FALLBACK;
                int intValue = ((Integer) map.get("id")).intValue();
                String str = (String) map.get("viewType");
                double d = 0.0d;
                double doubleValue = map.containsKey("top") ? ((Double) map.get("top")).doubleValue() : 0.0d;
                if (map.containsKey("left")) {
                    d = ((Double) map.get("left")).doubleValue();
                }
                long f = C4572k.this.f23148b.mo13724f(new C4576d(intValue, str, doubleValue, d, ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue(), ((Integer) map.get("direction")).intValue(), aVar, wrap));
                if (f != -2) {
                    dVar2.mo338a(Long.valueOf(f));
                    return;
                } else if (!z) {
                    throw new AssertionError("Platform view attempted to fall back to hybrid mode when not requested.");
                }
            }
            dVar2.mo338a((Object) null);
        }

        /* renamed from: d */
        private void m27550d(C0144j jVar, C0145k.C0150d dVar) {
            try {
                C4572k.this.f23148b.mo13726h(((Integer) ((Map) jVar.mo333b()).get("id")).intValue());
                dVar.mo338a((Object) null);
            } catch (IllegalStateException e) {
                dVar.mo339b("error", C4572k.m27544c(e), (Object) null);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static /* synthetic */ void m27551e(C0145k.C0150d dVar, C4575c cVar) {
            if (cVar == null) {
                dVar.mo339b("error", "Failed to resize the platform view", (Object) null);
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("width", Double.valueOf((double) cVar.f23151a));
            hashMap.put("height", Double.valueOf((double) cVar.f23152b));
            dVar.mo338a(hashMap);
        }

        /* renamed from: f */
        private void m27552f(C0144j jVar, C0145k.C0150d dVar) {
            Map map = (Map) jVar.mo333b();
            try {
                C4572k.this.f23148b.mo13721c(((Integer) map.get("id")).intValue(), ((Double) map.get("top")).doubleValue(), ((Double) map.get("left")).doubleValue());
                dVar.mo338a((Object) null);
            } catch (IllegalStateException e) {
                dVar.mo339b("error", C4572k.m27544c(e), (Object) null);
            }
        }

        /* renamed from: g */
        private void m27553g(C0144j jVar, C0145k.C0150d dVar) {
            Map map = (Map) jVar.mo333b();
            try {
                C4572k.this.f23148b.mo13727i(new C4578e(((Integer) map.get("id")).intValue(), ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue()), new C4571j(dVar));
            } catch (IllegalStateException e) {
                dVar.mo339b("error", C4572k.m27544c(e), (Object) null);
            }
        }

        /* renamed from: h */
        private void m27554h(C0144j jVar, C0145k.C0150d dVar) {
            Map map = (Map) jVar.mo333b();
            try {
                C4572k.this.f23148b.mo13722d(((Integer) map.get("id")).intValue(), ((Integer) map.get("direction")).intValue());
                dVar.mo338a((Object) null);
            } catch (IllegalStateException e) {
                dVar.mo339b("error", C4572k.m27544c(e), (Object) null);
            }
        }

        /* renamed from: i */
        private void m27555i(C0144j jVar, C0145k.C0150d dVar) {
            try {
                C4572k.this.f23148b.mo13720b(((Boolean) jVar.mo333b()).booleanValue());
                dVar.mo338a((Object) null);
            } catch (IllegalStateException e) {
                dVar.mo339b("error", C4572k.m27544c(e), (Object) null);
            }
        }

        /* renamed from: j */
        private void m27556j(C0144j jVar, C0145k.C0150d dVar) {
            C0145k.C0150d dVar2;
            C0145k.C0150d dVar3 = dVar;
            List list = (List) jVar.mo333b();
            C4579f fVar = r2;
            C4579f fVar2 = fVar;
            C4579f fVar3 = new C4579f(((Integer) list.get(0)).intValue(), (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue());
            try {
                C4572k.this.f23148b.mo13723e(fVar);
                dVar2 = dVar;
                try {
                    dVar2.mo338a((Object) null);
                } catch (IllegalStateException e) {
                    e = e;
                }
            } catch (IllegalStateException e2) {
                e = e2;
                dVar2 = dVar;
                dVar2.mo339b("error", C4572k.m27544c(e), (Object) null);
            }
        }

        public void onMethodCall(C0144j jVar, C0145k.C0150d dVar) {
            if (C4572k.this.f23148b != null) {
                C3768b.m25592f("PlatformViewsChannel", "Received '" + jVar.f269a + "' message.");
                String str = jVar.f269a;
                str.hashCode();
                char c = 65535;
                switch (str.hashCode()) {
                    case -1352294148:
                        if (str.equals("create")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1019779949:
                        if (str.equals("offset")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -934437708:
                        if (str.equals("resize")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -756050293:
                        if (str.equals("clearFocus")) {
                            c = 3;
                            break;
                        }
                        break;
                    case -308988850:
                        if (str.equals("synchronizeToNativeViewHierarchy")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 110550847:
                        if (str.equals("touch")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 576796989:
                        if (str.equals("setDirection")) {
                            c = 6;
                            break;
                        }
                        break;
                    case 1671767583:
                        if (str.equals("dispose")) {
                            c = 7;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        m27549c(jVar, dVar);
                        return;
                    case 1:
                        m27552f(jVar, dVar);
                        return;
                    case 2:
                        m27553g(jVar, dVar);
                        return;
                    case 3:
                        m27548b(jVar, dVar);
                        return;
                    case 4:
                        m27555i(jVar, dVar);
                        return;
                    case 5:
                        m27556j(jVar, dVar);
                        return;
                    case 6:
                        m27554h(jVar, dVar);
                        return;
                    case 7:
                        m27550d(jVar, dVar);
                        return;
                    default:
                        dVar.mo340c();
                        return;
                }
            }
        }
    }

    /* renamed from: z3.k$b */
    public interface C4574b {
        /* renamed from: a */
        void mo16237a(C4575c cVar);
    }

    /* renamed from: z3.k$c */
    public static class C4575c {

        /* renamed from: a */
        public final int f23151a;

        /* renamed from: b */
        public final int f23152b;

        public C4575c(int i, int i2) {
            this.f23151a = i;
            this.f23152b = i2;
        }
    }

    /* renamed from: z3.k$d */
    public static class C4576d {

        /* renamed from: a */
        public final int f23153a;

        /* renamed from: b */
        public final String f23154b;

        /* renamed from: c */
        public final double f23155c;

        /* renamed from: d */
        public final double f23156d;

        /* renamed from: e */
        public final double f23157e;

        /* renamed from: f */
        public final double f23158f;

        /* renamed from: g */
        public final int f23159g;

        /* renamed from: h */
        public final C4577a f23160h;

        /* renamed from: i */
        public final ByteBuffer f23161i;

        /* renamed from: z3.k$d$a */
        public enum C4577a {
            TEXTURE_WITH_VIRTUAL_FALLBACK,
            TEXTURE_WITH_HYBRID_FALLBACK,
            HYBRID_ONLY
        }

        public C4576d(int i, String str, double d, double d2, double d3, double d4, int i2, C4577a aVar, ByteBuffer byteBuffer) {
            this.f23153a = i;
            this.f23154b = str;
            this.f23157e = d;
            this.f23158f = d2;
            this.f23155c = d3;
            this.f23156d = d4;
            this.f23159g = i2;
            this.f23160h = aVar;
            this.f23161i = byteBuffer;
        }
    }

    /* renamed from: z3.k$e */
    public static class C4578e {

        /* renamed from: a */
        public final int f23166a;

        /* renamed from: b */
        public final double f23167b;

        /* renamed from: c */
        public final double f23168c;

        public C4578e(int i, double d, double d2) {
            this.f23166a = i;
            this.f23167b = d;
            this.f23168c = d2;
        }
    }

    /* renamed from: z3.k$f */
    public static class C4579f {

        /* renamed from: a */
        public final int f23169a;

        /* renamed from: b */
        public final Number f23170b;

        /* renamed from: c */
        public final Number f23171c;

        /* renamed from: d */
        public final int f23172d;

        /* renamed from: e */
        public final int f23173e;

        /* renamed from: f */
        public final Object f23174f;

        /* renamed from: g */
        public final Object f23175g;

        /* renamed from: h */
        public final int f23176h;

        /* renamed from: i */
        public final int f23177i;

        /* renamed from: j */
        public final float f23178j;

        /* renamed from: k */
        public final float f23179k;

        /* renamed from: l */
        public final int f23180l;

        /* renamed from: m */
        public final int f23181m;

        /* renamed from: n */
        public final int f23182n;

        /* renamed from: o */
        public final int f23183o;

        /* renamed from: p */
        public final long f23184p;

        public C4579f(int i, Number number, Number number2, int i2, int i3, Object obj, Object obj2, int i4, int i5, float f, float f2, int i6, int i7, int i8, int i9, long j) {
            this.f23169a = i;
            this.f23170b = number;
            this.f23171c = number2;
            this.f23172d = i2;
            this.f23173e = i3;
            this.f23174f = obj;
            this.f23175g = obj2;
            this.f23176h = i4;
            this.f23177i = i5;
            this.f23178j = f;
            this.f23179k = f2;
            this.f23180l = i6;
            this.f23181m = i7;
            this.f23182n = i8;
            this.f23183o = i9;
            this.f23184p = j;
        }
    }

    /* renamed from: z3.k$g */
    public interface C4580g {
        /* renamed from: a */
        void mo13719a(C4576d dVar);

        /* renamed from: b */
        void mo13720b(boolean z);

        /* renamed from: c */
        void mo13721c(int i, double d, double d2);

        /* renamed from: d */
        void mo13722d(int i, int i2);

        /* renamed from: e */
        void mo13723e(C4579f fVar);

        /* renamed from: f */
        long mo13724f(C4576d dVar);

        /* renamed from: g */
        void mo13725g(int i);

        /* renamed from: h */
        void mo13726h(int i);

        /* renamed from: i */
        void mo13727i(C4578e eVar, C4574b bVar);
    }

    public C4572k(C3832a aVar) {
        C4573a aVar2 = new C4573a();
        this.f23149c = aVar2;
        C0145k kVar = new C0145k(aVar, "flutter/platform_views", C0159s.f284b);
        this.f23147a = kVar;
        kVar.mo337e(aVar2);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static String m27544c(Exception exc) {
        return C3768b.m25590d(exc);
    }

    /* renamed from: d */
    public void mo16238d(int i) {
        C0145k kVar = this.f23147a;
        if (kVar != null) {
            kVar.mo335c("viewFocused", Integer.valueOf(i));
        }
    }

    /* renamed from: e */
    public void mo16239e(C4580g gVar) {
        this.f23148b = gVar;
    }
}
