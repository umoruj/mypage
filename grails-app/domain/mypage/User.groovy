package mypage

class User {
    String firstName
    String lastName
    String email
    String mobileNumber
    String homePhone
    Date dateOfBirth
    Address address
    List skill

    static hasMany = [experience: Experience, task: Task, skill: Skill]

    static constraints = {
        firstName blank: false
        lastName blank: false
        email blank: false, unique: true
        mobileNumber blank: false, unique: true
        homePhone blank: false, unique: true
        dateOfBirth nullable: false
        address nullable: false

    }
}
