package email.backend

import com.google.gson.Gson
import email.backend.controllers.EmailController
import email.backend.dao.EmailDao
import io.javalin.Javalin
import io.javalin.apibuilder.ApiBuilder.crud


fun main(args: Array<String>) {
    val app = Javalin.create { config -> config.enableCorsForAllOrigins() }.start(7000)
    val emailDao = EmailDao()
    val gson = Gson()

    // add paths
    app.get("/") { ctx -> ctx.result("email-backend is up") }
    app.routes {
        crud("email/:email-id", EmailController(emailDao, gson))
    }
}




