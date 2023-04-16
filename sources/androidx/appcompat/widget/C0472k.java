package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.C0504q0;
import androidx.core.graphics.C0638a;
import p038f.C2582a;
import p038f.C2584c;
import p038f.C2585d;
import p038f.C2586e;
import p045g.C2620a;

/* renamed from: androidx.appcompat.widget.k */
public final class C0472k {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final PorterDuff.Mode f1500b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    private static C0472k f1501c;

    /* renamed from: a */
    private C0504q0 f1502a;

    /* renamed from: androidx.appcompat.widget.k$a */
    class C0473a implements C0504q0.C0510f {

        /* renamed from: a */
        private final int[] f1503a = {C2586e.abc_textfield_search_default_mtrl_alpha, C2586e.abc_textfield_default_mtrl_alpha, C2586e.abc_ab_share_pack_mtrl_alpha};

        /* renamed from: b */
        private final int[] f1504b = {C2586e.abc_ic_commit_search_api_mtrl_alpha, C2586e.abc_seekbar_tick_mark_material, C2586e.abc_ic_menu_share_mtrl_alpha, C2586e.abc_ic_menu_copy_mtrl_am_alpha, C2586e.abc_ic_menu_cut_mtrl_alpha, C2586e.abc_ic_menu_selectall_mtrl_alpha, C2586e.abc_ic_menu_paste_mtrl_am_alpha};

        /* renamed from: c */
        private final int[] f1505c = {C2586e.abc_textfield_activated_mtrl_alpha, C2586e.abc_textfield_search_activated_mtrl_alpha, C2586e.abc_cab_background_top_mtrl_alpha, C2586e.abc_text_cursor_material, C2586e.abc_text_select_handle_left_mtrl, C2586e.abc_text_select_handle_middle_mtrl, C2586e.abc_text_select_handle_right_mtrl};

        /* renamed from: d */
        private final int[] f1506d = {C2586e.abc_popup_background_mtrl_mult, C2586e.abc_cab_background_internal_bg, C2586e.abc_menu_hardkey_panel_mtrl_mult};

        /* renamed from: e */
        private final int[] f1507e = {C2586e.abc_tab_indicator_material, C2586e.abc_textfield_search_material};

        /* renamed from: f */
        private final int[] f1508f = {C2586e.abc_btn_check_material, C2586e.abc_btn_radio_material, C2586e.abc_btn_check_material_anim, C2586e.abc_btn_radio_material_anim};

        C0473a() {
        }

        /* renamed from: f */
        private boolean m1949f(int[] iArr, int i) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: g */
        private ColorStateList m1950g(Context context) {
            return m1951h(context, 0);
        }

        /* renamed from: h */
        private ColorStateList m1951h(Context context, int i) {
            int c = C0527v0.m2158c(context, C2582a.colorControlHighlight);
            int b = C0527v0.m2157b(context, C2582a.colorButtonNormal);
            return new ColorStateList(new int[][]{C0527v0.f1675b, C0527v0.f1678e, C0527v0.f1676c, C0527v0.f1682i}, new int[]{b, C0638a.m2615c(c, i), C0638a.m2615c(c, i), i});
        }

        /* renamed from: i */
        private ColorStateList m1952i(Context context) {
            return m1951h(context, C0527v0.m2158c(context, C2582a.colorAccent));
        }

        /* renamed from: j */
        private ColorStateList m1953j(Context context) {
            return m1951h(context, C0527v0.m2158c(context, C2582a.colorButtonNormal));
        }

        /* renamed from: k */
        private ColorStateList m1954k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            int i = C2582a.colorSwitchThumbNormal;
            ColorStateList e = C0527v0.m2160e(context, i);
            if (e == null || !e.isStateful()) {
                iArr[0] = C0527v0.f1675b;
                iArr2[0] = C0527v0.m2157b(context, i);
                iArr[1] = C0527v0.f1679f;
                iArr2[1] = C0527v0.m2158c(context, C2582a.colorControlActivated);
                iArr[2] = C0527v0.f1682i;
                iArr2[2] = C0527v0.m2158c(context, i);
            } else {
                iArr[0] = C0527v0.f1675b;
                iArr2[0] = e.getColorForState(iArr[0], 0);
                iArr[1] = C0527v0.f1679f;
                iArr2[1] = C0527v0.m2158c(context, C2582a.colorControlActivated);
                iArr[2] = C0527v0.f1682i;
                iArr2[2] = e.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        /* renamed from: l */
        private LayerDrawable m1955l(C0504q0 q0Var, Context context, int i) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
            Drawable j = q0Var.mo2266j(context, C2586e.abc_star_black_48dp);
            Drawable j2 = q0Var.mo2266j(context, C2586e.abc_star_half_black_48dp);
            if ((j instanceof BitmapDrawable) && j.getIntrinsicWidth() == dimensionPixelSize && j.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable2 = (BitmapDrawable) j;
                bitmapDrawable = new BitmapDrawable(bitmapDrawable2.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                j.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                j.draw(canvas);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
                bitmapDrawable = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable.setTileModeX(Shader.TileMode.REPEAT);
            if ((j2 instanceof BitmapDrawable) && j2.getIntrinsicWidth() == dimensionPixelSize && j2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) j2;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                j2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                j2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable2, bitmapDrawable3, bitmapDrawable});
            layerDrawable.setId(0, 16908288);
            layerDrawable.setId(1, 16908303);
            layerDrawable.setId(2, 16908301);
            return layerDrawable;
        }

