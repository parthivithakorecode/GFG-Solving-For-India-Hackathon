package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.C0346m;
import androidx.appcompat.view.menu.C0348n;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.menu.b */
public abstract class C0319b implements C0346m {

    /* renamed from: f */
    protected Context f871f;

    /* renamed from: g */
    protected Context f872g;

    /* renamed from: h */
    protected C0330g f873h;

    /* renamed from: i */
    protected LayoutInflater f874i;

    /* renamed from: j */
    protected LayoutInflater f875j;

    /* renamed from: k */
    private C0346m.C0347a f876k;

    /* renamed from: l */
    private int f877l;

    /* renamed from: m */
    private int f878m;

    /* renamed from: n */
    protected C0348n f879n;

    /* renamed from: o */
    private int f880o;

    public C0319b(Context context, int i, int i2) {
        this.f871f = context;
        this.f874i = LayoutInflater.from(context);
        this.f877l = i;
        this.f878m = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo995a(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f879n).addView(view, i);
    }

    /* renamed from: b */
    public void mo996b(C0330g gVar, boolean z) {
        C0346m.C0347a aVar = this.f876k;
        if (aVar != null) {
            aVar.mo727b(gVar, z);
        }
    }

    /* renamed from: c */
    public abstract void mo997c(C0334i iVar, C0348n.C0349a aVar);

    /* renamed from: d */
    public void mo998d(Context context, C0330g gVar) {
        this.f872g = context;
        this.f875j = LayoutInflater.from(context);
        this.f873h = gVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        return false;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo999e(androidx.appcompat.view.menu.C0355r r2) {
        /*
            r1 = this;
            androidx.appcompat.view.menu.m$a r0 = r1.f876k
            if (r0 == 0) goto L_0x000e
            if (r2 == 0) goto L_0x0007
            goto L_0x0009
        L_0x0007:
            androidx.appcompat.view.menu.g r2 = r1.f873h
        L_0x0009:
            boolean r2 = r0.mo728c(r2)
            return r2
        L_0x000e:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0319b.mo999e(androidx.appcompat.view.menu.r):boolean");
    }

    /* renamed from: f */
    public void mo1000f(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.f879n;
        if (viewGroup != null) {
            C0330g gVar = this.f873h;
            int i = 0;
            if (gVar != null) {
                gVar.mo1115r();
                ArrayList<C0334i> E = this.f873h.mo1061E();
                int size = E.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    C0334i iVar = E.get(i3);
                    if (mo1010q(i2, iVar)) {
                        View childAt = viewGroup.getChildAt(i2);
                        C0334i itemData = childAt instanceof C0348n.C0349a ? ((C0348n.C0349a) childAt).getItemData() : null;
                        View n = mo1007n(iVar, childAt, viewGroup);
                        if (iVar != itemData) {
                            n.setPressed(false);
                            n.jumpDrawablesToCurrentState();
                        }
                        if (n != childAt) {
                            mo995a(n, i2);
                        }
                        i2++;
                    }
                }
                i = i2;
            }
            while (i < viewGroup.getChildCount()) {
                if (!mo1005l(viewGroup, i)) {
                    i++;
                }
            }
        }
    }

    /* renamed from: g */
    public C0348n.C0349a mo1001g(ViewGroup viewGroup) {
        return (C0348n.C0349a) this.f874i.inflate(this.f878m, viewGroup, false);
    }

    /* renamed from: i */
    public boolean mo1002i(C0330g gVar, C0334i iVar) {
        return false;
    }

    /* renamed from: j */
    public boolean mo1003j(C0330g gVar, C0334i iVar) {
        return false;
    }

    /* renamed from: k */
    public void mo1004k(C0346m.C0347a aVar) {
        this.f876k = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public boolean mo1005l(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    /* renamed from: m */
    public C0346m.C0347a mo1006m() {
        return this.f876k;
    }

    /* renamed from: n */
    public View mo1007n(C0334i iVar, View view, ViewGroup viewGroup) {
        C0348n.C0349a g = view instanceof C0348n.C0349a ? (C0348n.C0349a) view : mo1001g(viewGroup);
        mo997c(iVar, g);
        return (View) g;
    }

    /* renamed from: o */
    public C0348n mo1008o(ViewGroup viewGroup) {
        if (this.f879n == null) {
            C0348n nVar = (C0348n) this.f874i.inflate(this.f877l, viewGroup, false);
            this.f879n = nVar;
            nVar.mo922b(this.f873h);
            mo1000f(true);
        }
        return this.f879n;
    }

    /* renamed from: p */
    public void mo1009p(int i) {
        this.f880o = i;
    }

    /* renamed from: q */
    public abstract boolean mo1010q(int i, C0334i iVar);
}
