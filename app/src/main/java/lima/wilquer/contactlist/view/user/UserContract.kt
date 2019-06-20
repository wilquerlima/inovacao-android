package lima.wilquer.contactlist.view.user

import lima.wilquer.contactlist.data.User
import lima.wilquer.contactlist.view.BaseView

interface UserContract {

    interface View : BaseView<Presenter> {
        fun setProgress(active: Boolean, flagButton : Int)

        fun loginUser(user: User?)

        fun buscarUser(user: User?)

        fun cadastrarUser(user: User?)

        fun error(msg: String)
    }

    interface Presenter : BaseUserPresenter
}