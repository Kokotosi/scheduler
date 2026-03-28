// SPDX-License-Identifier: Apache-2.0

package org.kokotosi.scheduler;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SchedulerLibraryTest {
    @Test
    void bannerExposesTheCurrentBootstrapState() {
        assertEquals("scheduler:bootstrap", SchedulerLibrary.banner());
    }
}
