package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.gb */
public final class C1734gb {

    /* renamed from: d */
    private static final String[] f7343d = {"/aclk", "/pcs/click", "/dbm/clk"};

    /* renamed from: a */
    private final String f7344a = "ad.doubleclick.net";

    /* renamed from: b */
    private final String[] f7345b = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};

    /* renamed from: c */
    private final C1585cb f7346c;

    @Deprecated
    public C1734gb(C1585cb cbVar) {
        this.f7346c = cbVar;
    }

    /* renamed from: g */
    private final Uri m9610g(Uri uri, String str) {
        String str2;
        Objects.requireNonNull(uri);
        try {
            if (uri.getHost().equals(this.f7344a)) {
                try {
                    if (!uri.toString().contains("dc_ms=")) {
                        String uri2 = uri.toString();
                        int indexOf = uri2.indexOf(";adurl");
                        if (indexOf != -1) {
                            int i = indexOf + 1;
                            str2 = uri2.substring(0, i) + "dc_ms" + "=" + str + ";" + uri2.substring(i);
                        } else {
                            String encodedPath = uri.getEncodedPath();
                            int indexOf2 = uri2.indexOf(encodedPath);
                            str2 = uri2.substring(0, encodedPath.length() + indexOf2) + ";" + "dc_ms" + "=" + str + ";" + uri2.substring(indexOf2 + encodedPath.length());
                        }
                        return Uri.parse(str2);
                    }
                    throw new C1771hb("Parameter already exists: dc_ms");
                } catch (UnsupportedOperationException unused) {
                    throw new C1771hb("Provided Uri is not in a valid state");
                }
            }
        } catch (NullPointerException unused2) {
        }
        if (uri.getQueryParameter("ms") == null) {
            String uri3 = uri.toString();
            int indexOf3 = uri3.indexOf("&adurl");
            if (indexOf3 == -1) {
                indexOf3 = uri3.indexOf("?adurl");
            }
            if (indexOf3 == -1) {
                return uri.buildUpon().appendQueryParameter("ms", str).build();
            }
            int i2 = indexOf3 + 1;
            return Uri.parse(uri3.substring(0, i2) + "ms" + "=" + str + "&" + uri3.substring(i2));
        }
        throw new C1771hb("Query parameter already exists: ms");
    }

    @Deprecated
    /* renamed from: a */
    public final Uri mo7558a(Uri uri, Context context, View view, Activity activity) {
        try {
            return m9610g(uri, this.f7346c.mo6116g(context, uri.getQueryParameter("ai"), view, activity));
        } catch (UnsupportedOperationException unused) {
            throw new C1771hb("Provided Uri is not in a valid state");
        }
    }

    @Deprecated
    /* renamed from: b */
    public final Uri mo7559b(Uri uri, Context context) {
        return m9610g(uri, this.f7346c.mo6113d(context));
    }

    @Deprecated
    /* renamed from: c */
    public final C1585cb mo7560c() {
        return this.f7346c;
    }

    @Deprecated
    /* renamed from: d */
    public final void mo7561d(MotionEvent motionEvent) {
        this.f7346c.mo6110a(motionEvent);
    }

    /* renamed from: e */
    public final boolean mo7562e(Uri uri) {
        if (mo7563f(uri)) {
            String[] strArr = f7343d;
            for (int i = 0; i < 3; i++) {
                if (uri.getPath().endsWith(strArr[i])) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo7563f(Uri uri) {
        Objects.requireNonNull(uri);
        try {
            String host = uri.getHost();
            String[] strArr = this.f7345b;
            for (int i = 0; i < 3; i++) {
                if (host.endsWith(strArr[i])) {
                    return true;
                }
            }
        } catch (NullPointerException unused) {
        }
        return false;
    }
}
