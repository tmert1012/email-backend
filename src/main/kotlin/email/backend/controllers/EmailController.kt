package email.backend.controllers

import com.google.gson.Gson
import email.backend.dao.EmailDao
import io.javalin.apibuilder.CrudHandler
import io.javalin.http.Context

object EmailController: CrudHandler {

    private val dao = EmailDao()
    private val gson = Gson()

    override fun create(ctx: Context) {
        val email = ctx.formParam<String>("email")

        dao.save(email.get())

        ctx.result("${email.get()} added!")
    }

    override fun delete(ctx: Context, resourceId: String) {
        val emailId = ctx.pathParam("email-id")

        dao.delete(emailId)

        ctx.result("$emailId removed!")
    }

    override fun getAll(ctx: Context) {
        ctx.result(gson.toJson(dao.getAll()))
    }

    override fun getOne(ctx: Context, resourceId: String) {
        ctx.result(gson.toJson(dao.findById(resourceId)))
    }

    override fun update(ctx: Context, resourceId: String) {
        // not implemented
    }

}