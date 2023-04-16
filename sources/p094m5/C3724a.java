package p094m5;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import p058h5.C2780r;

/* renamed from: m5.a */
final class C3724a implements Externalizable {

    /* renamed from: f */
    private byte f21534f;

    /* renamed from: g */
    private Object f21535g;

    public C3724a() {
    }

    C3724a(byte b, Object obj) {
        this.f21534f = b;
        this.f21535g = obj;
    }

    /* renamed from: a */
    static Object m25418a(DataInput dataInput) {
        return m25420c(dataInput.readByte(), dataInput);
    }

    /* renamed from: b */
    static long m25419b(DataInput dataInput) {
        byte readByte = dataInput.readByte() & 255;
        if (readByte == 255) {
            return dataInput.readLong();
        }
        return (((long) (((readByte << 16) + ((dataInput.readByte() & 255) << 8)) + (dataInput.readByte() & 255))) * 900) - 4575744000L;
    }

    /* renamed from: c */
    private static Object m25420c(byte b, DataInput dataInput) {
        if (b == 1) {
            return C3725b.m25429k(dataInput);
        }
        if (b == 2) {
            return C3728d.m25444m(dataInput);
        }
        if (b == 3) {
            return C3729e.m25457c(dataInput);
        }
        throw new StreamCorruptedException("Unknown serialized type");
    }

    /* renamed from: d */
    static C2780r m25421d(DataInput dataInput) {
        byte readByte = dataInput.readByte();
        return readByte == Byte.MAX_VALUE ? C2780r.m22141z(dataInput.readInt()) : C2780r.m22141z(readByte * 900);
    }

    /* renamed from: e */
    static void m25422e(long j, DataOutput dataOutput) {
        if (j < -4575744000L || j >= 10413792000L || j % 900 != 0) {
            dataOutput.writeByte(255);
            dataOutput.writeLong(j);
            return;
        }
        int i = (int) ((j + 4575744000L) / 900);
        dataOutput.writeByte((i >>> 16) & 255);
        dataOutput.writeByte((i >>> 8) & 255);
        dataOutput.writeByte(i & 255);
    }

    /* renamed from: f */
    private static void m25423f(byte b, Object obj, DataOutput dataOutput) {
        dataOutput.writeByte(b);
        if (b == 1) {
            ((C3725b) obj).mo14916l(dataOutput);
        } else if (b == 2) {
            ((C3728d) obj).mo14937o(dataOutput);
        } else if (b == 3) {
            ((C3729e) obj).mo14940d(dataOutput);
        } else {
            throw new InvalidClassException("Unknown serialized type");
        }
    }

    /* renamed from: g */
    static void m25424g(C2780r rVar, DataOutput dataOutput) {
        int w = rVar.mo13013w();
        int i = w % 900 == 0 ? w / 900 : 127;
        dataOutput.writeByte(i);
        if (i == 127) {
            dataOutput.writeInt(w);
        }
    }

    private Object readResolve() {
        return this.f21535g;
    }

    public void readExternal(ObjectInput objectInput) {
        byte readByte = objectInput.readByte();
        this.f21534f = readByte;
        this.f21535g = m25420c(readByte, objectInput);
    }

    public void writeExternal(ObjectOutput objectOutput) {
        m25423f(this.f21534f, this.f21535g, objectOutput);
    }
}
