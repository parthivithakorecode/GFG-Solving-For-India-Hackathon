package p101n5;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.C3340f;
import kotlin.coroutines.jvm.internal.C3346k;
import kotlin.jvm.internal.C3353e;
import kotlin.jvm.internal.C3356h;
import kotlin.jvm.internal.C3357i;
import p005a4.C0144j;
import p005a4.C0145k;
import p016b5.C1368k0;
import p016b5.C1372l0;
import p016b5.C1377m0;
import p016b5.C1391q1;
import p016b5.C1419y0;
import p079k4.C3321j;
import p079k4.C3325l;
import p079k4.C3327n;
import p079k4.C3330q;
import p100n4.C3773d;
import p108o5.C3872m;
import p132s3.C4047a;
import p145u4.C4154p;

/* renamed from: n5.d */
public final class C3788d implements C4047a {

    /* renamed from: i */
    public static final C3789a f21700i = new C3789a((C3353e) null);

    /* renamed from: a */
    private final C1368k0 f21701a = C1372l0.m5414a(C1419y0.m5579c());

    /* renamed from: b */
    private C0145k f21702b;

    /* renamed from: c */
    private C0145k f21703c;

    /* renamed from: d */
    private Context f21704d;

    /* renamed from: e */
    private final Map<String, C3872m> f21705e = new LinkedHashMap();

    /* renamed from: f */
    private final Handler f21706f = new Handler(Looper.getMainLooper());

    /* renamed from: g */
    private Runnable f21707g;

    /* renamed from: h */
    private C3785a f21708h = new C3785a();

    /* renamed from: n5.d$a */
    public static final class C3789a {
        private C3789a() {
        }

        public /* synthetic */ C3789a(C3353e eVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final Map<String, Object> m25640b(String str, Object obj) {
            C3321j[] jVarArr = new C3321j[2];
            jVarArr[0] = C3327n.m24453a("playerId", str);
            jVarArr[1] = obj != null ? C3327n.m24453a("value", obj) : null;
            return C3602z.m25083g(C3585i.m25032e(jVarArr));
        }

        /* renamed from: c */
        static /* synthetic */ Map m25641c(C3789a aVar, String str, Object obj, int i, Object obj2) {
            if ((i & 2) != 0) {
                obj = null;
            }
            return aVar.m25640b(str, obj);
        }
    }

    /* renamed from: n5.d$b */
    private static final class C3790b implements Runnable {

        /* renamed from: f */
        private final WeakReference<Map<String, C3872m>> f21709f;

        /* renamed from: g */
        private final WeakReference<C0145k> f21710g;

        /* renamed from: h */
        private final WeakReference<Handler> f21711h;

        /* renamed from: i */
        private final WeakReference<C3788d> f21712i;

        public C3790b(Map<String, C3872m> map, C0145k kVar, Handler handler, C3788d dVar) {
            C3357i.m24508e(map, "mediaPlayers");
            C3357i.m24508e(kVar, "channel");
            C3357i.m24508e(handler, "handler");
            C3357i.m24508e(dVar, "audioplayersPlugin");
            this.f21709f = new WeakReference<>(map);
            this.f21710g = new WeakReference<>(kVar);
            this.f21711h = new WeakReference<>(handler);
            this.f21712i = new WeakReference<>(dVar);
        }

        public void run() {
            Map map = (Map) this.f21709f.get();
            C0145k kVar = (C0145k) this.f21710g.get();
            Handler handler = (Handler) this.f21711h.get();
            C3788d dVar = (C3788d) this.f21712i.get();
            if (map != null && kVar != null && handler != null && dVar != null) {
                boolean z = true;
                for (C3872m mVar : map.values()) {
                    if (mVar.mo15338q()) {
                        String k = mVar.mo15332k();
                        Integer i = mVar.mo15331i();
                        Integer h = mVar.mo15330h();
                        C3789a aVar = C3788d.f21700i;
                        kVar.mo335c("audio.onDuration", aVar.m25640b(k, Integer.valueOf(i != null ? i.intValue() : 0)));
                        kVar.mo335c("audio.onCurrentPosition", aVar.m25640b(k, Integer.valueOf(h != null ? h.intValue() : 0)));
                        z = false;
                    }
                }
                if (z) {
                    dVar.m25632s();
                } else {
                    handler.postDelayed(this, 200);
                }
            } else if (dVar != null) {
                dVar.m25632s();
            }
        }
    }

