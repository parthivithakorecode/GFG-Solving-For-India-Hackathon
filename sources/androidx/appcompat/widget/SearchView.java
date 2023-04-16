package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.C0301c;
import androidx.core.view.C0833y;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p038f.C2582a;
import p038f.C2585d;
import p038f.C2587f;
import p038f.C2588g;
import p038f.C2589h;
import p038f.C2591j;
import p134t.C4052a;
import p140u.C4082a;

public class SearchView extends C0482m0 implements C0301c {

    /* renamed from: v0 */
    static final C0385o f1145v0 = (Build.VERSION.SDK_INT < 29 ? new C0385o() : null);

    /* renamed from: A */
    final ImageView f1146A;

    /* renamed from: B */
    final ImageView f1147B;

    /* renamed from: C */
    private final View f1148C;

    /* renamed from: D */
    private C0388q f1149D;

    /* renamed from: E */
    private Rect f1150E;

    /* renamed from: F */
    private Rect f1151F;

    /* renamed from: G */
    private int[] f1152G;

    /* renamed from: H */
    private int[] f1153H;

    /* renamed from: I */
    private final ImageView f1154I;

    /* renamed from: J */
    private final Drawable f1155J;

    /* renamed from: K */
    private final int f1156K;

    /* renamed from: L */
    private final int f1157L;

    /* renamed from: M */
    private final Intent f1158M;

    /* renamed from: N */
    private final Intent f1159N;

    /* renamed from: O */
    private final CharSequence f1160O;

    /* renamed from: P */
    private C0383m f1161P;

    /* renamed from: Q */
    private C0382l f1162Q;

    /* renamed from: R */
    View.OnFocusChangeListener f1163R;

    /* renamed from: S */
    private C0384n f1164S;

    /* renamed from: T */
    private View.OnClickListener f1165T;

    /* renamed from: U */
    private boolean f1166U;

    /* renamed from: V */
    private boolean f1167V;

    /* renamed from: W */
    C4052a f1168W;

    /* renamed from: a0 */
    private boolean f1169a0;

    /* renamed from: b0 */
    private CharSequence f1170b0;

    /* renamed from: c0 */
    private boolean f1171c0;

    /* renamed from: d0 */
    private boolean f1172d0;

    /* renamed from: e0 */
    private int f1173e0;

    /* renamed from: f0 */
    private boolean f1174f0;

    /* renamed from: g0 */
    private CharSequence f1175g0;

    /* renamed from: h0 */
    private CharSequence f1176h0;

    /* renamed from: i0 */
    private boolean f1177i0;

    /* renamed from: j0 */
    private int f1178j0;

    /* renamed from: k0 */
    SearchableInfo f1179k0;

    /* renamed from: l0 */
    private Bundle f1180l0;

    /* renamed from: m0 */
    private final Runnable f1181m0;

    /* renamed from: n0 */
    private Runnable f1182n0;

    /* renamed from: o0 */
    private final WeakHashMap<String, Drawable.ConstantState> f1183o0;

    /* renamed from: p0 */
    private final View.OnClickListener f1184p0;

    /* renamed from: q0 */
    View.OnKeyListener f1185q0;

    /* renamed from: r0 */
    private final TextView.OnEditorActionListener f1186r0;

    /* renamed from: s0 */
    private final AdapterView.OnItemClickListener f1187s0;

    /* renamed from: t0 */
    private final AdapterView.OnItemSelectedListener f1188t0;

    /* renamed from: u */
    final SearchAutoComplete f1189u;

    /* renamed from: u0 */
    private TextWatcher f1190u0;

    /* renamed from: v */
    private final View f1191v;

    /* renamed from: w */
    private final View f1192w;

    /* renamed from: x */
    private final View f1193x;

    /* renamed from: y */
    final ImageView f1194y;

    /* renamed from: z */
    final ImageView f1195z;

    public static class SearchAutoComplete extends C0440d {

        /* renamed from: j */
        private int f1196j;

        /* renamed from: k */
        private SearchView f1197k;

        /* renamed from: l */
        private boolean f1198l;

        /* renamed from: m */
        final Runnable f1199m;

        /* renamed from: androidx.appcompat.widget.SearchView$SearchAutoComplete$a */
        class C0370a implements Runnable {
            C0370a() {
            }

