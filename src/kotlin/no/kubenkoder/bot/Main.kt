package no.kubenkoder.bot

import me.aberrantfox.kjdautils.api.startBot
import java.lang.IllegalArgumentException

fun main(args: Array<out String>) {
    val token = args.firstOrNull()
        ?: throw IllegalArgumentException("No bot token")

    startBot(token) {
        configure {
            allowPrivateMessages = false
            prefix = "+"
        }
    }
}