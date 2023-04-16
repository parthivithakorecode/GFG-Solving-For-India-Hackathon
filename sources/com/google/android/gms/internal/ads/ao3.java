package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ao3;
import com.google.android.gms.internal.ads.bo3;

public abstract class ao3<MessageType extends bo3<MessageType, BuilderType>, BuilderType extends ao3<MessageType, BuilderType>> implements jr3 {
    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract BuilderType mo5348h(MessageType messagetype);

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ jr3 mo5349k(kr3 kr3) {
        if (mo5389a().getClass().isInstance(kr3)) {
            return mo5348h((bo3) kr3);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
