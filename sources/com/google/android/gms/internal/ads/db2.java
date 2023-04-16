package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.CheckForNull;

public final class db2 {

    /* renamed from: a */
    private final ConcurrentHashMap<String, cf0> f5744a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private final rt1 f5745b;

    public db2(rt1 rt1) {
        this.f5745b = rt1;
    }

    @CheckForNull
    /* renamed from: a */
    public final cf0 mo6434a(String str) {
        if (this.f5744a.containsKey(str)) {
            return this.f5744a.get(str);
        }
        return null;
    }

    /* renamed from: b */
    public final void mo6435b(String str) {
        try {
            this.f5744a.put(str, this.f5745b.mo10663a(str));
        } catch (RemoteException e) {
            io0.m11129e("Couldn't create RTB adapter : ", e);
        }
    }
}
