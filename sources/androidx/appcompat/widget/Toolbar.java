package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.C0246a;
import androidx.appcompat.view.C0301c;
import androidx.appcompat.view.C0307g;
import androidx.appcompat.view.menu.C0330g;
import androidx.appcompat.view.menu.C0334i;
import androidx.appcompat.view.menu.C0346m;
import androidx.appcompat.view.menu.C0355r;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.C0782e;
import androidx.core.view.C0792h;
import androidx.core.view.C0795i;
import androidx.core.view.C0833y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p038f.C2582a;
import p038f.C2591j;
import p045g.C2620a;
import p140u.C4082a;

public class Toolbar extends ViewGroup {

    /* renamed from: A */
    private int f1221A;

    /* renamed from: B */
    private int f1222B;

    /* renamed from: C */
    private CharSequence f1223C;

    /* renamed from: D */
    private CharSequence f1224D;

    /* renamed from: E */
    private ColorStateList f1225E;

    /* renamed from: F */
    private ColorStateList f1226F;

    /* renamed from: G */
    private boolean f1227G;

    /* renamed from: H */
    private boolean f1228H;

    /* renamed from: I */
    private final ArrayList<View> f1229I;

    /* renamed from: J */
    private final ArrayList<View> f1230J;

    /* renamed from: K */
    private final int[] f1231K;

    /* renamed from: L */
    final C0795i f1232L;

    /* renamed from: M */
    private ArrayList<MenuItem> f1233M;

    /* renamed from: N */
    C0394f f1234N;

    /* renamed from: O */
    private final ActionMenuView.C0368e f1235O;

    /* renamed from: P */
    private C0437c1 f1236P;

    /* renamed from: Q */
    private C0421c f1237Q;

    /* renamed from: R */
    private C0392d f1238R;

    /* renamed from: S */
    private C0346m.C0347a f1239S;

    /* renamed from: T */
    private C0330g.C0331a f1240T;

    /* renamed from: U */
    private boolean f1241U;

    /* renamed from: V */
    private final Runnable f1242V;

    /* renamed from: f */
    private ActionMenuView f1243f;

    /* renamed from: g */
    private TextView f1244g;

    /* renamed from: h */
    private TextView f1245h;

    /* renamed from: i */
    private ImageButton f1246i;

    /* renamed from: j */
    private ImageView f1247j;

    /* renamed from: k */
    private Drawable f1248k;

    /* renamed from: l */
    private CharSequence f1249l;

    /* renamed from: m */
    ImageButton f1250m;

    /* renamed from: n */
    View f1251n;

    /* renamed from: o */
    private Context f1252o;

    /* renamed from: p */
    private int f1253p;

    /* renamed from: q */
    private int f1254q;

    /* renamed from: r */
    private int f1255r;

    /* renamed from: s */
    int f1256s;

    /* renamed from: t */
    private int f1257t;

    /* renamed from: u */
    private int f1258u;

    /* renamed from: v */
    private int f1259v;

    /* renamed from: w */
    private int f1260w;

    /* renamed from: x */
    private int f1261x;

    /* renamed from: y */
    private C0515s0 f1262y;

    /* renamed from: z */
    private int f1263z;

