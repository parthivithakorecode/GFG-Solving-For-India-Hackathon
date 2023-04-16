package p134t;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: t.c */
public abstract class C4057c extends C4052a {

    /* renamed from: n */
    private int f22257n;

    /* renamed from: o */
    private int f22258o;

    /* renamed from: p */
    private LayoutInflater f22259p;

    @Deprecated
    public C4057c(Context context, int i, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.f22258o = i;
        this.f22257n = i;
        this.f22259p = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    /* renamed from: q */
    public View mo15548q(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f22259p.inflate(this.f22258o, viewGroup, false);
    }

    /* renamed from: r */
    public View mo2350r(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f22259p.inflate(this.f22257n, viewGroup, false);
    }
}
