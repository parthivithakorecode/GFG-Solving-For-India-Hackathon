package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.content.C0597a;
import androidx.core.graphics.drawable.C0650a;
import androidx.core.view.C0764b;
import p116q.C3934b;

/* renamed from: androidx.appcompat.view.menu.a */
public class C0318a implements C3934b {

    /* renamed from: a */
    private final int f851a;

    /* renamed from: b */
    private final int f852b;

    /* renamed from: c */
    private final int f853c;

    /* renamed from: d */
    private CharSequence f854d;

    /* renamed from: e */
    private CharSequence f855e;

    /* renamed from: f */
    private Intent f856f;

    /* renamed from: g */
    private char f857g;

    /* renamed from: h */
    private int f858h = 4096;

    /* renamed from: i */
    private char f859i;

    /* renamed from: j */
    private int f860j = 4096;

    /* renamed from: k */
    private Drawable f861k;

    /* renamed from: l */
    private Context f862l;

    /* renamed from: m */
    private MenuItem.OnMenuItemClickListener f863m;

    /* renamed from: n */
    private CharSequence f864n;

    /* renamed from: o */
    private CharSequence f865o;

    /* renamed from: p */
    private ColorStateList f866p = null;

    /* renamed from: q */
    private PorterDuff.Mode f867q = null;

    /* renamed from: r */
    private boolean f868r = false;

    /* renamed from: s */
    private boolean f869s = false;

    /* renamed from: t */
    private int f870t = 16;

    public C0318a(Context context, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.f862l = context;
        this.f851a = i2;
        this.f852b = i;
        this.f853c = i4;
        this.f854d = charSequence;
    }

    /* renamed from: c */
    private void m1165c() {
        Drawable drawable = this.f861k;
        if (drawable == null) {
            return;
        }
        if (this.f868r || this.f869s) {
            Drawable p = C0650a.m2699p(drawable);
            this.f861k = p;
            Drawable mutate = p.mutate();
            this.f861k = mutate;
            if (this.f868r) {
                C0650a.m2697n(mutate, this.f866p);
            }
            if (this.f869s) {
                C0650a.m2698o(this.f861k, this.f867q);
            }
        }
    }

    /* renamed from: a */
    public C3934b mo936a(C0764b bVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public C0764b mo937b() {
        return null;
    }

    public boolean collapseActionView() {
        return false;
    }

    /* renamed from: d */
    public C3934b setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public C3934b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public boolean expandActionView() {
        return false;
    }

    /* renamed from: f */
    public C3934b setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public View getActionView() {
        return null;
    }

    public int getAlphabeticModifiers() {
        return this.f860j;
    }

    public char getAlphabeticShortcut() {
        return this.f859i;
    }

    public CharSequence getContentDescription() {
        return this.f864n;
    }

    public int getGroupId() {
        return this.f852b;
    }

    public Drawable getIcon() {
        return this.f861k;
    }

    public ColorStateList getIconTintList() {
        return this.f866p;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f867q;
    }

    public Intent getIntent() {
        return this.f856f;
    }

    public int getItemId() {
        return this.f851a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public int getNumericModifiers() {
        return this.f858h;
    }

    public char getNumericShortcut() {
        return this.f857g;
    }

    public int getOrder() {
        return this.f853c;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public CharSequence getTitle() {
        return this.f854d;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f855e;
        return charSequence != null ? charSequence : this.f854d;
    }

    public CharSequence getTooltipText() {
        return this.f865o;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isActionViewExpanded() {
        return false;
    }

    public boolean isCheckable() {
        return (this.f870t & 1) != 0;
    }

    public boolean isChecked() {
        return (this.f870t & 2) != 0;
    }

    public boolean isEnabled() {
        return (this.f870t & 16) != 0;
    }

    public boolean isVisible() {
        return (this.f870t & 8) == 0;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setAlphabeticShortcut(char c) {
        this.f859i = Character.toLowerCase(c);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f859i = Character.toLowerCase(c);
        this.f860j = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.f870t = z | (this.f870t & true) ? 1 : 0;
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.f870t = (z ? 2 : 0) | (this.f870t & -3);
        return this;
    }

    public C3934b setContentDescription(CharSequence charSequence) {
        this.f864n = charSequence;
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f870t = (z ? 16 : 0) | (this.f870t & -17);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f861k = C0597a.m2449d(this.f862l, i);
        m1165c();
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f861k = drawable;
        m1165c();
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f866p = colorStateList;
        this.f868r = true;
        m1165c();
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f867q = mode;
        this.f869s = true;
        m1165c();
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f856f = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        this.f857g = c;
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        this.f857g = c;
        this.f858h = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f863m = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f857g = c;
        this.f859i = Character.toLowerCase(c2);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f857g = c;
        this.f858h = KeyEvent.normalizeMetaState(i);
        this.f859i = Character.toLowerCase(c2);
        this.f860j = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public void setShowAsAction(int i) {
    }

    public MenuItem setTitle(int i) {
        this.f854d = this.f862l.getResources().getString(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f854d = charSequence;
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f855e = charSequence;
        return this;
    }

    public C3934b setTooltipText(CharSequence charSequence) {
        this.f865o = charSequence;
        return this;
    }

    public MenuItem setVisible(boolean z) {
        int i = 8;
        int i2 = this.f870t & 8;
        if (z) {
            i = 0;
        }
        this.f870t = i2 | i;
        return this;
    }
}
