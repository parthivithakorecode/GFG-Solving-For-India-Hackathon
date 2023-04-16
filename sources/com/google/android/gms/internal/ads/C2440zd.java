package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.zd */
public class C2440zd implements IInterface {

    /* renamed from: f */
    private final IBinder f18158f;

    /* renamed from: g */
    private final String f18159g;

    protected C2440zd(IBinder iBinder, String str) {
        this.f18158f = iBinder;
        this.f18159g = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C0 */
    public final void mo12206C0(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f18158f.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Parcel mo12207D() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f18159g);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z2 */
    public final void mo12208Z2(int i, Parcel parcel) {
        try {
            this.f18158f.transact(2, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f18158f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n0 */
    public final Parcel mo12210n0(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f18158f.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }
}
