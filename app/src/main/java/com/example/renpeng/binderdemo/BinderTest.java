package com.example.renpeng.binderdemo;

import android.os.Binder;
import android.os.Parcel;
import android.os.RemoteException;

/**
 * Created by renpeng on 16/11/13.
 */
public class BinderTest extends Binder {

    @Override
    protected boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
        return super.onTransact(code, data, reply, flags);
    }




}
