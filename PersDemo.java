class Pers {
    int id;
    String name;
    int age;

    Pers(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;    
    }

    String display() {
        return "person --> ID:" + id + " NAME:" + name + " AGE:" + age;
    }
}

class Prof extends Pers {
    String qual;

    Prof(int id, String name, int age, String qual) {
        super(id, name, age);
        this.qual = qual;
    }

    String display() {
        return super.display() + "\nprof --> qual:" + qual;
    }
}

class Sport extends Prof {
    String sport;

    Sport(int id, String name, int age, String qual, String sport) {
        super(id, name, age, qual);
        this.sport = sport;
    }

    String display() {
        return super.display() + "\nsport --> " + sport;
    }
}

class PersDemo {
    public static void main(String[] args) {
        Sport s = new Sport(102, "Dinesh", 20, "B.Tech", "Cricket");
        System.out.println(s.display());
    }
}