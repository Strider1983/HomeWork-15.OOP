public class Tasks {
    public void print(Gryffindor[] gryffindors) {
        System.out.println("Студенты факультета Гриффиндор:");
        for (int i = 0; i < gryffindors.length; i++) {
            Gryffindor gryffindor = gryffindors[i];
            System.out.println(gryffindor);
        }
    }

    public void print(Hufflepuff[] hufflepuffs) {
        System.out.println("____________________________________________________");
        System.out.println("Студенты факультета Пуффендуй:");
        for (int i = 0; i < hufflepuffs.length; i++) {
            Hufflepuff hufflepuff = hufflepuffs[i];
            System.out.println(hufflepuff);
        }
    }

    public void print(Ravenclaw[] ravenclaws) {
        System.out.println("____________________________________________________");
        System.out.println("Студенты факультета Когтевран:");
        for (int i = 0; i < ravenclaws.length; i++) {
            Ravenclaw ravenclaw = ravenclaws[i];
            System.out.println(ravenclaw);
        }
    }

    public void print(Slytherin[] slytherins) {
        System.out.println("____________________________________________________");
        System.out.println("Студенты факультета Слизерин:");
        for (int i = 0; i < slytherins.length; i++) {
            Slytherin slytherin = slytherins[i];
            System.out.println(slytherin);
        }
    }

    public static void compareGryffindors(Gryffindor[] gryffindors) {
        int student1Score = gryffindors[0].getNobility() + gryffindors[0].getHonour() + gryffindors[0].getBravery();
        int student2Score = gryffindors[1].getNobility() + gryffindors[1].getHonour() + gryffindors[1].getBravery();
        if (student1Score > student2Score) {
            System.out.println(gryffindors[0].getName() + " " + gryffindors[0].getSurname() + " лучшый Гриффиндорец чем " + gryffindors[1].getName() + " " + gryffindors[1].getSurname());
        } else if (student1Score < student2Score) {
            System.out.println(gryffindors[1].getName() + " " + gryffindors[1].getSurname() + " лучшый Гриффиндорец чем " + gryffindors[0].getName() + " " + gryffindors[0].getSurname());
        } else {
            System.out.println("Студенты Гриффиндора " + gryffindors[0].getName() + " " + gryffindors[0].getSurname() + " и " + gryffindors[1].getName() + " " + gryffindors[1].getSurname() + " - равные");
        }
    }

    public static void compareНufflepuffs(Hufflepuff[] hufflepuffs) {
        int student1Score = hufflepuffs[0].getHonesty() + hufflepuffs[0].getLoyalty() + hufflepuffs[0].getHardWork();
        int student2Score = hufflepuffs[1].getHonesty() + hufflepuffs[1].getLoyalty() + hufflepuffs[1].getHardWork();
        if (student1Score > student2Score) {
            System.out.println(hufflepuffs[0].getName() + " " + hufflepuffs[0].getSurname() + " лучшый Пуффундуец чем " + hufflepuffs[1].getName() + " " + hufflepuffs[1].getSurname());
        } else if (student1Score < student2Score) {
            System.out.println(hufflepuffs[1].getName() + " " + hufflepuffs[1].getSurname() + " лучшый Пуффундуец чем " + hufflepuffs[0].getName() + " " + hufflepuffs[0].getSurname());
        } else {
            System.out.println("Студенты Пуффендуй " + hufflepuffs[0].getName() + " " + hufflepuffs[0].getSurname() + " и " + hufflepuffs[1].getName() + " " + hufflepuffs[1].getSurname() + " - равные");
        }
    }
    public static void compareRavenclaws(Ravenclaw[] ravenclaws) {
        int student1Score = ravenclaws[0].getCleverness() + ravenclaws[0].getCreation() + ravenclaws[0].getWisdom() + ravenclaws[0].getWittiness();
        int student2Score = ravenclaws[1].getCleverness() + ravenclaws[1].getCreation() + ravenclaws[1].getWisdom() + ravenclaws[1].getWittiness();
        if (student1Score > student2Score) {
            System.out.println(ravenclaws[0].getName() + " " + ravenclaws[0].getSurname() + " лучшый Когтевранец чем " + ravenclaws[1].getName() + " " + ravenclaws[1].getSurname());
        } else if (student1Score < student2Score) {
            System.out.println(ravenclaws[1].getName() + " " + ravenclaws[1].getSurname() + " лучшый Когтевранец чем " + ravenclaws[0].getName() + " " + ravenclaws[0].getSurname());
        } else {
            System.out.println("Студенты Когтеврана " + ravenclaws[0].getName() + " " + ravenclaws[0].getSurname() + " и " + ravenclaws[1].getName() + " " + ravenclaws[1].getSurname() + " - равные");
        }
    }
    public static void compareSlytherins(Slytherin[] slytherins) {
        int student1Score = slytherins[0].getAmbition() + slytherins[0].getResoluteness() + slytherins[0].getCunning() + slytherins[0].getLustForPower() + slytherins[0].getResourcefulness();
        int student2Score = slytherins[1].getAmbition() + slytherins[1].getResoluteness() + slytherins[1].getCunning() + slytherins[1].getLustForPower() + slytherins[1].getResourcefulness();
        if (student1Score > student2Score) {
            System.out.println(slytherins[0].getName() + " " + slytherins[0].getSurname() + " лучшый Слизеринец чем " + slytherins[1].getName() + " " + slytherins[1].getSurname());
        } else if (student1Score < student2Score) {
            System.out.println(slytherins[1].getName() + " " + slytherins[1].getSurname() + " лучшый Слизеринец чем " + slytherins[0].getName() + " " + slytherins[0].getSurname());
        } else {
            System.out.println("Студенты Слизерина " + slytherins[0].getName() + " " + slytherins[0].getSurname() + " и " + slytherins[1].getName() + " " + slytherins[1].getSurname() + " - равные");
        }
    }
}
