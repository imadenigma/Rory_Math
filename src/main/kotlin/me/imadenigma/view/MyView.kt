package me.imadenigma.view

import me.imadenigma.app.Styles
import tornadofx.*

class MyView : View("My View") {
    override val root = vbox {
        button("Press me")
        label("Waiting") {
            addClass(Styles.heading)
        }
    }
}
