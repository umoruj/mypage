package mypage

class Task {
    Date dateStarted
    Date dateEnded
    String detail

    static constraints = {
        dateStarted nullable: false
        dateEnded nullable: false
        dateEnded(validator: { val, obj ->
            val?.after(obj.dateStarted)
        })
        detail blank: true
    }
}
