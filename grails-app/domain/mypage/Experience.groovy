package mypage

class Experience {
    Date dateStarted
    Date dateEnded
    String organization
    String role


    static constraints = {
        dateStarted nullable: false
        dateEnded nullable: false
        dateEnded(validator: { val, obj ->
            val?.after(obj.dateStarted)
        })
        role blank: false
    }
}
