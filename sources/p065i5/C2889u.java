package p065i5;

import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* renamed from: i5.u */
final class C2889u implements Externalizable {

    /* renamed from: f */
    private byte f19632f;

    /* renamed from: g */
    private Object f19633g;

    public C2889u() {
    }

    C2889u(byte b, Object obj) {
        this.f19632f = b;
        this.f19633g = obj;
    }

    /* renamed from: a */
    private static Object m22707a(byte b, ObjectInput objectInput) {
        switch (b) {
            case 1:
                return C2881p.m22610O(objectInput);
            case 2:
                return C2883q.m22648s(objectInput);
            case 3:
                return C2874k.m22533q0(objectInput);
            case 4:
                return C2876l.m22569o(objectInput);
            case 5:
                return C2886s.m22666O(objectInput);
            case 6:
                return C2888t.m22699k(objectInput);
            case 7:
                return C2892w.m22721O(objectInput);
            case 8:
                return C2894x.m22754k(objectInput);
            case 11:
                return C2870h.m22479o(objectInput);
            case 12:
                return C2862d.m22421K(objectInput);
            case 13:
                return C2868g.m22466G(objectInput);
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
    }

    /* renamed from: b */
    private static void m22708b(byte b, Object obj, ObjectOutput objectOutput) {
        objectOutput.writeByte(b);
        switch (b) {
            case 1:
                ((C2881p) obj).mo13184U(objectOutput);
                return;
            case 2:
                ((C2883q) obj).mo13188v(objectOutput);
                return;
            case 3:
                ((C2874k) obj).mo13160u0(objectOutput);
                return;
            case 4:
                ((C2876l) obj).mo13162p(objectOutput);
                return;
            case 5:
                ((C2886s) obj).mo13203S(objectOutput);
                return;
            case 6:
                ((C2888t) obj).mo13204o(objectOutput);
                return;
            case 7:
                ((C2892w) obj).mo13221S(objectOutput);
                return;
            case 8:
                ((C2894x) obj).mo13222o(objectOutput);
                return;
            case 11:
                ((C2870h) obj).mo13139r(objectOutput);
                return;
            case 12:
                ((C2862d) obj).writeExternal(objectOutput);
                return;
            case 13:
                ((C2868g) obj).writeExternal(objectOutput);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    private Object readResolve() {
        return this.f19633g;
    }

    public void readExternal(ObjectInput objectInput) {
        byte readByte = objectInput.readByte();
        this.f19632f = readByte;
        this.f19633g = m22707a(readByte, objectInput);
    }

    public void writeExternal(ObjectOutput objectOutput) {
        m22708b(this.f19632f, this.f19633g, objectOutput);
    }
}
