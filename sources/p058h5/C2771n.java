package p058h5;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* renamed from: h5.n */
final class C2771n implements Externalizable {

    /* renamed from: f */
    private byte f19399f;

    /* renamed from: g */
    private Object f19400g;

    public C2771n() {
    }

    C2771n(byte b, Object obj) {
        this.f19399f = b;
        this.f19400g = obj;
    }

    /* renamed from: a */
    static Object m22070a(DataInput dataInput) {
        return m22071b(dataInput.readByte(), dataInput);
    }

    /* renamed from: b */
    private static Object m22071b(byte b, DataInput dataInput) {
        if (b == 64) {
            return C2761j.m21999t(dataInput);
        }
        switch (b) {
            case 1:
                return C2745d.m21787j(dataInput);
            case 2:
                return C2746e.m21792C(dataInput);
            case 3:
                return C2749f.m21831d0(dataInput);
            case 4:
                return C2752g.m21892c0(dataInput);
            case 5:
                return C2755h.m21942J(dataInput);
            case 6:
                return C2783t.m22173Y(dataInput);
            case 7:
                return C2782s.m22158v(dataInput);
            case 8:
                return C2780r.m22134B(dataInput);
            default:
                switch (b) {
                    case 66:
                        return C2768l.m22043u(dataInput);
                    case 67:
                        return C2772o.m22076v(dataInput);
                    case 68:
                        return C2775p.m22099x(dataInput);
                    case 69:
                        return C2764k.m22015x(dataInput);
                    default:
                        throw new StreamCorruptedException("Unknown serialized type");
                }
        }
    }

    /* renamed from: c */
    static void m22072c(byte b, Object obj, DataOutput dataOutput) {
        dataOutput.writeByte(b);
        if (b != 64) {
            switch (b) {
                case 1:
                    ((C2745d) obj).mo12791k(dataOutput);
                    return;
                case 2:
                    ((C2746e) obj).mo12798G(dataOutput);
                    return;
                case 3:
                    ((C2749f) obj).mo12844l0(dataOutput);
                    return;
                case 4:
                    ((C2752g) obj).mo12883h0(dataOutput);
                    return;
                case 5:
                    ((C2755h) obj).mo12908S(dataOutput);
                    return;
                case 6:
                    ((C2783t) obj).mo13036h0(dataOutput);
                    return;
                case 7:
                    ((C2782s) obj).mo13015w(dataOutput);
                    return;
                case 8:
                    ((C2780r) obj).mo13010E(dataOutput);
                    return;
                default:
                    switch (b) {
                        case 66:
                            ((C2768l) obj).mo12965z(dataOutput);
                            return;
                        case 67:
                            ((C2772o) obj).mo12984y(dataOutput);
                            return;
                        case 68:
                            ((C2775p) obj).mo12989D(dataOutput);
                            return;
                        case 69:
                            ((C2764k) obj).mo12940F(dataOutput);
                            return;
                        default:
                            throw new InvalidClassException("Unknown serialized type");
                    }
            }
        } else {
            ((C2761j) obj).mo12934u(dataOutput);
        }
    }

    private Object readResolve() {
        return this.f19400g;
    }

    public void readExternal(ObjectInput objectInput) {
        byte readByte = objectInput.readByte();
        this.f19399f = readByte;
        this.f19400g = m22071b(readByte, objectInput);
    }

    public void writeExternal(ObjectOutput objectOutput) {
        m22072c(this.f19399f, this.f19400g, objectOutput);
    }
}
