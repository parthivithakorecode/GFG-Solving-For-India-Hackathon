package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0597a;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;
import p038f.C2582a;
import p038f.C2587f;
import p134t.C4057c;

/* renamed from: androidx.appcompat.widget.u0 */
class C0524u0 extends C4057c implements View.OnClickListener {

    /* renamed from: A */
    private int f1651A = -1;

    /* renamed from: B */
    private int f1652B = -1;

    /* renamed from: C */
    private int f1653C = -1;

    /* renamed from: D */
    private int f1654D = -1;

    /* renamed from: q */
    private final SearchView f1655q;

    /* renamed from: r */
    private final SearchableInfo f1656r;

    /* renamed from: s */
    private final Context f1657s;

    /* renamed from: t */
    private final WeakHashMap<String, Drawable.ConstantState> f1658t;

    /* renamed from: u */
    private final int f1659u;

    /* renamed from: v */
    private boolean f1660v = false;

    /* renamed from: w */
    private int f1661w = 1;

    /* renamed from: x */
    private ColorStateList f1662x;

    /* renamed from: y */
    private int f1663y = -1;

    /* renamed from: z */
    private int f1664z = -1;

    /* renamed from: androidx.appcompat.widget.u0$a */
    private static final class C0525a {

        /* renamed from: a */
        public final TextView f1665a;

        /* renamed from: b */
        public final TextView f1666b;

        /* renamed from: c */
        public final ImageView f1667c;

        /* renamed from: d */
        public final ImageView f1668d;

        /* renamed from: e */
        public final ImageView f1669e;

        public C0525a(View view) {
            this.f1665a = (TextView) view.findViewById(16908308);
            this.f1666b = (TextView) view.findViewById(16908309);
            this.f1667c = (ImageView) view.findViewById(16908295);
            this.f1668d = (ImageView) view.findViewById(16908296);
            this.f1669e = (ImageView) view.findViewById(C2587f.edit_query);
        }
    }

