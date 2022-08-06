object WallService {
   var posts = emptyArray<Post>()


    fun getPost(index: Int): Post{
        return posts[index]
    }

    fun addPost(post: Post): Post {
        posts += post
        return posts.last()
    }


    fun printPosts() {
        for (index in posts.indices) {
            println(posts[index])
        }
    }

    fun clear() {
        this.posts = emptyArray<Post>()
    }

}