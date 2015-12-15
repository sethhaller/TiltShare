package com.thirteen.tilt;

import android.content.Intent;

import com.google.android.gms.wearable.MessageEvent;
import com.google.android.gms.wearable.WearableListenerService;

/**
 * Created by kevinvanmierlo on 15/12/15.
 */
public class PhoneListenerService extends WearableListenerService
{
    @Override
    public void onMessageReceived(MessageEvent messageEvent)
    {
        super.onMessageReceived(messageEvent);

        if(messageEvent.getPath().equals("/startActivity"))
        {
            Intent intent = new Intent(this, MainActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        }
    }
}
