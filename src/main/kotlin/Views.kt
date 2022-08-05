class Views(
    count: Int
) {
    var count = count
        set(value) {
            if (count < 0) {
                field = 0
            } else {
                field = value
            }
        }

    init {
        if (this.count < 0) {
            this.count = 0
        }

    }

    fun addView() {
        count += 1
    }

    override fun toString(): String {
        return "${this.count}"
    }
}