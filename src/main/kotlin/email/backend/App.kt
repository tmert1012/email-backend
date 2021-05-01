package email.backend

import email.backend.controllers.EmailController
import io.javalin.Javalin
import io.javalin.apibuilder.ApiBuilder.crud

fun main(args: Array<String>) {
    val app = Javalin.create().start(7000)

    app.get("/") { ctx -> ctx.result("email-backend is up") }

    app.routes {
        crud("email/:email-id", EmailController)
    }
}
