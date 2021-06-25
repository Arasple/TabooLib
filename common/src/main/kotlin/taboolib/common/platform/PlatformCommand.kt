package taboolib.common.platform

/**
 * TabooLib
 * taboolib.common.platform.PlatformCommand
 *
 * @author sky
 * @since 2021/6/24 11:46 下午
 */
interface PlatformCommand {

    fun registerCommand(command: Command, executor: CommandExecutor, tabCompleter: CommandTabCompleter)

    fun unregisterCommand(command: String)

    fun unregisterCommands()
}