package models;


class InnerClass {
    static class Subclass {
        int num;

        Subclass(int num) {
            this.num = num;
        }

        public int getNum() {
            return this.num;
        }
    }

    public static void main(String[] args) {
        Subclass s1 = new Subclass(5);
        System.out.println(s1.getNum());
    }
}
