package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;

final class w43 implements Iterable<String> {

    /* renamed from: f */
    final /* synthetic */ CharSequence f16706f;

    /* renamed from: g */
    final /* synthetic */ z43 f16707g;

    w43(z43 z43, CharSequence charSequence) {
        this.f16707g = z43;
        this.f16706f = charSequence;
    }

    public final Iterator<String> iterator() {
        return this.f16707g.m20435g(this.f16706f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        Iterator it = iterator();
        try {
            if (it.hasNext()) {
                CharSequence a = f43.m8971a(it.next(), ", ");
                while (true) {
                    sb.append(a);
                    if (!it.hasNext()) {
                        break;
                    }
                    sb.append(", ");
                    a = f43.m8971a(it.next(), ", ");
                }
            }
            sb.append(']');
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
