package p005a4;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p005a4.C0157r;
import p099n3.C3768b;

/* renamed from: a4.s */
public final class C0159s implements C0151l {

    /* renamed from: b */
    public static final C0159s f284b = new C0159s(C0157r.f281a);

    /* renamed from: a */
    private final C0157r f285a;

    public C0159s(C0157r rVar) {
        this.f285a = rVar;
    }

    /* renamed from: a */
    public ByteBuffer mo325a(Object obj) {
        C0157r.C0158a aVar = new C0157r.C0158a();
        aVar.write(0);
        this.f285a.mo353p(aVar, obj);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.mo354d(), 0, aVar.size());
        return allocateDirect;
    }

    /* renamed from: b */
    public ByteBuffer mo326b(String str, String str2, Object obj, String str3) {
        C0157r.C0158a aVar = new C0157r.C0158a();
        aVar.write(1);
        this.f285a.mo353p(aVar, str);
        this.f285a.mo353p(aVar, str2);
        if (obj instanceof Throwable) {
            this.f285a.mo353p(aVar, C3768b.m25590d((Throwable) obj));
        } else {
            this.f285a.mo353p(aVar, obj);
        }
        this.f285a.mo353p(aVar, str3);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.mo354d(), 0, aVar.size());
        return allocateDirect;
    }

    /* renamed from: c */
    public ByteBuffer mo327c(String str, String str2, Object obj) {
        C0157r.C0158a aVar = new C0157r.C0158a();
        aVar.write(1);
        this.f285a.mo353p(aVar, str);
        this.f285a.mo353p(aVar, str2);
        if (obj instanceof Throwable) {
            this.f285a.mo353p(aVar, C3768b.m25590d((Throwable) obj));
        } else {
            this.f285a.mo353p(aVar, obj);
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.mo354d(), 0, aVar.size());
        return allocateDirect;
    }

    /* renamed from: d */
    public C0144j mo328d(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        Object f = this.f285a.mo351f(byteBuffer);
        Object f2 = this.f285a.mo351f(byteBuffer);
        if ((f instanceof String) && !byteBuffer.hasRemaining()) {
            return new C0144j((String) f, f2);
        }
        throw new IllegalArgumentException("Method call corrupted");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r0 == 1) goto L_0x001e;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo329e(java.nio.ByteBuffer r5) {
        /*
            r4 = this;
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            r5.order(r0)
            byte r0 = r5.get()
            if (r0 == 0) goto L_0x0011
            r1 = 1
            if (r0 != r1) goto L_0x004a
            goto L_0x001e
        L_0x0011:
            a4.r r0 = r4.f285a
            java.lang.Object r0 = r0.mo351f(r5)
            boolean r1 = r5.hasRemaining()
            if (r1 != 0) goto L_0x001e
            return r0
        L_0x001e:
            a4.r r0 = r4.f285a
            java.lang.Object r0 = r0.mo351f(r5)
            a4.r r1 = r4.f285a
            java.lang.Object r1 = r1.mo351f(r5)
            a4.r r2 = r4.f285a
            java.lang.Object r2 = r2.mo351f(r5)
            boolean r3 = r0 instanceof java.lang.String
            if (r3 == 0) goto L_0x004a
            if (r1 == 0) goto L_0x003a
            boolean r3 = r1 instanceof java.lang.String
            if (r3 == 0) goto L_0x004a
        L_0x003a:
            boolean r5 = r5.hasRemaining()
            if (r5 != 0) goto L_0x004a
            a4.e r5 = new a4.e
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = (java.lang.String) r1
            r5.<init>(r0, r1, r2)
            throw r5
        L_0x004a:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Envelope corrupted"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p005a4.C0159s.mo329e(java.nio.ByteBuffer):java.lang.Object");
    }

    /* renamed from: f */
    public ByteBuffer mo330f(C0144j jVar) {
        C0157r.C0158a aVar = new C0157r.C0158a();
        this.f285a.mo353p(aVar, jVar.f269a);
        this.f285a.mo353p(aVar, jVar.f270b);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.mo354d(), 0, aVar.size());
        return allocateDirect;
    }
}
