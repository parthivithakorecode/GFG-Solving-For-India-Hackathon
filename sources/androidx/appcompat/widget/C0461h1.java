package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import p038f.C2585d;
import p038f.C2587f;
import p038f.C2588g;
import p038f.C2590i;

/* renamed from: androidx.appcompat.widget.h1 */
class C0461h1 {

    /* renamed from: a */
    private final Context f1455a;

    /* renamed from: b */
    private final View f1456b;

    /* renamed from: c */
    private final TextView f1457c;

    /* renamed from: d */
    private final WindowManager.LayoutParams f1458d;

    /* renamed from: e */
    private final Rect f1459e = new Rect();

    /* renamed from: f */
    private final int[] f1460f = new int[2];

    /* renamed from: g */
    private final int[] f1461g = new int[2];

    C0461h1(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f1458d = layoutParams;
        this.f1455a = context;
        View inflate = LayoutInflater.from(context).inflate(C2588g.abc_tooltip, (ViewGroup) null);
        this.f1456b = inflate;
        this.f1457c = (TextView) inflate.findViewById(C2587f.message);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = C2590i.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    /* renamed from: a */
    private void m1894a(View view, int i, int i2, boolean z, WindowManager.LayoutParams layoutParams) {
        int i3;
        int i4;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f1455a.getResources().getDimensionPixelOffset(C2585d.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f1455a.getResources().getDimensionPixelOffset(C2585d.tooltip_precise_anchor_extra_offset);
            i4 = i2 + dimensionPixelOffset2;
            i3 = i2 - dimensionPixelOffset2;
        } else {
            i4 = view.getHeight();
            i3 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f1455a.getResources().getDimensionPixelOffset(z ? C2585d.tooltip_y_offset_touch : C2585d.tooltip_y_offset_non_touch);
        View b = m1895b(view);
        if (b == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        b.getWindowVisibleDisplayFrame(this.f1459e);
        Rect rect = this.f1459e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f1455a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f1459e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        b.getLocationOnScreen(this.f1461g);
        view.getLocationOnScreen(this.f1460f);
        int[] iArr = this.f1460f;
        int i5 = iArr[0];
        int[] iArr2 = this.f1461g;
        iArr[0] = i5 - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (iArr[0] + i) - (b.getWidth() / 2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f1456b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f1456b.getMeasuredHeight();
        int[] iArr3 = this.f1460f;
        int i6 = ((iArr3[1] + i3) - dimensionPixelOffset3) - measuredHeight;
        int i7 = iArr3[1] + i4 + dimensionPixelOffset3;
        if (!z ? measuredHeight + i7 > this.f1459e.height() : i6 >= 0) {
            layoutParams.y = i6;
        } else {
            layoutParams.y = i7;
        }
    }

    /* renamed from: b */
    private static View m1895b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo2033c() {
        if (mo2034d()) {
            ((WindowManager) this.f1455a.getSystemService("window")).removeView(this.f1456b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo2034d() {
        return this.f1456b.getParent() != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo2035e(View view, int i, int i2, boolean z, CharSequence charSequence) {
        if (mo2034d()) {
            mo2033c();
        }
        this.f1457c.setText(charSequence);
        m1894a(view, i, i2, z, this.f1458d);
        ((WindowManager) this.f1455a.getSystemService("window")).addView(this.f1456b, this.f1458d);
    }
}
