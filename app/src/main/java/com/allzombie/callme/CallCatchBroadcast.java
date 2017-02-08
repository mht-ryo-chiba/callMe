package com.allzombie.callme;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.util.Log;

import static android.content.ContentValues.TAG;

/**
 * Created by r_chiba on 2017/02/08.
 * 通話受信をフックするためのブロードキャスト
 */

public class CallCatchBroadcast extends BroadcastReceiver {
    @Override
    public void onReceive (Context context, Intent intent) {
        try {
            //TelephonyManagerの生成
            TelephonyManager tm = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
            //リスナーの登録
            PhoneCallStateListener PhoneListener = new PhoneCallStateListener();
            tm.listen(PhoneListener, PhoneStateListener.LISTEN_CALL_STATE);

        } catch (Exception e) {
            Log.e(TAG, ":" + e);
        }
    }

}
