package com.polidea.reactnativeble;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.facebook.react.HeadlessJsTaskService;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.jstasks.HeadlessJsTaskConfig;

import javax.annotation.Nullable;

public class BleHeadlessTask extends HeadlessJsTaskService {
    private static final String TAG = "lonealert.HeadlessJs";

    @Override
    protected @Nullable
    HeadlessJsTaskConfig getTaskConfig(Intent intent) {
        String action = intent.getAction();
        Log.i(TAG, "getTaskConfig:" + action);
        Bundle extras = intent.getExtras();

            return new HeadlessJsTaskConfig(
                    "SomeTaskName",
                    Arguments.fromBundle(extras),
                    5000, // timeout for the task
                    false // optional: defines whether or not  the task is allowed in foreground. Default is false
            );
    }
}
