package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
import p003a2.C0092o;
import p013b2.C1298a;
import p013b2.C1301c;
import p034e2.C2547d;
import p034e2.C2550g;

public class GoogleSignInAccount extends C1298a implements ReflectedParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new C1474a();
    @RecentlyNonNull

    /* renamed from: s */
    public static C2547d f3747s = C2550g.m21187d();

    /* renamed from: f */
    final int f3748f;

    /* renamed from: g */
    private String f3749g;

    /* renamed from: h */
    private String f3750h;

    /* renamed from: i */
    private String f3751i;

    /* renamed from: j */
    private String f3752j;

    /* renamed from: k */
    private Uri f3753k;

    /* renamed from: l */
    private String f3754l;

    /* renamed from: m */
    private long f3755m;

    /* renamed from: n */
    private String f3756n;

    /* renamed from: o */
    List<Scope> f3757o;

    /* renamed from: p */
    private String f3758p;

    /* renamed from: q */
    private String f3759q;

    /* renamed from: r */
    private Set<Scope> f3760r = new HashSet();

    GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, List<Scope> list, String str7, String str8) {
        this.f3748f = i;
        this.f3749g = str;
        this.f3750h = str2;
        this.f3751i = str3;
        this.f3752j = str4;
        this.f3753k = uri;
        this.f3754l = str5;
        this.f3755m = j;
        this.f3756n = str6;
        this.f3757o = list;
        this.f3758p = str7;
        this.f3759q = str8;
    }

    @RecentlyNullable
    /* renamed from: m */
    public static GoogleSignInAccount m5694m(String str) {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        GoogleSignInAccount n = m5695n(jSONObject.optString("id"), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has("email") ? jSONObject.optString("email") : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, parse, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        if (jSONObject.has("serverAuthCode")) {
            str2 = jSONObject.optString("serverAuthCode");
        }
        n.f3754l = str2;
        return n;
    }

    @RecentlyNonNull
    /* renamed from: n */
    public static GoogleSignInAccount m5695n(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l, @RecentlyNonNull String str7, @RecentlyNonNull Set<Scope> set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, (String) null, l.longValue(), C0092o.m310f(str7), new ArrayList((Collection) C0092o.m313i(set)), str5, str6);
    }

    @RecentlyNullable
    /* renamed from: c */
    public Account mo4977c() {
        String str = this.f3751i;
        if (str == null) {
            return null;
        }
        return new Account(str, "com.google");
    }

    @RecentlyNullable
    /* renamed from: d */
    public String mo4978d() {
        return this.f3752j;
    }

    @RecentlyNullable
    /* renamed from: e */
    public String mo4979e() {
        return this.f3751i;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f3756n.equals(this.f3756n) && googleSignInAccount.mo4987k().equals(mo4987k());
    }

    @RecentlyNullable
    /* renamed from: f */
    public String mo4981f() {
        return this.f3759q;
    }

    @RecentlyNullable
    /* renamed from: g */
    public String mo4982g() {
        return this.f3758p;
    }

    @RecentlyNullable
    /* renamed from: h */
    public String mo4983h() {
        return this.f3749g;
    }

    public int hashCode() {
        return ((this.f3756n.hashCode() + 527) * 31) + mo4987k().hashCode();
    }

    @RecentlyNullable
    /* renamed from: i */
    public String mo4985i() {
        return this.f3750h;
    }

    @RecentlyNullable
    /* renamed from: j */
    public Uri mo4986j() {
        return this.f3753k;
    }

    /* renamed from: k */
    public Set<Scope> mo4987k() {
        HashSet hashSet = new HashSet(this.f3757o);
        hashSet.addAll(this.f3760r);
        return hashSet;
    }

    @RecentlyNullable
    /* renamed from: l */
    public String mo4988l() {
        return this.f3754l;
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = C1301c.m5213a(parcel);
        C1301c.m5220h(parcel, 1, this.f3748f);
        C1301c.m5225m(parcel, 2, mo4983h(), false);
        C1301c.m5225m(parcel, 3, mo4985i(), false);
        C1301c.m5225m(parcel, 4, mo4979e(), false);
        C1301c.m5225m(parcel, 5, mo4978d(), false);
        C1301c.m5224l(parcel, 6, mo4986j(), i, false);
        C1301c.m5225m(parcel, 7, mo4988l(), false);
        C1301c.m5223k(parcel, 8, this.f3755m);
        C1301c.m5225m(parcel, 9, this.f3756n, false);
        C1301c.m5229q(parcel, 10, this.f3757o, false);
        C1301c.m5225m(parcel, 11, mo4982g(), false);
        C1301c.m5225m(parcel, 12, mo4981f(), false);
        C1301c.m5214b(parcel, a);
    }
}
