package p108o5;

import android.content.Context;
import android.media.AudioManager;
import kotlin.jvm.internal.C3356h;
import kotlin.jvm.internal.C3357i;
import p079k4.C3320i;
import p079k4.C3330q;
import p101n5.C3785a;
import p101n5.C3788d;
import p101n5.C3799i;
import p101n5.C3800j;
import p115p5.C3931b;
import p145u4.C4139a;

/* renamed from: o5.m */
public final class C3872m {

    /* renamed from: a */
    private final C3788d f21905a;

    /* renamed from: b */
    private final String f21906b;

    /* renamed from: c */
    private C3785a f21907c;

    /* renamed from: d */
    private C3868j f21908d;

    /* renamed from: e */
    private C3931b f21909e;

    /* renamed from: f */
    private float f21910f = 1.0f;

    /* renamed from: g */
    private float f21911g = 1.0f;

    /* renamed from: h */
    private C3800j f21912h = C3800j.RELEASE;

    /* renamed from: i */
    private C3799i f21913i = C3799i.MEDIA_PLAYER;

    /* renamed from: j */
    private boolean f21914j = true;

    /* renamed from: k */
    private boolean f21915k;

    /* renamed from: l */
    private boolean f21916l;

    /* renamed from: m */
    private int f21917m = -1;

    /* renamed from: n */
    private final C3861c f21918n = new C3861c(this);

