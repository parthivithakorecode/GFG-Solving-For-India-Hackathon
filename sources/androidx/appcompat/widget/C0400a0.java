package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.C0250b;
import androidx.appcompat.view.menu.C0351p;
import androidx.core.view.C0831w;
import androidx.core.view.C0833y;
import p038f.C2582a;
import p045g.C2620a;

/* renamed from: androidx.appcompat.widget.a0 */
public class C0400a0 extends Spinner implements C0831w {
    @SuppressLint({"ResourceType"})

    /* renamed from: n */
    private static final int[] f1289n = {16843505};

    /* renamed from: f */
    private final C0444e f1290f;

    /* renamed from: g */
    private final Context f1291g;

    /* renamed from: h */
    private C0478l0 f1292h;

    /* renamed from: i */
    private SpinnerAdapter f1293i;

    /* renamed from: j */
    private final boolean f1294j;

    /* renamed from: k */
    private C0414j f1295k;

    /* renamed from: l */
    int f1296l;

    /* renamed from: m */
    final Rect f1297m;

    /* renamed from: androidx.appcompat.widget.a0$a */
    class C0401a extends C0478l0 {

        /* renamed from: o */
        final /* synthetic */ C0408h f1298o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0401a(View view, C0408h hVar) {
            super(view);
            this.f1298o = hVar;
        }

