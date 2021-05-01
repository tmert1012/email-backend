package email.backend.dao

import java.util.*
import kotlin.collections.HashMap

class EmailDao {

    val recordMap = HashMap<String, Record>() // uuid, record

    fun save(email: String) {
        val uuid = UUID.randomUUID().toString()
        recordMap[uuid] = Record(email, uuid)
    }

    fun findById(uuid: String): Record? {
        return recordMap[uuid]
    }

    fun findByEmail(email: String): Record? {
        return recordMap.values.find { it.email == email }
    }

    fun delete(uuid: String) {
        recordMap.remove(uuid)
    }

    fun getAll(): ArrayList<Record> {
        return ArrayList(recordMap.values)
    }

    data class Record(val email: String, val uuid: String)

}