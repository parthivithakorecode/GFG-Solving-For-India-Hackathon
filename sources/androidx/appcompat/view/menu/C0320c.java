package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import p102o.C3814g;
import p116q.C3934b;
import p116q.C3935c;

/* renamed from: androidx.appcompat.view.menu.c */
abstract class C0320c {

    /* renamed from: a */
    final Context f881a;

    /* renamed from: b */
    private C3814g<C3934b, MenuItem> f882b;

    /* renamed from: c */
    private C3814g<C3935c, SubMenu> f883c;

    C0320c(Context context) {
        this.f881a = context;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final MenuItem mo1011c(MenuItem menuItem) {
        if (!(menuItem instanceof C3934b)) {
            return menuItem;
        }
        C3934b bVar = (C3934b) menuItem;
        if (this.f882b == null) {
            this.f882b = new C3814g<>();
        }
        MenuItem menuItem2 = this.f882b.get(bVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        C0336j jVar = new C0336j(this.f881a, bVar);
        this.f882b.put(bVar, jVar);
        return jVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final SubMenu mo1012d(SubMenu subMenu) {
        if (!(subMenu instanceof C3935c)) {
            return subMenu;
        }
        C3935c cVar = (C3935c) subMenu;
        if (this.f883c == null) {
            this.f883c = new C3814g<>();
        }
        SubMenu subMenu2 = this.f883c.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        C0356s sVar = new C0356s(this.f881a, cVar);
        this.f883c.put(cVar, sVar);
        return sVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo1013e() {
        C3814g<C3934b, MenuItem> gVar = this.f882b;
        if (gVar != null) {
            gVar.clear();
        }
        C3814g<C3935c, SubMenu> gVar2 = this.f883c;
        if (gVar2 != null) {
            gVar2.clear();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo1014f(int i) {
        if (this.f882b != null) {
            int i2 = 0;
            while (i2 < this.f882b.size()) {
                if (this.f882b.mo15174i(i2).getGroupId() == i) {
                    this.f882b.mo15177k(i2);
                    i2--;
                }
                i2++;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo1015g(int i) {
        if (this.f882b != null) {
            for (int i2 = 0; i2 < this.f882b.size(); i2++) {
                if (this.f882b.mo15174i(i2).getItemId() == i) {
                    this.f882b.mo15177k(i2);
                    return;
                }
            }
        }
    }
}
