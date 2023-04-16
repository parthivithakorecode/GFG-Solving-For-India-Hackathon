package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import p034e2.C2547d;

public final class un1 implements View.OnClickListener {

    /* renamed from: f */
    private final rr1 f15653f;

    /* renamed from: g */
    private final C2547d f15654g;

    /* renamed from: h */
    private e60 f15655h;

    /* renamed from: i */
    private t70<Object> f15656i;

    /* renamed from: j */
    String f15657j;

    /* renamed from: k */
    Long f15658k;

    /* renamed from: l */
    WeakReference<View> f15659l;

    public un1(rr1 rr1, C2547d dVar) {
        this.f15653f = rr1;
        this.f15654g = dVar;
    }

    /* renamed from: e */
    private final void m17957e() {
        View view;
        this.f15657j = null;
        this.f15658k = null;
        WeakReference<View> weakReference = this.f15659l;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            view.setClickable(false);
            view.setOnClickListener((View.OnClickListener) null);
            this.f15659l = null;
        }
    }

    /* renamed from: a */
    public final e60 mo11260a() {
        return this.f15655h;
    }

    /* renamed from: b */
    public final void mo11261b() {
        if (this.f15655h != null && this.f15658k != null) {
            m17957e();
            try {
                this.f15655h.mo6397b();
            } catch (RemoteException e) {
                io0.m11133i("#007 Could not call remote method.", e);
            }
        }
    }

    /* renamed from: c */
    public final void mo11262c(e60 e60) {
        this.f15655h = e60;
        t70<Object> t70 = this.f15656i;
        if (t70 != null) {
            this.f15653f.mo10661k("/unconfirmedClick", t70);
        }
        tn1 tn1 = new tn1(this, e60);
        this.f15656i = tn1;
        this.f15653f.mo10659i("/unconfirmedClick", tn1);
    }

    public final void onClick(View view) {
        WeakReference<View> weakReference = this.f15659l;
        if (weakReference != null && weakReference.get() == view) {
            if (!(this.f15657j == null || this.f15658k == null)) {
                HashMap hashMap = new HashMap();
                hashMap.put("id", this.f15657j);
                hashMap.put("time_interval", String.valueOf(this.f15654g.mo12462a() - this.f15658k.longValue()));
                hashMap.put("messageType", "onePointFiveClick");
                this.f15653f.mo10657g("sendMessageToNativeJs", hashMap);
            }
            m17957e();
        }
    }
}
