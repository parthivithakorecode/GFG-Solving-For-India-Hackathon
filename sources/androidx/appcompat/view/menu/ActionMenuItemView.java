package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.view.menu.C0330g;
import androidx.appcompat.view.menu.C0348n;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.C0441d0;
import androidx.appcompat.widget.C0442d1;
import androidx.appcompat.widget.C0478l0;
import p038f.C2591j;

public class ActionMenuItemView extends C0441d0 implements C0348n.C0349a, View.OnClickListener, ActionMenuView.C0364a {

    /* renamed from: l */
    C0334i f819l;

    /* renamed from: m */
    private CharSequence f820m;

    /* renamed from: n */
    private Drawable f821n;

    /* renamed from: o */
    C0330g.C0332b f822o;

    /* renamed from: p */
    private C0478l0 f823p;

    /* renamed from: q */
    C0317b f824q;

    /* renamed from: r */
    private boolean f825r;

    /* renamed from: s */
    private boolean f826s;

    /* renamed from: t */
    private int f827t;

    /* renamed from: u */
    private int f828u;

    /* renamed from: v */
    private int f829v;

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$a */
    private class C0316a extends C0478l0 {
        public C0316a() {
            super(ActionMenuItemView.this);
        }

        /* renamed from: b */
        public C0351p mo918b() {
            C0317b bVar = ActionMenuItemView.this.f824q;
            if (bVar != null) {
                return bVar.mo920a();
            }
            return null;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
            r0 = mo918b();
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo919c() {
            /*
                r3 = this;
                androidx.appcompat.view.menu.ActionMenuItemView r0 = androidx.appcompat.view.menu.ActionMenuItemView.this
                androidx.appcompat.view.menu.g$b r1 = r0.f822o
                r2 = 0
                if (r1 == 0) goto L_0x001c
                androidx.appcompat.view.menu.i r0 = r0.f819l
                boolean r0 = r1.mo921a(r0)
                if (r0 == 0) goto L_0x001c
                androidx.appcompat.view.menu.p r0 = r3.mo918b()
                if (r0 == 0) goto L_0x001c
                boolean r0 = r0.mo1017c()
                if (r0 == 0) goto L_0x001c
                r2 = 1
            L_0x001c:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ActionMenuItemView.C0316a.mo919c():boolean");
        }
    }

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$b */
    public static abstract class C0317b {
        /* renamed from: a */
        public abstract C0351p mo920a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f825r = m1145q();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2591j.f18913v, i, 0);
        this.f827t = obtainStyledAttributes.getDimensionPixelSize(C2591j.f18918w, 0);
        obtainStyledAttributes.recycle();
        this.f829v = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f828u = -1;
        setSaveEnabled(false);
    }

    /* renamed from: q */
    private boolean m1145q() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    /* renamed from: r */
    private void m1146r() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f820m);
        if (this.f821n != null && (!this.f819l.mo1138B() || (!this.f825r && !this.f826s))) {
            z = false;
        }
        boolean z3 = z2 & z;
        CharSequence charSequence = null;
        setText(z3 ? this.f820m : null);
        CharSequence contentDescription = this.f819l.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            contentDescription = z3 ? null : this.f819l.getTitle();
        }
        setContentDescription(contentDescription);
        CharSequence tooltipText = this.f819l.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            if (!z3) {
                charSequence = this.f819l.getTitle();
            }
            C0442d1.m1804a(this, charSequence);
            return;
        }
        C0442d1.m1804a(this, tooltipText);
    }

    /* renamed from: a */
    public boolean mo898a() {
        return true;
    }

    /* renamed from: b */
    public boolean mo899b() {
        return mo909p();
    }

    /* renamed from: c */
    public boolean mo900c() {
        return mo909p() && this.f819l.getIcon() == null;
    }

    /* renamed from: e */
    public void mo901e(C0334i iVar, int i) {
        this.f819l = iVar;
        setIcon(iVar.getIcon());
        setTitle(iVar.mo1156i(this));
        setId(iVar.getItemId());
        setVisibility(iVar.isVisible() ? 0 : 8);
        setEnabled(iVar.isEnabled());
        if (iVar.hasSubMenu() && this.f823p == null) {
            this.f823p = new C0316a();
        }
    }

    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    public C0334i getItemData() {
        return this.f819l;
    }

    public void onClick(View view) {
        C0330g.C0332b bVar = this.f822o;
        if (bVar != null) {
            bVar.mo921a(this.f819l);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f825r = m1145q();
        m1146r();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        boolean p = mo909p();
        if (p && (i3 = this.f828u) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.f827t) : this.f827t;
        if (mode != 1073741824 && this.f827t > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (!p && this.f821n != null) {
            super.setPadding((getMeasuredWidth() - this.f821n.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState((Parcelable) null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C0478l0 l0Var;
        if (!this.f819l.hasSubMenu() || (l0Var = this.f823p) == null || !l0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    /* renamed from: p */
    public boolean mo909p() {
        return !TextUtils.isEmpty(getText());
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f826s != z) {
            this.f826s = z;
            C0334i iVar = this.f819l;
            if (iVar != null) {
                iVar.mo1139c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f821n = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f829v;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i) / ((float) intrinsicWidth)));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i) / ((float) intrinsicHeight)));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        m1146r();
    }

    public void setItemInvoker(C0330g.C0332b bVar) {
        this.f822o = bVar;
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.f828u = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(C0317b bVar) {
        this.f824q = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f820m = charSequence;
        m1146r();
    }
}
