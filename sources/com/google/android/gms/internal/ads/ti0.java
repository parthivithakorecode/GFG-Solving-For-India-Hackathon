package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.io.DataInputStream;
import java.io.IOException;
import p013b2.C1298a;
import p013b2.C1301c;
import p013b2.C1302d;
import p034e2.C2553j;
import p054h1.C2694t;

public final class ti0 extends C1298a {
    public static final Parcelable.Creator<ti0> CREATOR = new ui0();

    /* renamed from: f */
    ParcelFileDescriptor f14866f;

    /* renamed from: g */
    private Parcelable f14867g = null;

    /* renamed from: h */
    private boolean f14868h = true;

    public ti0(ParcelFileDescriptor parcelFileDescriptor) {
        this.f14866f = parcelFileDescriptor;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    public final <T extends C1302d> T mo10990c(Parcelable.Creator<T> creator) {
        if (this.f14868h) {
            ParcelFileDescriptor parcelFileDescriptor = this.f14866f;
            if (parcelFileDescriptor == null) {
                io0.m11128d("File descriptor is empty, returning null.");
                return null;
            }
            DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
            try {
                int readInt = dataInputStream.readInt();
                byte[] bArr = new byte[readInt];
                dataInputStream.readFully(bArr, 0, readInt);
                C2553j.m21202a(dataInputStream);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.unmarshall(bArr, 0, readInt);
                    obtain.setDataPosition(0);
                    this.f14867g = (Parcelable) creator.createFromParcel(obtain);
                    obtain.recycle();
                    this.f14868h = false;
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            } catch (IOException e) {
                io0.m11129e("Could not read from parcel file descriptor", e);
                C2553j.m21202a(dataInputStream);
                return null;
            } catch (Throwable th2) {
                C2553j.m21202a(dataInputStream);
                throw th2;
            }
        }
        return (C1302d) this.f14867g;
    }

    /* JADX INFO: finally extract failed */
    public final void writeToParcel(Parcel parcel, int i) {
        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        if (this.f14866f == null) {
            Parcel obtain = Parcel.obtain();
            try {
                this.f14867g.writeToParcel(obtain, 0);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                ParcelFileDescriptor parcelFileDescriptor = null;
                try {
                    ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
                    autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(createPipe[1]);
                    try {
                        wo0.f16886a.execute(new si0(autoCloseOutputStream, marshall));
                        parcelFileDescriptor = createPipe[0];
                    } catch (IOException e) {
                        e = e;
                    }
                } catch (IOException e2) {
                    e = e2;
                    autoCloseOutputStream = null;
                    io0.m11129e("Error transporting the ad response", e);
                    C2694t.m21607p().mo11034s(e, "LargeParcelTeleporter.pipeData.2");
                    C2553j.m21202a(autoCloseOutputStream);
                    this.f14866f = parcelFileDescriptor;
                    int a = C1301c.m5213a(parcel);
                    C1301c.m5224l(parcel, 2, this.f14866f, i, false);
                    C1301c.m5214b(parcel, a);
                }
                this.f14866f = parcelFileDescriptor;
            } catch (Throwable th) {
                obtain.recycle();
                throw th;
            }
        }
        int a2 = C1301c.m5213a(parcel);
        C1301c.m5224l(parcel, 2, this.f14866f, i, false);
        C1301c.m5214b(parcel, a2);
    }
}
