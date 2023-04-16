package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.content.C0597a;
import androidx.core.view.C0747a0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p116q.C3933a;

/* renamed from: androidx.appcompat.view.menu.g */
public class C0330g implements C3933a {

    /* renamed from: A */
    private static final int[] f938A = {1, 4, 5, 3, 2, 0};

    /* renamed from: a */
    private final Context f939a;

    /* renamed from: b */
    private final Resources f940b;

    /* renamed from: c */
    private boolean f941c;

    /* renamed from: d */
    private boolean f942d;

    /* renamed from: e */
    private C0331a f943e;

    /* renamed from: f */
    private ArrayList<C0334i> f944f;

    /* renamed from: g */
    private ArrayList<C0334i> f945g;

    /* renamed from: h */
    private boolean f946h;

    /* renamed from: i */
    private ArrayList<C0334i> f947i;

    /* renamed from: j */
    private ArrayList<C0334i> f948j;

    /* renamed from: k */
    private boolean f949k;

    /* renamed from: l */
    private int f950l = 0;

    /* renamed from: m */
    private ContextMenu.ContextMenuInfo f951m;

    /* renamed from: n */
    CharSequence f952n;

    /* renamed from: o */
    Drawable f953o;

    /* renamed from: p */
    View f954p;

    /* renamed from: q */
    private boolean f955q = false;

    /* renamed from: r */
    private boolean f956r = false;

    /* renamed from: s */
    private boolean f957s = false;

    /* renamed from: t */
    private boolean f958t = false;

    /* renamed from: u */
    private boolean f959u = false;

    /* renamed from: v */
    private ArrayList<C0334i> f960v = new ArrayList<>();

    /* renamed from: w */
    private CopyOnWriteArrayList<WeakReference<C0346m>> f961w = new CopyOnWriteArrayList<>();

    /* renamed from: x */
    private C0334i f962x;

    /* renamed from: y */
    private boolean f963y = false;

    /* renamed from: z */
    private boolean f964z;

    /* renamed from: androidx.appcompat.view.menu.g$a */
    public interface C0331a {
        /* renamed from: a */
        boolean mo698a(C0330g gVar, MenuItem menuItem);

        /* renamed from: b */
        void mo700b(C0330g gVar);
    }

    /* renamed from: androidx.appcompat.view.menu.g$b */
    public interface C0332b {
        /* renamed from: a */
        boolean mo921a(C0334i iVar);
    }

    public C0330g(Context context) {
        this.f939a = context;
        this.f940b = context.getResources();
        this.f944f = new ArrayList<>();
        this.f945g = new ArrayList<>();
        this.f946h = true;
        this.f947i = new ArrayList<>();
        this.f948j = new ArrayList<>();
        this.f949k = true;
        m1238b0(true);
    }

