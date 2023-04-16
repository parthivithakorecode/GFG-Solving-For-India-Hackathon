package p053h0;

import android.database.Cursor;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.Closeable;
import java.util.List;

/* renamed from: h0.b */
public interface C2666b extends Closeable {
    /* renamed from: A */
    void mo12646A(String str, Object[] objArr);

    /* renamed from: M */
    Cursor mo12647M(String str);

    /* renamed from: e */
    void mo12648e();

    /* renamed from: f */
    void mo12649f();

    /* renamed from: g */
    List<Pair<String, String>> mo12650g();

    /* renamed from: i */
    void mo12651i(String str);

    boolean isOpen();

    /* renamed from: l */
    C2674f mo12653l(String str);

    /* renamed from: o */
    Cursor mo12654o(C2673e eVar, CancellationSignal cancellationSignal);

    /* renamed from: r */
    String mo12655r();

    /* renamed from: s */
    boolean mo12656s();

    /* renamed from: t */
    Cursor mo12657t(C2673e eVar);

    /* renamed from: y */
    void mo12658y();
}
