package email.backend.dao

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

internal class EmailDaoTest {

    @Test
    fun save() {
        val dao = EmailDao()
        dao.save("test@email.com")
        dao.save("testagain@something.com")

        assertEquals(2, dao.recordMap.size)
    }

    @Test
    fun findById() {
        val dao = EmailDao()
        val uuid = dao.save("test@email.com")

        assertNotNull(dao.findById(uuid))
    }

    @Test
    fun findByEmail() {
        val dao = EmailDao()
        dao.save("test@email.com")

        assertNotNull(dao.findByEmail("test@email.com"))
    }

    @Test
    fun delete() {
        val dao = EmailDao()
        val uuid = dao.save("test@email.com")
        dao.delete(uuid)

        assertEquals(0, dao.recordMap.size)
    }

    @Test
    fun getAll() {
        val dao = EmailDao()
        dao.save("test@email.com")
        dao.save("testagain@something.com")

        assertEquals(2, dao.recordMap.size)
    }
}