    /* renamed from: B */
    private static int m1235B(int i) {
        int i2 = (-65536 & i) >> 16;
        if (i2 >= 0) {
            int[] iArr = f938A;
            if (i2 < iArr.length) {
                return (i & 65535) | (iArr[i2] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    /* renamed from: N */
    private void m1236N(int i, boolean z) {
        if (i >= 0 && i < this.f944f.size()) {
            this.f944f.remove(i);
            if (z) {
                mo1067K(true);
            }
        }
    }

    /* renamed from: W */
    private void m1237W(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources C = mo1059C();
        if (view != null) {
            this.f954p = view;
            this.f952n = null;
            this.f953o = null;
        } else {
            if (i > 0) {
                this.f952n = C.getText(i);
            } else if (charSequence != null) {
                this.f952n = charSequence;
            }
            if (i2 > 0) {
                this.f953o = C0597a.m2449d(mo1126u(), i2);
            } else if (drawable != null) {
                this.f953o = drawable;
            }
            this.f954p = null;
        }
        mo1067K(false);
    }

    /* renamed from: b0 */
    private void m1238b0(boolean z) {
        boolean z2 = true;
        if (!z || this.f940b.getConfiguration().keyboard == 1 || !C0747a0.m2977b(ViewConfiguration.get(this.f939a), this.f939a)) {
            z2 = false;
        }
        this.f942d = z2;
    }

    /* renamed from: g */
    private C0334i m1239g(int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        return new C0334i(this, i, i2, i3, i4, charSequence, i5);
    }

    /* renamed from: i */
    private void m1240i(boolean z) {
        if (!this.f961w.isEmpty()) {
            mo1099d0();
            Iterator<WeakReference<C0346m>> it = this.f961w.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0346m mVar = (C0346m) next.get();
                if (mVar == null) {
                    this.f961w.remove(next);
                } else {
                    mVar.mo1000f(z);
                }
            }
            mo1094c0();
        }
    }

    /* renamed from: j */
    private boolean m1241j(C0355r rVar, C0346m mVar) {
        boolean z = false;
        if (this.f961w.isEmpty()) {
            return false;
        }
        if (mVar != null) {
            z = mVar.mo999e(rVar);
        }
        Iterator<WeakReference<C0346m>> it = this.f961w.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            C0346m mVar2 = (C0346m) next.get();
            if (mVar2 == null) {
                this.f961w.remove(next);
            } else if (!z) {
                z = mVar2.mo999e(rVar);
            }
        }
        return z;
    }

    /* renamed from: n */
    private static int m1242n(ArrayList<C0334i> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).mo1140f() <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public boolean mo1058A() {
        return this.f958t;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public Resources mo1059C() {
        return this.f940b;
    }

    /* renamed from: D */
    public C0330g mo1060D() {
        return this;
    }

    /* renamed from: E */
    public ArrayList<C0334i> mo1061E() {
        if (!this.f946h) {
            return this.f945g;
        }
        this.f945g.clear();
        int size = this.f944f.size();
        for (int i = 0; i < size; i++) {
            C0334i iVar = this.f944f.get(i);
            if (iVar.isVisible()) {
                this.f945g.add(iVar);
            }
        }
        this.f946h = false;
        this.f949k = true;
        return this.f945g;
    }

    /* renamed from: F */
    public boolean mo1062F() {
        return this.f963y;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public boolean mo1063G() {
        return this.f941c;
    }

    /* renamed from: H */
    public boolean mo1064H() {
        return this.f942d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void mo1065I(C0334i iVar) {
        this.f949k = true;
        mo1067K(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public void mo1066J(C0334i iVar) {
        this.f946h = true;
        mo1067K(true);
    }

    /* renamed from: K */
    public void mo1067K(boolean z) {
        if (!this.f955q) {
            if (z) {
                this.f946h = true;
                this.f949k = true;
            }
            m1240i(z);
            return;
        }
        this.f956r = true;
        if (z) {
            this.f957s = true;
        }
    }

    /* renamed from: L */
    public boolean mo1068L(MenuItem menuItem, int i) {
        return mo1069M(menuItem, (C0346m) null, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        if (r1 != false) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
        if ((r9 & 1) == 0) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0068, code lost:
        if (r1 == false) goto L_0x002d;
     */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo1069M(android.view.MenuItem r7, androidx.appcompat.view.menu.C0346m r8, int r9) {
        /*
            r6 = this;
            androidx.appcompat.view.menu.i r7 = (androidx.appcompat.view.menu.C0334i) r7
            r0 = 0
            if (r7 == 0) goto L_0x006c
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto L_0x000c
            goto L_0x006c
        L_0x000c:
            boolean r1 = r7.mo1162k()
            androidx.core.view.b r2 = r7.mo937b()
            r3 = 1
            if (r2 == 0) goto L_0x001f
            boolean r4 = r2.mo1251a()
            if (r4 == 0) goto L_0x001f
            r4 = r3
            goto L_0x0020
        L_0x001f:
            r4 = r0
        L_0x0020:
            boolean r5 = r7.mo1161j()
            if (r5 == 0) goto L_0x0031
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto L_0x006b
        L_0x002d:
            r6.mo1100e(r3)
            goto L_0x006b
        L_0x0031:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L_0x003f
            if (r4 == 0) goto L_0x003a
            goto L_0x003f
        L_0x003a:
            r7 = r9 & 1
            if (r7 != 0) goto L_0x006b
            goto L_0x002d
        L_0x003f:
            r9 = r9 & 4
            if (r9 != 0) goto L_0x0046
            r6.mo1100e(r0)
        L_0x0046:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L_0x0058
            androidx.appcompat.view.menu.r r9 = new androidx.appcompat.view.menu.r
            android.content.Context r0 = r6.mo1126u()
            r9.<init>(r0, r6, r7)
            r7.mo1192x(r9)
        L_0x0058:
            android.view.SubMenu r7 = r7.getSubMenu()
            androidx.appcompat.view.menu.r r7 = (androidx.appcompat.view.menu.C0355r) r7
            if (r4 == 0) goto L_0x0063
            r2.mo1254f(r7)
        L_0x0063:
            boolean r7 = r6.m1241j(r7, r8)
            r1 = r1 | r7
            if (r1 != 0) goto L_0x006b
            goto L_0x002d
        L_0x006b:
            return r1
        L_0x006c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0330g.mo1069M(android.view.MenuItem, androidx.appcompat.view.menu.m, int):boolean");
    }

    /* renamed from: O */
    public void mo1070O(C0346m mVar) {
        Iterator<WeakReference<C0346m>> it = this.f961w.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            C0346m mVar2 = (C0346m) next.get();
            if (mVar2 == null || mVar2 == mVar) {
                this.f961w.remove(next);
            }
        }
    }

    /* renamed from: P */
    public void mo1071P(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(mo1125t());
            int size = size();
            for (int i = 0; i < size; i++) {
                MenuItem item = getItem(i);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((C0355r) item.getSubMenu()).mo1071P(bundle);
                }
            }
            int i2 = bundle.getInt("android:menu:expandedactionview");
            if (i2 > 0 && (findItem = findItem(i2)) != null) {
                findItem.expandActionView();
            }
        }
    }

    /* renamed from: Q */
    public void mo1072Q(Bundle bundle) {
        int size = size();
        SparseArray sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((C0355r) item.getSubMenu()).mo1072Q(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo1125t(), sparseArray);
        }
    }

    /* renamed from: R */
    public void mo1073R(C0331a aVar) {
        this.f943e = aVar;
    }

    /* renamed from: S */
    public C0330g mo1074S(int i) {
        this.f950l = i;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public void mo1075T(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f944f.size();
        mo1099d0();
        for (int i = 0; i < size; i++) {
            C0334i iVar = this.f944f.get(i);
            if (iVar.getGroupId() == groupId && iVar.mo1164m() && iVar.isCheckable()) {
                iVar.mo1170s(iVar == menuItem);
            }
        }
        mo1094c0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: U */
    public C0330g mo1076U(int i) {
        m1237W(0, (CharSequence) null, i, (Drawable) null, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: V */
    public C0330g mo1077V(Drawable drawable) {
        m1237W(0, (CharSequence) null, 0, drawable, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: X */
    public C0330g mo1078X(int i) {
        m1237W(i, (CharSequence) null, 0, (Drawable) null, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y */
    public C0330g mo1079Y(CharSequence charSequence) {
        m1237W(0, charSequence, 0, (Drawable) null, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z */
    public C0330g mo1080Z(View view) {
        m1237W(0, (CharSequence) null, 0, (Drawable) null, view);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public MenuItem mo1081a(int i, int i2, int i3, CharSequence charSequence) {
        int B = m1235B(i3);
        C0334i g = m1239g(i, i2, i3, B, charSequence, this.f950l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f951m;
        if (contextMenuInfo != null) {
            g.mo1190v(contextMenuInfo);
        }
        ArrayList<C0334i> arrayList = this.f944f;
        arrayList.add(m1242n(arrayList, B), g);
        mo1067K(true);
        return g;
    }

    /* renamed from: a0 */
    public void mo1082a0(boolean z) {
        this.f964z = z;
    }

    public MenuItem add(int i) {
        return mo1081a(0, 0, 0, this.f940b.getString(i));
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo1081a(i, i2, i3, this.f940b.getString(i4));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo1081a(i, i2, i3, charSequence);
    }

    public MenuItem add(CharSequence charSequence) {
        return mo1081a(0, 0, 0, charSequence);
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f939a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = intent3;
            }
        }
        return size;
    }

    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, (CharSequence) this.f940b.getString(i));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, (CharSequence) this.f940b.getString(i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0334i iVar = (C0334i) mo1081a(i, i2, i3, charSequence);
        C0355r rVar = new C0355r(this.f939a, this, iVar);
        iVar.mo1192x(rVar);
        return rVar;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* renamed from: b */
    public void mo1092b(C0346m mVar) {
        mo1093c(mVar, this.f939a);
    }

    /* renamed from: c */
    public void mo1093c(C0346m mVar, Context context) {
        this.f961w.add(new WeakReference(mVar));
        mVar.mo998d(context, this);
        this.f949k = true;
    }

    /* renamed from: c0 */
    public void mo1094c0() {
        this.f955q = false;
        if (this.f956r) {
            this.f956r = false;
            mo1067K(this.f957s);
        }
    }

    public void clear() {
        C0334i iVar = this.f962x;
        if (iVar != null) {
            mo1101f(iVar);
        }
        this.f944f.clear();
        mo1067K(true);
    }

    public void clearHeader() {
        this.f953o = null;
        this.f952n = null;
        this.f954p = null;
        mo1067K(false);
    }

    public void close() {
        mo1100e(true);
    }

    /* renamed from: d */
    public void mo1098d() {
        C0331a aVar = this.f943e;
        if (aVar != null) {
            aVar.mo700b(this);
        }
    }

    /* renamed from: d0 */
    public void mo1099d0() {
        if (!this.f955q) {
            this.f955q = true;
            this.f956r = false;
            this.f957s = false;
        }
    }

    /* renamed from: e */
    public final void mo1100e(boolean z) {
        if (!this.f959u) {
            this.f959u = true;
            Iterator<WeakReference<C0346m>> it = this.f961w.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0346m mVar = (C0346m) next.get();
                if (mVar == null) {
                    this.f961w.remove(next);
                } else {
                    mVar.mo996b(this, z);
                }
            }
            this.f959u = false;
        }
    }

    /* renamed from: f */
    public boolean mo1101f(C0334i iVar) {
        boolean z = false;
        if (!this.f961w.isEmpty() && this.f962x == iVar) {
            mo1099d0();
            Iterator<WeakReference<C0346m>> it = this.f961w.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0346m mVar = (C0346m) next.get();
                if (mVar == null) {
                    this.f961w.remove(next);
                } else {
                    z = mVar.mo1002i(this, iVar);
                    if (z) {
                        break;
                    }
                }
            }
            mo1094c0();
            if (z) {
                this.f962x = null;
            }
        }
        return z;
    }

    public MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            C0334i iVar = this.f944f.get(i2);
            if (iVar.getItemId() == i) {
                return iVar;
            }
            if (iVar.hasSubMenu() && (findItem = iVar.getSubMenu().findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public MenuItem getItem(int i) {
        return this.f944f.get(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo1104h(C0330g gVar, MenuItem menuItem) {
        C0331a aVar = this.f943e;
        return aVar != null && aVar.mo698a(gVar, menuItem);
    }

    public boolean hasVisibleItems() {
        if (this.f964z) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f944f.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return mo1111p(i, keyEvent) != null;
    }

    /* renamed from: k */
    public boolean mo1107k(C0334i iVar) {
        boolean z = false;
        if (this.f961w.isEmpty()) {
            return false;
        }
        mo1099d0();
        Iterator<WeakReference<C0346m>> it = this.f961w.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            C0346m mVar = (C0346m) next.get();
            if (mVar == null) {
                this.f961w.remove(next);
            } else {
                z = mVar.mo1003j(this, iVar);
                if (z) {
                    break;
                }
            }
        }
        mo1094c0();
        if (z) {
            this.f962x = iVar;
        }
        return z;
    }

    /* renamed from: l */
    public int mo1108l(int i) {
        return mo1109m(i, 0);
    }

    /* renamed from: m */
    public int mo1109m(int i, int i2) {
        int size = size();
        if (i2 < 0) {
            i2 = 0;
        }
        while (i2 < size) {
            if (this.f944f.get(i2).getGroupId() == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* renamed from: o */
    public int mo1110o(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f944f.get(i2).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public C0334i mo1111p(int i, KeyEvent keyEvent) {
        ArrayList<C0334i> arrayList = this.f960v;
        arrayList.clear();
        mo1114q(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean G = mo1063G();
        for (int i2 = 0; i2 < size; i2++) {
            C0334i iVar = arrayList.get(i2);
            char alphabeticShortcut = G ? iVar.getAlphabeticShortcut() : iVar.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (G && alphabeticShortcut == 8 && i == 67))) {
                return iVar;
            }
        }
        return null;
    }

    public boolean performIdentifierAction(int i, int i2) {
        return mo1068L(findItem(i), i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        C0334i p = mo1111p(i, keyEvent);
        boolean L = p != null ? mo1068L(p, i2) : false;
        if ((i2 & 2) != 0) {
            mo1100e(true);
        }
        return L;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo1114q(List<C0334i> list, int i, KeyEvent keyEvent) {
        boolean G = mo1063G();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f944f.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0334i iVar = this.f944f.get(i2);
                if (iVar.hasSubMenu()) {
                    ((C0330g) iVar.getSubMenu()).mo1114q(list, i, keyEvent);
                }
                char alphabeticShortcut = G ? iVar.getAlphabeticShortcut() : iVar.getNumericShortcut();
                if (((modifiers & 69647) == ((G ? iVar.getAlphabeticModifiers() : iVar.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (G && alphabeticShortcut == 8 && i == 67)) && iVar.isEnabled()) {
                        list.add(iVar);
                    }
                }
            }
        }
    }

    /* renamed from: r */
    public void mo1115r() {
        ArrayList<C0334i> E = mo1061E();
        if (this.f949k) {
            Iterator<WeakReference<C0346m>> it = this.f961w.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0346m mVar = (C0346m) next.get();
                if (mVar == null) {
                    this.f961w.remove(next);
                } else {
                    z |= mVar.mo1020h();
                }
            }
            if (z) {
                this.f947i.clear();
                this.f948j.clear();
                int size = E.size();
                for (int i = 0; i < size; i++) {
                    C0334i iVar = E.get(i);
                    (iVar.mo1163l() ? this.f947i : this.f948j).add(iVar);
                }
            } else {
                this.f947i.clear();
                this.f948j.clear();
                this.f948j.addAll(mo1061E());
            }
            this.f949k = false;
        }
    }

    public void removeGroup(int i) {
        int l = mo1108l(i);
        if (l >= 0) {
            int size = this.f944f.size() - l;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= size || this.f944f.get(l).getGroupId() != i) {
                    mo1067K(true);
                } else {
                    m1236N(l, false);
                    i2 = i3;
                }
            }
            mo1067K(true);
        }
    }

    public void removeItem(int i) {
        m1236N(mo1110o(i), true);
    }

    /* renamed from: s */
    public ArrayList<C0334i> mo1118s() {
        mo1115r();
        return this.f947i;
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f944f.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0334i iVar = this.f944f.get(i2);
            if (iVar.getGroupId() == i) {
                iVar.mo1187t(z2);
                iVar.setCheckable(z);
            }
        }
    }

    public void setGroupDividerEnabled(boolean z) {
        this.f963y = z;
    }

    public void setGroupEnabled(int i, boolean z) {
        int size = this.f944f.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0334i iVar = this.f944f.get(i2);
            if (iVar.getGroupId() == i) {
                iVar.setEnabled(z);
            }
        }
    }

    public void setGroupVisible(int i, boolean z) {
        int size = this.f944f.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C0334i iVar = this.f944f.get(i2);
            if (iVar.getGroupId() == i && iVar.mo1193y(z)) {
                z2 = true;
            }
        }
        if (z2) {
            mo1067K(true);
        }
    }

    public void setQwertyMode(boolean z) {
        this.f941c = z;
        mo1067K(false);
    }

    public int size() {
        return this.f944f.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public String mo1125t() {
        return "android:menu:actionviewstates";
    }

    /* renamed from: u */
    public Context mo1126u() {
        return this.f939a;
    }

    /* renamed from: v */
    public C0334i mo1127v() {
        return this.f962x;
    }

    /* renamed from: w */
    public Drawable mo1128w() {
        return this.f953o;
    }

    /* renamed from: x */
    public CharSequence mo1129x() {
        return this.f952n;
    }

    /* renamed from: y */
    public View mo1130y() {
        return this.f954p;
    }

    /* renamed from: z */
    public ArrayList<C0334i> mo1131z() {
        mo1115r();
        return this.f948j;
    }
}
