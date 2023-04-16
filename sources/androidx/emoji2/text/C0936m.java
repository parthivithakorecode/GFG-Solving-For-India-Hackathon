package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.core.p009os.C0692m;
import androidx.core.util.C0743e;
import java.nio.ByteBuffer;
import p146v.C4163b;

/* renamed from: androidx.emoji2.text.m */
public final class C0936m {

    /* renamed from: a */
    private final C4163b f2449a;

    /* renamed from: b */
    private final char[] f2450b;

    /* renamed from: c */
    private final C0937a f2451c = new C0937a(1024);

    /* renamed from: d */
    private final Typeface f2452d;

    /* renamed from: androidx.emoji2.text.m$a */
    static class C0937a {

        /* renamed from: a */
        private final SparseArray<C0937a> f2453a;

        /* renamed from: b */
        private C0923g f2454b;

        private C0937a() {
            this(1);
        }

        C0937a(int i) {
            this.f2453a = new SparseArray<>(i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0937a mo3175a(int i) {
            SparseArray<C0937a> sparseArray = this.f2453a;
            if (sparseArray == null) {
                return null;
            }
            return sparseArray.get(i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final C0923g mo3176b() {
            return this.f2454b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo3177c(C0923g gVar, int i, int i2) {
            C0937a a = mo3175a(gVar.mo3137b(i));
            if (a == null) {
                a = new C0937a();
                this.f2453a.put(gVar.mo3137b(i), a);
            }
            if (i2 > i) {
                a.mo3177c(gVar, i + 1, i2);
            } else {
                a.f2454b = gVar;
            }
        }
    }

    private C0936m(Typeface typeface, C4163b bVar) {
        this.f2452d = typeface;
        this.f2449a = bVar;
        this.f2450b = new char[(bVar.mo15671k() * 2)];
        m3820a(bVar);
    }

    /* renamed from: a */
    private void m3820a(C4163b bVar) {
        int k = bVar.mo15671k();
        for (int i = 0; i < k; i++) {
            C0923g gVar = new C0923g(this, i);
            Character.toChars(gVar.mo3141f(), this.f2450b, i * 2);
            mo3174h(gVar);
        }
    }

    /* renamed from: b */
    public static C0936m m3821b(Typeface typeface, ByteBuffer byteBuffer) {
        try {
            C0692m.m2837a("EmojiCompat.MetadataRepo.create");
            return new C0936m(typeface, C0932l.m3806b(byteBuffer));
        } finally {
            C0692m.m2838b();
        }
    }

    /* renamed from: c */
    public char[] mo3169c() {
        return this.f2450b;
    }

    /* renamed from: d */
    public C4163b mo3170d() {
        return this.f2449a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo3171e() {
        return this.f2449a.mo15672l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C0937a mo3172f() {
        return this.f2451c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public Typeface mo3173g() {
        return this.f2452d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo3174h(C0923g gVar) {
        C0743e.m2959g(gVar, "emoji metadata cannot be null");
        C0743e.m2953a(gVar.mo3138c() > 0, "invalid metadata codepoint length");
        this.f2451c.mo3177c(gVar, 0, gVar.mo3138c() - 1);
    }
}
