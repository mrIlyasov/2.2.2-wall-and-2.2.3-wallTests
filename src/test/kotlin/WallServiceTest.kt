import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun addPost() {
        val likes = Likes(false, true, false, 1)
        val views = Views(1)
        val reposts = Reposts(false, 1)
        val post = Post(0, 1, 2, "HI", likes, views, reposts, false, false)
        var result = post.id
        Assert.assertEquals(1, result)
    }
}