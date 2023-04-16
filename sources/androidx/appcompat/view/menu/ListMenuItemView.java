package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0348n;
import androidx.appcompat.widget.C0415a1;
import androidx.core.view.C0833y;
import p038f.C2582a;
import p038f.C2587f;
import p038f.C2588g;
import p038f.C2591j;

public class ListMenuItemView extends LinearLayout implements C0348n.C0349a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: f */
    private C0334i f834f;

    /* renamed from: g */
    private ImageView f835g;

    /* renamed from: h */
    private RadioButton f836h;

    /* renamed from: i */
    private TextView f837i;

    /* renamed from: j */
    private CheckBox f838j;

    /* renamed from: k */
    private TextView f839k;

    /* renamed from: l */
    private ImageView f840l;

    /* renamed from: m */
    private ImageView f841m;

    /* renamed from: n */
    private LinearLayout f842n;

    /* renamed from: o */
    private Drawable f843o;

    /* renamed from: p */
    private int f844p;

    /* renamed from: q */
    private Context f845q;

    /* renamed from: r */
    private boolean f846r;

    /* renamed from: s */
    private Drawable f847s;

    /* renamed from: t */
    private boolean f848t;

    /* renamed from: u */
    private LayoutInflater f849u;

    /* renamed from: v */
    private boolean f850v;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2582a.listMenuViewStyle);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        C0415a1 u = C0415a1.m1660u(getContext(), attributeSet, C2591j.f18782T1, i, 0);
        this.f843o = u.mo1771f(C2591j.f18790V1);
        this.f844p = u.mo1778m(C2591j.f18786U1, -1);
        this.f846r = u.mo1766a(C2591j.f18794W1, false);
        this.f845q = context;
        this.f847s = u.mo1771f(C2591j.f18798X1);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, new int[]{16843049}, C2582a.dropDownListViewStyle, 0);
        this.f848t = obtainStyledAttributes.hasValue(0);
        u.mo1784v();
        obtainStyledAttributes.recycle();
    }

    /* renamed from: b */
    private void m1157b(View view) {
        m1158c(view, -1);
    }

    /* renamed from: c */
    private void m1158c(View view, int i) {
        LinearLayout linearLayout = this.f842n;
        if (linearLayout != null) {
            linearLayout.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    /* renamed from: d */
    private void m1159d() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(C2588g.abc_list_menu_item_checkbox, this, false);
        this.f838j = checkBox;
        m1157b(checkBox);
    }

    /* renamed from: f */
    private void m1160f() {
        ImageView imageView = (ImageView) getInflater().inflate(C2588g.abc_list_menu_item_icon, this, false);
        this.f835g = imageView;
        m1158c(imageView, 0);
    }

    /* renamed from: g */
    private void m1161g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(C2588g.abc_list_menu_item_radio, this, false);
        this.f836h = radioButton;
        m1157b(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.f849u == null) {
            this.f849u = LayoutInflater.from(getContext());
        }
        return this.f849u;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f840l;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    /* renamed from: a */
    public boolean mo898a() {
        return false;
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f841m;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f841m.getLayoutParams();
            rect.top += this.f841m.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
    }

    /* renamed from: e */
    public void mo901e(C0334i iVar, int i) {
        this.f834f = iVar;
        setVisibility(iVar.isVisible() ? 0 : 8);
        setTitle(iVar.mo1156i(this));
        setCheckable(iVar.isCheckable());
        mo927h(iVar.mo1137A(), iVar.mo1141g());
        setIcon(iVar.getIcon());
        setEnabled(iVar.isEnabled());
        setSubMenuArrowVisible(iVar.hasSubMenu());
        setContentDescription(iVar.getContentDescription());
    }

    public C0334i getItemData() {
        return this.f834f;
    }

    /* renamed from: h */
    public void mo927h(boolean z, char c) {
        int i = (!z || !this.f834f.mo1137A()) ? 8 : 0;
        if (i == 0) {
            this.f839k.setText(this.f834f.mo1154h());
        }
        if (this.f839k.getVisibility() != i) {
            this.f839k.setVisibility(i);
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        C0833y.m3333R(this, this.f843o);
        TextView textView = (TextView) findViewById(C2587f.f18697M);
        this.f837i = textView;
        int i = this.f844p;
        if (i != -1) {
            textView.setTextAppearance(this.f845q, i);
        }
        this.f839k = (TextView) findViewById(C2587f.shortcut);
        ImageView imageView = (ImageView) findViewById(C2587f.submenuarrow);
        this.f840l = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f847s);
        }
        this.f841m = (ImageView) findViewById(C2587f.group_divider);
        this.f842n = (LinearLayout) findViewById(C2587f.content);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f835g != null && this.f846r) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f835g.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (z || this.f836h != null || this.f838j != null) {
            if (this.f834f.mo1164m()) {
                if (this.f836h == null) {
                    m1161g();
                }
                compoundButton2 = this.f836h;
                compoundButton = this.f838j;
            } else {
                if (this.f838j == null) {
                    m1159d();
                }
                compoundButton2 = this.f838j;
                compoundButton = this.f836h;
            }
            if (z) {
                compoundButton2.setChecked(this.f834f.isChecked());
                if (compoundButton2.getVisibility() != 0) {
                    compoundButton2.setVisibility(0);
                }
                if (compoundButton != null && compoundButton.getVisibility() != 8) {
                    compoundButton.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox = this.f838j;
            if (checkBox != null) {
                checkBox.setVisibility(8);
            }
            RadioButton radioButton = this.f836h;
            if (radioButton != null) {
                radioButton.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f834f.mo1164m()) {
            if (this.f836h == null) {
                m1161g();
            }
            compoundButton = this.f836h;
        } else {
            if (this.f838j == null) {
                m1159d();
            }
            compoundButton = this.f838j;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f850v = z;
        this.f846r = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f841m;
        if (imageView != null) {
            imageView.setVisibility((this.f848t || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.f834f.mo1194z() || this.f850v;
        if (z || this.f846r) {
            ImageView imageView = this.f835g;
            if (imageView != null || drawable != null || this.f846r) {
                if (imageView == null) {
                    m1160f();
                }
                if (drawable != null || this.f846r) {
                    ImageView imageView2 = this.f835g;
                    if (!z) {
                        drawable = null;
                    }
                    imageView2.setImageDrawable(drawable);
                    if (this.f835g.getVisibility() != 0) {
                        this.f835g.setVisibility(0);
                        return;
                    }
                    return;
                }
                this.f835g.setVisibility(8);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView;
        int i;
        if (charSequence != null) {
            this.f837i.setText(charSequence);
            if (this.f837i.getVisibility() != 0) {
                textView = this.f837i;
                i = 0;
            } else {
                return;
            }
        } else {
            i = 8;
            if (this.f837i.getVisibility() != 8) {
                textView = this.f837i;
            } else {
                return;
            }
        }
        textView.setVisibility(i);
    }
}