    /* renamed from: n5.d$c */
    /* synthetic */ class C3791c extends C3356h implements C4154p<C0144j, C0145k.C0150d, C3330q> {
        C3791c(Object obj) {
            super(2, obj, C3788d.class, "handler", "handler(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", 0);
        }

        /* renamed from: b */
        public final void mo15036b(C0144j jVar, C0145k.C0150d dVar) {
            C3357i.m24508e(jVar, "p0");
            C3357i.m24508e(dVar, "p1");
            ((C3788d) this.receiver).m25627n(jVar, dVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo15036b((C0144j) obj, (C0145k.C0150d) obj2);
            return C3330q.f20829a;
        }
    }

    /* renamed from: n5.d$d */
    /* synthetic */ class C3792d extends C3356h implements C4154p<C0144j, C0145k.C0150d, C3330q> {
        C3792d(Object obj) {
            super(2, obj, C3788d.class, "globalHandler", "globalHandler(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", 0);
        }

        /* renamed from: b */
        public final void mo15037b(C0144j jVar, C0145k.C0150d dVar) {
            C3357i.m24508e(jVar, "p0");
            C3357i.m24508e(dVar, "p1");
            ((C3788d) this.receiver).m25626h(jVar, dVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo15037b((C0144j) obj, (C0145k.C0150d) obj2);
            return C3330q.f20829a;
        }
    }

    @C3340f(mo14340c = "xyz.luan.audioplayers.AudioplayersPlugin$safeCall$1", mo14341f = "AudioplayersPlugin.kt", mo14342l = {}, mo14343m = "invokeSuspend")
    /* renamed from: n5.d$e */
    static final class C3793e extends C3346k implements C4154p<C1368k0, C3773d<? super C3330q>, Object> {

        /* renamed from: f */
        int f21713f;

        /* renamed from: g */
        final /* synthetic */ C4154p<C0144j, C0145k.C0150d, C3330q> f21714g;

        /* renamed from: h */
        final /* synthetic */ C0144j f21715h;

        /* renamed from: i */
        final /* synthetic */ C0145k.C0150d f21716i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3793e(C4154p<? super C0144j, ? super C0145k.C0150d, C3330q> pVar, C0144j jVar, C0145k.C0150d dVar, C3773d<? super C3793e> dVar2) {
            super(2, dVar2);
            this.f21714g = pVar;
            this.f21715h = jVar;
            this.f21716i = dVar;
        }

        public final C3773d<C3330q> create(Object obj, C3773d<?> dVar) {
            return new C3793e(this.f21714g, this.f21715h, this.f21716i, dVar);
        }

        public final Object invoke(C1368k0 k0Var, C3773d<? super C3330q> dVar) {
            return ((C3793e) create(k0Var, dVar)).invokeSuspend(C3330q.f20829a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C3858d.m25871c();
            if (this.f21713f == 0) {
                C3325l.m24451b(obj);
                try {
                    this.f21714g.invoke(this.f21715h, this.f21716i);
                } catch (Exception e) {
                    C3797h.f21723a.mo15043a("Unexpected error!", e);
                    this.f21716i.mo339b("Unexpected error!", e.getMessage(), e);
                }
                return C3330q.f20829a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: g */
    private final C3872m m25625g(String str) {
        Map<String, C3872m> map = this.f21705e;
        C3872m mVar = map.get(str);
        if (mVar == null) {
            mVar = new C3872m(this, str, C3785a.m25612c(this.f21708h, false, false, 0, 0, (Integer) null, 31, (Object) null));
            map.put(str, mVar);
        }
        return mVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public final void m25626h(C0144j jVar, C0145k.C0150d dVar) {
        C3796g gVar;
        String str = jVar.f269a;
        if (C3357i.m24504a(str, "changeLogLevel")) {
            String str2 = (String) jVar.mo332a("value");
            if (str2 == null) {
                gVar = null;
            } else {
                C3357i.m24507d(str2, "argument<String>(name) ?: return null");
                gVar = C3796g.valueOf(C3794e.m25646c((String) C3593q.m25047r(C0179o.m530Q(str2, new char[]{'.'}, false, 0, 6, (Object) null))));
            }
            if (gVar != null) {
                C3797h.f21723a.mo15045e(gVar);
            } else {
                throw new IllegalStateException("value is required".toString());
            }
        } else if (C3357i.m24504a(str, "setGlobalAudioContext")) {
            this.f21708h = C3794e.m25645b(jVar);
        }
        dVar.mo338a(1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: n5.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: n5.j} */
    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: type inference failed for: r6v6 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0115, code lost:
        if (r0 != null) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0117, code lost:
        r10 = r0.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x011b, code lost:
        r0 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x011f, code lost:
        r1.mo338a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0122, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01c9, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0221, code lost:
        if (r0 != null) goto L_0x0117;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m25627n(p005a4.C0144j r18, p005a4.C0145k.C0150d r19) {
        /*
            r17 = this;
            r0 = r18
            r1 = r19
            java.lang.String r2 = "playerId"
            java.lang.Object r2 = r0.mo332a(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L_0x000f
            return
        L_0x000f:
            r3 = r17
            o5.m r2 = r3.m25625g(r2)
            java.lang.String r4 = r0.f269a
            if (r4 == 0) goto L_0x0225
            int r5 = r4.hashCode()
            r6 = 0
            r7 = 46
            java.lang.String r8 = "argument<String>(name) ?: return null"
            r9 = 1
            r10 = 0
            switch(r5) {
                case -1757019252: goto L_0x0214;
                case -1722943962: goto L_0x01cf;
                case -934426579: goto L_0x01bd;
                case -402284771: goto L_0x0194;
                case -159032046: goto L_0x015b;
                case 3526264: goto L_0x0132;
                case 3540994: goto L_0x0123;
                case 85887754: goto L_0x0107;
                case 106440182: goto L_0x00f8;
                case 670514716: goto L_0x00ce;
                case 1090594823: goto L_0x00bf;
                case 1771699022: goto L_0x0083;
                case 1902436987: goto L_0x0070;
                case 2096116872: goto L_0x0029;
                default: goto L_0x0027;
            }
        L_0x0027:
            goto L_0x0225
        L_0x0029:
            java.lang.String r5 = "setReleaseMode"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0033
            goto L_0x0225
        L_0x0033:
            java.lang.String r4 = "releaseMode"
            java.lang.Object r0 = r0.mo332a(r4)
            r11 = r0
            java.lang.String r11 = (java.lang.String) r11
            if (r11 != 0) goto L_0x003f
            goto L_0x005d
        L_0x003f:
            kotlin.jvm.internal.C3357i.m24507d(r11, r8)
            char[] r12 = new char[r9]
            r12[r10] = r7
            r13 = 0
            r14 = 0
            r15 = 6
            r16 = 0
            java.util.List r0 = p006a5.C0179o.m530Q(r11, r12, r13, r14, r15, r16)
            java.lang.Object r0 = p086l4.C3593q.m25047r(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = p101n5.C3794e.m25646c(r0)
            n5.j r6 = p101n5.C3800j.valueOf(r0)
        L_0x005d:
            if (r6 == 0) goto L_0x0064
            r2.mo15322F(r6)
            goto L_0x01c9
        L_0x0064:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "releaseMode is required"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0070:
            java.lang.String r5 = "setAudioContext"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x007a
            goto L_0x0225
        L_0x007a:
            n5.a r0 = p101n5.C3794e.m25645b(r18)
            r2.mo15326J(r0)
            goto L_0x01c9
        L_0x0083:
            java.lang.String r5 = "setSourceBytes"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x008d
            goto L_0x0225
        L_0x008d:
            java.lang.String r4 = "bytes"
            java.lang.Object r0 = r0.mo332a(r4)
            byte[] r0 = (byte[]) r0
            if (r0 == 0) goto L_0x00b3
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 23
            if (r4 < r5) goto L_0x00a7
            p5.a r4 = new p5.a
            r4.<init>((byte[]) r0)
            r2.mo15323G(r4)
            goto L_0x01c9
        L_0x00a7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Operation not supported on Android <= M"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00b3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "bytes are required"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00bf:
            java.lang.String r0 = "release"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x00c9
            goto L_0x0225
        L_0x00c9:
            r2.mo15317A()
            goto L_0x01c9
        L_0x00ce:
            java.lang.String r5 = "setVolume"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x00d8
            goto L_0x0225
        L_0x00d8:
            java.lang.String r4 = "volume"
            java.lang.Object r0 = r0.mo332a(r4)
            java.lang.Double r0 = (java.lang.Double) r0
            if (r0 == 0) goto L_0x00ec
            double r4 = r0.doubleValue()
            float r0 = (float) r4
            r2.mo15324H(r0)
            goto L_0x01c9
        L_0x00ec:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "volume is required"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00f8:
            java.lang.String r0 = "pause"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0102
            goto L_0x0225
        L_0x0102:
            r2.mo15345y()
            goto L_0x01c9
        L_0x0107:
            java.lang.String r0 = "getDuration"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0111
            goto L_0x0225
        L_0x0111:
            java.lang.Integer r0 = r2.mo15331i()
            if (r0 == 0) goto L_0x011b
        L_0x0117:
            int r10 = r0.intValue()
        L_0x011b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
        L_0x011f:
            r1.mo338a(r0)
            return
        L_0x0123:
            java.lang.String r0 = "stop"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x012d
            goto L_0x0225
        L_0x012d:
            r2.mo15325I()
            goto L_0x01c9
        L_0x0132:
            java.lang.String r5 = "seek"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x013c
            goto L_0x0225
        L_0x013c:
            java.lang.String r4 = "position"
            java.lang.Object r0 = r0.mo332a(r4)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L_0x014f
            int r0 = r0.intValue()
            r2.mo15318B(r0)
            goto L_0x01c9
        L_0x014f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "position is required"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x015b:
            java.lang.String r5 = "setSourceUrl"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0165
            goto L_0x0225
        L_0x0165:
            java.lang.String r4 = "url"
            java.lang.Object r4 = r0.mo332a(r4)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x0188
            java.lang.String r5 = "isLocal"
            java.lang.Object r0 = r0.mo332a(r5)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 != 0) goto L_0x017b
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
        L_0x017b:
            boolean r0 = r0.booleanValue()
            p5.c r5 = new p5.c
            r5.<init>(r4, r0)
            r2.mo15323G(r5)
            goto L_0x01c9
        L_0x0188:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "url is required"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0194:
            java.lang.String r5 = "setPlaybackRate"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x019e
            goto L_0x0225
        L_0x019e:
            java.lang.String r4 = "playbackRate"
            java.lang.Object r0 = r0.mo332a(r4)
            java.lang.Double r0 = (java.lang.Double) r0
            if (r0 == 0) goto L_0x01b1
            double r4 = r0.doubleValue()
            float r0 = (float) r4
            r2.mo15321E(r0)
            goto L_0x01c9
        L_0x01b1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "playbackRate is required"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x01bd:
            java.lang.String r0 = "resume"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x01c6
            goto L_0x0225
        L_0x01c6:
            r2.mo15346z()
        L_0x01c9:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            goto L_0x011f
        L_0x01cf:
            java.lang.String r5 = "setPlayerMode"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x01d8
            goto L_0x0225
        L_0x01d8:
            java.lang.String r1 = "playerMode"
            java.lang.Object r0 = r0.mo332a(r1)
            r11 = r0
            java.lang.String r11 = (java.lang.String) r11
            if (r11 != 0) goto L_0x01e4
            goto L_0x0202
        L_0x01e4:
            kotlin.jvm.internal.C3357i.m24507d(r11, r8)
            char[] r12 = new char[r9]
            r12[r10] = r7
            r13 = 0
            r14 = 0
            r15 = 6
            r16 = 0
            java.util.List r0 = p006a5.C0179o.m530Q(r11, r12, r13, r14, r15, r16)
            java.lang.Object r0 = p086l4.C3593q.m25047r(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = p101n5.C3794e.m25646c(r0)
            n5.i r6 = p101n5.C3799i.valueOf(r0)
        L_0x0202:
            if (r6 == 0) goto L_0x0208
            r2.mo15319C(r6)
            return
        L_0x0208:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "playerMode is required"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0214:
            java.lang.String r0 = "getCurrentPosition"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x021d
            goto L_0x0225
        L_0x021d:
            java.lang.Integer r0 = r2.mo15330h()
            if (r0 == 0) goto L_0x011b
            goto L_0x0117
        L_0x0225:
            r19.mo340c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p101n5.C3788d.m25627n(a4.j, a4.k$d):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public static final void m25628o(C3788d dVar, C0144j jVar, C0145k.C0150d dVar2) {
        C3357i.m24508e(dVar, "this$0");
        C3357i.m24508e(jVar, "call");
        C3357i.m24508e(dVar2, "response");
        dVar.m25630q(jVar, dVar2, new C3791c(dVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public static final void m25629p(C3788d dVar, C0144j jVar, C0145k.C0150d dVar2) {
        C3357i.m24508e(dVar, "this$0");
        C3357i.m24508e(jVar, "call");
        C3357i.m24508e(dVar2, "response");
        dVar.m25630q(jVar, dVar2, new C3792d(dVar));
    }

    /* renamed from: q */
    private final void m25630q(C0144j jVar, C0145k.C0150d dVar, C4154p<? super C0144j, ? super C0145k.C0150d, C3330q> pVar) {
        C1391q1 unused = C1350h.m5344b(this.f21701a, C1419y0.m5578b(), (C1377m0) null, new C3793e(pVar, jVar, dVar, (C3773d<? super C3793e>) null), 2, (Object) null);
    }

    /* renamed from: r */
    private final void m25631r() {
        if (this.f21707g == null) {
            Map<String, C3872m> map = this.f21705e;
            C0145k kVar = this.f21702b;
            if (kVar == null) {
                C3357i.m24518o("channel");
                kVar = null;
            }
            C3790b bVar = new C3790b(map, kVar, this.f21706f, this);
            this.f21706f.post(bVar);
            this.f21707g = bVar;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public final void m25632s() {
        this.f21707g = null;
        this.f21706f.removeCallbacksAndMessages((Object) null);
    }

    /* renamed from: f */
    public final Context mo15029f() {
        Context context = this.f21704d;
        if (context == null) {
            C3357i.m24518o("context");
            context = null;
        }
        Context applicationContext = context.getApplicationContext();
        C3357i.m24507d(applicationContext, "context.applicationContext");
        return applicationContext;
    }

    /* renamed from: i */
    public final void mo15030i(C3872m mVar) {
        C3357i.m24508e(mVar, "player");
        C0145k kVar = this.f21702b;
        if (kVar == null) {
            C3357i.m24518o("channel");
            kVar = null;
        }
        kVar.mo335c("audio.onComplete", C3789a.m25641c(f21700i, mVar.mo15332k(), (Object) null, 2, (Object) null));
    }

    /* renamed from: j */
    public final void mo15031j(C3872m mVar) {
        C3357i.m24508e(mVar, "player");
        C0145k kVar = this.f21702b;
        if (kVar == null) {
            C3357i.m24518o("channel");
            kVar = null;
        }
        C3789a aVar = f21700i;
        String k = mVar.mo15332k();
        Integer i = mVar.mo15331i();
        kVar.mo335c("audio.onDuration", aVar.m25640b(k, Integer.valueOf(i != null ? i.intValue() : 0)));
    }

    /* renamed from: k */
    public final void mo15032k(C3872m mVar, String str) {
        C3357i.m24508e(mVar, "player");
        C3357i.m24508e(str, "message");
        C0145k kVar = this.f21702b;
        if (kVar == null) {
            C3357i.m24518o("channel");
            kVar = null;
        }
        kVar.mo335c("audio.onError", f21700i.m25640b(mVar.mo15332k(), str));
    }

    /* renamed from: l */
    public final void mo15033l() {
        m25631r();
    }

    /* renamed from: m */
    public final void mo15034m(C3872m mVar) {
        C3357i.m24508e(mVar, "player");
        C0145k kVar = this.f21702b;
        if (kVar == null) {
            C3357i.m24518o("channel");
            kVar = null;
        }
        kVar.mo335c("audio.onSeekComplete", C3789a.m25641c(f21700i, mVar.mo15332k(), (Object) null, 2, (Object) null));
    }

    public void onAttachedToEngine(C4047a.C4049b bVar) {
        C3357i.m24508e(bVar, "binding");
        Context a = bVar.mo15539a();
        C3357i.m24507d(a, "binding.applicationContext");
        this.f21704d = a;
        C0145k kVar = new C0145k(bVar.mo15540b(), "xyz.luan/audioplayers");
        this.f21702b = kVar;
        kVar.mo337e(new C3786b(this));
        C0145k kVar2 = new C0145k(bVar.mo15540b(), "xyz.luan/audioplayers.global");
        this.f21703c = kVar2;
        kVar2.mo337e(new C3787c(this));
    }

    public void onDetachedFromEngine(C4047a.C4049b bVar) {
        C3357i.m24508e(bVar, "binding");
        m25632s();
        for (C3872m A : this.f21705e.values()) {
            A.mo15317A();
        }
        this.f21705e.clear();
        C1372l0.m5416c(this.f21701a, (CancellationException) null, 1, (Object) null);
    }
}
