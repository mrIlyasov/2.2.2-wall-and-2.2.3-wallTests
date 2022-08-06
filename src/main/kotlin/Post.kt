private var nextId: Int = 1

class Post(
    id: Int = nextId,
    val from_Id: Int,
    val owner_Id: Int,
    var text: String,
    var likes: Likes,
    var views: Views,
    var reposts: Reposts,
    var friendsOnly: Boolean,
    var markedAsAds: Boolean,

    ) {
    var id = id
        get() {
            return field
        }
        set(value) {
            if (id < 1) {
                field = nextId
            }
        }


    init {
        if (id < 1)
            this.id = nextId
        nextId += 1
    }


    override fun toString(): String {
        return ("$id, $from_Id, $owner_Id, $text, $likes, $views, $reposts, $friendsOnly, $markedAsAds")
    }


}