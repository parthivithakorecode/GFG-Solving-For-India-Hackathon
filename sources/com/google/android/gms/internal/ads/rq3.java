package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class rq3 extends co3<String> implements RandomAccess, sq3 {

    /* renamed from: h */
    private static final rq3 f13841h;

    /* renamed from: i */
    public static final sq3 f13842i;

    /* renamed from: g */
    private final List<Object> f13843g;

    static {
        rq3 rq3 = new rq3(10);
        f13841h = rq3;
        rq3.mo6244a();
        f13842i = rq3;
    }

    public rq3() {
        this(10);
    }

    public rq3(int i) {
        this.f13843g = new ArrayList(i);
    }

    private rq3(ArrayList<Object> arrayList) {
        this.f13843g = arrayList;
    }

    /* renamed from: j */
    private static String m16401j(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof uo3 ? ((uo3) obj).mo11268h(kq3.f9606b) : kq3.m12307h((byte[]) obj);
    }

    /* renamed from: D */
    public final Object mo5946D(int i) {
        return this.f13843g.get(i);
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        mo6248h();
        this.f13843g.add(i, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection<? extends String> collection) {
        mo6248h();
        if (collection instanceof sq3) {
            collection = ((sq3) collection).mo5948f();
        }
        boolean addAll = this.f13843g.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    /* renamed from: b */
    public final sq3 mo5947b() {
        return mo6246c() ? new bt3(this) : this;
    }

    public final void clear() {
        mo6248h();
        this.f13843g.clear();
        this.modCount++;
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ jq3 mo5923e(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f13843g);
            return new rq3((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: f */
    public final List<?> mo5948f() {
        return Collections.unmodifiableList(this.f13843g);
    }

    /* renamed from: g */
    public final void mo5949g(uo3 uo3) {
        mo6248h();
        this.f13843g.add(uo3);
        this.modCount++;
    }

    /* renamed from: i */
    public final String get(int i) {
        Object obj = this.f13843g.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof uo3) {
            uo3 uo3 = (uo3) obj;
            String h = uo3.mo11268h(kq3.f9606b);
            if (uo3.mo6621B()) {
                this.f13843g.set(i, h);
            }
            return h;
        }
        byte[] bArr = (byte[]) obj;
        String h2 = kq3.m12307h(bArr);
        if (kq3.m12308i(bArr)) {
            this.f13843g.set(i, h2);
        }
        return h2;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo6248h();
        Object remove = this.f13843g.remove(i);
        this.modCount++;
        return m16401j(remove);
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        mo6248h();
        return m16401j(this.f13843g.set(i, (String) obj));
    }

    public final int size() {
        return this.f13843g.size();
    }
}
