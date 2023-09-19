package com.example.kaspresso.tests

import android.Manifest
import androidx.test.rule.GrantPermissionRule
import com.kaspersky.components.alluresupport.withForcedAllureSupport
import com.kaspersky.kaspresso.kaspresso.Kaspresso
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import org.junit.Rule

open class BaseTest : TestCase(
    kaspressoBuilder = Kaspresso.Builder.withForcedAllureSupport()
) {
    @get: Rule
    val runtimeException: GrantPermissionRule = GrantPermissionRule.grant(
        Manifest.permission.WRITE_EXTERNAL_STORAGE,
        Manifest.permission.READ_EXTERNAL_STORAGE
    )
}