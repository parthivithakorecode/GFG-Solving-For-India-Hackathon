package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p116q.C3935c;

/* renamed from: androidx.appcompat.view.menu.s */
class C0356s extends C0350o implements SubMenu {

    /* renamed from: e */
    private final C3935c f1052e;

    C0356s(Context context, C3935c cVar) {
        super(context, cVar);
        this.f1052e = cVar;
    }

    public void clearHeader() {
        this.f1052e.clearHeader();
    }

    public MenuItem getItem() {
        return mo1011c(this.f1052e.getItem());
    }

    public SubMenu setHeaderIcon(int i) {
        this.f1052e.setHeaderIcon(i);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f1052e.setHeaderIcon(drawable);
        return this;
    }

    public SubMenu setHeaderTitle(int i) {
        this.f1052e.setHeaderTitle(i);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f1052e.setHeaderTitle(charSequence);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        this.f1052e.setHeaderView(view);
        return this;
    }

    public SubMenu setIcon(int i) {
        this.f1052e.setIcon(i);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f1052e.setIcon(drawable);
        return this;
    }
}
