package p069j1;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import com.google.android.gms.internal.ads.C2125qw;
import com.google.android.gms.internal.ads.C2199sw;
import com.google.android.gms.internal.ads.b43;
import com.google.android.gms.internal.ads.io0;
import com.google.android.gms.internal.ads.m10;
import com.google.android.gms.internal.ads.rr2;
import com.google.android.gms.internal.ads.z43;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p054h1.C2694t;

/* renamed from: j1.e1 */
public final class C3154e1 {
    /* renamed from: a */
    public static Point m23864a(MotionEvent motionEvent, View view) {
        int[] j = m23873j(view);
        float rawX = motionEvent.getRawX();
        return new Point(((int) rawX) - j[0], ((int) motionEvent.getRawY()) - j[1]);
    }

    /* renamed from: b */
    public static WindowManager.LayoutParams m23865b() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 0, 0, -2);
        layoutParams.flags = ((Integer) C2199sw.m17001c().mo8579b(m10.f10359P5)).intValue();
        layoutParams.type = 2;
        layoutParams.gravity = 8388659;
        return layoutParams;
    }

    /* renamed from: c */
    public static JSONObject m23866c(String str, Context context, Point point, Point point2) {
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("x", C2125qw.m15897b().mo5896b(context, point2.x));
                    jSONObject3.put("y", C2125qw.m15897b().mo5896b(context, point2.y));
                    jSONObject3.put("start_x", C2125qw.m15897b().mo5896b(context, point.x));
                    jSONObject3.put("start_y", C2125qw.m15897b().mo5896b(context, point.y));
                    jSONObject = jSONObject3;
                } catch (JSONException e) {
                    io0.m11129e("Error occurred while putting signals into JSON object.", e);
                }
                jSONObject2.put("click_point", jSONObject);
                jSONObject2.put("asset_id", str);
                return jSONObject2;
            } catch (Exception e2) {
                e = e2;
                jSONObject = jSONObject2;
                io0.m11129e("Error occurred while grabbing click signals.", e);
                return jSONObject;
            }
        } catch (Exception e3) {
            e = e3;
            io0.m11129e("Error occurred while grabbing click signals.", e);
            return jSONObject;
        }
    }

    /* renamed from: d */
    public static JSONObject m23867d(Context context, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View view) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        Map.Entry entry;
        Context context2 = context;
        Map<String, WeakReference<View>> map3 = map2;
        JSONObject jSONObject3 = new JSONObject();
        if (map == null || view == null) {
            return jSONObject3;
        }
        int[] j = m23873j(view);
        Iterator<Map.Entry<String, WeakReference<View>>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            View view2 = (View) ((WeakReference) next.getValue()).get();
            if (view2 != null) {
                int[] j2 = m23873j(view2);
                JSONObject jSONObject4 = new JSONObject();
                JSONObject jSONObject5 = new JSONObject();
                Iterator<Map.Entry<String, WeakReference<View>>> it2 = it;
                try {
                    JSONObject jSONObject6 = jSONObject3;
                    try {
                        jSONObject5.put("width", C2125qw.m15897b().mo5896b(context2, view2.getMeasuredWidth()));
                        jSONObject5.put("height", C2125qw.m15897b().mo5896b(context2, view2.getMeasuredHeight()));
                        jSONObject5.put("x", C2125qw.m15897b().mo5896b(context2, j2[0] - j[0]));
                        jSONObject5.put("y", C2125qw.m15897b().mo5896b(context2, j2[1] - j[1]));
                        jSONObject5.put("relative_to", "ad_view");
                        jSONObject4.put("frame", jSONObject5);
                        Rect rect = new Rect();
                        if (view2.getLocalVisibleRect(rect)) {
                            jSONObject2 = m23874k(context2, rect);
                        } else {
                            jSONObject2 = new JSONObject();
                            jSONObject2.put("width", 0);
                            jSONObject2.put("height", 0);
                            jSONObject2.put("x", C2125qw.m15897b().mo5896b(context2, j2[0] - j[0]));
                            jSONObject2.put("y", C2125qw.m15897b().mo5896b(context2, j2[1] - j[1]));
                            jSONObject2.put("relative_to", "ad_view");
                        }
                        jSONObject4.put("visible_bounds", jSONObject2);
                        if (view2 instanceof TextView) {
                            TextView textView = (TextView) view2;
                            jSONObject4.put("text_color", textView.getCurrentTextColor());
                            entry = next;
                            jSONObject4.put("font_size", (double) textView.getTextSize());
                            jSONObject4.put("text", textView.getText());
                        } else {
                            entry = next;
                        }
                        jSONObject4.put("is_clickable", map3 != null && map3.containsKey(entry.getKey()) && view2.isClickable());
                        jSONObject = jSONObject6;
                        try {
                            jSONObject.put((String) entry.getKey(), jSONObject4);
                        } catch (JSONException unused) {
                        }
                    } catch (JSONException unused2) {
                        jSONObject = jSONObject6;
                        io0.m11131g("Unable to get asset views information");
                        jSONObject3 = jSONObject;
                        it = it2;
                    }
                } catch (JSONException unused3) {
                    jSONObject = jSONObject3;
                    io0.m11131g("Unable to get asset views information");
                    jSONObject3 = jSONObject;
                    it = it2;
                }
                jSONObject3 = jSONObject;
                it = it2;
            }
        }
        return jSONObject3;
    }

    /* renamed from: e */
    public static JSONObject m23868e(Context context, View view) {
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        try {
            C2694t.m21608q();
            jSONObject.put("can_show_on_lock_screen", C3163g2.m23920b0(view));
            C2694t.m21608q();
            jSONObject.put("is_keyguard_locked", C3163g2.m23931h(context));
        } catch (JSONException unused) {
            io0.m11131g("Unable to get lock screen information");
        }
        return jSONObject;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0055, code lost:
        if ((r1 == null ? -1 : ((android.widget.AdapterView) r1).getPositionForView(r6)) != -1) goto L_0x0033;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.json.JSONObject m23869f(android.view.View r6) {
        /*
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            if (r6 != 0) goto L_0x0008
            return r0
        L_0x0008:
            com.google.android.gms.internal.ads.e10<java.lang.Boolean> r1 = com.google.android.gms.internal.ads.m10.f10335M5     // Catch:{ Exception -> 0x0058 }
            com.google.android.gms.internal.ads.k10 r2 = com.google.android.gms.internal.ads.C2199sw.m17001c()     // Catch:{ Exception -> 0x0058 }
            java.lang.Object r1 = r2.mo8579b(r1)     // Catch:{ Exception -> 0x0058 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ Exception -> 0x0058 }
            boolean r1 = r1.booleanValue()     // Catch:{ Exception -> 0x0058 }
            r2 = 0
            r3 = 1
            java.lang.String r4 = "contained_in_scroll_view"
            if (r1 == 0) goto L_0x0038
            p054h1.C2694t.m21608q()     // Catch:{ Exception -> 0x0058 }
            android.view.ViewParent r6 = r6.getParent()     // Catch:{ Exception -> 0x0058 }
        L_0x0025:
            if (r6 == 0) goto L_0x0030
            boolean r1 = r6 instanceof android.widget.ScrollView     // Catch:{ Exception -> 0x0058 }
            if (r1 != 0) goto L_0x0030
            android.view.ViewParent r6 = r6.getParent()     // Catch:{ Exception -> 0x0058 }
            goto L_0x0025
        L_0x0030:
            if (r6 != 0) goto L_0x0033
            goto L_0x0034
        L_0x0033:
            r2 = r3
        L_0x0034:
            r0.put(r4, r2)     // Catch:{ Exception -> 0x0058 }
            goto L_0x0058
        L_0x0038:
            p054h1.C2694t.m21608q()     // Catch:{ Exception -> 0x0058 }
            android.view.ViewParent r1 = r6.getParent()     // Catch:{ Exception -> 0x0058 }
        L_0x003f:
            if (r1 == 0) goto L_0x004a
            boolean r5 = r1 instanceof android.widget.AdapterView     // Catch:{ Exception -> 0x0058 }
            if (r5 != 0) goto L_0x004a
            android.view.ViewParent r1 = r1.getParent()     // Catch:{ Exception -> 0x0058 }
            goto L_0x003f
        L_0x004a:
            r5 = -1
            if (r1 != 0) goto L_0x004f
            r6 = r5
            goto L_0x0055
        L_0x004f:
            android.widget.AdapterView r1 = (android.widget.AdapterView) r1     // Catch:{ Exception -> 0x0058 }
            int r6 = r1.getPositionForView(r6)     // Catch:{ Exception -> 0x0058 }
        L_0x0055:
            if (r6 == r5) goto L_0x0034
            goto L_0x0033
        L_0x0058:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p069j1.C3154e1.m23869f(android.view.View):org.json.JSONObject");
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0164  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.json.JSONObject m23870g(android.content.Context r16, android.view.View r17) {
        /*
            r0 = r16
            r1 = r17
            java.lang.String r2 = "window"
            java.lang.String r3 = "relative_to"
            java.lang.String r4 = "y"
            java.lang.String r5 = "x"
            java.lang.String r6 = "height"
            java.lang.String r7 = "width"
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            if (r1 != 0) goto L_0x0018
            return r8
        L_0x0018:
            r9 = 2
            r10 = 1
            r11 = 0
            int[] r12 = m23873j(r17)     // Catch:{ Exception -> 0x00fd }
            int[] r13 = new int[r9]     // Catch:{ Exception -> 0x00fd }
            int r14 = r17.getMeasuredWidth()     // Catch:{ Exception -> 0x00fd }
            r13[r11] = r14     // Catch:{ Exception -> 0x00fd }
            int r14 = r17.getMeasuredHeight()     // Catch:{ Exception -> 0x00fd }
            r13[r10] = r14     // Catch:{ Exception -> 0x00fd }
            android.view.ViewParent r14 = r17.getParent()     // Catch:{ Exception -> 0x00fd }
        L_0x0031:
            boolean r15 = r14 instanceof android.view.ViewGroup     // Catch:{ Exception -> 0x00fd }
            if (r15 == 0) goto L_0x0058
            r15 = r14
            android.view.ViewGroup r15 = (android.view.ViewGroup) r15     // Catch:{ Exception -> 0x00fd }
            int r9 = r15.getMeasuredWidth()     // Catch:{ Exception -> 0x00fd }
            r10 = r13[r11]     // Catch:{ Exception -> 0x00fd }
            int r9 = java.lang.Math.min(r9, r10)     // Catch:{ Exception -> 0x00fd }
            r13[r11] = r9     // Catch:{ Exception -> 0x00fd }
            int r9 = r15.getMeasuredHeight()     // Catch:{ Exception -> 0x00fd }
            r10 = 1
            r15 = r13[r10]     // Catch:{ Exception -> 0x00fd }
            int r9 = java.lang.Math.min(r9, r15)     // Catch:{ Exception -> 0x00fd }
            r13[r10] = r9     // Catch:{ Exception -> 0x00fd }
            android.view.ViewParent r14 = r14.getParent()     // Catch:{ Exception -> 0x00fd }
            r9 = 2
            r10 = 1
            goto L_0x0031
        L_0x0058:
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ Exception -> 0x00fd }
            r9.<init>()     // Catch:{ Exception -> 0x00fd }
            int r10 = r17.getMeasuredWidth()     // Catch:{ Exception -> 0x00fd }
            com.google.android.gms.internal.ads.bo0 r14 = com.google.android.gms.internal.ads.C2125qw.m15897b()     // Catch:{ Exception -> 0x00fd }
            int r10 = r14.mo5896b(r0, r10)     // Catch:{ Exception -> 0x00fd }
            r9.put(r7, r10)     // Catch:{ Exception -> 0x00fd }
            int r10 = r17.getMeasuredHeight()     // Catch:{ Exception -> 0x00fd }
            com.google.android.gms.internal.ads.bo0 r14 = com.google.android.gms.internal.ads.C2125qw.m15897b()     // Catch:{ Exception -> 0x00fd }
            int r10 = r14.mo5896b(r0, r10)     // Catch:{ Exception -> 0x00fd }
            r9.put(r6, r10)     // Catch:{ Exception -> 0x00fd }
            r10 = r12[r11]     // Catch:{ Exception -> 0x00fd }
            com.google.android.gms.internal.ads.bo0 r14 = com.google.android.gms.internal.ads.C2125qw.m15897b()     // Catch:{ Exception -> 0x00fd }
            int r10 = r14.mo5896b(r0, r10)     // Catch:{ Exception -> 0x00fd }
            r9.put(r5, r10)     // Catch:{ Exception -> 0x00fd }
            r10 = 1
            r14 = r12[r10]     // Catch:{ Exception -> 0x00fd }
            com.google.android.gms.internal.ads.bo0 r10 = com.google.android.gms.internal.ads.C2125qw.m15897b()     // Catch:{ Exception -> 0x00fd }
            int r10 = r10.mo5896b(r0, r14)     // Catch:{ Exception -> 0x00fd }
            r9.put(r4, r10)     // Catch:{ Exception -> 0x00fd }
            java.lang.String r10 = "maximum_visible_width"
            r14 = r13[r11]     // Catch:{ Exception -> 0x00fd }
            com.google.android.gms.internal.ads.bo0 r15 = com.google.android.gms.internal.ads.C2125qw.m15897b()     // Catch:{ Exception -> 0x00fd }
            int r14 = r15.mo5896b(r0, r14)     // Catch:{ Exception -> 0x00fd }
            r9.put(r10, r14)     // Catch:{ Exception -> 0x00fd }
            java.lang.String r10 = "maximum_visible_height"
            r14 = 1
            r13 = r13[r14]     // Catch:{ Exception -> 0x00fd }
            com.google.android.gms.internal.ads.bo0 r14 = com.google.android.gms.internal.ads.C2125qw.m15897b()     // Catch:{ Exception -> 0x00fd }
            int r13 = r14.mo5896b(r0, r13)     // Catch:{ Exception -> 0x00fd }
            r9.put(r10, r13)     // Catch:{ Exception -> 0x00fd }
            r9.put(r3, r2)     // Catch:{ Exception -> 0x00fd }
            java.lang.String r10 = "frame"
            r8.put(r10, r9)     // Catch:{ Exception -> 0x00fd }
            android.graphics.Rect r9 = new android.graphics.Rect     // Catch:{ Exception -> 0x00fd }
            r9.<init>()     // Catch:{ Exception -> 0x00fd }
            boolean r10 = r1.getGlobalVisibleRect(r9)     // Catch:{ Exception -> 0x00fd }
            if (r10 == 0) goto L_0x00cd
            org.json.JSONObject r0 = m23874k(r0, r9)     // Catch:{ Exception -> 0x00fd }
            goto L_0x00f7
        L_0x00cd:
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ Exception -> 0x00fd }
            r9.<init>()     // Catch:{ Exception -> 0x00fd }
            r9.put(r7, r11)     // Catch:{ Exception -> 0x00fd }
            r9.put(r6, r11)     // Catch:{ Exception -> 0x00fd }
            r6 = r12[r11]     // Catch:{ Exception -> 0x00fd }
            com.google.android.gms.internal.ads.bo0 r7 = com.google.android.gms.internal.ads.C2125qw.m15897b()     // Catch:{ Exception -> 0x00fd }
            int r6 = r7.mo5896b(r0, r6)     // Catch:{ Exception -> 0x00fd }
            r9.put(r5, r6)     // Catch:{ Exception -> 0x00fd }
            r5 = 1
            r6 = r12[r5]     // Catch:{ Exception -> 0x00fd }
            com.google.android.gms.internal.ads.bo0 r5 = com.google.android.gms.internal.ads.C2125qw.m15897b()     // Catch:{ Exception -> 0x00fd }
            int r0 = r5.mo5896b(r0, r6)     // Catch:{ Exception -> 0x00fd }
            r9.put(r4, r0)     // Catch:{ Exception -> 0x00fd }
            r9.put(r3, r2)     // Catch:{ Exception -> 0x00fd }
            r0 = r9
        L_0x00f7:
            java.lang.String r2 = "visible_bounds"
            r8.put(r2, r0)     // Catch:{ Exception -> 0x00fd }
            goto L_0x0102
        L_0x00fd:
            java.lang.String r0 = "Unable to get native ad view bounding box"
            com.google.android.gms.internal.ads.io0.m11131g(r0)
        L_0x0102:
            com.google.android.gms.internal.ads.e10<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.m10.f10286G4
            com.google.android.gms.internal.ads.k10 r2 = com.google.android.gms.internal.ads.C2199sw.m17001c()
            java.lang.Object r0 = r2.mo8579b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0175
            android.view.ViewParent r0 = r17.getParent()
            if (r0 == 0) goto L_0x0139
            java.lang.Class r1 = r0.getClass()     // Catch:{ NoSuchMethodException -> 0x0139, SecurityException -> 0x0133, IllegalAccessException -> 0x0131, InvocationTargetException -> 0x012f }
            java.lang.String r2 = "getTemplateTypeName"
            java.lang.Class[] r3 = new java.lang.Class[r11]     // Catch:{ NoSuchMethodException -> 0x0139, SecurityException -> 0x0133, IllegalAccessException -> 0x0131, InvocationTargetException -> 0x012f }
            java.lang.reflect.Method r1 = r1.getMethod(r2, r3)     // Catch:{ NoSuchMethodException -> 0x0139, SecurityException -> 0x0133, IllegalAccessException -> 0x0131, InvocationTargetException -> 0x012f }
            java.lang.Object[] r2 = new java.lang.Object[r11]     // Catch:{ NoSuchMethodException -> 0x0139, SecurityException -> 0x0133, IllegalAccessException -> 0x0131, InvocationTargetException -> 0x012f }
            java.lang.Object r0 = r1.invoke(r0, r2)     // Catch:{ NoSuchMethodException -> 0x0139, SecurityException -> 0x0133, IllegalAccessException -> 0x0131, InvocationTargetException -> 0x012f }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ NoSuchMethodException -> 0x0139, SecurityException -> 0x0133, IllegalAccessException -> 0x0131, InvocationTargetException -> 0x012f }
            goto L_0x013b
        L_0x012f:
            r0 = move-exception
            goto L_0x0134
        L_0x0131:
            r0 = move-exception
            goto L_0x0134
        L_0x0133:
            r0 = move-exception
        L_0x0134:
            java.lang.String r1 = "Cannot access method getTemplateTypeName: "
            com.google.android.gms.internal.ads.io0.m11129e(r1, r0)
        L_0x0139:
            java.lang.String r0 = ""
        L_0x013b:
            int r1 = r0.hashCode()     // Catch:{ JSONException -> 0x016f }
            r2 = -2066603854(0xffffffff84d220b2, float:-4.940079E-36)
            if (r1 == r2) goto L_0x0154
            r2 = 2019754500(0x78630204, float:1.8417067E34)
            if (r1 == r2) goto L_0x014a
            goto L_0x015e
        L_0x014a:
            java.lang.String r1 = "medium_template"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x015e
            r0 = 1
            goto L_0x015f
        L_0x0154:
            java.lang.String r1 = "small_template"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x015e
            r0 = r11
            goto L_0x015f
        L_0x015e:
            r0 = -1
        L_0x015f:
            java.lang.String r1 = "native_template_type"
            r2 = 1
            if (r0 == 0) goto L_0x016b
            if (r0 == r2) goto L_0x016a
            r8.put(r1, r11)     // Catch:{ JSONException -> 0x016f }
            goto L_0x0175
        L_0x016a:
            r2 = 2
        L_0x016b:
            r8.put(r1, r2)     // Catch:{ JSONException -> 0x016f }
            goto L_0x0175
        L_0x016f:
            r0 = move-exception
            java.lang.String r1 = "Could not log native template signal to JSON"
            com.google.android.gms.internal.ads.io0.m11129e(r1, r0)
        L_0x0175:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p069j1.C3154e1.m23870g(android.content.Context, android.view.View):org.json.JSONObject");
    }

    /* renamed from: h */
    public static boolean m23871h(Context context, rr2 rr2) {
        if (!rr2.f13868K) {
            return false;
        }
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10343N5)).booleanValue()) {
            return ((Boolean) C2199sw.m17001c().mo8579b(m10.f10367Q5)).booleanValue();
        }
        String str = (String) C2199sw.m17001c().mo8579b(m10.f10351O5);
        if (!str.isEmpty() && context != null) {
            String packageName = context.getPackageName();
            for (String equals : z43.m20433c(b43.m6607b(';')).mo12144d(str)) {
                if (equals.equals(packageName)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: i */
    public static boolean m23872i(int i) {
        if (!((Boolean) C2199sw.m17001c().mo8579b(m10.f10489f2)).booleanValue()) {
            return true;
        }
        return ((Boolean) C2199sw.m17001c().mo8579b(m10.f10498g2)).booleanValue() || i <= 15299999;
    }

    /* renamed from: j */
    public static int[] m23873j(View view) {
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        return iArr;
    }

    /* renamed from: k */
    private static JSONObject m23874k(Context context, Rect rect) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", C2125qw.m15897b().mo5896b(context, rect.right - rect.left));
        jSONObject.put("height", C2125qw.m15897b().mo5896b(context, rect.bottom - rect.top));
        jSONObject.put("x", C2125qw.m15897b().mo5896b(context, rect.left));
        jSONObject.put("y", C2125qw.m15897b().mo5896b(context, rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }
}
