package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.C0348n;
import androidx.core.graphics.drawable.C0650a;
import androidx.core.view.C0764b;
import p038f.C2589h;
import p045g.C2620a;
import p116q.C3934b;

/* renamed from: androidx.appcompat.view.menu.i */
public final class C0334i implements C3934b {

    /* renamed from: A */
    private View f969A;

    /* renamed from: B */
    private C0764b f970B;

    /* renamed from: C */
    private MenuItem.OnActionExpandListener f971C;

    /* renamed from: D */
    private boolean f972D = false;

    /* renamed from: E */
    private ContextMenu.ContextMenuInfo f973E;

    /* renamed from: a */
    private final int f974a;

    /* renamed from: b */
    private final int f975b;

    /* renamed from: c */
    private final int f976c;

    /* renamed from: d */
    private final int f977d;

    /* renamed from: e */
    private CharSequence f978e;

    /* renamed from: f */
    private CharSequence f979f;

    /* renamed from: g */
    private Intent f980g;

    /* renamed from: h */
    private char f981h;

    /* renamed from: i */
    private int f982i = 4096;

    /* renamed from: j */
    private char f983j;

    /* renamed from: k */
    private int f984k = 4096;

    /* renamed from: l */
    private Drawable f985l;

    /* renamed from: m */
    private int f986m = 0;

    /* renamed from: n */
    C0330g f987n;

    /* renamed from: o */
    private C0355r f988o;

    /* renamed from: p */
    private Runnable f989p;

    /* renamed from: q */
    private MenuItem.OnMenuItemClickListener f990q;

    /* renamed from: r */
    private CharSequence f991r;

    /* renamed from: s */
    private CharSequence f992s;

    /* renamed from: t */
    private ColorStateList f993t = null;

    /* renamed from: u */
    private PorterDuff.Mode f994u = null;

    /* renamed from: v */
    private boolean f995v = false;

    /* renamed from: w */
    private boolean f996w = false;

    /* renamed from: x */
    private boolean f997x = false;

    /* renamed from: y */
    private int f998y = 16;

    /* renamed from: z */
    private int f999z = 0;

    /* renamed from: androidx.appcompat.view.menu.i$a */
    class C0335a implements C0764b.C0766b {
        C0335a() {
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            C0334i iVar = C0334i.this;
            iVar.f987n.mo1066J(iVar);
        }
    }

    C0334i(C0330g gVar, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f987n = gVar;
        this.f974a = i2;
        this.f975b = i;
        this.f976c = i3;
        this.f977d = i4;
        this.f978e = charSequence;
        this.f999z = i5;
    }

