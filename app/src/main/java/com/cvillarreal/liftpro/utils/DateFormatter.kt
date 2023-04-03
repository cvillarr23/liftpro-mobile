package com.cvillarreal.liftpro.utils


fun ms_epoch_to_summary_date(ms: Long): String {
    /**
     * Convert ms_since_epoch to format "{Month} {day} at {hh}:{mm}"
     * Example: 1669766400 -> "January 1 at 00:00"
     */
    val date = java.util.Date(ms)
    val formatter = java.text.SimpleDateFormat("MMMM d 'at' HH:mm")
    return formatter.format(date)
}