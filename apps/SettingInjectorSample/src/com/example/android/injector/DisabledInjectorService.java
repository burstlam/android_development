/*
 * Copyright (C) 2013 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.injector;

import android.location.SettingInjectorService;
import android.util.Log;

/**
 * Receiver that returns the status disabled for an injected setting.
 */
public class DisabledInjectorService extends SettingInjectorService {

    private static final String TAG = "DisabledInjectorService";

    public DisabledInjectorService() {
        super(TAG);
    }

    @Override
    protected Status getStatus() {
        try {
            // Simulate a delay while reading the setting from disk
            Thread.sleep(500);
        } catch (InterruptedException e) {
            Log.e(TAG, "", e);
        }

        return new Status(null, false);
    }
}