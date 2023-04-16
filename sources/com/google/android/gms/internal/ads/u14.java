package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public abstract class u14 implements w04 {

    /* renamed from: b */
    protected u04 f15333b;

    /* renamed from: c */
    protected u04 f15334c;

    /* renamed from: d */
    private u04 f15335d;

    /* renamed from: e */
    private u04 f15336e;

    /* renamed from: f */
    private ByteBuffer f15337f;

    /* renamed from: g */
    private ByteBuffer f15338g;

    /* renamed from: h */
    private boolean f15339h;

    public u14() {
        ByteBuffer byteBuffer = w04.f16648a;
        this.f15337f = byteBuffer;
        this.f15338g = byteBuffer;
        u04 u04 = u04.f15311e;
        this.f15335d = u04;
        this.f15336e = u04;
        this.f15333b = u04;
        this.f15334c = u04;
    }

    /* renamed from: a */
    public ByteBuffer mo9933a() {
        ByteBuffer byteBuffer = this.f15338g;
        this.f15338g = w04.f16648a;
        return byteBuffer;
    }

    /* renamed from: b */
    public final u04 mo9934b(u04 u04) {
        this.f15335d = u04;
        this.f15336e = mo8063i(u04);
        return mo9402e() ? this.f15336e : u04.f15311e;
    }

    /* renamed from: c */
    public final void mo9935c() {
        this.f15338g = w04.f16648a;
        this.f15339h = false;
        this.f15333b = this.f15335d;
        this.f15334c = this.f15336e;
        mo9403k();
    }

    /* renamed from: d */
    public final void mo9936d() {
        mo9935c();
        this.f15337f = w04.f16648a;
        u04 u04 = u04.f15311e;
        this.f15335d = u04;
        this.f15336e = u04;
        this.f15333b = u04;
        this.f15334c = u04;
        mo9405m();
    }

    /* renamed from: e */
    public boolean mo9402e() {
        return this.f15336e != u04.f15311e;
    }

    /* renamed from: f */
    public boolean mo9937f() {
        return this.f15339h && this.f15338g == w04.f16648a;
    }

    /* renamed from: g */
    public final void mo9938g() {
        this.f15339h = true;
        mo9404l();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract u04 mo8063i(u04 u04);

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final ByteBuffer mo11147j(int i) {
        if (this.f15337f.capacity() < i) {
            this.f15337f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f15337f.clear();
        }
        ByteBuffer byteBuffer = this.f15337f;
        this.f15338g = byteBuffer;
        return byteBuffer;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo9403k() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo9404l() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo9405m() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final boolean mo11148n() {
        return this.f15338g.hasRemaining();
    }
}
