package p003a2;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Set;
import p160x1.C4283e;
import p166y1.C4365a;
import p166y1.C4382f;
import p172z1.C4494d;
import p172z1.C4506j;

/* renamed from: a2.g */
public abstract class C0070g<T extends IInterface> extends C0052c<T> implements C4365a.C4374f {

    /* renamed from: K */
    private final C0060d f168K;

    /* renamed from: L */
    private final Set<Scope> f169L;

    /* renamed from: M */
    private final Account f170M;

    @Deprecated
    protected C0070g(@RecentlyNonNull Context context, @RecentlyNonNull Looper looper, int i, @RecentlyNonNull C0060d dVar, @RecentlyNonNull C4382f.C4383a aVar, @RecentlyNonNull C4382f.C4384b bVar) {
        this(context, looper, i, dVar, (C4494d) aVar, (C4506j) bVar);
    }

    protected C0070g(@RecentlyNonNull Context context, @RecentlyNonNull Looper looper, int i, @RecentlyNonNull C0060d dVar, @RecentlyNonNull C4494d dVar2, @RecentlyNonNull C4506j jVar) {
        this(context, looper, C0073h.m277b(context), C4283e.m26829l(), i, dVar, (C4494d) C0092o.m313i(dVar2), (C4506j) C0092o.m313i(jVar));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected C0070g(@androidx.annotation.RecentlyNonNull android.content.Context r11, @androidx.annotation.RecentlyNonNull android.os.Looper r12, @androidx.annotation.RecentlyNonNull p003a2.C0073h r13, @androidx.annotation.RecentlyNonNull p160x1.C4283e r14, int r15, @androidx.annotation.RecentlyNonNull p003a2.C0060d r16, p172z1.C4494d r17, p172z1.C4506j r18) {
        /*
            r10 = this;
            r9 = r10
            r0 = r17
            r1 = r18
            r2 = 0
            if (r0 != 0) goto L_0x000a
            r6 = r2
            goto L_0x0010
        L_0x000a:
            a2.b0 r3 = new a2.b0
            r3.<init>(r0)
            r6 = r3
        L_0x0010:
            if (r1 != 0) goto L_0x0014
            r7 = r2
            goto L_0x001a
        L_0x0014:
            a2.c0 r0 = new a2.c0
            r0.<init>(r1)
            r7 = r0
        L_0x001a:
            java.lang.String r8 = r16.mo205f()
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = r16
            r9.f168K = r0
            android.accounts.Account r1 = r16.mo200a()
            r9.f170M = r1
            java.util.Set r0 = r16.mo202c()
            java.util.Set r0 = r10.m267j0(r0)
            r9.f169L = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p003a2.C0070g.<init>(android.content.Context, android.os.Looper, a2.h, x1.e, int, a2.d, z1.d, z1.j):void");
    }

    /* renamed from: j0 */
    private final Set<Scope> m267j0(Set<Scope> set) {
        Set<Scope> i0 = mo232i0(set);
        for (Scope contains : i0) {
            if (!set.contains(contains)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return i0;
    }

    /* access modifiers changed from: protected */
    @RecentlyNonNull
    /* renamed from: B */
    public final Set<Scope> mo154B() {
        return this.f169L;
    }

    /* renamed from: c */
    public Set<Scope> mo231c() {
        return mo185p() ? this.f169L : Collections.emptySet();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i0 */
    public Set<Scope> mo232i0(@RecentlyNonNull Set<Scope> set) {
        return set;
    }

    @RecentlyNullable
    /* renamed from: u */
    public final Account mo190u() {
        return this.f170M;
    }
}
