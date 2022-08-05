data class Post(
    val id: Int,
    val from_Id: Int,
    val owner_Id: Int,
    val text: String,
    val likes: Likes,
    val views: Views,
    val reposts: Reposts,
    val friendsOnly: Boolean,
    val markedAsAds: Boolean
) {
    override fun toString(): String {
        return ("$id, $from_Id, $owner_Id, $text, $likes, $views, $reposts, $friendsOnly, $markedAsAds")
    }


}