package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import p002a1.C0024h;
import p002a1.C0036t;

/* renamed from: com.google.android.gms.internal.ads.xv */
public final class C2384xv {

    /* renamed from: a */
    private final C0024h[] f17358a;

    /* renamed from: b */
    private final String f17359b;

    public C2384xv(Context context, AttributeSet attributeSet) {
        IllegalArgumentException illegalArgumentException;
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C0036t.f51a);
        String string = obtainAttributes.getString(C0036t.f52b);
        String string2 = obtainAttributes.getString(C0036t.f53c);
        boolean z = !TextUtils.isEmpty(string);
        boolean z2 = !TextUtils.isEmpty(string2);
        if (z && !z2) {
            this.f17358a = m19671c(string);
        } else if (z || !z2) {
            obtainAttributes.recycle();
            if (z) {
                throw illegalArgumentException;
            } else {
                illegalArgumentException = new IllegalArgumentException("Required XML attribute \"adSize\" was missing.");
                throw illegalArgumentException;
            }
        } else {
            this.f17358a = m19671c(string2);
        }
        String string3 = obtainAttributes.getString(C0036t.f54d);
        this.f17359b = string3;
        obtainAttributes.recycle();
        if (TextUtils.isEmpty(string3)) {
            throw new IllegalArgumentException("Required XML attribute \"adUnitId\" was missing.");
        }
    }

    /* renamed from: c */
    private static C0024h[] m19671c(String str) {
        String[] split = str.split("\\s*,\\s*");
        int length = split.length;
        C0024h[] hVarArr = new C0024h[length];
        for (int i = 0; i < split.length; i++) {
            String trim = split[i].trim();
            if (trim.matches("^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$")) {
                String[] split2 = trim.split("[xX]");
                split2[0] = split2[0].trim();
                split2[1] = split2[1].trim();
                try {
                    hVarArr[i] = new C0024h("FULL_WIDTH".equals(split2[0]) ? -1 : Integer.parseInt(split2[0]), "AUTO_HEIGHT".equals(split2[1]) ? -2 : Integer.parseInt(split2[1]));
                } catch (NumberFormatException unused) {
                    throw new IllegalArgumentException(trim.length() != 0 ? "Could not parse XML attribute \"adSize\": ".concat(trim) : new String("Could not parse XML attribute \"adSize\": "));
                }
            } else if ("BANNER".equals(trim)) {
                hVarArr[i] = C0024h.f25i;
            } else if ("LARGE_BANNER".equals(trim)) {
                hVarArr[i] = C0024h.f27k;
            } else if ("FULL_BANNER".equals(trim)) {
                hVarArr[i] = C0024h.f26j;
            } else if ("LEADERBOARD".equals(trim)) {
                hVarArr[i] = C0024h.f28l;
            } else if ("MEDIUM_RECTANGLE".equals(trim)) {
                hVarArr[i] = C0024h.f29m;
            } else if ("SMART_BANNER".equals(trim)) {
                hVarArr[i] = C0024h.f31o;
            } else if ("WIDE_SKYSCRAPER".equals(trim)) {
                hVarArr[i] = C0024h.f30n;
            } else if ("FLUID".equals(trim)) {
                hVarArr[i] = C0024h.f32p;
            } else if ("ICON".equals(trim)) {
                hVarArr[i] = C0024h.f35s;
            } else {
                throw new IllegalArgumentException(trim.length() != 0 ? "Could not parse XML attribute \"adSize\": ".concat(trim) : new String("Could not parse XML attribute \"adSize\": "));
            }
        }
        if (length != 0) {
            return hVarArr;
        }
        throw new IllegalArgumentException(str.length() != 0 ? "Could not parse XML attribute \"adSize\": ".concat(str) : new String("Could not parse XML attribute \"adSize\": "));
    }

    /* renamed from: a */
    public final String mo11929a() {
        return this.f17359b;
    }

    /* renamed from: b */
    public final C0024h[] mo11930b(boolean z) {
        if (z || this.f17358a.length == 1) {
            return this.f17358a;
        }
        throw new IllegalArgumentException("The adSizes XML attribute is only allowed on PublisherAdViews.");
    }
}
