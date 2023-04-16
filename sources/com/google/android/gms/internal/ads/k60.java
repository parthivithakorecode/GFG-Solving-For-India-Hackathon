package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import p048g2.C2638c;

public final class k60 extends C2638c<w40> {
    public k60() {
        super("com.google.android.gms.ads.NativeAdViewHolderDelegateCreatorImpl");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo8020a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
        return queryLocalInterface instanceof w40 ? (w40) queryLocalInterface : new v40(iBinder);
    }
}
