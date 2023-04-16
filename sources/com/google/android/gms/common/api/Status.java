package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p003a2.C0089n;
import p013b2.C1298a;
import p013b2.C1301c;
import p160x1.C4280b;
import p166y1.C4378d;
import p166y1.C4389j;

public final class Status extends C1298a implements C4389j, ReflectedParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<Status> CREATOR = new C1476b();
    @RecentlyNonNull

    /* renamed from: k */
    public static final Status f3765k = new Status(0);
    @RecentlyNonNull

    /* renamed from: l */
    public static final Status f3766l = new Status(14);
    @RecentlyNonNull

    /* renamed from: m */
    public static final Status f3767m = new Status(8);
    @RecentlyNonNull

    /* renamed from: n */
    public static final Status f3768n = new Status(15);
    @RecentlyNonNull

    /* renamed from: o */
    public static final Status f3769o = new Status(16);
    @RecentlyNonNull

    /* renamed from: p */
    public static final Status f3770p = new Status(18);
    @RecentlyNonNull

    /* renamed from: q */
    public static final Status f3771q = new Status(17);

    /* renamed from: f */
    final int f3772f;

    /* renamed from: g */
    private final int f3773g;

    /* renamed from: h */
    private final String f3774h;

    /* renamed from: i */
    private final PendingIntent f3775i;

    /* renamed from: j */
    private final C4280b f3776j;

    public Status(int i) {
        this(i, (String) null);
    }

    Status(int i, int i2, String str, PendingIntent pendingIntent) {
        this(i, i2, str, pendingIntent, (C4280b) null);
    }

    Status(int i, int i2, String str, PendingIntent pendingIntent, C4280b bVar) {
        this.f3772f = i;
        this.f3773g = i2;
        this.f3774h = str;
        this.f3775i = pendingIntent;
        this.f3776j = bVar;
    }

    public Status(int i, String str) {
        this(1, i, str, (PendingIntent) null);
    }

    public Status(@RecentlyNonNull C4280b bVar, @RecentlyNonNull String str) {
        this(bVar, str, 17);
    }

    @Deprecated
    public Status(@RecentlyNonNull C4280b bVar, @RecentlyNonNull String str, int i) {
        this(1, i, str, bVar.mo15843e(), bVar);
    }

    @RecentlyNonNull
    /* renamed from: b */
    public Status mo5001b() {
        return this;
    }

    @RecentlyNullable
    /* renamed from: c */
    public C4280b mo5002c() {
        return this.f3776j;
    }

    /* renamed from: d */
    public int mo5003d() {
        return this.f3773g;
    }

    @RecentlyNullable
    /* renamed from: e */
    public String mo5004e() {
        return this.f3774h;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f3772f == status.f3772f && this.f3773g == status.f3773g && C0089n.m301a(this.f3774h, status.f3774h) && C0089n.m301a(this.f3775i, status.f3775i) && C0089n.m301a(this.f3776j, status.f3776j);
    }

    /* renamed from: f */
    public boolean mo5006f() {
        return this.f3775i != null;
    }

    /* renamed from: g */
    public boolean mo5007g() {
        return this.f3773g <= 0;
    }

    @RecentlyNonNull
    /* renamed from: h */
    public final String mo5008h() {
        String str = this.f3774h;
        return str != null ? str : C4378d.m27024a(this.f3773g);
    }

    public int hashCode() {
        return C0089n.m302b(Integer.valueOf(this.f3772f), Integer.valueOf(this.f3773g), this.f3774h, this.f3775i, this.f3776j);
    }

    @RecentlyNonNull
    public String toString() {
        C0089n.C0090a c = C0089n.m303c(this);
        c.mo260a("statusCode", mo5008h());
        c.mo260a("resolution", this.f3775i);
        return c.toString();
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = C1301c.m5213a(parcel);
        C1301c.m5220h(parcel, 1, mo5003d());
        C1301c.m5225m(parcel, 2, mo5004e(), false);
        C1301c.m5224l(parcel, 3, this.f3775i, i, false);
        C1301c.m5224l(parcel, 4, mo5002c(), i, false);
        C1301c.m5220h(parcel, 1000, this.f3772f);
        C1301c.m5214b(parcel, a);
    }
}