    /* renamed from: androidx.appcompat.widget.Toolbar$a */
    class C0389a implements ActionMenuView.C0368e {
        C0389a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            if (Toolbar.this.f1232L.mo2868c(menuItem)) {
                return true;
            }
            C0394f fVar = Toolbar.this.f1234N;
            if (fVar != null) {
                return fVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$b */
    class C0390b implements Runnable {
        C0390b() {
        }

        public void run() {
            Toolbar.this.mo1582P();
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$c */
    class C0391c implements View.OnClickListener {
        C0391c() {
        }

        public void onClick(View view) {
            Toolbar.this.mo1586e();
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$d */
    private class C0392d implements C0346m {

        /* renamed from: f */
        C0330g f1267f;

        /* renamed from: g */
        C0334i f1268g;

        C0392d() {
        }

        /* renamed from: b */
        public void mo996b(C0330g gVar, boolean z) {
        }

        /* renamed from: d */
        public void mo998d(Context context, C0330g gVar) {
            C0334i iVar;
            C0330g gVar2 = this.f1267f;
            if (!(gVar2 == null || (iVar = this.f1268g) == null)) {
                gVar2.mo1101f(iVar);
            }
            this.f1267f = gVar;
        }

        /* renamed from: e */
        public boolean mo999e(C0355r rVar) {
            return false;
        }

        /* renamed from: f */
        public void mo1000f(boolean z) {
            if (this.f1268g != null) {
                C0330g gVar = this.f1267f;
                boolean z2 = false;
                if (gVar != null) {
                    int size = gVar.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (this.f1267f.getItem(i) == this.f1268g) {
                            z2 = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (!z2) {
                    mo1002i(this.f1267f, this.f1268g);
                }
            }
        }

        /* renamed from: h */
        public boolean mo1020h() {
            return false;
        }

        /* renamed from: i */
        public boolean mo1002i(C0330g gVar, C0334i iVar) {
            View view = Toolbar.this.f1251n;
            if (view instanceof C0301c) {
                ((C0301c) view).mo837d();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f1251n);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f1250m);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f1251n = null;
            toolbar3.mo1583a();
            this.f1268g = null;
            Toolbar.this.requestLayout();
            iVar.mo1169r(false);
            return true;
        }

        /* renamed from: j */
        public boolean mo1003j(C0330g gVar, C0334i iVar) {
            Toolbar.this.mo1588g();
            ViewParent parent = Toolbar.this.f1250m.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f1250m);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f1250m);
            }
            Toolbar.this.f1251n = iVar.getActionView();
            this.f1268g = iVar;
            ViewParent parent2 = Toolbar.this.f1251n.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f1251n);
                }
                C0393e m = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                m.f556a = 8388611 | (toolbar4.f1256s & 112);
                m.f1270b = 2;
                toolbar4.f1251n.setLayoutParams(m);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f1251n);
            }
            Toolbar.this.mo1577I();
            Toolbar.this.requestLayout();
            iVar.mo1169r(true);
            View view = Toolbar.this.f1251n;
            if (view instanceof C0301c) {
                ((C0301c) view).mo836c();
            }
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$e */
    public static class C0393e extends C0246a.C0247a {

        /* renamed from: b */
        int f1270b = 0;

        public C0393e(int i, int i2) {
            super(i, i2);
            this.f556a = 8388627;
        }

        public C0393e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0393e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0393e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super((ViewGroup.LayoutParams) marginLayoutParams);
            mo1671a(marginLayoutParams);
        }

        public C0393e(C0246a.C0247a aVar) {
            super(aVar);
        }

        public C0393e(C0393e eVar) {
            super((C0246a.C0247a) eVar);
            this.f1270b = eVar.f1270b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1671a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$f */
    public interface C0394f {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$g */
    public static class C0395g extends C4082a {
        public static final Parcelable.Creator<C0395g> CREATOR = new C0396a();

        /* renamed from: h */
        int f1271h;

        /* renamed from: i */
        boolean f1272i;

        /* renamed from: androidx.appcompat.widget.Toolbar$g$a */
        class C0396a implements Parcelable.ClassLoaderCreator<C0395g> {
            C0396a() {
            }

            /* renamed from: a */
            public C0395g createFromParcel(Parcel parcel) {
                return new C0395g(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public C0395g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0395g(parcel, classLoader);
            }

            /* renamed from: c */
            public C0395g[] newArray(int i) {
                return new C0395g[i];
            }
        }

        public C0395g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1271h = parcel.readInt();
            this.f1272i = parcel.readInt() != 0;
        }

        public C0395g(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1271h);
            parcel.writeInt(this.f1272i ? 1 : 0);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2582a.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1222B = 8388627;
        this.f1229I = new ArrayList<>();
        this.f1230J = new ArrayList<>();
        this.f1231K = new int[2];
        this.f1232L = new C0795i(new C0420b1(this));
        this.f1233M = new ArrayList<>();
        this.f1235O = new C0389a();
        this.f1242V = new C0390b();
        Context context2 = getContext();
        int[] iArr = C2591j.f18775R2;
        C0415a1 u = C0415a1.m1660u(context2, attributeSet, iArr, i, 0);
        C0833y.m3328M(this, context, iArr, attributeSet, u.mo1782q(), i, 0);
        this.f1254q = u.mo1778m(C2591j.f18907t3, 0);
        this.f1255r = u.mo1778m(C2591j.f18862k3, 0);
        this.f1222B = u.mo1776k(C2591j.f18779S2, this.f1222B);
        this.f1256s = u.mo1776k(C2591j.f18783T2, 48);
        int d = u.mo1769d(C2591j.f18877n3, 0);
        int i2 = C2591j.f18902s3;
        d = u.mo1783r(i2) ? u.mo1769d(i2, d) : d;
        this.f1261x = d;
        this.f1260w = d;
        this.f1259v = d;
        this.f1258u = d;
        int d2 = u.mo1769d(C2591j.f18892q3, -1);
        if (d2 >= 0) {
            this.f1258u = d2;
        }
        int d3 = u.mo1769d(C2591j.f18887p3, -1);
        if (d3 >= 0) {
            this.f1259v = d3;
        }
        int d4 = u.mo1769d(C2591j.f18897r3, -1);
        if (d4 >= 0) {
            this.f1260w = d4;
        }
        int d5 = u.mo1769d(C2591j.f18882o3, -1);
        if (d5 >= 0) {
            this.f1261x = d5;
        }
        this.f1257t = u.mo1770e(C2591j.f18832e3, -1);
        int d6 = u.mo1769d(C2591j.f18812a3, Integer.MIN_VALUE);
        int d7 = u.mo1769d(C2591j.f18795W2, Integer.MIN_VALUE);
        int e = u.mo1770e(C2591j.f18803Y2, 0);
        int e2 = u.mo1770e(C2591j.f18807Z2, 0);
        m1558h();
        this.f1262y.mo2304e(e, e2);
        if (!(d6 == Integer.MIN_VALUE && d7 == Integer.MIN_VALUE)) {
            this.f1262y.mo2306g(d6, d7);
        }
        this.f1263z = u.mo1769d(C2591j.f18817b3, Integer.MIN_VALUE);
        this.f1221A = u.mo1769d(C2591j.f18799X2, Integer.MIN_VALUE);
        this.f1248k = u.mo1771f(C2591j.f18791V2);
        this.f1249l = u.mo1780o(C2591j.f18787U2);
        CharSequence o = u.mo1780o(C2591j.f18872m3);
        if (!TextUtils.isEmpty(o)) {
            setTitle(o);
        }
        CharSequence o2 = u.mo1780o(C2591j.f18857j3);
        if (!TextUtils.isEmpty(o2)) {
            setSubtitle(o2);
        }
        this.f1252o = getContext();
        setPopupTheme(u.mo1778m(C2591j.f18852i3, 0));
        Drawable f = u.mo1771f(C2591j.f18847h3);
        if (f != null) {
            setNavigationIcon(f);
        }
        CharSequence o3 = u.mo1780o(C2591j.f18842g3);
        if (!TextUtils.isEmpty(o3)) {
            setNavigationContentDescription(o3);
        }
        Drawable f2 = u.mo1771f(C2591j.f18822c3);
        if (f2 != null) {
            setLogo(f2);
        }
        CharSequence o4 = u.mo1780o(C2591j.f18827d3);
        if (!TextUtils.isEmpty(o4)) {
            setLogoDescription(o4);
        }
        int i3 = C2591j.f18912u3;
        if (u.mo1783r(i3)) {
            setTitleTextColor(u.mo1768c(i3));
        }
        int i4 = C2591j.f18867l3;
        if (u.mo1783r(i4)) {
            setSubtitleTextColor(u.mo1768c(i4));
        }
        int i5 = C2591j.f18837f3;
        if (u.mo1783r(i5)) {
            mo1667x(u.mo1778m(i5, 0));
        }
        u.mo1784v();
    }

    /* renamed from: C */
    private int m1548C(View view, int i, int[] iArr, int i2) {
        C0393e eVar = (C0393e) view.getLayoutParams();
        int i3 = eVar.leftMargin - iArr[0];
        int max = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int q = m1564q(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, q, max + measuredWidth, view.getMeasuredHeight() + q);
        return max + measuredWidth + eVar.rightMargin;
    }

    /* renamed from: D */
    private int m1549D(View view, int i, int[] iArr, int i2) {
        C0393e eVar = (C0393e) view.getLayoutParams();
        int i3 = eVar.rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int q = m1564q(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, q, max, view.getMeasuredHeight() + q);
        return max - (measuredWidth + eVar.leftMargin);
    }

    /* renamed from: E */
    private int m1550E(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    /* renamed from: F */
    private void m1551F(View view, int i, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* renamed from: G */
    private void m1552G() {
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.f1232L.mo2866a(menu, getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f1233M = currentMenuItems2;
        this.f1232L.mo2869d(menu);
    }

    /* renamed from: H */
    private void m1553H() {
        removeCallbacks(this.f1242V);
        post(this.f1242V);
    }

    /* renamed from: N */
    private boolean m1554N() {
        if (!this.f1241U) {
            return false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m1555O(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: O */
    private boolean m1555O(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* renamed from: b */
    private void m1556b(List<View> list, int i) {
        boolean z = C0833y.m3362r(this) == 1;
        int childCount = getChildCount();
        int a = C0782e.m3108a(i, C0833y.m3362r(this));
        list.clear();
        if (z) {
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                C0393e eVar = (C0393e) childAt.getLayoutParams();
                if (eVar.f1270b == 0 && m1555O(childAt) && m1563p(eVar.f556a) == a) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = getChildAt(i3);
            C0393e eVar2 = (C0393e) childAt2.getLayoutParams();
            if (eVar2.f1270b == 0 && m1555O(childAt2) && m1563p(eVar2.f556a) == a) {
                list.add(childAt2);
            }
        }
    }

    /* renamed from: c */
    private void m1557c(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C0393e m = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (C0393e) layoutParams;
        m.f1270b = 1;
        if (!z || this.f1251n == null) {
            addView(view, m);
            return;
        }
        view.setLayoutParams(m);
        this.f1230J.add(view);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new C0307g(getContext());
    }

    /* renamed from: h */
    private void m1558h() {
        if (this.f1262y == null) {
            this.f1262y = new C0515s0();
        }
    }

    /* renamed from: i */
    private void m1559i() {
        if (this.f1247j == null) {
            this.f1247j = new C0512r(getContext());
        }
    }

    /* renamed from: j */
    private void m1560j() {
        m1561k();
        if (this.f1243f.mo1439L() == null) {
            C0330g gVar = (C0330g) this.f1243f.getMenu();
            if (this.f1238R == null) {
                this.f1238R = new C0392d();
            }
            this.f1243f.setExpandedActionViewsExclusive(true);
            gVar.mo1093c(this.f1238R, this.f1252o);
        }
    }

    /* renamed from: k */
    private void m1561k() {
        if (this.f1243f == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f1243f = actionMenuView;
            actionMenuView.setPopupTheme(this.f1253p);
            this.f1243f.setOnMenuItemClickListener(this.f1235O);
            this.f1243f.mo1440M(this.f1239S, this.f1240T);
            C0393e m = generateDefaultLayoutParams();
            m.f556a = 8388613 | (this.f1256s & 112);
            this.f1243f.setLayoutParams(m);
            m1557c(this.f1243f, false);
        }
    }

    /* renamed from: l */
    private void m1562l() {
        if (this.f1246i == null) {
            this.f1246i = new C0497p(getContext(), (AttributeSet) null, C2582a.toolbarNavigationButtonStyle);
            C0393e m = generateDefaultLayoutParams();
            m.f556a = 8388611 | (this.f1256s & 112);
            this.f1246i.setLayoutParams(m);
        }
    }

    /* renamed from: p */
    private int m1563p(int i) {
        int r = C0833y.m3362r(this);
        int a = C0782e.m3108a(i, r) & 7;
        return (a == 1 || a == 3 || a == 5) ? a : r == 1 ? 5 : 3;
    }

    /* renamed from: q */
    private int m1564q(View view, int i) {
        C0393e eVar = (C0393e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int r = m1565r(eVar.f556a);
        if (r == 48) {
            return getPaddingTop() - i2;
        }
        if (r == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - eVar.bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i3 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = eVar.topMargin;
        if (i3 < i4) {
            i3 = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - i3) - paddingTop;
            int i6 = eVar.bottomMargin;
            if (i5 < i6) {
                i3 = Math.max(0, i3 - (i6 - i5));
            }
        }
        return paddingTop + i3;
    }

    /* renamed from: r */
    private int m1565r(int i) {
        int i2 = i & 112;
        return (i2 == 16 || i2 == 48 || i2 == 80) ? i2 : this.f1222B & 112;
    }

    /* renamed from: s */
    private int m1566s(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return C0792h.m3141b(marginLayoutParams) + C0792h.m3140a(marginLayoutParams);
    }

    /* renamed from: t */
    private int m1567t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: u */
    private int m1568u(List<View> list, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            View view = list.get(i3);
            C0393e eVar = (C0393e) view.getLayoutParams();
            int i5 = eVar.leftMargin - i;
            int i6 = eVar.rightMargin - i2;
            int max = Math.max(0, i5);
            int max2 = Math.max(0, i6);
            int max3 = Math.max(0, -i5);
            int max4 = Math.max(0, -i6);
            i4 += max + view.getMeasuredWidth() + max2;
            i3++;
            i2 = max4;
            i = max3;
        }
        return i4;
    }

    /* renamed from: z */
    private boolean m1569z(View view) {
        return view.getParent() == this || this.f1230J.contains(view);
    }

    /* renamed from: A */
    public boolean mo1575A() {
        ActionMenuView actionMenuView = this.f1243f;
        return actionMenuView != null && actionMenuView.mo1436G();
    }

    /* renamed from: B */
    public boolean mo1576B() {
        ActionMenuView actionMenuView = this.f1243f;
        return actionMenuView != null && actionMenuView.mo1437H();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void mo1577I() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (!(((C0393e) childAt.getLayoutParams()).f1270b == 2 || childAt == this.f1243f)) {
                removeViewAt(childCount);
                this.f1230J.add(childAt);
            }
        }
    }

    /* renamed from: J */
    public void mo1578J(int i, int i2) {
        m1558h();
        this.f1262y.mo2306g(i, i2);
    }

    /* renamed from: K */
    public void mo1579K(C0330g gVar, C0421c cVar) {
        if (gVar != null || this.f1243f != null) {
            m1561k();
            C0330g L = this.f1243f.mo1439L();
            if (L != gVar) {
                if (L != null) {
                    L.mo1070O(this.f1237Q);
                    L.mo1070O(this.f1238R);
                }
                if (this.f1238R == null) {
                    this.f1238R = new C0392d();
                }
                cVar.mo1799G(true);
                if (gVar != null) {
                    gVar.mo1093c(cVar, this.f1252o);
                    gVar.mo1093c(this.f1238R, this.f1252o);
                } else {
                    cVar.mo998d(this.f1252o, (C0330g) null);
                    this.f1238R.mo998d(this.f1252o, (C0330g) null);
                    cVar.mo1000f(true);
                    this.f1238R.mo1000f(true);
                }
                this.f1243f.setPopupTheme(this.f1253p);
                this.f1243f.setPresenter(cVar);
                this.f1237Q = cVar;
            }
        }
    }

    /* renamed from: L */
    public void mo1580L(Context context, int i) {
        this.f1255r = i;
        TextView textView = this.f1245h;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    /* renamed from: M */
    public void mo1581M(Context context, int i) {
        this.f1254q = i;
        TextView textView = this.f1244g;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    /* renamed from: P */
    public boolean mo1582P() {
        ActionMenuView actionMenuView = this.f1243f;
        return actionMenuView != null && actionMenuView.mo1441N();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1583a() {
        for (int size = this.f1230J.size() - 1; size >= 0; size--) {
            addView(this.f1230J.get(size));
        }
        this.f1230J.clear();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C0393e);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f1243f;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo1585d() {
        /*
            r1 = this;
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x0012
            androidx.appcompat.widget.ActionMenuView r0 = r1.f1243f
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.mo1438I()
            if (r0 == 0) goto L_0x0012
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.mo1585d():boolean");
    }

    /* renamed from: e */
    public void mo1586e() {
        C0392d dVar = this.f1238R;
        C0334i iVar = dVar == null ? null : dVar.f1268g;
        if (iVar != null) {
            iVar.collapseActionView();
        }
    }

    /* renamed from: f */
    public void mo1587f() {
        ActionMenuView actionMenuView = this.f1243f;
        if (actionMenuView != null) {
            actionMenuView.mo1464z();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo1588g() {
        if (this.f1250m == null) {
            C0497p pVar = new C0497p(getContext(), (AttributeSet) null, C2582a.toolbarNavigationButtonStyle);
            this.f1250m = pVar;
            pVar.setImageDrawable(this.f1248k);
            this.f1250m.setContentDescription(this.f1249l);
            C0393e m = generateDefaultLayoutParams();
            m.f556a = 8388611 | (this.f1256s & 112);
            m.f1270b = 2;
            this.f1250m.setLayoutParams(m);
            this.f1250m.setOnClickListener(new C0391c());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f1250m;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f1250m;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C0515s0 s0Var = this.f1262y;
        if (s0Var != null) {
            return s0Var.mo2300a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f1221A;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C0515s0 s0Var = this.f1262y;
        if (s0Var != null) {
            return s0Var.mo2301b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        C0515s0 s0Var = this.f1262y;
        if (s0Var != null) {
            return s0Var.mo2302c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        C0515s0 s0Var = this.f1262y;
        if (s0Var != null) {
            return s0Var.mo2303d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f1263z;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r0.mo1439L();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getCurrentContentInsetEnd() {
        /*
            r3 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r3.f1243f
            r1 = 0
            if (r0 == 0) goto L_0x0013
            androidx.appcompat.view.menu.g r0 = r0.mo1439L()
            if (r0 == 0) goto L_0x0013
            boolean r0 = r0.hasVisibleItems()
            if (r0 == 0) goto L_0x0013
            r0 = 1
            goto L_0x0014
        L_0x0013:
            r0 = r1
        L_0x0014:
            if (r0 == 0) goto L_0x0025
            int r0 = r3.getContentInsetEnd()
            int r2 = r3.f1221A
            int r1 = java.lang.Math.max(r2, r1)
            int r0 = java.lang.Math.max(r0, r1)
            goto L_0x0029
        L_0x0025:
            int r0 = r3.getContentInsetEnd()
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.getCurrentContentInsetEnd():int");
    }

    public int getCurrentContentInsetLeft() {
        return C0833y.m3362r(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return C0833y.m3362r(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f1263z, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f1247j;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f1247j;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m1560j();
        return this.f1243f.getMenu();
    }

    /* access modifiers changed from: package-private */
    public View getNavButtonView() {
        return this.f1246i;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f1246i;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f1246i;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public C0421c getOuterActionMenuPresenter() {
        return this.f1237Q;
    }

    public Drawable getOverflowIcon() {
        m1560j();
        return this.f1243f.getOverflowIcon();
    }

    /* access modifiers changed from: package-private */
    public Context getPopupContext() {
        return this.f1252o;
    }

    public int getPopupTheme() {
        return this.f1253p;
    }

    public CharSequence getSubtitle() {
        return this.f1224D;
    }

    /* access modifiers changed from: package-private */
    public final TextView getSubtitleTextView() {
        return this.f1245h;
    }

    public CharSequence getTitle() {
        return this.f1223C;
    }

    public int getTitleMarginBottom() {
        return this.f1261x;
    }

    public int getTitleMarginEnd() {
        return this.f1259v;
    }

    public int getTitleMarginStart() {
        return this.f1258u;
    }

    public int getTitleMarginTop() {
        return this.f1260w;
    }

    /* access modifiers changed from: package-private */
    public final TextView getTitleTextView() {
        return this.f1244g;
    }

    public C0460h0 getWrapper() {
        if (this.f1236P == null) {
            this.f1236P = new C0437c1(this, true);
        }
        return this.f1236P;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public C0393e generateDefaultLayoutParams() {
        return new C0393e(-2, -2);
    }

    /* renamed from: n */
    public C0393e generateLayoutParams(AttributeSet attributeSet) {
        return new C0393e(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public C0393e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0393e ? new C0393e((C0393e) layoutParams) : layoutParams instanceof C0246a.C0247a ? new C0393e((C0246a.C0247a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0393e((ViewGroup.MarginLayoutParams) layoutParams) : new C0393e(layoutParams);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1242V);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1228H = false;
        }
        if (!this.f1228H) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1228H = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1228H = false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0295 A[LOOP:0: B:106:0x0293->B:107:0x0295, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02b7 A[LOOP:1: B:109:0x02b5->B:110:0x02b7, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02e1  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02f0 A[LOOP:2: B:117:0x02ee->B:118:0x02f0, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x021d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            r19 = this;
            r0 = r19
            int r1 = androidx.core.view.C0833y.m3362r(r19)
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L_0x000c
            r1 = r2
            goto L_0x000d
        L_0x000c:
            r1 = r3
        L_0x000d:
            int r4 = r19.getWidth()
            int r5 = r19.getHeight()
            int r6 = r19.getPaddingLeft()
            int r7 = r19.getPaddingRight()
            int r8 = r19.getPaddingTop()
            int r9 = r19.getPaddingBottom()
            int r10 = r4 - r7
            int[] r11 = r0.f1231K
            r11[r2] = r3
            r11[r3] = r3
            int r12 = androidx.core.view.C0833y.m3363s(r19)
            if (r12 < 0) goto L_0x003a
            int r13 = r24 - r22
            int r12 = java.lang.Math.min(r12, r13)
            goto L_0x003b
        L_0x003a:
            r12 = r3
        L_0x003b:
            android.widget.ImageButton r13 = r0.f1246i
            boolean r13 = r0.m1555O(r13)
            if (r13 == 0) goto L_0x0053
            android.widget.ImageButton r13 = r0.f1246i
            if (r1 == 0) goto L_0x004e
            int r13 = r0.m1549D(r13, r10, r11, r12)
            r14 = r13
            r13 = r6
            goto L_0x0055
        L_0x004e:
            int r13 = r0.m1548C(r13, r6, r11, r12)
            goto L_0x0054
        L_0x0053:
            r13 = r6
        L_0x0054:
            r14 = r10
        L_0x0055:
            android.widget.ImageButton r15 = r0.f1250m
            boolean r15 = r0.m1555O(r15)
            if (r15 == 0) goto L_0x006a
            android.widget.ImageButton r15 = r0.f1250m
            if (r1 == 0) goto L_0x0066
            int r14 = r0.m1549D(r15, r14, r11, r12)
            goto L_0x006a
        L_0x0066:
            int r13 = r0.m1548C(r15, r13, r11, r12)
        L_0x006a:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f1243f
            boolean r15 = r0.m1555O(r15)
            if (r15 == 0) goto L_0x007f
            androidx.appcompat.widget.ActionMenuView r15 = r0.f1243f
            if (r1 == 0) goto L_0x007b
            int r13 = r0.m1548C(r15, r13, r11, r12)
            goto L_0x007f
        L_0x007b:
            int r14 = r0.m1549D(r15, r14, r11, r12)
        L_0x007f:
            int r15 = r19.getCurrentContentInsetLeft()
            int r16 = r19.getCurrentContentInsetRight()
            int r2 = r15 - r13
            int r2 = java.lang.Math.max(r3, r2)
            r11[r3] = r2
            int r2 = r10 - r14
            int r2 = r16 - r2
            int r2 = java.lang.Math.max(r3, r2)
            r17 = 1
            r11[r17] = r2
            int r2 = java.lang.Math.max(r13, r15)
            int r10 = r10 - r16
            int r10 = java.lang.Math.min(r14, r10)
            android.view.View r13 = r0.f1251n
            boolean r13 = r0.m1555O(r13)
            if (r13 == 0) goto L_0x00ba
            android.view.View r13 = r0.f1251n
            if (r1 == 0) goto L_0x00b6
            int r10 = r0.m1549D(r13, r10, r11, r12)
            goto L_0x00ba
        L_0x00b6:
            int r2 = r0.m1548C(r13, r2, r11, r12)
        L_0x00ba:
            android.widget.ImageView r13 = r0.f1247j
            boolean r13 = r0.m1555O(r13)
            if (r13 == 0) goto L_0x00cf
            android.widget.ImageView r13 = r0.f1247j
            if (r1 == 0) goto L_0x00cb
            int r10 = r0.m1549D(r13, r10, r11, r12)
            goto L_0x00cf
        L_0x00cb:
            int r2 = r0.m1548C(r13, r2, r11, r12)
        L_0x00cf:
            android.widget.TextView r13 = r0.f1244g
            boolean r13 = r0.m1555O(r13)
            android.widget.TextView r14 = r0.f1245h
            boolean r14 = r0.m1555O(r14)
            if (r13 == 0) goto L_0x00f6
            android.widget.TextView r15 = r0.f1244g
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r15 = (androidx.appcompat.widget.Toolbar.C0393e) r15
            int r3 = r15.topMargin
            r23 = r7
            android.widget.TextView r7 = r0.f1244g
            int r7 = r7.getMeasuredHeight()
            int r3 = r3 + r7
            int r7 = r15.bottomMargin
            int r3 = r3 + r7
            r7 = 0
            int r3 = r3 + r7
            goto L_0x00f9
        L_0x00f6:
            r23 = r7
            r3 = 0
        L_0x00f9:
            if (r14 == 0) goto L_0x0113
            android.widget.TextView r7 = r0.f1245h
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r7 = (androidx.appcompat.widget.Toolbar.C0393e) r7
            int r15 = r7.topMargin
            r16 = r4
            android.widget.TextView r4 = r0.f1245h
            int r4 = r4.getMeasuredHeight()
            int r15 = r15 + r4
            int r4 = r7.bottomMargin
            int r15 = r15 + r4
            int r3 = r3 + r15
            goto L_0x0115
        L_0x0113:
            r16 = r4
        L_0x0115:
            if (r13 != 0) goto L_0x0121
            if (r14 == 0) goto L_0x011a
            goto L_0x0121
        L_0x011a:
            r18 = r6
            r22 = r12
        L_0x011e:
            r1 = 0
            goto L_0x0286
        L_0x0121:
            if (r13 == 0) goto L_0x0126
            android.widget.TextView r4 = r0.f1244g
            goto L_0x0128
        L_0x0126:
            android.widget.TextView r4 = r0.f1245h
        L_0x0128:
            if (r14 == 0) goto L_0x012d
            android.widget.TextView r7 = r0.f1245h
            goto L_0x012f
        L_0x012d:
            android.widget.TextView r7 = r0.f1244g
        L_0x012f:
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r4 = (androidx.appcompat.widget.Toolbar.C0393e) r4
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r7 = (androidx.appcompat.widget.Toolbar.C0393e) r7
            if (r13 == 0) goto L_0x0145
            android.widget.TextView r15 = r0.f1244g
            int r15 = r15.getMeasuredWidth()
            if (r15 > 0) goto L_0x014f
        L_0x0145:
            if (r14 == 0) goto L_0x0152
            android.widget.TextView r15 = r0.f1245h
            int r15 = r15.getMeasuredWidth()
            if (r15 <= 0) goto L_0x0152
        L_0x014f:
            r17 = 1
            goto L_0x0154
        L_0x0152:
            r17 = 0
        L_0x0154:
            int r15 = r0.f1222B
            r15 = r15 & 112(0x70, float:1.57E-43)
            r18 = r6
            r6 = 48
            if (r15 == r6) goto L_0x019c
            r6 = 80
            if (r15 == r6) goto L_0x018e
            int r6 = r5 - r8
            int r6 = r6 - r9
            int r6 = r6 - r3
            int r6 = r6 / 2
            int r15 = r4.topMargin
            r22 = r12
            int r12 = r0.f1260w
            r24 = r2
            int r2 = r15 + r12
            if (r6 >= r2) goto L_0x0177
            int r6 = r15 + r12
            goto L_0x018c
        L_0x0177:
            int r5 = r5 - r9
            int r5 = r5 - r3
            int r5 = r5 - r6
            int r5 = r5 - r8
            int r2 = r4.bottomMargin
            int r3 = r0.f1261x
            int r2 = r2 + r3
            if (r5 >= r2) goto L_0x018c
            int r2 = r7.bottomMargin
            int r2 = r2 + r3
            int r2 = r2 - r5
            int r6 = r6 - r2
            r2 = 0
            int r6 = java.lang.Math.max(r2, r6)
        L_0x018c:
            int r8 = r8 + r6
            goto L_0x01ab
        L_0x018e:
            r24 = r2
            r22 = r12
            int r5 = r5 - r9
            int r2 = r7.bottomMargin
            int r5 = r5 - r2
            int r2 = r0.f1261x
            int r5 = r5 - r2
            int r8 = r5 - r3
            goto L_0x01ab
        L_0x019c:
            r24 = r2
            r22 = r12
            int r2 = r19.getPaddingTop()
            int r3 = r4.topMargin
            int r2 = r2 + r3
            int r3 = r0.f1260w
            int r8 = r2 + r3
        L_0x01ab:
            if (r1 == 0) goto L_0x021d
            if (r17 == 0) goto L_0x01b2
            int r1 = r0.f1258u
            goto L_0x01b3
        L_0x01b2:
            r1 = 0
        L_0x01b3:
            r2 = 1
            r3 = r11[r2]
            int r1 = r1 - r3
            r3 = 0
            int r4 = java.lang.Math.max(r3, r1)
            int r10 = r10 - r4
            int r1 = -r1
            int r1 = java.lang.Math.max(r3, r1)
            r11[r2] = r1
            if (r13 == 0) goto L_0x01ea
            android.widget.TextView r1 = r0.f1244g
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.C0393e) r1
            android.widget.TextView r2 = r0.f1244g
            int r2 = r2.getMeasuredWidth()
            int r2 = r10 - r2
            android.widget.TextView r3 = r0.f1244g
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.f1244g
            r4.layout(r2, r8, r10, r3)
            int r4 = r0.f1259v
            int r2 = r2 - r4
            int r1 = r1.bottomMargin
            int r8 = r3 + r1
            goto L_0x01eb
        L_0x01ea:
            r2 = r10
        L_0x01eb:
            if (r14 == 0) goto L_0x0211
            android.widget.TextView r1 = r0.f1245h
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.C0393e) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            android.widget.TextView r1 = r0.f1245h
            int r1 = r1.getMeasuredWidth()
            int r1 = r10 - r1
            android.widget.TextView r3 = r0.f1245h
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.f1245h
            r4.layout(r1, r8, r10, r3)
            int r1 = r0.f1259v
            int r1 = r10 - r1
            goto L_0x0212
        L_0x0211:
            r1 = r10
        L_0x0212:
            if (r17 == 0) goto L_0x0219
            int r1 = java.lang.Math.min(r2, r1)
            r10 = r1
        L_0x0219:
            r2 = r24
            goto L_0x011e
        L_0x021d:
            if (r17 == 0) goto L_0x0223
            int r7 = r0.f1258u
            r1 = 0
            goto L_0x0225
        L_0x0223:
            r1 = 0
            r7 = 0
        L_0x0225:
            r2 = r11[r1]
            int r7 = r7 - r2
            int r2 = java.lang.Math.max(r1, r7)
            int r2 = r24 + r2
            int r3 = -r7
            int r3 = java.lang.Math.max(r1, r3)
            r11[r1] = r3
            if (r13 == 0) goto L_0x025a
            android.widget.TextView r3 = r0.f1244g
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r3 = (androidx.appcompat.widget.Toolbar.C0393e) r3
            android.widget.TextView r4 = r0.f1244g
            int r4 = r4.getMeasuredWidth()
            int r4 = r4 + r2
            android.widget.TextView r5 = r0.f1244g
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            android.widget.TextView r6 = r0.f1244g
            r6.layout(r2, r8, r4, r5)
            int r6 = r0.f1259v
            int r4 = r4 + r6
            int r3 = r3.bottomMargin
            int r8 = r5 + r3
            goto L_0x025b
        L_0x025a:
            r4 = r2
        L_0x025b:
            if (r14 == 0) goto L_0x027f
            android.widget.TextView r3 = r0.f1245h
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r3 = (androidx.appcompat.widget.Toolbar.C0393e) r3
            int r3 = r3.topMargin
            int r8 = r8 + r3
            android.widget.TextView r3 = r0.f1245h
            int r3 = r3.getMeasuredWidth()
            int r3 = r3 + r2
            android.widget.TextView r5 = r0.f1245h
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            android.widget.TextView r6 = r0.f1245h
            r6.layout(r2, r8, r3, r5)
            int r5 = r0.f1259v
            int r3 = r3 + r5
            goto L_0x0280
        L_0x027f:
            r3 = r2
        L_0x0280:
            if (r17 == 0) goto L_0x0286
            int r2 = java.lang.Math.max(r4, r3)
        L_0x0286:
            java.util.ArrayList<android.view.View> r3 = r0.f1229I
            r4 = 3
            r0.m1556b(r3, r4)
            java.util.ArrayList<android.view.View> r3 = r0.f1229I
            int r3 = r3.size()
            r7 = r1
        L_0x0293:
            if (r7 >= r3) goto L_0x02a6
            java.util.ArrayList<android.view.View> r4 = r0.f1229I
            java.lang.Object r4 = r4.get(r7)
            android.view.View r4 = (android.view.View) r4
            r12 = r22
            int r2 = r0.m1548C(r4, r2, r11, r12)
            int r7 = r7 + 1
            goto L_0x0293
        L_0x02a6:
            r12 = r22
            java.util.ArrayList<android.view.View> r3 = r0.f1229I
            r4 = 5
            r0.m1556b(r3, r4)
            java.util.ArrayList<android.view.View> r3 = r0.f1229I
            int r3 = r3.size()
            r7 = r1
        L_0x02b5:
            if (r7 >= r3) goto L_0x02c6
            java.util.ArrayList<android.view.View> r4 = r0.f1229I
            java.lang.Object r4 = r4.get(r7)
            android.view.View r4 = (android.view.View) r4
            int r10 = r0.m1549D(r4, r10, r11, r12)
            int r7 = r7 + 1
            goto L_0x02b5
        L_0x02c6:
            java.util.ArrayList<android.view.View> r3 = r0.f1229I
            r4 = 1
            r0.m1556b(r3, r4)
            java.util.ArrayList<android.view.View> r3 = r0.f1229I
            int r3 = r0.m1568u(r3, r11)
            int r4 = r16 - r18
            int r4 = r4 - r23
            int r4 = r4 / 2
            int r6 = r18 + r4
            int r4 = r3 / 2
            int r6 = r6 - r4
            int r3 = r3 + r6
            if (r6 >= r2) goto L_0x02e1
            goto L_0x02e8
        L_0x02e1:
            if (r3 <= r10) goto L_0x02e7
            int r3 = r3 - r10
            int r2 = r6 - r3
            goto L_0x02e8
        L_0x02e7:
            r2 = r6
        L_0x02e8:
            java.util.ArrayList<android.view.View> r3 = r0.f1229I
            int r3 = r3.size()
        L_0x02ee:
            if (r1 >= r3) goto L_0x02ff
            java.util.ArrayList<android.view.View> r4 = r0.f1229I
            java.lang.Object r4 = r4.get(r1)
            android.view.View r4 = (android.view.View) r4
            int r2 = r0.m1548C(r4, r2, r11, r12)
            int r1 = r1 + 1
            goto L_0x02ee
        L_0x02ff:
            java.util.ArrayList<android.view.View> r1 = r0.f1229I
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr = this.f1231K;
        char b = C0471j1.m1938b(this);
        int i10 = 0;
        char c = b ^ 1;
        if (m1555O(this.f1246i)) {
            m1551F(this.f1246i, i, 0, i2, 0, this.f1257t);
            i5 = this.f1246i.getMeasuredWidth() + m1566s(this.f1246i);
            i4 = Math.max(0, this.f1246i.getMeasuredHeight() + m1567t(this.f1246i));
            i3 = View.combineMeasuredStates(0, this.f1246i.getMeasuredState());
        } else {
            i5 = 0;
            i4 = 0;
            i3 = 0;
        }
        if (m1555O(this.f1250m)) {
            m1551F(this.f1250m, i, 0, i2, 0, this.f1257t);
            i5 = this.f1250m.getMeasuredWidth() + m1566s(this.f1250m);
            i4 = Math.max(i4, this.f1250m.getMeasuredHeight() + m1567t(this.f1250m));
            i3 = View.combineMeasuredStates(i3, this.f1250m.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = 0 + Math.max(currentContentInsetStart, i5);
        iArr[b] = Math.max(0, currentContentInsetStart - i5);
        if (m1555O(this.f1243f)) {
            m1551F(this.f1243f, i, max, i2, 0, this.f1257t);
            i6 = this.f1243f.getMeasuredWidth() + m1566s(this.f1243f);
            i4 = Math.max(i4, this.f1243f.getMeasuredHeight() + m1567t(this.f1243f));
            i3 = View.combineMeasuredStates(i3, this.f1243f.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i6);
        iArr[c] = Math.max(0, currentContentInsetEnd - i6);
        if (m1555O(this.f1251n)) {
            max2 += m1550E(this.f1251n, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f1251n.getMeasuredHeight() + m1567t(this.f1251n));
            i3 = View.combineMeasuredStates(i3, this.f1251n.getMeasuredState());
        }
        if (m1555O(this.f1247j)) {
            max2 += m1550E(this.f1247j, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f1247j.getMeasuredHeight() + m1567t(this.f1247j));
            i3 = View.combineMeasuredStates(i3, this.f1247j.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (((C0393e) childAt.getLayoutParams()).f1270b == 0 && m1555O(childAt)) {
                max2 += m1550E(childAt, i, max2, i2, 0, iArr);
                i4 = Math.max(i4, childAt.getMeasuredHeight() + m1567t(childAt));
                i3 = View.combineMeasuredStates(i3, childAt.getMeasuredState());
            }
        }
        int i12 = this.f1260w + this.f1261x;
        int i13 = this.f1258u + this.f1259v;
        if (m1555O(this.f1244g)) {
            m1550E(this.f1244g, i, max2 + i13, i2, i12, iArr);
            int measuredWidth = this.f1244g.getMeasuredWidth() + m1566s(this.f1244g);
            i7 = this.f1244g.getMeasuredHeight() + m1567t(this.f1244g);
            i9 = View.combineMeasuredStates(i3, this.f1244g.getMeasuredState());
            i8 = measuredWidth;
        } else {
            i7 = 0;
            i9 = i3;
            i8 = 0;
        }
        if (m1555O(this.f1245h)) {
            i8 = Math.max(i8, m1550E(this.f1245h, i, max2 + i13, i2, i7 + i12, iArr));
            i7 += this.f1245h.getMeasuredHeight() + m1567t(this.f1245h);
            i9 = View.combineMeasuredStates(i9, this.f1245h.getMeasuredState());
        } else {
            int i14 = i9;
        }
        int max3 = Math.max(i4, i7);
        int paddingLeft = max2 + i8 + getPaddingLeft() + getPaddingRight();
        int paddingTop = max3 + getPaddingTop() + getPaddingBottom();
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, -16777216 & i9);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, i9 << 16);
        if (!m1554N()) {
            i10 = resolveSizeAndState2;
        }
        setMeasuredDimension(resolveSizeAndState, i10);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof C0395g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0395g gVar = (C0395g) parcelable;
        super.onRestoreInstanceState(gVar.mo15581b());
        ActionMenuView actionMenuView = this.f1243f;
        C0330g L = actionMenuView != null ? actionMenuView.mo1439L() : null;
        int i = gVar.f1271h;
        if (!(i == 0 || this.f1238R == null || L == null || (findItem = L.findItem(i)) == null)) {
            findItem.expandActionView();
        }
        if (gVar.f1272i) {
            m1553H();
        }
    }

    public void onRtlPropertiesChanged(int i) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i);
        }
        m1558h();
        C0515s0 s0Var = this.f1262y;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        s0Var.mo2305f(z);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C0334i iVar;
        C0395g gVar = new C0395g(super.onSaveInstanceState());
        C0392d dVar = this.f1238R;
        if (!(dVar == null || (iVar = dVar.f1268g) == null)) {
            gVar.f1271h = iVar.getItemId();
        }
        gVar.f1272i = mo1576B();
        return gVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1227G = false;
        }
        if (!this.f1227G) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1227G = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1227G = false;
        }
        return true;
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            mo1588g();
        }
        ImageButton imageButton = this.f1250m;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(C2620a.m21330b(getContext(), i));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            mo1588g();
            this.f1250m.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.f1250m;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.f1248k);
        }
    }

    public void setCollapsible(boolean z) {
        this.f1241U = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f1221A) {
            this.f1221A = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f1263z) {
            this.f1263z = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(C2620a.m21330b(getContext(), i));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            m1559i();
            if (!m1569z(this.f1247j)) {
                m1557c(this.f1247j, true);
            }
        } else {
            ImageView imageView = this.f1247j;
            if (imageView != null && m1569z(imageView)) {
                removeView(this.f1247j);
                this.f1230J.remove(this.f1247j);
            }
        }
        ImageView imageView2 = this.f1247j;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m1559i();
        }
        ImageView imageView = this.f1247j;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m1562l();
        }
        ImageButton imageButton = this.f1246i;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            C0442d1.m1804a(this.f1246i, charSequence);
        }
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(C2620a.m21330b(getContext(), i));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m1562l();
            if (!m1569z(this.f1246i)) {
                m1557c(this.f1246i, true);
            }
        } else {
            ImageButton imageButton = this.f1246i;
            if (imageButton != null && m1569z(imageButton)) {
                removeView(this.f1246i);
                this.f1230J.remove(this.f1246i);
            }
        }
        ImageButton imageButton2 = this.f1246i;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m1562l();
        this.f1246i.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(C0394f fVar) {
        this.f1234N = fVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        m1560j();
        this.f1243f.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f1253p != i) {
            this.f1253p = i;
            if (i == 0) {
                this.f1252o = getContext();
            } else {
                this.f1252o = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1245h == null) {
                Context context = getContext();
                C0441d0 d0Var = new C0441d0(context);
                this.f1245h = d0Var;
                d0Var.setSingleLine();
                this.f1245h.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f1255r;
                if (i != 0) {
                    this.f1245h.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f1226F;
                if (colorStateList != null) {
                    this.f1245h.setTextColor(colorStateList);
                }
            }
            if (!m1569z(this.f1245h)) {
                m1557c(this.f1245h, true);
            }
        } else {
            TextView textView = this.f1245h;
            if (textView != null && m1569z(textView)) {
                removeView(this.f1245h);
                this.f1230J.remove(this.f1245h);
            }
        }
        TextView textView2 = this.f1245h;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1224D = charSequence;
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f1226F = colorStateList;
        TextView textView = this.f1245h;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1244g == null) {
                Context context = getContext();
                C0441d0 d0Var = new C0441d0(context);
                this.f1244g = d0Var;
                d0Var.setSingleLine();
                this.f1244g.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f1254q;
                if (i != 0) {
                    this.f1244g.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f1225E;
                if (colorStateList != null) {
                    this.f1244g.setTextColor(colorStateList);
                }
            }
            if (!m1569z(this.f1244g)) {
                m1557c(this.f1244g, true);
            }
        } else {
            TextView textView = this.f1244g;
            if (textView != null && m1569z(textView)) {
                removeView(this.f1244g);
                this.f1230J.remove(this.f1244g);
            }
        }
        TextView textView2 = this.f1244g;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1223C = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.f1261x = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f1259v = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f1258u = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f1260w = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f1225E = colorStateList;
        TextView textView = this.f1244g;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* renamed from: v */
    public boolean mo1665v() {
        C0392d dVar = this.f1238R;
        return (dVar == null || dVar.f1268g == null) ? false : true;
    }

    /* renamed from: w */
    public boolean mo1666w() {
        ActionMenuView actionMenuView = this.f1243f;
        return actionMenuView != null && actionMenuView.mo1435F();
    }

    /* renamed from: x */
    public void mo1667x(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    /* renamed from: y */
    public void mo1668y() {
        Iterator<MenuItem> it = this.f1233M.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        m1552G();
    }
}
