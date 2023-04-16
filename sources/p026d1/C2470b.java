package p026d1;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.RecentlyNonNull;
import p002a1.C0031o;

@Deprecated
/* renamed from: d1.b */
public class C2470b extends FrameLayout {

    /* renamed from: f */
    private C0031o f18523f;

    /* renamed from: g */
    private ImageView.ScaleType f18524g;

    public C2470b(@RecentlyNonNull Context context) {
        super(context);
    }

    public void setImageScaleType(@RecentlyNonNull ImageView.ScaleType scaleType) {
        this.f18524g = scaleType;
    }

    public void setMediaContent(@RecentlyNonNull C0031o oVar) {
        this.f18523f = oVar;
    }
}
