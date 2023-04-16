package com.google.android.gms.internal.ads;

final class br3 implements ir3 {

    /* renamed from: a */
    private final ir3[] f5022a;

    br3(ir3... ir3Arr) {
        this.f5022a = ir3Arr;
    }

    /* renamed from: a */
    public final hr3 mo5438a(Class<?> cls) {
        ir3[] ir3Arr = this.f5022a;
        for (int i = 0; i < 2; i++) {
            ir3 ir3 = ir3Arr[i];
            if (ir3.mo5439b(cls)) {
                return ir3.mo5438a(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }

    /* renamed from: b */
    public final boolean mo5439b(Class<?> cls) {
        ir3[] ir3Arr = this.f5022a;
        for (int i = 0; i < 2; i++) {
            if (ir3Arr[i].mo5439b(cls)) {
                return true;
            }
        }
        return false;
    }
}
