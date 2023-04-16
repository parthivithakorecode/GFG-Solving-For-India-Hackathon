package com.google.android.gms.internal.ads;

final class qp3 {

    /* renamed from: a */
    private static final np3<?> f13261a = new op3();

    /* renamed from: b */
    private static final np3<?> f13262b;

    static {
        np3<?> np3;
        try {
            np3 = (np3) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            np3 = null;
        }
        f13262b = np3;
    }

    /* renamed from: a */
    static np3<?> m15805a() {
        np3<?> np3 = f13262b;
        if (np3 != null) {
            return np3;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* renamed from: b */
    static np3<?> m15806b() {
        return f13261a;
    }
}
