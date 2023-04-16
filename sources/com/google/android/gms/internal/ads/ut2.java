package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.concurrent.GuardedBy;
import p054h1.C2694t;

final class ut2 implements tt2 {
    @GuardedBy("this")

    /* renamed from: a */
    private final ConcurrentHashMap<du2, st2> f15767a;

    /* renamed from: b */
    private final au2 f15768b;

    /* renamed from: c */
    private final wt2 f15769c = new wt2();

    public ut2(au2 au2) {
        this.f15767a = new ConcurrentHashMap<>(au2.f4355k);
        this.f15768b = au2;
    }

    /* renamed from: e */
    private final void m18084e() {
        Parcelable.Creator<au2> creator = au2.CREATOR;
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10342N4)).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f15768b.f4353i);
            sb.append(" PoolCollection");
            sb.append(this.f15769c.mo11724b());
            int i = 0;
            for (Map.Entry next : this.f15767a.entrySet()) {
                i++;
                sb.append(i);
                sb.append(". ");
                sb.append(next.getValue());
                sb.append("#");
                sb.append(((du2) next.getKey()).hashCode());
                sb.append("    ");
                for (int i2 = 0; i2 < ((st2) next.getValue()).mo10864b(); i2++) {
                    sb.append("[O]");
                }
                for (int b = ((st2) next.getValue()).mo10864b(); b < this.f15768b.f4355k; b++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                sb.append(((st2) next.getValue()).mo10869g());
                sb.append("\n");
            }
            while (i < this.f15768b.f4354j) {
                i++;
                sb.append(i);
                sb.append(".\n");
            }
            io0.m11126b(sb.toString());
        }
    }

    /* renamed from: a */
    public final synchronized boolean mo11113a(du2 du2, cu2<?, ?> cu2) {
        boolean h;
        ConcurrentHashMap<du2, st2> concurrentHashMap;
        st2 st2 = this.f15767a.get(du2);
        cu2.f5528d = C2694t.m21592a().mo12462a();
        if (st2 == null) {
            au2 au2 = this.f15768b;
            st2 = new st2(au2.f4355k, au2.f4356l * 1000);
            int size = this.f15767a.size();
            au2 au22 = this.f15768b;
            if (size == au22.f4354j) {
                int i = au22.f4362r;
                int i2 = i - 1;
                du2 du22 = null;
                if (i != 0) {
                    long j = Long.MAX_VALUE;
                    if (i2 == 0) {
                        for (Map.Entry next : this.f15767a.entrySet()) {
                            if (((st2) next.getValue()).mo10865c() < j) {
                                j = ((st2) next.getValue()).mo10865c();
                                du22 = (du2) next.getKey();
                            }
                        }
                        if (du22 != null) {
                            concurrentHashMap = this.f15767a;
                        }
                        this.f15769c.mo11729g();
                    } else if (i2 != 1) {
                        if (i2 == 2) {
                            int i3 = Integer.MAX_VALUE;
                            for (Map.Entry next2 : this.f15767a.entrySet()) {
                                if (((st2) next2.getValue()).mo10863a() < i3) {
                                    i3 = ((st2) next2.getValue()).mo10863a();
                                    du22 = (du2) next2.getKey();
                                }
                            }
                            if (du22 != null) {
                                concurrentHashMap = this.f15767a;
                            }
                        }
                        this.f15769c.mo11729g();
                    } else {
                        for (Map.Entry next3 : this.f15767a.entrySet()) {
                            if (((st2) next3.getValue()).mo10866d() < j) {
                                j = ((st2) next3.getValue()).mo10866d();
                                du22 = (du2) next3.getKey();
                            }
                        }
                        if (du22 != null) {
                            concurrentHashMap = this.f15767a;
                        }
                        this.f15769c.mo11729g();
                    }
                    concurrentHashMap.remove(du22);
                    this.f15769c.mo11729g();
                } else {
                    throw null;
                }
            }
            this.f15767a.put(du2, st2);
            this.f15769c.mo11726d();
        }
        h = st2.mo10870h(cu2);
        this.f15769c.mo11725c();
        vt2 a = this.f15769c.mo11723a();
        ru2 f = st2.mo10868f();
        C2046or F = C2268ur.m18022F();
        C1972mr F2 = C2009nr.m14029F();
        F2.mo9357u(2);
        C2194sr F3 = C2231tr.m17474F();
        F3.mo10843r(a.f16404f);
        F3.mo10844s(a.f16405g);
        F3.mo10845t(f.f13940g);
        F2.mo9356t(F3);
        F.mo9838r(F2);
        cu2.f5525a.mo6881a().mo12173c().mo7338y((C2268ur) F.mo11894o());
        m18084e();
        return h;
    }

    @Deprecated
    /* renamed from: b */
    public final du2 mo11114b(C1902kv kvVar, String str, C2309vv vvVar) {
        return new eu2(kvVar, str, new zi0(this.f15768b.f4351g).mo12227a().f4219k, this.f15768b.f4357m, vvVar);
    }

    /* renamed from: c */
    public final synchronized cu2<?, ?> mo11115c(du2 du2) {
        cu2<?, ?> cu2;
        st2 st2 = this.f15767a.get(du2);
        if (st2 != null) {
            cu2 = st2.mo10867e();
            if (cu2 == null) {
                this.f15769c.mo11727e();
            }
            ru2 f = st2.mo10868f();
            if (cu2 != null) {
                C2046or F = C2268ur.m18022F();
                C1972mr F2 = C2009nr.m14029F();
                F2.mo9357u(2);
                C2120qr F3 = C2157rr.m16408F();
                F3.mo10359r(f.f13939f);
                F3.mo10360s(f.f13940g);
                F2.mo9354r(F3);
                F.mo9838r(F2);
                cu2.f5525a.mo6881a().mo12173c().mo7337x0((C2268ur) F.mo11894o());
            }
            m18084e();
        } else {
            this.f15769c.mo11728f();
            m18084e();
            cu2 = null;
        }
        return cu2;
    }

    /* renamed from: d */
    public final synchronized boolean mo11116d(du2 du2) {
        st2 st2 = this.f15767a.get(du2);
        if (st2 != null) {
            return st2.mo10864b() < this.f15768b.f4355k;
        }
        return true;
    }

    public final au2 zza() {
        return this.f15768b;
    }
}
