package p147v0;

import androidx.work.WorkerParameters;
import p096n0.C3756i;

/* renamed from: v0.h */
public class C4178h implements Runnable {

    /* renamed from: f */
    private C3756i f22397f;

    /* renamed from: g */
    private String f22398g;

    /* renamed from: h */
    private WorkerParameters.C1234a f22399h;

    public C4178h(C3756i iVar, String str, WorkerParameters.C1234a aVar) {
        this.f22397f = iVar;
        this.f22398g = str;
        this.f22399h = aVar;
    }

    public void run() {
        this.f22397f.mo14984m().mo14964k(this.f22398g, this.f22399h);
    }
}
