package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.C0330g;
import androidx.appcompat.widget.C0415a1;

public final class ExpandedMenuView extends ListView implements C0330g.C0332b, C0348n, AdapterView.OnItemClickListener {

    /* renamed from: h */
    private static final int[] f831h = {16842964, 16843049};

    /* renamed from: f */
    private C0330g f832f;

    /* renamed from: g */
    private int f833g;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0415a1 u = C0415a1.m1660u(context, attributeSet, f831h, i, 0);
        if (u.mo1783r(0)) {
            setBackgroundDrawable(u.mo1771f(0));
        }
        if (u.mo1783r(1)) {
            setDivider(u.mo1771f(1));
        }
        u.mo1784v();
    }

    /* renamed from: a */
    public boolean mo921a(C0334i iVar) {
        return this.f832f.mo1068L(iVar, 0);
    }

    /* renamed from: b */
    public void mo922b(C0330g gVar) {
        this.f832f = gVar;
    }

    public int getWindowAnimations() {
        return this.f833g;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo921a((C0334i) getAdapter().getItem(i));
    }
}
