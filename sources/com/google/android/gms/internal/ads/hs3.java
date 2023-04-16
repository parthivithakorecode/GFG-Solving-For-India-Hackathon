package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.Map;

final class hs3 extends ss3 {
    hs3(int i) {
        super(i, (rs3) null);
    }

    /* renamed from: a */
    public final void mo8009a() {
        if (!mo10859j()) {
            for (int i = 0; i < mo10849b(); i++) {
                Map.Entry g = mo10856g(i);
                if (((rp3) g.getKey()).mo10636c()) {
                    g.setValue(Collections.unmodifiableList((List) g.getValue()));
                }
            }
            for (Map.Entry entry : mo10850c()) {
                if (((rp3) entry.getKey()).mo10636c()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo8009a();
    }
}
