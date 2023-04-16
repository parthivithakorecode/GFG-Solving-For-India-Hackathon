package androidx.appcompat.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C0334i;
import androidx.appcompat.view.menu.C0336j;
import androidx.appcompat.widget.C0415a1;
import androidx.appcompat.widget.C0463i0;
import androidx.core.view.C0764b;
import androidx.core.view.C0811j;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p038f.C2591j;
import p116q.C3933a;

/* renamed from: androidx.appcompat.view.g */
public class C0307g extends MenuInflater {

    /* renamed from: e */
    static final Class<?>[] f768e;

    /* renamed from: f */
    static final Class<?>[] f769f;

    /* renamed from: a */
    final Object[] f770a;

    /* renamed from: b */
    final Object[] f771b;

    /* renamed from: c */
    Context f772c;

    /* renamed from: d */
    private Object f773d;

    /* renamed from: androidx.appcompat.view.g$a */
    private static class C0308a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c */
        private static final Class<?>[] f774c = {MenuItem.class};

        /* renamed from: a */
        private Object f775a;

        /* renamed from: b */
        private Method f776b;

        public C0308a(Object obj, String str) {
            this.f775a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f776b = cls.getMethod(str, f774c);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f776b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f776b.invoke(this.f775a, new Object[]{menuItem})).booleanValue();
                }
                this.f776b.invoke(this.f775a, new Object[]{menuItem});
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: androidx.appcompat.view.g$b */
    private class C0309b {

        /* renamed from: A */
        C0764b f777A;

        /* renamed from: B */
        private CharSequence f778B;

        /* renamed from: C */
        private CharSequence f779C;

        /* renamed from: D */
        private ColorStateList f780D = null;

        /* renamed from: E */
        private PorterDuff.Mode f781E = null;

        /* renamed from: a */
        private Menu f783a;

        /* renamed from: b */
        private int f784b;

        /* renamed from: c */
        private int f785c;

        /* renamed from: d */
        private int f786d;

        /* renamed from: e */
        private int f787e;

        /* renamed from: f */
        private boolean f788f;

        /* renamed from: g */
        private boolean f789g;

        /* renamed from: h */
        private boolean f790h;

        /* renamed from: i */
        private int f791i;

        /* renamed from: j */
        private int f792j;

        /* renamed from: k */
        private CharSequence f793k;

        /* renamed from: l */
        private CharSequence f794l;

        /* renamed from: m */
        private int f795m;

        /* renamed from: n */
        private char f796n;

        /* renamed from: o */
        private int f797o;

        /* renamed from: p */
        private char f798p;

        /* renamed from: q */
        private int f799q;

        /* renamed from: r */
        private int f800r;

        /* renamed from: s */
        private boolean f801s;

        /* renamed from: t */
        private boolean f802t;

        /* renamed from: u */
        private boolean f803u;

        /* renamed from: v */
        private int f804v;

        /* renamed from: w */
        private int f805w;

        /* renamed from: x */
        private String f806x;

        /* renamed from: y */
        private String f807y;

        /* renamed from: z */
        private String f808z;

        public C0309b(Menu menu) {
            this.f783a = menu;
            mo873h();
        }

        /* renamed from: c */
        private char m1120c(String str) {
            if (str == null) {
                return 0;
            }
            return str.charAt(0);
        }

        /* renamed from: e */
        private <T> T m1121e(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, C0307g.this.f772c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
                return null;
            }
        }

        /* renamed from: i */
        private void m1122i(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.f801s).setVisible(this.f802t).setEnabled(this.f803u).setCheckable(this.f800r >= 1).setTitleCondensed(this.f794l).setIcon(this.f795m);
            int i = this.f804v;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.f808z != null) {
                if (!C0307g.this.f772c.isRestricted()) {
                    menuItem.setOnMenuItemClickListener(new C0308a(C0307g.this.mo865b(), this.f808z));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.f800r >= 2) {
                if (menuItem instanceof C0334i) {
                    ((C0334i) menuItem).mo1187t(true);
                } else if (menuItem instanceof C0336j) {
                    ((C0336j) menuItem).mo1217h(true);
                }
            }
            String str = this.f806x;
            if (str != null) {
                menuItem.setActionView((View) m1121e(str, C0307g.f768e, C0307g.this.f770a));
                z = true;
            }
            int i2 = this.f805w;
            if (i2 > 0) {
                if (!z) {
                    menuItem.setActionView(i2);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            C0764b bVar = this.f777A;
            if (bVar != null) {
                C0811j.m3247a(menuItem, bVar);
            }
            C0811j.m3249c(menuItem, this.f778B);
            C0811j.m3253g(menuItem, this.f779C);
            C0811j.m3248b(menuItem, this.f796n, this.f797o);
            C0811j.m3252f(menuItem, this.f798p, this.f799q);
            PorterDuff.Mode mode = this.f781E;
            if (mode != null) {
                C0811j.m3251e(menuItem, mode);
            }
            ColorStateList colorStateList = this.f780D;
            if (colorStateList != null) {
                C0811j.m3250d(menuItem, colorStateList);
            }
        }

        /* renamed from: a */
        public void mo868a() {
            this.f790h = true;
            m1122i(this.f783a.add(this.f784b, this.f791i, this.f792j, this.f793k));
        }

        /* renamed from: b */
        public SubMenu mo869b() {
            this.f790h = true;
            SubMenu addSubMenu = this.f783a.addSubMenu(this.f784b, this.f791i, this.f792j, this.f793k);
            m1122i(addSubMenu.getItem());
            return addSubMenu;
        }

        /* renamed from: d */
        public boolean mo870d() {
            return this.f790h;
        }

        /* renamed from: f */
        public void mo871f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = C0307g.this.f772c.obtainStyledAttributes(attributeSet, C2591j.f18880o1);
            this.f784b = obtainStyledAttributes.getResourceId(C2591j.f18890q1, 0);
            this.f785c = obtainStyledAttributes.getInt(C2591j.f18900s1, 0);
            this.f786d = obtainStyledAttributes.getInt(C2591j.f18905t1, 0);
            this.f787e = obtainStyledAttributes.getInt(C2591j.f18910u1, 0);
            this.f788f = obtainStyledAttributes.getBoolean(C2591j.f18895r1, true);
            this.f789g = obtainStyledAttributes.getBoolean(C2591j.f18885p1, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: g */
        public void mo872g(AttributeSet attributeSet) {
            C0415a1 t = C0415a1.m1659t(C0307g.this.f772c, attributeSet, C2591j.f18915v1);
            this.f791i = t.mo1778m(C2591j.f18930y1, 0);
            this.f792j = (t.mo1775j(C2591j.f18705B1, this.f785c) & -65536) | (t.mo1775j(C2591j.f18710C1, this.f786d) & 65535);
            this.f793k = t.mo1780o(C2591j.f18715D1);
            this.f794l = t.mo1780o(C2591j.f18720E1);
            this.f795m = t.mo1778m(C2591j.f18920w1, 0);
            this.f796n = m1120c(t.mo1779n(C2591j.f18725F1));
            this.f797o = t.mo1775j(C2591j.f18754M1, 4096);
            this.f798p = m1120c(t.mo1779n(C2591j.f18730G1));
            this.f799q = t.mo1775j(C2591j.f18770Q1, 4096);
            int i = C2591j.f18734H1;
            this.f800r = t.mo1783r(i) ? t.mo1766a(i, false) : this.f787e;
            this.f801s = t.mo1766a(C2591j.f18935z1, false);
            this.f802t = t.mo1766a(C2591j.f18700A1, this.f788f);
            this.f803u = t.mo1766a(C2591j.f18925x1, this.f789g);
            this.f804v = t.mo1775j(C2591j.f18774R1, -1);
            this.f808z = t.mo1779n(C2591j.f18738I1);
            this.f805w = t.mo1778m(C2591j.f18742J1, 0);
            this.f806x = t.mo1779n(C2591j.f18750L1);
            String n = t.mo1779n(C2591j.f18746K1);
            this.f807y = n;
            boolean z = n != null;
            if (z && this.f805w == 0 && this.f806x == null) {
                this.f777A = (C0764b) m1121e(n, C0307g.f769f, C0307g.this.f771b);
            } else {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f777A = null;
            }
            this.f778B = t.mo1780o(C2591j.f18758N1);
            this.f779C = t.mo1780o(C2591j.f18778S1);
            int i2 = C2591j.f18766P1;
            if (t.mo1783r(i2)) {
                this.f781E = C0463i0.m1909d(t.mo1775j(i2, -1), this.f781E);
            } else {
                this.f781E = null;
            }
            int i3 = C2591j.f18762O1;
            if (t.mo1783r(i3)) {
                this.f780D = t.mo1768c(i3);
            } else {
                this.f780D = null;
            }
            t.mo1784v();
            this.f790h = false;
        }

        /* renamed from: h */
        public void mo873h() {
            this.f784b = 0;
            this.f785c = 0;
            this.f786d = 0;
            this.f787e = 0;
            this.f788f = true;
            this.f789g = true;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            f768e = r0
            f769f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.C0307g.<clinit>():void");
    }

    public C0307g(Context context) {
        super(context);
        this.f772c = context;
        Object[] objArr = {context};
        this.f770a = objArr;
        this.f771b = objArr;
    }

    /* renamed from: a */
    private Object m1117a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m1117a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* renamed from: c */
    private void m1118c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        C0309b bVar = new C0309b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType != 2) {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            } else {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
            }
        }
        String str = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            if (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z2 && name2.equals(str)) {
                            str = null;
                            z2 = false;
                        } else if (name2.equals("group")) {
                            bVar.mo873h();
                        } else if (name2.equals("item")) {
                            if (!bVar.mo870d()) {
                                C0764b bVar2 = bVar.f777A;
                                if (bVar2 == null || !bVar2.mo1251a()) {
                                    bVar.mo868a();
                                } else {
                                    bVar.mo869b();
                                }
                            }
                        } else if (name2.equals("menu")) {
                            z = true;
                        }
                    }
                } else if (!z2) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals("group")) {
                        bVar.mo871f(attributeSet);
                    } else if (name3.equals("item")) {
                        bVar.mo872g(attributeSet);
                    } else if (name3.equals("menu")) {
                        m1118c(xmlPullParser, attributeSet, bVar.mo869b());
                    } else {
                        str = name3;
                        z2 = true;
                    }
                }
                eventType = xmlPullParser.next();
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Object mo865b() {
        if (this.f773d == null) {
            this.f773d = m1117a(this.f772c);
        }
        return this.f773d;
    }

    public void inflate(int i, Menu menu) {
        if (!(menu instanceof C3933a)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = this.f772c.getResources().getLayout(i);
            m1118c(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        } catch (XmlPullParserException e) {
            throw new InflateException("Error inflating menu XML", e);
        } catch (IOException e2) {
            throw new InflateException("Error inflating menu XML", e2);
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
