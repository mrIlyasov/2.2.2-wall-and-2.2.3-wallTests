fun main() {
    var likes = Likes(false, false, false, 0)
    var views = Views(0)
    var reposts = Reposts(false, 0)
    var updatedLikes = Likes(false, false, false, 1)
    var updatedViews = Views(1)
    var updatedReposts = Reposts(false, 1)
    var wallService = WallService
    wallService.addPost(Post(wallService.getNextId(), 1, 1, "Hello", likes, views, reposts, false, false))
    wallService.addPost(Post(wallService.getNextId(), 2, 2, "Hello 2", likes, views, reposts, false, false))
    wallService.addPost(Post(wallService.getNextId(), 3, 3, "Hello 2", likes, views, reposts, false, false))
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
            val updatedPost: Post
            updatedPost = wallService.posts[index].copy(
                text = updatedText,
                likes = updatedLikes,
                views = updatedViews,
                reposts = updatedReposts
            )
            wallService.posts[index] = updatedPost
            println("Post updated!")
            println(updatedPost)
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