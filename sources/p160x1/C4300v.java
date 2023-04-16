package p160x1;

import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import p003a2.C0079i1;
import p003a2.C0082j1;
import p003a2.C0092o;
import p048g2.C2635a;
import p048g2.C2637b;

/* renamed from: x1.v */
abstract class C4300v extends C0079i1 {

    /* renamed from: f */
    private final int f22603f;

    protected C4300v(byte[] bArr) {
        C0092o.m305a(bArr.length == 25);
        this.f22603f = Arrays.hashCode(bArr);
    }

    /* renamed from: C0 */
    protected static byte[] m26874C0(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: b */
    public final int mo252b() {
        return this.f22603f;
    }

    public final boolean equals(Object obj) {
        C2635a g;
        if (obj != null && (obj instanceof C0082j1)) {
            try {
                C0082j1 j1Var = (C0082j1) obj;
                if (j1Var.mo252b() != this.f22603f || (g = j1Var.mo253g()) == null) {
                    return false;
                }
                return Arrays.equals(mo15884n0(), (byte[]) C2637b.m21357C0(g));
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    /* renamed from: g */
    public final C2635a mo253g() {
        return C2637b.m21358Z2(mo15884n0());
    }

    public final int hashCode() {
        return this.f22603f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n0 */
    public abstract byte[] mo15884n0();
}
