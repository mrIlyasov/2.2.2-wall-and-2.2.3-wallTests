fun main() {
    var likes = Likes(false, false, false, 0)
    var views = Views(0)
    var reposts = Reposts(false, 0)
    var updatedLikes = Likes(false, false, false, 1)
    var updatedViews = Views(1)
    var updatedReposts = Reposts(false, 1)
    var wallService = WallService
    wallService.addPost(
        Post(
            from_Id = 1,
            owner_Id = 1,
            text = "Hello",
            likes = likes,
            views = views,
            reposts = reposts,
            friendsOnly = false,
            markedAsAds = false
        )
    )
    wallService.addPost(
        Post(
            id = 0,
            from_Id = 2,
            owner_Id = 2,
            text = "Hello 2",
            likes = likes,
            views = views,
            reposts = reposts,
            friendsOnly = false,
            markedAsAds = false
        )
    )

    wallService.printPosts()
    println()
    update(wallService, 2, "HI", updatedLikes, updatedViews, updatedReposts)
    println()
    wallService.printPosts()
}


fun update(
    wallService: WallService,
    id: Int,
    updatedText: String,
    updatedLikes: Likes,
    updatedViews: Views,
    updatedReposts: Reposts
): Boolean {
    println("Looking for post")
    var result: Boolean = false
    for (index in wallService.posts.indices) {
        if (id == wallService.posts[index].id) {
            wallService.posts[index].text = updatedText
            wallService.posts[index].reposts = updatedReposts
            wallService.posts[index].likes = updatedLikes
            wallService.posts[index].views = updatedViews
            println("Post updated!")
            println(wallService.posts[index])
            result = true
            break
        } else {
            result = false
        }
    }
    if (result == false) {
        println("Post for update not found!")
    }
    return result

}