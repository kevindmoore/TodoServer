package models

import org.jetbrains.exposed.sql.Column
import org.jetbrains.exposed.sql.Table

data class Todo(val id: Int, val userId: Int, val todo: String, val done: Boolean)

object Todos: Table() {
    val id : Column<Int> = integer("id").autoIncrement().primaryKey()
    val userId : Column<Int> = integer("userId").references(Users.userId)
    val todo = varchar("todo", 512)
    val done = bool("done")

}