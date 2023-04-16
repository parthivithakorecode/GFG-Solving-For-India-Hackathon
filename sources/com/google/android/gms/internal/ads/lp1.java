package com.google.android.gms.internal.ads;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;

public final /* synthetic */ class lp1 implements e43 {

    /* renamed from: a */
    public final /* synthetic */ String f10111a;

    /* renamed from: b */
    public final /* synthetic */ double f10112b;

    /* renamed from: c */
    public final /* synthetic */ int f10113c;

    /* renamed from: d */
    public final /* synthetic */ int f10114d;

    public /* synthetic */ lp1(String str, double d, int i, int i2) {
        this.f10111a = str;
        this.f10112b = d;
        this.f10113c = i;
        this.f10114d = i2;
    }

    /* renamed from: a */
    public final Object mo5054a(Object obj) {
        String str = this.f10111a;
        return new z30(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(str), this.f10112b, this.f10113c, this.f10114d);
    }
}
