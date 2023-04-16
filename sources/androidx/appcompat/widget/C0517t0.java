package androidx.appcompat.widget;

import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.C0246a;
import androidx.appcompat.view.C0298a;
import androidx.appcompat.widget.C0482m0;
import p038f.C2582a;

/* renamed from: androidx.appcompat.widget.t0 */
public class C0517t0 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: o */
    private static final Interpolator f1628o = new DecelerateInterpolator();

    /* renamed from: f */
    Runnable f1629f;

    /* renamed from: g */
    private C0520c f1630g;

    /* renamed from: h */
    C0482m0 f1631h;

    /* renamed from: i */
    private Spinner f1632i;

    /* renamed from: j */
    private boolean f1633j;

    /* renamed from: k */
    int f1634k;

    /* renamed from: l */
    int f1635l;

    /* renamed from: m */
    private int f1636m;

    /* renamed from: n */
    private int f1637n;

    /* renamed from: androidx.appcompat.widget.t0$a */
    class C0518a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ View f1638f;

        C0518a(View view) {
            this.f1638f = view;
        }

        public void run() {
            C0517t0.this.smoothScrollTo(this.f1638f.getLeft() - ((C0517t0.this.getWidth() - this.f1638f.getWidth()) / 2), 0);
            C0517t0.this.f1629f = null;
        }
    }

    /* renamed from: androidx.appcompat.widget.t0$b */
    private class C0519b extends BaseAdapter {
        C0519b() {
        }

        public int getCount() {
            return C0517t0.this.f1631h.getChildCount();
        }

        public Object getItem(int i) {
            return ((C0521d) C0517t0.this.f1631h.getChildAt(i)).mo2328b();
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return C0517t0.this.mo2311c((C0246a.C0249c) getItem(i), true);
            }
            ((C0521d) view).mo2327a((C0246a.C0249c) getItem(i));
            return view;
        }
    }

    /* renamed from: androidx.appcompat.widget.t0$c */
    private class C0520c implements View.OnClickListener {
        C0520c() {
        }

        public void onClick(View view) {
            ((C0521d) view).mo2328b().mo615e();
            int childCount = C0517t0.this.f1631h.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = C0517t0.this.f1631h.getChildAt(i);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.t0$d */
    private class C0521d extends LinearLayout {

        /* renamed from: f */
        private final int[] f1642f;

        /* renamed from: g */
        private C0246a.C0249c f1643g;

        /* renamed from: h */
        private TextView f1644h;

        /* renamed from: i */
        private ImageView f1645i;

        /* renamed from: j */
        private View f1646j;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C0521d(android.content.Context r6, androidx.appcompat.app.C0246a.C0249c r7, boolean r8) {
            /*
                r4 = this;
                androidx.appcompat.widget.C0517t0.this = r5
                int r5 = p038f.C2582a.actionBarTabStyle
                r0 = 0
                r4.<init>(r6, r0, r5)
                r1 = 1
                int[] r1 = new int[r1]
                r2 = 16842964(0x10100d4, float:2.3694152E-38)
                r3 = 0
                r1[r3] = r2
                r4.f1642f = r1
                r4.f1643g = r7
                androidx.appcompat.widget.a1 r5 = androidx.appcompat.widget.C0415a1.m1660u(r6, r0, r1, r5, r3)
                boolean r6 = r5.mo1783r(r3)
                if (r6 == 0) goto L_0x0026
                android.graphics.drawable.Drawable r6 = r5.mo1771f(r3)
                r4.setBackgroundDrawable(r6)
            L_0x0026:
                r5.mo1784v()
                if (r8 == 0) goto L_0x0031
                r5 = 8388627(0x800013, float:1.175497E-38)
                r4.setGravity(r5)
            L_0x0031:
                r4.mo2329c()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0517t0.C0521d.<init>(androidx.appcompat.widget.t0, android.content.Context, androidx.appcompat.app.a$c, boolean):void");
        }

        /* renamed from: a */
        public void mo2327a(C0246a.C0249c cVar) {
            this.f1643g = cVar;
            mo2329c();
        }

        /* renamed from: b */
        public C0246a.C0249c mo2328b() {
            return this.f1643g;
        }

        /* renamed from: c */
        public void mo2329c() {
            C0246a.C0249c cVar = this.f1643g;
            View b = cVar.mo612b();
            CharSequence charSequence = null;
            if (b != null) {
                ViewParent parent = b.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(b);
                    }
                    addView(b);
                }
                this.f1646j = b;
                TextView textView = this.f1644h;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f1645i;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f1645i.setImageDrawable((Drawable) null);
                    return;
                }
                return;
            }
            View view = this.f1646j;
            if (view != null) {
                removeView(view);
                this.f1646j = null;
            }
            Drawable c = cVar.mo613c();
            CharSequence d = cVar.mo614d();
            if (c != null) {
                if (this.f1645i == null) {
                    C0512r rVar = new C0512r(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    rVar.setLayoutParams(layoutParams);
                    addView(rVar, 0);
                    this.f1645i = rVar;
                }
                this.f1645i.setImageDrawable(c);
                this.f1645i.setVisibility(0);
            } else {
                ImageView imageView2 = this.f1645i;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f1645i.setImageDrawable((Drawable) null);
                }
            }
            boolean z = !TextUtils.isEmpty(d);
            if (z) {
                if (this.f1644h == null) {
                    C0441d0 d0Var = new C0441d0(getContext(), (AttributeSet) null, C2582a.actionBarTabTextStyle);
                    d0Var.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    d0Var.setLayoutParams(layoutParams2);
                    addView(d0Var);
                    this.f1644h = d0Var;
                }
                this.f1644h.setText(d);
                this.f1644h.setVisibility(0);
            } else {
                TextView textView2 = this.f1644h;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f1644h.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f1645i;
            if (imageView3 != null) {
                imageView3.setContentDescription(cVar.mo611a());
            }
            if (!z) {
                charSequence = cVar.mo611a();
            }
            C0442d1.m1804a(this, charSequence);
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public void onMeasure(int i, int i2) {
            int i3;
            super.onMeasure(i, i2);
            if (C0517t0.this.f1634k > 0 && getMeasuredWidth() > (i3 = C0517t0.this.f1634k)) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
            }
        }

        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    /* renamed from: b */
    private Spinner m2118b() {
        C0400a0 a0Var = new C0400a0(getContext(), (AttributeSet) null, C2582a.actionDropDownStyle);
        a0Var.setLayoutParams(new C0482m0.C0483a(-2, -1));
        a0Var.setOnItemSelectedListener(this);
        return a0Var;
    }

    /* renamed from: d */
    private boolean m2119d() {
        Spinner spinner = this.f1632i;
        return spinner != null && spinner.getParent() == this;
    }

    /* renamed from: e */
    private void m2120e() {
        if (!m2119d()) {
            if (this.f1632i == null) {
                this.f1632i = m2118b();
            }
            removeView(this.f1631h);
            addView(this.f1632i, new ViewGroup.LayoutParams(-2, -1));
            if (this.f1632i.getAdapter() == null) {
                this.f1632i.setAdapter(new C0519b());
            }
            Runnable runnable = this.f1629f;
            if (runnable != null) {
                removeCallbacks(runnable);
                this.f1629f = null;
            }
            this.f1632i.setSelection(this.f1637n);
        }
    }

    /* renamed from: f */
    private boolean m2121f() {
        if (!m2119d()) {
            return false;
        }
        removeView(this.f1632i);
        addView(this.f1631h, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f1632i.getSelectedItemPosition());
        return false;
    }

    /* renamed from: a */
    public void mo2310a(int i) {
        View childAt = this.f1631h.getChildAt(i);
        Runnable runnable = this.f1629f;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        C0518a aVar = new C0518a(childAt);
        this.f1629f = aVar;
        post(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C0521d mo2311c(C0246a.C0249c cVar, boolean z) {
        C0521d dVar = new C0521d(getContext(), cVar, z);
        if (z) {
            dVar.setBackgroundDrawable((Drawable) null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.f1636m));
        } else {
            dVar.setFocusable(true);
            if (this.f1630g == null) {
                this.f1630g = new C0520c();
            }
            dVar.setOnClickListener(this.f1630g);
        }
        return dVar;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f1629f;
        if (runnable != null) {
            post(runnable);
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0298a b = C0298a.m1057b(getContext());
        setContentHeight(b.mo830f());
        this.f1635l = b.mo829e();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f1629f;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((C0521d) view).mo2328b().mo615e();
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int mode = View.MeasureSpec.getMode(i);
        boolean z = true;
        boolean z2 = mode == 1073741824;
        setFillViewport(z2);
        int childCount = this.f1631h.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            i3 = -1;
        } else {
            if (childCount > 2) {
                this.f1634k = (int) (((float) View.MeasureSpec.getSize(i)) * 0.4f);
            } else {
                this.f1634k = View.MeasureSpec.getSize(i) / 2;
            }
            i3 = Math.min(this.f1634k, this.f1635l);
        }
        this.f1634k = i3;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f1636m, 1073741824);
        if (z2 || !this.f1633j) {
            z = false;
        }
        if (z) {
            this.f1631h.measure(0, makeMeasureSpec);
            if (this.f1631h.getMeasuredWidth() > View.MeasureSpec.getSize(i)) {
                m2120e();
                int measuredWidth = getMeasuredWidth();
                super.onMeasure(i, makeMeasureSpec);
                int measuredWidth2 = getMeasuredWidth();
                if (z2 && measuredWidth != measuredWidth2) {
                    setTabSelected(this.f1637n);
                    return;
                }
            }
        }
        m2121f();
        int measuredWidth3 = getMeasuredWidth();
        super.onMeasure(i, makeMeasureSpec);
        int measuredWidth22 = getMeasuredWidth();
        if (z2) {
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.f1633j = z;
    }

    public void setContentHeight(int i) {
        this.f1636m = i;
        requestLayout();
    }

    public void setTabSelected(int i) {
        this.f1637n = i;
        int childCount = this.f1631h.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.f1631h.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                mo2310a(i);
            }
            i2++;
        }
        Spinner spinner = this.f1632i;
        if (spinner != null && i >= 0) {
            spinner.setSelection(i);
        }
    }
}
