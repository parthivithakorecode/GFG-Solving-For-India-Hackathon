package p140u;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: u.a */
public abstract class C4082a implements Parcelable {
    public static final Parcelable.Creator<C4082a> CREATOR = new C4084b();

    /* renamed from: g */
    public static final C4082a f22279g = new C4083a();

    /* renamed from: f */
    private final Parcelable f22280f;

    /* renamed from: u.a$a */
    static class C4083a extends C4082a {
        C4083a() {
            super((C4083a) null);
        }
    }

    /* renamed from: u.a$b */
    static class C4084b implements Parcelable.ClassLoaderCreator<C4082a> {
        C4084b() {
        }

        /* renamed from: a */
        public C4082a createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, (ClassLoader) null);
        }

        /* renamed from: b */
        public C4082a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return C4082a.f22279g;
            }
            throw new IllegalStateException("superState must be null");
        }

        /* renamed from: c */
        public C4082a[] newArray(int i) {
            return new C4082a[i];
        }
    }

    private C4082a() {
        this.f22280f = null;
    }

    protected C4082a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f22280f = readParcelable == null ? f22279g : readParcelable;
    }

    protected C4082a(Parcelable parcelable) {
        if (parcelable != null) {
            this.f22280f = parcelable == f22279g ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    /* synthetic */ C4082a(C4083a aVar) {
        this();
    }

    /* renamed from: b */
    public final Parcelable mo15581b() {
        return this.f22280f;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f22280f, i);
    }
}
