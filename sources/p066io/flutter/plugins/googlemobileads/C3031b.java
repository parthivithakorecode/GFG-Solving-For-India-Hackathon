package p066io.flutter.plugins.googlemobileads;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import p002a1.C0037u;
import p005a4.C0157r;
import p066io.flutter.plugins.googlemobileads.C3035c0;
import p066io.flutter.plugins.googlemobileads.C3042e;
import p066io.flutter.plugins.googlemobileads.C3059i;
import p066io.flutter.plugins.googlemobileads.C3067l;
import p066io.flutter.plugins.googlemobileads.C3069m;
import p066io.flutter.plugins.googlemobileads.C3076o;

/* renamed from: io.flutter.plugins.googlemobileads.b */
class C3031b extends C0157r {

    /* renamed from: d */
    Context f20054d;

    /* renamed from: e */
    final C3069m.C3070a f20055e = new C3069m.C3070a();

    /* renamed from: f */
    private C3062i0 f20056f;

    /* renamed from: io.flutter.plugins.googlemobileads.b$a */
    static /* synthetic */ class C3032a {

        /* renamed from: a */
        static final /* synthetic */ int[] f20057a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                io.flutter.plugins.googlemobileads.o$b[] r0 = p066io.flutter.plugins.googlemobileads.C3076o.C3078b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f20057a = r0
                io.flutter.plugins.googlemobileads.o$b r1 = p066io.flutter.plugins.googlemobileads.C3076o.C3078b.NOT_READY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f20057a     // Catch:{ NoSuchFieldError -> 0x001d }
                io.flutter.plugins.googlemobileads.o$b r1 = p066io.flutter.plugins.googlemobileads.C3076o.C3078b.READY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p066io.flutter.plugins.googlemobileads.C3031b.C3032a.<clinit>():void");
        }
    }

    C3031b(Context context) {
        this.f20054d = context;
    }

    /* renamed from: q */
    private static Boolean m23404q(Object obj) {
        if (obj == null) {
            return null;
        }
        return (Boolean) obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public Object mo352g(byte b, ByteBuffer byteBuffer) {
        switch (b) {
            case Byte.MIN_VALUE:
                return new C3069m(((Integer) mo352g(byteBuffer.get(), byteBuffer)).intValue(), ((Integer) mo352g(byteBuffer.get(), byteBuffer)).intValue());
            case -127:
                return new C3067l.C3068a().mo13867m((List) mo352g(byteBuffer.get(), byteBuffer)).mo13865k((String) mo352g(byteBuffer.get(), byteBuffer)).mo13871q(m23404q(mo352g(byteBuffer.get(), byteBuffer))).mo13870p((List) mo352g(byteBuffer.get(), byteBuffer)).mo13866l((Integer) mo352g(byteBuffer.get(), byteBuffer)).mo13868n((String) mo352g(byteBuffer.get(), byteBuffer)).mo13869o(this.f20056f).mo13864j((Map) mo352g(byteBuffer.get(), byteBuffer)).mo13834a();
            case -126:
                return new C3069m.C3072c();
            case -124:
                return new C3035c0.C3037b((Integer) mo352g(byteBuffer.get(), byteBuffer), (String) mo352g(byteBuffer.get(), byteBuffer));
            case -123:
                return new C3042e.C3045c(((Integer) mo352g(byteBuffer.get(), byteBuffer)).intValue(), (String) mo352g(byteBuffer.get(), byteBuffer), (String) mo352g(byteBuffer.get(), byteBuffer), (C3042e.C3047e) mo352g(byteBuffer.get(), byteBuffer));
            case -122:
                C3059i.C3061b bVar = new C3059i.C3061b();
                bVar.mo13867m((List) mo352g(byteBuffer.get(), byteBuffer));
                bVar.mo13865k((String) mo352g(byteBuffer.get(), byteBuffer));
                bVar.mo13836s((Map) mo352g(byteBuffer.get(), byteBuffer));
                bVar.mo13837t((Map) mo352g(byteBuffer.get(), byteBuffer));
                bVar.mo13871q((Boolean) mo352g(byteBuffer.get(), byteBuffer));
                bVar.mo13870p((List) mo352g(byteBuffer.get(), byteBuffer));
                bVar.mo13866l((Integer) mo352g(byteBuffer.get(), byteBuffer));
                bVar.mo13838u((String) mo352g(byteBuffer.get(), byteBuffer));
                bVar.mo13868n((String) mo352g(byteBuffer.get(), byteBuffer));
                bVar.mo13869o(this.f20056f);
                bVar.mo13864j((Map) mo352g(byteBuffer.get(), byteBuffer));
                return bVar.mo13834a();
            case -121:
                String str = (String) mo352g(byteBuffer.get(), byteBuffer);
                str.hashCode();
                if (str.equals("ready")) {
                    return C3076o.C3078b.READY;
                }
                if (str.equals("notReady")) {
                    return C3076o.C3078b.NOT_READY;
                }
                throw new IllegalArgumentException(String.format("Unable to handle state: %s", new Object[]{str}));
            case -120:
                return new C3076o((C3076o.C3078b) mo352g(byteBuffer.get(), byteBuffer), (String) mo352g(byteBuffer.get(), byteBuffer), (Number) mo352g(byteBuffer.get(), byteBuffer));
            case -119:
                return new C3084t((Map<String, C3076o>) (Map) mo352g(byteBuffer.get(), byteBuffer));
            case -118:
                return new C3048e0((String) mo352g(byteBuffer.get(), byteBuffer), (String) mo352g(byteBuffer.get(), byteBuffer));
            case -117:
                return new C3042e.C3043a(((Integer) mo352g(byteBuffer.get(), byteBuffer)).intValue(), (String) mo352g(byteBuffer.get(), byteBuffer), (String) mo352g(byteBuffer.get(), byteBuffer));
            case -116:
                return new C3042e.C3047e((String) mo352g(byteBuffer.get(), byteBuffer), (String) mo352g(byteBuffer.get(), byteBuffer), (List) mo352g(byteBuffer.get(), byteBuffer));
            case -115:
                return new C3042e.C3044b((String) mo352g(byteBuffer.get(), byteBuffer), ((Long) mo352g(byteBuffer.get(), byteBuffer)).longValue(), (String) mo352g(byteBuffer.get(), byteBuffer), (String) mo352g(byteBuffer.get(), byteBuffer), (Map) mo352g(byteBuffer.get(), byteBuffer), (C3042e.C3043a) mo352g(byteBuffer.get(), byteBuffer));
            case -114:
                return new C3069m.C3071b(this.f20054d, this.f20055e, (String) mo352g(byteBuffer.get(), byteBuffer), ((Integer) mo352g(byteBuffer.get(), byteBuffer)).intValue());
            case -113:
                return new C3069m.C3074e();
            case -112:
                return new C3092z((Integer) mo352g(byteBuffer.get(), byteBuffer), (Integer) mo352g(byteBuffer.get(), byteBuffer), (C3050f0) mo352g(byteBuffer.get(), byteBuffer), (Boolean) mo352g(byteBuffer.get(), byteBuffer), (Boolean) mo352g(byteBuffer.get(), byteBuffer), (Boolean) mo352g(byteBuffer.get(), byteBuffer));
            case -111:
                return new C3050f0((Boolean) mo352g(byteBuffer.get(), byteBuffer), (Boolean) mo352g(byteBuffer.get(), byteBuffer), (Boolean) mo352g(byteBuffer.get(), byteBuffer));
            case -110:
                Integer num = (Integer) mo352g(byteBuffer.get(), byteBuffer);
                return new C3069m.C3073d(this.f20055e, this.f20054d, ((Integer) mo352g(byteBuffer.get(), byteBuffer)).intValue(), num, (Integer) mo352g(byteBuffer.get(), byteBuffer));
            case -108:
                C0037u.C0038a aVar = new C0037u.C0038a();
                aVar.mo113b((String) mo352g(byteBuffer.get(), byteBuffer));
                aVar.mo114c(((Integer) mo352g(byteBuffer.get(), byteBuffer)).intValue());
                aVar.mo115d(((Integer) mo352g(byteBuffer.get(), byteBuffer)).intValue());
                aVar.mo116e((List) mo352g(byteBuffer.get(), byteBuffer));
                return aVar.mo112a();
            default:
                return super.mo352g(b, byteBuffer);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo353p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        Object d;
        String str;
        Object e;
        C3059i iVar;
        if (obj instanceof C3069m) {
            mo13768t(byteArrayOutputStream, (C3069m) obj);
            return;
        }
        if (obj instanceof C3059i) {
            byteArrayOutputStream.write(-122);
            C3059i iVar2 = (C3059i) obj;
            mo353p(byteArrayOutputStream, iVar2.mo13851f());
            mo353p(byteArrayOutputStream, iVar2.mo13849d());
            mo353p(byteArrayOutputStream, iVar2.mo13831l());
            mo353p(byteArrayOutputStream, iVar2.mo13832m());
            mo353p(byteArrayOutputStream, iVar2.mo13854i());
            mo353p(byteArrayOutputStream, iVar2.mo13853h());
            mo353p(byteArrayOutputStream, iVar2.mo13850e());
            e = iVar2.mo13833n();
            iVar = iVar2;
        } else if (obj instanceof C3067l) {
            byteArrayOutputStream.write(-127);
            C3067l lVar = (C3067l) obj;
            mo353p(byteArrayOutputStream, lVar.mo13851f());
            mo353p(byteArrayOutputStream, lVar.mo13849d());
            mo353p(byteArrayOutputStream, lVar.mo13854i());
            mo353p(byteArrayOutputStream, lVar.mo13853h());
            e = lVar.mo13850e();
            iVar = lVar;
        } else {
            if (obj instanceof C3035c0.C3037b) {
                byteArrayOutputStream.write(-124);
                C3035c0.C3037b bVar = (C3035c0.C3037b) obj;
                mo353p(byteArrayOutputStream, bVar.f20068a);
                d = bVar.f20069b;
            } else if (obj instanceof C3042e.C3044b) {
                byteArrayOutputStream.write(-115);
                C3042e.C3044b bVar2 = (C3042e.C3044b) obj;
                mo353p(byteArrayOutputStream, bVar2.mo13796b());
                mo353p(byteArrayOutputStream, Long.valueOf(bVar2.mo13801f()));
                mo353p(byteArrayOutputStream, bVar2.mo13798d());
                mo353p(byteArrayOutputStream, bVar2.mo13797c());
                mo353p(byteArrayOutputStream, bVar2.mo13795a());
                d = bVar2.mo13799e();
            } else if (obj instanceof C3042e.C3047e) {
                byteArrayOutputStream.write(-116);
                C3042e.C3047e eVar = (C3042e.C3047e) obj;
                mo353p(byteArrayOutputStream, eVar.mo13807c());
                mo353p(byteArrayOutputStream, eVar.mo13806b());
                d = eVar.mo13805a();
            } else if (obj instanceof C3042e.C3045c) {
                byteArrayOutputStream.write(-123);
                C3042e.C3045c cVar = (C3042e.C3045c) obj;
                mo353p(byteArrayOutputStream, Integer.valueOf(cVar.f20091a));
                mo353p(byteArrayOutputStream, cVar.f20092b);
                mo353p(byteArrayOutputStream, cVar.f20093c);
                d = cVar.f20094d;
            } else if (obj instanceof C3042e.C3043a) {
                byteArrayOutputStream.write(-117);
                C3042e.C3043a aVar = (C3042e.C3043a) obj;
                mo353p(byteArrayOutputStream, Integer.valueOf(aVar.f20082a));
                mo353p(byteArrayOutputStream, aVar.f20083b);
                d = aVar.f20084c;
            } else if (obj instanceof C3076o.C3078b) {
                byteArrayOutputStream.write(-121);
                C3076o.C3078b bVar3 = (C3076o.C3078b) obj;
                int i = C3032a.f20057a[bVar3.ordinal()];
                if (i == 1) {
                    str = "notReady";
                } else if (i == 2) {
                    str = "ready";
                } else {
                    throw new IllegalArgumentException(String.format("Unable to handle state: %s", new Object[]{bVar3}));
                }
                mo353p(byteArrayOutputStream, str);
                return;
            } else if (obj instanceof C3076o) {
                byteArrayOutputStream.write(-120);
                C3076o oVar = (C3076o) obj;
                mo353p(byteArrayOutputStream, oVar.f20164a);
                mo353p(byteArrayOutputStream, oVar.f20165b);
                d = oVar.f20166c;
            } else if (obj instanceof C3084t) {
                byteArrayOutputStream.write(-119);
                d = ((C3084t) obj).f20188a;
            } else if (obj instanceof C3048e0) {
                byteArrayOutputStream.write(-118);
                C3048e0 e0Var = (C3048e0) obj;
                mo353p(byteArrayOutputStream, e0Var.mo13812c());
                d = e0Var.mo13811b();
            } else if (obj instanceof C3092z) {
                byteArrayOutputStream.write(-112);
                C3092z zVar = (C3092z) obj;
                mo353p(byteArrayOutputStream, zVar.f20214a);
                mo353p(byteArrayOutputStream, zVar.f20215b);
                mo353p(byteArrayOutputStream, zVar.f20216c);
                mo353p(byteArrayOutputStream, zVar.f20217d);
                mo353p(byteArrayOutputStream, zVar.f20218e);
                d = zVar.f20219f;
            } else if (obj instanceof C0037u) {
                byteArrayOutputStream.write(-108);
                C0037u uVar = (C0037u) obj;
                mo353p(byteArrayOutputStream, uVar.mo107a());
                mo353p(byteArrayOutputStream, Integer.valueOf(uVar.mo108b()));
                mo353p(byteArrayOutputStream, Integer.valueOf(uVar.mo109c()));
                d = uVar.mo110d();
            } else if (obj instanceof C3050f0) {
                byteArrayOutputStream.write(-111);
                C3050f0 f0Var = (C3050f0) obj;
                mo353p(byteArrayOutputStream, f0Var.f20102a);
                mo353p(byteArrayOutputStream, f0Var.f20103b);
                mo353p(byteArrayOutputStream, f0Var.f20104c);
                return;
            } else {
                super.mo353p(byteArrayOutputStream, obj);
                return;
            }
            mo353p(byteArrayOutputStream, d);
        }
        mo353p(byteArrayOutputStream, e);
        mo353p(byteArrayOutputStream, iVar.mo13852g());
        d = iVar.mo13848c();
        mo353p(byteArrayOutputStream, d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo13766r(Context context) {
        this.f20054d = context;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo13767s(C3062i0 i0Var) {
        this.f20056f = i0Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo13768t(ByteArrayOutputStream byteArrayOutputStream, C3069m mVar) {
        int i;
        int i2;
        Integer valueOf;
        if (mVar instanceof C3069m.C3073d) {
            C3069m.C3073d dVar = (C3069m.C3073d) mVar;
            byteArrayOutputStream.write(-110);
            mo353p(byteArrayOutputStream, Integer.valueOf(dVar.f20156b));
            mo353p(byteArrayOutputStream, dVar.f20160e);
            valueOf = dVar.f20159d;
        } else {
            if (mVar instanceof C3069m.C3071b) {
                byteArrayOutputStream.write(-114);
                C3069m.C3071b bVar = (C3069m.C3071b) mVar;
                mo353p(byteArrayOutputStream, bVar.f20158d);
                i = bVar.f20156b;
            } else {
                if (mVar instanceof C3069m.C3074e) {
                    i2 = -113;
                } else if (mVar instanceof C3069m.C3072c) {
                    i2 = -126;
                } else {
                    byteArrayOutputStream.write(-128);
                    mo353p(byteArrayOutputStream, Integer.valueOf(mVar.f20156b));
                    i = mVar.f20157c;
                }
                byteArrayOutputStream.write(i2);
                return;
            }
            valueOf = Integer.valueOf(i);
        }
        mo353p(byteArrayOutputStream, valueOf);
    }
}