        /* renamed from: m */
        private void m1956m(Drawable drawable, int i, PorterDuff.Mode mode) {
            if (C0463i0.m1906a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = C0472k.f1500b;
            }
            drawable.setColorFilter(C0472k.m1942e(i, mode));
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0046  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0061 A[RETURN] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo2121a(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
            /*
                r6 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.C0472k.f1500b
                int[] r1 = r6.f1503a
                boolean r1 = r6.m1949f(r1, r8)
                r2 = 16842801(0x1010031, float:2.3693695E-38)
                r3 = -1
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L_0x0017
                int r2 = p038f.C2582a.colorControlNormal
            L_0x0014:
                r8 = r3
            L_0x0015:
                r1 = r5
                goto L_0x0044
            L_0x0017:
                int[] r1 = r6.f1505c
                boolean r1 = r6.m1949f(r1, r8)
                if (r1 == 0) goto L_0x0022
                int r2 = p038f.C2582a.colorControlActivated
                goto L_0x0014
            L_0x0022:
                int[] r1 = r6.f1506d
                boolean r1 = r6.m1949f(r1, r8)
                if (r1 == 0) goto L_0x002d
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
                goto L_0x0014
            L_0x002d:
                int r1 = p038f.C2586e.abc_list_divider_mtrl_alpha
                if (r8 != r1) goto L_0x003c
                r2 = 16842800(0x1010030, float:2.3693693E-38)
                r8 = 1109603123(0x42233333, float:40.8)
                int r8 = java.lang.Math.round(r8)
                goto L_0x0015
            L_0x003c:
                int r1 = p038f.C2586e.abc_dialog_material_background
                if (r8 != r1) goto L_0x0041
                goto L_0x0014
            L_0x0041:
                r8 = r3
                r1 = r4
                r2 = r1
            L_0x0044:
                if (r1 == 0) goto L_0x0061
                boolean r1 = androidx.appcompat.widget.C0463i0.m1906a(r9)
                if (r1 == 0) goto L_0x0050
                android.graphics.drawable.Drawable r9 = r9.mutate()
            L_0x0050:
                int r7 = androidx.appcompat.widget.C0527v0.m2158c(r7, r2)
                android.graphics.PorterDuffColorFilter r7 = androidx.appcompat.widget.C0472k.m1942e(r7, r0)
                r9.setColorFilter(r7)
                if (r8 == r3) goto L_0x0060
                r9.setAlpha(r8)
            L_0x0060:
                return r5
            L_0x0061:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0472k.C0473a.mo2121a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        /* renamed from: b */
        public PorterDuff.Mode mo2122b(int i) {
            if (i == C2586e.abc_switch_thumb_material) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        /* renamed from: c */
        public Drawable mo2123c(C0504q0 q0Var, Context context, int i) {
            int i2;
            if (i == C2586e.abc_cab_background_top_material) {
                return new LayerDrawable(new Drawable[]{q0Var.mo2266j(context, C2586e.abc_cab_background_internal_bg), q0Var.mo2266j(context, C2586e.abc_cab_background_top_mtrl_alpha)});
            }
            if (i == C2586e.abc_ratingbar_material) {
                i2 = C2585d.abc_star_big;
            } else if (i == C2586e.abc_ratingbar_indicator_material) {
                i2 = C2585d.abc_star_medium;
            } else if (i != C2586e.abc_ratingbar_small_material) {
                return null;
            } else {
                i2 = C2585d.abc_star_small;
            }
            return m1955l(q0Var, context, i2);
        }

        /* renamed from: d */
        public ColorStateList mo2124d(Context context, int i) {
            if (i == C2586e.abc_edit_text_material) {
                return C2620a.m21329a(context, C2584c.abc_tint_edittext);
            }
            if (i == C2586e.abc_switch_track_mtrl_alpha) {
                return C2620a.m21329a(context, C2584c.abc_tint_switch_track);
            }
            if (i == C2586e.abc_switch_thumb_material) {
                return m1954k(context);
            }
            if (i == C2586e.abc_btn_default_mtrl_shape) {
                return m1953j(context);
            }
            if (i == C2586e.abc_btn_borderless_material) {
                return m1950g(context);
            }
            if (i == C2586e.abc_btn_colored_material) {
                return m1952i(context);
            }
            if (i == C2586e.abc_spinner_mtrl_am_alpha || i == C2586e.abc_spinner_textfield_background_material) {
                return C2620a.m21329a(context, C2584c.abc_tint_spinner);
            }
            if (m1949f(this.f1504b, i)) {
                return C0527v0.m2160e(context, C2582a.colorControlNormal);
            }
            if (m1949f(this.f1507e, i)) {
                return C2620a.m21329a(context, C2584c.abc_tint_default);
            }
            if (m1949f(this.f1508f, i)) {
                return C2620a.m21329a(context, C2584c.abc_tint_btn_checkable);
            }
            if (i == C2586e.abc_seekbar_thumb_material) {
                return C2620a.m21329a(context, C2584c.abc_tint_seek_thumb);
            }
            return null;
        }

        /* renamed from: e */
        public boolean mo2125e(Context context, int i, Drawable drawable) {
            Drawable findDrawableByLayerId;
            int c;
            if (i == C2586e.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(16908288);
                int i2 = C2582a.colorControlNormal;
                m1956m(findDrawableByLayerId2, C0527v0.m2158c(context, i2), C0472k.f1500b);
                m1956m(layerDrawable.findDrawableByLayerId(16908303), C0527v0.m2158c(context, i2), C0472k.f1500b);
                findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908301);
                c = C0527v0.m2158c(context, C2582a.colorControlActivated);
            } else if (i != C2586e.abc_ratingbar_material && i != C2586e.abc_ratingbar_indicator_material && i != C2586e.abc_ratingbar_small_material) {
                return false;
            } else {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                m1956m(layerDrawable2.findDrawableByLayerId(16908288), C0527v0.m2157b(context, C2582a.colorControlNormal), C0472k.f1500b);
                Drawable findDrawableByLayerId3 = layerDrawable2.findDrawableByLayerId(16908303);
                int i3 = C2582a.colorControlActivated;
                m1956m(findDrawableByLayerId3, C0527v0.m2158c(context, i3), C0472k.f1500b);
                findDrawableByLayerId = layerDrawable2.findDrawableByLayerId(16908301);
                c = C0527v0.m2158c(context, i3);
            }
            m1956m(findDrawableByLayerId, c, C0472k.f1500b);
            return true;
        }
    }

    /* renamed from: b */
    public static synchronized C0472k m1941b() {
        C0472k kVar;
        synchronized (C0472k.class) {
            if (f1501c == null) {
                m1943h();
            }
            kVar = f1501c;
        }
        return kVar;
    }

    /* renamed from: e */
    public static synchronized PorterDuffColorFilter m1942e(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter l;
        synchronized (C0472k.class) {
            l = C0504q0.m2079l(i, mode);
        }
        return l;
    }

    /* renamed from: h */
    public static synchronized void m1943h() {
        synchronized (C0472k.class) {
            if (f1501c == null) {
                C0472k kVar = new C0472k();
                f1501c = kVar;
                kVar.f1502a = C0504q0.m2077h();
                f1501c.f1502a.mo2272u(new C0473a());
            }
        }
    }

    /* renamed from: i */
    static void m1944i(Drawable drawable, C0534y0 y0Var, int[] iArr) {
        C0504q0.m2085w(drawable, y0Var, iArr);
    }

    /* renamed from: c */
    public synchronized Drawable mo2117c(Context context, int i) {
        return this.f1502a.mo2266j(context, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized Drawable mo2118d(Context context, int i, boolean z) {
        return this.f1502a.mo2267k(context, i, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public synchronized ColorStateList mo2119f(Context context, int i) {
        return this.f1502a.mo2268m(context, i);
    }

    /* renamed from: g */
    public synchronized void mo2120g(Context context) {
        this.f1502a.mo2270s(context);
    }
}
