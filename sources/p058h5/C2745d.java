package p058h5;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.regex.Pattern;
import p080k5.C3334d;
import p087l5.C3604b;
import p087l5.C3613d;
import p087l5.C3619h;

/* renamed from: h5.d */
public final class C2745d implements C3619h, Comparable<C2745d>, Serializable {

    /* renamed from: h */
    public static final C2745d f19322h = new C2745d(0, 0);

    /* renamed from: i */
    private static final BigInteger f19323i = BigInteger.valueOf(1000000000);

    /* renamed from: j */
    private static final Pattern f19324j = Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)D)?(T(?:([-+]?[0-9]+)H)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)(?:[.,]([0-9]{0,9}))?S)?)?", 2);

    /* renamed from: f */
    private final long f19325f;

    /* renamed from: g */
    private final int f19326g;

    private C2745d(long j, int i) {
        this.f19325f = j;
        this.f19326g = i;
    }

    /* renamed from: e */
    private static C2745d m21783e(long j, int i) {
        return (((long) i) | j) == 0 ? f19322h : new C2745d(j, i);
    }

    /* renamed from: g */
    public static C2745d m21784g(long j) {
        long j2 = j / 1000000000;
        int i = (int) (j % 1000000000);
        if (i < 0) {
            i += 1000000000;
            j2--;
        }
        return m21783e(j2, i);
    }

    /* renamed from: h */
    public static C2745d m21785h(long j) {
        return m21783e(j, 0);
    }

    /* renamed from: i */
    public static C2745d m21786i(long j, long j2) {
        return m21783e(C3334d.m24475k(j, C3334d.m24469e(j2, 1000000000)), C3334d.m24471g(j2, 1000000000));
    }

    /* renamed from: j */
    static C2745d m21787j(DataInput dataInput) {
        return m21786i(dataInput.readLong(), (long) dataInput.readInt());
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C2771n((byte) 1, this);
    }

    /* renamed from: b */
    public C3613d mo12785b(C3613d dVar) {
        long j = this.f19325f;
        if (j != 0) {
            dVar = dVar.mo12800e(j, C3604b.SECONDS);
        }
        int i = this.f19326g;
        return i != 0 ? dVar.mo12800e((long) i, C3604b.NANOS) : dVar;
    }

    /* renamed from: d */
    public int compareTo(C2745d dVar) {
        int b = C3334d.m24466b(this.f19325f, dVar.f19325f);
        return b != 0 ? b : this.f19326g - dVar.f19326g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2745d)) {
            return false;
        }
        C2745d dVar = (C2745d) obj;
        return this.f19325f == dVar.f19325f && this.f19326g == dVar.f19326g;
    }

    /* renamed from: f */
    public long mo12789f() {
        return this.f19325f;
    }

    public int hashCode() {
        long j = this.f19325f;
        return ((int) (j ^ (j >>> 32))) + (this.f19326g * 51);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo12791k(DataOutput dataOutput) {
        dataOutput.writeLong(this.f19325f);
        dataOutput.writeInt(this.f19326g);
    }

    public String toString() {
        if (this == f19322h) {
            return "PT0S";
        }
        long j = this.f19325f;
        long j2 = j / 3600;
        int i = (int) ((j % 3600) / 60);
        int i2 = (int) (j % 60);
        StringBuilder sb = new StringBuilder(24);
        sb.append("PT");
        if (j2 != 0) {
            sb.append(j2);
            sb.append('H');
        }
        if (i != 0) {
            sb.append(i);
            sb.append('M');
        }
        if (i2 == 0 && this.f19326g == 0 && sb.length() > 2) {
            return sb.toString();
        }
        if (i2 >= 0 || this.f19326g <= 0) {
            sb.append(i2);
        } else if (i2 == -1) {
            sb.append("-0");
        } else {
            sb.append(i2 + 1);
        }
        if (this.f19326g > 0) {
            int length = sb.length();
            sb.append(i2 < 0 ? 2000000000 - this.f19326g : this.f19326g + 1000000000);
            while (sb.charAt(sb.length() - 1) == '0') {
                sb.setLength(sb.length() - 1);
            }
            sb.setCharAt(length, '.');
        }
        sb.append('S');
        return sb.toString();
    }
}
