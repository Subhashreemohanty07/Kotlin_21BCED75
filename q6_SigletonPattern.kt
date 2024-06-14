fun main() {
    DatabaseConnect.connection()
    DatabaseConnect.disconnect()
   DatabaseConnect.connection()
    
}
object DatabaseConnect {
    init {
        println("DatabaseConnection initialized")
    }

    fun connection() {
        println("Connecting to the database...")
    }

    fun disconnect() {
        println("Disconnecting from the database...")
    }
}