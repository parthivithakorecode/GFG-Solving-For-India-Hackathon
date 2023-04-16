package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.C0482m0;
import androidx.core.view.C0833y;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;
import p038f.C2582a;
import p038f.C2587f;
import p038f.C2591j;

class AlertController {

    /* renamed from: A */
    NestedScrollView f441A;

    /* renamed from: B */
    private int f442B = 0;

    /* renamed from: C */
    private Drawable f443C;

    /* renamed from: D */
    private ImageView f444D;

    /* renamed from: E */
    private TextView f445E;

    /* renamed from: F */
    private TextView f446F;

    /* renamed from: G */
    private View f447G;

    /* renamed from: H */
    ListAdapter f448H;

    /* renamed from: I */
    int f449I = -1;

    /* renamed from: J */
    private int f450J;

    /* renamed from: K */
    private int f451K;

    /* renamed from: L */
    int f452L;

    /* renamed from: M */
    int f453M;

    /* renamed from: N */
    int f454N;

    /* renamed from: O */
    int f455O;

    /* renamed from: P */
    private boolean f456P;

    /* renamed from: Q */
    private int f457Q = 0;

    /* renamed from: R */
    Handler f458R;

    /* renamed from: S */
    private final View.OnClickListener f459S = new C0233a();

    /* renamed from: a */
    private final Context f460a;

    /* renamed from: b */
    final C0284h f461b;

    /* renamed from: c */
    private final Window f462c;

    /* renamed from: d */
    private final int f463d;

    /* renamed from: e */
    private CharSequence f464e;

    /* renamed from: f */
    private CharSequence f465f;

    /* renamed from: g */
    ListView f466g;

    /* renamed from: h */
    private View f467h;

    /* renamed from: i */
    private int f468i;

    /* renamed from: j */
    private int f469j;

    /* renamed from: k */
    private int f470k;

    /* renamed from: l */
    private int f471l;

    /* renamed from: m */
    private int f472m;

    /* renamed from: n */
    private boolean f473n = false;

    /* renamed from: o */
    Button f474o;

    /* renamed from: p */
    private CharSequence f475p;

    /* renamed from: q */
    Message f476q;

    /* renamed from: r */
    private Drawable f477r;

    /* renamed from: s */
    Button f478s;

    /* renamed from: t */
    private CharSequence f479t;

    /* renamed from: u */
    Message f480u;

    /* renamed from: v */
    private Drawable f481v;

    /* renamed from: w */
    Button f482w;

    /* renamed from: x */
    private CharSequence f483x;

    /* renamed from: y */
    Message f484y;

    /* renamed from: z */
    private Drawable f485z;

    public static class RecycleListView extends ListView {

        /* renamed from: f */
        private final int f486f;

