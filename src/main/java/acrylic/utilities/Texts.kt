package acrylic.utilities

fun getPrefix() : String {
    return "[AcrylicMaze]"
}

fun send(vararg string : String?) {
    string.forEach {
        println("${getPrefix()} $it");
    }
}
