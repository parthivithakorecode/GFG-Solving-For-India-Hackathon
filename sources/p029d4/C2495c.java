package p029d4;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p005a4.C0157r;
import p137t2.C4063b;

/* renamed from: d4.c */
public class C2495c extends C0157r {

    /* renamed from: d */
    private final Map<Integer, C4063b> f18587d = new HashMap();

    C2495c() {
    }

    /* renamed from: q */
    private List<String> m21046q(Object obj) {
        if (obj == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (obj instanceof List) {
            for (Object next : (List) obj) {
                if (next instanceof String) {
                    arrayList.add((String) next);
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public Object mo352g(byte b, ByteBuffer byteBuffer) {
        switch (b) {
            case -127:
                return new C2494b((Boolean) mo352g(byteBuffer.get(), byteBuffer), (C2493a) mo352g(byteBuffer.get(), byteBuffer));
            case -126:
                return new C2493a((Integer) mo352g(byteBuffer.get(), byteBuffer), m21046q(mo352g(byteBuffer.get(), byteBuffer)));
            case -125:
                return this.f18587d.get((Integer) mo352g(byteBuffer.get(), byteBuffer));
            default:
                return super.mo352g(b, byteBuffer);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo353p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        Object c;
        if (obj instanceof C2494b) {
            byteArrayOutputStream.write(-127);
            C2494b bVar = (C2494b) obj;
            mo353p(byteArrayOutputStream, bVar.mo12393c());
            c = bVar.mo12392b();
        } else if (obj instanceof C2493a) {
            byteArrayOutputStream.write(-126);
            C2493a aVar = (C2493a) obj;
            mo353p(byteArrayOutputStream, aVar.mo12387b());
            c = aVar.mo12388c();
        } else if (obj instanceof C4063b) {
            byteArrayOutputStream.write(-125);
            mo353p(byteArrayOutputStream, Integer.valueOf(obj.hashCode()));
            return;
        } else {
            super.mo353p(byteArrayOutputStream, obj);
            return;
        }
        mo353p(byteArrayOutputStream, c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo12396r(C4063b bVar) {
        this.f18587d.remove(Integer.valueOf(bVar.hashCode()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo12397s(C4063b bVar) {
        this.f18587d.put(Integer.valueOf(bVar.hashCode()), bVar);
    }
}
