package p160x1;

import java.lang.ref.WeakReference;

/* renamed from: x1.x */
abstract class C4302x extends C4300v {

    /* renamed from: h */
    private static final WeakReference<byte[]> f22605h = new WeakReference<>((Object) null);

    /* renamed from: g */
    private WeakReference<byte[]> f22606g = f22605h;

    C4302x(byte[] bArr) {
        super(bArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z2 */
    public abstract byte[] mo15881Z2();

    /* access modifiers changed from: package-private */
    /* renamed from: n0 */
    public final byte[] mo15884n0() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.f22606g.get();
            if (bArr == null) {
                bArr = mo15881Z2();
                this.f22606g = new WeakReference<>(bArr);
            }
        }
        return bArr;
    }
}
