public class HouseDog extends Dog {
    public void sleep() {
        System.out.println(this.mName+" zzz in house");
    }

    public void sleep(int hour) {
        System.out.println(this.mName+" zzz in house for " + hour + " hours");
    }

    public HouseDog(String name) {
        setName(name);

    }
}
