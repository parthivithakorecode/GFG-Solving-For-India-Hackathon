package com.google.android.gms.internal.ads;

import java.util.Comparator;

public final /* synthetic */ class x74 implements Comparator {

    /* renamed from: f */
    public static final /* synthetic */ x74 f17066f = new x74();

    private /* synthetic */ x74() {
    }

    public final int compare(Object obj, Object obj2) {
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        int i = k84.f9435h;
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }
}
