package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class z43 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final b43 f18025a;

    /* renamed from: b */
    private final y43 f18026b;

    private z43(y43 y43) {
        a43 a43 = a43.f3930b;
        this.f18026b = y43;
        this.f18025a = a43;
    }

    /* renamed from: b */
    public static z43 m20432b(int i) {
        return new z43(new v43(4000));
    }

    /* renamed from: c */
    public static z43 m20433c(b43 b43) {
        return new z43(new t43(b43));
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final Iterator<String> m20435g(CharSequence charSequence) {
        return this.f18026b.mo10937a(this, charSequence);
    }

    /* renamed from: d */
    public final Iterable<String> mo12144d(CharSequence charSequence) {
        Objects.requireNonNull(charSequence);
        return new w43(this, charSequence);
    }

    /* renamed from: f */
    public final List<String> mo12145f(CharSequence charSequence) {
        Iterator<String> g = m20435g(charSequence);
        ArrayList arrayList = new ArrayList();
        while (g.hasNext()) {
            arrayList.add(g.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