        /* renamed from: b */
        public C0351p mo918b() {
            return this.f1298o;
        }

        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: c */
        public boolean mo919c() {
            if (C0400a0.this.getInternalPopup().mo1729c()) {
                return true;
            }
            C0400a0.this.mo1698b();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.a0$b */
    class C0402b implements ViewTreeObserver.OnGlobalLayoutListener {
        C0402b() {
        }

        public void onGlobalLayout() {
            if (!C0400a0.this.getInternalPopup().mo1729c()) {
                C0400a0.this.mo1698b();
            }
            ViewTreeObserver viewTreeObserver = C0400a0.this.getViewTreeObserver();
            if (viewTreeObserver == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 16) {
                C0403c.m1617a(viewTreeObserver, this);
            } else {
                viewTreeObserver.removeGlobalOnLayoutListener(this);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.a0$c */
    private static final class C0403c {
        /* renamed from: a */
        static void m1617a(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    /* renamed from: androidx.appcompat.widget.a0$d */
    private static final class C0404d {
        /* renamed from: a */
        static int m1618a(View view) {
            return view.getTextAlignment();
        }

        /* renamed from: b */
        static int m1619b(View view) {
            return view.getTextDirection();
        }

        /* renamed from: c */
        static void m1620c(View view, int i) {
            view.setTextAlignment(i);
        }

        /* renamed from: d */
        static void m1621d(View view, int i) {
            view.setTextDirection(i);
        }
    }

    /* renamed from: androidx.appcompat.widget.a0$e */
    private static final class C0405e {
        /* renamed from: a */
        static void m1622a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                themedSpinnerAdapter.setDropDownViewTheme(theme);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.a0$f */
    class C0406f implements C0414j, DialogInterface.OnClickListener {

        /* renamed from: f */
        C0250b f1301f;

        /* renamed from: g */
        private ListAdapter f1302g;

        /* renamed from: h */
        private CharSequence f1303h;

        C0406f() {
        }

        /* renamed from: b */
        public int mo1728b() {
            return 0;
        }

        /* renamed from: c */
        public boolean mo1729c() {
            C0250b bVar = this.f1301f;
            if (bVar != null) {
                return bVar.isShowing();
            }
            return false;
        }

        public void dismiss() {
            C0250b bVar = this.f1301f;
            if (bVar != null) {
                bVar.dismiss();
                this.f1301f = null;
            }
        }

        /* renamed from: f */
        public Drawable mo1731f() {
            return null;
        }

        /* renamed from: h */
        public void mo1732h(CharSequence charSequence) {
            this.f1303h = charSequence;
        }

        /* renamed from: i */
        public void mo1733i(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        /* renamed from: j */
        public void mo1734j(int i) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        /* renamed from: k */
        public void mo1735k(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        /* renamed from: l */
        public void mo1736l(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        /* renamed from: m */
        public void mo1737m(int i, int i2) {
            if (this.f1302g != null) {
                C0250b.C0251a aVar = new C0250b.C0251a(C0400a0.this.getPopupContext());
                CharSequence charSequence = this.f1303h;
                if (charSequence != null) {
                    aVar.mo627h(charSequence);
                }
                C0250b a = aVar.mo626g(this.f1302g, C0400a0.this.getSelectedItemPosition(), this).mo620a();
                this.f1301f = a;
                ListView n = a.mo616n();
                if (Build.VERSION.SDK_INT >= 17) {
                    C0404d.m1621d(n, i);
                    C0404d.m1620c(n, i2);
                }
                this.f1301f.show();
            }
        }

        /* renamed from: n */
        public int mo1738n() {
            return 0;
        }

        /* renamed from: o */
        public CharSequence mo1739o() {
            return this.f1303h;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C0400a0.this.setSelection(i);
            if (C0400a0.this.getOnItemClickListener() != null) {
                C0400a0.this.performItemClick((View) null, i, this.f1302g.getItemId(i));
            }
            dismiss();
        }

        /* renamed from: p */
        public void mo1741p(ListAdapter listAdapter) {
            this.f1302g = listAdapter;
        }
    }

    /* renamed from: androidx.appcompat.widget.a0$g */
    private static class C0407g implements ListAdapter, SpinnerAdapter {

        /* renamed from: f */
        private SpinnerAdapter f1305f;

        /* renamed from: g */
        private ListAdapter f1306g;

        public C0407g(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f1305f = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f1306g = (ListAdapter) spinnerAdapter;
            }
            if (theme == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                C0405e.m1622a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            } else if (spinnerAdapter instanceof C0529w0) {
                C0529w0 w0Var = (C0529w0) spinnerAdapter;
                if (w0Var.getDropDownViewTheme() == null) {
                    w0Var.setDropDownViewTheme(theme);
                }
            }
        }

        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f1306g;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f1305f;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f1305f;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f1305f;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f1305f;
            if (spinnerAdapter == null) {
                return -1;
            }
            return spinnerAdapter.getItemId(i);
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        public int getViewTypeCount() {
            return 1;
        }

        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f1305f;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        public boolean isEmpty() {
            return getCount() == 0;
        }

        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f1306g;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1305f;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1305f;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.a0$h */
    class C0408h extends C0485n0 implements C0414j {

        /* renamed from: O */
        private CharSequence f1307O;

        /* renamed from: P */
        ListAdapter f1308P;

        /* renamed from: Q */
        private final Rect f1309Q = new Rect();

        /* renamed from: R */
        private int f1310R;

        /* renamed from: androidx.appcompat.widget.a0$h$a */
        class C0409a implements AdapterView.OnItemClickListener {

            /* renamed from: f */
            final /* synthetic */ C0400a0 f1312f;

            C0409a(C0400a0 a0Var) {
                this.f1312f = a0Var;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                C0400a0.this.setSelection(i);
                if (C0400a0.this.getOnItemClickListener() != null) {
                    C0408h hVar = C0408h.this;
                    C0400a0.this.performItemClick(view, i, hVar.f1308P.getItemId(i));
                }
                C0408h.this.dismiss();
            }
        }

        /* renamed from: androidx.appcompat.widget.a0$h$b */
        class C0410b implements ViewTreeObserver.OnGlobalLayoutListener {
            C0410b() {
            }

            public void onGlobalLayout() {
                C0408h hVar = C0408h.this;
                if (!hVar.mo1757Q(C0400a0.this)) {
                    C0408h.this.dismiss();
                    return;
                }
                C0408h.this.mo1755O();
                C0408h.super.mo1016a();
            }
        }

        /* renamed from: androidx.appcompat.widget.a0$h$c */
        class C0411c implements PopupWindow.OnDismissListener {

            /* renamed from: f */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f1315f;

            C0411c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f1315f = onGlobalLayoutListener;
            }

            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = C0400a0.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f1315f);
                }
            }
        }

        public C0408h(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            mo2226z(C0400a0.this);
            mo2207F(true);
            mo2211K(0);
            mo2209H(new C0409a(C0400a0.this));
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x008d  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x009a  */
        /* renamed from: O */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo1755O() {
            /*
                r8 = this;
                android.graphics.drawable.Drawable r0 = r8.mo2215f()
                r1 = 0
                if (r0 == 0) goto L_0x0026
                androidx.appcompat.widget.a0 r1 = androidx.appcompat.widget.C0400a0.this
                android.graphics.Rect r1 = r1.f1297m
                r0.getPadding(r1)
                androidx.appcompat.widget.a0 r0 = androidx.appcompat.widget.C0400a0.this
                boolean r0 = androidx.appcompat.widget.C0471j1.m1938b(r0)
                if (r0 == 0) goto L_0x001d
                androidx.appcompat.widget.a0 r0 = androidx.appcompat.widget.C0400a0.this
                android.graphics.Rect r0 = r0.f1297m
                int r0 = r0.right
                goto L_0x0024
            L_0x001d:
                androidx.appcompat.widget.a0 r0 = androidx.appcompat.widget.C0400a0.this
                android.graphics.Rect r0 = r0.f1297m
                int r0 = r0.left
                int r0 = -r0
            L_0x0024:
                r1 = r0
                goto L_0x002e
            L_0x0026:
                androidx.appcompat.widget.a0 r0 = androidx.appcompat.widget.C0400a0.this
                android.graphics.Rect r0 = r0.f1297m
                r0.right = r1
                r0.left = r1
            L_0x002e:
                androidx.appcompat.widget.a0 r0 = androidx.appcompat.widget.C0400a0.this
                int r0 = r0.getPaddingLeft()
                androidx.appcompat.widget.a0 r2 = androidx.appcompat.widget.C0400a0.this
                int r2 = r2.getPaddingRight()
                androidx.appcompat.widget.a0 r3 = androidx.appcompat.widget.C0400a0.this
                int r3 = r3.getWidth()
                androidx.appcompat.widget.a0 r4 = androidx.appcompat.widget.C0400a0.this
                int r5 = r4.f1296l
                r6 = -2
                if (r5 != r6) goto L_0x0078
                android.widget.ListAdapter r5 = r8.f1308P
                android.widget.SpinnerAdapter r5 = (android.widget.SpinnerAdapter) r5
                android.graphics.drawable.Drawable r6 = r8.mo2215f()
                int r4 = r4.mo1697a(r5, r6)
                androidx.appcompat.widget.a0 r5 = androidx.appcompat.widget.C0400a0.this
                android.content.Context r5 = r5.getContext()
                android.content.res.Resources r5 = r5.getResources()
                android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
                int r5 = r5.widthPixels
                androidx.appcompat.widget.a0 r6 = androidx.appcompat.widget.C0400a0.this
                android.graphics.Rect r6 = r6.f1297m
                int r7 = r6.left
                int r5 = r5 - r7
                int r6 = r6.right
                int r5 = r5 - r6
                if (r4 <= r5) goto L_0x0070
                r4 = r5
            L_0x0070:
                int r5 = r3 - r0
                int r5 = r5 - r2
                int r4 = java.lang.Math.max(r4, r5)
                goto L_0x007e
            L_0x0078:
                r4 = -1
                if (r5 != r4) goto L_0x0082
                int r4 = r3 - r0
                int r4 = r4 - r2
            L_0x007e:
                r8.mo2203B(r4)
                goto L_0x0085
            L_0x0082:
                r8.mo2203B(r5)
            L_0x0085:
                androidx.appcompat.widget.a0 r4 = androidx.appcompat.widget.C0400a0.this
                boolean r4 = androidx.appcompat.widget.C0471j1.m1938b(r4)
                if (r4 == 0) goto L_0x009a
                int r3 = r3 - r2
                int r0 = r8.mo2223v()
                int r3 = r3 - r0
                int r0 = r8.mo1756P()
                int r3 = r3 - r0
                int r1 = r1 + r3
                goto L_0x00a0
            L_0x009a:
                int r2 = r8.mo1756P()
                int r0 = r0 + r2
                int r1 = r1 + r0
            L_0x00a0:
                r8.mo2218l(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0400a0.C0408h.mo1755O():void");
        }

        /* renamed from: P */
        public int mo1756P() {
            return this.f1310R;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: Q */
        public boolean mo1757Q(View view) {
            return C0833y.m3316A(view) && view.getGlobalVisibleRect(this.f1309Q);
        }

        /* renamed from: h */
        public void mo1732h(CharSequence charSequence) {
            this.f1307O = charSequence;
        }

        /* renamed from: k */
        public void mo1735k(int i) {
            this.f1310R = i;
        }

        /* renamed from: m */
        public void mo1737m(int i, int i2) {
            ViewTreeObserver viewTreeObserver;
            boolean c = mo1017c();
            mo1755O();
            mo2206E(2);
            super.mo1016a();
            ListView g = mo1019g();
            g.setChoiceMode(1);
            if (Build.VERSION.SDK_INT >= 17) {
                C0404d.m1621d(g, i);
                C0404d.m1620c(g, i2);
            }
            mo2212L(C0400a0.this.getSelectedItemPosition());
            if (!c && (viewTreeObserver = C0400a0.this.getViewTreeObserver()) != null) {
                C0410b bVar = new C0410b();
                viewTreeObserver.addOnGlobalLayoutListener(bVar);
                mo2208G(new C0411c(bVar));
            }
        }

        /* renamed from: o */
        public CharSequence mo1739o() {
            return this.f1307O;
        }

        /* renamed from: p */
        public void mo1741p(ListAdapter listAdapter) {
            super.mo1741p(listAdapter);
            this.f1308P = listAdapter;
        }
    }

    /* renamed from: androidx.appcompat.widget.a0$i */
    static class C0412i extends View.BaseSavedState {
        public static final Parcelable.Creator<C0412i> CREATOR = new C0413a();

        /* renamed from: f */
        boolean f1317f;

        /* renamed from: androidx.appcompat.widget.a0$i$a */
        class C0413a implements Parcelable.Creator<C0412i> {
            C0413a() {
            }

            /* renamed from: a */
            public C0412i createFromParcel(Parcel parcel) {
                return new C0412i(parcel);
            }

            /* renamed from: b */
            public C0412i[] newArray(int i) {
                return new C0412i[i];
            }
        }

        C0412i(Parcel parcel) {
            super(parcel);
            this.f1317f = parcel.readByte() != 0;
        }

        C0412i(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f1317f ? (byte) 1 : 0);
        }
    }

    /* renamed from: androidx.appcompat.widget.a0$j */
    interface C0414j {
        /* renamed from: b */
        int mo1728b();

        /* renamed from: c */
        boolean mo1729c();

        void dismiss();

        /* renamed from: f */
        Drawable mo1731f();

        /* renamed from: h */
        void mo1732h(CharSequence charSequence);

        /* renamed from: i */
        void mo1733i(Drawable drawable);

        /* renamed from: j */
        void mo1734j(int i);

        /* renamed from: k */
        void mo1735k(int i);

        /* renamed from: l */
        void mo1736l(int i);

        /* renamed from: m */
        void mo1737m(int i, int i2);

        /* renamed from: n */
        int mo1738n();

        /* renamed from: o */
        CharSequence mo1739o();

        /* renamed from: p */
        void mo1741p(ListAdapter listAdapter);
    }

    public C0400a0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2582a.spinnerStyle);
    }

    public C0400a0(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public C0400a0(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, (Resources.Theme) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005e, code lost:
        if (r11 != null) goto L_0x004d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x003d A[SYNTHETIC, Splitter:B:10:0x003d] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0400a0(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) {
        /*
            r6 = this;
            r6.<init>(r7, r8, r9)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r6.f1297m = r0
            android.content.Context r0 = r6.getContext()
            androidx.appcompat.widget.C0527v0.m2156a(r6, r0)
            int[] r0 = p038f.C2591j.f18926x2
            r1 = 0
            androidx.appcompat.widget.a1 r0 = androidx.appcompat.widget.C0415a1.m1660u(r7, r8, r0, r9, r1)
            androidx.appcompat.widget.e r2 = new androidx.appcompat.widget.e
            r2.<init>(r6)
            r6.f1290f = r2
            if (r11 == 0) goto L_0x0029
            androidx.appcompat.view.d r2 = new androidx.appcompat.view.d
            r2.<init>((android.content.Context) r7, (android.content.res.Resources.Theme) r11)
        L_0x0026:
            r6.f1291g = r2
            goto L_0x0039
        L_0x0029:
            int r11 = p038f.C2591j.f18711C2
            int r11 = r0.mo1778m(r11, r1)
            if (r11 == 0) goto L_0x0037
            androidx.appcompat.view.d r2 = new androidx.appcompat.view.d
            r2.<init>((android.content.Context) r7, (int) r11)
            goto L_0x0026
        L_0x0037:
            r6.f1291g = r7
        L_0x0039:
            r11 = -1
            r2 = 0
            if (r10 != r11) goto L_0x0069
            int[] r11 = f1289n     // Catch:{ Exception -> 0x0055, all -> 0x0053 }
            android.content.res.TypedArray r11 = r7.obtainStyledAttributes(r8, r11, r9, r1)     // Catch:{ Exception -> 0x0055, all -> 0x0053 }
            boolean r3 = r11.hasValue(r1)     // Catch:{ Exception -> 0x0051 }
            if (r3 == 0) goto L_0x004d
            int r10 = r11.getInt(r1, r1)     // Catch:{ Exception -> 0x0051 }
        L_0x004d:
            r11.recycle()
            goto L_0x0069
        L_0x0051:
            r3 = move-exception
            goto L_0x0057
        L_0x0053:
            r7 = move-exception
            goto L_0x0063
        L_0x0055:
            r3 = move-exception
            r11 = r2
        L_0x0057:
            java.lang.String r4 = "AppCompatSpinner"
            java.lang.String r5 = "Could not read android:spinnerMode"
            android.util.Log.i(r4, r5, r3)     // Catch:{ all -> 0x0061 }
            if (r11 == 0) goto L_0x0069
            goto L_0x004d
        L_0x0061:
            r7 = move-exception
            r2 = r11
        L_0x0063:
            if (r2 == 0) goto L_0x0068
            r2.recycle()
        L_0x0068:
            throw r7
        L_0x0069:
            r11 = 1
            if (r10 == 0) goto L_0x00a6
            if (r10 == r11) goto L_0x006f
            goto L_0x00b6
        L_0x006f:
            androidx.appcompat.widget.a0$h r10 = new androidx.appcompat.widget.a0$h
            android.content.Context r3 = r6.f1291g
            r10.<init>(r3, r8, r9)
            android.content.Context r3 = r6.f1291g
            int[] r4 = p038f.C2591j.f18926x2
            androidx.appcompat.widget.a1 r1 = androidx.appcompat.widget.C0415a1.m1660u(r3, r8, r4, r9, r1)
            int r3 = p038f.C2591j.f18706B2
            r4 = -2
            int r3 = r1.mo1777l(r3, r4)
            r6.f1296l = r3
            int r3 = p038f.C2591j.f18936z2
            android.graphics.drawable.Drawable r3 = r1.mo1771f(r3)
            r10.mo2216i(r3)
            int r3 = p038f.C2591j.f18701A2
            java.lang.String r3 = r0.mo1779n(r3)
            r10.mo1732h(r3)
            r1.mo1784v()
            r6.f1295k = r10
            androidx.appcompat.widget.a0$a r1 = new androidx.appcompat.widget.a0$a
            r1.<init>(r6, r10)
            r6.f1292h = r1
            goto L_0x00b6
        L_0x00a6:
            androidx.appcompat.widget.a0$f r10 = new androidx.appcompat.widget.a0$f
            r10.<init>()
            r6.f1295k = r10
            int r1 = p038f.C2591j.f18701A2
            java.lang.String r1 = r0.mo1779n(r1)
            r10.mo1732h(r1)
        L_0x00b6:
            int r10 = p038f.C2591j.f18931y2
            java.lang.CharSequence[] r10 = r0.mo1781p(r10)
            if (r10 == 0) goto L_0x00ce
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r3 = 17367048(0x1090008, float:2.5162948E-38)
            r1.<init>(r7, r3, r10)
            int r7 = p038f.C2588g.support_simple_spinner_dropdown_item
            r1.setDropDownViewResource(r7)
            r6.setAdapter((android.widget.SpinnerAdapter) r1)
        L_0x00ce:
            r0.mo1784v()
            r6.f1294j = r11
            android.widget.SpinnerAdapter r7 = r6.f1293i
            if (r7 == 0) goto L_0x00dc
            r6.setAdapter((android.widget.SpinnerAdapter) r7)
            r6.f1293i = r2
        L_0x00dc:
            androidx.appcompat.widget.e r7 = r6.f1290f
            r7.mo1932e(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0400a0.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo1697a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i2;
        }
        drawable.getPadding(this.f1297m);
        Rect rect = this.f1297m;
        return i2 + rect.left + rect.right;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1698b() {
        if (Build.VERSION.SDK_INT >= 17) {
            this.f1295k.mo1737m(C0404d.m1619b(this), C0404d.m1618a(this));
        } else {
            this.f1295k.mo1737m(-1, -1);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0444e eVar = this.f1290f;
        if (eVar != null) {
            eVar.mo1929b();
        }
    }

    public int getDropDownHorizontalOffset() {
        C0414j jVar = this.f1295k;
        if (jVar != null) {
            return jVar.mo1728b();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    public int getDropDownVerticalOffset() {
        C0414j jVar = this.f1295k;
        if (jVar != null) {
            return jVar.mo1738n();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    public int getDropDownWidth() {
        if (this.f1295k != null) {
            return this.f1296l;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final C0414j getInternalPopup() {
        return this.f1295k;
    }

    public Drawable getPopupBackground() {
        C0414j jVar = this.f1295k;
        if (jVar != null) {
            return jVar.mo1731f();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getPopupBackground();
        }
        return null;
    }

    public Context getPopupContext() {
        return this.f1291g;
    }

    public CharSequence getPrompt() {
        C0414j jVar = this.f1295k;
        return jVar != null ? jVar.mo1739o() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0444e eVar = this.f1290f;
        if (eVar != null) {
            return eVar.mo1930c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0444e eVar = this.f1290f;
        if (eVar != null) {
            return eVar.mo1931d();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0414j jVar = this.f1295k;
        if (jVar != null && jVar.mo1729c()) {
            this.f1295k.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1295k != null && View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), mo1697a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        C0412i iVar = (C0412i) parcelable;
        super.onRestoreInstanceState(iVar.getSuperState());
        if (iVar.f1317f && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new C0402b());
        }
    }

    public Parcelable onSaveInstanceState() {
        C0412i iVar = new C0412i(super.onSaveInstanceState());
        C0414j jVar = this.f1295k;
        iVar.f1317f = jVar != null && jVar.mo1729c();
        return iVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C0478l0 l0Var = this.f1292h;
        if (l0Var == null || !l0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public boolean performClick() {
        C0414j jVar = this.f1295k;
        if (jVar == null) {
            return super.performClick();
        }
        if (jVar.mo1729c()) {
            return true;
        }
        mo1698b();
        return true;
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f1294j) {
            this.f1293i = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f1295k != null) {
            Context context = this.f1291g;
            if (context == null) {
                context = getContext();
            }
            this.f1295k.mo1741p(new C0407g(spinnerAdapter, context.getTheme()));
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0444e eVar = this.f1290f;
        if (eVar != null) {
            eVar.mo1933f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0444e eVar = this.f1290f;
        if (eVar != null) {
            eVar.mo1934g(i);
        }
    }

    public void setDropDownHorizontalOffset(int i) {
        C0414j jVar = this.f1295k;
        if (jVar != null) {
            jVar.mo1735k(i);
            this.f1295k.mo1736l(i);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownHorizontalOffset(i);
        }
    }

    public void setDropDownVerticalOffset(int i) {
        C0414j jVar = this.f1295k;
        if (jVar != null) {
            jVar.mo1734j(i);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(i);
        }
    }

    public void setDropDownWidth(int i) {
        if (this.f1295k != null) {
            this.f1296l = i;
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(i);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        C0414j jVar = this.f1295k;
        if (jVar != null) {
            jVar.mo1733i(drawable);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(C2620a.m21330b(getPopupContext(), i));
    }

    public void setPrompt(CharSequence charSequence) {
        C0414j jVar = this.f1295k;
        if (jVar != null) {
            jVar.mo1732h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0444e eVar = this.f1290f;
        if (eVar != null) {
            eVar.mo1936i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0444e eVar = this.f1290f;
        if (eVar != null) {
            eVar.mo1937j(mode);
        }
    }
}
