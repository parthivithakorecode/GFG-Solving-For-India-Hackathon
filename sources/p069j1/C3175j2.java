package p069j1;

import android.annotation.TargetApi;
import android.os.Environment;
import android.os.StatFs;
import android.view.View;

@TargetApi(18)
/* renamed from: j1.j2 */
public class C3175j2 extends C3171i2 {
    /* renamed from: g */
    public final int mo14002g() {
        return 14;
    }

    /* renamed from: h */
    public final long mo14003h() {
        return new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
    }

    /* renamed from: i */
    public boolean mo14004i(View view) {
        return super.mo14004i(view) || view.getWindowId() != null;
    }
}
