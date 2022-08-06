import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun update() {
        val wallService = WallService
        val id: Int = 10
        val updatedText = "Hello, Kitty"
        val updatedLikes = Likes(false, true, false, 1)
        val updatedViews = Views(2)
        val updatedReposts = Reposts(false, 1)
        val post = Post (150, 1, 2, "HI", updatedLikes, updatedViews, updatedReposts, false, false)
        wallService.addPost(post)
        var result =  update(wallService, id, updatedText, updatedLikes, updatedViews, updatedReposts)
        Assert.assertEquals(false, result)
    }
}