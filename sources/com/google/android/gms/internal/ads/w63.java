package com.google.android.gms.internal.ads;

import javax.annotation.CheckForNull;

final class w63 {
    /* renamed from: a */
    static int m18895a(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * -862048943), 15)) * 461845907);
    }

    /* renamed from: b */
    static int m18896b(@CheckForNull Object obj) {
        return m18895a(obj == null ? 0 : obj.hashCode());
    }
}
