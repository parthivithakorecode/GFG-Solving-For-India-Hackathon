package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;
import p102o.C3801a;

/* renamed from: androidx.versionedparcelable.b */
class C1211b extends C1210a {

    /* renamed from: d */
    private final SparseIntArray f3290d;

    /* renamed from: e */
    private final Parcel f3291e;

    /* renamed from: f */
    private final int f3292f;

    /* renamed from: g */
    private final int f3293g;

    /* renamed from: h */
    private final String f3294h;

    /* renamed from: i */
    private int f3295i;

    /* renamed from: j */
    private int f3296j;

    /* renamed from: k */
    private int f3297k;

    C1211b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C3801a(), new C3801a(), new C3801a());
    }

    private C1211b(Parcel parcel, int i, int i2, String str, C3801a<String, Method> aVar, C3801a<String, Method> aVar2, C3801a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f3290d = new SparseIntArray();
        this.f3295i = -1;
        this.f3296j = 0;
        this.f3297k = -1;
        this.f3291e = parcel;
        this.f3292f = i;
        this.f3293g = i2;
        this.f3296j = i;
        this.f3294h = str;
    }

    /* renamed from: A */
    public void mo4167A(byte[] bArr) {
        if (bArr != null) {
            this.f3291e.writeInt(bArr.length);
            this.f3291e.writeByteArray(bArr);
            return;
        }
        this.f3291e.writeInt(-1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo4169C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f3291e, 0);
    }

    /* renamed from: E */
    public void mo4171E(int i) {
        this.f3291e.writeInt(i);
    }

    /* renamed from: G */
    public void mo4173G(Parcelable parcelable) {
        this.f3291e.writeParcelable(parcelable, 0);
    }

    /* renamed from: I */
    public void mo4175I(String str) {
        this.f3291e.writeString(str);
    }

    /* renamed from: a */
    public void mo4180a() {
        int i = this.f3295i;
        if (i >= 0) {
            int i2 = this.f3290d.get(i);
            int dataPosition = this.f3291e.dataPosition();
            this.f3291e.setDataPosition(i2);
            this.f3291e.writeInt(dataPosition - i2);
            this.f3291e.setDataPosition(dataPosition);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C1210a mo4181b() {
        Parcel parcel = this.f3291e;
        int dataPosition = parcel.dataPosition();
        int i = this.f3296j;
        if (i == this.f3292f) {
            i = this.f3293g;
        }
        int i2 = i;
        return new C1211b(parcel, dataPosition, i2, this.f3294h + "  ", this.f3287a, this.f3288b, this.f3289c);
    }

    /* renamed from: g */
    public boolean mo4183g() {
        return this.f3291e.readInt() != 0;
    }

    /* renamed from: i */
    public byte[] mo4185i() {
        int readInt = this.f3291e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f3291e.readByteArray(bArr);
        return bArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public CharSequence mo4187k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f3291e);
    }

    /* renamed from: m */
    public boolean mo4189m(int i) {
        while (this.f3296j < this.f3293g) {
            int i2 = this.f3297k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.f3291e.setDataPosition(this.f3296j);
            int readInt = this.f3291e.readInt();
            this.f3297k = this.f3291e.readInt();
            this.f3296j += readInt;
        }
        return this.f3297k == i;
    }

    /* renamed from: o */
    public int mo4191o() {
        return this.f3291e.readInt();
    }

    /* renamed from: q */
    public <T extends Parcelable> T mo4193q() {
        return this.f3291e.readParcelable(getClass().getClassLoader());
    }

    /* renamed from: s */
    public String mo4195s() {
        return this.f3291e.readString();
    }

    /* renamed from: w */
    public void mo4199w(int i) {
        mo4180a();
        this.f3295i = i;
        this.f3290d.put(i, this.f3291e.dataPosition());
        mo4171E(0);
        mo4171E(i);
    }

    /* renamed from: y */
    public void mo4201y(boolean z) {
        this.f3291e.writeInt(z ? 1 : 0);
    }
}
