package com.example.android_starter.ui

import android.os.Build
import androidx.test.core.app.ActivityScenario
import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@Config(sdk = [Build.VERSION_CODES.O_MR1])
@RunWith(RobolectricTestRunner::class)
class MainActivityTest {

    private lateinit var activityScenario: ActivityScenario<MainActivity>

    @Before
    fun setup() {
        activityScenario = ActivityScenario.launch(MainActivity::class.java)
    }

    @After
    fun teardown() {
        if (::activityScenario.isInitialized) {
            activityScenario.close()
        }
    }

    @Test
    fun test() {
        activityScenario.onActivity { activity ->
            Assert.assertEquals(activity.test(), "Test")
        }
    }
}
