package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.yh */
final class C2407yh extends C1518ai {

    /* renamed from: P0 */
    public final long f17734P0;

    /* renamed from: Q0 */
    public final List<C2444zh> f17735Q0 = new ArrayList();

    /* renamed from: R0 */
    public final List<C2407yh> f17736R0 = new ArrayList();

    public C2407yh(int i, long j) {
        super(i);
        this.f17734P0 = j;
    }

    /* renamed from: d */
    public final C2407yh mo12018d(int i) {
        int size = this.f17736R0.size();
        for (int i2 = 0; i2 < size; i2++) {
            C2407yh yhVar = this.f17736R0.get(i2);
            if (yhVar.f4206a == i) {
                return yhVar;
            }
        }
        return null;
    }

    /* renamed from: e */
    public final C2444zh mo12019e(int i) {
        int size = this.f17735Q0.size();
        for (int i2 = 0; i2 < size; i2++) {
            C2444zh zhVar = this.f17735Q0.get(i2);
            if (zhVar.f4206a == i) {
                return zhVar;
            }
        }
        return null;
    }

    /* renamed from: f */
    public final void mo12020f(C2407yh yhVar) {
        this.f17736R0.add(yhVar);
    }

    /* renamed from: g */
    public final void mo12021g(C2444zh zhVar) {
        this.f17735Q0.add(zhVar);
    }

    public final String toString() {
        String c = C1518ai.m6089c(this.f4206a);
        String arrays = Arrays.toString(this.f17735Q0.toArray());
        String arrays2 = Arrays.toString(this.f17736R0.toArray());
        int length = String.valueOf(arrays).length();
        StringBuilder sb = new StringBuilder(c.length() + 22 + length + String.valueOf(arrays2).length());
        sb.append(c);
        sb.append(" leaves: ");
        sb.append(arrays);
        sb.append(" containers: ");
        sb.append(arrays2);
        return sb.toString();
    }
}