    /* renamed from: d */
    private static void m1298d(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    /* renamed from: e */
    private Drawable m1299e(Drawable drawable) {
        if (drawable != null && this.f997x && (this.f995v || this.f996w)) {
            drawable = C0650a.m2699p(drawable).mutate();
            if (this.f995v) {
                C0650a.m2697n(drawable, this.f993t);
            }
            if (this.f996w) {
                C0650a.m2698o(drawable, this.f994u);
            }
            this.f997x = false;
        }
        return drawable;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public boolean mo1137A() {
        return this.f987n.mo1064H() && mo1141g() != 0;
    }

    /* renamed from: B */
    public boolean mo1138B() {
        return (this.f999z & 4) == 4;
    }

    /* renamed from: a */
    public C3934b mo936a(C0764b bVar) {
        C0764b bVar2 = this.f970B;
        if (bVar2 != null) {
            bVar2.mo2824h();
        }
        this.f969A = null;
        this.f970B = bVar;
        this.f987n.mo1067K(true);
        C0764b bVar3 = this.f970B;
        if (bVar3 != null) {
            bVar3.mo1258j(new C0335a());
        }
        return this;
    }

    /* renamed from: b */
    public C0764b mo937b() {
        return this.f970B;
    }

    /* renamed from: c */
    public void mo1139c() {
        this.f987n.mo1065I(this);
    }

    public boolean collapseActionView() {
        if ((this.f999z & 8) == 0) {
            return false;
        }
        if (this.f969A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f971C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f987n.mo1101f(this);
        }
        return false;
    }

    public boolean expandActionView() {
        if (!mo1161j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f971C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f987n.mo1107k(this);
        }
        return false;
    }

    /* renamed from: f */
    public int mo1140f() {
        return this.f977d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public char mo1141g() {
        return this.f987n.mo1063G() ? this.f983j : this.f981h;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public View getActionView() {
        View view = this.f969A;
        if (view != null) {
            return view;
        }
        C0764b bVar = this.f970B;
        if (bVar == null) {
            return null;
        }
        View d = bVar.mo1256d(this);
        this.f969A = d;
        return d;
    }

    public int getAlphabeticModifiers() {
        return this.f984k;
    }

    public char getAlphabeticShortcut() {
        return this.f983j;
    }

    public CharSequence getContentDescription() {
        return this.f991r;
    }

    public int getGroupId() {
        return this.f975b;
    }

    public Drawable getIcon() {
        Drawable drawable = this.f985l;
        if (drawable != null) {
            return m1299e(drawable);
        }
        if (this.f986m == 0) {
            return null;
        }
        Drawable b = C2620a.m21330b(this.f987n.mo1126u(), this.f986m);
        this.f986m = 0;
        this.f985l = b;
        return m1299e(b);
    }

    public ColorStateList getIconTintList() {
        return this.f993t;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f994u;
    }

    public Intent getIntent() {
        return this.f980g;
    }

    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f974a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f973E;
    }

    public int getNumericModifiers() {
        return this.f982i;
    }

    public char getNumericShortcut() {
        return this.f981h;
    }

    public int getOrder() {
        return this.f976c;
    }

    public SubMenu getSubMenu() {
        return this.f988o;
    }

    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f978e;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f979f;
        if (charSequence == null) {
            charSequence = this.f978e;
        }
        return (Build.VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) ? charSequence : charSequence.toString();
    }

    public CharSequence getTooltipText() {
        return this.f992s;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public String mo1154h() {
        int i;
        char g = mo1141g();
        if (g == 0) {
            return "";
        }
        Resources resources = this.f987n.mo1126u().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f987n.mo1126u()).hasPermanentMenuKey()) {
            sb.append(resources.getString(C2589h.abc_prepend_shortcut_label));
        }
        int i2 = this.f987n.mo1063G() ? this.f984k : this.f982i;
        m1298d(sb, i2, 65536, resources.getString(C2589h.abc_menu_meta_shortcut_label));
        m1298d(sb, i2, 4096, resources.getString(C2589h.abc_menu_ctrl_shortcut_label));
        m1298d(sb, i2, 2, resources.getString(C2589h.abc_menu_alt_shortcut_label));
        m1298d(sb, i2, 1, resources.getString(C2589h.abc_menu_shift_shortcut_label));
        m1298d(sb, i2, 4, resources.getString(C2589h.abc_menu_sym_shortcut_label));
        m1298d(sb, i2, 8, resources.getString(C2589h.abc_menu_function_shortcut_label));
        if (g == 8) {
            i = C2589h.abc_menu_delete_shortcut_label;
        } else if (g == 10) {
            i = C2589h.abc_menu_enter_shortcut_label;
        } else if (g != ' ') {
            sb.append(g);
            return sb.toString();
        } else {
            i = C2589h.abc_menu_space_shortcut_label;
        }
        sb.append(resources.getString(i));
        return sb.toString();
    }

    public boolean hasSubMenu() {
        return this.f988o != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public CharSequence mo1156i(C0348n.C0349a aVar) {
        return (aVar == null || !aVar.mo898a()) ? getTitle() : getTitleCondensed();
    }

    public boolean isActionViewExpanded() {
        return this.f972D;
    }

    public boolean isCheckable() {
        return (this.f998y & 1) == 1;
    }

    public boolean isChecked() {
        return (this.f998y & 2) == 2;
    }

    public boolean isEnabled() {
        return (this.f998y & 16) != 0;
    }

    public boolean isVisible() {
        C0764b bVar = this.f970B;
        return (bVar == null || !bVar.mo1257g()) ? (this.f998y & 8) == 0 : (this.f998y & 8) == 0 && this.f970B.mo1255b();
    }

    /* renamed from: j */
    public boolean mo1161j() {
        C0764b bVar;
        if ((this.f999z & 8) == 0) {
            return false;
        }
        if (this.f969A == null && (bVar = this.f970B) != null) {
            this.f969A = bVar.mo1256d(this);
        }
        return this.f969A != null;
    }

    /* renamed from: k */
    public boolean mo1162k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f990q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        C0330g gVar = this.f987n;
        if (gVar.mo1104h(gVar, this)) {
            return true;
        }
        Runnable runnable = this.f989p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f980g != null) {
            try {
                this.f987n.mo1126u().startActivity(this.f980g);
                return true;
            } catch (ActivityNotFoundException e) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
            }
        }
        C0764b bVar = this.f970B;
        return bVar != null && bVar.mo1253e();
    }

    /* renamed from: l */
    public boolean mo1163l() {
        return (this.f998y & 32) == 32;
    }

    /* renamed from: m */
    public boolean mo1164m() {
        return (this.f998y & 4) != 0;
    }

    /* renamed from: n */
    public boolean mo1165n() {
        return (this.f999z & 1) == 1;
    }

    /* renamed from: o */
    public boolean mo1166o() {
        return (this.f999z & 2) == 2;
    }

    /* renamed from: p */
    public C3934b setActionView(int i) {
        Context u = this.f987n.mo1126u();
        setActionView(LayoutInflater.from(u).inflate(i, new LinearLayout(u), false));
        return this;
    }

    /* renamed from: q */
    public C3934b setActionView(View view) {
        int i;
        this.f969A = view;
        this.f970B = null;
        if (view != null && view.getId() == -1 && (i = this.f974a) > 0) {
            view.setId(i);
        }
        this.f987n.mo1065I(this);
        return this;
    }

    /* renamed from: r */
    public void mo1169r(boolean z) {
        this.f972D = z;
        this.f987n.mo1067K(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo1170s(boolean z) {
        int i = this.f998y;
        int i2 = (z ? 2 : 0) | (i & -3);
        this.f998y = i2;
        if (i != i2) {
            this.f987n.mo1067K(false);
        }
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public MenuItem setAlphabeticShortcut(char c) {
        if (this.f983j == c) {
            return this;
        }
        this.f983j = Character.toLowerCase(c);
        this.f987n.mo1067K(false);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f983j == c && this.f984k == i) {
            return this;
        }
        this.f983j = Character.toLowerCase(c);
        this.f984k = KeyEvent.normalizeMetaState(i);
        this.f987n.mo1067K(false);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        int i = this.f998y;
        boolean z2 = z | (i & true);
        this.f998y = z2 ? 1 : 0;
        if (i != z2) {
            this.f987n.mo1067K(false);
        }
        return this;
    }

    public MenuItem setChecked(boolean z) {
        if ((this.f998y & 4) != 0) {
            this.f987n.mo1075T(this);
        } else {
            mo1170s(z);
        }
        return this;
    }

    public C3934b setContentDescription(CharSequence charSequence) {
        this.f991r = charSequence;
        this.f987n.mo1067K(false);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f998y = z ? this.f998y | 16 : this.f998y & -17;
        this.f987n.mo1067K(false);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f985l = null;
        this.f986m = i;
        this.f997x = true;
        this.f987n.mo1067K(false);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f986m = 0;
        this.f985l = drawable;
        this.f997x = true;
        this.f987n.mo1067K(false);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f993t = colorStateList;
        this.f995v = true;
        this.f997x = true;
        this.f987n.mo1067K(false);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f994u = mode;
        this.f996w = true;
        this.f997x = true;
        this.f987n.mo1067K(false);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f980g = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        if (this.f981h == c) {
            return this;
        }
        this.f981h = c;
        this.f987n.mo1067K(false);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        if (this.f981h == c && this.f982i == i) {
            return this;
        }
        this.f981h = c;
        this.f982i = KeyEvent.normalizeMetaState(i);
        this.f987n.mo1067K(false);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f971C = onActionExpandListener;
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f990q = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f981h = c;
        this.f983j = Character.toLowerCase(c2);
        this.f987n.mo1067K(false);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f981h = c;
        this.f982i = KeyEvent.normalizeMetaState(i);
        this.f983j = Character.toLowerCase(c2);
        this.f984k = KeyEvent.normalizeMetaState(i2);
        this.f987n.mo1067K(false);
        return this;
    }

    public void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            this.f999z = i;
            this.f987n.mo1065I(this);
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    public MenuItem setTitle(int i) {
        return setTitle((CharSequence) this.f987n.mo1126u().getString(i));
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f978e = charSequence;
        this.f987n.mo1067K(false);
        C0355r rVar = this.f988o;
        if (rVar != null) {
            rVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f979f = charSequence;
        this.f987n.mo1067K(false);
        return this;
    }

    public C3934b setTooltipText(CharSequence charSequence) {
        this.f992s = charSequence;
        this.f987n.mo1067K(false);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        if (mo1193y(z)) {
            this.f987n.mo1066J(this);
        }
        return this;
    }

    /* renamed from: t */
    public void mo1187t(boolean z) {
        this.f998y = (z ? 4 : 0) | (this.f998y & -5);
    }

    public String toString() {
        CharSequence charSequence = this.f978e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* renamed from: u */
    public void mo1189u(boolean z) {
        this.f998y = z ? this.f998y | 32 : this.f998y & -33;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo1190v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f973E = contextMenuInfo;
    }

    /* renamed from: w */
    public C3934b setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    /* renamed from: x */
    public void mo1192x(C0355r rVar) {
        this.f988o = rVar;
        rVar.setHeaderTitle(getTitle());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public boolean mo1193y(boolean z) {
        int i = this.f998y;
        int i2 = (z ? 0 : 8) | (i & -9);
        this.f998y = i2;
        return i != i2;
    }

    /* renamed from: z */
    public boolean mo1194z() {
        return this.f987n.mo1058A();
    }
}
