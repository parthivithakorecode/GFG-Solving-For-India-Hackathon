package com.google.android.gms.internal.ads;

public abstract class cv3 {
    /* renamed from: b */
    public static cv3 m7583b(Class cls) {
        return System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik") ? new xu3(cls.getSimpleName()) : new zu3(cls.getSimpleName());
    }

    /* renamed from: a */
    public abstract void mo6309a(String str);
}
