package mypage

class Skill {
    String nameSkill
    String typeSkill
    String descriptionSkill

    static constraints = {
        nameSkill blank: false
        typeSkill blank: false
        descriptionSkill blank: false
    }
}
