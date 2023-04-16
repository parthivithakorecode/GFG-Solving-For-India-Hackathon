package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.C0348n;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.menu.f */
public class C0329f extends BaseAdapter {

    /* renamed from: f */
    C0330g f932f;

    /* renamed from: g */
    private int f933g = -1;

    /* renamed from: h */
    private boolean f934h;

    /* renamed from: i */
    private final boolean f935i;

    /* renamed from: j */
    private final LayoutInflater f936j;

    /* renamed from: k */
    private final int f937k;

    public C0329f(C0330g gVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.f935i = z;
        this.f936j = layoutInflater;
        this.f932f = gVar;
        this.f937k = i;
        mo1049a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1049a() {
        C0334i v = this.f932f.mo1127v();
        if (v != null) {
            ArrayList<C0334i> z = this.f932f.mo1131z();
            int size = z.size();
            for (int i = 0; i < size; i++) {
                if (z.get(i) == v) {
                    this.f933g = i;
                    return;
                }
            }
        }
        this.f933g = -1;
    }

    /* renamed from: b */
    public C0330g mo1050b() {
        return this.f932f;
    }

    /* renamed from: c */
    public C0334i getItem(int i) {
        ArrayList<C0334i> z = this.f935i ? this.f932f.mo1131z() : this.f932f.mo1061E();
        int i2 = this.f933g;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return z.get(i);
    }

    /* renamed from: d */
    public void mo1052d(boolean z) {
        this.f934h = z;
    }

    public int getCount() {
        ArrayList<C0334i> z = this.f935i ? this.f932f.mo1131z() : this.f932f.mo1061E();
        int i = this.f933g;
        int size = z.size();
        return i < 0 ? size : size - 1;
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f936j.inflate(this.f937k, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i2 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f932f.mo1062F() && groupId != (i2 >= 0 ? getItem(i2).getGroupId() : groupId));
        C0348n.C0349a aVar = (C0348n.C0349a) view;
        if (this.f934h) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.mo901e(getItem(i), 0);
        return view;
    }

    public void notifyDataSetChanged() {
        mo1049a();
        super.notifyDataSetChanged();
    }
}
