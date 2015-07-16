import mypage.Address
import mypage.Experience
import mypage.Skill
import mypage.Task
import mypage.User

class BootStrap {

    def init = { servletContext ->
        Address address1 = new Address(street: "Birkeparken", houseId:"234", city: "Odense", country: "Denmark").save()
        Address address2 = new Address(street: "Ostre", houseId:"87", city: "Odense", country: "Denmark").save()

        Experience experience1 = new Experience(dateStarted: new Date(), dateEnded: new Date()+1, organization: "Micorsoft", role: "Student Job").save()
        Experience experience2 = new Experience(dateStarted: new Date(), dateEnded: new Date()+1, organization: "LeapCraft", role: "Architectural analyst").save()

        Skill skill1 = new Skill(nameSkill: "Node.js", typeSkill: "Backend", descriptionSkill: "web development with express framework and  Backend development").save()
        Skill skill2 = new Skill(nameSkill: "Angular.js", typeSkill: "frontend", descriptionSkill: "web development").save()

        List<Skill> skills = new ArrayList<Skill>()
        int i = 0
        skills.add(i,skill1)
        skills.add(i+1,skill2)

        Task task1 = new Task(dateStarted: new Date(), dateEnded: new Date() +1, detail: "web development").save()
        Task task2 = new Task(dateStarted: new Date(), dateEnded: new Date() +1, detail: "web development").save()

        User user1 = new User(firstName: "Joseph", lastName: "Umoru", email: "joseph@dd.com", mobileNumber: "+4581858213", homePhone: "99929944", dateOfBirth: new Date(), address: address1,skill: skills).save()


    }
    def destroy = {
    }
}
