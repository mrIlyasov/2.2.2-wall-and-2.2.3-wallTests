import org.junit.Assert
import org.junit.Test

import org.junit.Before

class WallServiceTest {
    @Before
    fun clearPosts() {
        WallService.clear()
    }

    @Test
    fun addPost() {
        val likes = Likes(false, true, false, 1)
        val views = Views(1)
        val reposts = Reposts(false, 1)
        val post = Post(0, 1, 2, "HI", likes, views, reposts, false, false)
        WallService.addPost(post)
        var result = WallService.getIdOfLastPost()
        Assert.assertEquals(1, result)
    }


    @Test
    fun updatePostShoulReturnTrue() {
        var wallService = WallService
        val likes = Likes(false, true, false, 1)
        val views = Views(1)
        val reposts = Reposts(false, 1)
        val newText = "Test Text"
        val newLikes = Likes(true, true, true, 5)
        val newViews = Views(5)
        val newReposts = Reposts(false, 5)
        val id = 1
        val testPost = Post(1, 1, 2, "Hello, Kitty", likes, views, reposts, false, false)
        val testPost2 = Post(2, 1, 2, "Hello, Kitty", likes, views, reposts, false, false)
        wallService.addPost(testPost)
        wallService.addPost(testPost2)
        var result = wallService.updatePost(id, newText,newLikes, newViews, newReposts)
        Assert.assertEquals(true, result)
    }
    @Test
    fun updatePostShoulReturnFalse() {
        var wallService = WallService
        val likes = Likes(false, true, false, 1)
        val views = Views(1)
        val reposts = Reposts(false, 1)
        val newText = "Test Text"
        val newLikes = Likes(true, true, true, 5)
        val newViews = Views(5)
        val newReposts = Reposts(false, 5)
        val id = 6
        val testPost = Post(1, 1, 2, "Hello, Kitty", likes, views, reposts, false, false)
        val testPost2 = Post(2, 1, 2, "Hello, Kitty", likes, views, reposts, false, false)
        wallService.addPost(testPost)
        wallService.addPost(testPost2)
        var result = wallService.updatePost(id, newText,newLikes, newViews, newReposts)
        Assert.assertEquals(false, result)
    }


}