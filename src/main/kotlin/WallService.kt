object WallService {
    private var posts = emptyArray<Post>()

    fun getPost(index: Int): Post {
        return posts[index]
    }

    fun addPost(post: Post): Post {
        if (posts.size < 1)
            posts += post.copy(id = 1)
        else
            posts += post.copy(id = posts.last().id + 1)
        return posts.last()
    }


    fun printPosts() {
        for (index in posts.indices) {
            println(posts[index])
        }
    }


    fun updatePost(id: Int, newText: String, newLikes: Likes, newViews: Views, newReposts: Reposts): Boolean {
        println("Looking for post with ID = $id")
        var result: Boolean = false
        for (index in posts.indices) {
            if (id == posts[index].id) {
                posts[index].text = newText
                posts[index].reposts = newReposts
                posts[index].likes = newLikes
                posts[index].views = newViews
                println("Post updated!")
                println(posts[index])
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

    fun clear(){
        posts = emptyArray()
    }

    fun getIdOfLastPost(): Int{
        return posts.last().id
    }
}