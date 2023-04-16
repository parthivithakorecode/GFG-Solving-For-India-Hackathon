package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import p146v.C4162a;

/* renamed from: androidx.emoji2.text.g */
public class C0923g {

    /* renamed from: d */
    private static final ThreadLocal<C4162a> f2412d = new ThreadLocal<>();

    /* renamed from: a */
    private final int f2413a;

    /* renamed from: b */
    private final C0936m f2414b;

    /* renamed from: c */
    private volatile int f2415c = 0;

    C0923g(C0936m mVar, int i) {
        this.f2414b = mVar;
        this.f2413a = i;
    }

    /* renamed from: g */
    private C4162a m3764g() {
        ThreadLocal<C4162a> threadLocal = f2412d;
        C4162a aVar = threadLocal.get();
        if (aVar == null) {
            aVar = new C4162a();
            threadLocal.set(aVar);
        }
        this.f2414b.mo3170d().mo15670j(aVar, this.f2413a);
        return aVar;
    }

    /* renamed from: a */
    public void mo3136a(Canvas canvas, float f, float f2, Paint paint) {
        Typeface g = this.f2414b.mo3173g();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(g);
        Canvas canvas2 = canvas;
        canvas2.drawText(this.f2414b.mo3169c(), this.f2413a * 2, 2, f, f2, paint);
        paint.setTypeface(typeface);
    }

    /* renamed from: b */
    public int mo3137b(int i) {
        return m3764g().mo15661h(i);
    }

    /* renamed from: c */
    public int mo3138c() {
        return m3764g().mo15662i();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    /* renamed from: d */
    public int mo3139d() {
        return this.f2415c;
    }

    /* renamed from: e */
    public short mo3140e() {
        return m3764g().mo15664k();
    }

    /* renamed from: f */
    public int mo3141f() {
        return m3764g().mo15665l();
    }

    /* renamed from: h */
    public short mo3142h() {
        return m3764g().mo15666m();
    }

    /* renamed from: i */
    public short mo3143i() {
        return m3764g().mo15667n();
    }

    /* renamed from: j */
    public boolean mo3144j() {
        return m3764g().mo15663j();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    /* renamed from: k */
    public void mo3145k(boolean z) {
        this.f2415c = z ? 2 : 1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(mo3141f()));
        sb.append(", codepoints:");
        int c = mo3138c();
        for (int i = 0; i < c; i++) {
            sb.append(Integer.toHexString(mo3137b(i)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
