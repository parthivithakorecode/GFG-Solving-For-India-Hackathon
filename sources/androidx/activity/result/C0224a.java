package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.activity.result.a */
public final class C0224a implements Parcelable {
    public static final Parcelable.Creator<C0224a> CREATOR = new C0225a();

    /* renamed from: f */
    private final int f424f;

    /* renamed from: g */
    private final Intent f425g;

    /* renamed from: androidx.activity.result.a$a */
    class C0225a implements Parcelable.Creator<C0224a> {
        C0225a() {
        }

        /* renamed from: a */
        public C0224a createFromParcel(Parcel parcel) {
            return new C0224a(parcel);
        }

        /* renamed from: b */
        public C0224a[] newArray(int i) {
            return new C0224a[i];
        }
    }

    public C0224a(int i, Intent intent) {
        this.f424f = i;
        this.f425g = intent;
    }

    C0224a(Parcel parcel) {
        this.f424f = parcel.readInt();
        this.f425g = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }

    /* renamed from: d */
    public static String m695d(int i) {
        return i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK";
    }

    /* renamed from: b */
    public Intent mo547b() {
        return this.f425g;
    }

    /* renamed from: c */
    public int mo548c() {
        return this.f424f;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + m695d(this.f424f) + ", data=" + this.f425g + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f424f);
        parcel.writeInt(this.f425g == null ? 0 : 1);
        Intent intent = this.f425g;
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }
}
