package p066io.flutter.embedding.android;

import android.view.KeyEvent;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import p005a4.C0128c;
import p066io.flutter.embedding.android.C2930n;
import p066io.flutter.embedding.android.C2937s;
import p066io.flutter.embedding.android.C2945t;

/* renamed from: io.flutter.embedding.android.r */
public class C2935r implements C2937s.C2942d {

    /* renamed from: a */
    private final C0128c f19774a;

    /* renamed from: b */
    private final HashMap<Long, Long> f19775b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<Long, C2945t.C2950e> f19776c = new HashMap<>();

    /* renamed from: d */
    private final C2937s.C2939b f19777d = new C2937s.C2939b();

    /* renamed from: io.flutter.embedding.android.r$a */
    static /* synthetic */ class C2936a {

        /* renamed from: a */
        static final /* synthetic */ int[] f19778a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                io.flutter.embedding.android.n$a[] r0 = p066io.flutter.embedding.android.C2930n.C2931a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f19778a = r0
                io.flutter.embedding.android.n$a r1 = p066io.flutter.embedding.android.C2930n.C2931a.kDown     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f19778a     // Catch:{ NoSuchFieldError -> 0x001d }
                io.flutter.embedding.android.n$a r1 = p066io.flutter.embedding.android.C2930n.C2931a.kUp     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f19778a     // Catch:{ NoSuchFieldError -> 0x0028 }
                io.flutter.embedding.android.n$a r1 = p066io.flutter.embedding.android.C2930n.C2931a.kRepeat     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p066io.flutter.embedding.android.C2935r.C2936a.<clinit>():void");
        }
    }

    public C2935r(C0128c cVar) {
        this.f19774a = cVar;
        for (C2945t.C2950e eVar : C2945t.m23009a()) {
            this.f19776c.put(Long.valueOf(eVar.f19798c), eVar);
        }
    }

    /* renamed from: e */
    private static C2930n.C2931a m22984e(KeyEvent keyEvent) {
        boolean z = keyEvent.getRepeatCount() > 0;
        int action = keyEvent.getAction();
        if (action == 0) {
            return z ? C2930n.C2931a.kRepeat : C2930n.C2931a.kDown;
        }
        if (action == 1) {
            return C2930n.C2931a.kUp;
        }
        throw new AssertionError("Unexpected event type");
    }

    /* renamed from: f */
    private Long m22985f(KeyEvent keyEvent) {
        Long l = C2945t.f19790b.get(Long.valueOf((long) keyEvent.getKeyCode()));
        return l != null ? l : Long.valueOf(m22988i((long) keyEvent.getKeyCode(), 73014444032L));
    }

    /* renamed from: g */
    private Long m22986g(KeyEvent keyEvent) {
        int scanCode;
        long scanCode2 = (long) keyEvent.getScanCode();
        if (scanCode2 == 0) {
            scanCode = keyEvent.getKeyCode();
        } else {
            Long l = C2945t.f19789a.get(Long.valueOf(scanCode2));
            if (l != null) {
                return l;
            }
            scanCode = keyEvent.getScanCode();
        }
        return Long.valueOf(m22988i((long) scanCode, 73014444032L));
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0119 A[LOOP:2: B:53:0x0113->B:55:0x0119, LOOP_END] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m22987h(android.view.KeyEvent r18, p066io.flutter.embedding.android.C2937s.C2942d.C2943a r19) {
        /*
            r17 = this;
            r9 = r17
            int r0 = r18.getScanCode()
            r10 = 0
            if (r0 != 0) goto L_0x0010
            int r0 = r18.getKeyCode()
            if (r0 != 0) goto L_0x0010
            return r10
        L_0x0010:
            java.lang.Long r11 = r17.m22986g(r18)
            java.lang.Long r12 = r17.m22985f(r18)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            io.flutter.embedding.android.t$d[] r14 = p066io.flutter.embedding.android.C2945t.f19791c
            int r15 = r14.length
            r8 = r10
        L_0x0021:
            r6 = 1
            if (r8 >= r15) goto L_0x0047
            r1 = r14[r8]
            int r0 = r18.getMetaState()
            int r2 = r1.f19794a
            r0 = r0 & r2
            if (r0 == 0) goto L_0x0031
            r2 = r6
            goto L_0x0032
        L_0x0031:
            r2 = r10
        L_0x0032:
            long r3 = r12.longValue()
            long r5 = r11.longValue()
            r0 = r17
            r7 = r18
            r16 = r8
            r8 = r13
            r0.mo13392n(r1, r2, r3, r5, r7, r8)
            int r8 = r16 + 1
            goto L_0x0021
        L_0x0047:
            java.util.HashMap<java.lang.Long, io.flutter.embedding.android.t$e> r0 = r9.f19776c
            java.util.Collection r0 = r0.values()
            java.util.Iterator r7 = r0.iterator()
        L_0x0051:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0076
            java.lang.Object r0 = r7.next()
            r1 = r0
            io.flutter.embedding.android.t$e r1 = (p066io.flutter.embedding.android.C2945t.C2950e) r1
            int r0 = r18.getMetaState()
            int r2 = r1.f19796a
            r0 = r0 & r2
            if (r0 == 0) goto L_0x0069
            r2 = r6
            goto L_0x006a
        L_0x0069:
            r2 = r10
        L_0x006a:
            long r3 = r12.longValue()
            r0 = r17
            r5 = r18
            r0.mo13393o(r1, r2, r3, r5)
            goto L_0x0051
        L_0x0076:
            int r0 = r18.getAction()
            if (r0 == 0) goto L_0x0081
            if (r0 == r6) goto L_0x007f
            return r10
        L_0x007f:
            r7 = r10
            goto L_0x0082
        L_0x0081:
            r7 = r6
        L_0x0082:
            java.util.HashMap<java.lang.Long, java.lang.Long> r0 = r9.f19775b
            java.lang.Object r0 = r0.get(r11)
            r2 = r0
            java.lang.Long r2 = (java.lang.Long) r2
            r8 = 0
            if (r7 == 0) goto L_0x00ca
            if (r2 != 0) goto L_0x0093
        L_0x0090:
            io.flutter.embedding.android.n$a r0 = p066io.flutter.embedding.android.C2930n.C2931a.kDown
            goto L_0x00a8
        L_0x0093:
            int r0 = r18.getRepeatCount()
            if (r0 <= 0) goto L_0x009c
            io.flutter.embedding.android.n$a r0 = p066io.flutter.embedding.android.C2930n.C2931a.kRepeat
            goto L_0x00a8
        L_0x009c:
            r1 = 0
            long r4 = r18.getEventTime()
            r0 = r17
            r3 = r11
            r0.m22993p(r1, r2, r3, r4)
            goto L_0x0090
        L_0x00a8:
            io.flutter.embedding.android.s$b r1 = r9.f19777d
            int r2 = r18.getUnicodeChar()
            java.lang.Character r1 = r1.mo13397a(r2)
            char r1 = r1.charValue()
            if (r1 == 0) goto L_0x00cf
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ""
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            goto L_0x00d0
        L_0x00ca:
            if (r2 != 0) goto L_0x00cd
            return r10
        L_0x00cd:
            io.flutter.embedding.android.n$a r0 = p066io.flutter.embedding.android.C2930n.C2931a.kUp
        L_0x00cf:
            r1 = r8
        L_0x00d0:
            io.flutter.embedding.android.n$a r2 = p066io.flutter.embedding.android.C2930n.C2931a.kRepeat
            if (r0 == r2) goto L_0x00da
            if (r7 == 0) goto L_0x00d7
            r8 = r12
        L_0x00d7:
            r9.mo13394q(r11, r8)
        L_0x00da:
            io.flutter.embedding.android.n$a r2 = p066io.flutter.embedding.android.C2930n.C2931a.kDown
            if (r0 != r2) goto L_0x00ed
            java.util.HashMap<java.lang.Long, io.flutter.embedding.android.t$e> r2 = r9.f19776c
            java.lang.Object r2 = r2.get(r12)
            io.flutter.embedding.android.t$e r2 = (p066io.flutter.embedding.android.C2945t.C2950e) r2
            if (r2 == 0) goto L_0x00ed
            boolean r3 = r2.f19799d
            r3 = r3 ^ r6
            r2.f19799d = r3
        L_0x00ed:
            io.flutter.embedding.android.n r2 = new io.flutter.embedding.android.n
            r2.<init>()
            long r3 = r18.getEventTime()
            r2.f19755a = r3
            r2.f19756b = r0
            long r3 = r12.longValue()
            r2.f19758d = r3
            long r3 = r11.longValue()
            r2.f19757c = r3
            r2.f19760f = r1
            r2.f19759e = r10
            r0 = r19
            r9.m22992m(r2, r0)
            java.util.Iterator r0 = r13.iterator()
        L_0x0113:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0123
            java.lang.Object r1 = r0.next()
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r1.run()
            goto L_0x0113
        L_0x0123:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p066io.flutter.embedding.android.C2935r.m22987h(android.view.KeyEvent, io.flutter.embedding.android.s$d$a):boolean");
    }

    /* renamed from: i */
    private static long m22988i(long j, long j2) {
        return (j & 4294967295L) | j2;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static /* synthetic */ void m22989j(C2937s.C2942d.C2943a aVar, ByteBuffer byteBuffer) {
        Boolean bool = Boolean.FALSE;
        byteBuffer.rewind();
        if (byteBuffer.capacity() != 0) {
            bool = Boolean.valueOf(byteBuffer.get() != 0);
        }
        aVar.mo13399a(bool.booleanValue());
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m22990k(C2945t.C2948c cVar, long j, KeyEvent keyEvent) {
        m22993p(false, Long.valueOf(cVar.f19793b), Long.valueOf(j), keyEvent.getEventTime());
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m22991l(C2945t.C2948c cVar, KeyEvent keyEvent) {
        m22993p(false, Long.valueOf(cVar.f19793b), Long.valueOf(cVar.f19792a), keyEvent.getEventTime());
    }

    /* renamed from: m */
    private void m22992m(C2930n nVar, C2937s.C2942d.C2943a aVar) {
        this.f19774a.mo315d("flutter/keydata", nVar.mo13388a(), aVar == null ? null : new C2932o(aVar));
    }

    /* renamed from: p */
    private void m22993p(boolean z, Long l, Long l2, long j) {
        C2930n nVar = new C2930n();
        nVar.f19755a = j;
        nVar.f19756b = z ? C2930n.C2931a.kDown : C2930n.C2931a.kUp;
        nVar.f19758d = l.longValue();
        nVar.f19757c = l2.longValue();
        nVar.f19760f = null;
        nVar.f19759e = true;
        if (!(l2.longValue() == 0 || l.longValue() == 0)) {
            if (!z) {
                l = null;
            }
            mo13394q(l2, l);
        }
        m22992m(nVar, (C2937s.C2942d.C2943a) null);
    }

    /* renamed from: a */
    public void mo13387a(KeyEvent keyEvent, C2937s.C2942d.C2943a aVar) {
        if (!m22987h(keyEvent, aVar)) {
            m22993p(true, (Long) null, 0L, 0);
            aVar.mo13399a(true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo13392n(C2945t.C2949d dVar, boolean z, long j, long j2, KeyEvent keyEvent, ArrayList<Runnable> arrayList) {
        C2945t.C2949d dVar2 = dVar;
        ArrayList<Runnable> arrayList2 = arrayList;
        C2945t.C2948c[] cVarArr = dVar2.f19795b;
        boolean[] zArr = new boolean[cVarArr.length];
        Boolean[] boolArr = new Boolean[cVarArr.length];
        boolean z2 = false;
        int i = 0;
        while (true) {
            C2945t.C2948c[] cVarArr2 = dVar2.f19795b;
            boolean z3 = true;
            if (i >= cVarArr2.length) {
                break;
            }
            C2945t.C2948c cVar = cVarArr2[i];
            zArr[i] = this.f19775b.containsKey(Long.valueOf(cVar.f19792a));
            if (cVar.f19793b == j) {
                int i2 = C2936a.f19778a[m22984e(keyEvent).ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        KeyEvent keyEvent2 = keyEvent;
                        boolArr[i] = Boolean.valueOf(zArr[i]);
                    } else if (i2 != 3) {
                        KeyEvent keyEvent3 = keyEvent;
                    } else {
                        if (!z) {
                            arrayList2.add(new C2934q(this, cVar, keyEvent));
                        } else {
                            KeyEvent keyEvent4 = keyEvent;
                        }
                        boolArr[i] = Boolean.valueOf(zArr[i]);
                    }
                    i++;
                } else {
                    KeyEvent keyEvent5 = keyEvent;
                    boolArr[i] = Boolean.FALSE;
                    if (!z) {
                        arrayList2.add(new C2933p(this, cVar, j2, keyEvent));
                    }
                }
            } else {
                KeyEvent keyEvent6 = keyEvent;
                if (!z2 && !zArr[i]) {
                    z3 = false;
                }
            }
            z2 = z3;
            i++;
        }
        KeyEvent keyEvent7 = keyEvent;
        if (z) {
            for (int i3 = 0; i3 < dVar2.f19795b.length; i3++) {
                if (boolArr[i3] == null) {
                    if (z2) {
                        boolArr[i3] = Boolean.valueOf(zArr[i3]);
                    } else {
                        boolArr[i3] = Boolean.TRUE;
                        z2 = true;
                    }
                }
            }
            if (!z2) {
                boolArr[0] = Boolean.TRUE;
            }
        } else {
            for (int i4 = 0; i4 < dVar2.f19795b.length; i4++) {
                if (boolArr[i4] == null) {
                    boolArr[i4] = Boolean.FALSE;
                }
            }
        }
        for (int i5 = 0; i5 < dVar2.f19795b.length; i5++) {
            if (zArr[i5] != boolArr[i5].booleanValue()) {
                C2945t.C2948c cVar2 = dVar2.f19795b[i5];
                m22993p(boolArr[i5].booleanValue(), Long.valueOf(cVar2.f19793b), Long.valueOf(cVar2.f19792a), keyEvent.getEventTime());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo13393o(C2945t.C2950e eVar, boolean z, long j, KeyEvent keyEvent) {
        if (eVar.f19798c != j && eVar.f19799d != z) {
            boolean z2 = !this.f19775b.containsKey(Long.valueOf(eVar.f19797b));
            if (z2) {
                eVar.f19799d = !eVar.f19799d;
            }
            m22993p(z2, Long.valueOf(eVar.f19798c), Long.valueOf(eVar.f19797b), keyEvent.getEventTime());
            if (!z2) {
                eVar.f19799d = !eVar.f19799d;
            }
            m22993p(!z2, Long.valueOf(eVar.f19798c), Long.valueOf(eVar.f19797b), keyEvent.getEventTime());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo13394q(Long l, Long l2) {
        if (l2 != null) {
            if (this.f19775b.put(l, l2) != null) {
                throw new AssertionError("The key was not empty");
            }
        } else if (this.f19775b.remove(l) == null) {
            throw new AssertionError("The key was empty");
        }
    }
}
