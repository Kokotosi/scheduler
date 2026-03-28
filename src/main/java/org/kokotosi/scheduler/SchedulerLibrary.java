// SPDX-License-Identifier: Apache-2.0

package org.kokotosi.scheduler;

public final class SchedulerLibrary {
    public static final String NAME = "scheduler";
    public static final String STATUS = "bootstrap";

    private SchedulerLibrary() {}

    public static String banner() {
        return NAME + ":" + STATUS;
    }
}
