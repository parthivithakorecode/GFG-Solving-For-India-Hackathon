package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;
import java.util.Map;

final class ju0 implements nb3<Map<String, String>> {

    /* renamed from: a */
    final /* synthetic */ List f9263a;

    /* renamed from: b */
    final /* synthetic */ String f9264b;

    /* renamed from: c */
    final /* synthetic */ Uri f9265c;

    /* renamed from: d */
    final /* synthetic */ lu0 f9266d;

    ju0(lu0 lu0, List list, String str, Uri uri) {
        this.f9266d = lu0;
        this.f9263a = list;
        this.f9264b = str;
        this.f9265c = uri;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo5436a(Object obj) {
        this.f9266d.m12881m((Map) obj, this.f9263a, this.f9264b);
    }

    /* renamed from: b */
    public final void mo5437b(Throwable th) {
        io0.m11131g("Failed to parse gmsg params for: ".concat(String.valueOf(this.f9265c)));
    }
}
