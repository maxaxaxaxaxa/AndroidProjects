package com.websarva.wings.android.cameraintentsample

import android.support.test.InstrumentationRegistry
import android.support.test.runner.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
	@Test
	fun useAppContext() {
		val appContext = InstrumentationRegistry.getTargetContext()
		assertEquals("com.websarva.wings.android.cameraintentsample", appContext.packageName)
	}
}
