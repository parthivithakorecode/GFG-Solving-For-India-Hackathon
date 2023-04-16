package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.C1011n;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.fragment.app.p */
final class C1031p implements Parcelable {
    public static final Parcelable.Creator<C1031p> CREATOR = new C1032a();

    /* renamed from: f */
    ArrayList<C1037t> f2775f;

    /* renamed from: g */
    ArrayList<String> f2776g;

    /* renamed from: h */
    C0956b[] f2777h;

    /* renamed from: i */
    int f2778i;

    /* renamed from: j */
    String f2779j = null;

    /* renamed from: k */
    ArrayList<String> f2780k = new ArrayList<>();

    /* renamed from: l */
    ArrayList<Bundle> f2781l = new ArrayList<>();

    /* renamed from: m */
    ArrayList<C1011n.C1024m> f2782m;

    /* renamed from: androidx.fragment.app.p$a */
    class C1032a implements Parcelable.Creator<C1031p> {
        C1032a() {
        }

        /* renamed from: a */
        public C1031p createFromParcel(Parcel parcel) {
            return new C1031p(parcel);
        }

        /* renamed from: b */
        public C1031p[] newArray(int i) {
            return new C1031p[i];
        }
    }

    public C1031p() {
    }

    public C1031p(Parcel parcel) {
        this.f2775f = parcel.createTypedArrayList(C1037t.CREATOR);
        this.f2776g = parcel.createStringArrayList();
        this.f2777h = (C0956b[]) parcel.createTypedArray(C0956b.CREATOR);
        this.f2778i = parcel.readInt();
        this.f2779j = parcel.readString();
        this.f2780k = parcel.createStringArrayList();
        this.f2781l = parcel.createTypedArrayList(Bundle.CREATOR);
        this.f2782m = parcel.createTypedArrayList(C1011n.C1024m.CREATOR);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f2775f);
        parcel.writeStringList(this.f2776g);
        parcel.writeTypedArray(this.f2777h, i);
        parcel.writeInt(this.f2778i);
        parcel.writeString(this.f2779j);
        parcel.writeStringList(this.f2780k);
        parcel.writeTypedList(this.f2781l);
        parcel.writeTypedList(this.f2782m);
    }
}
