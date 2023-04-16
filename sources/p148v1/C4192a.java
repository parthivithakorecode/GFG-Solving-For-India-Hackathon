package p148v1;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import p003a2.C0092o;

/* renamed from: v1.a */
public class C4192a {

    /* renamed from: c */
    private static final Lock f22443c = new ReentrantLock();
    @GuardedBy("sLk")

    /* renamed from: d */
    private static C4192a f22444d;

    /* renamed from: a */
    private final Lock f22445a = new ReentrantLock();
    @GuardedBy("mLk")

    /* renamed from: b */
    private final SharedPreferences f22446b;

    C4192a(Context context) {
        this.f22446b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    @RecentlyNonNull
    /* renamed from: a */
    public static C4192a m26643a(@RecentlyNonNull Context context) {
        C0092o.m313i(context);
        Lock lock = f22443c;
        lock.lock();
        try {
            if (f22444d == null) {
                f22444d = new C4192a(context.getApplicationContext());
            }
            C4192a aVar = f22444d;
            lock.unlock();
            return aVar;
        } catch (Throwable th) {
            f22443c.unlock();
            throw th;
        }
    }

    /* renamed from: d */
    private static final String m26644d(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    @RecentlyNullable
    /* renamed from: b */
    public GoogleSignInAccount mo15708b() {
        String c;
        String c2 = mo15709c("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(c2) || (c = mo15709c(m26644d("googleSignInAccount", c2))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.m5694m(c);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    @RecentlyNullable
    /* renamed from: c */
    public final String mo15709c(@RecentlyNonNull String str) {
        this.f22445a.lock();
        try {
            return this.f22446b.getString(str, (String) null);
        } finally {
            this.f22445a.unlock();
        }
    }
}
