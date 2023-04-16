package p108o5;

import android.media.AudioAttributes;
import android.media.SoundPool;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C3353e;
import kotlin.jvm.internal.C3357i;
import p079k4.C3315d;
import p079k4.C3330q;
import p101n5.C3785a;
import p101n5.C3797h;
import p115p5.C3931b;
import p115p5.C3932c;

/* renamed from: o5.l */
public final class C3870l implements C3868j {

    /* renamed from: d */
    public static final C3871a f21898d;

    /* renamed from: e */
    private static final SoundPool f21899e;

    /* renamed from: f */
    private static final Map<Integer, C3870l> f21900f = Collections.synchronizedMap(new LinkedHashMap());

    /* renamed from: g */
    private static final Map<C3932c, List<C3870l>> f21901g = Collections.synchronizedMap(new LinkedHashMap());

    /* renamed from: a */
    private final C3872m f21902a;

    /* renamed from: b */
    private Integer f21903b;

    /* renamed from: c */
    private Integer f21904c;

    /* renamed from: o5.l$a */
    public static final class C3871a {
        private C3871a() {
        }

        public /* synthetic */ C3871a(C3353e eVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final SoundPool m25942b() {
            if (Build.VERSION.SDK_INT < 21) {
                return new SoundPool(100, 3, 0);
            }
            SoundPool build = new SoundPool.Builder().setAudioAttributes(new AudioAttributes.Builder().setLegacyStreamType(Integer.MIN_VALUE).setUsage(14).build()).setMaxStreams(100).build();
            C3357i.m24507d(build, "{\n                // TOD…   .build()\n            }");
            return build;
        }
    }

    static {
        C3871a aVar = new C3871a((C3353e) null);
        f21898d = aVar;
        SoundPool a = aVar.m25942b();
        f21899e = a;
        a.setOnLoadCompleteListener(C3869k.f21897a);
    }

