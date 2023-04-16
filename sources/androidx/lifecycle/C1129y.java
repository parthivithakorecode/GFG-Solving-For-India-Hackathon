package androidx.lifecycle;

import android.os.Bundle;
import androidx.core.p009os.C0677d;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C3353e;
import kotlin.jvm.internal.C3357i;
import p037e5.C2580f;
import p046g0.C2623c;
import p079k4.C3327n;

/* renamed from: androidx.lifecycle.y */
public final class C1129y {

    /* renamed from: f */
    public static final C1130a f3017f = new C1130a((C3353e) null);
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final Class<? extends Object>[] f3018g;

    /* renamed from: a */
    private final Map<String, Object> f3019a = new LinkedHashMap();

    /* renamed from: b */
    private final Map<String, C2623c.C2626c> f3020b = new LinkedHashMap();

    /* renamed from: c */
    private final Map<String, Object> f3021c = new LinkedHashMap();

    /* renamed from: d */
    private final Map<String, C2580f<Object>> f3022d = new LinkedHashMap();

    /* renamed from: e */
    private final C2623c.C2626c f3023e = new C1128x(this);

    /* renamed from: androidx.lifecycle.y$a */
    public static final class C1130a {
        private C1130a() {
        }

        public /* synthetic */ C1130a(C3353e eVar) {
            this();
        }

        /* renamed from: a */
        public final boolean mo3881a(Object obj) {
            if (obj == null) {
                return true;
            }
            for (Class cls : C1129y.f3018g) {
                C3357i.m24505b(cls);
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.Class<? extends java.lang.Object>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            androidx.lifecycle.y$a r0 = new androidx.lifecycle.y$a
            r1 = 0
            r0.<init>(r1)
            f3017f = r0
            r0 = 29
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r2 = 0
            r0[r2] = r1
            r1 = 1
            java.lang.Class<boolean[]> r2 = boolean[].class
            r0[r1] = r2
            java.lang.Class r1 = java.lang.Double.TYPE
            r2 = 2
            r0[r2] = r1
            r1 = 3
            java.lang.Class<double[]> r2 = double[].class
            r0[r1] = r2
            java.lang.Class r1 = java.lang.Integer.TYPE
            r2 = 4
            r0[r2] = r1
            r2 = 5
            java.lang.Class<int[]> r3 = int[].class
            r0[r2] = r3
            java.lang.Class r2 = java.lang.Long.TYPE
            r3 = 6
            r0[r3] = r2
            r2 = 7
            java.lang.Class<long[]> r3 = long[].class
            r0[r2] = r3
            r2 = 8
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r0[r2] = r3
            r2 = 9
            java.lang.Class<java.lang.String[]> r3 = java.lang.String[].class
            r0[r2] = r3
            r2 = 10
            java.lang.Class<android.os.Binder> r3 = android.os.Binder.class
            r0[r2] = r3
            r2 = 11
            java.lang.Class<android.os.Bundle> r3 = android.os.Bundle.class
            r0[r2] = r3
            java.lang.Class r2 = java.lang.Byte.TYPE
            r3 = 12
            r0[r3] = r2
            r2 = 13
            java.lang.Class<byte[]> r3 = byte[].class
            r0[r2] = r3
            java.lang.Class r2 = java.lang.Character.TYPE
            r3 = 14
            r0[r3] = r2
            r2 = 15
            java.lang.Class<char[]> r3 = char[].class
            r0[r2] = r3
            r2 = 16
            java.lang.Class<java.lang.CharSequence> r3 = java.lang.CharSequence.class
            r0[r2] = r3
            r2 = 17
            java.lang.Class<java.lang.CharSequence[]> r3 = java.lang.CharSequence[].class
            r0[r2] = r3
            r2 = 18
            java.lang.Class<java.util.ArrayList> r3 = java.util.ArrayList.class
            r0[r2] = r3
            java.lang.Class r2 = java.lang.Float.TYPE
            r3 = 19
            r0[r3] = r2
            r2 = 20
            java.lang.Class<float[]> r3 = float[].class
            r0[r2] = r3
            java.lang.Class<android.os.Parcelable> r2 = android.os.Parcelable.class
            r3 = 21
            r0[r3] = r2
            r2 = 22
            java.lang.Class<android.os.Parcelable[]> r4 = android.os.Parcelable[].class
            r0[r2] = r4
            r2 = 23
            java.lang.Class<java.io.Serializable> r4 = java.io.Serializable.class
            r0[r2] = r4
            java.lang.Class r2 = java.lang.Short.TYPE
            r4 = 24
            r0[r4] = r2
            r2 = 25
            java.lang.Class<short[]> r4 = short[].class
            r0[r2] = r4
            r2 = 26
            java.lang.Class<android.util.SparseArray> r4 = android.util.SparseArray.class
            r0[r2] = r4
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 < r3) goto L_0x00ad
            java.lang.Class<android.util.Size> r4 = android.util.Size.class
            goto L_0x00ae
        L_0x00ad:
            r4 = r1
        L_0x00ae:
            r5 = 27
            r0[r5] = r4
            r4 = 28
            if (r2 < r3) goto L_0x00b8
            java.lang.Class<android.util.SizeF> r1 = android.util.SizeF.class
        L_0x00b8:
            r0[r4] = r1
            f3018g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C1129y.<clinit>():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final Bundle m4632d(C1129y yVar) {
        C3357i.m24508e(yVar, "this$0");
        for (Map.Entry entry : C3602z.m25085i(yVar.f3020b).entrySet()) {
            yVar.mo3880e((String) entry.getKey(), ((C2623c.C2626c) entry.getValue()).mo534a());
        }
        Set<String> keySet = yVar.f3019a.keySet();
        ArrayList arrayList = new ArrayList(keySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String next : keySet) {
            arrayList.add(next);
            arrayList2.add(yVar.f3019a.get(next));
        }
        return C0677d.m2813a(C3327n.m24453a("keys", arrayList), C3327n.m24453a("values", arrayList2));
    }

    /* renamed from: c */
    public final C2623c.C2626c mo3879c() {
        return this.f3023e;
    }

    /* renamed from: e */
    public final <T> void mo3880e(String str, T t) {
        C3357i.m24508e(str, "key");
        if (f3017f.mo3881a(t)) {
            Object obj = this.f3021c.get(str);
            C1117s sVar = obj instanceof C1117s ? (C1117s) obj : null;
            if (sVar != null) {
                sVar.mo3789j(t);
            } else {
                this.f3019a.put(str, t);
            }
            C2580f fVar = this.f3022d.get(str);
            if (fVar != null) {
                fVar.setValue(t);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't put value with type ");
        C3357i.m24505b(t);
        sb.append(t.getClass());
        sb.append(" into saved state");
        throw new IllegalArgumentException(sb.toString());
    }
}