    public C0524u0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), (Cursor) null, true);
        this.f1655q = searchView;
        this.f1656r = searchableInfo;
        this.f1659u = searchView.getSuggestionCommitIconResId();
        this.f1657s = context;
        this.f1658t = weakHashMap;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:7|8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002c, code lost:
        throw new java.io.FileNotFoundException("Resource does not exist: " + r7);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0016 */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable m2133A(android.net.Uri r7) {
        /*
            r6 = this;
            java.lang.String r0 = "Error closing icon stream for "
            java.lang.String r1 = "SuggestionsAdapter"
            r2 = 0
            java.lang.String r3 = r7.getScheme()     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r4 = "android.resource"
            boolean r3 = r4.equals(r3)     // Catch:{ FileNotFoundException -> 0x0085 }
            if (r3 == 0) goto L_0x002d
            android.graphics.drawable.Drawable r7 = r6.mo2337B(r7)     // Catch:{ NotFoundException -> 0x0016 }
            return r7
        L_0x0016:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0085 }
            r3.<init>()     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r4 = "Resource does not exist: "
            r3.append(r4)     // Catch:{ FileNotFoundException -> 0x0085 }
            r3.append(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r3 = r3.toString()     // Catch:{ FileNotFoundException -> 0x0085 }
            r0.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0085 }
            throw r0     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x002d:
            android.content.Context r3 = r6.f1657s     // Catch:{ FileNotFoundException -> 0x0085 }
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ FileNotFoundException -> 0x0085 }
            java.io.InputStream r3 = r3.openInputStream(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            if (r3 == 0) goto L_0x006e
            android.graphics.drawable.Drawable r4 = android.graphics.drawable.Drawable.createFromStream(r3, r2)     // Catch:{ all -> 0x0055 }
            r3.close()     // Catch:{ IOException -> 0x0041 }
            goto L_0x0054
        L_0x0041:
            r3 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.<init>()     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.append(r0)     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.append(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r0 = r5.toString()     // Catch:{ FileNotFoundException -> 0x0085 }
            android.util.Log.e(r1, r0, r3)     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x0054:
            return r4
        L_0x0055:
            r4 = move-exception
            r3.close()     // Catch:{ IOException -> 0x005a }
            goto L_0x006d
        L_0x005a:
            r3 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.<init>()     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.append(r0)     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.append(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r0 = r5.toString()     // Catch:{ FileNotFoundException -> 0x0085 }
            android.util.Log.e(r1, r0, r3)     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x006d:
            throw r4     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x006e:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0085 }
            r3.<init>()     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r4 = "Failed to open "
            r3.append(r4)     // Catch:{ FileNotFoundException -> 0x0085 }
            r3.append(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r3 = r3.toString()     // Catch:{ FileNotFoundException -> 0x0085 }
            r0.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0085 }
            throw r0     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x0085:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Icon not found: "
            r3.append(r4)
            r3.append(r7)
            java.lang.String r7 = ", "
            r3.append(r7)
            java.lang.String r7 = r0.getMessage()
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            android.util.Log.w(r1, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0524u0.m2133A(android.net.Uri):android.graphics.drawable.Drawable");
    }

    /* renamed from: C */
    private Drawable m2134C(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f1657s.getPackageName() + "/" + parseInt;
            Drawable u = m2142u(str2);
            if (u != null) {
                return u;
            }
            Drawable d = C0597a.m2449d(this.f1657s, parseInt);
            m2140K(str2, d);
            return d;
        } catch (NumberFormatException unused) {
            Drawable u2 = m2142u(str);
            if (u2 != null) {
                return u2;
            }
            Drawable A = m2133A(Uri.parse(str));
            m2140K(str, A);
            return A;
        } catch (Resources.NotFoundException unused2) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        }
    }

    /* renamed from: D */
    private Drawable m2135D(Cursor cursor) {
        int i = this.f1652B;
        if (i == -1) {
            return null;
        }
        Drawable C = m2134C(cursor.getString(i));
        return C != null ? C : m2147z();
    }

    /* renamed from: E */
    private Drawable m2136E(Cursor cursor) {
        int i = this.f1653C;
        if (i == -1) {
            return null;
        }
        return m2134C(cursor.getString(i));
    }

    /* renamed from: G */
    private static String m2137G(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    /* renamed from: I */
    private void m2138I(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    /* renamed from: J */
    private void m2139J(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        textView.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    /* renamed from: K */
    private void m2140K(String str, Drawable drawable) {
        if (drawable != null) {
            this.f1658t.put(str, drawable.getConstantState());
        }
    }

    /* renamed from: L */
    private void m2141L(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    /* renamed from: u */
    private Drawable m2142u(String str) {
        Drawable.ConstantState constantState = this.f1658t.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    /* renamed from: v */
    private CharSequence m2143v(CharSequence charSequence) {
        if (this.f1662x == null) {
            TypedValue typedValue = new TypedValue();
            this.f1657s.getTheme().resolveAttribute(C2582a.textColorSearchUrl, typedValue, true);
            this.f1662x = this.f1657s.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan((String) null, 0, 0, this.f1662x, (ColorStateList) null), 0, charSequence.length(), 33);
        return spannableString;
    }

    /* renamed from: w */
    private Drawable m2144w(ComponentName componentName) {
        String nameNotFoundException;
        PackageManager packageManager = this.f1657s.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            nameNotFoundException = "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString();
            Log.w("SuggestionsAdapter", nameNotFoundException);
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            nameNotFoundException = e.toString();
        }
    }

    /* renamed from: x */
    private Drawable m2145x(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        Drawable.ConstantState constantState = null;
        if (this.f1658t.containsKey(flattenToShortString)) {
            Drawable.ConstantState constantState2 = this.f1658t.get(flattenToShortString);
            if (constantState2 == null) {
                return null;
            }
            return constantState2.newDrawable(this.f1657s.getResources());
        }
        Drawable w = m2144w(componentName);
        if (w != null) {
            constantState = w.getConstantState();
        }
        this.f1658t.put(flattenToShortString, constantState);
        return w;
    }

    /* renamed from: y */
    public static String m2146y(Cursor cursor, String str) {
        return m2137G(cursor, cursor.getColumnIndex(str));
    }

    /* renamed from: z */
    private Drawable m2147z() {
        Drawable x = m2145x(this.f1656r.getSearchActivity());
        return x != null ? x : this.f1657s.getPackageManager().getDefaultActivityIcon();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public Drawable mo2337B(Uri uri) {
        int i;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.f1657s.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            i = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (size == 2) {
                        i = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (i != 0) {
                        return resourcesForApplication.getDrawable(i);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        } else {
            throw new FileNotFoundException("No authority: " + uri);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public Cursor mo2338F(SearchableInfo searchableInfo, String str, int i) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i));
        }
        return this.f1657s.getContentResolver().query(fragment.build(), (String[]) null, suggestSelection, strArr2, (String) null);
    }

    /* renamed from: H */
    public void mo2339H(int i) {
        this.f1661w = i;
    }

    /* renamed from: a */
    public void mo2340a(Cursor cursor) {
        if (this.f1660v) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.mo2340a(cursor);
            if (cursor != null) {
                this.f1663y = cursor.getColumnIndex("suggest_text_1");
                this.f1664z = cursor.getColumnIndex("suggest_text_2");
                this.f1651A = cursor.getColumnIndex("suggest_text_2_url");
                this.f1652B = cursor.getColumnIndex("suggest_icon_1");
                this.f1653C = cursor.getColumnIndex("suggest_icon_2");
                this.f1654D = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    /* renamed from: c */
    public CharSequence mo2341c(Cursor cursor) {
        String y;
        String y2;
        if (cursor == null) {
            return null;
        }
        String y3 = m2146y(cursor, "suggest_intent_query");
        if (y3 != null) {
            return y3;
        }
        if (this.f1656r.shouldRewriteQueryFromData() && (y2 = m2146y(cursor, "suggest_intent_data")) != null) {
            return y2;
        }
        if (!this.f1656r.shouldRewriteQueryFromText() || (y = m2146y(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return y;
    }

    /* renamed from: e */
    public Cursor mo2342e(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        if (this.f1655q.getVisibility() == 0 && this.f1655q.getWindowVisibility() == 0) {
            try {
                Cursor F = mo2338F(this.f1656r, charSequence2, 50);
                if (F != null) {
                    F.getCount();
                    return F;
                }
            } catch (RuntimeException e) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e);
            }
        }
        return null;
    }

    /* renamed from: g */
    public void mo2343g(View view, Context context, Cursor cursor) {
        C0525a aVar = (C0525a) view.getTag();
        int i = this.f1654D;
        int i2 = i != -1 ? cursor.getInt(i) : 0;
        if (aVar.f1665a != null) {
            m2139J(aVar.f1665a, m2137G(cursor, this.f1663y));
        }
        if (aVar.f1666b != null) {
            String G = m2137G(cursor, this.f1651A);
            CharSequence v = G != null ? m2143v(G) : m2137G(cursor, this.f1664z);
            if (TextUtils.isEmpty(v)) {
                TextView textView = aVar.f1665a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f1665a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f1665a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f1665a.setMaxLines(1);
                }
            }
            m2139J(aVar.f1666b, v);
        }
        ImageView imageView = aVar.f1667c;
        if (imageView != null) {
            m2138I(imageView, m2135D(cursor), 4);
        }
        ImageView imageView2 = aVar.f1668d;
        if (imageView2 != null) {
            m2138I(imageView2, m2136E(cursor), 8);
        }
        int i3 = this.f1661w;
        if (i3 == 2 || (i3 == 1 && (i2 & 1) != 0)) {
            aVar.f1669e.setVisibility(0);
            aVar.f1669e.setTag(aVar.f1665a.getText());
            aVar.f1669e.setOnClickListener(this);
            return;
        }
        aVar.f1669e.setVisibility(8);
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View q = mo15548q(this.f1657s, mo15542b(), viewGroup);
            if (q != null) {
                ((C0525a) q.getTag()).f1665a.setText(e.toString());
            }
            return q;
        }
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View r = mo2350r(this.f1657s, mo15542b(), viewGroup);
            if (r != null) {
                ((C0525a) r.getTag()).f1665a.setText(e.toString());
            }
            return r;
        }
    }

    public boolean hasStableIds() {
        return false;
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        m2141L(mo15542b());
    }

    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        m2141L(mo15542b());
    }

    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f1655q.mo1489S((CharSequence) tag);
        }
    }

    /* renamed from: r */
    public View mo2350r(Context context, Cursor cursor, ViewGroup viewGroup) {
        View r = super.mo2350r(context, cursor, viewGroup);
        r.setTag(new C0525a(r));
        ((ImageView) r.findViewById(C2587f.edit_query)).setImageResource(this.f1659u);
        return r;
    }
}
