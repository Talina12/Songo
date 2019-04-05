package com.songo.g;

import android.support.v7.app.AppCompatActivity;

public abstract class AbstractCalendarActivity extends AppCompatActivity {
    protected AsyncQueryService mService;

    public synchronized AsyncQueryService getAsyncQueryService() {
        if (mService == null) {
            mService = new AsyncQueryService(this);
        }
        return mService;
    }
}
