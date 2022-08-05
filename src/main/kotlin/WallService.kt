object WallService {
   var posts = emptyArray<Post>()
    private var nextId = 1

    fun riseNextId() {
        this.nextId += 1
    }

    fun getNextId(): Int {
        return nextId
    }

    fun getPost(index: Int): Post{
        return posts[index]
    }

    fun addPost(post: Post): Post {
        posts += post
        riseNextId()
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