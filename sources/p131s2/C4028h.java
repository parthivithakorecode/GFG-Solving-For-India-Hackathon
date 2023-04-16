package p131s2;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import java.util.concurrent.Executor;

/* renamed from: s2.h */
public abstract class C4028h<TResult> {
    /* renamed from: a */
    public C4028h<TResult> mo15503a(@RecentlyNonNull Executor executor, @RecentlyNonNull C4022c cVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    /* renamed from: b */
    public C4028h<TResult> mo15504b(@RecentlyNonNull Executor executor, @RecentlyNonNull C4024d<TResult> dVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    /* renamed from: c */
    public C4028h<TResult> mo15505c(@RecentlyNonNull C4024d<TResult> dVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    /* renamed from: d */
    public abstract C4028h<TResult> mo15506d(@RecentlyNonNull Executor executor, @RecentlyNonNull C4025e eVar);

    /* renamed from: e */
    public abstract C4028h<TResult> mo15507e(@RecentlyNonNull Executor executor, @RecentlyNonNull C4026f<? super TResult> fVar);

    /* renamed from: f */
    public <TContinuationResult> C4028h<TContinuationResult> mo15508f(@RecentlyNonNull Executor executor, @RecentlyNonNull C4018a<TResult, TContinuationResult> aVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    /* renamed from: g */
    public <TContinuationResult> C4028h<TContinuationResult> mo15509g(@RecentlyNonNull Executor executor, @RecentlyNonNull C4018a<TResult, C4028h<TContinuationResult>> aVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    /* renamed from: h */
    public <TContinuationResult> C4028h<TContinuationResult> mo15510h(@RecentlyNonNull C4018a<TResult, C4028h<TContinuationResult>> aVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    @RecentlyNullable
    /* renamed from: i */
    public abstract Exception mo15511i();

    @RecentlyNonNull
    /* renamed from: j */
    public abstract TResult mo15512j();

    /* renamed from: k */
    public abstract boolean mo15513k();

    /* renamed from: l */
    public abstract boolean mo15514l();

    /* renamed from: m */
    public abstract boolean mo15515m();
}
