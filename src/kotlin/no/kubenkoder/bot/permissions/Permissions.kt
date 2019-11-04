package no.kubenkoder.bot.permissions

import me.aberrantfox.kjdautils.api.dsl.command.Command

private val permissions: MutableMap<Command, Levels> = mutableMapOf()

var Command.permission: Levels
    get() = permissions[this] ?: Levels.EVERYONE
    set(value) = run { permissions[this] = value }
