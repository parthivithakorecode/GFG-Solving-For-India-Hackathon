package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.C0301c;
import androidx.core.view.C0764b;
import java.lang.reflect.Method;
import p116q.C3934b;

/* renamed from: androidx.appcompat.view.menu.j */
public class C0336j extends C0320c implements MenuItem {

    /* renamed from: d */
    private final C3934b f1001d;

    /* renamed from: e */
    private Method f1002e;

    /* renamed from: androidx.appcompat.view.menu.j$a */
    private class C0337a extends C0764b {

        /* renamed from: d */
        final ActionProvider f1003d;

        C0337a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f1003d = actionProvider;
        }

        /* renamed from: a */
        public boolean mo1251a() {
            return this.f1003d.hasSubMenu();
        }

        /* renamed from: c */
        public View mo1252c() {
            return this.f1003d.onCreateActionView();
        }

        /* renamed from: e */
        public boolean mo1253e() {
            return this.f1003d.onPerformDefaultAction();
        }

        /* renamed from: f */
        public void mo1254f(SubMenu subMenu) {
            this.f1003d.onPrepareSubMenu(C0336j.this.mo1012d(subMenu));
        }
    }

    /* renamed from: androidx.appcompat.view.menu.j$b */
    private class C0338b extends C0337a implements ActionProvider.VisibilityListener {

        /* renamed from: f */
        private C0764b.C0766b f1005f;

        C0338b(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        /* renamed from: b */
        public boolean mo1255b() {
            return this.f1003d.isVisible();
        }

        /* renamed from: d */
        public View mo1256d(MenuItem menuItem) {
            return this.f1003d.onCreateActionView(menuItem);
        }

        /* renamed from: g */
        public boolean mo1257g() {
            return this.f1003d.overridesItemVisibility();
        }

        /* renamed from: j */
        public void mo1258j(C0764b.C0766b bVar) {
            this.f1005f = bVar;
            this.f1003d.setVisibilityListener(bVar != null ? this : null);
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            C0764b.C0766b bVar = this.f1005f;
            if (bVar != null) {
                bVar.onActionProviderVisibilityChanged(z);
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.j$c */
    static class C0339c extends FrameLayout implements C0301c {

        /* renamed from: f */
        final CollapsibleActionView f1007f;

        C0339c(View view) {
            super(view.getContext());
            this.f1007f = (CollapsibleActionView) view;
            addView(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public View mo1260a() {
            return (View) this.f1007f;
        }

        /* renamed from: c */
        public void mo836c() {
            this.f1007f.onActionViewExpanded();
        }

        /* renamed from: d */
        public void mo837d() {
            this.f1007f.onActionViewCollapsed();
        }
    }

    /* renamed from: androidx.appcompat.view.menu.j$d */
    private class C0340d implements MenuItem.OnActionExpandListener {

        /* renamed from: a */
        private final MenuItem.OnActionExpandListener f1008a;

        C0340d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f1008a = onActionExpandListener;
        }

        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f1008a.onMenuItemActionCollapse(C0336j.this.mo1011c(menuItem));
        }

        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f1008a.onMenuItemActionExpand(C0336j.this.mo1011c(menuItem));
        }
    }

    /* renamed from: androidx.appcompat.view.menu.j$e */
    private class C0341e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a */
        private final MenuItem.OnMenuItemClickListener f1010a;

        C0341e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f1010a = onMenuItemClickListener;
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f1010a.onMenuItemClick(C0336j.this.mo1011c(menuItem));
        }
    }

    public C0336j(Context context, C3934b bVar) {
        super(context);
        if (bVar != null) {
            this.f1001d = bVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public boolean collapseActionView() {
        return this.f1001d.collapseActionView();
    }

    public boolean expandActionView() {
        return this.f1001d.expandActionView();
    }

    public ActionProvider getActionProvider() {
        C0764b b = this.f1001d.mo937b();
        if (b instanceof C0337a) {
            return ((C0337a) b).f1003d;
        }
        return null;
    }

    public View getActionView() {
        View actionView = this.f1001d.getActionView();
        return actionView instanceof C0339c ? ((C0339c) actionView).mo1260a() : actionView;
    }

    public int getAlphabeticModifiers() {
        return this.f1001d.getAlphabeticModifiers();
    }

    public char getAlphabeticShortcut() {
        return this.f1001d.getAlphabeticShortcut();
    }

    public CharSequence getContentDescription() {
        return this.f1001d.getContentDescription();
    }

    public int getGroupId() {
        return this.f1001d.getGroupId();
    }

    public Drawable getIcon() {
        return this.f1001d.getIcon();
    }

    public ColorStateList getIconTintList() {
        return this.f1001d.getIconTintList();
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f1001d.getIconTintMode();
    }

    public Intent getIntent() {
        return this.f1001d.getIntent();
    }

    public int getItemId() {
        return this.f1001d.getItemId();
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f1001d.getMenuInfo();
    }

    public int getNumericModifiers() {
        return this.f1001d.getNumericModifiers();
    }

    public char getNumericShortcut() {
        return this.f1001d.getNumericShortcut();
    }

    public int getOrder() {
        return this.f1001d.getOrder();
    }

    public SubMenu getSubMenu() {
        return mo1012d(this.f1001d.getSubMenu());
    }

    public CharSequence getTitle() {
        return this.f1001d.getTitle();
    }

    public CharSequence getTitleCondensed() {
        return this.f1001d.getTitleCondensed();
    }

    public CharSequence getTooltipText() {
        return this.f1001d.getTooltipText();
    }

    /* renamed from: h */
    public void mo1217h(boolean z) {
        try {
            if (this.f1002e == null) {
                this.f1002e = this.f1001d.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
            }
            this.f1002e.invoke(this.f1001d, new Object[]{Boolean.valueOf(z)});
        } catch (Exception e) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
        }
    }

    public boolean hasSubMenu() {
        return this.f1001d.hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return this.f1001d.isActionViewExpanded();
    }

    public boolean isCheckable() {
        return this.f1001d.isCheckable();
    }

    public boolean isChecked() {
        return this.f1001d.isChecked();
    }

    public boolean isEnabled() {
        return this.f1001d.isEnabled();
    }

    public boolean isVisible() {
        return this.f1001d.isVisible();
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        C0764b bVar = Build.VERSION.SDK_INT >= 16 ? new C0338b(this.f881a, actionProvider) : new C0337a(this.f881a, actionProvider);
        C3934b bVar2 = this.f1001d;
        if (actionProvider == null) {
            bVar = null;
        }
        bVar2.mo936a(bVar);
        return this;
    }

    public MenuItem setActionView(int i) {
        this.f1001d.setActionView(i);
        View actionView = this.f1001d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f1001d.setActionView((View) new C0339c(actionView));
        }
        return this;
    }

    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0339c(view);
        }
        this.f1001d.setActionView(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        this.f1001d.setAlphabeticShortcut(c);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f1001d.setAlphabeticShortcut(c, i);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.f1001d.setCheckable(z);
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.f1001d.setChecked(z);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f1001d.setContentDescription(charSequence);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f1001d.setEnabled(z);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f1001d.setIcon(i);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f1001d.setIcon(drawable);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1001d.setIconTintList(colorStateList);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1001d.setIconTintMode(mode);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f1001d.setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        this.f1001d.setNumericShortcut(c);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        this.f1001d.setNumericShortcut(c, i);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f1001d.setOnActionExpandListener(onActionExpandListener != null ? new C0340d(onActionExpandListener) : null);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1001d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new C0341e(onMenuItemClickListener) : null);
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f1001d.setShortcut(c, c2);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f1001d.setShortcut(c, c2, i, i2);
        return this;
    }

    public void setShowAsAction(int i) {
        this.f1001d.setShowAsAction(i);
    }

    public MenuItem setShowAsActionFlags(int i) {
        this.f1001d.setShowAsActionFlags(i);
        return this;
    }

    public MenuItem setTitle(int i) {
        this.f1001d.setTitle(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f1001d.setTitle(charSequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1001d.setTitleCondensed(charSequence);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f1001d.setTooltipText(charSequence);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        return this.f1001d.setVisible(z);
    }
}
