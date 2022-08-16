fun main() {

    var likes = Likes(false, false, false, 0)
    var views = Views(0)
    var reposts = Reposts(false, 0)
    var updatedLikes = Likes(false, false, false, 1)
    var updatedViews = Views(1)
    var updatedReposts = Reposts(false, 1)
    var post1 = Post(-10,1, 1,"hello world", likes, views, reposts, false, false)
    var post2 = Post(-10,2, 2,"hello ", likes, views, reposts, false, false)
    var wallService = WallService
    wallService.addPost(post1)
    wallService.addPost(post2)
    wallService.printPosts()
    println()
    wallService.updatePost(2, "HI", updatedLikes, updatedViews, updatedReposts)
    println()

}

