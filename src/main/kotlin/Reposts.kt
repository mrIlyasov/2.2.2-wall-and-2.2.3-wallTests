class Reposts(
    var userReposted: Boolean,
    count: Int
) {
    var count = count
        set(value) {
            if (count < 0) {
                field = 0
            } else {
                field = 0
            }
        }

    init {
        if (this.count < 0) {
            this.count = 0
        }
    }

    override fun toString(): String {
        return "${this.count}"
    }
}
