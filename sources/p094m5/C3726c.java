package p094m5;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p080k5.C3334d;

/* renamed from: m5.c */
public final class C3726c extends C3738i {

    /* renamed from: c */
    private List<String> f21543c;

    /* renamed from: d */
    private final ConcurrentNavigableMap<String, C3727a> f21544d = new ConcurrentSkipListMap();

    /* renamed from: e */
    private Set<String> f21545e = new CopyOnWriteArraySet();

    /* renamed from: m5.c$a */
    static class C3727a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final String f21546a;

        /* renamed from: b */
        private final String[] f21547b;

        /* renamed from: c */
        private final short[] f21548c;

        /* renamed from: d */
        private final AtomicReferenceArray<Object> f21549d;

        C3727a(String str, String[] strArr, short[] sArr, AtomicReferenceArray<Object> atomicReferenceArray) {
            this.f21549d = atomicReferenceArray;
            this.f21546a = str;
            this.f21547b = strArr;
            this.f21548c = sArr;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C3732f mo14921b(short s) {
            Object obj = this.f21549d.get(s);
            if (obj instanceof byte[]) {
                obj = C3724a.m25418a(new DataInputStream(new ByteArrayInputStream((byte[]) obj)));
                this.f21549d.set(s, obj);
            }
            return (C3732f) obj;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C3732f mo14922c(String str) {
            int binarySearch = Arrays.binarySearch(this.f21547b, str);
            if (binarySearch < 0) {
                return null;
            }
            try {
                return mo14921b(this.f21548c[binarySearch]);
            } catch (Exception e) {
                throw new C3734g("Invalid binary time-zone data: TZDB:" + str + ", version: " + this.f21546a, e);
            }
        }

        public String toString() {
            return this.f21546a;
        }
    }

    public C3726c(InputStream inputStream) {
        try {
            m25436h(inputStream);
        } catch (Exception e) {
            throw new C3734g("Unable to load TZDB time-zone rules", e);
        }
    }

    /* renamed from: h */
    private boolean m25436h(InputStream inputStream) {
        boolean z = false;
        for (C3727a next : m25437i(inputStream)) {
            C3727a aVar = (C3727a) this.f21544d.putIfAbsent(next.f21546a, next);
            if (aVar == null || aVar.f21546a.equals(next.f21546a)) {
                z = true;
            } else {
                throw new C3734g("Data already loaded for TZDB time-zone rules version: " + next.f21546a);
            }
        }
        return z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.Iterable<p094m5.C3726c.C3727a> m25437i(java.io.InputStream r13) {
        /*
            r12 = this;
            java.io.DataInputStream r0 = new java.io.DataInputStream
            r0.<init>(r13)
            byte r13 = r0.readByte()
            java.lang.String r1 = "File format not recognised"
            r2 = 1
            if (r13 != r2) goto L_0x0099
            java.lang.String r13 = r0.readUTF()
            java.lang.String r2 = "TZDB"
            boolean r13 = r2.equals(r13)
            if (r13 == 0) goto L_0x0093
            short r13 = r0.readShort()
            java.lang.String[] r1 = new java.lang.String[r13]
            r2 = 0
            r3 = r2
        L_0x0022:
            if (r3 >= r13) goto L_0x002d
            java.lang.String r4 = r0.readUTF()
            r1[r3] = r4
            int r3 = r3 + 1
            goto L_0x0022
        L_0x002d:
            short r3 = r0.readShort()
            java.lang.String[] r4 = new java.lang.String[r3]
            r5 = r2
        L_0x0034:
            if (r5 >= r3) goto L_0x003f
            java.lang.String r6 = r0.readUTF()
            r4[r5] = r6
            int r5 = r5 + 1
            goto L_0x0034
        L_0x003f:
            java.util.List r3 = java.util.Arrays.asList(r4)
            r12.f21543c = r3
            short r3 = r0.readShort()
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r6 = r2
        L_0x004c:
            if (r6 >= r3) goto L_0x005c
            short r7 = r0.readShort()
            byte[] r7 = new byte[r7]
            r0.readFully(r7)
            r5[r6] = r7
            int r6 = r6 + 1
            goto L_0x004c
        L_0x005c:
            java.util.concurrent.atomic.AtomicReferenceArray r3 = new java.util.concurrent.atomic.AtomicReferenceArray
            r3.<init>(r5)
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>(r13)
            r6 = r2
        L_0x0067:
            if (r6 >= r13) goto L_0x0092
            short r7 = r0.readShort()
            java.lang.String[] r8 = new java.lang.String[r7]
            short[] r9 = new short[r7]
            r10 = r2
        L_0x0072:
            if (r10 >= r7) goto L_0x0085
            short r11 = r0.readShort()
            r11 = r4[r11]
            r8[r10] = r11
            short r11 = r0.readShort()
            r9[r10] = r11
            int r10 = r10 + 1
            goto L_0x0072
        L_0x0085:
            m5.c$a r7 = new m5.c$a
            r10 = r1[r6]
            r7.<init>(r10, r8, r9, r3)
            r5.add(r7)
            int r6 = r6 + 1
            goto L_0x0067
        L_0x0092:
            return r5
        L_0x0093:
            java.io.StreamCorruptedException r13 = new java.io.StreamCorruptedException
            r13.<init>(r1)
            throw r13
        L_0x0099:
            java.io.StreamCorruptedException r13 = new java.io.StreamCorruptedException
            r13.<init>(r1)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p094m5.C3726c.m25437i(java.io.InputStream):java.lang.Iterable");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C3732f mo14918d(String str, boolean z) {
        C3334d.m24473i(str, "zoneId");
        C3732f c = ((C3727a) this.f21544d.lastEntry().getValue()).mo14922c(str);
        if (c != null) {
            return c;
        }
        throw new C3734g("Unknown time-zone ID: " + str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public Set<String> mo14919e() {
        return new HashSet(this.f21543c);
    }

    public String toString() {
        return "TZDB";
    }
}
