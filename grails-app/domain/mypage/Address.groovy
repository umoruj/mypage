package mypage

class Address {
    String street
    String houseId
    String city
    String postCode
    String country


    static constraints = {
        street blank: false
        houseId blank: false
        city blank: false
        postCode blank: false
        country blank: false
    }
}
