package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C0330g;

/* renamed from: androidx.appcompat.view.menu.r */
public class C0355r extends C0330g implements SubMenu {

    /* renamed from: B */
    private C0330g f1050B;

    /* renamed from: C */
    private C0334i f1051C;

    public C0355r(Context context, C0330g gVar, C0334i iVar) {
        super(context);
        this.f1050B = gVar;
        this.f1051C = iVar;
    }

    /* renamed from: D */
    public C0330g mo1060D() {
        return this.f1050B.mo1060D();
    }

    /* renamed from: F */
    public boolean mo1062F() {
        return this.f1050B.mo1062F();
    }

    /* renamed from: G */
    public boolean mo1063G() {
        return this.f1050B.mo1063G();
    }

    /* renamed from: H */
    public boolean mo1064H() {
        return this.f1050B.mo1064H();
    }

    /* renamed from: R */
    public void mo1073R(C0330g.C0331a aVar) {
        this.f1050B.mo1073R(aVar);
    }

    /* renamed from: e0 */
    public Menu mo1309e0() {
        return this.f1050B;
    }

    /* renamed from: f */
    public boolean mo1101f(C0334i iVar) {
        return this.f1050B.mo1101f(iVar);
    }

    public MenuItem getItem() {
        return this.f1051C;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo1104h(C0330g gVar, MenuItem menuItem) {
        return super.mo1104h(gVar, menuItem) || this.f1050B.mo1104h(gVar, menuItem);
    }

    /* renamed from: k */
    public boolean mo1107k(C0334i iVar) {
        return this.f1050B.mo1107k(iVar);
    }

    public void setGroupDividerEnabled(boolean z) {
        this.f1050B.setGroupDividerEnabled(z);
    }

    public SubMenu setHeaderIcon(int i) {
        return (SubMenu) super.mo1076U(i);
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.mo1077V(drawable);
    }

    public SubMenu setHeaderTitle(int i) {
        return (SubMenu) super.mo1078X(i);
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.mo1079Y(charSequence);
    }

    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.mo1080Z(view);
    }

    public SubMenu setIcon(int i) {
        this.f1051C.setIcon(i);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f1051C.setIcon(drawable);
        return this;
    }

    public void setQwertyMode(boolean z) {
        this.f1050B.setQwertyMode(z);
    }

    /* renamed from: t */
    public String mo1125t() {
        C0334i iVar = this.f1051C;
        int itemId = iVar != null ? iVar.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.mo1125t() + ":" + itemId;
    }
}