            public void run() {
                SearchAutoComplete.this.mo1531d();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, C2582a.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f1199m = new C0370a();
            this.f1196j = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i < 600) {
                return (i < 640 || i2 < 480) ? 160 : 192;
            }
            return 192;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo1529b() {
            if (Build.VERSION.SDK_INT >= 29) {
                C0381k.m1534b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            SearchView.f1145v0.mo1564c(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo1530c() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo1531d() {
            if (this.f1198l) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f1198l = false;
            }
        }

        public boolean enoughToFilter() {
            return this.f1196j <= 0 || super.enoughToFilter();
        }

        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f1198l) {
                removeCallbacks(this.f1199m);
                post(this.f1199m);
            }
            return onCreateInputConnection;
        }

        /* access modifiers changed from: protected */
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        /* access modifiers changed from: protected */
        public void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.f1197k.mo1494X();
        }

        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f1197k.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f1197k.hasFocus() && getVisibility() == 0) {
                this.f1198l = true;
                if (SearchView.m1499K(getContext())) {
                    mo1529b();
                }
            }
        }

        public void performCompletion() {
        }

        /* access modifiers changed from: protected */
        public void replaceText(CharSequence charSequence) {
        }

        /* access modifiers changed from: package-private */
        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f1198l = false;
                removeCallbacks(this.f1199m);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f1198l = false;
                removeCallbacks(this.f1199m);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f1198l = true;
            }
        }

        /* access modifiers changed from: package-private */
        public void setSearchView(SearchView searchView) {
            this.f1197k = searchView;
        }

        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f1196j = i;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$a */
    class C0371a implements TextWatcher {
        C0371a() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SearchView.this.mo1493W(charSequence);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$b */
    class C0372b implements Runnable {
        C0372b() {
        }

        public void run() {
            SearchView.this.mo1498d0();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$c */
    class C0373c implements Runnable {
        C0373c() {
        }

        public void run() {
            C4052a aVar = SearchView.this.f1168W;
            if (aVar instanceof C0524u0) {
                aVar.mo2340a((Cursor) null);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$d */
    class C0374d implements View.OnFocusChangeListener {
        C0374d() {
        }

        public void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f1163R;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$e */
    class C0375e implements View.OnLayoutChangeListener {
        C0375e() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            SearchView.this.mo1528z();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$f */
    class C0376f implements View.OnClickListener {
        C0376f() {
        }

        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f1194y) {
                searchView.mo1490T();
            } else if (view == searchView.f1146A) {
                searchView.mo1486P();
            } else if (view == searchView.f1195z) {
                searchView.mo1491U();
            } else if (view == searchView.f1147B) {
                searchView.mo1495Y();
            } else if (view == searchView.f1189u) {
                searchView.mo1483F();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$g */
    class C0377g implements View.OnKeyListener {
        C0377g() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f1179k0 == null) {
                return false;
            }
            if (searchView.f1189u.isPopupShowing() && SearchView.this.f1189u.getListSelection() != -1) {
                return SearchView.this.mo1492V(view, i, keyEvent);
            }
            if (SearchView.this.f1189u.mo1530c() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.mo1485N(0, (String) null, searchView2.f1189u.getText().toString());
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$h */
    class C0378h implements TextView.OnEditorActionListener {
        C0378h() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            SearchView.this.mo1491U();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$i */
    class C0379i implements AdapterView.OnItemClickListener {
        C0379i() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.mo1487Q(i, 0, (String) null);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$j */
    class C0380j implements AdapterView.OnItemSelectedListener {
        C0380j() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.mo1488R(i);
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$k */
    static class C0381k {
        /* renamed from: a */
        static void m1533a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        /* renamed from: b */
        static void m1534b(SearchAutoComplete searchAutoComplete, int i) {
            searchAutoComplete.setInputMethodMode(i);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$l */
    public interface C0382l {
        /* renamed from: a */
        boolean mo1557a();
    }

    /* renamed from: androidx.appcompat.widget.SearchView$m */
    public interface C0383m {
        /* renamed from: a */
        boolean mo1558a(String str);

        /* renamed from: b */
        boolean mo1559b(String str);
    }

    /* renamed from: androidx.appcompat.widget.SearchView$n */
    public interface C0384n {
        /* renamed from: a */
        boolean mo1560a(int i);

        /* renamed from: b */
        boolean mo1561b(int i);
    }

    /* renamed from: androidx.appcompat.widget.SearchView$o */
    private static class C0385o {

        /* renamed from: a */
        private Method f1211a = null;

        /* renamed from: b */
        private Method f1212b = null;

        /* renamed from: c */
        private Method f1213c = null;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        C0385o() {
            m1540d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f1211a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f1212b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            Class<AutoCompleteTextView> cls = AutoCompleteTextView.class;
            try {
                Method method = cls.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});
                this.f1213c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        /* renamed from: d */
        private static void m1540d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1562a(AutoCompleteTextView autoCompleteTextView) {
            m1540d();
            Method method = this.f1212b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo1563b(AutoCompleteTextView autoCompleteTextView) {
            m1540d();
            Method method = this.f1211a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo1564c(AutoCompleteTextView autoCompleteTextView) {
            m1540d();
            Method method = this.f1213c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[]{Boolean.TRUE});
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$p */
    static class C0386p extends C4082a {
        public static final Parcelable.Creator<C0386p> CREATOR = new C0387a();

        /* renamed from: h */
        boolean f1214h;

        /* renamed from: androidx.appcompat.widget.SearchView$p$a */
        class C0387a implements Parcelable.ClassLoaderCreator<C0386p> {
            C0387a() {
            }

            /* renamed from: a */
            public C0386p createFromParcel(Parcel parcel) {
                return new C0386p(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public C0386p createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0386p(parcel, classLoader);
            }

            /* renamed from: c */
            public C0386p[] newArray(int i) {
                return new C0386p[i];
            }
        }

        public C0386p(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1214h = ((Boolean) parcel.readValue((ClassLoader) null)).booleanValue();
        }

        C0386p(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f1214h + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.f1214h));
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$q */
    private static class C0388q extends TouchDelegate {

        /* renamed from: a */
        private final View f1215a;

        /* renamed from: b */
        private final Rect f1216b = new Rect();

        /* renamed from: c */
        private final Rect f1217c = new Rect();

        /* renamed from: d */
        private final Rect f1218d = new Rect();

        /* renamed from: e */
        private final int f1219e;

        /* renamed from: f */
        private boolean f1220f;

        public C0388q(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f1219e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            mo1573a(rect, rect2);
            this.f1215a = view;
        }

        /* renamed from: a */
        public void mo1573a(Rect rect, Rect rect2) {
            this.f1216b.set(rect);
            this.f1218d.set(rect);
            Rect rect3 = this.f1218d;
            int i = this.f1219e;
            rect3.inset(-i, -i);
            this.f1217c.set(rect2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0043  */
        /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouchEvent(android.view.MotionEvent r9) {
            /*
                r8 = this;
                float r0 = r9.getX()
                int r0 = (int) r0
                float r1 = r9.getY()
                int r1 = (int) r1
                int r2 = r9.getAction()
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L_0x0033
                if (r2 == r4) goto L_0x0020
                if (r2 == r3) goto L_0x0020
                r6 = 3
                if (r2 == r6) goto L_0x001b
                goto L_0x003f
            L_0x001b:
                boolean r2 = r8.f1220f
                r8.f1220f = r5
                goto L_0x002f
            L_0x0020:
                boolean r2 = r8.f1220f
                if (r2 == 0) goto L_0x002f
                android.graphics.Rect r6 = r8.f1218d
                boolean r6 = r6.contains(r0, r1)
                if (r6 != 0) goto L_0x002f
                r4 = r2
                r2 = r5
                goto L_0x0041
            L_0x002f:
                r7 = r4
                r4 = r2
                r2 = r7
                goto L_0x0041
            L_0x0033:
                android.graphics.Rect r2 = r8.f1216b
                boolean r2 = r2.contains(r0, r1)
                if (r2 == 0) goto L_0x003f
                r8.f1220f = r4
                r2 = r4
                goto L_0x0041
            L_0x003f:
                r2 = r4
                r4 = r5
            L_0x0041:
                if (r4 == 0) goto L_0x0070
                if (r2 == 0) goto L_0x005d
                android.graphics.Rect r2 = r8.f1217c
                boolean r2 = r2.contains(r0, r1)
                if (r2 != 0) goto L_0x005d
                android.view.View r0 = r8.f1215a
                int r0 = r0.getWidth()
                int r0 = r0 / r3
                float r0 = (float) r0
                android.view.View r1 = r8.f1215a
                int r1 = r1.getHeight()
                int r1 = r1 / r3
                goto L_0x0066
            L_0x005d:
                android.graphics.Rect r2 = r8.f1217c
                int r3 = r2.left
                int r0 = r0 - r3
                float r0 = (float) r0
                int r2 = r2.top
                int r1 = r1 - r2
            L_0x0066:
                float r1 = (float) r1
                r9.setLocation(r0, r1)
                android.view.View r0 = r8.f1215a
                boolean r5 = r0.dispatchTouchEvent(r9)
            L_0x0070:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.C0388q.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    public SearchView(Context context) {
        this(context, (AttributeSet) null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2582a.searchViewStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1150E = new Rect();
        this.f1151F = new Rect();
        this.f1152G = new int[2];
        this.f1153H = new int[2];
        this.f1181m0 = new C0372b();
        this.f1182n0 = new C0373c();
        this.f1183o0 = new WeakHashMap<>();
        C0376f fVar = new C0376f();
        this.f1184p0 = fVar;
        this.f1185q0 = new C0377g();
        C0378h hVar = new C0378h();
        this.f1186r0 = hVar;
        C0379i iVar = new C0379i();
        this.f1187s0 = iVar;
        C0380j jVar = new C0380j();
        this.f1188t0 = jVar;
        this.f1190u0 = new C0371a();
        int[] iArr = C2591j.f18836f2;
        AttributeSet attributeSet2 = attributeSet;
        int i2 = i;
        C0415a1 u = C0415a1.m1660u(context, attributeSet2, iArr, i2, 0);
        C0833y.m3328M(this, context, iArr, attributeSet2, u.mo1782q(), i2, 0);
        LayoutInflater.from(context).inflate(u.mo1778m(C2591j.f18886p2, C2588g.abc_search_view), this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(C2587f.search_src_text);
        this.f1189u = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f1191v = findViewById(C2587f.search_edit_frame);
        View findViewById = findViewById(C2587f.search_plate);
        this.f1192w = findViewById;
        View findViewById2 = findViewById(C2587f.submit_area);
        this.f1193x = findViewById2;
        ImageView imageView = (ImageView) findViewById(C2587f.search_button);
        this.f1194y = imageView;
        ImageView imageView2 = (ImageView) findViewById(C2587f.search_go_btn);
        this.f1195z = imageView2;
        ImageView imageView3 = (ImageView) findViewById(C2587f.search_close_btn);
        this.f1146A = imageView3;
        ImageView imageView4 = (ImageView) findViewById(C2587f.search_voice_btn);
        this.f1147B = imageView4;
        ImageView imageView5 = (ImageView) findViewById(C2587f.search_mag_icon);
        this.f1154I = imageView5;
        C0833y.m3333R(findViewById, u.mo1771f(C2591j.f18891q2));
        C0833y.m3333R(findViewById2, u.mo1771f(C2591j.f18911u2));
        int i3 = C2591j.f18906t2;
        imageView.setImageDrawable(u.mo1771f(i3));
        imageView2.setImageDrawable(u.mo1771f(C2591j.f18876n2));
        imageView3.setImageDrawable(u.mo1771f(C2591j.f18861k2));
        imageView4.setImageDrawable(u.mo1771f(C2591j.f18921w2));
        imageView5.setImageDrawable(u.mo1771f(i3));
        this.f1155J = u.mo1771f(C2591j.f18901s2);
        C0442d1.m1804a(imageView, getResources().getString(C2589h.abc_searchview_description_search));
        this.f1156K = u.mo1778m(C2591j.f18916v2, C2588g.abc_search_dropdown_item_icons_2line);
        this.f1157L = u.mo1778m(C2591j.f18866l2, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.f1190u0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f1185q0);
        searchAutoComplete.setOnFocusChangeListener(new C0374d());
        setIconifiedByDefault(u.mo1766a(C2591j.f18881o2, true));
        int e = u.mo1770e(C2591j.f18846h2, -1);
        if (e != -1) {
            setMaxWidth(e);
        }
        this.f1160O = u.mo1780o(C2591j.f18871m2);
        this.f1170b0 = u.mo1780o(C2591j.f18896r2);
        int j = u.mo1775j(C2591j.f18856j2, -1);
        if (j != -1) {
            setImeOptions(j);
        }
        int j2 = u.mo1775j(C2591j.f18851i2, -1);
        if (j2 != -1) {
            setInputType(j2);
        }
        setFocusable(u.mo1766a(C2591j.f18841g2, true));
        u.mo1784v();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f1158M = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f1159N = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f1148C = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new C0375e());
        }
        m1510i0(this.f1166U);
        m1506e0();
    }

    /* renamed from: A */
    private Intent m1491A(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f1176h0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f1180l0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f1179k0.getSearchActivity());
        return intent;
    }

    /* renamed from: B */
    private Intent m1492B(Cursor cursor, int i, String str) {
        int i2;
        String y;
        try {
            String y2 = C0524u0.m2146y(cursor, "suggest_intent_action");
            if (y2 == null) {
                y2 = this.f1179k0.getSuggestIntentAction();
            }
            if (y2 == null) {
                y2 = "android.intent.action.SEARCH";
            }
            String str2 = y2;
            String y3 = C0524u0.m2146y(cursor, "suggest_intent_data");
            if (y3 == null) {
                y3 = this.f1179k0.getSuggestIntentData();
            }
            if (!(y3 == null || (y = C0524u0.m2146y(cursor, "suggest_intent_data_id")) == null)) {
                y3 = y3 + "/" + Uri.encode(y);
            }
            return m1491A(str2, y3 == null ? null : Uri.parse(y3), C0524u0.m2146y(cursor, "suggest_intent_extra_data"), C0524u0.m2146y(cursor, "suggest_intent_query"), i, str);
        } catch (RuntimeException e) {
            try {
                i2 = cursor.getPosition();
            } catch (RuntimeException unused) {
                i2 = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + i2 + " returned exception.", e);
            return null;
        }
    }

    /* renamed from: C */
    private Intent m1493C(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1180l0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        int i = 1;
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String str = null;
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i = searchableInfo.getVoiceMaxResults();
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i);
        if (searchActivity != null) {
            str = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    /* renamed from: D */
    private Intent m1494D(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    /* renamed from: E */
    private void m1495E() {
        this.f1189u.dismissDropDown();
    }

    /* renamed from: G */
    private void m1496G(View view, Rect rect) {
        view.getLocationInWindow(this.f1152G);
        getLocationInWindow(this.f1153H);
        int[] iArr = this.f1152G;
        int i = iArr[1];
        int[] iArr2 = this.f1153H;
        int i2 = i - iArr2[1];
        int i3 = iArr[0] - iArr2[0];
        rect.set(i3, i2, view.getWidth() + i3, view.getHeight() + i2);
    }

    /* renamed from: H */
    private CharSequence m1497H(CharSequence charSequence) {
        if (!this.f1166U || this.f1155J == null) {
            return charSequence;
        }
        int textSize = (int) (((double) this.f1189u.getTextSize()) * 1.25d);
        this.f1155J.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f1155J), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    /* renamed from: I */
    private boolean m1498I() {
        SearchableInfo searchableInfo = this.f1179k0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = null;
        if (this.f1179k0.getVoiceSearchLaunchWebSearch()) {
            intent = this.f1158M;
        } else if (this.f1179k0.getVoiceSearchLaunchRecognizer()) {
            intent = this.f1159N;
        }
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    /* renamed from: K */
    static boolean m1499K(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    /* renamed from: L */
    private boolean m1500L() {
        return (this.f1169a0 || this.f1174f0) && !mo1484J();
    }

    /* renamed from: M */
    private void m1501M(Intent intent) {
        if (intent != null) {
            try {
                getContext().startActivity(intent);
            } catch (RuntimeException e) {
                Log.e("SearchView", "Failed launch activity: " + intent, e);
            }
        }
    }

    /* renamed from: O */
    private boolean m1502O(int i, int i2, String str) {
        Cursor b = this.f1168W.mo15542b();
        if (b == null || !b.moveToPosition(i)) {
            return false;
        }
        m1501M(m1492B(b, i2, str));
        return true;
    }

    /* renamed from: Z */
    private void m1503Z() {
        post(this.f1181m0);
    }

    /* renamed from: a0 */
    private void m1504a0(int i) {
        CharSequence c;
        Editable text = this.f1189u.getText();
        Cursor b = this.f1168W.mo15542b();
        if (b != null) {
            if (!b.moveToPosition(i) || (c = this.f1168W.mo2341c(b)) == null) {
                setQuery(text);
            } else {
                setQuery(c);
            }
        }
    }

    /* renamed from: c0 */
    private void m1505c0() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f1189u.getText());
        int i = 0;
        if (!z2 && (!this.f1166U || this.f1177i0)) {
            z = false;
        }
        ImageView imageView = this.f1146A;
        if (!z) {
            i = 8;
        }
        imageView.setVisibility(i);
        Drawable drawable = this.f1146A.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    /* renamed from: e0 */
    private void m1506e0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f1189u;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(m1497H(queryHint));
    }

    /* renamed from: f0 */
    private void m1507f0() {
        this.f1189u.setThreshold(this.f1179k0.getSuggestThreshold());
        this.f1189u.setImeOptions(this.f1179k0.getImeOptions());
        int inputType = this.f1179k0.getInputType();
        int i = 1;
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f1179k0.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.f1189u.setInputType(inputType);
        C4052a aVar = this.f1168W;
        if (aVar != null) {
            aVar.mo2340a((Cursor) null);
        }
        if (this.f1179k0.getSuggestAuthority() != null) {
            C0524u0 u0Var = new C0524u0(getContext(), this, this.f1179k0, this.f1183o0);
            this.f1168W = u0Var;
            this.f1189u.setAdapter(u0Var);
            C0524u0 u0Var2 = (C0524u0) this.f1168W;
            if (this.f1171c0) {
                i = 2;
            }
            u0Var2.mo2339H(i);
        }
    }

    /* renamed from: g0 */
    private void m1508g0() {
        this.f1193x.setVisibility((!m1500L() || !(this.f1195z.getVisibility() == 0 || this.f1147B.getVisibility() == 0)) ? 8 : 0);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(C2585d.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(C2585d.abc_search_view_preferred_width);
    }

    /* renamed from: h0 */
    private void m1509h0(boolean z) {
        this.f1195z.setVisibility((!this.f1169a0 || !m1500L() || !hasFocus() || (!z && this.f1174f0)) ? 8 : 0);
    }

    /* renamed from: i0 */
    private void m1510i0(boolean z) {
        this.f1167V = z;
        int i = 0;
        int i2 = z ? 0 : 8;
        boolean z2 = !TextUtils.isEmpty(this.f1189u.getText());
        this.f1194y.setVisibility(i2);
        m1509h0(z2);
        this.f1191v.setVisibility(z ? 8 : 0);
        if (this.f1154I.getDrawable() == null || this.f1166U) {
            i = 8;
        }
        this.f1154I.setVisibility(i);
        m1505c0();
        m1511j0(!z2);
        m1508g0();
    }

    /* renamed from: j0 */
    private void m1511j0(boolean z) {
        int i = 8;
        if (this.f1174f0 && !mo1484J() && z) {
            this.f1195z.setVisibility(8);
            i = 0;
        }
        this.f1147B.setVisibility(i);
    }

    private void setQuery(CharSequence charSequence) {
        this.f1189u.setText(charSequence);
        this.f1189u.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo1483F() {
        if (Build.VERSION.SDK_INT >= 29) {
            C0381k.m1533a(this.f1189u);
            return;
        }
        C0385o oVar = f1145v0;
        oVar.mo1563b(this.f1189u);
        oVar.mo1562a(this.f1189u);
    }

    /* renamed from: J */
    public boolean mo1484J() {
        return this.f1167V;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public void mo1485N(int i, String str, String str2) {
        getContext().startActivity(m1491A("android.intent.action.SEARCH", (Uri) null, (String) null, str2, i, str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public void mo1486P() {
        if (!TextUtils.isEmpty(this.f1189u.getText())) {
            this.f1189u.setText("");
            this.f1189u.requestFocus();
            this.f1189u.setImeVisibility(true);
        } else if (this.f1166U) {
            C0382l lVar = this.f1162Q;
            if (lVar == null || !lVar.mo1557a()) {
                clearFocus();
                m1510i0(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public boolean mo1487Q(int i, int i2, String str) {
        C0384n nVar = this.f1164S;
        if (nVar != null && nVar.mo1561b(i)) {
            return false;
        }
        m1502O(i, 0, (String) null);
        this.f1189u.setImeVisibility(false);
        m1495E();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public boolean mo1488R(int i) {
        C0384n nVar = this.f1164S;
        if (nVar != null && nVar.mo1560a(i)) {
            return false;
        }
        m1504a0(i);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public void mo1489S(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public void mo1490T() {
        m1510i0(false);
        this.f1189u.requestFocus();
        this.f1189u.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f1165T;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public void mo1491U() {
        Editable text = this.f1189u.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            C0383m mVar = this.f1161P;
            if (mVar == null || !mVar.mo1559b(text.toString())) {
                if (this.f1179k0 != null) {
                    mo1485N(0, (String) null, text.toString());
                }
                this.f1189u.setImeVisibility(false);
                m1495E();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public boolean mo1492V(View view, int i, KeyEvent keyEvent) {
        if (this.f1179k0 != null && this.f1168W != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i == 66 || i == 84 || i == 61) {
                return mo1487Q(this.f1189u.getListSelection(), 0, (String) null);
            }
            if (i == 21 || i == 22) {
                this.f1189u.setSelection(i == 21 ? 0 : this.f1189u.length());
                this.f1189u.setListSelection(0);
                this.f1189u.clearListSelection();
                this.f1189u.mo1529b();
                return true;
            } else if (i == 19) {
                this.f1189u.getListSelection();
                return false;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public void mo1493W(CharSequence charSequence) {
        Editable text = this.f1189u.getText();
        this.f1176h0 = text;
        boolean z = !TextUtils.isEmpty(text);
        m1509h0(z);
        m1511j0(!z);
        m1505c0();
        m1508g0();
        if (this.f1161P != null && !TextUtils.equals(charSequence, this.f1175g0)) {
            this.f1161P.mo1558a(charSequence.toString());
        }
        this.f1175g0 = charSequence.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public void mo1494X() {
        m1510i0(mo1484J());
        m1503Z();
        if (this.f1189u.hasFocus()) {
            mo1483F();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public void mo1495Y() {
        Intent C;
        SearchableInfo searchableInfo = this.f1179k0;
        if (searchableInfo != null) {
            try {
                if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    C = m1494D(this.f1158M, searchableInfo);
                } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    C = m1493C(this.f1159N, searchableInfo);
                } else {
                    return;
                }
                getContext().startActivity(C);
            } catch (ActivityNotFoundException unused) {
                Log.w("SearchView", "Could not find voice search activity");
            }
        }
    }

    /* renamed from: b0 */
    public void mo1496b0(CharSequence charSequence, boolean z) {
        this.f1189u.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f1189u;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f1176h0 = charSequence;
        }
        if (z && !TextUtils.isEmpty(charSequence)) {
            mo1491U();
        }
    }

    /* renamed from: c */
    public void mo836c() {
        if (!this.f1177i0) {
            this.f1177i0 = true;
            int imeOptions = this.f1189u.getImeOptions();
            this.f1178j0 = imeOptions;
            this.f1189u.setImeOptions(imeOptions | 33554432);
            this.f1189u.setText("");
            setIconified(false);
        }
    }

    public void clearFocus() {
        this.f1172d0 = true;
        super.clearFocus();
        this.f1189u.clearFocus();
        this.f1189u.setImeVisibility(false);
        this.f1172d0 = false;
    }

    /* renamed from: d */
    public void mo837d() {
        mo1496b0("", false);
        clearFocus();
        m1510i0(true);
        this.f1189u.setImeOptions(this.f1178j0);
        this.f1177i0 = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d0 */
    public void mo1498d0() {
        int[] iArr = this.f1189u.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f1192w.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f1193x.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public int getImeOptions() {
        return this.f1189u.getImeOptions();
    }

    public int getInputType() {
        return this.f1189u.getInputType();
    }

    public int getMaxWidth() {
        return this.f1173e0;
    }

    public CharSequence getQuery() {
        return this.f1189u.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f1170b0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f1179k0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f1160O : getContext().getText(this.f1179k0.getHintId());
    }

    /* access modifiers changed from: package-private */
    public int getSuggestionCommitIconResId() {
        return this.f1157L;
    }

    /* access modifiers changed from: package-private */
    public int getSuggestionRowLayout() {
        return this.f1156K;
    }

    public C4052a getSuggestionsAdapter() {
        return this.f1168W;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.f1181m0);
        post(this.f1182n0);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m1496G(this.f1189u, this.f1150E);
            Rect rect = this.f1151F;
            Rect rect2 = this.f1150E;
            rect.set(rect2.left, 0, rect2.right, i4 - i2);
            C0388q qVar = this.f1149D;
            if (qVar == null) {
                C0388q qVar2 = new C0388q(this.f1151F, this.f1150E, this.f1189u);
                this.f1149D = qVar2;
                setTouchDelegate(qVar2);
                return;
            }
            qVar.mo1573a(this.f1151F, this.f1150E);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (r0 <= 0) goto L_0x0039;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            boolean r0 = r3.mo1484J()
            if (r0 == 0) goto L_0x000a
            super.onMeasure(r4, r5)
            return
        L_0x000a:
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L_0x002c
            if (r0 == 0) goto L_0x0022
            if (r0 == r2) goto L_0x001d
            goto L_0x0039
        L_0x001d:
            int r0 = r3.f1173e0
            if (r0 <= 0) goto L_0x0039
            goto L_0x0030
        L_0x0022:
            int r4 = r3.f1173e0
            if (r4 <= 0) goto L_0x0027
            goto L_0x0039
        L_0x0027:
            int r4 = r3.getPreferredWidth()
            goto L_0x0039
        L_0x002c:
            int r0 = r3.f1173e0
            if (r0 <= 0) goto L_0x0031
        L_0x0030:
            goto L_0x0035
        L_0x0031:
            int r0 = r3.getPreferredWidth()
        L_0x0035:
            int r4 = java.lang.Math.min(r0, r4)
        L_0x0039:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r0 == r1) goto L_0x004b
            if (r0 == 0) goto L_0x0046
            goto L_0x0053
        L_0x0046:
            int r5 = r3.getPreferredHeight()
            goto L_0x0053
        L_0x004b:
            int r0 = r3.getPreferredHeight()
            int r5 = java.lang.Math.min(r0, r5)
        L_0x0053:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            super.onMeasure(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.onMeasure(int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0386p)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0386p pVar = (C0386p) parcelable;
        super.onRestoreInstanceState(pVar.mo15581b());
        m1510i0(pVar.f1214h);
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C0386p pVar = new C0386p(super.onSaveInstanceState());
        pVar.f1214h = mo1484J();
        return pVar;
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        m1503Z();
    }

    public boolean requestFocus(int i, Rect rect) {
        if (this.f1172d0 || !isFocusable()) {
            return false;
        }
        if (mo1484J()) {
            return super.requestFocus(i, rect);
        }
        boolean requestFocus = this.f1189u.requestFocus(i, rect);
        if (requestFocus) {
            m1510i0(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f1180l0 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            mo1486P();
        } else {
            mo1490T();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f1166U != z) {
            this.f1166U = z;
            m1510i0(z);
            m1506e0();
        }
    }

    public void setImeOptions(int i) {
        this.f1189u.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.f1189u.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.f1173e0 = i;
        requestLayout();
    }

    public void setOnCloseListener(C0382l lVar) {
        this.f1162Q = lVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f1163R = onFocusChangeListener;
    }

    public void setOnQueryTextListener(C0383m mVar) {
        this.f1161P = mVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f1165T = onClickListener;
    }

    public void setOnSuggestionListener(C0384n nVar) {
        this.f1164S = nVar;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f1170b0 = charSequence;
        m1506e0();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.f1171c0 = z;
        C4052a aVar = this.f1168W;
        if (aVar instanceof C0524u0) {
            ((C0524u0) aVar).mo2339H(z ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f1179k0 = searchableInfo;
        if (searchableInfo != null) {
            m1507f0();
            m1506e0();
        }
        boolean I = m1498I();
        this.f1174f0 = I;
        if (I) {
            this.f1189u.setPrivateImeOptions("nm");
        }
        m1510i0(mo1484J());
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f1169a0 = z;
        m1510i0(mo1484J());
    }

    public void setSuggestionsAdapter(C4052a aVar) {
        this.f1168W = aVar;
        this.f1189u.setAdapter(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo1528z() {
        if (this.f1148C.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f1192w.getPaddingLeft();
            Rect rect = new Rect();
            boolean b = C0471j1.m1938b(this);
            int dimensionPixelSize = this.f1166U ? resources.getDimensionPixelSize(C2585d.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(C2585d.abc_dropdownitem_text_padding_left) : 0;
            this.f1189u.getDropDownBackground().getPadding(rect);
            int i = rect.left;
            this.f1189u.setDropDownHorizontalOffset(b ? -i : paddingLeft - (i + dimensionPixelSize));
            this.f1189u.setDropDownWidth((((this.f1148C.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }
}
