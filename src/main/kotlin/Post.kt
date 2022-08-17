data class Post(
    val id: Int,
    val from_Id: Int,
    val owner_Id: Int,
    val text: String,
    val likes: Likes,
    val views: Views,
    val reposts: Reposts,
    val friendsOnly: Boolean,
    val markedAsAds: Boolean,
) {
}