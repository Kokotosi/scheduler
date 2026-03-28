// SPDX-License-Identifier: Apache-2.0

package org.kokotosi.scheduler

/**
 * Temporary library entry point while the execution model is still being designed.
 * The point of this type is to keep the repository library-first from the first commit.
 */
object SchedulerLibrary {
    const val NAME: String = "scheduler"
    const val STATUS: String = "bootstrap"

    fun banner(): String = "$NAME:$STATUS"
}
