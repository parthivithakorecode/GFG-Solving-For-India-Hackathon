package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p003a2.C0092o;
import p013b2.C1298a;
import p013b2.C1301c;

public final class Scope extends C1298a implements ReflectedParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<Scope> CREATOR = new C1475a();

    /* renamed from: f */
    final int f3763f;

    /* renamed from: g */
    private final String f3764g;

    Scope(int i, String str) {
        C0092o.m311g(str, "scopeUri must not be null or empty");
        this.f3763f = i;
        this.f3764g = str;
    }

    public Scope(@RecentlyNonNull String str) {
        this(1, str);
    }

    @RecentlyNonNull
    /* renamed from: c */
    public String mo4996c() {
        return this.f3764g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f3764g.equals(((Scope) obj).f3764g);
    }

    public int hashCode() {
        return this.f3764g.hashCode();
    }

    @RecentlyNonNull
    public String toString() {
        return this.f3764g;
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = C1301c.m5213a(parcel);
        C1301c.m5220h(parcel, 1, this.f3763f);
        C1301c.m5225m(parcel, 2, mo4996c(), false);
        C1301c.m5214b(parcel, a);
    }
}
