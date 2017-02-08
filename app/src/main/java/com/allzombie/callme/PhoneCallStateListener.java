package com.allzombie.callme;

import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.util.Log;

/**
 * Created by r_chiba on 2017/02/08.
 */

public class PhoneCallStateListener extends PhoneStateListener {
    @SuppressWarnings("unused")
    private final String TAG = getClass().getSimpleName();
    public void onCallStateChanged(int state, String callNumber) {
        Log.d(TAG, ":" + state+"-PhoneNumber:"+callNumber);
        switch(state){
            case TelephonyManager.CALL_STATE_IDLE:      //待ち受け（終了時）
//                Toast.makeText(ctx, "CALL_STATE_IDLE", Toast.LENGTH_LONG).show();
                break;
            case TelephonyManager.CALL_STATE_RINGING:   //着信
//                Toast.makeText(ctx, "CALL_STATE_RINGING: " + callNumber, Toast.LENGTH_LONG).show();
                break;
            case TelephonyManager.CALL_STATE_OFFHOOK:   //通話
//                Toast.makeText(ctx, "CALL_STATE_OFFHOOK", Toast.LENGTH_LONG).show();
                break;
        }
    }
}
