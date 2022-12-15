class Person {
    String name;
    int age;
}

class MakingChanges {
    public static void changeIdentities(Person p1, Person p2) {
        // write your code here
        Person tmp = new Person();

        tmp.age = p1.age;
        tmp.name = p1.name;

        p1.age = p2.age;
        p1.name = p2.name;

        p2.age = tmp.age;
        p2.name = tmp.name;
    }
}