        /* renamed from: g */
        private final int f487g;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2591j.f18821c2);
            this.f487g = obtainStyledAttributes.getDimensionPixelOffset(C2591j.f18826d2, -1);
            this.f486f = obtainStyledAttributes.getDimensionPixelOffset(C2591j.f18831e2, -1);
        }

        /* renamed from: a */
        public void mo578a(boolean z, boolean z2) {
            if (!z2 || !z) {
                setPadding(getPaddingLeft(), z ? getPaddingTop() : this.f486f, getPaddingRight(), z2 ? getPaddingBottom() : this.f487g);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$a */
    class C0233a implements View.OnClickListener {
        C0233a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
            r3 = r0.f484y;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r3) {
            /*
                r2 = this;
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r1 = r0.f474o
                if (r3 != r1) goto L_0x000f
                android.os.Message r1 = r0.f476q
                if (r1 == 0) goto L_0x000f
            L_0x000a:
                android.os.Message r3 = android.os.Message.obtain(r1)
                goto L_0x0026
            L_0x000f:
                android.widget.Button r1 = r0.f478s
                if (r3 != r1) goto L_0x0018
                android.os.Message r1 = r0.f480u
                if (r1 == 0) goto L_0x0018
                goto L_0x000a
            L_0x0018:
                android.widget.Button r1 = r0.f482w
                if (r3 != r1) goto L_0x0025
                android.os.Message r3 = r0.f484y
                if (r3 == 0) goto L_0x0025
                android.os.Message r3 = android.os.Message.obtain(r3)
                goto L_0x0026
            L_0x0025:
                r3 = 0
            L_0x0026:
                if (r3 == 0) goto L_0x002b
                r3.sendToTarget()
            L_0x002b:
                androidx.appcompat.app.AlertController r3 = androidx.appcompat.app.AlertController.this
                android.os.Handler r0 = r3.f458R
                r1 = 1
                androidx.appcompat.app.h r3 = r3.f461b
                android.os.Message r3 = r0.obtainMessage(r1, r3)
                r3.sendToTarget()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.C0233a.onClick(android.view.View):void");
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$b */
    class C0234b implements NestedScrollView.C0858c {

        /* renamed from: a */
        final /* synthetic */ View f489a;

        /* renamed from: b */
        final /* synthetic */ View f490b;

        C0234b(View view, View view2) {
            this.f489a = view;
            this.f490b = view2;
        }

        /* renamed from: a */
        public void mo580a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
            AlertController.m716f(nestedScrollView, this.f489a, this.f490b);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$c */
    class C0235c implements Runnable {

        /* renamed from: f */
        final /* synthetic */ View f492f;

        /* renamed from: g */
        final /* synthetic */ View f493g;

        C0235c(View view, View view2) {
            this.f492f = view;
            this.f493g = view2;
        }

        public void run() {
            AlertController.m716f(AlertController.this.f441A, this.f492f, this.f493g);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$d */
    class C0236d implements AbsListView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ View f495a;

        /* renamed from: b */
        final /* synthetic */ View f496b;

        C0236d(View view, View view2) {
            this.f495a = view;
            this.f496b = view2;
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            AlertController.m716f(absListView, this.f495a, this.f496b);
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$e */
    class C0237e implements Runnable {

        /* renamed from: f */
        final /* synthetic */ View f498f;

        /* renamed from: g */
        final /* synthetic */ View f499g;

        C0237e(View view, View view2) {
            this.f498f = view;
            this.f499g = view2;
        }

        public void run() {
            AlertController.m716f(AlertController.this.f466g, this.f498f, this.f499g);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$f */
    public static class C0238f {

        /* renamed from: A */
        public int f501A;

        /* renamed from: B */
        public int f502B;

        /* renamed from: C */
        public int f503C;

        /* renamed from: D */
        public int f504D;

        /* renamed from: E */
        public boolean f505E = false;

        /* renamed from: F */
        public boolean[] f506F;

        /* renamed from: G */
        public boolean f507G;

        /* renamed from: H */
        public boolean f508H;

        /* renamed from: I */
        public int f509I = -1;

        /* renamed from: J */
        public DialogInterface.OnMultiChoiceClickListener f510J;

        /* renamed from: K */
        public Cursor f511K;

        /* renamed from: L */
        public String f512L;

        /* renamed from: M */
        public String f513M;

        /* renamed from: N */
        public AdapterView.OnItemSelectedListener f514N;

        /* renamed from: O */
        public C0243e f515O;

        /* renamed from: P */
        public boolean f516P = true;

        /* renamed from: a */
        public final Context f517a;

        /* renamed from: b */
        public final LayoutInflater f518b;

        /* renamed from: c */
        public int f519c = 0;

        /* renamed from: d */
        public Drawable f520d;

        /* renamed from: e */
        public int f521e = 0;

        /* renamed from: f */
        public CharSequence f522f;

        /* renamed from: g */
        public View f523g;

        /* renamed from: h */
        public CharSequence f524h;

        /* renamed from: i */
        public CharSequence f525i;

        /* renamed from: j */
        public Drawable f526j;

        /* renamed from: k */
        public DialogInterface.OnClickListener f527k;

        /* renamed from: l */
        public CharSequence f528l;

        /* renamed from: m */
        public Drawable f529m;

        /* renamed from: n */
        public DialogInterface.OnClickListener f530n;

        /* renamed from: o */
        public CharSequence f531o;

        /* renamed from: p */
        public Drawable f532p;

        /* renamed from: q */
        public DialogInterface.OnClickListener f533q;

        /* renamed from: r */
        public boolean f534r;

        /* renamed from: s */
        public DialogInterface.OnCancelListener f535s;

        /* renamed from: t */
        public DialogInterface.OnDismissListener f536t;

        /* renamed from: u */
        public DialogInterface.OnKeyListener f537u;

        /* renamed from: v */
        public CharSequence[] f538v;

        /* renamed from: w */
        public ListAdapter f539w;

        /* renamed from: x */
        public DialogInterface.OnClickListener f540x;

        /* renamed from: y */
        public int f541y;

        /* renamed from: z */
        public View f542z;

        /* renamed from: androidx.appcompat.app.AlertController$f$a */
        class C0239a extends ArrayAdapter<CharSequence> {

            /* renamed from: f */
            final /* synthetic */ RecycleListView f543f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0239a(Context context, int i, int i2, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i, i2, charSequenceArr);
                this.f543f = recycleListView;
            }

            public View getView(int i, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i, view, viewGroup);
                boolean[] zArr = C0238f.this.f506F;
                if (zArr != null && zArr[i]) {
                    this.f543f.setItemChecked(i, true);
                }
                return view2;
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$b */
        class C0240b extends CursorAdapter {

            /* renamed from: f */
            private final int f545f;

            /* renamed from: g */
            private final int f546g;

            /* renamed from: h */
            final /* synthetic */ RecycleListView f547h;

            /* renamed from: i */
            final /* synthetic */ AlertController f548i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0240b(Context context, Cursor cursor, boolean z, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z);
                this.f547h = recycleListView;
                this.f548i = alertController;
                Cursor cursor2 = getCursor();
                this.f545f = cursor2.getColumnIndexOrThrow(C0238f.this.f512L);
                this.f546g = cursor2.getColumnIndexOrThrow(C0238f.this.f513M);
            }

            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.f545f));
                RecycleListView recycleListView = this.f547h;
                int position = cursor.getPosition();
                boolean z = true;
                if (cursor.getInt(this.f546g) != 1) {
                    z = false;
                }
                recycleListView.setItemChecked(position, z);
            }

            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return C0238f.this.f518b.inflate(this.f548i.f453M, viewGroup, false);
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$c */
        class C0241c implements AdapterView.OnItemClickListener {

            /* renamed from: f */
            final /* synthetic */ AlertController f550f;

            C0241c(AlertController alertController) {
                this.f550f = alertController;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                C0238f.this.f540x.onClick(this.f550f.f461b, i);
                if (!C0238f.this.f508H) {
                    this.f550f.f461b.dismiss();
                }
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$d */
        class C0242d implements AdapterView.OnItemClickListener {

            /* renamed from: f */
            final /* synthetic */ RecycleListView f552f;

            /* renamed from: g */
            final /* synthetic */ AlertController f553g;

            C0242d(RecycleListView recycleListView, AlertController alertController) {
                this.f552f = recycleListView;
                this.f553g = alertController;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                boolean[] zArr = C0238f.this.f506F;
                if (zArr != null) {
                    zArr[i] = this.f552f.isItemChecked(i);
                }
                C0238f.this.f510J.onClick(this.f553g.f461b, i, this.f552f.isItemChecked(i));
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$e */
        public interface C0243e {
            /* renamed from: a */
            void mo591a(ListView listView);
        }

        public C0238f(Context context) {
            this.f517a = context;
            this.f534r = true;
            this.f518b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* JADX WARNING: type inference failed for: r9v0, types: [android.widget.ListAdapter] */
        /* JADX WARNING: type inference failed for: r9v3 */
        /* JADX WARNING: type inference failed for: r9v4 */
        /* JADX WARNING: type inference failed for: r2v5, types: [android.widget.SimpleCursorAdapter] */
        /* JADX WARNING: type inference failed for: r1v24, types: [androidx.appcompat.app.AlertController$f$b] */
        /* JADX WARNING: type inference failed for: r1v25, types: [androidx.appcompat.app.AlertController$f$a] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0093  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x009a  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x009e  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m742b(androidx.appcompat.app.AlertController r11) {
            /*
                r10 = this;
                android.view.LayoutInflater r0 = r10.f518b
                int r1 = r11.f452L
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r2)
                androidx.appcompat.app.AlertController$RecycleListView r0 = (androidx.appcompat.app.AlertController.RecycleListView) r0
                boolean r1 = r10.f507G
                r8 = 1
                if (r1 == 0) goto L_0x0035
                android.database.Cursor r1 = r10.f511K
                if (r1 != 0) goto L_0x0026
                androidx.appcompat.app.AlertController$f$a r9 = new androidx.appcompat.app.AlertController$f$a
                android.content.Context r3 = r10.f517a
                int r4 = r11.f453M
                r5 = 16908308(0x1020014, float:2.3877285E-38)
                java.lang.CharSequence[] r6 = r10.f538v
                r1 = r9
                r2 = r10
                r7 = r0
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x006b
            L_0x0026:
                androidx.appcompat.app.AlertController$f$b r9 = new androidx.appcompat.app.AlertController$f$b
                android.content.Context r3 = r10.f517a
                android.database.Cursor r4 = r10.f511K
                r5 = 0
                r1 = r9
                r2 = r10
                r6 = r0
                r7 = r11
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x006b
            L_0x0035:
                boolean r1 = r10.f508H
                if (r1 == 0) goto L_0x003c
                int r1 = r11.f454N
                goto L_0x003e
            L_0x003c:
                int r1 = r11.f455O
            L_0x003e:
                r4 = r1
                android.database.Cursor r1 = r10.f511K
                r2 = 16908308(0x1020014, float:2.3877285E-38)
                if (r1 == 0) goto L_0x005d
                android.widget.SimpleCursorAdapter r9 = new android.widget.SimpleCursorAdapter
                android.content.Context r3 = r10.f517a
                android.database.Cursor r5 = r10.f511K
                java.lang.String[] r6 = new java.lang.String[r8]
                java.lang.String r1 = r10.f512L
                r7 = 0
                r6[r7] = r1
                int[] r1 = new int[r8]
                r1[r7] = r2
                r2 = r9
                r7 = r1
                r2.<init>(r3, r4, r5, r6, r7)
                goto L_0x006b
            L_0x005d:
                android.widget.ListAdapter r9 = r10.f539w
                if (r9 == 0) goto L_0x0062
                goto L_0x006b
            L_0x0062:
                androidx.appcompat.app.AlertController$h r9 = new androidx.appcompat.app.AlertController$h
                android.content.Context r1 = r10.f517a
                java.lang.CharSequence[] r3 = r10.f538v
                r9.<init>(r1, r4, r2, r3)
            L_0x006b:
                androidx.appcompat.app.AlertController$f$e r1 = r10.f515O
                if (r1 == 0) goto L_0x0072
                r1.mo591a(r0)
            L_0x0072:
                r11.f448H = r9
                int r1 = r10.f509I
                r11.f449I = r1
                android.content.DialogInterface$OnClickListener r1 = r10.f540x
                if (r1 == 0) goto L_0x0085
                androidx.appcompat.app.AlertController$f$c r1 = new androidx.appcompat.app.AlertController$f$c
                r1.<init>(r11)
            L_0x0081:
                r0.setOnItemClickListener(r1)
                goto L_0x008f
            L_0x0085:
                android.content.DialogInterface$OnMultiChoiceClickListener r1 = r10.f510J
                if (r1 == 0) goto L_0x008f
                androidx.appcompat.app.AlertController$f$d r1 = new androidx.appcompat.app.AlertController$f$d
                r1.<init>(r0, r11)
                goto L_0x0081
            L_0x008f:
                android.widget.AdapterView$OnItemSelectedListener r1 = r10.f514N
                if (r1 == 0) goto L_0x0096
                r0.setOnItemSelectedListener(r1)
            L_0x0096:
                boolean r1 = r10.f508H
                if (r1 == 0) goto L_0x009e
                r0.setChoiceMode(r8)
                goto L_0x00a6
            L_0x009e:
                boolean r1 = r10.f507G
                if (r1 == 0) goto L_0x00a6
                r1 = 2
                r0.setChoiceMode(r1)
            L_0x00a6:
                r11.f466g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.C0238f.m742b(androidx.appcompat.app.AlertController):void");
        }

        /* renamed from: a */
        public void mo585a(AlertController alertController) {
            View view = this.f523g;
            if (view != null) {
                alertController.mo570l(view);
            } else {
                CharSequence charSequence = this.f522f;
                if (charSequence != null) {
                    alertController.mo574q(charSequence);
                }
                Drawable drawable = this.f520d;
                if (drawable != null) {
                    alertController.mo572n(drawable);
                }
                int i = this.f519c;
                if (i != 0) {
                    alertController.mo571m(i);
                }
                int i2 = this.f521e;
                if (i2 != 0) {
                    alertController.mo571m(alertController.mo564c(i2));
                }
            }
            CharSequence charSequence2 = this.f524h;
            if (charSequence2 != null) {
                alertController.mo573o(charSequence2);
            }
            CharSequence charSequence3 = this.f525i;
            if (!(charSequence3 == null && this.f526j == null)) {
                alertController.mo569k(-1, charSequence3, this.f527k, (Message) null, this.f526j);
            }
            CharSequence charSequence4 = this.f528l;
            if (!(charSequence4 == null && this.f529m == null)) {
                alertController.mo569k(-2, charSequence4, this.f530n, (Message) null, this.f529m);
            }
            CharSequence charSequence5 = this.f531o;
            if (!(charSequence5 == null && this.f532p == null)) {
                alertController.mo569k(-3, charSequence5, this.f533q, (Message) null, this.f532p);
            }
            if (!(this.f538v == null && this.f511K == null && this.f539w == null)) {
                m742b(alertController);
            }
            View view2 = this.f542z;
            if (view2 == null) {
                int i3 = this.f541y;
                if (i3 != 0) {
                    alertController.mo575r(i3);
                }
            } else if (this.f505E) {
                alertController.mo577t(view2, this.f501A, this.f502B, this.f503C, this.f504D);
            } else {
                alertController.mo576s(view2);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$g */
    private static final class C0244g extends Handler {

        /* renamed from: a */
        private WeakReference<DialogInterface> f555a;

        public C0244g(DialogInterface dialogInterface) {
            this.f555a = new WeakReference<>(dialogInterface);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f555a.get(), message.what);
            } else if (i == 1) {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$h */
    private static class C0245h extends ArrayAdapter<CharSequence> {
        public C0245h(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, i2, charSequenceArr);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, C0284h hVar, Window window) {
        this.f460a = context;
        this.f461b = hVar;
        this.f462c = window;
        this.f458R = new C0244g(hVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, C2591j.f18723F, C2582a.alertDialogStyle, 0);
        this.f450J = obtainStyledAttributes.getResourceId(C2591j.f18728G, 0);
        this.f451K = obtainStyledAttributes.getResourceId(C2591j.f18736I, 0);
        this.f452L = obtainStyledAttributes.getResourceId(C2591j.f18744K, 0);
        this.f453M = obtainStyledAttributes.getResourceId(C2591j.f18748L, 0);
        this.f454N = obtainStyledAttributes.getResourceId(C2591j.f18756N, 0);
        this.f455O = obtainStyledAttributes.getResourceId(C2591j.f18740J, 0);
        this.f456P = obtainStyledAttributes.getBoolean(C2591j.f18752M, true);
        this.f463d = obtainStyledAttributes.getDimensionPixelSize(C2591j.f18732H, 0);
        obtainStyledAttributes.recycle();
        hVar.mo769m(1);
    }

    /* renamed from: a */
    static boolean m714a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m714a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m715b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* renamed from: f */
    static void m716f(View view, View view2, View view3) {
        int i = 0;
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            if (!view.canScrollVertically(1)) {
                i = 4;
            }
            view3.setVisibility(i);
        }
    }

    /* renamed from: i */
    private ViewGroup m717i(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* renamed from: j */
    private int m718j() {
        int i = this.f451K;
        return i == 0 ? this.f450J : this.f457Q == 1 ? i : this.f450J;
    }

    /* renamed from: p */
    private void m719p(ViewGroup viewGroup, View view, int i, int i2) {
        View findViewById = this.f462c.findViewById(C2587f.scrollIndicatorUp);
        View findViewById2 = this.f462c.findViewById(C2587f.scrollIndicatorDown);
        if (Build.VERSION.SDK_INT >= 23) {
            C0833y.m3340Y(view, i, i2);
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 == null) {
                return;
            }
        } else {
            if (findViewById != null && (i & 1) == 0) {
                viewGroup.removeView(findViewById);
                findViewById = null;
            }
            if (findViewById2 != null && (i & 2) == 0) {
                viewGroup.removeView(findViewById2);
                findViewById2 = null;
            }
            if (findViewById != null || findViewById2 != null) {
                if (this.f465f != null) {
                    this.f441A.setOnScrollChangeListener(new C0234b(findViewById, findViewById2));
                    this.f441A.post(new C0235c(findViewById, findViewById2));
                    return;
                }
                ListView listView = this.f466g;
                if (listView != null) {
                    listView.setOnScrollListener(new C0236d(findViewById, findViewById2));
                    this.f466g.post(new C0237e(findViewById, findViewById2));
                    return;
                }
                if (findViewById != null) {
                    viewGroup.removeView(findViewById);
                }
                if (findViewById2 == null) {
                    return;
                }
            } else {
                return;
            }
        }
        viewGroup.removeView(findViewById2);
    }

    /* renamed from: u */
    private void m720u(ViewGroup viewGroup) {
        boolean z;
        Button button;
        Button button2 = (Button) viewGroup.findViewById(16908313);
        this.f474o = button2;
        button2.setOnClickListener(this.f459S);
        boolean z2 = true;
        if (!TextUtils.isEmpty(this.f475p) || this.f477r != null) {
            this.f474o.setText(this.f475p);
            Drawable drawable = this.f477r;
            if (drawable != null) {
                int i = this.f463d;
                drawable.setBounds(0, 0, i, i);
                this.f474o.setCompoundDrawables(this.f477r, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f474o.setVisibility(0);
            z = true;
        } else {
            this.f474o.setVisibility(8);
            z = false;
        }
        Button button3 = (Button) viewGroup.findViewById(16908314);
        this.f478s = button3;
        button3.setOnClickListener(this.f459S);
        if (!TextUtils.isEmpty(this.f479t) || this.f481v != null) {
            this.f478s.setText(this.f479t);
            Drawable drawable2 = this.f481v;
            if (drawable2 != null) {
                int i2 = this.f463d;
                drawable2.setBounds(0, 0, i2, i2);
                this.f478s.setCompoundDrawables(this.f481v, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f478s.setVisibility(0);
            z |= true;
        } else {
            this.f478s.setVisibility(8);
        }
        Button button4 = (Button) viewGroup.findViewById(16908315);
        this.f482w = button4;
        button4.setOnClickListener(this.f459S);
        if (!TextUtils.isEmpty(this.f483x) || this.f485z != null) {
            this.f482w.setText(this.f483x);
            Drawable drawable3 = this.f485z;
            if (drawable3 != null) {
                int i3 = this.f463d;
                drawable3.setBounds(0, 0, i3, i3);
                this.f482w.setCompoundDrawables(this.f485z, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f482w.setVisibility(0);
            z |= true;
        } else {
            this.f482w.setVisibility(8);
        }
        if (m725z(this.f460a)) {
            if (z) {
                button = this.f474o;
            } else if (z) {
                button = this.f478s;
            } else if (z) {
                button = this.f482w;
            }
            m715b(button);
        }
        if (!z) {
            z2 = false;
        }
        if (!z2) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: v */
    private void m721v(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f462c.findViewById(C2587f.scrollView);
        this.f441A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.f441A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(16908299);
        this.f446F = textView;
        if (textView != null) {
            CharSequence charSequence = this.f465f;
            if (charSequence != null) {
                textView.setText(charSequence);
                return;
            }
            textView.setVisibility(8);
            this.f441A.removeView(this.f446F);
            if (this.f466g != null) {
                ViewGroup viewGroup2 = (ViewGroup) this.f441A.getParent();
                int indexOfChild = viewGroup2.indexOfChild(this.f441A);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(this.f466g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                return;
            }
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: w */
    private void m722w(ViewGroup viewGroup) {
        View view = this.f467h;
        boolean z = false;
        if (view == null) {
            view = this.f468i != 0 ? LayoutInflater.from(this.f460a).inflate(this.f468i, viewGroup, false) : null;
        }
        if (view != null) {
            z = true;
        }
        if (!z || !m714a(view)) {
            this.f462c.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) this.f462c.findViewById(C2587f.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (this.f473n) {
                frameLayout.setPadding(this.f469j, this.f470k, this.f471l, this.f472m);
            }
            if (this.f466g != null) {
                ((C0482m0.C0483a) viewGroup.getLayoutParams()).weight = 0.0f;
                return;
            }
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* renamed from: x */
    private void m723x(ViewGroup viewGroup) {
        if (this.f447G != null) {
            viewGroup.addView(this.f447G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f462c.findViewById(C2587f.title_template).setVisibility(8);
            return;
        }
        this.f444D = (ImageView) this.f462c.findViewById(16908294);
        if (!(!TextUtils.isEmpty(this.f464e)) || !this.f456P) {
            this.f462c.findViewById(C2587f.title_template).setVisibility(8);
            this.f444D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f462c.findViewById(C2587f.alertTitle);
        this.f445E = textView;
        textView.setText(this.f464e);
        int i = this.f442B;
        if (i != 0) {
            this.f444D.setImageResource(i);
            return;
        }
        Drawable drawable = this.f443C;
        if (drawable != null) {
            this.f444D.setImageDrawable(drawable);
            return;
        }
        this.f445E.setPadding(this.f444D.getPaddingLeft(), this.f444D.getPaddingTop(), this.f444D.getPaddingRight(), this.f444D.getPaddingBottom());
        this.f444D.setVisibility(8);
    }

    /* renamed from: y */
    private void m724y() {
        ListAdapter listAdapter;
        View findViewById;
        View findViewById2;
        View findViewById3 = this.f462c.findViewById(C2587f.parentPanel);
        int i = C2587f.topPanel;
        View findViewById4 = findViewById3.findViewById(i);
        int i2 = C2587f.contentPanel;
        View findViewById5 = findViewById3.findViewById(i2);
        int i3 = C2587f.buttonPanel;
        View findViewById6 = findViewById3.findViewById(i3);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(C2587f.customPanel);
        m722w(viewGroup);
        View findViewById7 = viewGroup.findViewById(i);
        View findViewById8 = viewGroup.findViewById(i2);
        View findViewById9 = viewGroup.findViewById(i3);
        ViewGroup i4 = m717i(findViewById7, findViewById4);
        ViewGroup i5 = m717i(findViewById8, findViewById5);
        ViewGroup i6 = m717i(findViewById9, findViewById6);
        m721v(i5);
        m720u(i6);
        m723x(i4);
        char c = 0;
        boolean z = viewGroup.getVisibility() != 8;
        boolean z2 = (i4 == null || i4.getVisibility() == 8) ? false : true;
        boolean z3 = (i6 == null || i6.getVisibility() == 8) ? false : true;
        if (!(z3 || i5 == null || (findViewById2 = i5.findViewById(C2587f.textSpacerNoButtons)) == null)) {
            findViewById2.setVisibility(0);
        }
        if (z2) {
            NestedScrollView nestedScrollView = this.f441A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View view = null;
            if (!(this.f465f == null && this.f466g == null)) {
                view = i4.findViewById(C2587f.titleDividerNoCustom);
            }
            if (view != null) {
                view.setVisibility(0);
            }
        } else if (!(i5 == null || (findViewById = i5.findViewById(C2587f.textSpacerNoTitle)) == null)) {
            findViewById.setVisibility(0);
        }
        ListView listView = this.f466g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).mo578a(z2, z3);
        }
        if (!z) {
            View view2 = this.f466g;
            if (view2 == null) {
                view2 = this.f441A;
            }
            if (view2 != null) {
                if (z3) {
                    c = 2;
                }
                m719p(i5, view2, z2 | c ? 1 : 0, 3);
            }
        }
        ListView listView2 = this.f466g;
        if (listView2 != null && (listAdapter = this.f448H) != null) {
            listView2.setAdapter(listAdapter);
            int i7 = this.f449I;
            if (i7 > -1) {
                listView2.setItemChecked(i7, true);
                listView2.setSelection(i7);
            }
        }
    }

    /* renamed from: z */
    private static boolean m725z(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C2582a.alertDialogCenterButtons, typedValue, true);
        return typedValue.data != 0;
    }

    /* renamed from: c */
    public int mo564c(int i) {
        TypedValue typedValue = new TypedValue();
        this.f460a.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: d */
    public ListView mo565d() {
        return this.f466g;
    }

    /* renamed from: e */
    public void mo566e() {
        this.f461b.setContentView(m718j());
        m724y();
    }

    /* renamed from: g */
    public boolean mo567g(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f441A;
        return nestedScrollView != null && nestedScrollView.mo3035r(keyEvent);
    }

    /* renamed from: h */
    public boolean mo568h(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f441A;
        return nestedScrollView != null && nestedScrollView.mo3035r(keyEvent);
    }

    /* renamed from: k */
    public void mo569k(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f458R.obtainMessage(i, onClickListener);
        }
        if (i == -3) {
            this.f483x = charSequence;
            this.f484y = message;
            this.f485z = drawable;
        } else if (i == -2) {
            this.f479t = charSequence;
            this.f480u = message;
            this.f481v = drawable;
        } else if (i == -1) {
            this.f475p = charSequence;
            this.f476q = message;
            this.f477r = drawable;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }

    /* renamed from: l */
    public void mo570l(View view) {
        this.f447G = view;
    }

    /* renamed from: m */
    public void mo571m(int i) {
        this.f443C = null;
        this.f442B = i;
        ImageView imageView = this.f444D;
        if (imageView == null) {
            return;
        }
        if (i != 0) {
            imageView.setVisibility(0);
            this.f444D.setImageResource(this.f442B);
            return;
        }
        imageView.setVisibility(8);
    }

    /* renamed from: n */
    public void mo572n(Drawable drawable) {
        this.f443C = drawable;
        this.f442B = 0;
        ImageView imageView = this.f444D;
        if (imageView == null) {
            return;
        }
        if (drawable != null) {
            imageView.setVisibility(0);
            this.f444D.setImageDrawable(drawable);
            return;
        }
        imageView.setVisibility(8);
    }

    /* renamed from: o */
    public void mo573o(CharSequence charSequence) {
        this.f465f = charSequence;
        TextView textView = this.f446F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: q */
    public void mo574q(CharSequence charSequence) {
        this.f464e = charSequence;
        TextView textView = this.f445E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: r */
    public void mo575r(int i) {
        this.f467h = null;
        this.f468i = i;
        this.f473n = false;
    }

    /* renamed from: s */
    public void mo576s(View view) {
        this.f467h = view;
        this.f468i = 0;
        this.f473n = false;
    }

    /* renamed from: t */
    public void mo577t(View view, int i, int i2, int i3, int i4) {
        this.f467h = view;
        this.f468i = 0;
        this.f473n = true;
        this.f469j = i;
        this.f470k = i2;
        this.f471l = i3;
        this.f472m = i4;
    }
}