    /* renamed from: o5.m$a */
    public /* synthetic */ class C3873a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f21919a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                n5.i[] r0 = p101n5.C3799i.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                n5.i r1 = p101n5.C3799i.MEDIA_PLAYER     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                n5.i r1 = p101n5.C3799i.LOW_LATENCY     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f21919a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p108o5.C3872m.C3873a.<clinit>():void");
        }
    }

    /* renamed from: o5.m$b */
    /* synthetic */ class C3874b extends C3356h implements C4139a<C3330q> {
        C3874b(Object obj) {
            super(0, obj, C3872m.class, "actuallyPlay", "actuallyPlay()V", 0);
        }

        /* renamed from: b */
        public final void mo15347b() {
            ((C3872m) this.receiver).m25944b();
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo15347b();
            return C3330q.f20829a;
        }
    }

    public C3872m(C3788d dVar, String str, C3785a aVar) {
        C3357i.m24508e(dVar, "ref");
        C3357i.m24508e(str, "playerId");
        C3357i.m24508e(aVar, "context");
        this.f21905a = dVar;
        this.f21906b = str;
        this.f21907c = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m25944b() {
        if (!this.f21916l) {
            C3868j jVar = this.f21908d;
            this.f21916l = true;
            if (this.f21914j || jVar == null) {
                this.f21914j = false;
                this.f21908d = m25946d();
            } else if (this.f21915k) {
                jVar.start();
                this.f21905a.mo15033l();
            }
        }
    }

    /* renamed from: c */
    private final void m25945c(C3868j jVar) {
        jVar.mo15307j(this.f21911g);
        jVar.mo15309l(this.f21910f);
        jVar.mo15301d(mo15339r());
        jVar.mo15304g();
    }

    /* renamed from: d */
    private final C3868j m25946d() {
        C3868j jVar;
        int i = C3873a.f21919a[this.f21913i.ordinal()];
        if (i == 1) {
            jVar = new C3867i(this);
        } else if (i == 2) {
            jVar = new C3870l(this);
        } else {
            throw new C3320i();
        }
        C3931b bVar = this.f21909e;
        if (bVar != null) {
            jVar.mo15305h(bVar);
            m25945c(jVar);
        }
        return jVar;
    }

    /* renamed from: j */
    private final C3868j m25947j() {
        C3868j jVar = this.f21908d;
        if (this.f21914j || jVar == null) {
            C3868j d = m25946d();
            this.f21908d = d;
            this.f21914j = false;
            return d;
        } else if (!this.f21915k) {
            return jVar;
        } else {
            jVar.mo15300c();
            this.f21915k = false;
            return jVar;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x001b A[Catch:{ all -> 0x0022 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x001c A[Catch:{ all -> 0x0022 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x003e A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m25948s() {
        /*
            r3 = this;
            r0 = 0
            k4.k$a r1 = p079k4.C3322k.f20823f     // Catch:{ all -> 0x0022 }
            o5.j r1 = r3.f21908d     // Catch:{ all -> 0x0022 }
            if (r1 == 0) goto L_0x000c
            java.lang.Integer r1 = r1.mo15310m()     // Catch:{ all -> 0x0022 }
            goto L_0x000d
        L_0x000c:
            r1 = r0
        L_0x000d:
            if (r1 != 0) goto L_0x0010
            goto L_0x0018
        L_0x0010:
            int r2 = r1.intValue()     // Catch:{ all -> 0x0022 }
            if (r2 != 0) goto L_0x0018
            r2 = 1
            goto L_0x0019
        L_0x0018:
            r2 = 0
        L_0x0019:
            if (r2 != 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r1 = r0
        L_0x001d:
            java.lang.Object r1 = p079k4.C3322k.m24446a(r1)     // Catch:{ all -> 0x0022 }
            goto L_0x002d
        L_0x0022:
            r1 = move-exception
            k4.k$a r2 = p079k4.C3322k.f20823f
            java.lang.Object r1 = p079k4.C3325l.m24450a(r1)
            java.lang.Object r1 = p079k4.C3322k.m24446a(r1)
        L_0x002d:
            boolean r2 = p079k4.C3322k.m24448c(r1)
            if (r2 == 0) goto L_0x0034
            goto L_0x0035
        L_0x0034:
            r0 = r1
        L_0x0035:
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L_0x003e
            int r0 = r0.intValue()
            goto L_0x003f
        L_0x003e:
            r0 = -1
        L_0x003f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p108o5.C3872m.m25948s():int");
    }

    /* renamed from: A */
    public final void mo15317A() {
        C3868j jVar;
        this.f21918n.mo15291f();
        if (!this.f21914j) {
            if (this.f21916l && (jVar = this.f21908d) != null) {
                jVar.stop();
            }
            C3868j jVar2 = this.f21908d;
            if (jVar2 != null) {
                jVar2.mo15298a();
            }
            this.f21908d = null;
            this.f21915k = false;
            this.f21914j = true;
            this.f21916l = false;
        }
    }

    /* renamed from: B */
    public final void mo15318B(int i) {
        if (this.f21915k) {
            C3868j jVar = this.f21908d;
            if (jVar != null) {
                jVar.mo15308k(i);
                return;
            }
            return;
        }
        this.f21917m = i;
    }

    /* renamed from: C */
    public final void mo15319C(C3799i iVar) {
        C3357i.m24508e(iVar, "value");
        if (this.f21913i != iVar) {
            this.f21913i = iVar;
            C3868j jVar = this.f21908d;
            if (jVar != null) {
                this.f21917m = m25948s();
                jVar.mo15298a();
                this.f21908d = m25946d();
            }
        }
    }

    /* renamed from: D */
    public final void mo15320D(boolean z) {
        this.f21915k = z;
    }

    /* renamed from: E */
    public final void mo15321E(float f) {
        if (!(this.f21911g == f)) {
            this.f21911g = f;
            C3868j jVar = this.f21908d;
            if (jVar != null) {
                jVar.mo15307j(f);
            }
        }
    }

    /* renamed from: F */
    public final void mo15322F(C3800j jVar) {
        C3868j jVar2;
        C3357i.m24508e(jVar, "value");
        if (this.f21912h != jVar) {
            this.f21912h = jVar;
            if (!this.f21914j && (jVar2 = this.f21908d) != null) {
                jVar2.mo15301d(mo15339r());
            }
        }
    }

    /* renamed from: G */
    public final void mo15323G(C3931b bVar) {
        if (!C3357i.m24504a(this.f21909e, bVar)) {
            if (bVar != null) {
                C3868j j = m25947j();
                j.mo15305h(bVar);
                m25945c(j);
            } else {
                this.f21914j = true;
                this.f21915k = false;
                this.f21916l = false;
                C3868j jVar = this.f21908d;
                if (jVar != null) {
                    jVar.mo15298a();
                }
            }
            this.f21909e = bVar;
        }
    }

    /* renamed from: H */
    public final void mo15324H(float f) {
        C3868j jVar;
        if (!(this.f21910f == f)) {
            this.f21910f = f;
            if (!this.f21914j && (jVar = this.f21908d) != null) {
                jVar.mo15309l(f);
            }
        }
    }

    /* renamed from: I */
    public final void mo15325I() {
        this.f21918n.mo15291f();
        if (!this.f21914j) {
            if (this.f21912h == C3800j.RELEASE) {
                mo15317A();
            } else if (this.f21916l) {
                this.f21916l = false;
                C3868j jVar = this.f21908d;
                if (jVar != null) {
                    jVar.mo15299b();
                }
                C3868j jVar2 = this.f21908d;
                if (jVar2 != null) {
                    jVar2.mo15308k(0);
                }
            }
        }
    }

    /* renamed from: J */
    public final void mo15326J(C3785a aVar) {
        C3357i.m24508e(aVar, "audioContext");
        if (!C3357i.m24504a(this.f21907c, aVar)) {
            if (this.f21907c.mo15022d() != null && aVar.mo15022d() == null) {
                this.f21918n.mo15291f();
            }
            C3785a c = C3785a.m25612c(aVar, false, false, 0, 0, (Integer) null, 31, (Object) null);
            this.f21907c = c;
            C3868j jVar = this.f21908d;
            if (jVar != null) {
                jVar.mo15302e(c);
            }
        }
    }

    /* renamed from: e */
    public final Context mo15327e() {
        return this.f21905a.mo15029f();
    }

    /* renamed from: f */
    public final AudioManager mo15328f() {
        Object systemService = mo15327e().getSystemService("audio");
        C3357i.m24506c(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        return (AudioManager) systemService;
    }

    /* renamed from: g */
    public final C3785a mo15329g() {
        return this.f21907c;
    }

    /* renamed from: h */
    public final Integer mo15330h() {
        C3868j jVar;
        if (!this.f21915k || (jVar = this.f21908d) == null) {
            return null;
        }
        return jVar.mo15310m();
    }

    /* renamed from: i */
    public final Integer mo15331i() {
        C3868j jVar;
        if (!this.f21915k || (jVar = this.f21908d) == null) {
            return null;
        }
        return jVar.mo15306i();
    }

    /* renamed from: k */
    public final String mo15332k() {
        return this.f21906b;
    }

    /* renamed from: l */
    public final boolean mo15333l() {
        return this.f21916l;
    }

    /* renamed from: m */
    public final boolean mo15334m() {
        return this.f21915k;
    }

    /* renamed from: n */
    public final float mo15335n() {
        return this.f21911g;
    }

    /* renamed from: o */
    public final C3931b mo15336o() {
        return this.f21909e;
    }

    /* renamed from: p */
    public final float mo15337p() {
        return this.f21910f;
    }

    /* renamed from: q */
    public final boolean mo15338q() {
        if (this.f21916l && this.f21915k) {
            C3868j jVar = this.f21908d;
            if (jVar != null && jVar.mo15303f()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: r */
    public final boolean mo15339r() {
        return this.f21912h == C3800j.LOOP;
    }

    /* renamed from: t */
    public final void mo15340t(int i) {
    }

    /* renamed from: u */
    public final void mo15341u() {
        if (this.f21912h != C3800j.LOOP) {
            mo15325I();
        }
        this.f21905a.mo15030i(this);
    }

    /* renamed from: v */
    public final boolean mo15342v(int i, int i2) {
        String str;
        String str2;
        if (i == 100) {
            str = "MEDIA_ERROR_SERVER_DIED";
        } else {
            str = "MEDIA_ERROR_UNKNOWN {what:" + i + '}';
        }
        if (i2 == Integer.MIN_VALUE) {
            str2 = "MEDIA_ERROR_SYSTEM";
        } else if (i2 == -1010) {
            str2 = "MEDIA_ERROR_UNSUPPORTED";
        } else if (i2 == -1007) {
            str2 = "MEDIA_ERROR_MALFORMED";
        } else if (i2 == -1004) {
            str2 = "MEDIA_ERROR_IO";
        } else if (i2 != -110) {
            str2 = "MEDIA_ERROR_UNKNOWN {extra:" + i2 + '}';
        } else {
            str2 = "MEDIA_ERROR_TIMED_OUT";
        }
        this.f21905a.mo15032k(this, "MediaPlayer error with what:" + str + " extra:" + str2);
        return false;
    }

    /* renamed from: w */
    public final void mo15343w() {
        this.f21915k = true;
        this.f21905a.mo15031j(this);
        if (this.f21916l) {
            C3868j jVar = this.f21908d;
            if (jVar != null) {
                jVar.start();
            }
            this.f21905a.mo15033l();
        }
        int i = this.f21917m;
        if (i >= 0) {
            C3868j jVar2 = this.f21908d;
            if (jVar2 != null) {
                jVar2.mo15308k(i);
            }
            this.f21917m = -1;
        }
    }

    /* renamed from: x */
    public final void mo15344x() {
        this.f21905a.mo15034m(this);
    }

    /* renamed from: y */
    public final void mo15345y() {
        if (this.f21916l) {
            this.f21916l = false;
            C3868j jVar = this.f21908d;
            if (jVar != null) {
                jVar.mo15299b();
            }
        }
    }

    /* renamed from: z */
    public final void mo15346z() {
        this.f21918n.mo15292g(new C3874b(this));
    }
}
