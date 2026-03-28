// SPDX-License-Identifier: Apache-2.0

package org.kokotosi.scheduler

import kotlin.test.Test
import kotlin.test.assertEquals

class SchedulerLibraryTest {
    @Test
    fun `banner exposes the current bootstrap state`() {
        assertEquals("scheduler:bootstrap", SchedulerLibrary.banner())
    }
}
