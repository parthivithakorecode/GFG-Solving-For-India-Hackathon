package p017c;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import p017c.C1424a;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: c.b */
public class C1427b implements Parcelable {
    public static final Parcelable.Creator<C1427b> CREATOR = new C1428a();

    /* renamed from: f */
    final boolean f3636f = false;

    /* renamed from: g */
    final Handler f3637g = null;

    /* renamed from: h */
    C1424a f3638h;

    /* renamed from: c.b$a */
    class C1428a implements Parcelable.Creator<C1427b> {
        C1428a() {
        }

        /* renamed from: a */
        public C1427b createFromParcel(Parcel parcel) {
            return new C1427b(parcel);
        }

        /* renamed from: b */
        public C1427b[] newArray(int i) {
            return new C1427b[i];
        }
    }

    /* renamed from: c.b$b */
    class C1429b extends C1424a.C1425a {
        C1429b() {
        }

        /* renamed from: s5 */
        public void mo4824s5(int i, Bundle bundle) {
            C1427b bVar = C1427b.this;
            Handler handler = bVar.f3637g;
            if (handler != null) {
                handler.post(new C1430c(i, bundle));
            } else {
                bVar.mo371b(i, bundle);
            }
        }
    }

    /* renamed from: c.b$c */
    class C1430c implements Runnable {

        /* renamed from: f */
        final int f3640f;

        /* renamed from: g */
        final Bundle f3641g;

        C1430c(int i, Bundle bundle) {
            this.f3640f = i;
            this.f3641g = bundle;
        }

        public void run() {
            C1427b.this.mo371b(this.f3640f, this.f3641g);
        }
    }

    C1427b(Parcel parcel) {
        this.f3638h = C1424a.C1425a.m5594D(parcel.readStrongBinder());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo371b(int i, Bundle bundle) {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.f3638h == null) {
                this.f3638h = new C1429b();
            }
            parcel.writeStrongBinder(this.f3638h.asBinder());
        }
    }
}
