public class Account {
    public static void main(String[] args) {
        int ope = 9;
        int mary = 3;
        int joseph = 6 * mary;
        int osinaike = ope + mary + joseph;
        int miti = osinaike - 1000;
        System.out.println (miti);

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Values = " + myMaxLongValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Values = " + myMaxShortValue);
            long deji = 2_000_000_000_000L;
        System.out.println(deji);

        byte desmond = 123;
        short ngozi = 234;
        int caleb = 345;
        long okotie = 5000 + (10 * (desmond + ngozi + caleb));
        System.out.println(okotie);
    }


        private String name;
        public void setName (String name){
            this.name = name;
        }
        public String getName () {
            return name;
        }

}
