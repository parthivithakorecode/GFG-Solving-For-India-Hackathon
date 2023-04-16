package com.google.android.gms.internal.ads;

import java.util.Map;

final class ls3 implements Map.Entry, Comparable<ls3> {

    /* renamed from: f */
    private final Comparable f10138f;

    /* renamed from: g */
    private Object f10139g;

    /* renamed from: h */
    final /* synthetic */ ss3 f10140h;

    ls3(ss3 ss3, Comparable comparable, Object obj) {
        this.f10140h = ss3;
        this.f10138f = comparable;
        this.f10139g = obj;
    }

    /* renamed from: d */
    private static final boolean m12854d(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: b */
    public final Comparable mo9017b() {
        return this.f10138f;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f10138f.compareTo(((ls3) obj).f10138f);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return m12854d(this.f10138f, entry.getKey()) && m12854d(this.f10139g, entry.getValue());
    }

    public final /* synthetic */ Object getKey() {
        return this.f10138f;
    }

    public final Object getValue() {
        return this.f10139g;
    }

    public final int hashCode() {
        Comparable comparable = this.f10138f;
        int i = 0;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f10139g;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode ^ i;
    }

    public final Object setValue(Object obj) {
        this.f10140h.m16965n();
        Object obj2 = this.f10139g;
        this.f10139g = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f10138f);
        String valueOf2 = String.valueOf(this.f10139g);
        StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }
}
