package p052h;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import p052h.C2657b;

@SuppressLint({"RestrictedAPI"})
/* renamed from: h.d */
class C2663d extends C2657b {

    /* renamed from: r */
    private C2664a f19090r;

    /* renamed from: s */
    private boolean f19091s;

    /* renamed from: h.d$a */
    static class C2664a extends C2657b.C2661d {

        /* renamed from: J */
        int[][] f19092J;

        C2664a(C2664a aVar, C2663d dVar, Resources resources) {
            super(aVar, dVar, resources);
            if (aVar != null) {
                this.f19092J = aVar.f19092J;
            } else {
                this.f19092J = new int[mo12595f()][];
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: A */
        public int mo12644A(int[] iArr) {
            int[][] iArr2 = this.f19092J;
            int h = mo12598h();
            for (int i = 0; i < h; i++) {
                if (StateSet.stateSetMatches(iArr2[i], iArr)) {
                    return i;
                }
            }
            return -1;
        }

        public Drawable newDrawable() {
            return new C2663d(this, (Resources) null);
        }

        public Drawable newDrawable(Resources resources) {
            return new C2663d(this, resources);
        }

        /* renamed from: o */
        public void mo12605o(int i, int i2) {
            super.mo12605o(i, i2);
            int[][] iArr = new int[i2][];
            System.arraycopy(this.f19092J, 0, iArr, 0, i);
            this.f19092J = iArr;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public void mo12571r() {
            int[][] iArr = this.f19092J;
            int[][] iArr2 = new int[iArr.length][];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[][] iArr3 = this.f19092J;
                iArr2[length] = iArr3[length] != null ? (int[]) iArr3[length].clone() : null;
            }
            this.f19092J = iArr2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: z */
        public int mo12645z(int[] iArr, Drawable drawable) {
            int a = mo12590a(drawable);
            this.f19092J[a] = iArr;
            return a;
        }
    }

    C2663d(C2664a aVar) {
        if (aVar != null) {
            mo12540h(aVar);
        }
    }

    C2663d(C2664a aVar, Resources resources) {
        mo12540h(new C2664a(aVar, this, resources));
        onStateChange(getState());
    }

    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo12540h(C2657b.C2661d dVar) {
        super.mo12540h(dVar);
        if (dVar instanceof C2664a) {
            this.f19090r = (C2664a) dVar;
        }
    }

    public boolean isStateful() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C2664a mo12526b() {
        return new C2664a(this.f19090r, this, (Resources) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public int[] mo12643k(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i = 0;
        for (int i2 = 0; i2 < attributeCount; i2++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i2);
            if (!(attributeNameResource == 0 || attributeNameResource == 16842960 || attributeNameResource == 16843161)) {
                int i3 = i + 1;
                if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i] = attributeNameResource;
                i = i3;
            }
        }
        return StateSet.trimStateSet(iArr, i);
    }

    public Drawable mutate() {
        if (!this.f19091s && super.mutate() == this) {
            this.f19090r.mo12571r();
            this.f19091s = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int A = this.f19090r.mo12644A(iArr);
        if (A < 0) {
            A = this.f19090r.mo12644A(StateSet.WILD_CARD);
        }
        return mo12579g(A) || onStateChange;
    }
}
