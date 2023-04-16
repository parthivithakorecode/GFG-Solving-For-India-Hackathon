package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.C1043w;
import androidx.lifecycle.C1099i;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.fragment.app.b */
final class C0956b implements Parcelable {
    public static final Parcelable.Creator<C0956b> CREATOR = new C0957a();

    /* renamed from: f */
    final int[] f2557f;

    /* renamed from: g */
    final ArrayList<String> f2558g;

    /* renamed from: h */
    final int[] f2559h;

    /* renamed from: i */
    final int[] f2560i;

    /* renamed from: j */
    final int f2561j;

    /* renamed from: k */
    final String f2562k;

    /* renamed from: l */
    final int f2563l;

    /* renamed from: m */
    final int f2564m;

    /* renamed from: n */
    final CharSequence f2565n;

    /* renamed from: o */
    final int f2566o;

    /* renamed from: p */
    final CharSequence f2567p;

    /* renamed from: q */
    final ArrayList<String> f2568q;

    /* renamed from: r */
    final ArrayList<String> f2569r;

    /* renamed from: s */
    final boolean f2570s;

    /* renamed from: androidx.fragment.app.b$a */
    class C0957a implements Parcelable.Creator<C0956b> {
        C0957a() {
        }

        /* renamed from: a */
        public C0956b createFromParcel(Parcel parcel) {
            return new C0956b(parcel);
        }

        /* renamed from: b */
        public C0956b[] newArray(int i) {
            return new C0956b[i];
        }
    }

    public C0956b(Parcel parcel) {
        this.f2557f = parcel.createIntArray();
        this.f2558g = parcel.createStringArrayList();
        this.f2559h = parcel.createIntArray();
        this.f2560i = parcel.createIntArray();
        this.f2561j = parcel.readInt();
        this.f2562k = parcel.readString();
        this.f2563l = parcel.readInt();
        this.f2564m = parcel.readInt();
        this.f2565n = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2566o = parcel.readInt();
        this.f2567p = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2568q = parcel.createStringArrayList();
        this.f2569r = parcel.createStringArrayList();
        this.f2570s = parcel.readInt() != 0;
    }

    public C0956b(C0954a aVar) {
        int size = aVar.f2817c.size();
        this.f2557f = new int[(size * 5)];
        if (aVar.f2823i) {
            this.f2558g = new ArrayList<>(size);
            this.f2559h = new int[size];
            this.f2560i = new int[size];
            int i = 0;
            int i2 = 0;
            while (i < size) {
                C1043w.C1044a aVar2 = aVar.f2817c.get(i);
                int i3 = i2 + 1;
                this.f2557f[i2] = aVar2.f2834a;
                ArrayList<String> arrayList = this.f2558g;
                Fragment fragment = aVar2.f2835b;
                arrayList.add(fragment != null ? fragment.f2499k : null);
                int[] iArr = this.f2557f;
                int i4 = i3 + 1;
                iArr[i3] = aVar2.f2836c;
                int i5 = i4 + 1;
                iArr[i4] = aVar2.f2837d;
                int i6 = i5 + 1;
                iArr[i5] = aVar2.f2838e;
                iArr[i6] = aVar2.f2839f;
                this.f2559h[i] = aVar2.f2840g.ordinal();
                this.f2560i[i] = aVar2.f2841h.ordinal();
                i++;
                i2 = i6 + 1;
            }
            this.f2561j = aVar.f2822h;
            this.f2562k = aVar.f2825k;
            this.f2563l = aVar.f2552v;
            this.f2564m = aVar.f2826l;
            this.f2565n = aVar.f2827m;
            this.f2566o = aVar.f2828n;
            this.f2567p = aVar.f2829o;
            this.f2568q = aVar.f2830p;
            this.f2569r = aVar.f2831q;
            this.f2570s = aVar.f2832r;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    /* renamed from: b */
    public C0954a mo3382b(C1011n nVar) {
        C0954a aVar = new C0954a(nVar);
        int i = 0;
        int i2 = 0;
        while (i < this.f2557f.length) {
            C1043w.C1044a aVar2 = new C1043w.C1044a();
            int i3 = i + 1;
            aVar2.f2834a = this.f2557f[i];
            if (C1011n.m4190E0(2)) {
                Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i2 + " base fragment #" + this.f2557f[i3]);
            }
            String str = this.f2558g.get(i2);
            aVar2.f2835b = str != null ? nVar.mo3598f0(str) : null;
            aVar2.f2840g = C1099i.C1102c.values()[this.f2559h[i2]];
            aVar2.f2841h = C1099i.C1102c.values()[this.f2560i[i2]];
            int[] iArr = this.f2557f;
            int i4 = i3 + 1;
            int i5 = iArr[i3];
            aVar2.f2836c = i5;
            int i6 = i4 + 1;
            int i7 = iArr[i4];
            aVar2.f2837d = i7;
            int i8 = i6 + 1;
            int i9 = iArr[i6];
            aVar2.f2838e = i9;
            int i10 = iArr[i8];
            aVar2.f2839f = i10;
            aVar.f2818d = i5;
            aVar.f2819e = i7;
            aVar.f2820f = i9;
            aVar.f2821g = i10;
            aVar.mo3728e(aVar2);
            i2++;
            i = i8 + 1;
        }
        aVar.f2822h = this.f2561j;
        aVar.f2825k = this.f2562k;
        aVar.f2552v = this.f2563l;
        aVar.f2823i = true;
        aVar.f2826l = this.f2564m;
        aVar.f2827m = this.f2565n;
        aVar.f2828n = this.f2566o;
        aVar.f2829o = this.f2567p;
        aVar.f2830p = this.f2568q;
        aVar.f2831q = this.f2569r;
        aVar.f2832r = this.f2570s;
        aVar.mo3362m(1);
        return aVar;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f2557f);
        parcel.writeStringList(this.f2558g);
        parcel.writeIntArray(this.f2559h);
        parcel.writeIntArray(this.f2560i);
        parcel.writeInt(this.f2561j);
        parcel.writeString(this.f2562k);
        parcel.writeInt(this.f2563l);
        parcel.writeInt(this.f2564m);
        TextUtils.writeToParcel(this.f2565n, parcel, 0);
        parcel.writeInt(this.f2566o);
        TextUtils.writeToParcel(this.f2567p, parcel, 0);
        parcel.writeStringList(this.f2568q);
        parcel.writeStringList(this.f2569r);
        parcel.writeInt(this.f2570s ? 1 : 0);
    }
}