    public C3870l(C3872m mVar) {
        C3357i.m24508e(mVar, "wrappedPlayer");
        this.f21902a = mVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public static final void m25921o(SoundPool soundPool, int i, int i2) {
        C3797h hVar = C3797h.f21723a;
        hVar.mo15044b("Loaded " + i);
        Map<Integer, C3870l> map = f21900f;
        C3870l lVar = map.get(Integer.valueOf(i));
        C3932c r = lVar != null ? lVar.m25922r() : null;
        if (r != null) {
            map.remove(lVar.f21903b);
            Map<C3932c, List<C3870l>> map2 = f21901g;
            C3357i.m24507d(map2, "urlToPlayers");
            synchronized (map2) {
                List<C3870l> list = map2.get(r);
                if (list == null) {
                    list = C3585i.m25029b();
                }
                for (C3870l lVar2 : list) {
                    C3797h hVar2 = C3797h.f21723a;
                    hVar2.mo15044b("Marking " + lVar2 + " as loaded");
                    lVar2.f21902a.mo15320D(true);
                    if (lVar2.f21902a.mo15333l()) {
                        hVar2.mo15044b("Delayed start of " + lVar2);
                        lVar2.start();
                    }
                }
                C3330q qVar = C3330q.f20829a;
            }
        }
    }

    /* renamed from: r */
    private final C3932c m25922r() {
        C3931b o = this.f21902a.mo15336o();
        if (o instanceof C3932c) {
            return (C3932c) o;
        }
        return null;
    }

    /* renamed from: s */
    private final int m25923s(boolean z) {
        return z ? -1 : 0;
    }

    /* renamed from: u */
    private final Void m25924u(String str) {
        throw new UnsupportedOperationException("LOW_LATENCY mode does not support: " + str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005b, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo15298a() {
        /*
            r5 = this;
            r5.stop()
            java.lang.Integer r0 = r5.f21903b
            if (r0 == 0) goto L_0x005f
            int r0 = r0.intValue()
            p5.c r1 = r5.m25922r()
            if (r1 != 0) goto L_0x0012
            return
        L_0x0012:
            java.util.Map<p5.c, java.util.List<o5.l>> r2 = f21901g
            java.lang.String r3 = "urlToPlayers"
            kotlin.jvm.internal.C3357i.m24507d(r2, r3)
            monitor-enter(r2)
            java.lang.Object r3 = r2.get(r1)     // Catch:{ all -> 0x005c }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x005c }
            if (r3 != 0) goto L_0x0024
            monitor-exit(r2)
            return
        L_0x0024:
            java.lang.Object r4 = p086l4.C3593q.m25051v(r3)     // Catch:{ all -> 0x005c }
            if (r4 != r5) goto L_0x0057
            r2.remove(r1)     // Catch:{ all -> 0x005c }
            android.media.SoundPool r1 = f21899e     // Catch:{ all -> 0x005c }
            r1.unload(r0)     // Catch:{ all -> 0x005c }
            java.util.Map<java.lang.Integer, o5.l> r1 = f21900f     // Catch:{ all -> 0x005c }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x005c }
            r1.remove(r3)     // Catch:{ all -> 0x005c }
            r1 = 0
            r5.f21903b = r1     // Catch:{ all -> 0x005c }
            n5.h r1 = p101n5.C3797h.f21723a     // Catch:{ all -> 0x005c }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x005c }
            r3.<init>()     // Catch:{ all -> 0x005c }
            java.lang.String r4 = "unloaded soundId "
            r3.append(r4)     // Catch:{ all -> 0x005c }
            r3.append(r0)     // Catch:{ all -> 0x005c }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x005c }
            r1.mo15044b(r0)     // Catch:{ all -> 0x005c }
            k4.q r0 = p079k4.C3330q.f20829a     // Catch:{ all -> 0x005c }
            goto L_0x005a
        L_0x0057:
            r3.remove(r5)     // Catch:{ all -> 0x005c }
        L_0x005a:
            monitor-exit(r2)
            return
        L_0x005c:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x005f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p108o5.C3870l.mo15298a():void");
    }

    /* renamed from: b */
    public void mo15299b() {
        Integer num = this.f21904c;
        if (num != null) {
            f21899e.pause(num.intValue());
        }
    }

    /* renamed from: c */
    public void mo15300c() {
    }

    /* renamed from: d */
    public void mo15301d(boolean z) {
        Integer num = this.f21904c;
        if (num != null) {
            f21899e.setLoop(num.intValue(), m25923s(z));
        }
    }

    /* renamed from: e */
    public void mo15302e(C3785a aVar) {
        C3357i.m24508e(aVar, "context");
    }

    /* renamed from: f */
    public boolean mo15303f() {
        return false;
    }

    /* renamed from: g */
    public void mo15304g() {
    }

    /* renamed from: h */
    public void mo15305h(C3931b bVar) {
        C3357i.m24508e(bVar, "source");
        bVar.mo15384b(this);
    }

    /* renamed from: i */
    public /* bridge */ /* synthetic */ Integer mo15306i() {
        return (Integer) mo15315q();
    }

    /* renamed from: j */
    public void mo15307j(float f) {
        Integer num = this.f21904c;
        if (num != null) {
            f21899e.setRate(num.intValue(), f);
        }
    }

    /* renamed from: k */
    public void mo15308k(int i) {
        if (i == 0) {
            Integer num = this.f21904c;
            if (num != null) {
                int intValue = num.intValue();
                SoundPool soundPool = f21899e;
                soundPool.stop(intValue);
                if (this.f21902a.mo15333l()) {
                    soundPool.resume(intValue);
                    return;
                }
                return;
            }
            return;
        }
        m25924u("seek");
        throw new C3315d();
    }

    /* renamed from: l */
    public void mo15309l(float f) {
        Integer num = this.f21904c;
        if (num != null) {
            f21899e.setVolume(num.intValue(), f, f);
        }
    }

    /* renamed from: m */
    public /* bridge */ /* synthetic */ Integer mo15310m() {
        return (Integer) mo15314p();
    }

    /* renamed from: p */
    public Void mo15314p() {
        return null;
    }

    /* renamed from: q */
    public Void mo15315q() {
        return null;
    }

    public void start() {
        Integer num = this.f21904c;
        Integer num2 = this.f21903b;
        if (num != null) {
            f21899e.resume(num.intValue());
        } else if (num2 != null) {
            this.f21904c = Integer.valueOf(f21899e.play(num2.intValue(), this.f21902a.mo15337p(), this.f21902a.mo15337p(), 0, m25923s(this.f21902a.mo15339r()), this.f21902a.mo15335n()));
        }
    }

    public void stop() {
        Integer num = this.f21904c;
        if (num != null) {
            f21899e.stop(num.intValue());
        }
    }

    /* renamed from: t */
    public final void mo15316t(C3932c cVar) {
        C3357i.m24508e(cVar, "urlSource");
        if (this.f21903b != null) {
            mo15298a();
        }
        Map<C3932c, List<C3870l>> map = f21901g;
        C3357i.m24507d(map, "urlToPlayers");
        synchronized (map) {
            C3357i.m24507d(map, "urlToPlayers");
            List<C3870l> list = map.get(cVar);
            if (list == null) {
                list = new ArrayList<>();
                map.put(cVar, list);
            }
            List list2 = list;
            C3870l lVar = (C3870l) C3593q.m25041l(list2);
            if (lVar != null) {
                boolean m = lVar.f21902a.mo15334m();
                this.f21902a.mo15320D(m);
                this.f21903b = lVar.f21903b;
                C3797h hVar = C3797h.f21723a;
                hVar.mo15044b("Reusing soundId " + this.f21903b + " for " + cVar + " is prepared=" + m + ' ' + this);
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                this.f21902a.mo15320D(false);
                C3797h hVar2 = C3797h.f21723a;
                hVar2.mo15044b("Fetching actual URL for " + cVar);
                String d = cVar.mo15388d();
                hVar2.mo15044b("Now loading " + d);
                this.f21903b = Integer.valueOf(f21899e.load(d, 1));
                Map<Integer, C3870l> map2 = f21900f;
                C3357i.m24507d(map2, "soundIdToPlayer");
                map2.put(this.f21903b, this);
                hVar2.mo15044b("time to call load() for " + cVar + ": " + (System.currentTimeMillis() - currentTimeMillis) + " player=" + this);
            }
            list2.add(this);
        }
    }
}
