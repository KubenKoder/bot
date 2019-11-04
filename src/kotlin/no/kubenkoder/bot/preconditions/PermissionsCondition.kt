package no.kubenkoder.bot.preconditions

import me.aberrantfox.kjdautils.api.dsl.Precondition
import me.aberrantfox.kjdautils.api.dsl.precondition
import me.aberrantfox.kjdautils.internal.command.Fail

@Precondition(100)
fun execute() = precondition {


    return@precondition Fail("You do not have the required permissions to use this command.")
}